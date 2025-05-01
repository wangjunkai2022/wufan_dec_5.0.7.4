package com.beizi.fusion.work.interstitial;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.beizi.fusion.d.h;
import com.beizi.fusion.d.n;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.work.interstitial.KsNativeInterstitialCustomLayout;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: KsNativeInterstitialWorker.java */
/* loaded from: classes2.dex */
public class e extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c, KsNativeInterstitialCustomLayout.a {
    private Activity B;
    private AdSpacesBean.RenderViewBean C;
    private KsNativeAd E;

    /* renamed from: n  reason: collision with root package name */
    RelativeLayout f7757n;

    /* renamed from: o  reason: collision with root package name */
    View f7758o;

    /* renamed from: p  reason: collision with root package name */
    TextView f7759p;

    /* renamed from: q  reason: collision with root package name */
    KsNativeAd.AdInteractionListener f7760q;

    /* renamed from: r  reason: collision with root package name */
    KsNativeAd.VideoPlayListener f7761r;

    /* renamed from: s  reason: collision with root package name */
    private Context f7762s;

    /* renamed from: t  reason: collision with root package name */
    private String f7763t;

    /* renamed from: u  reason: collision with root package name */
    private long f7764u;

    /* renamed from: v  reason: collision with root package name */
    private long f7765v;

    /* renamed from: w  reason: collision with root package name */
    private float f7766w;

    /* renamed from: x  reason: collision with root package name */
    private float f7767x;

    /* renamed from: y  reason: collision with root package name */
    private FrameLayout f7768y;

    /* renamed from: z  reason: collision with root package name */
    private CountDownTimer f7769z;
    private long A = 5000;
    private boolean D = false;

    public e(Context context, String str, long j4, long j5, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar) {
        this.f7762s = context;
        this.f7763t = str;
        this.f7764u = j4;
        this.f7765v = j5;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7374f = forwardBean;
        int sizeRatio = buyerBean.getSizeRatio();
        float j6 = av.j(context) * 0.8f;
        this.f7766w = j6;
        this.f7767x = sizeRatio == 1 ? (j6 * 16.0f) / 9.0f : (j6 * 9.0f) / 16.0f;
        af.a("BeiZis", "interstitial mAdWidthDp = " + this.f7766w + ",mAdHeightDp = " + this.f7767x);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        ac();
        G();
        c(this.B);
    }

    private void aH() {
        TextView textView = new TextView(this.f7762s);
        this.f7759p = textView;
        textView.setTextColor(this.f7762s.getResources().getColor(17170443));
        this.f7759p.setTextSize(2, 14.0f);
        e((int) (this.A / 1000));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(2, 107017);
        layoutParams.addRule(7, 107017);
        layoutParams.bottomMargin = av.a(this.f7762s, 3.0f);
        RelativeLayout relativeLayout = this.f7757n;
        if (relativeLayout != null) {
            relativeLayout.addView(this.f7759p, layoutParams);
        }
    }

    private void aI() {
        ((FrameLayout) this.f7758o).removeView(this.f7757n);
    }

