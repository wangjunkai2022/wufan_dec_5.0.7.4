package com.beizi.fusion.work.splash;

import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.CircleProgressView;
import com.beizi.fusion.widget.SkipView;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.api.model.SplashAdExtraData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: KsSplashWorker.java */
/* loaded from: classes2.dex */
public class k extends com.beizi.fusion.work.a {
    private long E;
    private boolean F;
    private CircleProgressView G;
    private AdSpacesBean.PositionBean H;
    private AdSpacesBean.PositionBean I;
    private long J;
    private float K;
    private float L;
    private AdSpacesBean.RenderViewBean M;
    private int N;
    private int O;
    private String P;
    private String Q;
    private String R;
    private ViewGroup T;

    /* renamed from: n  reason: collision with root package name */
    long f8147n;

    /* renamed from: o  reason: collision with root package name */
    private Context f8148o;

    /* renamed from: p  reason: collision with root package name */
    private String f8149p;

    /* renamed from: q  reason: collision with root package name */
    private long f8150q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup f8151r;

    /* renamed from: s  reason: collision with root package name */
    private KsSplashScreenAd f8152s;

    /* renamed from: t  reason: collision with root package name */
    private CountDownTimer f8153t;

    /* renamed from: u  reason: collision with root package name */
    private View f8154u;

