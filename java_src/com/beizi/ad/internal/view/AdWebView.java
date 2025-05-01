package com.beizi.ad.internal.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.beizi.ad.AdActivity;
import com.beizi.ad.R;
import com.beizi.ad.c.e;
import com.beizi.ad.internal.i;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.HTTPGet;
import com.beizi.ad.internal.utilities.HTTPResponse;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.SPUtils;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.internal.video.AdVideoView;
import com.beizi.ad.internal.view.AdViewImpl;
import com.beizi.ad.internal.view.f;
import com.beizi.ad.lance.a.l;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class AdWebView extends WebView implements com.beizi.ad.internal.view.c {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private long F;
    private float G;
    private float H;
    private boolean I;
    private HttpURLConnection J;
    private InputStream K;
    private final Runnable L;

    /* renamed from: a  reason: collision with root package name */
    boolean f6277a;
    public ServerResponse ad;
    public AdViewImpl adViewImpl;

    /* renamed from: b  reason: collision with root package name */
    protected String f6278b;

    /* renamed from: c  reason: collision with root package name */
    boolean f6279c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6280d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6281e;

    /* renamed from: f  reason: collision with root package name */
    private f f6282f;

    /* renamed from: g  reason: collision with root package name */
    private int f6283g;
    public GestureDetector gestureDetector;

    /* renamed from: h  reason: collision with root package name */
    private int f6284h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6285i;

    /* renamed from: j  reason: collision with root package name */
    private int f6286j;

    /* renamed from: k  reason: collision with root package name */
    private int f6287k;

    /* renamed from: l  reason: collision with root package name */
    private int f6288l;

    /* renamed from: m  reason: collision with root package name */
    private int f6289m;
    public AdVideoView mAdVideoView;

    /* renamed from: n  reason: collision with root package name */
    private int f6290n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6291o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6292p;

    /* renamed from: q  reason: collision with root package name */
    private Handler f6293q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6294r;

    /* renamed from: s  reason: collision with root package name */
    private int f6295s;

    /* renamed from: t  reason: collision with root package name */
    private ProgressDialog f6296t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6297u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6298v;

    /* renamed from: w  reason: collision with root package name */
    private int f6299w;

    /* renamed from: x  reason: collision with root package name */
    private int f6300x;

    /* renamed from: y  reason: collision with root package name */
    private int f6301y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6302z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (str.startsWith(com.facebook.common.util.f.f10923a)) {
                try {
                    WebView.HitTestResult hitTestResult = AdWebView.this.getHitTestResult();
                    if (hitTestResult == null || hitTestResult.getExtra() == null) {
                        return;
                    }
                    if (hitTestResult.getExtra().equals(str)) {
                        int type = hitTestResult.getType();
                        if (type == 1 || type == 6 || type == 7 || type == 8) {
                            AdWebView.this.b(str);
                            webView.stopLoading();
                            AdWebView.this.c();
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            AdWebView adWebView = AdWebView.this;
            if (adWebView.ad.mMediaType == j.SPLASH) {
                adWebView.visible();
            }
            if (AdWebView.this.f6285i) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                webView.evaluateJavascript("javascript:window.mraid.util.pageFinished()", null);
            } else {
                webView.loadUrl("javascript:window.mraid.util.pageFinished()");
            }
            if (AdWebView.this.f6281e) {
                f fVar = AdWebView.this.f6282f;
                AdWebView adWebView2 = AdWebView.this;
                fVar.a(adWebView2, adWebView2.f6278b);
                AdWebView.this.i();
            }
            AdWebView.this.f6285i = true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.webview_received_error, i4, str, str2));
            AdViewImpl adViewImpl = AdWebView.this.adViewImpl;
            if (adViewImpl == null || adViewImpl.getAdDispatcher() == null) {
                return;
            }
            AdWebView.this.adViewImpl.getAdDispatcher().a(2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            AdWebView.this.h();
            HaoboLog.w(HaoboLog.httpRespLogTag, HaoboLog.getString(R.string.webclient_error, sslError.getPrimaryError(), sslError.toString()));
            AdViewImpl adViewImpl = AdWebView.this.adViewImpl;
            if (adViewImpl == null || adViewImpl.getAdDispatcher() == null) {
                return;
            }
            AdWebView.this.adViewImpl.getAdDispatcher().a(2);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return AdWebView.this.a(webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            AdViewImpl adViewImpl;
            String str2 = HaoboLog.baseLogTag;
            HaoboLog.v(str2, "Loading URL: " + str);
            l.a("lance", "Loading:::::::::::::::::::::::" + str);
            if (str.startsWith("javascript:")) {
                return false;
            }
            if (str.startsWith("mraid://")) {
                HaoboLog.v(HaoboLog.mraidLogTag, str);
                if (AdWebView.this.f6281e) {
                    AdWebView.this.f6282f.a(str, AdWebView.this.f6298v);
                } else {
                    String host = Uri.parse(str).getHost();
                    if (host != null && host.equals("enable")) {
                        AdWebView.this.fireMRAIDEnabled();
                    } else if (host != null && host.equals("open")) {
                        AdWebView.this.f6282f.a(str, AdWebView.this.f6298v);
                    }
                }
                return true;
            } else if (str.startsWith("BeiZi://")) {
                try {
                    String host2 = Uri.parse(str).getHost();
                    if (!TextUtils.isEmpty(host2) && !"ClosePage".equals(host2)) {
                        AdWebView adWebView = AdWebView.this;
                        if (adWebView.ad != null && (adViewImpl = adWebView.adViewImpl) != null && adViewImpl.getAdParameters() != null) {
                            AdWebView adWebView2 = AdWebView.this;
                            adWebView2.ad.handleClick(adWebView2, "", "", "", "", "", "", adWebView2.f6279c, adWebView2.adViewImpl.getAdParameters().a());
                            AdWebView.this.f6279c = true;
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                com.beizi.ad.internal.view.b.a(AdWebView.this, str);
                return true;
            } else {
                AdWebView.this.b(str);
                AdWebView.this.c();
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends WebView {
        @SuppressLint({"SetJavaScriptEnabled"})
        public c(Context context) {
            super(new MutableContextWrapper(context));
            WebviewUtil.setWebViewSettings(this);
            setWebViewClient(new WebViewClient() { // from class: com.beizi.ad.internal.view.AdWebView.c.1

                /* renamed from: c  reason: collision with root package name */
                private boolean f6317c = false;

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    String str2 = HaoboLog.browserLogTag;
                    HaoboLog.v(str2, "Opening URL: " + str);
                    ViewUtil.removeChildFromParent(c.this);
                    if (AdWebView.this.f6296t != null && AdWebView.this.f6296t.isShowing()) {
                        AdWebView.this.f6296t.dismiss();
                    }
                    if (this.f6317c) {
                        this.f6317c = false;
                        c.this.destroy();
                        AdWebView.this.k();
                        return;
                    }
                    c.this.setVisibility(0);
                    c cVar = c.this;
                    AdWebView.this.a(cVar);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    String str2 = HaoboLog.browserLogTag;
                    HaoboLog.v(str2, "Redirecting to URL: " + str);
                    boolean h4 = AdWebView.this.h(str);
                    this.f6317c = h4;
                    if (h4 && AdWebView.this.f6296t != null && AdWebView.this.f6296t.isShowing()) {
                        AdWebView.this.f6296t.dismiss();
                    }
                    return this.f6317c;
                }
            });
        }
    }

    public AdWebView(AdViewImpl adViewImpl) {
        super(new MutableContextWrapper(adViewImpl.getContext()));
        this.f6280d = false;
        this.ad = null;
        this.mAdVideoView = null;
        this.f6277a = false;
        this.f6291o = false;
        this.f6292p = false;
        this.f6293q = new Handler();
        this.f6294r = false;
        this.f6297u = false;
        this.f6298v = false;
        this.f6301y = -1;
        this.f6302z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.f6279c = false;
        this.J = null;
        this.K = null;
        this.L = new Runnable() { // from class: com.beizi.ad.internal.view.AdWebView.5
            @Override // java.lang.Runnable
            public void run() {
                if (AdWebView.this.f6294r) {
                    return;
                }
                AdWebView.this.f();
                AdWebView.this.f6293q.postDelayed(this, 1000L);
            }
        };
        setBackgroundColor(0);
        this.adViewImpl = adViewImpl;
        this.f6278b = f.f6375a[f.b.STARTING_DEFAULT.ordinal()];
        a();
        b();
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl == null || !(adViewImpl instanceof InterstitialAdViewImpl)) {
            return;
        }
        ((InterstitialAdViewImpl) adViewImpl).g();
    }

    private void setCreativeHeight(int i4) {
        this.f6289m = i4;
    }

    private void setCreativeWidth(int i4) {
        this.f6288l = i4;
    }

    public boolean IsVideoWifiOnly() {
        return this.D;
    }

    public void closeWebResourceRequestConnection() {
        try {
            InputStream inputStream = this.K;
            if (inputStream != null) {
                inputStream.close();
            }
            HttpURLConnection httpURLConnection = this.J;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.webkit.WebView, com.beizi.ad.internal.view.c
    public void destroy() {
        setVisibility(4);
        ViewUtil.removeChildFromParent(this);
        super.destroy();
        removeAllViews();
        j();
    }

    @Override // com.beizi.ad.internal.view.c
    public boolean failed() {
        return this.f6280d;
    }

    public void fireMRAIDEnabled() {
        if (this.f6281e) {
            return;
        }
        this.f6281e = true;
        if (this.f6285i) {
            this.f6282f.a(this, this.f6278b);
            i();
        }
    }

    public HashMap<String, Object> getAdExtras() {
        ServerResponse serverResponse = this.ad;
        if (serverResponse == null) {
            return null;
        }
        return serverResponse.getExtras();
    }

    public int getAutoCloseTime() {
        return this.f6300x;
    }

    public Context getContextFromMutableContext() {
        if (getContext() instanceof MutableContextWrapper) {
            return ((MutableContextWrapper) getContext()).getBaseContext();
        }
        return getContext();
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeHeight() {
        return this.f6289m;
    }

    public int getCreativeLeft() {
        return this.f6286j;
    }

    public int getCreativeTop() {
        return this.f6287k;
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeWidth() {
        return this.f6288l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f getMRAIDImplementation() {
        return this.f6282f;
    }

    public int getOrientation() {
        return this.f6295s;
    }

    public com.beizi.ad.internal.view.c getRealDisplayable() {
        AdVideoView adVideoView;
        return (!this.C || (adVideoView = this.mAdVideoView) == null) ? this : adVideoView;
    }

    @Override // com.beizi.ad.internal.view.c
    public int getRefreshInterval() {
        return this.f6290n;
    }

    public int getShowCloseBtnTime() {
        return this.f6299w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getUserInteraction() {
        return this.f6298v;
    }

    @Override // com.beizi.ad.internal.view.c
    public View getView() {
        return this;
    }

    public void handleClickView(MotionEvent motionEvent, long j4, long j5) {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl == null || adViewImpl.getAdDispatcher() == null || this.adViewImpl.isRewardedVideo()) {
            return;
        }
        this.E++;
        this.adViewImpl.getAdDispatcher().d();
        this.ad.setOpenInNativeBrowser(this.adViewImpl.getOpensNativeBrowser());
        this.ad.setCloseMarketDialog(this.adViewImpl.isCloseMarketDialog());
        if (motionEvent == null) {
            this.ad.handleClick(this, "100", "200", "105", "206", String.valueOf(j4), String.valueOf(j5), this.f6279c, this.adViewImpl.getAdParameters().a());
        } else {
            this.ad.handleClick(this, motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "", String.valueOf(j4), String.valueOf(j5), this.f6279c, this.adViewImpl.getAdParameters().a());
        }
        this.f6279c = true;
    }

    public boolean isAutoPlay() {
        return this.f6302z;
    }

    public boolean isMRAIDUseCustomClose() {
        return this.f6297u;
    }

    public boolean isMuted() {
        return this.A;
    }

    public boolean isVideoFullScreen() {
        return this.B;
    }

    public void loadAd(ServerResponse serverResponse) {
        int i4;
        if (serverResponse == null) {
            return;
        }
        this.ad = serverResponse;
        setCreativeHeight(serverResponse.getHeight());
        setCreativeWidth(serverResponse.getWidth());
        setCreativeLeft(serverResponse.getLeft());
        setCreativeTop(serverResponse.getTop());
        setRefreshInterval(serverResponse.getRefreshInterval());
        if (serverResponse.isManualClose()) {
            this.f6299w = serverResponse.getMinTimer();
        } else {
            this.f6299w = -1;
        }
        if (serverResponse.isAutoClose() && serverResponse.getMaxTimer() != 0) {
            this.f6300x = serverResponse.getMaxTimer();
        } else {
            this.f6300x = -1;
        }
        if (this.f6299w == -1 && this.f6300x == -1 && serverResponse.getAdType() != e.a.ADP_IVIDEO) {
            this.f6299w = 0;
        } else {
            int i5 = this.f6299w;
            if (i5 != -1 && (i4 = this.f6300x) != -1 && i5 > i4) {
                this.f6299w = i4;
            }
        }
        this.f6302z = serverResponse.isAutoPlay();
        this.A = serverResponse.isMuted();
        this.B = serverResponse.isFullScreen();
        this.f6295s = serverResponse.getAdOrientation();
        this.D = serverResponse.isWifiOnly();
        this.f6301y = -1;
        setInitialScale((int) ((com.beizi.ad.internal.g.a().j() * 100.0f) + 0.5f));
        loadAdAt(0);
    }

    public boolean loadAdAt(int i4) {
        int creativeHeight;
        int creativeWidth;
        ServerResponse serverResponse = this.ad;
        if (serverResponse != null && this.f6301y != i4) {
            if (!serverResponse.getCreatives().isEmpty() && this.ad.getCreatives().size() > i4) {
                Pair<i, String> pair = this.ad.getCreatives().get(i4);
                if (StringUtil.isEmpty((String) pair.second)) {
                    h();
                    return false;
                }
                if (pair.first == i.VIDEO) {
                    if (this.mAdVideoView == null) {
                        this.mAdVideoView = new AdVideoView(this);
                    }
                    this.mAdVideoView.transferAd(this, (String) pair.second);
                    this.C = true;
                    String a5 = com.beizi.ad.lance.a.b.a("aHR0cDovL2Fib3V0OmJsYW5r");
                    if (!TextUtils.isEmpty(a5)) {
                        loadUrl(a5, com.beizi.ad.lance.a.i.a());
                    }
                } else {
                    HaoboLog.v(HaoboLog.baseLogTag, HaoboLog.getString(R.string.webview_loading, (String) pair.second));
                    a(this.ad.getExtras());
                    String f5 = f(e(d((String) pair.second)));
                    float h4 = com.beizi.ad.internal.g.a().h();
                    float i5 = com.beizi.ad.internal.g.a().i();
                    float j4 = com.beizi.ad.internal.g.a().j();
                    if (getCreativeWidth() == -1 && getCreativeHeight() == -1) {
                        creativeWidth = -1;
                        creativeHeight = -1;
                    } else {
                        creativeHeight = (int) ((getCreativeHeight() * j4) + 0.5f);
                        creativeWidth = (int) ((getCreativeWidth() * j4) + 0.5f);
                    }
                    if (getCreativeLeft() == 0 && getCreativeTop() == 0) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(creativeWidth, creativeHeight, 17);
                        j jVar = this.ad.mMediaType;
                        if (jVar == j.SPLASH) {
                            setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                        } else if (jVar == j.BANNER) {
                            a(new FrameLayout.LayoutParams(-2, -1, 17));
                        } else {
                            a(layoutParams);
                        }
                    } else {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(creativeWidth, creativeHeight, 8388659);
                        layoutParams2.setMargins((int) ((getCreativeLeft() * h4) + 0.5f), (int) ((getCreativeTop() * i5) + 0.5f), 0, 0);
                        if (this.ad.mMediaType == j.SPLASH) {
                            setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                        } else {
                            a(layoutParams2);
                        }
                    }
                    loadDataWithBaseURL(null, f5, "text/html", "UTF-8", null);
                    this.C = false;
                }
                this.f6301y = i4;
                return true;
            }
            h();
        }
        return false;
    }

    public boolean loadAdBy(int i4) {
        return loadAdAt(this.f6301y + i4);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f();
    }

    @Override // com.beizi.ad.internal.view.c
    public void onDestroy() {
        destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProgressDialog progressDialog = this.f6296t;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f6296t.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6298v = true;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.F = System.currentTimeMillis();
            this.G = motionEvent.getX();
            this.H = motionEvent.getY();
            this.I = true;
        } else if (action != 1) {
            if (action == 2 && this.I && a(this.G, this.H, motionEvent.getX(), motionEvent.getY()) > 15.0f) {
                this.I = false;
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.F;
            if (currentTimeMillis - j4 < 1000 && this.I) {
                handleClickView(motionEvent, j4, currentTimeMillis);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        a(getWindowVisibility(), i4);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        a(i4, getVisibility());
    }

    public void resize(int i4, int i5, int i6, int i7, f.a aVar, boolean z4) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getLayoutParams());
        f fVar = this.f6282f;
        if (!fVar.f6378d) {
            this.f6283g = layoutParams.width;
            this.f6284h = layoutParams.height;
        }
        float f5 = displayMetrics.density;
        double d5 = i5 * f5;
        Double.isNaN(d5);
        int i8 = (int) (d5 + 0.5d);
        double d6 = i4 * f5;
        Double.isNaN(d6);
        int i9 = (int) (d6 + 0.5d);
        layoutParams.height = i8;
        layoutParams.width = i9;
        layoutParams.gravity = 17;
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.a(i9, i8, i6, i7, aVar, z4, fVar);
        }
        AdViewImpl adViewImpl2 = this.adViewImpl;
        if (adViewImpl2 != null) {
            adViewImpl2.f();
        }
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        super.scrollTo(0, 0);
    }

    public void setCreativeLeft(int i4) {
        this.f6286j = i4;
    }

    public void setCreativeTop(int i4) {
        this.f6287k = i4;
    }

    public void setMRAIDUseCustomClose(boolean z4) {
        this.f6297u = z4;
    }

    public void setRefreshInterval(int i4) {
        this.f6290n = i4;
    }

    public boolean shouldDisplayButton() {
        if (this.ad.getAdType() == e.a.ADP_BANNER) {
            return false;
        }
        if (this.ad.getAdType() == e.a.ADP_IVIDEO) {
            if (this.ad.getCreatives().get(this.f6301y).first != i.VIDEO) {
                return false;
            }
        } else if (this.f6301y != 0) {
            return false;
        }
        return true;
    }

    @Override // com.beizi.ad.internal.view.c
    public void visible() {
        Handler handler;
        AdViewImpl adViewImpl;
        setVisibility(0);
        this.adViewImpl.showAdLogo(this);
        this.adViewImpl.addDownloadTextView(this);
        j jVar = j.BANNER;
        if (jVar.equals(this.adViewImpl.getMediaType())) {
            AdViewImpl adViewImpl2 = this.adViewImpl;
            adViewImpl2.showBannerCloseBtn(adViewImpl2);
        }
        if (shouldDisplayButton() && (adViewImpl = this.adViewImpl) != null) {
            if (adViewImpl.getMediaType() == j.INTERSTITIAL) {
                this.adViewImpl.addInterstitialCloseButton(getShowCloseBtnTime(), getAutoCloseTime(), this, this.ad.getAdType() == e.a.ADP_IVIDEO);
            } else {
                this.adViewImpl.isLoadToShow(this);
            }
        }
        AdViewImpl adViewImpl3 = this.adViewImpl;
        if (adViewImpl3 == null || adViewImpl3.getAdDispatcher() == null || this.adViewImpl.getMediaType() != jVar || (handler = this.f6293q) == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.beizi.ad.internal.view.AdWebView.3
            @Override // java.lang.Runnable
            public void run() {
                AdWebView.this.adViewImpl.getAdDispatcher().a();
                AdWebView adWebView = AdWebView.this;
                ServerResponse serverResponse = adWebView.ad;
                if (serverResponse != null) {
                    serverResponse.handleView(adWebView, adWebView.adViewImpl.getAdParameters().a());
                }
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        if (StringUtil.isEmpty(str)) {
            return str;
        }
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder("<html><head><script>");
        if (resources != null && StringUtil.appendLocalStr(sb, StringUtil.adscopeJSStr) && StringUtil.appendLocalStr(sb, StringUtil.adscopeStr) && StringUtil.appendRes(sb)) {
            sb.append("</script></head>");
            return str.replaceFirst("<html>", Matcher.quoteReplacement(sb.toString()));
        }
        HaoboLog.e(HaoboLog.baseLogTag, "Error reading SDK's raw resources.");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f(String str) {
        return !StringUtil.isEmpty(str) ? str.replaceFirst("<head>", Matcher.quoteReplacement(new StringBuilder("<head><meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=no\"/>").toString())) : str;
    }

    private boolean g(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            this.adViewImpl.getContext().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.opening_url_failed, str));
            if (this.f6281e) {
                Toast.makeText(this.adViewImpl.getContext(), R.string.action_cant_be_completed, 0).show();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(String str) {
        String a5 = com.beizi.ad.lance.a.b.a("aHR0cDovL2Fib3V0OmJsYW5r");
        if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith(a5)) {
            return false;
        }
        HaoboLog.i(HaoboLog.baseLogTag, HaoboLog.getString(R.string.opening_app_store));
        return g(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f6292p) {
            this.f6294r = false;
            this.f6293q.removeCallbacks(this.L);
            this.f6293q.post(this.L);
        }
    }

    private void j() {
        this.f6294r = true;
        this.f6293q.removeCallbacks(this.L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (StringUtil.isEmpty(str)) {
            return str;
        }
        str.trim();
        if (str.startsWith("<html>")) {
            return str;
        }
        return "<html><body style='padding:0;margin:0;'>" + str + "</body></html>";
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected void b() {
        this.f6282f = new f(this);
        setWebChromeClient(new h(this));
        setWebViewClient(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript(str, null);
        } else {
            loadUrl(str, com.beizi.ad.lance.a.i.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (getContextFromMutableContext() instanceof Activity) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            boolean z4 = false;
            int i4 = iArr[0];
            int width = iArr[0] + getWidth();
            int i5 = iArr[1];
            int height = iArr[1] + getHeight();
            int[] screenSizeAsPixels = ViewUtil.getScreenSizeAsPixels((Activity) getContextFromMutableContext());
            if (width > 0 && i4 < screenSizeAsPixels[0] && height > 0 && i5 < screenSizeAsPixels[1]) {
                z4 = true;
            }
            this.f6291o = z4;
            f fVar = this.f6282f;
            if (fVar != null) {
                fVar.b();
                this.f6282f.a(i4, i5, getWidth(), getHeight());
                this.f6282f.a(getContext().getResources().getConfiguration().orientation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f6280d = true;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected void a() {
        try {
            String userAgentString = getSettings().getUserAgentString();
            if (!TextUtils.isEmpty(userAgentString) && !userAgentString.equals(com.beizi.ad.internal.g.a().f5896d)) {
                SPUtils.put(getContext(), TTDownloadField.TT_USERAGENT, userAgentString);
            }
            com.beizi.ad.internal.g.a().f5896d = userAgentString;
            getSettings().setJavaScriptEnabled(true);
            getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            getSettings().setBuiltInZoomControls(false);
            getSettings().setEnableSmoothTransition(true);
            getSettings().setLightTouchEnabled(false);
            getSettings().setPluginState(WebSettings.PluginState.ON);
            getSettings().setLoadsImagesAutomatically(true);
            getSettings().setSavePassword(false);
            getSettings().setSupportZoom(false);
            getSettings().setUseWideViewPort(false);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 17) {
                getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            if (i4 >= 21) {
                getSettings().setMixedContentMode(0);
            }
            if (i4 >= 19) {
                WebView.setWebContentsDebuggingEnabled(false);
            }
            if (i4 >= 11 && i4 < 19) {
                removeJavascriptInterface("searchBoxJavaBridge_");
                removeJavascriptInterface("accessibility");
                removeJavascriptInterface("accessibilityTraversal");
            }
            getSettings().setAllowFileAccess(false);
            getSettings().setAllowContentAccess(false);
            if (i4 >= 16) {
                getSettings().setAllowFileAccessFromFileURLs(false);
                getSettings().setAllowUniversalAccessFromFileURLs(false);
            }
            if (i4 >= 21) {
                CookieManager cookieManager = CookieManager.getInstance();
                if (cookieManager != null) {
                    cookieManager.setAcceptThirdPartyCookies(this, true);
                } else {
                    HaoboLog.d(HaoboLog.baseLogTag, "Failed to set Webview to accept 3rd party cookie");
                }
            }
            setHorizontalScrollbarOverlay(false);
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollbarOverlay(false);
            setVerticalScrollBarEnabled(false);
            if (this.B) {
                setBackgroundColor(0);
            }
            setScrollBarStyle(0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        if (!this.adViewImpl.getOpensNativeBrowser()) {
            HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.opening_inapp));
            if (h(str)) {
                return;
            }
            try {
                if (this.adViewImpl.getLoadsInBackground()) {
                    final c cVar = new c(getContext());
                    cVar.loadUrl(str, com.beizi.ad.lance.a.i.a());
                    cVar.setVisibility(8);
                    this.adViewImpl.addView(cVar);
                    if (this.adViewImpl.getShowLoadingIndicator()) {
                        ProgressDialog progressDialog = new ProgressDialog(getContextFromMutableContext());
                        this.f6296t = progressDialog;
                        progressDialog.setCancelable(true);
                        this.f6296t.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.beizi.ad.internal.view.AdWebView.2
                            @Override // android.content.DialogInterface.OnCancelListener
                            public void onCancel(DialogInterface dialogInterface) {
                                cVar.stopLoading();
                            }
                        });
                        this.f6296t.setMessage(getContext().getResources().getString(R.string.loading));
                        this.f6296t.setProgressStyle(0);
                        this.f6296t.show();
                    }
                } else {
                    WebView webView = new WebView(new MutableContextWrapper(getContext()));
                    WebviewUtil.setWebViewSettings(webView);
                    webView.loadUrl(str, com.beizi.ad.lance.a.i.a());
                    a(webView);
                }
                return;
            } catch (Exception e5) {
                String str2 = HaoboLog.baseLogTag;
                HaoboLog.e(str2, "Exception initializing the redirect webview: " + e5.getMessage());
                return;
            }
        }
        HaoboLog.d(HaoboLog.baseLogTag, HaoboLog.getString(R.string.opening_native));
        g(str);
        k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f6291o && this.f6292p;
    }

    public void handleClickView(com.beizi.ad.c.c cVar, long j4, long j5, int i4) {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl == null || adViewImpl.getAdDispatcher() == null || this.adViewImpl.isRewardedVideo()) {
            return;
        }
        this.E++;
        this.adViewImpl.getAdDispatcher().d();
        this.ad.setOpenInNativeBrowser(this.adViewImpl.getOpensNativeBrowser());
        this.ad.setCloseMarketDialog(this.adViewImpl.isCloseMarketDialog());
        this.ad.handleClick(this, cVar, String.valueOf(j4), String.valueOf(j5), this.f6279c, this.adViewImpl.getAdParameters().a(), i4);
        this.f6279c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.a(this.f6283g, this.f6284h, this.f6282f);
        }
    }

    private void a(FrameLayout.LayoutParams layoutParams) {
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl instanceof BannerAdViewImpl) {
            if (((BannerAdViewImpl) adViewImpl).getResizeAdToFitContainer()) {
                setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                return;
            } else {
                setLayoutParams(layoutParams);
                return;
            }
        }
        setLayoutParams(layoutParams);
    }

    private void a(HashMap hashMap) {
        if (!hashMap.isEmpty() && hashMap.containsKey(ServerResponse.EXTRAS_KEY_MRAID)) {
            this.f6281e = ((Boolean) hashMap.get(ServerResponse.EXTRAS_KEY_MRAID)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final String str) {
        new HTTPGet(false, true) { // from class: com.beizi.ad.internal.view.AdWebView.1
            @Override // com.beizi.ad.internal.utilities.HTTPGet
            protected String getUrl() {
                return str;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.beizi.ad.internal.utilities.HTTPGet, android.os.AsyncTask
            public void onPostExecute(HTTPResponse hTTPResponse) {
                if (hTTPResponse.getSucceeded()) {
                    AdWebView.this.loadDataWithBaseURL(null, AdWebView.this.f(AdWebView.this.e(AdWebView.this.d(hTTPResponse.getResponseBody()))), "text/html", "UTF-8", null);
                    AdWebView.this.fireMRAIDEnabled();
                }
            }
        }.execute(new Void[0]);
    }

    private static float a(float f5, float f6, float f7, float f8) {
        float f9 = f5 - f7;
        float f10 = f6 - f8;
        return a((float) Math.sqrt((f9 * f9) + (f10 * f10)));
    }

    private static float a(float f5) {
        return f5 / com.beizi.ad.internal.g.a().k().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebResourceResponse a(WebResourceRequest webResourceRequest) {
        try {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            String str = "*/*";
            if (requestHeaders != null && requestHeaders.size() > 0 && requestHeaders.containsKey("Accept")) {
                str = requestHeaders.get("Accept");
            }
            Uri url = webResourceRequest.getUrl();
            if (url == null) {
                return null;
            }
            String uri = url.toString();
            if (uri.startsWith(com.facebook.common.util.f.f10923a)) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                this.J = httpURLConnection;
                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                this.J.setRequestProperty("X-Requested-With", "");
                this.J.setRequestProperty("Accept", str);
                this.J.setRequestProperty("User-Agent", com.beizi.ad.internal.g.a().f5896d);
                this.K = this.J.getInputStream();
                return new WebResourceResponse(str, "UTF-8", this.K);
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WebView webView) {
        Class a5 = AdActivity.a();
        Intent intent = new Intent(this.adViewImpl.getContext(), a5);
        intent.setFlags(268435456);
        intent.putExtra("ACTIVITY_TYPE", "BROWSER");
        com.beizi.ad.internal.activity.a.f5750a.add(webView);
        if (this.adViewImpl.getBrowserStyle() != null) {
            String str = "" + super.hashCode();
            intent.putExtra("bridgeid", str);
            AdViewImpl.c.f6276a.add(new Pair<>(str, this.adViewImpl.getBrowserStyle()));
        }
        try {
            this.adViewImpl.getContext().startActivity(intent);
            k();
        } catch (ActivityNotFoundException unused) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.adactivity_missing, a5.getName()));
            com.beizi.ad.internal.activity.a.f5750a.remove();
        }
    }

    private void a(int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            WebviewUtil.onResume(this);
            this.f6292p = true;
            if (this.f6281e && this.f6285i) {
                i();
            }
        } else {
            WebviewUtil.onPause(this);
            this.f6292p = false;
            j();
        }
        f fVar = this.f6282f;
        if (fVar != null) {
            fVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4, int i5, boolean z4, final f fVar, final boolean z5, final AdActivity.b bVar) {
        int i6 = i4;
        int i7 = i5;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getLayoutParams());
        if (!this.f6282f.f6378d) {
            this.f6283g = layoutParams.width;
            this.f6284h = layoutParams.height;
        }
        if (i7 == -1 && i6 == -1 && this.adViewImpl != null) {
            this.f6277a = true;
        }
        if (i7 != -1) {
            double d5 = i7 * displayMetrics.density;
            Double.isNaN(d5);
            i7 = (int) (d5 + 0.5d);
        }
        int i8 = i7;
        if (i6 != -1) {
            double d6 = i6 * displayMetrics.density;
            Double.isNaN(d6);
            i6 = (int) (d6 + 0.5d);
        }
        int i9 = i6;
        layoutParams.height = i8;
        layoutParams.width = i9;
        layoutParams.gravity = 17;
        b bVar2 = null;
        if (this.f6277a) {
            bVar2 = new b() { // from class: com.beizi.ad.internal.view.AdWebView.4
                @Override // com.beizi.ad.internal.view.AdWebView.b
                public void a() {
                    f fVar2 = fVar;
                    if (fVar2 == null || fVar2.c() == null) {
                        return;
                    }
                    AdWebView.this.a(fVar.c(), z5, bVar);
                    AdViewImpl.setMRAIDFullscreenListener(null);
                }
            };
        }
        b bVar3 = bVar2;
        AdViewImpl adViewImpl = this.adViewImpl;
        if (adViewImpl != null) {
            adViewImpl.a(i9, i8, z4, fVar, bVar3);
            this.adViewImpl.f();
        }
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Activity activity, boolean z4, AdActivity.b bVar) {
        AdActivity.b bVar2 = AdActivity.b.none;
        if (bVar != bVar2) {
            AdActivity.a(activity, bVar);
        }
        if (z4) {
            AdActivity.b(activity);
        } else if (bVar == bVar2) {
            AdActivity.a(activity);
        }
    }
}
