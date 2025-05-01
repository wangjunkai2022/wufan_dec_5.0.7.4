package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class ki implements com.kwad.sdk.core.d<com.kwad.components.core.n.c.d> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.n.c.d dVar, JSONObject jSONObject) {
        a2(dVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.n.c.d dVar, JSONObject jSONObject) {
        return b2(dVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.n.c.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        dVar.Ot = jSONObject.optString("load_module");
        if (JSONObject.NULL.toString().equals(dVar.Ot)) {
            dVar.Ot = "";
        }
        dVar.Ou = jSONObject.optLong("load_status");
        dVar.Ov = jSONObject.optLong("load_duration_ms");
        dVar.Oy = jSONObject.optLong("update_duration_ms");
        dVar.Ox = jSONObject.optString("load_source");
        if (JSONObject.NULL.toString().equals(dVar.Ox)) {
            dVar.Ox = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.n.c.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = dVar.Ot;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_module", dVar.Ot);
        }
        long j4 = dVar.Ou;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_status", j4);
        }
        long j5 = dVar.Ov;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_duration_ms", j5);
        }
        long j6 = dVar.Oy;
        if (j6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "update_duration_ms", j6);
        }
        String str2 = dVar.Ox;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_source", dVar.Ox);
        }
        return jSONObject;
    }
}
