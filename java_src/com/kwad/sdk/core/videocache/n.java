package com.kwad.sdk.core.videocache;
/* loaded from: classes5.dex */
public final class n {
    public final long aDK;
    public final String aDL;
    public final String url;

    public n(String str, long j4, String str2) {
        this.url = str;
        this.aDK = j4;
        this.aDL = str2;
    }

    public final String toString() {
        return "SourceInfo{url='" + this.url + "', length=" + this.aDK + ", mime='" + this.aDL + "'}";
    }
}
