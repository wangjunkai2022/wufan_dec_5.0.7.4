package androidx.core.math;
/* loaded from: classes2.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int i4, int i5) {
        int i6 = i4 + i5;
        if (((i4 ^ i6) & (i5 ^ i6)) >= 0) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static double clamp(double d5, double d6, double d7) {
        return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
    }

    public static float clamp(float f5, float f6, float f7) {
        return f5 < f6 ? f6 : f5 > f7 ? f7 : f5;
    }

    public static int clamp(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public static long clamp(long j4, long j5, long j6) {
        return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
    }

    public static int decrementExact(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return i4 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i4) {
        if (i4 != Integer.MAX_VALUE) {
            return i4 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i4, int i5) {
        long j4 = i4 * i5;
        int i6 = (int) j4;
        if (i6 == j4) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return -i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i4, int i5) {
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) >= 0) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int toIntExact(long j4) {
        int i4 = (int) j4;
        if (i4 == j4) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long addExact(long j4, long j5) {
        long j6 = j4 + j5;
        if (((j4 ^ j6) & (j5 ^ j6)) >= 0) {
            return j6;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long decrementExact(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return j4 - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long incrementExact(long j4) {
        if (j4 != Long.MAX_VALUE) {
            return j4 + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long multiplyExact(long j4, long j5) {
        long j6 = j4 * j5;
        if (((Math.abs(j4) | Math.abs(j5)) >>> 31) == 0 || ((j5 == 0 || j6 / j5 == j4) && !(j4 == Long.MIN_VALUE && j5 == -1))) {
            return j6;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long negateExact(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return -j4;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long subtractExact(long j4, long j5) {
        long j6 = j4 - j5;
        if (((j4 ^ j6) & (j5 ^ j4)) >= 0) {
            return j6;
        }
        throw new ArithmeticException("long overflow");
    }
}
