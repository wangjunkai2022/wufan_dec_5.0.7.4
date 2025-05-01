package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.a;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class ai implements com.kwad.sdk.core.d<a.C0478a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0478a c0478a, JSONObject jSONObject) {
        a2(c0478a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0478a c0478a, JSONObject jSONObject) {
        return b2(c0478a, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0478a c0478a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0478a.JK = jSONObject.optString("creativeId");
        if (JSONObject.NULL.toString().equals(c0478a.JK)) {
            c0478a.JK = "";
        }
        c0478a.WC = jSONObject.optString("targetMethod");
        if (JSONObject.NULL.toString().equals(c0478a.WC)) {
            c0478a.WC = "";
        }
        c0478a.WD = jSONObject.optString("methodParams");
        if (JSONObject.NULL.toString().equals(c0478a.WD)) {
            c0478a.WD = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0478a c0478a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = c0478a.JK;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", c0478a.JK);
        }
        String str2 = c0478a.WC;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "targetMethod", c0478a.WC);
        }
        String str3 = c0478a.WD;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "methodParams", c0478a.WD);
        }
        return jSONObject;
    }
}
