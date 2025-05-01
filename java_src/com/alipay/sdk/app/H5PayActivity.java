package com.alipay.sdk.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.util.j;
/* loaded from: classes2.dex */
public class H5PayActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private WebView f4687b;

    /* renamed from: c  reason: collision with root package name */
    private WebViewClient f4688c;

    public void a() {
        Object obj = PayTask.f4689g;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f4687b.canGoBack()) {
            if (((b) this.f4688c).b()) {
                i a5 = i.a(i.NETWORK_ERROR.a());
                h.f4713a = h.b(a5.a(), a5.b(), "");
                finish();
                return;
            }
            return;
        }
        h.f4713a = h.a();
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
            String string = extras.getString("url");
            if (!j.m(string)) {
                finish();
                return;
            }
            String string2 = extras.getString("cookie");
            super.requestWindowFeature(1);
            this.f4687b = j.b(this, string, string2);
            b bVar = new b(this);
            this.f4688c = bVar;
            this.f4687b.setWebViewClient(bVar);
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.f4687b;
        if (webView != null) {
            webView.removeAllViews();
            try {
                this.f4687b.destroy();
            } catch (Throwable unused) {
            }
            this.f4687b = null;
        }
    }
}
