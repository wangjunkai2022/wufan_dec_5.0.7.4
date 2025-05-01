package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class kb implements com.kwad.sdk.core.d<com.kwad.sdk.core.threads.d> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        a2(dVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        return b2(dVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        dVar.aCa = jSONObject.optInt("rate_reciprocal");
        dVar.aCg = jSONObject.optInt("threshold");
        dVar.interval = jSONObject.optLong("interval");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.threads.d dVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = dVar.aCa;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rate_reciprocal", i4);
        }
        int i5 = dVar.aCg;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "threshold", i5);
        }
        long j4 = dVar.interval;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "interval", j4);
        }
        return jSONObject;
    }
}
