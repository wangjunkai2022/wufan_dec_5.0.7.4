package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.a.a;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class db implements com.kwad.sdk.core.d<a.C0477a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0477a c0477a, JSONObject jSONObject) {
        a2(c0477a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0477a c0477a, JSONObject jSONObject) {
        return b2(c0477a, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0477a c0477a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0477a.url = jSONObject.optString("url");
        if (JSONObject.NULL.toString().equals(c0477a.url)) {
            c0477a.url = "";
        }
        c0477a.packageName = jSONObject.optString("packageName");
        if (JSONObject.NULL.toString().equals(c0477a.packageName)) {
            c0477a.packageName = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0477a c0477a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = c0477a.url;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", c0477a.url);
        }
        String str2 = c0477a.packageName;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "packageName", c0477a.packageName);
        }
        return jSONObject;
    }
}
