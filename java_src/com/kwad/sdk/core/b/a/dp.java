package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class dp implements com.kwad.sdk.core.d<com.kwad.sdk.crash.online.monitor.a.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.appId = jSONObject.optString("appId");
        if (JSONObject.NULL.toString().equals(bVar.appId)) {
            bVar.appId = "";
        }
        bVar.aIm = jSONObject.optString("pluginListenerName");
        if (JSONObject.NULL.toString().equals(bVar.aIm)) {
            bVar.aIm = "";
        }
        bVar.aIn = jSONObject.optString("reportMethodName");
        if (JSONObject.NULL.toString().equals(bVar.aIn)) {
            bVar.aIn = "";
        }
        bVar.aIo = jSONObject.optString("otherProxyClassName");
        if (JSONObject.NULL.toString().equals(bVar.aIo)) {
            bVar.aIo = "";
        }
        bVar.aIp = jSONObject.optString("otherFieldName");
        if (JSONObject.NULL.toString().equals(bVar.aIp)) {
            bVar.aIp = "";
        }
        bVar.aIq = jSONObject.optString("otherLevelFieldName");
        if (JSONObject.NULL.toString().equals(bVar.aIq)) {
            bVar.aIq = "";
        }
        bVar.aIr = jSONObject.optString("blockTag");
        if (JSONObject.NULL.toString().equals(bVar.aIr)) {
            bVar.aIr = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.crash.online.monitor.a.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = bVar.appId;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", bVar.appId);
        }
        String str2 = bVar.aIm;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pluginListenerName", bVar.aIm);
        }
        String str3 = bVar.aIn;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "reportMethodName", bVar.aIn);
        }
        String str4 = bVar.aIo;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "otherProxyClassName", bVar.aIo);
        }
        String str5 = bVar.aIp;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "otherFieldName", bVar.aIp);
        }
        String str6 = bVar.aIq;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "otherLevelFieldName", bVar.aIq);
        }
        String str7 = bVar.aIr;
        if (str7 != null && !str7.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blockTag", bVar.aIr);
        }
        return jSONObject;
    }
}
