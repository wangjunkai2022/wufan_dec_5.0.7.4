package net.lingala.zip4j.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: InflaterInputStream.java */
/* loaded from: classes7.dex */
public class e extends f {

    /* renamed from: l  reason: collision with root package name */
    private Inflater f71802l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f71803m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f71804n;

    /* renamed from: o  reason: collision with root package name */
    private net.lingala.zip4j.unzip.d f71805o;

    /* renamed from: p  reason: collision with root package name */
    private long f71806p;

    /* renamed from: q  reason: collision with root package name */
    private long f71807q;

    public e(RandomAccessFile randomAccessFile, long j4, long j5, net.lingala.zip4j.unzip.d dVar) {
        super(randomAccessFile, j4, j5, dVar);
        this.f71804n = new byte[1];
        this.f71802l = new Inflater(true);
        this.f71803m = new byte[4096];
        this.f71805o = dVar;
        this.f71806p = 0L;
        this.f71807q = dVar.j().x();
    }

    private void d() throws IOException {
        byte[] bArr = this.f71803m;
        int read = super.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f71802l.setInput(this.f71803m, 0, read);
            return;
        }
        throw new EOFException("Unexpected end of ZLIB input stream");
    }

    private void g() throws IOException {
        do {
        } while (super.read(new byte[1024], 0, 1024) != -1);
        b();
    }

    @Override // net.lingala.zip4j.io.f, net.lingala.zip4j.io.a
    public net.lingala.zip4j.unzip.d a() {
        return super.a();
    }

    @Override // net.lingala.zip4j.io.f, net.lingala.zip4j.io.a, java.io.InputStream
    public int available() {
        return !this.f71802l.finished();
    }

    @Override // net.lingala.zip4j.io.f, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f71802l.end();
        super.close();
    }

    @Override // net.lingala.zip4j.io.f, net.lingala.zip4j.io.a, java.io.InputStream
    public int read() throws IOException {
        if (read(this.f71804n, 0, 1) == -1) {
            return -1;
        }
        return this.f71804n[0] & 255;
    }

    @Override // net.lingala.zip4j.io.f, net.lingala.zip4j.io.a
    public void seek(long j4) throws IOException {
        super.seek(j4);
    }

    @Override // net.lingala.zip4j.io.f, java.io.InputStream
    public long skip(long j4) throws IOException {
        if (j4 >= 0) {
            int min = (int) Math.min(j4, 2147483647L);
            byte[] bArr = new byte[512];
            int i4 = 0;
            while (i4 < min) {
                int i5 = min - i4;
                if (i5 > 512) {
                    i5 = 512;
                }
                int read = read(bArr, 0, i5);
                if (read == -1) {
                    break;
                }
                i4 += read;
            }
            return i4;
        }
        throw new IllegalArgumentException("negative skip length");
    }

    @Override // net.lingala.zip4j.io.f, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        Objects.requireNonNull(bArr, "input buffer is null");
        return read(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.f, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        Objects.requireNonNull(bArr, "input buffer is null");
        if (i4 < 0 || i5 < 0 || i5 > bArr.length - i4) {
            throw new IndexOutOfBoundsException();
        }
        if (i5 == 0) {
            return 0;
        }
        try {
            if (this.f71806p >= this.f71807q) {
                g();
                return -1;
            }
            while (true) {
                int inflate = this.f71802l.inflate(bArr, i4, i5);
                if (inflate != 0) {
                    this.f71806p += inflate;
                    return inflate;
                } else if (this.f71802l.finished() || this.f71802l.needsDictionary()) {
                    break;
                } else if (this.f71802l.needsInput()) {
                    d();
                }
            }
            g();
            return -1;
        } catch (DataFormatException e5) {
            String message = e5.getMessage() != null ? e5.getMessage() : "Invalid ZLIB data format";
            net.lingala.zip4j.unzip.d dVar = this.f71805o;
            if (dVar != null && dVar.l().u() && this.f71805o.l().f() == 0) {
                StringBuffer stringBuffer = new StringBuffer(String.valueOf(message));
                stringBuffer.append(" - Wrong Password?");
                message = stringBuffer.toString();
            }
            throw new IOException(message);
        }
    }
}
