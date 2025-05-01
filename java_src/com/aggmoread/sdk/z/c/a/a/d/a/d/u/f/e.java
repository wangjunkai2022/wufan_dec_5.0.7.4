package com.aggmoread.sdk.z.c.a.a.d.a.d.u.f;

import androidx.annotation.Nullable;
import com.aggmoread.sdk.z.c.a.a.d.a.d.k;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class e extends k implements KsLoadManager.NativeAdListener {

    /* renamed from: j  reason: collision with root package name */
    private static String f3200j = "AMUTAGKS";

    public e(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.k
    protected void a(Object obj, int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(obj, i5);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.k
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
            String str = f3200j;
            com.aggmoread.sdk.z.c.a.a.e.e.b(str, "slotId = " + c5 + ",slotIdStr = " + trim + ",_slotId = " + parseLong);
            KsAdSDK.getLoadManager().loadNativeAd(new KsScene.Builder(parseLong).adNum(i4).build(), this);
            com.aggmoread.sdk.z.c.a.a.e.e.b(f3200j, "load ad");
            new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(0).b();
        } catch (Exception unused) {
            b(new i(1001002008, "广告ID配置错误，广告加载失败！"));
        }
    }

    @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
    public void onError(int i4, String str) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f3200j, "onAdError %s,%s", Integer.valueOf(i4), str);
        b(new i(i4, str));
    }

    @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
    public void onNativeAdLoad(@Nullable List<KsNativeAd> list) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f3200j, "ad loaded");
        boolean a5 = this.f3244c.a("com.sdk.key.ESP", 16);
        List<com.aggmoread.sdk.z.c.a.a.c.o.e> arrayList = new ArrayList<>();
        if (list != null && list.size() > 0) {
            int i4 = -1;
            for (KsNativeAd ksNativeAd : list) {
                int a6 = com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(ksNativeAd);
                if (q() && com.aggmoread.sdk.z.c.a.a.d.a.d.u.b.a(this.f3245d, a6)) {
                    a(ksNativeAd, 0);
                } else {
                    b(ksNativeAd, a6);
                    arrayList.add(a5 ? new a(ksNativeAd, this.f3244c, this.f3245d, this.f3243b) : new d(ksNativeAd, this.f3244c, this.f3245d, this.f3243b));
                }
                i4 = a6;
            }
            if (q() && arrayList.size() == 0) {
                a(i4, 0);
                return;
            }
        }
        e(arrayList);
    }
}
