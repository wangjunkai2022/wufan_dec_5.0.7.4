package com.kwad.components.core.request;

import android.text.TextUtils;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class e extends com.kwad.sdk.core.network.d {
    public long RY;

    public e(int i4, AdTemplate adTemplate) {
        String bQ = com.kwad.sdk.core.response.b.a.bQ(com.kwad.sdk.core.response.b.e.dS(adTemplate));
        try {
            String bR = com.kwad.sdk.core.response.b.a.bR(com.kwad.sdk.core.response.b.e.dS(adTemplate));
            try {
                if (!TextUtils.isEmpty(bR)) {
                    putBody("serverExt", new JSONObject(bR));
                }
            } catch (JSONException e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
            }
            if (!TextUtils.isEmpty(bQ) && bQ != null) {
                JSONObject jSONObject = new JSONObject(bQ);
                t.putValue(jSONObject, "checkType", i4);
                putBody("callbackUrlInfo", jSONObject.toString());
            }
        } catch (Exception e6) {
            com.kwad.sdk.core.e.c.printStackTrace(e6);
        }
        ImpInfo impInfo = new ImpInfo(adTemplate.mAdScene);
        JSONArray jSONArray = new JSONArray();
        t.a(jSONArray, impInfo.toJson());
        putBody("impInfo", jSONArray);
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final String getUrl() {
        return com.kwad.sdk.h.yL();
    }
}
