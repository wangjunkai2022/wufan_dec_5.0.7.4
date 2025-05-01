package com.ss.android.downloadlib.addownload.compliance;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.R;
import com.facebook.common.util.f;
import com.ss.android.downloadlib.n.b;
/* loaded from: classes5.dex */
public class AppPrivacyPolicyActivity extends Activity {

    /* renamed from: i  reason: collision with root package name */
    private long f60403i;

    /* renamed from: m  reason: collision with root package name */
    private WebView f60404m;

    /* renamed from: o  reason: collision with root package name */
    private String f60405o;

    /* renamed from: p  reason: collision with root package name */
    private long f60406p;
    private ImageView vv;

    private void m() {
        this.vv = (ImageView) findViewById(R.id.iv_privacy_back);
        this.f60404m = (WebView) findViewById(R.id.privacy_webview);
        this.vv.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                n.vv("lp_app_privacy_click_close", AppPrivacyPolicyActivity.this.f60403i);
                AppPrivacyPolicyActivity.this.finish();
            }
        });
        WebSettings settings = this.f60404m.getSettings();
        settings.setDefaultFontSize(16);
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        this.f60404m.setWebViewClient(new WebViewClient() { // from class: com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.2
            private boolean vv(Uri uri) {
                String scheme = uri.getScheme();
                return (f.f10923a.equals(scheme) || "https".equals(scheme)) ? false : true;
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (Build.VERSION.SDK_INT < 26) {
                    return super.onRenderProcessGone(webView, renderProcessGoneDetail);
                }
                if (!renderProcessGoneDetail.didCrash()) {
                    b.vv("System killed the WebView rendering process to reclaim memory. Recreating...");
                    if (webView != null) {
                        ((ViewGroup) webView.getParent()).removeView(webView);
                        webView.destroy();
                    }
                    return true;
                }
                b.vv("The WebView rendering process crashed!");
                if (webView != null) {
                    ((ViewGroup) webView.getParent()).removeView(webView);
                    webView.destroy();
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return vv(webResourceRequest.getUrl());
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return vv(Uri.parse(str));
            }
        });
        vv(this.f60404m);
        this.f60404m.setScrollBarStyle(0);
        this.f60404m.loadUrl(this.f60405o);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        n.vv("lp_app_privacy_click_close", this.f60403i);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ttdownloader_activity_app_privacy_policy);
        if (vv()) {
            m();
        } else {
            com.ss.android.socialbase.appdownloader.p.vv((Activity) this);
        }
    }

    public static void vv(Activity activity, long j4) {
        Intent intent = new Intent(activity, AppPrivacyPolicyActivity.class);
        intent.putExtra("app_info_id", j4);
        activity.startActivity(intent);
    }

    private boolean vv() {
        this.f60406p = getIntent().getLongExtra("app_info_id", 0L);
        com.ss.android.downloadlib.addownload.m.m vv = p.vv().vv(this.f60406p);
        if (vv == null) {
            return false;
        }
        this.f60403i = vv.f60502m;
        String str = vv.wv;
        this.f60405o = str;
        if (TextUtils.isEmpty(str)) {
            this.f60405o = com.ss.android.downloadlib.addownload.b.wv().optString("ad_privacy_backup_url", "https://sf6-ttcdn-tos.pstatp.com/obj/ad-tetris-site/personal-privacy-page.html");
            return true;
        }
        return true;
    }

    private void vv(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }
}
