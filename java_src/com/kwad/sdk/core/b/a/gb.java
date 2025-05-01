package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class gb implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.d.b.c> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        a2(cVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        return b2(cVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        cVar.aGd = jSONObject.optInt("convertType");
        cVar.Lh = jSONObject.optString("payload");
        if (JSONObject.NULL.toString().equals(cVar.Lh)) {
            cVar.Lh = "";
        }
        com.kwad.sdk.core.webview.d.b.b bVar = new com.kwad.sdk.core.webview.d.b.b();
        cVar.aGe = bVar;
        bVar.parseJson(jSONObject.optJSONObject("clickInfo"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.d.b.c cVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = cVar.aGd;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "convertType", i4);
        }
        String str = cVar.Lh;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "payload", cVar.Lh);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "clickInfo", cVar.aGe);
        return jSONObject;
    }
}
