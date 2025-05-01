package com.join.mgps.customview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import java.io.File;
import java.util.HashMap;
/* loaded from: classes4.dex */
public class LJWebView extends RelativeLayout {

    /* renamed from: q  reason: collision with root package name */
    public static int f47262q = 1;

    /* renamed from: r  reason: collision with root package name */
    public static int f47263r = 2;

    /* renamed from: s  reason: collision with root package name */
    public static final int f47264s = 43234;

    /* renamed from: b  reason: collision with root package name */
    private Context f47265b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f47266c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f47267d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f47268e;

    /* renamed from: f  reason: collision with root package name */
    private int f47269f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47270g;

    /* renamed from: h  reason: collision with root package name */
    private int f47271h;

    /* renamed from: i  reason: collision with root package name */
    private String f47272i;

    /* renamed from: j  reason: collision with root package name */
    private View f47273j;

    /* renamed from: k  reason: collision with root package name */
    private View f47274k;

    /* renamed from: l  reason: collision with root package name */
    private b f47275l;

    /* renamed from: m  reason: collision with root package name */
    Activity f47276m;

    /* renamed from: n  reason: collision with root package name */
    ValueCallback<Uri> f47277n;

    /* renamed from: o  reason: collision with root package name */
    ValueCallback<Uri[]> f47278o;

    /* renamed from: p  reason: collision with root package name */
    private c f47279p;

    /* loaded from: classes4.dex */
    public interface b {
        void noMethod();

        void onHideCustomView();

        void onReceivedTitle(String str);

        void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback, WebChromeClient webChromeClient);

