package com.beizi.ad.internal.download;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
/* loaded from: classes2.dex */
public class BeiZiWebView extends WebView {
    public BeiZiWebView(Context context) {
        super(context);
        a();
    }

    private void a() {
        try {
            b();
        } catch (Throwable unused) {
        }
    }

    private void b() {
        CookieManager cookieManager;
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setBuiltInZoomControls(false);
        settings.setEnableSmoothTransition(true);
        settings.setLightTouchEnabled(false);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setLoadsImagesAutomatically(true);
        settings.setSavePassword(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i4 >= 21) {
            settings.setMixedContentMode(0);
        }
        if (i4 >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        if (i4 >= 11 && i4 < 19) {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (i4 >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (i4 >= 21 && (cookieManager = CookieManager.getInstance()) != null) {
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setHorizontalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setScrollBarStyle(0);
    }

    public BeiZiWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BeiZiWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a();
    }
}
