package com.join.mgps.fragment;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJWebView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_search_web)
/* loaded from: classes3.dex */
public class SearchWebFragment extends BaseFragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LJWebView f52927b;
    @FragmentArg

    /* renamed from: c  reason: collision with root package name */
    String f52928c;

    /* loaded from: classes3.dex */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 3 || primaryError == 5) {
                sslErrorHandler.proceed();
            }
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        LJWebView lJWebView = this.f52927b;
        if (lJWebView != null) {
            lJWebView.setVisibility(0);
            this.f52927b.setBarHeight(getResources().getDimensionPixelOffset(R.dimen.web_loding_progress_h));
            this.f52927b.setClickable(true);
            this.f52927b.setUseWideViewPort(true);
            this.f52927b.setSupportZoom(false);
            this.f52927b.setBuiltInZoomControls(false);
            this.f52927b.setJavaScriptEnabled(true);
            this.f52927b.setCacheMode(-1);
            this.f52927b.setWebViewClient(new a());
            this.f52927b.w(this.f52928c);
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }
}
