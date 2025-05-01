package kotlin.ranges;

import external.org.apache.commons.lang3.d;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ranges.kt */
/* loaded from: classes.dex */
public class RangesKt__RangesKt {
    public static final void checkStepIsPositive(boolean z4, @NotNull Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z4) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + d.f68897a);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/ClosedRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(ClosedRange closedRange, Object obj) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return obj != null && closedRange.contains((Comparable) obj);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(@NotNull T t4, @NotNull T that) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new ComparableRange(t4, that);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @NotNull
    public static final <T extends Comparable<? super T>> OpenEndRange<T> rangeUntil(@NotNull T t4, @NotNull T that) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new ComparableOpenEndRange(t4, that);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/OpenEndRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final boolean contains(OpenEndRange openEndRange, Object obj) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return obj != null && openEndRange.contains((Comparable) obj);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final ClosedFloatingPointRange<Double> rangeTo(double d5, double d6) {
        return new ClosedDoubleRange(d5, d6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @NotNull
    public static final OpenEndRange<Double> rangeUntil(double d5, double d6) {
        return new OpenEndDoubleRange(d5, d6);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final ClosedFloatingPointRange<Float> rangeTo(float f5, float f6) {
        return new ClosedFloatRange(f5, f6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @NotNull
    public static final OpenEndRange<Float> rangeUntil(float f5, float f6) {
        return new OpenEndFloatRange(f5, f6);
    }
}
