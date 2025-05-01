package com.beizi.fusion.work.b;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.beizi.fusion.b.d;
import com.beizi.fusion.d.c;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.List;
import java.util.Map;
/* compiled from: KsDrawAdWorker.java */
/* loaded from: classes2.dex */
public class b extends com.beizi.fusion.work.a implements c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7468n;

    /* renamed from: o  reason: collision with root package name */
    private String f7469o;

    /* renamed from: p  reason: collision with root package name */
    private long f7470p;

    /* renamed from: q  reason: collision with root package name */
    private long f7471q;

    /* renamed from: r  reason: collision with root package name */
    private View f7472r;

    public b(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar) {
        this.f7468n = context;
        this.f7469o = str;
        this.f7470p = j4;
        this.f7471q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
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
        d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.kwad.sdk.api.KsAdSDK")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.b.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                n.a(this.f7468n, this.f7376h);
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
        sb.append(this.f7471q);
        long j4 = this.f7471q;
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
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        KsScene build = new KsScene.Builder(Long.parseLong(this.f7377i)).adNum(1).build();
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadDrawAd(build, new KsLoadManager.DrawAdListener() { // from class: com.beizi.fusion.work.b.b.2
            @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
            public void onDrawAdLoad(@Nullable List<KsDrawAd> list) {
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                b.this.y();
                if (list == null || list.size() == 0) {
                    b.this.c(-991);
                    return;
                }
                b.this.a(list);
                if (b.this.Y()) {
                    b.this.b();
                } else {
                    b.this.O();
                }
            }

            @Override // com.kwad.sdk.api.KsLoadManager.DrawAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsDrawAd Callback --> onError code=");
                sb.append(i4);
                sb.append(" , message=");
                sb.append(str);
                b.this.a(str, i4);
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7472r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" DrawAdWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            if (this.f7472r != null) {
                this.f7372d.a(g(), this.f7472r);
            } else {
                this.f7372d.a(10140);
            }
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<KsDrawAd> list) {
        KsDrawAd ksDrawAd = list.get(0);
        if (ksDrawAd == null) {
            return;
        }
        a(ksDrawAd.getECPM());
        ksDrawAd.setAdInteractionListener(new KsDrawAd.AdInteractionListener() { // from class: com.beizi.fusion.work.b.b.3

            /* renamed from: a  reason: collision with root package name */
            boolean f7475a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f7476b = false;

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onAdClicked() {
                if (((com.beizi.fusion.work.a) b.this).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) b.this).f7372d.d(b.this.g());
                }
                if (this.f7476b) {
                    return;
                }
                this.f7476b = true;
                b.this.E();
                b.this.ai();
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onAdShow() {
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) b.this).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) b.this).f7372d.b(b.this.g());
                }
                if (this.f7475a) {
                    return;
                }
                this.f7475a = true;
                b.this.C();
                b.this.D();
                b.this.ah();
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayEnd() {
                if (((com.beizi.fusion.work.a) b.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) b.this).f7372d.l();
                }
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayError() {
                b.this.a("sdk custom error ".concat("onVideoPlayError"), 99991);
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayPause() {
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayResume() {
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayStart() {
            }
        });
        this.f7472r = ksDrawAd.getDrawView(this.f7468n);
    }
}
