package cn.sharesdk.tencent.qzone.utils;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.RegisterView;
import cn.sharesdk.framework.g;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.i;
import cn.sharesdk.framework.utils.n;
import cn.sharesdk.tencent.qzone.ReceiveActivity;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity;
/* loaded from: classes2.dex */
public class ShareActivity extends FakeActivity {
    private d adapter;
    private boolean isDisableNewTask;
    private PlatformActionListener pa;
    private boolean resultFailed;
    private boolean resultOk;
    private RegisterView rv;
    private String scheme;
    private String uriScheme;
    private boolean useClient;
    private WebView webView;

    /* JADX INFO: Access modifiers changed from: private */
    public void afterShare(String str) {
        String str2 = str == null ? "" : new String(str);
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        if (urlToBundle == null) {
            this.resultFailed = true;
            finish();
            PlatformActionListener platformActionListener = this.pa;
            platformActionListener.onError(null, 0, new Throwable("failed to parse callback uri: " + str2));
            return;
        }
        String string = urlToBundle.getString("action");
        if (!"share".equals(string) && !"shareToQzone".equals(string)) {
            this.resultFailed = true;
            finish();
            PlatformActionListener platformActionListener2 = this.pa;
            platformActionListener2.onError(null, 0, new Throwable("action error: " + str2));
            return;
        }
        String string2 = urlToBundle.getString("result");
        if ("cancel".equals(string2)) {
            finish();
            this.pa.onCancel(null, 0);
        } else if (!"complete".equals(string2)) {
            this.resultFailed = true;
            finish();
            PlatformActionListener platformActionListener3 = this.pa;
            platformActionListener3.onError(null, 0, new Throwable("operation failed: " + str2));
        } else {
            String string3 = urlToBundle.getString(GrantCredentialsPermissionActivity.f67537i);
            if (TextUtils.isEmpty(string3)) {
                this.resultFailed = true;
                finish();
                PlatformActionListener platformActionListener4 = this.pa;
                platformActionListener4.onError(null, 0, new Throwable("response empty" + str2));
                return;
            }
            this.resultOk = true;
            finish();
            this.pa.onComplete(null, 0, new Hashon().fromJson(string3));
        }
    }

