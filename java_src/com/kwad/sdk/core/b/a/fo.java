package com.kwad.sdk.core.b.a;

import com.kwad.components.core.webview.jshandler.an;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class fo implements com.kwad.sdk.core.d<an.b> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(an.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(an.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(an.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.Yt = jSONObject.optDouble("progress");
        bVar.status = jSONObject.optInt("status");
        bVar.totalBytes = jSONObject.optLong("totalBytes");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(an.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        double d5 = bVar.Yt;
        if (d5 != 0.0d) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "progress", d5);
        }
        int i4 = bVar.status;
        if (i4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", i4);
        }
        long j4 = bVar.totalBytes;
        if (j4 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "totalBytes", j4);
        }
        return jSONObject;
    }
}
