package com.google.zxing.common;

import com.google.zxing.NotFoundException;
/* loaded from: classes3.dex */
public final class DefaultGridSampler extends GridSampler {
    @Override // com.google.zxing.common.GridSampler
    public BitMatrix sampleGrid(BitMatrix bitMatrix, int i4, int i5, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) throws NotFoundException {
        return sampleGrid(bitMatrix, i4, i5, PerspectiveTransform.quadrilateralToQuadrilateral(f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20));
    }

    @Override // com.google.zxing.common.GridSampler
    public BitMatrix sampleGrid(BitMatrix bitMatrix, int i4, int i5, PerspectiveTransform perspectiveTransform) throws NotFoundException {
        if (i4 > 0 && i5 > 0) {
            BitMatrix bitMatrix2 = new BitMatrix(i4, i5);
            int i6 = i4 << 1;
            float[] fArr = new float[i6];
            for (int i7 = 0; i7 < i5; i7++) {
                float f5 = i7 + 0.5f;
                for (int i8 = 0; i8 < i6; i8 += 2) {
                    fArr[i8] = (i8 >> 1) + 0.5f;
                    fArr[i8 + 1] = f5;
                }
                perspectiveTransform.transformPoints(fArr);
                GridSampler.checkAndNudgePoints(bitMatrix, fArr);
                for (int i9 = 0; i9 < i6; i9 += 2) {
                    try {
                        if (bitMatrix.get((int) fArr[i9], (int) fArr[i9 + 1])) {
                            bitMatrix2.set(i9 >> 1, i7);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
            }
            return bitMatrix2;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
