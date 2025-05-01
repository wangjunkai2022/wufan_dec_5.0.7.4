package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class cv {

    /* renamed from: a  reason: collision with root package name */
    public static String f55477a = "appkey";

    /* renamed from: b  reason: collision with root package name */
    public static String f55478b = "secretkey";

    /* renamed from: c  reason: collision with root package name */
    public static String f55479c = "pver";

    /* renamed from: d  reason: collision with root package name */
    public static String f55480d = "sdkver";

    /* renamed from: e  reason: collision with root package name */
    public static String f55481e = "ksid";

    /* renamed from: f  reason: collision with root package name */
    public static String f55482f = "timestamp";

    /* renamed from: g  reason: collision with root package name */
    public static String f55483g = "sign";

    public static String a(Map<String, String> map) {
        String str = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str + m.a.f71490d + entry.getKey() + SimpleComparison.EQUAL_TO_OPERATION + entry.getValue();
        }
        return str.substring(1);
    }

    public static JSONObject b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            a(context, jSONObject);
            jSONObject.put("sdkver", WeaponHI.sKSSdkver);
            jSONObject.put("pluginver", "5.3.6");
            jSONObject.put("device_id", cm.b(context));
            jSONObject.put("iv", "v1");
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject c(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(t.f55682a, bt.a(context));
            jSONObject.put("hp", context.getPackageName());
            jSONObject.put("hv", bh.q(context));
            try {
                String b5 = h.a(context, "re_po_rt").b(df.f55536i, bq.f55344e);
                if (TextUtils.isEmpty(b5)) {
                    b5 = bq.f55344e;
                }
                jSONObject.put("pver", b5);
            } catch (Exception unused) {
                jSONObject.put("pver", bq.f55344e);
            }
            jSONObject.put("platform", 1);
            jSONObject.put(com.umeng.analytics.pro.f.S, bq.f55346g);
            jSONObject.put("sdkver", WeaponHI.sKSSdkver);
            jSONObject.put("pluginver", "5.3.6");
            jSONObject.put("device_id", cm.b(context));
            jSONObject.put("iv", "v1");
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    private static Map d(Context context) {
        try {
            String str = WeaponHI.sKSAppkey;
            String str2 = WeaponHI.sKSSecKey;
            HashMap hashMap = new HashMap();
            hashMap.put(f55477a, str);
            hashMap.put(f55478b, str2);
            hashMap.put(f55482f, String.valueOf(System.currentTimeMillis() / 1000));
            hashMap.put(f55483g, b(hashMap));
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Context context) {
        Map d5 = d(context);
        if (d5 == null || d5.size() <= 0) {
            return null;
        }
        String str = "";
        for (Map.Entry entry : d5.entrySet()) {
            str = str + m.a.f71490d + ((String) entry.getKey()) + SimpleComparison.EQUAL_TO_OPERATION + ((String) entry.getValue());
        }
        return str.substring(1);
    }

    private static String b(Map map) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(map.get(f55477a));
            sb.append(map.get(f55478b));
            sb.append(map.get(f55482f));
            return f.a(sb.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(t.f55682a, bt.a(context));
            jSONObject.put("hp", context.getPackageName());
            jSONObject.put("hv", bh.q(context));
            jSONObject.put("dpver", h.a(context, "re_po_rt").b(df.f55534g, bq.f55344e));
            jSONObject.put("platform", 1);
            jSONObject.put(com.umeng.analytics.pro.f.S, bq.f55346g);
        } catch (Exception unused) {
        }
    }
}
