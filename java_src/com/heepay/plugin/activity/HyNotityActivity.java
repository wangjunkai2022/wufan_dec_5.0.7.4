package com.heepay.plugin.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.alipay.sdk.cons.b;
import com.facebook.common.util.f;
import com.heepay.plugin.activity.logic.LogicHyNotityActivity;
import com.heepay.plugin.b.a;
import com.heepay.plugin.c.c;
import com.heepay.plugin.domain.e;
import com.join.mgps.dto.Constant;
import com.tencent.stat.DeviceInfo;
import java.util.Timer;
/* loaded from: classes3.dex */
public class HyNotityActivity extends LogicHyNotityActivity {
    protected void a() {
        this.f14355v = new LogicHyNotityActivity.a(this);
        this.f14344e = a.c();
        Bundle extras = getIntent().getExtras();
        this.f14340a = extras.getString(b.f4830c);
        this.f14341b = extras.getInt(DeviceInfo.TAG_ANDROID_ID);
        this.f14342c = extras.getString("bn");
        this.f14345f = extras.getString(Constant.PAY_TYPE);
        i();
        if (this.f14340a.startsWith(f.f10923a)) {
            WebView webView = this.f14354u;
            webView.loadUrl(this.f14340a + "&phoneInfo=" + e.a().c(this));
        }
        if (a(this.f14340a, this.f14341b, this.f14342c, this.f14345f)) {
            return;
        }
        if (this.f14340a.indexOf("_") != -1) {
            String str = this.f14340a;
            this.f14343d = str.substring(0, str.lastIndexOf("_"));
        }
        j();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.a("-----------onCreate------------");
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        c.a("-----------onDestroy------------");
        super.onDestroy();
        h();
        WebView webView = this.f14354u;
        if (webView != null) {
            webView.stopLoading();
            ((ViewGroup) this.f14354u.getParent()).removeView(this.f14354u);
            this.f14354u.removeAllViews();
            this.f14354u.setWebChromeClient(null);
            this.f14354u.setWebViewClient(null);
            this.f14354u.getSettings().setJavaScriptEnabled(false);
            unregisterForContextMenu(this.f14354u);
            this.f14354u.destroy();
            this.f14354u = null;
            this.f14354u = null;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Timer timer = this.f14352m;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        c.a("-----------onResume------------" + this.f14348i);
        int i4 = this.f14348i + 1;
        this.f14348i = i4;
        if (i4 < 2) {
            return;
        }
        c.a("--------isNeedQuery------" + this.f14349j);
        if (this.f14349j) {
            WebView webView = this.f14354u;
            if (webView != null && webView.getVisibility() == 0) {
                this.f14354u.setVisibility(8);
                c.a("--------isNeedQuery------" + this.f14349j);
            }
            b();
        } else if (this.f14351l) {
            WebView webView2 = this.f14354u;
            if (webView2 == null || webView2.getVisibility() != 0) {
                return;
            }
            this.f14354u.setVisibility(8);
        } else if (this.f14340a.startsWith(f.f10923a) || this.f14354u.getVisibility() != 0) {
        } else {
            this.f14354u.setVisibility(8);
            a("isLoaded");
        }
    }
}
