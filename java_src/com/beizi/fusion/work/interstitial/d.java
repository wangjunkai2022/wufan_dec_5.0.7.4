package com.beizi.fusion.work.interstitial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.k;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ak;
import com.beizi.fusion.g.av;
import com.beizi.fusion.g.n;
import com.beizi.fusion.g.v;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.work.interstitial.GdtNativeInterstitialCustomLayout;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.constants.ErrorCode;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.util.AdError;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: GdtNativeInterstitialWorker.java */
/* loaded from: classes2.dex */
public class d extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c, GdtNativeInterstitialCustomLayout.a {
    private CountDownTimer A;
    private Activity C;
    private AdSpacesBean.RenderViewBean D;

    /* renamed from: n  reason: collision with root package name */
    View f7735n;

    /* renamed from: o  reason: collision with root package name */
    TextView f7736o;

    /* renamed from: p  reason: collision with root package name */
    RelativeLayout f7737p;

    /* renamed from: q  reason: collision with root package name */
    private Context f7738q;

    /* renamed from: r  reason: collision with root package name */
    private String f7739r;

    /* renamed from: s  reason: collision with root package name */
    private long f7740s;

    /* renamed from: t  reason: collision with root package name */
    private long f7741t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7742u;

    /* renamed from: v  reason: collision with root package name */
    private NativeUnifiedAD f7743v;

    /* renamed from: w  reason: collision with root package name */
    private NativeUnifiedADData f7744w;

    /* renamed from: x  reason: collision with root package name */
    private float f7745x;

    /* renamed from: y  reason: collision with root package name */
    private float f7746y;

