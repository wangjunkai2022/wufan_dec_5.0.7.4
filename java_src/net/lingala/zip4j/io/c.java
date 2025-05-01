package net.lingala.zip4j.io;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import w3.o;
import w3.p;
/* compiled from: CipherOutputStream.java */
/* loaded from: classes7.dex */
public class c extends b {

    /* renamed from: b  reason: collision with root package name */
    protected OutputStream f71786b;

    /* renamed from: c  reason: collision with root package name */
    private File f71787c;

    /* renamed from: d  reason: collision with root package name */
    protected w3.h f71788d;

    /* renamed from: e  reason: collision with root package name */
    protected w3.i f71789e;

    /* renamed from: f  reason: collision with root package name */
    private net.lingala.zip4j.crypto.d f71790f;

    /* renamed from: g  reason: collision with root package name */
    protected p f71791g;

    /* renamed from: h  reason: collision with root package name */
    protected o f71792h;

    /* renamed from: i  reason: collision with root package name */
    private long f71793i;

    /* renamed from: j  reason: collision with root package name */
    protected CRC32 f71794j;

    /* renamed from: k  reason: collision with root package name */
    private long f71795k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f71796l;

    /* renamed from: m  reason: collision with root package name */
    private int f71797m;

    /* renamed from: n  reason: collision with root package name */
    private long f71798n;

    public c(OutputStream outputStream, o oVar) {
        this.f71786b = outputStream;
        u(oVar);
        this.f71794j = new CRC32();
        this.f71793i = 0L;
        this.f71795k = 0L;
        this.f71796l = new byte[16];
        this.f71797m = 0;
        this.f71798n = 0L;
    }

    private void b() throws ZipException {
        String x4;
        int i4;
        w3.h hVar = new w3.h();
        this.f71788d = hVar;
        hVar.c0(33639248);
        this.f71788d.e0(20);
        this.f71788d.f0(20);
        if (this.f71791g.k() && this.f71791g.e() == 99) {
            this.f71788d.H(99);
            this.f71788d.F(k(this.f71791g));
        } else {
            this.f71788d.H(this.f71791g.c());
        }
        if (this.f71791g.k()) {
            this.f71788d.N(true);
            this.f71788d.O(this.f71791g.e());
        }
        if (this.f71791g.n()) {
            this.f71788d.Z((int) net.lingala.zip4j.util.h.D(System.currentTimeMillis()));
            if (net.lingala.zip4j.util.h.A(this.f71791g.f())) {
                x4 = this.f71791g.f();
            } else {
                throw new ZipException("fileNameInZip is null or empty");
            }
        } else {
            this.f71788d.Z((int) net.lingala.zip4j.util.h.D(net.lingala.zip4j.util.h.w(this.f71787c, this.f71791g.j())));
            this.f71788d.d0(this.f71787c.length());
            x4 = net.lingala.zip4j.util.h.x(this.f71787c.getAbsolutePath(), this.f71791g.h(), this.f71791g.d());
        }
        if (net.lingala.zip4j.util.h.A(x4)) {
            this.f71788d.U(x4);
            if (net.lingala.zip4j.util.h.A(this.f71792h.f())) {
                this.f71788d.V(net.lingala.zip4j.util.h.o(x4, this.f71792h.f()));
            } else {
                this.f71788d.V(net.lingala.zip4j.util.h.n(x4));
            }
            OutputStream outputStream = this.f71786b;
            if (outputStream instanceof g) {
                this.f71788d.M(((g) outputStream).b());
            } else {
                this.f71788d.M(0);
            }
            byte[] bArr = new byte[4];
            bArr[0] = (byte) (!this.f71791g.n() ? p(this.f71787c) : 0);
            this.f71788d.P(bArr);
            if (this.f71791g.n()) {
                this.f71788d.L(x4.endsWith(net.lingala.zip4j.util.e.F0) || x4.endsWith("\\"));
            } else {
                this.f71788d.L(this.f71787c.isDirectory());
            }
            if (this.f71788d.C()) {
                this.f71788d.G(0L);
                this.f71788d.d0(0L);
            } else if (!this.f71791g.n()) {
                long r4 = net.lingala.zip4j.util.h.r(this.f71787c);
                if (this.f71791g.c() == 0) {
                    if (this.f71791g.e() == 0) {
                        this.f71788d.G(12 + r4);
                    } else if (this.f71791g.e() == 99) {
                        int a5 = this.f71791g.a();
                        if (a5 == 1) {
                            i4 = 8;
                        } else if (a5 != 3) {
                            throw new ZipException("invalid aes key strength, cannot determine key sizes");
                        } else {
                            i4 = 16;
                        }
                        this.f71788d.G(i4 + r4 + 10 + 2);
                    } else {
                        this.f71788d.G(0L);
                    }
                } else {
                    this.f71788d.G(0L);
                }
                this.f71788d.d0(r4);
            }
            if (this.f71791g.k() && this.f71791g.e() == 0) {
                this.f71788d.I(this.f71791g.i());
            }
            byte[] bArr2 = new byte[2];
            bArr2[0] = net.lingala.zip4j.util.f.a(l(this.f71788d.D(), this.f71791g.c()));
            boolean A = net.lingala.zip4j.util.h.A(this.f71792h.f());
            if (!(A && this.f71792h.f().equalsIgnoreCase(net.lingala.zip4j.util.e.A0)) && (A || !net.lingala.zip4j.util.h.i(this.f71788d.p()).equals(net.lingala.zip4j.util.e.A0))) {
                bArr2[1] = 0;
            } else {
                bArr2[1] = 8;
            }
            this.f71788d.X(bArr2);
            return;
        }
        throw new ZipException("fileName is null or empty. unable to create file header");
    }

