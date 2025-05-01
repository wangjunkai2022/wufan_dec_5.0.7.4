package com.aggmoread.sdk.z.c.a.a.d.a.d.s.c;

import com.aggmoread.sdk.z.a.l.c;
import com.aggmoread.sdk.z.b.b.a;
import com.aggmoread.sdk.z.c.a.a.d.a.d.k;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.j;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class a extends k implements com.aggmoread.sdk.z.a.l.a {
    public a(d dVar, e eVar) {
        super(dVar, eVar);
    }

    @Override // com.aggmoread.sdk.z.a.l.a, com.aggmoread.sdk.z.a.i.b
    public void a(com.aggmoread.sdk.z.a.g.e eVar) {
        b(new i(eVar.a(), eVar.b()));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        try {
            com.aggmoread.sdk.z.c.a.a.d.a.d.s.b.a().a(j.f3429q);
            new a.b(this.f3244c.f3260d).b(this.f3244c.f3269m).a(this.f3245d.f3309c.c(e.c.T)).d().a(this);
            new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(0).b();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.aggmoread.sdk.z.a.l.a
    public void onAdLoaded(List<c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (c cVar : list) {
                arrayList.add(new b(cVar, this.f3244c, this.f3245d, this.f3243b));
            }
        }
        e(arrayList);
    }
}
