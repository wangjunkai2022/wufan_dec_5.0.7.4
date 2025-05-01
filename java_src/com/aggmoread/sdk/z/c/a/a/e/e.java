package com.aggmoread.sdk.z.c.a.a.e;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static final String f3493a = System.getProperty("line.separator");

    public static void a(String str) {
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            a("AMSDK", str);
        }
    }

    static void a(String str, String str2) {
    }

    public static void a(String str, String str2, Object... objArr) {
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            if (objArr != null && objArr.length > 0) {
                try {
                    str2 = String.format(str2, objArr);
                } catch (Exception unused) {
                }
            }
            a(str, str2);
        }
    }

    static void a(String str, boolean z4) {
        a(str, "+-------------------------------+");
    }

    public static void a(byte[] bArr, String str) {
        String str2;
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            boolean contains = str.contains("ads2");
            if (bArr != null && bArr.length > 0) {
                try {
                    String str3 = new String(bArr, "UTF-8");
                    if (contains) {
                        b("AMHTTAG_ADS", "tmp raw data " + str3);
                    }
                    byte[] a5 = com.aggmoread.sdk.z.c.a.a.b.a(str3);
                    if (a5 != null) {
                        bArr = a5;
                    }
                    String str4 = new String(bArr, "UTF-8");
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str4.startsWith("[") ? new JSONArray(str4).toString() : new JSONObject(str4).toString();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                str2 = "";
            } else if (contains) {
                b("AMHTTAG_ADS", "json:= empty  " + str);
                return;
            } else {
                str2 = "json:= empty";
            }
            c(str2, str);
        }
    }

    public static void b(String str) {
    }

    public static void b(String str, String str2) {
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            a(str, str2);
        }
    }

    public static void c(String str) {
        b("BIDTAG", str);
    }

    public static void c(String str, String str2) {
        String[] split;
        if (com.aggmoread.sdk.z.c.a.a.d.b.j.f3430r.booleanValue()) {
            try {
                if (str.startsWith("{")) {
                    str = new JSONObject(str).toString(4);
                } else if (str.startsWith("[")) {
                    str = new JSONArray(str).toString(4);
                }
            } catch (JSONException unused) {
            }
            a("AMSDK", true);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String str3 = f3493a;
            sb.append(str3);
            sb.append(str);
            for (String str4 : sb.toString().split(str3)) {
                a("AMHTTAG", "* " + str4);
            }
            a("AMSDK", false);
        }
    }
}
