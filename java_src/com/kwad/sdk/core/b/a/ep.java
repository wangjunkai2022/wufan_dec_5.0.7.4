package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.coremedia.iso.boxes.k1;
import com.kwad.sdk.core.webview.d.a;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class ep implements com.kwad.sdk.core.d<a.C0530a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0530a c0530a, JSONObject jSONObject) {
        a2(c0530a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0530a c0530a, JSONObject jSONObject) {
        return b2(c0530a, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0530a c0530a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0530a.Xz = jSONObject.optString("SDKVersion");
        if (JSONObject.NULL.toString().equals(c0530a.Xz)) {
            c0530a.Xz = "";
        }
        c0530a.XA = jSONObject.optInt("SDKVersionCode");
        c0530a.azQ = jSONObject.optString("tkVersion");
        if (JSONObject.NULL.toString().equals(c0530a.azQ)) {
            c0530a.azQ = "";
        }
        c0530a.XB = jSONObject.optString("sdkApiVersion");
        if (JSONObject.NULL.toString().equals(c0530a.XB)) {
            c0530a.XB = "";
        }
        c0530a.XC = jSONObject.optInt("sdkApiVersionCode");
        c0530a.sdkType = jSONObject.optInt("sdkType");
        c0530a.appVersion = jSONObject.optString("appVersion");
        if (JSONObject.NULL.toString().equals(c0530a.appVersion)) {
            c0530a.appVersion = "";
        }
        c0530a.appName = jSONObject.optString(TTDownloadField.TT_APP_NAME);
        if (JSONObject.NULL.toString().equals(c0530a.appName)) {
            c0530a.appName = "";
        }
        c0530a.appId = jSONObject.optString("appId");
        if (JSONObject.NULL.toString().equals(c0530a.appId)) {
            c0530a.appId = "";
        }
        c0530a.aFT = jSONObject.optString("globalId");
        if (JSONObject.NULL.toString().equals(c0530a.aFT)) {
            c0530a.aFT = "";
        }
        c0530a.aAH = jSONObject.optString("eGid");
        if (JSONObject.NULL.toString().equals(c0530a.aAH)) {
            c0530a.aAH = "";
        }
        c0530a.aAG = jSONObject.optString("deviceSig");
        if (JSONObject.NULL.toString().equals(c0530a.aAG)) {
            c0530a.aAG = "";
        }
        c0530a.XD = jSONObject.optString("networkType");
        if (JSONObject.NULL.toString().equals(c0530a.XD)) {
            c0530a.XD = "";
        }
        c0530a.XE = jSONObject.optString("manufacturer");
        if (JSONObject.NULL.toString().equals(c0530a.XE)) {
            c0530a.XE = "";
        }
        c0530a.model = jSONObject.optString("model");
        if (JSONObject.NULL.toString().equals(c0530a.model)) {
            c0530a.model = "";
        }
        c0530a.XF = jSONObject.optString("deviceBrand");
        if (JSONObject.NULL.toString().equals(c0530a.XF)) {
            c0530a.XF = "";
        }
        c0530a.XG = jSONObject.optInt("osType");
        c0530a.XH = jSONObject.optString("systemVersion");
        if (JSONObject.NULL.toString().equals(c0530a.XH)) {
            c0530a.XH = "";
        }
        c0530a.f55903XI = jSONObject.optInt("osApi");
        c0530a.XJ = jSONObject.optString("language");
        if (JSONObject.NULL.toString().equals(c0530a.XJ)) {
            c0530a.XJ = "";
        }
        c0530a.XK = jSONObject.optString("locale");
        if (JSONObject.NULL.toString().equals(c0530a.XK)) {
            c0530a.XK = "";
        }
        c0530a.aFU = jSONObject.optString(k1.f9761p);
        if (JSONObject.NULL.toString().equals(c0530a.aFU)) {
            c0530a.aFU = "";
        }
        c0530a.aFV = jSONObject.optBoolean("isDynamic");
        c0530a.XL = jSONObject.optInt("screenWidth");
        c0530a.XM = jSONObject.optInt("screenHeight");
        c0530a.aux = jSONObject.optString("imei");
        if (JSONObject.NULL.toString().equals(c0530a.aux)) {
            c0530a.aux = "";
        }
        c0530a.auy = jSONObject.optString("oaid");
        if (JSONObject.NULL.toString().equals(c0530a.auy)) {
            c0530a.auy = "";
        }
        c0530a.aAB = jSONObject.optString("androidId");
        if (JSONObject.NULL.toString().equals(c0530a.aAB)) {
            c0530a.aAB = "";
        }
        c0530a.aAS = jSONObject.optString("mac");
        if (JSONObject.NULL.toString().equals(c0530a.aAS)) {
            c0530a.aAS = "";
        }
        c0530a.XN = jSONObject.optInt("statusBarHeight");
        c0530a.XO = jSONObject.optInt("titleBarHeight");
        c0530a.aFW = jSONObject.optString("bridgeVersion");
        if (JSONObject.NULL.toString().equals(c0530a.aFW)) {
            c0530a.aFW = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0530a c0530a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = c0530a.Xz;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersion", c0530a.Xz);
        }
        int i4 = c0530a.XA;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "SDKVersionCode", i4);
        }
        String str2 = c0530a.azQ;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tkVersion", c0530a.azQ);
        }
        String str3 = c0530a.XB;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersion", c0530a.XB);
        }
        int i5 = c0530a.XC;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersionCode", i5);
        }
        int i6 = c0530a.sdkType;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkType", i6);
        }
        String str4 = c0530a.appVersion;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appVersion", c0530a.appVersion);
        }
        String str5 = c0530a.appName;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, TTDownloadField.TT_APP_NAME, c0530a.appName);
        }
        String str6 = c0530a.appId;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appId", c0530a.appId);
        }
        String str7 = c0530a.aFT;
        if (str7 != null && !str7.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "globalId", c0530a.aFT);
        }
        String str8 = c0530a.aAH;
        if (str8 != null && !str8.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "eGid", c0530a.aAH);
        }
        String str9 = c0530a.aAG;
        if (str9 != null && !str9.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceSig", c0530a.aAG);
        }
        String str10 = c0530a.XD;
        if (str10 != null && !str10.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "networkType", c0530a.XD);
        }
        String str11 = c0530a.XE;
        if (str11 != null && !str11.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "manufacturer", c0530a.XE);
        }
        String str12 = c0530a.model;
        if (str12 != null && !str12.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "model", c0530a.model);
        }
        String str13 = c0530a.XF;
        if (str13 != null && !str13.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceBrand", c0530a.XF);
        }
        int i7 = c0530a.XG;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osType", i7);
        }
        String str14 = c0530a.XH;
        if (str14 != null && !str14.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemVersion", c0530a.XH);
        }
        int i8 = c0530a.f55903XI;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osApi", i8);
        }
        String str15 = c0530a.XJ;
        if (str15 != null && !str15.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "language", c0530a.XJ);
        }
        String str16 = c0530a.XK;
        if (str16 != null && !str16.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "locale", c0530a.XK);
        }
        String str17 = c0530a.aFU;
        if (str17 != null && !str17.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, k1.f9761p, c0530a.aFU);
        }
        boolean z4 = c0530a.aFV;
        if (z4) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isDynamic", z4);
        }
        int i9 = c0530a.XL;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenWidth", i9);
        }
        int i10 = c0530a.XM;
        if (i10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenHeight", i10);
        }
        String str18 = c0530a.aux;
        if (str18 != null && !str18.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei", c0530a.aux);
        }
        String str19 = c0530a.auy;
        if (str19 != null && !str19.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "oaid", c0530a.auy);
        }
        String str20 = c0530a.aAB;
        if (str20 != null && !str20.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "androidId", c0530a.aAB);
        }
        String str21 = c0530a.aAS;
        if (str21 != null && !str21.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mac", c0530a.aAS);
        }
        int i11 = c0530a.XN;
        if (i11 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "statusBarHeight", i11);
        }
        int i12 = c0530a.XO;
        if (i12 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "titleBarHeight", i12);
        }
        String str22 = c0530a.aFW;
        if (str22 != null && !str22.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bridgeVersion", c0530a.aFW);
        }
        return jSONObject;
    }
}
