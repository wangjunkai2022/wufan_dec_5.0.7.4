package com.beizi.ad.internal.activity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.beizi.ad.AdActivity;
import com.beizi.ad.R;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.view.AdViewImpl;
import com.beizi.ad.internal.view.h;
import com.beizi.ad.lance.a.l;
import com.facebook.common.util.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
/* compiled from: BrowserAdActivity.java */
/* loaded from: classes2.dex */
public class a implements AdActivity.a {

    /* renamed from: a  reason: collision with root package name */
    public static LinkedList<WebView> f5750a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private Activity f5751b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f5752c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f5753d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5754e;

    public a(Activity activity, boolean z4) {
        this.f5751b = activity;
        this.f5754e = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activity = this.f5751b;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.beizi.ad.AdActivity.a
    public void d() {
    }

    @Override // com.beizi.ad.AdActivity.a
    public void e() {
    }

    @Override // com.beizi.ad.AdActivity.a
    public WebView f() {
        return this.f5752c;
    }

    @Override // com.beizi.ad.AdActivity.a
    public void b() {
        l.a("lance", "...........................backPressed...........................");
        if (this.f5752c.canGoBack()) {
            this.f5752c.goBack();
            l.a("lance", " mWebView.goBack()");
            return;
        }
        g();
    }

    @Override // com.beizi.ad.AdActivity.a
    public void c() {
        WebView webView = this.f5752c;
        if (webView == null) {
            return;
        }
        ViewUtil.removeChildFromParent(webView);
        this.f5752c.destroy();
    }

    @Override // com.beizi.ad.AdActivity.a
    @SuppressLint({"SetJavaScriptEnabled", "NewApi"})
    @TargetApi(17)
    public void a() {
        this.f5751b.setTheme(R.style.BeiZiTheme);
        this.f5751b.setContentView(R.layout.activity_in_app_browser);
        WebView poll = f5750a.poll();
        this.f5752c = poll;
        if (poll != null && poll.getSettings() != null) {
            if (this.f5752c.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) this.f5752c.getContext()).setBaseContext(this.f5751b);
            }
            WebView webView = (WebView) this.f5751b.findViewById(R.id.web_view);
            webView.getSettings().setSavePassword(false);
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            int indexOfChild = viewGroup.indexOfChild(webView);
            viewGroup.removeView(webView);
            ViewUtil.removeChildFromParent(this.f5752c);
            this.f5752c.setLayoutParams(layoutParams);
            this.f5752c.getSettings().setUseWideViewPort(true);
            this.f5752c.getSettings().setLoadWithOverviewMode(true);
            this.f5752c.getSettings().setJavaScriptEnabled(true);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 11 && i4 < 19) {
                this.f5752c.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f5752c.removeJavascriptInterface("accessibility");
                this.f5752c.removeJavascriptInterface("accessibilityTraversal");
            }
            if (i4 >= 19) {
                WebView.setWebContentsDebuggingEnabled(false);
            }
            viewGroup.addView(this.f5752c, indexOfChild);
            final ProgressBar progressBar = (ProgressBar) this.f5751b.findViewById(R.id.progress_bar);
            try {
                String stringExtra = this.f5751b.getIntent().getStringExtra("bridgeid");
                if (stringExtra != null) {
                    Iterator<Pair<String, AdViewImpl.c>> it2 = AdViewImpl.c.f6276a.iterator();
                    while (it2.hasNext()) {
                        Pair<String, AdViewImpl.c> next = it2.next();
                        if (((String) next.first).equals(stringExtra)) {
                            AdViewImpl.c cVar = (AdViewImpl.c) next.second;
                            AdViewImpl.c.f6276a.remove(next);
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f5752c.setDownloadListener(new DownloadListener() { // from class: com.beizi.ad.internal.activity.a.1
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
                }
            });
            this.f5752c.setWebViewClient(new WebViewClient() { // from class: com.beizi.ad.internal.activity.a.2
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
                    if (cookieSyncManager != null) {
                        cookieSyncManager.sync();
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                    try {
                        Uri url = webResourceRequest.getUrl();
                        if (url == null) {
                            return false;
                        }
                        String uri = url.toString();
                        if (!uri.startsWith(f.f10923a)) {
                            if (a.this.f5754e) {
                                a.this.a(uri);
                            }
                            return true;
                        }
                        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                        if (requestHeaders == null || requestHeaders.size() == 0) {
                            requestHeaders = new HashMap<>();
                        }
                        requestHeaders.put("X-Requested-With", "");
                        webView2.loadUrl(uri, requestHeaders);
                        return true;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return true;
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    HaoboLog.v(HaoboLog.browserLogTag, HaoboLog.getString(R.string.opening_url, str));
                    if (str.startsWith(f.f10923a)) {
                        return false;
                    }
                    if (a.this.f5754e) {
                        a.this.a(str);
                        return true;
                    }
                    return true;
                }
            });
            this.f5752c.setWebChromeClient(new h(this.f5751b) { // from class: com.beizi.ad.internal.activity.a.3
                @Override // com.beizi.ad.internal.view.a, android.webkit.WebChromeClient
                public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    HaoboLog.w(HaoboLog.browserLogTag, HaoboLog.getString(R.string.console_message, consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.sourceId()));
                    return true;
                }

                @Override // com.beizi.ad.internal.view.a, android.webkit.WebChromeClient
                public boolean onJsAlert(WebView webView2, String str, String str2, JsResult jsResult) {
                    HaoboLog.w(HaoboLog.browserLogTag, HaoboLog.getString(R.string.js_alert, str2, str));
                    jsResult.confirm();
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView2, int i5) {
                    if (i5 < 100 && progressBar.getVisibility() == 8) {
                        progressBar.setVisibility(0);
                    }
                    progressBar.setProgress(i5);
                    if (i5 == 100) {
                        progressBar.setVisibility(8);
                    }
                }

                @Override // com.beizi.ad.internal.view.h, android.webkit.WebChromeClient
                public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                    super.onShowCustomView(view, customViewCallback);
                    if (view instanceof FrameLayout) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getFocusedChild() instanceof VideoView) {
                            VideoView videoView = (VideoView) frameLayout.getFocusedChild();
                            frameLayout.removeView(videoView);
                            ((Activity) a.this.f5752c.getContext()).setContentView(videoView);
                            videoView.start();
                        }
                    }
                }
            });
            ImageView imageView = (ImageView) this.f5751b.findViewById(R.id.close_iv);
            this.f5753d = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.a.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.g();
                }
            });
            return;
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Uri parse = StringUtil.isEmpty(str) ? null : Uri.parse(str);
        if (parse == null) {
            HaoboLog.w(HaoboLog.browserLogTag, HaoboLog.getString(R.string.opening_url_failed, str));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.setFlags(268435456);
        try {
            this.f5751b.startActivity(intent);
            c();
            g();
        } catch (Exception unused) {
            HaoboLog.w(HaoboLog.browserLogTag, HaoboLog.getString(R.string.opening_url_failed, str));
        }
    }
}
