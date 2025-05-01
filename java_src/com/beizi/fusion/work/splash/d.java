package com.beizi.fusion.work.splash;

import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.beizi.fusion.d.u;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.CircleProgressView;
import com.beizi.fusion.widget.SkipView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: CsjNSTWorker.java */
/* loaded from: classes2.dex */
public class d extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {
    private long G;
    private boolean H;
    private CircleProgressView I;
    private AdSpacesBean.PositionBean J;
    private AdSpacesBean.PositionBean K;
    private long L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private AdSpacesBean.RenderViewBean S;
    private int T;
    private int U;
    private String V;
    private String W;
    private String X;
    private long Y;

    /* renamed from: n  reason: collision with root package name */
    private Context f8008n;

    /* renamed from: o  reason: collision with root package name */
    private String f8009o;

    /* renamed from: p  reason: collision with root package name */
    private long f8010p;

    /* renamed from: q  reason: collision with root package name */
    private View f8011q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup f8012r;

    /* renamed from: s  reason: collision with root package name */
    private ViewGroup f8013s;

    /* renamed from: t  reason: collision with root package name */
    private TTAdNative f8014t;

    /* renamed from: u  reason: collision with root package name */
    private TTNativeExpressAd f8015u;

    /* renamed from: v  reason: collision with root package name */
    private CountDownTimer f8016v;

    /* renamed from: w  reason: collision with root package name */
    private View f8017w;

