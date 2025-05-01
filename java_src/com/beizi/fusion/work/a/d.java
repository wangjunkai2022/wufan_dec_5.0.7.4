package com.beizi.fusion.work.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.beizi.fusion.d.e;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.Map;
/* compiled from: GdtBannerAdWorker.java */
/* loaded from: classes2.dex */
public class d extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7442n;

    /* renamed from: o  reason: collision with root package name */
    private String f7443o;

    /* renamed from: p  reason: collision with root package name */
    private long f7444p;

    /* renamed from: q  reason: collision with root package name */
    private long f7445q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7446r;

    /* renamed from: s  reason: collision with root package name */
    private UnifiedBannerView f7447s;

    /* renamed from: t  reason: collision with root package name */
    private ViewGroup f7448t;

    /* renamed from: u  reason: collision with root package name */
    private float f7449u;

    /* renamed from: v  reason: collision with root package name */
    private float f7450v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f7451w;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GdtBannerAdWorker.java */
    /* loaded from: classes2.dex */
    public class a implements UnifiedBannerADListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f7453a;

        /* renamed from: b  reason: collision with root package name */
        boolean f7454b;

        private a() {
            this.f7453a = false;
            this.f7454b = false;
        }

        @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
        public void onADClicked() {
            if (((com.beizi.fusion.work.a) d.this).f7372d != null) {
                ((com.beizi.fusion.work.a) d.this).f7372d.d(d.this.g());
            }
            if (this.f7454b) {
                return;
            }
            this.f7454b = true;
            d.this.E();
            d.this.ai();
        }

        @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
        public void onADClosed() {
            if (((com.beizi.fusion.work.a) d.this).f7372d != null) {
                ((com.beizi.fusion.work.a) d.this).f7372d.c(d.this.g());
            }
            d.this.G();
        }

        @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
        public void onADExposure() {
            ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
            if (((com.beizi.fusion.work.a) d.this).f7372d != null) {
                ((com.beizi.fusion.work.a) d.this).f7372d.b(d.this.g());
            }
            if (this.f7453a) {
                return;
            }
            this.f7453a = true;
            d.this.az();
            d.this.C();
            d.this.D();
            d.this.ah();
        }

        @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
        public void onADLeftApplication() {
        }

        @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
        public void onADReceive() {
            if (d.this.f7447s.getECPM() > 0) {
                d dVar = d.this;
                dVar.a(dVar.f7447s.getECPM());
            }
            if (v.f7025a) {
                d.this.f7447s.setDownloadConfirmListener(v.f7026b);
            }
            ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            d.this.y();
            if (d.this.Y()) {
                d.this.b();
            } else {
                d.this.O();
            }
        }

        @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("showGdtBannerAd onError:");
            sb.append(adError.getErrorMsg());
            d.this.a(adError.getErrorMsg(), adError.getErrorCode());
            if (d.this.f7451w) {
                return;
            }
            d.this.m();
        }
    }

    public d(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, e eVar, float f5, float f6, ViewGroup viewGroup) {
        this.f7442n = context;
        this.f7443o = str;
        this.f7444p = j4;
        this.f7445q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7449u = f5;
        this.f7450v = f6;
        this.f7448t = viewGroup;
        r();
    }

    private ViewGroup.LayoutParams aG() {
        if (this.f7449u <= 0.0f) {
            this.f7449u = av.j(this.f7442n);
        }
        if (this.f7450v <= 0.0f) {
            this.f7450v = Math.round(this.f7449u / 6.4f);
        }
        return new ViewGroup.LayoutParams(av.a(this.f7442n, this.f7449u), av.a(this.f7442n, this.f7450v));
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7447s == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f7447s.getECPMLevel());
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
        UnifiedBannerView unifiedBannerView = this.f7447s;
        if (unifiedBannerView == null || unifiedBannerView.getECPM() <= 0 || this.f7446r) {
            return;
        }
        this.f7446r = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f7447s.getECPM());
        UnifiedBannerView unifiedBannerView2 = this.f7447s;
        k.a(unifiedBannerView2, unifiedBannerView2.getECPM());
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
                if (!av.a("com.qq.e.ads.banner2.UnifiedBannerView")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.a.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                k.a(this.f7442n, this.f7376h);
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
        sb.append(this.f7445q);
        long j4 = this.f7445q;
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
    public void f() {
        ViewGroup viewGroup;
        if (this.f7447s != null && (viewGroup = this.f7448t) != null) {
            if (viewGroup.getChildCount() > 0) {
                this.f7448t.removeAllViews();
            }
            this.f7451w = true;
            this.f7448t.addView(this.f7447s, aG());
            return;
        }
        aw();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        UnifiedBannerView unifiedBannerView = this.f7447s;
        if (unifiedBannerView != null) {
            int a5 = ak.a(this.f7373e.getPriceDict(), unifiedBannerView.getECPMLevel());
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
        this.f7451w = false;
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f7447s = new UnifiedBannerView((Activity) this.f7442n, this.f7377i, new a(), null, aC());
        } else {
            this.f7447s = new UnifiedBannerView((Activity) this.f7442n, this.f7377i, new a());
        }
        this.f7447s.loadAD();
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        UnifiedBannerView unifiedBannerView = this.f7447s;
        if (unifiedBannerView != null) {
            unifiedBannerView.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ViewGroup viewGroup;
        e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" BannerAdWorker:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            if (this.f7447s != null && (viewGroup = this.f7448t) != null) {
                if (viewGroup.getChildCount() > 0) {
                    this.f7448t.removeAllViews();
                }
                this.f7451w = true;
                this.f7448t.addView(this.f7447s, aG());
                this.f7372d.a(g(), (View) null);
                return;
            }
            this.f7372d.a(10140);
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        UnifiedBannerView unifiedBannerView = this.f7447s;
        if (unifiedBannerView == null || unifiedBannerView.getECPM() <= 0 || this.f7446r) {
            return;
        }
        this.f7446r = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.f7447s, i4 != 1 ? 10001 : 1);
    }
}
