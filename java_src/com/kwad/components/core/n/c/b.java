package com.kwad.components.core.n.c;

import com.ksad.json.annotation.KsJson;
@KsJson
/* loaded from: classes5.dex */
public class b extends com.kwad.sdk.commercial.c.a {
    public String Ot;
    public long Ou;
    public long Ov;
    public long Ow;
    public String Ox;

    public final b A(long j4) {
        this.Ou = j4;
        return this;
    }

    public final b B(long j4) {
        this.Ov = j4;
        return this;
    }

    public final b an(String str) {
        this.Ot = str;
        return this;
    }

    public final b ao(String str) {
        this.errorMsg = str;
        return this;
    }

    public final b ap(String str) {
        this.Ox = str;
        return this;
    }

    public final b aw(int i4) {
        this.Ow = i4;
        return this;
    }

    @Override // com.kwad.sdk.commercial.c.a
    /* renamed from: ax */
    public final b setErrorCode(int i4) {
        this.errorCode = i4;
        return this;
    }
}
