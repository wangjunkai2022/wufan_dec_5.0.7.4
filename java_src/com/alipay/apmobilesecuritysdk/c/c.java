package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class c {
    public static Map<String, String> a(Context context) {
        com.alipay.security.mobile.module.deviceinfo.c a5 = com.alipay.security.mobile.module.deviceinfo.c.a();
        HashMap hashMap = new HashMap();
        com.alipay.apmobilesecuritysdk.e.d a6 = com.alipay.apmobilesecuritysdk.e.c.a(context);
        String b5 = com.alipay.security.mobile.module.deviceinfo.c.b(context);
        String e5 = com.alipay.security.mobile.module.deviceinfo.c.e(context);
        String q4 = com.alipay.security.mobile.module.deviceinfo.c.q(context);
        String p4 = com.alipay.security.mobile.module.deviceinfo.c.p();
        String u4 = com.alipay.security.mobile.module.deviceinfo.c.u(context);
        if (a6 != null) {
            if (com.alipay.security.mobile.module.commonutils.a.b(b5)) {
                b5 = com.alipay.security.mobile.module.commonutils.a.f(a6.f4652a);
            }
            if (com.alipay.security.mobile.module.commonutils.a.b(e5)) {
                e5 = com.alipay.security.mobile.module.commonutils.a.f(a6.f4653b);
            }
            if (com.alipay.security.mobile.module.commonutils.a.b(q4)) {
                q4 = com.alipay.security.mobile.module.commonutils.a.f(a6.f4654c);
            }
            if (com.alipay.security.mobile.module.commonutils.a.b(p4)) {
                p4 = com.alipay.security.mobile.module.commonutils.a.f(a6.f4655d);
            }
            if (com.alipay.security.mobile.module.commonutils.a.b(u4)) {
                u4 = com.alipay.security.mobile.module.commonutils.a.f(a6.f4656e);
            }
        }
        com.alipay.apmobilesecuritysdk.e.d dVar = new com.alipay.apmobilesecuritysdk.e.d(b5, e5, q4, p4, u4);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", com.alipay.security.mobile.module.commonutils.a.f(dVar.f4652a));
                jSONObject.put("imsi", com.alipay.security.mobile.module.commonutils.a.f(dVar.f4653b));
                jSONObject.put("mac", com.alipay.security.mobile.module.commonutils.a.f(dVar.f4654c));
                jSONObject.put("bluetoothmac", com.alipay.security.mobile.module.commonutils.a.f(dVar.f4655d));
                jSONObject.put("gsi", com.alipay.security.mobile.module.commonutils.a.f(dVar.f4656e));
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.c.d("device_feature_file_name", "device_feature_file_key", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.c.c(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
            } catch (Exception e6) {
                com.alipay.security.mobile.module.commonutils.d.c(e6);
            }
        }
        hashMap.put("AD1", b5);
        hashMap.put("AD2", e5);
        hashMap.put("AD3", com.alipay.security.mobile.module.deviceinfo.c.i(context));
        hashMap.put("AD5", com.alipay.security.mobile.module.deviceinfo.c.k(context));
        hashMap.put("AD6", com.alipay.security.mobile.module.deviceinfo.c.m(context));
        hashMap.put("AD7", com.alipay.security.mobile.module.deviceinfo.c.o(context));
        hashMap.put("AD8", q4);
        hashMap.put("AD9", com.alipay.security.mobile.module.deviceinfo.c.s(context));
        hashMap.put("AD10", u4);
        hashMap.put("AD11", com.alipay.security.mobile.module.deviceinfo.c.d());
        hashMap.put("AD12", a5.f());
        hashMap.put("AD13", com.alipay.security.mobile.module.deviceinfo.c.h());
        hashMap.put("AD14", com.alipay.security.mobile.module.deviceinfo.c.j());
        hashMap.put("AD15", com.alipay.security.mobile.module.deviceinfo.c.l());
        hashMap.put("AD16", com.alipay.security.mobile.module.deviceinfo.c.n());
        hashMap.put("AD17", "");
        hashMap.put("AD18", p4);
        hashMap.put("AD19", com.alipay.security.mobile.module.deviceinfo.c.w(context));
        hashMap.put("AD20", com.alipay.security.mobile.module.deviceinfo.c.r());
        hashMap.put("AD21", com.alipay.security.mobile.module.deviceinfo.c.g(context));
        hashMap.put("AD22", "");
        hashMap.put("AD23", com.alipay.security.mobile.module.deviceinfo.c.t());
        hashMap.put("AL3", com.alipay.security.mobile.module.deviceinfo.c.y(context));
        return hashMap;
    }
}
