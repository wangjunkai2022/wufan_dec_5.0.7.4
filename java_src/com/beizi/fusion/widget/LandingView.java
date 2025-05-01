package com.beizi.fusion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.beizi.fusion.b.b;
import com.beizi.fusion.b.c;
import com.beizi.fusion.g.ab;
import com.beizi.fusion.g.au;
import com.beizi.fusion.g.h;
import com.beizi.fusion.model.TaskBean;
import java.util.List;
/* loaded from: classes2.dex */
public class LandingView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private static String f7216a = "LandingView";

    /* renamed from: b  reason: collision with root package name */
    private TaskBean.BackTaskArrayBean f7217b;

    /* renamed from: c  reason: collision with root package name */
    private int f7218c;

    /* renamed from: d  reason: collision with root package name */
    private Context f7219d;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: e  reason: collision with root package name */
    private Handler f7220e;

    public LandingView(Context context) {
        this(context, null);
    }

    public void init() {
        WebSettings settings = getSettings();
        settings.setSavePassword(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 11 && i4 < 19) {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        if (i4 >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setAllowFileAccess(false);
        if (i4 >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        setWebChromeClient(new WebChromeClient() { // from class: com.beizi.fusion.widget.LandingView.2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i5) {
            }
        });
        setWebViewClient(new WebViewClient() { // from class: com.beizi.fusion.widget.LandingView.3
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                h.b().e().execute(new Runnable() { // from class: com.beizi.fusion.widget.LandingView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        List<String> report;
                        if (LandingView.this.f7217b == null || (report = LandingView.this.f7217b.getReport()) == null || report.size() <= 0) {
                            return;
                        }
                        for (int i5 = 0; i5 < report.size(); i5++) {
                            if (!TextUtils.isEmpty(report.get(i5))) {
                                if (ab.a(au.a(LandingView.this.f7219d, report.get(i5), null), LandingView.this.f7217b.getUserAgent()) != null) {
                                    c.a(LandingView.this.f7219d).b(new b(com.beizi.fusion.d.b.f6675b, "", "520.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                                } else {
                                    c.a(LandingView.this.f7219d).b(new b(com.beizi.fusion.d.b.f6675b, "", "520.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                                }
                                try {
                                    Thread.sleep(LandingView.this.f7217b.getSleepTime());
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                });
                LandingView.this.f7220e.sendEmptyMessageDelayed(1, LandingView.this.f7217b.getShowTime());
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                LandingView.this.a();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                LandingView.this.a();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                LandingView.this.a();
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
    }

    public void load() {
        TaskBean.BackTaskArrayBean backTaskArrayBean = this.f7217b;
        if (backTaskArrayBean == null || TextUtils.isEmpty(backTaskArrayBean.getContentUrl())) {
            return;
        }
        loadUrl(this.f7217b.getContentUrl());
        this.f7218c--;
    }

    public LandingView(Context context, TaskBean.BackTaskArrayBean backTaskArrayBean) {
        this(context, null, 0);
        this.f7219d = context;
        this.f7217b = backTaskArrayBean;
        this.f7218c = backTaskArrayBean.getRepeatCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c.a(this.f7219d).a(new b(com.beizi.fusion.d.b.f6675b, "", "510.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            c.a(this.f7219d).a(new b(com.beizi.fusion.d.b.f6675b, "", "510.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
            clearCache(true);
            clearHistory();
            clearFormData();
            destroy();
            Handler handler = this.f7220e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public LandingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7218c = 1;
        this.f7220e = new Handler() { // from class: com.beizi.fusion.widget.LandingView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 1) {
                    return;
                }
                if (LandingView.this.f7218c <= 0) {
                    LandingView.this.b();
                } else {
                    LandingView.this.load();
                }
            }
        };
        try {
            init();
        } catch (Exception e5) {
            e5.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
