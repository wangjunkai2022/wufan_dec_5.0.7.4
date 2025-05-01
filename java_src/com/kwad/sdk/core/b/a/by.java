package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.adlog.a;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class by implements com.kwad.sdk.core.d<a.C0514a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0514a c0514a, JSONObject jSONObject) {
        a2(c0514a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0514a c0514a, JSONObject jSONObject) {
        return b2(c0514a, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0514a c0514a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0514a.templateId = jSONObject.optString("template_id");
        if (JSONObject.NULL.toString().equals(c0514a.templateId)) {
            c0514a.templateId = "";
        }
        c0514a.aqi = jSONObject.optString("template_show_type");
        if (JSONObject.NULL.toString().equals(c0514a.aqi)) {
            c0514a.aqi = "";
        }
        c0514a.aqj = jSONObject.optInt("award_task_name");
        c0514a.aqk = jSONObject.optInt("jumps_liveroom_type");
        c0514a.aql = jSONObject.optInt("universe_feature_freg");
        c0514a.aqm = jSONObject.optInt("replace_url_succ");
        c0514a.aqo = jSONObject.optInt("is_special_preload");
        c0514a.aqp = jSONObject.optInt("card_type");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0514a c0514a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = c0514a.templateId;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_id", c0514a.templateId);
        }
        String str2 = c0514a.aqi;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "template_show_type", c0514a.aqi);
        }
        int i4 = c0514a.aqj;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "award_task_name", i4);
        }
        int i5 = c0514a.aqk;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jumps_liveroom_type", i5);
        }
        int i6 = c0514a.aql;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "universe_feature_freg", i6);
        }
        int i7 = c0514a.aqm;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "replace_url_succ", i7);
        }
        int i8 = c0514a.aqo;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "is_special_preload", i8);
        }
        int i9 = c0514a.aqp;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "card_type", i9);
        }
        return jSONObject;
    }
}
