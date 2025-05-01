package kotlin.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.c;
import kotlin.e;
/* compiled from: UProgressionUtil.kt */
/* loaded from: classes6.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA  reason: not valid java name */
    private static final int m1263differenceModuloWZ9TVnA(int i4, int i5, int i6) {
        int compare;
        int a5 = c.a(i4, i6);
        int a6 = c.a(i5, i6);
        compare = Integer.compare(a5 ^ Integer.MIN_VALUE, a6 ^ Integer.MIN_VALUE);
        int m130constructorimpl = UInt.m130constructorimpl(a5 - a6);
        return compare >= 0 ? m130constructorimpl : UInt.m130constructorimpl(m130constructorimpl + i6);
    }

    /* renamed from: differenceModulo-sambcqE  reason: not valid java name */
    private static final long m1264differenceModulosambcqE(long j4, long j5, long j6) {
        int compare;
        long a5 = e.a(j4, j6);
        long a6 = e.a(j5, j6);
        compare = Long.compare(a5 ^ Long.MIN_VALUE, a6 ^ Long.MIN_VALUE);
        long m209constructorimpl = ULong.m209constructorimpl(a5 - a6);
        return compare >= 0 ? m209constructorimpl : ULong.m209constructorimpl(m209constructorimpl + j6);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g  reason: not valid java name */
    public static final long m1265getProgressionLastElement7ftBX0g(long j4, long j5, long j6) {
        int compare;
        int compare2;
        if (j6 > 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j5 : ULong.m209constructorimpl(j5 - m1264differenceModulosambcqE(j5, j4, ULong.m209constructorimpl(j6)));
        } else if (j6 < 0) {
            compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            return compare <= 0 ? j5 : ULong.m209constructorimpl(j5 + m1264differenceModulosambcqE(j4, j5, ULong.m209constructorimpl(-j6)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs  reason: not valid java name */
    public static final int m1266getProgressionLastElementNkh28Cs(int i4, int i5, int i6) {
        int compare;
        int compare2;
        if (i6 > 0) {
            compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            return compare2 >= 0 ? i5 : UInt.m130constructorimpl(i5 - m1263differenceModuloWZ9TVnA(i5, i4, UInt.m130constructorimpl(i6)));
        } else if (i6 < 0) {
            compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            return compare <= 0 ? i5 : UInt.m130constructorimpl(i5 + m1263differenceModuloWZ9TVnA(i4, i5, UInt.m130constructorimpl(-i6)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
