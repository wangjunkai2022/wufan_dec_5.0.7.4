package com.kwad.sdk.core.b.a;

import com.join.mgps.activity.QuarkInstallAppActivity_;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class jv implements com.kwad.sdk.core.d<com.kwad.sdk.core.request.model.f> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        a2(fVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        return b2(fVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        fVar.adStyle = jSONObject.optInt("adStyle");
        fVar.taskType = jSONObject.optInt("taskType");
        fVar.count = jSONObject.optInt(QuarkInstallAppActivity_.f36990i);
        fVar.aBc = jSONObject.optLong("lastModifiedTime");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.request.model.f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = fVar.adStyle;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adStyle", i4);
        }
        int i5 = fVar.taskType;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "taskType", i5);
        }
        int i6 = fVar.count;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, QuarkInstallAppActivity_.f36990i, i6);
        }
        long j4 = fVar.aBc;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "lastModifiedTime", j4);
        }
        return jSONObject;
    }
}
