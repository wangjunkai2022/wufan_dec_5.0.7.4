package com.beizi.fusion.work.interstitial;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.beizi.ad.AdListener;
import com.beizi.ad.AdRequest;
import com.beizi.ad.InterstitialAd;
import com.beizi.fusion.d.h;
import com.beizi.fusion.g.at;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.List;
import java.util.Map;
/* compiled from: BeiZiInterstitialWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: o  reason: collision with root package name */
    private Context f7701o;

    /* renamed from: p  reason: collision with root package name */
    private String f7702p;

    /* renamed from: q  reason: collision with root package name */
    private long f7703q;

    /* renamed from: r  reason: collision with root package name */
    private long f7704r;

    /* renamed from: s  reason: collision with root package name */
    private InterstitialAd f7705s;

    /* renamed from: t  reason: collision with root package name */
    private AdSpacesBean.UniteControlBean f7706t;

    /* renamed from: u  reason: collision with root package name */
    private int f7707u;

    /* renamed from: n  reason: collision with root package name */
    protected String f7700n = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7708v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f7709w = false;

    public a(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7701o = context;
        this.f7702p = str;
        this.f7703q = j4;
        this.f7704r = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
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
        sb.append("splashWorkers:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            this.f7372d.a(g(), (View) null);
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aH() {
        aI();
        aJ();
        aK();
        aL();
        aM();
    }

    private void aI() {
        AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickView = this.f7373e.getRegionalClickView();
        if (regionalClickView == null) {
            return;
        }
        AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean a5 = a(regionalClickView.getOrderData(), this.f7705s.getAdId());
        AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean = null;
        if (a5 != null && a5.getRegionalClickView() != null) {
            regionalClickViewBean = a5.getRegionalClickView();
        }
        if (regionalClickViewBean != null) {
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.J(regionalClickViewBean.getRegionalClickUuid());
                au();
                return;
            }
            return;
        }
        com.beizi.fusion.b.b bVar2 = this.f7370b;
        if (bVar2 != null) {
            bVar2.J(regionalClickView.getRegionalClickUuid());
            au();
        }
    }

    private void aJ() {
        AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClick = this.f7373e.getFullScreenClick();
        if (fullScreenClick == null) {
            return;
        }
        AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean b5 = b(fullScreenClick.getOrderData(), this.f7705s.getAdId());
        AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClickBean = null;
        if (b5 != null && b5.getFullScreenClick() != null) {
            fullScreenClickBean = b5.getFullScreenClick();
        }
        if (fullScreenClickBean != null) {
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.I(fullScreenClickBean.getFullScreenClickUuid());
                au();
                return;
            }
            return;
        }
        com.beizi.fusion.b.b bVar2 = this.f7370b;
        if (bVar2 != null) {
            bVar2.I(fullScreenClick.getFullScreenClickUuid());
            au();
        }
    }

    private void aK() {
        AdSpacesBean.BuyerBean.ShakeViewBean shakeView = this.f7373e.getShakeView();
        if (shakeView == null) {
            return;
        }
        AdSpacesBean.BuyerBean.OrderDataShakeViewBean c5 = c(shakeView.getOrderData(), this.f7705s.getAdId());
        AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean = null;
        if (c5 != null && c5.getShakeView() != null) {
            shakeViewBean = c5.getShakeView();
        }
        if (shakeViewBean != null) {
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.G(shakeViewBean.getShakeViewUuid());
                au();
                return;
            }
            return;
        }
        com.beizi.fusion.b.b bVar2 = this.f7370b;
        if (bVar2 != null) {
            bVar2.G(shakeView.getShakeViewUuid());
            au();
        }
    }

    private void aL() {
        AdSpacesBean.BuyerBean.ScrollClickBean scrollClick = this.f7373e.getScrollClick();
        if (scrollClick == null) {
            return;
        }
        AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean d5 = d(scrollClick.getOrderData(), this.f7705s.getAdId());
        AdSpacesBean.BuyerBean.ScrollClickBean scrollClickBean = null;
        if (d5 != null && d5.getScrollClick() != null) {
            scrollClickBean = d5.getScrollClick();
        }
        if (scrollClickBean != null) {
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.F(scrollClickBean.getScrollClickUuid());
                au();
                return;
            }
            return;
        }
        com.beizi.fusion.b.b bVar2 = this.f7370b;
        if (bVar2 != null) {
            bVar2.F(scrollClick.getScrollClickUuid());
            au();
        }
    }

    private void aM() {
        AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleRule = this.f7373e.getEulerAngleRule();
        if (eulerAngleRule == null) {
            return;
        }
        AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean e5 = e(eulerAngleRule.getOrderData(), this.f7705s.getAdId());
        AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean = null;
        if (e5 != null && e5.getEulerAngleRule() != null) {
            eulerAngleViewBean = e5.getEulerAngleRule();
        }
        if (eulerAngleViewBean != null) {
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.R(eulerAngleViewBean.getEulerAngleUuid());
                au();
                return;
            }
            return;
        }
        com.beizi.fusion.b.b bVar2 = this.f7370b;
        if (bVar2 != null) {
            bVar2.R(eulerAngleRule.getEulerAngleUuid());
            au();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "BEIZI";
    }

    private AdSpacesBean.BuyerBean.OrderDataShakeViewBean c(List<AdSpacesBean.BuyerBean.OrderDataShakeViewBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataShakeViewBean orderDataShakeViewBean : list) {
                List<String> orderList = orderDataShakeViewBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataShakeViewBean;
                }
            }
        }
        return null;
    }

    private AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean e(List<AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean orderDataEulerAngleViewBean : list) {
                List<String> orderList = orderDataEulerAngleViewBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataEulerAngleViewBean;
                }
            }
        }
        return null;
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        InterstitialAd interstitialAd;
        if (z() && (interstitialAd = this.f7705s) != null && interstitialAd.isLoaded()) {
            al();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
        r6.f7709w = com.beizi.fusion.g.al.a(java.lang.Integer.parseInt(r3.getRate()));
     */
    @Override // com.beizi.fusion.work.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.work.interstitial.a.d():void");
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        InterstitialAd interstitialAd = this.f7705s;
        if (interstitialAd == null) {
            return null;
        }
        return interstitialAd.getPrice();
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        InterstitialAd interstitialAd = new InterstitialAd(this.f7701o, false);
        this.f7705s = interstitialAd;
        interstitialAd.setAdUnitId(this.f7377i);
        this.f7705s.setAdBuyerBean(this.f7373e);
        this.f7705s.setAdListener(new AdListener() { // from class: com.beizi.fusion.work.interstitial.a.2
            @Override // com.beizi.ad.AdListener
            public void onAdClicked() {
                super.onAdClicked();
                if (a.this.f7708v && ((com.beizi.fusion.work.a) a.this).f7373e != null) {
                    ((com.beizi.fusion.work.a) a.this).f7370b.P(((com.beizi.fusion.work.a) a.this).f7373e.getCallBackStrategyUuid());
                    a.this.au();
                }
                a.this.F();
                if (!a.this.f7708v || a.this.f7709w) {
                    if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) a.this).f7372d.d(a.this.g());
                    }
                    a.this.E();
                    a.this.ai();
                }
            }

            @Override // com.beizi.ad.AdListener
            public void onAdClosed() {
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.c(a.this.g());
                }
                a.this.G();
            }

            @Override // com.beizi.ad.AdListener
            public void onAdComplainResult(String str) {
                super.onAdComplainResult(str);
                try {
                    at.a(a.this.f7701o, a.this.f7700n, Long.valueOf(System.currentTimeMillis()));
                    ((com.beizi.fusion.work.a) a.this).f7370b.S(str);
                    a.this.au();
                    a.this.I();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.beizi.ad.AdListener
            public void onAdFailedToLoad(int i4) {
                super.onAdFailedToLoad(i4);
                StringBuilder sb = new StringBuilder();
                sb.append("showBeiZiInterstitialAd onAdFailedToLoad: ");
                sb.append(i4);
                a.this.a(String.valueOf(i4), i4);
            }

            @Override // com.beizi.ad.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                if (a.this.f7705s.getPrice() != null) {
                    try {
                        a aVar = a.this;
                        aVar.a(Double.parseDouble(aVar.f7705s.getPrice()));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                a.this.y();
                if (a.this.Y()) {
                    a.this.aG();
                } else {
                    a.this.O();
                }
                a.this.aH();
            }

            @Override // com.beizi.ad.AdListener
            public void onAdShown() {
                super.onAdShown();
                ((com.beizi.fusion.work.a) a.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) a.this).f7372d != null && ((com.beizi.fusion.work.a) a.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) a.this).f7372d.b(a.this.g());
                    a.this.ah();
                }
                a.this.C();
                a.this.U();
                a.this.D();
            }
        });
        AdRequest build = new AdRequest.Builder().build();
        this.f7705s.openAdInNativeBrowser(true);
        this.f7705s.loadAd(build);
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        InterstitialAd interstitialAd = this.f7705s;
        if (interstitialAd != null) {
            interstitialAd.cancel();
        }
    }

    private boolean b() {
        try {
            AdSpacesBean.UniteControlBean uniteControlBean = this.f7706t;
            if (uniteControlBean == null) {
                return true;
            }
            int random = uniteControlBean.getRandom();
            long duration = this.f7706t.getDuration();
            long longValue = ((Long) at.b(this.f7701o, "uniteTime", 0L)).longValue();
            if (longValue <= 0 || duration <= 0 || System.currentTimeMillis() - longValue >= duration) {
                return true;
            }
            return random >= this.f7707u || random == 100;
        } catch (Exception e5) {
            e5.printStackTrace();
            return true;
        }
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" out make show ad");
        try {
            if (!b()) {
                a(String.valueOf(10170), 10170);
                return;
            }
            InterstitialAd interstitialAd = this.f7705s;
            if (interstitialAd == null || !interstitialAd.isLoaded()) {
                return;
            }
            this.f7705s.show(activity);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean b(List<AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean orderDataFullScreenClickBean : list) {
                List<String> orderList = orderDataFullScreenClickBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataFullScreenClickBean;
                }
            }
        }
        return null;
    }

    private AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean a(List<AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean orderDataRegionalClickViewBean : list) {
                List<String> orderList = orderDataRegionalClickViewBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataRegionalClickViewBean;
                }
            }
        }
        return null;
    }

    private AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean d(List<AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean orderDataScrollViewOrderBean : list) {
                List<String> orderList = orderDataScrollViewOrderBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataScrollViewOrderBean;
                }
            }
        }
        return null;
    }
}
