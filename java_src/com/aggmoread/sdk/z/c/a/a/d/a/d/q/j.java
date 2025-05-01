package com.aggmoread.sdk.z.c.a.a.d.a.d.q;
/* loaded from: classes2.dex */
public class j extends c {

    /* renamed from: l  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.d.b.e f3057l;

    public j(com.aggmoread.sdk.z.c.a.a.d.b.e eVar, com.aggmoread.sdk.z.c.a.a.e.f fVar, int i4) {
        this.f3057l = eVar;
        this.f3307a = eVar.f3307a;
        this.f3308b = eVar.f3308b;
        this.f3312f = i4;
        this.f3310d = eVar.f3310d;
        this.f3309c = fVar;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void a(com.aggmoread.sdk.z.c.a.a.d.b.k kVar) {
        this.f3057l.a(kVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void a(boolean z4) {
        this.f3057l.a(true);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.k kVar) {
        this.f3057l.b(kVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public boolean h() {
        return this.f3057l.h();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void j() {
        this.f3057l.j();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void k() {
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public boolean l() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACWFRTAG", "con tryNextSDK , rid " + this.f3307a.f3259c + ", listener0 " + this.f3307a.f3263g);
        com.aggmoread.sdk.z.c.a.a.c.f fVar = this.f3307a.f3263g;
        if (fVar != null) {
            fVar.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(-20000, "未匹配到合适的广告"));
            return true;
        }
        return true;
    }
}
