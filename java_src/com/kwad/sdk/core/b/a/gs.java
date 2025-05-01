package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kwad.components.core.webview.jshandler.a;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class gs implements com.kwad.sdk.core.d<a.c> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.errorCode = jSONObject.optInt(MediationConstant.KEY_ERROR_CODE);
        cVar.WE = jSONObject.optInt("extra");
        cVar.WF = jSONObject.optLong("playDuration");
        cVar.WG = jSONObject.optBoolean("clickRewardDialog");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = cVar.errorCode;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MediationConstant.KEY_ERROR_CODE, i4);
        }
        int i5 = cVar.WE;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "extra", i5);
        }
        long j4 = cVar.WF;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playDuration", j4);
        }
        boolean z4 = cVar.WG;
        if (z4) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clickRewardDialog", z4);
        }
        return jSONObject;
    }
}
