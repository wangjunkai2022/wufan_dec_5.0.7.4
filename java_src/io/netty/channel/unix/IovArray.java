package io.netty.channel.unix;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public final class IovArray implements ChannelOutboundBuffer.MessageProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ADDRESS_SIZE;
    private static final int CAPACITY;
    private static final int IOV_SIZE;
    private int count;
    private long maxBytes = Limits.SSIZE_MAX;
    private final ByteBuffer memory;
    private final long memoryAddress;
    private long size;

    static {
        int addressSize = Buffer.addressSize();
        ADDRESS_SIZE = addressSize;
        int i4 = addressSize * 2;
        IOV_SIZE = i4;
        CAPACITY = Limits.IOV_MAX * i4;
    }

    public IovArray() {
        ByteBuffer allocateDirectWithNativeOrder = Buffer.allocateDirectWithNativeOrder(CAPACITY);
        this.memory = allocateDirectWithNativeOrder;
        this.memoryAddress = Buffer.memoryAddress(allocateDirectWithNativeOrder);
    }

    private static int idx(int i4) {
        return IOV_SIZE * i4;
    }

    @Deprecated
    public boolean add(ByteBuf byteBuf) {
        return add(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public void clear() {
        this.count = 0;
        this.size = 0L;
    }

    public int count() {
        return this.count;
    }

    public void maxBytes(long j4) {
        this.maxBytes = Math.min(Limits.SSIZE_MAX, ObjectUtil.checkPositive(j4, "maxBytes"));
    }

    public long memoryAddress(int i4) {
        return this.memoryAddress + idx(i4);
    }

    @Override // io.netty.channel.ChannelOutboundBuffer.MessageProcessor
    public boolean processMessage(Object obj) throws Exception {
        if (obj instanceof ByteBuf) {
            ByteBuf byteBuf = (ByteBuf) obj;
            return add(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
        }
        return false;
    }

    public void release() {
        Buffer.free(this.memory);
    }

    public long size() {
        return this.size;
    }

    public boolean add(ByteBuf byteBuf, int i4, int i5) {
        ByteBuffer internalNioBuffer;
        if (this.count == Limits.IOV_MAX) {
            return false;
        }
        if (byteBuf.nioBufferCount() == 1) {
            if (i5 == 0) {
                return true;
            }
            if (byteBuf.hasMemoryAddress()) {
                return add(byteBuf.memoryAddress() + i4, i5);
            }
            return add(Buffer.memoryAddress(byteBuf.internalNioBuffer(i4, i5)) + internalNioBuffer.position(), i5);
        }
        ByteBuffer[] nioBuffers = byteBuf.nioBuffers(i4, i5);
        for (ByteBuffer byteBuffer : nioBuffers) {
            int remaining = byteBuffer.remaining();
            if (remaining != 0 && (!add(Buffer.memoryAddress(byteBuffer) + byteBuffer.position(), remaining) || this.count == Limits.IOV_MAX)) {
                return false;
            }
        }
        return true;
    }

    public long maxBytes() {
        return this.maxBytes;
    }

    private boolean add(long j4, int i4) {
        long j5 = i4;
        if (this.maxBytes - j5 >= this.size || this.count <= 0) {
            int idx = idx(this.count);
            int i5 = ADDRESS_SIZE;
            int i6 = idx + i5;
            this.size += j5;
            this.count++;
            if (i5 == 8) {
                if (PlatformDependent.hasUnsafe()) {
                    PlatformDependent.putLong(idx + this.memoryAddress, j4);
                    PlatformDependent.putLong(i6 + this.memoryAddress, j5);
                } else {
                    this.memory.putLong(idx, j4);
                    this.memory.putLong(i6, j5);
                }
            } else if (PlatformDependent.hasUnsafe()) {
                PlatformDependent.putInt(idx + this.memoryAddress, (int) j4);
                PlatformDependent.putInt(i6 + this.memoryAddress, i4);
            } else {
                this.memory.putInt(idx, (int) j4);
                this.memory.putInt(i6, i4);
            }
            return true;
        }
        return false;
    }
}
