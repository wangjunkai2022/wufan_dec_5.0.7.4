package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class az {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f55290a;

    public az(Context context, int i4) {
        if (Engine.loadSuccess) {
            try {
                String pqr = Engine.getInstance(context).pqr(Integer.valueOf(ck.f55410c).intValue(), 2, i4 < 10 ? 10 : i4, "");
                if (TextUtils.isEmpty(pqr)) {
                    return;
                }
                this.f55290a = new JSONObject(pqr);
            } catch (Throwable unused) {
            }
        }
    }

    private String b(String str) {
        JSONObject jSONObject = this.f55290a;
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONObject a(String str) {
        try {
            String b5 = b(str);
            if (TextUtils.isEmpty(b5)) {
                return null;
            }
            return new JSONObject(b5);
        } catch (Exception unused) {
            return null;
        }
    }
}
