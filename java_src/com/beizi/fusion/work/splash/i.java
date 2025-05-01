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
import androidx.annotation.NonNull;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.m;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.CircleProgressView;
import com.beizi.fusion.widget.SkipView;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.sdk.InMobiSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: InmobiSplashWorker.java */
/* loaded from: classes2.dex */
public class i extends com.beizi.fusion.work.a {
    private long F;
    private long G;
    private boolean H;
    private CircleProgressView I;
    private AdSpacesBean.PositionBean J;
    private AdSpacesBean.PositionBean K;
    private List<View> L;
    private float M;
    private float N;
    private AdSpacesBean.RenderViewBean O;
    private int P;
    private int Q;
    private String R;
    private String S;
    private String T;
    private InMobiNative U;
    private Long V;
    private CountDownTimer W;
    private boolean Y;
    private NativeAdEventListener Z;

    /* renamed from: n  reason: collision with root package name */
    int f8108n;

    /* renamed from: o  reason: collision with root package name */
    long f8109o;

    /* renamed from: p  reason: collision with root package name */
    View f8110p;

    /* renamed from: q  reason: collision with root package name */
    private Context f8111q;

    /* renamed from: r  reason: collision with root package name */
    private String f8112r;

    /* renamed from: s  reason: collision with root package name */
    private long f8113s;

    /* renamed from: t  reason: collision with root package name */
    private View f8114t;

    /* renamed from: u  reason: collision with root package name */
    private ViewGroup f8115u;

    /* renamed from: v  reason: collision with root package name */
    private ViewGroup f8116v;

