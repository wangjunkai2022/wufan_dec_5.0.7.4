package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;
/* compiled from: MonoTimeSource.kt */
@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {
    @NotNull
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    /* renamed from: adjustReading-6QKq23U  reason: not valid java name */
    public final long m1503adjustReading6QKq23U(long j4, long j5) {
        return TimeSource.Monotonic.ValueTimeMark.m1515constructorimpl(LongSaturatedMathKt.m1501saturatingAddpTJri5U(j4, j5));
    }

    /* renamed from: differenceBetween-fRLX17w  reason: not valid java name */
    public final long m1504differenceBetweenfRLX17w(long j4, long j5) {
        return LongSaturatedMathKt.saturatingOriginsDiff(j4, j5);
    }

    /* renamed from: elapsedFrom-6eNON_k  reason: not valid java name */
    public final long m1505elapsedFrom6eNON_k(long j4) {
        return LongSaturatedMathKt.saturatingDiff(read(), j4);
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m1512boximpl(m1506markNowz9LOYto());
    }

    /* renamed from: markNow-z9LOYto  reason: not valid java name */
    public long m1506markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m1515constructorimpl(read());
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ TimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m1512boximpl(m1506markNowz9LOYto());
    }
}
