package com.alipay.sdk.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.util.j;
/* loaded from: classes2.dex */
public final class b extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private Activity f4701a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4702b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f4703c;

    /* renamed from: d  reason: collision with root package name */
    private com.alipay.sdk.widget.a f4704d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4705e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f4706f = new f(this);

    public b(Activity activity) {
        this.f4701a = activity;
        this.f4703c = new Handler(this.f4701a.getMainLooper());
    }

    private void d() {
        if (this.f4704d == null) {
            this.f4704d = new com.alipay.sdk.widget.a(this.f4701a, com.alipay.sdk.widget.a.f4969d);
        }
        this.f4704d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.alipay.sdk.widget.a aVar = this.f4704d;
        if (aVar != null) {
            aVar.f();
        }
        this.f4704d = null;
    }

    public final boolean b() {
        return this.f4705e;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        f();
        this.f4703c.removeCallbacks(this.f4706f);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f4704d == null) {
            this.f4704d = new com.alipay.sdk.widget.a(this.f4701a, com.alipay.sdk.widget.a.f4969d);
        }
        this.f4704d.c();
        this.f4703c.postDelayed(this.f4706f, 30000L);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        this.f4705e = true;
        super.onReceivedError(webView, i4, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        com.alipay.sdk.app.statistic.a.c("net", com.alipay.sdk.app.statistic.c.f4733p, "证书错误");
        if (this.f4702b) {
            sslErrorHandler.proceed();
            this.f4702b = false;
            return;
        }
        this.f4701a.runOnUiThread(new c(this, sslErrorHandler));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return j.j(webView, str, this.f4701a);
    }
}
