package com.google.android.material.color;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT;
    private final float aw;

    /* renamed from: c  reason: collision with root package name */
    private final float f13131c;
    private final float fl;
    private final float flRoot;

    /* renamed from: n  reason: collision with root package name */
    private final float f13132n;
    private final float nbb;
    private final float nc;
    private final float ncb;
    private final float[] rgbD;

    /* renamed from: z  reason: collision with root package name */
    private final float f13133z;

    static {
        float[] whitePointD65 = ColorUtils.whitePointD65();
        double yFromLstar = ColorUtils.yFromLstar(50.0f);
        Double.isNaN(yFromLstar);
        DEFAULT = make(whitePointD65, (float) ((yFromLstar * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private ViewingConditions(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.f13132n = f5;
        this.aw = f6;
        this.nbb = f7;
        this.ncb = f8;
        this.f13131c = f9;
        this.nc = f10;
        this.rgbD = fArr;
        this.fl = f11;
        this.flRoot = f12;
        this.f13133z = f13;
    }

    static ViewingConditions make(float[] fArr, float f5, float f6, float f7, boolean z4) {
        float lerp;
        float[][] fArr2 = Cam16.XYZ_TO_CAM16RGB;
        float f8 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f9 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f10 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f11 = (f7 / 10.0f) + 0.8f;
        if (f11 >= 0.9d) {
            lerp = MathUtils.lerp(0.59f, 0.69f, (f11 - 0.9f) * 10.0f);
        } else {
            lerp = MathUtils.lerp(0.525f, 0.59f, (f11 - 0.8f) * 10.0f);
        }
        float f12 = lerp;
        float exp = z4 ? 1.0f : (1.0f - (((float) Math.exp(((-f5) - 42.0f) / 92.0f)) * 0.2777778f)) * f11;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f13 = 1.0f / ((5.0f * f5) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        double d6 = f5;
        Double.isNaN(d6);
        float cbrt = (f14 * f5) + (0.1f * f15 * f15 * ((float) Math.cbrt(d6 * 5.0d)));
        float yFromLstar = ColorUtils.yFromLstar(f6) / fArr[1];
        double d7 = yFromLstar;
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
        return new ViewingConditions(yFromLstar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, f12, f11, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float getAw() {
        return this.aw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getC() {
        return this.f13131c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFl() {
        return this.fl;
    }

    public float getFlRoot() {
        return this.flRoot;
    }

    public float getN() {
        return this.f13132n;
    }

    public float getNbb() {
        return this.nbb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNc() {
        return this.nc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getNcb() {
        return this.ncb;
    }

    public float[] getRgbD() {
        return this.rgbD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getZ() {
        return this.f13133z;
    }
}
