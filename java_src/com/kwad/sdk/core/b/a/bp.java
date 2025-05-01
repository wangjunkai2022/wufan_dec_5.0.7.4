package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class bp implements com.kwad.sdk.core.d<com.kwad.sdk.commercial.c.a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.commercial.c.a aVar, JSONObject jSONObject) {
        a2(aVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.commercial.c.a aVar, JSONObject jSONObject) {
        return b2(aVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.commercial.c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        aVar.creativeId = jSONObject.optLong("creative_id");
        aVar.llsid = jSONObject.optLong("llsid");
        aVar.posId = jSONObject.optLong("pos_Id");
        aVar.templateId = jSONObject.optString("template_id");
        if (JSONObject.NULL.toString().equals(aVar.templateId)) {
            aVar.templateId = "";
        }
        aVar.templateVersion = jSONObject.optString("template_version");
        if (JSONObject.NULL.toString().equals(aVar.templateVersion)) {
            aVar.templateVersion = "";
        }
        aVar.tkPublishType = jSONObject.optInt("tk_publish_type");
        aVar.errorCode = jSONObject.optInt("error_code");
        aVar.errorMsg = jSONObject.optString("error_msg");
        if (JSONObject.NULL.toString().equals(aVar.errorMsg)) {
            aVar.errorMsg = "";
        }
        aVar.campaignType = jSONObject.optInt("campaign_type");
        aVar.ocpcActionType = jSONObject.optInt("ocpc_action_type");
        aVar.industryFirstLevelId = jSONObject.optInt("industry_first_level_id");
        aVar.adOperationType = jSONObject.optInt("ad_operation_type");
        aVar.webUriSourceType = jSONObject.optInt("web_uri_source_type");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.commercial.c.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        long j4 = aVar.creativeId;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creative_id", j4);
        }
        long j5 = aVar.llsid;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "llsid", j5);
        }
        long j6 = aVar.posId;
        if (j6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pos_Id", j6);
        }
        String str = aVar.templateId;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_id", aVar.templateId);
        }
        String str2 = aVar.templateVersion;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_version", aVar.templateVersion);
        }
        int i4 = aVar.tkPublishType;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tk_publish_type", i4);
        }
        int i5 = aVar.errorCode;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_code", i5);
        }
        String str3 = aVar.errorMsg;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "error_msg", aVar.errorMsg);
        }
        int i6 = aVar.campaignType;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "campaign_type", i6);
        }
        int i7 = aVar.ocpcActionType;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ocpc_action_type", i7);
        }
        int i8 = aVar.industryFirstLevelId;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "industry_first_level_id", i8);
        }
        int i9 = aVar.adOperationType;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ad_operation_type", i9);
        }
        int i10 = aVar.webUriSourceType;
        if (i10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "web_uri_source_type", i10);
        }
        return jSONObject;
    }
}
