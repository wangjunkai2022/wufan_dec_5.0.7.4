package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class dl implements com.kwad.sdk.core.d<com.kwad.sdk.crash.model.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.crash.model.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.crash.model.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.crash.model.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.aHu = jSONObject.optInt("funcSwitch");
        bVar.aHv = jSONObject.optString("minSdkVersion");
        if (JSONObject.NULL.toString().equals(bVar.aHv)) {
            bVar.aHv = "";
        }
        bVar.sdkType = jSONObject.optInt("sdkType");
        bVar.aHw = jSONObject.optString("md5V7");
        if (JSONObject.NULL.toString().equals(bVar.aHw)) {
            bVar.aHw = "";
        }
        bVar.aHx = jSONObject.optString("md5V8");
        if (JSONObject.NULL.toString().equals(bVar.aHx)) {
            bVar.aHx = "";
        }
        bVar.version = jSONObject.optString("version");
        if (JSONObject.NULL.toString().equals(bVar.version)) {
            bVar.version = "";
        }
        bVar.aHy = jSONObject.optString("v7Url");
        if (JSONObject.NULL.toString().equals(bVar.aHy)) {
            bVar.aHy = "";
        }
        bVar.aHz = jSONObject.optString("v8Url");
        if (JSONObject.NULL.toString().equals(bVar.aHz)) {
            bVar.aHz = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.crash.model.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = bVar.aHu;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "funcSwitch", i4);
        }
        String str = bVar.aHv;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "minSdkVersion", bVar.aHv);
        }
        int i5 = bVar.sdkType;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkType", i5);
        }
        String str2 = bVar.aHw;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "md5V7", bVar.aHw);
        }
        String str3 = bVar.aHx;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "md5V8", bVar.aHx);
        }
        String str4 = bVar.version;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "version", bVar.version);
        }
        String str5 = bVar.aHy;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "v7Url", bVar.aHy);
        }
        String str6 = bVar.aHz;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "v8Url", bVar.aHz);
        }
        return jSONObject;
    }
}
