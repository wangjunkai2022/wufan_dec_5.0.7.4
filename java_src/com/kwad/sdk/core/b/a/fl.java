package com.kwad.sdk.core.b.a;

import com.kwad.components.ad.interstitial.report.InterstitialReportInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class fl implements com.kwad.sdk.core.d<InterstitialReportInfo> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(InterstitialReportInfo interstitialReportInfo, JSONObject jSONObject) {
        a2(interstitialReportInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(InterstitialReportInfo interstitialReportInfo, JSONObject jSONObject) {
        return b2(interstitialReportInfo, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(InterstitialReportInfo interstitialReportInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        interstitialReportInfo.status = jSONObject.optInt("status");
        interstitialReportInfo.type = jSONObject.optInt("type");
        interstitialReportInfo.loadDataTime = jSONObject.optLong("load_data_duration_ms");
        interstitialReportInfo.renderDuration = jSONObject.optLong("render_duration_ms");
        interstitialReportInfo.renderType = jSONObject.optInt("render_type");
        interstitialReportInfo.expectedRenderType = jSONObject.optInt("expected_render_type");
        interstitialReportInfo.materialType = jSONObject.optInt("material_type");
        interstitialReportInfo.downloadDuration = jSONObject.optLong("download_duration_ms");
        interstitialReportInfo.downloadType = jSONObject.optInt("download_type");
        interstitialReportInfo.downloadSize = jSONObject.optLong("download_size");
        interstitialReportInfo.creativeId = jSONObject.optLong("creative_id");
        interstitialReportInfo.videoUrl = jSONObject.optString("video_url");
        if (JSONObject.NULL.toString().equals(interstitialReportInfo.videoUrl)) {
            interstitialReportInfo.videoUrl = "";
        }
        interstitialReportInfo.videoDuration = jSONObject.optLong("video_duration_ms");
        interstitialReportInfo.playStartedDuration = jSONObject.optLong("play_started_duration_ms");
        interstitialReportInfo.abParams = jSONObject.optString("ab_params");
        if (JSONObject.NULL.toString().equals(interstitialReportInfo.abParams)) {
            interstitialReportInfo.abParams = "";
        }
        interstitialReportInfo.actionType = jSONObject.optLong("action_type");
        interstitialReportInfo.callbackType = jSONObject.optLong("callback_type");
        interstitialReportInfo.clickSceneType = jSONObject.optLong("click_scene_type");
        interstitialReportInfo.itemClickType = jSONObject.optLong("item_click_type");
        interstitialReportInfo.visiblePercent = jSONObject.optDouble("visible_percent");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(InterstitialReportInfo interstitialReportInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i4 = interstitialReportInfo.status;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", i4);
        }
        int i5 = interstitialReportInfo.type;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "type", i5);
        }
        long j4 = interstitialReportInfo.loadDataTime;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "load_data_duration_ms", j4);
        }
        long j5 = interstitialReportInfo.renderDuration;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "render_duration_ms", j5);
        }
        int i6 = interstitialReportInfo.renderType;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "render_type", i6);
        }
        int i7 = interstitialReportInfo.expectedRenderType;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "expected_render_type", i7);
        }
        int i8 = interstitialReportInfo.materialType;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "material_type", i8);
        }
        long j6 = interstitialReportInfo.downloadDuration;
        if (j6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_duration_ms", j6);
        }
        int i9 = interstitialReportInfo.downloadType;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_type", i9);
        }
        long j7 = interstitialReportInfo.downloadSize;
        if (j7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "download_size", j7);
        }
        long j8 = interstitialReportInfo.creativeId;
        if (j8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creative_id", j8);
        }
        String str = interstitialReportInfo.videoUrl;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "video_url", interstitialReportInfo.videoUrl);
        }
        long j9 = interstitialReportInfo.videoDuration;
        if (j9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "video_duration_ms", j9);
        }
        long j10 = interstitialReportInfo.playStartedDuration;
        if (j10 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "play_started_duration_ms", j10);
        }
        String str2 = interstitialReportInfo.abParams;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ab_params", interstitialReportInfo.abParams);
        }
        long j11 = interstitialReportInfo.actionType;
        if (j11 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "action_type", j11);
        }
        long j12 = interstitialReportInfo.callbackType;
        if (j12 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "callback_type", j12);
        }
        long j13 = interstitialReportInfo.clickSceneType;
        if (j13 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "click_scene_type", j13);
        }
        long j14 = interstitialReportInfo.itemClickType;
        if (j14 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "item_click_type", j14);
        }
        double d5 = interstitialReportInfo.visiblePercent;
        if (d5 != 0.0d) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "visible_percent", d5);
        }
        return jSONObject;
    }
}
