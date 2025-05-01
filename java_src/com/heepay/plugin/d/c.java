package com.heepay.plugin.d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.heepay.plugin.activity.HyNotityActivity;
import com.heepay.plugin.c.d;
import com.join.mgps.Util.v;
/* loaded from: classes3.dex */
public class c extends com.heepay.plugin.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private HyNotityActivity f14406a;

    public c(HyNotityActivity hyNotityActivity) {
        super(hyNotityActivity);
        this.f14406a = hyNotityActivity;
    }

    @Override // com.heepay.plugin.d.a.b, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (((HyNotityActivity) webView.getContext()).f14345f.equals(v.f28122v) && webView.getVisibility() == 8) {
            webView.setVisibility(0);
        }
        d.a("----->onPageFinished" + str);
        com.heepay.plugin.c.c.a("---->onPageFinished:" + str);
    }

    @Override // com.heepay.plugin.d.a.b, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        HyNotityActivity hyNotityActivity;
        boolean z4;
        d.a("----->onPageStarted" + str);
        com.heepay.plugin.c.c.a("---->onPageStarted:" + str);
        if (!str.startsWith("wei_xin:".replace("_", "")) && !str.startsWith("ali_payqr:".replace("_", "")) && !str.startsWith("ali_pays:".replace("_", ""))) {
            com.heepay.plugin.c.c.b("setWebViewClient_isNeedQuery", "-1--" + this.f14406a.f14349j);
            super.onPageStarted(webView, str, bitmap);
            return;
        }
        if (this.f14406a.f14345f.equals(v.f28122v)) {
            hyNotityActivity = this.f14406a;
            z4 = false;
        } else {
            hyNotityActivity = this.f14406a;
            z4 = true;
        }
        hyNotityActivity.f14349j = z4;
        if (((HyNotityActivity) webView.getContext()).f14353n) {
            ((HyNotityActivity) webView.getContext()).h();
            com.heepay.plugin.c.c.b("----->关闭启动loading", "---");
        }
        this.f14406a.b(str);
        com.heepay.plugin.c.c.b("setWebViewClient_isNeedQuery", "-2--" + this.f14406a.f14349j);
        webView.stopLoading();
    }

    @Override // com.heepay.plugin.d.a.b, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i4, String str, String str2) {
        super.onReceivedError(webView, i4, str, str2);
        d.a("----->onReceivedError" + str2);
        com.heepay.plugin.c.c.a("---->onReceivedError:" + str2 + ",errorCode:" + i4);
        StringBuilder sb = new StringBuilder();
        sb.append("---->onReceivedError:");
        sb.append(str2);
        com.heepay.plugin.c.c.a(sb.toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        d.a("----->onReceivedHttpError:" + webView.getUrl());
        com.heepay.plugin.c.c.a("---->onReceivedHttpError:" + webView.getUrl() + ",errorCode:" + webResourceResponse.getStatusCode());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        d.a("----->shouldOverrideUrlLoading" + str);
        com.heepay.plugin.c.c.a("---->shouldOverrideUrlLoading:" + str);
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
