package com.aggmoread.sdk.z.a;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e extends b implements c {

    /* renamed from: a  reason: collision with root package name */
    final JSONObject f1996a = new JSONObject();

    public e() {
        new HashMap();
    }

    public c a(c cVar) {
        return a(cVar.a());
    }

    public c a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.f1996a.put(next, jSONObject.getString(next));
                } catch (JSONException e5) {
                    d.a("PATAG", "ERR %s", e5);
                }
            }
        }
        return this;
    }

    @Override // com.aggmoread.sdk.z.a.c
    public JSONObject a() {
        return this.f1996a;
    }
}
