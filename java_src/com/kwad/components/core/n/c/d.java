package com.kwad.components.core.n.c;

import com.ksad.json.annotation.KsJson;
@KsJson
/* loaded from: classes5.dex */
public class d extends com.kwad.sdk.commercial.c.a {
    public String Ot;
    public long Ou;
    public long Ov;
    public String Ox;
    public long Oy;

    public final d C(long j4) {
        this.Ou = j4;
        return this;
    }

    public final d D(long j4) {
        this.Ov = j4;
        return this;
    }

    public final d E(long j4) {
        this.Oy = j4;
        return this;
    }

    public final d aq(String str) {
        this.Ot = str;
        return this;
    }

    public final d ar(String str) {
        this.errorMsg = str;
        return this;
    }

    public final d as(String str) {
        this.Ox = str;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: ay */
    public final d setErrorCode(int i4) {
        this.errorCode = i4;
        return this;
    }
}