    /* renamed from: x  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8018x;

    /* renamed from: y  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8019y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8020z = new ArrayList();
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private long F = 5000;

    public d(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.d.e eVar) {
        this.f8008n = context;
        this.f8009o = str;
        this.f8010p = j4;
        this.f8011q = view;
        this.f8012r = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f8013s = new SplashContainer(context);
        this.f8018x = list;
        r();
    }

    private void aG() {
        CountDownTimer countDownTimer = this.f8016v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(100 + this.F, 50L) { // from class: com.beizi.fusion.work.splash.d.5
            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (((com.beizi.fusion.work.a) d.this).f7372d == null) {
                    return;
                }
                ((com.beizi.fusion.work.a) d.this).f7372d.c(d.this.g());
                d.this.G();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                if (d.this.H && d.this.f8011q != null) {
                    d.this.e(Math.round(((float) j4) / 1000.0f));
                }
                if (((com.beizi.fusion.work.a) d.this).f7372d == null || ((com.beizi.fusion.work.a) d.this).f7372d.r() == 2) {
                    return;
                }
                ((com.beizi.fusion.work.a) d.this).f7372d.a(j4);
            }
        };
        this.f8016v = countDownTimer2;
        countDownTimer2.start();
    }

    private void aH() {
        ViewGroup viewGroup = this.f8013s;
        if (viewGroup != null && this.f8012r != null && this.f8017w != null) {
            viewGroup.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.Q, (int) this.R);
            if (this.R < 1200.0f) {
                layoutParams.gravity = 16;
            }
            this.f8013s.addView(this.f8017w, layoutParams);
            final ViewGroup viewGroup2 = this.f8012r;
            if (viewGroup2 instanceof ViewGroup) {
                viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.beizi.fusion.work.splash.d.6
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (viewGroup2 == null) {
                            return;
                        }
                        float height = d.this.f8012r.getHeight();
                        if (d.this.R > height) {
                            float f5 = height / d.this.R;
                            d.this.f8017w.setPivotY(0.0f);
                            d.this.f8017w.setScaleY(f5);
                        }
                        viewGroup2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                });
            }
            aI();
            aM();
            this.f8012r.removeAllViews();
            this.f8012r.addView(this.f8013s);
            return;
        }
        aw();
    }

    private void aI() {
        String str;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.d.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.f8016v != null) {
                    d.this.f8016v.cancel();
                }
                if (((com.beizi.fusion.work.a) d.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) d.this).f7372d.c(d.this.g());
                }
            }
        };
        if (this.H) {
            View view = this.f8011q;
            if (view != null) {
                view.setVisibility(8);
                view.setAlpha(0.0f);
            }
            SkipView skipView = new SkipView(this.f8008n);
            this.f8011q = skipView;
            skipView.setOnClickListener(onClickListener);
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.d.8
                @Override // java.lang.Runnable
                public void run() {
                    d.this.aK();
                }
            }, this.L);
            str = "beizi";
        } else {
            View view2 = this.f8011q;
            if (view2 != null) {
                view2.setOnClickListener(onClickListener);
                aG();
                str = "app";
            } else {
                str = "buyer";
            }
        }
        com.beizi.fusion.b.b bVar = this.f7370b;
        if (bVar != null) {
            bVar.r(str);
            au();
        }
    }

    private void aJ() {
        for (int i4 = 0; i4 < this.f8018x.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f8018x.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.f8020z.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.f8019y.add(renderViewBean);
            }
        }
        this.G = 0L;
        if (this.f8020z.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean2 = this.f8020z.get(0);
            this.S = renderViewBean2;
            if (renderViewBean2 != null) {
                this.K = renderViewBean2.getTapPosition();
                this.J = this.S.getLayerPosition();
                long delayDisplaySkipButton = this.S.getDelayDisplaySkipButton();
                this.L = delayDisplaySkipButton;
                if (delayDisplaySkipButton < 0) {
                    this.L = 0L;
                }
                long skipViewTotalTime = this.S.getSkipViewTotalTime();
                if (skipViewTotalTime > 0) {
                    this.F = skipViewTotalTime;
                }
                long skipUnavailableTime = this.S.getSkipUnavailableTime();
                if (skipUnavailableTime > 0) {
                    this.G = skipUnavailableTime;
                }
                this.T = this.S.getShowCountDown();
                this.U = this.S.getShowBorder();
                String skipText = this.S.getSkipText();
                this.V = skipText;
                if (TextUtils.isEmpty(skipText)) {
                    this.V = "跳过";
                }
                String textColor = this.S.getTextColor();
                this.W = textColor;
                if (TextUtils.isEmpty(textColor)) {
                    this.W = "#FFFFFF";
                }
                String countDownColor = this.S.getCountDownColor();
                this.X = countDownColor;
                if (TextUtils.isEmpty(countDownColor)) {
                    this.X = "#FFFFFF";
                }
                List<AdSpacesBean.PassPolicyBean> passPolicy = this.S.getPassPolicy();
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
                                this.B = al.a(passPercent);
                                break;
                            case 1:
                                this.A = al.a(passPercent);
                                break;
                            case 2:
                                AdSpacesBean.PositionBean positionBean = this.J;
                                if (positionBean != null && this.K != null) {
                                    double centerX = positionBean.getCenterX();
                                    double centerY = this.J.getCenterY();
                                    double width = this.J.getWidth();
                                    double height = this.J.getHeight();
                                    double centerX2 = this.K.getCenterX();
                                    double centerY2 = this.K.getCenterY();
                                    double width2 = this.K.getWidth();
                                    double height2 = this.K.getHeight();
                                    if ((centerX > 0.0d && centerX2 > 0.0d && centerX != centerX2) || ((centerY > 0.0d && centerY2 > 0.0d && centerY != centerY2) || ((width > 0.0d && width2 > 0.0d && width != width2) || (height > 0.0d && height2 > 0.0d && height != height2)))) {
                                        this.C = al.a(passPercent);
                                    }
                                    if (width2 * height2 < width * height) {
                                        this.D = true;
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
        if (this.f8019y.size() > 0) {
            Collections.sort(this.f8019y, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.d.9
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(AdSpacesBean.RenderViewBean renderViewBean3, AdSpacesBean.RenderViewBean renderViewBean4) {
                    return renderViewBean4.getLevel() - renderViewBean3.getLevel();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aK() {
        if (this.A) {
            Q();
        }
        if (this.B) {
            R();
        }
        if (this.C) {
            S();
        }
        if (this.D) {
            T();
        }
        aL();
    }

    private void aL() {
        CountDownTimer countDownTimer = this.f8016v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final long j4 = this.F - this.G;
        CountDownTimer countDownTimer2 = new CountDownTimer(this.F + 100, 50L) { // from class: com.beizi.fusion.work.splash.d.10

            /* renamed from: a  reason: collision with root package name */
            boolean f8022a = false;

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (((com.beizi.fusion.work.a) d.this).f7372d == null) {
                    return;
                }
                ((com.beizi.fusion.work.a) d.this).f7372d.c(d.this.g());
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j5) {
                if (!this.f8022a) {
                    d.this.aP();
                    this.f8022a = true;
                }
                if (d.this.G > 0 && d.this.G <= d.this.F) {
                    if (d.this.A) {
                        long j6 = j4;
                        if (j6 <= 0 || j5 <= j6) {
                            d.this.E = false;
                            d.this.f8011q.setAlpha(1.0f);
                        } else {
                            d.this.E = true;
                            d.this.f8011q.setAlpha(0.2f);
                        }
                    }
                    if (d.this.G == d.this.F) {
                        d.this.f8011q.setEnabled(false);
                    } else {
                        d.this.f8011q.setEnabled(true);
                    }
                }
                if (d.this.H && d.this.f8011q != null) {
                    ((SkipView) d.this.f8011q).setText(String.format("跳过 %d", Integer.valueOf(Math.round(((float) j5) / 1000.0f))));
                }
                if (((com.beizi.fusion.work.a) d.this).f7372d == null || ((com.beizi.fusion.work.a) d.this).f7372d.r() == 2) {
                    return;
                }
                ((com.beizi.fusion.work.a) d.this).f7372d.a(j5);
            }
        };
        this.f8016v = countDownTimer2;
        countDownTimer2.start();
        aO();
    }

    private void aM() {
        ViewGroup viewGroup;
        if (this.H) {
            if (this.J != null && (viewGroup = this.f8012r) != null) {
                float f5 = this.M;
                float height = viewGroup.getHeight();
                if (height == 0.0f) {
                    height = this.N - av.a(this.f8008n, 100.0f);
                }
                double d5 = f5;
                Double.isNaN(d5);
                int width = (int) (d5 * this.J.getWidth() * 0.01d);
                double d6 = width;
                Double.isNaN(d6);
                int height2 = (int) (d6 * this.J.getHeight() * 0.01d);
                double d7 = height2;
                Double.isNaN(d7);
                int paddingHeight = (int) (d7 * this.S.getPaddingHeight() * 0.01d);
                if (paddingHeight < 0) {
                    paddingHeight = 0;
                }
                ((SkipView) this.f8011q).setData(this.U, paddingHeight);
                e(5);
                this.f8013s.addView(this.f8011q, new FrameLayout.LayoutParams(width, height2));
                float centerX = (f5 * ((float) (this.J.getCenterX() * 0.01d))) - (width / 2);
                float centerY = (height * ((float) (this.J.getCenterY() * 0.01d))) - (height2 / 2);
                this.f8011q.setX(centerX);
                this.f8011q.setY(centerY);
                View view = this.f8011q;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            aN();
            return;
        }
        View view2 = this.f8011q;
        if (view2 != null) {
            view2.setVisibility(0);
            this.f8011q.setAlpha(1.0f);
        }
    }

    private void aN() {
        double d5 = this.M;
        Double.isNaN(d5);
        int i4 = (int) (d5 * 0.15d);
        double d6 = i4;
        Double.isNaN(d6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, (int) (d6 * 0.45d));
        layoutParams.gravity = 53;
        layoutParams.topMargin = av.a(this.f8008n, 20.0f);
        layoutParams.rightMargin = av.a(this.f8008n, 20.0f);
        ViewGroup viewGroup = this.f8013s;
        if (viewGroup != null) {
            viewGroup.addView(this.f8011q, layoutParams);
        }
        View view = this.f8011q;
        if (view != null) {
            this.T = 1;
            this.U = 1;
            ((SkipView) view).setData(1, 0);
            ((SkipView) this.f8011q).setText(String.format("跳过 %d", 5));
            this.f8011q.setVisibility(0);
        }
    }

    private void aO() {
        CircleProgressView circleProgressView = new CircleProgressView(this.f8008n);
        this.I = circleProgressView;
        circleProgressView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.H();
                if (d.this.f8016v != null) {
                    d.this.f8016v.cancel();
                }
                if (((com.beizi.fusion.work.a) d.this).f7372d != null) {
                    ((com.beizi.fusion.work.a) d.this).f7372d.c(d.this.g());
                }
            }
        });
        this.I.setAlpha(0.0f);
        this.f8013s.addView(this.I, new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aP() {
        int[] iArr;
        float f5;
        float f6;
        ViewGroup viewGroup;
        this.f8011q.getLocationOnScreen(new int[2]);
        if (this.K != null) {
            float f7 = this.M;
            float height = this.f8012r != null ? viewGroup.getHeight() : 0.0f;
            if (height == 0.0f) {
                height = this.N - av.a(this.f8008n, 100.0f);
            }
            double d5 = f7;
            Double.isNaN(d5);
            int width = (int) (d5 * this.K.getWidth() * 0.01d);
            double d6 = width;
            Double.isNaN(d6);
            int height2 = (int) (d6 * this.K.getHeight() * 0.01d);
            ViewGroup.LayoutParams layoutParams = this.I.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height2;
            this.I.setLayoutParams(layoutParams);
            f5 = (f7 * ((float) (this.K.getCenterX() * 0.01d))) - (width / 2);
            f6 = (height * ((float) (this.K.getCenterY() * 0.01d))) - (height2 / 2);
        } else {
            float pivotX = (iArr[0] + this.f8011q.getPivotX()) - (this.I.getWidth() / 2);
            float pivotY = (iArr[1] + this.f8011q.getPivotY()) - (this.I.getHeight() / 2);
            f5 = pivotX;
            f6 = pivotY;
        }
        this.I.setX(f5);
        this.I.setY(f6);
    }

    @Override // com.beizi.fusion.work.a
    public void ay() {
        v();
        e();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "CSJ_NST";
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
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                u.a(this, this.f8008n, this.f7376h, this.f7373e.getDirectDownload());
                this.f7370b.t(TTAdSdk.getAdManager().getSDKVersion());
                au();
            }
        }
        this.Y = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            this.Y = Math.max(this.Y, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f8018x;
        boolean z4 = list != null && list.size() > 0;
        this.H = z4;
        if (z4) {
            aJ();
        }
        this.M = av.l(this.f8008n);
        this.N = av.m(this.f8008n);
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
        sb.append(this.Y);
        long j4 = this.Y;
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
        aH();
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
        w();
        ag();
        this.f8017w = null;
        if (av()) {
            return;
        }
        this.f8014t = u.a().createAdNative(this.f8008n);
        this.O = av.j(this.f8008n);
        this.P = 0.0f;
        this.f8014t.loadNativeExpressAd(new AdSlot.Builder().setCodeId(this.f7377i).setSupportDeepLink(true).setAdCount(1).setExpressViewAcceptedSize(this.O, this.P).build(), new TTAdNative.NativeExpressAdListener() { // from class: com.beizi.fusion.work.splash.d.3
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjNSTSplash Callback --> onError:");
                sb.append(str);
                d.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                d.this.y();
                if (list == null || list.size() == 0) {
                    d.this.c(-991);
                    return;
                }
                d.this.f8015u = list.get(0);
                d dVar = d.this;
                dVar.a(dVar.f8015u);
                d.this.f8015u.render();
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        TTNativeExpressAd tTNativeExpressAd = this.f8015u;
        if (tTNativeExpressAd != null) {
            tTNativeExpressAd.destroy();
        }
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f8017w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append("splashWorkers:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            this.f7372d.a(g(), (View) null);
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.T == 1) {
            String valueOf = String.valueOf(i4);
            String str = this.V + " ";
            String str2 = str + valueOf;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.W)), 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.X)), str2.indexOf(valueOf), str2.length(), 33);
            ((SkipView) this.f8011q).setText(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(this.V);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(this.W)), 0, this.V.length(), 33);
        ((SkipView) this.f8011q).setText(spannableString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TTNativeExpressAd tTNativeExpressAd) {
        tTNativeExpressAd.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.beizi.fusion.work.splash.d.4

            /* renamed from: a  reason: collision with root package name */
            boolean f8027a = false;

            /* renamed from: b  reason: collision with root package name */
            boolean f8028b = false;

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdClicked(View view, int i4) {
                if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) d.this).f7372d.d(d.this.g());
                }
                if (this.f8028b) {
                    return;
                }
                this.f8028b = true;
                d.this.E();
                d.this.ai();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdShow(View view, int i4) {
                ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) d.this).f7372d.b(d.this.g());
                }
                if (this.f8027a) {
                    return;
                }
                this.f8027a = true;
                d.this.C();
                d.this.D();
                d.this.ah();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderFail(View view, String str, int i4) {
                d.this.a(str, i4);
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderSuccess(View view, float f5, float f6) {
                StringBuilder sb = new StringBuilder();
                sb.append("showCsjNSTSplash Callback --> onRenderSuccess() width == ");
                sb.append(f5);
                sb.append(", height == ");
                sb.append(f6);
                d dVar = d.this;
                dVar.Q = av.a(dVar.f8008n, f5);
                d dVar2 = d.this;
                dVar2.R = av.a(dVar2.f8008n, f6);
                d.this.f8017w = view;
                if (d.this.Y()) {
                    d.this.b();
                } else {
                    d.this.O();
                }
            }
        });
    }
}
