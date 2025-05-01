package com.kwad.sdk.core.report;

import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.response.model.AdTemplate;
@KsJson
/* loaded from: classes5.dex */
public class h extends com.kwad.sdk.core.response.a.a {
    public int ayS;
    public long creativeId;
    public long llsid;
    public int score;
    public String source = "union";

    public static h bY(AdTemplate adTemplate) {
        h hVar = new h();
        hVar.creativeId = com.kwad.sdk.core.response.b.e.ec(adTemplate);
        hVar.llsid = com.kwad.sdk.core.response.b.e.dP(adTemplate);
        int eg = com.kwad.sdk.core.response.b.e.eg(adTemplate);
        hVar.score = eg;
        hVar.ayS = eg > 0 ? 1 : 0;
        return hVar;
    }

    public final String Fv() {
        return toJson().toString();
    }
}
