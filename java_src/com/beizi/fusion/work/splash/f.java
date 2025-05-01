package com.beizi.fusion.work.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.m;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.CircleProgressView;
import com.beizi.fusion.widget.SkipView;
import com.join.mgps.service.CommonService_;
import com.kwad.sdk.api.model.AdnName;
import com.qq.e.ads.splash.SplashAD;
import com.qq.e.ads.splash.SplashADListener;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: GdtSplashWorker.java */
/* loaded from: classes2.dex */
public class f extends com.beizi.fusion.work.a {
    private long H;
    private long J;
    private boolean K;
    private CircleProgressView L;
    private AdSpacesBean.PositionBean M;
    private AdSpacesBean.PositionBean N;
    private List<View> O;
    private float P;
    private float Q;
    private AdSpacesBean.RenderViewBean R;
    private int S;
    private int T;
    private String U;
    private String V;
    private String W;

    /* renamed from: n  reason: collision with root package name */
    int f8061n;

    /* renamed from: o  reason: collision with root package name */
    long f8062o;

    /* renamed from: p  reason: collision with root package name */
    View.OnClickListener f8063p;

    /* renamed from: q  reason: collision with root package name */
    private Context f8064q;

    /* renamed from: r  reason: collision with root package name */
    private String f8065r;

    /* renamed from: s  reason: collision with root package name */
    private long f8066s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f8067t;

    /* renamed from: u  reason: collision with root package name */
    private View f8068u;

    /* renamed from: v  reason: collision with root package name */
    private ViewGroup f8069v;

    /* renamed from: w  reason: collision with root package name */
    private ViewGroup f8070w;

    /* renamed from: x  reason: collision with root package name */
    private SplashAD f8071x;

    /* renamed from: y  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8072y;

    /* renamed from: z  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f8073z = new ArrayList();
    private List<AdSpacesBean.RenderViewBean> A = new ArrayList();
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private long G = 5000;
    private int I = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GdtSplashWorker.java */
    /* loaded from: classes2.dex */
    public class a implements SplashADListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f8076a;

        /* renamed from: b  reason: collision with root package name */
        boolean f8077b;

        /* renamed from: c  reason: collision with root package name */
        boolean f8078c;

