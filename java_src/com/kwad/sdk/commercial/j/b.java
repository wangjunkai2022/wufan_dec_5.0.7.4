package com.kwad.sdk.commercial.j;

import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.response.model.AdTemplate;
@KsJson
/* loaded from: classes5.dex */
public class b extends com.kwad.sdk.commercial.c.a {
    public String apL;
    public String apM;
    public int apT;
    public int apU;
    public int status;

    public static b BF() {
        return new b();
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: bE */
    public final b setAdTemplate(AdTemplate adTemplate) {
        super.setAdTemplate(adTemplate);
        return this;
    }

    public final b cV(String str) {
        this.apL = str;
        return this;
    }

    public final b cW(String str) {
        this.apM = str;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: cX */
    public final b setErrorMsg(String str) {
        super.setErrorMsg(str);
        return this;
    }

    public final b cn(int i4) {
        this.status = i4;
        return this;
    }

    public final b co(int i4) {
        this.apT = i4;
        return this;
    }

    public final b cp(int i4) {
        this.apU = i4;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: cq */
    public final b setErrorCode(int i4) {
        super.setErrorCode(i4);
        return this;
    }
}
