package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.NestedWebView;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_test_html)
/* loaded from: classes4.dex */
public class TestHtmlActivity extends BaseActivity {

    /* renamed from: d  reason: collision with root package name */
    public static final String f38087d = "TestHtmlActivity";
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    NestedWebView f38088b;

    /* renamed from: c  reason: collision with root package name */
    private String f38089c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        WebChromeClient.CustomViewCallback f38090a;

        a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i4) {
            super.onProgressChanged(webView, i4);
        }

        @Override // android.webkit.WebChromeClient
        public void onReachedMaxAppCacheSize(long j4, long j5, WebStorage.QuotaUpdater quotaUpdater) {
            try {
                UtilsMy.delete(new File(TestHtmlActivity.this.f38089c));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            super.onReachedMaxAppCacheSize(j4, j5, quotaUpdater);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, int i4, WebChromeClient.CustomViewCallback customViewCallback) {
            onShowCustomView(view, customViewCallback);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }
    }

    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f38092a;

        public b(Context context) {
            this.f38092a = context;
        }

        @JavascriptInterface
        public void openImage(String[] strArr, int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c extends WebViewClient {
        public c(Context context) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.join.mgps.Util.v0.b(TestHtmlActivity.f38087d, "onPageFinished() called." + str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.join.mgps.Util.v0.b(TestHtmlActivity.f38087d, "onPageStarted() called." + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            com.join.mgps.Util.v0.b(TestHtmlActivity.f38087d, "onReceivedError() called." + str2);
            if (str2.endsWith(".zip")) {
                return;
            }
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 3 || primaryError == 5) {
                sslErrorHandler.proceed();
            }
            sslErrorHandler.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        initWebSet();
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        this.f38088b.loadData("<!DOCTYPE html><html style=\"height:100%;width:100%;padding:0;margin:0;\"><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>wufan</title></head><body style=\"height:100%;width:100%;padding:0;margin:0;\"><div style=\"height:100%;width:100%;overflow: hidden;\"><iframe src=\"https://player.bilibili.com/player.html?high_quality=1&bvid=BV1Me4114751&page=1\" scrolling=\"no\" border=\"0\" frameborder=\"no\" framespacing=\"0\" allowfullscreen=\"true\" style=\"height:100%;width:100%;padding:0;margin:0;\"></iframe></div>%0A</body></html>", "text/html", "utf-8");
    }

    public void initWebSet() {
        this.f38088b.getSettings().setDomStorageEnabled(true);
        this.f38088b.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f38088b.getSettings().setAppCacheEnabled(true);
        this.f38089c = getApplicationContext().getDir("cacheH51", 0).getPath();
        this.f38088b.getSettings().setAppCachePath(this.f38089c);
        this.f38088b.getSettings().setAllowFileAccess(true);
        this.f38088b.getSettings().setCacheMode(-1);
        this.f38088b.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f38088b.getSettings().setLoadWithOverviewMode(true);
        this.f38088b.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.f38088b.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f38088b.getSettings().setTextZoom(100);
        this.f38088b.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f38088b.getSettings().setUseWideViewPort(true);
        this.f38088b.getSettings().setSupportZoom(false);
        this.f38088b.getSettings().setBuiltInZoomControls(false);
        this.f38088b.getSettings().setJavaScriptEnabled(true);
        this.f38088b.getSettings().setDefaultTextEncodingName("UTF-8");
        this.f38088b.getSettings().setCacheMode(-1);
        this.f38088b.setWebViewClient(new c(this));
        try {
            if (Build.VERSION.SDK_INT > 27) {
                this.f38088b.getSettings().setSafeBrowsingEnabled(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f38088b.setWebChromeClient(new a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                NestedWebView nestedWebView = this.f38088b;
                if (nestedWebView != null) {
                    nestedWebView.restoreState(bundle);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        NestedWebView nestedWebView = this.f38088b;
        if (nestedWebView != null) {
            try {
                nestedWebView.getClass().getMethod("onPause", new Class[0]).invoke(this.f38088b, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        NestedWebView nestedWebView = this.f38088b;
        if (nestedWebView != null) {
            try {
                nestedWebView.getClass().getMethod("onResume", new Class[0]).invoke(this.f38088b, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
    }
}
