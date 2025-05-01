package net.lingala.zip4j.crypto.PBKDF2;

import java.util.Objects;
/* compiled from: PBKDF2Engine.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f71730a;

    /* renamed from: b  reason: collision with root package name */
    protected f f71731b;

    public c() {
        this.f71730a = null;
        this.f71731b = null;
    }

    protected void a(byte[] bArr, int i4, int i5) {
        bArr[i4 + 0] = (byte) (i5 / 16777216);
        bArr[i4 + 1] = (byte) (i5 / 65536);
        bArr[i4 + 2] = (byte) (i5 / 256);
        bArr[i4 + 3] = (byte) i5;
    }

    protected byte[] b(f fVar, byte[] bArr, int i4, int i5) {
        byte[] bArr2 = bArr == null ? new byte[0] : bArr;
        int a5 = fVar.a();
        int e5 = e(i5, a5);
        int i6 = i5 - ((e5 - 1) * a5);
        byte[] bArr3 = new byte[e5 * a5];
        int i7 = 0;
        for (int i8 = 1; i8 <= e5; i8++) {
            c(bArr3, i7, fVar, bArr2, i4, i8);
            i7 += a5;
        }
        if (i6 < a5) {
            byte[] bArr4 = new byte[i5];
            System.arraycopy(bArr3, 0, bArr4, 0, i5);
            return bArr4;
        }
        return bArr3;
    }

    protected void c(byte[] bArr, int i4, f fVar, byte[] bArr2, int i5, int i6) {
        int a5 = fVar.a();
        byte[] bArr3 = new byte[a5];
        byte[] bArr4 = new byte[bArr2.length + 4];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        a(bArr4, bArr2.length, i6);
        for (int i7 = 0; i7 < i5; i7++) {
            bArr4 = fVar.c(bArr4);
            m(bArr3, bArr4);
        }
        System.arraycopy(bArr3, 0, bArr, i4, a5);
    }

    protected void d(byte[] bArr) {
        if (this.f71731b == null) {
            this.f71731b = new b(this.f71730a.b());
        }
        this.f71731b.b(bArr);
    }

    protected int e(int i4, int i5) {
        return (i4 / i5) + (i4 % i5 > 0 ? 1 : 0);
    }

    public byte[] f(char[] cArr) {
        return g(cArr, 0);
    }

    public byte[] g(char[] cArr, int i4) {
        Objects.requireNonNull(cArr);
        d(net.lingala.zip4j.util.f.c(cArr));
        if (i4 == 0) {
            i4 = this.f71731b.a();
        }
        return b(this.f71731b, this.f71730a.e(), this.f71730a.d(), i4);
    }

    public e h() {
        return this.f71730a;
    }

    public f i() {
        return this.f71731b;
    }

    public void j(e eVar) {
        this.f71730a = eVar;
    }

    public void k(f fVar) {
        this.f71731b = fVar;
    }

    public boolean l(char[] cArr) {
        byte[] g4;
        byte[] a5 = h().a();
        if (a5 == null || a5.length == 0 || (g4 = g(cArr, a5.length)) == null || g4.length != a5.length) {
            return false;
        }
        for (int i4 = 0; i4 < g4.length; i4++) {
            if (g4[i4] != a5[i4]) {
                return false;
            }
        }
        return true;
    }

    protected void m(byte[] bArr, byte[] bArr2) {
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
        }
    }

    public c(e eVar) {
        this.f71730a = eVar;
        this.f71731b = null;
    }

    public c(e eVar, f fVar) {
        this.f71730a = eVar;
        this.f71731b = fVar;
    }
}
