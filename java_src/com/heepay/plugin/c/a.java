package com.heepay.plugin.c;

import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a {
    public static int a(JSONObject jSONObject, String str, int i4) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getInt(str);
            }
        } catch (Exception unused) {
        }
        return i4;
    }

    public static String a(String str) {
        return str.replace("_", "");
    }

    public static String a(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean b(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getBoolean(str);
            }
        } catch (Exception unused) {
        }
        return true;
    }
}
