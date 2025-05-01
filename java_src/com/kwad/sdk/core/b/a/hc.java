package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class hc implements com.kwad.sdk.core.d<com.kwad.components.core.webview.a.c> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.Ww = jSONObject.optString("originalID");
        if (JSONObject.NULL.toString().equals(cVar.Ww)) {
            cVar.Ww = "";
        }
        cVar.Wx = jSONObject.optString("path");
        if (JSONObject.NULL.toString().equals(cVar.Wx)) {
            cVar.Wx = "";
        }
        cVar.Wy = jSONObject.optInt("adCacheId");
        cVar.JK = jSONObject.optString("creativeId");
        if (JSONObject.NULL.toString().equals(cVar.JK)) {
            cVar.JK = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.a.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = cVar.Ww;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "originalID", cVar.Ww);
        }
        String str2 = cVar.Wx;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "path", cVar.Wx);
        }
        int i4 = cVar.Wy;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adCacheId", i4);
        }
        String str3 = cVar.JK;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", cVar.JK);
        }
        return jSONObject;
    }
}
