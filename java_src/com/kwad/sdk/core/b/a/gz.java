package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class gz implements com.kwad.sdk.core.d<com.kwad.components.core.n.c.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.n.c.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.n.c.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.n.c.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.Ot = jSONObject.optString("load_module");
        if (JSONObject.NULL.toString().equals(bVar.Ot)) {
            bVar.Ot = "";
        }
        bVar.Ou = jSONObject.optLong("load_status");
        bVar.Ov = jSONObject.optLong("load_duration_ms");
        bVar.Ow = jSONObject.optLong("thread_core_size", new Long("0").longValue());
        bVar.Ox = jSONObject.optString("load_source");
        if (JSONObject.NULL.toString().equals(bVar.Ox)) {
            bVar.Ox = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.n.c.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = bVar.Ot;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_module", bVar.Ot);
        }
        long j4 = bVar.Ou;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_status", j4);
        }
        long j5 = bVar.Ov;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_duration_ms", j5);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "thread_core_size", bVar.Ow);
        String str2 = bVar.Ox;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_source", bVar.Ox);
        }
        return jSONObject;
    }
}
