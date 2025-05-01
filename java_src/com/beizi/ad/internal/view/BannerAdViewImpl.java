package com.beizi.ad.internal.view;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.beizi.ad.R;
import com.beizi.ad.internal.animation.Animator;
import com.beizi.ad.internal.animation.TransitionDirection;
import com.beizi.ad.internal.animation.TransitionType;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.network.a;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.internal.video.AdVideoView;
import com.beizi.ad.lance.a.l;
/* loaded from: classes2.dex */
public class BannerAdViewImpl extends AdViewImpl {
    private c A;
    private a B;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f6318m;

    /* renamed from: n  reason: collision with root package name */
    protected int f6319n;

    /* renamed from: o  reason: collision with root package name */
    protected int f6320o;

    /* renamed from: p  reason: collision with root package name */
    private int f6321p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6322q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6323r;

    /* renamed from: s  reason: collision with root package name */
    private BroadcastReceiver f6324s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6325t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6326u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6327v;

    /* renamed from: w  reason: collision with root package name */
    private Animator f6328w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6329x;

    /* renamed from: y  reason: collision with root package name */
    private AdWebView f6330y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6331z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.beizi.ad.internal.view.BannerAdViewImpl$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6333a;

        static {
            int[] iArr = new int[a.values().length];
            f6333a = iArr;
            try {
                iArr[a.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6333a[a.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6333a[a.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6333a[a.CENTER_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6333a[a.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6333a[a.CENTER_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6333a[a.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6333a[a.BOTTOM_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6333a[a.BOTTOM_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum a {
        TOP_LEFT,
        TOP_CENTER,
        TOP_RIGHT,
        CENTER_LEFT,
        CENTER,
        CENTER_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT;

        int a() {
            switch (AnonymousClass2.f6333a[ordinal()]) {
                case 1:
                    return 51;
                case 2:
                    return 49;
                case 3:
                    return 53;
                case 4:
                    return 19;
                case 5:
                default:
                    return 17;
                case 6:
                    return 21;
                case 7:
                    return 83;
                case 8:
                    return 81;
                case 9:
                    return 85;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        private final c f6345b;

        /* renamed from: c  reason: collision with root package name */
        private final Animator f6346c;

        b(c cVar, Animator animator) {
            this.f6345b = cVar;
            this.f6346c = animator;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            animation.setAnimationListener(null);
            final c cVar = this.f6345b;
            final Animator animator = this.f6346c;
            if (cVar == null || animator == null) {
                return;
            }
            cVar.getView().getHandler().post(new Runnable() { // from class: com.beizi.ad.internal.view.BannerAdViewImpl.b.1
                @Override // java.lang.Runnable
                public void run() {
                    animator.clearAnimation();
                    cVar.destroy();
                    animator.setAnimation();
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BannerAdViewImpl(Context context) {
        super(context);
        this.f6331z = true;
    }

    private void j() {
        this.f6322q = false;
        this.f6321p = -1;
        this.f6323r = false;
        this.f6329x = true;
    }

    private void k() {
        if (this.f6324s != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.f6324s = new BroadcastReceiver() { // from class: com.beizi.ad.internal.view.BannerAdViewImpl.1
            /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[Catch: Exception -> 0x005b, TRY_LEAVE, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:4:0x000c, B:5:0x001d, B:7:0x0029, B:9:0x0033, B:15:0x004f, B:11:0x003a, B:13:0x0042), top: B:20:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r2, android.content.Intent r3) {
                /*
                    r1 = this;
                    java.lang.String r2 = r3.getAction()     // Catch: java.lang.Exception -> L5b
                    java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                    boolean r2 = r2.equals(r0)     // Catch: java.lang.Exception -> L5b
                    if (r2 == 0) goto L1d
                    com.beizi.ad.internal.view.BannerAdViewImpl r2 = com.beizi.ad.internal.view.BannerAdViewImpl.this     // Catch: java.lang.Exception -> L5b
                    r2.h()     // Catch: java.lang.Exception -> L5b
                    java.lang.String r2 = com.beizi.ad.internal.utilities.HaoboLog.baseLogTag     // Catch: java.lang.Exception -> L5b
                    int r3 = com.beizi.ad.R.string.screen_off_stop     // Catch: java.lang.Exception -> L5b
                    java.lang.String r3 = com.beizi.ad.internal.utilities.HaoboLog.getString(r3)     // Catch: java.lang.Exception -> L5b
                    com.beizi.ad.internal.utilities.HaoboLog.d(r2, r3)     // Catch: java.lang.Exception -> L5b
                    goto L5f
                L1d:
                    java.lang.String r2 = r3.getAction()     // Catch: java.lang.Exception -> L5b
                    java.lang.String r3 = "android.intent.action.SCREEN_ON"
                    boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L5b
                    if (r2 == 0) goto L5f
                    r2 = 0
                    com.beizi.ad.internal.view.BannerAdViewImpl r3 = com.beizi.ad.internal.view.BannerAdViewImpl.this     // Catch: java.lang.Exception -> L5b
                    int r3 = com.beizi.ad.internal.view.BannerAdViewImpl.a(r3)     // Catch: java.lang.Exception -> L5b
                    r0 = 1
                    if (r3 <= 0) goto L3a
                    com.beizi.ad.internal.view.BannerAdViewImpl r2 = com.beizi.ad.internal.view.BannerAdViewImpl.this     // Catch: java.lang.Exception -> L5b
                    r2.g()     // Catch: java.lang.Exception -> L5b
                L38:
                    r2 = 1
                    goto L4d
                L3a:
                    com.beizi.ad.internal.view.BannerAdViewImpl r3 = com.beizi.ad.internal.view.BannerAdViewImpl.this     // Catch: java.lang.Exception -> L5b
                    boolean r3 = com.beizi.ad.internal.view.BannerAdViewImpl.b(r3)     // Catch: java.lang.Exception -> L5b
                    if (r3 == 0) goto L4d
                    com.beizi.ad.internal.view.BannerAdViewImpl r2 = com.beizi.ad.internal.view.BannerAdViewImpl.this     // Catch: java.lang.Exception -> L5b
                    r2.h()     // Catch: java.lang.Exception -> L5b
                    com.beizi.ad.internal.view.BannerAdViewImpl r2 = com.beizi.ad.internal.view.BannerAdViewImpl.this     // Catch: java.lang.Exception -> L5b
                    r2.g()     // Catch: java.lang.Exception -> L5b
                    goto L38
                L4d:
                    if (r2 == 0) goto L5f
                    java.lang.String r2 = com.beizi.ad.internal.utilities.HaoboLog.baseLogTag     // Catch: java.lang.Exception -> L5b
                    int r3 = com.beizi.ad.R.string.screen_on_start     // Catch: java.lang.Exception -> L5b
                    java.lang.String r3 = com.beizi.ad.internal.utilities.HaoboLog.getString(r3)     // Catch: java.lang.Exception -> L5b
                    com.beizi.ad.internal.utilities.HaoboLog.d(r2, r3)     // Catch: java.lang.Exception -> L5b
                    goto L5f
                L5b:
                    r2 = move-exception
                    r2.printStackTrace()
                L5f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        try {
            l.c("BeiZisAd", "before registerReceiver");
            getContext().registerReceiver(this.f6324s, intentFilter);
        } catch (Throwable unused) {
            l.c("BeiZisAd", "ignore error");
        }
    }

    private void l() {
        if (this.f6321p > 0) {
            k();
        }
    }

    private void m() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter dismantleBroadcast mReceiver == null ? ");
        sb.append(this.f6324s == null);
        l.c("BeiZisAd", sb.toString());
        if (this.f6324s == null) {
            return;
        }
        try {
            getContext().unregisterReceiver(this.f6324s);
            l.c("BeiZisAd", "after unregisterReceiver");
        } catch (IllegalArgumentException unused) {
            l.c("BeiZisAd", "got IllegalArgumentException");
        }
        this.f6324s = null;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnDestroy() {
        c cVar = this.A;
        if (cVar != null) {
            cVar.onDestroy();
            this.A = null;
        }
        l.c("BeiZisAd", "enter activityOnDestroy before dismantleBroadcast");
        m();
        if (this.mAdFetcher != null) {
            h();
        }
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnPause() {
        c cVar = this.A;
        if (cVar != null) {
            cVar.onPause();
        }
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnResume() {
        c cVar = this.A;
        if (cVar != null) {
            cVar.onResume();
        }
    }

    @Override // com.beizi.ad.AdLifeControl
    public void cancel() {
        com.beizi.ad.internal.c cVar = this.mAdFetcher;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void clickArea() {
        AdWebView adWebView = this.f6330y;
        if (adWebView != null) {
            adWebView.handleClickView(null, System.currentTimeMillis(), System.currentTimeMillis() + 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean d() {
        return true;
    }

    public void disableFullClick(View.OnTouchListener onTouchListener) {
        AdWebView adWebView = this.f6330y;
        if (adWebView != null) {
            adWebView.setOnTouchListener(onTouchListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean e() {
        return false;
    }

    @SuppressLint({"NewApi"})
    public void expandToFitScreenWidth(int i4, int i5, c cVar) {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i6 = point.x;
        int floor = (int) Math.floor(i5 * (i6 / i4));
        this.f6319n = getLayoutParams().height;
        this.f6320o = getLayoutParams().width;
        if (getLayoutParams().width > 0 || getLayoutParams().width == -2) {
            getLayoutParams().width = i6;
        }
        getLayoutParams().height = floor;
        View view = cVar.getView();
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
        }
        view.invalidate();
        this.f6318m = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void f() {
    }

    void g() {
        if (this.f6322q) {
            return;
        }
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.start));
        this.mAdFetcher.b();
        this.f6322q = true;
    }

    public a getAdAlignment() {
        if (this.B == null) {
            this.B = a.CENTER;
        }
        return this.B;
    }

    public int getAdHeight() {
        HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.get_height, this.f6183h.e()));
        return this.f6183h.e();
    }

    public int getAdWidth() {
        HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.get_width, this.f6183h.d()));
        return this.f6183h.d();
    }

    public int getAutoRefreshInterval() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.get_period, this.f6321p));
        return this.f6321p;
    }

    public boolean getExpandsToFitScreenWidth() {
        return this.f6325t;
    }

    @Override // com.beizi.ad.internal.a
    public j getMediaType() {
        return this.f6176a != null ? j.SPLASH : j.BANNER;
    }

    public boolean getResizeAdToFitContainer() {
        return this.f6326u;
    }

    public boolean getShouldReloadOnResume() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.get_should_resume, this.f6323r));
        return this.f6323r;
    }

    public TransitionDirection getTransitionDirection() {
        return this.f6328w.getTransitionDirection();
    }

    public long getTransitionDuration() {
        return this.f6328w.getTransitionDuration();
    }

    public TransitionType getTransitionType() {
        return this.f6328w.getTransitionType();
    }

    void h() {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.stop));
        this.mAdFetcher.a();
        this.f6322q = false;
    }

    protected void i() {
        this.f6318m = false;
        if (getLayoutParams() != null) {
            getLayoutParams().height = this.f6319n;
            getLayoutParams().width = this.f6320o;
        }
    }

    public boolean isAutoRefresh() {
        return this.f6331z;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean loadAd(a.C0179a c0179a) {
        if (super.loadAd(c0179a)) {
            this.f6322q = true;
            return true;
        }
        return false;
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f6179d) {
            this.f6179d = false;
            return;
        }
        if (!this.f6327v || z4) {
            com.beizi.ad.internal.g a5 = com.beizi.ad.internal.g.a();
            int h4 = (int) (((i6 - i4) / a5.h()) + 0.5f);
            int i8 = (int) (((i7 - i5) / a5.i()) + 0.5f);
            if (h4 >= this.f6183h.d() && (i8 >= this.f6183h.e() || h4 <= 0 || i8 <= 0)) {
                this.f6183h.d(h4);
                this.f6183h.e(i8);
                if (!this.f6327v) {
                    c();
                }
                this.f6327v = true;
            } else {
                HaoboLog.e(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adsize_too_big, h4, i8, this.f6183h.d(), this.f6183h.e()));
                c();
                com.beizi.ad.internal.c cVar = this.mAdFetcher;
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            }
        }
        if (this.f6322q) {
            k();
            if (this.f6323r) {
                g();
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (i4 == 0) {
            k();
            HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.unhidden));
            if ((this.f6322q || this.f6323r || this.f6321p > 0) && !this.f6181f && !this.f6179d && !a() && this.mAdFetcher != null) {
                g();
            }
            this.f6181f = false;
            if (getChildAt(0) instanceof WebView) {
                WebviewUtil.onResume((WebView) getChildAt(0));
                return;
            }
            return;
        }
        l.c("BeiZisAd", "enter onWindowVisibilityChanged before dismantleBroadcast");
        m();
        HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.hidden));
        if (this.mAdFetcher != null && this.f6322q) {
            h();
        }
        if (getChildAt(0) instanceof WebView) {
            WebviewUtil.onPause((WebView) getChildAt(0));
        }
    }

    public void resetContainerIfNeeded() {
        if (this.f6318m) {
            i();
        }
    }

    @SuppressLint({"NewApi"})
    public void resizeWebViewToFitContainer(int i4, int i5, c cVar) {
        int width;
        int height;
        if (getWidth() <= 0) {
            width = getMeasuredWidth();
        } else {
            width = getWidth();
        }
        if (getHeight() <= 0) {
            height = getMeasuredHeight();
        } else {
            height = getHeight();
        }
        if (height > 0 && width > 0) {
            View view = cVar.getView();
            if (i4 / width < i5 / height) {
                width = (i4 * height) / i5;
                if (view instanceof WebView) {
                    ((WebView) view).setInitialScale((int) Math.ceil((height * 100) / i5));
                }
            } else {
                height = (i5 * width) / i4;
                if (view instanceof WebView) {
                    ((WebView) view).setInitialScale((int) Math.ceil((width * 100) / i4));
                }
            }
            if (view.getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
                layoutParams.gravity = 17;
                view.setLayoutParams(layoutParams);
            } else {
                view.getLayoutParams().width = width;
                view.getLayoutParams().height = height;
                ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 17;
            }
            view.invalidate();
            return;
        }
        HaoboLog.w(HaoboLog.baseLogTag, "Unable to resize ad to fit container because of failure to obtain the container size.");
    }

    public void setAdAlignment(a aVar) {
        this.B = aVar;
    }

    public void setAdSize(int i4, int i5) {
        HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.set_size, i4, i5));
        this.f6183h.b(i4);
        this.f6183h.c(i5);
    }

    public void setAutoRefresh(boolean z4) {
        this.f6331z = z4;
    }

    public void setAutoRefreshInterval(int i4) {
        if (i4 > 0) {
            this.f6321p = Math.max(10000, i4);
        } else {
            this.f6321p = i4;
        }
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.set_period, this.f6321p));
        com.beizi.ad.internal.c cVar = this.mAdFetcher;
        if (cVar != null) {
            cVar.a(this.f6321p);
        }
    }

    public void setExpandsToFitScreenWidth(boolean z4) {
        this.f6325t = z4;
    }

    public void setResizeAdToFitContainer(boolean z4) {
        this.f6326u = z4;
    }

    public void setScrollClick(View.OnTouchListener onTouchListener) {
        AdWebView adWebView = this.f6330y;
        if (adWebView != null) {
            adWebView.setOnTouchListener(onTouchListener);
        }
    }

    public void setShouldReloadOnResume(boolean z4) {
        HaoboLog.d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(R.string.set_should_resume, z4));
        this.f6323r = z4;
    }

    public void setTransitionDirection(TransitionDirection transitionDirection) {
        this.f6328w.setTransitionDirection(transitionDirection);
    }

    public void setTransitionDuration(long j4) {
        this.f6328w.setTransitionDuration(j4);
    }

    public void setTransitionType(TransitionType transitionType) {
        this.f6328w.setTransitionType(transitionType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void a(Context context, AttributeSet attributeSet) {
        this.f6321p = -1;
        this.f6318m = false;
        this.f6325t = false;
        this.f6326u = false;
        this.f6327v = false;
        this.f6328w = new Animator(getContext(), TransitionType.NONE, TransitionDirection.UP, 500L);
        View view = (View) getParent();
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = view.getMeasuredHeight();
            com.beizi.ad.internal.g a5 = com.beizi.ad.internal.g.a();
            this.f6183h.d((int) ((measuredHeight2 / a5.h()) + 0.5f));
            this.f6183h.e((int) ((measuredHeight / a5.i()) + 0.5f));
        }
        super.a(context, attributeSet);
        l();
        this.f6183h.a(this.f6176a != null ? j.SPLASH : j.BANNER);
        this.mAdFetcher.a(this.f6321p);
        if (this.f6329x) {
            this.mAdFetcher.b();
            this.f6322q = true;
        }
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void b(Context context, AttributeSet attributeSet) {
        j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AdView);
        int indexCount = obtainStyledAttributes.getIndexCount();
        HaoboLog.v(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.found_n_in_xml, indexCount));
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == R.styleable.AdView_beizi_adUnitId) {
                setAdUnitId(obtainStyledAttributes.getString(index));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.placement_id, obtainStyledAttributes.getString(index)));
            } else if (index == R.styleable.AdView_auto_refresh_interval) {
                int i5 = obtainStyledAttributes.getInt(index, -1);
                setAutoRefreshInterval(i5);
                if (i5 <= 0) {
                    this.f6329x = true;
                }
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_set_period, i5));
            } else if (index == R.styleable.AdView_test) {
                com.beizi.ad.internal.g.a().f5895c = obtainStyledAttributes.getBoolean(index, false);
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_set_test, com.beizi.ad.internal.g.a().f5895c));
            } else if (index == R.styleable.AdView_beizi_adSize) {
                String string = obtainStyledAttributes.getString(index);
                com.beizi.ad.a aVar = null;
                if (string != null && !string.isEmpty()) {
                    try {
                        aVar = (com.beizi.ad.a) com.beizi.ad.a.class.getDeclaredField(string).get(null);
                    } catch (Exception unused) {
                    }
                }
                if (aVar == null) {
                    aVar = com.beizi.ad.a.f5213g;
                }
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_ad_size, aVar.toString()));
                setAdSize(aVar.b(), aVar.a());
            } else if (index == R.styleable.AdView_should_reload_on_resume) {
                setShouldReloadOnResume(obtainStyledAttributes.getBoolean(index, false));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_set_should_reload, this.f6323r));
            } else if (index == R.styleable.AdView_opens_native_browser) {
                setOpensNativeBrowser(obtainStyledAttributes.getBoolean(index, false));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_set_opens_native_browser, getOpensNativeBrowser()));
            } else if (index == R.styleable.AdView_expands_to_fit_screen_width) {
                setExpandsToFitScreenWidth(obtainStyledAttributes.getBoolean(index, false));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_set_expands_to_full_screen_width, this.f6325t));
            } else if (index == R.styleable.AdView_resize_ad_to_fit_container) {
                setResizeAdToFitContainer(obtainStyledAttributes.getBoolean(index, false));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_resize_ad_to_fit_container, this.f6326u));
            } else if (index == R.styleable.AdView_show_loading_indicator) {
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.show_loading_indicator_xml));
                setShowLoadingIndicator(obtainStyledAttributes.getBoolean(index, true));
            } else if (index == R.styleable.AdView_transition_type) {
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.transition_type));
                setTransitionType(TransitionType.getTypeForInt(obtainStyledAttributes.getInt(index, 0)));
            } else if (index == R.styleable.AdView_transition_direction) {
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.transition_direction));
                setTransitionDirection(TransitionDirection.getDirectionForInt(obtainStyledAttributes.getInt(index, 0)));
            } else if (index == R.styleable.AdView_transition_duration) {
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.transition_duration));
                setTransitionDuration(obtainStyledAttributes.getInt(index, 1000));
            } else if (index == R.styleable.AdView_load_landing_page_in_background) {
                setLoadsInBackground(obtainStyledAttributes.getBoolean(index, true));
                HaoboLog.d(HaoboLog.xmlLogTag, HaoboLog.getString(R.string.xml_load_landing_page_in_background, this.f6182g));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public BannerAdViewImpl(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
        this.f6331z = true;
    }

    public void clickArea(com.beizi.ad.c.c cVar, int i4) {
        AdWebView adWebView = this.f6330y;
        if (adWebView != null) {
            adWebView.handleClickView(cVar, System.currentTimeMillis(), System.currentTimeMillis() + 10, i4);
        }
    }

    public BannerAdViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6331z = true;
    }

    public BannerAdViewImpl(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6331z = true;
    }

    public BannerAdViewImpl(Context context, int i4) {
        super(context);
        this.f6331z = true;
        setAutoRefreshInterval(i4);
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(c cVar) {
        int refreshInterval;
        if (cVar != null && !cVar.failed() && cVar.getView() != null) {
            if (this.f6178c == cVar) {
                return;
            }
            this.A = cVar;
            if (getTransitionType() == TransitionType.NONE) {
                removeAllViews();
                c cVar2 = this.f6178c;
                if (cVar2 != null) {
                    cVar2.destroy();
                }
                View view = cVar.getView();
                addView(view);
                if (view instanceof AdWebView) {
                    l.a("BeiZisAd", "set mAdWebView");
                    this.f6330y = (AdWebView) view;
                }
                if (view.getLayoutParams() != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = getAdAlignment().a();
                }
                if (getMediaType() != j.SPLASH || (cVar.getView() instanceof AdVideoView)) {
                    cVar.visible();
                }
            } else {
                if (cVar.getView().getLayoutParams() != null) {
                    ((FrameLayout.LayoutParams) cVar.getView().getLayoutParams()).gravity = getAdAlignment().a();
                    this.f6328w.setLayoutParams(cVar.getView().getLayoutParams());
                }
                if (getChildCount() != 0 && indexOfChild(this.f6328w) != -1) {
                    if (getMediaType() != j.SPLASH || (cVar.getView() instanceof AdVideoView)) {
                        cVar.visible();
                    }
                    this.f6328w.addView(cVar.getView());
                    this.f6328w.showNext();
                } else {
                    removeAllViews();
                    if (getMediaType() != j.SPLASH || (cVar.getView() instanceof AdVideoView)) {
                        cVar.visible();
                    }
                    addView(this.f6328w, 0);
                    this.f6328w.addView(cVar.getView());
                }
                c cVar3 = this.f6178c;
                if (cVar3 != null) {
                    if (cVar3.getView().getAnimation() != null) {
                        cVar3.getView().getAnimation().setAnimationListener(new b(cVar3, this.f6328w));
                    } else {
                        cVar3.destroy();
                    }
                }
            }
            b();
            if (this.f6176a == null && (refreshInterval = cVar.getRefreshInterval()) > 0 && this.f6331z) {
                setAutoRefreshInterval(refreshInterval * 1000);
            }
            this.f6178c = cVar;
            return;
        }
        getAdListener().onAdFailedToLoad(5);
        HaoboLog.e(HaoboLog.baseLogTag, "Loaded an ad with an invalid displayable");
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(com.beizi.ad.internal.a.e eVar) {
        a((c) eVar);
    }
}
