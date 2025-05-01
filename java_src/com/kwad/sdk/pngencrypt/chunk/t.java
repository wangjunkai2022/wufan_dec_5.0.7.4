package com.kwad.sdk.pngencrypt.chunk;
/* loaded from: classes5.dex */
public abstract class t extends k {
    protected String aNV;
    protected String key;

    /* JADX INFO: Access modifiers changed from: protected */
    public t(String str, com.kwad.sdk.pngencrypt.k kVar) {
        super(str, kVar);
    }

    public final String Lf() {
        return this.aNV;
    }

    public final String getKey() {
        return this.key;
    }
}
