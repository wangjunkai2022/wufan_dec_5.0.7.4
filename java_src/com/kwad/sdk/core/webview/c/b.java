package com.kwad.sdk.core.webview.c;

import androidx.annotation.Nullable;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class b implements com.kwad.sdk.core.b {
    public String aFQ;
    public String aFR;
    public String data;

    @Override // com.kwad.sdk.core.b
    public final void parseJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.aFQ = jSONObject.optString("action");
        this.data = jSONObject.optString("data");
        this.aFR = jSONObject.optString(com.alipay.sdk.authjs.a.f4787i);
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "action", this.aFQ);
        t.putValue(jSONObject, "data", this.data);
        t.putValue(jSONObject, com.alipay.sdk.authjs.a.f4787i, this.aFR);
        return jSONObject;
    }
}
