package io.netty.buffer;

import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.RecyclableArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.Collections;
import kotlin.UShort;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FixedCompositeByteBuf extends AbstractReferenceCountedByteBuf {
    private static final ByteBuf[] EMPTY = {Unpooled.EMPTY_BUFFER};
    private final ByteBufAllocator allocator;
    private final ByteBuf[] buffers;
    private final int capacity;
    private final boolean direct;
    private final int nioBufferCount;
    private final ByteOrder order;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Component extends WrappedByteBuf {
        private final int endOffset;
        private final int index;
        private final int offset;

        Component(int i4, int i5, ByteBuf byteBuf) {
            super(byteBuf);
            this.index = i4;
            this.offset = i5;
            this.endOffset = i5 + byteBuf.readableBytes();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FixedCompositeByteBuf(ByteBufAllocator byteBufAllocator, ByteBuf... byteBufArr) {
        super(Integer.MAX_VALUE);
        if (byteBufArr.length == 0) {
            this.buffers = EMPTY;
            this.order = ByteOrder.BIG_ENDIAN;
            this.nioBufferCount = 1;
            this.capacity = 0;
            this.direct = Unpooled.EMPTY_BUFFER.isDirect();
        } else {
            ByteBuf byteBuf = byteBufArr[0];
            this.buffers = byteBufArr;
            int nioBufferCount = byteBuf.nioBufferCount();
            int readableBytes = byteBuf.readableBytes();
            this.order = byteBuf.order();
            boolean z4 = true;
            for (int i4 = 1; i4 < byteBufArr.length; i4++) {
                ByteBuf byteBuf2 = byteBufArr[i4];
                if (byteBufArr[i4].order() == this.order) {
                    nioBufferCount += byteBuf2.nioBufferCount();
                    readableBytes += byteBuf2.readableBytes();
                    if (!byteBuf2.isDirect()) {
                        z4 = false;
                    }
                } else {
                    throw new IllegalArgumentException("All ByteBufs need to have same ByteOrder");
                }
            }
            this.nioBufferCount = nioBufferCount;
            this.capacity = readableBytes;
            this.direct = z4;
        }
        setIndex(0, capacity());
        this.allocator = byteBufAllocator;
    }

    private ByteBuf buffer(int i4) {
        ByteBuf byteBuf = this.buffers[i4];
        return byteBuf instanceof Component ? ((Component) byteBuf).buf : byteBuf;
    }

    private Component findComponent(int i4) {
        int i5 = 0;
        int i6 = 0;
        while (true) {
            ByteBuf[] byteBufArr = this.buffers;
            if (i5 < byteBufArr.length) {
                Component component = null;
                ByteBuf byteBuf = byteBufArr[i5];
                if (byteBuf instanceof Component) {
                    component = (Component) byteBuf;
                    byteBuf = component.buf;
                }
                i6 += byteBuf.readableBytes();
                if (i4 < i6) {
                    if (component == null) {
                        Component component2 = new Component(i5, i6 - byteBuf.readableBytes(), byteBuf);
                        this.buffers[i5] = component2;
                        return component2;
                    }
                    return component;
                }
                i5++;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public byte _getByte(int i4) {
        Component findComponent = findComponent(i4);
        return findComponent.buf.getByte(i4 - findComponent.offset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public int _getInt(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 4 <= findComponent.endOffset) {
            return findComponent.buf.getInt(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (_getShort(i4 + 2) & UShort.MAX_VALUE) | ((_getShort(i4) & UShort.MAX_VALUE) << 16);
        }
        return ((_getShort(i4 + 2) & UShort.MAX_VALUE) << 16) | (_getShort(i4) & UShort.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public int _getIntLE(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 4 <= findComponent.endOffset) {
            return findComponent.buf.getIntLE(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((_getShortLE(i4 + 2) & UShort.MAX_VALUE) << 16) | (_getShortLE(i4) & UShort.MAX_VALUE);
        }
        return (_getShortLE(i4 + 2) & UShort.MAX_VALUE) | ((_getShortLE(i4) & UShort.MAX_VALUE) << 16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public long _getLong(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 8 <= findComponent.endOffset) {
            return findComponent.buf.getLong(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((_getInt(i4) & 4294967295L) << 32) | (4294967295L & _getInt(i4 + 4));
        }
        return (_getInt(i4) & 4294967295L) | ((4294967295L & _getInt(i4 + 4)) << 32);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public long _getLongLE(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 8 <= findComponent.endOffset) {
            return findComponent.buf.getLongLE(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (_getIntLE(i4) & 4294967295L) | ((4294967295L & _getIntLE(i4 + 4)) << 32);
        }
        return ((_getIntLE(i4) & 4294967295L) << 32) | (4294967295L & _getIntLE(i4 + 4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public short _getShort(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 2 <= findComponent.endOffset) {
            return findComponent.buf.getShort(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (short) ((_getByte(i4 + 1) & 255) | ((_getByte(i4) & 255) << 8));
        }
        return (short) (((_getByte(i4 + 1) & 255) << 8) | (_getByte(i4) & 255));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public short _getShortLE(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 2 <= findComponent.endOffset) {
            return findComponent.buf.getShortLE(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (short) (((_getByte(i4 + 1) & 255) << 8) | (_getByte(i4) & 255));
        }
        return (short) ((_getByte(i4 + 1) & 255) | ((_getByte(i4) & 255) << 8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public int _getUnsignedMedium(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 3 <= findComponent.endOffset) {
            return findComponent.buf.getUnsignedMedium(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (_getByte(i4 + 2) & 255) | ((_getShort(i4) & UShort.MAX_VALUE) << 8);
        }
        return ((_getByte(i4 + 2) & 255) << 16) | (_getShort(i4) & UShort.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public int _getUnsignedMediumLE(int i4) {
        Component findComponent = findComponent(i4);
        if (i4 + 3 <= findComponent.endOffset) {
            return findComponent.buf.getUnsignedMediumLE(i4 - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((_getByte(i4 + 2) & 255) << 16) | (_getShortLE(i4) & UShort.MAX_VALUE);
        }
        return (_getByte(i4 + 2) & 255) | ((_getShortLE(i4) & UShort.MAX_VALUE) << 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setByte(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setInt(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setIntLE(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setLong(int i4, long j4) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setLongLE(int i4, long j4) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setMedium(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setMediumLE(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setShort(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.buffer.AbstractByteBuf
    public void _setShortLE(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBufAllocator alloc() {
        return this.allocator;
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
        int length = this.buffers.length;
        if (length != 0) {
            if (length == 1) {
                return buffer(0).array();
            }
            throw new UnsupportedOperationException();
        }
        return EmptyArrays.EMPTY_BYTES;
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
        int length = this.buffers.length;
        if (length != 0) {
            if (length == 1) {
                return buffer(0).arrayOffset();
            }
            throw new UnsupportedOperationException();
        }
        return 0;
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
        return this.capacity;
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf copy(int i4, int i5) {
        checkIndex(i4, i5);
        ByteBuf buffer = alloc().buffer(i5);
        try {
            buffer.writeBytes(this, i4, i5);
            return buffer;
        } catch (Throwable th) {
            buffer.release();
            throw th;
        }
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected void deallocate() {
        for (int i4 = 0; i4 < this.buffers.length; i4++) {
            buffer(i4).release();
        }
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public ByteBuf discardReadBytes() {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int i4) {
        return _getByte(i4);
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i4, byte[] bArr, int i5, int i6) {
        checkDstIndex(i4, i6, i5, bArr.length);
        if (i6 == 0) {
            return this;
        }
        Component findComponent = findComponent(i4);
        int i7 = findComponent.index;
        int i8 = findComponent.offset;
        ByteBuf byteBuf = findComponent.buf;
        while (true) {
            int i9 = i4 - i8;
            int min = Math.min(i6, byteBuf.readableBytes() - i9);
            byteBuf.getBytes(i9, bArr, i5, min);
            i4 += min;
            i5 += min;
            i6 -= min;
            i8 += byteBuf.readableBytes();
            if (i6 <= 0) {
                return this;
            }
            i7++;
            byteBuf = buffer(i7);
        }
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
        int length = this.buffers.length;
        if (length != 0) {
            if (length != 1) {
                return false;
            }
            return buffer(0).hasArray();
        }
        return true;
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
        int length = this.buffers.length;
        if (length != 0) {
            if (length != 1) {
                return false;
            }
            return buffer(0).hasMemoryAddress();
        }
        return Unpooled.EMPTY_BUFFER.hasMemoryAddress();
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuffer internalNioBuffer(int i4, int i5) {
        if (this.buffers.length == 1) {
            return buffer(0).internalNioBuffer(i4, i5);
        }
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
        return this.direct;
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isWritable() {
        return false;
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isWritable(int i4) {
        return false;
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int maxCapacity() {
        return this.capacity;
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
        int length = this.buffers.length;
        if (length != 0) {
            if (length == 1) {
                return buffer(0).memoryAddress();
            }
            throw new UnsupportedOperationException();
        }
        return Unpooled.EMPTY_BUFFER.memoryAddress();
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuffer nioBuffer(int i4, int i5) {
        checkIndex(i4, i5);
        if (this.buffers.length == 1) {
            ByteBuf buffer = buffer(0);
            if (buffer.nioBufferCount() == 1) {
                return buffer.nioBuffer(i4, i5);
            }
        }
        ByteBuffer order = ByteBuffer.allocate(i5).order(order());
        for (ByteBuffer byteBuffer : nioBuffers(i4, i5)) {
            order.put(byteBuffer);
        }
        order.flip();
        return order;
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
        return this.nioBufferCount;
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuffer[] nioBuffers(int i4, int i5) {
        checkIndex(i4, i5);
        if (i5 == 0) {
            return EmptyArrays.EMPTY_BYTE_BUFFERS;
        }
        RecyclableArrayList newInstance = RecyclableArrayList.newInstance(this.buffers.length);
        try {
            Component findComponent = findComponent(i4);
            int i6 = findComponent.index;
            int i7 = findComponent.offset;
            ByteBuf byteBuf = findComponent.buf;
            while (true) {
                int i8 = i4 - i7;
                int min = Math.min(i5, byteBuf.readableBytes() - i8);
                int nioBufferCount = byteBuf.nioBufferCount();
                if (nioBufferCount != 0) {
                    if (nioBufferCount != 1) {
                        Collections.addAll(newInstance, byteBuf.nioBuffers(i8, min));
                    } else {
                        newInstance.add(byteBuf.nioBuffer(i8, min));
                    }
                    i4 += min;
                    i5 -= min;
                    i7 += byteBuf.readableBytes();
                    if (i5 <= 0) {
                        return (ByteBuffer[]) newInstance.toArray(new ByteBuffer[0]);
                    }
                    i6++;
                    byteBuf = buffer(i6);
                } else {
                    throw new UnsupportedOperationException();
                }
            }
        } finally {
            newInstance.recycle();
        }
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteOrder order() {
        return this.order;
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public ByteBuf setByte(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i4, ByteBuf byteBuf, int i5, int i6) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public ByteBuf setInt(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public ByteBuf setLong(int i4, long j4) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public ByteBuf setMedium(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public ByteBuf setShort(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public String toString() {
        String abstractByteBuf = super.toString();
        String substring = abstractByteBuf.substring(0, abstractByteBuf.length() - 1);
        return substring + ", components=" + this.buffers.length + ')';
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf unwrap() {
        return null;
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf capacity(int i4) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i4, byte[] bArr, int i5, int i6) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i4, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int i4, InputStream inputStream, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int i4, FileChannel fileChannel, long j4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i4, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        checkIndex(i4, remaining);
        if (remaining == 0) {
            return this;
        }
        try {
            Component findComponent = findComponent(i4);
            int i5 = findComponent.index;
            int i6 = findComponent.offset;
            ByteBuf byteBuf = findComponent.buf;
            while (true) {
                int i7 = i4 - i6;
                int min = Math.min(remaining, byteBuf.readableBytes() - i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuf.getBytes(i7, byteBuffer);
                i4 += min;
                remaining -= min;
                i6 += byteBuf.readableBytes();
                if (remaining <= 0) {
                    return this;
                }
                i5++;
                byteBuf = buffer(i5);
            }
        } finally {
            byteBuffer.limit(limit);
        }
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i4, ByteBuf byteBuf, int i5, int i6) {
        checkDstIndex(i4, i6, i5, byteBuf.capacity());
        if (i6 == 0) {
            return this;
        }
        Component findComponent = findComponent(i4);
        int i7 = findComponent.index;
        int i8 = findComponent.offset;
        ByteBuf byteBuf2 = findComponent.buf;
        while (true) {
            int i9 = i4 - i8;
            int min = Math.min(i6, byteBuf2.readableBytes() - i9);
            byteBuf2.getBytes(i9, byteBuf, i5, min);
            i4 += min;
            i5 += min;
            i6 -= min;
            i8 += byteBuf2.readableBytes();
            if (i6 <= 0) {
                return this;
            }
            i7++;
            byteBuf2 = buffer(i7);
        }
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        if (nioBufferCount() == 1) {
            return gatheringByteChannel.write(internalNioBuffer(i4, i5));
        }
        long write = gatheringByteChannel.write(nioBuffers(i4, i5));
        if (write > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) write;
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int i4, FileChannel fileChannel, long j4, int i5) throws IOException {
        if (nioBufferCount() == 1) {
            return fileChannel.write(internalNioBuffer(i4, i5), j4);
        }
        long j5 = 0;
        for (ByteBuffer byteBuffer : nioBuffers(i4, i5)) {
            j5 += fileChannel.write(byteBuffer, j4 + j5);
        }
        if (j5 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j5;
    }

    @Override // io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i4, OutputStream outputStream, int i5) throws IOException {
        checkIndex(i4, i5);
        if (i5 == 0) {
            return this;
        }
        Component findComponent = findComponent(i4);
        int i6 = findComponent.index;
        int i7 = findComponent.offset;
        ByteBuf byteBuf = findComponent.buf;
        while (true) {
            int i8 = i4 - i7;
            int min = Math.min(i5, byteBuf.readableBytes() - i8);
            byteBuf.getBytes(i8, outputStream, min);
            i4 += min;
            i5 -= min;
            i7 += byteBuf.readableBytes();
            if (i5 <= 0) {
                return this;
            }
            i6++;
            byteBuf = buffer(i6);
        }
    }
}
