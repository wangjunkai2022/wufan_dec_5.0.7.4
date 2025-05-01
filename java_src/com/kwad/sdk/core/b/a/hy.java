package com.kwad.sdk.core.b.a;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kwad.sdk.core.report.n;
import com.kwad.sdk.core.scene.URLPackage;
import com.umeng.umcrash.UMCrash;
import io.netty.handler.codec.rtsp.RtspHeaders;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class hy implements com.kwad.sdk.core.d<com.kwad.sdk.core.report.n> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.report.n nVar, JSONObject jSONObject) {
        a2(nVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.report.n nVar, JSONObject jSONObject) {
        return b2(nVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.report.n nVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        nVar.timestamp = jSONObject.optLong(UMCrash.SP_KEY_TIMESTAMP);
        nVar.sessionId = jSONObject.optString("sessionId");
        if (JSONObject.NULL.toString().equals(nVar.sessionId)) {
            nVar.sessionId = "";
        }
        nVar.Jg = jSONObject.optLong(RtspHeaders.Values.SEQ);
        nVar.ayV = jSONObject.optLong("listId");
        nVar.actionType = jSONObject.optLong("actionType");
        nVar.Lh = jSONObject.optString("payload");
        if (JSONObject.NULL.toString().equals(nVar.Lh)) {
            nVar.Lh = "";
        }
        nVar.llsid = jSONObject.optLong("llsid");
        nVar.ayW = jSONObject.optJSONObject("extra");
        nVar.ayX = jSONObject.optJSONObject("impAdExtra");
        nVar.posId = jSONObject.optLong("posId");
        nVar.contentType = jSONObject.optInt("contentType");
        nVar.realShowType = jSONObject.optInt("realShowType");
        nVar.photoId = jSONObject.optLong("photoId");
        nVar.position = jSONObject.optLong("position");
        nVar.ayY = jSONObject.optLong("serverPosition");
        nVar.ayZ = jSONObject.optLong("photoDuration");
        nVar.aza = jSONObject.optLong("effectivePlayDuration");
        nVar.WF = jSONObject.optLong("playDuration");
        nVar.blockDuration = jSONObject.optLong("blockDuration");
        nVar.azb = jSONObject.optLong("intervalDuration");
        nVar.azc = jSONObject.optLong("allIntervalDuration");
        nVar.azd = jSONObject.optLong("flowSdk");
        nVar.aze = jSONObject.optLong("blockTimes");
        nVar.contentSourceType = jSONObject.optInt("contentSourceType", new Integer("0").intValue());
        nVar.are = jSONObject.optInt("adAggPageSource");
        nVar.entryPageSource = jSONObject.optString("entryPageSource");
        if (JSONObject.NULL.toString().equals(nVar.entryPageSource)) {
            nVar.entryPageSource = "";
        }
        URLPackage uRLPackage = new URLPackage();
        nVar.urlPackage = uRLPackage;
        uRLPackage.parseJson(jSONObject.optJSONObject("urlPackage"));
        URLPackage uRLPackage2 = new URLPackage();
        nVar.azf = uRLPackage2;
        uRLPackage2.parseJson(jSONObject.optJSONObject("referURLPackage"));
        nVar.SK = jSONObject.optLong(URLPackage.KEY_AUTHOR_ID);
        nVar.azg = jSONObject.optString("photoSize");
        if (JSONObject.NULL.toString().equals(nVar.azg)) {
            nVar.azg = "";
        }
        nVar.azh = jSONObject.optJSONArray("appInstalled");
        nVar.azi = jSONObject.optJSONArray("appUninstalled");
        n.a aVar = new n.a();
        nVar.azj = aVar;
        aVar.parseJson(jSONObject.optJSONObject("clientExt"));
        nVar.azk = jSONObject.optInt("playerType");
        nVar.azl = jSONObject.optInt("uiType");
        nVar.azm = jSONObject.optInt("isLeftSlipStatus", new Integer("0").intValue());
        nVar.Ye = jSONObject.optInt("refreshType");
        nVar.azn = jSONObject.optInt("photoResponseType", new Integer("0").intValue());
        nVar.azo = jSONObject.optString("failUrl");
        if (JSONObject.NULL.toString().equals(nVar.azo)) {
            nVar.azo = "";
        }
        nVar.errorMsg = jSONObject.optString(MediationConstant.KEY_ERROR_MSG);
        if (JSONObject.NULL.toString().equals(nVar.errorMsg)) {
            nVar.errorMsg = "";
        }
        nVar.errorCode = jSONObject.optInt(MediationConstant.KEY_ERROR_CODE, new Integer("0").intValue());
        nVar.creativeId = jSONObject.optLong("creativeId");
        nVar.azr = jSONObject.optString("cacheFailedReason");
        if (JSONObject.NULL.toString().equals(nVar.azr)) {
            nVar.azr = "";
        }
        nVar.azs = jSONObject.optJSONObject("appExt");
        nVar.azt = jSONObject.optJSONArray("appRunningInfoList");
        nVar.downloadDuration = jSONObject.optLong("downloadDuration");
        nVar.pageType = jSONObject.optInt("pageType", new Integer("0").intValue());
        nVar.azu = jSONObject.optInt("speedLimitStatus");
        nVar.azv = jSONObject.optInt("speedLimitThreshold");
        nVar.azw = jSONObject.optInt("currentRealDownloadSpeed");
        nVar.azy = jSONObject.optJSONArray("sdkPlatform");
        nVar.azz = jSONObject.optBoolean("isKsUnion");
        nVar.azA = jSONObject.optString("trackMethodName");
        if (JSONObject.NULL.toString().equals(nVar.azA)) {
            nVar.azA = "";
        }
        nVar.azB = jSONObject.optInt("viewModeType", new Integer("0").intValue());
        nVar.clickTime = jSONObject.optLong("clickTime");
        nVar.azD = jSONObject.optLong("frameRenderTime");
        nVar.azE = jSONObject.optInt("playerEnterAction");
        nVar.azF = jSONObject.optString("requestUrl");
        if (JSONObject.NULL.toString().equals(nVar.azF)) {
            nVar.azF = "";
        }
        nVar.azG = jSONObject.optLong("requestTotalTime");
        nVar.azH = jSONObject.optLong("requestResponseTime");
        nVar.azI = jSONObject.optLong("requestParseDataTime");
        nVar.azJ = jSONObject.optLong("requestCallbackTime");
        nVar.azK = jSONObject.optString("requestFailReason");
        if (JSONObject.NULL.toString().equals(nVar.azK)) {
            nVar.azK = "";
        }
        nVar.RH = jSONObject.optString("pageName");
        if (JSONObject.NULL.toString().equals(nVar.RH)) {
            nVar.RH = "";
        }
        nVar.RP = jSONObject.optLong("pageCreateTime");
        nVar.RQ = jSONObject.optLong("pageResumeTime");
        nVar.azL = jSONObject.optInt("trackUrlType");
        nVar.azM = jSONObject.optJSONArray("trackUrlList");
        nVar.RO = jSONObject.optLong("pageLaunchTime");
        nVar.azP = jSONObject.optJSONArray("appAuthorityInfoList");
        nVar.azQ = jSONObject.optString("tkVersion");
        if (JSONObject.NULL.toString().equals(nVar.azQ)) {
            nVar.azQ = "";
        }
        nVar.azR = jSONObject.optString("jsVersion");
        if (JSONObject.NULL.toString().equals(nVar.azR)) {
            nVar.azR = "";
        }
        nVar.azS = jSONObject.optString("jsFileName");
        if (JSONObject.NULL.toString().equals(nVar.azS)) {
            nVar.azS = "";
        }
        nVar.azT = jSONObject.optString("jsErrorMsg");
        if (JSONObject.NULL.toString().equals(nVar.azT)) {
            nVar.azT = "";
        }
        nVar.azU = jSONObject.optString("jsConfig");
        if (JSONObject.NULL.toString().equals(nVar.azU)) {
            nVar.azU = "";
        }
        nVar.azV = jSONObject.optInt("adBizType");
        nVar.azW = jSONObject.optString("customKey");
        if (JSONObject.NULL.toString().equals(nVar.azW)) {
            nVar.azW = "";
        }
        nVar.azX = jSONObject.optString("customValue");
        if (JSONObject.NULL.toString().equals(nVar.azX)) {
            nVar.azX = "";
        }
        nVar.trace = jSONObject.optString("trace");
        if (JSONObject.NULL.toString().equals(nVar.trace)) {
            nVar.trace = "";
        }
        nVar.azY = jSONObject.optInt("filterCode");
        nVar.azZ = jSONObject.optInt("sdkVersionCode");
        nVar.sdkVersion = jSONObject.optString("sdkVersion");
        if (JSONObject.NULL.toString().equals(nVar.sdkVersion)) {
            nVar.sdkVersion = "";
        }
        nVar.aAa = jSONObject.optString("adSdkVersion");
        if (JSONObject.NULL.toString().equals(nVar.aAa)) {
            nVar.aAa = "";
        }
        nVar.XB = jSONObject.optString("sdkApiVersion");
        if (JSONObject.NULL.toString().equals(nVar.XB)) {
            nVar.XB = "";
        }
        nVar.sdkType = jSONObject.optInt("sdkType");
        nVar.aAb = jSONObject.optLong("appUseDuration");
        nVar.aAc = jSONObject.optLong("appStartType");
        nVar.avo = jSONObject.optLong("sequenceNumber");
        nVar.Jd = jSONObject.optString("appColdStart");
        if (JSONObject.NULL.toString().equals(nVar.Jd)) {
            nVar.Jd = "";
        }
        nVar.Je = jSONObject.optString("appStart");
        if (JSONObject.NULL.toString().equals(nVar.Je)) {
            nVar.Je = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.report.n nVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        long j4 = nVar.timestamp;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, UMCrash.SP_KEY_TIMESTAMP, j4);
        }
        String str = nVar.sessionId;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sessionId", nVar.sessionId);
        }
        long j5 = nVar.Jg;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, RtspHeaders.Values.SEQ, j5);
        }
        long j6 = nVar.ayV;
        if (j6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "listId", j6);
        }
        long j7 = nVar.actionType;
        if (j7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "actionType", j7);
        }
        String str2 = nVar.Lh;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "payload", nVar.Lh);
        }
        long j8 = nVar.llsid;
        if (j8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "llsid", j8);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "extra", nVar.ayW);
        com.kwad.sdk.utils.t.putValue(jSONObject, "impAdExtra", nVar.ayX);
        long j9 = nVar.posId;
        if (j9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posId", j9);
        }
        int i4 = nVar.contentType;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "contentType", i4);
        }
        int i5 = nVar.realShowType;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "realShowType", i5);
        }
        long j10 = nVar.photoId;
        if (j10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoId", j10);
        }
        long j11 = nVar.position;
        if (j11 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "position", j11);
        }
        long j12 = nVar.ayY;
        if (j12 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "serverPosition", j12);
        }
        long j13 = nVar.ayZ;
        if (j13 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoDuration", j13);
        }
        long j14 = nVar.aza;
        if (j14 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "effectivePlayDuration", j14);
        }
        long j15 = nVar.WF;
        if (j15 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playDuration", j15);
        }
        long j16 = nVar.blockDuration;
        if (j16 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blockDuration", j16);
        }
        long j17 = nVar.azb;
        if (j17 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "intervalDuration", j17);
        }
        long j18 = nVar.azc;
        if (j18 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "allIntervalDuration", j18);
        }
        long j19 = nVar.azd;
        if (j19 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "flowSdk", j19);
        }
        long j20 = nVar.aze;
        if (j20 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blockTimes", j20);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "contentSourceType", nVar.contentSourceType);
        int i6 = nVar.are;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adAggPageSource", i6);
        }
        String str3 = nVar.entryPageSource;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "entryPageSource", nVar.entryPageSource);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "urlPackage", nVar.urlPackage);
        com.kwad.sdk.utils.t.a(jSONObject, "referURLPackage", nVar.azf);
        long j21 = nVar.SK;
        if (j21 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, URLPackage.KEY_AUTHOR_ID, j21);
        }
        String str4 = nVar.azg;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoSize", nVar.azg);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appInstalled", nVar.azh);
        com.kwad.sdk.utils.t.putValue(jSONObject, "appUninstalled", nVar.azi);
        com.kwad.sdk.utils.t.a(jSONObject, "clientExt", nVar.azj);
        int i7 = nVar.azk;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playerType", i7);
        }
        int i8 = nVar.azl;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "uiType", i8);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "isLeftSlipStatus", nVar.azm);
        int i9 = nVar.Ye;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "refreshType", i9);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "photoResponseType", nVar.azn);
        String str5 = nVar.azo;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "failUrl", nVar.azo);
        }
        String str6 = nVar.errorMsg;
        if (str6 != null && !str6.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MediationConstant.KEY_ERROR_MSG, nVar.errorMsg);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, MediationConstant.KEY_ERROR_CODE, nVar.errorCode);
        long j22 = nVar.creativeId;
        if (j22 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", j22);
        }
        String str7 = nVar.azr;
        if (str7 != null && !str7.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cacheFailedReason", nVar.azr);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appExt", nVar.azs);
        com.kwad.sdk.utils.t.putValue(jSONObject, "appRunningInfoList", nVar.azt);
        long j23 = nVar.downloadDuration;
        if (j23 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadDuration", j23);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "pageType", nVar.pageType);
        int i10 = nVar.azu;
        if (i10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "speedLimitStatus", i10);
        }
        int i11 = nVar.azv;
        if (i11 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "speedLimitThreshold", i11);
        }
        int i12 = nVar.azw;
        if (i12 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentRealDownloadSpeed", i12);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "sdkPlatform", nVar.azy);
        boolean z4 = nVar.azz;
        if (z4) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isKsUnion", z4);
        }
        String str8 = nVar.azA;
        if (str8 != null && !str8.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "trackMethodName", nVar.azA);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "viewModeType", nVar.azB);
        long j24 = nVar.clickTime;
        if (j24 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clickTime", j24);
        }
        long j25 = nVar.azD;
        if (j25 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "frameRenderTime", j25);
        }
        int i13 = nVar.azE;
        if (i13 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playerEnterAction", i13);
        }
        String str9 = nVar.azF;
        if (str9 != null && !str9.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestUrl", nVar.azF);
        }
        long j26 = nVar.azG;
        if (j26 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestTotalTime", j26);
        }
        long j27 = nVar.azH;
        if (j27 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestResponseTime", j27);
        }
        long j28 = nVar.azI;
        if (j28 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestParseDataTime", j28);
        }
        long j29 = nVar.azJ;
        if (j29 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestCallbackTime", j29);
        }
        String str10 = nVar.azK;
        if (str10 != null && !str10.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestFailReason", nVar.azK);
        }
        String str11 = nVar.RH;
        if (str11 != null && !str11.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageName", nVar.RH);
        }
        long j30 = nVar.RP;
        if (j30 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageCreateTime", j30);
        }
        long j31 = nVar.RQ;
        if (j31 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageResumeTime", j31);
        }
        int i14 = nVar.azL;
        if (i14 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "trackUrlType", i14);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "trackUrlList", nVar.azM);
        long j32 = nVar.RO;
        if (j32 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageLaunchTime", j32);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appAuthorityInfoList", nVar.azP);
        String str12 = nVar.azQ;
        if (str12 != null && !str12.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tkVersion", nVar.azQ);
        }
        String str13 = nVar.azR;
        if (str13 != null && !str13.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsVersion", nVar.azR);
        }
        String str14 = nVar.azS;
        if (str14 != null && !str14.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsFileName", nVar.azS);
        }
        String str15 = nVar.azT;
        if (str15 != null && !str15.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsErrorMsg", nVar.azT);
        }
        String str16 = nVar.azU;
        if (str16 != null && !str16.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsConfig", nVar.azU);
        }
        int i15 = nVar.azV;
        if (i15 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adBizType", i15);
        }
        String str17 = nVar.azW;
        if (str17 != null && !str17.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "customKey", nVar.azW);
        }
        String str18 = nVar.azX;
        if (str18 != null && !str18.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "customValue", nVar.azX);
        }
        String str19 = nVar.trace;
        if (str19 != null && !str19.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "trace", nVar.trace);
        }
        int i16 = nVar.azY;
        if (i16 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "filterCode", i16);
        }
        int i17 = nVar.azZ;
        if (i17 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkVersionCode", i17);
        }
        String str20 = nVar.sdkVersion;
        if (str20 != null && !str20.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkVersion", nVar.sdkVersion);
        }
        String str21 = nVar.aAa;
        if (str21 != null && !str21.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adSdkVersion", nVar.aAa);
        }
        String str22 = nVar.XB;
        if (str22 != null && !str22.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersion", nVar.XB);
        }
        int i18 = nVar.sdkType;
        if (i18 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkType", i18);
        }
        long j33 = nVar.aAb;
        if (j33 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appUseDuration", j33);
        }
        long j34 = nVar.aAc;
        if (j34 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appStartType", j34);
        }
        long j35 = nVar.avo;
        if (j35 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sequenceNumber", j35);
        }
        String str23 = nVar.Jd;
        if (str23 != null && !str23.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appColdStart", nVar.Jd);
        }
        String str24 = nVar.Je;
        if (str24 != null && !str24.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appStart", nVar.Je);
        }
        return jSONObject;
    }
}
