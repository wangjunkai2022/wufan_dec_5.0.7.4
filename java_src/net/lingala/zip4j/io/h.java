package net.lingala.zip4j.io;

import java.io.IOException;
import java.io.InputStream;
import net.lingala.zip4j.exception.ZipException;
/* compiled from: ZipInputStream.java */
/* loaded from: classes7.dex */
public class h extends InputStream {

    /* renamed from: b  reason: collision with root package name */
    private a f71824b;

    public h(a aVar) {
        this.f71824b = aVar;
    }

    public void a(boolean z4) throws IOException {
        try {
            this.f71824b.close();
            if (z4 || this.f71824b.a() == null) {
                return;
            }
            this.f71824b.a().b();
        } catch (ZipException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f71824b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(false);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f71824b.read();
        if (read != -1) {
            this.f71824b.a().u(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        return this.f71824b.skip(j4);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = this.f71824b.read(bArr, i4, i5);
        if (read > 0 && this.f71824b.a() != null) {
            this.f71824b.a().v(bArr, i4, read);
        }
        return read;
    }
}
