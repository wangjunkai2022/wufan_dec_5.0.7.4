package com.kwad.sdk.core.b.a;

import com.papa91.common.BaseAppConfig;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class da implements com.kwad.sdk.core.d<com.kwad.sdk.core.request.model.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.aux = jSONObject.optString("imei");
        if (JSONObject.NULL.toString().equals(bVar.aux)) {
            bVar.aux = "";
        }
        bVar.aAt = jSONObject.optString("imei1");
        if (JSONObject.NULL.toString().equals(bVar.aAt)) {
            bVar.aAt = "";
        }
        bVar.aAu = jSONObject.optString("imei2");
        if (JSONObject.NULL.toString().equals(bVar.aAu)) {
            bVar.aAu = "";
        }
        bVar.aAv = jSONObject.optString("meid");
        if (JSONObject.NULL.toString().equals(bVar.aAv)) {
            bVar.aAv = "";
        }
        bVar.auy = jSONObject.optString("oaid");
        if (JSONObject.NULL.toString().equals(bVar.auy)) {
            bVar.auy = "";
        }
        bVar.aAw = jSONObject.optString("appMkt");
        if (JSONObject.NULL.toString().equals(bVar.aAw)) {
            bVar.aAw = "";
        }
        bVar.aAx = jSONObject.optString("appMktParam");
        if (JSONObject.NULL.toString().equals(bVar.aAx)) {
            bVar.aAx = "";
        }
        bVar.Su = jSONObject.optString(BaseAppConfig.KEY_ROM_NAME);
        if (JSONObject.NULL.toString().equals(bVar.Su)) {
            bVar.Su = "";
        }
        bVar.XG = jSONObject.optInt("osType");
        bVar.f55899XI = jSONObject.optInt("osApi");
        bVar.aAy = jSONObject.optString("osVersion");
        if (JSONObject.NULL.toString().equals(bVar.aAy)) {
            bVar.aAy = "";
        }
        bVar.XJ = jSONObject.optString("language");
        if (JSONObject.NULL.toString().equals(bVar.XJ)) {
            bVar.XJ = "";
        }
        bVar.XL = jSONObject.optInt("screenWidth");
        bVar.XM = jSONObject.optInt("screenHeight");
        bVar.aAz = jSONObject.optInt("deviceWidth");
        bVar.aAA = jSONObject.optInt("deviceHeight");
        bVar.aAB = jSONObject.optString("androidId");
        if (JSONObject.NULL.toString().equals(bVar.aAB)) {
            bVar.aAB = "";
        }
        bVar.aAC = jSONObject.optString("deviceId");
        if (JSONObject.NULL.toString().equals(bVar.aAC)) {
            bVar.aAC = "";
        }
        bVar.aAD = jSONObject.optString("deviceVendor");
        if (JSONObject.NULL.toString().equals(bVar.aAD)) {
            bVar.aAD = "";
        }
        bVar.aAE = jSONObject.optInt("platform");
        bVar.aAF = jSONObject.optString("deviceModel");
        if (JSONObject.NULL.toString().equals(bVar.aAF)) {
            bVar.aAF = "";
        }
        bVar.XF = jSONObject.optString("deviceBrand");
        if (JSONObject.NULL.toString().equals(bVar.XF)) {
            bVar.XF = "";
        }
        bVar.aAG = jSONObject.optString("deviceSig");
        if (JSONObject.NULL.toString().equals(bVar.aAG)) {
            bVar.aAG = "";
        }
        bVar.aAH = jSONObject.optString("eGid");
        if (JSONObject.NULL.toString().equals(bVar.aAH)) {
            bVar.aAH = "";
        }
        bVar.aAI = jSONObject.optJSONArray("appPackageName");
        bVar.aAJ = jSONObject.optString("arch");
        if (JSONObject.NULL.toString().equals(bVar.aAJ)) {
            bVar.aAJ = "";
        }
        bVar.aAK = jSONObject.optInt("screenDirection");
        bVar.aAL = jSONObject.optString("kwaiVersionName");
        if (JSONObject.NULL.toString().equals(bVar.aAL)) {
            bVar.aAL = "";
        }
        bVar.aAM = jSONObject.optString("kwaiNebulaVersionName");
        if (JSONObject.NULL.toString().equals(bVar.aAM)) {
            bVar.aAM = "";
        }
        bVar.aAN = jSONObject.optString("wechatVersionName");
        if (JSONObject.NULL.toString().equals(bVar.aAN)) {
            bVar.aAN = "";
        }
        bVar.aAO = jSONObject.optLong("sourceFlag");
        bVar.aAP = jSONObject.optString("systemBootTime");
        if (JSONObject.NULL.toString().equals(bVar.aAP)) {
            bVar.aAP = "";
        }
        bVar.aAQ = jSONObject.optString("systemUpdateTime");
        if (JSONObject.NULL.toString().equals(bVar.aAQ)) {
            bVar.aAQ = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.request.model.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = bVar.aux;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei", bVar.aux);
        }
        String str2 = bVar.aAt;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei1", bVar.aAt);
        }
        String str3 = bVar.aAu;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "imei2", bVar.aAu);
        }
        String str4 = bVar.aAv;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "meid", bVar.aAv);
        }
        String str5 = bVar.auy;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "oaid", bVar.auy);
        }
        String str6 = bVar.aAw;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appMkt", bVar.aAw);
        }
        String str7 = bVar.aAx;
        if (str7 != null && !str7.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appMktParam", bVar.aAx);
        }
        String str8 = bVar.Su;
        if (str8 != null && !str8.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, BaseAppConfig.KEY_ROM_NAME, bVar.Su);
        }
        int i4 = bVar.XG;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osType", i4);
        }
        int i5 = bVar.f55899XI;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osApi", i5);
        }
        String str9 = bVar.aAy;
        if (str9 != null && !str9.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "osVersion", bVar.aAy);
        }
        String str10 = bVar.XJ;
        if (str10 != null && !str10.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "language", bVar.XJ);
        }
        int i6 = bVar.XL;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenWidth", i6);
        }
        int i7 = bVar.XM;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenHeight", i7);
        }
        int i8 = bVar.aAz;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceWidth", i8);
        }
        int i9 = bVar.aAA;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceHeight", i9);
        }
        String str11 = bVar.aAB;
        if (str11 != null && !str11.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "androidId", bVar.aAB);
        }
        String str12 = bVar.aAC;
        if (str12 != null && !str12.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceId", bVar.aAC);
        }
        String str13 = bVar.aAD;
        if (str13 != null && !str13.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceVendor", bVar.aAD);
        }
        int i10 = bVar.aAE;
        if (i10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "platform", i10);
        }
        String str14 = bVar.aAF;
        if (str14 != null && !str14.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceModel", bVar.aAF);
        }
        String str15 = bVar.XF;
        if (str15 != null && !str15.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceBrand", bVar.XF);
        }
        String str16 = bVar.aAG;
        if (str16 != null && !str16.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deviceSig", bVar.aAG);
        }
        String str17 = bVar.aAH;
        if (str17 != null && !str17.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "eGid", bVar.aAH);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appPackageName", bVar.aAI);
        String str18 = bVar.aAJ;
        if (str18 != null && !str18.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "arch", bVar.aAJ);
        }
        int i11 = bVar.aAK;
        if (i11 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "screenDirection", i11);
        }
        String str19 = bVar.aAL;
        if (str19 != null && !str19.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "kwaiVersionName", bVar.aAL);
        }
        String str20 = bVar.aAM;
        if (str20 != null && !str20.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "kwaiNebulaVersionName", bVar.aAM);
        }
        String str21 = bVar.aAN;
        if (str21 != null && !str21.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "wechatVersionName", bVar.aAN);
        }
        long j4 = bVar.aAO;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sourceFlag", j4);
        }
        String str22 = bVar.aAP;
        if (str22 != null && !str22.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemBootTime", bVar.aAP);
        }
        String str23 = bVar.aAQ;
        if (str23 != null && !str23.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "systemUpdateTime", bVar.aAQ);
        }
        return jSONObject;
    }
}