    /* renamed from: z  reason: collision with root package name */
    private FrameLayout f7747z;
    private long B = 5000;
    private boolean E = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GdtNativeInterstitialWorker.java */
    /* loaded from: classes2.dex */
    public class a implements NativeADUnifiedListener {
        private a() {
        }

        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
            d.this.y();
            if (list == null || list.size() == 0) {
                d.this.c(-991);
                return;
            }
            d.this.f7744w = list.get(0);
            if (d.this.f7744w == null) {
                d.this.c(-991);
                return;
            }
            if (d.this.f7744w.getECPM() > 0) {
                d dVar = d.this;
                dVar.a(dVar.f7744w.getECPM());
            }
            if (v.f7025a) {
                d.this.f7744w.setDownloadConfirmListener(v.f7026b);
            }
            NativeADEventListener nativeADEventListener = new NativeADEventListener() { // from class: com.beizi.fusion.work.interstitial.d.a.1

                /* renamed from: a  reason: collision with root package name */
                boolean f7751a = false;

                /* renamed from: b  reason: collision with root package name */
                boolean f7752b = false;

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADClicked() {
                    if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) d.this).f7372d.d(d.this.g());
                    }
                    if (this.f7752b) {
                        return;
                    }
                    this.f7752b = true;
                    d.this.E();
                    d.this.ai();
                }

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADError(AdError adError) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ShowGdtInterstitialCustom onADError: ");
                    sb.append(adError.getErrorMsg());
                    d.this.a(adError.getErrorMsg(), adError.getErrorCode());
                }

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADExposed() {
                    ((com.beizi.fusion.work.a) d.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                    if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) d.this).f7372d.b(d.this.g());
                    }
                    if (this.f7751a) {
                        return;
                    }
                    this.f7751a = true;
                    d.this.az();
                    d.this.C();
                    d.this.D();
                    d.this.ah();
                }

                @Override // com.qq.e.ads.nativ.NativeADEventListener
                public void onADStatusChanged() {
                    af.a("BeiZis", "ShowGdtInterstitialCustom onADStatusChanged()");
                }
            };
            NativeADMediaListener nativeADMediaListener = new NativeADMediaListener() { // from class: com.beizi.fusion.work.interstitial.d.a.2

                /* renamed from: a  reason: collision with root package name */
                boolean f7754a = false;

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoClicked() {
                    if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                        ((com.beizi.fusion.work.a) d.this).f7372d.d(d.this.g());
                    }
                    if (this.f7754a) {
                        return;
                    }
                    this.f7754a = true;
                    d.this.E();
                    d.this.ai();
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoCompleted() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoError(AdError adError) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ShowGdtInterstitialCustom MediaView onVideoError: ");
                    sb.append(adError.getErrorMsg());
                    d.this.a(adError.getErrorMsg(), adError.getErrorCode());
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoInit() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoLoaded(int i4) {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoLoading() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoPause() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoReady() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoResume() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoStart() {
                }

                @Override // com.qq.e.ads.nativ.NativeADMediaListener
                public void onVideoStop() {
                }
            };
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.beizi.fusion.work.interstitial.d.a.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    d.this.H();
                    d.this.aL();
                }
            };
            GdtNativeInterstitialCustomLayout gdtNativeInterstitialCustomLayout = new GdtNativeInterstitialCustomLayout(d.this.f7738q);
            gdtNativeInterstitialCustomLayout.setViewInteractionListener(d.this);
            boolean onBindData = gdtNativeInterstitialCustomLayout.onBindData(d.this.f7744w, d.this.f7745x, d.this.f7746y, d.this.D, nativeADEventListener, nativeADMediaListener, onClickListener);
            if (d.this.f7744w.getAdPatternType() == 2 && d.this.D != null && d.this.D.getVideoSkipTime() > 0) {
                d dVar2 = d.this;
                dVar2.B = dVar2.D.getVideoSkipTime();
            }
            if (onBindData) {
                d.this.f7747z = gdtNativeInterstitialCustomLayout;
                d.this.aJ();
                return;
            }
            d dVar3 = d.this;
            dVar3.a("sdk custom error ".concat(dVar3.g()).concat(" ").concat("create view error"), 10140);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowGdtInterstitialCustom onNoAD: ");
            sb.append(adError.getErrorMsg());
            d.this.a(adError.getErrorMsg(), adError.getErrorCode());
        }
    }

    public d(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7738q = context;
        this.f7739r = str;
        this.f7740s = j4;
        this.f7741t = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        int sizeRatio = buyerBean.getSizeRatio();
        float j6 = av.j(context) * 0.8f;
        this.f7745x = j6;
        this.f7746y = sizeRatio == 1 ? (j6 * 16.0f) / 9.0f : (j6 * 9.0f) / 16.0f;
        af.a("BeiZis", "interstitial mAdWidthDp = " + this.f7745x + ",mAdHeightDp = " + this.f7746y);
        r();
    }

    private void aG() {
        TextView textView = new TextView(this.f7738q);
        this.f7736o = textView;
        textView.setTextColor(this.f7738q.getResources().getColor(17170443));
        this.f7736o.setTextSize(2, 14.0f);
        e((int) (this.B / 1000));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(2, ErrorCode.ServerError.OS_TYPE_ERROR);
        layoutParams.addRule(7, ErrorCode.ServerError.OS_TYPE_ERROR);
        layoutParams.bottomMargin = av.a(this.f7738q, 3.0f);
        RelativeLayout relativeLayout = this.f7737p;
        if (relativeLayout != null) {
            relativeLayout.addView(this.f7736o, layoutParams);
        }
    }

    private void aH() {
        ((FrameLayout) this.f7735n).removeView(this.f7737p);
    }

    private void aI() {
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
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            if (this.f7747z != null) {
                this.f7372d.a(g(), this.f7747z);
            } else {
                this.f7372d.a(10140);
            }
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aJ() {
        if (Y()) {
            aI();
        } else {
            O();
        }
    }

    private void aK() {
        CountDownTimer countDownTimer = this.A;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(100 + this.B, 50L) { // from class: com.beizi.fusion.work.interstitial.d.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                d.this.aL();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                if (((com.beizi.fusion.work.a) d.this).f7372d != null && ((com.beizi.fusion.work.a) d.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) d.this).f7372d.a(j4);
                }
                d.this.e((int) (((float) j4) / 1000.0f));
            }
        };
        this.A = countDownTimer2;
        countDownTimer2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aL() {
        ac();
        G();
        c(this.C);
    }

    @Override // com.beizi.fusion.work.interstitial.GdtNativeInterstitialCustomLayout.a
    public void a_() {
        n();
    }

    @Override // com.beizi.fusion.work.a
    public void az() {
        NativeUnifiedADData nativeUnifiedADData = this.f7744w;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.f7742u) {
            return;
        }
        this.f7742u = true;
        af.a("BeiZis", "channel == GDT竞价成功");
        af.a("BeiZis", "channel == sendWinNoticeECPM" + this.f7744w.getECPM());
        NativeUnifiedADData nativeUnifiedADData2 = this.f7744w;
        k.a(nativeUnifiedADData2, nativeUnifiedADData2.getECPM());
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "GDT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.f7736o == null) {
            return;
        }
        int i5 = 1;
        String format = String.format(Locale.CHINA, "广告%d秒后自动关闭", Integer.valueOf(i4));
        if (i4 >= 10 && i4 <= 99) {
            i5 = 2;
        }
        String valueOf = String.valueOf(i4);
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffff")), 0, format.indexOf(valueOf), 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffff")), format.indexOf(valueOf) + i5, format.length(), 17);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff9933")), format.indexOf(valueOf), format.indexOf(valueOf) + i5, 17);
        this.f7736o.setText(spannableString);
    }

    @Override // com.beizi.fusion.work.a
    protected void A() {
        if (!z() || this.f7744w == null) {
            return;
        }
        al();
        int a5 = ak.a(this.f7373e.getPriceDict(), this.f7744w.getECPMLevel());
        if (a5 == -1 || a5 == -2) {
            if (a5 == -2) {
                L();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdt realPrice = ");
        sb.append(a5);
        a(a5);
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        NativeUnifiedADData nativeUnifiedADData = this.f7744w;
        if (nativeUnifiedADData != null) {
            int a5 = ak.a(this.f7373e.getPriceDict(), nativeUnifiedADData.getECPMLevel());
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
        w();
        ag();
        if (this.f7745x <= 0.0f) {
            this.f7745x = av.j(this.f7738q);
        }
        if (this.f7746y <= 0.0f) {
            this.f7746y = 0.0f;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            this.f7743v = new NativeUnifiedAD(this.f7738q, this.f7377i, new a(), aC());
        } else {
            this.f7743v = new NativeUnifiedAD(this.f7738q, this.f7377i, new a());
        }
        this.f7743v.loadData(1);
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        NativeUnifiedADData nativeUnifiedADData = this.f7744w;
        if (nativeUnifiedADData != null) {
            nativeUnifiedADData.destroy();
        }
    }

    @Override // com.beizi.fusion.work.a
    public void n() {
        NativeUnifiedADData nativeUnifiedADData = this.f7744w;
        if (nativeUnifiedADData != null) {
            nativeUnifiedADData.resume();
        }
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7747z;
    }

    private void c(Activity activity) {
        if (activity != null) {
            if (this.f7735n == null) {
                this.f7735n = activity.getWindow().getDecorView();
            }
            if (this.f7735n instanceof FrameLayout) {
                aH();
            }
        }
        m();
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        List<AdSpacesBean.RenderViewBean> renderView = this.f7373e.getRenderView();
        if (renderView != null && renderView.size() > 0) {
            AdSpacesBean.RenderViewBean renderViewBean = renderView.get(0);
            this.D = renderViewBean;
            this.B = renderViewBean.getPicSkipTime() > 0 ? this.D.getPicSkipTime() : this.B;
        }
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.qq.e.comm.managers.GDTAdSdk")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.interstitial.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                k.a(this.f7738q, this.f7376h);
                this.f7370b.s(SDKStatus.getIntegrationSDKVersion());
                au();
                v();
            }
        }
        v.f7025a = !n.a(this.f7373e.getDirectDownload());
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7741t);
        long j4 = this.f7741t;
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

    private void b(Activity activity) {
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            this.f7735n = decorView;
            if (decorView instanceof FrameLayout) {
                if (this.f7737p != null) {
                    aH();
                }
                RelativeLayout relativeLayout = new RelativeLayout(this.f7738q);
                this.f7737p = relativeLayout;
                relativeLayout.setBackgroundColor(Color.parseColor("#B2000000"));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(13);
                this.f7747z.setId(ErrorCode.ServerError.OS_TYPE_ERROR);
                av.a(this.f7747z);
                this.f7737p.addView(this.f7747z, layoutParams2);
                ((FrameLayout) this.f7735n).addView(this.f7737p, layoutParams);
            }
        }
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        if (this.E) {
            return;
        }
        this.E = true;
        this.C = activity;
        b(activity);
        aG();
        aK();
    }

    @Override // com.beizi.fusion.work.interstitial.GdtNativeInterstitialCustomLayout.a
    public void b() {
        H();
        aL();
    }

    @Override // com.beizi.fusion.work.a
    public void d(int i4) {
        NativeUnifiedADData nativeUnifiedADData = this.f7744w;
        if (nativeUnifiedADData == null || nativeUnifiedADData.getECPM() <= 0 || this.f7742u) {
            return;
        }
        this.f7742u = true;
        af.a("BeiZis", "channel == GDT竞价失败:" + i4);
        k.b(this.f7744w, i4 != 1 ? 10001 : 1);
    }
}
