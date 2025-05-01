package com.beizi.fusion.work.c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.List;
import java.util.Map;
/* compiled from: KsFullScreenVideoWorker.java */
/* loaded from: classes2.dex */
public class d extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7510n;

    /* renamed from: o  reason: collision with root package name */
    private String f7511o;

    /* renamed from: p  reason: collision with root package name */
    private long f7512p;

    /* renamed from: q  reason: collision with root package name */
    private long f7513q;

    /* renamed from: r  reason: collision with root package name */
    private KsFullScreenVideoAd f7514r;

    public d(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar) {
        this.f7510n = context;
        this.f7511o = str;
        this.f7512p = j4;
        this.f7513q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" FullScreenVideoWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            e eVar2 = this.f7372d;
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.c.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                n.a(this.f7510n, this.f7376h);
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
        sb.append(this.f7513q);
        long j4 = this.f7513q;
        if (j4 > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, j4);
            return;
        }
        e eVar = this.f7372d;
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
        if (this.f7514r == null) {
            return null;
        }
        return this.f7514r.getECPM() + "";
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        KsScene build = new KsScene.Builder(Long.parseLong(this.f7377i)).build();
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadFullScreenVideoAd(build, new KsLoadManager.FullScreenVideoAdListener() { // from class: com.beizi.fusion.work.c.d.2
            @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsFullScreenVideo Callback --> onError: code = ");
                sb.append(i4);
                sb.append(" ，message= ");
                sb.append(str);
                d.this.a(str, i4);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
            public void onFullScreenVideoAdLoad(@Nullable List<KsFullScreenVideoAd> list) {
                ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                d.this.y();
                if (list == null || list.size() == 0) {
                    d.this.c(-991);
                    return;
                }
                d.this.f7514r = list.get(0);
                if (d.this.f7514r != null) {
                    d dVar = d.this;
                    dVar.a(dVar.f7514r.getECPM());
                }
                if (d.this.Y()) {
                    d.this.aG();
                } else {
                    d.this.O();
                }
            }

            @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
            public void onFullScreenVideoResult(@Nullable List<KsFullScreenVideoAd> list) {
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        KsFullScreenVideoAd ksFullScreenVideoAd = this.f7514r;
        if (ksFullScreenVideoAd != null && ksFullScreenVideoAd.isAdEnable() && activity != null) {
            this.f7514r.setFullScreenVideoAdInteractionListener(new KsFullScreenVideoAd.FullScreenVideoAdInteractionListener() { // from class: com.beizi.fusion.work.c.d.3

                /* renamed from: a  reason: collision with root package name */
                boolean f7517a = false;

                /* renamed from: b  reason: collision with root package name */
                boolean f7518b = false;

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onAdClicked() {
                    if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) d.this).f7372d.d(d.this.g());
                    }
                    if (this.f7518b) {
                        return;
                    }
                    this.f7518b = true;
                    d.this.E();
                    d.this.ai();
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onPageDismiss() {
                    if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) d.this).f7372d.c(d.this.b());
                    }
                    d.this.G();
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onSkippedVideo() {
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onVideoPlayEnd() {
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onVideoPlayError(int i4, int i5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("showKsFullScreenVideo Callback --> onVideoPlayError: code = ");
                    sb.append(i4);
                    sb.append(" ，extra= ");
                    sb.append(i5);
                    d.this.a(String.valueOf(i5), i4);
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onVideoPlayStart() {
                    ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                    if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) d.this).f7372d.b(d.this.g());
                    }
                    if (this.f7517a) {
                        return;
                    }
                    this.f7517a = true;
                    d.this.C();
                    d.this.D();
                    d.this.ah();
                }
            });
            this.f7514r.showFullScreenVideoAd(activity, null);
            return;
        }
        e eVar = this.f7372d;
        if (eVar != null) {
            eVar.a(10140);
        }
    }
}
