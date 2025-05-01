package com.kwad.sdk.core.adlog.a;

import androidx.annotation.NonNull;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a {
    public String aqA;
    public JSONObject aqw;
    public com.kwad.sdk.core.adlog.c.a aqx;
    public long aqy;
    public int aqz;
    public int retryCount;
    public String url;

    public static a BP() {
        return new a();
    }

    public final a ak(long j4) {
        this.aqy = j4;
        return this;
    }

    public final a c(com.kwad.sdk.core.adlog.c.a aVar) {
        this.aqx = aVar;
        return this;
    }

    public final a cr(int i4) {
        this.aqz = i4;
        return this;
    }

    public final a dg(String str) {
        this.url = str;
        return this;
    }

    public final a dh(String str) {
        this.aqA = str;
        return this;
    }

    public final a i(JSONObject jSONObject) {
        this.aqw = jSONObject;
        return this;
    }

    @NonNull
    public final String toString() {
        return "AdLogCache {actionType=" + this.aqx.apT + ", retryCount=" + this.retryCount + ", retryErrorCode=" + this.aqz + ", retryErrorMsg=" + this.aqA + '}';
    }
}
