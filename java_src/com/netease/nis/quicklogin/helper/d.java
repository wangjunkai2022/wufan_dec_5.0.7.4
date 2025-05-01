package com.netease.nis.quicklogin.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.QuickLogin;
import com.netease.nis.quicklogin.listener.QuickLoginPreMobileListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.ui.YDQuickLoginActivity;
import com.netease.nis.quicklogin.utils.g;
import com.sdk.Unicorn.base.api.CallBack;
import com.sdk.Unicorn.base.api.ToolUtils;
import com.sdk.Unicorn.base.module.manager.SDKManager;
import com.sdk.Unicorn.mobile.manager.oauth.cucc.OauthManager;
import com.sdk.Unicorn.mobile.manager.oauth.login.cucc.UiOauthManager;
import org.json.JSONObject;
/* compiled from: CuLoginHelper.java */
/* loaded from: classes5.dex */
public class d extends com.netease.nis.quicklogin.helper.a {

    /* renamed from: b  reason: collision with root package name */
    private final Context f57544b;

    /* renamed from: c  reason: collision with root package name */
    private String f57545c;

    /* renamed from: d  reason: collision with root package name */
    private Object f57546d;

    /* compiled from: CuLoginHelper.java */
    /* loaded from: classes5.dex */
    class a implements CallBack<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginPreMobileListener f57547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57548b;

        a(QuickLoginPreMobileListener quickLoginPreMobileListener, String str) {
            this.f57547a = quickLoginPreMobileListener;
            this.f57548b = str;
        }

