package androidx.core.content.res;

import androidx.annotation.NonNull;
/* loaded from: classes.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT;
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    static {
        float[] fArr = CamUtils.WHITE_POINT_D65;
        double yFromLStar = CamUtils.yFromLStar(50.0f);
        Double.isNaN(yFromLStar);
        DEFAULT = make(fArr, (float) ((yFromLStar * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private ViewingConditions(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.mN = f5;
        this.mAw = f6;
        this.mNbb = f7;
        this.mNcb = f8;
        this.mC = f9;
        this.mNc = f10;
        this.mRgbD = fArr;
        this.mFl = f11;
        this.mFlRoot = f12;
        this.mZ = f13;
    }

    @NonNull
    static ViewingConditions make(@NonNull float[] fArr, float f5, float f6, float f7, boolean z4) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f8 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f9 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f10 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f11 = (f7 / 10.0f) + 0.8f;
        float lerp = ((double) f11) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f11 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f11 - 0.8f) * 10.0f);
        float exp = z4 ? 1.0f : (1.0f - (((float) Math.exp(((-f5) - 42.0f) / 92.0f)) * 0.2777778f)) * f11;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f5) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        double d6 = f5;
        Double.isNaN(d6);
        float cbrt = (f13 * f5) + (0.1f * f14 * f14 * ((float) Math.cbrt(d6 * 5.0d)));
        float yFromLStar = CamUtils.yFromLStar(f6) / fArr[1];
        double d7 = yFromLStar;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        double d8 = fArr3[0] * cbrt * f8;
        Double.isNaN(d8);
        double d9 = fArr3[1] * cbrt * f9;
        Double.isNaN(d9);
        double d10 = fArr3[2] * cbrt * f10;
        Double.isNaN(d10);
        float[] fArr4 = {(float) Math.pow(d8 / 100.0d, 0.42d), (float) Math.pow(d9 / 100.0d, 0.42d), (float) Math.pow(d10 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, lerp, f11, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getAw() {
        return this.mAw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getC() {
        return this.mC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFl() {
        return this.mFl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFlRoot() {
        return this.mFlRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getN() {
        return this.mN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNbb() {
        return this.mNbb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNc() {
        return this.mNc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNcb() {
        return this.mNcb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getZ() {
        return this.mZ;
    }
}
