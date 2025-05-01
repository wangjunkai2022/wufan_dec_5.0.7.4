package com.kwad.components.ad.reward.presenter;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.kwad.components.ad.reward.h;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class f {
    private static long sh;

    private static boolean E(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.e.k(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.e.dS(adTemplate)));
    }

    private static boolean F(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.e.F(adTemplate);
    }

    private static boolean M(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.a.aj(com.kwad.sdk.core.response.b.e.dS(adTemplate));
    }

    public static void a(final com.kwad.components.ad.reward.g gVar, boolean z4) {
        AdTemplate adTemplate = gVar.mAdTemplate;
        final AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        if (!gVar.oZ) {
            m(gVar);
            return;
        }
        o(gVar);
        boolean z5 = !gVar.fO() && M(gVar.mAdTemplate);
        if (E(adTemplate) || F(adTemplate) || gVar.pw < com.kwad.sdk.core.response.b.a.af(dS)) {
            if (z5) {
                a(gVar, new h.b() { // from class: com.kwad.components.ad.reward.presenter.f.2
                    @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
                    public final void F(boolean z6) {
                        super.F(z6);
                        if (com.kwad.components.ad.reward.a.b.k(AdInfo.this)) {
                            gVar.hq();
                        } else if (com.kwad.sdk.core.response.b.a.bT(AdInfo.this)) {
                            f.n(gVar);
                        } else {
                            f.p(gVar);
                            com.kwad.components.ad.reward.k.h(gVar);
                        }
                    }
                });
            } else if (com.kwad.sdk.core.response.b.a.bT(dS)) {
                n(gVar);
            } else {
                p(gVar);
                com.kwad.components.ad.reward.k.h(gVar);
            }
        } else if (gVar.pq) {
            gVar.hq();
        } else if (!gVar.px && gVar.pw < com.kwad.sdk.core.response.b.a.af(dS)) {
            if (z4) {
                gVar.hq();
            }
        } else {
            if (gVar.px) {
                gVar.L(2);
            } else {
                gVar.L(1);
            }
            w(gVar);
            if (com.kwad.sdk.core.response.b.a.bT(dS)) {
                n(gVar);
                return;
            }
            p(gVar);
            com.kwad.components.ad.reward.k.h(gVar);
        }
    }

    private static void m(final com.kwad.components.ad.reward.g gVar) {
        if (com.kwad.sdk.core.response.b.a.bS(com.kwad.sdk.core.response.b.e.dS(gVar.mAdTemplate))) {
            n(gVar);
        } else if (gVar.pb) {
            p(gVar);
        } else {
            gVar.pe = true;
            com.kwad.components.ad.reward.g.a(gVar.oS, new com.kwad.sdk.f.a<com.kwad.components.ad.reward.k.a>() { // from class: com.kwad.components.ad.reward.presenter.f.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.f.a
                /* renamed from: c */
                public void accept(com.kwad.components.ad.reward.k.a aVar) {
                    aVar.iM();
                }
            });
            gVar.oJ.onVideoSkipToEnd(0L);
            com.kwad.sdk.core.adlog.c.h(gVar.mAdTemplate, gVar.mReportExtData);
            com.kwad.components.ad.reward.m.e eVar = gVar.oK;
            if (eVar != null) {
                eVar.release();
            }
            gVar.fC();
            s(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(final com.kwad.components.ad.reward.g gVar) {
        bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.reward.presenter.f.3
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                com.kwad.components.ad.reward.g.this.fP();
                com.kwad.components.ad.reward.g gVar2 = com.kwad.components.ad.reward.g.this;
                gVar2.oJ.onVideoSkipToEnd(gVar2.pw);
                com.kwad.components.ad.reward.g.this.release();
                com.kwad.components.ad.reward.g.this.hq();
            }
        });
    }

    private static void o(com.kwad.components.ad.reward.g gVar) {
        long j4 = gVar.pv;
        int i4 = j4 != 0 ? (int) (j4 / 1000) : 0;
        long j5 = gVar.pw;
        com.kwad.sdk.core.adlog.c.e(gVar.mAdTemplate, gVar.mReportExtData, new com.kwad.sdk.core.adlog.c.b().cM(69).cP(i4).cQ(j5 != 0 ? (int) (j5 / 1000) : 0));
    }

    public static void p(final com.kwad.components.ad.reward.g gVar) {
        gVar.pe = true;
        gVar.fP();
        if (i.x(gVar)) {
            bo.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.f.4
                @Override // java.lang.Runnable
                public final void run() {
                    f.q(com.kwad.components.ad.reward.g.this);
                }
            }, 200L);
        } else {
            q(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(final com.kwad.components.ad.reward.g gVar) {
        com.kwad.components.ad.reward.g.a(gVar.oS, new com.kwad.sdk.f.a<com.kwad.components.ad.reward.k.a>() { // from class: com.kwad.components.ad.reward.presenter.f.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.f.a
            /* renamed from: c */
            public void accept(com.kwad.components.ad.reward.k.a aVar) {
                aVar.iM();
            }
        });
        com.kwad.components.ad.reward.m.e eVar = gVar.oK;
        if (eVar != null) {
            eVar.skipToEnd();
        }
    }

    public static void r(com.kwad.components.ad.reward.g gVar) {
        v(gVar);
        gVar.hq();
    }

    public static void s(com.kwad.components.ad.reward.g gVar) {
        com.kwad.sdk.core.e.c.d("openAppMarket", "tryOpenAppMarket");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - sh < 300) {
            com.kwad.sdk.core.e.c.d("openAppMarket", "连续点击");
            return;
        }
        sh = elapsedRealtime;
        AdTemplate adTemplate = gVar.mAdTemplate;
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        if (a(dS, "openAppMarket")) {
            return;
        }
        Context context = gVar.mContext;
        if (a("openAppMarket", adTemplate, dS)) {
            return;
        }
        com.kwad.sdk.core.adlog.c.b cW = new com.kwad.sdk.core.adlog.c.b().cK(182).cW(8);
        boolean z4 = com.kwad.sdk.core.download.a.b.E(context, com.kwad.sdk.core.response.b.a.cO(dS)) == 1;
        com.kwad.sdk.core.e.c.i("openAppMarket", "handleDeepLink dpSuccess: " + z4);
        if (z4) {
            com.kwad.components.ad.reward.j.b.a(adTemplate, "native_id", "autoLaunchMarket", cW, (JSONObject) null);
            com.kwad.components.ad.reward.h.a.G(context);
            return;
        }
        String cR = com.kwad.sdk.core.response.b.a.cR(dS);
        com.kwad.sdk.core.e.c.i("openAppMarket", "tryOpenMiAppStore url：" + cR);
        if (com.kwad.sdk.utils.d.a(context, cR, adTemplate)) {
            com.kwad.components.ad.reward.j.b.a(adTemplate, "native_id", "autoLaunchMarket", cW, (JSONObject) null);
            com.kwad.sdk.core.adlog.c.d(adTemplate, 1, 8);
            com.kwad.components.ad.reward.h.a.G(context);
        } else if (com.kwad.sdk.utils.d.h(context, adTemplate)) {
            com.kwad.components.ad.reward.j.b.a(adTemplate, "native_id", "autoLaunchMarket", cW, (JSONObject) null);
            com.kwad.sdk.core.adlog.c.d(adTemplate, 0, 8);
            com.kwad.components.ad.reward.h.a.G(context);
        } else {
            com.kwad.sdk.core.e.c.i("openAppMarket", "tryOpenMiAppStore failed");
        }
    }

    public static void t(com.kwad.components.ad.reward.g gVar) {
        AdTemplate adTemplate = gVar.mAdTemplate;
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        if (!gVar.oZ) {
            v(gVar);
            gVar.hq();
            return;
        }
        boolean z4 = true;
        if (!E(adTemplate) && !F(adTemplate)) {
            long af = com.kwad.sdk.core.response.b.a.af(dS);
            if (!gVar.px && gVar.pw < af) {
                z4 = false;
            }
            if (z4) {
                w(gVar);
            }
            v(gVar);
            gVar.hq();
            return;
        }
        o(gVar);
        if ((gVar.fO() || !M(gVar.mAdTemplate) || gVar.pe) ? false : false) {
            u(gVar);
            return;
        }
        v(gVar);
        gVar.hq();
    }

    private static void u(final com.kwad.components.ad.reward.g gVar) {
        final AdTemplate adTemplate = gVar.mAdTemplate;
        com.kwad.components.ad.reward.g.a(gVar, com.kwad.components.ad.reward.h.a(gVar, (String) null), new h.b() { // from class: com.kwad.components.ad.reward.presenter.f.6
            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
            public final void F(boolean z4) {
                com.kwad.components.ad.reward.g.this.D(false);
                if (!z4) {
                    com.kwad.sdk.core.adlog.c.p(adTemplate, 151);
                }
                f.v(com.kwad.components.ad.reward.g.this);
                com.kwad.components.ad.reward.g.this.hq();
            }

            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
            public final void fS() {
                com.kwad.components.ad.reward.g.this.D(true);
                com.kwad.sdk.core.adlog.c.b(adTemplate, 149, com.kwad.components.ad.reward.g.this.mReportExtData);
            }

            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
            public final void gb() {
                com.kwad.components.ad.reward.g.this.D(false);
                com.kwad.sdk.core.adlog.c.p(adTemplate, 150);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(com.kwad.components.ad.reward.g gVar) {
        gVar.oJ.h(false);
    }

    private static void w(com.kwad.components.ad.reward.g gVar) {
        gVar.oJ.onRewardVerify();
    }

    private static boolean a(String str, AdTemplate adTemplate, AdInfo adInfo) {
        if (com.kwad.sdk.core.response.b.a.bI(adInfo)) {
            com.kwad.sdk.core.e.c.i(str, "is playable return");
            return true;
        } else if (!com.kwad.sdk.core.response.b.a.aE(adInfo)) {
            com.kwad.sdk.core.e.c.i(str, "is not Download type");
            return true;
        } else if (com.kwad.sdk.core.response.b.e.k(adTemplate, com.kwad.components.ad.reward.a.b.k(adInfo))) {
            com.kwad.sdk.core.e.c.i(str, "isRewardLaunchAppTask");
            return true;
        } else if (com.kwad.components.ad.reward.g.g(adInfo)) {
            com.kwad.sdk.core.e.c.i(str, "is Aggregation return");
            return true;
        } else {
            return false;
        }
    }

    private static boolean a(AdInfo adInfo, String str) {
        if (!com.kwad.components.ad.reward.a.b.gC()) {
            com.kwad.sdk.core.e.c.e(str, "isEnable false");
            return true;
        } else if (TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.cR(adInfo))) {
            return true;
        } else {
            int gB = com.kwad.components.ad.reward.a.b.gB();
            com.kwad.sdk.core.e.c.d(str, "JumpDirectMaxCount " + gB);
            return gB <= 0 || com.kwad.components.ad.reward.h.a.cM() >= gB;
        }
    }

    private static void a(final com.kwad.components.ad.reward.g gVar, @NonNull final h.b bVar) {
        String str;
        final AdTemplate adTemplate = gVar.mAdTemplate;
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(adTemplate);
        final JSONObject jSONObject = gVar.mReportExtData;
        long ac = com.kwad.sdk.core.response.b.a.ac(dS);
        if (ac <= 0 || com.kwad.sdk.core.response.b.a.L(dS) <= ac) {
            str = "观看完整视频即可获取奖励";
        } else {
            str = "观看视频" + ac + "s即可获取奖励";
        }
        final h.c a5 = com.kwad.components.ad.reward.h.a(gVar, str);
        com.kwad.components.ad.reward.g.a(gVar, a5, new h.b() { // from class: com.kwad.components.ad.reward.presenter.f.7
            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
            public final void F(boolean z4) {
                com.kwad.components.ad.reward.g.this.D(false);
                if (!z4) {
                    com.kwad.sdk.core.adlog.c.p(adTemplate, 151);
                }
                h.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.F(z4);
                }
            }

            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
            public final void fS() {
                com.kwad.components.ad.reward.m.e eVar = com.kwad.components.ad.reward.g.this.oK;
                if (eVar != null) {
                    eVar.pause();
                }
                com.kwad.components.ad.reward.g.this.D(true);
                if (a5.getStyle() == 0) {
                    com.kwad.sdk.core.adlog.c.i(adTemplate, jSONObject);
                } else {
                    com.kwad.sdk.core.adlog.c.b(adTemplate, 149, jSONObject);
                }
            }

            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.ad.reward.h.a
            public final void fZ() {
                super.fZ();
                com.kwad.sdk.core.adlog.c.p(adTemplate, 150);
                com.kwad.components.ad.reward.g gVar2 = com.kwad.components.ad.reward.g.this;
                gVar2.a(1, gVar2.mContext, 156, 1);
            }

            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.ad.reward.h.a
            public final void g(int i4, int i5) {
                super.g(i4, i5);
                com.kwad.components.ad.reward.g gVar2 = com.kwad.components.ad.reward.g.this;
                gVar2.a(1, gVar2.mContext, i4, i5);
            }

            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
            public final void ga() {
                super.ga();
                com.kwad.components.ad.reward.g.this.D(false);
            }

            @Override // com.kwad.components.ad.reward.h.b, com.kwad.components.core.webview.tachikoma.e.c
            public final void gb() {
                com.kwad.components.ad.reward.g.this.D(false);
                com.kwad.components.ad.reward.m.e eVar = com.kwad.components.ad.reward.g.this.oK;
                if (eVar != null) {
                    eVar.resume();
                }
                if (a5.getStyle() != 1 && a5.getStyle() != 2 && a5.getStyle() != 5 && a5.getStyle() != 8) {
                    com.kwad.sdk.core.adlog.c.j(adTemplate, jSONObject);
                } else {
                    com.kwad.sdk.core.adlog.c.p(adTemplate, 150);
                }
            }
        });
    }
}
