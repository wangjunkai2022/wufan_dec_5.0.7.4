package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.pref.PrefDef_;
import com.mob.MobSDK;
import com.mob.OperationCallback;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.lang.reflect.Method;
/* compiled from: UserPermissDialog.java */
/* loaded from: classes4.dex */
public class o2 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Activity f49562b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49563c;

    /* renamed from: d  reason: collision with root package name */
    WebView f49564d;

    /* renamed from: e  reason: collision with root package name */
    String f49565e;

    /* renamed from: f  reason: collision with root package name */
    int f49566f;

    /* renamed from: g  reason: collision with root package name */
    g f49567g;

    /* renamed from: h  reason: collision with root package name */
    Handler f49568h;

    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    class a extends WebChromeClient {
        a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            callback.invoke(str, true, false);
        }
    }

    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o2 o2Var = o2.this;
            if (o2Var.f49566f == 1) {
                com.papa.sim.statistic.p.l(o2Var.f49562b).O1(Event.disagreePrivacyProtocol, new Ext());
                Activity activity = o2.this.f49562b;
                new o2(activity, 2, com.join.mgps.rpc.h.f54056j + com.constant.b.f9471b, o2.this.f49567g).show();
            } else {
                com.papa.sim.statistic.p.l(o2Var.f49562b).O1(Event.disagreeExitApp, new Ext());
                o2.this.f49562b.finish();
                MobSDK.submitPolicyGrantResult(false, (OperationCallback<Void>) null);
            }
            o2.this.dismiss();
        }
    }

    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o2 o2Var = o2.this;
            if (o2Var.f49566f == 1) {
                com.papa.sim.statistic.p.l(o2Var.f49562b).O1(Event.agreePrivacyProtocol, new Ext());
                new PrefDef_(o2.this.f49562b).firstShowUserPermiss().g(Boolean.FALSE);
                o2.this.f49567g.a();
            } else {
                com.papa.sim.statistic.p.l(o2Var.f49562b).O1(Event.disagreeThinkAgain, new Ext());
                Activity activity = o2.this.f49562b;
                new o2(activity, 1, com.join.mgps.rpc.h.f54056j + com.constant.b.f9470a, o2.this.f49567g).show();
            }
            o2.this.dismiss();
        }
    }

    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (o2.this.f49566f == 2) {
                    Activity activity = o2.this.f49562b;
                    new o2(activity, 1, com.join.mgps.rpc.h.f54056j + com.constant.b.f9470a, o2.this.f49567g).show();
                    o2.this.dismiss();
                }
                return true;
            }
            return false;
        }
    }

    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    class e extends Handler {
        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what == 1) {
                o2 o2Var = o2.this;
                o2Var.f49564d.loadUrl(o2Var.f49565e);
                return;
            }
            o2 o2Var2 = o2.this;
            if (o2Var2.f49566f == 1) {
                o2Var2.f49564d.loadUrl("file:///android_asset/dialogxieyi1.html");
            } else {
                o2Var2.f49564d.loadUrl("file:///android_asset/dialogxieyi2.html");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    public class f extends Thread {
        f() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (com.join.android.app.common.utils.j.l()) {
                o2.this.f49568h.sendEmptyMessage(1);
            } else {
                o2.this.f49568h.sendEmptyMessage(2);
            }
        }
    }

    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    public interface g {
        void a();
    }

    /* compiled from: UserPermissDialog.java */
    /* loaded from: classes4.dex */
    private class h extends WebViewClient {
        public h(Context context) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
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
            if (com.join.android.app.common.utils.j.j(o2.this.f49562b)) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(str);
                intentDateBean.setObject("悟饭游戏厅用户使用协议");
                IntentUtil.getInstance().intentActivity(o2.this.f49562b, intentDateBean);
                return true;
            }
            com.join.mgps.Util.l2.a(o2.this.f49562b).b(o2.this.f49562b.getString(R.string.net_connect_failed));
            return true;
        }
    }

    public o2(Activity activity, int i4, String str, g gVar) {
        super(activity, R.style.MyDialog);
        this.f49568h = new e();
        this.f49562b = activity;
        this.f49565e = str;
        this.f49566f = i4;
        this.f49567g = gVar;
    }

    public void a() {
        if (com.join.android.app.common.utils.j.j(this.f49562b)) {
            new f().start();
        } else if (this.f49566f == 1) {
            this.f49564d.loadUrl("file:///android_asset/dialogxieyi1.html");
        } else {
            this.f49564d.loadUrl("file:///android_asset/dialogxieyi2.html");
        }
    }

    public void b(String str) {
        this.f49563c.setText(str);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f49566f == 1) {
            com.papa.sim.statistic.p.l(this.f49562b).O1(Event.showPrivacyProtocol, new Ext());
        } else {
            com.papa.sim.statistic.p.l(this.f49562b).O1(Event.showDisagreePrivacyProtocol, new Ext());
        }
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49562b).inflate(R.layout.dialog_permiss_customer_alert, (ViewGroup) null);
        inflate.setMinimumWidth(com.join.android.app.common.utils.n.n(this.f49562b).B(this.f49562b));
        this.f49564d = (WebView) inflate.findViewById(R.id.info);
        TextView textView = (TextView) inflate.findViewById(R.id.tip_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dialog_button_cancel);
        TextView textView3 = (TextView) inflate.findViewById(R.id.dialog_button_ok);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.dialog_app_update_sv);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) scrollView.getLayoutParams();
        if (this.f49566f == 1) {
            layoutParams.height = this.f49562b.getResources().getDimensionPixelOffset(R.dimen.wdp700);
        } else {
            layoutParams.height = this.f49562b.getResources().getDimensionPixelOffset(R.dimen.wdp380);
        }
        scrollView.setLayoutParams(layoutParams);
        this.f49564d.setBackgroundColor(0);
        this.f49564d.setWebViewClient(new h(this.f49562b));
        this.f49564d.getSettings().setUseWideViewPort(true);
        this.f49564d.getSettings().setSupportZoom(false);
        this.f49564d.getSettings().setBuiltInZoomControls(false);
        this.f49564d.setHorizontalScrollBarEnabled(false);
        this.f49564d.setVerticalScrollBarEnabled(false);
        this.f49564d.setLayerType(0, null);
        WebSettings settings = this.f49564d.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
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
        this.f49564d.setFocusable(true);
        this.f49564d.setDrawingCacheEnabled(true);
        this.f49564d.setScrollBarStyle(0);
        this.f49564d.setWebChromeClient(new a());
        if (this.f49566f == 1) {
            textView2.setText("不同意");
            textView3.setText("同意");
        } else {
            textView2.setText("退出应用");
            textView3.setText("我再想想");
        }
        textView2.setOnClickListener(new b());
        textView3.setOnClickListener(new c());
        setOnKeyListener(new d());
        setContentView(inflate);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        a();
    }
}
