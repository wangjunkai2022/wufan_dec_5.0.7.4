package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: measureTime.kt */
@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public final class TimedValue<T> {
    private final long duration;
    private final T value;

    private TimedValue(T t4, long j4) {
        this.value = t4;
        this.duration = j4;
    }

    public /* synthetic */ TimedValue(Object obj, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-RFiDyg4$default  reason: not valid java name */
    public static /* synthetic */ TimedValue m1530copyRFiDyg4$default(TimedValue timedValue, Object obj, long j4, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = timedValue.value;
        }
        if ((i4 & 2) != 0) {
            j4 = timedValue.duration;
        }
        return timedValue.m1532copyRFiDyg4(obj, j4);
    }

    public final T component1() {
        return this.value;
    }

    /* renamed from: component2-UwyO8pc  reason: not valid java name */
    public final long m1531component2UwyO8pc() {
        return this.duration;
    }

    @NotNull
    /* renamed from: copy-RFiDyg4  reason: not valid java name */
    public final TimedValue<T> m1532copyRFiDyg4(T t4, long j4) {
        return new TimedValue<>(t4, j4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimedValue) {
            TimedValue timedValue = (TimedValue) obj;
            return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m1378equalsimpl0(this.duration, timedValue.duration);
        }
        return false;
    }

    /* renamed from: getDuration-UwyO8pc  reason: not valid java name */
    public final long m1533getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t4 = this.value;
        return ((t4 == null ? 0 : t4.hashCode()) * 31) + Duration.m1401hashCodeimpl(this.duration);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m1422toStringimpl(this.duration)) + ')';
    }
}