    /* renamed from: w  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8117w;

    /* renamed from: x  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8118x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8119y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private boolean f8120z = false;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private long E = 5000;
    private boolean X = false;

    public i(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.d.e eVar) {
        this.Y = false;
        this.f8111q = context;
        this.f8112r = str;
        this.f8113s = j4;
        if (this.f8114t == null) {
            this.f8114t = new SkipView(context);
            this.Y = true;
        } else {
            this.f8114t = view;
        }
        this.f8115u = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f8116v = new SplashContainer(context);
        this.f8117w = list;
        r();
    }

    private void aG() {
        StringBuilder sb = new StringBuilder();
        sb.append("finalShowAd mParent != null ? ");
        sb.append(this.f8115u != null);
        sb.append(",!mIsLoadAdView = ");
        sb.append(!this.X);
        af.c("BeiZis", sb.toString());
        if (this.f8115u != null) {
            if (!this.X) {
                this.f8114t.setVisibility(8);
            }
            aH();
            this.f8116v.removeAllViews();
            af.c("BeiZis", "mAdContainer.getWidth() = " + this.f8116v.getWidth());
            InMobiNative inMobiNative = this.U;
            Context context = this.f8111q;
            ViewGroup viewGroup = this.f8116v;
            View primaryViewOfWidth = inMobiNative.getPrimaryViewOfWidth(context, viewGroup, viewGroup, viewGroup.getWidth());
            this.f8116v.addView(primaryViewOfWidth);
            if (primaryViewOfWidth instanceof ViewGroup) {
                final ViewGroup viewGroup2 = (ViewGroup) primaryViewOfWidth;
                viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.beizi.fusion.work.splash.i.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        ViewGroup viewGroup3 = viewGroup2;
                        if (viewGroup3 == null) {
                            return;
                        }
                        viewGroup3.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                        int i4 = layoutParams.height;
                        int height = i.this.f8116v.getHeight();
                        af.c("BeiZis", "adsHeight = " + i4 + ",containerHeight = " + height);
                        if (i4 < height) {
                            layoutParams.height = height;
                        }
                    }
                });
            }
            this.f8115u.removeAllViews();
            this.f8115u.addView(this.f8116v);
            this.X = true;
            this.f8114t.setVisibility(0);
            if (this.I != null) {
                this.f8115u.addView(this.I, new FrameLayout.LayoutParams(-2, -2));
            }
            aM();
            if (this.H) {
                aK();
                return;
            }
            return;
        }
        aw();
    }

    private void aH() {
        aI();
        if (this.Y && (this.f8114t instanceof CircleProgressView)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
            layoutParams.topMargin = av.a(this.f8111q, 20.0f);
            layoutParams.rightMargin = av.a(this.f8111q, 20.0f);
            this.f8116v.addView(this.f8114t, layoutParams);
        }
    }

    private void aI() {
        StringBuilder sb = new StringBuilder();
        sb.append("addCloseButton mSkipView != null ? ");
        sb.append(this.f8114t != null);
        af.a("BeiZis", sb.toString());
        if (this.f8114t != null) {
            CountDownTimer countDownTimer = this.W;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            CountDownTimer countDownTimer2 = new CountDownTimer(this.E, 50L) { // from class: com.beizi.fusion.work.splash.i.4

                /* renamed from: a  reason: collision with root package name */
                boolean f8125a = false;

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    i.this.G();
                    ((com.beizi.fusion.work.a) i.this).f7372d.c(i.this.g());
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    if (!this.f8125a) {
                        if (i.this.H) {
                            i iVar = i.this;
                            iVar.L = m.a(iVar.f8116v);
                        }
                        i.this.aO();
                        this.f8125a = true;
                    }
                    if (i.this.H) {
                        if (i.this.G > 0 && i.this.G <= i.this.E) {
                            if (i.this.f8120z) {
                                if (i.this.F <= 0 || j4 <= i.this.F) {
                                    i.this.D = false;
                                    i.this.f8114t.setAlpha(1.0f);
                                } else {
                                    i.this.D = true;
                                    i.this.f8114t.setAlpha(0.2f);
                                }
                            }
                            if (i.this.G == i.this.E) {
                                i.this.f8114t.setEnabled(false);
                            } else {
                                i.this.f8114t.setEnabled(true);
                            }
                        }
                        i.this.e(Math.round(((float) j4) / 1000.0f));
                    }
                    if (i.this.X) {
                        if (i.this.G == i.this.E) {
                            i.this.f8114t.setEnabled(false);
                        } else {
                            i.this.f8114t.setEnabled(true);
                        }
                    }
                    int i4 = (int) ((5 * j4) / i.this.E);
                    if (i.this.f8114t instanceof SkipView) {
                        ((SkipView) i.this.f8114t).setText(String.format("跳过 %d", Integer.valueOf(i4)));
                    } else if (((com.beizi.fusion.work.a) i.this).f7372d == null || ((com.beizi.fusion.work.a) i.this).f7372d.r() == 2) {
                    } else {
                        ((com.beizi.fusion.work.a) i.this).f7372d.a(j4);
                    }
                }
            };
            this.W = countDownTimer2;
            countDownTimer2.start();
            this.f8114t.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.i.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    i.this.G();
                    i.this.W.cancel();
                    ((com.beizi.fusion.work.a) i.this).f7372d.c(i.this.g());
                }
            });
        }
    }

    private void aJ() {
        for (int i4 = 0; i4 < this.f8117w.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f8117w.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.f8119y.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.f8118x.add(renderViewBean);
            }
        }
        if (this.f8119y.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean2 = this.f8119y.get(0);
            this.O = renderViewBean2;
            if (renderViewBean2 != null) {
                this.K = renderViewBean2.getTapPosition();
                this.J = this.O.getLayerPosition();
                long skipUnavailableTime = this.O.getSkipUnavailableTime();
                if (skipUnavailableTime > 0) {
                    this.G = skipUnavailableTime;
                }
                this.P = this.O.getShowCountDown();
                this.Q = this.O.getShowBorder();
                String skipText = this.O.getSkipText();
                this.R = skipText;
                if (TextUtils.isEmpty(skipText)) {
                    this.R = "跳过";
                }
                String textColor = this.O.getTextColor();
                this.S = textColor;
                if (TextUtils.isEmpty(textColor)) {
                    this.S = "#FFFFFF";
                }
                String countDownColor = this.O.getCountDownColor();
                this.T = countDownColor;
                if (TextUtils.isEmpty(countDownColor)) {
                    this.T = "#FFFFFF";
                }
                List<AdSpacesBean.PassPolicyBean> passPolicy = this.O.getPassPolicy();
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
                                this.f8120z = al.a(passPercent);
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
        if (this.f8118x.size() > 0) {
            Collections.sort(this.f8118x, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.i.6
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(AdSpacesBean.RenderViewBean renderViewBean3, AdSpacesBean.RenderViewBean renderViewBean4) {
                    return renderViewBean4.getLevel() - renderViewBean3.getLevel();
                }
            });
        }
    }

    private void aK() {
        if (this.f8120z) {
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
        this.F = this.E - this.G;
    }

    private View aL() {
        View view;
        String str;
        if (this.H) {
            View view2 = this.f8114t;
            if (view2 != null) {
                view2.setVisibility(8);
                view2.setAlpha(0.0f);
            }
            this.f8114t = new SkipView(this.f8111q);
            CircleProgressView circleProgressView = new CircleProgressView(this.f8111q);
            this.I = circleProgressView;
            circleProgressView.setAlpha(0.0f);
            view = this.I;
            str = "beizi";
        } else {
            view = this.f8114t;
            if (view != null) {
                CircleProgressView circleProgressView2 = new CircleProgressView(this.f8111q);
                this.I = circleProgressView2;
                circleProgressView2.setAlpha(0.0f);
                view = this.I;
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
        return view;
    }

    private void aM() {
        af.a("BeiZis", "enter checkDisplaySkipView mNeedRender = " + this.H);
        if (this.H) {
            if (this.J != null && this.O != null) {
                float f5 = this.M;
                float height = this.f8115u.getHeight();
                if (height == 0.0f) {
                    height = this.N - av.a(this.f8111q, 100.0f);
                }
                double d5 = f5;
                Double.isNaN(d5);
                int width = (int) (d5 * this.J.getWidth() * 0.01d);
                if (this.J.getHeight() >= 12.0d) {
                    double d6 = width;
                    Double.isNaN(d6);
                    int height2 = (int) (d6 * this.J.getHeight() * 0.01d);
                    double d7 = height2;
                    Double.isNaN(d7);
                    int paddingHeight = (int) (d7 * this.O.getPaddingHeight() * 0.01d);
                    if (paddingHeight < 0) {
                        paddingHeight = 0;
                    }
                    ((SkipView) this.f8114t).setData(this.Q, paddingHeight);
                    e(5);
                    this.f8115u.addView(this.f8114t, new FrameLayout.LayoutParams(width, height2));
                    float centerY = (height * ((float) (this.J.getCenterY() * 0.01d))) - (height2 / 2);
                    this.f8114t.setX((f5 * ((float) (this.J.getCenterX() * 0.01d))) - (width / 2));
                    this.f8114t.setY(centerY);
                    View view = this.f8114t;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                aN();
                return;
            }
            aN();
            return;
        }
        aN();
    }

    private void aN() {
        double d5 = this.M;
        Double.isNaN(d5);
        int i4 = (int) (d5 * 0.15d);
        double d6 = i4;
        Double.isNaN(d6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, (int) (d6 * 0.45d));
        layoutParams.gravity = 53;
        layoutParams.topMargin = av.a(this.f8111q, 20.0f);
        layoutParams.rightMargin = av.a(this.f8111q, 20.0f);
        ViewGroup viewGroup = this.f8115u;
        if (viewGroup != null) {
            viewGroup.addView(this.f8114t, layoutParams);
        }
        View view = this.f8114t;
        if (view != null) {
            this.P = 1;
            this.Q = 1;
            ((SkipView) view).setData(1, 0);
            ((SkipView) this.f8114t).setText(String.format("跳过 %d", 5));
            this.f8114t.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aO() {
        int[] iArr;
        float pivotX;
        float pivotY;
        float height;
        View view = this.f8114t;
        if (view == null) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        if (this.K != null) {
            float f5 = this.M;
            float height2 = this.f8115u.getHeight();
            if (height2 == 0.0f) {
                height2 = this.N - av.a(this.f8111q, 100.0f);
            }
            double d5 = f5;
            Double.isNaN(d5);
            int width = (int) (d5 * this.K.getWidth() * 0.01d);
            double d6 = width;
            Double.isNaN(d6);
            int height3 = (int) (d6 * this.K.getHeight() * 0.01d);
            ViewGroup.LayoutParams layoutParams = this.I.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height3;
            this.I.setLayoutParams(layoutParams);
            pivotX = (f5 * ((float) (this.K.getCenterX() * 0.01d))) - (width / 2);
            pivotY = height2 * ((float) (this.K.getCenterY() * 0.01d));
            height = height3 / 2;
        } else {
            pivotX = (iArr[0] + this.f8114t.getPivotX()) - (this.I.getWidth() / 2);
            pivotY = iArr[1] + this.f8114t.getPivotY();
            height = this.I.getHeight() / 2;
        }
        this.I.setX(pivotX);
        this.I.setY(pivotY - height);
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "INMOBI";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.P == 1) {
            String valueOf = String.valueOf(i4);
            String str = this.R + " ";
            String str2 = str + valueOf;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.S)), 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.T)), str2.indexOf(valueOf), str2.length(), 33);
            ((SkipView) this.f8114t).setText(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(this.R);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(this.S)), 0, this.R.length(), 33);
        ((SkipView) this.f8114t).setText(spannableString2);
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.U == null) {
            return;
        }
        al();
        this.f7373e.setAvgPrice(this.U.getAdBid());
        af.a("BeiZisBid", "inmobi splash price = " + this.U.getAdBid());
        com.beizi.fusion.b.b bVar = this.f7370b;
        if (bVar != null) {
            bVar.M(String.valueOf(this.f7373e.getAvgPrice()));
            au();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        boolean z4;
        if (this.f7372d == null) {
            return;
        }
        this.f8109o = System.currentTimeMillis();
        this.f7376h = this.f7373e.getAppId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        boolean z5 = false;
        try {
            this.V = Long.valueOf(this.f7373e.getSpaceId());
            z4 = false;
        } catch (Exception unused) {
            this.f7378j = com.beizi.fusion.f.a.ADFAIL;
            this.f7381m.sendMessage(this.f7381m.obtainMessage(3, "Inmobi spaceId pattern problem!"));
            z4 = true;
        }
        if (z4) {
            return;
        }
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.inmobi.sdk.InMobiSdk")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.i.1
                        @Override // java.lang.Runnable
                        public void run() {
                            i.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                InMobiSdk.init(this.f8111q, this.f7376h);
                InMobiSdk.setLogLevel(InMobiSdk.LogLevel.DEBUG);
                this.f7370b.w(InMobiSdk.getVersion());
                au();
                v();
            }
        }
        this.f8108n = this.f7373e.getReqTimeOutType();
        long sleepTime = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            sleepTime = Math.max(sleepTime, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f8117w;
        if (list != null && list.size() > 0) {
            z5 = true;
        }
        this.H = z5;
        if (z5) {
            aJ();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.V);
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
        this.M = av.l(this.f8111q);
        this.N = av.m(this.f8111q);
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
        if (this.U == null) {
            return null;
        }
        return this.U.getAdBid() + "";
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        this.f8110p = aL();
        this.Z = new NativeAdEventListener() { // from class: com.beizi.fusion.work.splash.i.2
            public void onAdClicked(@NonNull InMobiNative inMobiNative) {
                if (((com.beizi.fusion.work.a) i.this).f7372d != null && ((com.beizi.fusion.work.a) i.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) i.this).f7372d.d(i.this.g());
                }
                i.this.E();
                i.this.ai();
            }

            public void onAdImpressed(@NonNull InMobiNative inMobiNative) {
                ((com.beizi.fusion.work.a) i.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                i.this.ab();
                i.this.D();
                i.this.ah();
            }

            public void onAdLoadFailed(@NonNull InMobiNative inMobiNative, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
                StringBuilder sb = new StringBuilder();
                sb.append("showInSplash onAdFailed:");
                sb.append(inMobiAdRequestStatus.getMessage());
                i.this.a(inMobiAdRequestStatus.getMessage(), inMobiAdRequestStatus.getStatusCode().ordinal());
            }

            public void onAdLoadSucceeded(@NonNull InMobiNative inMobiNative) {
                i.this.y();
                ((com.beizi.fusion.work.a) i.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                af.a("BeiZisBid", "showInSplash inMobiNative.getAdBid() = " + inMobiNative.getAdBid() + ",mBuyerBean = " + ((com.beizi.fusion.work.a) i.this).f7373e);
                if (i.this.Y()) {
                    i.this.b();
                } else {
                    i.this.O();
                }
            }

            public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
            }
        };
        InMobiNative inMobiNative = new InMobiNative(this.f8111q, this.V.longValue(), this.Z);
        this.U = inMobiNative;
        inMobiNative.setDownloaderEnabled(true);
        this.U.load();
        af.a("BeiZis", "inmobi start load");
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
}
