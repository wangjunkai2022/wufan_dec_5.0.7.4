package com.beizi.fusion.work.c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.Map;
/* compiled from: GdtFullScreenVideoWorker.java */
/* loaded from: classes2.dex */
public class c extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7500n;

    /* renamed from: o  reason: collision with root package name */
    private String f7501o;

    /* renamed from: p  reason: collision with root package name */
    private long f7502p;

    /* renamed from: q  reason: collision with root package name */
    private long f7503q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7504r;

    /* renamed from: s  reason: collision with root package name */
    private UnifiedInterstitialAD f7505s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GdtFullScreenVideoWorker.java */
    /* loaded from: classes2.dex */
    public class a implements UnifiedInterstitialADListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f7507a;

        /* renamed from: b  reason: collision with root package name */
        boolean f7508b;

        private a() {
            this.f7507a = false;
            this.f7508b = false;
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADClicked() {
            if (((com.beizi.fusion.work.a) c.this).f7372d != null && ((com.beizi.fusion.work.a) c.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) c.this).f7372d.d(c.this.g());
            }
            if (this.f7508b) {
                return;
            }
            this.f7508b = true;
            c.this.E();
            c.this.ai();
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADClosed() {
            if (((com.beizi.fusion.work.a) c.this).f7372d != null && ((com.beizi.fusion.work.a) c.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) c.this).f7372d.c(c.this.g());
            }
            c.this.G();
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADExposure() {
            ((com.beizi.fusion.work.a) c.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
            if (((com.beizi.fusion.work.a) c.this).f7372d != null && ((com.beizi.fusion.work.a) c.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) c.this).f7372d.b(c.this.g());
            }
            if (this.f7507a) {
                return;
            }
            this.f7507a = true;
            c.this.az();
            c.this.C();
            c.this.D();
            c.this.ah();
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADLeftApplication() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADOpened() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADReceive() {
            if (c.this.f7505s.getECPM() > 0) {
                c cVar = c.this;
                cVar.a(cVar.f7505s.getECPM());
            }
            if (v.f7025a) {
                c.this.f7505s.setDownloadConfirmListener(v.f7026b);
            }
            ((com.beizi.fusion.work.a) c.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            c.this.y();
            if (c.this.Y()) {
                c.this.b();
            } else {
                c.this.O();
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("showGdtFullScreenVideo onError:");
            sb.append(adError.getErrorMsg());
            c.this.a(adError.getErrorMsg(), adError.getErrorCode());
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderFail() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderSuccess() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onVideoCached() {
        }
    }

    public c(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar) {
        this.f7500n = context;
        this.f7501o = str;
        this.f7502p = j4;
        this.f7503q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        r();
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7505s == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f7505s.getECPMLevel());
        if (a5 == -1 || a5 == -2) {
            if (a5 == -2) {
                L();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdt realPrice = ");
        sb.append(a5);
        a(a5);
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f7505s;
        if (unifiedInterstitialAD == null || unifiedInterstitialAD.getECPM() <= 0 || this.f7504r) {
            return;
        }
        this.f7504r = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f7505s.getECPM());
        UnifiedInterstitialAD unifiedInterstitialAD2 = this.f7505s;
        k.a(unifiedInterstitialAD2, unifiedInterstitialAD2.getECPM());
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "GDT";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.qq.e.comm.managers.GDTAdSdk")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.c.c.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                k.a(this.f7500n, this.f7376h);
                this.f7370b.s(SDKStatus.getIntegrationSDKVersion());
                au();
                v();
            }
        }
        v.f7025a = !n.a(this.f7373e.getDirectDownload());
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7503q);
        long j4 = this.f7503q;
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
        UnifiedInterstitialAD unifiedInterstitialAD = this.f7505s;
        if (unifiedInterstitialAD != null) {
            int a5 = ak.a(this.f7373e.getPriceDict(), unifiedInterstitialAD.getECPMLevel());
            if (a5 == -1 || a5 == -2) {
                return null;
            }
            return a5 + "";
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
        Activity activity = (Activity) this.f7500n;
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f7505s = new UnifiedInterstitialAD(activity, this.f7377i, new a(), null, aC());
        } else {
            this.f7505s = new UnifiedInterstitialAD(activity, this.f7377i, new a());
        }
        this.f7505s.setVideoOption(new VideoOption.Builder().setAutoPlayMuted(true).build());
        this.f7505s.loadFullScreenAD();
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

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f7505s;
        if (unifiedInterstitialAD != null && unifiedInterstitialAD.isValid() && activity != null) {
            this.f7505s.showFullScreenAD(activity);
            return;
        }
        e eVar = this.f7372d;
        if (eVar != null) {
            eVar.a(10140);
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f7505s;
        if (unifiedInterstitialAD == null || unifiedInterstitialAD.getECPM() <= 0 || this.f7504r) {
            return;
        }
        this.f7504r = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.f7505s, i4 != 1 ? 10001 : 1);
    }
}
