package com.beizi.fusion.work.f;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.beizi.ad.NativeAdListener;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.UnifiedCustomAd;
import com.beizi.ad.internal.nativead.NativeAdEventListener;
import com.beizi.ad.internal.nativead.NativeAdShownListener;
import com.beizi.ad.internal.nativead.NativeAdUtil;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.fusion.d.w;
import com.beizi.fusion.g.ag;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.aq;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.ax;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BeiZiNativeUnifiedWorker.java */
/* loaded from: classes2.dex */
public class b extends a {
    private String A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private View H;
    private String I;

    /* renamed from: v  reason: collision with root package name */
    private UnifiedCustomAd f7539v;

    /* renamed from: w  reason: collision with root package name */
    private NativeAdResponse f7540w;

    /* renamed from: x  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.ShakeViewBean f7541x;

    /* renamed from: y  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.CoolShakeViewBean f7542y;

    /* renamed from: z  reason: collision with root package name */
    private ag f7543z;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0.D = com.beizi.fusion.g.al.a(java.lang.Integer.parseInt(r4.getRate()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r1, long r2, com.beizi.fusion.model.AdSpacesBean.BuyerBean r4, com.beizi.fusion.model.AdSpacesBean.ForwardBean r5, com.beizi.fusion.d.e r6, int r7) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r2 = 0
            r0.A = r2
            r3 = 0
            r0.B = r3
            r0.C = r3
            r0.D = r3
            r0.G = r3
            r0.I = r2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = r0.f7373e     // Catch: java.lang.Exception -> L4c
            java.util.List r2 = r2.getCallBackStrategy()     // Catch: java.lang.Exception -> L4c
            if (r2 == 0) goto L50
            int r4 = r2.size()     // Catch: java.lang.Exception -> L4c
            if (r4 <= 0) goto L50
            r4 = 1
            r0.C = r4     // Catch: java.lang.Exception -> L4c
        L22:
            int r4 = r2.size()     // Catch: java.lang.Exception -> L4c
            if (r3 >= r4) goto L50
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Exception -> L4c
            com.beizi.fusion.model.AdSpacesBean$CallBackStrategyBean r4 = (com.beizi.fusion.model.AdSpacesBean.CallBackStrategyBean) r4     // Catch: java.lang.Exception -> L4c
            java.lang.String r5 = "290.300"
            java.lang.String r6 = r4.getEventCode()     // Catch: java.lang.Exception -> L4c
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> L4c
            if (r5 == 0) goto L49
            java.lang.String r2 = r4.getRate()     // Catch: java.lang.Exception -> L4c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L4c
            boolean r2 = com.beizi.fusion.g.al.a(r2)     // Catch: java.lang.Exception -> L4c
            r0.D = r2     // Catch: java.lang.Exception -> L4c
            goto L50
        L49:
            int r3 = r3 + 1
            goto L22
        L4c:
            r2 = move-exception
            r2.printStackTrace()
        L50:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = r0.f7373e
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r2 = r2.getShakeView()
            r0.f7541x = r2
            if (r2 == 0) goto L70
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r2 = r2.getCoolShakeView()
            r0.f7542y = r2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r2 = r0.f7541x
            int r2 = r2.getClkremove()
            r0.G = r2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r2 = r0.f7541x
            java.lang.String r2 = r2.getTitle()
            r0.I = r2
        L70:
            com.beizi.fusion.g.ag r2 = new com.beizi.fusion.g.ag
            r2.<init>(r1)
            r0.f7543z = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cool_"
            r1.append(r2)
            java.lang.String r2 = r0.f7377i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.work.f.b.<init>(android.content.Context, long, com.beizi.fusion.model.AdSpacesBean$BuyerBean, com.beizi.fusion.model.AdSpacesBean$ForwardBean, com.beizi.fusion.d.e, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        float l4 = av.l(((a) this).f7530n);
        if (this.E < l4 / 4.0f || this.F < l4 / 7.0f) {
            return;
        }
        this.f7378j = com.beizi.fusion.f.a.ADSHOW;
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null && eVar.r() != 2) {
            this.f7372d.b(g());
        }
        if (((a) this).f7536t) {
            return;
        }
        ((a) this).f7536t = true;
        az();
        C();
        D();
        ah();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aV() {
        ag agVar;
        AdSpacesBean.BuyerBean buyerBean;
        try {
            if (this.C && (buyerBean = this.f7373e) != null) {
                this.f7370b.P(buyerBean.getCallBackStrategyUuid());
                au();
            }
            F();
            if (!this.C || this.D) {
                com.beizi.fusion.d.e eVar = this.f7372d;
                if (eVar != null && eVar.r() != 2) {
                    this.f7372d.d(g());
                }
                E();
                ai();
                if (this.G != 0 && (agVar = this.f7543z) != null && this.H != null) {
                    agVar.c();
                    this.H.setVisibility(8);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean aW() {
        try {
            return System.currentTimeMillis() - ((a) this).f7530n.getPackageManager().getPackageInfo(((a) this).f7530n.getPackageName(), 0).firstInstallTime < this.f7542y.getUserProtectTime();
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private boolean aX() {
        AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean = this.f7541x;
        if (shakeViewBean == null) {
            return false;
        }
        return al.a(shakeViewBean.getRenderRate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aY() {
        View downloadTextView;
        try {
            NativeAdResponse nativeAdResponse = this.f7540w;
            if (nativeAdResponse == null || nativeAdResponse.getApkInfo() == null || (downloadTextView = NativeAdUtil.getDownloadTextView(((a) this).f7530n, this.f7540w)) == null) {
                return;
            }
            downloadTextView.setLayoutParams(new FrameLayout.LayoutParams((((a) this).f7535s.getLayoutParams().width * 2) / 3, -2));
            ((a) this).f7535s.addView(downloadTextView, new FrameLayout.LayoutParams(-2, -2, 51));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7539v == null) {
            return;
        }
        al();
    }

    @Override // com.beizi.fusion.work.f.a
    public void aG() {
        if (!av.a("com.beizi.ad.BeiZi")) {
            t();
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.f.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.c(10151);
                }
            }, 10L);
            return;
        }
        u();
        w.a(((a) this).f7530n, this.f7376h);
        v();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(((a) this).f7531o);
        long j4 = ((a) this).f7531o;
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

    @Override // com.beizi.fusion.work.f.a
    public void aH() {
        ((a) this).f7535s = new FrameLayout(((a) this).f7530n);
        UnifiedCustomAd unifiedCustomAd = new UnifiedCustomAd(((a) this).f7530n, this.f7377i, new NativeAdListener() { // from class: com.beizi.fusion.work.f.b.2
            @Override // com.beizi.ad.NativeAdListener
            public void onAdClick() {
            }

            @Override // com.beizi.ad.NativeAdListener
            public void onAdFailed(int i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBeiZiNativeUnifiedAd onAdFailed: ");
                sb.append(i4);
                b.this.a(String.valueOf(i4), i4);
            }

            @Override // com.beizi.ad.NativeAdListener
            public void onAdLoaded(NativeAdResponse nativeAdResponse) {
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                if (b.this.f7539v.getPrice() != null) {
                    try {
                        b bVar = b.this;
                        bVar.a(Double.parseDouble(bVar.f7539v.getPrice()));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                b.this.y();
                if (nativeAdResponse != null) {
                    b.this.f7540w = nativeAdResponse;
                    b.this.aT();
                    return;
                }
                b.this.c(-991);
            }
        });
        this.f7539v = unifiedCustomAd;
        unifiedCustomAd.openAdInNativeBrowser(true);
        this.f7539v.loadAd();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aI() {
        ArrayList<String> texts;
        NativeAdResponse nativeAdResponse = this.f7540w;
        if (nativeAdResponse != null) {
            String headline = nativeAdResponse.getHeadline();
            return (!TextUtils.isEmpty(headline) || (texts = this.f7540w.getTexts()) == null || texts.size() < 1) ? headline : texts.get(0);
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public String aJ() {
        ArrayList<String> texts;
        NativeAdResponse nativeAdResponse = this.f7540w;
        if (nativeAdResponse == null || TextUtils.isEmpty(nativeAdResponse.getBody())) {
            return null;
        }
        String body = this.f7540w.getBody();
        return (!TextUtils.isEmpty(body) || (texts = this.f7540w.getTexts()) == null || texts.size() < 2) ? body : texts.get(1);
    }

    @Override // com.beizi.fusion.work.f.a
    public String aK() {
        NativeAdResponse nativeAdResponse = this.f7540w;
        if (nativeAdResponse == null || TextUtils.isEmpty(nativeAdResponse.getIconUrl())) {
            return null;
        }
        return this.f7540w.getIconUrl();
    }

    @Override // com.beizi.fusion.work.f.a
    public String aL() {
        NativeAdResponse nativeAdResponse = this.f7540w;
        if (nativeAdResponse == null || TextUtils.isEmpty(nativeAdResponse.getImageUrl())) {
            return null;
        }
        return this.f7540w.getImageUrl();
    }

    @Override // com.beizi.fusion.work.f.a
    public List<String> aM() {
        NativeAdResponse nativeAdResponse = this.f7540w;
        if (nativeAdResponse != null) {
            if ((nativeAdResponse.getImageUrls() != null) && (this.f7540w.getImageUrls().size() > 0)) {
                return this.f7540w.getImageUrls();
            }
            return null;
        }
        return null;
    }

    @Override // com.beizi.fusion.work.f.a
    public int aN() {
        return 1;
    }

    @Override // com.beizi.fusion.work.f.a
    public String aO() {
        String str;
        ArrayList<String> texts;
        NativeAdResponse nativeAdResponse = this.f7540w;
        if (nativeAdResponse != null) {
            str = nativeAdResponse.getCallToAction();
            if (TextUtils.isEmpty(str) && (texts = this.f7540w.getTexts()) != null && texts.size() >= 3) {
                str = texts.get(2);
            }
        } else {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "查看详情" : str;
    }

    @Override // com.beizi.fusion.work.f.a
    public boolean aP() {
        return false;
    }

    @Override // com.beizi.fusion.work.f.a
    public ViewGroup aQ() {
        return ((a) this).f7535s;
    }

    @Override // com.beizi.fusion.work.f.a
    public void aS() {
        try {
            if (this.f7540w == null) {
                return;
            }
            LinearLayout linearLayout = new LinearLayout(((a) this).f7530n);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            FrameLayout createLogoImageView = ViewUtil.createLogoImageView(((a) this).f7530n, this.f7540w.getlogoUrl());
            createLogoImageView.setVisibility(0);
            linearLayout.addView(createLogoImageView, new LinearLayout.LayoutParams(-2, -2, 17.0f));
            FrameLayout createAdImageView = ViewUtil.createAdImageView(((a) this).f7530n, this.f7540w.getAdUrl());
            createAdImageView.setVisibility(0);
            linearLayout.addView(createAdImageView, new LinearLayout.LayoutParams(-2, -2, 17.0f));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) createAdImageView.getLayoutParams();
            layoutParams.setMargins(5, 0, 0, 0);
            layoutParams.gravity = 17;
            createAdImageView.setLayoutParams(layoutParams);
            ((a) this).f7535s.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 85));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            int a5 = av.a(((a) this).f7530n, 6.0f);
            layoutParams2.setMargins(0, 0, a5, a5);
            linearLayout.setLayoutParams(layoutParams2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.beizi.fusion.work.f.a, com.beizi.fusion.work.a
    public String g() {
        return "BEIZI";
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        UnifiedCustomAd unifiedCustomAd = this.f7539v;
        if (unifiedCustomAd != null) {
            unifiedCustomAd.cancel();
        }
        ag agVar = this.f7543z;
        if (agVar != null) {
            agVar.c();
        }
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        UnifiedCustomAd unifiedCustomAd = this.f7539v;
        if (unifiedCustomAd == null) {
            return null;
        }
        return unifiedCustomAd.getPrice();
    }

    private boolean b(final AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        long longValue = ((Long) at.b(((a) this).f7530n, this.A, 0L)).longValue();
        if (longValue != 0) {
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            if (currentTimeMillis < this.f7542y.getCoolTime()) {
                new Handler().postDelayed(new Runnable() { // from class: com.beizi.fusion.work.f.b.8
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f7543z.a(shakeViewBean);
                    }
                }, this.f7542y.getCoolTime() - currentTimeMillis);
                return true;
            }
            aq.a().a(this.A);
        }
        return false;
    }

    @Override // com.beizi.fusion.work.f.a
    public void a(List<View> list) {
        try {
            if (((a) this).f7535s != null) {
                aS();
                ((a) this).f7535s.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.beizi.fusion.work.f.b.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        try {
                            FrameLayout frameLayout = ((a) b.this).f7535s;
                            if (frameLayout != null) {
                                frameLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                b.this.aY();
                                b bVar = b.this;
                                bVar.E = ((a) bVar).f7535s.getWidth();
                                b bVar2 = b.this;
                                bVar2.F = ((a) bVar2).f7535s.getHeight();
                                b bVar3 = b.this;
                                bVar3.a(bVar3.E, b.this.F, b.this.F);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                if (list != null && list.size() > 0) {
                    NativeAdUtil.registerTracking(this.f7540w, ((a) this).f7535s, list, new NativeAdEventListener() { // from class: com.beizi.fusion.work.f.b.4
                        @Override // com.beizi.ad.internal.nativead.NativeAdEventListener
                        public void onAdWasClicked() {
                            b.this.aV();
                        }

                        @Override // com.beizi.ad.internal.nativead.NativeAdEventListener
                        public void onAdWillLeaveApplication() {
                        }
                    });
                } else {
                    NativeAdUtil.registerTracking(this.f7540w, ((a) this).f7535s, new NativeAdEventListener() { // from class: com.beizi.fusion.work.f.b.5
                        @Override // com.beizi.ad.internal.nativead.NativeAdEventListener
                        public void onAdWasClicked() {
                            b.this.aV();
                        }

                        @Override // com.beizi.ad.internal.nativead.NativeAdEventListener
                        public void onAdWillLeaveApplication() {
                        }
                    });
                }
                NativeAdUtil.registerShow(this.f7540w, ((a) this).f7535s, new NativeAdShownListener() { // from class: com.beizi.fusion.work.f.b.6
                    @Override // com.beizi.ad.internal.nativead.NativeAdShownListener
                    public void onAdShown() {
                        b.this.aU();
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private AdSpacesBean.BuyerBean.OrderDataShakeViewBean a(List<AdSpacesBean.BuyerBean.OrderDataShakeViewBean> list, String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i4, final int i5, int i6) {
        AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean;
        try {
            if (!aX() || (shakeViewBean = this.f7541x) == null || this.f7543z == null || shakeViewBean.getPosition() == null) {
                return;
            }
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.G(this.f7541x.getShakeViewUuid());
                au();
            }
            AdSpacesBean.BuyerBean.OrderDataShakeViewBean a5 = a(this.f7541x.getOrderData(), this.f7539v.getAdId());
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean2 = null;
            if (a5 != null && a5.getShakeView() != null) {
                shakeViewBean2 = a5.getShakeView();
            }
            if (i5 <= 0) {
                i5 = i6;
            }
            View a6 = this.f7543z.a(av.b(((a) this).f7530n, i4), av.b(((a) this).f7530n, i5), this.f7541x.getPosition(), this.I);
            this.H = a6;
            if (a6 != null) {
                ViewGroup.LayoutParams layoutParams = a6.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
                    layoutParams2.leftMargin = marginLayoutParams.leftMargin;
                    layoutParams2.topMargin = marginLayoutParams.topMargin;
                    AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean3 = this.f7541x;
                    if (shakeViewBean3 != null && shakeViewBean3.getIsHideAnim() == 0) {
                        ((a) this).f7535s.addView(this.H, layoutParams2);
                    }
                }
            }
            a(shakeViewBean2);
            this.f7543z.a(new ag.a() { // from class: com.beizi.fusion.work.f.b.7
                @Override // com.beizi.fusion.g.ag.a
                public void a() {
                    try {
                        if (ax.a(((a) b.this).f7535s)) {
                            int[] iArr = new int[2];
                            ((a) b.this).f7535s.getLocationOnScreen(iArr);
                            int[] a7 = al.a(i4 / 2, i5 / 2);
                            NativeAdUtil.handleClick(b.this.f7540w, ((a) b.this).f7535s, String.valueOf(a7[0]), String.valueOf(a7[1]), String.valueOf(a7[0] + iArr[0]), String.valueOf(a7[1] + iArr[1]), 2);
                            if (!b.this.B || b.this.f7542y == null) {
                                return;
                            }
                            b.this.B = false;
                            b.this.f7543z.a(b.this.f7542y);
                            b bVar2 = b.this;
                            at.a(((a) bVar2).f7530n, bVar2.A, Long.valueOf(System.currentTimeMillis()));
                            aq.a().a(b.this.A, System.currentTimeMillis());
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
            AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean = this.f7542y;
            if (coolShakeViewBean != null) {
                this.f7543z.a(coolShakeViewBean, this.A);
            }
            this.f7543z.a(((a) this).f7535s);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        if (shakeViewBean == null) {
            try {
                shakeViewBean = this.f7541x;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (this.f7542y == null) {
            this.B = true;
            this.f7543z.a(shakeViewBean);
        } else if (b(shakeViewBean)) {
            this.f7543z.a(this.f7542y);
        } else if (aW()) {
            this.f7543z.a(this.f7542y);
        } else {
            this.B = true;
            this.f7543z.a(shakeViewBean);
        }
    }
}
