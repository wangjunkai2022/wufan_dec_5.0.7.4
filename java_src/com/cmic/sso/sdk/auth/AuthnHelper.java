package com.cmic.sso.sdk.auth;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cmic.sso.sdk.auth.c;
import com.cmic.sso.sdk.e.e;
import com.cmic.sso.sdk.e.h;
import com.cmic.sso.sdk.e.n;
import com.cmic.sso.sdk.view.AuthThemeConfig;
import com.cmic.sso.sdk.view.LoginPageInListener;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AuthnHelper extends c {

    /* renamed from: f  reason: collision with root package name */
    private static AuthnHelper f9120f;

    /* renamed from: g  reason: collision with root package name */
    private AuthThemeConfig f9121g;

    /* renamed from: h  reason: collision with root package name */
    private LoginPageInListener f9122h;

    private AuthnHelper(Context context) {
        super(context);
        this.f9122h = null;
    }

    public static AuthnHelper getInstance(Context context) {
        if (f9120f == null) {
            synchronized (AuthnHelper.class) {
                if (f9120f == null) {
                    f9120f = new AuthnHelper(context);
                }
            }
        }
        return f9120f;
    }

    public AuthThemeConfig getAuthThemeConfig() {
        if (this.f9121g == null) {
            this.f9121g = new AuthThemeConfig.Builder().build();
        }
        return this.f9121g;
    }

    public long getOverTime() {
        return this.f9149c;
    }

    @Override // com.cmic.sso.sdk.auth.c
    public void getPhoneInfo(String str, String str2, TokenListener tokenListener) {
        getPhoneInfo(str, str2, tokenListener, -1);
    }

    @Override // com.cmic.sso.sdk.auth.c
    public void loginAuth(String str, String str2, TokenListener tokenListener) {
        loginAuth(str, str2, tokenListener, -1);
    }

    public void loginPageInCallBack(String str, JSONObject jSONObject) {
        LoginPageInListener loginPageInListener = this.f9122h;
        if (loginPageInListener != null) {
            loginPageInListener.onLoginPageInComplete(str, jSONObject);
        }
    }

    @Override // com.cmic.sso.sdk.auth.c
    public void mobileAuth(String str, String str2, TokenListener tokenListener) {
        mobileAuth(str, str2, tokenListener, -1);
    }

    public void quitAuthActivity() {
        try {
            if (com.cmic.sso.sdk.view.a.a().b() != null) {
                com.cmic.sso.sdk.view.a.a().b().a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            com.cmic.sso.sdk.e.c.a("AuthnHelper", "关闭授权页失败");
        }
    }

    public void setAuthThemeConfig(AuthThemeConfig authThemeConfig) {
        this.f9121g = authThemeConfig;
    }

    public void setPageInListener(LoginPageInListener loginPageInListener) {
        this.f9122h = loginPageInListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, com.cmic.sso.sdk.a aVar) {
        String b5 = aVar.b("traceId");
        Intent intent = new Intent();
        intent.putExtra("traceId", b5);
        e.a(aVar.b("traceId"), aVar);
        intent.setClassName(context, "com.cmic.sso.sdk.view.LoginAuthActivity");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public void getPhoneInfo(final String str, final String str2, final TokenListener tokenListener, int i4) {
        final com.cmic.sso.sdk.a a5 = a(tokenListener);
        a5.a("SDKRequestCode", i4);
        n.a(new n.a(this.f9148b, a5) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.1
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                if (AuthnHelper.this.a(a5, str, str2, "preGetMobile", 3, tokenListener)) {
                    AuthnHelper.super.a(a5);
                }
            }
        });
    }

    public void loginAuth(final String str, final String str2, final TokenListener tokenListener, int i4) {
        final com.cmic.sso.sdk.a a5 = a(tokenListener);
        a5.a("SDKRequestCode", i4);
        n.a(new n.a(this.f9148b, a5) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.2
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                if (AuthnHelper.this.a(a5, str, str2, "loginAuth", 3, tokenListener)) {
                    String a6 = h.a(AuthnHelper.this.f9148b);
                    if (!TextUtils.isEmpty(a6)) {
                        a5.a("phonescrip", a6);
                    }
                    AuthnHelper.this.a(a5);
                }
            }
        });
    }

    public void mobileAuth(final String str, final String str2, final TokenListener tokenListener, int i4) {
        final com.cmic.sso.sdk.a a5 = a(tokenListener);
        a5.a("SDKRequestCode", i4);
        n.a(new n.a(this.f9148b, a5) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.3
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                if (AuthnHelper.this.a(a5, str, str2, "mobileAuth", 0, tokenListener)) {
                    AuthnHelper.super.a(a5);
                }
            }
        });
    }

    private AuthnHelper(Context context, String str) {
        super(context);
        this.f9122h = null;
        this.f9151e = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.cmic.sso.sdk.auth.c
    public void a(com.cmic.sso.sdk.a aVar) {
        final c.a aVar2 = new c.a(aVar);
        this.f9150d.postDelayed(aVar2, this.f9149c);
        this.f9147a.a(aVar, new b() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.4
            @Override // com.cmic.sso.sdk.auth.b
            public void a(String str, String str2, com.cmic.sso.sdk.a aVar3, JSONObject jSONObject) {
                com.cmic.sso.sdk.e.c.b("onBusinessComplete", "onBusinessComplete");
                AuthnHelper.this.f9150d.removeCallbacks(aVar2);
                if ("103000".equals(str) && !e.a(aVar3.b("traceId"))) {
                    AuthnHelper.b(AuthnHelper.this.f9148b, aVar3);
                } else {
                    AuthnHelper.this.callBackResult(str, str2, aVar3, jSONObject);
                }
            }
        });
    }

    public static AuthnHelper getInstance(Context context, String str) {
        if (f9120f == null) {
            synchronized (AuthnHelper.class) {
                if (f9120f == null) {
                    f9120f = new AuthnHelper(context, str);
                }
            }
        }
        return f9120f;
    }
}
