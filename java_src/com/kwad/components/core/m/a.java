package com.kwad.components.core.m;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.sdk.core.network.l;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class a extends l<com.kwad.components.core.request.a, AdResultData> {
    private ImpInfo MX;

    public a(ImpInfo impInfo) {
        this.MX = impInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.l
    /* renamed from: k */
    public void afterParseData(AdResultData adResultData) {
        super.afterParseData(adResultData);
        l(adResultData);
    }

    private static void l(AdResultData adResultData) {
        for (AdTemplate adTemplate : adResultData.getProceedTemplateList()) {
            AdInfo dS = e.dS(adTemplate);
            if (com.kwad.sdk.core.response.b.a.bc(dS)) {
                if (com.kwad.sdk.core.response.b.a.aZ(dS).size() == 0) {
                    com.kwad.components.core.o.a.qI().f(adTemplate, 21005);
                }
            } else if (com.kwad.sdk.core.response.b.a.bg(dS) && TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.K(dS))) {
                com.kwad.components.core.o.a.qI().f(adTemplate, 21006);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.l
    @NonNull
    /* renamed from: aa */
    public AdResultData parseData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        AdResultData adResultData = new AdResultData(this.MX.adScene);
        adResultData.parseJson(jSONObject);
        return adResultData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.a
    @NonNull
    /* renamed from: no */
    public com.kwad.components.core.request.a createRequest() {
        return new com.kwad.components.core.request.a(this.MX);
    }
}
