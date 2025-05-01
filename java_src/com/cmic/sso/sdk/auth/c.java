package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.cmic.sso.sdk.e.e;
import com.cmic.sso.sdk.e.g;
import com.cmic.sso.sdk.e.h;
import com.cmic.sso.sdk.e.j;
import com.cmic.sso.sdk.e.k;
import com.cmic.sso.sdk.e.m;
import com.cmic.sso.sdk.e.n;
import com.cmic.sso.sdk.e.o;
import com.cmic.sso.sdk.e.q;
import com.cmic.sso.sdk.e.r;
import com.qq.e.comm.pi.ACTD;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AuthnHelperCore.java */
/* loaded from: classes2.dex */
public class c {
    public static final String SDK_VERSION = "quick_login_android_5.9.1";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f  reason: collision with root package name */
    private static c f9146f;

    /* renamed from: a  reason: collision with root package name */
    protected final com.cmic.sso.sdk.auth.a f9147a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f9148b;

    /* renamed from: c  reason: collision with root package name */
    protected long f9149c;

    /* renamed from: d  reason: collision with root package name */
    protected final Handler f9150d;

    /* renamed from: e  reason: collision with root package name */
    protected String f9151e;

    /* renamed from: g  reason: collision with root package name */
    private final Object f9152g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AuthnHelperCore.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final com.cmic.sso.sdk.a f9180b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(com.cmic.sso.sdk.a aVar) {
            this.f9180b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject a5;
            if (!r.a(c.this.f9148b).a() && this.f9180b.b("doNetworkSwitch", false)) {
                a5 = d.a("102508", "数据网络切换失败");
            } else {
                a5 = d.a("200023", "登录超时");
            }
            c.this.callBackResult(a5.optString("resultCode", "200023"), a5.optString("resultString", "登录超时"), this.f9180b, a5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f9149c = 8000L;
        this.f9152g = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f9148b = applicationContext;
        this.f9150d = new Handler(applicationContext.getMainLooper());
        this.f9147a = com.cmic.sso.sdk.auth.a.a(applicationContext);
        r.a(applicationContext);
        k.a(applicationContext);
        j.a(applicationContext);
        n.a(new n.a() { // from class: com.cmic.sso.sdk.auth.c.1
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                String b5 = k.b("AID", "");
                com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "aid = " + b5);
                if (TextUtils.isEmpty(b5)) {
                    c.this.a();
                }
                if (com.cmic.sso.sdk.e.b.a(c.this.f9148b, true)) {
                    com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "生成androidkeystore成功");
                } else {
                    com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "生成androidkeystore失败");
                }
            }
        });
    }

    public static c getInstance(Context context) {
        if (f9146f == null) {
            synchronized (c.class) {
                if (f9146f == null) {
                    f9146f = new c(context);
                }
            }
        }
        return f9146f;
    }

    public static void setDebugMode(boolean z4) {
        com.cmic.sso.sdk.e.c.a(z4);
    }

    public void callBackResult(String str, String str2, com.cmic.sso.sdk.a aVar, JSONObject jSONObject) {
        final JSONObject a5;
        try {
            String b5 = aVar.b("traceId");
            final int b6 = aVar.b("SDKRequestCode", -1);
            if (e.a(b5)) {
                return;
            }
            synchronized (this) {
                final TokenListener c5 = e.c(b5);
                if (jSONObject == null || !jSONObject.optBoolean("keepListener", false)) {
                    e.b(b5);
                }
                if (c5 == null) {
                    return;
                }
                aVar.a("systemEndTime", SystemClock.elapsedRealtime());
                aVar.a("endtime", o.a());
                int c6 = aVar.c("logintype");
                if (jSONObject == null) {
                    jSONObject = d.a(str, str2);
                }
                if (c6 == 3) {
                    a5 = d.a(str, aVar, jSONObject);
                } else {
                    a5 = d.a(str, str2, aVar, jSONObject);
                }
                a5.put("scripExpiresIn", String.valueOf(h.a()));
                this.f9150d.post(new Runnable() { // from class: com.cmic.sso.sdk.auth.c.6
                    @Override // java.lang.Runnable
                    public void run() {
                        c5.onGetTokenComplete(b6, a5);
                    }
                });
                com.cmic.sso.sdk.a.c.a(this.f9148b).a(aVar);
                if (!aVar.b().j() && !q.a(aVar.b())) {
                    a(this.f9148b, str, aVar);
                }
                if (e.a()) {
                    r.a(this.f9148b).b();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void delScrip() {
        try {
            h.a(true, true);
            com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "删除scrip");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public JSONObject getNetworkType(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                boolean a5 = m.a(this.f9148b);
                com.cmic.sso.sdk.b.a.a().a(context, g.a(context, com.kuaishou.weapon.p0.g.f55583c), a5);
                String a6 = j.a().a((String) null);
                int a7 = m.a(context, a5);
                jSONObject.put("operatortype", a6);
                jSONObject.put("networktype", a7 + "");
                com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "网络类型: " + a7);
                com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "运营商类型: " + a6);
                return jSONObject;
            } catch (JSONException e5) {
                e5.printStackTrace();
                return jSONObject;
            }
        } catch (Exception unused) {
            jSONObject.put("errorDes", "发生未知错误");
            return jSONObject;
        }
    }

    public void getPhoneInfo(final String str, final String str2, final TokenListener tokenListener) {
        final com.cmic.sso.sdk.a a5 = a(tokenListener);
        n.a(new n.a(this.f9148b, a5) { // from class: com.cmic.sso.sdk.auth.c.4
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                if (c.this.a(a5, str, str2, "preGetMobile", 3, tokenListener)) {
                    c.this.a(a5);
                }
            }
        });
    }

    public void loginAuth(final String str, final String str2, final TokenListener tokenListener) {
        final com.cmic.sso.sdk.a a5 = a(tokenListener);
        n.a(new n.a(this.f9148b, a5) { // from class: com.cmic.sso.sdk.auth.c.2
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                if (c.this.a(a5, str, str2, "loginAuth", 1, tokenListener)) {
                    c.this.a(a5);
                }
            }
        });
    }

    public void mobileAuth(final String str, final String str2, final TokenListener tokenListener) {
        final com.cmic.sso.sdk.a a5 = a(tokenListener);
        n.a(new n.a(this.f9148b, a5) { // from class: com.cmic.sso.sdk.auth.c.3
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                if (c.this.a(a5, str, str2, "mobileAuth", 0, tokenListener)) {
                    c.this.a(a5);
                }
            }
        });
    }

    public void setOverTime(long j4) {
        this.f9149c = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        String str = "%" + q.b();
        com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "generate aid = " + str);
        k.a("AID", str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.cmic.sso.sdk.a a(TokenListener tokenListener) {
        com.cmic.sso.sdk.a aVar = new com.cmic.sso.sdk.a(64);
        String c5 = q.c();
        aVar.a(new com.cmic.sso.sdk.d.b());
        aVar.a("traceId", c5);
        com.cmic.sso.sdk.e.c.a("traceId", c5);
        if (tokenListener != null) {
            e.a(c5, tokenListener);
        }
        return aVar;
    }

    public static c getInstance(Context context, String str) {
        if (f9146f == null) {
            synchronized (c.class) {
                if (f9146f == null) {
                    f9146f = new c(context, str);
                }
            }
        }
        return f9146f;
    }

    private c(Context context, String str) {
        this(context);
        this.f9151e = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.cmic.sso.sdk.a aVar) {
        final a aVar2 = new a(aVar);
        this.f9150d.postDelayed(aVar2, this.f9149c);
        this.f9147a.a(aVar, new b() { // from class: com.cmic.sso.sdk.auth.c.5
            @Override // com.cmic.sso.sdk.auth.b
            public void a(String str, String str2, com.cmic.sso.sdk.a aVar3, JSONObject jSONObject) {
                c.this.f9150d.removeCallbacks(aVar2);
                c.this.callBackResult(str, str2, aVar3, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(com.cmic.sso.sdk.a aVar, String str, String str2, String str3, int i4, TokenListener tokenListener) {
        boolean a5;
        com.cmic.sso.sdk.a.a a6 = com.cmic.sso.sdk.a.c.a(this.f9148b).a();
        aVar.a(a6);
        aVar.a("use2048PublicKey", "rsa2048".equals(this.f9151e));
        aVar.a("systemStartTime", SystemClock.elapsedRealtime());
        aVar.a("starttime", o.a());
        aVar.a("loginMethod", str3);
        aVar.a("appkey", str2);
        aVar.a(ACTD.APPID_KEY, str);
        aVar.a("timeOut", String.valueOf(this.f9149c));
        boolean a7 = g.a(this.f9148b, com.kuaishou.weapon.p0.g.f55583c);
        com.cmic.sso.sdk.e.c.a("AuthnHelperCore", "有READ_PHONE_STATE权限？" + a7);
        aVar.a("hsaReadPhoneStatePermission", a7);
        boolean a8 = m.a(this.f9148b);
        com.cmic.sso.sdk.b.a.a().a(this.f9148b, a7, a8);
        aVar.a("networkClass", com.cmic.sso.sdk.b.a.a().a(this.f9148b));
        String b5 = j.a().b();
        String c5 = j.a().c();
        String a9 = j.a().a(c5);
        aVar.a("operator", c5);
        aVar.a("operatortype", a9);
        aVar.a("logintype", i4);
        com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "subId = " + b5);
        if (!TextUtils.isEmpty(b5)) {
            com.cmic.sso.sdk.e.c.a("AuthnHelperCore", "使用subId作为缓存key = " + b5);
            aVar.a("scripType", "subid");
            aVar.a("scripKey", b5);
        } else if (!TextUtils.isEmpty(c5)) {
            com.cmic.sso.sdk.e.c.a("AuthnHelperCore", "使用operator作为缓存key = " + c5);
            aVar.a("scripType", "operator");
            aVar.a("scripKey", c5);
        }
        int a10 = m.a(this.f9148b, a8);
        aVar.a("networktype", a10);
        if (!a8) {
            aVar.a("authType", String.valueOf(0));
            callBackResult("200010", "无法识别sim卡或没有sim卡", aVar, null);
            return false;
        } else if (tokenListener == null) {
            callBackResult("102203", "listener不能为空", aVar, null);
            return false;
        } else if (a6.g()) {
            callBackResult("200082", "服务器繁忙，请稍后重试", aVar, null);
            return false;
        } else {
            if (TextUtils.isEmpty(str == null ? "" : str.trim())) {
                callBackResult("102203", "appId 不能为空", aVar, null);
                return false;
            }
            if (TextUtils.isEmpty(str2 == null ? "" : str2.trim())) {
                callBackResult("102203", "appkey不能为空", aVar, null);
                return false;
            } else if (a10 == 0) {
                callBackResult("102101", "未检测到网络", aVar, null);
                return false;
            } else if ("2".equals(a9) && a6.f()) {
                callBackResult("200082", "服务器繁忙，请稍后重试", aVar, null);
                return false;
            } else if ("3".equals(a9) && a6.e()) {
                callBackResult("200082", "服务器繁忙，请稍后重试", aVar, null);
                return false;
            } else {
                synchronized (this.f9152g) {
                    a5 = h.a(aVar);
                    if (a5) {
                        aVar.a("securityphone", k.b("securityphone", ""));
                        if (3 != i4) {
                            String a11 = h.a(this.f9148b);
                            StringBuilder sb = new StringBuilder();
                            sb.append("解密phoneScript ");
                            sb.append(!TextUtils.isEmpty(a11));
                            com.cmic.sso.sdk.e.c.b("AuthnHelperCore", sb.toString());
                            if (TextUtils.isEmpty(a11)) {
                                a5 = false;
                            } else {
                                aVar.a("phonescrip", a11);
                            }
                            h.a(true, false);
                        }
                    }
                    aVar.a("isCacheScrip", a5);
                    com.cmic.sso.sdk.e.c.b("AuthnHelperCore", "isCachePhoneScrip = " + a5);
                }
                if (a10 != 2 || a5) {
                    return true;
                }
                callBackResult("102103", "无数据网络", aVar, null);
                return false;
            }
        }
    }

    private void a(final Context context, final String str, final com.cmic.sso.sdk.a aVar) {
        n.a(new n.a() { // from class: com.cmic.sso.sdk.auth.c.7
            @Override // com.cmic.sso.sdk.e.n.a
            protected void a() {
                if ("200023".equals(str)) {
                    SystemClock.sleep(8000L);
                }
                new com.cmic.sso.sdk.d.d().a(context, str, aVar);
            }
        });
    }
}
