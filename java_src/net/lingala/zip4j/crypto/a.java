package net.lingala.zip4j.crypto;

import java.util.Arrays;
import net.lingala.zip4j.exception.ZipException;
import w3.i;
/* compiled from: AESDecrypter.java */
/* loaded from: classes7.dex */
public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private i f71737a;

    /* renamed from: b  reason: collision with root package name */
    private net.lingala.zip4j.crypto.engine.a f71738b;

    /* renamed from: c  reason: collision with root package name */
    private net.lingala.zip4j.crypto.PBKDF2.b f71739c;

    /* renamed from: e  reason: collision with root package name */
    private int f71741e;

    /* renamed from: f  reason: collision with root package name */
    private int f71742f;

    /* renamed from: g  reason: collision with root package name */
    private int f71743g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f71744h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f71745i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f71746j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f71747k;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f71749m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f71750n;

    /* renamed from: d  reason: collision with root package name */
    private final int f71740d = 2;

    /* renamed from: l  reason: collision with root package name */
    private int f71748l = 1;

    /* renamed from: o  reason: collision with root package name */
    private int f71751o = 0;

    public a(i iVar, byte[] bArr, byte[] bArr2) throws ZipException {
        if (iVar != null) {
            this.f71737a = iVar;
            this.f71747k = null;
            this.f71749m = new byte[16];
            this.f71750n = new byte[16];
            h(bArr, bArr2);
            return;
        }
        throw new ZipException("one of the input parameters is null in AESDecryptor Constructor");
    }

    private byte[] c(byte[] bArr, char[] cArr) throws ZipException {
        try {
            return new net.lingala.zip4j.crypto.PBKDF2.c(new net.lingala.zip4j.crypto.PBKDF2.e(com.alipay.security.mobile.module.commonutils.crypto.c.f4997a, "ISO-8859-1", bArr, 1000)).g(cArr, this.f71741e + this.f71742f + 2);
        } catch (Exception e5) {
            throw new ZipException(e5);
        }
    }

    private void h(byte[] bArr, byte[] bArr2) throws ZipException {
        i iVar = this.f71737a;
        if (iVar != null) {
            w3.a a5 = iVar.a();
            if (a5 != null) {
                int a6 = a5.a();
                if (a6 == 1) {
                    this.f71741e = 16;
                    this.f71742f = 16;
                    this.f71743g = 8;
                } else if (a6 == 2) {
                    this.f71741e = 24;
                    this.f71742f = 24;
                    this.f71743g = 12;
                } else if (a6 == 3) {
                    this.f71741e = 32;
                    this.f71742f = 32;
                    this.f71743g = 16;
                } else {
                    StringBuffer stringBuffer = new StringBuffer("invalid aes key strength for file: ");
                    stringBuffer.append(this.f71737a.j());
                    throw new ZipException(stringBuffer.toString());
                }
                if (this.f71737a.o() != null && this.f71737a.o().length > 0) {
                    byte[] c5 = c(bArr, this.f71737a.o());
                    if (c5 != null) {
                        int length = c5.length;
                        int i4 = this.f71741e;
                        int i5 = this.f71742f;
                        if (length == i4 + i5 + 2) {
                            byte[] bArr3 = new byte[i4];
                            this.f71744h = bArr3;
                            this.f71745i = new byte[i5];
                            this.f71746j = new byte[2];
                            System.arraycopy(c5, 0, bArr3, 0, i4);
                            System.arraycopy(c5, this.f71741e, this.f71745i, 0, this.f71742f);
                            System.arraycopy(c5, this.f71741e + this.f71742f, this.f71746j, 0, 2);
                            byte[] bArr4 = this.f71746j;
                            if (bArr4 != null) {
                                if (Arrays.equals(bArr2, bArr4)) {
                                    this.f71738b = new net.lingala.zip4j.crypto.engine.a(this.f71744h);
                                    net.lingala.zip4j.crypto.PBKDF2.b bVar = new net.lingala.zip4j.crypto.PBKDF2.b(com.alipay.security.mobile.module.commonutils.crypto.c.f4997a);
                                    this.f71739c = bVar;
                                    bVar.b(this.f71745i);
                                    return;
                                }
                                StringBuffer stringBuffer2 = new StringBuffer("Wrong Password for file: ");
                                stringBuffer2.append(this.f71737a.j());
                                throw new ZipException(stringBuffer2.toString(), 5);
                            }
                            throw new ZipException("invalid derived password verifier for AES");
                        }
                    }
                    throw new ZipException("invalid derived key");
                }
                throw new ZipException("empty or null password provided for AES Decryptor");
            }
            throw new ZipException("invalid aes extra data record - in init method of AESDecryptor");
        }
        throw new ZipException("invalid file header in init method of AESDecryptor");
    }

    @Override // net.lingala.zip4j.crypto.c
    public int a(byte[] bArr) throws ZipException {
        return b(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.crypto.c
    public int b(byte[] bArr, int i4, int i5) throws ZipException {
        if (this.f71738b == null) {
            throw new ZipException("AES not initialized properly");
        }
        int i6 = i4;
        while (true) {
            int i7 = i4 + i5;
            if (i6 >= i7) {
                return i5;
            }
            int i8 = i6 + 16;
            int i9 = i8 <= i7 ? 16 : i7 - i6;
            try {
                this.f71751o = i9;
                this.f71739c.update(bArr, i6, i9);
                net.lingala.zip4j.util.f.d(this.f71749m, this.f71748l, 16);
                this.f71738b.e(this.f71749m, this.f71750n);
                for (int i10 = 0; i10 < this.f71751o; i10++) {
                    int i11 = i6 + i10;
                    bArr[i11] = (byte) (bArr[i11] ^ this.f71750n[i10]);
                }
                this.f71748l++;
                i6 = i8;
            } catch (ZipException e5) {
                throw e5;
            } catch (Exception e6) {
                throw new ZipException(e6);
            }
        }
    }

    public byte[] d() {
        return this.f71739c.d();
    }

    public int e() {
        return 2;
    }

    public int f() {
        return this.f71743g;
    }

    public byte[] g() {
        return this.f71747k;
    }

    public void i(byte[] bArr) {
        this.f71747k = bArr;
    }
}
