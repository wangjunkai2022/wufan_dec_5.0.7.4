package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;
/* loaded from: classes3.dex */
public final class FinderPattern extends ResultPoint {
    private int count;
    private final float estimatedModuleSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FinderPattern(float f5, float f6, float f7) {
        this(f5, f6, f7, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean aboutEquals(float f5, float f6, float f7) {
        if (Math.abs(f6 - getY()) > f5 || Math.abs(f7 - getX()) > f5) {
            return false;
        }
        float abs = Math.abs(f5 - this.estimatedModuleSize);
        return abs <= 1.0f || abs <= this.estimatedModuleSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FinderPattern combineEstimate(float f5, float f6, float f7) {
        int i4 = this.count;
        int i5 = i4 + 1;
        float x4 = (i4 * getX()) + f6;
        float f8 = i5;
        return new FinderPattern(x4 / f8, ((this.count * getY()) + f5) / f8, ((this.count * this.estimatedModuleSize) + f7) / f8, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCount() {
        return this.count;
    }

    public float getEstimatedModuleSize() {
        return this.estimatedModuleSize;
    }

    void incrementCount() {
        this.count++;
    }

    FinderPattern(float f5, float f6, float f7, int i4) {
        super(f5, f6);
        this.estimatedModuleSize = f7;
        this.count = i4;
    }
}
