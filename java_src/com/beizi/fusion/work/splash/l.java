package com.beizi.fusion.work.splash;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.b;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidLossCode;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.mbbid.out.SplashBidRequestParams;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;
/* compiled from: MtgSplashWorker.java */
/* loaded from: classes2.dex */
public class l extends com.beizi.fusion.work.a {
    private String A;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;

    /* renamed from: n  reason: collision with root package name */
    private BidResponsed f8171n;

    /* renamed from: o  reason: collision with root package name */
    private long f8172o;

    /* renamed from: p  reason: collision with root package name */
    private Context f8173p;

    /* renamed from: q  reason: collision with root package name */
    private String f8174q;

    /* renamed from: r  reason: collision with root package name */
    private long f8175r;

    /* renamed from: s  reason: collision with root package name */
    private ViewGroup f8176s;

    /* renamed from: t  reason: collision with root package name */
    private long f8177t;

    /* renamed from: u  reason: collision with root package name */
    private MBSplashHandler f8178u;

    /* renamed from: v  reason: collision with root package name */
    private BidManager f8179v;

    /* renamed from: w  reason: collision with root package name */
    private String f8180w;

    /* renamed from: x  reason: collision with root package name */
    private String f8181x;

    /* renamed from: y  reason: collision with root package name */
    private String f8182y;

    /* renamed from: z  reason: collision with root package name */
    private String f8183z;

    public l(Context context, String str, long j4, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f8173p = context;
        this.f8174q = str;
        this.f8175r = j4;
        this.f8176s = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        r();
    }

    private void aH() {
        if (this.D) {
            this.f7381m.sendEmptyMessageDelayed(1, this.f8177t);
            return;
        }
        u();
        com.beizi.fusion.b.a().a(this.f8173p, this.A, this.f8183z, false, null, new b.c() { // from class: com.beizi.fusion.work.splash.l.2
            @Override // com.beizi.fusion.b.c
            public void a(String str, String str2) {
                af.b("BeiZis", "MTG onInitSuccess");
                l.this.v();
                if (l.this.f8173p instanceof Activity) {
                    l lVar = l.this;
                    lVar.b((Activity) lVar.f8173p);
                    if (l.this.am()) {
                        l lVar2 = l.this;
                        lVar2.a(lVar2.f8181x, l.this.f8182y);
                    }
                }
                if (l.this.f8177t > 0) {
                    ((com.beizi.fusion.work.a) l.this).f7381m.sendEmptyMessageDelayed(1, l.this.f8177t);
                } else if (((com.beizi.fusion.work.a) l.this).f7372d == null || ((com.beizi.fusion.work.a) l.this).f7372d.s() >= 1 || ((com.beizi.fusion.work.a) l.this).f7372d.r() == 2) {
                } else {
                    l.this.l();
                }
            }

            @Override // com.beizi.fusion.b.c
            public void a(String str) {
                af.b("BeiZis", "MTG onInitFail");
                if (l.this.aa()) {
                    l.this.a(3);
                    l.this.L();
                    return;
                }
                l.this.ax();
            }
        });
        this.f7370b.z("MAL_16.2.57");
        au();
        this.D = true;
    }

