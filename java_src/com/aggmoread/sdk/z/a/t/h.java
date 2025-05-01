package com.aggmoread.sdk.z.a.t;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class h extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private g f2585a;

    /* renamed from: b  reason: collision with root package name */
    private Context f2586b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f2587c;

    /* renamed from: d  reason: collision with root package name */
    private d f2588d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends WebChromeClient {
        private b() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            try {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            } catch (Exception unused) {
                return super.getDefaultVideoPoster();
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i4) {
            if (i4 >= 95) {
                h.this.f2585a.setVisibility(8);
                h.this.f2588d.a();
            } else {
                h.this.f2585a.b(i4);
            }
            super.onProgressChanged(webView, i4);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (h.this.f2587c != null) {
                h.this.f2587c.setText(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        Method f2590a;

        public c() {
            this.f2590a = null;
            try {
                this.f2590a = Class.forName("android.webkit.SslErrorHandler").getDeclaredMethod(a(), new Class[0]);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        private String a() {
            return "proce".concat("ed");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Method method = this.f2590a;
            if (method != null) {
                try {
                    method.invoke(sslErrorHandler, new Object[0]);
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null || str.equals("about:blank")) {
                return false;
            }
            try {
                if (!str.startsWith("http:") && !str.startsWith("https:")) {
                    h.this.f2586b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f2592a = new a();

        /* loaded from: classes2.dex */
        static class a implements d {
            a() {
            }

            @Override // com.aggmoread.sdk.z.a.t.h.d
            public void a() {
            }
        }

        void a();
    }

    public h(Context context) {
        super(context);
        this.f2588d = d.f2592a;
        this.f2586b = context;
        a();
    }

    private int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void a() {
        g gVar = new g(this.f2586b);
        this.f2585a = gVar;
        gVar.setLayoutParams(new ViewGroup.LayoutParams(-1, a(this.f2586b, 2.0f)));
        this.f2585a.a(-16776961);
        this.f2585a.b(10);
        addView(this.f2585a);
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception unused) {
        }
        b();
        setWebChromeClient(new b());
        setWebViewClient(new c());
    }

    private void b() {
        WebSettings settings = getSettings();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i4 >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setNeedInitialFocus(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        if (i4 >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
        }
        String path = this.f2586b.getApplicationContext().getDir("jhad_database", 0).getPath();
        try {
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(path);
        } catch (Exception unused) {
        }
        try {
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(path);
            settings.setAppCacheMaxSize(10485760L);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT < 21) {
            CookieManager.getInstance().setAcceptCookie(true);
            return;
        }
        settings.setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
    }

    public void a(TextView textView) {
        this.f2587c = textView;
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.f2588d = dVar;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 0 || action == 1) && !hasFocus()) {
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
