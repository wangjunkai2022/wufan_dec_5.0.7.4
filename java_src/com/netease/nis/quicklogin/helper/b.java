package com.netease.nis.quicklogin.helper;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.auth.TokenListener;
import com.kuaishou.weapon.p0.bi;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.QuickLogin;
import com.netease.nis.quicklogin.entity.CMPrefetchNumber;
import com.netease.nis.quicklogin.listener.QuickLoginPreMobileListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.utils.e;
import com.netease.nis.quicklogin.utils.g;
import org.json.JSONObject;
/* compiled from: CmLoginHelper.java */
/* loaded from: classes5.dex */
public class b extends com.netease.nis.quicklogin.helper.a {

    /* renamed from: b  reason: collision with root package name */
    private final AuthnHelper f57523b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57524c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57525d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f57526e;

    /* compiled from: CmLoginHelper.java */
    /* loaded from: classes5.dex */
    class a implements TokenListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginPreMobileListener f57527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57528b;

        a(QuickLoginPreMobileListener quickLoginPreMobileListener, String str) {
            this.f57527a = quickLoginPreMobileListener;
            this.f57528b = str;
        }

        @Override // com.cmic.sso.sdk.auth.TokenListener
        public void onGetTokenComplete(int i4, JSONObject jSONObject) {
            Logger.d("prefetchMobileNumber [callback]" + jSONObject.toString());
            Logger.d("prefetchMobileNumber [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
            CMPrefetchNumber cMPrefetchNumber = (CMPrefetchNumber) com.netease.nis.quicklogin.utils.a.a(jSONObject.toString(), CMPrefetchNumber.class);
            if (cMPrefetchNumber != null) {
                String desc = cMPrefetchNumber.getDesc();
                if ("true".equals(desc)) {
                    e.a(b.this.f57526e, "timeend", System.currentTimeMillis() + bi.f55326s);
                    e.a(b.this.f57526e, "cmccAppid", b.this.f57524c);
                    e.a(b.this.f57526e, "cmccAppkey", b.this.f57525d);
                    e.a(b.this.f57526e, "phone", cMPrefetchNumber.getSecurityphone());
                    QuickLoginPreMobileListener quickLoginPreMobileListener = this.f57527a;
                    if (quickLoginPreMobileListener != null) {
                        try {
                            quickLoginPreMobileListener.onGetMobileNumberSuccess(this.f57528b, cMPrefetchNumber.getSecurityphone());
                            return;
                        } catch (Exception e5) {
                            Logger.e(e5.getMessage());
                            return;
                        }
                    }
                    return;
                }
                String str = "result code:" + cMPrefetchNumber.getResultCode() + " desc:" + desc + " scripExpiresIn:" + cMPrefetchNumber.getScripExpiresIn();
                Logger.d("移动 prefetchMobileNumber [error]" + str);
                QuickLoginPreMobileListener quickLoginPreMobileListener2 = this.f57527a;
                if (quickLoginPreMobileListener2 != null) {
                    try {
                        quickLoginPreMobileListener2.onGetMobileNumberError(this.f57528b, "移动 prefetchMobileNumber failed:" + str);
                    } catch (Exception e6) {
                        Logger.e(e6.getMessage());
                    }
                }
                b.this.a(this.f57528b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), com.netease.nis.quicklogin.utils.a.b(cMPrefetchNumber.getResultCode()), str);
                return;
            }
            Logger.d("移动 prefetchMobileNumber [error]" + jSONObject.toString());
            QuickLoginPreMobileListener quickLoginPreMobileListener3 = this.f57527a;
            if (quickLoginPreMobileListener3 != null) {
                try {
                    quickLoginPreMobileListener3.onGetMobileNumberError(this.f57528b, "移动 prefetchMobileNumber failed:" + jSONObject.toString());
                } catch (Exception e7) {
                    Logger.e(e7.getMessage());
                }
            }
            b.this.a(this.f57528b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), 0, jSONObject.toString());
        }
    }

    /* compiled from: CmLoginHelper.java */
    /* renamed from: com.netease.nis.quicklogin.helper.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0571b implements TokenListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginTokenListener f57530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57531b;

        C0571b(QuickLoginTokenListener quickLoginTokenListener, String str) {
            this.f57530a = quickLoginTokenListener;
            this.f57531b = str;
        }

        @Override // com.cmic.sso.sdk.auth.TokenListener
        public void onGetTokenComplete(int i4, JSONObject jSONObject) {
            QuickLoginTokenListener quickLoginTokenListener;
            String str;
            Logger.d("onePass [callback]" + jSONObject.toString());
            try {
                String string = jSONObject.getString("resultCode");
                if (string.equals("103000")) {
                    String string2 = jSONObject.getString("token");
                    if (this.f57530a != null) {
                        String str2 = null;
                        try {
                            str = com.netease.nis.quicklogin.utils.d.a();
                        } catch (Exception e5) {
                            e = e5;
                            str = null;
                        }
                        try {
                            str2 = com.netease.nis.quicklogin.utils.d.a(b.this.f57526e);
                        } catch (Exception e6) {
                            e = e6;
                            Logger.e(e.getMessage());
                            e.a(b.this.f57526e, "timeend", 0L);
                            this.f57530a.onGetTokenSuccess(this.f57531b, b.this.a(str, string2, str2));
                            if (string.equals("200020")) {
                                return;
                            }
                            return;
                        }
                        e.a(b.this.f57526e, "timeend", 0L);
                        this.f57530a.onGetTokenSuccess(this.f57531b, b.this.a(str, string2, str2));
                    }
                } else if (!string.equals("200020")) {
                    QuickLoginTokenListener quickLoginTokenListener2 = this.f57530a;
                    if (quickLoginTokenListener2 != null) {
                        try {
                            quickLoginTokenListener2.onGetTokenError(this.f57531b, "移动" + jSONObject.toString());
                        } catch (Exception e7) {
                            Logger.e(e7.getMessage());
                        }
                    }
                    b.this.a(this.f57531b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), com.netease.nis.quicklogin.utils.a.b(string), jSONObject.toString());
                }
                if (string.equals("200020") || (quickLoginTokenListener = this.f57530a) == null) {
                    return;
                }
                quickLoginTokenListener.onCancelGetToken();
            } catch (Exception e8) {
                Logger.e(e8.getMessage());
                b.this.a(this.f57531b, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, e8.toString());
            }
        }
    }

    /* compiled from: CmLoginHelper.java */
    /* loaded from: classes5.dex */
    class c implements TokenListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginTokenListener f57533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57534b;

        c(QuickLoginTokenListener quickLoginTokenListener, String str) {
            this.f57533a = quickLoginTokenListener;
            this.f57534b = str;
        }

        @Override // com.cmic.sso.sdk.auth.TokenListener
        public void onGetTokenComplete(int i4, JSONObject jSONObject) {
            try {
                Logger.d("getToken [callback]" + jSONObject.toString());
                Logger.d("getToken [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
                String string = jSONObject.getString("resultCode");
                if (string.equals("103000")) {
                    String string2 = jSONObject.getString("token");
                    QuickLoginTokenListener quickLoginTokenListener = this.f57533a;
                    if (quickLoginTokenListener != null) {
                        quickLoginTokenListener.onGetTokenSuccess(this.f57534b, string2);
                        return;
                    }
                    return;
                }
                QuickLoginTokenListener quickLoginTokenListener2 = this.f57533a;
                if (quickLoginTokenListener2 != null) {
                    try {
                        String str = this.f57534b;
                        quickLoginTokenListener2.onGetTokenError(str, "移动" + jSONObject.toString());
                    } catch (Exception e5) {
                        Logger.e(e5.getMessage());
                    }
                }
                b.this.a(this.f57534b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), com.netease.nis.quicklogin.utils.a.b(string), jSONObject.toString());
            } catch (Exception e6) {
                Logger.e(e6.getMessage());
                b.this.a(this.f57534b, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, e6.toString());
            }
        }
    }

    public b(Context context, String str, String str2) {
        AuthnHelper authnHelper = AuthnHelper.getInstance(context);
        this.f57523b = authnHelper;
        this.f57525d = str;
        this.f57524c = str2;
        this.f57526e = context;
        authnHelper.setOverTime(QuickLogin.prefetchNumberTimeout * 1000);
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(String str, QuickLoginPreMobileListener quickLoginPreMobileListener) {
        if (e.b(this.f57526e, "cmccAppid").equals(this.f57524c) && e.b(this.f57526e, "cmccAppkey").equals(this.f57525d) && System.currentTimeMillis() < e.a(this.f57526e, "timeend")) {
            if (quickLoginPreMobileListener != null) {
                quickLoginPreMobileListener.onGetMobileNumberSuccess(str, e.b(this.f57526e, "phone"));
            }
            Logger.d("prefetchMobileNumber [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
            return;
        }
        this.f57523b.getPhoneInfo(this.f57524c, this.f57525d, new a(quickLoginPreMobileListener, str));
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(String str, QuickLoginTokenListener quickLoginTokenListener) {
        this.f57523b.loginAuth(this.f57524c, this.f57525d, new C0571b(quickLoginTokenListener, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accessToken", str2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("deviceId", str);
            }
            jSONObject.put("phone", e.b(this.f57526e, "phone"));
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("randomId", str3);
            }
            return (TextUtils.isEmpty(com.netease.nis.quicklogin.b.a.f57425a) || TextUtils.isEmpty(com.netease.nis.quicklogin.b.a.f57426b)) ? str2 : com.netease.nis.quicklogin.utils.c.b(jSONObject.toString(), com.netease.nis.quicklogin.b.a.f57425a, com.netease.nis.quicklogin.b.a.f57426b);
        } catch (Exception e5) {
            Logger.e(e5.getMessage());
            return str2;
        }
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(Context context, String str, String str2, QuickLoginTokenListener quickLoginTokenListener) {
        this.f57523b.mobileAuth(this.f57524c, this.f57525d, new c(quickLoginTokenListener, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i4, int i5, String str2) {
        g.c().a(g.c.MONITOR_GET_TOKEN, i4, str, 2, i5, 0, str2, System.currentTimeMillis());
        g.c().d();
    }
}
