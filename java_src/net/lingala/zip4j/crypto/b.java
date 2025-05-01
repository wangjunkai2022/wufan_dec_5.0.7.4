package net.lingala.zip4j.crypto;

import java.util.Random;
import net.lingala.zip4j.exception.ZipException;
/* compiled from: AESEncrpyter.java */
/* loaded from: classes7.dex */
public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private char[] f71752a;

    /* renamed from: b  reason: collision with root package name */
    private int f71753b;

    /* renamed from: c  reason: collision with root package name */
    private net.lingala.zip4j.crypto.engine.a f71754c;

    /* renamed from: d  reason: collision with root package name */
    private net.lingala.zip4j.crypto.PBKDF2.b f71755d;

    /* renamed from: e  reason: collision with root package name */
    private int f71756e;

    /* renamed from: f  reason: collision with root package name */
    private int f71757f;

    /* renamed from: g  reason: collision with root package name */
    private int f71758g;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f71760i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f71761j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f71762k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f71763l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f71764m;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f71767p;

    /* renamed from: q  reason: collision with root package name */
    private byte[] f71768q;

    /* renamed from: h  reason: collision with root package name */
    private final int f71759h = 2;

    /* renamed from: n  reason: collision with root package name */
    private int f71765n = 1;

    /* renamed from: o  reason: collision with root package name */
    private int f71766o = 0;

    public b(char[] cArr, int i4) throws ZipException {
        if (cArr == null || cArr.length == 0) {
            throw new ZipException("input password is empty or null in AES encrypter constructor");
        }
        if (i4 != 1 && i4 != 3) {
            throw new ZipException("Invalid key strength in AES encrypter constructor");
        }
        this.f71752a = cArr;
        this.f71753b = i4;
        this.f71764m = false;
        this.f71768q = new byte[16];
        this.f71767p = new byte[16];
        j();
    }

    private byte[] c(byte[] bArr, char[] cArr) throws ZipException {
        try {
            return new net.lingala.zip4j.crypto.PBKDF2.c(new net.lingala.zip4j.crypto.PBKDF2.e(com.alipay.security.mobile.module.commonutils.crypto.c.f4997a, "ISO-8859-1", bArr, 1000)).g(cArr, this.f71756e + this.f71757f + 2);
        } catch (Exception e5) {
            throw new ZipException(e5);
        }
    }

    private static byte[] d(int i4) throws ZipException {
        if (i4 != 8 && i4 != 16) {
            throw new ZipException("invalid salt size, cannot generate salt");
        }
        int i5 = i4 == 8 ? 2 : 0;
        if (i4 == 16) {
            i5 = 4;
        }
        byte[] bArr = new byte[i4];
        for (int i6 = 0; i6 < i5; i6++) {
            int nextInt = new Random().nextInt();
            int i7 = i6 * 4;
            bArr[i7 + 0] = (byte) (nextInt >> 24);
            bArr[i7 + 1] = (byte) (nextInt >> 16);
            bArr[i7 + 2] = (byte) (nextInt >> 8);
            bArr[i7 + 3] = (byte) nextInt;
        }
        return bArr;
    }

    private void j() throws ZipException {
        int i4 = this.f71753b;
        if (i4 == 1) {
            this.f71756e = 16;
            this.f71757f = 16;
            this.f71758g = 8;
        } else if (i4 == 3) {
            this.f71756e = 32;
            this.f71757f = 32;
            this.f71758g = 16;
        } else {
            throw new ZipException("invalid aes key strength, cannot determine key sizes");
        }
        byte[] d5 = d(this.f71758g);
        this.f71763l = d5;
        byte[] c5 = c(d5, this.f71752a);
        if (c5 != null) {
            int length = c5.length;
            int i5 = this.f71756e;
            int i6 = this.f71757f;
            if (length == i5 + i6 + 2) {
                byte[] bArr = new byte[i5];
                this.f71760i = bArr;
                this.f71761j = new byte[i6];
                this.f71762k = new byte[2];
                System.arraycopy(c5, 0, bArr, 0, i5);
                System.arraycopy(c5, this.f71756e, this.f71761j, 0, this.f71757f);
                System.arraycopy(c5, this.f71756e + this.f71757f, this.f71762k, 0, 2);
                this.f71754c = new net.lingala.zip4j.crypto.engine.a(this.f71760i);
                net.lingala.zip4j.crypto.PBKDF2.b bVar = new net.lingala.zip4j.crypto.PBKDF2.b(com.alipay.security.mobile.module.commonutils.crypto.c.f4997a);
                this.f71755d = bVar;
                bVar.b(this.f71761j);
                return;
            }
        }
        throw new ZipException("invalid key generated, cannot decrypt file");
    }

    @Override // net.lingala.zip4j.crypto.d
    public int a(byte[] bArr, int i4, int i5) throws ZipException {
        int i6;
        if (!this.f71764m) {
            if (i5 % 16 != 0) {
                this.f71764m = true;
            }
            int i7 = i4;
            while (true) {
                int i8 = i4 + i5;
                if (i7 >= i8) {
                    return i5;
                }
                int i9 = i7 + 16;
                this.f71766o = i9 <= i8 ? 16 : i8 - i7;
                net.lingala.zip4j.util.f.d(this.f71767p, this.f71765n, 16);
                this.f71754c.e(this.f71767p, this.f71768q);
                int i10 = 0;
                while (true) {
                    i6 = this.f71766o;
                    if (i10 >= i6) {
                        break;
                    }
                    int i11 = i7 + i10;
                    bArr[i11] = (byte) (bArr[i11] ^ this.f71768q[i10]);
                    i10++;
                }
                this.f71755d.update(bArr, i7, i6);
                this.f71765n++;
                i7 = i9;
            }
        } else {
            throw new ZipException("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
    }

    @Override // net.lingala.zip4j.crypto.d
    public int b(byte[] bArr) throws ZipException {
        if (bArr != null) {
            return a(bArr, 0, bArr.length);
        }
        throw new ZipException("input bytes are null, cannot perform AES encrpytion");
    }

    public byte[] e() {
        return this.f71762k;
    }

    public byte[] f() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.f71755d.d(), 0, bArr, 0, 10);
        return bArr;
    }

    public int g() {
        return 2;
    }

    public byte[] h() {
        return this.f71763l;
    }

    public int i() {
        return this.f71758g;
    }

    public void k(byte[] bArr) {
        this.f71762k = bArr;
    }

    public void l(byte[] bArr) {
        this.f71763l = bArr;
    }
}
