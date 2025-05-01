package com.umeng.analytics.pro;
/* compiled from: TTransport.java */
/* loaded from: classes6.dex */
public abstract class di {
    public abstract int a(byte[] bArr, int i4, int i5) throws dj;

    public void a(int i4) {
    }

    public abstract boolean a();

    public abstract void b() throws dj;

    public void b(byte[] bArr) throws dj {
        b(bArr, 0, bArr.length);
    }

    public abstract void b(byte[] bArr, int i4, int i5) throws dj;

    public abstract void c();

    public int d(byte[] bArr, int i4, int i5) throws dj {
        int i6 = 0;
        while (i6 < i5) {
            int a5 = a(bArr, i4 + i6, i5 - i6);
            if (a5 <= 0) {
                throw new dj("Cannot read. Remote side has closed. Tried to read " + i5 + " bytes, but only got " + i6 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i6 += a5;
        }
        return i6;
    }

    public void d() throws dj {
    }

    public byte[] f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public int h() {
        return -1;
    }

    public boolean i() {
        return a();
    }
}
