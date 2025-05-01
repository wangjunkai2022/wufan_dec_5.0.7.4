package org.apache.http.pool;

import org.apache.http.annotation.Immutable;
@Immutable
/* loaded from: classes7.dex */
public class PoolStats {
    private final int available;
    private final int leased;
    private final int max;
    private final int pending;

    public PoolStats(int i4, int i5, int i6, int i7) {
        this.leased = i4;
        this.pending = i5;
        this.available = i6;
        this.max = i7;
    }

    public int getAvailable() {
        return this.available;
    }

    public int getLeased() {
        return this.leased;
    }

    public int getMax() {
        return this.max;
    }

    public int getPending() {
        return this.pending;
    }

    public String toString() {
        return "[leased: " + this.leased + "; pending: " + this.pending + "; available: " + this.available + "; max: " + this.max + "]";
    }
}
