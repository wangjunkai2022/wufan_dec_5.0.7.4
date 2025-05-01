package com.aggmoread.sdk.z.c.a.a.d.a.d.t.g;

import com.aggmoread.sdk.z.c.a.a.d.a.d.k;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.d;
import com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.g;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class f extends k implements g.a {

    /* renamed from: k  reason: collision with root package name */
    private static String f3133k = "AMUTAGGDT";

    /* renamed from: j  reason: collision with root package name */
    public NativeUnifiedAD f3134j;

    public f(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
    }

    private void r() {
        this.f3134j = (NativeUnifiedAD) com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(this.f3244c.f3260d, this.f3245d.f3309c.a(e.c.X, ""), this.f3245d.f3309c.a(e.c.T, ""), d.e.UNIFIED, this.f3247f, new g(this).a(), new Object[0]);
        int i4 = this.f3244c.f3269m;
        int i5 = 1;
        if (i4 < 1) {
            i4 = 1;
        }
        int a5 = this.f3245d.f3310d.a(e.c.f3349w, 0);
        if (a5 > 0) {
            if (a5 > 1) {
                l.a(this.f3244c, 9);
            }
            l.a(this.f3244c, this.f3245d);
        } else {
            i5 = i4;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3133k, "load ad");
        com.aggmoread.sdk.z.c.a.a.c.t.b bVar = this.f3244c.f3275s;
        if (bVar != null) {
            if (bVar.c() >= 5 && bVar.c() <= 61) {
                this.f3134j.setMinVideoDuration(bVar.c());
            }
            if (bVar.b() >= 5 && bVar.b() <= 61) {
                this.f3134j.setMaxVideoDuration(bVar.b());
            }
        }
        this.f3134j.loadData(i5);
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(0).b();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.k
    protected void a(Object obj, int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(obj, i5, i4, null);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.g.a
    public void b(List<NativeUnifiedADData> list) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3133k, "ad loaded");
        int b5 = l.b(this.f3244c);
        i();
        if (b5 == 9) {
            b(new i(1001006000, "GDT ad blocked"));
            return;
        }
        boolean a5 = this.f3244c.a("com.sdk.key.ESP", 16);
        List<com.aggmoread.sdk.z.c.a.a.c.o.e> arrayList = new ArrayList<>();
        if (list != null && list.size() > 0) {
            boolean q4 = q();
            boolean o4 = o();
            int i4 = -1;
            for (NativeUnifiedADData nativeUnifiedADData : list) {
                int a6 = com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(nativeUnifiedADData);
                if (o4) {
                    if (q4 && com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f3245d, nativeUnifiedADData)) {
                        a(nativeUnifiedADData, 0);
                        i4 = a6;
                    } else {
                        b(nativeUnifiedADData, a6);
                    }
                }
                arrayList.add(a5 ? new a(nativeUnifiedADData, this.f3134j, this.f3244c, this.f3245d, this.f3243b, b5) : new e(nativeUnifiedADData, this.f3134j, this.f3244c, this.f3245d, this.f3243b, b5));
                i4 = a6;
            }
            if (q4 && arrayList.size() == 0) {
                a(i4, 0);
                return;
            }
        }
        e(arrayList);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.k
    protected void c(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.d.a(obj, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        com.aggmoread.sdk.z.c.a.a.d.a.d.t.b.a(this.f3244c.f3260d, this.f3245d.f3309c.a(e.c.X, ""));
        r();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.t.g.g.a
    public void onNoAD(AdError adError) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f3133k, "onAdError %s", adError);
        b(new i(adError.getErrorCode(), adError.getErrorMsg()));
    }
}
