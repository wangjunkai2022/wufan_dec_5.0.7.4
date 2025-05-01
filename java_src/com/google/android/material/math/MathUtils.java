package com.google.android.material.math;
/* loaded from: classes3.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f5, float f6, float f7, float f8) {
        return (float) Math.hypot(f7 - f5, f8 - f6);
    }

    public static float distanceToFurthestCorner(float f5, float f6, float f7, float f8, float f9, float f10) {
        return max(dist(f5, f6, f7, f8), dist(f5, f6, f9, f8), dist(f5, f6, f9, f10), dist(f5, f6, f7, f10));
    }

    public static float floorMod(float f5, int i4) {
        float f6 = i4;
        int i5 = (int) (f5 / f6);
        if (Math.signum(f5) * f6 < 0.0f && i5 * i4 != f5) {
            i5--;
        }
        return f5 - (i5 * i4);
    }

    public static boolean geq(float f5, float f6, float f7) {
        return f5 + f7 >= f6;
    }

    public static float lerp(float f5, float f6, float f7) {
        return ((1.0f - f7) * f5) + (f7 * f6);
    }

    private static float max(float f5, float f6, float f7, float f8) {
        return (f5 <= f6 || f5 <= f7 || f5 <= f8) ? (f6 <= f7 || f6 <= f8) ? f7 > f8 ? f7 : f8 : f6 : f5;
    }

    public static int floorMod(int i4, int i5) {
        int i6 = i4 / i5;
        if ((i4 ^ i5) < 0 && i6 * i5 != i4) {
            i6--;
        }
        return i4 - (i6 * i5);
    }
}
