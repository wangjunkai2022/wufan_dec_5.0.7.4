package com.ss.android.socialbase.appdownloader.u;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.appdownloader.n;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {
    private static final HashMap<String, n.vv> vv = new HashMap<>();

    public static boolean m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        int i4 = Build.VERSION.SDK_INT;
        String optString = jSONObject.optString("allow_os_api_range");
        int optInt = jSONObject.optInt("min_os_api", -1);
        if (TextUtils.isEmpty(optString)) {
            return optInt <= 0 || i4 >= optInt;
        }
        try {
            String[] split = optString.split("[-,]");
            for (int i5 = 0; i5 < split.length; i5 += 2) {
                int parseInt = Integer.parseInt(split[i5]);
                int parseInt2 = Integer.parseInt(split[i5 + 1]);
                if (i4 >= parseInt && i4 <= parseInt2) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    public static boolean p(JSONObject jSONObject) {
        return jSONObject == null || u.vv() || jSONObject.optInt("scy_mode") != 1;
    }

    public static boolean vv(JSONArray jSONArray, String str) {
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                if (optJSONObject != null && str.equals(optJSONObject.optString("type")) && vv(optJSONObject)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean vv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return m(jSONObject) && vv(jSONObject.optJSONArray("device_requirements")) && p(jSONObject);
    }

    public static boolean vv(JSONArray jSONArray) {
        int length;
        String[] split;
        if (jSONArray == null || (length = jSONArray.length()) == 0) {
            return true;
        }
        boolean z4 = false;
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i4);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("package_names");
                JSONArray optJSONArray = optJSONObject.optJSONArray("version_allow");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("version_block");
                String optString2 = optJSONObject.optString("allow_version_range");
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                for (String str : optString.split(",")) {
                    if ("market".equals(str)) {
                        str = o.k();
                    }
                    n.vv m4 = m(str);
                    if (m4 != null && !(z4 = vv(optJSONArray, optJSONArray2, optString2, m4))) {
                        return false;
                    }
                }
                continue;
            }
        }
        return z4;
    }

    private static boolean m(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (str.equalsIgnoreCase(jSONArray.optString(i4).trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static n.vv m(String str) {
        HashMap<String, n.vv> hashMap = vv;
        if (hashMap.containsKey(str)) {
            n.vv vvVar = hashMap.get(str);
            if (vvVar != null) {
                return vvVar;
            }
            return null;
        }
        n.vv m4 = n.m(str);
        hashMap.put(str, m4);
        if (m4 != null) {
            return m4;
        }
        return null;
    }

    private static boolean vv(JSONArray jSONArray, JSONArray jSONArray2, String str, @NonNull n.vv vvVar) {
        String n4 = vvVar.n();
        int u4 = vvVar.u();
        String str2 = u4 + "_" + n4;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split("[-,]");
                for (int i4 = 0; i4 < split.length; i4 += 2) {
                    int parseInt = Integer.parseInt(split[i4]);
                    int parseInt2 = Integer.parseInt(split[i4 + 1]);
                    if (u4 >= parseInt && u4 <= parseInt2) {
                        return true;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (jSONArray != null && jSONArray.length() > 0) {
            if (m(jSONArray, str2)) {
                return true;
            }
        } else if (jSONArray2 != null && jSONArray2.length() > 0 && !m(jSONArray2, str2)) {
            return true;
        }
        return false;
    }

    public static n.vv vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                n.vv m4 = m(str);
                if (m4 != null) {
                    return m4;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean vv(JSONObject jSONObject, Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null && jSONObject != null) {
            String optString = jSONObject.optString("s");
            try {
                String vv2 = p.vv(jSONObject.optString("az"), optString);
                String vv3 = p.vv(jSONObject.optString("ba"), optString);
                Field declaredField = ContextWrapper.class.getDeclaredField(vv2);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(context);
                Field declaredField2 = obj.getClass().getDeclaredField(vv3);
                declaredField2.setAccessible(true);
                declaredField2.set(obj, str);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
