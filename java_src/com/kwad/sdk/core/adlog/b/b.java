package com.kwad.sdk.core.adlog.b;

import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.response.model.AdTemplate;
@KsJson
/* loaded from: classes5.dex */
public class b extends com.kwad.sdk.commercial.c.a {
    public int apT;
    public String aqA;
    public int aqJ;
    public int aqK;
    public long aqL;
    public int aqz;
    public int retryCount;
    public int status;

    public static b BX() {
        return new b();
    }

    public final b al(long j4) {
        this.aqL = j4;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: bU */
    public final b setAdTemplate(AdTemplate adTemplate) {
        super.setAdTemplate(adTemplate);
        return this;
    }

    public final b cs(int i4) {
        this.status = i4;
        return this;
    }

    public final b ct(int i4) {
        this.apT = i4;
        return this;
    }

    public final b cu(int i4) {
        this.retryCount = i4;
        return this;
    }

    public final b cv(int i4) {
        this.aqz = i4;
        return this;
    }

    public final b cw(int i4) {
        this.aqJ = i4;
        return this;
    }

    public final b cx(int i4) {
        this.aqK = i4;
        return this;
    }

    public final b di(String str) {
        this.aqA = str;
        return this;
    }
}
