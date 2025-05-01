package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class cg {
    public static void a(final Context context, String str, String str2, boolean z4) {
        JSONObject jSONObject;
        try {
            String str3 = cu.f55469a + cu.f55474f;
            String a5 = cv.a(context);
            if (!TextUtils.isEmpty(a5)) {
                if (cu.a() && str2 != null) {
                    str3 = str3 + "?logId=" + str2 + m.a.f71490d + a5;
                } else {
                    str3 = str3 + "?" + a5;
                }
            }
            String str4 = str3;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z4) {
                jSONObject = new JSONObject();
                String c5 = new bn(context).c(str);
                if (!TextUtils.isEmpty(c5)) {
                    jSONObject.put("data", c5);
                }
            } else {
                jSONObject = new JSONObject(str);
            }
            n.a().a(new k(context, WeaponHI.cookieData, WeaponHI.encryENV, str4, jSONObject, new j() { // from class: com.kuaishou.weapon.p0.cg.1
                @Override // com.kuaishou.weapon.p0.j
                public final void a(String str5) {
                    cg.a(context, str5);
                }

                @Override // com.kuaishou.weapon.p0.j
                public final void b(String str5) {
                }
            }));
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("result", 0) == 1) {
                JSONObject jSONObject2 = new JSONObject(new bn(context).a(jSONObject.getString("dataRsp")));
                String string = jSONObject2.getString("conjure");
                if (jSONObject2.getInt("status") == 1) {
                    bx.a(context, string);
                    bx.b(context, string);
                }
            }
        } catch (Exception unused) {
        }
    }
}
