package com.google.zxing.common;
/* loaded from: classes3.dex */
public final class PerspectiveTransform {
    private final float a11;
    private final float a12;
    private final float a13;
    private final float a21;
    private final float a22;
    private final float a23;
    private final float a31;
    private final float a32;
    private final float a33;

    private PerspectiveTransform(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.a11 = f5;
        this.a12 = f8;
        this.a13 = f11;
        this.a21 = f6;
        this.a22 = f9;
        this.a23 = f12;
        this.a31 = f7;
        this.a32 = f10;
        this.a33 = f13;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        return squareToQuadrilateral(f13, f14, f15, f16, f17, f18, f19, f20).times(quadrilateralToSquare(f5, f6, f7, f8, f9, f10, f11, f12));
    }

    public static PerspectiveTransform quadrilateralToSquare(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        return squareToQuadrilateral(f5, f6, f7, f8, f9, f10, f11, f12).buildAdjoint();
    }

    public static PerspectiveTransform squareToQuadrilateral(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        float f13 = f12 - f10;
        float f14 = ((f6 - f8) + f10) - f12;
        if (f13 == 0.0f && f14 == 0.0f) {
            return new PerspectiveTransform(f7 - f5, f9 - f7, f5, f8 - f6, f10 - f8, f6, 0.0f, 0.0f, 1.0f);
        }
        float f15 = f7 - f9;
        float f16 = f11 - f9;
        float f17 = ((f5 - f7) + f9) - f11;
        float f18 = f8 - f10;
        float f19 = (f15 * f13) - (f16 * f18);
        float f20 = ((f13 * f17) - (f16 * f14)) / f19;
        float f21 = ((f15 * f14) - (f17 * f18)) / f19;
        return new PerspectiveTransform((f20 * f7) + (f7 - f5), (f21 * f11) + (f11 - f5), f5, (f8 - f6) + (f20 * f8), (f12 - f6) + (f21 * f12), f6, f20, f21, 1.0f);
    }

    PerspectiveTransform buildAdjoint() {
        float f5 = this.a22;
        float f6 = this.a33;
        float f7 = this.a23;
        float f8 = this.a32;
        float f9 = (f5 * f6) - (f7 * f8);
        float f10 = this.a31;
        float f11 = this.a21;
        float f12 = (f7 * f10) - (f11 * f6);
        float f13 = (f11 * f8) - (f5 * f10);
        float f14 = this.a13;
        float f15 = this.a12;
        float f16 = (f14 * f8) - (f15 * f6);
        float f17 = this.a11;
        return new PerspectiveTransform(f9, f12, f13, f16, (f6 * f17) - (f14 * f10), (f10 * f15) - (f8 * f17), (f15 * f7) - (f14 * f5), (f14 * f11) - (f7 * f17), (f17 * f5) - (f15 * f11));
    }

    PerspectiveTransform times(PerspectiveTransform perspectiveTransform) {
        float f5 = this.a11;
        float f6 = perspectiveTransform.a11;
        float f7 = this.a21;
        float f8 = perspectiveTransform.a12;
        float f9 = this.a31;
        float f10 = perspectiveTransform.a13;
        float f11 = (f5 * f6) + (f7 * f8) + (f9 * f10);
        float f12 = perspectiveTransform.a21;
        float f13 = perspectiveTransform.a22;
        float f14 = perspectiveTransform.a23;
        float f15 = (f5 * f12) + (f7 * f13) + (f9 * f14);
        float f16 = perspectiveTransform.a31;
        float f17 = perspectiveTransform.a32;
        float f18 = perspectiveTransform.a33;
        float f19 = (f5 * f16) + (f7 * f17) + (f9 * f18);
        float f20 = this.a12;
        float f21 = this.a22;
        float f22 = this.a32;
        float f23 = (f22 * f18) + (f20 * f16) + (f21 * f17);
        float f24 = this.a13;
        float f25 = this.a23;
        float f26 = (f6 * f24) + (f8 * f25);
        float f27 = this.a33;
        return new PerspectiveTransform(f11, f15, f19, (f20 * f6) + (f21 * f8) + (f22 * f10), (f20 * f12) + (f21 * f13) + (f22 * f14), f23, (f10 * f27) + f26, (f12 * f24) + (f13 * f25) + (f14 * f27), (f24 * f16) + (f25 * f17) + (f27 * f18));
    }

    public void transformPoints(float[] fArr) {
        int length = fArr.length;
        float f5 = this.a11;
        float f6 = this.a12;
        float f7 = this.a13;
        float f8 = this.a21;
        float f9 = this.a22;
        float f10 = this.a23;
        float f11 = this.a31;
        float f12 = this.a32;
        float f13 = this.a33;
        for (int i4 = 0; i4 < length; i4 += 2) {
            float f14 = fArr[i4];
            int i5 = i4 + 1;
            float f15 = fArr[i5];
            float f16 = (f7 * f14) + (f10 * f15) + f13;
            fArr[i4] = (((f5 * f14) + (f8 * f15)) + f11) / f16;
            fArr[i5] = (((f14 * f6) + (f15 * f9)) + f12) / f16;
        }
    }

    public void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            float f5 = fArr[i4];
            float f6 = fArr2[i4];
            float f7 = (this.a13 * f5) + (this.a23 * f6) + this.a33;
            fArr[i4] = (((this.a11 * f5) + (this.a21 * f6)) + this.a31) / f7;
            fArr2[i4] = (((this.a12 * f5) + (this.a22 * f6)) + this.a32) / f7;
        }
    }
}
