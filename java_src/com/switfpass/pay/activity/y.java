package com.switfpass.pay.activity;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ WebViewEx f61600a;

    private y(WebViewEx webViewEx) {
        this.f61600a = webViewEx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y(WebViewEx webViewEx, byte b5) {
        this(webViewEx);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        WebViewEx.a(this.f61600a, webView);
        super.doUpdateVisitedHistory(webView, str, z4);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        WebViewEx.a(this.f61600a, webView);
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WebViewEx.a(this.f61600a, webView);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewEx.a(this.f61600a, webView);
        super.onPageStarted(webView, str, bitmap);
    }
}