    private void aI() {
        BidManager bidManager = this.f8179v;
        if (bidManager != null) {
            bidManager.setBidListener(new BidListennning() { // from class: com.beizi.fusion.work.splash.l.5
                public void onFailed(String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("bid onFailed showMtgSplash onError:");
                    sb.append(str);
                    l.this.a(3);
                    l.this.L();
                }

                public void onSuccessed(BidResponsed bidResponsed) {
                    l.this.f8171n = bidResponsed;
                    l.this.f8180w = bidResponsed.getBidToken();
                    StringBuilder sb = new StringBuilder();
                    sb.append("onSuccessed: token ");
                    sb.append(l.this.f8180w);
                    sb.append(",mbSplashHandler != null ? ");
                    sb.append(l.this.f8178u != null);
                    af.b("BeiZis", sb.toString());
                    l.this.aM();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aJ() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" splashWorkers:");
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

    private void aK() {
        af.b("BeiZis", "enter finalShowAd");
        if (this.f8178u != null) {
            af.b("BeiZis", "finalShowAd isAdReady = " + this.f8178u.isReady(this.f8180w));
        }
        if (this.f8178u != null && aL()) {
            ViewGroup viewGroup = this.f8176s;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                if (am()) {
                    this.f8178u.show(this.f8176s, this.f8180w);
                    return;
                } else {
                    this.f8178u.show(this.f8176s);
                    return;
                }
            }
            aw();
            return;
        }
        aw();
    }

    private boolean aL() {
        String str;
        if (this.f8178u == null) {
            return false;
        }
        if (am() && (str = this.f8180w) != null) {
            return this.f8178u.isReady(str);
        }
        return this.f8178u.isReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aM() {
        double parseDouble;
        if (!z() || this.f8171n == null) {
            return;
        }
        this.f7378j = com.beizi.fusion.f.a.ADLOAD;
        a(2);
        if (this.f8171n.getPrice() != null) {
            try {
                if ("0".compareTo(this.f8171n.getPrice()) < 0) {
                    if ("USD".equalsIgnoreCase(this.f8171n.getCur())) {
                        parseDouble = Double.parseDouble(this.f8171n.getPrice()) * 6.400000095367432d;
                    } else {
                        parseDouble = Double.parseDouble(this.f8171n.getPrice());
                    }
                    double d5 = parseDouble * 100.0d;
                    af.a("BeiZisBid", "mtg splash price = " + d5 + ",currency = " + this.f8171n.getCur());
                    a(d5);
                }
                aB();
            } catch (NumberFormatException e5) {
                e5.printStackTrace();
            }
        }
        K();
        l();
    }

    public void aG() {
        MBSplashHandler mBSplashHandler = this.f8178u;
        if (mBSplashHandler == null || this.E) {
            return;
        }
        mBSplashHandler.setSplashLoadListener(new MBSplashLoadListener() { // from class: com.beizi.fusion.work.splash.l.3
            public void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z4) {
                af.b("BeiZis", "isSupportZoomOut: " + z4 + " ids" + mBridgeIds.toString());
            }

            public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadFailed showMtgSplash onError:");
                sb.append(str);
                l.this.a(str, 10132);
            }

            public void onLoadSuccessed(MBridgeIds mBridgeIds, int i4) {
                af.a("BeiZis", "showMtgSplash req to load time = " + (System.currentTimeMillis() - l.this.f8172o));
                ((com.beizi.fusion.work.a) l.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                l.this.al();
                l.this.y();
                if (l.this.Y()) {
                    l.this.aJ();
                } else {
                    l.this.O();
                }
            }
        });
        this.f8178u.setSplashShowListener(new MBSplashShowListener() { // from class: com.beizi.fusion.work.splash.l.4
            public void onAdClicked(MBridgeIds mBridgeIds) {
                l.this.E();
                if (((com.beizi.fusion.work.a) l.this).f7372d != null) {
                    if (((com.beizi.fusion.work.a) l.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) l.this).f7372d.d(l.this.g());
                    }
                    l.this.ai();
                }
            }

            public void onAdTick(MBridgeIds mBridgeIds, long j4) {
                af.b("BeiZis", "onAdTick: " + j4 + " " + mBridgeIds.toString());
            }

            public void onDismiss(MBridgeIds mBridgeIds, int i4) {
                if (((com.beizi.fusion.work.a) l.this).f7372d != null && ((com.beizi.fusion.work.a) l.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) l.this).f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.l.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            l.this.ac();
                        }
                    }, 200L);
                }
                l.this.G();
            }

            public void onShowFailed(MBridgeIds mBridgeIds, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("onShowFailed showMtgSplash onError:");
                sb.append(str);
                l.this.a(str, 10132);
            }

            public void onShowSuccessed(MBridgeIds mBridgeIds) {
                ((com.beizi.fusion.work.a) l.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                l.this.ab();
                l.this.C();
                l.this.D();
                l.this.ah();
            }

            public void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
                af.b("BeiZis", "onZoomOutPlayFinish: " + mBridgeIds.toString());
            }

            public void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
                af.b("BeiZis", "onZoomOutPlayStart: " + mBridgeIds.toString());
            }
        });
        this.E = true;
    }

    @Override // com.beizi.fusion.work.a
    protected boolean aa() {
        return true;
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        if (this.C) {
            return;
        }
        af.b("BeiZis", "enter sendWinNotice");
        BidResponsed bidResponsed = this.f8171n;
        if (bidResponsed != null) {
            bidResponsed.sendWinNotice(this.f8173p);
            this.C = true;
        }
        super.az();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "MTG";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        this.f8172o = System.currentTimeMillis();
        try {
            this.f8181x = this.f7377i.split("_")[0];
            this.f8182y = this.f7377i.split("_")[1];
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            this.f8183z = this.f7376h.split("_")[0];
            this.A = this.f7376h.split("_")[1];
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        af.b("BeiZis", "mtg placementId = " + this.f8181x + ",adUnitId = " + this.f8182y + ",mtgAppId = " + this.f8183z + ",mtgAppKey = " + this.A);
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.mbridge.msdk.MBridgeSDK")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.l.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (l.this.aa()) {
                                l.this.a(3);
                                l.this.L();
                                return;
                            }
                            l.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                aH();
            }
        }
        this.f8177t = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            this.f8177t = Math.max(this.f8177t, this.f7374f.getHotRequestDelay());
        }
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" out make show ad");
        aK();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        double parseDouble;
        BidResponsed bidResponsed = this.f8171n;
        if (bidResponsed == null || "0".compareTo(bidResponsed.getPrice()) >= 0) {
            return null;
        }
        if ("USD".equalsIgnoreCase(this.f8171n.getCur())) {
            parseDouble = Double.parseDouble(this.f8171n.getPrice()) * 6.400000095367432d;
        } else {
            parseDouble = Double.parseDouble(this.f8171n.getPrice());
        }
        return (parseDouble * 100.0d) + "";
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        if (am()) {
            if (this.f8171n != null) {
                aG();
                af.b("BeiZis", "mtg bid second step mbSplashHandler = " + this.f8178u + ",token = " + this.f8180w);
                az();
                if (this.f8178u != null) {
                    w();
                    ag();
                    this.f8178u.preLoadByToken(this.f8180w);
                    return;
                }
                return;
            }
            af.b("BeiZis", "mtg bid first step");
            aI();
            b();
            return;
        }
        w();
        ag();
        aG();
        this.f8178u.preLoad();
    }

    public void b(Activity activity) {
        try {
            MBSplashHandler mBSplashHandler = new MBSplashHandler(activity, this.f8181x, this.f8182y);
            this.f8178u = mBSplashHandler;
            mBSplashHandler.setLoadTimeOut(this.f8175r);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        this.f8179v = new BidManager(new SplashBidRequestParams(str, str2, true, 2, 30, 30));
    }

    public void b() {
        BidManager bidManager = this.f8179v;
        if (bidManager != null) {
            bidManager.bid();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        BidResponsed bidResponsed;
        if (this.B) {
            return;
        }
        af.b("BeiZis", "enter sendLoseNotice state = " + i4);
        if (i4 == 1) {
            BidResponsed bidResponsed2 = this.f8171n;
            if (bidResponsed2 != null) {
                bidResponsed2.sendLossNotice(this.f8173p, BidLossCode.bidPriceNotHighest());
                this.B = true;
            }
        } else if (i4 == 2) {
            BidResponsed bidResponsed3 = this.f8171n;
            if (bidResponsed3 != null) {
                bidResponsed3.sendLossNotice(this.f8173p, BidLossCode.bidTimeOut());
                this.B = true;
            }
        } else if (i4 == 3 && (bidResponsed = this.f8171n) != null) {
            bidResponsed.sendLossNotice(this.f8173p, BidLossCode.bidWinButNotShow());
            this.B = true;
        }
        super.d(i4);
    }
}
