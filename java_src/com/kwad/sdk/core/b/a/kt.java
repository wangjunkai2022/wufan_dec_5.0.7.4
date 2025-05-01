package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class kt implements com.kwad.sdk.core.d<com.kwad.components.core.webview.tachikoma.b.y> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.b.y yVar, JSONObject jSONObject) {
        a2(yVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.components.core.webview.tachikoma.b.y yVar, JSONObject jSONObject) {
        return b2(yVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.components.core.webview.tachikoma.b.y yVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        yVar.nF = jSONObject.optInt("currentTime");
        yVar.abj = jSONObject.optBoolean(com.alipay.sdk.util.f.f4952h);
        yVar.abf = jSONObject.optBoolean("finished");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.components.core.webview.tachikoma.b.y yVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = yVar.nF;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentTime", i4);
        }
        boolean z4 = yVar.abj;
        if (z4) {
            com.kwad.sdk.utils.t.putValue(jSONObject, com.alipay.sdk.util.f.f4952h, z4);
        }
        boolean z5 = yVar.abf;
        if (z5) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "finished", z5);
        }
        return jSONObject;
    }
}
