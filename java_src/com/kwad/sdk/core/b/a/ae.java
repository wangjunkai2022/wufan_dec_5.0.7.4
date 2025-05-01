package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kwad.sdk.core.adlog.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.qq.e.comm.pi.IBidding;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class ae implements com.kwad.sdk.core.d<com.kwad.sdk.core.adlog.c.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.adlog.c.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.adlog.c.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.adlog.c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        AdTemplate adTemplate = new AdTemplate();
        aVar.adTemplate = adTemplate;
        adTemplate.parseJson(jSONObject.optJSONObject("adTemplate"));
        aVar.aqN = jSONObject.optJSONObject("extData");
        aVar.apT = jSONObject.optInt("adActionType");
        aVar.aqO = jSONObject.optInt("photoPlaySecond");
        aVar.aqP = jSONObject.optInt("awardReceiveStage");
        aVar.kl = jSONObject.optInt("itemClickType");
        aVar.aqQ = jSONObject.optInt("itemCloseType");
        aVar.aqR = jSONObject.optInt("elementType");
        aVar.aqS = jSONObject.optString("adRenderArea");
        if (JSONObject.NULL.toString().equals(aVar.aqS)) {
            aVar.aqS = "";
        }
        aVar.aqT = jSONObject.optLong(IBidding.HIGHEST_LOSS_PRICE);
        aVar.aqU = jSONObject.optInt("impFailReason");
        aVar.aqV = jSONObject.optLong("winEcpm");
        aVar.adnType = jSONObject.optInt("adnType");
        aVar.adnName = jSONObject.optString(MediationConstant.KEY_ADN_NAME);
        if (JSONObject.NULL.toString().equals(aVar.adnName)) {
            aVar.adnName = "";
        }
        aVar.aqW = jSONObject.optInt("retainCodeType");
        aVar.Lj = jSONObject.optInt("photoSizeStyle");
        aVar.Lh = jSONObject.optString("payload");
        if (JSONObject.NULL.toString().equals(aVar.Lh)) {
            aVar.Lh = "";
        }
        aVar.aqX = jSONObject.optInt("deeplinkType");
        aVar.aqY = jSONObject.optString("deeplinkAppName");
        if (JSONObject.NULL.toString().equals(aVar.aqY)) {
            aVar.aqY = "";
        }
        aVar.aqZ = jSONObject.optInt("deeplinkFailedReason");
        aVar.downloadSource = jSONObject.optInt("downloadSource");
        aVar.ara = jSONObject.optInt("isPackageChanged");
        aVar.arb = jSONObject.optString("installedFrom");
        if (JSONObject.NULL.toString().equals(aVar.arb)) {
            aVar.arb = "";
        }
        aVar.arc = jSONObject.optString("downloadFailedReason");
        if (JSONObject.NULL.toString().equals(aVar.arc)) {
            aVar.arc = "";
        }
        aVar.ard = jSONObject.optInt("isChangedEndcard");
        aVar.are = jSONObject.optInt("adAggPageSource");
        aVar.arf = jSONObject.optString("serverPackageName");
        if (JSONObject.NULL.toString().equals(aVar.arf)) {
            aVar.arf = "";
        }
        aVar.arg = jSONObject.optString("installedPackageName");
        if (JSONObject.NULL.toString().equals(aVar.arg)) {
            aVar.arg = "";
        }
        aVar.arh = jSONObject.optInt("closeButtonImpressionTime");
        aVar.ari = jSONObject.optInt("closeButtonClickTime");
        aVar.arj = jSONObject.optLong("landingPageLoadedDuration");
        aVar.LJ = jSONObject.optLong("leaveTime");
        aVar.ark = jSONObject.optLong("adItemClickBackDuration");
        aVar.arl = jSONObject.optInt("appStorePageType");
        aVar.arm = jSONObject.optInt("installStatus");
        aVar.downloadStatus = jSONObject.optInt("downloadStatus");
        aVar.arn = jSONObject.optInt("downloadCardType");
        a.C0514a c0514a = new a.C0514a();
        aVar.Li = c0514a;
        c0514a.parseJson(jSONObject.optJSONObject("clientExtData"));
        aVar.OP = jSONObject.optInt("landingPageType");
        aVar.vA = jSONObject.optLong("playedDuration");
        aVar.aro = jSONObject.optInt("playedRate");
        aVar.arp = jSONObject.optInt("adOrder");
        aVar.Lg = jSONObject.optInt("adInterstitialSource");
        aVar.ko = jSONObject.optDouble("splashShakeAcceleration");
        aVar.arq = jSONObject.optString("splashInteractionRotateAngle");
        if (JSONObject.NULL.toString().equals(aVar.arq)) {
            aVar.arq = "";
        }
        aVar.arr = jSONObject.optInt("downloadInstallType");
        aVar.ars = jSONObject.optInt("businessSceneType");
        aVar.adxResult = jSONObject.optInt("adxResult");
        aVar.art = jSONObject.optInt("fingerSwipeType");
        aVar.aru = jSONObject.optInt("fingerSwipeDistance");
        aVar.Lk = jSONObject.optInt("triggerType");
        aVar.arv = jSONObject.optInt("cardCloseType");
        aVar.arw = jSONObject.optString("clientPkFailAdInfo");
        if (JSONObject.NULL.toString().equals(aVar.arw)) {
            aVar.arw = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.adlog.c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "adTemplate", aVar.adTemplate);
        com.kwad.sdk.utils.t.putValue(jSONObject, "extData", aVar.aqN);
        int i4 = aVar.apT;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adActionType", i4);
        }
        int i5 = aVar.aqO;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoPlaySecond", i5);
        }
        int i6 = aVar.aqP;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "awardReceiveStage", i6);
        }
        int i7 = aVar.kl;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "itemClickType", i7);
        }
        int i8 = aVar.aqQ;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "itemCloseType", i8);
        }
        int i9 = aVar.aqR;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "elementType", i9);
        }
        String str = aVar.aqS;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adRenderArea", aVar.aqS);
        }
        long j4 = aVar.aqT;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, IBidding.HIGHEST_LOSS_PRICE, j4);
        }
        int i10 = aVar.aqU;
        if (i10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "impFailReason", i10);
        }
        long j5 = aVar.aqV;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "winEcpm", j5);
        }
        int i11 = aVar.adnType;
        if (i11 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adnType", i11);
        }
        String str2 = aVar.adnName;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MediationConstant.KEY_ADN_NAME, aVar.adnName);
        }
        int i12 = aVar.aqW;
        if (i12 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "retainCodeType", i12);
        }
        int i13 = aVar.Lj;
        if (i13 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoSizeStyle", i13);
        }
        String str3 = aVar.Lh;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "payload", aVar.Lh);
        }
        int i14 = aVar.aqX;
        if (i14 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deeplinkType", i14);
        }
        String str4 = aVar.aqY;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deeplinkAppName", aVar.aqY);
        }
        int i15 = aVar.aqZ;
        if (i15 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deeplinkFailedReason", i15);
        }
        int i16 = aVar.downloadSource;
        if (i16 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadSource", i16);
        }
        int i17 = aVar.ara;
        if (i17 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isPackageChanged", i17);
        }
        String str5 = aVar.arb;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "installedFrom", aVar.arb);
        }
        String str6 = aVar.arc;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadFailedReason", aVar.arc);
        }
        int i18 = aVar.ard;
        if (i18 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isChangedEndcard", i18);
        }
        int i19 = aVar.are;
        if (i19 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adAggPageSource", i19);
        }
        String str7 = aVar.arf;
        if (str7 != null && !str7.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "serverPackageName", aVar.arf);
        }
        String str8 = aVar.arg;
        if (str8 != null && !str8.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "installedPackageName", aVar.arg);
        }
        int i20 = aVar.arh;
        if (i20 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeButtonImpressionTime", i20);
        }
        int i21 = aVar.ari;
        if (i21 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeButtonClickTime", i21);
        }
        long j6 = aVar.arj;
        if (j6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "landingPageLoadedDuration", j6);
        }
        long j7 = aVar.LJ;
        if (j7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "leaveTime", j7);
        }
        long j8 = aVar.ark;
        if (j8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adItemClickBackDuration", j8);
        }
        int i22 = aVar.arl;
        if (i22 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appStorePageType", i22);
        }
        int i23 = aVar.arm;
        if (i23 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "installStatus", i23);
        }
        int i24 = aVar.downloadStatus;
        if (i24 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadStatus", i24);
        }
        int i25 = aVar.arn;
        if (i25 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadCardType", i25);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "clientExtData", aVar.Li);
        int i26 = aVar.OP;
        if (i26 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "landingPageType", i26);
        }
        long j9 = aVar.vA;
        if (j9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playedDuration", j9);
        }
        int i27 = aVar.aro;
        if (i27 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playedRate", i27);
        }
        int i28 = aVar.arp;
        if (i28 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adOrder", i28);
        }
        int i29 = aVar.Lg;
        if (i29 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adInterstitialSource", i29);
        }
        double d5 = aVar.ko;
        if (d5 != 0.0d) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "splashShakeAcceleration", d5);
        }
        String str9 = aVar.arq;
        if (str9 != null && !str9.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "splashInteractionRotateAngle", aVar.arq);
        }
        int i30 = aVar.arr;
        if (i30 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadInstallType", i30);
        }
        int i31 = aVar.ars;
        if (i31 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "businessSceneType", i31);
        }
        int i32 = aVar.adxResult;
        if (i32 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adxResult", i32);
        }
        int i33 = aVar.art;
        if (i33 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fingerSwipeType", i33);
        }
        int i34 = aVar.aru;
        if (i34 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fingerSwipeDistance", i34);
        }
        int i35 = aVar.Lk;
        if (i35 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "triggerType", i35);
        }
        int i36 = aVar.arv;
        if (i36 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardCloseType", i36);
        }
        String str10 = aVar.arw;
        if (str10 != null && !str10.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clientPkFailAdInfo", aVar.arw);
        }
        return jSONObject;
    }
}
