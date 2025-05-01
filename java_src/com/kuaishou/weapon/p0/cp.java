package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class cp {
    public static void a(Context context, String str) {
        try {
            a(context, str, null, false, true);
        } catch (Throwable unused) {
        }
    }

    public static void a(final Context context, String str, final String str2, final boolean z4, boolean z5) {
        JSONObject jSONObject;
        try {
            String str3 = cu.f55469a + cu.f55473e;
            String a5 = cv.a(context);
            if (!TextUtils.isEmpty(a5)) {
                if (cu.a() && str2 != null) {
                    str3 = str3 + "?logId=" + str2 + m.a.f71490d + a5;
                } else {
                    str3 = str3 + "?" + a5;
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z5) {
                jSONObject = new JSONObject();
                String c5 = new bn(context).c(str);
                if (!TextUtils.isEmpty(c5)) {
                    jSONObject.put("data", c5);
                }
            } else {
                jSONObject = new JSONObject(str);
            }
            l a6 = l.a(context);
            m mVar = new m(str3, jSONObject);
            mVar.a(WeaponHI.cookieData);
            mVar.b(WeaponHI.encryENV);
            a6.b(mVar, new j() { // from class: com.kuaishou.weapon.p0.cp.1
                @Override // com.kuaishou.weapon.p0.j
                public final void a(String str4) {
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    try {
                        if (str2.equals(ck.f55409b)) {
                            df.a(context).a(System.currentTimeMillis());
                        } else if (str2.equals(ck.f55410c)) {
                            df.a(context).a(df.bj, System.currentTimeMillis());
                        } else if (str2.equals(ck.f55411d)) {
                            df.a(context).a(df.bi, System.currentTimeMillis());
                        } else if (str2.equals(ck.f55414g)) {
                            df.a(context).a(df.bm, System.currentTimeMillis());
                        } else if (str2.equals(ck.f55416i)) {
                            df.a(context).a(df.bh, System.currentTimeMillis());
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.kuaishou.weapon.p0.j
                public final void b(String str4) {
                    if (z4) {
                        TextUtils.isEmpty(str2);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
