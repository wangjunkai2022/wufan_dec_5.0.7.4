package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kwad.components.core.webview.jshandler.ah;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class kk implements com.kwad.sdk.core.d<ah.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(ah.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(ah.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(ah.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.type = jSONObject.optInt("type");
        aVar.appName = jSONObject.optString(TTDownloadField.TT_APP_NAME);
        if (JSONObject.NULL.toString().equals(aVar.appName)) {
            aVar.appName = "";
        }
        aVar.pkgName = jSONObject.optString("pkgName");
        if (JSONObject.NULL.toString().equals(aVar.pkgName)) {
            aVar.pkgName = "";
        }
        aVar.version = jSONObject.optString("version");
        if (JSONObject.NULL.toString().equals(aVar.version)) {
            aVar.version = "";
        }
        aVar.versionCode = jSONObject.optInt(TTDownloadField.TT_VERSION_CODE);
        aVar.XR = jSONObject.optInt("appSize");
        aVar.md5 = jSONObject.optString("md5");
        if (JSONObject.NULL.toString().equals(aVar.md5)) {
            aVar.md5 = "";
        }
        aVar.url = jSONObject.optString("url");
        if (JSONObject.NULL.toString().equals(aVar.url)) {
            aVar.url = "";
        }
        aVar.XS = jSONObject.optString("appLink");
        if (JSONObject.NULL.toString().equals(aVar.XS)) {
            aVar.XS = "";
        }
        aVar.icon = jSONObject.optString("icon");
        if (JSONObject.NULL.toString().equals(aVar.icon)) {
            aVar.icon = "";
        }
        aVar.qc = jSONObject.optString("desc");
        if (JSONObject.NULL.toString().equals(aVar.qc)) {
            aVar.qc = "";
        }
        aVar.appId = jSONObject.optString("appId");
        if (JSONObject.NULL.toString().equals(aVar.appId)) {
            aVar.appId = "";
        }
        aVar.XT = jSONObject.optString("marketUri");
        if (JSONObject.NULL.toString().equals(aVar.XT)) {
            aVar.XT = "";
        }
        aVar.XU = jSONObject.optBoolean("disableLandingPageDeepLink");
        aVar.XV = jSONObject.optBoolean("isLandscapeSupported");
        aVar.XW = jSONObject.optBoolean("isFromLive");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(ah.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = aVar.type;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", i4);
        }
        String str = aVar.appName;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, TTDownloadField.TT_APP_NAME, aVar.appName);
        }
        String str2 = aVar.pkgName;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pkgName", aVar.pkgName);
        }
        String str3 = aVar.version;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "version", aVar.version);
        }
        int i5 = aVar.versionCode;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, TTDownloadField.TT_VERSION_CODE, i5);
        }
        int i6 = aVar.XR;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appSize", i6);
        }
        String str4 = aVar.md5;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "md5", aVar.md5);
        }
        String str5 = aVar.url;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", aVar.url);
        }
        String str6 = aVar.XS;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appLink", aVar.XS);
        }
        String str7 = aVar.icon;
        if (str7 != null && !str7.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "icon", aVar.icon);
        }
        String str8 = aVar.qc;
        if (str8 != null && !str8.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "desc", aVar.qc);
        }
        String str9 = aVar.appId;
        if (str9 != null && !str9.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", aVar.appId);
        }
        String str10 = aVar.XT;
        if (str10 != null && !str10.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "marketUri", aVar.XT);
        }
        boolean z4 = aVar.XU;
        if (z4) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "disableLandingPageDeepLink", z4);
        }
        boolean z5 = aVar.XV;
        if (z5) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isLandscapeSupported", z5);
        }
        boolean z6 = aVar.XW;
        if (z6) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isFromLive", z6);
        }
        return jSONObject;
    }
}
