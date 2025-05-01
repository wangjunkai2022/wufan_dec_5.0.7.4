package com.beizi.fusion.work.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.CircleProgressView;
import com.beizi.fusion.widget.SkipView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CSJAdError;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: CsjSplashWorker.java */
/* loaded from: classes2.dex */
public class e extends com.beizi.fusion.work.a {
    private long F;
    private boolean G;
    private CircleProgressView H;
    private AdSpacesBean.PositionBean I;
    private AdSpacesBean.PositionBean J;
    private long K;
    private float L;
    private float M;
    private AdSpacesBean.RenderViewBean N;
    private int O;
    private int P;
    private String Q;
    private String R;
    private String S;
    private CSJSplashAd T;
    private long U;
    private int V;
    private int W;

    /* renamed from: n  reason: collision with root package name */
    private Context f8036n;

    /* renamed from: o  reason: collision with root package name */
    private String f8037o;

    /* renamed from: p  reason: collision with root package name */
    private long f8038p;

    /* renamed from: q  reason: collision with root package name */
    private View f8039q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup f8040r;

    /* renamed from: s  reason: collision with root package name */
    private ViewGroup f8041s;

    /* renamed from: t  reason: collision with root package name */
    private TTAdNative f8042t;

    /* renamed from: u  reason: collision with root package name */
    private CountDownTimer f8043u;

    /* renamed from: v  reason: collision with root package name */
    private View f8044v;

