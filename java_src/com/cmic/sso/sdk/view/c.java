package com.cmic.sso.sdk.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.cmic.sso.sdk.auth.AuthnHelper;
/* compiled from: ServerClauseDialog.java */
/* loaded from: classes2.dex */
public class c extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private WebView f9451a;

    /* renamed from: b  reason: collision with root package name */
    private String f9452b;

    /* renamed from: c  reason: collision with root package name */
    private String f9453c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f9454d;

    public c(Context context, int i4, String str, String str2) {
        super(context, i4);
        try {
            this.f9453c = str;
            this.f9452b = str2;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private ViewGroup c() {
        View findViewById;
        try {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f9454d = linearLayout;
            linearLayout.setOrientation(1);
            this.f9454d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            AuthThemeConfig authThemeConfig = AuthnHelper.getInstance(getContext()).getAuthThemeConfig();
            int clauseLayoutResID = authThemeConfig.getClauseLayoutResID();
            String str = TextUtils.isEmpty(this.f9453c) ? com.cmic.sso.sdk.c.f9191d[authThemeConfig.getAppLanguageType()] : this.f9453c;
            if (clauseLayoutResID != -1) {
                RelativeLayout a5 = d.a(getContext(), getLayoutInflater().inflate(clauseLayoutResID, (ViewGroup) this.f9454d, false), 1118481, 0, str, (View.OnClickListener) null);
                String clauseLayoutReturnID = authThemeConfig.getClauseLayoutReturnID();
                if (!TextUtils.isEmpty(clauseLayoutReturnID) && (findViewById = a5.findViewById(b.a(getContext(), clauseLayoutReturnID))) != null) {
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.cmic.sso.sdk.view.c.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            c.this.f9451a.stopLoading();
                            c.this.b();
                        }
                    });
                }
                this.f9454d.addView(a5);
            } else {
                this.f9454d.addView(d.a(getContext(), (View) null, 1118481, 2236962, str, new View.OnClickListener() { // from class: com.cmic.sso.sdk.view.c.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        c.this.f9451a.stopLoading();
                        c.this.b();
                    }
                }));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return this.f9454d;
    }

    private void d() {
        WebView webView = new WebView(getContext());
        this.f9451a = webView;
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setSavePassword(false);
        settings.setJavaScriptEnabled(true);
        this.f9454d.addView(this.f9451a, new LinearLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT < 17) {
            this.f9451a.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f9451a.removeJavascriptInterface("accessibility");
            this.f9451a.removeJavascriptInterface("accessibilityTraversal");
        }
        this.f9451a.setWebViewClient(new WebViewClient() { // from class: com.cmic.sso.sdk.view.c.3
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                c.this.f9451a.loadUrl(str);
                return true;
            }
        });
        this.f9451a.loadUrl(this.f9452b);
    }

    public void b() {
        if (this.f9451a.canGoBack()) {
            this.f9451a.goBack();
        } else {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        WebView webView = this.f9451a;
        if (webView != null) {
            webView.stopLoading();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.f9454d == null) {
            a();
        }
        if (this.f9451a == null) {
            d();
        }
        super.show();
    }

    protected void a() {
        requestWindowFeature(1);
        getWindow().setFeatureDrawableAlpha(0, 0);
        AuthThemeConfig authThemeConfig = AuthnHelper.getInstance(getContext()).getAuthThemeConfig();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21 && authThemeConfig.getStatusBarColor() != 0) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(TTAdConstant.KEY_CLICK_AREA);
            getWindow().setStatusBarColor(authThemeConfig.getStatusBarColor());
            getWindow().setNavigationBarColor(authThemeConfig.getStatusBarColor());
        }
        if (i4 >= 23) {
            if (authThemeConfig.isLightColor()) {
                getWindow().getDecorView().setSystemUiVisibility(8192);
            } else {
                getWindow().getDecorView().setSystemUiVisibility(0);
            }
        }
        setContentView(c());
    }
}
