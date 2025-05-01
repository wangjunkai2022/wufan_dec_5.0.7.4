package com.beizi.fusion.work.nativead;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.baidu.mobads.sdk.api.AdSettings;
import com.baidu.mobads.sdk.api.BaiduNativeManager;
import com.baidu.mobads.sdk.api.ExpressResponse;
import com.baidu.mobads.sdk.api.RequestParameters;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.List;
import java.util.Map;
/* compiled from: BaiduNativeAdWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7779n;

    /* renamed from: o  reason: collision with root package name */
    private String f7780o;

    /* renamed from: p  reason: collision with root package name */
    private long f7781p;

    /* renamed from: q  reason: collision with root package name */
    private long f7782q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7783r;

    /* renamed from: s  reason: collision with root package name */
    private BaiduNativeManager f7784s;

    /* renamed from: t  reason: collision with root package name */
    private ExpressResponse f7785t;

    /* renamed from: u  reason: collision with root package name */
    private float f7786u;

    /* renamed from: v  reason: collision with root package name */
    private float f7787v;

    /* renamed from: w  reason: collision with root package name */
    private View f7788w;

    public a(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, float f5, float f6) {
        this.f7779n = context;
        this.f7780o = str;
        this.f7781p = j4;
        this.f7782q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7786u = f5;
        this.f7787v = f6;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        ExpressResponse expressResponse = this.f7785t;
        if (expressResponse != null) {
            expressResponse.setInteractionListener(new ExpressResponse.ExpressInteractionListener() { // from class: com.beizi.fusion.work.nativead.a.3

                /* renamed from: a  reason: collision with root package name */
                boolean f7791a = false;

                /* renamed from: b  reason: collision with root package name */
                boolean f7792b = false;

                public void onAdClick() {
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                    }
                    if (this.f7792b) {
                        return;
                    }
                    this.f7792b = true;
                    a.this.E();
                    a.this.ai();
                }

                public void onAdExposed() {
                    ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) a.this).f7372d.b(a.this.g());
                    }
                    if (this.f7791a) {
                        return;
                    }
                    this.f7791a = true;
                    a.this.az();
                    a.this.C();
                    a.this.D();
                    a.this.ah();
                }

                public void onAdRenderFail(View view, String str, int i4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("showBdNativeAd Callback --> onAdRenderFail() error:");
                    sb.append(str);
                    sb.append(";code:");
                    sb.append(i4);
                    a.this.a(str, i4);
                }

                public void onAdRenderSuccess(View view, float f5, float f6) {
                    a aVar = a.this;
                    aVar.f7788w = aVar.f7785t.getExpressAdView();
                    if (a.this.Y()) {
                        a.this.b();
                    } else {
                        a.this.O();
                    }
                }

                public void onAdUnionClick() {
                }
            });
            this.f7785t.setAdPrivacyListener(new ExpressResponse.ExpressAdDownloadWindowListener() { // from class: com.beizi.fusion.work.nativead.a.4
                public void adDownloadWindowClose() {
                }

                public void adDownloadWindowShow() {
                }

                public void onADFunctionClick() {
                }

                public void onADPermissionClose() {
                }

                public void onADPermissionShow() {
                }

                public void onADPrivacyClick() {
                }
            });
            this.f7785t.setAdDislikeListener(new ExpressResponse.ExpressDislikeListener() { // from class: com.beizi.fusion.work.nativead.a.5
                public void onDislikeItemClick(String str) {
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) a.this).f7372d.b(a.this.g(), a.this.f7788w);
                    }
                    a.this.G();
                }

                public void onDislikeWindowClose() {
                }

                public void onDislikeWindowShow() {
                }
            });
        }
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7785t == null) {
            return;
        }
        al();
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        ExpressResponse expressResponse;
        if (!an() || (expressResponse = this.f7785t) == null || TextUtils.isEmpty(expressResponse.getECPMLevel()) || this.f7783r) {
            return;
        }
        this.f7783r = true;
        af.a("BeiZis", "showBdNativeAd channel == Baidu竞价成功");
        af.a("BeiZis", "showBdNativeAd channel == sendWinNoticeECPM:" + this.f7785t.getECPMLevel());
        ExpressResponse expressResponse2 = this.f7785t;
        expressResponse2.biddingSuccess(expressResponse2.getECPMLevel());
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "BAIDU";
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
                if (!av.a("com.baidu.mobads.sdk.api.BDAdConfig")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.nativead.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                this.f7370b.v(String.valueOf(AdSettings.getSDKVersion()));
                au();
                com.beizi.fusion.d.f.a(this.f7779n, this.f7376h);
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
        sb.append(this.f7782q);
        long j4 = this.f7782q;
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
        if (an() && this.f7785t != null) {
            return this.f7785t.getECPMLevel() + "";
        }
        return null;
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        BaiduNativeManager baiduNativeManager = new BaiduNativeManager(this.f7779n.getApplicationContext(), this.f7377i);
        this.f7784s = baiduNativeManager;
        baiduNativeManager.loadExpressAd((RequestParameters) null, new BaiduNativeManager.ExpressAdListener() { // from class: com.beizi.fusion.work.nativead.a.2
            public void onLpClosed() {
            }

            public void onNativeFail(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBdNativeAd Callback --> onNativeFail() code:");
                sb.append(i4);
                sb.append(" message:");
                sb.append(str);
                a.this.a(str, i4);
            }

            public void onNativeLoad(List<ExpressResponse> list) {
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                a.this.y();
                if (list == null || list.size() == 0) {
                    a.this.c(-991);
                    return;
                }
                a.this.f7785t = list.get(0);
                try {
                    if (a.this.f7785t != null && !TextUtils.isEmpty(a.this.f7785t.getECPMLevel())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("showBdNativeAd getECPMLevel:");
                        sb.append(a.this.f7785t.getECPMLevel());
                        a aVar = a.this;
                        aVar.a(Double.parseDouble(aVar.f7785t.getECPMLevel()));
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                a.this.aG();
                a.this.f7785t.render();
            }

            public void onNoAd(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBdNativeAd  Callback --> onNoAd() code:");
                sb.append(i4);
                sb.append(" message:");
                sb.append(str);
                a.this.a(str, i4);
            }

            public void onVideoDownloadFailed() {
            }

            public void onVideoDownloadSuccess() {
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7788w;
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
            if (this.f7785t != null && this.f7788w != null) {
                this.f7372d.a(g(), this.f7788w);
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

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        ExpressResponse expressResponse = this.f7785t;
        if (expressResponse == null || TextUtils.isEmpty(expressResponse.getECPMLevel()) || this.f7783r) {
            return;
        }
        this.f7783r = true;
        af.a("BeiZis", "showBdNativeAd channel == Baidu竞价失败:" + i4);
        this.f7785t.biddingFail(i4 != 1 ? i4 != 2 ? "900" : "100" : "203");
    }
}