    /* renamed from: w  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8045w;

    /* renamed from: x  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8046x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8047y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private boolean f8048z = false;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private long E = 5000;

    public e(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, int i4, int i5, com.beizi.fusion.d.e eVar) {
        this.f8036n = context;
        this.f8037o = str;
        this.f8038p = j4;
        this.f8039q = view;
        this.f8040r = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f8041s = new SplashContainer(context);
        this.f8045w = list;
        this.V = i4;
        this.W = i5;
        r();
    }

    private void aG() {
        CountDownTimer countDownTimer = this.f8043u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(100 + this.E, 50L) { // from class: com.beizi.fusion.work.splash.e.5
            @Override // android.os.CountDownTimer
            public void onFinish() {
                e.this.ac();
                e.this.G();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                if (((com.beizi.fusion.work.a) e.this).f7372d == null || ((com.beizi.fusion.work.a) e.this).f7372d.r() == 2) {
                    return;
                }
                ((com.beizi.fusion.work.a) e.this).f7372d.a(j4);
            }
        };
        this.f8043u = countDownTimer2;
        countDownTimer2.start();
    }

    private void aH() {
        for (int i4 = 0; i4 < this.f8045w.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f8045w.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.f8047y.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.f8046x.add(renderViewBean);
            }
        }
        this.F = 0L;
        if (this.f8047y.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean2 = this.f8047y.get(0);
            this.N = renderViewBean2;
            if (renderViewBean2 != null) {
                this.J = renderViewBean2.getTapPosition();
                this.I = this.N.getLayerPosition();
                long delayDisplaySkipButton = this.N.getDelayDisplaySkipButton();
                this.K = delayDisplaySkipButton;
                if (delayDisplaySkipButton < 0) {
                    this.K = 0L;
                }
                long skipViewTotalTime = this.N.getSkipViewTotalTime();
                if (skipViewTotalTime > 0) {
                    this.E = skipViewTotalTime;
                }
                long skipUnavailableTime = this.N.getSkipUnavailableTime();
                if (skipUnavailableTime > 0) {
                    this.F = skipUnavailableTime;
                }
                this.O = this.N.getShowCountDown();
                this.P = this.N.getShowBorder();
                String skipText = this.N.getSkipText();
                this.Q = skipText;
                if (TextUtils.isEmpty(skipText)) {
                    this.Q = "跳过";
                }
                String textColor = this.N.getTextColor();
                this.R = textColor;
                if (TextUtils.isEmpty(textColor)) {
                    this.R = "#FFFFFF";
                }
                String countDownColor = this.N.getCountDownColor();
                this.S = countDownColor;
                if (TextUtils.isEmpty(countDownColor)) {
                    this.S = "#FFFFFF";
                }
                List<AdSpacesBean.PassPolicyBean> passPolicy = this.N.getPassPolicy();
                if (passPolicy != null && passPolicy.size() > 0) {
                    for (AdSpacesBean.PassPolicyBean passPolicyBean : passPolicy) {
                        String passType = passPolicyBean.getPassType();
                        int passPercent = passPolicyBean.getPassPercent();
                        passType.hashCode();
                        char c5 = 65535;
                        switch (passType.hashCode()) {
                            case 601561940:
                                if (passType.equals("RANDOMPASS")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                            case 1028793094:
                                if (passType.equals("WAITPASS")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                            case 1122973890:
                                if (passType.equals("LAYERPASS")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c5) {
                            case 0:
                                this.A = al.a(passPercent);
                                break;
                            case 1:
                                this.f8048z = al.a(passPercent);
                                break;
                            case 2:
                                AdSpacesBean.PositionBean positionBean = this.I;
                                if (positionBean != null && this.J != null) {
                                    double centerX = positionBean.getCenterX();
                                    double centerY = this.I.getCenterY();
                                    double width = this.I.getWidth();
                                    double height = this.I.getHeight();
                                    double centerX2 = this.J.getCenterX();
                                    double centerY2 = this.J.getCenterY();
                                    double width2 = this.J.getWidth();
                                    double height2 = this.J.getHeight();
                                    if ((centerX > 0.0d && centerX2 > 0.0d && centerX != centerX2) || ((centerY > 0.0d && centerY2 > 0.0d && centerY != centerY2) || ((width > 0.0d && width2 > 0.0d && width != width2) || (height > 0.0d && height2 > 0.0d && height != height2)))) {
                                        this.B = al.a(passPercent);
                                    }
                                    if (width2 * height2 < width * height) {
                                        this.C = true;
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }
            }
        }
        if (this.f8046x.size() > 0) {
            Collections.sort(this.f8046x, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.e.6
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(AdSpacesBean.RenderViewBean renderViewBean3, AdSpacesBean.RenderViewBean renderViewBean4) {
                    return renderViewBean4.getLevel() - renderViewBean3.getLevel();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aI() {
        if (this.f8048z) {
            Q();
        }
        if (this.A) {
            R();
        }
        if (this.B) {
            S();
        }
        if (this.C) {
            T();
        }
        aJ();
    }

    private void aJ() {
        CountDownTimer countDownTimer = this.f8043u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final long j4 = this.E - this.F;
        CountDownTimer countDownTimer2 = new CountDownTimer(this.E + 100, 50L) { // from class: com.beizi.fusion.work.splash.e.7

            /* renamed from: a  reason: collision with root package name */
            boolean f8056a = false;

