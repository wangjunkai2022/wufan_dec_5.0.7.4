package com.beizi.ad.internal.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.Nullable;
import com.beizi.ad.R;
import com.beizi.ad.a.a.a;
import com.beizi.ad.a.a.b;
import com.beizi.ad.a.a.c;
import com.beizi.ad.a.a.d;
import com.beizi.ad.a.a.e;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.ImageManager;
import com.beizi.ad.internal.utilities.ImageUtil;
import com.beizi.ad.internal.utilities.ShapeUtil;
import com.beizi.ad.internal.utilities.VideoCacheManager;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.view.CustomRoundImageView;
import com.beizi.ad.internal.view.InterstitialAdViewImpl;
import com.beizi.ad.internal.view.complaint.ComplaintDialog;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.p;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public class BeiZiInterstitialActivity extends Activity {
    private boolean B;
    private MediaPlayer C;
    private int E;
    private boolean F;
    private int G;
    private CountDownTimer H;
    private String J;
    private String K;
    private String L;
    private String M;
    private String N;
    private AdSpacesBean.BuyerBean O;
    private com.beizi.ad.a.a.c P;
    private e Q;
    private d R;
    private com.beizi.ad.a.a.a S;
    private com.beizi.ad.a.a.b T;
    private Timer V;
    private TimerTask W;

    /* renamed from: a  reason: collision with root package name */
    private InterstitialAdViewImpl f5671a;

    /* renamed from: b  reason: collision with root package name */
    private ServerResponse f5672b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f5673c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f5674d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f5675e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f5676f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f5677g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f5678h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f5679i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f5680j;

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout f5681k;

    /* renamed from: l  reason: collision with root package name */
    private RelativeLayout f5682l;

    /* renamed from: m  reason: collision with root package name */
    private RelativeLayout f5683m;

    /* renamed from: n  reason: collision with root package name */
    private RelativeLayout f5684n;

    /* renamed from: o  reason: collision with root package name */
    private RelativeLayout f5685o;

    /* renamed from: p  reason: collision with root package name */
    private RelativeLayout f5686p;

    /* renamed from: q  reason: collision with root package name */
    private FrameLayout f5687q;

    /* renamed from: r  reason: collision with root package name */
    private CustomRoundImageView f5688r;

    /* renamed from: s  reason: collision with root package name */
    private CustomRoundImageView f5689s;

    /* renamed from: t  reason: collision with root package name */
    private ImageView f5690t;

    /* renamed from: u  reason: collision with root package name */
    private ImageView f5691u;

    /* renamed from: v  reason: collision with root package name */
    private ImageView f5692v;

    /* renamed from: w  reason: collision with root package name */
    private VideoView f5693w;

    /* renamed from: x  reason: collision with root package name */
    private View f5694x;

    /* renamed from: y  reason: collision with root package name */
    private View f5695y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f5696z = false;
    private boolean A = false;
    private boolean D = false;
    private boolean I = true;
    private boolean U = true;

    private void A() {
        try {
            if (this.f5693w != null && this.B) {
                if (this.f5684n.getVisibility() == 0) {
                    this.E = 0;
                } else {
                    this.E = this.f5693w.getCurrentPosition();
                }
                this.f5693w.pause();
            }
            e eVar = this.Q;
            if (eVar != null) {
                eVar.b();
            }
            com.beizi.ad.a.a.a aVar = this.S;
            if (aVar != null) {
                aVar.b();
            }
            CountDownTimer countDownTimer = this.H;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.H = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void x() {
        AdSpacesBean.BuyerBean.ScrollClickBean scrollClick;
        try {
            AdSpacesBean.BuyerBean buyerBean = this.O;
            if (buyerBean == null || (scrollClick = buyerBean.getScrollClick()) == null) {
                return;
            }
            d dVar = new d(this, scrollClick, this.O.getSpaceId(), this.N);
            this.R = dVar;
            if (this.f5696z) {
                dVar.a(this.f5686p);
            } else {
                dVar.a(this.f5685o);
            }
            this.R.a(this.f5681k, new d.a() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.8
                @Override // com.beizi.ad.a.a.d.a
                public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    l.a("BeiZisAd", "handleScrollViewContent scroll");
                    BeiZiInterstitialActivity.this.a(str, str2, str3, str4, str5, str6, str7, str8, 1);
                }

                @Override // com.beizi.ad.a.a.d.a
                public void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    if (BeiZiInterstitialActivity.this.T == null || !BeiZiInterstitialActivity.this.T.a()) {
                        return;
                    }
                    l.a("BeiZisAd", "handleScrollViewContent scroll click");
                    BeiZiInterstitialActivity.this.a(str, str2, str3, str4, str5, str6, str7, str8, 0);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void y() {
        AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleRule;
        try {
            AdSpacesBean.BuyerBean buyerBean = this.O;
            if (buyerBean == null || (eulerAngleRule = buyerBean.getEulerAngleRule()) == null) {
                return;
            }
            com.beizi.ad.a.a.a aVar = new com.beizi.ad.a.a.a(this, eulerAngleRule, this.O.getSpaceId(), this.N);
            this.S = aVar;
            if (this.f5696z) {
                aVar.a(this.f5686p);
            } else {
                aVar.a(this.f5685o);
            }
            this.S.a(new a.InterfaceC0166a() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.9
                @Override // com.beizi.ad.a.a.a.InterfaceC0166a
                public void a() {
                    l.a("BeiZisAd", "handleEulerAngleViewContent click");
                    BeiZiInterstitialActivity.this.a("", "", "", "", "", "", "", "", 2);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void z() {
        AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClick;
        try {
            AdSpacesBean.BuyerBean buyerBean = this.O;
            if (buyerBean == null || (fullScreenClick = buyerBean.getFullScreenClick()) == null) {
                return;
            }
            com.beizi.ad.a.a.b bVar = new com.beizi.ad.a.a.b(this, fullScreenClick, this.N);
            this.T = bVar;
            bVar.a(this.f5681k, new b.a() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.10
                @Override // com.beizi.ad.a.a.b.a
                public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    l.a("BeiZisAd", "handleFullScreenClickContent click");
                    BeiZiInterstitialActivity.this.a(str, str2, str3, str4, str5, str6, str7, str8, 0);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_beizi_interstitial);
            b();
            c();
            d();
            i();
            k();
            h();
            m();
            f();
            l();
            p();
            s();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            InterstitialAdViewImpl interstitialAdViewImpl = this.f5671a;
            if (interstitialAdViewImpl != null) {
                interstitialAdViewImpl.setAdImplementation(null);
            }
            com.beizi.ad.a.a.c cVar = this.P;
            if (cVar != null) {
                cVar.a();
            }
            this.P = null;
            e eVar = this.Q;
            if (eVar != null) {
                eVar.c();
            }
            this.Q = null;
            com.beizi.ad.a.a.a aVar = this.S;
            if (aVar != null) {
                aVar.c();
            }
            this.S = null;
            d dVar = this.R;
            if (dVar != null) {
                dVar.a();
            }
            this.R = null;
            com.beizi.ad.a.a.b bVar = this.T;
            if (bVar != null) {
                bVar.b();
            }
            this.T = null;
            Timer timer = this.V;
            if (timer != null) {
                timer.cancel();
            }
            this.V = null;
            TimerTask timerTask = this.W;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.W = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 || i4 == 3) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        A();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        t();
    }

    private void c() {
        try {
            InterstitialAdViewImpl interstitialAdViewImpl = InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE;
            this.f5671a = interstitialAdViewImpl;
            AdSpacesBean.BuyerBean adBuyerBean = interstitialAdViewImpl.getAdBuyerBean();
            this.O = adBuyerBean;
            if (adBuyerBean == null) {
                return;
            }
            if (adBuyerBean.getTemplate() == 1) {
                this.f5696z = true;
            } else {
                this.f5696z = false;
            }
            ServerResponse serverResponse = this.f5671a.serverResponse;
            this.f5672b = serverResponse;
            if (serverResponse == null) {
                return;
            }
            this.N = serverResponse.getAdId();
            boolean isVideo = this.f5672b.isVideo();
            this.B = isVideo;
            if (isVideo) {
                this.M = this.f5672b.getVideoUrl();
            } else {
                this.M = this.f5672b.getImageUrl();
            }
            this.J = this.f5672b.getAppIcon();
            this.F = this.f5672b.isAutoClose();
            this.G = this.f5672b.getMaxTimer();
            this.K = this.f5672b.getTitle();
            this.L = this.f5672b.getSubTitle();
            this.A = this.f5672b.isMuted() ? false : true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams;
        double d5;
        double d6;
        RelativeLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        try {
            int dip2px = ViewUtil.dip2px(this, 10.0f);
            ShapeUtil.setViewBackGround(this.f5673c, "#FFFFFF", 0, (String) null, dip2px);
            int dip2px2 = ViewUtil.dip2px(this, 49.0f);
            int dip2px3 = ViewUtil.dip2px(this, 19.0f);
            int dip2px4 = ViewUtil.dip2px(this, 8.0f);
            int dip2px5 = ViewUtil.dip2px(this, 52.0f);
            TextView textView = this.f5676f;
            if (textView != null) {
                ShapeUtil.setViewBackGround(textView, "#66303030", 0, (String) null, dip2px);
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f5676f.getLayoutParams();
                layoutParams4.width = dip2px2;
                layoutParams4.height = dip2px3;
                layoutParams4.setMargins(dip2px4, dip2px4, 0, 0);
                layoutParams4.addRule(17);
                this.f5676f.setLayoutParams(layoutParams4);
            }
            ImageView imageView = this.f5690t;
            if (imageView != null && this.B) {
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams5.width = dip2px3;
                layoutParams5.height = dip2px3;
                layoutParams5.setMargins(0, dip2px4, dip2px, 0);
                this.f5690t.setLayoutParams(layoutParams5);
            }
            LinearLayout linearLayout = this.f5674d;
            if (linearLayout != null) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams6.width = dip2px5;
                layoutParams6.height = dip2px3;
                layoutParams6.setMargins(0, dip2px4, dip2px4, 0);
                this.f5674d.setLayoutParams(layoutParams6);
                ShapeUtil.setViewBackGround(this.f5674d, "#66303030", 0, (String) null, dip2px);
            }
            TextView textView2 = this.f5677g;
            if (textView2 != null) {
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams7.width = dip2px3;
                layoutParams7.height = dip2px3;
                this.f5677g.setLayoutParams(layoutParams7);
                ShapeUtil.setViewBackGround(this.f5677g, "#66303030", 0, (String) null, dip2px * 2);
            }
            ImageView imageView2 = this.f5691u;
            if (imageView2 != null) {
                RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                layoutParams8.width = dip2px3;
                layoutParams8.height = dip2px3;
                layoutParams8.setMargins(0, dip2px4, dip2px4, 0);
                this.f5691u.setLayoutParams(layoutParams8);
            }
            int i4 = p.i(this);
            int j4 = p.j(this);
            double d7 = i4;
            Double.isNaN(d7);
            int i5 = (int) (0.65d * d7);
            int dip2px6 = ViewUtil.dip2px(this, 5.0f);
            if (this.f5696z) {
                Double.isNaN(d7);
                i5 = (int) (d7 * 0.85d);
                dip2px6 = ViewUtil.dip2px(this, 10.0f);
                this.f5686p.setVisibility(0);
                RelativeLayout relativeLayout = this.f5686p;
                if (relativeLayout != null && (layoutParams3 = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams()) != null) {
                    layoutParams3.width = i5 - (dip2px6 * 3);
                    layoutParams3.height = -2;
                    if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.L)) {
                        layoutParams3.setMargins(0, dip2px6, 0, ViewUtil.dip2px(this, 5.0f));
                    } else {
                        double d8 = dip2px6;
                        Double.isNaN(d8);
                        layoutParams3.setMargins(0, (int) (d8 * 1.5d), 0, ViewUtil.dip2px(this, 5.0f));
                    }
                    this.f5686p.setLayoutParams(layoutParams3);
                }
            } else {
                this.f5685o.setVisibility(0);
                RelativeLayout relativeLayout2 = this.f5685o;
                if (relativeLayout2 != null && (layoutParams = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams()) != null) {
                    layoutParams.width = i5;
                    layoutParams.height = -2;
                    layoutParams.setMargins(0, dip2px6 * 3, 0, 0);
                    this.f5685o.setLayoutParams(layoutParams);
                }
            }
            LinearLayout linearLayout2 = this.f5673c;
            if (linearLayout2 != null && (layoutParams2 = (RelativeLayout.LayoutParams) linearLayout2.getLayoutParams()) != null) {
                layoutParams2.width = i5;
                layoutParams2.height = -2;
                this.f5673c.setLayoutParams(layoutParams2);
                this.f5673c.setPadding(dip2px6, dip2px6, dip2px6, dip2px6);
            }
            RelativeLayout relativeLayout3 = this.f5683m;
            if (relativeLayout3 != null) {
                int i6 = i5 - (dip2px6 * 2);
                if (this.f5696z) {
                    d5 = i6;
                    d6 = 0.56d;
                    Double.isNaN(d5);
                } else {
                    d5 = i6;
                    d6 = 1.78d;
                    Double.isNaN(d5);
                }
                int i7 = (int) (d5 * d6);
                double d9 = j4;
                Double.isNaN(d9);
                if (i7 > 0.7d * d9) {
                    Double.isNaN(d9);
                    i7 = (int) (d9 * 0.5d);
                }
                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) relativeLayout3.getLayoutParams();
                if (layoutParams9 != null) {
                    layoutParams9.width = i6;
                    layoutParams9.height = i7;
                    this.f5683m.setLayoutParams(layoutParams9);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean e() {
        if (this.B) {
            return true;
        }
        return this.F && this.G > 0;
    }

    private void f() {
        try {
            if (!e()) {
                this.f5674d.setVisibility(8);
                this.f5691u.setVisibility(0);
                return;
            }
            this.f5674d.setVisibility(0);
            this.f5691u.setVisibility(8);
            this.f5674d.measure(0, 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            this.H = null;
            int i4 = this.G;
            TextView textView = this.f5677g;
            if (textView != null) {
                try {
                    String charSequence = textView.getText().toString();
                    if (!TextUtils.isEmpty(charSequence) && !"0".equals(charSequence)) {
                        i4 = Integer.parseInt(charSequence);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                this.f5677g.setText(String.valueOf(i4));
            }
            CountDownTimer countDownTimer = new CountDownTimer(i4 * 1000, 1000L) { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    try {
                        l.a("BeiZisAd", "onFinish");
                        if (!BeiZiInterstitialActivity.this.F || BeiZiInterstitialActivity.this.G <= 0) {
                            return;
                        }
                        BeiZiInterstitialActivity.this.q();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    try {
                        int i5 = (int) ((j4 / 1000) + 1);
                        if (BeiZiInterstitialActivity.this.f5677g != null) {
                            BeiZiInterstitialActivity.this.f5677g.setText(String.valueOf(i5));
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            };
            this.H = countDownTimer;
            countDownTimer.start();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void h() {
        try {
            if (!this.B && this.f5688r != null && !TextUtils.isEmpty(this.M)) {
                this.f5688r.setVisibility(0);
                ImageManager.with(null).getBitmap(this.M, new ImageManager.BitmapLoadedListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.12
                    @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                    public void onBitmapLoadFailed() {
                        BeiZiInterstitialActivity.this.finish();
                    }

                    @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                    public void onBitmapLoaded(Bitmap bitmap) {
                        try {
                            if (BeiZiInterstitialActivity.this.f5688r != null) {
                                if (BeiZiInterstitialActivity.this.f5683m != null) {
                                    BeiZiInterstitialActivity.this.f5683m.measure(0, 0);
                                    ViewGroup.LayoutParams layoutParams = BeiZiInterstitialActivity.this.f5688r.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.width = BeiZiInterstitialActivity.this.f5683m.getMeasuredWidth();
                                        layoutParams.height = BeiZiInterstitialActivity.this.f5683m.getMeasuredHeight();
                                        BeiZiInterstitialActivity.this.f5688r.setLayoutParams(layoutParams);
                                    }
                                }
                                BeiZiInterstitialActivity.this.f5688r.setRectRadius(ViewUtil.dip2px(BeiZiInterstitialActivity.this, 6.0f));
                                if (Build.VERSION.SDK_INT >= 16) {
                                    BeiZiInterstitialActivity.this.f5688r.setBackground(new BitmapDrawable(ImageUtil.blurBitmap(BeiZiInterstitialActivity.this, bitmap, 20.0f)));
                                }
                                BeiZiInterstitialActivity.this.f5688r.setImageBitmap(bitmap);
                                BeiZiInterstitialActivity.this.o();
                                BeiZiInterstitialActivity.this.u();
                                BeiZiInterstitialActivity.this.r();
                                if (!BeiZiInterstitialActivity.this.F || BeiZiInterstitialActivity.this.G <= 0) {
                                    return;
                                }
                                BeiZiInterstitialActivity.this.g();
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void i() {
        AdSpacesBean.ComplainBean complain;
        TextView textView;
        try {
            AdSpacesBean.BuyerBean buyerBean = this.O;
            if (buyerBean == null || (complain = buyerBean.getComplain()) == null || complain.getOpen() != 1 || (textView = this.f5676f) == null) {
                return;
            }
            textView.setVisibility(0);
            this.f5676f.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BeiZiInterstitialActivity.this.j();
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            A();
            ComplaintDialog.Builder builder = new ComplaintDialog.Builder(this);
            builder.setDialogItemCallback(new ComplaintDialog.DialogItemCallback() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.14
                @Override // com.beizi.ad.internal.view.complaint.ComplaintDialog.DialogItemCallback
                public void onDialogCloseClick() {
                    BeiZiInterstitialActivity.this.t();
                }

                @Override // com.beizi.ad.internal.view.complaint.ComplaintDialog.DialogItemCallback
                public void onDialogItemClick(String str) {
                    try {
                        com.beizi.ad.internal.b adDispatcher = BeiZiInterstitialActivity.this.f5671a.getAdDispatcher();
                        if (adDispatcher == null) {
                            return;
                        }
                        adDispatcher.a(str);
                        adDispatcher.b();
                        BeiZiInterstitialActivity.this.finish();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
            builder.create().show();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void k() {
        try {
            if (this.f5672b == null) {
                return;
            }
            if (TextUtils.isEmpty(this.J)) {
                View view = this.f5694x;
                if (view != null) {
                    view.setVisibility(8);
                }
                CustomRoundImageView customRoundImageView = this.f5689s;
                if (customRoundImageView != null) {
                    customRoundImageView.setVisibility(8);
                    return;
                }
                return;
            }
            int dip2px = ViewUtil.dip2px(this, 20.0f);
            CustomRoundImageView customRoundImageView2 = this.f5689s;
            if (customRoundImageView2 != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) customRoundImageView2.getLayoutParams();
                int i4 = dip2px * 2;
                layoutParams.width = i4;
                layoutParams.height = i4;
                this.f5689s.setLayoutParams(layoutParams);
                this.f5689s.setVisibility(0);
            }
            View view2 = this.f5694x;
            if (view2 != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view2.getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = dip2px;
                this.f5694x.setLayoutParams(layoutParams2);
                this.f5694x.setVisibility(0);
            }
            ImageManager.with(null).getBitmap(this.J, new ImageManager.BitmapLoadedListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.15
                @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoadFailed() {
                }

                @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoaded(Bitmap bitmap) {
                    try {
                        if (BeiZiInterstitialActivity.this.f5689s != null) {
                            BeiZiInterstitialActivity.this.f5689s.setImageBitmap(bitmap);
                        }
                        BeiZiInterstitialActivity.this.f5689s.setRectRadius(ViewUtil.dip2px(BeiZiInterstitialActivity.this, 6.0f));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: Exception -> 0x0122, TryCatch #0 {Exception -> 0x0122, blocks: (B:2:0x0000, B:4:0x000b, B:7:0x0014, B:9:0x001f, B:11:0x0027, B:13:0x002f, B:15:0x0045, B:17:0x004d, B:19:0x005c, B:18:0x0055, B:20:0x0061, B:21:0x0067, B:22:0x006c, B:24:0x0070, B:26:0x0078, B:28:0x0094, B:31:0x00a7, B:32:0x00ac, B:29:0x009e, B:33:0x00b2, B:34:0x00b7, B:36:0x00bb, B:38:0x00bf, B:39:0x00c3, B:41:0x00c7, B:43:0x00cf, B:45:0x00d7, B:47:0x00df, B:48:0x00e5, B:50:0x00f8, B:52:0x0100, B:54:0x0108, B:56:0x0117, B:55:0x0111, B:8:0x001a), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[Catch: Exception -> 0x0122, TryCatch #0 {Exception -> 0x0122, blocks: (B:2:0x0000, B:4:0x000b, B:7:0x0014, B:9:0x001f, B:11:0x0027, B:13:0x002f, B:15:0x0045, B:17:0x004d, B:19:0x005c, B:18:0x0055, B:20:0x0061, B:21:0x0067, B:22:0x006c, B:24:0x0070, B:26:0x0078, B:28:0x0094, B:31:0x00a7, B:32:0x00ac, B:29:0x009e, B:33:0x00b2, B:34:0x00b7, B:36:0x00bb, B:38:0x00bf, B:39:0x00c3, B:41:0x00c7, B:43:0x00cf, B:45:0x00d7, B:47:0x00df, B:48:0x00e5, B:50:0x00f8, B:52:0x0100, B:54:0x0108, B:56:0x0117, B:55:0x0111, B:8:0x001a), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb A[Catch: Exception -> 0x0122, TryCatch #0 {Exception -> 0x0122, blocks: (B:2:0x0000, B:4:0x000b, B:7:0x0014, B:9:0x001f, B:11:0x0027, B:13:0x002f, B:15:0x0045, B:17:0x004d, B:19:0x005c, B:18:0x0055, B:20:0x0061, B:21:0x0067, B:22:0x006c, B:24:0x0070, B:26:0x0078, B:28:0x0094, B:31:0x00a7, B:32:0x00ac, B:29:0x009e, B:33:0x00b2, B:34:0x00b7, B:36:0x00bb, B:38:0x00bf, B:39:0x00c3, B:41:0x00c7, B:43:0x00cf, B:45:0x00d7, B:47:0x00df, B:48:0x00e5, B:50:0x00f8, B:52:0x0100, B:54:0x0108, B:56:0x0117, B:55:0x0111, B:8:0x001a), top: B:61:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[Catch: Exception -> 0x0122, TryCatch #0 {Exception -> 0x0122, blocks: (B:2:0x0000, B:4:0x000b, B:7:0x0014, B:9:0x001f, B:11:0x0027, B:13:0x002f, B:15:0x0045, B:17:0x004d, B:19:0x005c, B:18:0x0055, B:20:0x0061, B:21:0x0067, B:22:0x006c, B:24:0x0070, B:26:0x0078, B:28:0x0094, B:31:0x00a7, B:32:0x00ac, B:29:0x009e, B:33:0x00b2, B:34:0x00b7, B:36:0x00bb, B:38:0x00bf, B:39:0x00c3, B:41:0x00c7, B:43:0x00cf, B:45:0x00d7, B:47:0x00df, B:48:0x00e5, B:50:0x00f8, B:52:0x0100, B:54:0x0108, B:56:0x0117, B:55:0x0111, B:8:0x001a), top: B:61:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.l():void");
    }

    private void m() {
        try {
            if (this.B && this.f5693w != null && !TextUtils.isEmpty(this.M)) {
                RelativeLayout relativeLayout = this.f5683m;
                if (relativeLayout != null) {
                    ShapeUtil.setViewBackGround(relativeLayout, "#000000", 0, (String) null, ViewUtil.dip2px(this, 6.0f));
                }
                ImageView imageView = this.f5690t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    if (this.A) {
                        this.f5690t.setImageResource(R.drawable.voice_on);
                    } else {
                        this.f5690t.setImageResource(R.drawable.voice_off);
                    }
                }
                RelativeLayout relativeLayout2 = this.f5684n;
                if (relativeLayout2 != null) {
                    ShapeUtil.setViewBackGround(relativeLayout2, "#66303030", 0, (String) null, ViewUtil.dip2px(this, 6.0f));
                    this.f5684n.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.16
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            try {
                                if (BeiZiInterstitialActivity.this.f5684n != null) {
                                    BeiZiInterstitialActivity.this.f5684n.setVisibility(8);
                                }
                                if (BeiZiInterstitialActivity.this.f5693w != null) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        BeiZiInterstitialActivity.this.C.seekTo(0L, 3);
                                    }
                                    BeiZiInterstitialActivity.this.f5693w.start();
                                }
                                int duration = BeiZiInterstitialActivity.this.C.getDuration() / 1000;
                                if (BeiZiInterstitialActivity.this.f5677g != null) {
                                    BeiZiInterstitialActivity.this.f5677g.setText(String.valueOf(duration));
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    });
                }
                if (this.f5692v != null) {
                    int dip2px = ViewUtil.dip2px(this, 54.0f);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f5692v.getLayoutParams();
                    layoutParams.width = dip2px;
                    layoutParams.height = dip2px;
                    this.f5692v.setLayoutParams(layoutParams);
                }
                this.f5693w.setVisibility(0);
                VideoCacheManager.with().getCacheVideo(this, this.M, new VideoCacheManager.VideoLoadedListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.17
                    @Override // com.beizi.ad.internal.utilities.VideoCacheManager.VideoLoadedListener
                    public void onVideoLoadFailed() {
                        BeiZiInterstitialActivity.this.finish();
                    }

                    @Override // com.beizi.ad.internal.utilities.VideoCacheManager.VideoLoadedListener
                    public void onVideoLoaded(String str) {
                        try {
                            l.a("BeiZisAd", "onVideoLoaded: 加载成功");
                            BeiZiInterstitialActivity.this.f5693w.setVideoPath(str);
                            BeiZiInterstitialActivity.this.f5693w.requestFocus();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
                this.f5693w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.18
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        l.a("BeiZisAd", "onCompletion: 播放完成");
                        try {
                            BeiZiInterstitialActivity.this.E = 0;
                            if (BeiZiInterstitialActivity.this.f5684n != null) {
                                BeiZiInterstitialActivity.this.f5684n.setVisibility(0);
                            }
                            if (!BeiZiInterstitialActivity.this.F || BeiZiInterstitialActivity.this.G <= 0) {
                                if (BeiZiInterstitialActivity.this.F) {
                                    BeiZiInterstitialActivity.this.q();
                                } else if (BeiZiInterstitialActivity.this.f5677g != null) {
                                    BeiZiInterstitialActivity.this.f5677g.setText("0");
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
                this.f5693w.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.19
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        try {
                            BeiZiInterstitialActivity.this.C = mediaPlayer;
                            l.a("BeiZisAd", "onPrepared: 准备完成");
                            if (BeiZiInterstitialActivity.this.A) {
                                BeiZiInterstitialActivity.this.C.setVolume(0.0f, 1.0f);
                            } else {
                                BeiZiInterstitialActivity.this.C.setVolume(0.0f, 0.0f);
                            }
                            if (BeiZiInterstitialActivity.this.f5693w != null) {
                                if (BeiZiInterstitialActivity.this.E > 0) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        BeiZiInterstitialActivity.this.C.seekTo(BeiZiInterstitialActivity.this.E, 3);
                                    }
                                } else if (Build.VERSION.SDK_INT >= 26) {
                                    BeiZiInterstitialActivity.this.C.seekTo(2L, 3);
                                }
                                if (BeiZiInterstitialActivity.this.f5684n != null && BeiZiInterstitialActivity.this.f5684n.getVisibility() == 8) {
                                    BeiZiInterstitialActivity.this.f5693w.start();
                                }
                            }
                            if (BeiZiInterstitialActivity.this.U) {
                                if (!BeiZiInterstitialActivity.this.F || BeiZiInterstitialActivity.this.G <= 0) {
                                    int duration = mediaPlayer.getDuration() / 1000;
                                    if (BeiZiInterstitialActivity.this.f5677g != null) {
                                        BeiZiInterstitialActivity.this.f5677g.setText(String.valueOf(duration));
                                    }
                                }
                                BeiZiInterstitialActivity.this.n();
                                BeiZiInterstitialActivity.this.o();
                                BeiZiInterstitialActivity.this.u();
                                BeiZiInterstitialActivity.this.r();
                            }
                            BeiZiInterstitialActivity.this.U = false;
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
                this.f5693w.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.2
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
                        return false;
                    }
                });
                if (this.F && this.G > 0) {
                    g();
                } else {
                    a();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        r6.width = r7;
        r6.height = r8;
        r9.f5693w.setLayoutParams(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r9 = this;
            android.widget.VideoView r0 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.RelativeLayout r0 = r9.f5683m     // Catch: java.lang.Exception -> L9f
            int r0 = r0.getWidth()     // Catch: java.lang.Exception -> L9f
            android.widget.RelativeLayout r1 = r9.f5683m     // Catch: java.lang.Exception -> L9f
            int r1 = r1.getHeight()     // Catch: java.lang.Exception -> L9f
            android.widget.VideoView r2 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            r3 = 0
            r2.measure(r3, r3)     // Catch: java.lang.Exception -> L9f
            android.widget.VideoView r2 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            int r2 = r2.getMeasuredWidth()     // Catch: java.lang.Exception -> L9f
            android.widget.VideoView r4 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            int r4 = r4.getMeasuredHeight()     // Catch: java.lang.Exception -> L9f
            double r5 = (double) r2
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r7
            double r7 = (double) r4
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            float r5 = (float) r5
            android.widget.VideoView r6 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()     // Catch: java.lang.Exception -> L9f
            r7 = -2
            r8 = -1
            if (r2 < r0) goto L3e
        L3b:
            r7 = -1
            r8 = -2
            goto L46
        L3e:
            if (r4 <= r1) goto L41
            goto L46
        L41:
            int r0 = r0 - r2
            int r1 = r1 - r4
            if (r0 > r1) goto L46
            goto L3b
        L46:
            if (r6 == 0) goto L51
            r6.width = r7     // Catch: java.lang.Exception -> L9f
            r6.height = r8     // Catch: java.lang.Exception -> L9f
            android.widget.VideoView r0 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            r0.setLayoutParams(r6)     // Catch: java.lang.Exception -> L9f
        L51:
            r0 = 1057971241(0x3f0f5c29, float:0.56)
            boolean r1 = r9.f5696z     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto L5b
            r0 = 1071896330(0x3fe3d70a, float:1.78)
        L5b:
            float r0 = r0 - r5
            float r1 = java.lang.Math.abs(r0)     // Catch: java.lang.Exception -> L9f
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto La3
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Exception -> L9f
            double r0 = (double) r0     // Catch: java.lang.Exception -> L9f
            r4 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto La3
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L9f
            r1 = 21
            r2 = 1086324736(0x40c00000, float:6.0)
            if (r0 < r1) goto L90
            android.widget.VideoView r0 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            com.beizi.ad.a.a.f r1 = new com.beizi.ad.a.a.f     // Catch: java.lang.Exception -> L9f
            int r4 = com.beizi.ad.internal.utilities.ViewUtil.dip2px(r9, r2)     // Catch: java.lang.Exception -> L9f
            float r4 = (float) r4     // Catch: java.lang.Exception -> L9f
            r1.<init>(r4)     // Catch: java.lang.Exception -> L9f
            r0.setOutlineProvider(r1)     // Catch: java.lang.Exception -> L9f
            android.widget.VideoView r0 = r9.f5693w     // Catch: java.lang.Exception -> L9f
            r1 = 1
            r0.setClipToOutline(r1)     // Catch: java.lang.Exception -> L9f
        L90:
            android.widget.RelativeLayout r0 = r9.f5683m     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto La3
            java.lang.String r1 = "#FFFFFF"
            r4 = 0
            int r2 = com.beizi.ad.internal.utilities.ViewUtil.dip2px(r9, r2)     // Catch: java.lang.Exception -> L9f
            com.beizi.ad.internal.utilities.ShapeUtil.setViewBackGround(r0, r1, r3, r4, r2)     // Catch: java.lang.Exception -> L9f
            goto La3
        L9f:
            r0 = move-exception
            r0.printStackTrace()
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.n():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            FrameLayout createLogoImageView = ViewUtil.createLogoImageView(this, this.f5672b.getLogoUrl());
            createLogoImageView.setVisibility(0);
            linearLayout.addView(createLogoImageView, new LinearLayout.LayoutParams(-2, -2, 17.0f));
            FrameLayout createAdImageView = ViewUtil.createAdImageView(this, this.f5672b.getAdUrl());
            createAdImageView.setVisibility(0);
            linearLayout.addView(createAdImageView, new LinearLayout.LayoutParams(-2, -2, 17.0f));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) createAdImageView.getLayoutParams();
            layoutParams.setMargins(5, 0, 0, 0);
            layoutParams.gravity = 17;
            createAdImageView.setLayoutParams(layoutParams);
            if (this.f5687q != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 85);
                int dip2px = ViewUtil.dip2px(this, 8.0f);
                layoutParams2.setMargins(0, 0, dip2px, dip2px);
                this.f5687q.addView(linearLayout, layoutParams2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void p() {
        RelativeLayout relativeLayout = this.f5682l;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        BeiZiInterstitialActivity.this.q();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }
        ImageView imageView = this.f5690t;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (BeiZiInterstitialActivity.this.A) {
                            BeiZiInterstitialActivity.this.f5690t.setImageResource(R.drawable.voice_off);
                            if (BeiZiInterstitialActivity.this.C != null) {
                                BeiZiInterstitialActivity.this.C.setVolume(0.0f, 0.0f);
                            }
                        } else {
                            BeiZiInterstitialActivity.this.f5690t.setImageResource(R.drawable.voice_on);
                            if (BeiZiInterstitialActivity.this.C != null) {
                                BeiZiInterstitialActivity.this.C.setVolume(0.0f, 1.0f);
                            }
                        }
                        BeiZiInterstitialActivity beiZiInterstitialActivity = BeiZiInterstitialActivity.this;
                        beiZiInterstitialActivity.A = !beiZiInterstitialActivity.A;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        CountDownTimer countDownTimer = this.H;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.H = null;
        }
        InterstitialAdViewImpl interstitialAdViewImpl = this.f5671a;
        if (interstitialAdViewImpl != null && interstitialAdViewImpl.getAdDispatcher() != null) {
            this.f5671a.getAdDispatcher().b();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        ServerResponse serverResponse;
        com.beizi.ad.internal.b adDispatcher;
        try {
            InterstitialAdViewImpl interstitialAdViewImpl = this.f5671a;
            if (interstitialAdViewImpl == null || (serverResponse = interstitialAdViewImpl.serverResponse) == null || (adDispatcher = interstitialAdViewImpl.getAdDispatcher()) == null) {
                return;
            }
            com.beizi.ad.internal.d adParameters = this.f5671a.getAdParameters();
            serverResponse.handleView(this.f5673c, adParameters != null ? adParameters.a() : null);
            adDispatcher.a();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void s() {
        try {
            ServerResponse serverResponse = this.f5672b;
            if (serverResponse == null) {
                return;
            }
            int interactType = serverResponse.getInteractType();
            if (interactType == 2 || interactType == 5) {
                this.f5678h.setVisibility(0);
                final String apkName = this.f5672b.getApkName();
                String appDeveloper = this.f5672b.getAppDeveloper();
                String appVersion = this.f5672b.getAppVersion();
                String appPermissionsUrl = this.f5672b.getAppPermissionsUrl();
                final String appPermissionsDesc = !TextUtils.isEmpty(appPermissionsUrl) ? appPermissionsUrl : this.f5672b.getAppPermissionsDesc();
                final String appPrivacyUrl = this.f5672b.getAppPrivacyUrl();
                final String appintro = this.f5672b.getAppintro();
                this.f5678h.setText(Html.fromHtml("应用名称：" + apkName + " | 开发者：" + appDeveloper + " | 应用版本：" + appVersion + " | <u>权限详情</u> | <u>隐私协议</u> | <u>功能介绍</u>"));
                this.f5678h.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(BeiZiInterstitialActivity.this, DownloadAppInfoActivity.class);
                            intent.putExtra("title_content_key", apkName);
                            intent.putExtra("privacy_content_key", appPrivacyUrl);
                            intent.putExtra("permission_content_key", appPermissionsDesc);
                            intent.putExtra("intro_content_key", appintro);
                            BeiZiInterstitialActivity.this.startActivity(intent);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        try {
            VideoView videoView = this.f5693w;
            if (videoView != null && this.B) {
                videoView.resume();
            }
            e eVar = this.Q;
            if (eVar != null) {
                eVar.a();
            }
            com.beizi.ad.a.a.a aVar = this.S;
            if (aVar != null) {
                aVar.a();
            }
            if (!this.I && this.F && this.G > 0) {
                g();
            }
            this.I = false;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        try {
            if (this.O == null) {
                return;
            }
            z();
            v();
            w();
            x();
            y();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void v() {
        try {
            AdSpacesBean.BuyerBean buyerBean = this.O;
            if (buyerBean == null) {
                return;
            }
            AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickView = buyerBean.getRegionalClickView();
            if (regionalClickView == null) {
                regionalClickView = new AdSpacesBean.BuyerBean.RegionalClickViewBean();
                regionalClickView.setBackgroundAlpha(1.0d);
                regionalClickView.setBackgroundColor("#3976FF");
                regionalClickView.setTitle("点击跳转网页或第三方应用");
                regionalClickView.setTitleColor("#FFFFFF");
            }
            com.beizi.ad.a.a.c cVar = new com.beizi.ad.a.a.c(this, regionalClickView, this.N);
            this.P = cVar;
            if (this.f5696z) {
                cVar.a(this.f5686p);
            } else {
                cVar.a(this.f5685o);
            }
            this.P.a(new c.a() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.6
                @Override // com.beizi.ad.a.a.c.a
                public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    l.a("BeiZisAd", "handleRegionalClickViewContent click");
                    BeiZiInterstitialActivity.this.a(str, str2, str3, str4, str5, str6, str7, str8, 0);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void w() {
        AdSpacesBean.BuyerBean.ShakeViewBean shakeView;
        try {
            AdSpacesBean.BuyerBean buyerBean = this.O;
            if (buyerBean == null || (shakeView = buyerBean.getShakeView()) == null) {
                return;
            }
            e eVar = new e(this, shakeView, this.O.getSpaceId(), this.N);
            this.Q = eVar;
            if (this.f5696z) {
                eVar.a(this.f5686p);
            } else {
                eVar.a(this.f5685o);
            }
            this.Q.a(new e.a() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.7
                @Override // com.beizi.ad.a.a.e.a
                public void a() {
                    l.a("BeiZisAd", "handleShakeViewContent click");
                    BeiZiInterstitialActivity.this.a("", "", "", "", "", "", "", "", 2);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void b() {
        this.f5681k = (RelativeLayout) findViewById(R.id.beizi_interstitial_ad_content_rl);
        this.f5673c = (LinearLayout) findViewById(R.id.beizi_interstitial_ad_container_ll);
        this.f5676f = (TextView) findViewById(R.id.beizi_interstitial_ad_complain_tv);
        this.f5682l = (RelativeLayout) findViewById(R.id.beizi_interstitial_ad_close_container_rl);
        this.f5674d = (LinearLayout) findViewById(R.id.beizi_interstitial_ad_close_text_container_ll);
        this.f5691u = (ImageView) findViewById(R.id.beizi_interstitial_ad_close_iv);
        this.f5677g = (TextView) findViewById(R.id.beizi_interstitial_ad_countdown_tv);
        this.f5683m = (RelativeLayout) findViewById(R.id.beizi_interstitial_ad_material_container_rl);
        this.f5684n = (RelativeLayout) findViewById(R.id.beizi_interstitial_ad_video_replay_container_rl);
        this.f5692v = (ImageView) findViewById(R.id.beizi_interstitial_ad_video_replay_iv);
        this.f5687q = (FrameLayout) findViewById(R.id.beizi_interstitial_ad_logo_container_fl);
        this.f5688r = (CustomRoundImageView) findViewById(R.id.beizi_interstitial_ad_img_iv);
        this.f5693w = (VideoView) findViewById(R.id.beizi_interstitial_ad_video_vv);
        this.f5689s = (CustomRoundImageView) findViewById(R.id.beizi_interstitial_ad_app_icon_iv);
        this.f5694x = findViewById(R.id.beizi_interstitial_ad_divide_view);
        this.f5690t = (ImageView) findViewById(R.id.beizi_interstitial_ad_voice_iv);
        this.f5675e = (LinearLayout) findViewById(R.id.beizi_interstitial_ad_title_container_ll);
        this.f5679i = (TextView) findViewById(R.id.beizi_interstitial_ad_title_tv);
        this.f5680j = (TextView) findViewById(R.id.beizi_interstitial_ad_subtitle_tv);
        this.f5695y = findViewById(R.id.beizi_interstitial_ad_title_divider_view);
        this.f5686p = (RelativeLayout) findViewById(R.id.beizi_interstitial_ad_interaction_container_landscape_rl);
        this.f5685o = (RelativeLayout) findViewById(R.id.beizi_interstitial_ad_interaction_container_portrait_rl);
        this.f5678h = (TextView) findViewById(R.id.beizi_interstitial_ad_app_download_info_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4) {
        InterstitialAdViewImpl interstitialAdViewImpl;
        ServerResponse serverResponse;
        com.beizi.ad.internal.b adDispatcher;
        try {
            if (this.f5671a == null || !hasWindowFocus() || (serverResponse = (interstitialAdViewImpl = this.f5671a).serverResponse) == null || (adDispatcher = interstitialAdViewImpl.getAdDispatcher()) == null) {
                return;
            }
            com.beizi.ad.c.c cVar = new com.beizi.ad.c.c();
            cVar.a(str);
            cVar.e(str5);
            cVar.b(str2);
            cVar.f(str6);
            cVar.c(str3);
            cVar.g(str7);
            cVar.d(str4);
            cVar.h(str8);
            serverResponse.setOpenInNativeBrowser(true);
            serverResponse.handleClick(this.f5673c, cVar, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() + 10), this.D, this.f5671a.getAdParameters().a(), i4);
            this.D = true;
            adDispatcher.d();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a() {
        try {
            if (this.V == null) {
                this.V = new Timer();
            }
            if (this.W == null) {
                this.W = new TimerTask() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.11
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        try {
                            if (BeiZiInterstitialActivity.this.f5693w == null || !BeiZiInterstitialActivity.this.f5693w.isPlaying()) {
                                return;
                            }
                            BeiZiInterstitialActivity.this.runOnUiThread(new Runnable() { // from class: com.beizi.ad.internal.activity.BeiZiInterstitialActivity.11.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    int duration;
                                    try {
                                        if (BeiZiInterstitialActivity.this.f5677g == null || (duration = (BeiZiInterstitialActivity.this.f5693w.getDuration() - BeiZiInterstitialActivity.this.f5693w.getCurrentPosition()) / 1000) <= 0) {
                                            return;
                                        }
                                        BeiZiInterstitialActivity.this.f5677g.setText(String.valueOf(duration));
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                    }
                                }
                            });
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                };
            }
            this.V.scheduleAtFixedRate(this.W, 0L, 1000L);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
