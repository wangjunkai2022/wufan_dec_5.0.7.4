package com.sdk.b;

import android.content.Context;
import com.sdk.Unicorn.base.module.manager.SDKManager;
import com.sdk.f.g;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f59987a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f59988b = Boolean.valueOf(g.f60051b);

    public static String a(int i4, String str) {
        String a5 = com.sdk.m.a.a();
        if (com.sdk.o.b.b(a5).booleanValue()) {
            return "accessCode" + i4 + str + a5;
        }
        return null;
    }

    public static String a(Context context, int i4, String str) {
        if (SDKManager.useCache) {
            String a5 = a(i4, str);
            if (com.sdk.o.b.b(a5).booleanValue()) {
                String c5 = com.sdk.j.a.c(context, a5);
                if (com.sdk.o.b.b(c5).booleanValue()) {
                    String b5 = b(c5);
                    String a6 = com.sdk.u.a.a(a(c5));
                    if (!com.sdk.u.a.b(a6)) {
                        com.sdk.o.b.b(f59987a, "can use cache", f59988b);
                        JSONObject jSONObject = new JSONObject(a6);
                        if (i4 == 1) {
                            jSONObject.remove("fakeMobile");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(jSONObject.toString());
                        sb.append("-");
                        sb.append(b5);
                        return sb.toString();
                    }
                    com.sdk.o.b.b(f59987a, "OutDate cache invalid", f59988b);
                }
            }
            return null;
        }
        return null;
    }

    public static <T> String a(T t4, String str) {
        return t4 + "-" + str;
    }

    public static String a(String str) {
        return str.split("-")[0];
    }

    public static void a(Context context) {
        com.sdk.o.b.b(f59987a, "cache clear", f59988b);
        com.sdk.j.a.a(context, "accessCode");
    }

    public static String b(String str) {
        return str.split("-")[1];
    }

    public static void a(Context context, int i4, String str, String str2) {
        if (SDKManager.useCache && com.sdk.o.b.b(str).booleanValue()) {
            String a5 = a(i4, str2);
            if (com.sdk.o.b.b(a5).booleanValue()) {
                com.sdk.j.a.a(context, a5, str);
            }
        }
    }
}
