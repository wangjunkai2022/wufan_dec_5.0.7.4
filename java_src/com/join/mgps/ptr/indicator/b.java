package com.join.mgps.ptr.indicator;
/* compiled from: PtrTensionIndicator.java */
/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: p  reason: collision with root package name */
    private float f53887p;

    /* renamed from: q  reason: collision with root package name */
    private float f53888q;

    /* renamed from: s  reason: collision with root package name */
    private float f53890s;

    /* renamed from: t  reason: collision with root package name */
    private int f53891t;

    /* renamed from: o  reason: collision with root package name */
    private float f53886o = 0.5f;

    /* renamed from: r  reason: collision with root package name */
    private float f53889r = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    private float f53892u = -1.0f;

    private float O(float f5) {
        float f6 = f5 / this.f53889r;
        this.f53890s = f6;
        Math.min(1.0f, Math.abs(f6));
        float f7 = this.f53889r;
        Math.pow(Math.max(0.0f, Math.min(f5 - f7, f7 * 2.0f) / this.f53889r) / 4.0f, 2.0d);
        return 0.0f;
    }

    @Override // com.join.mgps.ptr.indicator.a
    public void A() {
        super.A();
        this.f53891t = d();
        this.f53892u = this.f53890s;
    }

    @Override // com.join.mgps.ptr.indicator.a
    public void B() {
        this.f53891t = d();
        this.f53892u = N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.ptr.indicator.a
    public void D(float f5, float f6, float f7, float f8) {
        float f9 = this.f53887p;
        if (f6 < f9) {
            super.D(f5, f6, f7, f8);
            return;
        }
        float f10 = ((f6 - f9) * this.f53886o) + this.f53888q;
        float f11 = f10 / this.f53889r;
        if (f11 < 0.0f) {
            G(f7, 0.0f);
            return;
        }
        this.f53890s = f11;
        float min = Math.min(1.0f, Math.abs(f11));
        float f12 = this.f53889r;
        double max = Math.max(0.0f, Math.min(f10 - f12, f12 * 2.0f) / this.f53889r) / 4.0f;
        double pow = Math.pow(max, 2.0d);
        Double.isNaN(max);
        float f13 = this.f53889r;
        G(f5, ((int) ((f13 * min) + (((((float) (max - pow)) * 2.0f) * f13) / 2.0f))) - d());
    }

    @Override // com.join.mgps.ptr.indicator.a
    public void F(int i4) {
        super.F(i4);
        this.f53889r = (i4 * 4.0f) / 5.0f;
    }

    public float N() {
        if (x()) {
            return this.f53890s;
        }
        float f5 = this.f53892u;
        if (f5 <= 0.0f) {
            return (d() * 1.0f) / h();
        }
        return (f5 * d()) / this.f53891t;
    }

    @Override // com.join.mgps.ptr.indicator.a
    public int h() {
        return i();
    }

    @Override // com.join.mgps.ptr.indicator.a
    public int i() {
        return (int) this.f53889r;
    }

    @Override // com.join.mgps.ptr.indicator.a
    public void z(float f5, float f6) {
        super.z(f5, f6);
        this.f53887p = f6;
        this.f53888q = d();
    }
}
