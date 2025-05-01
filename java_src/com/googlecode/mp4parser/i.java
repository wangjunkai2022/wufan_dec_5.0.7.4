package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: MemoryDataSourceImpl.java */
/* loaded from: classes3.dex */
public class i implements e {

    /* renamed from: b  reason: collision with root package name */
    ByteBuffer f14209b;

    public i(byte[] bArr) {
        this.f14209b = ByteBuffer.wrap(bArr);
    }

    @Override // com.googlecode.mp4parser.e
    public void G(long j4) throws IOException {
        this.f14209b.position(com.googlecode.mp4parser.util.c.a(j4));
    }

    @Override // com.googlecode.mp4parser.e
    public ByteBuffer Q(long j4, long j5) throws IOException {
        int position = this.f14209b.position();
        this.f14209b.position(com.googlecode.mp4parser.util.c.a(j4));
        ByteBuffer slice = this.f14209b.slice();
        slice.limit(com.googlecode.mp4parser.util.c.a(j5));
        this.f14209b.position(position);
        return slice;
    }

    @Override // com.googlecode.mp4parser.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.e
    public long m(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        return writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.f14209b.position(com.googlecode.mp4parser.util.c.a(j4))).slice().limit(com.googlecode.mp4parser.util.c.a(j5)));
    }

    @Override // com.googlecode.mp4parser.e
    public long position() throws IOException {
        return this.f14209b.position();
    }

    @Override // com.googlecode.mp4parser.e
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f14209b.remaining() != 0 || byteBuffer.remaining() == 0) {
            int min = Math.min(byteBuffer.remaining(), this.f14209b.remaining());
            if (byteBuffer.hasArray()) {
                byteBuffer.put(this.f14209b.array(), this.f14209b.position(), min);
                ByteBuffer byteBuffer2 = this.f14209b;
                byteBuffer2.position(byteBuffer2.position() + min);
            } else {
                byte[] bArr = new byte[min];
                this.f14209b.get(bArr);
                byteBuffer.put(bArr);
            }
            return min;
        }
        return -1;
    }

    @Override // com.googlecode.mp4parser.e
    public long size() throws IOException {
        return this.f14209b.capacity();
    }

    public i(ByteBuffer byteBuffer) {
        this.f14209b = byteBuffer;
    }
}
