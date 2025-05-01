package com.kuaishou.weapon.p0;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class dg {
    public JSONArray a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string) || string.length() <= 2) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray(string);
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    hashSet.add((String) jSONArray.get(i4));
                }
                if (hashSet.size() > 0) {
                    return new JSONArray((Collection) hashSet);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray(string);
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    String str2 = (String) jSONArray.get(i4);
                    if (str2.contains("frida")) {
                        hashSet.add(str2);
                    }
                }
                if (hashSet.size() > 0) {
                    return new JSONArray((Collection) hashSet);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONArray c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray(string);
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    String str2 = (String) jSONArray.get(i4);
                    if (str2.contains("substrate") || str2.contains(".jar") || str2.contains("xposed")) {
                        hashSet.add(str2);
                    }
                }
                if (hashSet.size() > 0) {
                    return new JSONArray((Collection) hashSet);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONArray a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray != null) {
            if (jSONArray.length() > 0 && jSONArray2 != null && jSONArray2.length() > 0) {
                Set a5 = dl.a(jSONArray);
                Set a6 = dl.a(jSONArray2);
                if (a5 != null && a6 != null) {
                    a5.removeAll(a6);
                    if (a5.size() > 0) {
                        return new JSONArray((Collection) a5);
                    }
                    return null;
                }
            }
        }
        return jSONArray;
    }
}
