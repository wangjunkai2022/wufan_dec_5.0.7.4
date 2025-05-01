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
public class LJNestScrollWebView extends RelativeLayout {

    /* renamed from: q  reason: collision with root package name */
    public static int f47242q = 1;

    /* renamed from: r  reason: collision with root package name */
    public static int f47243r = 2;

    /* renamed from: s  reason: collision with root package name */
    public static final int f47244s = 43234;

    /* renamed from: b  reason: collision with root package name */
    private Context f47245b;

    /* renamed from: c  reason: collision with root package name */
    private NestedWebView f47246c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f47247d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f47248e;

    /* renamed from: f  reason: collision with root package name */
    private int f47249f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47250g;

    /* renamed from: h  reason: collision with root package name */
    private int f47251h;

    /* renamed from: i  reason: collision with root package name */
    private String f47252i;

    /* renamed from: j  reason: collision with root package name */
    private View f47253j;

    /* renamed from: k  reason: collision with root package name */
    private View f47254k;

    /* renamed from: l  reason: collision with root package name */
    private b f47255l;

    /* renamed from: m  reason: collision with root package name */
    Activity f47256m;

    /* renamed from: n  reason: collision with root package name */
    ValueCallback<Uri> f47257n;

    /* renamed from: o  reason: collision with root package name */
    ValueCallback<Uri[]> f47258o;

    /* renamed from: p  reason: collision with root package name */
    private c f47259p;

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

    public LJNestScrollWebView(Context context) {
        super(context);
        this.f47246c = null;
        this.f47247d = null;
        this.f47248e = null;
        this.f47249f = 4;
        this.f47250g = false;
        this.f47251h = f47243r;
        this.f47254k = null;
        this.f47245b = context;
        t();
    }

    private void t() {
        NestedWebView nestedWebView = new NestedWebView(this.f47245b);
        this.f47246c = nestedWebView;
        addView(nestedWebView, -1, -1);
        this.f47246c.setBackgroundColor(0);
        u();
        this.f47246c.setWebChromeClient(new a());
    }

    @TargetApi(21)
    private void x(int i4, int i5, Intent intent) {
        Uri[] uriArr;
        if (i4 != 43234 || this.f47258o == null) {
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
        this.f47258o.onReceiveValue(uriArr);
        this.f47258o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        this.f47256m.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 43234);
    }

    public WebView getWebView() {
        return this.f47246c;
    }

