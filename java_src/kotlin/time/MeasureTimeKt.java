package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;
/* compiled from: measureTime.kt */
@SourceDebugExtension({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"})
/* loaded from: classes6.dex */
public final class MeasureTimeKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long m1511markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1511markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m1516elapsedNowUwyO8pc(m1511markNowz9LOYto);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m1516elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m1511markNowz9LOYto()), null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(@NotNull TimeSource timeSource, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TimeMark markNow = timeSource.markNow();
        block.invoke();
        return markNow.mo1362elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource timeSource, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), timeSource.markNow().mo1362elapsedNowUwyO8pc(), null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalTime
    public static final long measureTime(@NotNull TimeSource.Monotonic monotonic, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        long m1511markNowz9LOYto = monotonic.m1511markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m1516elapsedNowUwyO8pc(m1511markNowz9LOYto);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalTime
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource.Monotonic monotonic, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m1516elapsedNowUwyO8pc(monotonic.m1511markNowz9LOYto()), null);
    }
}
