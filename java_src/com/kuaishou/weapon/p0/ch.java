package com.kuaishou.weapon.p0;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class ch {

    /* renamed from: a  reason: collision with root package name */
    private Context f55403a;

    /* renamed from: b  reason: collision with root package name */
    private int f55404b;

    public ch(Context context, int i4) {
        this.f55403a = context;
        this.f55404b = i4;
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (h.a(this.f55403a, "re_po_rt").b(df.f55552y, 1) == 1) {
                try {
                    JSONArray a5 = new x().a(this.f55403a);
                    if (a5 != null && a5.length() > 0) {
                        jSONObject.put("10000", a5);
                        jSONObject.put("11301", bh.c(com.kwad.sdk.e.b.Jd().Jc()));
                        jSONObject.put("11302", bh.c(com.kwad.sdk.e.b.Jd().getSdkVersion()));
                        jSONObject.put("11303", bh.c(com.kwad.sdk.e.b.Jd().getAppId()));
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public String a(String str) {
        JSONObject a5;
        try {
            JSONObject a6 = new cm(str, ck.f55419l).a(this.f55403a);
            if (a6 != null && (a5 = a()) != null && a5.length() != 0) {
                a6.put("module_section", a5);
                return a6.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
