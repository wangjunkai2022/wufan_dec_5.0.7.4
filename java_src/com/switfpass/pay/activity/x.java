package com.switfpass.pay.activity;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* loaded from: classes5.dex */
final class x extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ WebViewEx f61598a;

    private x(WebViewEx webViewEx) {
        this.f61598a = webViewEx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ x(WebViewEx webViewEx, byte b5) {
        this(webViewEx);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if ((webView instanceof WebViewEx) && this.f61598a.f(str2, jsPromptResult)) {
            return true;
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i4) {
        WebViewEx.a(this.f61598a, webView);
        super.onProgressChanged(webView, i4);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        WebViewEx.a(this.f61598a, webView);
    }
}
