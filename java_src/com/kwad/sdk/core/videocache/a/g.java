package com.kwad.sdk.core.videocache.a;
/* loaded from: classes5.dex */
public final class g extends e {
    private final long maxSize;

    public g(long j4) {
        if (j4 > 0) {
            this.maxSize = j4;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }

    @Override // com.kwad.sdk.core.videocache.a.e
    protected final boolean aB(long j4) {
        return j4 <= this.maxSize;
    }
}