    private void d() throws ZipException {
        if (this.f71788d != null) {
            w3.i iVar = new w3.i();
            this.f71789e = iVar;
            iVar.P(67324752);
            this.f71789e.R(this.f71788d.z());
            this.f71789e.z(this.f71788d.f());
            this.f71789e.M(this.f71788d.t());
            this.f71789e.Q(this.f71788d.x());
            this.f71789e.J(this.f71788d.q());
            this.f71789e.I(this.f71788d.p());
            this.f71789e.D(this.f71788d.D());
            this.f71789e.E(this.f71788d.j());
            this.f71789e.x(this.f71788d.d());
            this.f71789e.A(this.f71788d.g());
            this.f71789e.y(this.f71788d.e());
            this.f71789e.L((byte[]) this.f71788d.r().clone());
            return;
        }
        throw new ZipException("file header is null, cannot create local file header");
    }

    private void h(byte[] bArr, int i4, int i5) throws IOException {
        net.lingala.zip4j.crypto.d dVar = this.f71790f;
        if (dVar != null) {
            try {
                dVar.a(bArr, i4, i5);
            } catch (ZipException e5) {
                throw new IOException(e5.getMessage());
            }
        }
        this.f71786b.write(bArr, i4, i5);
        long j4 = i5;
        this.f71793i += j4;
        this.f71795k += j4;
    }

    private w3.a k(p pVar) throws ZipException {
        if (pVar != null) {
            w3.a aVar = new w3.a();
            aVar.j(39169L);
            aVar.i(7);
            aVar.k("AE");
            aVar.l(2);
            if (pVar.a() == 1) {
                aVar.g(1);
            } else if (pVar.a() == 3) {
                aVar.g(3);
            } else {
                throw new ZipException("invalid AES key strength, cannot generate AES Extra data record");
            }
            aVar.h(pVar.c());
            return aVar;
        }
        throw new ZipException("zip parameters are null, cannot generate AES Extra Data record");
    }

    private int[] l(boolean z4, int i4) {
        int[] iArr = new int[8];
        if (z4) {
            iArr[0] = 1;
        } else {
            iArr[0] = 0;
        }
        if (i4 != 8) {
            iArr[1] = 0;
            iArr[2] = 0;
        }
        iArr[3] = 1;
        return iArr;
    }

