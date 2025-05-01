package com.join.mgps.ptr.indicator;

import android.graphics.PointF;
/* compiled from: PtrIndicator.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: n  reason: collision with root package name */
    public static final int f53872n = 0;

    /* renamed from: c  reason: collision with root package name */
    private float f53875c;

    /* renamed from: d  reason: collision with root package name */
    private float f53876d;

    /* renamed from: g  reason: collision with root package name */
    private int f53879g;

    /* renamed from: a  reason: collision with root package name */
    protected int f53873a = 0;

    /* renamed from: b  reason: collision with root package name */
    private PointF f53874b = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private int f53877e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f53878f = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f53880h = 0;

    /* renamed from: i  reason: collision with root package name */
    private float f53881i = 1.2f;

    /* renamed from: j  reason: collision with root package name */
    private float f53882j = 2.7f;

    /* renamed from: k  reason: collision with root package name */
    private boolean f53883k = false;

    /* renamed from: l  reason: collision with root package name */
    private int f53884l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f53885m = 0;

    public void A() {
        this.f53883k = false;
    }

    public void B() {
        this.f53885m = this.f53877e;
    }

    protected void C(int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(float f5, float f6, float f7, float f8) {
        G(f7, f8 / this.f53882j);
    }

    public final void E(int i4) {
        int i5 = this.f53877e;
        this.f53878f = i5;
        this.f53877e = i4;
        C(i4, i5);
    }

    public void F(int i4) {
        this.f53879g = i4;
        L();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G(float f5, float f6) {
        this.f53875c = f5;
        this.f53876d = f6;
    }

    public void H(int i4) {
        this.f53884l = i4;
    }

    public void I(int i4) {
        this.f53881i = (this.f53879g * 1.0f) / i4;
        this.f53873a = i4;
    }

    public void J(float f5) {
        this.f53881i = f5;
        this.f53873a = (int) (this.f53879g * f5);
    }

    public void K(float f5) {
        this.f53882j = f5;
    }

    protected void L() {
        this.f53873a = (int) (this.f53881i * this.f53879g);
    }

    public boolean M(int i4) {
        return i4 < 0;
    }

    public void a(a aVar) {
        this.f53877e = aVar.f53877e;
        this.f53878f = aVar.f53878f;
        this.f53879g = aVar.f53879g;
    }

    public boolean b() {
        return this.f53878f < i() && this.f53877e >= i();
    }

    public float c() {
        int i4 = this.f53879g;
        if (i4 == 0) {
            return 0.0f;
        }
        return (this.f53877e * 1.0f) / i4;
    }

    public int d() {
        return this.f53877e;
    }

    public int e() {
        return this.f53879g;
    }

    public float f() {
        int i4 = this.f53879g;
        if (i4 == 0) {
            return 0.0f;
        }
        return (this.f53878f * 1.0f) / i4;
    }

    public int g() {
        return this.f53878f;
    }

    public int h() {
        int i4 = this.f53884l;
        return i4 >= 0 ? i4 : this.f53879g;
    }

    public int i() {
        return this.f53873a;
    }

    public float j() {
        return this.f53875c;
    }

    public float k() {
        return this.f53876d;
    }

    public float l() {
        return this.f53881i;
    }

    public float m() {
        return this.f53882j;
    }

    public boolean n() {
        return this.f53877e >= this.f53885m;
    }

    public boolean o() {
        return this.f53878f != 0 && u();
    }

    public boolean p() {
        return this.f53878f == 0 && r();
    }

    public boolean q() {
        int i4 = this.f53878f;
        int i5 = this.f53879g;
        return i4 < i5 && this.f53877e >= i5;
    }

    public boolean r() {
        return this.f53877e > 0;
    }

    public boolean s() {
        return this.f53877e != this.f53880h;
    }

    public boolean t(int i4) {
        return this.f53877e == i4;
    }

    public boolean u() {
        return this.f53877e == 0;
    }

    public boolean v() {
        return this.f53877e > h();
    }

    public boolean w() {
        return this.f53877e >= i();
    }

    public boolean x() {
        return this.f53883k;
    }

    public final void y(float f5, float f6) {
        PointF pointF = this.f53874b;
        D(f5, f6, f5 - pointF.x, f6 - pointF.y);
        this.f53874b.set(f5, f6);
    }

    public void z(float f5, float f6) {
        this.f53883k = true;
        this.f53880h = this.f53877e;
        this.f53874b.set(f5, f6);
    }
}
