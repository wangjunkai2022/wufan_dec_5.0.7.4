package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kwad.components.core.webview.jshandler.af;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class hr implements com.kwad.sdk.core.d<af.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(af.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(af.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(af.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.Xz = jSONObject.optString("SDKVersion");
        if (JSONObject.NULL.toString().equals(aVar.Xz)) {
            aVar.Xz = "";
        }
        aVar.XA = jSONObject.optInt("SDKVersionCode");
        aVar.XB = jSONObject.optString("sdkApiVersion");
        if (JSONObject.NULL.toString().equals(aVar.XB)) {
            aVar.XB = "";
        }
        aVar.XC = jSONObject.optInt("sdkApiVersionCode");
        aVar.sdkType = jSONObject.optInt("sdkType");
        aVar.appVersion = jSONObject.optString("appVersion");
        if (JSONObject.NULL.toString().equals(aVar.appVersion)) {
            aVar.appVersion = "";
        }
        aVar.appName = jSONObject.optString(TTDownloadField.TT_APP_NAME);
        if (JSONObject.NULL.toString().equals(aVar.appName)) {
            aVar.appName = "";
        }
        aVar.appId = jSONObject.optString("appId");
        if (JSONObject.NULL.toString().equals(aVar.appId)) {
            aVar.appId = "";
        }
        aVar.XD = jSONObject.optString("networkType");
        if (JSONObject.NULL.toString().equals(aVar.XD)) {
            aVar.XD = "";
        }
        aVar.XE = jSONObject.optString("manufacturer");
        if (JSONObject.NULL.toString().equals(aVar.XE)) {
            aVar.XE = "";
        }
        aVar.model = jSONObject.optString("model");
        if (JSONObject.NULL.toString().equals(aVar.model)) {
            aVar.model = "";
        }
        aVar.XF = jSONObject.optString("deviceBrand");
        if (JSONObject.NULL.toString().equals(aVar.XF)) {
            aVar.XF = "";
        }
        aVar.XG = jSONObject.optInt("osType");
        aVar.XH = jSONObject.optString("systemVersion");
        if (JSONObject.NULL.toString().equals(aVar.XH)) {
            aVar.XH = "";
        }
        aVar.f55896XI = jSONObject.optInt("osApi");
        aVar.XJ = jSONObject.optString("language");
        if (JSONObject.NULL.toString().equals(aVar.XJ)) {
            aVar.XJ = "";
        }
        aVar.XK = jSONObject.optString("locale");
        if (JSONObject.NULL.toString().equals(aVar.XK)) {
            aVar.XK = "";
        }
        aVar.XL = jSONObject.optInt("screenWidth");
        aVar.XM = jSONObject.optInt("screenHeight");
        aVar.XN = jSONObject.optInt("statusBarHeight");
        aVar.XO = jSONObject.optInt("titleBarHeight");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(af.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = aVar.Xz;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersion", aVar.Xz);
        }
        int i4 = aVar.XA;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersionCode", i4);
        }
        String str2 = aVar.XB;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersion", aVar.XB);
        }
        int i5 = aVar.XC;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersionCode", i5);
        }
        int i6 = aVar.sdkType;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkType", i6);
        }
        String str3 = aVar.appVersion;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appVersion", aVar.appVersion);
        }
        String str4 = aVar.appName;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, TTDownloadField.TT_APP_NAME, aVar.appName);
        }
        String str5 = aVar.appId;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", aVar.appId);
        }
        String str6 = aVar.XD;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "networkType", aVar.XD);
        }
        String str7 = aVar.XE;
        if (str7 != null && !str7.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "manufacturer", aVar.XE);
        }
        String str8 = aVar.model;
        if (str8 != null && !str8.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "model", aVar.model);
        }
        String str9 = aVar.XF;
        if (str9 != null && !str9.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceBrand", aVar.XF);
        }
        int i7 = aVar.XG;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osType", i7);
        }
        String str10 = aVar.XH;
        if (str10 != null && !str10.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemVersion", aVar.XH);
        }
        int i8 = aVar.f55896XI;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osApi", i8);
        }
        String str11 = aVar.XJ;
        if (str11 != null && !str11.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "language", aVar.XJ);
        }
        String str12 = aVar.XK;
        if (str12 != null && !str12.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "locale", aVar.XK);
        }
        int i9 = aVar.XL;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenWidth", i9);
        }
        int i10 = aVar.XM;
        if (i10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenHeight", i10);
        }
        int i11 = aVar.XN;
        if (i11 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "statusBarHeight", i11);
        }
        int i12 = aVar.XO;
        if (i12 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "titleBarHeight", i12);
        }
        return jSONObject;
    }
}
