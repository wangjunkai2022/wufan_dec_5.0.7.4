package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class bg implements com.kwad.sdk.core.d<com.kwad.sdk.commercial.b.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.commercial.b.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.commercial.b.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.commercial.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.status = jSONObject.optInt("status");
        bVar.url = jSONObject.optString("url");
        if (JSONObject.NULL.toString().equals(bVar.url)) {
            bVar.url = "";
        }
        bVar.apj = jSONObject.optString("url_host");
        if (JSONObject.NULL.toString().equals(bVar.apj)) {
            bVar.apj = "";
        }
        bVar.apq = jSONObject.optString("url_path");
        if (JSONObject.NULL.toString().equals(bVar.apq)) {
            bVar.apq = "";
        }
        bVar.apr = jSONObject.optString("market_pkg_name");
        if (JSONObject.NULL.toString().equals(bVar.apr)) {
            bVar.apr = "";
        }
        bVar.aps = jSONObject.optInt("store_type");
        bVar.apt = jSONObject.optInt("launch_type");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.commercial.b.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = bVar.status;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", i4);
        }
        String str = bVar.url;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", bVar.url);
        }
        String str2 = bVar.apj;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url_host", bVar.apj);
        }
        String str3 = bVar.apq;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url_path", bVar.apq);
        }
        String str4 = bVar.apr;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "market_pkg_name", bVar.apr);
        }
        int i5 = bVar.aps;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "store_type", i5);
        }
        int i6 = bVar.apt;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "launch_type", i6);
        }
        return jSONObject;
    }
}
