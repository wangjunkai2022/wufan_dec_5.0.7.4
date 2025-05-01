package kotlin.time;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
/* compiled from: TimeSource.kt */
@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public interface TimeMark {

    /* compiled from: TimeSource.kt */
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(@NotNull TimeMark timeMark) {
            return Duration.m1406isNegativeimpl(timeMark.mo1362elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(@NotNull TimeMark timeMark) {
            return !Duration.m1406isNegativeimpl(timeMark.mo1362elapsedNowUwyO8pc());
        }

        @NotNull
        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public static TimeMark m1509minusLRDsOJo(@NotNull TimeMark timeMark, long j4) {
            return timeMark.mo1365plusLRDsOJo(Duration.m1425unaryMinusUwyO8pc(j4));
        }

        @NotNull
        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public static TimeMark m1510plusLRDsOJo(@NotNull TimeMark timeMark, long j4) {
            return new AdjustedTimeMark(timeMark, j4, null);
        }
    }

    /* renamed from: elapsedNow-UwyO8pc */
    long mo1362elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    @NotNull
    /* renamed from: minus-LRDsOJo */
    TimeMark mo1363minusLRDsOJo(long j4);

    @NotNull
    /* renamed from: plus-LRDsOJo */
    TimeMark mo1365plusLRDsOJo(long j4);
}