    /* renamed from: v  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8155v;

    /* renamed from: w  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8156w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8157x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private boolean f8158y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f8159z = false;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private long D = 5000;
    private View S = null;

    public k(Context context, String str, long j4, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.d.e eVar) {
        this.f8148o = context;
        this.f8149p = str;
        this.f8150q = j4;
        this.f8151r = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.T = new SplashContainer(context);
        this.f8155v = list;
        r();
    }

    private void aG() {
        if (this.f8151r != null) {
            try {
                this.f8154u = a(this.f8152s);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f8151r.removeAllViews();
            if (this.f8154u != null && this.T != null) {
                aH();
                this.T.removeAllViews();
                this.f8154u.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.T.addView(this.f8154u);
                aN();
                this.f8151r.removeAllViews();
                this.f8151r.addView(this.T);
                return;
            }
            aw();
            return;
        }
        aw();
    }

    private void aH() {
        String str;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.k.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (k.this.f8153t != null) {
                    k.this.f8153t.cancel();
                }
                k.this.ac();
            }
        };
        if (this.F) {
            View view = this.S;
            if (view != null) {
                view.setVisibility(8);
                view.setAlpha(0.0f);
            }
            SkipView skipView = new SkipView(this.f8148o);
            this.S = skipView;
            skipView.setOnClickListener(onClickListener);
            this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.k.5
                @Override // java.lang.Runnable
                public void run() {
                    k.this.aK();
                }
            }, this.J);
            str = "beizi";
        } else {
            View view2 = this.S;
            if (view2 != null) {
                view2.setOnClickListener(onClickListener);
                aI();
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

    private void aI() {
        CountDownTimer countDownTimer = this.f8153t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(100 + this.D, 50L) { // from class: com.beizi.fusion.work.splash.k.6
            @Override // android.os.CountDownTimer
            public void onFinish() {
                k.this.ac();
                k.this.G();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                if (((com.beizi.fusion.work.a) k.this).f7372d == null || ((com.beizi.fusion.work.a) k.this).f7372d.r() == 2) {
                    return;
                }
                ((com.beizi.fusion.work.a) k.this).f7372d.a(j4);
            }
        };
        this.f8153t = countDownTimer2;
        countDownTimer2.start();
    }

    private void aJ() {
        for (int i4 = 0; i4 < this.f8155v.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f8155v.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.f8157x.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.f8156w.add(renderViewBean);
            }
        }
        this.E = 0L;
        if (this.f8157x.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean2 = this.f8157x.get(0);
            this.M = renderViewBean2;
            if (renderViewBean2 != null) {
                this.I = renderViewBean2.getTapPosition();
                this.H = this.M.getLayerPosition();
                long delayDisplaySkipButton = this.M.getDelayDisplaySkipButton();
                this.J = delayDisplaySkipButton;
                if (delayDisplaySkipButton < 0) {
                    this.J = 0L;
                }
                long skipViewTotalTime = this.M.getSkipViewTotalTime();
                if (skipViewTotalTime > 0) {
                    this.D = skipViewTotalTime;
                }
                long skipUnavailableTime = this.M.getSkipUnavailableTime();
                if (skipUnavailableTime > 0) {
                    this.E = skipUnavailableTime;
                }
                this.N = this.M.getShowCountDown();
                this.O = this.M.getShowBorder();
                String skipText = this.M.getSkipText();
                this.P = skipText;
                if (TextUtils.isEmpty(skipText)) {
                    this.P = "跳过";
                }
                String textColor = this.M.getTextColor();
                this.Q = textColor;
                if (TextUtils.isEmpty(textColor)) {
                    this.Q = "#FFFFFF";
                }
                String countDownColor = this.M.getCountDownColor();
                this.R = countDownColor;
                if (TextUtils.isEmpty(countDownColor)) {
                    this.R = "#FFFFFF";
                }
                List<AdSpacesBean.PassPolicyBean> passPolicy = this.M.getPassPolicy();
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
                                this.f8159z = al.a(passPercent);
                                break;
                            case 1:
                                this.f8158y = al.a(passPercent);
                                break;
                            case 2:
                                AdSpacesBean.PositionBean positionBean = this.H;
                                if (positionBean != null && this.I != null) {
                                    double centerX = positionBean.getCenterX();
                                    double centerY = this.H.getCenterY();
                                    double width = this.H.getWidth();
                                    double height = this.H.getHeight();
                                    double centerX2 = this.I.getCenterX();
                                    double centerY2 = this.I.getCenterY();
                                    double width2 = this.I.getWidth();
                                    double height2 = this.I.getHeight();
                                    if ((centerX > 0.0d && centerX2 > 0.0d && centerX != centerX2) || ((centerY > 0.0d && centerY2 > 0.0d && centerY != centerY2) || ((width > 0.0d && width2 > 0.0d && width != width2) || (height > 0.0d && height2 > 0.0d && height != height2)))) {
                                        this.A = al.a(passPercent);
                                    }
                                    if (width2 * height2 < width * height) {
                                        this.B = true;
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
        if (this.f8156w.size() > 0) {
            Collections.sort(this.f8156w, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.k.7
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
        if (this.f8158y) {
            Q();
        }
        if (this.f8159z) {
            R();
        }
        if (this.A) {
            S();
        }
        if (this.B) {
            T();
        }
        aL();
    }

    private void aL() {
        CountDownTimer countDownTimer = this.f8153t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final long j4 = this.D - this.E;
        CountDownTimer countDownTimer2 = new CountDownTimer(this.D + 100, 50L) { // from class: com.beizi.fusion.work.splash.k.8

            /* renamed from: a  reason: collision with root package name */
            boolean f8167a = false;

