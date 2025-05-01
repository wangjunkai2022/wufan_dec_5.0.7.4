package com.beizi.fusion.work.g;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsScene;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: KsRewardVideoWorker.java */
/* loaded from: classes2.dex */
public class e extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7622n;

    /* renamed from: o  reason: collision with root package name */
    private String f7623o;

    /* renamed from: p  reason: collision with root package name */
    private long f7624p;

    /* renamed from: q  reason: collision with root package name */
    private long f7625q;

    /* renamed from: r  reason: collision with root package name */
    private KsRewardVideoAd f7626r;

    /* renamed from: s  reason: collision with root package name */
    private String f7627s;

    /* renamed from: t  reason: collision with root package name */
    private String f7628t;

    public e(Context context, String str, String str2, String str3, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7622n = context;
        this.f7623o = str;
        this.f7624p = j4;
        this.f7625q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7627s = str2;
        this.f7628t = str3;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" RewardVideoWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            com.beizi.fusion.d.e eVar2 = this.f7372d;
            if (eVar2 != null) {
                eVar2.a(g(), (View) null);
            }
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    public String b() {
        return "1019";
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "KUAISHOU";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.kwad.sdk.api.KsAdSDK")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.g.e.1
                        @Override // java.lang.Runnable
                        public void run() {
                            e.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                n.a(this.f7622n, this.f7376h);
                this.f7370b.u(KsAdSDK.getSDKVersion());
                au();
                v();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7625q);
        long j4 = this.f7625q;
        if (j4 > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, j4);
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null || eVar.s() >= 1 || this.f7372d.r() == 2) {
            return;
        }
        l();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        if (this.f7626r == null) {
            return null;
        }
        return this.f7626r.getECPM() + "";
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        KsScene.Builder builder = new KsScene.Builder(Long.parseLong(this.f7377i));
        HashMap hashMap = new HashMap();
        hashMap.put("thirdUserId", this.f7627s);
        hashMap.put("extraData", this.f7628t);
        builder.rewardCallbackExtraData(hashMap);
        KsScene build = builder.build();
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadRewardVideoAd(build, new KsLoadManager.RewardVideoAdListener() { // from class: com.beizi.fusion.work.g.e.2
            @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsRewardedVideo Callback --> onError: code = ");
                sb.append(i4);
                sb.append(" ，message= ");
                sb.append(str);
                e.this.a(str, i4);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
            public void onRewardVideoAdLoad(@Nullable List<KsRewardVideoAd> list) {
                ((com.beizi.fusion.work.a) e.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                e.this.y();
                if (list == null || list.size() == 0) {
                    e.this.c(-991);
                    return;
                }
                e.this.f7626r = list.get(0);
                if (e.this.f7626r != null) {
                    e eVar = e.this;
                    eVar.a(eVar.f7626r.getECPM());
                }
                if (e.this.Y()) {
                    e.this.aG();
                } else {
                    e.this.O();
                }
            }

            @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
            public void onRewardVideoResult(@Nullable List<KsRewardVideoAd> list) {
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        KsRewardVideoAd ksRewardVideoAd = this.f7626r;
        if (ksRewardVideoAd != null && ksRewardVideoAd.isAdEnable() && activity != null) {
            this.f7626r.setRewardAdInteractionListener(new KsRewardVideoAd.RewardAdInteractionListener() { // from class: com.beizi.fusion.work.g.e.3

                /* renamed from: a  reason: collision with root package name */
                boolean f7631a = false;

                /* renamed from: b  reason: collision with root package name */
                boolean f7632b = false;

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onAdClicked() {
                    if (((com.beizi.fusion.work.a) e.this).f7372d != null && ((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) e.this).f7372d.d(e.this.g());
                    }
                    if (this.f7632b) {
                        return;
                    }
                    this.f7632b = true;
                    e.this.E();
                    e.this.ai();
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onExtraRewardVerify(int i4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("showKsRewardedVideo Callback --> onExtraRewardVerify()i:");
                    sb.append(i4);
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onPageDismiss() {
                    if (((com.beizi.fusion.work.a) e.this).f7372d != null && ((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) e.this).f7372d.c(e.this.b());
                    }
                    e.this.G();
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onRewardStepVerify(int i4, int i5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("showKsRewardedVideo Callback --> onRewardStepVerify()i:");
                    sb.append(i4);
                    sb.append(" i1:");
                    sb.append(i5);
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onRewardVerify() {
                    if (((com.beizi.fusion.work.a) e.this).f7372d != null) {
                        e.this.J();
                        ((com.beizi.fusion.work.a) e.this).f7372d.k();
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoPlayEnd() {
                    if (((com.beizi.fusion.work.a) e.this).f7372d != null) {
                        ((com.beizi.fusion.work.a) e.this).f7372d.l();
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoPlayError(int i4, int i5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("showKsRewardedVideo Callback --> onVideoPlayError: code = ");
                    sb.append(i4);
                    sb.append(" ，extra= ");
                    sb.append(i5);
                    e.this.a(String.valueOf(i5), i4);
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoPlayStart() {
                    ((com.beizi.fusion.work.a) e.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                    if (((com.beizi.fusion.work.a) e.this).f7372d != null && ((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) e.this).f7372d.b(e.this.g());
                    }
                    if (this.f7631a) {
                        return;
                    }
                    this.f7631a = true;
                    e.this.C();
                    e.this.D();
                    e.this.ah();
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoSkipToEnd(long j4) {
                }
            });
            this.f7626r.showRewardVideoAd(activity, null);
            return;
        }
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null) {
            eVar.a(10140);
        }
    }
}