    private int p(File file) throws ZipException {
        if (file != null) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file.isHidden() ? 18 : 16;
                } else if (file.canWrite() || !file.isHidden()) {
                    if (file.canWrite()) {
                        return file.isHidden() ? 2 : 0;
                    }
                    return 1;
                } else {
                    return 3;
                }
            }
            return 0;
        }
        throw new ZipException("input file is null, cannot get file attributes");
    }

    private void t() throws ZipException {
        if (!this.f71791g.k()) {
            this.f71790f = null;
            return;
        }
        int e5 = this.f71791g.e();
        if (e5 == 0) {
            this.f71790f = new net.lingala.zip4j.crypto.f(this.f71791g.g(), (this.f71789e.m() & 65535) << 16);
        } else if (e5 == 99) {
            this.f71790f = new net.lingala.zip4j.crypto.b(this.f71791g.g(), this.f71791g.a());
        } else {
            throw new ZipException("invalid encprytion method");
        }
    }

    private void u(o oVar) {
        if (oVar == null) {
            this.f71792h = new o();
        } else {
            this.f71792h = oVar;
        }
        if (this.f71792h.e() == null) {
            this.f71792h.t(new w3.f());
        }
        if (this.f71792h.b() == null) {
            this.f71792h.q(new w3.c());
        }
        if (this.f71792h.b().b() == null) {
            this.f71792h.b().d(new ArrayList());
        }
        if (this.f71792h.g() == null) {
            this.f71792h.v(new ArrayList());
        }
        OutputStream outputStream = this.f71786b;
        if ((outputStream instanceof g) && ((g) outputStream).k()) {
            this.f71792h.x(true);
            this.f71792h.y(((g) this.f71786b).g());
        }
        this.f71792h.e().q(net.lingala.zip4j.util.e.f71858d);
    }

    public void a() throws IOException, ZipException {
        int i4 = this.f71797m;
        if (i4 != 0) {
            h(this.f71796l, 0, i4);
            this.f71797m = 0;
        }
        if (this.f71791g.k() && this.f71791g.e() == 99) {
            net.lingala.zip4j.crypto.d dVar = this.f71790f;
            if (dVar instanceof net.lingala.zip4j.crypto.b) {
                this.f71786b.write(((net.lingala.zip4j.crypto.b) dVar).f());
                this.f71795k += 10;
                this.f71793i += 10;
            } else {
                throw new ZipException("invalid encrypter for AES encrypted file");
            }
        }
        this.f71788d.G(this.f71795k);
        this.f71789e.y(this.f71795k);
        if (this.f71791g.n()) {
            this.f71788d.d0(this.f71798n);
            long q4 = this.f71789e.q();
            long j4 = this.f71798n;
            if (q4 != j4) {
                this.f71789e.Q(j4);
            }
        }
        long value = this.f71794j.getValue();
        if (this.f71788d.D() && this.f71788d.j() == 99) {
            value = 0;
        }
        if (this.f71791g.k() && this.f71791g.e() == 99) {
            this.f71788d.I(0L);
            this.f71789e.A(0L);
        } else {
            this.f71788d.I(value);
            this.f71789e.A(value);
        }
        this.f71792h.g().add(this.f71789e);
        this.f71792h.b().b().add(this.f71788d);
        this.f71793i += new u3.b().k(this.f71789e, this.f71786b);
        this.f71794j.reset();
        this.f71795k = 0L;
        this.f71790f = null;
        this.f71798n = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f71786b;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public void g(int i4) {
        if (i4 <= 0) {
            return;
        }
        long j4 = i4;
        long j5 = this.f71795k;
        if (j4 <= j5) {
            this.f71795k = j5 - j4;
        }
    }

    public void j() throws IOException, ZipException {
        this.f71792h.e().p(this.f71793i);
        new u3.b().d(this.f71792h, this.f71786b);
    }

    public File r() {
        return this.f71787c;
    }

    public void v(File file, p pVar) throws ZipException {
        byte[] e5;
        if (!pVar.n() && file == null) {
            throw new ZipException("input file is null");
        }
        if (!pVar.n() && !net.lingala.zip4j.util.h.b(file)) {
            throw new ZipException("input file does not exist");
        }
        try {
            this.f71787c = file;
            this.f71791g = (p) pVar.clone();
            if (!pVar.n()) {
                if (this.f71787c.isDirectory()) {
                    this.f71791g.s(false);
                    this.f71791g.t(-1);
                    this.f71791g.q(0);
                }
            } else if (net.lingala.zip4j.util.h.A(this.f71791g.f())) {
                if (this.f71791g.f().endsWith(net.lingala.zip4j.util.e.F0) || this.f71791g.f().endsWith("\\")) {
                    this.f71791g.s(false);
                    this.f71791g.t(-1);
                    this.f71791g.q(0);
                }
            } else {
                throw new ZipException("file name is empty for external stream");
            }
            b();
            d();
            if (this.f71792h.n() && (this.f71792h.b() == null || this.f71792h.b().b() == null || this.f71792h.b().b().size() == 0)) {
                byte[] bArr = new byte[4];
                net.lingala.zip4j.util.f.l(bArr, 0, 134695760);
                this.f71786b.write(bArr);
                this.f71793i += 4;
            }
            OutputStream outputStream = this.f71786b;
            if (outputStream instanceof g) {
                if (this.f71793i == 4) {
                    this.f71788d.a0(4L);
                } else {
                    this.f71788d.a0(((g) outputStream).d());
                }
            } else {
                long j4 = this.f71793i;
                if (j4 == 4) {
                    this.f71788d.a0(4L);
                } else {
                    this.f71788d.a0(j4);
                }
            }
            this.f71793i += new u3.b().m(this.f71792h, this.f71789e, this.f71786b);
            if (this.f71791g.k()) {
                t();
                if (this.f71790f != null) {
                    if (pVar.e() == 0) {
                        this.f71786b.write(((net.lingala.zip4j.crypto.f) this.f71790f).e());
                        this.f71793i += e5.length;
                        this.f71795k += e5.length;
                    } else if (pVar.e() == 99) {
                        byte[] h4 = ((net.lingala.zip4j.crypto.b) this.f71790f).h();
                        byte[] e6 = ((net.lingala.zip4j.crypto.b) this.f71790f).e();
                        this.f71786b.write(h4);
                        this.f71786b.write(e6);
                        this.f71793i += h4.length + e6.length;
                        this.f71795k += h4.length + e6.length;
                    }
                }
            }
            this.f71794j.reset();
        } catch (CloneNotSupportedException e7) {
            throw new ZipException(e7);
        } catch (ZipException e8) {
            throw e8;
        } catch (Exception e9) {
            throw new ZipException(e9);
        }
    }

    @Override // net.lingala.zip4j.io.b, java.io.OutputStream
    public void write(int i4) throws IOException {
        write(new byte[]{(byte) i4}, 0, 1);
    }

    public void y(File file) {
        this.f71787c = file;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(int i4) {
        if (i4 > 0) {
            this.f71798n += i4;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        Objects.requireNonNull(bArr);
        if (bArr.length == 0) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        if (i5 == 0) {
            return;
        }
        if (this.f71791g.k() && this.f71791g.e() == 99) {
            int i7 = this.f71797m;
            if (i7 != 0) {
                if (i5 >= 16 - i7) {
                    System.arraycopy(bArr, i4, this.f71796l, i7, 16 - i7);
                    byte[] bArr2 = this.f71796l;
                    h(bArr2, 0, bArr2.length);
                    i4 = 16 - this.f71797m;
                    i5 -= i4;
                    this.f71797m = 0;
                } else {
                    System.arraycopy(bArr, i4, this.f71796l, i7, i5);
                    this.f71797m += i5;
                    return;
                }
            }
            if (i5 != 0 && (i6 = i5 % 16) != 0) {
                System.arraycopy(bArr, (i5 + i4) - i6, this.f71796l, 0, i6);
                this.f71797m = i6;
                i5 -= i6;
            }
        }
        if (i5 != 0) {
            h(bArr, i4, i5);
        }
    }
}