            @Override // android.os.CountDownTimer
            public void onFinish() {
                k.this.ac();
                k.this.G();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j5) {
                if (!this.f8167a) {
                    k.this.aQ();
                    this.f8167a = true;
                }
                if (k.this.E > 0 && k.this.E <= k.this.D) {
                    if (k.this.f8158y) {
                        long j6 = j4;
                        if (j6 <= 0 || j5 <= j6) {
                            k.this.C = false;
                            k.this.S.setAlpha(1.0f);
                        } else {
                            k.this.C = true;
                            k.this.S.setAlpha(0.2f);
                        }
                    }
                    if (k.this.E == k.this.D) {
                        k.this.S.setEnabled(false);
                    } else {
                        k.this.S.setEnabled(true);
                    }
                }
                if (k.this.F && k.this.S != null) {
                    k.this.e(Math.round(((float) j5) / 1000.0f));
                }
                if (((com.beizi.fusion.work.a) k.this).f7372d == null || ((com.beizi.fusion.work.a) k.this).f7372d.r() == 2) {
                    return;
                }
                ((com.beizi.fusion.work.a) k.this).f7372d.a(j5);
            }
        };
        this.f8153t = countDownTimer2;
        countDownTimer2.start();
        aP();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aM() {
        CountDownTimer countDownTimer = this.f8153t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            af.a("BeiZis", "enter cancel mCountDownTimer");
        }
    }

    private void aN() {
        ViewGroup viewGroup;
        if (this.F) {
            if (this.H != null && (viewGroup = this.f8151r) != null) {
                float f5 = this.K;
                float height = viewGroup.getHeight();
                if (height == 0.0f) {
                    height = this.L - av.a(this.f8148o, 100.0f);
                }
                double d5 = f5;
                Double.isNaN(d5);
                int width = (int) (d5 * this.H.getWidth() * 0.01d);
                if (this.H.getHeight() >= 12.0d) {
                    double d6 = width;
                    Double.isNaN(d6);
                    int height2 = (int) (d6 * this.H.getHeight() * 0.01d);
                    double d7 = height2;
                    Double.isNaN(d7);
                    int paddingHeight = (int) (d7 * this.M.getPaddingHeight() * 0.01d);
                    if (paddingHeight < 0) {
                        paddingHeight = 0;
                    }
                    ((SkipView) this.S).setData(this.O, paddingHeight);
                    e(5);
                    this.T.addView(this.S, new FrameLayout.LayoutParams(width, height2));
                    float centerX = (f5 * ((float) (this.H.getCenterX() * 0.01d))) - (width / 2);
                    float centerY = (height * ((float) (this.H.getCenterY() * 0.01d))) - (height2 / 2);
                    this.S.setX(centerX);
                    this.S.setY(centerY);
                    View view = this.S;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                aO();
                return;
            }
            aO();
            return;
        }
        View view2 = this.S;
        if (view2 != null) {
            view2.setVisibility(0);
            this.S.setAlpha(1.0f);
        }
    }

    private void aO() {
        double d5 = this.K;
        Double.isNaN(d5);
        int i4 = (int) (d5 * 0.15d);
        double d6 = i4;
        Double.isNaN(d6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, (int) (d6 * 0.45d));
        layoutParams.gravity = 53;
        layoutParams.topMargin = av.a(this.f8148o, 20.0f);
        layoutParams.rightMargin = av.a(this.f8148o, 20.0f);
        ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            viewGroup.addView(this.S, layoutParams);
        }
        View view = this.S;
        if (view != null) {
            this.N = 1;
            this.O = 1;
            ((SkipView) view).setData(1, 0);
            ((SkipView) this.S).setText(String.format("跳过 %d", 5));
            this.S.setVisibility(0);
        }
    }

    private void aP() {
        CircleProgressView circleProgressView = new CircleProgressView(this.f8148o);
        this.G = circleProgressView;
        circleProgressView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.k.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                k.this.H();
                if (k.this.f8153t != null) {
                    k.this.f8153t.cancel();
                }
                k.this.ac();
            }
        });
        this.G.setAlpha(0.0f);
        this.T.addView(this.G, new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aQ() {
        int[] iArr;
        float f5;
        float f6;
        ViewGroup viewGroup;
        this.S.getLocationOnScreen(new int[2]);
        if (this.I != null) {
            float f7 = this.K;
            float height = this.f8151r != null ? viewGroup.getHeight() : 0.0f;
            if (height == 0.0f) {
                height = this.L - av.a(this.f8148o, 100.0f);
            }
            double d5 = f7;
            Double.isNaN(d5);
            int width = (int) (d5 * this.I.getWidth() * 0.01d);
            double d6 = width;
            Double.isNaN(d6);
            int height2 = (int) (d6 * this.I.getHeight() * 0.01d);
            ViewGroup.LayoutParams layoutParams = this.G.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height2;
            this.G.setLayoutParams(layoutParams);
            f5 = (f7 * ((float) (this.I.getCenterX() * 0.01d))) - (width / 2);
            f6 = (height * ((float) (this.I.getCenterY() * 0.01d))) - (height2 / 2);
        } else {
            float pivotX = (iArr[0] + this.S.getPivotX()) - (this.G.getWidth() / 2);
            float pivotY = (iArr[1] + this.S.getPivotY()) - (this.G.getHeight() / 2);
            f5 = pivotX;
            f6 = pivotY;
        }
        this.G.setX(f5);
        this.G.setY(f6);
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "KUAISHOU";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.N == 1) {
            String valueOf = String.valueOf(i4);
            String str = this.P + " ";
            String str2 = str + valueOf;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.Q)), 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.R)), str2.indexOf(valueOf), str2.length(), 33);
            ((SkipView) this.S).setText(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(this.P);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(this.Q)), 0, this.P.length(), 33);
        ((SkipView) this.S).setText(spannableString2);
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f8147n = System.currentTimeMillis();
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
                if (!av.a("com.kwad.sdk.api.KsAdSDK")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.k.1
                        @Override // java.lang.Runnable
                        public void run() {
                            k.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                n.a(this.f8148o, this.f7376h);
                this.f7370b.u(KsAdSDK.getSDKVersion());
                au();
                v();
            }
        }
        long sleepTime = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            sleepTime = Math.max(sleepTime, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f8155v;
        boolean z4 = list != null && list.size() > 0;
        this.F = z4;
        if (z4) {
            aJ();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(sleepTime);
        if (sleepTime > 0) {
            this.f7381m.sendEmptyMessageDelayed(1, sleepTime);
        } else {
            com.beizi.fusion.d.e eVar = this.f7372d;
            if (eVar != null && eVar.s() < 1 && this.f7372d.r() != 2) {
                l();
            }
        }
        this.K = av.l(this.f8148o);
        this.L = av.m(this.f8148o);
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" out make show ad");
        aG();
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        if (this.f8152s == null) {
            return null;
        }
        return this.f8152s.getECPM() + "";
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        SplashAdExtraData splashAdExtraData = new SplashAdExtraData();
        if (BeiZis.isCloseShakeAd()) {
            splashAdExtraData.setDisableShakeStatus(true);
        } else {
            splashAdExtraData.setDisableShakeStatus(false);
        }
        KsScene build = new KsScene.Builder(Long.parseLong(this.f7377i)).setSplashExtraData(splashAdExtraData).build();
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadSplashScreenAd(build, new KsLoadManager.SplashScreenAdListener() { // from class: com.beizi.fusion.work.splash.k.2
            @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsSplash onError:");
                sb.append(str);
                k.this.a(str, i4);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
            public void onRequestResult(int i4) {
            }

            @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
            public void onSplashScreenAdLoad(@NonNull KsSplashScreenAd ksSplashScreenAd) {
                k.this.y();
                ((com.beizi.fusion.work.a) k.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                k.this.f8152s = ksSplashScreenAd;
                if (k.this.f8152s != null) {
                    k kVar = k.this;
                    kVar.a(kVar.f8152s.getECPM());
                }
                if (k.this.Y()) {
                    k.this.b();
                } else {
                    k.this.O();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
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

    private View a(KsSplashScreenAd ksSplashScreenAd) {
        if (ksSplashScreenAd == null) {
            return null;
        }
        return ksSplashScreenAd.getView(this.f8148o, new KsSplashScreenAd.SplashScreenAdInteractionListener() { // from class: com.beizi.fusion.work.splash.k.3
            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdClicked() {
                if (((com.beizi.fusion.work.a) k.this).f7372d != null && ((com.beizi.fusion.work.a) k.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) k.this).f7372d.d(k.this.g());
                    ((com.beizi.fusion.work.a) k.this).f7381m.sendEmptyMessageDelayed(2, (((com.beizi.fusion.work.a) k.this).f7380l + 5000) - System.currentTimeMillis());
                }
                k.this.E();
                k.this.ai();
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdShowEnd() {
                k.this.ac();
                k.this.G();
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdShowError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("showKsSplash onAdShowError:");
                sb.append(str);
                k.this.a(str, i4);
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdShowStart() {
                k.this.C();
                ((com.beizi.fusion.work.a) k.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                k.this.ab();
                k.this.D();
                k.this.ah();
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onDownloadTipsDialogCancel() {
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onDownloadTipsDialogShow() {
                k.this.aM();
                ((com.beizi.fusion.work.a) k.this).f7381m.removeMessages(2);
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onSkippedAd() {
                k.this.ac();
                k.this.H();
            }
        });
    }
}
