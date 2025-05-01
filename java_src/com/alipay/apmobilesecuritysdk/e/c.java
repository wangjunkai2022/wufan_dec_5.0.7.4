package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class c {
    public static d a(Context context) {
        if (context == null) {
            return null;
        }
        String a5 = com.alipay.apmobilesecuritysdk.f.c.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (com.alipay.security.mobile.module.commonutils.a.b(a5)) {
            a5 = com.alipay.apmobilesecuritysdk.f.c.b("device_feature_file_name", "device_feature_file_key");
        }
        if (com.alipay.security.mobile.module.commonutils.a.b(a5)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a5);
            d dVar = new d();
            dVar.f4652a = jSONObject.getString("imei");
            dVar.f4653b = jSONObject.getString("imsi");
            dVar.f4654c = jSONObject.getString("mac");
            dVar.f4655d = jSONObject.getString("bluetoothmac");
            dVar.f4656e = jSONObject.getString("gsi");
            return dVar;
        } catch (Exception e5) {
            com.alipay.security.mobile.module.commonutils.d.c(e5);
            return null;
        }
    }
}
