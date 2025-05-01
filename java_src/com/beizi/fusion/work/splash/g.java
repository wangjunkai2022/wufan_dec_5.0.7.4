package com.beizi.fusion.work.splash;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTSplashAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: GmSplashWorker.java */
/* loaded from: classes2.dex */
public class g extends com.beizi.fusion.work.a {
    private boolean A;
    private TTSplashAd.AdInteractionListener B;
    private boolean C;
    private int D;
    private int E;
    private long F;

    /* renamed from: n  reason: collision with root package name */
    private Context f8080n;

    /* renamed from: o  reason: collision with root package name */
    private String f8081o;

    /* renamed from: p  reason: collision with root package name */
    private long f8082p;

    /* renamed from: q  reason: collision with root package name */
    private View f8083q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup f8084r;

    /* renamed from: s  reason: collision with root package name */
    private ViewGroup f8085s;

    /* renamed from: t  reason: collision with root package name */
    private TTAdNative f8086t;

    /* renamed from: u  reason: collision with root package name */
    private TTSplashAd f8087u;

    /* renamed from: v  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8088v;

    /* renamed from: w  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8089w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8090x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private float f8091y;

    /* renamed from: z  reason: collision with root package name */
    private float f8092z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GmSplashWorker.java */
    /* loaded from: classes2.dex */
    public class a implements TTSplashAd.AdInteractionListener {

        /* renamed from: b  reason: collision with root package name */
        private boolean f8096b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f8097c;

        private a() {
            this.f8096b = false;
            this.f8097c = false;
        }

        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
        public void onAdClicked(View view, int i4) {
            if (((com.beizi.fusion.work.a) g.this).f7372d != null && ((com.beizi.fusion.work.a) g.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) g.this).f7372d.d(g.this.g());
                ((com.beizi.fusion.work.a) g.this).f7381m.sendEmptyMessageDelayed(2, (((com.beizi.fusion.work.a) g.this).f7380l + 5000) - System.currentTimeMillis());
            }
            if (this.f8097c) {
                return;
            }
            this.f8097c = true;
            g.this.ai();
            g.this.E();
        }

        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
        public void onAdShow(View view, int i4) {
            ((com.beizi.fusion.work.a) g.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
            if (this.f8096b) {
                return;
            }
            this.f8096b = true;
            g.this.ab();
            g.this.C();
            g.this.D();
            g.this.ah();
        }

        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
        public void onAdSkip() {
            if (((com.beizi.fusion.work.a) g.this).f7372d != null && ((com.beizi.fusion.work.a) g.this).f7372d.r() != 2) {
                g.this.ac();
            }
            g.this.H();
        }

        @Override // com.bytedance.sdk.openadsdk.TTSplashAd.AdInteractionListener
        public void onAdTimeOver() {
            if (((com.beizi.fusion.work.a) g.this).f7372d != null && ((com.beizi.fusion.work.a) g.this).f7372d.r() != 2) {
                g.this.ac();
            }
            g.this.H();
        }
    }

