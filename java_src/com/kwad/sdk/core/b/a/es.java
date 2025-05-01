package com.kwad.sdk.core.b.a;

import io.netty.handler.codec.http.HttpHeaders;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class es implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.b.a.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.aFE = jSONObject.optString(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN);
        if (JSONObject.NULL.toString().equals(aVar.aFE)) {
            aVar.aFE = "";
        }
        aVar.aFF = jSONObject.optString("Timing-Allow-Origin");
        if (JSONObject.NULL.toString().equals(aVar.aFF)) {
            aVar.aFF = "";
        }
        aVar.aFG = jSONObject.optString(com.alipay.sdk.packet.d.f4897f);
        if (JSONObject.NULL.toString().equals(aVar.aFG)) {
            aVar.aFG = "";
        }
        aVar.aFH = jSONObject.optString("Date");
        if (JSONObject.NULL.toString().equals(aVar.aFH)) {
            aVar.aFH = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.b.a.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = aVar.aFE;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN, aVar.aFE);
        }
        String str2 = aVar.aFF;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "Timing-Allow-Origin", aVar.aFF);
        }
        String str3 = aVar.aFG;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, com.alipay.sdk.packet.d.f4897f, aVar.aFG);
        }
        String str4 = aVar.aFH;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "Date", aVar.aFH);
        }
        return jSONObject;
    }
}
