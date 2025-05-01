package com.alipay.sdk.auth;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.alipay.sdk.authjs.a;
import com.alipay.sdk.util.j;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"SetJavaScriptEnabled", "DefaultLocale"})
/* loaded from: classes2.dex */
public class AuthActivity extends Activity {

    /* renamed from: i  reason: collision with root package name */
    static final String f4754i = "params";

    /* renamed from: j  reason: collision with root package name */
    static final String f4755j = "redirectUri";

    /* renamed from: b  reason: collision with root package name */
    private WebView f4756b;

    /* renamed from: c  reason: collision with root package name */
    private String f4757c;

    /* renamed from: d  reason: collision with root package name */
    private com.alipay.sdk.widget.a f4758d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f4759e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4760f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4761g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f4762h = new f(this);

    /* loaded from: classes2.dex */
    private class a extends WebChromeClient {
        private a() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message)) {
                return super.onConsoleMessage(consoleMessage);
            }
            String replaceFirst = message.startsWith("h5container.message: ") ? message.replaceFirst("h5container.message: ", "") : null;
            if (TextUtils.isEmpty(replaceFirst)) {
                return super.onConsoleMessage(consoleMessage);
            }
            AuthActivity.i(AuthActivity.this, replaceFirst);
            return super.onConsoleMessage(consoleMessage);
        }

        /* synthetic */ a(AuthActivity authActivity, byte b5) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends WebViewClient {
        private b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            AuthActivity.p(AuthActivity.this);
            AuthActivity.this.f4759e.removeCallbacks(AuthActivity.this.f4762h);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AuthActivity.m(AuthActivity.this);
            AuthActivity.this.f4759e.postDelayed(AuthActivity.this.f4762h, 30000L);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i4, String str, String str2) {
            AuthActivity.d(AuthActivity.this);
            super.onReceivedError(webView, i4, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (AuthActivity.this.f4760f) {
                sslErrorHandler.proceed();
                AuthActivity.this.f4760f = false;
                return;
            }
            AuthActivity.this.runOnUiThread(new g(this, sslErrorHandler));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.toLowerCase().startsWith(com.alipay.sdk.cons.a.f4820i.toLowerCase()) && !str.toLowerCase().startsWith(com.alipay.sdk.cons.a.f4821j.toLowerCase())) {
                if (AuthActivity.e(AuthActivity.this, str)) {
                    webView.stopLoading();
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                j.a c5 = com.alipay.sdk.util.j.c(AuthActivity.this, com.alipay.sdk.util.j.f4963b);
                if (c5 != null) {
                    String f5 = com.alipay.sdk.util.j.f(c5.f4965a);
                    if (f5 != null && !TextUtils.equals(f5, com.alipay.sdk.cons.a.f4819h)) {
                        com.alipay.sdk.app.statistic.a.c(com.alipay.sdk.app.statistic.c.f4729l, com.alipay.sdk.app.statistic.c.f4736s, f5);
                        return true;
                    }
                    if (str.startsWith("intent://platformapi/startapp")) {
                        str = str.replaceFirst(com.alipay.sdk.cons.a.f4821j, com.alipay.sdk.cons.a.f4820i);
                    }
                    AuthActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Throwable unused) {
            }
            return true;
        }

        /* synthetic */ b(AuthActivity authActivity, byte b5) {
            this();
        }
    }

    private void a() {
        try {
            if (this.f4758d == null) {
                this.f4758d = new com.alipay.sdk.widget.a(this, com.alipay.sdk.widget.a.f4969d);
            }
            this.f4758d.c();
        } catch (Exception unused) {
            this.f4758d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(AuthActivity authActivity, com.alipay.sdk.authjs.a aVar) {
        if (authActivity.f4756b != null && aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.alipay.sdk.authjs.a.f4789k, aVar.f4793a);
                jSONObject.put(com.alipay.sdk.authjs.a.f4791m, aVar.f4795c);
                jSONObject.put(com.alipay.sdk.authjs.a.f4790l, aVar.f4797e);
                jSONObject.put(com.alipay.sdk.authjs.a.f4792n, aVar.f4796d);
                authActivity.runOnUiThread(new e(authActivity, String.format("AlipayJSBridge._invokeJS(%s)", jSONObject.toString())));
            } catch (JSONException unused) {
            }
        }
    }

    private void c(com.alipay.sdk.authjs.a aVar) {
        if (this.f4756b != null && aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.alipay.sdk.authjs.a.f4789k, aVar.f4793a);
                jSONObject.put(com.alipay.sdk.authjs.a.f4791m, aVar.f4795c);
                jSONObject.put(com.alipay.sdk.authjs.a.f4790l, aVar.f4797e);
                jSONObject.put(com.alipay.sdk.authjs.a.f4792n, aVar.f4796d);
                runOnUiThread(new e(this, String.format("AlipayJSBridge._invokeJS(%s)", jSONObject.toString())));
            } catch (JSONException unused) {
            }
        }
    }

    static /* synthetic */ boolean d(AuthActivity authActivity) {
        authActivity.f4761g = true;
        return true;
    }

    static /* synthetic */ boolean e(AuthActivity authActivity, String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http://") || str.startsWith("https://")) {
            return false;
        }
        if (!"SDKLite://h5quit".equalsIgnoreCase(str)) {
            if (TextUtils.equals(str, authActivity.f4757c)) {
                str = str + "?resultCode=150";
            }
            j.d(authActivity, str);
        }
        authActivity.finish();
        return true;
    }

    private boolean g(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http://") || str.startsWith("https://")) {
            return false;
        }
        if (!"SDKLite://h5quit".equalsIgnoreCase(str)) {
            if (TextUtils.equals(str, this.f4757c)) {
                str = str + "?resultCode=150";
            }
            j.d(this, str);
        }
        finish();
        return true;
    }

    private void h() {
        com.alipay.sdk.widget.a aVar = this.f4758d;
        if (aVar != null) {
            aVar.f();
        }
        this.f4758d = null;
    }

    static /* synthetic */ void i(AuthActivity authActivity, String str) {
        JSONObject jSONObject;
        String string;
        com.alipay.sdk.authjs.d dVar = new com.alipay.sdk.authjs.d(authActivity.getApplicationContext(), new d(authActivity));
        String str2 = null;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString(com.alipay.sdk.authjs.a.f4789k);
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(com.alipay.sdk.authjs.a.f4790l);
            JSONObject jSONObject3 = jSONObject2 instanceof JSONObject ? jSONObject2 : null;
            String string2 = jSONObject.getString(com.alipay.sdk.authjs.a.f4791m);
            String string3 = jSONObject.getString(com.alipay.sdk.authjs.a.f4788j);
            com.alipay.sdk.authjs.a aVar = new com.alipay.sdk.authjs.a("call");
            aVar.f4794b = string3;
            aVar.f4795c = string2;
            aVar.f4797e = jSONObject3;
            aVar.f4793a = string;
            dVar.c(aVar);
        } catch (Exception unused2) {
            str2 = string;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            try {
                dVar.g(str2, a.EnumC0158a.RUNTIME_ERROR);
            } catch (JSONException unused3) {
            }
        }
    }

    private void j(String str) {
        JSONObject jSONObject;
        String string;
        com.alipay.sdk.authjs.d dVar = new com.alipay.sdk.authjs.d(getApplicationContext(), new d(this));
        String str2 = null;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString(com.alipay.sdk.authjs.a.f4789k);
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(com.alipay.sdk.authjs.a.f4790l);
            JSONObject jSONObject3 = jSONObject2 instanceof JSONObject ? jSONObject2 : null;
            String string2 = jSONObject.getString(com.alipay.sdk.authjs.a.f4791m);
            String string3 = jSONObject.getString(com.alipay.sdk.authjs.a.f4788j);
            com.alipay.sdk.authjs.a aVar = new com.alipay.sdk.authjs.a("call");
            aVar.f4794b = string3;
            aVar.f4795c = string2;
            aVar.f4797e = jSONObject3;
            aVar.f4793a = string;
            dVar.c(aVar);
        } catch (Exception unused2) {
            str2 = string;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            try {
                dVar.g(str2, a.EnumC0158a.RUNTIME_ERROR);
            } catch (JSONException unused3) {
            }
        }
    }

    static /* synthetic */ void m(AuthActivity authActivity) {
        try {
            if (authActivity.f4758d == null) {
                authActivity.f4758d = new com.alipay.sdk.widget.a(authActivity, com.alipay.sdk.widget.a.f4969d);
            }
            authActivity.f4758d.c();
        } catch (Exception unused) {
            authActivity.f4758d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p(AuthActivity authActivity) {
        com.alipay.sdk.widget.a aVar = authActivity.f4758d;
        if (aVar != null) {
            aVar.f();
        }
        authActivity.f4758d = null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f4756b.canGoBack()) {
            if (this.f4761g) {
                j.d(this, this.f4757c + "?resultCode=150");
                finish();
                return;
            }
            return;
        }
        j.d(this, this.f4757c + "?resultCode=150");
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            try {
                this.f4757c = extras.getString(f4755j);
                String string = extras.getString("params");
                if (!com.alipay.sdk.util.j.m(string)) {
                    finish();
                    return;
                }
                super.requestWindowFeature(1);
                this.f4759e = new Handler(getMainLooper());
                LinearLayout linearLayout = new LinearLayout(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                linearLayout.setOrientation(1);
                setContentView(linearLayout, layoutParams);
                WebView webView = new WebView(this);
                this.f4756b = webView;
                layoutParams.weight = 1.0f;
                webView.setVisibility(0);
                linearLayout.addView(this.f4756b, layoutParams);
                WebSettings settings = this.f4756b.getSettings();
                settings.setUserAgentString(settings.getUserAgentString() + com.alipay.sdk.util.j.o(getApplicationContext()));
                settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
                settings.setSupportMultipleWindows(true);
                settings.setJavaScriptEnabled(true);
                settings.setSavePassword(false);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setMinimumFontSize(settings.getMinimumFontSize() + 8);
                settings.setAllowFileAccess(false);
                settings.setTextSize(WebSettings.TextSize.NORMAL);
                this.f4756b.setVerticalScrollbarOverlay(true);
                this.f4756b.setWebViewClient(new b(this, (byte) 0));
                this.f4756b.setWebChromeClient(new a(this, (byte) 0));
                this.f4756b.setDownloadListener(new c(this));
                this.f4756b.loadUrl(string);
                if (Build.VERSION.SDK_INT >= 7) {
                    try {
                        Method method = this.f4756b.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
                        if (method != null) {
                            method.invoke(this.f4756b.getSettings(), Boolean.TRUE);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    try {
                        this.f4756b.removeJavascriptInterface("searchBoxJavaBridge_");
                        this.f4756b.removeJavascriptInterface("accessibility");
                        this.f4756b.removeJavascriptInterface("accessibilityTraversal");
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    Method method2 = this.f4756b.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                    if (method2 != null) {
                        method2.invoke(this.f4756b, "searchBoxJavaBridge_");
                        method2.invoke(this.f4756b, "accessibility");
                        method2.invoke(this.f4756b, "accessibilityTraversal");
                    }
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    this.f4756b.getSettings().setCacheMode(1);
                }
            } catch (Exception unused4) {
                finish();
            }
        } catch (Exception unused5) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.f4756b;
        if (webView != null) {
            webView.removeAllViews();
            try {
                this.f4756b.destroy();
            } catch (Throwable unused) {
            }
            this.f4756b = null;
        }
    }
}
