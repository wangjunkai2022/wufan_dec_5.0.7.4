package com.kwad.sdk.core.b.a;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class br implements com.kwad.sdk.core.d<com.kwad.sdk.crash.online.monitor.a.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aId = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("systemFilterList");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                aVar.aId.add((String) optJSONArray.opt(i4));
            }
        }
        aVar.aIe = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sdkFilterList");
        if (optJSONArray2 != null) {
            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                aVar.aIe.add((String) optJSONArray2.opt(i5));
            }
        }
        aVar.aIf = new ArrayList();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("matrixPrinterNameList");
        if (optJSONArray3 != null) {
            for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                aVar.aIf.add((String) optJSONArray3.opt(i6));
            }
        }
        aVar.aIg = new ArrayList();
        JSONArray optJSONArray4 = jSONObject.optJSONArray("commonPrinterNameList");
        if (optJSONArray4 != null) {
            for (int i7 = 0; i7 < optJSONArray4.length(); i7++) {
                aVar.aIg.add((String) optJSONArray4.opt(i7));
            }
        }
        aVar.aIh = new ArrayList();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("featureConfigList");
        if (optJSONArray5 != null) {
            for (int i8 = 0; i8 < optJSONArray5.length(); i8++) {
                com.kwad.sdk.crash.online.monitor.a.b bVar = new com.kwad.sdk.crash.online.monitor.a.b();
                bVar.parseJson(optJSONArray5.optJSONObject(i8));
                aVar.aIh.add(bVar);
            }
        }
        aVar.aIj = jSONObject.optInt("afterFilterSystemCheckNum", new Integer("5").intValue());
        aVar.aIk = jSONObject.optInt("batchNum", new Integer(com.join.mgps.Util.v.f28122v).intValue());
        aVar.apu = jSONObject.optDouble("ratio", new Double("0.01").doubleValue());
        aVar.aIl = jSONObject.optInt("monitorSwitch");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.crash.online.monitor.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "systemFilterList", aVar.aId);
        com.kwad.sdk.utils.t.putValue(jSONObject, "sdkFilterList", aVar.aIe);
        com.kwad.sdk.utils.t.putValue(jSONObject, "matrixPrinterNameList", aVar.aIf);
        com.kwad.sdk.utils.t.putValue(jSONObject, "commonPrinterNameList", aVar.aIg);
        com.kwad.sdk.utils.t.putValue(jSONObject, "featureConfigList", aVar.aIh);
        com.kwad.sdk.utils.t.putValue(jSONObject, "afterFilterSystemCheckNum", aVar.aIj);
        com.kwad.sdk.utils.t.putValue(jSONObject, "batchNum", aVar.aIk);
        com.kwad.sdk.utils.t.putValue(jSONObject, "ratio", aVar.apu);
        int i4 = aVar.aIl;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "monitorSwitch", i4);
        }
        return jSONObject;
    }
}
