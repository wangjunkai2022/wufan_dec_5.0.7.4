package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class bc implements com.kwad.sdk.core.d<com.kwad.sdk.commercial.a.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.commercial.a.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.commercial.a.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.commercial.a.b bVar, JSONObject jSONObject) {
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
        bVar.downloadId = jSONObject.optString("download_id");
        if (JSONObject.NULL.toString().equals(bVar.downloadId)) {
            bVar.downloadId = "";
        }
        bVar.apk = jSONObject.optString("apk_package");
        if (JSONObject.NULL.toString().equals(bVar.apk)) {
            bVar.apk = "";
        }
        bVar.apl = jSONObject.optString("apk_name");
        if (JSONObject.NULL.toString().equals(bVar.apl)) {
            bVar.apl = "";
        }
        bVar.apm = jSONObject.optLong("apk_size");
        bVar.downloadTime = jSONObject.optLong("download_time");
        bVar.apn = jSONObject.optLong("apk_cur_size");
        bVar.apo = jSONObject.optInt("apk_install_type");
        bVar.f55897app = jSONObject.optInt("apk_install_source");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.commercial.a.b bVar, JSONObject jSONObject) {
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
        String str3 = bVar.downloadId;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_id", bVar.downloadId);
        }
        String str4 = bVar.apk;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apk_package", bVar.apk);
        }
        String str5 = bVar.apl;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apk_name", bVar.apl);
        }
        long j4 = bVar.apm;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apk_size", j4);
        }
        long j5 = bVar.downloadTime;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_time", j5);
        }
        long j6 = bVar.apn;
        if (j6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apk_cur_size", j6);
        }
        int i5 = bVar.apo;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apk_install_type", i5);
        }
        int i6 = bVar.f55897app;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "apk_install_source", i6);
        }
        return jSONObject;
    }
}
