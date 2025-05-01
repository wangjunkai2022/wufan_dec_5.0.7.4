package com.googlecode.mp4parser;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: DirectFileReadDataSource.java */
/* loaded from: classes3.dex */
public class f implements e {

    /* renamed from: d  reason: collision with root package name */
    private static final int f14087d = 8192;

    /* renamed from: b  reason: collision with root package name */
    private RandomAccessFile f14088b;

    /* renamed from: c  reason: collision with root package name */
    private String f14089c;

    public f(File file) throws IOException {
        this.f14088b = new RandomAccessFile(file, "r");
        this.f14089c = file.getName();
    }

    @Override // com.googlecode.mp4parser.e
    public void G(long j4) throws IOException {
        this.f14088b.seek(j4);
    }

    @Override // com.googlecode.mp4parser.e
    public ByteBuffer Q(long j4, long j5) throws IOException {
        this.f14088b.seek(j4);
        byte[] bArr = new byte[com.googlecode.mp4parser.util.c.a(j5)];
        this.f14088b.readFully(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public int a(ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        int read = this.f14088b.read(bArr);
        byteBuffer.put(bArr, 0, read);
        return read;
    }

    @Override // com.googlecode.mp4parser.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14088b.close();
    }

    @Override // com.googlecode.mp4parser.e
    public long m(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        return writableByteChannel.write(Q(j4, j5));
    }

    @Override // com.googlecode.mp4parser.e
    public long position() throws IOException {
        return this.f14088b.getFilePointer();
    }

    @Override // com.googlecode.mp4parser.e
    public int read(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[8192];
        int i4 = 0;
        int i5 = 0;
        while (i4 < remaining) {
            i5 = this.f14088b.read(bArr, 0, Math.min(remaining - i4, 8192));
            if (i5 < 0) {
                break;
            }
            i4 += i5;
            byteBuffer.put(bArr, 0, i5);
        }
        if (i5 >= 0 || i4 != 0) {
            return i4;
        }
        return -1;
    }

    @Override // com.googlecode.mp4parser.e
    public long size() throws IOException {
        return this.f14088b.length();
    }

    public String toString() {
        return this.f14089c;
    }
}
