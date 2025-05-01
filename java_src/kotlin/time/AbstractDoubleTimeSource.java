package kotlin.time;

import kotlin.Deprecated;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: TimeSources.kt */
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes.dex */
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {
    @NotNull
    private final DurationUnit unit;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TimeSources.kt */
    /* loaded from: classes6.dex */
    public static final class DoubleTimeMark implements ComparableTimeMark {
        private final long offset;
        private final double startedAt;
        @NotNull
        private final AbstractDoubleTimeSource timeSource;

        private DoubleTimeMark(double d5, AbstractDoubleTimeSource timeSource, long j4) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = d5;
            this.timeSource = timeSource;
            this.offset = j4;
        }

        public /* synthetic */ DoubleTimeMark(double d5, AbstractDoubleTimeSource abstractDoubleTimeSource, long j4, DefaultConstructorMarker defaultConstructorMarker) {
            this(d5, abstractDoubleTimeSource, j4);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
        public long mo1362elapsedNowUwyO8pc() {
            return Duration.m1408minusLRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object obj) {
            return (obj instanceof DoubleTimeMark) && Intrinsics.areEqual(this.timeSource, ((DoubleTimeMark) obj).timeSource) && Duration.m1378equalsimpl0(mo1364minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m1475getZEROUwyO8pc());
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Duration.m1401hashCodeimpl(Duration.m1409plusLRDsOJo(DurationKt.toDuration(this.startedAt, this.timeSource.getUnit()), this.offset));
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark mo1363minusLRDsOJo(long j4) {
            return ComparableTimeMark.DefaultImpls.m1368minusLRDsOJo(this, j4);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc  reason: not valid java name */
        public long mo1364minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, doubleTimeMark.timeSource)) {
                    if (Duration.m1378equalsimpl0(this.offset, doubleTimeMark.offset) && Duration.m1405isInfiniteimpl(this.offset)) {
                        return Duration.Companion.m1475getZEROUwyO8pc();
                    }
                    long m1408minusLRDsOJo = Duration.m1408minusLRDsOJo(this.offset, doubleTimeMark.offset);
                    long duration = DurationKt.toDuration(this.startedAt - doubleTimeMark.startedAt, this.timeSource.getUnit());
                    return Duration.m1378equalsimpl0(duration, Duration.m1425unaryMinusUwyO8pc(m1408minusLRDsOJo)) ? Duration.Companion.m1475getZEROUwyO8pc() : Duration.m1409plusLRDsOJo(duration, m1408minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @NotNull
        public String toString() {
            return "DoubleTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m1422toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark mo1365plusLRDsOJo(long j4) {
            return new DoubleTimeMark(this.startedAt, this.timeSource, Duration.m1409plusLRDsOJo(this.offset, j4), null);
        }
    }

    public AbstractDoubleTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
    }

    @NotNull
    protected final DurationUnit getUnit() {
        return this.unit;
    }

    protected abstract double read();

    @Override // kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new DoubleTimeMark(read(), this, Duration.Companion.m1475getZEROUwyO8pc(), null);
    }
}
