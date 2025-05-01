package com.kwad.sdk.core.adlog.b;

import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.response.model.AdTemplate;
@KsJson
/* loaded from: classes5.dex */
public class d extends com.kwad.sdk.commercial.c.a {
    public String apM;
    public int apT;
    public int aqM;
    public int retryCount;
    public int status;

    public static d BY() {
        return new d();
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: bV */
    public final d setAdTemplate(AdTemplate adTemplate) {
        super.setAdTemplate(adTemplate);
        return this;
    }

    public final d cA(int i4) {
        this.aqM = 1;
        return this;
    }

    public final d cB(int i4) {
        this.retryCount = i4;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: cC */
    public final d setErrorCode(int i4) {
        super.setErrorCode(i4);
        return this;
    }

    public final d cy(int i4) {
        this.status = i4;
        return this;
    }

    public final d cz(int i4) {
        this.apT = i4;
        return this;
    }

    public final d dj(String str) {
        this.apM = str;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: dk */
    public final d setErrorMsg(String str) {
        super.setErrorMsg(str);
        return this;
    }
}
