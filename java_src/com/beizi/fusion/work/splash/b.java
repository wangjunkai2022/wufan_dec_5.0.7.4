package com.beizi.fusion.work.splash;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.beizi.ad.AdListener;
import com.beizi.ad.SplashAd;
import com.beizi.fusion.d.w;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.al;
import com.beizi.fusion.g.am;
import com.beizi.fusion.g.an;
import com.beizi.fusion.g.ap;
import com.beizi.fusion.g.ar;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.x;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.update.ShakeArcView;
import com.beizi.fusion.widget.CircleProgressView;
import com.beizi.fusion.widget.ScrollClickView;
import com.beizi.fusion.widget.SkipView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: BeiZiSplashWorker.java */
/* loaded from: classes2.dex */
public class b extends com.beizi.fusion.work.a implements am.a, ap.a, ar.a {
    private long I;
    private long J;
    private boolean K;
    private CircleProgressView L;
    private AdSpacesBean.PositionBean M;
    private AdSpacesBean.PositionBean N;
    private float O;
    private float P;
    private AdSpacesBean.RenderViewBean Q;
    private int R;
    private int S;
    private String T;
    private String U;
    private String V;
    private AdSpacesBean.BuyerBean.CoolShakeViewBean W;
    private ar ab;
    private am ac;
    private ap ad;
    private AdSpacesBean.BuyerBean.RollViewBean ae;
    private AdSpacesBean.BuyerBean.CoolRollViewBean af;
    private an ag;
    private AdSpacesBean.BuyerBean.EulerAngleViewBean ah;
    private x ai;

    /* renamed from: n  reason: collision with root package name */
    AdSpacesBean.BuyerBean.ShakeViewBean f7949n;

    /* renamed from: o  reason: collision with root package name */
    AdSpacesBean.BuyerBean.RegionalClickViewBean f7950o;

    /* renamed from: p  reason: collision with root package name */
    AdSpacesBean.BuyerBean.ScrollClickBean f7951p;

    /* renamed from: q  reason: collision with root package name */
    AdSpacesBean.BuyerBean.FullScreenClickBean f7952q;

    /* renamed from: r  reason: collision with root package name */
    View.OnClickListener f7953r;

    /* renamed from: s  reason: collision with root package name */
    private Context f7954s;

    /* renamed from: t  reason: collision with root package name */
    private String f7955t;

    /* renamed from: u  reason: collision with root package name */
    private long f7956u;

    /* renamed from: v  reason: collision with root package name */
    private SplashAd f7957v;

    /* renamed from: w  reason: collision with root package name */
    private ViewGroup f7958w;

    /* renamed from: x  reason: collision with root package name */
    private ViewGroup f7959x;

    /* renamed from: y  reason: collision with root package name */
    private View f7960y;

    /* renamed from: z  reason: collision with root package name */
    private List<AdSpacesBean.RenderViewBean> f7961z;
    private List<AdSpacesBean.RenderViewBean> A = new ArrayList();
    private List<AdSpacesBean.RenderViewBean> B = new ArrayList();
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private long H = 5000;
    private String X = null;
    private boolean Y = false;
    private int Z = -1;
    private String aa = "full";

    public b(Context context, String str, long j4, View view, ViewGroup viewGroup, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.d.e eVar) {
        this.f7954s = context;
        this.f7955t = str;
        this.f7956u = j4;
        this.f7958w = viewGroup;
        this.f7373e = buyerBean;
        this.f7374f = forwardBean;
        this.f7372d = eVar;
        this.f7959x = new SplashContainer(context);
        this.f7960y = view;
        this.f7961z = list;
        r();
    }