    private void aJ() {
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
            if (this.f7768y != null) {
                this.f7372d.a(g(), this.f7768y);
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
    public void aK() {
        if (Y()) {
            aJ();
        } else {
            O();
        }
    }

    private void aL() {
        CountDownTimer countDownTimer = this.f7769z;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(100 + this.A, 50L) { // from class: com.beizi.fusion.work.interstitial.e.3
            @Override // android.os.CountDownTimer
            public void onFinish() {
                e.this.aG();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                if (((com.beizi.fusion.work.a) e.this).f7372d != null && ((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                    ((com.beizi.fusion.work.a) e.this).f7372d.a(j4);
                }
                e.this.e((int) (((float) j4) / 1000.0f));
            }
        };
        this.f7769z = countDownTimer2;
        countDownTimer2.start();
    }

    @Override // com.beizi.fusion.work.interstitial.KsNativeInterstitialCustomLayout.a
    public void b_() {
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return "KUAISHOU";
    }

    @Override // com.beizi.fusion.work.a
    public void n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i4) {
        if (this.f7759p == null) {
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
        this.f7759p.setText(spannableString);
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
            this.C = renderViewBean;
            this.A = renderViewBean.getPicSkipTime() > 0 ? this.C.getPicSkipTime() : this.A;
        }
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                if (!av.a("com.kwad.sdk.api.KsAdSDK")) {
                    t();
                    this.f7381m.postDelayed(new Runnable() { // from class: com.beizi.fusion.work.interstitial.e.1
                        @Override // java.lang.Runnable
                        public void run() {
                            e.this.c(10151);
                        }
                    }, 10L);
                    return;
                }
                u();
                n.a(this.f7762s, this.f7376h);
                this.f7370b.u(KsAdSDK.getSDKVersion());
                au();
                v();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(":requestAd:");
        sb.append(this.f7376h);
        sb.append("====");
        sb.append(this.f7377i);
        sb.append("===");
        sb.append(this.f7765v);
        long j4 = this.f7765v;
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
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public String j() {
        if (this.E == null) {
            return null;
        }
        return this.E.getECPM() + "";
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    @Override // com.beizi.fusion.work.a
    protected void l() {
        w();
        ag();
        if (this.f7766w <= 0.0f) {
            this.f7766w = av.j(this.f7762s);
        }
        if (this.f7767x <= 0.0f) {
            this.f7767x = 0.0f;
        }
        KsScene build = new KsScene.Builder(Long.parseLong(this.f7377i)).adNum(1).build();
        build.setAdNum(1);
        KsLoadManager loadManager = KsAdSDK.getLoadManager();
        if (loadManager == null) {
            a("渠道广告请求异常", 10160);
            return;
        }
        if ("S2S".equalsIgnoreCase(this.f7373e.getBidType())) {
            build.setBidResponse(aC());
        }
        loadManager.loadNativeAd(build, new KsLoadManager.NativeAdListener() { // from class: com.beizi.fusion.work.interstitial.e.2
            @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
            public void onError(int i4, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("ShowKsInterstitialCustom onNoAD: ");
                sb.append(str);
                e.this.a(str, i4);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
            public void onNativeAdLoad(@Nullable List<KsNativeAd> list) {
                ((com.beizi.fusion.work.a) e.this).f7378j = com.beizi.fusion.f.a.ADLOAD;
                e.this.y();
                if (list == null || list.isEmpty()) {
                    e.this.c(-991);
                    return;
                }
                if (list.get(0) != null) {
                    e.this.E = list.get(0);
                    e.this.a(list.get(0).getECPM());
                }
                e.this.f7760q = new KsNativeAd.AdInteractionListener() { // from class: com.beizi.fusion.work.interstitial.e.2.1

                    /* renamed from: a  reason: collision with root package name */
                    boolean f7772a = false;

                    /* renamed from: b  reason: collision with root package name */
                    boolean f7773b = false;

                    @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
                    public boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
                        return false;
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
                    public void onAdClicked(View view, KsNativeAd ksNativeAd) {
                        if (((com.beizi.fusion.work.a) e.this).f7372d != null && ((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) e.this).f7372d.d(e.this.g());
                        }
                        if (this.f7773b) {
                            return;
                        }
                        this.f7773b = true;
                        e.this.E();
                        e.this.ai();
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
                    public void onAdShow(KsNativeAd ksNativeAd) {
                        ((com.beizi.fusion.work.a) e.this).f7378j = com.beizi.fusion.f.a.ADSHOW;
                        if (((com.beizi.fusion.work.a) e.this).f7372d != null && ((com.beizi.fusion.work.a) e.this).f7372d.r() != 2) {
                            ((com.beizi.fusion.work.a) e.this).f7372d.b(e.this.g());
                        }
                        if (this.f7772a) {
                            return;
                        }
                        this.f7772a = true;
                        e.this.C();
                        e.this.D();
                        e.this.ah();
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
                    public void onDownloadTipsDialogDismiss() {
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.AdInteractionListener
                    public void onDownloadTipsDialogShow() {
                    }
                };
                e.this.f7761r = new KsNativeAd.VideoPlayListener() { // from class: com.beizi.fusion.work.interstitial.e.2.2
                    @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
                    public void onVideoPlayComplete() {
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
                    public void onVideoPlayError(int i4, int i5) {
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
                    public void onVideoPlayPause() {
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
                    public void onVideoPlayReady() {
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
                    public void onVideoPlayResume() {
                    }

                    @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
                    public void onVideoPlayStart() {
                    }
                };
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.beizi.fusion.work.interstitial.e.2.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        e.this.H();
                        e.this.aG();
                    }
                };
                KsNativeInterstitialCustomLayout ksNativeInterstitialCustomLayout = new KsNativeInterstitialCustomLayout(e.this.f7762s);
                ksNativeInterstitialCustomLayout.setViewInteractionListener(e.this);
                KsNativeAd ksNativeAd = list.get(0);
                float f5 = e.this.f7766w;
                float f6 = e.this.f7767x;
                AdSpacesBean.RenderViewBean renderViewBean = e.this.C;
                e eVar = e.this;
                boolean onBindData = ksNativeInterstitialCustomLayout.onBindData(ksNativeAd, f5, f6, renderViewBean, eVar.f7760q, eVar.f7761r, onClickListener);
                if (list.get(0).getMaterialType() == 1 && e.this.C != null && e.this.C.getVideoSkipTime() > 0) {
                    e eVar2 = e.this;
                    eVar2.A = eVar2.C.getVideoSkipTime();
                }
                if (onBindData) {
                    e.this.f7768y = ksNativeInterstitialCustomLayout;
                    e.this.aK();
                    return;
                }
                e eVar3 = e.this;
                eVar3.a("sdk custom error ".concat(eVar3.g()).concat(" ").concat("create view error"), 10140);
            }
        });
    }

    @Override // com.beizi.fusion.work.a
    public void m() {
        this.E = null;
    }

    @Override // com.beizi.fusion.work.a
    public View o() {
        return this.f7768y;
    }

    private void c(Activity activity) {
        if (activity != null) {
            if (this.f7758o == null) {
                this.f7758o = activity.getWindow().getDecorView();
            }
            if (this.f7758o instanceof FrameLayout) {
                aI();
            }
        }
        m();
    }

    private void b(Activity activity) {
        if (activity == null || this.f7768y == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        this.f7758o = decorView;
        if (decorView instanceof FrameLayout) {
            if (this.f7757n != null) {
                aI();
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.f7762s);
            this.f7757n = relativeLayout;
            relativeLayout.setBackgroundColor(Color.parseColor("#B2000000"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            this.f7768y.setId(107017);
            av.a(this.f7768y);
            this.f7757n.addView(this.f7768y, layoutParams2);
            ((FrameLayout) this.f7758o).addView(this.f7757n, layoutParams);
        }
    }

    @Override // com.beizi.fusion.work.a
    public void a(Activity activity) {
        if (this.D) {
            return;
        }
        this.D = true;
        this.B = activity;
        b(activity);
        aH();
        aL();
    }

    @Override // com.beizi.fusion.work.interstitial.KsNativeInterstitialCustomLayout.a
    public void b() {
        H();
        aG();
    }
}
