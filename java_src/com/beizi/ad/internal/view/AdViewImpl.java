package com.beizi.ad.internal.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.beizi.ad.AdActivity;
import com.beizi.ad.AdLifeControl;
import com.beizi.ad.AdListener;
import com.beizi.ad.AppEventListener;
import com.beizi.ad.R;
import com.beizi.ad.RewardedVideoAdListener;
import com.beizi.ad.c.e;
import com.beizi.ad.internal.activity.DownloadAppInfoActivity;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.m;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.SPUtils;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.VideoCacheManager;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.internal.video.AdVideoView;
import com.beizi.ad.internal.view.AdWebView;
import com.beizi.ad.internal.view.f;
import com.beizi.ad.lance.a.i;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.p;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public abstract class AdViewImpl extends FrameLayout implements AdLifeControl, com.beizi.ad.internal.a {
    private static FrameLayout T;
    private static f U;
    private static AdWebView.b V;
    private AppCompatTextView A;
    private ImageView B;
    private CountDownTimer C;
    private AppCompatImageView D;
    private long E;
    private GestureDetector F;
    private float G;
    private float H;
    private float I;
    private float J;
    private FrameLayout K;
    private FrameLayout L;
    private String M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private AdWebView R;
    private boolean S;

    /* renamed from: a  reason: collision with root package name */
    protected ViewGroup f6176a;

    /* renamed from: b  reason: collision with root package name */
    protected a f6177b;
    public int bottomPadding;

    /* renamed from: c  reason: collision with root package name */
    protected com.beizi.ad.internal.view.c f6178c;
    public int clickCount;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f6179d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f6180e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f6181f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f6182g;

    /* renamed from: h  reason: collision with root package name */
    protected com.beizi.ad.internal.d f6183h;

    /* renamed from: i  reason: collision with root package name */
    protected a.C0179a f6184i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f6185j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f6186k;

    /* renamed from: l  reason: collision with root package name */
    int f6187l;
    public int leftPadding;
    public int loadCount;

    /* renamed from: m  reason: collision with root package name */
    private View f6188m;
    public com.beizi.ad.internal.c mAdFetcher;

    /* renamed from: n  reason: collision with root package name */
    private int f6189n;

    /* renamed from: o  reason: collision with root package name */
    private int f6190o;

    /* renamed from: p  reason: collision with root package name */
    private String f6191p;

    /* renamed from: q  reason: collision with root package name */
    private AdListener f6192q;

    /* renamed from: r  reason: collision with root package name */
    private RewardedVideoAdListener f6193r;
    public int rightPadding;

    /* renamed from: s  reason: collision with root package name */
    private AppEventListener f6194s;
    public ServerResponse serverResponse;

    /* renamed from: t  reason: collision with root package name */
    private c f6195t;
    public int topPadding;

    /* renamed from: u  reason: collision with root package name */
    private final Handler f6196u;

    /* renamed from: v  reason: collision with root package name */
    private b f6197v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6198w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6199x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6200y;

    /* renamed from: z  reason: collision with root package name */
    private AppCompatTextView f6201z;

    /* renamed from: com.beizi.ad.internal.view.AdViewImpl$14  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass14 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6211a;

        static {
            int[] iArr = new int[f.a.values().length];
            f6211a = iArr;
            try {
                iArr[f.a.bottom_center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6211a[f.a.bottom_left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6211a[f.a.bottom_right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6211a[f.a.center.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6211a[f.a.top_center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6211a[f.a.top_left.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6211a[f.a.top_right.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public EnumC0184a f6246a = EnumC0184a.UNCHANGE;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6247b = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.beizi.ad.internal.view.AdViewImpl$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0184a {
            UNCHANGE,
            STATE_PREPARE_CHANGE,
            STATE_BACKGROUND,
            FINISHCLOSE
        }

        a() {
        }

        public boolean a() {
            return this.f6247b;
        }

        public void b() {
            this.f6246a = EnumC0184a.UNCHANGE;
        }

        public EnumC0184a c() {
            return this.f6246a;
        }

        public void a(boolean z4) {
            this.f6247b = z4;
        }

        public synchronized void a(EnumC0184a enumC0184a) {
            EnumC0184a enumC0184a2 = EnumC0184a.STATE_PREPARE_CHANGE;
            if (enumC0184a == enumC0184a2 && this.f6246a == EnumC0184a.UNCHANGE) {
                this.f6246a = enumC0184a2;
            }
            EnumC0184a enumC0184a3 = EnumC0184a.STATE_BACKGROUND;
            if (enumC0184a == enumC0184a3 && this.f6246a == enumC0184a2) {
                this.f6246a = enumC0184a3;
            }
            EnumC0184a enumC0184a4 = EnumC0184a.FINISHCLOSE;
            if (enumC0184a == enumC0184a4 && this.f6246a == enumC0184a3 && this.f6247b) {
                this.f6246a = enumC0184a4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements com.beizi.ad.internal.b {

        /* renamed from: b  reason: collision with root package name */
        private Handler f6254b;

        /* renamed from: c  reason: collision with root package name */
        private com.beizi.ad.internal.network.b f6255c;

        public b(Handler handler) {
            this.f6254b = handler;
        }

        @Override // com.beizi.ad.internal.b
        public void b() {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdViewImpl adViewImpl = AdViewImpl.this;
                        if (adViewImpl.f6185j) {
                            if (adViewImpl.f6193r != null) {
                                AdViewImpl.this.f6193r.onRewardedVideoAdClosed();
                            }
                        } else if (adViewImpl.f6192q != null) {
                            AdViewImpl.this.f6192q.onAdClosed();
                            AdViewImpl.this.f6177b.b();
                            if (AdViewImpl.this.R != null) {
                                AdViewImpl.this.R.closeWebResourceRequestConnection();
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void c() {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.8
                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (adViewImpl.f6185j) {
                        if (adViewImpl.f6193r != null) {
                            AdViewImpl.this.f6193r.onRewardedVideoAdOpened();
                        }
                    } else if (adViewImpl.f6192q != null) {
                        AdViewImpl.this.f6192q.onAdOpened();
                    }
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void d() {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.10
                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (adViewImpl.f6185j || adViewImpl.f6192q == null) {
                        return;
                    }
                    AdViewImpl.this.f6177b.a(a.EnumC0184a.STATE_PREPARE_CHANGE);
                    AdViewImpl.this.f6192q.onAdClicked();
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void e() {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.11
                @Override // java.lang.Runnable
                public void run() {
                    if (AdViewImpl.this.f6192q != null) {
                        AdViewImpl.this.f6192q.onAdRequest();
                    }
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void f() {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (!adViewImpl.f6185j || adViewImpl.f6193r == null) {
                        return;
                    }
                    AdViewImpl.this.f6193r.onRewardedVideoStarted();
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void a(final com.beizi.ad.internal.network.b bVar) {
            this.f6255c = bVar;
            if (!bVar.a().equals(j.BANNER) && !bVar.a().equals(j.INTERSTITIAL) && !bVar.a().equals(j.SPLASH)) {
                a(0);
            } else {
                this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdViewImpl.this.setCreativeWidth(bVar.c().getCreativeWidth());
                        AdViewImpl.this.setCreativeHeight(bVar.c().getCreativeHeight());
                        AdViewImpl.this.setAdExtInfo(bVar.e());
                        AdViewImpl.this.setPrice(bVar.f());
                        AdViewImpl.this.setAdId(bVar.g());
                        if (bVar.b()) {
                            try {
                                AdViewImpl.this.a((com.beizi.ad.internal.a.e) bVar.c());
                            } catch (ClassCastException unused) {
                                HaoboLog.e(HaoboLog.baseLogTag, "The SDK shouldn't fail downcasts to MediatedDisplayable in AdView");
                            }
                        } else {
                            AdViewImpl.this.a(bVar.c());
                        }
                        AdViewImpl adViewImpl = AdViewImpl.this;
                        if (adViewImpl.f6185j) {
                            if (adViewImpl.f6193r != null) {
                                AdViewImpl.this.f6193r.onRewardedVideoAdLoaded();
                            }
                        } else if (adViewImpl.f6192q == null || bVar.a().equals(j.SPLASH)) {
                        } else {
                            if (bVar.a().equals(j.INTERSTITIAL)) {
                                AdViewImpl.this.h();
                            } else {
                                AdViewImpl.this.f6192q.onAdLoaded();
                            }
                            if (bVar.d() != null) {
                                AdViewImpl.this.setLandingPageUrl(bVar.d().getLandingPageUrl());
                            }
                        }
                    }
                });
            }
        }

        @Override // com.beizi.ad.internal.b
        public void a() {
            AdViewImpl.this.E = System.currentTimeMillis();
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.6
                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (adViewImpl.f6185j) {
                        if (adViewImpl.f6193r != null) {
                            AdViewImpl.this.f6193r.onRewardedVideoAdShown();
                        }
                    } else if (adViewImpl.f6192q != null) {
                        AdViewImpl.this.f6192q.onAdShown();
                    }
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void a(final int i4) {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.7
                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (adViewImpl.f6185j) {
                        if (adViewImpl.f6193r != null) {
                            AdViewImpl.this.f6193r.onRewardedVideoAdFailedToLoad(i4);
                        }
                    } else if (adViewImpl.f6192q != null) {
                        AdViewImpl.this.f6192q.onAdFailedToLoad(i4);
                    }
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void a(final String str, final String str2) {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.12
                @Override // java.lang.Runnable
                public void run() {
                    if (AdViewImpl.this.f6194s != null) {
                        AdViewImpl.this.f6194s.onAppEvent(str, str2);
                    }
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void a(final String str, final int i4) {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (!adViewImpl.f6185j || adViewImpl.f6193r == null) {
                        return;
                    }
                    AdViewImpl.this.f6193r.onRewarded(new m(str, i4));
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void a(final long j4) {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    if (AdViewImpl.this.f6192q == null || b.this.f6255c == null || !b.this.f6255c.a().equals(j.SPLASH)) {
                        return;
                    }
                    AdViewImpl.this.f6192q.onAdTick(j4);
                }
            });
        }

        @Override // com.beizi.ad.internal.b
        public void a(final String str) {
            this.f6254b.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.b.5
                @Override // java.lang.Runnable
                public void run() {
                    if (AdViewImpl.this.f6192q == null || b.this.f6255c == null) {
                        return;
                    }
                    AdViewImpl.this.f6192q.onAdComplainResult(str);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final ArrayList<Pair<String, c>> f6276a = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdViewImpl(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public static FrameLayout getMRAIDFullscreenContainer() {
        return T;
    }

    public static f getMRAIDFullscreenImplementation() {
        return U;
    }

    public static AdWebView.b getMRAIDFullscreenListener() {
        return V;
    }

    public static void setMRAIDFullscreenContainer(FrameLayout frameLayout) {
        T = frameLayout;
    }

    public static void setMRAIDFullscreenImplementation(f fVar) {
        U = fVar;
    }

    public static void setMRAIDFullscreenListener(AdWebView.b bVar) {
        V = bVar;
    }

    protected abstract void a(com.beizi.ad.internal.a.e eVar);

    protected abstract void a(com.beizi.ad.internal.view.c cVar);

    public abstract void activityOnDestroy();

    public abstract void activityOnPause();

    public abstract void activityOnResume();

    public void addBannerCloseBtn() {
        ViewUtil.removeChildFromParent(this.B);
        ImageView createImageCloseButton = ViewUtil.createImageCloseButton(getContext());
        this.B = createImageCloseButton;
        createImageCloseButton.setVisibility(0);
        this.B.setEnabled(true);
        this.B.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdViewImpl.this.getAdDispatcher().b();
            }
        });
    }

    public void addCloseButton(int i4, int i5, int i6, final View view, final boolean z4) {
        final int i7;
        ViewUtil.removeChildFromParent(this.A);
        ViewUtil.removeChildFromParent(this.f6201z);
        CountDownTimer countDownTimer = this.C;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A = ViewUtil.createCloseButton(getContext(), this.leftPadding, this.topPadding, this.rightPadding, this.bottomPadding);
        int i8 = 0;
        if (i6 != -1) {
            this.f6201z = ViewUtil.createCountDown(getContext(), i6, this.leftPadding, this.topPadding, this.rightPadding, this.bottomPadding);
            if (i5 > 0) {
                this.A.setEnabled(false);
                i7 = i6 - i5;
            } else {
                if (i5 == -1) {
                    this.A.setVisibility(8);
                }
                i7 = 0;
            }
            CountDownTimer countDownTimer2 = new CountDownTimer(i6 * 1000, 50L) { // from class: com.beizi.ad.internal.view.AdViewImpl.4
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    AdViewImpl.this.f6201z.setText("0");
                    if (AdViewImpl.this.e()) {
                        if (z4) {
                            View view2 = view;
                            if (view2 instanceof AdWebView) {
                                if (((AdWebView) view2).loadAdBy(1)) {
                                    ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                                    return;
                                }
                                return;
                            } else if ((view2 instanceof AdVideoView) && ((AdVideoView) view2).getAdWebView().loadAdBy(1)) {
                                ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                                return;
                            } else {
                                return;
                            }
                        }
                        AdViewImpl.this.getAdDispatcher().b();
                        Activity activity = (Activity) AdViewImpl.this.a(view);
                        if (activity == null || activity.isFinishing()) {
                            return;
                        }
                        activity.finish();
                        return;
                    }
                    AdViewImpl.this.f6177b.a(true);
                    if (AdViewImpl.this.f6177b.a() && (AdViewImpl.this.f6177b.c() == a.EnumC0184a.UNCHANGE || AdViewImpl.this.f6177b.c() == a.EnumC0184a.STATE_PREPARE_CHANGE)) {
                        AdViewImpl.this.getAdDispatcher().b();
                    }
                    if (AdViewImpl.this.f6176a == null) {
                        HaoboLog.e(HaoboLog.jsLogTag, "Should not close banner!");
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    int i9 = (int) ((j4 / 1000) + 1);
                    int i10 = i7;
                    if (i10 > 0 && i9 <= i10) {
                        AdViewImpl.this.A.setEnabled(true);
                    }
                    AdViewImpl.this.f6201z.setText(Integer.toString(i9));
                }
            };
            this.C = countDownTimer2;
            countDownTimer2.start();
        } else if (i5 == -1 || i4 == -1) {
            if (i4 != -1) {
                this.f6201z = ViewUtil.createCountDown(getContext(), i4, this.leftPadding, this.topPadding, this.rightPadding, this.bottomPadding);
                CountDownTimer countDownTimer3 = new CountDownTimer(i4 * 1000, 50L) { // from class: com.beizi.ad.internal.view.AdViewImpl.6
                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        AdViewImpl.this.f6201z.setText("0");
                        AdViewImpl.this.f6201z.setVisibility(8);
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j4) {
                        AdViewImpl.this.f6201z.setText(Integer.toString((int) ((j4 / 1000) + 1)));
                    }
                };
                this.C = countDownTimer3;
                countDownTimer3.start();
                ViewParent parent = e() ? view.getParent() : getParent();
                if (parent instanceof FrameLayout) {
                    ((FrameLayout) parent).addView(this.f6201z);
                    return;
                }
                return;
            }
            return;
        } else {
            this.f6201z = ViewUtil.createCountDown(getContext(), i4, this.leftPadding, this.topPadding, this.rightPadding, this.bottomPadding);
            if (i5 > 0) {
                this.A.setEnabled(false);
                i8 = i4 - i5;
            }
            final int i9 = i8;
            CountDownTimer countDownTimer4 = new CountDownTimer(i4 * 1000, 50L) { // from class: com.beizi.ad.internal.view.AdViewImpl.5
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    AdViewImpl.this.f6201z.setText("0");
                    AdViewImpl.this.f6201z.setVisibility(8);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    int i10 = (int) ((j4 / 1000) + 1);
                    AdViewImpl.this.f6201z.setText(Integer.toString(i10));
                    int i11 = i9;
                    if (i11 <= 0 || i10 > i11) {
                        return;
                    }
                    AdViewImpl.this.A.setEnabled(true);
                }
            };
            this.C = countDownTimer4;
            countDownTimer4.start();
        }
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (AdViewImpl.this.e()) {
                    if (z4) {
                        View view3 = view;
                        if (view3 instanceof AdWebView) {
                            if (((AdWebView) view3).loadAdBy(1)) {
                                ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                                return;
                            }
                            return;
                        } else if ((view3 instanceof AdVideoView) && ((AdVideoView) view3).getAdWebView().loadAdBy(1)) {
                            ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                            return;
                        } else {
                            return;
                        }
                    }
                    AdViewImpl.this.getAdDispatcher().b();
                    Activity activity = (Activity) AdViewImpl.this.a(view);
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    activity.onBackPressed();
                    activity.finish();
                    return;
                }
                AdViewImpl.this.getAdDispatcher().b();
                AdViewImpl.this.C.cancel();
                if (AdViewImpl.this.f6176a != null) {
                    HaoboLog.e(HaoboLog.jsLogTag, "Should not close banner!");
                }
            }
        });
        ViewParent parent2 = e() ? view.getParent() : getParent();
        if (parent2 instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) parent2;
            frameLayout.addView(this.A);
            frameLayout.addView(this.f6201z);
        }
    }

    public void addDownloadTextView(View view) {
        try {
            ServerResponse serverResponse = this.serverResponse;
            if (serverResponse != null && view != null) {
                int interactType = serverResponse.getInteractType();
                if (interactType == 2 || interactType == 5) {
                    final String apkName = this.serverResponse.getApkName();
                    String appDeveloper = this.serverResponse.getAppDeveloper();
                    String appVersion = this.serverResponse.getAppVersion();
                    String appPermissionsUrl = this.serverResponse.getAppPermissionsUrl();
                    final String appPermissionsDesc = !TextUtils.isEmpty(appPermissionsUrl) ? appPermissionsUrl : this.serverResponse.getAppPermissionsDesc();
                    final String appPrivacyUrl = this.serverResponse.getAppPrivacyUrl();
                    final String appintro = this.serverResponse.getAppintro();
                    ViewParent parent = view.getParent();
                    TextView textView = new TextView(getContext());
                    textView.setText(Html.fromHtml("应用名称：" + apkName + " | 开发者：" + appDeveloper + " | 应用版本：" + appVersion + " | <u>权限详情</u> | <u>隐私协议</u> | <u>功能介绍</u>"));
                    textView.setTextSize(2, 6.0f);
                    textView.setTextColor(Color.parseColor("#999999"));
                    textView.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#333333"));
                    textView.setPadding(10, 10, 10, 10);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.17
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            try {
                                Intent intent = new Intent(AdViewImpl.this.getContext(), DownloadAppInfoActivity.class);
                                intent.putExtra("title_content_key", apkName);
                                intent.putExtra("privacy_content_key", appPrivacyUrl);
                                intent.putExtra("permission_content_key", appPermissionsDesc);
                                intent.putExtra("intro_content_key", appintro);
                                AdViewImpl.this.getContext().startActivity(intent);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    });
                    int g4 = (p.g(getContext()) * 2) / 3;
                    if (parent instanceof FrameLayout) {
                        ((FrameLayout) parent).addView(textView, new FrameLayout.LayoutParams(g4, -2, 83));
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void addInterstitialCloseButton(int i4, int i5, final View view, final boolean z4) {
        ViewUtil.removeChildFromParent(this.f6201z);
        if (i5 != -1) {
            this.f6201z = ViewUtil.createInterstitialCountDown(getContext(), i5);
            final int i6 = i4 > 0 ? i5 - i4 : 0;
            CountDownTimer countDownTimer = new CountDownTimer(i5 * 1000, 50L) { // from class: com.beizi.ad.internal.view.AdViewImpl.19
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    AdViewImpl.this.f6201z.setText("0");
                    if (AdViewImpl.this.e()) {
                        if (z4) {
                            View view2 = view;
                            if (view2 instanceof AdWebView) {
                                if (((AdWebView) view2).loadAdBy(1)) {
                                    ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                                    return;
                                }
                                return;
                            } else if ((view2 instanceof AdVideoView) && ((AdVideoView) view2).getAdWebView().loadAdBy(1)) {
                                ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                                return;
                            } else {
                                return;
                            }
                        }
                        AdViewImpl.this.getAdDispatcher().b();
                        Activity activity = (Activity) AdViewImpl.this.a(view);
                        if (activity == null || activity.isFinishing()) {
                            return;
                        }
                        activity.finish();
                        return;
                    }
                    AdViewImpl.this.getAdDispatcher().b();
                    if (AdViewImpl.this.f6176a == null) {
                        HaoboLog.e(HaoboLog.jsLogTag, "Should not close banner!");
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    AdViewImpl.this.f6201z.setText(Integer.toString((int) ((j4 / 1000) + 1)));
                }
            };
            this.C = countDownTimer;
            countDownTimer.start();
        } else if (i4 == -1) {
            return;
        } else {
            this.f6201z = ViewUtil.createInterstitialCountDown(getContext(), i4);
            CountDownTimer countDownTimer2 = new CountDownTimer(i4 * 1000, 50L) { // from class: com.beizi.ad.internal.view.AdViewImpl.20
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    AdViewImpl.this.f6201z.setText("");
                    AdViewImpl.this.f6201z.setBackgroundResource(R.mipmap.ad_close);
                    AdViewImpl.this.f6201z.setVisibility(0);
                    AdViewImpl.this.f6201z.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.20.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            if (AdViewImpl.this.e()) {
                                AnonymousClass20 anonymousClass20 = AnonymousClass20.this;
                                if (z4) {
                                    View view3 = view;
                                    if (view3 instanceof AdWebView) {
                                        if (((AdWebView) view3).loadAdBy(1)) {
                                            ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                                            return;
                                        }
                                        return;
                                    } else if ((view3 instanceof AdVideoView) && ((AdVideoView) view3).getAdWebView().loadAdBy(1)) {
                                        ((com.beizi.ad.internal.activity.b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).g();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AdViewImpl.this.getAdDispatcher().b();
                                AnonymousClass20 anonymousClass202 = AnonymousClass20.this;
                                Activity activity = (Activity) AdViewImpl.this.a(view);
                                if (activity == null || activity.isFinishing()) {
                                    return;
                                }
                                activity.finish();
                            }
                        }
                    });
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    AdViewImpl.this.f6201z.setText(Integer.toString((int) ((j4 / 1000) + 1)));
                }
            };
            this.C = countDownTimer2;
            countDownTimer2.start();
        }
        ViewParent parent = e() ? view.getParent() : getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).addView(this.f6201z);
        }
    }

    public void addMuteButton(final AdVideoView adVideoView, boolean z4) {
        ViewUtil.removeChildFromParent(this.D);
        AppCompatImageView createMuteButton = ViewUtil.createMuteButton(getContext(), z4);
        this.D = createMuteButton;
        createMuteButton.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdViewImpl.this.D.setImageResource(adVideoView.toggleMute() ? R.drawable.voice_off : R.drawable.voice_on);
            }
        });
        ViewParent parent = e() ? adVideoView.getParent() : getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).addView(this.D);
        }
    }

    public void addSkipView(int i4, View view) {
        ViewUtil.removeChildFromParent(this.A);
        ViewUtil.removeChildFromParent(this.f6201z);
        CountDownTimer countDownTimer = this.C;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (i4 <= 0) {
            i4 = 5;
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(i4 * 1000, 50L) { // from class: com.beizi.ad.internal.view.AdViewImpl.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                AdViewImpl.this.f6177b.a(true);
                if (AdViewImpl.this.f6177b.a() && (AdViewImpl.this.f6177b.c() == a.EnumC0184a.UNCHANGE || AdViewImpl.this.f6177b.c() == a.EnumC0184a.STATE_PREPARE_CHANGE)) {
                    AdViewImpl.this.getAdDispatcher().b();
                }
                if (AdViewImpl.this.f6176a == null) {
                    HaoboLog.e(HaoboLog.jsLogTag, "Should not close banner!");
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j4) {
                AdViewImpl.this.getAdDispatcher().a(j4);
            }
        };
        this.C = countDownTimer2;
        countDownTimer2.start();
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                AdViewImpl.this.getAdDispatcher().b();
                AdViewImpl.this.C.cancel();
                if (AdViewImpl.this.f6176a != null) {
                    HaoboLog.e(HaoboLog.jsLogTag, "Should not close banner!");
                }
            }
        });
    }

    protected abstract void b(Context context, AttributeSet attributeSet);

    public void clearAdRequest() {
        this.f6184i = null;
    }

    public void closeAd() {
        try {
            getAdDispatcher().b();
            this.C.cancel();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void createAdLogo(ServerResponse.AdLogoInfo adLogoInfo, ServerResponse.AdLogoInfo adLogoInfo2) {
        ViewUtil.removeChildFromParent(this.K);
        ViewUtil.removeChildFromParent(this.L);
        if (!TextUtils.isEmpty(adLogoInfo.getAdurl())) {
            this.K = ViewUtil.createAdImageView(new MutableContextWrapper(getContext()), adLogoInfo);
        }
        if (TextUtils.isEmpty(adLogoInfo2.getAdurl())) {
            return;
        }
        this.L = ViewUtil.createLogoImageView(new MutableContextWrapper(getContext()), adLogoInfo2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean d();

    public void destroy() {
        HaoboLog.d(HaoboLog.baseLogTag, "called destroy() on AdView");
        com.beizi.ad.internal.view.c cVar = this.f6178c;
        if (cVar != null) {
            cVar.destroy();
            this.f6178c = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.F.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    protected void finalize() {
        try {
            super.finalize();
        } catch (Throwable unused) {
        }
        com.beizi.ad.internal.c cVar = this.mAdFetcher;
        if (cVar != null) {
            cVar.a();
        }
    }

    public com.beizi.ad.internal.b getAdDispatcher() {
        return this.f6197v;
    }

    public String getAdId() {
        return this.O;
    }

    public AdListener getAdListener() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.get_ad_listener));
        return this.f6192q;
    }

    public com.beizi.ad.internal.d getAdParameters() {
        return this.f6183h;
    }

    public a.C0179a getAdRequest() {
        return this.f6184i;
    }

    public com.beizi.ad.a getAdSize() {
        return new com.beizi.ad.a(this.f6189n, this.f6190o);
    }

    public String getAdUnitId() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.get_placement_id, this.f6183h.c()));
        return this.f6183h.c();
    }

    public AppEventListener getAppEventListener() {
        return this.f6194s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c getBrowserStyle() {
        return this.f6195t;
    }

    int getContainerHeight() {
        return this.f6183h.g();
    }

    int getContainerWidth() {
        return this.f6183h.f();
    }

    public int getCreativeHeight() {
        return this.f6190o;
    }

    public int getCreativeWidth() {
        return this.f6189n;
    }

    public String getLandingPageUrl() {
        return this.N;
    }

    public boolean getLoadsInBackground() {
        return this.f6182g;
    }

    public String getMediationAdapterClassName() {
        return null;
    }

    public Handler getMyHandler() {
        return this.f6196u;
    }

    public boolean getOpensNativeBrowser() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.get_opens_native_browser, this.f6183h.h()));
        return this.f6183h.h();
    }

    public String getPrice() {
        return this.M;
    }

    public RewardedVideoAdListener getRewaredVideoAdListener() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.get_rewarded_video_ad_listener));
        return this.f6193r;
    }

    public boolean getShowLoadingIndicator() {
        return this.f6199x;
    }

    public ViewGroup getSplashParent() {
        return this.f6176a;
    }

    public boolean isCloseMarketDialog() {
        com.beizi.ad.internal.d dVar = this.f6183h;
        if (dVar != null) {
            return dVar.l();
        }
        return true;
    }

    public void isLoadToShow(AdWebView adWebView) {
        this.R = adWebView;
        this.S = true;
        if (this.f6192q != null) {
            this.f6192q.onAdLoaded();
        }
    }

    public boolean isLoaded() {
        return this.S;
    }

    public boolean isLoading() {
        return this.f6200y;
    }

    @Override // com.beizi.ad.internal.a
    public boolean isReadyToStart() {
        if (a()) {
            HaoboLog.e(HaoboLog.baseLogTag, HaoboLog.getString(R.string.already_expanded));
            return false;
        }
        com.beizi.ad.internal.d dVar = this.f6183h;
        return (dVar == null || !dVar.j() || this.f6184i == null) ? false : true;
    }

    public boolean isRewardedVideo() {
        return this.f6185j;
    }

    public boolean loadAd(a.C0179a c0179a) {
        com.beizi.ad.internal.c cVar;
        com.beizi.ad.internal.c cVar2;
        this.f6184i = c0179a;
        if (!isReadyToStart()) {
            AdListener adListener = this.f6192q;
            if (adListener != null) {
                adListener.onAdFailedToLoad(4);
            }
            return false;
        } else if (getWindowVisibility() == 0 && (cVar2 = this.mAdFetcher) != null) {
            cVar2.a();
            this.mAdFetcher.c();
            this.mAdFetcher.b();
            this.f6200y = true;
            this.loadCount = 1;
            this.clickCount = 0;
            return true;
        } else {
            if (this.f6176a != null && (cVar = this.mAdFetcher) != null) {
                cVar.a();
                this.mAdFetcher.c();
                this.mAdFetcher.b();
                this.f6200y = true;
                this.loadCount = 1;
                this.clickCount = 0;
            }
            return false;
        }
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onDestoryLifeCycle() {
        com.beizi.ad.internal.c cVar = this.mAdFetcher;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onResumeLifeCycle() {
        a aVar = this.f6177b;
        a.EnumC0184a enumC0184a = a.EnumC0184a.FINISHCLOSE;
        aVar.a(enumC0184a);
        if (this.f6177b.c() == enumC0184a) {
            getAdDispatcher().b();
        }
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.beizi.ad.AdLifeControl
    public void onStopLifeCycle() {
        this.f6177b.a(a.EnumC0184a.STATE_BACKGROUND);
    }

    @Override // com.beizi.ad.AdLifeControl
    public void openAdInNativeBrowser(boolean z4) {
        setOpensNativeBrowser(z4);
    }

    public void pingClick(String str) {
        if (StringUtil.isEmpty(str)) {
            return;
        }
        new com.beizi.ad.internal.h(str).execute(new Void[0]);
    }

    public void pingConvert(String str) {
        if (StringUtil.isEmpty(str)) {
            return;
        }
        new com.beizi.ad.internal.h(str).execute(new Void[0]);
    }

    void setAdExtInfo(String str) {
        this.f6191p = str;
    }

    public void setAdId(String str) {
        this.O = str;
    }

    public void setAdListener(AdListener adListener) {
        if (this.f6185j) {
            HaoboLog.e(HaoboLog.publicFunctionsLogTag, "setAdListener() called on RewardedVideoAd");
            return;
        }
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.set_ad_listener));
        this.f6192q = adListener;
    }

    public void setAdUnitId(String str) {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.set_placement_id, str));
        this.f6183h.a(str);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f6194s = appEventListener;
    }

    protected void setBrowserStyle(c cVar) {
        this.f6195t = cVar;
    }

    public void setCloseButtonPadding(int i4, int i5, int i6, int i7) {
        this.leftPadding = i4;
        this.topPadding = i5;
        this.rightPadding = i6;
        this.bottomPadding = i7;
    }

    public void setCloseMarketDialog(boolean z4) {
        com.beizi.ad.internal.d dVar = this.f6183h;
        if (dVar != null) {
            dVar.c(z4);
        }
    }

    void setCreativeHeight(int i4) {
        this.f6190o = i4;
    }

    void setCreativeWidth(int i4) {
        this.f6189n = i4;
    }

    public void setLandingPageUrl(String str) {
        this.N = str;
    }

    public void setLoadsInBackground(boolean z4) {
        this.f6182g = z4;
    }

    public void setOpensNativeBrowser(boolean z4) {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.set_opens_native_browser, z4));
        this.f6183h.b(z4);
    }

    public void setPrice(String str) {
        this.M = str;
    }

    public void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        if (!this.f6185j) {
            HaoboLog.e(HaoboLog.publicFunctionsLogTag, "setRewardedVideoAdListener() called on non-RewardedVideoAd");
            return;
        }
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.set_rewarded_video_ad_listener));
        this.f6193r = rewardedVideoAdListener;
    }

    protected void setShouldResizeParent(boolean z4) {
        this.f6198w = z4;
    }

    public void setShowLoadingIndicator(boolean z4) {
        this.f6199x = z4;
    }

    public void showAd() {
        try {
            ViewGroup viewGroup = this.f6176a;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                this.f6176a.addView(this);
            }
            AdWebView adWebView = this.R;
            ServerResponse serverResponse = adWebView.ad;
            if (serverResponse != null && serverResponse.mMediaType == j.SPLASH && this.f6188m != null) {
                addSkipView(adWebView.getAutoCloseTime(), this.f6188m);
            } else {
                int showCloseBtnTime = adWebView.getShowCloseBtnTime();
                int autoCloseTime = this.R.getAutoCloseTime();
                AdWebView adWebView2 = this.R;
                addCloseButton(-1, showCloseBtnTime, autoCloseTime, adWebView2, adWebView2.ad.getAdType() == e.a.ADP_IVIDEO);
            }
            this.R.post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.15
                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl.this.R.ad.handleView(AdViewImpl.this.R, AdViewImpl.this.f6183h.a());
                    if (AdViewImpl.this.f6192q != null) {
                        AdViewImpl.this.f6192q.onAdShown();
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void showAdLogo(View view) {
        try {
            ViewUtil.removeChildFromParent(this.K);
            ViewUtil.removeChildFromParent(this.L);
            ViewParent parent = e() ? view.getParent() : this;
            if (parent instanceof FrameLayout) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                FrameLayout frameLayout = this.L;
                if (frameLayout != null) {
                    linearLayout.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 17));
                    this.L.setVisibility(0);
                    this.L.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.16
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            AdViewImpl.this.g();
                        }
                    });
                }
                FrameLayout frameLayout2 = this.K;
                if (frameLayout2 != null) {
                    linearLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-2, -2, 17));
                    this.K.setVisibility(0);
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.K.getLayoutParams();
                layoutParams.setMargins(5, 0, 0, 0);
                layoutParams.gravity = 17;
                this.K.setLayoutParams(layoutParams);
                ((FrameLayout) parent).addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 85));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                int dip2px = ViewUtil.dip2px(getContext(), 12.0f);
                layoutParams2.setMargins(0, 0, dip2px, dip2px);
                linearLayout.setLayoutParams(layoutParams2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void showBannerCloseBtn(View view) {
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (imageView = this.B) == null) {
            return;
        }
        ((FrameLayout) view).addView(imageView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdViewImpl(Context context, ViewGroup viewGroup, View view) {
        super(context, null, 0);
        this.f6176a = null;
        this.f6188m = null;
        this.f6191p = "";
        this.f6177b = new a();
        this.f6196u = new Handler(Looper.getMainLooper()) { // from class: com.beizi.ad.internal.view.AdViewImpl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.f6179d = false;
        this.f6180e = false;
        this.f6181f = false;
        this.f6182g = true;
        this.f6198w = false;
        this.f6199x = true;
        this.f6183h = null;
        this.f6184i = null;
        this.f6200y = false;
        this.f6185j = false;
        this.f6186k = false;
        this.S = false;
        this.f6187l = 0;
        this.f6176a = viewGroup;
        this.f6188m = view;
        a(context, (AttributeSet) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        WebView webView = new WebView(new MutableContextWrapper(getContext()));
        WebviewUtil.setWebViewSettings(webView);
        String a5 = com.beizi.ad.lance.a.b.a("aHR0cDovL3Nka2RvYy5iZWl6aS5iaXovIy96aC1jbi9ndWlkZS9Vc2VQcml2YWN5");
        if (!TextUtils.isEmpty(a5)) {
            webView.loadUrl(a5, i.a());
        }
        a(webView, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        String str;
        boolean z4 = false;
        try {
            ServerResponse serverResponse = this.serverResponse;
            String str2 = null;
            if (serverResponse != null) {
                z4 = serverResponse.isVideo();
                String imageUrl = this.serverResponse.getImageUrl();
                str2 = this.serverResponse.getVideoUrl();
                str = imageUrl;
            } else {
                str = null;
            }
            if (!z4) {
                if (TextUtils.isEmpty(str)) {
                    AdListener adListener = this.f6192q;
                    if (adListener != null) {
                        adListener.onAdFailedToLoad(3);
                        return;
                    }
                    return;
                }
                AdListener adListener2 = this.f6192q;
                if (adListener2 != null) {
                    this.S = true;
                    adListener2.onAdLoaded();
                }
            } else if (TextUtils.isEmpty(str2)) {
                AdListener adListener3 = this.f6192q;
                if (adListener3 != null) {
                    adListener3.onAdFailedToLoad(3);
                }
            } else {
                VideoCacheManager.with().getCacheVideo(getContext(), str2, new VideoCacheManager.VideoLoadedListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.13
                    @Override // com.beizi.ad.internal.utilities.VideoCacheManager.VideoLoadedListener
                    public void onVideoLoadFailed() {
                        if (AdViewImpl.this.f6192q != null) {
                            AdViewImpl.this.f6192q.onAdFailedToLoad(6);
                        }
                    }

                    @Override // com.beizi.ad.internal.utilities.VideoCacheManager.VideoLoadedListener
                    public void onVideoLoaded(String str3) {
                        l.a("BeiZisAd", "onVideoLoaded: 加载成功");
                        if (AdViewImpl.this.f6192q != null) {
                            AdViewImpl.this.S = true;
                            AdViewImpl.this.f6192q.onAdLoaded();
                        }
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        getVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        getVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, AttributeSet attributeSet) {
        setBackgroundColor(0);
        this.f6197v = new b(this.f6196u);
        this.f6183h = new com.beizi.ad.internal.d(context, StringUtil.createRequestId());
        this.F = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.12
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                AdViewImpl.this.G = motionEvent.getX();
                AdViewImpl.this.H = motionEvent.getY();
                AdViewImpl.this.I = motionEvent.getRawX();
                AdViewImpl.this.J = motionEvent.getRawY();
                AdViewImpl adViewImpl = AdViewImpl.this;
                int i4 = adViewImpl.clickCount;
                int i5 = adViewImpl.loadCount;
                return true;
            }
        });
        try {
            HaoboLog.setErrorContext(getContext().getApplicationContext());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.appid, com.beizi.ad.internal.g.a().d()));
        setPadding(0, 0, 0, 0);
        this.mAdFetcher = new com.beizi.ad.internal.c(this);
        if (attributeSet != null) {
            b(context, attributeSet);
        }
        try {
            this.P = (String) SPUtils.get(this.f6183h.b(), "urlTemplate", com.beizi.ad.lance.a.b.a("aHR0cHM6Ly9hcGkuaHRwLmFkLXNjb3BlLmNvbS5jbi9tYi9zZGsvZXZlbnQvdjE/ZXh0SW5mbz13QkxRZVA4Ym1xNkF1SjVEYVp5YzV4UVFVXzkyT1drU1VkeV82VjRuMlJBM01iZ2VodzZKNjdaZndjRFFDbWozdVR5aENrclQ4bk1Bc1EmcmVxdWVzdFV1aWQ9X19SRVFVRVNUVVVJRF9fJmV2ZW50VHlwZT1fX0VWRU5UVFlQRV9fJmFwcElEPV9fQVBQSURfXyZzcGFjZUlEPV9fU1BBQ0VJRF9fJmNoYW5uZWxJRD1fX0NIQU5ORUxJRF9fJmNoYW5uZWxBcHBJRD1fX0NIQU5ORUxBUFBJRF9fJmNoYW5uZWxTcGFjZUlEPV9fQ0hBTk5FTFNQQUNFSURfXyZ0cz1fX1RTX18maXA9X19JUF9fJm5ldFR5cGU9X19ORVRUWVBFX18mY2Fycmllcj1fX0NBUlJJRVJfXyZlcnJJbmZvPV9fRVJSSU5GT19fJnNka0V4dEluZm89X19TREtFWFRJTkZPX18maW1laT1fX0lNRUlfXyZhbmRyb2lkSUQ9X19BTkRST0lESURfXyZpZGZhPV9fSURGQV9fJmlkZnY9X19JREZWX18mbWFjPV9fTUFDX18mdWlkPV9fVUlEX18mc2RrVmVyc2lvbj1fX1NES1ZFUlNJT05fXyZhcHBWZXJpc29uPV9fQVBQVkVSU0lPTl9f"));
            this.Q = (String) SPUtils.get(this.f6183h.b(), "eventsList", "[1, 2, 3, 4, 5, 6]");
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f6180e;
    }

    protected Context a(View view) {
        if (view.getContext() instanceof MutableContextWrapper) {
            return ((MutableContextWrapper) view.getContext()).getBaseContext();
        }
        return getContext();
    }

    private void a(WebView webView, Context context) {
        Intent intent = new Intent(context, AdActivity.a());
        intent.setFlags(268435456);
        intent.putExtra("ACTIVITY_TYPE", "BROWSER");
        com.beizi.ad.internal.activity.a.f5750a.add(webView);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            com.beizi.ad.internal.activity.a.f5750a.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdViewImpl(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6176a = null;
        this.f6188m = null;
        this.f6191p = "";
        this.f6177b = new a();
        this.f6196u = new Handler(Looper.getMainLooper()) { // from class: com.beizi.ad.internal.view.AdViewImpl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.f6179d = false;
        this.f6180e = false;
        this.f6181f = false;
        this.f6182g = true;
        this.f6198w = false;
        this.f6199x = true;
        this.f6183h = null;
        this.f6184i = null;
        this.f6200y = false;
        this.f6185j = false;
        this.f6186k = false;
        this.S = false;
        this.f6187l = 0;
        a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i4, int i5, f fVar) {
        ViewUtil.removeChildFromParent(this.A);
        this.A = null;
        AdWebView adWebView = fVar.f6376b;
        if (adWebView.f6277a) {
            ViewUtil.removeChildFromParent(adWebView);
            if (fVar.d() != null) {
                fVar.d().addView(fVar.f6376b, 0);
            }
            if (fVar.c() != null) {
                fVar.c().finish();
            }
            if (getMediaType().equals(j.BANNER) && (fVar.f6376b.getContext() instanceof MutableContextWrapper)) {
                ((MutableContextWrapper) fVar.f6376b.getContext()).setBaseContext(getContext());
            }
        }
        T = null;
        U = null;
        V = null;
        a(i4, i5);
        this.f6181f = true;
        this.f6180e = false;
    }

    private void a(int i4, int i5) {
        this.f6179d = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width > 0) {
                getLayoutParams().width = i4;
            }
            if (getLayoutParams().height > 0) {
                getLayoutParams().height = i5;
            }
        }
        if (this.f6198w && (getParent() instanceof View)) {
            View view = (View) getParent();
            if (view.getLayoutParams() != null) {
                if (view.getLayoutParams().width > 0) {
                    view.getLayoutParams().width = i4;
                }
                if (view.getLayoutParams().height > 0) {
                    view.getLayoutParams().height = i5;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final f fVar, boolean z4, AdWebView.b bVar) {
        fVar.a((ViewGroup) fVar.f6376b.getParent());
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewUtil.removeChildFromParent(fVar.f6376b);
        frameLayout.addView(fVar.f6376b);
        if (this.A == null) {
            AppCompatTextView createCloseButton = ViewUtil.createCloseButton(getContext());
            this.A = createCloseButton;
            createCloseButton.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    fVar.a();
                }
            });
        }
        frameLayout.addView(this.A);
        T = frameLayout;
        U = fVar;
        V = bVar;
        Class a5 = AdActivity.a();
        try {
            Intent intent = new Intent(getContext(), a5);
            intent.putExtra("ACTIVITY_TYPE", ServerResponse.EXTRAS_KEY_MRAID);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            HaoboLog.e(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_missing, a5.getName()));
            T = null;
            U = null;
            V = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4, int i5, boolean z4, final f fVar, AdWebView.b bVar) {
        a(i4, i5);
        AppCompatTextView createCloseButton = ViewUtil.createCloseButton(getContext());
        this.A = createCloseButton;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) createCloseButton.getLayoutParams();
        if (!fVar.f6376b.f6277a && getChildAt(0) != null) {
            layoutParams.rightMargin = (getMeasuredWidth() - getChildAt(0).getMeasuredWidth()) / 2;
        }
        this.A.setLayoutParams(layoutParams);
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fVar.a();
            }
        });
        if (fVar.f6376b.f6277a) {
            a(fVar, z4, bVar);
        } else {
            addView(this.A);
        }
        this.f6180e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4, int i5, int i6, int i7, f.a aVar, boolean z4, final f fVar) {
        a(i4, i5);
        ViewUtil.removeChildFromParent(this.A);
        if (this.f6187l <= 0) {
            this.f6187l = (int) (fVar.f6376b.getContext().getResources().getDisplayMetrics().density * 50.0f);
        }
        this.A = new AppCompatTextView(getContext()) { // from class: com.beizi.ad.internal.view.AdViewImpl.10
            @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
            @SuppressLint({"NewApi", "DrawAllocation"})
            public void onLayout(boolean z5, int i8, int i9, int i10, int i11) {
                Activity activity;
                boolean z6;
                Point point;
                int i12;
                int i13;
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                Point point2 = new Point(0, 0);
                try {
                    activity = (Activity) fVar.f6376b.getContext();
                    z6 = true;
                } catch (ClassCastException unused) {
                    activity = null;
                    z6 = false;
                }
                if (z6) {
                    activity.getWindowManager().getDefaultDisplay().getSize(point2);
                }
                int[] iArr2 = new int[2];
                if (AdViewImpl.this.getMediaType().equals(j.INTERSTITIAL)) {
                    InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.measure(0, 0);
                    InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getLocationOnScreen(iArr2);
                    point = new Point(InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getMeasuredWidth(), InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getMeasuredHeight());
                } else {
                    AdViewImpl.this.measure(0, 0);
                    AdViewImpl.this.getLocationOnScreen(iArr2);
                    point = new Point(AdViewImpl.this.getMeasuredWidth(), AdViewImpl.this.getMeasuredHeight());
                }
                int i14 = point.x;
                int i15 = AdViewImpl.this.f6187l;
                int i16 = i14 - i15;
                int i17 = point.y - i15;
                if (z6) {
                    i16 = (iArr2[0] + Math.min(point2.x, i14)) - AdViewImpl.this.f6187l;
                    i17 = (iArr2[1] + Math.min(point2.y, point.y)) - AdViewImpl.this.f6187l;
                    i12 = iArr2[0];
                    i13 = iArr2[1];
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (iArr[0] + 1 < i12 || iArr[0] - 1 > i16 || iArr[1] + 1 < i13 || iArr[1] - 1 > i17) {
                    final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 53);
                    layoutParams.setMargins(40, 40, 40, 40);
                    post(new Runnable() { // from class: com.beizi.ad.internal.view.AdViewImpl.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            setLayoutParams(layoutParams);
                        }
                    });
                    AdViewImpl.this.A.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_close_background));
                    AdViewImpl.this.A.setTextColor(ContextCompat.getColorStateList(getContext(), R.color.button_text_selector));
                    AdViewImpl.this.A.setTextSize(2, 16.0f);
                    AdViewImpl.this.A.setText(R.string.skip_ad);
                }
            }
        };
        int i8 = this.f6187l;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i8, 17);
        int i9 = this.f6187l;
        int i10 = (i5 / 2) - (i9 / 2);
        int i11 = (i4 / 2) - (i9 / 2);
        int i12 = AnonymousClass14.f6211a[aVar.ordinal()];
        if (i12 == 1) {
            layoutParams.topMargin = i10;
        } else if (i12 == 2) {
            layoutParams.rightMargin = i11;
            layoutParams.topMargin = i10;
        } else if (i12 == 3) {
            layoutParams.leftMargin = i11;
            layoutParams.topMargin = i10;
        } else if (i12 == 5) {
            layoutParams.bottomMargin = i10;
        } else if (i12 == 6) {
            layoutParams.rightMargin = i11;
            layoutParams.bottomMargin = i10;
        } else if (i12 == 7) {
            layoutParams.leftMargin = i11;
            layoutParams.bottomMargin = i10;
        }
        this.A.setLayoutParams(layoutParams);
        this.A.setBackgroundColor(0);
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.AdViewImpl.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fVar.a();
            }
        });
        if (fVar.f6376b.getParent() != null) {
            ((ViewGroup) fVar.f6376b.getParent()).addView(this.A);
        }
    }
}