            @Override // android.os.CountDownTimer
            public void onFinish() {
                e.this.ac();
                e.this.G();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j5) {
                if (!this.f8056a) {
                    e.this.aN();
                    this.f8056a = true;
                }
                if (e.this.F > 0 && e.this.F <= e.this.E) {
                    if (e.this.f8048z) {
                        long j6 = j4;
                        if (j6 <= 0 || j5 <= j6) {
                            e.this.D = false;
                            e.this.f8039q.setAlpha(1.0f);
                        } else {
                            e.this.D = true;
                            e.this.f8039q.setAlpha(0.2f);
                        }
                    }
                    if (e.this.F == e.this.E) {
                        e.this.f8039q.setEnabled(false);
                    } else {
                        e.this.f8039q.setEnabled(true);
                    }
                }
                if (e.this.G && e.this.f8039q != null) {
                    e.this.e(Math.round(((float) j5) / 1000.0f));
                }
                if (((com.beizi.fusion.work.a) e.this).f7372d == null || ((com.beizi.fusion.work.a) e.this).f7372d.r() == 2) {
                    return;
                }
                ((com.beizi.fusion.work.a) e.this).f7372d.a(j5);
            }
        };
        this.f8043u = countDownTimer2;
        countDownTimer2.start();
        aM();
    }

    private void aK() {
        ViewGroup viewGroup;
        if (this.G) {
            if (this.I != null && (viewGroup = this.f8040r) != null) {
                float f5 = this.L;
                float height = viewGroup.getHeight();
                if (height == 0.0f) {
                    height = this.M - av.a(this.f8036n, 100.0f);
                }
                double d5 = f5;
                Double.isNaN(d5);
                int width = (int) (d5 * this.I.getWidth() * 0.01d);
                if (this.I.getHeight() >= 12.0d) {
                    double d6 = width;
                    Double.isNaN(d6);
                    int height2 = (int) (d6 * this.I.getHeight() * 0.01d);
                    double d7 = height2;
                    Double.isNaN(d7);
                    int paddingHeight = (int) (d7 * this.N.getPaddingHeight() * 0.01d);
                    if (paddingHeight < 0) {
                        paddingHeight = 0;
                    }
                    ((SkipView) this.f8039q).setData(this.P, paddingHeight);
                    e(5);
                    this.f8041s.addView(this.f8039q, new FrameLayout.LayoutParams(width, height2));
                    float centerX = (f5 * ((float) (this.I.getCenterX() * 0.01d))) - (width / 2);
                    float centerY = (height * ((float) (this.I.getCenterY() * 0.01d))) - (height2 / 2);
                    this.f8039q.setX(centerX);
                    this.f8039q.setY(centerY);
                    View view = this.f8039q;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                aL();
                return;
            }
            aL();
            return;
        }
        View view2 = this.f8039q;
        if (view2 != null) {
            view2.setVisibility(0);
            this.f8039q.setAlpha(1.0f);
        }
    }

    private void aL() {
        double d5 = this.L;
        Double.isNaN(d5);
        int i4 = (int) (d5 * 0.15d);
        double d6 = i4;
        Double.isNaN(d6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, (int) (d6 * 0.45d));
        layoutParams.gravity = 53;
        layoutParams.topMargin = av.a(this.f8036n, 20.0f);
        layoutParams.rightMargin = av.a(this.f8036n, 20.0f);
        ViewGroup viewGroup = this.f8041s;
        if (viewGroup != null) {
            viewGroup.addView(this.f8039q, layoutParams);
        }
        View view = this.f8039q;
        if (view != null) {
            this.O = 1;
            this.P = 1;
            ((SkipView) view).setData(1, 0);
            ((SkipView) this.f8039q).setText(String.format("跳过 %d", 5));
            this.f8039q.setVisibility(0);
        }
    }

    private void aM() {
        CircleProgressView circleProgressView = new CircleProgressView(this.f8036n);
        this.H = circleProgressView;
        circleProgressView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.e.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.H();
                if (e.this.f8043u != null) {
                    e.this.f8043u.cancel();
                }
                e.this.ac();
            }
        });
        this.H.setAlpha(0.0f);
        this.f8041s.addView(this.H, new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aN() {
        int[] iArr;
        float f5;
        float f6;
        ViewGroup viewGroup;
        this.f8039q.getLocationOnScreen(new int[2]);
        if (this.J != null) {
            float f7 = this.L;
            float height = this.f8040r != null ? viewGroup.getHeight() : 0.0f;
            if (height == 0.0f) {
                height = this.M - av.a(this.f8036n, 100.0f);
            }
            double d5 = f7;
            Double.isNaN(d5);
            int width = (int) (d5 * this.J.getWidth() * 0.01d);
            double d6 = width;
            Double.isNaN(d6);
            int height2 = (int) (d6 * this.J.getHeight() * 0.01d);
            ViewGroup.LayoutParams layoutParams = this.H.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height2;
            this.H.setLayoutParams(layoutParams);
            f5 = (f7 * ((float) (this.J.getCenterX() * 0.01d))) - (width / 2);
            f6 = (height * ((float) (this.J.getCenterY() * 0.01d))) - (height2 / 2);
        } else {
            float pivotX = (iArr[0] + this.f8039q.getPivotX()) - (this.H.getWidth() / 2);
            float pivotY = (iArr[1] + this.f8039q.getPivotY()) - (this.H.getHeight() / 2);
            f5 = pivotX;
            f6 = pivotY;
        }
        this.H.setX(f5);
        this.H.setY(f6);
    }

    @Override // com.beizi.fusion.work.a
    public void ay() {
        v();
        e();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "CSJ";
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null || this.f8036n == null) {
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.e.1
                        @Override // java.lang.Runnable
                        public void run() {
                            e.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                u.a(this, this.f8036n, this.f7376h, this.f7373e.getDirectDownload());
                this.f7370b.t(TTAdSdk.getAdManager().getSDKVersion());
                au();
            }
        }
        this.U = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            this.U = Math.max(this.U, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f8045w;
        boolean z4 = list != null && list.size() > 0;
        this.G = z4;
        if (z4) {
            aH();
        }
        this.L = av.l(this.f8036n);
        this.M = av.m(this.f8036n);
    }

    @Override // com.beizi.fusion.work.a
    public void e() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.U);
        long j4 = this.U;
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
    public void f() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" out make show ad");
        b();
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
        AdSlot build;
        w();
        ag();
        this.f8044v = null;
        com.beizi.fusion.d.g.a().a(g(), false, false);
        if (av()) {
            return;
        }
        if (this.V == 0) {
            this.V = (int) av.j(this.f8036n);
        }
        if (this.W == 0) {
            this.W = (int) av.k(this.f8036n);
        }
        int a5 = av.a(this.f8036n, this.W);
        int a6 = av.a(this.f8036n, this.V);
        af.a("BeiZis", "splashWidthPx = " + a6 + ",splashHeightPx = " + a5);
        this.f8042t = u.a().createAdNative(this.f8036n);
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null && eVar.x()) {
            build = new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setImageAcceptedSize(a6, a5).setExpressViewAcceptedSize(this.V, this.W).build();
        } else {
            build = new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setImageAcceptedSize(a6, a5).setExpressViewAcceptedSize(this.V, this.W).build();
        }
        this.f8042t.loadSplashAd(build, new TTAdNative.CSJSplashAdListener() { // from class: com.beizi.fusion.work.splash.e.2
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashLoadFail(CSJAdError cSJAdError) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjSplash onSplashLoadFail code:");
                sb.append(cSJAdError.getCode());
                sb.append(";");
                sb.append(cSJAdError.getMsg());
                e.this.a(cSJAdError.getMsg(), cSJAdError.getCode());
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashLoadSuccess(CSJSplashAd cSJSplashAd) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashRenderFail(CSJSplashAd cSJSplashAd, CSJAdError cSJAdError) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjSplash onSplashRenderFail code:");
                sb.append(cSJAdError.getCode());
                sb.append(";");
                sb.append(cSJAdError.getMsg());
                e.this.a(cSJAdError.getMsg(), cSJAdError.getCode());
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashRenderSuccess(CSJSplashAd cSJSplashAd) {
                e.this.T = cSJSplashAd;
                ((com.beizi.fusion.work.a) e.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                e.this.y();
                if (cSJSplashAd == null) {
                    e.this.c(-991);
                    return;
                }
                if (!e.this.Y()) {
                    e.this.O();
                } else {
                    e.this.a(cSJSplashAd);
                }
                cSJSplashAd.setSplashAdListener(new CSJSplashAd.SplashAdListener() { // from class: com.beizi.fusion.work.splash.e.2.1
                    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                    public void onSplashAdClick(CSJSplashAd cSJSplashAd2) {
                        e.this.E();
                        if (((com.beizi.fusion.work.a) e.this).f7372d != null) {
                            if (((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                                ((com.beizi.fusion.work.a) e.this).f7372d.d(e.this.g());
                                ((com.beizi.fusion.work.a) e.this).f7381m.sendEmptyMessageDelayed(2, (((com.beizi.fusion.work.a) e.this).f7380l + 5000) - System.currentTimeMillis());
                            }
                            e.this.ai();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                    public void onSplashAdClose(CSJSplashAd cSJSplashAd2, int i4) {
                        if (((com.beizi.fusion.work.a) e.this).f7372d != null && ((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                            e.this.ac();
                        }
                        if (i4 == 1) {
                            e.this.H();
                        }
                        e.this.G();
                    }

                    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                    public void onSplashAdShow(CSJSplashAd cSJSplashAd2) {
                        ((com.beizi.fusion.work.a) e.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                        e.this.ab();
                        e.this.C();
                        e.this.D();
                        e.this.ah();
                    }
                });
            }
        }, (int) this.f8038p);
    }

    private void b() {
        CSJSplashAd cSJSplashAd = this.T;
        if (cSJSplashAd != null) {
            this.f8044v = cSJSplashAd.getSplashView();
            if (av.a("com.bytedance.sdk.openadsdk.ISplashClickEyeListener")) {
                a(this.f8036n, this.T, this.f8044v);
            }
            if (this.f8041s != null && this.f8040r != null) {
                b(this.T);
                this.f8041s.removeAllViews();
                this.f8041s.addView(this.f8044v);
                aK();
                this.f8040r.removeAllViews();
                this.f8040r.addView(this.f8041s);
                return;
            }
            aw();
            return;
        }
        aw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CSJSplashAd cSJSplashAd) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.O == 1) {
            String valueOf = String.valueOf(i4);
            String str = this.Q + " ";
            String str2 = str + valueOf;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.R)), 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.S)), str2.indexOf(valueOf), str2.length(), 33);
            ((SkipView) this.f8039q).setText(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(this.Q);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(this.R)), 0, this.Q.length(), 33);
        ((SkipView) this.f8039q).setText(spannableString2);
    }

    private void a(Context context, CSJSplashAd cSJSplashAd, View view) {
        Activity activity = (Activity) context;
        if (activity == null || cSJSplashAd == null || view == null) {
            return;
        }
        c a5 = c.a(context);
        cSJSplashAd.setSplashClickEyeListener(new CSJSplashAd.SplashClickEyeListener() { // from class: com.beizi.fusion.work.splash.e.9
            @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
            public void onSplashClickEyeClick() {
            }

            @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
            public void onSplashClickEyeClose() {
            }

            @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashClickEyeListener
            public void onSplashClickEyeReadyToShow(CSJSplashAd cSJSplashAd2) {
                com.beizi.fusion.d.g.a().a(e.this.g(), true, true);
                boolean b5 = com.beizi.fusion.d.g.a().b();
                if (((com.beizi.fusion.work.a) e.this).f7370b != null) {
                    ((com.beizi.fusion.work.a) e.this).f7370b.K(b5 ? "2" : "0");
                    e.this.au();
                }
            }
        });
        a5.a(context, cSJSplashAd, view, activity.getWindow().getDecorView());
    }

    private void b(CSJSplashAd cSJSplashAd) {
        String str;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.e.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.f8043u != null) {
                    e.this.f8043u.cancel();
                }
                e.this.ac();
            }
        };
        if (this.G) {
            if (cSJSplashAd != null) {
                cSJSplashAd.hideSkipButton();
            }
            View view = this.f8039q;
            if (view != null) {
                view.setVisibility(8);
                view.setAlpha(0.0f);
            }
            SkipView skipView = new SkipView(this.f8036n);
            this.f8039q = skipView;
            skipView.setOnClickListener(onClickListener);
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.e.4
                @Override // java.lang.Runnable
                public void run() {
                    e.this.aI();
                }
            }, this.K);
            str = "beizi";
        } else if (this.f8039q != null) {
            if (cSJSplashAd != null) {
                cSJSplashAd.hideSkipButton();
            }
            this.f8039q.setOnClickListener(onClickListener);
            aG();
            str = "app";
        } else {
            str = "buyer";
        }
        com.beizi.fusion.b.b bVar = this.f7370b;
        if (bVar != null) {
            bVar.r(str);
            au();
        }
    }
}
