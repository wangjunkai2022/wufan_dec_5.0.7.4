package com.umeng.analytics.pro;
/* compiled from: TMemoryInputTransport.java */
/* loaded from: classes6.dex */
public final class dh extends di {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f63677a;

    /* renamed from: b  reason: collision with root package name */
    private int f63678b;

    /* renamed from: c  reason: collision with root package name */
    private int f63679c;

    public dh() {
    }

    public void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.analytics.pro.di
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.di
    public void b() throws dj {
    }

    @Override // com.umeng.analytics.pro.di
    public void b(byte[] bArr, int i4, int i5) throws dj {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.analytics.pro.di
    public void c() {
    }

    public void c(byte[] bArr, int i4, int i5) {
        this.f63677a = bArr;
        this.f63678b = i4;
        this.f63679c = i4 + i5;
    }

    public void e() {
        this.f63677a = null;
    }

    @Override // com.umeng.analytics.pro.di
    public byte[] f() {
        return this.f63677a;
    }

    @Override // com.umeng.analytics.pro.di
    public int g() {
        return this.f63678b;
    }

    @Override // com.umeng.analytics.pro.di
    public int h() {
        return this.f63679c - this.f63678b;
    }

    public dh(byte[] bArr) {
        a(bArr);
    }

    @Override // com.umeng.analytics.pro.di
    public int a(byte[] bArr, int i4, int i5) throws dj {
        int h4 = h();
        if (i5 > h4) {
            i5 = h4;
        }
        if (i5 > 0) {
            System.arraycopy(this.f63677a, this.f63678b, bArr, i4, i5);
            a(i5);
        }
        return i5;
    }

    public dh(byte[] bArr, int i4, int i5) {
        c(bArr, i4, i5);
    }

    @Override // com.umeng.analytics.pro.di
    public void a(int i4) {
        this.f63678b += i4;
    }
}
