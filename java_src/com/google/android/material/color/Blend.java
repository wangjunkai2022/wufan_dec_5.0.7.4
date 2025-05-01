package com.google.android.material.color;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Blend {
    private static final float HARMONIZE_MAX_DEGREES = 15.0f;
    private static final float HARMONIZE_PERCENTAGE = 0.5f;

    private Blend() {
    }

    public static int blendCam16Ucs(int i4, int i5, float f5) {
        Cam16 fromInt = Cam16.fromInt(i4);
        Cam16 fromInt2 = Cam16.fromInt(i5);
        float jStar = fromInt.getJStar();
        float aStar = fromInt.getAStar();
        float bStar = fromInt.getBStar();
        return Cam16.fromUcs(jStar + ((fromInt2.getJStar() - jStar) * f5), aStar + ((fromInt2.getAStar() - aStar) * f5), bStar + ((fromInt2.getBStar() - bStar) * f5)).getInt();
    }

    public static int blendHctHue(int i4, int i5, float f5) {
        return Hct.from(Cam16.fromInt(blendCam16Ucs(i4, i5, f5)).getHue(), Cam16.fromInt(i4).getChroma(), ColorUtils.lstarFromInt(i4)).toInt();
    }

    public static int harmonize(int i4, int i5) {
        Hct fromInt = Hct.fromInt(i4);
        Hct fromInt2 = Hct.fromInt(i5);
        return Hct.from(MathUtils.sanitizeDegrees(fromInt.getHue() + (Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5f, 15.0f) * rotationDirection(fromInt.getHue(), fromInt2.getHue()))), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    private static float rotationDirection(float f5, float f6) {
        float f7 = f6 - f5;
        float f8 = f7 + 360.0f;
        float f9 = f7 - 360.0f;
        float abs = Math.abs(f7);
        float abs2 = Math.abs(f8);
        float abs3 = Math.abs(f9);
        return (abs > abs2 || abs > abs3) ? (abs2 > abs || abs2 > abs3) ? ((double) f9) >= 0.0d ? 1.0f : -1.0f : ((double) f8) >= 0.0d ? 1.0f : -1.0f : ((double) f7) >= 0.0d ? 1.0f : -1.0f;
    }
}
