package com.beizi.fusion.work.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.beizi.ad.NativeAdListener;
import com.beizi.ad.NativeAdResponse;
import com.beizi.ad.UnifiedCustomAd;
import com.beizi.ad.internal.nativead.NativeAdEventListener;
import com.beizi.ad.internal.nativead.NativeAdShownListener;
import com.beizi.ad.internal.nativead.NativeAdUtil;
import com.beizi.ad.internal.utilities.ImageManager;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ag;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.aq;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.ax;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.dialog.dislike.a;
import com.beizi.fusion.work.splash.SplashContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: BaseBeiZiNativeWorker.java */
/* loaded from: classes2.dex */
public class b extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {
    protected ag A;
    protected AdSpacesBean.BuyerBean.DislikeConfigBean D;
    protected AdSpacesBean.BuyerBean.DislikeConfigBean E;
    protected NativeAdResponse K;
    protected UnifiedCustomAd L;
    protected View M;
    protected AdSpacesBean.ComplainBean N;

    /* renamed from: n  reason: collision with root package name */
    protected Context f7796n;

    /* renamed from: o  reason: collision with root package name */
    protected String f7797o;

    /* renamed from: p  reason: collision with root package name */
    protected long f7798p;

    /* renamed from: q  reason: collision with root package name */
    protected long f7799q;

    /* renamed from: r  reason: collision with root package name */
    protected float f7800r;

    /* renamed from: s  reason: collision with root package name */
    protected float f7801s;

    /* renamed from: t  reason: collision with root package name */
    protected ViewGroup f7802t;

    /* renamed from: u  reason: collision with root package name */
    protected View f7803u;

    /* renamed from: v  reason: collision with root package name */
    protected List<AdSpacesBean.RenderViewBean> f7804v;

    /* renamed from: w  reason: collision with root package name */
    protected AdSpacesBean.RenderViewBean f7805w;

    /* renamed from: x  reason: collision with root package name */
    protected List<Pair<String, Integer>> f7806x;

    /* renamed from: y  reason: collision with root package name */
    protected AdSpacesBean.BuyerBean.ShakeViewBean f7807y;

    /* renamed from: z  reason: collision with root package name */
    protected AdSpacesBean.BuyerBean.CoolShakeViewBean f7808z;
    protected String B = null;
    protected boolean C = false;
    protected float F = 0.0f;
    protected float G = 0.0f;
    protected float H = 0.0f;
    protected float I = 0.0f;
    protected String J = null;
    protected String O = null;
    protected boolean P = false;
    protected boolean Q = false;

    public b(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, float f5, float f6) {
        this.f7796n = context;
        this.f7797o = str;
        this.f7798p = j4;
        this.f7799q = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f7800r = f5;
        this.f7801s = f6;
        this.f7802t = new SplashContainer(context);
        r();
    }

