package com.aggmoread.sdk.z.c.a.a.d.a.d.o.e;

import android.text.TextUtils;
import com.aggmoread.sdk.z.a.h.c;
import com.aggmoread.sdk.z.c.a.a.d.a.d.k;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class c extends k implements com.aggmoread.sdk.z.a.l.a {
    public c(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, e eVar) {
        super(dVar, eVar);
    }

    @Override // com.aggmoread.sdk.z.a.l.a, com.aggmoread.sdk.z.a.i.b
    public void a(com.aggmoread.sdk.z.a.g.e eVar) {
        b(new i(eVar.a(), eVar.b()));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        try {
            com.aggmoread.sdk.z.c.a.a.d.a.d.o.c.a().a(j.f3429q);
            String c5 = this.f3245d.f3309c.c(e.c.T);
            if (!TextUtils.isEmpty(c5) && c5.contains("nv_")) {
                c5 = c5.replace("nv_", "").trim();
            }
            new c.b(this.f3244c.f3260d).b(this.f3244c.f3269m).a(c5).b(com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(this.f3245d)).d().a(this);
            new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(0).b();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.aggmoread.sdk.z.a.l.a
    public void onAdLoaded(List<com.aggmoread.sdk.z.a.l.c> list) {
        ArrayList arrayList = new ArrayList();
        int i4 = -1;
        for (com.aggmoread.sdk.z.a.l.c cVar : list) {
            if (q() && (cVar instanceof com.aggmoread.sdk.z.a.l.d)) {
                i4 = ((com.aggmoread.sdk.z.a.l.d) cVar).e();
                if (com.aggmoread.sdk.z.c.a.a.d.a.d.o.b.a(this.f3245d, i4)) {
                }
            }
            arrayList.add(new d(cVar, this.f3244c, this.f3245d, this.f3243b));
        }
        if (q() && arrayList.size() == 0) {
            a(i4, 0);
        } else {
            e(arrayList);
        }
    }
}
