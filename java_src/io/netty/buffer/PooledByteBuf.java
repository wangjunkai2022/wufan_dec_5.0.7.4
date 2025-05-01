package io.netty.buffer;

import io.netty.util.internal.ObjectPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class PooledByteBuf<T> extends AbstractReferenceCountedByteBuf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ByteBufAllocator allocator;
    PoolThreadCache cache;
    protected PoolChunk<T> chunk;
    protected long handle;
    protected int length;
    int maxLength;
    protected T memory;
    protected int offset;
    private final ObjectPool.Handle<PooledByteBuf<T>> recyclerHandle;
    ByteBuffer tmpNioBuf;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public PooledByteBuf(ObjectPool.Handle<? extends PooledByteBuf<T>> handle, int i4) {
        super(i4);
        this.recyclerHandle = handle;
    }

    private void init0(PoolChunk<T> poolChunk, ByteBuffer byteBuffer, long j4, int i4, int i5, int i6, PoolThreadCache poolThreadCache) {
        this.chunk = poolChunk;
        this.memory = poolChunk.memory;
        this.tmpNioBuf = byteBuffer;
        this.allocator = poolChunk.arena.parent;
        this.cache = poolThreadCache;
        this.handle = j4;
        this.offset = i4;
        this.length = i5;
        this.maxLength = i6;
    }

    private void recycle() {
        this.recyclerHandle.recycle(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer _internalNioBuffer(int i4, int i5, boolean z4) {
        int idx = idx(i4);
        ByteBuffer newInternalNioBuffer = z4 ? newInternalNioBuffer(this.memory) : internalNioBuffer();
        newInternalNioBuffer.limit(i5 + idx).position(idx);
        return newInternalNioBuffer;
    }

    @Override // io.netty.buffer.ByteBuf
    public final ByteBufAllocator alloc() {
        return this.allocator;
    }

    @Override // io.netty.buffer.ByteBuf
    public final int capacity() {
        return this.length;
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected final void deallocate() {
        long j4 = this.handle;
        if (j4 >= 0) {
            this.handle = -1L;
            this.memory = null;
            PoolChunk<T> poolChunk = this.chunk;
            poolChunk.arena.free(poolChunk, this.tmpNioBuf, j4, this.maxLength, this.cache);
            this.tmpNioBuf = null;
            this.chunk = null;
            recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer duplicateInternalNioBuffer(int i4, int i5) {
        checkIndex(i4, i5);
        return _internalNioBuffer(i4, i5, true);
    }

    @Override // io.netty.buffer.ByteBuf
    public final int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        return gatheringByteChannel.write(duplicateInternalNioBuffer(i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int idx(int i4) {
        return this.offset + i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init(PoolChunk<T> poolChunk, ByteBuffer byteBuffer, long j4, int i4, int i5, int i6, PoolThreadCache poolThreadCache) {
        init0(poolChunk, byteBuffer, j4, i4, i5, i6, poolThreadCache);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initUnpooled(PoolChunk<T> poolChunk, int i4) {
        init0(poolChunk, null, 0L, poolChunk.offset, i4, i4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer internalNioBuffer() {
        ByteBuffer byteBuffer = this.tmpNioBuf;
        if (byteBuffer == null) {
            ByteBuffer newInternalNioBuffer = newInternalNioBuffer(this.memory);
            this.tmpNioBuf = newInternalNioBuffer;
            return newInternalNioBuffer;
        }
        byteBuffer.clear();
        return byteBuffer;
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean isContiguous() {
        return true;
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxFastWritableBytes() {
        return Math.min(this.maxLength, maxCapacity()) - this.writerIndex;
    }

    protected abstract ByteBuffer newInternalNioBuffer(T t4);

    @Override // io.netty.buffer.ByteBuf
    public final ByteBuffer nioBuffer(int i4, int i5) {
        return duplicateInternalNioBuffer(i4, i5).slice();
    }

    @Override // io.netty.buffer.ByteBuf
    public final int nioBufferCount() {
        return 1;
    }

    @Override // io.netty.buffer.ByteBuf
    public final ByteBuffer[] nioBuffers(int i4, int i5) {
        return new ByteBuffer[]{nioBuffer(i4, i5)};
    }

    @Override // io.netty.buffer.ByteBuf
    public final ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int readBytes(GatheringByteChannel gatheringByteChannel, int i4) throws IOException {
        checkReadableBytes(i4);
        int write = gatheringByteChannel.write(_internalNioBuffer(this.readerIndex, i4, false));
        this.readerIndex += write;
        return write;
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final ByteBuf retainedDuplicate() {
        return PooledDuplicatedByteBuf.newInstance(this, this, readerIndex(), writerIndex());
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final ByteBuf retainedSlice() {
        int readerIndex = readerIndex();
        return retainedSlice(readerIndex, writerIndex() - readerIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void reuse(int i4) {
        maxCapacity(i4);
        resetRefCnt();
        setIndex0(0, 0);
        discardMarks();
    }

    @Override // io.netty.buffer.ByteBuf
    public final int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        try {
            return scatteringByteChannel.read(internalNioBuffer(i4, i5));
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    @Override // io.netty.buffer.ByteBuf
    public final ByteBuf unwrap() {
        return null;
    }

    @Override // io.netty.buffer.ByteBuf
    public final ByteBuf capacity(int i4) {
        if (i4 == this.length) {
            ensureAccessible();
            return this;
        }
        checkNewCapacity(i4);
        PoolChunk<T> poolChunk = this.chunk;
        if (!poolChunk.unpooled) {
            if (i4 > this.length) {
                if (i4 <= this.maxLength) {
                    this.length = i4;
                    return this;
                }
            } else {
                int i5 = this.maxLength;
                if (i4 > (i5 >>> 1) && (i5 > 512 || i4 > i5 - 16)) {
                    this.length = i4;
                    trimIndicesToCapacity(i4);
                    return this;
                }
            }
        }
        poolChunk.arena.reallocate(this, i4, true);
        return this;
    }

    @Override // io.netty.buffer.ByteBuf
    public final int getBytes(int i4, FileChannel fileChannel, long j4, int i5) throws IOException {
        return fileChannel.write(duplicateInternalNioBuffer(i4, i5), j4);
    }

    @Override // io.netty.buffer.ByteBuf
    public final int setBytes(int i4, FileChannel fileChannel, long j4, int i5) throws IOException {
        try {
            return fileChannel.read(internalNioBuffer(i4, i5), j4);
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final ByteBuf retainedSlice(int i4, int i5) {
        return PooledSlicedByteBuf.newInstance(this, this, i4, i5);
    }

    @Override // io.netty.buffer.ByteBuf
    public final ByteBuffer internalNioBuffer(int i4, int i5) {
        checkIndex(i4, i5);
        return _internalNioBuffer(i4, i5, false);
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int readBytes(FileChannel fileChannel, long j4, int i4) throws IOException {
        checkReadableBytes(i4);
        int write = fileChannel.write(_internalNioBuffer(this.readerIndex, i4, false), j4);
        this.readerIndex += write;
        return write;
    }
}