    public g(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, int i4, int i5, com.beizi.fusion.d.e eVar) {
        this.f8080n = context;
        this.f8081o = str;
        this.f8082p = j4;
        this.f8083q = view;
        this.f8084r = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f8085s = new SplashContainer(context);
        this.f8088v = list;
        this.D = i4;
        this.E = i5;
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
        sb.append(" GmSplashWorker.load():");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            ad();
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    private void aH() {
        try {
            TTSplashAd tTSplashAd = this.f8087u;
            if (tTSplashAd != null) {
                View splashView = tTSplashAd.getSplashView();
                this.f8084r.removeAllViews();
                this.f8084r.addView(splashView);
            } else {
                aw();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void ay() {
        v();
        b();
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        TTSplashAd tTSplashAd = this.f8087u;
        if (tTSplashAd == null || tTSplashAd.getMediationManager() == null || this.f8087u.getMediationManager().getShowEcpm() == null || this.f8087u.getMediationManager().getShowEcpm().getEcpm() == null || this.C) {
            return;
        }
        this.C = true;
        af.a("BeiZis", "channel == GroMore竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f8087u.getMediationManager().getShowEcpm().getEcpm());
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "GM";
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
                if (!av.a("com.bytedance.sdk.openadsdk.TTAdNative")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.g.1
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.c(10151);
                        }
                    }, 10L);
                    af.a("BeiZis", "groMore sdk not import , will do nothing");
                    return;
                }
                u();
                af.a("BeiZis", "requestAd() appId：" + this.f7376h + "  spaceId：" + this.f7377i);
                u.b(this, this.f8080n, this.f7376h, this.f7373e.getDirectDownload());
                this.f7370b.x(TTAdSdk.getAdManager().getSDKVersion());
                au();
                v();
            }
        }
        this.F = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            this.F = Math.max(this.F, this.f7374f.getHotRequestDelay());
        }
        this.f8091y = av.l(this.f8080n);
        this.f8092z = av.m(this.f8080n);
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
        aH();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        TTSplashAd tTSplashAd = this.f8087u;
        return (tTSplashAd == null || tTSplashAd.getMediationManager() == null || this.f8087u.getMediationManager().getShowEcpm() == null || this.f8087u.getMediationManager().getShowEcpm().getEcpm() == null) ? "" : this.f8087u.getMediationManager().getShowEcpm().getEcpm();
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // com.beizi.fusion.work.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void l() {
        /*
            r7 = this;
            r7.w()
            r7.ag()
            android.content.Context r0 = r7.f8080n
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = 0
            int r3 = r7.D     // Catch: java.lang.Exception -> L3c
            if (r3 != 0) goto L17
            float r0 = com.beizi.fusion.g.av.j(r0)     // Catch: java.lang.Exception -> L3c
            int r0 = (int) r0     // Catch: java.lang.Exception -> L3c
            r7.D = r0     // Catch: java.lang.Exception -> L3c
        L17:
            int r0 = r7.E     // Catch: java.lang.Exception -> L3c
            if (r0 != 0) goto L24
            android.content.Context r0 = r7.f8080n     // Catch: java.lang.Exception -> L3c
            float r0 = com.beizi.fusion.g.av.k(r0)     // Catch: java.lang.Exception -> L3c
            int r0 = (int) r0     // Catch: java.lang.Exception -> L3c
            r7.E = r0     // Catch: java.lang.Exception -> L3c
        L24:
            android.content.Context r0 = r7.f8080n     // Catch: java.lang.Exception -> L3c
            int r3 = r7.E     // Catch: java.lang.Exception -> L3c
            float r3 = (float) r3     // Catch: java.lang.Exception -> L3c
            int r0 = com.beizi.fusion.g.av.a(r0, r3)     // Catch: java.lang.Exception -> L3c
            android.content.Context r3 = r7.f8080n     // Catch: java.lang.Exception -> L37
            int r4 = r7.D     // Catch: java.lang.Exception -> L37
            float r4 = (float) r4     // Catch: java.lang.Exception -> L37
            int r2 = com.beizi.fusion.g.av.a(r3, r4)     // Catch: java.lang.Exception -> L37
            goto L42
        L37:
            r3 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L3e
        L3c:
            r0 = move-exception
            r3 = 0
        L3e:
            r0.printStackTrace()
            r0 = r3
        L42:
            com.beizi.fusion.work.splash.g$a r3 = new com.beizi.fusion.work.splash.g$a
            r4 = 0
            r3.<init>()
            r7.B = r3
            com.beizi.fusion.work.splash.g$2 r3 = new com.beizi.fusion.work.splash.g$2
            r3.<init>()
            java.lang.String r4 = r7.f7377i
            if (r4 != 0) goto L54
            return
        L54:
            com.bytedance.sdk.openadsdk.TTAdManager r4 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()
            com.bytedance.sdk.openadsdk.TTAdNative r1 = r4.createAdNative(r1)
            r7.f8086t = r1
            com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot$Builder r1 = new com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot$Builder
            r1.<init>()
            com.bytedance.sdk.openadsdk.mediation.ad.MediationAdSlot r1 = r1.build()
            com.bytedance.sdk.openadsdk.AdSlot$Builder r4 = new com.bytedance.sdk.openadsdk.AdSlot$Builder
            r4.<init>()
            java.lang.String r5 = r7.f7377i
            com.bytedance.sdk.openadsdk.AdSlot$Builder r4 = r4.setCodeId(r5)
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r4.setImageAcceptedSize(r2, r0)
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setMediationAdSlot(r1)
            com.bytedance.sdk.openadsdk.AdSlot r0 = r0.build()
            com.bytedance.sdk.openadsdk.TTAdNative r1 = r7.f8086t     // Catch: java.lang.Exception -> L84
            r1.loadSplashAd(r0, r3)     // Catch: java.lang.Exception -> L84
            goto L88
        L84:
            r0 = move-exception
            r0.printStackTrace()
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.work.splash.g.l():void");
    }

    public void b() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.F);
        long j4 = this.F;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.fusion.work.a
    public void a(Message message) {
        com.beizi.fusion.b.b bVar = this.f7370b;
        if (bVar != null) {
            bVar.i(String.valueOf(message.obj));
            au();
            B();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        TTSplashAd tTSplashAd = this.f8087u;
        if (tTSplashAd == null || tTSplashAd.getMediationManager() == null || this.f8087u.getMediationManager().getShowEcpm() == null || this.f8087u.getMediationManager().getShowEcpm().getEcpm() == null || this.C) {
            return;
        }
        this.C = true;
        af.a("BeiZis", "channel == GroMore竞价失败:" + i4);
    }
}