    private void clientShare() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.scheme));
            intent.putExtra("pkg_name", this.activity.getPackageName());
            SSDKLog b5 = SSDKLog.b();
            b5.a("isDisableNewTask:" + this.isDisableNewTask, new Object[0]);
            if (Build.VERSION.SDK_INT >= 11 && !this.isDisableNewTask) {
                intent.setFlags(335544320);
            }
            this.activity.startActivityForResult(intent, 100);
        } catch (Throwable th) {
            PlatformActionListener platformActionListener = this.pa;
            if (platformActionListener != null) {
                platformActionListener.onError(null, 0, th);
            }
        }
    }

    private d getAdapter() {
        try {
            String string = this.activity.getPackageManager().getActivityInfo(this.activity.getComponentName(), 128).metaData.getString("QZoneWebShareAdapter");
            if (string != null && string.length() > 0) {
                Object newInstance = Class.forName(string).newInstance();
                if (newInstance instanceof d) {
                    return (d) newInstance;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchQZone(String str) {
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            DH.requester(MobSDK.getContext()).resolveActivity(intent, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qzone.utils.ShareActivity.4
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    if (dHResponse.resolveActivity(new int[0]) != null) {
                        try {
                            ShareActivity.this.startActivity(intent);
                            return;
                        } catch (Throwable th) {
                            SSDKLog.b().a(th);
                            return;
                        }
                    }
                    SSDKLog.b().a("ra null", new Object[0]);
                }
            });
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
    }

    private void webShare() {
        this.rv = getBodyView();
        try {
            int stringRes = ResHelper.getStringRes(getContext(), "ssdk_share_to_qzone");
            if (stringRes > 0) {
                this.rv.c().getTvTitle().setText(stringRes);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            this.rv.c().setVisibility(8);
        }
        this.adapter.a(this.rv.d());
        this.adapter.a(this.rv.b());
        this.adapter.a(this.rv.c());
        this.adapter.a();
        i.a(this.rv);
        this.activity.setContentView(this.rv);
        DH.requester(MobSDK.getContext()).getNetworkTypeForStatic().request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qzone.utils.ShareActivity.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    if ("none".equals(dHResponse.getNetworkTypeForStatic())) {
                        ShareActivity.this.resultFailed = true;
                        ShareActivity.this.finish();
                        ShareActivity.this.pa.onError(null, 0, new Throwable("failed to load webpage, network disconnected."));
                    }
                    ShareActivity.this.rv.b().loadUrl(ShareActivity.this.scheme);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        });
    }

    protected RegisterView getBodyView() {
        RegisterView registerView = new RegisterView(this.activity);
        registerView.c().getChildAt(registerView.c().getChildCount() - 1).setVisibility(8);
        registerView.a().setOnClickListener(new View.OnClickListener() { // from class: cn.sharesdk.tencent.qzone.utils.ShareActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new Thread() { // from class: cn.sharesdk.tencent.qzone.utils.ShareActivity.2.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            new Instrumentation().sendKeyDownUpSync(4);
                        } catch (Throwable th) {
                            SSDKLog.b().a(th);
                            ShareActivity.this.finish();
                            ShareActivity.this.pa.onCancel(null, 0);
                        }
                    }
                }.start();
            }
        });
        WebView b5 = registerView.b();
        this.webView = b5;
        WebSettings settings = b5.getSettings();
        settings.setBuiltInZoomControls(true);
        n.a(settings, true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        n.a(this.webView, false);
        settings.setDatabasePath(this.activity.getDir("database", 0).getPath());
        settings.setSavePassword(false);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.setWebViewClient(new g() { // from class: cn.sharesdk.tencent.qzone.utils.ShareActivity.3
            @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str != null && str.startsWith(ShareActivity.this.uriScheme)) {
                    ShareActivity.this.afterShare(str);
                } else if (str != null && str.startsWith("mqzone://")) {
                    ShareActivity.this.launchQZone(str);
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        return registerView;
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i4, int i5, Intent intent) {
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
        try {
            try {
                Class<?> cls = Class.forName("cn.sharesdk.tencent.qq.ReceiveActivity");
                cls.getMethod("setUriScheme", String.class).invoke(null, this.uriScheme);
                cls.getMethod("setPlatformActionListener", PlatformActionListener.class).invoke(null, this.pa);
                if (this.useClient) {
                    clientShare();
                } else {
                    webShare();
                }
            } catch (Throwable unused) {
                ReceiveActivity.a(this.uriScheme);
                ReceiveActivity.a(this.pa);
                if (this.useClient) {
                    clientShare();
                } else {
                    webShare();
                }
            }
        } catch (Throwable th2) {
            this.activity.finish();
            PlatformActionListener platformActionListener = this.pa;
            if (platformActionListener != null) {
                platformActionListener.onError(null, 9, th2);
            }
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        if (!this.useClient && !this.resultFailed && !this.resultOk) {
            this.pa.onCancel(null, 0);
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.setFocusable(false);
        }
        d dVar = this.adapter;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
        d dVar = this.adapter;
        if (dVar != null) {
            return dVar.h();
        }
        return super.onFinish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        d dVar = this.adapter;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onRestart() {
        d dVar = this.adapter;
        if (dVar != null) {
            dVar.g();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        d dVar = this.adapter;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStart() {
        d dVar = this.adapter;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        d dVar = this.adapter;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (this.adapter == null) {
            d adapter = getAdapter();
            this.adapter = adapter;
            if (adapter == null) {
                this.adapter = new d();
            }
        }
        this.adapter.a(activity);
    }

    public void setAppId(String str) {
        this.uriScheme = "tencent" + str;
    }

    public void setDisableNewTask(boolean z4) {
        this.isDisableNewTask = z4;
    }

    public void setScheme(String str, boolean z4) {
        this.scheme = str;
        this.useClient = z4;
    }

    public void setSharedCallback(PlatformActionListener platformActionListener) {
        this.pa = platformActionListener;
    }
}
