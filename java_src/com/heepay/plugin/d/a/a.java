package com.heepay.plugin.d.a;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* loaded from: classes3.dex */
public class a extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private c f14395a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14396b;

    public a(String str, Class cls) {
        this.f14395a = new c(str, cls);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        jsPromptResult.confirm(this.f14395a.a(webView, str2));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i4) {
        if (i4 <= 25) {
            this.f14396b = false;
        } else if (!this.f14396b) {
            webView.loadUrl(this.f14395a.a());
            this.f14396b = true;
            com.heepay.plugin.c.c.b("---->", " inject js interface completely on progress " + i4);
        }
        super.onProgressChanged(webView, i4);
    }
}
