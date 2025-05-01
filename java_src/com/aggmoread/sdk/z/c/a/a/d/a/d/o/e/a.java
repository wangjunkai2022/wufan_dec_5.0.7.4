package com.aggmoread.sdk.z.c.a.a.d.a.d.o.e;

import android.text.TextUtils;
import android.view.View;
import com.aggmoread.sdk.z.a.h.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.h;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class a extends h implements com.aggmoread.sdk.z.a.k.a {

    /* renamed from: j  reason: collision with root package name */
    private final HashMap<com.aggmoread.sdk.z.a.k.c, b> f2910j;

    public a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, e eVar) {
        super(dVar, eVar);
        this.f2910j = new HashMap<>();
    }

    @Override // com.aggmoread.sdk.z.a.i.b
    public void a(com.aggmoread.sdk.z.a.g.e eVar) {
        b(new i(eVar.a(), eVar.b()));
    }

    @Override // com.aggmoread.sdk.z.a.k.a
    public void a(com.aggmoread.sdk.z.a.k.c cVar) {
        b bVar = this.f2910j.get(cVar);
        if (bVar != null) {
            bVar.o();
        }
    }

    @Override // com.aggmoread.sdk.z.a.k.a
    public void a(com.aggmoread.sdk.z.a.k.c cVar, com.aggmoread.sdk.z.a.g.e eVar) {
        b bVar = this.f2910j.get(cVar);
        this.f2910j.remove(bVar);
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // com.aggmoread.sdk.z.a.k.a
    public void b(com.aggmoread.sdk.z.a.k.c cVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("APIEXPRESSHTAG", "onADExposure");
        b bVar = this.f2910j.get(cVar);
        if (bVar != null) {
            System.currentTimeMillis();
            com.aggmoread.sdk.z.c.a.a.d.b.m.a a5 = bVar.a();
            l.a(a5, bVar.f2804j);
            l.a(this.f3244c.f3258b, bVar.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, a5, new View[0], new WeakReference(a5), null);
            l.b(this.f3244c.f3258b, this.f3245d.e(), this.f3245d.b());
            byte[] b5 = this.f3244c.f3274r.b();
            if (b5 != null) {
                l.a(this.f3244c.f3258b, b5);
            }
            l.a((Object) bVar.f2804j, true, true);
            l.a(bVar.f2804j, this.f3245d);
            bVar.k();
        }
    }

    @Override // com.aggmoread.sdk.z.a.k.a
    public void c(com.aggmoread.sdk.z.a.k.c cVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("APIEXPRESSHTAG", "onADClicked");
        b bVar = this.f2910j.get(cVar);
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // com.aggmoread.sdk.z.a.k.a
    public void d(com.aggmoread.sdk.z.a.k.c cVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("APIEXPRESSHTAG", "onADClosed");
        b bVar = this.f2910j.get(cVar);
        if (bVar != null) {
            bVar.j();
        }
        this.f2910j.remove(bVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        try {
            com.aggmoread.sdk.z.c.a.a.d.a.d.o.c.a().a(j.f3429q);
            String c5 = this.f3245d.f3309c.c(e.c.T);
            if (!TextUtils.isEmpty(c5) && c5.contains("ex_")) {
                c5 = c5.replace("ex_", "").trim();
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b("APIEXPRESSHTAG", "slot id " + c5);
            new c.b(this.f3244c.f3260d).b(this.f3244c.f3269m).a(c5).b(com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(this.f3245d)).d().a(this);
            new k(this.f3244c, this.f3245d).a(0).b();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.aggmoread.sdk.z.a.k.a
    public void onAdLoaded(List<com.aggmoread.sdk.z.a.k.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            int i4 = -1;
            for (com.aggmoread.sdk.z.a.k.c cVar : list) {
                if (q() && (cVar instanceof com.aggmoread.sdk.z.a.k.b)) {
                    i4 = ((com.aggmoread.sdk.z.a.k.b) cVar).b();
                    if (com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(this.f3245d, i4)) {
                    }
                }
                b bVar = new b(cVar, this.f3244c, this.f3245d, this.f3243b);
                arrayList.add(bVar);
                this.f2910j.put(cVar, bVar);
            }
            if (q() && arrayList.size() == 0) {
                a(i4, 0);
                return;
            }
        }
        e(arrayList);
    }
}
