package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class bb {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f55298a;

    public bb(Context context, int i4, String str, boolean z4) {
        if (Engine.loadSuccess && z4) {
            try {
                String pqr = Engine.getInstance(context).pqr(Integer.valueOf(ck.f55413f).intValue(), 0, i4, str);
                if (TextUtils.isEmpty(pqr)) {
                    return;
                }
                this.f55298a = new JSONObject(pqr);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return g.a(context, g.f55589i) != -1;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String a(String str) {
        JSONObject jSONObject = this.f55298a;
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONObject a() {
        return this.f55298a;
    }
}
