package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class fv implements com.kwad.sdk.core.d<com.kwad.sdk.utils.b.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aTq = jSONObject.optInt("put_count");
        aVar.aTr = jSONObject.optInt("get_failed_count");
        aVar.aTs = jSONObject.optInt("get_success_count");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.utils.b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = aVar.aTq;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "put_count", i4);
        }
        int i5 = aVar.aTr;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "get_failed_count", i5);
        }
        int i6 = aVar.aTs;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "get_success_count", i6);
        }
        return jSONObject;
    }
}
