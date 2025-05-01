package com.switfpass.pay.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.switfpass.pay.bean.RequestMsg;
/* loaded from: classes5.dex */
public class QQWapPayWebView extends BasePayActivity {

    /* renamed from: c  reason: collision with root package name */
    private boolean f61542c = false;

    /* renamed from: d  reason: collision with root package name */
    private WebViewEx f61543d;

    /* renamed from: e  reason: collision with root package name */
    private String f61544e;

    /* renamed from: f  reason: collision with root package name */
    private String f61545f;

    /* renamed from: g  reason: collision with root package name */
    private String f61546g;

    public static void startActivity(Activity activity, String str) {
        Intent intent = new Intent();
        intent.putExtra("url", str);
        intent.setClass(activity, QQWapPayWebView.class);
        activity.startActivityForResult(intent, 1);
    }

    public static void startActivity(Activity activity, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra("url", str);
        intent.putExtra("tokenId", str2);
        intent.putExtra("outTradeNo", str3);
        intent.setClass(activity, QQWapPayWebView.class);
        activity.startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.switfpass.pay.activity.BasePayActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        WebSettings.ZoomDensity zoomDensity;
        super.onCreate(bundle);
        this.f61542c = true;
        WebViewEx webViewEx = new WebViewEx(this);
        this.f61543d = webViewEx;
        WebSettings settings = webViewEx.getSettings();
        if (Build.VERSION.SDK_INT == 17) {
            settings.setDisplayZoomControls(false);
        }
        settings.setLoadWithOverviewMode(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i4 = displayMetrics.densityDpi;
        if (i4 == 120) {
            zoomDensity = WebSettings.ZoomDensity.CLOSE;
        } else if (i4 != 160) {
            if (i4 == 240) {
                zoomDensity = WebSettings.ZoomDensity.FAR;
            }
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            this.f61543d.setWebChromeClient(new h());
            this.f61543d.setWebViewClient(new g(this));
            this.f61546g = getIntent().getStringExtra("url");
            this.f61544e = getIntent().getStringExtra("tokenId");
            this.f61545f = getIntent().getStringExtra("outTradeNo");
            this.f61543d.loadUrl(this.f61546g);
            this.f61543d.getSettings().setJavaScriptEnabled(true);
        } else {
            zoomDensity = WebSettings.ZoomDensity.MEDIUM;
        }
        settings.setDefaultZoom(zoomDensity);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        this.f61543d.setWebChromeClient(new h());
        this.f61543d.setWebViewClient(new g(this));
        this.f61546g = getIntent().getStringExtra("url");
        this.f61544e = getIntent().getStringExtra("tokenId");
        this.f61545f = getIntent().getStringExtra("outTradeNo");
        this.f61543d.loadUrl(this.f61546g);
        this.f61543d.getSettings().setJavaScriptEnabled(true);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        a();
        if (this.f61542c) {
            this.f61542c = false;
        } else {
            String str = this.f61544e;
            String str2 = this.f61545f;
            RequestMsg requestMsg = new RequestMsg();
            requestMsg.N(str);
            requestMsg.F(str2);
            com.switfpass.pay.service.d.d().i(requestMsg, new f(this));
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
