package com.google.android.material.color;
/* loaded from: classes3.dex */
final class Cam16 {
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;

    /* renamed from: j  reason: collision with root package name */
    private final float f13127j;
    private final float jstar;

    /* renamed from: m  reason: collision with root package name */
    private final float f13128m;

    /* renamed from: q  reason: collision with root package name */
    private final float f13129q;

    /* renamed from: s  reason: collision with root package name */
    private final float f13130s;
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    private Cam16(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.hue = f5;
        this.chroma = f6;
        this.f13127j = f7;
        this.f13129q = f8;
        this.f13128m = f9;
        this.f13130s = f10;
        this.jstar = f11;
        this.astar = f12;
        this.bstar = f13;
    }

    public static Cam16 fromInt(int i4) {
        return fromIntInViewingConditions(i4, ViewingConditions.DEFAULT);
    }

    static Cam16 fromIntInViewingConditions(int i4, ViewingConditions viewingConditions) {
        double d5;
        double d6;
        float linearized = ColorUtils.linearized(((16711680 & i4) >> 16) / 255.0f) * 100.0f;
        float linearized2 = ColorUtils.linearized(((65280 & i4) >> 8) / 255.0f) * 100.0f;
        float linearized3 = ColorUtils.linearized((i4 & 255) / 255.0f) * 100.0f;
        float f5 = (0.41233894f * linearized) + (0.35762063f * linearized2) + (0.18051042f * linearized3);
        float f6 = (0.2126f * linearized) + (0.7152f * linearized2) + (0.0722f * linearized3);
        float f7 = (linearized * 0.01932141f) + (linearized2 * 0.11916382f) + (linearized3 * 0.9503448f);
        float[][] fArr = XYZ_TO_CAM16RGB;
        float f8 = (fArr[0][0] * f5) + (fArr[0][1] * f6) + (fArr[0][2] * f7);
        float f9 = (fArr[1][0] * f5) + (fArr[1][1] * f6) + (fArr[1][2] * f7);
        float f10 = (f5 * fArr[2][0]) + (f6 * fArr[2][1]) + (f7 * fArr[2][2]);
        float f11 = viewingConditions.getRgbD()[0] * f8;
        float f12 = viewingConditions.getRgbD()[1] * f9;
        float f13 = viewingConditions.getRgbD()[2] * f10;
        double fl = viewingConditions.getFl() * Math.abs(f11);
        Double.isNaN(fl);
        float pow = (float) Math.pow(fl / 100.0d, 0.42d);
        double fl2 = viewingConditions.getFl() * Math.abs(f12);
        Double.isNaN(fl2);
        float pow2 = (float) Math.pow(fl2 / 100.0d, 0.42d);
        double fl3 = viewingConditions.getFl() * Math.abs(f13);
        Double.isNaN(fl3);
        float pow3 = (float) Math.pow(fl3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f11) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d7 = signum;
        Double.isNaN(d7);
        double d8 = signum2;
        Double.isNaN(d8);
        double d9 = (d7 * 11.0d) + (d8 * (-12.0d));
        double d10 = signum3;
        Double.isNaN(d10);
        double d11 = signum + signum2;
        Double.isNaN(d10);
        Double.isNaN(d11);
        float f14 = signum2 * 20.0f;
        float f15 = (((signum * 20.0f) + f14) + (21.0f * signum3)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(((float) (d11 - (d10 * 2.0d))) / 9.0f, ((float) (d9 + d10)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f16 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c5 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(Math.toRadians(((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.hypot(d6, d5))) / (f15 + 0.305f), 0.9d));
        double d12 = pow4;
        Double.isNaN(d12);
        float sqrt = pow5 * ((float) Math.sqrt(d12 / 100.0d));
        float flRoot = sqrt * viewingConditions.getFlRoot();
        float sqrt2 = ((float) Math.sqrt((pow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log1p = ((float) Math.log1p(0.0228f * flRoot)) * 43.85965f;
        double d13 = f17;
        return new Cam16(atan2, sqrt, pow4, c5, flRoot, sqrt2, f18, log1p * ((float) Math.cos(d13)), log1p * ((float) Math.sin(d13)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Cam16 fromJch(float f5, float f6, float f7) {
        return fromJchInViewingConditions(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(float f5, float f6, float f7, ViewingConditions viewingConditions) {
        double d5;
        double d6 = f5;
        Double.isNaN(d6);
        float c5 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(d6 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f6 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f6 / ((float) Math.sqrt(d5))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f8 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        double d7 = flRoot;
        Double.isNaN(d7);
        float log1p = ((float) Math.log1p(d7 * 0.0228d)) * 43.85965f;
        double d8 = (3.1415927f * f7) / 180.0f;
        return new Cam16(f7, f6, f5, c5, flRoot, sqrt, f8, log1p * ((float) Math.cos(d8)), log1p * ((float) Math.sin(d8)));
    }

    public static Cam16 fromUcs(float f5, float f6, float f7) {
        return fromUcsInViewingConditions(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(float f5, float f6, float f7, ViewingConditions viewingConditions) {
        double d5 = f6;
        double d6 = f7;
        double flRoot = viewingConditions.getFlRoot();
        Double.isNaN(flRoot);
        double expm1 = (Math.expm1(Math.hypot(d5, d6) * 0.02280000038444996d) / 0.02280000038444996d) / flRoot;
        double atan2 = Math.atan2(d6, d5) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return fromJchInViewingConditions(f5 / (1.0f - ((f5 - 100.0f) * 0.007f)), (float) expm1, (float) atan2, viewingConditions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float distance(Cam16 cam16) {
        float jStar = getJStar() - cam16.getJStar();
        float aStar = getAStar() - cam16.getAStar();
        float bStar = getBStar() - cam16.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    public float getAStar() {
        return this.astar;
    }

    public float getBStar() {
        return this.bstar;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getHue() {
        return this.hue;
    }

    public int getInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public float getJ() {
        return this.f13127j;
    }

    public float getJStar() {
        return this.jstar;
    }

    public float getM() {
        return this.f13128m;
    }

    public float getQ() {
        return this.f13129q;
    }

    public float getS() {
        return this.f13130s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int viewed(ViewingConditions viewingConditions) {
        float f5;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        if (getChroma() == 0.0d || getJ() == 0.0d) {
            f5 = 0.0f;
        } else {
            float chroma = getChroma();
            double j4 = getJ();
            Double.isNaN(j4);
            f5 = chroma / ((float) Math.sqrt(j4 / 100.0d));
        }
        double d11 = f5;
        double pow = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        Double.isNaN(d11);
        float pow2 = (float) Math.pow(d11 / pow, 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        Double.isNaN(hue);
        float aw = viewingConditions.getAw();
        double j5 = getJ();
        Double.isNaN(j5);
        double c5 = viewingConditions.getC();
        Double.isNaN(c5);
        double d12 = 1.0d / c5;
        double z4 = viewingConditions.getZ();
        Double.isNaN(z4);
        float pow3 = aw * ((float) Math.pow(j5 / 100.0d, d12 / z4));
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = pow3 / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f6 = (((0.305f + nbb) * 23.0f) * pow2) / (((cos * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = nbb * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        Double.isNaN(Math.abs(f10));
        Double.isNaN(Math.abs(f10));
        float signum = Math.signum(f10) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (d5 * 27.13d) / (400.0d - d6)), 2.380952380952381d));
        Double.isNaN(Math.abs(f11));
        Double.isNaN(Math.abs(f11));
        float signum2 = Math.signum(f11) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (d7 * 27.13d) / (400.0d - d8)), 2.380952380952381d));
        Double.isNaN(Math.abs(f12));
        Double.isNaN(Math.abs(f12));
        float signum3 = Math.signum(f12) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (d9 * 27.13d) / (400.0d - d10)), 2.380952380952381d));
        float f13 = signum / viewingConditions.getRgbD()[0];
        float f14 = signum2 / viewingConditions.getRgbD()[1];
        float f15 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CAM16RGB_TO_XYZ;
        return ColorUtils.intFromXyzComponents((fArr[0][0] * f13) + (fArr[0][1] * f14) + (fArr[0][2] * f15), (fArr[1][0] * f13) + (fArr[1][1] * f14) + (fArr[1][2] * f15), (f13 * fArr[2][0]) + (f14 * fArr[2][1]) + (f15 * fArr[2][2]));
    }
}
