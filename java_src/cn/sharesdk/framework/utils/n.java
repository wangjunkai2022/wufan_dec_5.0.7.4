package cn.sharesdk.framework.utils;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
/* compiled from: WebViewUtils.java */
/* loaded from: classes2.dex */
public class n {
    public static void a(WebView webView, boolean z4) {
        if (webView == null) {
            return;
        }
        try {
            webView.getSettings().setAllowFileAccess(z4);
            webView.getSettings().setSavePassword(z4);
            if (Build.VERSION.SDK_INT >= 16) {
                webView.getSettings().setAllowFileAccessFromFileURLs(z4);
                webView.getSettings().setAllowUniversalAccessFromFileURLs(z4);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(WebSettings webSettings, boolean z4) {
        if (webSettings == null) {
            return;
        }
        try {
            String a5 = i.a("opxLWrBMJweIF1SCwqo+hR2cd4CvxbDxONkTFgKvZMc=");
            if (!TextUtils.isEmpty(a5)) {
                webSettings.getClass().getMethod(a5, Boolean.TYPE).invoke(webSettings, Boolean.valueOf(z4));
            }
            SSDKLog.b().b("wvs");
        } catch (Throwable th) {
            SSDKLog.b().c(th);
        }
    }
}
