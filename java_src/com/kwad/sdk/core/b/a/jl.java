package com.kwad.sdk.core.b.a;

import com.kwad.sdk.n.k;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class jl implements com.kwad.sdk.core.d<k.a.C0541a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(k.a.C0541a c0541a, JSONObject jSONObject) {
        a2(c0541a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(k.a.C0541a c0541a, JSONObject jSONObject) {
        return b2(c0541a, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(k.a.C0541a c0541a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0541a.aUz = jSONObject.optString("s_cn");
        if (JSONObject.NULL.toString().equals(c0541a.aUz)) {
            c0541a.aUz = "";
        }
        c0541a.aUA = jSONObject.optString("s_mn");
        if (JSONObject.NULL.toString().equals(c0541a.aUA)) {
            c0541a.aUA = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(k.a.C0541a c0541a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = c0541a.aUz;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "s_cn", c0541a.aUz);
        }
        String str2 = c0541a.aUA;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "s_mn", c0541a.aUA);
        }
        return jSONObject;
    }
}
