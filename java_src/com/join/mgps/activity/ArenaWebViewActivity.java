package com.join.mgps.activity;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJWebView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.arena_web)
/* loaded from: classes4.dex */
public class ArenaWebViewActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LJWebView f28470b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    String f28471c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends WebViewClient {
        private b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.getSettings().setBlockNetworkImage(false);
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
        g0(this.f28471c);
    }

    void g0(String str) {
        this.f28470b.setClickable(true);
        this.f28470b.setUseWideViewPort(true);
        this.f28470b.setSupportZoom(false);
        this.f28470b.setBuiltInZoomControls(false);
        this.f28470b.setJavaScriptEnabled(true);
        this.f28470b.setCacheMode(2);
        this.f28470b.w(str);
        this.f28470b.setVisibility(0);
        this.f28470b.setWebViewClient(new b());
    }
}
