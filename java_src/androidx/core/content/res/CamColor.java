package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.DoubleCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    CamColor(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.mHue = f5;
        this.mChroma = f6;
        this.mJ = f7;
        this.mQ = f8;
        this.mM = f9;
        this.mS = f10;
        this.mJstar = f11;
        this.mAstar = f12;
        this.mBstar = f13;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7) {
        float f8 = 1000.0f;
        CamColor camColor = null;
        float f9 = 1000.0f;
        float f10 = 100.0f;
        float f11 = 0.0f;
        while (Math.abs(f11 - f10) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f12 = ((f10 - f11) / 2.0f) + f11;
            int viewedInSrgb = fromJch(f12, f6, f5).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f7 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f5));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f8 = abs;
                    f9 = distance;
                }
            }
            if (f8 == 0.0f && f9 == 0.0f) {
                break;
            } else if (lStarFromInt < f7) {
                f11 = f12;
            } else {
                f10 = f12;
            }
        }
        return camColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static CamColor fromColor(@ColorInt int i4) {
        return fromColorInViewingConditions(i4, ViewingConditions.DEFAULT);
    }

    @NonNull
    static CamColor fromColorInViewingConditions(@ColorInt int i4, @NonNull ViewingConditions viewingConditions) {
        float f5;
        double d5;
        float[] xyzFromInt = CamUtils.xyzFromInt(i4);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f6 = (xyzFromInt[0] * fArr[0][0]) + (xyzFromInt[1] * fArr[0][1]) + (xyzFromInt[2] * fArr[0][2]);
        float f7 = (xyzFromInt[0] * fArr[1][0]) + (xyzFromInt[1] * fArr[1][1]) + (xyzFromInt[2] * fArr[1][2]);
        float f8 = (xyzFromInt[0] * fArr[2][0]) + (xyzFromInt[1] * fArr[2][1]) + (xyzFromInt[2] * fArr[2][2]);
        float f9 = viewingConditions.getRgbD()[0] * f6;
        float f10 = viewingConditions.getRgbD()[1] * f7;
        float f11 = viewingConditions.getRgbD()[2] * f8;
        double fl = viewingConditions.getFl() * Math.abs(f9);
        Double.isNaN(fl);
        float pow = (float) Math.pow(fl / 100.0d, 0.42d);
        double fl2 = viewingConditions.getFl() * Math.abs(f10);
        Double.isNaN(fl2);
        float pow2 = (float) Math.pow(fl2 / 100.0d, 0.42d);
        double fl3 = viewingConditions.getFl() * Math.abs(f11);
        Double.isNaN(fl3);
        float pow3 = (float) Math.pow(fl3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d6 = signum;
        Double.isNaN(d6);
        double d7 = signum2;
        Double.isNaN(d7);
        double d8 = (d6 * 11.0d) + (d7 * (-12.0d));
        double d9 = signum3;
        Double.isNaN(d9);
        double d10 = signum + signum2;
        Double.isNaN(d9);
        Double.isNaN(d10);
        float f12 = ((float) (d10 - (d9 * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = (((signum * 20.0f) + f13) + (21.0f * signum3)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, ((float) (d8 + d9)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float pow4 = ((float) Math.pow((f15 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float flRoot = viewingConditions.getFlRoot() * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f);
        Double.isNaN(((double) f16) < 20.14d ? 360.0f + f16 : f16);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((d5 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f5 * f5) + (f12 * f12)))) / (f14 + 0.305f), 0.9d));
        double d11 = pow4;
        Double.isNaN(d11);
        float sqrt = pow5 * ((float) Math.sqrt(d11 / 100.0d));
        float flRoot2 = sqrt * viewingConditions.getFlRoot();
        float sqrt2 = ((float) Math.sqrt((pow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot2) + 1.0f)) * 43.85965f;
        double d12 = f17;
        return new CamColor(f16, sqrt, pow4, flRoot, flRoot2, sqrt2, f18, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, to = 100.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 360.0d) float f7) {
        return fromJchInFrame(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, to = 100.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 360.0d) float f7, ViewingConditions viewingConditions) {
        double d5;
        double d6 = f5;
        Double.isNaN(d6);
        float c5 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(d6 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f6 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f6 / ((float) Math.sqrt(d5))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f8 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        double d7 = flRoot;
        Double.isNaN(d7);
        float log = ((float) Math.log((d7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f7) / 180.0f;
        return new CamColor(f7, f6, f5, c5, flRoot, sqrt, f8, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7) {
        return toColor(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    float getBStar() {
        return this.mBstar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    float getJ() {
        return this.mJ;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    float getM() {
        return this.mM;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    float getQ() {
        return this.mQ;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    float getS() {
        return this.mS;
    }

    @ColorInt
    int viewed(@NonNull ViewingConditions viewingConditions) {
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
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        return ColorUtils.XYZToColor((fArr[0][0] * f13) + (fArr[0][1] * f14) + (fArr[0][2] * f15), (fArr[1][0] * f13) + (fArr[1][1] * f14) + (fArr[1][2] * f15), (f13 * fArr[2][0]) + (f14 * fArr[2][1]) + (f15 * fArr[2][2]));
    }

    @ColorInt
    int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7, @NonNull ViewingConditions viewingConditions) {
        if (f6 >= 1.0d && Math.round(f7) > 0.0d && Math.round(f7) < 100.0d) {
            float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
            float f8 = f6;
            CamColor camColor = null;
            float f9 = 0.0f;
            boolean z4 = true;
            while (Math.abs(f9 - f6) >= CHROMA_SEARCH_ENDPOINT) {
                CamColor findCamByJ = findCamByJ(min, f8, f7);
                if (z4) {
                    if (findCamByJ != null) {
                        return findCamByJ.viewed(viewingConditions);
                    }
                    z4 = false;
                } else if (findCamByJ == null) {
                    f6 = f8;
                } else {
                    f9 = f8;
                    camColor = findCamByJ;
                }
                f8 = ((f6 - f9) / 2.0f) + f9;
            }
            if (camColor == null) {
                return CamUtils.intFromLStar(f7);
            }
            return camColor.viewed(viewingConditions);
        }
        return CamUtils.intFromLStar(f7);
    }
}
