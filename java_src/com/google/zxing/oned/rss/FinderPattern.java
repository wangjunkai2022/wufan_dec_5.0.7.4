package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;
/* loaded from: classes3.dex */
public final class FinderPattern {
    private final ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public FinderPattern(int i4, int[] iArr, int i5, int i6, int i7) {
        this.value = i4;
        this.startEnd = iArr;
        float f5 = i7;
        this.resultPoints = new ResultPoint[]{new ResultPoint(i5, f5), new ResultPoint(i6, f5)};
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public int getValue() {
        return this.value;
    }
}