    public void q(int i4, int i5, Intent intent) {
        if (i4 == 43234) {
            if (this.f47257n == null && this.f47258o == null) {
                return;
            }
            Uri data = (intent == null || i5 != -1) ? null : intent.getData();
            if (this.f47258o != null) {
                x(i4, i5, intent);
                return;
            }
            ValueCallback<Uri> valueCallback = this.f47257n;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data);
                this.f47257n = null;
                return;
            }
            return;
        }
        ValueCallback<Uri> valueCallback2 = this.f47257n;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
            this.f47257n = null;
            return;
        }
        ValueCallback<Uri[]> valueCallback3 = this.f47258o;
        if (valueCallback3 != null) {
            valueCallback3.onReceiveValue(null);
            this.f47258o = null;
        }
    }

    public void r(Object obj) {
        this.f47246c.addJavascriptInterface(obj, "papa");
    }

    public void s(Object obj) {
        this.f47246c.addJavascriptInterface(obj, "wufan");
    }

    public void setActivity(Activity activity) {
        this.f47256m = activity;
    }

    public void setBarHeight(int i4) {
        this.f47249f = i4;
    }

    public void setBuiltInZoomControls(boolean z4) {
        this.f47246c.getSettings().setBuiltInZoomControls(z4);
    }

    public void setCacheMode(int i4) {
        this.f47246c.getSettings().setCacheMode(i4);
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        this.f47246c.setClickable(z4);
    }

    public void setJavaScriptEnabled(boolean z4) {
        this.f47246c.getSettings().setJavaScriptEnabled(z4);
    }

    public void setMethodListenter(b bVar) {
        this.f47255l = bVar;
    }

    public void setProgressStyle(int i4) {
        this.f47251h = i4;
    }

    public void setSupportZoom(boolean z4) {
        this.f47246c.getSettings().setSupportZoom(z4);
    }

    public void setUseWideViewPort(boolean z4) {
        this.f47246c.getSettings().setUseWideViewPort(z4);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.f47246c.setWebViewClient(webViewClient);
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                this.f47246c.removeJavascriptInterface("searchBoxJavaBredge_");
            } catch (Exception unused) {
            }
        }
    }

    public void setonShowFileChooser(c cVar) {
        this.f47259p = cVar;
    }

    public void u() {
        this.f47246c.getSettings().setDomStorageEnabled(true);
        this.f47246c.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f47246c.getSettings().setAppCacheEnabled(true);
        this.f47252i = this.f47245b.getApplicationContext().getDir("cacheH5", 0).getPath();
        this.f47246c.getSettings().setAppCachePath(this.f47252i);
        this.f47246c.getSettings().setAllowFileAccess(true);
        this.f47246c.getSettings().setCacheMode(-1);
        this.f47246c.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f47246c.getSettings().setLoadWithOverviewMode(true);
        this.f47246c.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.f47246c.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f47246c.getSettings().setTextZoom(100);
        this.f47246c.getSettings().setMediaPlaybackRequiresUserGesture(false);
        UtilsMy.C3(this.f47246c);
        try {
            if (Build.VERSION.SDK_INT > 27) {
                this.f47246c.getSettings().setSafeBrowsingEnabled(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void v(String str) {
        this.f47246c.loadData(str, "text/html", "utf-8");
    }

    public void w(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("wf-v", "417_5.0.7.4");
        this.f47246c.loadUrl(str, hashMap);
    }

    public void z(Bundle bundle) {
        this.f47246c.saveState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        WebChromeClient.CustomViewCallback f47260a;

        a() {
        }

        public void a(ValueCallback<Uri> valueCallback) {
            LJNestScrollWebView lJNestScrollWebView = LJNestScrollWebView.this;
            lJNestScrollWebView.f47257n = valueCallback;
            lJNestScrollWebView.y();
        }

        public void b(ValueCallback valueCallback, String str) {
            LJNestScrollWebView lJNestScrollWebView = LJNestScrollWebView.this;
            lJNestScrollWebView.f47257n = valueCallback;
            lJNestScrollWebView.y();
        }

        public void c(ValueCallback<Uri> valueCallback, String str, String str2) {
            LJNestScrollWebView lJNestScrollWebView = LJNestScrollWebView.this;
            lJNestScrollWebView.f47257n = valueCallback;
            lJNestScrollWebView.y();
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            if (LJNestScrollWebView.this.f47254k == null) {
                LayoutInflater from = LayoutInflater.from(LJNestScrollWebView.this.f47245b);
                LJNestScrollWebView.this.f47254k = from.inflate(R.layout.video_loading_progress, (ViewGroup) null);
            }
            return LJNestScrollWebView.this.f47254k;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (message != null && message.contains("Uncaught ReferenceError") && message.contains("papaBackPageUp") && LJNestScrollWebView.this.f47255l != null) {
                LJNestScrollWebView.this.f47255l.noMethod();
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
            if (LJNestScrollWebView.this.f47253j == null) {
                return;
            }
            LJNestScrollWebView.this.f47253j = null;
            try {
                WebChromeClient.CustomViewCallback customViewCallback = this.f47260a;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (LJNestScrollWebView.this.f47255l != null) {
                LJNestScrollWebView.this.f47255l.onHideCustomView();
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i4) {
            super.onProgressChanged(webView, i4);
            if (i4 > 10 && LJNestScrollWebView.this.f47255l != null) {
                LJNestScrollWebView.this.f47255l.showMainWebview();
            }
            if (i4 > 80) {
                if (LJNestScrollWebView.this.f47251h == LJNestScrollWebView.f47243r) {
                    if (LJNestScrollWebView.this.f47247d != null) {
                        LJNestScrollWebView.this.f47247d.setVisibility(8);
                    }
                } else if (LJNestScrollWebView.this.f47248e != null) {
                    LJNestScrollWebView.this.f47248e.setVisibility(8);
                }
            }
            if (i4 == 100) {
                if (LJNestScrollWebView.this.f47251h == LJNestScrollWebView.f47243r) {
                    if (LJNestScrollWebView.this.f47247d != null) {
                        LJNestScrollWebView.this.f47247d.setVisibility(8);
                        return;
                    }
                    return;
                } else if (LJNestScrollWebView.this.f47248e != null) {
                    LJNestScrollWebView.this.f47248e.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            if (!LJNestScrollWebView.this.f47250g) {
                if (LJNestScrollWebView.this.f47251h == LJNestScrollWebView.f47243r) {
                    LJNestScrollWebView lJNestScrollWebView = LJNestScrollWebView.this;
                    lJNestScrollWebView.f47247d = (ProgressBar) LayoutInflater.from(lJNestScrollWebView.f47245b).inflate(R.layout.progress_horizontal, (ViewGroup) null);
                    LJNestScrollWebView.this.f47247d.setMax(100);
                    LJNestScrollWebView.this.f47247d.setProgress(0);
                    LJNestScrollWebView lJNestScrollWebView2 = LJNestScrollWebView.this;
                    lJNestScrollWebView2.addView(lJNestScrollWebView2.f47247d, -1, LJNestScrollWebView.this.f47249f);
                } else {
                    LJNestScrollWebView lJNestScrollWebView3 = LJNestScrollWebView.this;
                    lJNestScrollWebView3.f47248e = (RelativeLayout) LayoutInflater.from(lJNestScrollWebView3.f47245b).inflate(R.layout.loding_layout, (ViewGroup) null);
                    LJNestScrollWebView lJNestScrollWebView4 = LJNestScrollWebView.this;
                    lJNestScrollWebView4.addView(lJNestScrollWebView4.f47248e, -1, -1);
                }
                LJNestScrollWebView.this.f47250g = true;
            }
            if (LJNestScrollWebView.this.f47251h == LJNestScrollWebView.f47243r) {
                LJNestScrollWebView.this.f47247d.setVisibility(0);
                LJNestScrollWebView.this.f47247d.setProgress(i4);
                return;
            }
            LJNestScrollWebView.this.f47248e.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onReachedMaxAppCacheSize(long j4, long j5, WebStorage.QuotaUpdater quotaUpdater) {
            try {
                UtilsMy.delete(new File(LJNestScrollWebView.this.f47252i));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            super.onReachedMaxAppCacheSize(j4, j5, quotaUpdater);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (LJNestScrollWebView.this.f47255l != null) {
                LJNestScrollWebView.this.f47255l.onReceivedTitle(str);
            }
            super.onReceivedTitle(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            try {
                if (LJNestScrollWebView.this.f47253j != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            LJNestScrollWebView.this.f47253j = view;
            this.f47260a = customViewCallback;
            if (LJNestScrollWebView.this.f47255l != null) {
                LJNestScrollWebView.this.f47255l.onShowCustomView(view, customViewCallback, this);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            LJNestScrollWebView lJNestScrollWebView = LJNestScrollWebView.this;
            lJNestScrollWebView.f47258o = valueCallback;
            lJNestScrollWebView.y();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, int i4, WebChromeClient.CustomViewCallback customViewCallback) {
            onShowCustomView(view, customViewCallback);
        }
    }

    public LJNestScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47246c = null;
        this.f47247d = null;
        this.f47248e = null;
        this.f47249f = 4;
        this.f47250g = false;
        this.f47251h = f47243r;
        this.f47254k = null;
        this.f47245b = context;
        t();
    }

    public LJNestScrollWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47246c = null;
        this.f47247d = null;
        this.f47248e = null;
        this.f47249f = 4;
        this.f47250g = false;
        this.f47251h = f47243r;
        this.f47254k = null;
        this.f47245b = context;
        t();
    }
}
