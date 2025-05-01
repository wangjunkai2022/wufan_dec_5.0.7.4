package com.switfpass.pay.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes5.dex */
final class g extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ QQWapPayWebView f61566a;

    public g(QQWapPayWebView qQWapPayWebView) {
        this.f61566a = qQWapPayWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            QQWapPayWebView qQWapPayWebView = this.f61566a;
            qQWapPayWebView.b(true, "加载中...", qQWapPayWebView);
        } catch (Exception e5) {
            new StringBuilder("onPageStarted ").append(e5);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        super.onReceivedError(webView, i4, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            QQWapPayWebView qQWapPayWebView = this.f61566a;
            qQWapPayWebView.b(true, "加载中...", qQWapPayWebView);
            Uri parse = Uri.parse(str);
            if (parse.getScheme().equals("mqqapi") && parse.getHost().equals("forward")) {
                this.f61566a.startActivity(new Intent("android.intent.action.VIEW", parse));
                return true;
            } else if (parse.getScheme().equals("weixin") && parse.getHost().equals("wap")) {
                this.f61566a.startActivity(new Intent("android.intent.action.VIEW", parse));
                return true;
            } else if (parse.getHost().equals("mclient.alipay.com")) {
                this.f61566a.startActivity(new Intent("android.intent.action.VIEW", parse));
                return true;
            } else if (parse.getHost().equals("mobilecodec.alipay.com")) {
                this.f61566a.startActivity(new Intent("android.intent.action.VIEW", parse));
                return true;
            } else {
                return super.shouldOverrideUrlLoading(webView, str);
            }
        } catch (Exception e5) {
            new StringBuilder("shouldOverrideUrlLoading ").append(e5);
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
