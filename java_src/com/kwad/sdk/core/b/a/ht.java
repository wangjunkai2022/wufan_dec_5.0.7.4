package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class ht implements com.kwad.sdk.core.d<com.kwad.sdk.core.response.model.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.posId = jSONObject.optLong("posId");
        aVar.aBi = jSONObject.optInt("adPhotoCountForMedia");
        aVar.aBj = jSONObject.optBoolean("enablePreload");
        aVar.aBk = jSONObject.optLong("increaseAdLoadTime", new Long("10000").longValue());
        aVar.aBl = jSONObject.optInt("adLoadStrategy");
        aVar.aBm = jSONObject.optInt("drawAdForcedWatchTimes", new Integer("3").intValue());
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.response.model.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        long j4 = aVar.posId;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posId", j4);
        }
        int i4 = aVar.aBi;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adPhotoCountForMedia", i4);
        }
        boolean z4 = aVar.aBj;
        if (z4) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "enablePreload", z4);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "increaseAdLoadTime", aVar.aBk);
        int i5 = aVar.aBl;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adLoadStrategy", i5);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "drawAdForcedWatchTimes", aVar.aBm);
        return jSONObject;
    }
}
