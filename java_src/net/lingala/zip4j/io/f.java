package net.lingala.zip4j.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import net.lingala.zip4j.exception.ZipException;
/* compiled from: PartInputStream.java */
/* loaded from: classes7.dex */
public class f extends a {

    /* renamed from: b  reason: collision with root package name */
    private RandomAccessFile f71808b;

    /* renamed from: d  reason: collision with root package name */
    private long f71810d;

    /* renamed from: e  reason: collision with root package name */
    private net.lingala.zip4j.unzip.d f71811e;

    /* renamed from: f  reason: collision with root package name */
    private net.lingala.zip4j.crypto.c f71812f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f71816j;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f71813g = new byte[1];

    /* renamed from: h  reason: collision with root package name */
    private byte[] f71814h = new byte[16];

    /* renamed from: i  reason: collision with root package name */
    private int f71815i = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f71817k = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f71809c = 0;

    public f(RandomAccessFile randomAccessFile, long j4, long j5, net.lingala.zip4j.unzip.d dVar) {
        boolean z4 = true;
        this.f71816j = false;
        this.f71808b = randomAccessFile;
        this.f71811e = dVar;
        this.f71812f = dVar.i();
        this.f71810d = j5;
        this.f71816j = (dVar.j().D() && dVar.j().j() == 99) ? false : false;
    }

    @Override // net.lingala.zip4j.io.a
    public net.lingala.zip4j.unzip.d a() {
        return this.f71811e;
    }

    @Override // net.lingala.zip4j.io.a, java.io.InputStream
    public int available() {
        long j4 = this.f71810d - this.f71809c;
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() throws IOException {
        net.lingala.zip4j.crypto.c cVar;
        if (this.f71816j && (cVar = this.f71812f) != null && (cVar instanceof net.lingala.zip4j.crypto.a) && ((net.lingala.zip4j.crypto.a) cVar).g() == null) {
            byte[] bArr = new byte[10];
            int read = this.f71808b.read(bArr);
            if (read != 10) {
                if (this.f71811e.p().n()) {
                    this.f71808b.close();
                    RandomAccessFile s4 = this.f71811e.s();
                    this.f71808b = s4;
                    s4.read(bArr, read, 10 - read);
                } else {
                    throw new IOException("Error occured while reading stored AES authentication bytes");
                }
            }
            ((net.lingala.zip4j.crypto.a) this.f71811e.i()).i(bArr);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f71808b.close();
    }

    @Override // net.lingala.zip4j.io.a, java.io.InputStream
    public int read() throws IOException {
        if (this.f71809c >= this.f71810d) {
            return -1;
        }
        if (this.f71816j) {
            int i4 = this.f71815i;
            if (i4 == 0 || i4 == 16) {
                if (read(this.f71814h) == -1) {
                    return -1;
                }
                this.f71815i = 0;
            }
            byte[] bArr = this.f71814h;
            int i5 = this.f71815i;
            this.f71815i = i5 + 1;
            return bArr[i5] & 255;
        } else if (read(this.f71813g, 0, 1) == -1) {
            return -1;
        } else {
            return this.f71813g[0] & 255;
        }
    }

    @Override // net.lingala.zip4j.io.a
    public void seek(long j4) throws IOException {
        this.f71808b.seek(j4);
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        if (j4 >= 0) {
            long j5 = this.f71810d;
            long j6 = this.f71809c;
            if (j4 > j5 - j6) {
                j4 = j5 - j6;
            }
            this.f71809c = j6 + j4;
            return j4;
        }
        throw new IllegalArgumentException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        long j4 = this.f71810d;
        long j5 = this.f71809c;
        if (i5 > j4 - j5 && (i5 = (int) (j4 - j5)) == 0) {
            b();
            return -1;
        }
        if ((this.f71811e.i() instanceof net.lingala.zip4j.crypto.a) && this.f71809c + i5 < this.f71810d && (i6 = i5 % 16) != 0) {
            i5 -= i6;
        }
        synchronized (this.f71808b) {
            int read = this.f71808b.read(bArr, i4, i5);
            this.f71817k = read;
            if (read < i5 && this.f71811e.p().n()) {
                this.f71808b.close();
                RandomAccessFile s4 = this.f71811e.s();
                this.f71808b = s4;
                if (this.f71817k < 0) {
                    this.f71817k = 0;
                }
                int i7 = this.f71817k;
                int read2 = s4.read(bArr, i7, i5 - i7);
                if (read2 > 0) {
                    this.f71817k += read2;
                }
            }
        }
        int i8 = this.f71817k;
        if (i8 > 0) {
            net.lingala.zip4j.crypto.c cVar = this.f71812f;
            if (cVar != null) {
                try {
                    cVar.b(bArr, i4, i8);
                } catch (ZipException e5) {
                    throw new IOException(e5.getMessage());
                }
            }
            this.f71809c += this.f71817k;
        }
        if (this.f71809c >= this.f71810d) {
            b();
        }
        return this.f71817k;
    }
}
