package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class bx implements com.kwad.sdk.core.d<com.kwad.sdk.core.webview.d.b.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.f55904x = jSONObject.optDouble("x");
        bVar.f55905y = jSONObject.optDouble("y");
        bVar.width = jSONObject.optInt("width");
        bVar.height = jSONObject.optInt("height");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.webview.d.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        double d5 = bVar.f55904x;
        if (d5 != 0.0d) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "x", d5);
        }
        double d6 = bVar.f55905y;
        if (d6 != 0.0d) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "y", d6);
        }
        int i4 = bVar.width;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "width", i4);
        }
        int i5 = bVar.height;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "height", i5);
        }
        return jSONObject;
    }
}
