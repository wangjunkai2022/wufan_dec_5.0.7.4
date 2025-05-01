package com.googlecode.mp4parser.util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
/* compiled from: ByteBufferByteChannel.java */
/* loaded from: classes3.dex */
public class b implements ByteChannel {

    /* renamed from: b  reason: collision with root package name */
    ByteBuffer f14216b;

    public b(ByteBuffer byteBuffer) {
        this.f14216b = byteBuffer;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        if (this.f14216b.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) this.f14216b.duplicate().limit(this.f14216b.position() + byteBuffer.remaining()));
        ByteBuffer byteBuffer2 = this.f14216b;
        byteBuffer2.position(byteBuffer2.position() + remaining);
        return remaining;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        this.f14216b.put(byteBuffer);
        return remaining;
    }
}