        void showMainWebview();
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a();
    }

    public LJWebView(Context context) {
        super(context);
        this.f47266c = null;
        this.f47267d = null;
        this.f47268e = null;
        this.f47269f = 4;
        this.f47270g = false;
        this.f47271h = f47263r;
        this.f47274k = null;
        this.f47265b = context;
        t();
    }

    private void t() {
        WebView webView = new WebView(this.f47265b);
        this.f47266c = webView;
        addView(webView, -1, -1);
        this.f47266c.setBackgroundColor(0);
        u();
        this.f47266c.setWebChromeClient(new a());
    }

    @TargetApi(21)
    private void x(int i4, int i5, Intent intent) {
        Uri[] uriArr;
        if (i4 != 43234 || this.f47278o == null) {
            return;
        }
        if (i5 != -1 || intent == null) {
            uriArr = null;
        } else {
            String dataString = intent.getDataString();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                uriArr = new Uri[clipData.getItemCount()];
                for (int i6 = 0; i6 < clipData.getItemCount(); i6++) {
                    uriArr[i6] = clipData.getItemAt(i6).getUri();
                }
            } else {
                uriArr = null;
            }
            if (dataString != null) {
                uriArr = new Uri[]{Uri.parse(dataString)};
            }
        }
        this.f47278o.onReceiveValue(uriArr);
        this.f47278o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        this.f47276m.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 43234);
    }

    public WebView getWebView() {
        return this.f47266c;
    }

    public void q(int i4, int i5, Intent intent) {
        if (i4 == 43234) {
            if (this.f47277n == null && this.f47278o == null) {
                return;
            }
            Uri data = (intent == null || i5 != -1) ? null : intent.getData();
            if (this.f47278o != null) {
                x(i4, i5, intent);
                return;
            }
            ValueCallback<Uri> valueCallback = this.f47277n;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data);
                this.f47277n = null;
                return;
            }
            return;
        }
        ValueCallback<Uri> valueCallback2 = this.f47277n;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
            this.f47277n = null;
            return;
        }
        ValueCallback<Uri[]> valueCallback3 = this.f47278o;
        if (valueCallback3 != null) {
            valueCallback3.onReceiveValue(null);
            this.f47278o = null;
        }
    }

    public void r(Object obj) {
        this.f47266c.addJavascriptInterface(obj, "papa");
    }

    public void s(Object obj) {
        this.f47266c.addJavascriptInterface(obj, "wufan");
    }

    public void setActivity(Activity activity) {
        this.f47276m = activity;
    }

    public void setBarHeight(int i4) {
        this.f47269f = i4;
    }

    public void setBuiltInZoomControls(boolean z4) {
        this.f47266c.getSettings().setBuiltInZoomControls(z4);
    }

    public void setCacheMode(int i4) {
        this.f47266c.getSettings().setCacheMode(i4);
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        this.f47266c.setClickable(z4);
    }

    public void setJavaScriptEnabled(boolean z4) {
        this.f47266c.getSettings().setJavaScriptEnabled(z4);
    }

    public void setMethodListenter(b bVar) {
        this.f47275l = bVar;
    }

    public void setProgressStyle(int i4) {
        this.f47271h = i4;
    }

    public void setSupportZoom(boolean z4) {
        this.f47266c.getSettings().setSupportZoom(z4);
    }

    public void setUseWideViewPort(boolean z4) {
        this.f47266c.getSettings().setUseWideViewPort(z4);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.f47266c.setWebViewClient(webViewClient);
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                this.f47266c.removeJavascriptInterface("searchBoxJavaBredge_");
            } catch (Exception unused) {
            }
        }
    }

    public void setonShowFileChooser(c cVar) {
        this.f47279p = cVar;
    }

    public void u() {
        this.f47266c.getSettings().setDomStorageEnabled(true);
        this.f47266c.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f47266c.getSettings().setAppCacheEnabled(true);
        this.f47272i = this.f47265b.getApplicationContext().getDir("cacheH5", 0).getPath();
        this.f47266c.getSettings().setAppCachePath(this.f47272i);
        this.f47266c.getSettings().setAllowFileAccess(true);
        this.f47266c.getSettings().setCacheMode(-1);
        this.f47266c.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f47266c.getSettings().setLoadWithOverviewMode(true);
        this.f47266c.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.f47266c.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f47266c.getSettings().setTextZoom(100);
        UtilsMy.C3(this.f47266c);
        this.f47266c.getSettings().setMediaPlaybackRequiresUserGesture(false);
        try {
            if (Build.VERSION.SDK_INT > 27) {
                this.f47266c.getSettings().setSafeBrowsingEnabled(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void v(String str) {
        this.f47266c.loadData(str, "text/html", "utf-8");
    }

    public void w(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("wf-v", "417_5.0.7.4");
        this.f47266c.loadUrl(str, hashMap);
    }

    public void z(Bundle bundle) {
        this.f47266c.saveState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        WebChromeClient.CustomViewCallback f47280a;

        a() {
        }

        public void a(ValueCallback<Uri> valueCallback) {
            LJWebView lJWebView = LJWebView.this;
            lJWebView.f47277n = valueCallback;
            lJWebView.y();
        }

        public void b(ValueCallback valueCallback, String str) {
            LJWebView lJWebView = LJWebView.this;
            lJWebView.f47277n = valueCallback;
            lJWebView.y();
        }

        public void c(ValueCallback<Uri> valueCallback, String str, String str2) {
            LJWebView lJWebView = LJWebView.this;
            lJWebView.f47277n = valueCallback;
            lJWebView.y();
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            if (LJWebView.this.f47274k == null) {
                LayoutInflater from = LayoutInflater.from(LJWebView.this.f47265b);
                LJWebView.this.f47274k = from.inflate(R.layout.video_loading_progress, (ViewGroup) null);
            }
            return LJWebView.this.f47274k;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (message != null && message.contains("Uncaught ReferenceError") && message.contains("papaBackPageUp") && LJWebView.this.f47275l != null) {
                LJWebView.this.f47275l.noMethod();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(consoleMessage.message());
            sb.append(" -- From line ");
            sb.append(consoleMessage.lineNumber());
            sb.append(" of ");
            sb.append(consoleMessage.sourceId());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (LJWebView.this.f47273j == null) {
                return;
            }
            LJWebView.this.f47273j = null;
            try {
                WebChromeClient.CustomViewCallback customViewCallback = this.f47280a;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (LJWebView.this.f47275l != null) {
                LJWebView.this.f47275l.onHideCustomView();
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i4) {
            super.onProgressChanged(webView, i4);
            if (i4 > 10 && LJWebView.this.f47275l != null) {
                LJWebView.this.f47275l.showMainWebview();
            }
            if (i4 > 80) {
                if (LJWebView.this.f47271h == LJWebView.f47263r) {
                    if (LJWebView.this.f47267d != null) {
                        LJWebView.this.f47267d.setVisibility(8);
                    }
                } else if (LJWebView.this.f47268e != null) {
                    LJWebView.this.f47268e.setVisibility(8);
                }
            }
            if (i4 == 100) {
                if (LJWebView.this.f47271h == LJWebView.f47263r) {
                    if (LJWebView.this.f47267d != null) {
                        LJWebView.this.f47267d.setVisibility(8);
                        return;
                    }
                    return;
                } else if (LJWebView.this.f47268e != null) {
                    LJWebView.this.f47268e.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            if (!LJWebView.this.f47270g) {
                if (LJWebView.this.f47271h == LJWebView.f47263r) {
                    LJWebView lJWebView = LJWebView.this;
                    lJWebView.f47267d = (ProgressBar) LayoutInflater.from(lJWebView.f47265b).inflate(R.layout.progress_horizontal, (ViewGroup) null);
                    LJWebView.this.f47267d.setMax(100);
                    LJWebView.this.f47267d.setProgress(0);
                    LJWebView lJWebView2 = LJWebView.this;
                    lJWebView2.addView(lJWebView2.f47267d, -1, LJWebView.this.f47269f);
                } else {
                    LJWebView lJWebView3 = LJWebView.this;
                    lJWebView3.f47268e = (RelativeLayout) LayoutInflater.from(lJWebView3.f47265b).inflate(R.layout.loding_layout, (ViewGroup) null);
                    LJWebView lJWebView4 = LJWebView.this;
                    lJWebView4.addView(lJWebView4.f47268e, -1, -1);
                }
                LJWebView.this.f47270g = true;
            }
            if (LJWebView.this.f47271h == LJWebView.f47263r) {
                LJWebView.this.f47267d.setVisibility(0);
                LJWebView.this.f47267d.setProgress(i4);
                return;
            }
            LJWebView.this.f47268e.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onReachedMaxAppCacheSize(long j4, long j5, WebStorage.QuotaUpdater quotaUpdater) {
            try {
                UtilsMy.delete(new File(LJWebView.this.f47272i));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            super.onReachedMaxAppCacheSize(j4, j5, quotaUpdater);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (LJWebView.this.f47275l != null) {
                LJWebView.this.f47275l.onReceivedTitle(str);
            }
            super.onReceivedTitle(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            try {
                if (LJWebView.this.f47273j != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            LJWebView.this.f47273j = view;
            this.f47280a = customViewCallback;
            if (LJWebView.this.f47275l != null) {
                LJWebView.this.f47275l.onShowCustomView(view, customViewCallback, this);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            LJWebView lJWebView = LJWebView.this;
            lJWebView.f47278o = valueCallback;
            lJWebView.y();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, int i4, WebChromeClient.CustomViewCallback customViewCallback) {
            onShowCustomView(view, customViewCallback);
        }
    }

    public LJWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47266c = null;
        this.f47267d = null;
        this.f47268e = null;
        this.f47269f = 4;
        this.f47270g = false;
        this.f47271h = f47263r;
        this.f47274k = null;
        this.f47265b = context;
        t();
    }

    public LJWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47266c = null;
        this.f47267d = null;
        this.f47268e = null;
        this.f47269f = 4;
        this.f47270g = false;
        this.f47271h = f47263r;
        this.f47274k = null;
        this.f47265b = context;
        t();
    }
}
