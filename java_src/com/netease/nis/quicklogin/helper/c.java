package com.netease.nis.quicklogin.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.ResultListener;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.QuickLogin;
import com.netease.nis.quicklogin.entity.CTPrefetchNumber;
import com.netease.nis.quicklogin.listener.QuickLoginPreMobileListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.ui.YDQuickLoginActivity;
import com.netease.nis.quicklogin.utils.e;
import com.netease.nis.quicklogin.utils.g;
import org.json.JSONObject;
/* compiled from: CtLoginHelper.java */
/* loaded from: classes5.dex */
public class c extends com.netease.nis.quicklogin.helper.a {

    /* renamed from: b  reason: collision with root package name */
    private String f57536b;

    /* renamed from: c  reason: collision with root package name */
    private String f57537c;

    /* renamed from: d  reason: collision with root package name */
    private String f57538d;

    /* renamed from: e  reason: collision with root package name */
    private String f57539e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f57540f;

    /* compiled from: CtLoginHelper.java */
    /* loaded from: classes5.dex */
    class a implements ResultListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuickLoginPreMobileListener f57541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f57542b;

        a(QuickLoginPreMobileListener quickLoginPreMobileListener, String str) {
            this.f57541a = quickLoginPreMobileListener;
            this.f57542b = str;
        }

