package io.netty.channel.epoll;

import io.netty.channel.unix.Buffer;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
final class EpollEventArray {
    private int length;
    private ByteBuffer memory;
    private long memoryAddress;
    private static final int EPOLL_EVENT_SIZE = Native.sizeofEpollEvent();
    private static final int EPOLL_DATA_OFFSET = Native.offsetofEpollData();

    /* JADX INFO: Access modifiers changed from: package-private */
    public EpollEventArray(int i4) {
        if (i4 >= 1) {
            this.length = i4;
            ByteBuffer allocateDirectWithNativeOrder = Buffer.allocateDirectWithNativeOrder(calculateBufferCapacity(i4));
            this.memory = allocateDirectWithNativeOrder;
            this.memoryAddress = Buffer.memoryAddress(allocateDirectWithNativeOrder);
            return;
        }
        throw new IllegalArgumentException("length must be >= 1 but was " + i4);
    }

    private static int calculateBufferCapacity(int i4) {
        return i4 * EPOLL_EVENT_SIZE;
    }

    private int getInt(int i4, int i5) {
        if (PlatformDependent.hasUnsafe()) {
            return PlatformDependent.getInt(this.memoryAddress + (i4 * EPOLL_EVENT_SIZE) + i5);
        }
        return this.memory.getInt((i4 * EPOLL_EVENT_SIZE) + i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int events(int i4) {
        return getInt(i4, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int fd(int i4) {
        return getInt(i4, EPOLL_DATA_OFFSET);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void free() {
        Buffer.free(this.memory);
        this.memoryAddress = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void increase() {
        int i4 = this.length << 1;
        this.length = i4;
        ByteBuffer allocateDirectWithNativeOrder = Buffer.allocateDirectWithNativeOrder(calculateBufferCapacity(i4));
        Buffer.free(this.memory);
        this.memory = allocateDirectWithNativeOrder;
        this.memoryAddress = Buffer.memoryAddress(allocateDirectWithNativeOrder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int length() {
        return this.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long memoryAddress() {
        return this.memoryAddress;
    }
}
