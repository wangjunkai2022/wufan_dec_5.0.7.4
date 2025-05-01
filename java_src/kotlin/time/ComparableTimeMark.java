package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: TimeSource.kt */
@SinceKotlin(version = "1.8")
@ExperimentalTime
/* loaded from: classes6.dex */
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    /* compiled from: TimeSource.kt */
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static int compareTo(@NotNull ComparableTimeMark comparableTimeMark, @NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m1372compareToLRDsOJo(comparableTimeMark.mo1364minusUwyO8pc(other), Duration.Companion.m1475getZEROUwyO8pc());
        }

        public static boolean hasNotPassedNow(@NotNull ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark);
        }

        public static boolean hasPassedNow(@NotNull ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark);
        }

        @NotNull
        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public static ComparableTimeMark m1368minusLRDsOJo(@NotNull ComparableTimeMark comparableTimeMark, long j4) {
            return comparableTimeMark.mo1365plusLRDsOJo(Duration.m1425unaryMinusUwyO8pc(j4));
        }
    }

    int compareTo(@NotNull ComparableTimeMark comparableTimeMark);

    boolean equals(@Nullable Object obj);

    int hashCode();

    @Override // kotlin.time.TimeMark
    @NotNull
    /* renamed from: minus-LRDsOJo */
    ComparableTimeMark mo1363minusLRDsOJo(long j4);

    /* renamed from: minus-UwyO8pc */
    long mo1364minusUwyO8pc(@NotNull ComparableTimeMark comparableTimeMark);

    @Override // kotlin.time.TimeMark
    @NotNull
    /* renamed from: plus-LRDsOJo */
    ComparableTimeMark mo1365plusLRDsOJo(long j4);
}
