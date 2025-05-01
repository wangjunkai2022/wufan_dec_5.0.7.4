package com.google.android.material.color;
/* loaded from: classes3.dex */
final class MathUtils {
    private MathUtils() {
    }

    static float clamp(float f5, float f6, float f7) {
        return Math.min(Math.max(f7, f5), f6);
    }

    public static float differenceDegrees(float f5, float f6) {
        return 180.0f - Math.abs(Math.abs(f5 - f6) - 180.0f);
    }

    public static float lerp(float f5, float f6, float f7) {
        return ((1.0f - f7) * f5) + (f7 * f6);
    }

    public static float sanitizeDegrees(float f5) {
        return f5 < 0.0f ? (f5 % 360.0f) + 360.0f : f5 >= 360.0f ? f5 % 360.0f : f5;
    }

    public static int sanitizeDegrees(int i4) {
        if (i4 < 0) {
            return (i4 % 360) + 360;
        }
        return i4 >= 360 ? i4 % 360 : i4;
    }

    static float toDegrees(float f5) {
        return (f5 * 180.0f) / 3.1415927f;
    }

    static float toRadians(float f5) {
        return (f5 / 180.0f) * 3.1415927f;
    }
}
