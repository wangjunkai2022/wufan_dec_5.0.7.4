package it.sephiroth.android.library.util;

import java.util.Random;
/* compiled from: MathUtils.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f69310a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private static final float f69311b = 0.017453292f;

    /* renamed from: c  reason: collision with root package name */
    private static final float f69312c = 57.295784f;

    private a() {
    }

    public static float A(float f5, float f6) {
        return (float) Math.pow(f5, f6);
    }

    public static float B(float f5) {
        return f5 * f69311b;
    }

    public static float C(float f5) {
        return f69310a.nextFloat() * f5;
    }

    public static float D(float f5, float f6) {
        return f5 >= f6 ? f5 : (f69310a.nextFloat() * (f6 - f5)) + f5;
    }

    public static int E(int i4) {
        return (int) (f69310a.nextFloat() * i4);
    }

    public static int F(int i4, int i5) {
        return i4 >= i5 ? i4 : (int) ((f69310a.nextFloat() * (i5 - i4)) + i4);
    }

    public static void G(long j4) {
        f69310a.setSeed(j4);
    }

    public static float H(float f5) {
        return f5 * f5;
    }

    public static float I(float f5) {
        return (float) Math.tan(f5);
    }

    public static float a(float f5) {
        return f5 > 0.0f ? f5 : -f5;
    }

    public static float b(float f5) {
        return (float) Math.acos(f5);
    }

    public static float c(float f5) {
        return (float) Math.asin(f5);
    }

    public static float d(float f5) {
        return (float) Math.atan(f5);
    }

    public static float e(float f5, float f6) {
        return (float) Math.atan2(f5, f6);
    }

    public static float f(float f5, float f6, float f7) {
        return f5 < f6 ? f6 : f5 > f7 ? f7 : f5;
    }

    public static int g(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public static long h(long j4, long j5, long j6) {
        return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
    }

    public static float i(float f5) {
        return f5 * f69312c;
    }

    public static float j(float f5, float f6, float f7, float f8) {
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        return (float) Math.sqrt((f9 * f9) + (f10 * f10));
    }

    public static float k(float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = f8 - f5;
        float f12 = f9 - f6;
        float f13 = f10 - f7;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13));
    }

    public static float l(float f5) {
        return (float) Math.exp(f5);
    }

    public static float m(float f5, float f6, float f7) {
        return f5 + ((f6 - f5) * f7);
    }

    public static float n(float f5) {
        return (float) Math.log(f5);
    }

    public static float o(float f5, float f6) {
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public static float p(float f5, float f6, float f7) {
        return (float) Math.sqrt((f5 * f5) + (f6 * f6) + (f7 * f7));
    }

    public static float q(float f5, float f6, float f7, float f8, float f9) {
        return f7 + ((f7 - f8) * ((f9 - f5) / (f6 - f5)));
    }

    public static float r(float f5, float f6) {
        return f5 > f6 ? f5 : f6;
    }

    public static float s(float f5, float f6, float f7) {
        if (f5 > f6) {
            if (f5 > f7) {
                return f5;
            }
        } else if (f6 > f7) {
            return f6;
        }
        return f7;
    }

    public static float t(int i4, int i5) {
        return i4 > i5 ? i4 : i5;
    }

    public static float u(int i4, int i5, int i6) {
        if (i4 > i5) {
            if (i4 <= i6) {
                i4 = i6;
            }
            return i4;
        }
        if (i5 <= i6) {
            i5 = i6;
        }
        return i5;
    }

    public static float v(float f5, float f6) {
        return f5 < f6 ? f5 : f6;
    }

    public static float w(float f5, float f6, float f7) {
        if (f5 < f6) {
            if (f5 < f7) {
                return f5;
            }
        } else if (f6 < f7) {
            return f6;
        }
        return f7;
    }

    public static float x(int i4, int i5) {
        return i4 < i5 ? i4 : i5;
    }

    public static float y(int i4, int i5, int i6) {
        if (i4 < i5) {
            if (i4 >= i6) {
                i4 = i6;
            }
            return i4;
        }
        if (i5 >= i6) {
            i5 = i6;
        }
        return i5;
    }

    public static float z(float f5, float f6, float f7) {
        return (f7 - f5) / (f6 - f5);
    }
}