    private boolean aN() {
        try {
            return System.currentTimeMillis() - this.f7796n.getPackageManager().getPackageInfo(this.f7796n.getPackageName(), 0).firstInstallTime < this.f7808z.getUserProtectTime();
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private void aO() {
        AdSpacesBean.BuyerBean.DislikeConfigBean b5;
        AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfig = this.f7373e.getDislikeConfig();
        this.D = dislikeConfig;
        if (dislikeConfig == null || (b5 = b(dislikeConfig.getOrderData(), this.L.getAdId())) == null) {
            return;
        }
        this.E = b5;
    }

    private boolean aP() {
        try {
            AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfigBean = this.E;
            if (dislikeConfigBean != null) {
                return dislikeConfigBean.getIsShowDialog() == 1;
            }
            AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfigBean2 = this.D;
            return dislikeConfigBean2 != null && dislikeConfigBean2.getIsShowDialog() == 1;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    private boolean aQ() {
        AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean = this.f7807y;
        if (shakeViewBean == null) {
            return false;
        }
        return al.a(shakeViewBean.getRenderRate());
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.L == null) {
            return;
        }
        al();
    }

    public void a(NativeAdResponse nativeAdResponse) {
    }

    public void aG() {
        try {
            if (Y()) {
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
                    if (this.f7803u != null) {
                        this.f7372d.a(g(), this.f7803u);
                    } else {
                        this.f7372d.a(10140);
                    }
                } else if (hVar == com.beizi.fusion.d.h.FAIL) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("other worker shown,");
                    sb2.append(g());
                    sb2.append(" remove");
                }
            } else {
                O();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void aH() {
        View view;
        try {
            NativeAdResponse nativeAdResponse = this.K;
            if (nativeAdResponse != null && (view = this.M) != null) {
                NativeAdUtil.registerTracking(nativeAdResponse, view, new NativeAdEventListener() { // from class: com.beizi.fusion.work.nativead.b.5

                    /* renamed from: a  reason: collision with root package name */
                    boolean f7816a = false;

                    @Override // com.beizi.ad.internal.nativead.NativeAdEventListener
                    public void onAdWasClicked() {
                        b bVar = b.this;
                        if (bVar.P && ((com.beizi.fusion.work.a) bVar).f7373e != null) {
                            ((com.beizi.fusion.work.a) b.this).f7370b.P(((com.beizi.fusion.work.a) b.this).f7373e.getCallBackStrategyUuid());
                            b.this.au();
                        }
                        b.this.F();
                        b bVar2 = b.this;
                        if (!bVar2.P || bVar2.Q) {
                            if (((com.beizi.fusion.work.a) bVar2).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                                ((com.beizi.fusion.work.a) b.this).f7372d.d(b.this.g());
                            }
                            b.this.E();
                            b.this.ai();
                            UnifiedCustomAd unifiedCustomAd = b.this.L;
                            if (unifiedCustomAd != null) {
                                unifiedCustomAd.setTouchAreaNormal();
                            }
                        }
                    }

                    @Override // com.beizi.ad.internal.nativead.NativeAdEventListener
                    public void onAdWillLeaveApplication() {
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void aI() {
        View view;
        try {
            NativeAdResponse nativeAdResponse = this.K;
            if (nativeAdResponse != null && (view = this.M) != null) {
                NativeAdUtil.registerShow(nativeAdResponse, view, new NativeAdShownListener() { // from class: com.beizi.fusion.work.nativead.b.6
                    @Override // com.beizi.ad.internal.nativead.NativeAdShownListener
                    public void onAdShown() {
                        ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                        if (((com.beizi.fusion.work.a) b.this).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) b.this).f7372d.b(b.this.g());
                        }
                        b.this.C();
                        b.this.D();
                        b.this.ah();
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean aJ() {
        AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfigBean = this.E;
        if (dislikeConfigBean != null) {
            return dislikeConfigBean.getIsHide() == 0;
        }
        AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfigBean2 = this.D;
        return dislikeConfigBean2 != null && dislikeConfigBean2.getIsHide() == 0;
    }

    public boolean aK() {
        AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfigBean = this.E;
        if (dislikeConfigBean != null) {
            return al.a(dislikeConfigBean.getRandomNum());
        }
        AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfigBean2 = this.D;
        if (dislikeConfigBean2 != null) {
            return al.a(dislikeConfigBean2.getRandomNum());
        }
        return false;
    }

    public boolean aL() {
        long longValue = ((Long) at.b(this.f7796n, this.J, 0L)).longValue();
        return this.D == null || longValue == 0 || System.currentTimeMillis() - longValue >= this.D.getCoolTime();
    }

    public void aM() {
        try {
            if (!aP()) {
                com.beizi.fusion.d.e eVar = this.f7372d;
                if (eVar != null && eVar.r() != 2) {
                    this.f7372d.b(g(), this.f7803u);
                }
                G();
                return;
            }
            a.C0202a c0202a = new a.C0202a(this.f7796n);
            c0202a.a(new a.c() { // from class: com.beizi.fusion.work.nativead.b.9
                @Override // com.beizi.fusion.widget.dialog.dislike.a.c
                public void a() {
                    try {
                        if (((com.beizi.fusion.work.a) b.this).f7372d != null && ((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) b.this).f7372d.b(b.this.g(), b.this.f7803u);
                        }
                        b.this.G();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
            c0202a.a().show();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b() {
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "BEIZI";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        r7.Q = com.beizi.fusion.g.al.a(java.lang.Integer.parseInt(r4.getRate()));
     */
    @Override // com.beizi.fusion.work.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.work.nativead.b.d():void");
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        UnifiedCustomAd unifiedCustomAd = this.L;
        if (unifiedCustomAd == null) {
            return null;
        }
        return unifiedCustomAd.getPrice();
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        AdSpacesBean.BuyerBean.ShakeViewBean shakeView = this.f7373e.getShakeView();
        this.f7807y = shakeView;
        if (shakeView != null) {
            this.f7808z = shakeView.getCoolShakeView();
        }
        this.A = new ag(this.f7796n);
        this.B = "cool_" + this.f7377i;
        this.J = "dl_cool_" + this.f7377i;
        if (this.f7800r <= 0.0f) {
            this.f7800r = av.j(this.f7796n);
        }
        if (this.f7801s <= 0.0f) {
            this.f7801s = 0.0f;
        }
        UnifiedCustomAd unifiedCustomAd = new UnifiedCustomAd(this.f7796n, this.f7377i, new NativeAdListener() { // from class: com.beizi.fusion.work.nativead.b.2
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
                if (b.this.L.getPrice() != null) {
                    try {
                        b bVar = b.this;
                        bVar.a(Double.parseDouble(bVar.L.getPrice()));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                b.this.y();
                if (nativeAdResponse == null) {
                    b.this.c(-991);
                    return;
                }
                b bVar2 = b.this;
                bVar2.K = nativeAdResponse;
                bVar2.b();
            }
        });
        this.L = unifiedCustomAd;
        unifiedCustomAd.openAdInNativeBrowser(true);
        this.L.loadAd();
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        UnifiedCustomAd unifiedCustomAd = this.L;
        if (unifiedCustomAd != null) {
            unifiedCustomAd.cancel();
        }
        ag agVar = this.A;
        if (agVar != null) {
            agVar.c();
        }
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7803u;
    }

    private boolean b(final AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        long longValue = ((Long) at.b(this.f7796n, this.B, 0L)).longValue();
        if (longValue != 0) {
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            if (currentTimeMillis < this.f7808z.getCoolTime()) {
                new Handler().postDelayed(new Runnable() { // from class: com.beizi.fusion.work.nativead.b.8
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.A.a(shakeViewBean);
                    }
                }, this.f7808z.getCoolTime() - currentTimeMillis);
                return true;
            }
            aq.a().a(this.B);
        }
        return false;
    }

    public void a(final TextView textView, final ImageView imageView) {
        ArrayList<String> texts;
        try {
            NativeAdResponse nativeAdResponse = this.K;
            if (nativeAdResponse == null) {
                return;
            }
            String callToAction = nativeAdResponse.getCallToAction();
            if (TextUtils.isEmpty(callToAction) && (texts = this.K.getTexts()) != null && texts.size() >= 3) {
                callToAction = texts.get(2);
            }
            if (TextUtils.isEmpty(callToAction)) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else if (callToAction.startsWith(com.facebook.common.util.f.f10923a)) {
                ImageManager.with(null).getBitmap(callToAction, new ImageManager.BitmapLoadedListener() { // from class: com.beizi.fusion.work.nativead.b.3
                    @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                    public void onBitmapLoadFailed() {
                    }

                    @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                    public void onBitmapLoaded(Bitmap bitmap) {
                        try {
                            TextView textView2 = textView;
                            if (textView2 != null) {
                                textView2.setVisibility(8);
                            }
                            ImageView imageView2 = imageView;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                imageView.setImageBitmap(bitmap);
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
            } else {
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText(callToAction);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private AdSpacesBean.BuyerBean.DislikeConfigBean b(List<AdSpacesBean.BuyerBean.OrderDataDislikeConfigBean> list, String str) {
        AdSpacesBean.BuyerBean.DislikeConfigBean dislike;
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataDislikeConfigBean orderDataDislikeConfigBean : list) {
                List<String> orderList = orderDataDislikeConfigBean.getOrderList();
                if (orderList != null && orderList.contains(str) && (dislike = orderDataDislikeConfigBean.getDislike()) != null) {
                    return dislike;
                }
            }
        }
        return null;
    }

    public void a(final View view) {
        AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfigBean;
        try {
            int a5 = av.a(this.f7796n, this.f7800r);
            float f5 = this.f7801s;
            int a6 = f5 > 0.0f ? av.a(this.f7796n, f5) : -2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a5, a6);
            ViewGroup viewGroup = this.f7802t;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                StringBuilder sb = new StringBuilder();
                sb.append("mNativeAd != null ? ");
                boolean z4 = true;
                sb.append(this.L != null);
                sb.append(",renderViewBean != null ? ");
                if (this.f7805w == null) {
                    z4 = false;
                }
                sb.append(z4);
                af.a("BeiZis", sb.toString());
                this.f7802t.addView(this.M, layoutParams);
                this.M.measure(0, 0);
                a(this.K, a5, a6, this.M.getMeasuredHeight());
                aO();
                com.beizi.fusion.b.b bVar = this.f7370b;
                if (bVar != null && (dislikeConfigBean = this.D) != null) {
                    bVar.Q(dislikeConfigBean.getDislikeUuid());
                    au();
                }
                if (aJ()) {
                    a(this.K);
                }
                ViewGroup viewGroup2 = this.f7802t;
                this.f7803u = viewGroup2;
                this.A.a(viewGroup2);
            }
            UnifiedCustomAd unifiedCustomAd = this.L;
            if (unifiedCustomAd == null || this.f7805w == null) {
                return;
            }
            unifiedCustomAd.setOrderOptimizeList(this.f7806x);
            this.L.setAdOptimizePercent(this.f7805w.getOptimizePercent());
            af.a("BeiZis", "percent = " + this.f7805w.getOptimizePercent());
            this.f7802t.post(new Runnable() { // from class: com.beizi.fusion.work.nativead.b.4
                @Override // java.lang.Runnable
                public void run() {
                    b bVar2 = b.this;
                    UnifiedCustomAd unifiedCustomAd2 = bVar2.L;
                    int optimizeSize = bVar2.f7805w.getOptimizeSize();
                    View view2 = view;
                    b bVar3 = b.this;
                    unifiedCustomAd2.optimizeClickArea(optimizeSize, view2, bVar3.f7802t, bVar3.f7805w.getDirection());
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
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

    private void a(final NativeAdResponse nativeAdResponse, final int i4, final int i5, int i6) {
        AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean;
        try {
            if (!aQ() || (shakeViewBean = this.f7807y) == null || this.A == null || shakeViewBean.getPosition() == null) {
                return;
            }
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.G(this.f7807y.getShakeViewUuid());
                au();
            }
            AdSpacesBean.BuyerBean.OrderDataShakeViewBean a5 = a(this.f7807y.getOrderData(), this.L.getAdId());
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean2 = null;
            if (a5 != null && a5.getShakeView() != null) {
                shakeViewBean2 = a5.getShakeView();
            }
            if (i5 <= 0) {
                i5 = i6;
            }
            View a6 = this.A.a(av.b(this.f7796n, i4), av.b(this.f7796n, i5), this.f7807y.getPosition());
            if (a6 != null) {
                ViewGroup.LayoutParams layoutParams = a6.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
                    layoutParams2.leftMargin = marginLayoutParams.leftMargin;
                    layoutParams2.topMargin = marginLayoutParams.topMargin;
                    AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean3 = this.f7807y;
                    if (shakeViewBean3 != null && shakeViewBean3.getIsHideAnim() == 0) {
                        this.f7802t.addView(a6, layoutParams2);
                    }
                }
            }
            a(shakeViewBean2);
            this.A.a(new ag.a() { // from class: com.beizi.fusion.work.nativead.b.7
                @Override // com.beizi.fusion.g.ag.a
                public void a() {
                    AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean;
                    if (ax.a(b.this.f7803u)) {
                        int[] iArr = new int[2];
                        b.this.f7803u.getLocationOnScreen(iArr);
                        int[] a7 = al.a(i4 / 2, i5 / 2);
                        NativeAdUtil.handleClick(nativeAdResponse, b.this.f7803u, String.valueOf(a7[0]), String.valueOf(a7[1]), String.valueOf(a7[0] + iArr[0]), String.valueOf(a7[1] + iArr[1]), 2);
                        b bVar2 = b.this;
                        if (!bVar2.C || (coolShakeViewBean = bVar2.f7808z) == null) {
                            return;
                        }
                        bVar2.C = false;
                        bVar2.A.a(coolShakeViewBean);
                        b bVar3 = b.this;
                        at.a(bVar3.f7796n, bVar3.B, Long.valueOf(System.currentTimeMillis()));
                        aq.a().a(b.this.B, System.currentTimeMillis());
                    }
                }
            });
            AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean = this.f7808z;
            if (coolShakeViewBean != null) {
                this.A.a(coolShakeViewBean, this.B);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        if (shakeViewBean == null) {
            shakeViewBean = this.f7807y;
        }
        if (this.f7808z == null) {
            this.C = true;
            this.A.a(shakeViewBean);
        } else if (b(shakeViewBean)) {
            this.A.a(this.f7808z);
        } else if (aN()) {
            this.A.a(this.f7808z);
        } else {
            this.C = true;
            this.A.a(shakeViewBean);
        }
    }
}
