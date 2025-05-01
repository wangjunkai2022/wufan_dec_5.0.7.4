package com.join.mgps.wrapper.SystemUiHider;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.lang.reflect.Method;
/* compiled from: TabbedHelpViewFactory.java */
/* loaded from: classes5.dex */
public abstract class d {

    /* compiled from: TabbedHelpViewFactory.java */
    /* loaded from: classes5.dex */
    private static class a extends TabHost {

        /* renamed from: b  reason: collision with root package name */
        private final WebView f55002b;

        /* compiled from: TabbedHelpViewFactory.java */
        /* renamed from: com.join.mgps.wrapper.SystemUiHider.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0390a extends WebChromeClient {
            C0390a() {
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
                callback.invoke(str, true, false);
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i4) {
            }
        }

        /* compiled from: TabbedHelpViewFactory.java */
        /* loaded from: classes5.dex */
        class b extends WebViewClient {
            b() {
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
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    webView.loadUrl(str);
                    return true;
                }
                return false;
            }
        }

        /* compiled from: TabbedHelpViewFactory.java */
        /* loaded from: classes5.dex */
        class c implements TabHost.TabContentFactory {
            c() {
            }

            @Override // android.widget.TabHost.TabContentFactory
            public View createTabContent(String str) {
                return a.this.f55002b;
            }
        }

        /* compiled from: TabbedHelpViewFactory.java */
        /* renamed from: com.join.mgps.wrapper.SystemUiHider.d$a$d  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0391d implements TabHost.OnTabChangeListener {
            C0391d() {
            }

            @Override // android.widget.TabHost.OnTabChangeListener
            public void onTabChanged(String str) {
                a.this.f55002b.loadUrl(str);
            }
        }

        public a(Context context, String[][] strArr) {
            super(context);
            WebView webView = new WebView(context);
            this.f55002b = webView;
            webView.getSettings().setNeedInitialFocus(false);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setBuiltInZoomControls(false);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                settings.setMixedContentMode(0);
            }
            if (i4 >= 19) {
                try {
                    Method method = Class.forName("android.webkit.WebView").getMethod("setWebContentsDebuggingEnabled", Boolean.TYPE);
                    if (method != null) {
                        method.setAccessible(true);
                        method.invoke(null, Boolean.TRUE);
                    }
                } catch (Exception unused) {
                }
            }
            this.f55002b.setFocusable(true);
            this.f55002b.setDrawingCacheEnabled(true);
            this.f55002b.setScrollBarStyle(0);
            this.f55002b.setWebChromeClient(new C0390a());
            this.f55002b.setWebViewClient(new b());
            TabHost.TabContentFactory cVar = new c();
            TabHost.OnTabChangeListener c0391d = new C0391d();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
            addView(linearLayout);
            setOnTabChangedListener(c0391d);
            setup();
            for (String[] strArr2 : strArr) {
                addTab(newTabSpec(strArr2[0]).setIndicator(strArr2[1]).setContent(cVar));
            }
        }
    }

    /* compiled from: TabbedHelpViewFactory.java */
    @TargetApi(11)
    /* loaded from: classes5.dex */
    private static class b extends WebView {

        /* renamed from: b  reason: collision with root package name */
        private ActionBar f55007b;

        /* compiled from: TabbedHelpViewFactory.java */
        /* loaded from: classes5.dex */
        class a implements ActionBar.TabListener {
            a() {
            }

            @Override // android.app.ActionBar.TabListener
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            }

            @Override // android.app.ActionBar.TabListener
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                b.this.loadUrl((String) tab.getTag());
            }

            @Override // android.app.ActionBar.TabListener
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            }
        }

        public b(Activity activity, String[][] strArr) {
            super(activity);
            getSettings().setNeedInitialFocus(false);
            new a();
        }
    }

    public static View a(Activity activity, String[][] strArr) {
        if (com.join.mgps.wrapper.a.f55010b < 11) {
            return new a(activity, strArr);
        }
        return new b(activity, strArr);
    }
}