        @Override // cn.com.chinatelecom.account.api.ResultListener
        public void onResult(String str) {
            Logger.d("prefetchMobileNumber [callback]" + str);
            Logger.d("prefetchMobileNumber [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
            CTPrefetchNumber cTPrefetchNumber = (CTPrefetchNumber) com.netease.nis.quicklogin.utils.a.a(str, CTPrefetchNumber.class);
            if (cTPrefetchNumber != null) {
                int result = cTPrefetchNumber.getResult();
                String msg = cTPrefetchNumber.getMsg();
                if (result == 0) {
                    c.this.f57537c = cTPrefetchNumber.getData().getAccessCode();
                    c.this.f57536b = cTPrefetchNumber.getData().getNumber();
                    c.this.f57538d = cTPrefetchNumber.getData().getGwAuth();
                    e.a(c.this.f57540f, "timeend", System.currentTimeMillis() + TTAdConstant.AD_MAX_EVENT_TIME);
                    e.a(c.this.f57540f, "ctccNumber", c.this.f57536b);
                    e.a(c.this.f57540f, "ctccAccessCode", c.this.f57537c);
                    e.a(c.this.f57540f, "ctccGwAuth", c.this.f57538d);
                    QuickLoginPreMobileListener quickLoginPreMobileListener = this.f57541a;
                    if (quickLoginPreMobileListener != null) {
                        quickLoginPreMobileListener.onGetMobileNumberSuccess(this.f57542b, c.this.f57536b);
                        return;
                    }
                    return;
                }
                c cVar = c.this;
                cVar.f57539e = "msg:" + msg + " reqId:" + cTPrefetchNumber.getReqId();
                StringBuilder sb = new StringBuilder();
                sb.append("电信 prefetchMobileNumber [error]");
                sb.append(c.this.f57539e);
                Logger.d(sb.toString());
                QuickLoginPreMobileListener quickLoginPreMobileListener2 = this.f57541a;
                if (quickLoginPreMobileListener2 != null) {
                    try {
                        String str2 = this.f57542b;
                        quickLoginPreMobileListener2.onGetMobileNumberError(str2, "电信" + c.this.f57539e);
                    } catch (Exception e5) {
                        Logger.e(e5.getMessage());
                    }
                }
                c.this.a(this.f57542b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), result, str);
                return;
            }
            Logger.d("电信 prefetchMobileNumber [error]" + str);
            QuickLoginPreMobileListener quickLoginPreMobileListener3 = this.f57541a;
            if (quickLoginPreMobileListener3 != null) {
                try {
                    String str3 = this.f57542b;
                    quickLoginPreMobileListener3.onGetMobileNumberError(str3, "电信" + str);
                } catch (Exception e6) {
                    Logger.e(e6.getMessage());
                }
            }
            c.this.a(this.f57542b, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), 0, str);
        }
    }

    public c(Context context, String str, String str2, boolean z4) {
        if (z4) {
            CtAuth.getInstance().init(context, str, str2, null);
        }
        this.f57540f = context;
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(String str, QuickLoginPreMobileListener quickLoginPreMobileListener) {
        if (!TextUtils.isEmpty(e.b(this.f57540f, "ctccAccessCode")) && System.currentTimeMillis() < e.a(this.f57540f, "timeend")) {
            this.f57537c = e.b(this.f57540f, "ctccAccessCode");
            this.f57536b = e.b(this.f57540f, "ctccNumber");
            this.f57538d = e.b(this.f57540f, "ctccGwAuth");
            if (quickLoginPreMobileListener != null) {
                quickLoginPreMobileListener.onGetMobileNumberSuccess(str, this.f57536b);
            }
            Logger.d("prefetchMobileNumber [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
            return;
        }
        CtAuth.getInstance().requestPreLogin(new CtSetting(5000, 5000, QuickLogin.prefetchNumberTimeout * 1000), new a(quickLoginPreMobileListener, str));
    }

    @Override // com.netease.nis.quicklogin.helper.a
    public void a(String str, QuickLoginTokenListener quickLoginTokenListener) {
        if (TextUtils.isEmpty(this.f57537c) || TextUtils.isEmpty(this.f57538d)) {
            if (quickLoginTokenListener != null) {
                try {
                    quickLoginTokenListener.onGetTokenError(str, "电信" + this.f57539e);
                    return;
                } catch (Exception e5) {
                    Logger.e(e5.getMessage());
                    return;
                }
            }
            return;
        }
        Intent intent = new Intent(this.f57540f, YDQuickLoginActivity.class);
        intent.putExtra("operatorType", "ct");
        intent.putExtra("ydToken", str);
        intent.putExtra("maskNumber", this.f57536b);
        intent.putExtra("accessToken", this.f57537c);
        intent.putExtra("gwAuth", this.f57538d);
        if (quickLoginTokenListener != null) {
            YDQuickLoginActivity.a(quickLoginTokenListener);
        }
        intent.addFlags(268435456);
        this.f57540f.startActivity(intent);
    }

    @Override // com.netease.nis.quicklogin.helper.a
    protected void a(String str, String str2, QuickLoginTokenListener quickLoginTokenListener) {
        try {
            Logger.d("getToken [callback]" + str);
            Logger.d("getToken [time]" + (System.currentTimeMillis() - QuickLogin.prefetchDataStartTime) + "ms");
            JSONObject jSONObject = new JSONObject(str);
            int i4 = jSONObject.getInt("result");
            if (i4 == 0) {
                String string = jSONObject.getString("data");
                if (quickLoginTokenListener != null) {
                    quickLoginTokenListener.onGetTokenSuccess(str2, string);
                    return;
                }
                return;
            }
            if (quickLoginTokenListener != null) {
                try {
                    quickLoginTokenListener.onGetTokenError(str2, "电信 getToken failed:" + jSONObject.toString());
                } catch (Exception e5) {
                    Logger.e(e5.getMessage());
                }
            }
            a(str2, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), i4, jSONObject.toString());
        } catch (Exception e6) {
            Logger.e(e6.getMessage());
            a(str2, com.netease.nis.quicklogin.b.b.SDK_INTERNAL_EXCEPTION.ordinal(), 0, e6.toString());
        }
    }

    @Override // com.netease.nis.quicklogin.helper.a
    protected void a(int i4, String str, String str2, QuickLoginTokenListener quickLoginTokenListener) {
        if (quickLoginTokenListener != null) {
            try {
                quickLoginTokenListener.onGetTokenError(str2, str);
            } catch (Exception e5) {
                Logger.e(e5.getMessage());
            }
        }
        a(str2, com.netease.nis.quicklogin.b.b.RETURN_DATA_ERROR.ordinal(), i4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i4, int i5, String str2) {
        g.c().a(g.c.MONITOR_GET_TOKEN, i4, str, 1, i5, 0, str2, System.currentTimeMillis());
        g.c().d();
    }
}
