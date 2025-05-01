package kotlin.time;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
/* compiled from: longSaturatedMath.kt */
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,75:1\n74#1:76\n74#1:77\n74#1:78\n74#1:79\n74#1:80\n74#1:81\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n15#1:76\n18#1:77\n36#1:78\n45#1:79\n52#1:80\n56#1:81\n*E\n"})
/* loaded from: classes6.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4  reason: not valid java name */
    private static final long m1500checkInfiniteSumDefinedPjuGub4(long j4, long j5, long j6) {
        if (!Duration.m1405isInfiniteimpl(j5) || (j4 ^ j6) >= 0) {
            return j4;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final boolean isSaturated(long j4) {
        return ((j4 - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-pTJri5U  reason: not valid java name */
    public static final long m1501saturatingAddpTJri5U(long j4, long j5) {
        long m1393getInWholeNanosecondsimpl = Duration.m1393getInWholeNanosecondsimpl(j5);
        if (((j4 - 1) | 1) == Long.MAX_VALUE) {
            return m1500checkInfiniteSumDefinedPjuGub4(j4, j5, m1393getInWholeNanosecondsimpl);
        }
        if ((1 | (m1393getInWholeNanosecondsimpl - 1)) == Long.MAX_VALUE) {
            return m1502saturatingAddInHalvespTJri5U(j4, j5);
        }
        long j6 = j4 + m1393getInWholeNanosecondsimpl;
        return ((j4 ^ j6) & (m1393getInWholeNanosecondsimpl ^ j6)) < 0 ? j4 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j6;
    }

    /* renamed from: saturatingAddInHalves-pTJri5U  reason: not valid java name */
    private static final long m1502saturatingAddInHalvespTJri5U(long j4, long j5) {
        long m1376divUwyO8pc = Duration.m1376divUwyO8pc(j5, 2);
        if (((Duration.m1393getInWholeNanosecondsimpl(m1376divUwyO8pc) - 1) | 1) == Long.MAX_VALUE) {
            double d5 = j4;
            double m1416toDoubleimpl = Duration.m1416toDoubleimpl(j5, DurationUnit.NANOSECONDS);
            Double.isNaN(d5);
            return (long) (d5 + m1416toDoubleimpl);
        }
        return m1501saturatingAddpTJri5U(m1501saturatingAddpTJri5U(j4, m1376divUwyO8pc), Duration.m1408minusLRDsOJo(j5, m1376divUwyO8pc));
    }

    public static final long saturatingDiff(long j4, long j5) {
        if ((1 | (j5 - 1)) == Long.MAX_VALUE) {
            return Duration.m1425unaryMinusUwyO8pc(DurationKt.toDuration(j5, DurationUnit.DAYS));
        }
        return saturatingFiniteDiff(j4, j5);
    }

    private static final long saturatingFiniteDiff(long j4, long j5) {
        long j6 = j4 - j5;
        if (((j6 ^ j4) & ((j6 ^ j5) ^ (-1))) < 0) {
            long j7 = 1000000;
            long j8 = (j4 % j7) - (j5 % j7);
            Duration.Companion companion = Duration.Companion;
            return Duration.m1409plusLRDsOJo(DurationKt.toDuration((j4 / j7) - (j5 / j7), DurationUnit.MILLISECONDS), DurationKt.toDuration(j8, DurationUnit.NANOSECONDS));
        }
        Duration.Companion companion2 = Duration.Companion;
        return DurationKt.toDuration(j6, DurationUnit.NANOSECONDS);
    }

    public static final long saturatingOriginsDiff(long j4, long j5) {
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (j4 == j5) {
                return Duration.Companion.m1475getZEROUwyO8pc();
            }
            return Duration.m1425unaryMinusUwyO8pc(DurationKt.toDuration(j5, DurationUnit.DAYS));
        }
        if ((1 | (j4 - 1)) == Long.MAX_VALUE) {
            return DurationKt.toDuration(j4, DurationUnit.DAYS);
        }
        return saturatingFiniteDiff(j4, j5);
    }
}
