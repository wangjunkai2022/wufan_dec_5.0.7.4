package com.facebook.common.internal;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: CountingOutputStream.java */
/* loaded from: classes2.dex */
public class d extends FilterOutputStream {

    /* renamed from: b  reason: collision with root package name */
    private long f10849b;

    public d(OutputStream outputStream) {
        super(outputStream);
        this.f10849b = 0L;
    }

    public long a() {
        return this.f10849b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i4, i5);
        this.f10849b += i5;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i4) throws IOException {
        ((FilterOutputStream) this).out.write(i4);
        this.f10849b++;
    }
}
