package com.kwad.sdk.core.b.a;

import com.kwad.sdk.m.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class hw implements com.kwad.sdk.core.d<com.kwad.sdk.m.c> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.m.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.m.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.m.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.funcSwitch = jSONObject.optLong("funcSwitch");
        cVar.aOr = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("urlList");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                cVar.aOr.add((String) optJSONArray.opt(i4));
            }
        }
        cVar.aOs = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("actConfigList");
        if (optJSONArray2 != null) {
            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                c.a aVar = new c.a();
                aVar.parseJson(optJSONArray2.optJSONObject(i5));
                cVar.aOs.add(aVar);
            }
        }
        cVar.byteCount = jSONObject.optLong("byteCount");
        cVar.sampleRate = jSONObject.optDouble("sampleRate");
        cVar.aOt = new ArrayList();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("anchorNodeList");
        if (optJSONArray3 != null) {
            for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                com.kwad.sdk.m.a.a aVar2 = new com.kwad.sdk.m.a.a();
                aVar2.parseJson(optJSONArray3.optJSONObject(i6));
                cVar.aOt.add(aVar2);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.m.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        long j4 = cVar.funcSwitch;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "funcSwitch", j4);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "urlList", cVar.aOr);
        com.kwad.sdk.utils.t.putValue(jSONObject, "actConfigList", cVar.aOs);
        long j5 = cVar.byteCount;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "byteCount", j5);
        }
        double d5 = cVar.sampleRate;
        if (d5 != 0.0d) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sampleRate", d5);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "anchorNodeList", cVar.aOt);
        return jSONObject;
    }
}
