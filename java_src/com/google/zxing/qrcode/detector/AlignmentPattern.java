package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;
/* loaded from: classes3.dex */
public final class AlignmentPattern extends ResultPoint {
    private final float estimatedModuleSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlignmentPattern(float f5, float f6, float f7) {
        super(f5, f6);
        this.estimatedModuleSize = f7;
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
    public AlignmentPattern combineEstimate(float f5, float f6, float f7) {
        return new AlignmentPattern((getX() + f6) / 2.0f, (getY() + f5) / 2.0f, (this.estimatedModuleSize + f7) / 2.0f);
    }
}
