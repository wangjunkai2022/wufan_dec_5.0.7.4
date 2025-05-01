package com.beizi.fusion.work.nativead;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.List;
import java.util.Map;
/* compiled from: KsNativeAdWorker.java */
/* loaded from: classes2.dex */
public class i extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7918n;

    /* renamed from: o  reason: collision with root package name */
    private String f7919o;

    /* renamed from: p  reason: collision with root package name */
    private long f7920p;

    /* renamed from: q  reason: collision with root package name */
    private long f7921q;

    /* renamed from: r  reason: collision with root package name */
    private KsFeedAd f7922r;

    /* renamed from: s  reason: collision with root package name */
    private float f7923s;

    /* renamed from: t  reason: collision with root package name */
    private float f7924t;

    /* renamed from: u  reason: collision with root package name */
    private View f7925u;

    public i(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, float f5, float f6) {
        this.f7918n = context;
        this.f7919o = str;
        this.f7920p = j4;
        this.f7921q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7923s = f5;
        this.f7924t = f6;
        r();
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "KUAISHOU";
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.nativead.i.1
                        @Override // java.lang.Runnable
                        public void run() {
                            i.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                n.a(this.f7918n, this.f7376h);
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
        sb.append(this.f7921q);
        long j4 = this.f7921q;
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
        if (this.f7922r == null) {
            return null;
        }
        return this.f7922r.getECPM() + "";
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        if (this.f7923s <= 0.0f) {
            this.f7923s = av.j(this.f7918n);
        }
        KsScene build = new KsScene.Builder(Long.parseLong(this.f7377i)).width(av.a(this.f7918n, this.f7923s)).adNum(1).build();
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadConfigFeedAd(build, new KsLoadManager.FeedAdListener() { // from class: com.beizi.fusion.work.nativead.i.2
            @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsNativeAd Callback --> onError: code = ");
                sb.append(i4);
                sb.append(" ，message= ");
                sb.append(str);
                i.this.a(str, i4);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
            public void onFeedAdLoad(@Nullable List<KsFeedAd> list) {
                ((com.beizi.fusion.work.a) i.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                i.this.y();
                if (list == null || list.size() == 0) {
                    i.this.c(-991);
                    return;
                }
                i.this.a(list);
                if (i.this.Y()) {
                    i.this.b();
                } else {
                    i.this.O();
                }
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7925u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" NativeAdWorkers:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            if (this.f7922r != null && this.f7925u != null) {
                this.f7372d.a(g(), this.f7925u);
            } else {
                this.f7372d.a(10140);
            }
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<KsFeedAd> list) {
        KsFeedAd ksFeedAd = list.get(0);
        this.f7922r = ksFeedAd;
        if (ksFeedAd == null) {
            return;
        }
        a(ksFeedAd.getECPM());
        this.f7922r.setVideoPlayConfig(new KsAdVideoPlayConfig.Builder().videoSoundEnable(false).dataFlowAutoStart(false).build());
        this.f7922r.setAdInteractionListener(new KsFeedAd.AdInteractionListener() { // from class: com.beizi.fusion.work.nativead.i.3

            /* renamed from: a  reason: collision with root package name */
            boolean f7928a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7929b = false;

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onAdClicked() {
                if (((com.beizi.fusion.work.a) i.this).f7372d != null && ((com.beizi.fusion.work.a) i.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) i.this).f7372d.d(i.this.g());
                }
                if (this.f7929b) {
                    return;
                }
                this.f7929b = true;
                i.this.E();
                i.this.ai();
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onAdShow() {
                ((com.beizi.fusion.work.a) i.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) i.this).f7372d != null && ((com.beizi.fusion.work.a) i.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) i.this).f7372d.b(i.this.g());
                }
                if (this.f7928a) {
                    return;
                }
                this.f7928a = true;
                i.this.C();
                i.this.D();
                i.this.ah();
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDislikeClicked() {
                if (((com.beizi.fusion.work.a) i.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) i.this).f7372d.b(i.this.g(), i.this.f7925u);
                }
                i.this.G();
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDownloadTipsDialogShow() {
            }
        });
        this.f7925u = this.f7922r.getFeedView(this.f7918n);
    }
}
