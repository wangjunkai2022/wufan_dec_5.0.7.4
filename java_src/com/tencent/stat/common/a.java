package com.tencent.stat.common;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static c f62931a;

    /* renamed from: d  reason: collision with root package name */
    private static StatLogger f62932d = k.b();

    /* renamed from: e  reason: collision with root package name */
    private static JSONObject f62933e = null;

    /* renamed from: b  reason: collision with root package name */
    Integer f62934b;

    /* renamed from: c  reason: collision with root package name */
    String f62935c;

    public a(Context context) {
        this.f62934b = null;
        this.f62935c = null;
        try {
            a(context);
            this.f62934b = k.q(context.getApplicationContext());
            this.f62935c = k.p(context);
        } catch (Throwable th) {
            f62932d.e(th);
        }
    }

    static synchronized c a(Context context) {
        c cVar;
        synchronized (a.class) {
            if (f62931a == null) {
                f62931a = new c(context.getApplicationContext());
            }
            cVar = f62931a;
        }
        return cVar;
    }

    public static void a(Context context, Map<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap hashMap = new HashMap(map);
        if (f62933e == null) {
            f62933e = new JSONObject();
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            f62933e.put((String) entry.getKey(), entry.getValue());
        }
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            c cVar = f62931a;
            if (cVar != null) {
                cVar.a(jSONObject2);
            }
            k.a(jSONObject2, "cn", this.f62935c);
            Integer num = this.f62934b;
            if (num != null) {
                jSONObject2.put("tn", num);
            }
            jSONObject.put("ev", jSONObject2);
            JSONObject jSONObject3 = f62933e;
            if (jSONObject3 == null || jSONObject3.length() <= 0) {
                return;
            }
            jSONObject.put("eva", f62933e);
        } catch (Throwable th) {
            f62932d.e(th);
        }
    }
}
