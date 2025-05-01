package com.kwad.sdk.core.b.a;

import com.kwad.components.core.request.model.b;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class bi implements com.kwad.sdk.core.d<b.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(b.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(b.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.streamType = jSONObject.optInt("streamType");
        aVar.SH = jSONObject.optInt("maxVolume");
        aVar.SI = jSONObject.optInt("minVolume");
        aVar.SJ = jSONObject.optInt("currentVolume");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(b.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = aVar.streamType;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "streamType", i4);
        }
        int i5 = aVar.SH;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "maxVolume", i5);
        }
        int i6 = aVar.SI;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "minVolume", i6);
        }
        int i7 = aVar.SJ;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentVolume", i7);
        }
        return jSONObject;
    }
}
