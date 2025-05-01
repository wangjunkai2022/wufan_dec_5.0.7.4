package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class kq implements com.kwad.sdk.core.d<com.kwad.components.core.webview.tachikoma.b.x> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.b.x xVar, JSONObject jSONObject) {
        a2(xVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.tachikoma.b.x xVar, JSONObject jSONObject) {
        return b2(xVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.tachikoma.b.x xVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        xVar.abi = jSONObject.optString("status");
        if (JSONObject.NULL.toString().equals(xVar.abi)) {
            xVar.abi = "";
        }
        xVar.errorCode = jSONObject.optInt(MediationConstant.KEY_ERROR_CODE);
        xVar.errorReason = jSONObject.optString("errorReason");
        if (JSONObject.NULL.toString().equals(xVar.errorReason)) {
            xVar.errorReason = "";
        }
        xVar.nF = jSONObject.optInt("currentTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.tachikoma.b.x xVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = xVar.abi;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", xVar.abi);
        }
        int i4 = xVar.errorCode;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MediationConstant.KEY_ERROR_CODE, i4);
        }
        String str2 = xVar.errorReason;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "errorReason", xVar.errorReason);
        }
        int i5 = xVar.nF;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentTime", i5);
        }
        return jSONObject;
    }
}
