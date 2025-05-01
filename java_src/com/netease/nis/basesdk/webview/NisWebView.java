package com.netease.nis.basesdk.webview;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes5.dex */
public class NisWebView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private WebChromeClient f57374a;

    /* renamed from: b  reason: collision with root package name */
    private WebViewClient f57375b;

    /* renamed from: c  reason: collision with root package name */
    private String f57376c;

    /* renamed from: d  reason: collision with root package name */
    private final WebChromeClient f57377d;

    /* renamed from: e  reason: collision with root package name */
    private final WebViewClient f57378e;

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StringBuilder f57379a;

        a(StringBuilder sb) {
            this.f57379a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 19) {
                NisWebView.this.evaluateJavascript(this.f57379a.toString(), null);
            } else {
                NisWebView.this.loadUrl(this.f57379a.toString());
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StringBuilder f57381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ValueCallback f57382b;

        b(StringBuilder sb, ValueCallback valueCallback) {
            this.f57381a = sb;
            this.f57382b = valueCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 19) {
                NisWebView.this.evaluateJavascript(this.f57381a.toString(), this.f57382b);
                return;
            }
            NisWebView nisWebView = NisWebView.this;
            nisWebView.loadUrl("javascript:onJsPrompt(" + this.f57381a.toString() + ")");
            this.f57382b.onReceiveValue(NisWebView.this.f57376c);
        }
    }

    /* loaded from: classes5.dex */
    class c extends WebChromeClient {
        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            NisWebView.this.f57376c = str2;
            if (NisWebView.this.f57374a != null) {
                return NisWebView.this.f57374a.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    /* loaded from: classes5.dex */
    class d extends WebViewClient {
        d() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            if (NisWebView.this.f57375b != null) {
                NisWebView.this.f57375b.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }
    }

    public NisWebView(Context context) {
        this(context, null);
    }

    public void callJsMethod(String str, Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(",");
        }
        sb.append(")");
        post(new a(sb));
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f57374a = webChromeClient;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.f57375b = webViewClient;
    }

    public NisWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NisWebView(Context context, AttributeSet attributeSet, int i4) {
        super(a(context), attributeSet, i4);
        this.f57377d = new c();
        this.f57378e = new d();
        a();
    }

    private static Context a(Context context) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 21 || i4 >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    private void a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (i4 < 19) {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(this.f57377d);
        setWebViewClient(this.f57378e);
        resumeTimers();
    }

    public void callJsMethod(String str, Object[] objArr, ValueCallback<String> valueCallback) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(",");
        }
        sb.append(")");
        post(new b(sb, valueCallback));
    }
}
