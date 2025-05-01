package com.netease.nis.quicklogin.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.netease.nis.quicklogin.R;
/* loaded from: classes5.dex */
public class ProtocolDetailActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private WebView f57553a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends WebViewClient {
        a(ProtocolDetailActivity protocolDetailActivity) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends WebChromeClient {

        /* loaded from: classes5.dex */
        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                ProtocolDetailActivity.this.f57553a.loadUrl(str);
                return true;
            }
        }

        b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new a());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public void back(View view) {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.yd_activity_protocol_detail);
        this.f57553a = (WebView) findViewById(R.id.yd_wv_protocol);
        a();
        a(getIntent());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        WebView webView = this.f57553a;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f57553a);
            }
            this.f57553a.stopLoading();
            this.f57553a.getSettings().setJavaScriptEnabled(false);
            this.f57553a.clearHistory();
            this.f57553a.clearView();
            this.f57553a.removeAllViews();
            this.f57553a.destroy();
        }
        super.onDestroy();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a() {
        WebSettings settings = this.f57553a.getSettings();
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
            this.f57553a.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f57553a.removeJavascriptInterface("accessibility");
            this.f57553a.removeJavascriptInterface("accessibilityTraversal");
        }
        settings.setBuiltInZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        this.f57553a.setWebViewClient(new a(this));
        this.f57553a.setWebChromeClient(new b());
    }

    private void a(Intent intent) {
        TextView textView;
        String stringExtra = intent.getStringExtra("url");
        String stringExtra2 = intent.getStringExtra("title");
        if (!TextUtils.isEmpty(stringExtra2) && (textView = (TextView) findViewById(R.id.yd_tv_navigation)) != null) {
            textView.setText(stringExtra2);
        }
        this.f57553a.loadUrl(stringExtra);
    }
}
