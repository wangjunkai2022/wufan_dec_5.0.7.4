package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import com.umeng.umcrash.UMCrash;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {
    public static synchronized b a() {
        synchronized (a.class) {
            String b5 = com.alipay.apmobilesecuritysdk.f.c.b("wxcasxx_v3", "wxcasxx");
            if (com.alipay.security.mobile.module.commonutils.a.b(b5)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(b5);
                return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("token"), jSONObject.optString(UMCrash.SP_KEY_TIMESTAMP));
            } catch (Exception e5) {
                com.alipay.security.mobile.module.commonutils.d.c(e5);
                return null;
            }
        }
    }

    public static synchronized b b(Context context) {
        synchronized (a.class) {
            String e5 = e(context);
            if (com.alipay.security.mobile.module.commonutils.a.b(e5)) {
                e5 = com.alipay.apmobilesecuritysdk.f.c.b("wxcasxx_v3", "wxcasxx");
            }
            if (com.alipay.security.mobile.module.commonutils.a.b(e5)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(e5);
                return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("token"), jSONObject.optString(UMCrash.SP_KEY_TIMESTAMP));
            } catch (Exception e6) {
                com.alipay.security.mobile.module.commonutils.d.c(e6);
                return null;
            }
        }
    }

    public static synchronized void c(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f4648a);
                jSONObject.put("deviceInfoHash", bVar.f4649b);
                jSONObject.put("token", bVar.f4650c);
                jSONObject.put(UMCrash.SP_KEY_TIMESTAMP, bVar.f4651d);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.c.c(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.c.d("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (JSONException e5) {
                com.alipay.security.mobile.module.commonutils.d.c(e5);
            }
        }
    }

    public static synchronized b d(Context context) {
        synchronized (a.class) {
            String e5 = e(context);
            if (com.alipay.security.mobile.module.commonutils.a.b(e5)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(e5);
                return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("token"), jSONObject.optString(UMCrash.SP_KEY_TIMESTAMP));
            } catch (Exception e6) {
                com.alipay.security.mobile.module.commonutils.d.c(e6);
                return null;
            }
        }
    }

    private static String e(Context context) {
        return com.alipay.apmobilesecuritysdk.f.c.a(context, "vkeyid_profiles_v3", "deviceid");
    }
}
