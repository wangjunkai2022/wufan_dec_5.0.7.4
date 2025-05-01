package com.aggmoread.sdk.z.c.a.a.d.a.d.u.e;

import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.c.h;
import com.aggmoread.sdk.z.c.a.a.d.a.d.e;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class a extends e implements KsLoadManager.DrawAdListener {

    /* renamed from: j  reason: collision with root package name */
    private static String f3174j = "AMDRAWTAGKS";

    public a(d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.e
    protected void a(Object obj, int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(obj, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.e
    protected void c(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.b(obj, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        if (!com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3244c.f3260d, this.f3245d.f3309c.a(e.c.X, ""))) {
            b(new i(1001002008, "广告加载失败！"));
            return;
        }
        int i4 = this.f3244c.f3269m;
        if (i4 < 1) {
            i4 = 1;
        }
        this.f3243b.put(MediationConstant.KEY_ECPM, this.f3245d.f3308b.a(e.c.f3330f, "-1"));
        try {
            String c5 = this.f3245d.f3309c.c(e.c.T);
            String trim = c5.replace("L", "").trim();
            long parseLong = Long.parseLong(trim);
            String str = f3174j;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "slotId = " + c5 + ",slotIdStr = " + trim + ",_slotId = " + parseLong);
            KsScene.Builder builder = new KsScene.Builder(parseLong);
            builder.adNum(Math.min(i4, 5));
            h hVar = this.f3244c.f3273q;
            if (hVar != null) {
                if (hVar.b() > 0) {
                    builder.width(hVar.b());
                }
                if (hVar.a() > 0) {
                    builder.height(hVar.a());
                }
            }
            KsAdSDK.getLoadManager().loadDrawAd(builder.build(), this);
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3174j, "load ad");
            new k(this.f3244c, this.f3245d).a(0).b();
        } catch (Exception unused) {
            b(new i(1001002008, "广告ID配置错误，广告加载失败！"));
        }
    }

    @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
    public void onDrawAdLoad(@Nullable List<KsDrawAd> list) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3174j, "ad loaded");
        List<com.aggmoread.sdk.z.c.a.a.c.n.a> arrayList = new ArrayList<>();
        if (list != null && list.size() > 0) {
            int i4 = -1;
            for (KsDrawAd ksDrawAd : list) {
                int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a((Object) ksDrawAd);
                if (q() && com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3245d, a5)) {
                    a(ksDrawAd, 0);
                } else {
                    b(ksDrawAd, com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a((Object) ksDrawAd));
                    arrayList.add(new b(ksDrawAd, this.f3244c, this.f3245d, this.f3243b));
                }
                i4 = a5;
            }
            String str = f3174j;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "ad loaded size " + arrayList.size());
            if (q() && arrayList.size() == 0) {
                a(i4, 0);
                return;
            }
        }
        e(arrayList);
    }

    @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
    public void onError(int i4, String str) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f3174j, "onAdError %s,%s", Integer.valueOf(i4), str);
        b(new i(i4, str));
    }
}
