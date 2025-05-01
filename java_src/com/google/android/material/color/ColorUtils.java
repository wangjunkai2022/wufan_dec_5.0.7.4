package com.google.android.material.color;

import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
/* loaded from: classes3.dex */
final class ColorUtils {
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};

    private ColorUtils() {
    }

    public static int blueFromInt(int i4) {
        return i4 & 255;
    }

    public static float delinearized(float f5) {
        return f5 <= 0.0031308f ? f5 * 12.92f : (((float) Math.pow(f5, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int greenFromInt(int i4) {
        return (i4 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    public static String hexFromInt(int i4) {
        return String.format("#%02x%02x%02x", Integer.valueOf(redFromInt(i4)), Integer.valueOf(greenFromInt(i4)), Integer.valueOf(blueFromInt(i4)));
    }

    public static int intFromLab(double d5, double d6, double d7) {
        double d8 = (d5 + 16.0d) / 116.0d;
        double d9 = (d6 / 500.0d) + d8;
        double d10 = d8 - (d7 / 200.0d);
        double d11 = d9 * d9 * d9;
        if (d11 <= 0.008856451679035631d) {
            d11 = ((d9 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d12 = d5 > 8.0d ? d8 * d8 * d8 : d5 / 903.2962962962963d;
        double d13 = d10 * d10 * d10;
        if (d13 <= 0.008856451679035631d) {
            d13 = ((d10 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        double d14 = fArr[0];
        Double.isNaN(d14);
        double d15 = d11 * d14;
        double d16 = fArr[1];
        Double.isNaN(d16);
        double d17 = fArr[2];
        Double.isNaN(d17);
        return intFromXyzComponents((float) d15, (float) (d12 * d16), (float) (d13 * d17));
    }

    public static int intFromLstar(float f5) {
        float f6 = (f5 + 16.0f) / 116.0f;
        float f7 = f6 * f6 * f6;
        boolean z4 = f7 > 0.008856452f;
        float f8 = (f5 > 8.0f ? 1 : (f5 == 8.0f ? 0 : -1)) > 0 ? f7 : f5 / 903.2963f;
        float f9 = z4 ? f7 : ((f6 * 116.0f) - 16.0f) / 903.2963f;
        if (!z4) {
            f7 = ((f6 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return intFromXyz(new float[]{f9 * fArr[0], f8 * fArr[1], f7 * fArr[2]});
    }

    public static int intFromRgb(int i4, int i5, int i6) {
        return (((((i4 & 255) << 16) | (-16777216)) | ((i5 & 255) << 8)) | (i6 & 255)) >>> 0;
    }

    public static int intFromXyz(float[] fArr) {
        return intFromXyzComponents(fArr[0], fArr[1], fArr[2]);
    }

    public static int intFromXyzComponents(float f5, float f6, float f7) {
        float f8 = f5 / 100.0f;
        float f9 = f6 / 100.0f;
        float f10 = f7 / 100.0f;
        float f11 = (3.2406f * f8) + ((-1.5372f) * f9) + ((-0.4986f) * f10);
        float f12 = (f8 * 0.0557f) + (f9 * (-0.204f)) + (f10 * 1.057f);
        return intFromRgb(Math.max(Math.min(255, Math.round(delinearized(f11) * 255.0f)), 0), Math.max(Math.min(255, Math.round(delinearized(((-0.9689f) * f8) + (1.8758f * f9) + (0.0415f * f10)) * 255.0f)), 0), Math.max(Math.min(255, Math.round(delinearized(f12) * 255.0f)), 0));
    }

    public static double[] labFromInt(int i4) {
        double d5;
        double d6;
        double d7;
        float[] xyzFromInt = xyzFromInt(i4);
        float f5 = xyzFromInt[1];
        float[] fArr = WHITE_POINT_D65;
        double d8 = f5 / fArr[1];
        if (d8 > 0.008856451679035631d) {
            d5 = Math.cbrt(d8);
        } else {
            Double.isNaN(d8);
            d5 = ((d8 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d9 = xyzFromInt[0] / fArr[0];
        if (d9 > 0.008856451679035631d) {
            d6 = Math.cbrt(d9);
        } else {
            Double.isNaN(d9);
            d6 = ((d9 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d10 = xyzFromInt[2] / fArr[2];
        if (d10 > 0.008856451679035631d) {
            d7 = Math.cbrt(d10);
        } else {
            Double.isNaN(d10);
            d7 = ((d10 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        return new double[]{(116.0d * d5) - 16.0d, (d6 - d5) * 500.0d, (d5 - d7) * 200.0d};
    }

    public static float linearized(float f5) {
        return f5 <= 0.04045f ? f5 / 12.92f : (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float lstarFromInt(int i4) {
        return (float) labFromInt(i4)[0];
    }

    public static int redFromInt(int i4) {
        return (i4 & 16711680) >> 16;
    }

    public static final float[] whitePointD65() {
        return Arrays.copyOf(WHITE_POINT_D65, 3);
    }

    public static float[] xyzFromInt(int i4) {
        float linearized = linearized(redFromInt(i4) / 255.0f) * 100.0f;
        float linearized2 = linearized(greenFromInt(i4) / 255.0f) * 100.0f;
        float linearized3 = linearized(blueFromInt(i4) / 255.0f) * 100.0f;
        return new float[]{(0.41233894f * linearized) + (0.35762063f * linearized2) + (0.18051042f * linearized3), (0.2126f * linearized) + (0.7152f * linearized2) + (0.0722f * linearized3), (linearized * 0.01932141f) + (linearized2 * 0.11916382f) + (linearized3 * 0.9503448f)};
    }

    public static float yFromLstar(float f5) {
        float f6;
        if (f5 > 8.0f) {
            double d5 = f5;
            Double.isNaN(d5);
            f6 = (float) Math.pow((d5 + 16.0d) / 116.0d, 3.0d);
        } else {
            f6 = f5 / 903.2963f;
        }
        return f6 * 100.0f;
    }
}
