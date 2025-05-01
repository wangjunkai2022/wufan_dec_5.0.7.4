package kotlin;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: UnsignedUtils.kt */
@JvmName(name = "UnsignedKt")
/* loaded from: classes6.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d5) {
        if (!Double.isNaN(d5) && d5 > uintToDouble(0)) {
            if (d5 >= uintToDouble(-1)) {
                return -1;
            }
            if (d5 <= 2.147483647E9d) {
                return UInt.m130constructorimpl((int) d5);
            }
            double d6 = Integer.MAX_VALUE;
            Double.isNaN(d6);
            return UInt.m130constructorimpl(UInt.m130constructorimpl((int) (d5 - d6)) + UInt.m130constructorimpl(Integer.MAX_VALUE));
        }
        return 0;
    }

    @PublishedApi
    public static final long doubleToULong(double d5) {
        if (!Double.isNaN(d5) && d5 > ulongToDouble(0L)) {
            if (d5 >= ulongToDouble(-1L)) {
                return -1L;
            }
            if (d5 < 9.223372036854776E18d) {
                return ULong.m209constructorimpl((long) d5);
            }
            return ULong.m209constructorimpl(ULong.m209constructorimpl((long) (d5 - 9.223372036854776E18d)) - Long.MIN_VALUE);
        }
        return 0L;
    }

    @PublishedApi
    public static final int uintCompare(int i4, int i5) {
        return Intrinsics.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU  reason: not valid java name */
    public static final int m386uintDivideJ1ME1BU(int i4, int i5) {
        return UInt.m130constructorimpl((int) ((i4 & 4294967295L) / (i5 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU  reason: not valid java name */
    public static final int m387uintRemainderJ1ME1BU(int i4, int i5) {
        return UInt.m130constructorimpl((int) ((i4 & 4294967295L) % (i5 & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i4) {
        double d5 = Integer.MAX_VALUE & i4;
        double d6 = (i4 >>> 31) << 30;
        double d7 = 2;
        Double.isNaN(d6);
        Double.isNaN(d7);
        Double.isNaN(d5);
        return d5 + (d6 * d7);
    }

    @PublishedApi
    public static final int ulongCompare(long j4, long j5) {
        return Intrinsics.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI  reason: not valid java name */
    public static final long m388ulongDivideeb3DHEI(long j4, long j5) {
        int compare;
        int compare2;
        if (j5 < 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            return compare2 < 0 ? ULong.m209constructorimpl(0L) : ULong.m209constructorimpl(1L);
        } else if (j4 >= 0) {
            return ULong.m209constructorimpl(j4 / j5);
        } else {
            long j6 = ((j4 >>> 1) / j5) << 1;
            compare = Long.compare(ULong.m209constructorimpl(j4 - (j6 * j5)) ^ Long.MIN_VALUE, ULong.m209constructorimpl(j5) ^ Long.MIN_VALUE);
            return ULong.m209constructorimpl(j6 + (compare < 0 ? 0 : 1));
        }
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI  reason: not valid java name */
    public static final long m389ulongRemaindereb3DHEI(long j4, long j5) {
        int compare;
        int compare2;
        if (j5 < 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            return compare2 < 0 ? j4 : ULong.m209constructorimpl(j4 - j5);
        } else if (j4 >= 0) {
            return ULong.m209constructorimpl(j4 % j5);
        } else {
            long j6 = j4 - ((((j4 >>> 1) / j5) << 1) * j5);
            compare = Long.compare(ULong.m209constructorimpl(j6) ^ Long.MIN_VALUE, ULong.m209constructorimpl(j5) ^ Long.MIN_VALUE);
            if (compare < 0) {
                j5 = 0;
            }
            return ULong.m209constructorimpl(j6 - j5);
        }
    }

    @PublishedApi
    public static final double ulongToDouble(long j4) {
        double d5 = j4 >>> 11;
        double d6 = 2048;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = j4 & 2047;
        Double.isNaN(d7);
        return (d5 * d6) + d7;
    }

    @NotNull
    public static final String ulongToString(long j4) {
        return ulongToString(j4, 10);
    }

    @NotNull
    public static final String ulongToString(long j4, int i4) {
        int checkRadix;
        int checkRadix2;
        int checkRadix3;
        if (j4 >= 0) {
            checkRadix3 = CharsKt__CharJVMKt.checkRadix(i4);
            String l4 = Long.toString(j4, checkRadix3);
            Intrinsics.checkNotNullExpressionValue(l4, "toString(this, checkRadix(radix))");
            return l4;
        }
        long j5 = i4;
        long j6 = ((j4 >>> 1) / j5) << 1;
        long j7 = j4 - (j6 * j5);
        if (j7 >= j5) {
            j7 -= j5;
            j6++;
        }
        StringBuilder sb = new StringBuilder();
        checkRadix = CharsKt__CharJVMKt.checkRadix(i4);
        String l5 = Long.toString(j6, checkRadix);
        Intrinsics.checkNotNullExpressionValue(l5, "toString(this, checkRadix(radix))");
        sb.append(l5);
        checkRadix2 = CharsKt__CharJVMKt.checkRadix(i4);
        String l6 = Long.toString(j7, checkRadix2);
        Intrinsics.checkNotNullExpressionValue(l6, "toString(this, checkRadix(radix))");
        sb.append(l6);
        return sb.toString();
    }
}
