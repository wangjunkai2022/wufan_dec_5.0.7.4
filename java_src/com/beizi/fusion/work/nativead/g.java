package com.beizi.fusion.work.nativead;

import android.content.Context;
import android.view.View;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.List;
import java.util.Map;
/* compiled from: GdtNativeAdWorker.java */
/* loaded from: classes2.dex */
public class g extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    private Context f7884n;

    /* renamed from: o  reason: collision with root package name */
    private String f7885o;

    /* renamed from: p  reason: collision with root package name */
    private long f7886p;

    /* renamed from: q  reason: collision with root package name */
    private long f7887q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7888r;

    /* renamed from: s  reason: collision with root package name */
    private NativeExpressAD f7889s;

    /* renamed from: t  reason: collision with root package name */
    private NativeExpressADView f7890t;

    /* renamed from: u  reason: collision with root package name */
    private float f7891u;

    /* renamed from: v  reason: collision with root package name */
    private float f7892v;

    /* renamed from: w  reason: collision with root package name */
    private View f7893w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f7894x;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GdtNativeAdWorker.java */
    /* loaded from: classes2.dex */
    public class a implements NativeExpressAD.NativeExpressADListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f7896a;

        /* renamed from: b  reason: collision with root package name */
        boolean f7897b;

        private a() {
            this.f7896a = false;
            this.f7897b = false;
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClicked(NativeExpressADView nativeExpressADView) {
            if (((com.beizi.fusion.work.a) g.this).f7372d != null && ((com.beizi.fusion.work.a) g.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) g.this).f7372d.d(g.this.g());
            }
            if (this.f7897b) {
                return;
            }
            this.f7897b = true;
            g.this.E();
            g.this.ai();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClosed(NativeExpressADView nativeExpressADView) {
            if (((com.beizi.fusion.work.a) g.this).f7372d != null && ((com.beizi.fusion.work.a) g.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) g.this).f7372d.b(g.this.g(), g.this.f7893w);
            }
            g.this.G();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADExposure(NativeExpressADView nativeExpressADView) {
            ((com.beizi.fusion.work.a) g.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
            if (((com.beizi.fusion.work.a) g.this).f7372d != null && ((com.beizi.fusion.work.a) g.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) g.this).f7372d.b(g.this.g());
            }
            if (this.f7896a) {
                return;
            }
            this.f7896a = true;
            g.this.az();
            g.this.C();
            g.this.D();
            g.this.ah();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLeftApplication(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLoaded(List<NativeExpressADView> list) {
            ((com.beizi.fusion.work.a) g.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            g.this.y();
            if (list != null && list.size() != 0) {
                if (g.this.f7890t != null) {
                    g.this.f7890t.destroy();
                }
                g.this.f7890t = list.get(0);
                if (g.this.f7890t.getECPM() > 0) {
                    g gVar = g.this;
                    gVar.a(gVar.f7890t.getECPM());
                }
                if (v.f7025a) {
                    g.this.f7890t.setDownloadConfirmListener(v.f7026b);
                }
                if (g.this.f7890t.getBoundData().getAdPatternType() == 2) {
                    g.this.f7894x = true;
                    g.this.f7890t.setMediaListener(new NativeExpressMediaListener() { // from class: com.beizi.fusion.work.nativead.g.a.1
                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoCached(NativeExpressADView nativeExpressADView) {
                            g.this.aG();
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoComplete(NativeExpressADView nativeExpressADView) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoError(NativeExpressADView nativeExpressADView, AdError adError) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoInit(NativeExpressADView nativeExpressADView) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoLoading(NativeExpressADView nativeExpressADView) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoPageClose(NativeExpressADView nativeExpressADView) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoPageOpen(NativeExpressADView nativeExpressADView) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoPause(NativeExpressADView nativeExpressADView) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoReady(NativeExpressADView nativeExpressADView, long j4) {
                        }

                        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
                        public void onVideoStart(NativeExpressADView nativeExpressADView) {
                        }
                    });
                    g.this.f7890t.preloadVideo();
                }
                g gVar2 = g.this;
                gVar2.f7893w = gVar2.f7890t;
                if (g.this.f7894x) {
                    return;
                }
                g.this.aG();
                return;
            }
            g.this.c(-991);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("showGdtNativeAd onError:");
            sb.append(adError.getErrorMsg());
            g.this.a(adError.getErrorMsg(), adError.getErrorCode());
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderFail(NativeExpressADView nativeExpressADView) {
            g.this.a("sdk custom error ".concat("Render Fail"), 99991);
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderSuccess(NativeExpressADView nativeExpressADView) {
        }
    }

    public g(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, float f5, float f6) {
        this.f7884n = context;
        this.f7885o = str;
        this.f7886p = j4;
        this.f7887q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7891u = f5;
        this.f7892v = f6;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        NativeExpressADView nativeExpressADView = this.f7890t;
        if (nativeExpressADView != null) {
            nativeExpressADView.render();
        }
        if (Y()) {
            b();
        } else {
            O();
        }
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7890t == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f7890t.getECPMLevel());
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
        NativeExpressADView nativeExpressADView = this.f7890t;
        if (nativeExpressADView == null || nativeExpressADView.getECPM() <= 0 || this.f7888r) {
            return;
        }
        this.f7888r = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f7890t.getECPM());
        NativeExpressADView nativeExpressADView2 = this.f7890t;
        k.a(nativeExpressADView2, nativeExpressADView2.getECPM());
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.nativead.g.1
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                k.a(this.f7884n, this.f7376h);
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
        sb.append(this.f7887q);
        long j4 = this.f7887q;
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
        NativeExpressADView nativeExpressADView = this.f7890t;
        if (nativeExpressADView != null) {
            int a5 = ak.a(this.f7373e.getPriceDict(), nativeExpressADView.getECPMLevel());
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
        if (this.f7891u <= 0.0f) {
            this.f7891u = -1.0f;
        }
        if (this.f7892v <= 0.0f) {
            this.f7892v = -2.0f;
        }
        this.f7894x = false;
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f7889s = new NativeExpressAD(this.f7884n, new ADSize((int) this.f7891u, (int) this.f7892v), this.f7377i, new a(), aC());
        } else {
            this.f7889s = new NativeExpressAD(this.f7884n, new ADSize((int) this.f7891u, (int) this.f7892v), this.f7377i, new a());
        }
        this.f7889s.setVideoOption(new VideoOption.Builder().setAutoPlayPolicy(0).setAutoPlayMuted(true).build());
        this.f7889s.loadAD(1);
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        NativeExpressADView nativeExpressADView = this.f7890t;
        if (nativeExpressADView != null) {
            nativeExpressADView.destroy();
        }
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7893w;
    }

    private void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" NativeAdWorker:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            if (this.f7890t != null) {
                this.f7372d.a(g(), this.f7890t);
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
        NativeExpressADView nativeExpressADView = this.f7890t;
        if (nativeExpressADView == null || nativeExpressADView.getECPM() <= 0 || this.f7888r) {
            return;
        }
        this.f7888r = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.f7890t, i4 != 1 ? 10001 : 1);
    }
}
