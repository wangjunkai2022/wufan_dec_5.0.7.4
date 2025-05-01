package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import com.aggmoread.sdk.z.c.a.a.d.b.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class o extends c {

    /* renamed from: l  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.d.b.e f3063l;

    /* renamed from: m  reason: collision with root package name */
    private List<n> f3064m;

    public o(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, List<n> list, int i4) {
        this.f3063l = eVar;
        this.f3307a = dVar;
        this.f3308b = new com.aggmoread.sdk.z.c.a.a.e.f(new HashMap(eVar.f3308b.f3494a));
        this.f3310d = eVar.f3310d;
        this.f3064m = list;
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                Map<Object, Object> map = list.get(i5).f3062b;
                if (map != null) {
                    arrayList.add(map);
                }
            }
        }
        Map<Object, Object> map2 = this.f3308b.f3494a;
        Object obj = e.c.f3320a;
        map2.put(obj, arrayList);
        List list2 = (List) this.f3308b.f3494a.get(obj);
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        boolean z4 = false;
        for (int i6 = 0; i6 < list2.size(); i6++) {
            com.aggmoread.sdk.z.c.a.a.e.f fVar = new com.aggmoread.sdk.z.c.a.a.e.f((Map) list2.get(i6));
            fVar.c(e.c.T);
            if (!z4 && fVar.b(e.c.V) > dVar.f3278v) {
                this.f3309c = fVar;
                this.f3312f = i6;
                z4 = true;
            }
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void a(com.aggmoread.sdk.z.c.a.a.d.b.k kVar) {
        this.f3063l.a(kVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void a(boolean z4) {
        this.f3063l.a(true);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.k kVar) {
        this.f3063l.b(kVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public int g() {
        n nVar;
        try {
            List<n> list = this.f3064m;
            if (list != null) {
                int size = list.size();
                int i4 = this.f3312f;
                if (size > i4 && (nVar = this.f3064m.get(i4)) != null) {
                    return nVar.f3061a;
                }
            }
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACWFRTAG", "gci err " + e5.getMessage());
        }
        return super.g();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public boolean h() {
        return this.f3063l.h();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void j() {
        this.f3063l.j();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public void k() {
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACWFRTAG", "watter tryEnd " + this.f3307a.f3259c + ", this " + this);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.e
    public boolean l() {
        boolean l4 = super.l();
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACWFRTAG", "watter tryNextSDK " + l4 + ", rid " + this.f3307a.f3259c + ", this " + this);
        if (l4 || this.f3307a.f3263g == null) {
            return true;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACWFRTAG", "notify tryNextSDK");
        this.f3307a.f3263g.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(-20000, "未匹配到合适的广告"));
        return true;
    }
}