        @Override // com.sdk.Unicorn.base.api.CallBack
        /* renamed from: a */
        public void onSuccess(int i4, String str, int i5, String str2, String str3) {
            Logger.d("prefetchMobileNumber [callback]" + i4);
            Logger.d("prefetchMobileNumber [callback]" + str);
            Logger.d("prefetchMobileNumber [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
            if (i4 == 0) {
                d.this.f57546d = str2;
                String str4 = null;
                try {
                    JSONObject jSONObject = new JSONObject(d.this.f57546d.toString());
                    Logger.d("prefetchMobileNumber [callback]" + jSONObject.toString());
                    str4 = jSONObject.getString("fakeMobile");
                } catch (Exception e5) {
                    Logger.e("联通获取掩码失败" + e5.getMessage());
                }
                QuickLoginPreMobileListener quickLoginPreMobileListener = this.f57547a;
                if (quickLoginPreMobileListener != null) {
                    try {
                        String str5 = this.f57548b;
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "联通无法直接获取掩码";
                        }
                        quickLoginPreMobileListener.onGetMobileNumberSuccess(str5, str4);
                        return;
                    } catch (Exception e6) {
                        Logger.e(e6.getMessage());
                        return;
                    }
                }
                return;
            }
            d dVar = d.this;
            dVar.f57545c = "msg:" + str + " seq:" + str3;
            StringBuilder sb = new StringBuilder();
            sb.append("联通 prefetchMobileNumber [error]");
            sb.append(d.this.f57545c);
            Logger.d(sb.toString());
            QuickLoginPreMobileListener quickLoginPreMobileListener2 = this.f57547a;
            if (quickLoginPreMobileListener2 != null) {
                try {
                    String str6 = this.f57548b;
                    quickLoginPreMobileListener2.onGetMobileNumberError(str6, "联通" + d.this.f57545c);
                } catch (Exception e7) {
                    Logger.e(e7.getMessage());
                }
            }
            d.this.a(this.f57548b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), i5, d.this.f57545c);
        }

        @Override // com.sdk.Unicorn.base.api.CallBack
        public void onFailed(int i4, int i5, String str, String str2) {
            d dVar = d.this;
            dVar.f57545c = "msg:" + str + " seq:" + str2;
            StringBuilder sb = new StringBuilder();
            sb.append("联通 prefetchMobileNumber [error]");
            sb.append(d.this.f57545c);
            Logger.e(sb.toString());
            QuickLoginPreMobileListener quickLoginPreMobileListener = this.f57547a;
            if (quickLoginPreMobileListener != null) {
                try {
                    String str3 = this.f57548b;
                    quickLoginPreMobileListener.onGetMobileNumberError(str3, "联通" + d.this.f57545c);
                } catch (Exception e5) {
                    Logger.e(e5.getMessage());
                }
            }
            d.this.a(this.f57548b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), i5, d.this.f57545c);
        }
    }

    /* compiled from: CuLoginHelper.java */
    /* loaded from: classes5.dex */
    class b implements CallBack<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginTokenListener f57550a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57551b;

        b(QuickLoginTokenListener quickLoginTokenListener, String str) {
            this.f57550a = quickLoginTokenListener;
            this.f57551b = str;
        }

        @Override // com.sdk.Unicorn.base.api.CallBack
        public void onFailed(int i4, int i5, String str, String str2) {
            String str3 = "msg:" + str + " seq:" + str2;
            this.f57550a.onGetTokenError(this.f57551b, "联通" + str3);
            d.this.a(this.f57551b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), i5, str3);
        }

        @Override // com.sdk.Unicorn.base.api.CallBack
        public void onSuccess(int i4, String str, int i5, Object obj, String str2) {
            if (i4 == 0) {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    Logger.d("getToken [callback]" + jSONObject.toString());
                    Logger.d("getToken [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
                    String optString = jSONObject.optString("accessCode");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("accessToken", optString);
                    jSONObject2.put("version", "v2");
                    jSONObject2.put("md5", ToolUtils.getAppMd5(d.this.f57544b));
                    QuickLoginTokenListener quickLoginTokenListener = this.f57550a;
                    if (quickLoginTokenListener != null) {
                        quickLoginTokenListener.onGetTokenSuccess(this.f57551b, com.netease.nis.quicklogin.utils.a.a(jSONObject2.toString()));
                        return;
                    }
                    return;
                } catch (Exception e5) {
                    Logger.e(e5.getMessage());
                    d.this.a(this.f57551b, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), i5, e5.toString());
                    return;
                }
            }
            QuickLoginTokenListener quickLoginTokenListener2 = this.f57550a;
            if (quickLoginTokenListener2 != null) {
                String str3 = this.f57551b;
                quickLoginTokenListener2.onGetTokenError(str3, "联通" + str);
            }
            d.this.a(this.f57551b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), i5, str);
        }
    }

    public d(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f57544b = applicationContext;
        SDKManager.init(applicationContext, str2, str);
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(String str, QuickLoginPreMobileListener quickLoginPreMobileListener) {
        UiOauthManager.getInstance(this.f57544b).login(QuickLogin.prefetchNumberTimeout, new a(quickLoginPreMobileListener, str));
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(String str, QuickLoginTokenListener quickLoginTokenListener) {
        if (this.f57546d == null) {
            if (quickLoginTokenListener != null) {
                quickLoginTokenListener.onGetTokenError(str, "联通" + this.f57545c);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f57546d.toString());
            String string = jSONObject.getString("fakeMobile");
            String string2 = jSONObject.getString("accessCode");
            Intent intent = new Intent(this.f57544b, YDQuickLoginActivity.class);
            intent.putExtra("operatorType", "cu");
            intent.putExtra("ydToken", str);
            intent.putExtra("maskNumber", string);
            intent.putExtra("accessToken", string2);
            if (quickLoginTokenListener != null) {
                YDQuickLoginActivity.a(quickLoginTokenListener);
            }
            intent.addFlags(268435456);
            this.f57544b.startActivity(intent);
        } catch (Exception e5) {
            Logger.e(e5.getMessage());
        }
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(Context context, String str, String str2, QuickLoginTokenListener quickLoginTokenListener) {
        ToolUtils.clearCache(context);
        OauthManager.getInstance(context).getAuthoriseCode(QuickLogin.fetchNumberTimeout, new b(quickLoginTokenListener, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i4, int i5, String str2) {
        g.c().a(g.c.MONITOR_GET_TOKEN, i4, str, 3, i5, 0, str2, System.currentTimeMillis());
        g.c().d();
    }
}
