package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: PooledByteArrayBufferedInputStream.java */
@NotThreadSafe
/* loaded from: classes2.dex */
public class f extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    private static final String f10875h = "PooledByteInputStream";

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f10876b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f10877c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.references.c<byte[]> f10878d;

    /* renamed from: e  reason: collision with root package name */
    private int f10879e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f10880f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10881g = false;

    public f(InputStream inputStream, byte[] bArr, com.facebook.common.references.c<byte[]> cVar) {
        this.f10876b = (InputStream) com.facebook.common.internal.h.i(inputStream);
        this.f10877c = (byte[]) com.facebook.common.internal.h.i(bArr);
        this.f10878d = (com.facebook.common.references.c) com.facebook.common.internal.h.i(cVar);
    }

    private boolean a() throws IOException {
        if (this.f10880f < this.f10879e) {
            return true;
        }
        int read = this.f10876b.read(this.f10877c);
        if (read <= 0) {
            return false;
        }
        this.f10879e = read;
        this.f10880f = 0;
        return true;
    }

    private void b() throws IOException {
        if (this.f10881g) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        com.facebook.common.internal.h.o(this.f10880f <= this.f10879e);
        b();
        return (this.f10879e - this.f10880f) + this.f10876b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f10881g) {
            return;
        }
        this.f10881g = true;
        this.f10878d.release(this.f10877c);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f10881g) {
            com.facebook.common.logging.a.u(f10875h, "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        com.facebook.common.internal.h.o(this.f10880f <= this.f10879e);
        b();
        if (a()) {
            byte[] bArr = this.f10877c;
            int i4 = this.f10880f;
            this.f10880f = i4 + 1;
            return bArr[i4] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        com.facebook.common.internal.h.o(this.f10880f <= this.f10879e);
        b();
        int i4 = this.f10879e;
        int i5 = this.f10880f;
        long j5 = i4 - i5;
        if (j5 >= j4) {
            this.f10880f = (int) (i5 + j4);
            return j4;
        }
        this.f10880f = i4;
        return j5 + this.f10876b.skip(j4 - j5);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        com.facebook.common.internal.h.o(this.f10880f <= this.f10879e);
        b();
        if (a()) {
            int min = Math.min(this.f10879e - this.f10880f, i5);
            System.arraycopy(this.f10877c, this.f10880f, bArr, i4, min);
            this.f10880f += min;
            return min;
        }
        return -1;
    }
}
