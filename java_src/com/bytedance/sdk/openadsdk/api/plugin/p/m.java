package com.bytedance.sdk.openadsdk.api.plugin.p;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import java.security.SecureRandom;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m {
    public static String m() {
        String vv = vv(8);
        if (vv == null || vv.length() != 16) {
            return null;
        }
        return vv;
    }

    private static SecureRandom p() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    @JProtect
    public static String vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String vv = vv();
        String vv2 = vv(vv, 32);
        String m4 = m();
        String str2 = null;
        if (vv2 != null && m4 != null) {
            str2 = vv.vv(str, m4, vv2);
        }
        return 3 + vv + m4 + str2;
    }

    @JProtect
    public static JSONObject vv(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        try {
            try {
                String vv = vv(jSONObject.toString());
                if (!TextUtils.isEmpty(vv)) {
                    jSONObject2.put("message", vv);
                    jSONObject2.put("cypher", 3);
                } else {
                    jSONObject2.put("message", jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject2.put("message", jSONObject.toString());
            jSONObject2.put("cypher", 0);
        }
        return jSONObject2;
    }

    public static String vv() {
        String vv = vv(16);
        if (vv == null || vv.length() != 32) {
            return null;
        }
        return vv;
    }

    public static String vv(String str, int i4) {
        if (str == null || str.length() != i4) {
            return null;
        }
        int i5 = i4 / 2;
        return str.substring(i5, i4) + str.substring(0, i5);
    }

    public static String vv(int i4) {
        try {
            byte[] bArr = new byte[i4];
            p().nextBytes(bArr);
            return p.vv(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
