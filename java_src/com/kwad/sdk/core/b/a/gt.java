package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdGlobalConfigInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class gt implements com.kwad.sdk.core.d<AdGlobalConfigInfo.NeoScanAggregationSceneInfo> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdGlobalConfigInfo.NeoScanAggregationSceneInfo neoScanAggregationSceneInfo, JSONObject jSONObject) {
        a2(neoScanAggregationSceneInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdGlobalConfigInfo.NeoScanAggregationSceneInfo neoScanAggregationSceneInfo, JSONObject jSONObject) {
        return b2(neoScanAggregationSceneInfo, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdGlobalConfigInfo.NeoScanAggregationSceneInfo neoScanAggregationSceneInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        neoScanAggregationSceneInfo.neoCountDownNeedSwipeTrigger = jSONObject.optBoolean("neoCountDownNeedSwipeTrigger");
        neoScanAggregationSceneInfo.neoCountDownTime = jSONObject.optInt("neoCountDownTime");
        neoScanAggregationSceneInfo.noActionStopCountDown = jSONObject.optBoolean("noActionStopCountDown");
        neoScanAggregationSceneInfo.noActionTime = jSONObject.optInt("noActionTime");
        neoScanAggregationSceneInfo.guidSwipezShowMore = jSONObject.optBoolean("guidSwipezShowMore");
        neoScanAggregationSceneInfo.mute = jSONObject.optBoolean("mute");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdGlobalConfigInfo.NeoScanAggregationSceneInfo neoScanAggregationSceneInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        boolean z4 = neoScanAggregationSceneInfo.neoCountDownNeedSwipeTrigger;
        if (z4) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "neoCountDownNeedSwipeTrigger", z4);
        }
        int i4 = neoScanAggregationSceneInfo.neoCountDownTime;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "neoCountDownTime", i4);
        }
        boolean z5 = neoScanAggregationSceneInfo.noActionStopCountDown;
        if (z5) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "noActionStopCountDown", z5);
        }
        int i5 = neoScanAggregationSceneInfo.noActionTime;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "noActionTime", i5);
        }
        boolean z6 = neoScanAggregationSceneInfo.guidSwipezShowMore;
        if (z6) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "guidSwipezShowMore", z6);
        }
        boolean z7 = neoScanAggregationSceneInfo.mute;
        if (z7) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "mute", z7);
        }
        return jSONObject;
    }
}
