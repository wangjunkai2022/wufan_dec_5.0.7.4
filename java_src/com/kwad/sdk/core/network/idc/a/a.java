package com.kwad.sdk.core.network.idc.a;
/* loaded from: classes5.dex */
public final class a {
    private final long axX;
    private volatile boolean axY = false;

    public a(long j4, boolean z4) {
        this.axX = j4;
    }

    public final boolean EI() {
        return this.axY;
    }

    public final long EJ() {
        return this.axX;
    }

    public final a bm(boolean z4) {
        this.axY = true;
        return this;
    }
}
