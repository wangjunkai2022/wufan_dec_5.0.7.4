package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import com.alipay.security.mobile.module.commonutils.crypto.i;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class c {
    public static String a(Context context, String str, String str2) {
        String a5;
        if (context == null || com.alipay.security.mobile.module.commonutils.a.b(str)) {
            return null;
        }
        if (!com.alipay.security.mobile.module.commonutils.a.b(str2)) {
            try {
                a5 = s.c.a(context, str, str2, "");
                if (com.alipay.security.mobile.module.commonutils.a.b(a5)) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return i.f(i.a(), a5);
    }

    public static String b(String str, String str2) {
        if (!com.alipay.security.mobile.module.commonutils.a.b(str) && !com.alipay.security.mobile.module.commonutils.a.b(str2)) {
            try {
                String a5 = s.a.a(str);
                if (com.alipay.security.mobile.module.commonutils.a.b(a5)) {
                    return null;
                }
                String string = new JSONObject(a5).getString(str2);
                if (com.alipay.security.mobile.module.commonutils.a.b(string)) {
                    return null;
                }
                return i.f(i.a(), string);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void c(Context context, String str, String str2, String str3) {
        if (!com.alipay.security.mobile.module.commonutils.a.b(str) && !com.alipay.security.mobile.module.commonutils.a.b(str2) && context != null && !com.alipay.security.mobile.module.commonutils.a.b(str3)) {
            try {
                String c5 = i.c(i.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, c5);
                s.c.b(context, str, hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public static void d(String str, String str2, String str3) {
        if (!com.alipay.security.mobile.module.commonutils.a.b(str) && !com.alipay.security.mobile.module.commonutils.a.b(str2) && !com.alipay.security.mobile.module.commonutils.a.b(str3)) {
            try {
                String c5 = i.c(i.a(), str3);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str2, c5);
                s.a.b(str, jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