    private void aG() {
        View view;
        View.OnClickListener onClickListener;
        if (this.K || (view = this.f7960y) == null || (onClickListener = this.f7953r) == null) {
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aH() {
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
            aG();
            this.f7372d.a(g(), (View) null);
        } else if (hVar == com.beizi.fusion.d.h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    private void aI() {
        ViewGroup viewGroup;
        SplashAd splashAd = this.f7957v;
        if (splashAd != null && splashAd.isLoaded() && (viewGroup = this.f7958w) != null) {
            viewGroup.removeAllViews();
            this.f7958w.addView(this.f7959x);
            StringBuilder sb = new StringBuilder();
            sb.append("shakeViewBean != null ? ");
            sb.append(this.f7949n != null);
            sb.append(",regionalClickViewBean != null ? ");
            sb.append(this.f7950o != null);
            sb.append(",fullScreenClickBean != null ? ");
            sb.append(this.f7952q != null);
            af.a("BeiZis", sb.toString());
            this.f7959x.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.beizi.fusion.work.splash.b.4

                /* renamed from: a  reason: collision with root package name */
                boolean f7968a;

                /* renamed from: b  reason: collision with root package name */
                boolean f7969b;

                protected void a(boolean z4) {
                    if (z4 || b.this.f7957v == null) {
                        return;
                    }
                    b.this.f7957v.disableFullClick(new View.OnTouchListener() { // from class: com.beizi.fusion.work.splash.b.4.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            return true;
                        }
                    });
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    try {
                        if (b.this.f7959x == null) {
                            return;
                        }
                        b.this.f7959x.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        if (((com.beizi.fusion.work.a) b.this).f7373e == null) {
                            return;
                        }
                        b bVar = b.this;
                        if (bVar.f7952q != null) {
                            if (((com.beizi.fusion.work.a) bVar).f7370b != null) {
                                ((com.beizi.fusion.work.a) b.this).f7370b.I(b.this.f7952q.getFullScreenClickUuid());
                                b.this.au();
                            }
                            b bVar2 = b.this;
                            AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean d5 = bVar2.d(bVar2.f7952q.getOrderData(), b.this.f7957v.getAdId());
                            if (d5 != null) {
                                if (d5.getFullScreenClick() != null) {
                                    this.f7969b = al.a(d5.getFullScreenClick().getRandomClickNum());
                                    af.a("BeiZis", "beizi clickable = " + this.f7969b);
                                    a(this.f7969b);
                                }
                            } else {
                                this.f7968a = al.a(b.this.f7952q.getRandomClickNum());
                                af.a("BeiZis", "beizi clickable Two = " + this.f7968a);
                                a(this.f7968a);
                            }
                        }
                        if (((com.beizi.fusion.work.a) b.this).f7373e.getInteractionRules() == null || ((com.beizi.fusion.work.a) b.this).f7373e.getInteractionRules().size() <= 0) {
                            b.this.aJ();
                            b.this.aR();
                            b.this.aS();
                            b.this.aT();
                            b.this.aU();
                            return;
                        }
                        String a5 = com.beizi.fusion.f.b.a(((com.beizi.fusion.work.a) b.this).f7373e.getInteractionRules(), al.b(100));
                        char c5 = 65535;
                        switch (a5.hashCode()) {
                            case -1671124246:
                                if (a5.equals("eulerAngle")) {
                                    c5 = 4;
                                    break;
                                }
                                break;
                            case -907680051:
                                if (a5.equals("scroll")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                            case -690338273:
                                if (a5.equals("regional")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                            case 3506301:
                                if (a5.equals(com.googlecode.mp4parser.boxes.mp4.samplegrouping.d.f13997b)) {
                                    c5 = 3;
                                    break;
                                }
                                break;
                            case 109399814:
                                if (a5.equals("shake")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c5 == 0) {
                            b.this.aJ();
                        } else if (c5 == 1) {
                            b.this.aR();
                        } else if (c5 == 2) {
                            b.this.aS();
                        } else if (c5 == 3) {
                            b.this.aT();
                        } else if (c5 != 4) {
                        } else {
                            b.this.aU();
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
            this.f7957v.showAd();
            if (this.L != null) {
                this.f7958w.addView(this.L, new FrameLayout.LayoutParams(-2, -2));
            }
            aN();
            if (this.K) {
                aL();
                return;
            }
            return;
        }
        aw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aJ() {
        try {
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean = this.f7949n;
            if (shakeViewBean == null || this.ab == null || shakeViewBean.getPosition() == null) {
                return;
            }
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.G(this.f7949n.getShakeViewUuid());
                au();
            }
            AdSpacesBean.BuyerBean.OrderDataShakeViewBean a5 = a(this.f7949n.getOrderData(), this.f7957v.getAdId());
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean2 = null;
            if (a5 != null && a5.getShakeView() != null) {
                shakeViewBean2 = a5.getShakeView();
            }
            View a6 = this.ab.a(av.b(this.f7954s, this.f7959x.getWidth()), av.b(this.f7954s, this.f7959x.getHeight()), this.f7949n.getPosition());
            if (a6 != null) {
                ViewGroup.LayoutParams layoutParams = a6.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
                    layoutParams2.leftMargin = marginLayoutParams.leftMargin;
                    layoutParams2.topMargin = marginLayoutParams.topMargin;
                    this.f7958w.addView(a6, layoutParams2);
                }
            }
            a(shakeViewBean2);
            this.ab.a(this);
            a(shakeViewBean2, a6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void aK() {
        for (int i4 = 0; i4 < this.f7961z.size(); i4++) {
            AdSpacesBean.RenderViewBean renderViewBean = this.f7961z.get(i4);
            String type = renderViewBean.getType();
            if ("SKIPVIEW".equals(type)) {
                this.B.add(renderViewBean);
            } else if ("MATERIALVIEW".equals(type)) {
                this.A.add(renderViewBean);
            }
        }
        if (this.B.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean2 = this.B.get(0);
            this.Q = renderViewBean2;
            if (renderViewBean2 != null) {
                this.N = renderViewBean2.getTapPosition();
                this.M = this.Q.getLayerPosition();
                long skipViewTotalTime = this.Q.getSkipViewTotalTime();
                if (skipViewTotalTime > 0) {
                    this.H = skipViewTotalTime;
                }
                long skipUnavailableTime = this.Q.getSkipUnavailableTime();
                if (skipUnavailableTime > 0) {
                    this.J = skipUnavailableTime;
                }
                this.R = this.Q.getShowCountDown();
                this.S = this.Q.getShowBorder();
                String skipText = this.Q.getSkipText();
                this.T = skipText;
                if (TextUtils.isEmpty(skipText)) {
                    this.T = "跳过";
                }
                String textColor = this.Q.getTextColor();
                this.U = textColor;
                if (TextUtils.isEmpty(textColor)) {
                    this.U = "#FFFFFF";
                }
                String countDownColor = this.Q.getCountDownColor();
                this.V = countDownColor;
                if (TextUtils.isEmpty(countDownColor)) {
                    this.V = "#FFFFFF";
                }
                List<AdSpacesBean.PassPolicyBean> passPolicy = this.Q.getPassPolicy();
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
                                this.D = al.a(passPercent);
                                break;
                            case 1:
                                this.C = al.a(passPercent);
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
                                        this.E = al.a(passPercent);
                                    }
                                    if (width2 * height2 < width * height) {
                                        this.F = true;
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
        if (this.A.size() > 0) {
            Collections.sort(this.A, new Comparator<AdSpacesBean.RenderViewBean>() { // from class: com.beizi.fusion.work.splash.b.8
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(AdSpacesBean.RenderViewBean renderViewBean3, AdSpacesBean.RenderViewBean renderViewBean4) {
                    return renderViewBean4.getLevel() - renderViewBean3.getLevel();
                }
            });
        }
    }

    private void aL() {
        if (this.C) {
            Q();
        }
        if (this.D) {
            R();
        }
        if (this.E) {
            S();
        }
        if (this.F) {
            T();
        }
        this.I = this.H - this.J;
    }

    private View aM() {
        View view;
        String str;
        this.f7953r = new View.OnClickListener() { // from class: com.beizi.fusion.work.splash.b.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                try {
                    if (b.this.f7957v != null) {
                        b.this.f7957v.closeAd();
                    }
                    b.this.H();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        };
        if (this.K) {
            View view2 = this.f7960y;
            if (view2 != null) {
                view2.setVisibility(8);
                view2.setAlpha(0.0f);
            }
            SkipView skipView = new SkipView(this.f7954s);
            this.f7960y = skipView;
            skipView.setOnClickListener(this.f7953r);
            CircleProgressView circleProgressView = new CircleProgressView(this.f7954s);
            this.L = circleProgressView;
            circleProgressView.setAlpha(0.0f);
            view = this.L;
            str = "beizi";
        } else {
            view = this.f7960y;
            if (view != null) {
                CircleProgressView circleProgressView2 = new CircleProgressView(this.f7954s);
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

    private void aN() {
        if (this.K) {
            if (this.M != null && this.Q != null) {
                float f5 = this.O;
                float height = this.f7958w.getHeight();
                if (height == 0.0f) {
                    height = this.P - av.a(this.f7954s, 100.0f);
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
                    int paddingHeight = (int) (d7 * this.Q.getPaddingHeight() * 0.01d);
                    if (paddingHeight < 0) {
                        paddingHeight = 0;
                    }
                    ((SkipView) this.f7960y).setData(this.S, paddingHeight);
                    e(5);
                    this.f7958w.addView(this.f7960y, new FrameLayout.LayoutParams(width, height2));
                    float centerX = (f5 * ((float) (this.M.getCenterX() * 0.01d))) - (width / 2);
                    float centerY = (height * ((float) (this.M.getCenterY() * 0.01d))) - (height2 / 2);
                    this.f7960y.setX(centerX);
                    this.f7960y.setY(centerY);
                    View view = this.f7960y;
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
        View view2 = this.f7960y;
        if (view2 != null) {
            view2.setVisibility(0);
            this.f7960y.setAlpha(1.0f);
        }
    }

    private void aO() {
        double d5 = this.O;
        Double.isNaN(d5);
        int i4 = (int) (d5 * 0.15d);
        double d6 = i4;
        Double.isNaN(d6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, (int) (d6 * 0.45d));
        layoutParams.gravity = 53;
        layoutParams.topMargin = av.a(this.f7954s, 20.0f);
        layoutParams.rightMargin = av.a(this.f7954s, 20.0f);
        ViewGroup viewGroup = this.f7958w;
        if (viewGroup != null) {
            viewGroup.addView(this.f7960y, layoutParams);
        }
        View view = this.f7960y;
        if (view != null) {
            this.R = 1;
            this.S = 1;
            ((SkipView) view).setData(1, 0);
            ((SkipView) this.f7960y).setText(String.format("跳过 %d", 5));
            this.f7960y.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aP() {
        int[] iArr;
        float pivotX;
        float pivotY;
        float height;
        try {
            View view = this.f7960y;
            if (view == null) {
                return;
            }
            view.getLocationOnScreen(new int[2]);
            if (this.N != null) {
                float f5 = this.O;
                float height2 = this.f7958w.getHeight();
                if (height2 == 0.0f) {
                    height2 = this.P - av.a(this.f7954s, 100.0f);
                }
                double d5 = f5;
                double width = this.N.getWidth() * 0.01d;
                Double.isNaN(d5);
                int i4 = (int) (d5 * width);
                double d6 = i4;
                double height3 = this.N.getHeight() * 0.01d;
                Double.isNaN(d6);
                int i5 = (int) (d6 * height3);
                ViewGroup.LayoutParams layoutParams = this.L.getLayoutParams();
                layoutParams.width = i4;
                layoutParams.height = i5;
                this.L.setLayoutParams(layoutParams);
                pivotX = (f5 * ((float) (this.N.getCenterX() * 0.01d))) - (i4 / 2);
                pivotY = height2 * ((float) (this.N.getCenterY() * 0.01d));
                height = i5 / 2;
            } else {
                pivotX = (iArr[0] + this.f7960y.getPivotX()) - (this.L.getWidth() / 2);
                pivotY = iArr[1] + this.f7960y.getPivotY();
                height = this.L.getHeight() / 2;
            }
            float f6 = pivotY - height;
            this.L.setX(pivotX);
            this.L.setY(f6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void aQ() {
        SplashAd splashAd = this.f7957v;
        if (splashAd != null) {
            splashAd.adClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aR() {
        try {
            AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean = this.f7950o;
            if (regionalClickViewBean == null || this.ac == null || regionalClickViewBean.getPosition() == null) {
                return;
            }
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.J(this.f7950o.getRegionalClickUuid());
                au();
            }
            AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean b5 = b(this.f7950o.getOrderData(), this.f7957v.getAdId());
            if (b5 != null) {
                this.ac.a(b5.getRegionalClickView());
            } else {
                this.ac.a(this.f7950o);
            }
            View a5 = this.ac.a(av.b(this.f7954s, this.f7959x.getWidth()), av.b(this.f7954s, this.f7959x.getHeight()), this.f7950o.getPosition(), true);
            if (a5 != null) {
                ViewGroup.LayoutParams layoutParams = a5.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
                    layoutParams2.leftMargin = marginLayoutParams.leftMargin;
                    layoutParams2.topMargin = marginLayoutParams.topMargin;
                    try {
                        this.f7958w.addView(a5, layoutParams2);
                        this.ac.a(this);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aS() {
        try {
            AdSpacesBean.BuyerBean.ScrollClickBean scrollClickBean = this.f7951p;
            if (scrollClickBean == null || this.ad == null || scrollClickBean.getPosition() == null) {
                return;
            }
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.F(this.f7951p.getScrollClickUuid());
                au();
            }
            AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean c5 = c(this.f7951p.getOrderData(), this.f7957v.getAdId());
            if (c5 != null) {
                this.ad.a(c5.getScrollClick());
            } else {
                this.ad.a(this.f7951p);
            }
            View a5 = this.ad.a(av.b(this.f7954s, this.f7959x.getWidth()), av.b(this.f7954s, this.f7959x.getHeight()), this.f7951p.getPosition());
            if (a5 != null) {
                ViewGroup.LayoutParams layoutParams = a5.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
                    layoutParams2.leftMargin = marginLayoutParams.leftMargin;
                    layoutParams2.topMargin = marginLayoutParams.topMargin;
                    try {
                        this.f7958w.addView(a5, layoutParams2);
                        this.ad.a(this);
                        a(this.f7951p.getScrollDirection(), this.f7951p.getScrollDistance(), this);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aT() {
        try {
            AdSpacesBean.BuyerBean.RollViewBean rollView = this.f7373e.getRollView();
            this.ae = rollView;
            if (rollView == null) {
                return;
            }
            AdSpacesBean.BuyerBean.OrderDataRollViewBean e5 = e(rollView.getOrderData(), this.f7957v.getAdId());
            AdSpacesBean.BuyerBean.RollViewBean rollViewBean = null;
            if (e5 != null && e5.getRollView() != null) {
                rollViewBean = e5.getRollView();
            }
            if (rollViewBean == null) {
                rollViewBean = this.ae;
            }
            if (rollViewBean.getPosition() == null) {
                return;
            }
            com.beizi.fusion.b.b bVar = this.f7370b;
            if (bVar != null) {
                bVar.H(rollViewBean.getRollViewUuid());
                au();
            }
            if (this.ag == null) {
                this.ag = new an(this.f7954s);
            }
            this.ag.a(this.f7958w, av.b(this.f7954s, this.f7959x.getWidth()), av.b(this.f7954s, this.f7959x.getHeight()), rollViewBean);
            AdSpacesBean.BuyerBean.RollViewBean rollViewBean2 = this.ae;
            if (rollViewBean2 != null) {
                this.af = rollViewBean2.getCoolRollView();
            }
            a(rollViewBean);
            this.ag.a();
            final int isClick = rollViewBean.getIsClick();
            this.ag.a(new an.a() { // from class: com.beizi.fusion.work.splash.b.10
                @Override // com.beizi.fusion.g.an.a
                public void a() {
                    if (b.this.Y && b.this.af != null) {
                        at.a(b.this.f7954s, b.this.X, Long.valueOf(System.currentTimeMillis()));
                    }
                    b.this.aa = com.googlecode.mp4parser.boxes.mp4.samplegrouping.d.f13997b;
                    ((com.beizi.fusion.work.a) b.this).f7370b.O(com.googlecode.mp4parser.boxes.mp4.samplegrouping.d.f13997b);
                    b.this.au();
                    af.a("BeiZis", "enter onRollHappened  ");
                    b.this.a("", "", "", "", "", "", "", "", 5);
                }

                @Override // com.beizi.fusion.g.an.a
                public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    if (isClick == 1) {
                        b.this.aa = "regionalClick";
                        ((com.beizi.fusion.work.a) b.this).f7370b.O("regionalClick");
                        b.this.au();
                        af.a("BeiZis", "enter onClickHappened  ");
                        b.this.a(str, str2, str3, str4, str5, str6, str7, str8, 0);
                        b.this.ag.c();
                    }
                }
            });
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleRule = this.f7373e.getEulerAngleRule();
            this.ah = eulerAngleRule;
            if (eulerAngleRule == null) {
                return;
            }
            AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean f5 = f(eulerAngleRule.getOrderData(), this.f7957v.getAdId());
            AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean = null;
            if (f5 != null && f5.getEulerAngleRule() != null) {
                eulerAngleViewBean = f5.getEulerAngleRule();
            }
            if (eulerAngleViewBean != null) {
                com.beizi.fusion.b.b bVar = this.f7370b;
                if (bVar != null) {
                    bVar.R(eulerAngleViewBean.getEulerAngleUuid());
                    au();
                }
            } else {
                com.beizi.fusion.b.b bVar2 = this.f7370b;
                if (bVar2 != null) {
                    bVar2.R(this.ah.getEulerAngleUuid());
                    au();
                }
            }
            if (this.ai == null) {
                this.ai = new x(this.f7954s, this.f7377i, this.ah, eulerAngleViewBean);
            }
            this.ai.a(this.f7958w, av.b(this.f7954s, this.f7959x.getWidth()), av.b(this.f7954s, this.f7959x.getHeight()));
            this.ai.a(new x.a() { // from class: com.beizi.fusion.work.splash.b.2
                @Override // com.beizi.fusion.g.x.a
                public void a() {
                    try {
                        b.this.aa = "eulerAngle";
                        ((com.beizi.fusion.work.a) b.this).f7370b.O("eulerAngle");
                        b.this.au();
                        b.this.a("", "", "", "", "", "", "", "", 2);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
            this.ai.a();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.beizi.fusion.g.ap.a
    public void c_() {
        this.aa = "scroll";
        this.f7370b.O("scroll");
        au();
        af.a("BeiZis", "enter onScrollDistanceMeet ");
        aQ();
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "BEIZI";
    }

    private boolean c(long j4) {
        try {
            return System.currentTimeMillis() - this.f7954s.getPackageManager().getPackageInfo(this.f7954s.getPackageName(), 0).firstInstallTime < j4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private AdSpacesBean.BuyerBean.OrderDataRollViewBean e(List<AdSpacesBean.BuyerBean.OrderDataRollViewBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataRollViewBean orderDataRollViewBean : list) {
                List<String> orderList = orderDataRollViewBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataRollViewBean;
                }
            }
        }
        return null;
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7957v == null) {
            return;
        }
        al();
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        this.X = "splash_cool_" + this.f7377i;
        af.b("BeiZis", "AdWorker chanel = " + this.f7371c);
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.beizi.ad.BeiZi")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                w.a(this.f7954s, this.f7376h);
                v();
            }
        }
        long sleepTime = this.f7374f.getSleepTime();
        if (this.f7372d.u()) {
            sleepTime = Math.max(sleepTime, this.f7374f.getHotRequestDelay());
        }
        List<AdSpacesBean.RenderViewBean> list = this.f7961z;
        boolean z4 = list != null && list.size() > 0;
        this.K = z4;
        if (z4) {
            aK();
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
        this.O = av.l(this.f7954s);
        this.P = av.m(this.f7954s);
        this.ab = new ar(this.f7954s);
        this.ac = new am(this.f7954s);
        this.ad = new ap(this.f7954s);
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" out make show ad");
        try {
            aI();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        SplashAd splashAd = this.f7957v;
        if (splashAd == null) {
            return null;
        }
        return splashAd.getPrice();
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        View aM = aM();
        AdSpacesBean.BuyerBean.ShakeViewBean shakeView = this.f7373e.getShakeView();
        this.f7949n = shakeView;
        if (shakeView != null) {
            this.W = shakeView.getCoolShakeView();
        }
        this.f7950o = this.f7373e.getRegionalClickView();
        this.f7952q = this.f7373e.getFullScreenClick();
        this.f7951p = this.f7373e.getScrollClick();
        SplashAd splashAd = new SplashAd(this.f7954s, this.f7959x, aM, new AdListener() { // from class: com.beizi.fusion.work.splash.b.3

            /* renamed from: a  reason: collision with root package name */
            boolean f7966a = false;

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
                r1 = com.beizi.fusion.g.al.a(java.lang.Integer.parseInt(r4.getRate()));
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
            @Override // com.beizi.ad.AdListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onAdClicked() {
                /*
                    r7 = this;
                    com.beizi.fusion.work.splash.b r0 = com.beizi.fusion.work.splash.b.this
                    android.content.Context r0 = com.beizi.fusion.work.splash.b.u(r0)
                    long r1 = java.lang.System.currentTimeMillis()
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    java.lang.String r2 = "uniteTime"
                    com.beizi.fusion.g.at.a(r0, r2, r1)
                    r0 = 1
                    r1 = 0
                    com.beizi.fusion.work.splash.b r2 = com.beizi.fusion.work.splash.b.this     // Catch: java.lang.Exception -> L54
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = com.beizi.fusion.work.splash.b.v(r2)     // Catch: java.lang.Exception -> L54
                    java.util.List r2 = r2.getCallBackStrategy()     // Catch: java.lang.Exception -> L54
                    if (r2 == 0) goto L52
                    int r3 = r2.size()     // Catch: java.lang.Exception -> L54
                    if (r3 <= 0) goto L52
                    r3 = 0
                L28:
                    int r4 = r2.size()     // Catch: java.lang.Exception -> L50
                    if (r3 >= r4) goto L59
                    java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Exception -> L50
                    com.beizi.fusion.model.AdSpacesBean$CallBackStrategyBean r4 = (com.beizi.fusion.model.AdSpacesBean.CallBackStrategyBean) r4     // Catch: java.lang.Exception -> L50
                    java.lang.String r5 = "290.300"
                    java.lang.String r6 = r4.getEventCode()     // Catch: java.lang.Exception -> L50
                    boolean r5 = r5.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> L50
                    if (r5 == 0) goto L4d
                    java.lang.String r2 = r4.getRate()     // Catch: java.lang.Exception -> L50
                    int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L50
                    boolean r1 = com.beizi.fusion.g.al.a(r2)     // Catch: java.lang.Exception -> L50
                    goto L59
                L4d:
                    int r3 = r3 + 1
                    goto L28
                L50:
                    r2 = move-exception
                    goto L56
                L52:
                    r0 = 0
                    goto L59
                L54:
                    r2 = move-exception
                    r0 = 0
                L56:
                    r2.printStackTrace()
                L59:
                    if (r0 == 0) goto L7b
                    com.beizi.fusion.work.splash.b r2 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = com.beizi.fusion.work.splash.b.w(r2)
                    if (r2 == 0) goto L7b
                    com.beizi.fusion.work.splash.b r2 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.b.b r2 = com.beizi.fusion.work.splash.b.y(r2)
                    com.beizi.fusion.work.splash.b r3 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean r3 = com.beizi.fusion.work.splash.b.x(r3)
                    java.lang.String r3 = r3.getCallBackStrategyUuid()
                    r2.P(r3)
                    com.beizi.fusion.work.splash.b r2 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.work.splash.b.z(r2)
                L7b:
                    com.beizi.fusion.work.splash.b r2 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.work.splash.b.A(r2)
                    if (r0 == 0) goto L85
                    if (r1 != 0) goto L85
                    return
                L85:
                    com.beizi.fusion.work.splash.b r0 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.d.e r0 = com.beizi.fusion.work.splash.b.B(r0)
                    if (r0 == 0) goto La1
                    com.beizi.fusion.work.splash.b r0 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.d.e r0 = com.beizi.fusion.work.splash.b.C(r0)
                    com.beizi.fusion.work.splash.b r1 = com.beizi.fusion.work.splash.b.this
                    java.lang.String r1 = r1.g()
                    r0.d(r1)
                    com.beizi.fusion.work.splash.b r0 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.work.splash.b.D(r0)
                La1:
                    com.beizi.fusion.work.splash.b r0 = com.beizi.fusion.work.splash.b.this
                    com.beizi.fusion.work.splash.b.E(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.work.splash.b.AnonymousClass3.onAdClicked():void");
            }

            @Override // com.beizi.ad.AdListener
            public void onAdClosed() {
                try {
                    if (((com.beizi.fusion.work.a) b.this).f7372d != null) {
                        ((com.beizi.fusion.work.a) b.this).f7372d.c(b.this.g());
                    }
                    b.this.G();
                    if (b.this.ab != null) {
                        b.this.ab.c();
                    }
                    if (b.this.ac != null) {
                        b.this.ac.a();
                    }
                    if (b.this.ad != null) {
                        b.this.ad.b();
                    }
                    if (b.this.ag != null) {
                        b.this.ag.b();
                    }
                    if (b.this.ai != null) {
                        b.this.ai.b();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.beizi.ad.AdListener
            public void onAdFailedToLoad(int i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("showBeiZiSplash onAdFailedToLoad:");
                sb.append(i4);
                b.this.a(String.valueOf(i4), i4);
            }

            @Override // com.beizi.ad.AdListener
            public void onAdLoaded() {
                StringBuilder sb = new StringBuilder();
                sb.append("showBeiZiSplash onAdLoaded:");
                sb.append(System.currentTimeMillis());
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                if (b.this.f7957v.getPrice() != null) {
                    try {
                        b bVar = b.this;
                        bVar.a(Double.parseDouble(bVar.f7957v.getPrice()));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                b.this.y();
                if (b.this.Y()) {
                    b.this.aH();
                } else {
                    b.this.O();
                }
            }

            @Override // com.beizi.ad.AdListener
            public void onAdShown() {
                ((com.beizi.fusion.work.a) b.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                if (((com.beizi.fusion.work.a) b.this).f7372d != null) {
                    if (((com.beizi.fusion.work.a) b.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) b.this).f7372d.b(b.this.g());
                    }
                    b.this.ah();
                }
                b.this.C();
                b.this.U();
                b.this.D();
            }

            @Override // com.beizi.ad.AdListener
            public void onAdTick(long j4) {
                try {
                    if (!this.f7966a) {
                        b.this.aP();
                        this.f7966a = true;
                    }
                    if (b.this.K) {
                        if (b.this.J > 0 && b.this.J <= b.this.H) {
                            if (b.this.C) {
                                if (b.this.I <= 0 || j4 <= b.this.I) {
                                    b.this.G = false;
                                    b.this.f7960y.setAlpha(1.0f);
                                } else {
                                    b.this.G = true;
                                    b.this.f7960y.setAlpha(0.2f);
                                }
                            }
                            if (b.this.J == b.this.H) {
                                b.this.f7960y.setEnabled(false);
                            } else {
                                b.this.f7960y.setEnabled(true);
                            }
                        }
                        b.this.e(Math.round(((float) j4) / 1000.0f));
                    }
                    if (((com.beizi.fusion.work.a) b.this).f7372d == null || ((com.beizi.fusion.work.a) b.this).f7372d.r() == 2) {
                        return;
                    }
                    ((com.beizi.fusion.work.a) b.this).f7372d.a(j4);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }, this.f7377i);
        this.f7957v = splashAd;
        splashAd.setCloseButtonPadding(10, 20, 10, 10);
        this.f7957v.openAdInNativeBrowser(true);
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        super.m();
        SplashAd splashAd = this.f7957v;
        if (splashAd != null) {
            splashAd.cancel();
            this.f7957v = null;
        }
    }

    private boolean b(long j4) {
        long longValue = ((Long) at.b(this.f7954s, this.X, 0L)).longValue();
        return longValue != 0 && System.currentTimeMillis() - longValue < j4;
    }

    private AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean c(List<AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> list, String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.R == 1) {
            String valueOf = String.valueOf(i4);
            String str = this.T + " ";
            String str2 = str + valueOf;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.U)), 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(this.V)), str2.indexOf(valueOf), str2.length(), 33);
            ((SkipView) this.f7960y).setText(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(this.T);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(this.U)), 0, this.T.length(), 33);
        ((SkipView) this.f7960y).setText(spannableString2);
    }

    private AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean f(List<AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean> list, String str) {
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

    private boolean b(AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        if (shakeViewBean != null) {
            AdSpacesBean.BuyerBean.AliaseShakeViewBean aliaseShakeView = shakeViewBean.getAliaseShakeView();
            if (aliaseShakeView != null && aliaseShakeView.getPassivationTime() > 0 && (aliaseShakeView.getShakeCount() > 0 || aliaseShakeView.getRotatCount() > 0)) {
                return true;
            }
        } else {
            AdSpacesBean.BuyerBean.AliaseShakeViewBean aliaseShakeView2 = this.f7949n.getAliaseShakeView();
            if (this.f7949n.getAliaseShakeView() != null && aliaseShakeView2.getPassivationTime() > 0 && (aliaseShakeView2.getShakeCount() > 0 || aliaseShakeView2.getRotatCount() > 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.fusion.work.a
    public void a(Message message) {
        com.beizi.fusion.b.b bVar = this.f7370b;
        if (bVar != null) {
            bVar.i(String.valueOf(message.obj));
            this.f7370b.m(String.valueOf(message.obj));
            au();
            B();
        }
    }

    private void a(AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        final AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean2 = shakeViewBean != null ? shakeViewBean : this.f7949n;
        AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean = this.W;
        if (coolShakeViewBean == null) {
            if (b(shakeViewBean)) {
                AdSpacesBean.BuyerBean.AliaseShakeViewBean aliaseShakeView = shakeViewBean2.getAliaseShakeView();
                if (aliaseShakeView != null) {
                    this.ab.a(aliaseShakeView);
                    new Handler().postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.b.5
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.Y = true;
                            b.this.ab.a(shakeViewBean2);
                        }
                    }, al.b(aliaseShakeView.getPassivationTime()));
                    return;
                }
                return;
            }
            this.Y = true;
            this.ab.a(shakeViewBean2);
        } else if (b(coolShakeViewBean.getCoolTime())) {
            this.Z = this.W.getFeedback();
            this.ab.a(this.W);
        } else if (c(this.W.getUserProtectTime())) {
            this.Z = this.W.getFeedback();
            this.ab.a(this.W);
        } else if (b(shakeViewBean)) {
            AdSpacesBean.BuyerBean.AliaseShakeViewBean aliaseShakeView2 = shakeViewBean2.getAliaseShakeView();
            if (aliaseShakeView2 != null) {
                this.ab.a(aliaseShakeView2);
                new Handler().postDelayed(new Runnable() { // from class: com.beizi.fusion.work.splash.b.6
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.Y = true;
                        b.this.ab.a(shakeViewBean2);
                    }
                }, al.b(aliaseShakeView2.getPassivationTime()));
            }
        } else {
            this.Y = true;
            this.ab.a(shakeViewBean2);
        }
    }

    private AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean b(List<AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean> list, String str) {
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

    @Override // com.beizi.fusion.g.ar.a
    public void b() {
        if (this.Y && this.W != null) {
            at.a(this.f7954s, this.X, Long.valueOf(System.currentTimeMillis()));
        }
        this.aa = "shake";
        this.f7370b.O("shake");
        au();
        af.a("BeiZis", "enter onShakeHappened  ");
        a("", "", "", "", "", "", "", "", 2);
    }

    @Override // com.beizi.fusion.g.ap.a
    public void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.aa = "scroll";
        this.f7370b.O("scroll");
        au();
        af.a("BeiZis", "enter onScrollDistanceMeetByPosition ");
        a(str, str2, str3, str4, str5, str6, str7, str8, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean d(List<AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean> list, String str) {
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

    private void a(AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean, View view) {
        if (this.Z == -1) {
            this.Z = this.f7949n.getFeedback();
            if (shakeViewBean != null) {
                this.Z = shakeViewBean.getFeedback();
            }
        }
        if (this.Z == 0 || view == null || this.ab == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ShakeArcView shakeArcView = new ShakeArcView(this.f7954s);
            shakeArcView.setLineRadius(5);
            double d5 = marginLayoutParams.width;
            Double.isNaN(d5);
            int i4 = (int) (d5 * 0.5d);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, i4);
            layoutParams2.leftMargin = marginLayoutParams.leftMargin + (((marginLayoutParams.width - i4) - 12) / 2);
            double d6 = marginLayoutParams.topMargin;
            double d7 = marginLayoutParams.height;
            Double.isNaN(d7);
            Double.isNaN(d6);
            layoutParams2.topMargin = (int) (d6 + (d7 * 0.08d));
            this.f7958w.addView(shakeArcView, layoutParams2);
            this.ab.a(shakeArcView, this.Z);
        }
    }

    private void a(final String str, int i4, final ap.a aVar) {
        final int a5 = av.a(this.f7954s, i4);
        this.f7957v.setScrollClick(new View.OnTouchListener() { // from class: com.beizi.fusion.work.splash.b.7

            /* renamed from: a  reason: collision with root package name */
            float f7976a;

            /* renamed from: b  reason: collision with root package name */
            float f7977b;

            /* renamed from: c  reason: collision with root package name */
            float f7978c;

            /* renamed from: d  reason: collision with root package name */
            float f7979d;

            /* renamed from: e  reason: collision with root package name */
            float f7980e;

            /* renamed from: f  reason: collision with root package name */
            float f7981f;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ap.a aVar2;
                ap.a aVar3;
                ap.a aVar4;
                ap.a aVar5;
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f7976a = motionEvent.getX();
                    this.f7977b = motionEvent.getY();
                    this.f7978c = motionEvent.getX();
                    this.f7979d = motionEvent.getY();
                    this.f7980e = motionEvent.getRawX();
                    this.f7981f = motionEvent.getRawY();
                } else if (action == 1) {
                    af.b("ScrollClickUtil", "mCurPosX = " + this.f7978c + ",mCurPosY = " + this.f7979d + ",mPosX = " + this.f7976a + ",mPosY = " + this.f7977b);
                    float f5 = this.f7979d;
                    float f6 = this.f7977b;
                    if (f5 - f6 > 0.0f && Math.abs(f5 - f6) > a5) {
                        if (ScrollClickView.DIR_DOWN.equalsIgnoreCase(str) && (aVar5 = aVar) != null) {
                            aVar5.b(this.f7976a + "", this.f7977b + "", this.f7980e + "", this.f7981f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                        }
                    } else {
                        float f7 = this.f7979d;
                        float f8 = this.f7977b;
                        if (f7 - f8 < 0.0f && Math.abs(f7 - f8) > a5) {
                            if ("up".equalsIgnoreCase(str) && (aVar4 = aVar) != null) {
                                aVar4.b(this.f7976a + "", this.f7977b + "", this.f7980e + "", this.f7981f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                            }
                        } else {
                            float f9 = this.f7978c;
                            float f10 = this.f7976a;
                            if (f9 - f10 < 0.0f && Math.abs(f9 - f10) > a5) {
                                if (ScrollClickView.DIR_LEFT.equalsIgnoreCase(str) && (aVar3 = aVar) != null) {
                                    aVar3.b(this.f7976a + "", this.f7977b + "", this.f7980e + "", this.f7981f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                                }
                            } else {
                                float f11 = this.f7978c;
                                float f12 = this.f7976a;
                                if (f11 - f12 > 0.0f && Math.abs(f11 - f12) > a5 && ScrollClickView.DIR_RIGHT.equalsIgnoreCase(str) && (aVar2 = aVar) != null) {
                                    aVar2.b(this.f7976a + "", this.f7977b + "", this.f7980e + "", this.f7981f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                                }
                            }
                        }
                    }
                } else if (action == 2) {
                    this.f7978c = motionEvent.getX();
                    this.f7979d = motionEvent.getY();
                }
                return true;
            }
        });
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

    @Override // com.beizi.fusion.g.am.a
    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.aa = "regionalClick";
        this.f7370b.O("regionalClick");
        au();
        af.a("BeiZis", "enter onRegionClickByPosition ");
        a(str, str2, str3, str4, str5, str6, str7, str8, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4) {
        SplashAd splashAd = this.f7957v;
        if (splashAd != null) {
            splashAd.adClick(str, str2, str3, str4, str5, str6, str7, str8, i4);
        }
    }

    private void a(AdSpacesBean.BuyerBean.RollViewBean rollViewBean) {
        AdSpacesBean.BuyerBean.CoolRollViewBean coolRollViewBean = this.af;
        if (coolRollViewBean == null) {
            this.Y = true;
            this.ag.a(rollViewBean);
        } else if (b(coolRollViewBean.getCoolTime())) {
            this.ag.a(this.af);
        } else if (c(this.af.getUserProtectTime())) {
            this.ag.a(this.af);
        } else {
            this.Y = true;
            this.ag.a(rollViewBean);
        }
    }
}
