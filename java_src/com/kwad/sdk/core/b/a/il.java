package com.kwad.sdk.core.b.a;

import com.kwad.sdk.i.a;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class il implements com.kwad.sdk.core.d<a.C0536a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0536a c0536a, JSONObject jSONObject) {
        a2(c0536a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0536a c0536a, JSONObject jSONObject) {
        return b2(c0536a, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0536a c0536a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0536a.aKM = jSONObject.optInt("ds");
        c0536a.sdkVersion = jSONObject.optString(m.a.f71496j);
        if (JSONObject.NULL.toString().equals(c0536a.sdkVersion)) {
            c0536a.sdkVersion = "";
        }
        c0536a.aGE = jSONObject.optString("spv");
        if (JSONObject.NULL.toString().equals(c0536a.aGE)) {
            c0536a.aGE = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0536a c0536a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = c0536a.aKM;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ds", i4);
        }
        String str = c0536a.sdkVersion;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, m.a.f71496j, c0536a.sdkVersion);
        }
        String str2 = c0536a.aGE;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "spv", c0536a.aGE);
        }
        return jSONObject;
    }
}