        private a() {
            this.f8076a = false;
            this.f8077b = false;
            this.f8078c = false;
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADClicked() {
            if (((com.beizi.fusion.work.a) f.this).f7372d != null && ((com.beizi.fusion.work.a) f.this).f7372d.r() != 2) {
                ((com.beizi.fusion.work.a) f.this).f7372d.d(f.this.g());
                ((com.beizi.fusion.work.a) f.this).f7381m.sendEmptyMessageDelayed(2, (((com.beizi.fusion.work.a) f.this).f7380l + 5000) - System.currentTimeMillis());
            }
            if (this.f8077b) {
                return;
            }
            this.f8077b = true;
            f.this.E();
            f.this.ai();
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADDismissed() {
            if (((com.beizi.fusion.work.a) f.this).f7372d.r() != 2) {
                f.this.ac();
            }
            f.this.G();
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADExposure() {
            ((com.beizi.fusion.work.a) f.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
            if (this.f8076a) {
                return;
            }
            this.f8076a = true;
            f.this.az();
            f.this.ab();
            f.this.D();
            f.this.ah();
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADLoaded(long j4) {
            if (f.this.f8071x.getECPM() > 0) {
                f fVar = f.this;
                fVar.a(fVar.f8071x.getECPM());
            }
            if (v.f7025a) {
                f.this.f8071x.setDownloadConfirmListener(v.f7026b);
            }
            f.this.y();
            if (((com.beizi.fusion.work.a) f.this).f7378j.ordinal() >= com.beizi.fusion.f.a.ADSHOW.ordinal()) {
                int ordinal = ((com.beizi.fusion.work.a) f.this).f7378j.ordinal();
                String str = ordinal != 2 ? ordinal != 3 ? AdnName.OTHER : "fail" : CommonService_.i0.f54387c;
                Message obtain = Message.obtain();
                obtain.obj = "ad status error " + str;
                f.this.a(obtain);
                return;
            }
            ((com.beizi.fusion.work.a) f.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            f.g(f.this);
            if (((com.beizi.fusion.work.a) f.this).f7372d != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("showGdtSplash onADLoaded:");
                sb.append(j4);
                sb.append(",mAdLifeControl.getAdStatus() = ");
                sb.append(((com.beizi.fusion.work.a) f.this).f7372d.s());
                sb.append(",gap = ");
                sb.append(j4 - SystemClock.elapsedRealtime());
            }
            if (SystemClock.elapsedRealtime() >= j4 || !f.this.Y()) {
                f.this.O();
            } else {
                f.this.aG();
            }
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADPresent() {
            f.g(f.this);
            f.this.C();
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADTick(long j4) {
            if (!this.f8078c) {
                if (f.this.K) {
                    f fVar = f.this;
                    fVar.O = m.a(fVar.f8070w);
                }
                f.this.aN();
                this.f8078c = true;
            }
            if (f.this.K) {
                if (f.this.J > 0 && f.this.J <= f.this.G) {
                    if (f.this.B) {
                        if (f.this.H <= 0 || j4 <= f.this.H) {
                            f.this.F = false;
                            f.this.f8068u.setAlpha(1.0f);
                        } else {
                            f.this.F = true;
                            f.this.f8068u.setAlpha(0.2f);
                        }
                    }
                    if (f.this.J == f.this.G) {
                        f.this.f8068u.setEnabled(false);
                    } else {
                        f.this.f8068u.setEnabled(true);
                    }
                }
                f.this.e(Math.round(((float) j4) / 1000.0f));
            }
            if (((com.beizi.fusion.work.a) f.this).f7372d == null || ((com.beizi.fusion.work.a) f.this).f7372d.r() == 2) {
                return;
            }
            ((com.beizi.fusion.work.a) f.this).f7372d.a(j4);
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("showGdtSplash onNoAD:");
            sb.append(adError.getErrorMsg());
            f.this.a(adError.getErrorMsg(), adError.getErrorCode());
            if (f.this.I < 1 || ((com.beizi.fusion.work.a) f.this).f7372d == null) {
                return;
            }
            ((com.beizi.fusion.work.a) f.this).f7372d.t();
        }
    }

    public f(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.d.e eVar) {
        this.f8064q = context;
        this.f8065r = str;
        this.f8066s = j4;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f8068u = null;
        this.f8069v = viewGroup;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        this.f8070w = new SplashContainer(context);
        this.f8072y = list;
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
        sb.append(g());
        sb.append(" splashWorkers:");
        sb.append(q4.toString());
        Z();
        com.beizi.fusion.d.h hVar = this.f7375g;
        if (hVar == com.beizi.fusion.d.h.SUCCESS) {
            b();
            ad();
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    private void aH() {
        ViewGroup viewGroup = this.f8069v;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f8069v.addView(this.f8070w);
            this.f8071x.showAd(this.f8070w);
            if (this.L != null) {
                this.f8069v.addView(this.L, new FrameLayout.LayoutParams(-2, -2));
            }
            aL();
            if (this.K) {
                aJ();
                return;
            }
            return;
        }
        aw();
    }

    private void aI() {
        for (int i4 = 0; i4 < this.f8072y.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f8072y.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.A.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.f8073z.add(renderViewBean);
            }
        }
        if (this.A.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean2 = this.A.get(0);
            this.R = renderViewBean2;
            if (renderViewBean2 != null) {
                this.N = renderViewBean2.getTapPosition();
                this.M = this.R.getLayerPosition();
                long skipUnavailableTime = this.R.getSkipUnavailableTime();
                if (skipUnavailableTime > 0) {
                    this.J = skipUnavailableTime;
                }
                this.S = this.R.getShowCountDown();
                this.T = this.R.getShowBorder();
                String skipText = this.R.getSkipText();
                this.U = skipText;
                if (TextUtils.isEmpty(skipText)) {
                    this.U = "跳过";
                }
                String textColor = this.R.getTextColor();
                this.V = textColor;
                if (TextUtils.isEmpty(textColor)) {
                    this.V = "#FFFFFF";
                }
                String countDownColor = this.R.getCountDownColor();
                this.W = countDownColor;
                if (TextUtils.isEmpty(countDownColor)) {
                    this.W = "#FFFFFF";
                }
                List<AdSpacesBean.PassPolicyBean> passPolicy = this.R.getPassPolicy();
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
                                this.C = al.a(passPercent);
                                break;
                            case 1:
                                this.B = al.a(passPercent);
                                break;
                            case 2:
                                AdSpacesBean.PositionBean positionBean = this.M;
                                if (positionBean != null && this.N != null) {
                                    double centerX = positionBean.getCenterX();
                                    double centerY = this.M.getCenterY();
                                    double width = this.M.getWidth();
                                    double height = this.M.getHeight();
                                    double centerX2 = this.N.getCenterX();
                                    double centerY2 = this.N.getCenterY();
                                    double width2 = this.N.getWidth();
                                    double height2 = this.N.getHeight();
                                    if ((centerX > 0.0d && centerX2 > 0.0d && centerX != centerX2) || ((centerY > 0.0d && centerY2 > 0.0d && centerY != centerY2) || ((width > 0.0d && width2 > 0.0d && width != width2) || (height > 0.0d && height2 > 0.0d && height != height2)))) {
                                        this.D = al.a(passPercent);
                                    }
                                    if (width2 * height2 < width * height) {
                                        this.E = true;
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
        if (this.f8073z.size() > 0) {
            Collections.sort(this.f8073z, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.f.2
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(AdSpacesBean.RenderViewBean renderViewBean3, AdSpacesBean.RenderViewBean renderViewBean4) {
                    return renderViewBean4.getLevel() - renderViewBean3.getLevel();
                }
            });
        }
    }

    private void aJ() {
        if (this.B) {
            Q();
        }
        if (this.C) {
            R();
        }
        if (this.D) {
            S();
        }
        if (this.E) {
            T();
        }
        this.H = this.G - this.J;
    }

    private View aK() {
        View view;
        String str;
        if (this.K) {
            View view2 = this.f8068u;
            if (view2 != null) {
                view2.setVisibility(8);
                view2.setAlpha(0.0f);
            }
            this.f8068u = new SkipView(this.f8064q);
            CircleProgressView circleProgressView = new CircleProgressView(this.f8064q);
            this.L = circleProgressView;
            circleProgressView.setAlpha(0.0f);
            view = this.L;
            str = "beizi";
        } else {
            view = this.f8068u;
            if (view != null) {
                CircleProgressView circleProgressView2 = new CircleProgressView(this.f8064q);
                this.L = circleProgressView2;
                circleProgressView2.setAlpha(0.0f);
                view = this.L;
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

    private void aL() {
        if (this.K) {
            if (this.M != null && this.R != null) {
                float f5 = this.P;
                float height = this.f8069v.getHeight();
                if (height == 0.0f) {
                    height = this.Q - av.a(this.f8064q, 100.0f);
                }
                double d5 = f5;
                Double.isNaN(d5);
                int width = (int) (d5 * this.M.getWidth() * 0.01d);
                if (this.M.getHeight() >= 12.0d) {
                    double d6 = width;
                    Double.isNaN(d6);
                    int height2 = (int) (d6 * this.M.getHeight() * 0.01d);
                    double d7 = height2;
                    Double.isNaN(d7);
                    int paddingHeight = (int) (d7 * this.R.getPaddingHeight() * 0.01d);
                    if (paddingHeight < 0) {
                        paddingHeight = 0;
                    }
                    ((SkipView) this.f8068u).setData(this.T, paddingHeight);
                    e(5);
                    this.f8069v.addView(this.f8068u, new FrameLayout.LayoutParams(width, height2));
                    float centerX = (f5 * ((float) (this.M.getCenterX() * 0.01d))) - (width / 2);
                    float centerY = (height * ((float) (this.M.getCenterY() * 0.01d))) - (height2 / 2);
                    this.f8068u.setX(centerX);
                    this.f8068u.setY(centerY);
                    View view = this.f8068u;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                aM();
                return;
            }
            aM();
            return;
        }
        View view2 = this.f8068u;
        if (view2 != null) {
            view2.setVisibility(0);
            this.f8068u.setAlpha(1.0f);
        }
    }

    private void aM() {
        double d5 = this.P;
        Double.isNaN(d5);
        int i4 = (int) (d5 * 0.15d);
        double d6 = i4;
        Double.isNaN(d6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, (int) (d6 * 0.45d));
        layoutParams.gravity = 53;
        layoutParams.topMargin = av.a(this.f8064q, 20.0f);
        layoutParams.rightMargin = av.a(this.f8064q, 20.0f);
        ViewGroup viewGroup = this.f8069v;
        if (viewGroup != null) {
            viewGroup.addView(this.f8068u, layoutParams);
        }
        View view = this.f8068u;
        if (view != null) {
            this.S = 1;
            this.T = 1;
            ((SkipView) view).setData(1, 0);
            ((SkipView) this.f8068u).setText(String.format("跳过 %d", 5));
            this.f8068u.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aN() {
        int[] iArr;
        float pivotX;
        float pivotY;
        float height;
        View view = this.f8068u;
        if (view == null) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        if (this.N != null) {
            float f5 = this.P;
            float height2 = this.f8069v.getHeight();
            if (height2 == 0.0f) {
                height2 = this.Q - av.a(this.f8064q, 100.0f);
            }
            double d5 = f5;
            Double.isNaN(d5);
            int width = (int) (d5 * this.N.getWidth() * 0.01d);
            double d6 = width;
            Double.isNaN(d6);
            int height3 = (int) (d6 * this.N.getHeight() * 0.01d);
            ViewGroup.LayoutParams layoutParams = this.L.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height3;
            this.L.setLayoutParams(layoutParams);
            pivotX = (f5 * ((float) (this.N.getCenterX() * 0.01d))) - (width / 2);
            pivotY = height2 * ((float) (this.N.getCenterY() * 0.01d));
            height = height3 / 2;
        } else {
            pivotX = (iArr[0] + this.f8068u.getPivotX()) - (this.L.getWidth() / 2);
            pivotY = iArr[1] + this.f8068u.getPivotY();
            height = this.L.getHeight() / 2;
        }
        this.L.setX(pivotX);
        this.L.setY(pivotY - height);
    }

    static /* synthetic */ int g(f fVar) {
        int i4 = fVar.I;
        fVar.I = i4 + 1;
        return i4;
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        SplashAD splashAD = this.f8071x;
        if (splashAD == null || splashAD.getECPM() <= 0 || this.f8067t) {
            return;
        }
        this.f8067t = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f8071x.getECPM());
        SplashAD splashAD2 = this.f8071x;
        com.beizi.fusion.d.k.a(splashAD2, splashAD2.getECPM());
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "GDT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.S == 1) {
            String valueOf = String.valueOf(i4);
            String str = this.U + " ";
            String str2 = str + valueOf;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.V)), 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.W)), str2.indexOf(valueOf), str2.length(), 33);
            ((SkipView) this.f8068u).setText(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(this.U);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(this.V)), 0, this.U.length(), 33);
        ((SkipView) this.f8068u).setText(spannableString2);
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter handleBidAdLoaded isBidTypeC2S() = ");
        sb.append(am());
        sb.append(",mSplashAD != null ? ");
        sb.append(this.f8071x != null);
        af.a("BeiZis", sb.toString());
        if (!z() || this.f8071x == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f8071x.getECPMLevel());
        if (a5 != -1 && a5 != -2) {
            af.a("BeiZisBid", "gdt splash price = " + a5);
            a((double) a5);
            return;
        }
        a(3);
        L();
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f8062o = System.currentTimeMillis();
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
                if (!av.a("com.qq.e.comm.managers.GDTAdSdk")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.f.1
                        @Override // java.lang.Runnable
                        public void run() {
                            f.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                com.beizi.fusion.d.k.a(this.f8064q, this.f7376h);
                this.f7370b.s(SDKStatus.getIntegrationSDKVersion());
                au();
                v();
            }
        }
        this.f8061n = this.f7373e.getReqTimeOutType();
        long sleepTime = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            sleepTime = Math.max(sleepTime, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f8072y;
        boolean z4 = list != null && list.size() > 0;
        this.K = z4;
        if (z4) {
            aI();
        }
        v.f7025a = !n.a(this.f7373e.getDirectDownload());
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
        this.P = av.l(this.f8064q);
        this.Q = av.m(this.f8064q);
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
    public String j() {
        SplashAD splashAD = this.f8071x;
        if (splashAD != null) {
            int a5 = ak.a(this.f7373e.getPriceDict(), splashAD.getECPMLevel());
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
        int i4;
        w();
        ag();
        long j4 = this.f8066s;
        int i5 = (int) j4;
        int i6 = this.f8061n;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    j4 -= System.currentTimeMillis() - this.f8062o;
                }
                i4 = i5;
            }
            i5 = (int) j4;
            i4 = i5;
        } else {
            i4 = 0;
        }
        af.a("BeiZis", "reqTimeOutType = " + this.f8061n + ",timeOut = " + i4);
        aK();
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f8071x = new SplashAD((Activity) this.f8064q, this.f7377i, new a(), i4, aC());
        } else {
            this.f8071x = new SplashAD((Activity) this.f8064q, this.f7377i, new a(), i4);
        }
        this.f8071x.fetchAdOnly();
    }

    private void b() {
        View view;
        View.OnClickListener onClickListener;
        if (this.K || (view = this.f8068u) == null || (onClickListener = this.f8063p) == null) {
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        SplashAD splashAD = this.f8071x;
        if (splashAD == null || splashAD.getECPM() <= 0 || this.f8067t) {
            return;
        }
        this.f8067t = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        com.beizi.fusion.d.k.b(this.f8071x, i4 != 1 ? 10001 : 1);
    }
}
