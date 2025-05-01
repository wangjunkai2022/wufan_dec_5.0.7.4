package com.kuaishou.weapon.p0;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class ci {

    /* renamed from: a  reason: collision with root package name */
    private Context f55405a;

    /* renamed from: b  reason: collision with root package name */
    private int f55406b;

    public ci(Context context, int i4) {
        this.f55405a = context;
        this.f55406b = i4;
    }

    public JSONObject a() {
        long currentTimeMillis;
        JSONObject jSONObject;
        JSONArray a5;
        try {
            currentTimeMillis = System.currentTimeMillis();
            jSONObject = new JSONObject();
        } catch (Throwable unused) {
        }
        if (WeaponHI.as) {
            h a6 = h.a(this.f55405a, "re_po_rt");
            int b5 = a6.b(df.f55542o, 0);
            boolean e5 = a6.e("a1_p_s_p_s");
            boolean e6 = a6.e("a1_p_s_p_s_c_b");
            if (b5 == 1 && ((e5 || e6) && (a5 = new w(this.f55405a).a(0)) != null)) {
                jSONObject.put("10000", a5);
                try {
                    jSONObject.put("11301", bh.c(com.kwad.sdk.e.b.Jd().Jc()));
                    jSONObject.put("11302", bh.c(com.kwad.sdk.e.b.Jd().getSdkVersion()));
                    jSONObject.put("11303", bh.c(com.kwad.sdk.e.b.Jd().getAppId()));
                } catch (Throwable unused2) {
                }
                jSONObject.put("11007", System.currentTimeMillis() - currentTimeMillis);
                jSONObject.put("11017", jSONObject.toString().length());
                return jSONObject;
            }
            return null;
        }
        return null;
    }

    public String a(String str) {
        JSONObject a5;
        try {
            JSONObject a6 = new cm(str, ck.f55419l).a(this.f55405a);
            if (a6 == null || (a5 = a()) == null) {
                return null;
            }
            a6.put("module_section", a5);
            return a6.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
