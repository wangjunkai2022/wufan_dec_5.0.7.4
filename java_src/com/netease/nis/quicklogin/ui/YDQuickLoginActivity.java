package com.netease.nis.quicklogin.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.R;
import com.netease.nis.quicklogin.helper.UnifyUiConfig;
import com.netease.nis.quicklogin.listener.LoginListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.utils.c;
import com.netease.nis.quicklogin.utils.g;
import com.netease.nis.quicklogin.utils.h;
import com.netease.nis.quicklogin.view.FastClickButton;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class YDQuickLoginActivity extends Activity {

    /* renamed from: n  reason: collision with root package name */
    private static QuickLoginTokenListener f57556n;

    /* renamed from: a  reason: collision with root package name */
    ImageView f57557a;

    /* renamed from: b  reason: collision with root package name */
    private EditText f57558b;

    /* renamed from: c  reason: collision with root package name */
    private CheckBox f57559c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f57560d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f57561e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f57562f;

    /* renamed from: g  reason: collision with root package name */
    private UnifyUiConfig f57563g;

    /* renamed from: h  reason: collision with root package name */
    private LoginListener f57564h;

    /* renamed from: i  reason: collision with root package name */
    private String f57565i;

    /* renamed from: j  reason: collision with root package name */
    private String f57566j;

    /* renamed from: k  reason: collision with root package name */
    private String f57567k;

    /* renamed from: l  reason: collision with root package name */
    private String f57568l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f57569m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (YDQuickLoginActivity.f57556n != null) {
                YDQuickLoginActivity.f57556n.onCancelGetToken();
            }
            YDQuickLoginActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FastClickButton f57571a;

        /* loaded from: classes5.dex */
        class a implements DialogInterface.OnClickListener {
            a(b bVar) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* renamed from: com.netease.nis.quicklogin.ui.YDQuickLoginActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class DialogInterface$OnClickListenerC0572b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC0572b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                YDQuickLoginActivity.this.f57559c.setChecked(true);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (YDQuickLoginActivity.this.f57563g.getPrivacyDialogAuto()) {
                    b.this.f57571a.performClick();
                }
            }
        }

        b(FastClickButton fastClickButton) {
            this.f57571a = fastClickButton;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CharSequence privacyDialogText;
            int i4 = 1;
            if (YDQuickLoginActivity.this.f57559c.isChecked()) {
                if (YDQuickLoginActivity.this.f57563g != null && YDQuickLoginActivity.this.f57563g.getLoadingVisible()) {
                    YDQuickLoginActivity.this.f57561e.setVisibility(0);
                }
                this.f57571a.a(true);
                YDQuickLoginActivity.this.a(4, 1);
                YDQuickLoginActivity.this.b();
                return;
            }
            YDQuickLoginActivity.this.f57561e.setVisibility(8);
            this.f57571a.a(false);
            YDQuickLoginActivity.this.a(4, 0);
            try {
                if (YDQuickLoginActivity.this.f57563g != null) {
                    if (YDQuickLoginActivity.this.f57564h == null || !YDQuickLoginActivity.this.f57564h.onDisagreePrivacy(YDQuickLoginActivity.this.f57560d, this.f57571a)) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(YDQuickLoginActivity.this);
                        if (!TextUtils.isEmpty(YDQuickLoginActivity.this.f57563g.getPrivacyDialogText())) {
                            privacyDialogText = YDQuickLoginActivity.this.f57563g.getPrivacyDialogText();
                        } else {
                            YDQuickLoginActivity yDQuickLoginActivity = YDQuickLoginActivity.this;
                            if (!yDQuickLoginActivity.f57569m) {
                                i4 = 2;
                            }
                            privacyDialogText = com.netease.nis.quicklogin.utils.a.a(i4, yDQuickLoginActivity.f57563g, "请您仔细阅读", "，点击“确定”，表示您已经阅读并同意以上协议");
                        }
                        AlertDialog create = builder.setMessage(privacyDialogText).setPositiveButton("确认", new DialogInterface$OnClickListenerC0572b()).setNegativeButton("取消", new a(this)).create();
                        if (!YDQuickLoginActivity.this.isFinishing()) {
                            create.show();
                        }
                        ((TextView) create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((TextView) create.findViewById(16908299)).setTextSize(2, YDQuickLoginActivity.this.f57563g.getPrivacyDialogTextSize() != 0.0f ? YDQuickLoginActivity.this.f57563g.getPrivacyDialogTextSize() : 13.0f);
                        return;
                    }
                    return;
                }
                Toast.makeText(YDQuickLoginActivity.this.getApplicationContext(), R.string.yd_privacy_agree, 0).show();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        UnifyUiConfig unifyUiConfig = this.f57563g;
        if (unifyUiConfig != null && (!TextUtils.isEmpty(unifyUiConfig.getActivityEnterAnimation()) || !TextUtils.isEmpty(this.f57563g.getActivityExitAnimation()))) {
            h a5 = h.a(getApplicationContext());
            overridePendingTransition(a5.a(this.f57563g.getActivityEnterAnimation()), a5.a(this.f57563g.getActivityExitAnimation()));
        }
        if (f57556n != null) {
            f57556n = null;
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        try {
            UnifyUiConfig unifyUiConfig = this.f57563g;
            if (unifyUiConfig == null || unifyUiConfig.getActivityResultCallbacks() == null) {
                return;
            }
            this.f57563g.getActivityResultCallbacks().onActivityResult(i4, i5, intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        UnifyUiConfig unifyUiConfig = this.f57563g;
        if (unifyUiConfig == null || !unifyUiConfig.getBackPressedAvailable()) {
            return;
        }
        QuickLoginTokenListener quickLoginTokenListener = f57556n;
        if (quickLoginTokenListener != null) {
            try {
                quickLoginTokenListener.onCancelGetToken();
            } catch (Exception e5) {
                Logger.e(e5.getMessage());
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.yd_activity_quick_login);
        c();
        Intent intent = getIntent();
        if (intent != null) {
            a(intent);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        RelativeLayout relativeLayout = this.f57562f;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[Catch: Exception -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0068, blocks: (B:12:0x001a, B:15:0x0020, B:17:0x002e, B:21:0x0046, B:23:0x004a, B:18:0x003a, B:20:0x0041), top: B:40:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #3 {Exception -> 0x0068, blocks: (B:12:0x001a, B:15:0x0020, B:17:0x002e, B:21:0x0046, B:23:0x004a, B:18:0x003a, B:20:0x0041), top: B:40:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #3 {Exception -> 0x0068, blocks: (B:12:0x001a, B:15:0x0020, B:17:0x002e, B:21:0x0046, B:23:0x004a, B:18:0x003a, B:20:0x0041), top: B:40:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = com.netease.nis.quicklogin.utils.d.a()     // Catch: java.lang.Exception -> Lc
            java.lang.String r0 = com.netease.nis.quicklogin.utils.d.a(r6)     // Catch: java.lang.Exception -> La
            goto L15
        La:
            r2 = move-exception
            goto Le
        Lc:
            r2 = move-exception
            r1 = r0
        Le:
            java.lang.String r2 = r2.getMessage()
            com.netease.nis.basesdk.Logger.e(r2)
        L15:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r3 = r6.f57569m     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = "accessToken"
            if (r3 == 0) goto L3a
            java.lang.String r3 = r6.f57565i     // Catch: java.lang.Exception -> L68
            r2.put(r4, r3)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "version"
            java.lang.String r4 = "v2"
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "md5"
            android.content.Context r4 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = com.sdk.Unicorn.base.api.ToolUtils.getAppMd5(r4)     // Catch: java.lang.Exception -> L68
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L68
            goto L46
        L3a:
            java.lang.String r3 = r6.f57565i     // Catch: java.lang.Exception -> L68
            r2.put(r4, r3)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "gwAuth"
            java.lang.String r4 = r6.f57567k     // Catch: java.lang.Exception -> L68
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L68
        L46:
            com.netease.nis.quicklogin.listener.QuickLoginTokenListener r3 = com.netease.nis.quicklogin.ui.YDQuickLoginActivity.f57556n     // Catch: java.lang.Exception -> L68
            if (r3 == 0) goto L96
            java.lang.String r3 = "timeend"
            r4 = 0
            com.netease.nis.quicklogin.utils.e.a(r6, r3, r4)     // Catch: java.lang.Exception -> L68
            com.sdk.Unicorn.base.api.ToolUtils.clearCache(r6)     // Catch: java.lang.Exception -> L68
            com.netease.nis.quicklogin.listener.QuickLoginTokenListener r3 = com.netease.nis.quicklogin.ui.YDQuickLoginActivity.f57556n     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = r6.f57568l     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = com.netease.nis.quicklogin.utils.a.a(r2)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = r6.a(r2, r1, r0)     // Catch: java.lang.Exception -> L68
            r3.onGetTokenSuccess(r4, r0)     // Catch: java.lang.Exception -> L68
            goto L96
        L68:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.netease.nis.basesdk.Logger.e(r1)
            com.netease.nis.quicklogin.listener.QuickLoginTokenListener r1 = com.netease.nis.quicklogin.ui.YDQuickLoginActivity.f57556n
            if (r1 == 0) goto L86
            java.lang.String r2 = r6.f57568l     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L7e
            r1.onGetTokenError(r2, r3)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.netease.nis.basesdk.Logger.e(r1)
        L86:
            java.lang.String r1 = r6.f57568l
            com.netease.nis.quicklogin.b.b r2 = com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION
            int r2 = r2.ordinal()
            java.lang.String r0 = r0.toString()
            r3 = 0
            r6.a(r1, r2, r3, r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netease.nis.quicklogin.ui.YDQuickLoginActivity.b():void");
    }

    private void c() {
        this.f57562f = (RelativeLayout) findViewById(R.id.yd_rl_root);
        ImageView imageView = (ImageView) findViewById(R.id.yd_iv_navigation);
        this.f57557a = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        UnifyUiConfig unifyUiConfig = this.f57563g;
        if (unifyUiConfig != null && unifyUiConfig.getLoadingView() != null) {
            ViewGroup loadingView = this.f57563g.getLoadingView();
            this.f57561e = loadingView;
            loadingView.bringToFront();
            try {
                this.f57562f.addView(this.f57561e);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f57561e.setVisibility(8);
        } else {
            this.f57561e = (ViewGroup) findViewById(R.id.yd_rl_loading);
        }
        this.f57558b = (EditText) findViewById(R.id.yd_et_number);
        FastClickButton fastClickButton = (FastClickButton) findViewById(R.id.yd_btn_oauth);
        this.f57560d = (TextView) findViewById(R.id.yd_tv_privacy);
        if (fastClickButton != null) {
            fastClickButton.setOnClickListener(new b(fastClickButton));
        }
        this.f57559c = (CheckBox) findViewById(R.id.yd_cb_privacy);
    }

    public static void a(QuickLoginTokenListener quickLoginTokenListener) {
        f57556n = quickLoginTokenListener;
    }

    public void a(UnifyUiConfig unifyUiConfig) {
        this.f57563g = unifyUiConfig;
    }

    public void a(LoginListener loginListener) {
        this.f57564h = loginListener;
    }

    private void a(Intent intent) {
        TextView textView;
        if ("cu".equals(intent.getStringExtra("operatorType"))) {
            this.f57569m = true;
        }
        if (this.f57569m && (textView = (TextView) findViewById(R.id.yd_tv_brand)) != null) {
            textView.setText("中国联通提供认证服务");
        }
        String stringExtra = intent.getStringExtra("maskNumber");
        this.f57566j = stringExtra;
        EditText editText = this.f57558b;
        if (editText != null && stringExtra != null) {
            editText.setText(stringExtra);
        }
        this.f57565i = intent.getStringExtra("accessToken");
        this.f57567k = intent.getStringExtra("gwAuth");
        this.f57568l = intent.getStringExtra("ydToken");
    }

    private String a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accessToken", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("deviceId", str2);
            }
            jSONObject.put("phone", this.f57566j);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("randomId", str3);
            }
            return (TextUtils.isEmpty(com.netease.nis.quicklogin.b.a.f57425a) || TextUtils.isEmpty(com.netease.nis.quicklogin.b.a.f57426b)) ? str : c.b(jSONObject.toString(), com.netease.nis.quicklogin.b.a.f57425a, com.netease.nis.quicklogin.b.a.f57426b);
        } catch (Exception e5) {
            Logger.e(e5.getMessage());
            return str;
        }
    }

    private void a(String str, int i4, int i5, String str2) {
        g.c().a(g.c.MONITOR_GET_TOKEN, i4, str, 1, i5, 0, str2, System.currentTimeMillis());
        g.c().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, int i5) {
        try {
            UnifyUiConfig unifyUiConfig = this.f57563g;
            if (unifyUiConfig == null || unifyUiConfig.getClickEventListener() == null) {
                return;
            }
            this.f57563g.getClickEventListener().onClick(i4, i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
