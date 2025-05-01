package com.kwad.sdk.core.b.a;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class ka implements com.kwad.sdk.core.d<com.kwad.sdk.core.threads.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.aBP = jSONObject.optString("pool_name");
        if (JSONObject.NULL.toString().equals(bVar.aBP)) {
            bVar.aBP = "";
        }
        bVar.aBQ = jSONObject.optInt("core_pool_size");
        bVar.aBR = jSONObject.optInt("max_pool_size");
        bVar.aBS = jSONObject.optInt("current_pool_size");
        bVar.aBT = jSONObject.optInt("active_count");
        bVar.aBU = jSONObject.optLong("task_wait_avg_ms");
        bVar.aBV = jSONObject.optLong("task_succ_count");
        bVar.interval = jSONObject.optLong("interval_ms");
        bVar.aBW = jSONObject.optInt("queue_size");
        bVar.aBX = jSONObject.optLong("pass_timestamp");
        bVar.aBY = jSONObject.optInt("func_ratio_count");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.threads.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = bVar.aBP;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pool_name", bVar.aBP);
        }
        int i4 = bVar.aBQ;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "core_pool_size", i4);
        }
        int i5 = bVar.aBR;
        if (i5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "max_pool_size", i5);
        }
        int i6 = bVar.aBS;
        if (i6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "current_pool_size", i6);
        }
        int i7 = bVar.aBT;
        if (i7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "active_count", i7);
        }
        long j4 = bVar.aBU;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "task_wait_avg_ms", j4);
        }
        long j5 = bVar.aBV;
        if (j5 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "task_succ_count", j5);
        }
        long j6 = bVar.interval;
        if (j6 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "interval_ms", j6);
        }
        int i8 = bVar.aBW;
        if (i8 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "queue_size", i8);
        }
        long j7 = bVar.aBX;
        if (j7 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pass_timestamp", j7);
        }
        int i9 = bVar.aBY;
        if (i9 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "func_ratio_count", i9);
        }
        return jSONObject;
    }
}
