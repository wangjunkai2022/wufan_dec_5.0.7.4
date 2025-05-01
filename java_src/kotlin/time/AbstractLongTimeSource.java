package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.ComparableTimeMark;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: TimeSources.kt */
@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    @NotNull
    private final DurationUnit unit;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TimeSources.kt */
    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,180:1\n720#2,2:181\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n66#1:181,2\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        @NotNull
        private final AbstractLongTimeSource timeSource;

        private LongTimeMark(long j4, AbstractLongTimeSource timeSource, long j5) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j4;
            this.timeSource = timeSource;
            this.offset = j5;
        }

        public /* synthetic */ LongTimeMark(long j4, AbstractLongTimeSource abstractLongTimeSource, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j4, abstractLongTimeSource, j5);
        }

        /* renamed from: effectiveDuration-UwyO8pc$kotlin_stdlib  reason: not valid java name */
        public final long m1366effectiveDurationUwyO8pc$kotlin_stdlib() {
            if (Duration.m1405isInfiniteimpl(this.offset)) {
                return this.offset;
            }
            DurationUnit unit = this.timeSource.getUnit();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            if (unit.compareTo(durationUnit) >= 0) {
                return Duration.m1409plusLRDsOJo(DurationKt.toDuration(this.startedAt, unit), this.offset);
            }
            long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit, unit);
            long j4 = this.startedAt;
            long j5 = j4 / convertDurationUnit;
            long j6 = j4 % convertDurationUnit;
            long j7 = this.offset;
            long m1394getInWholeSecondsimpl = Duration.m1394getInWholeSecondsimpl(j7);
            int m1396getNanosecondsComponentimpl = Duration.m1396getNanosecondsComponentimpl(j7);
            int i4 = m1396getNanosecondsComponentimpl / 1000000;
            long duration = DurationKt.toDuration(j6, unit);
            Duration.Companion companion = Duration.Companion;
            return Duration.m1409plusLRDsOJo(Duration.m1409plusLRDsOJo(Duration.m1409plusLRDsOJo(duration, DurationKt.toDuration(m1396getNanosecondsComponentimpl % 1000000, DurationUnit.NANOSECONDS)), DurationKt.toDuration(j5 + i4, durationUnit)), DurationKt.toDuration(m1394getInWholeSecondsimpl, DurationUnit.SECONDS));
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo1362elapsedNowUwyO8pc() {
            return Duration.m1405isInfiniteimpl(this.offset) ? Duration.m1425unaryMinusUwyO8pc(this.offset) : Duration.m1408minusLRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object obj) {
            return (obj instanceof LongTimeMark) && Intrinsics.areEqual(this.timeSource, ((LongTimeMark) obj).timeSource) && Duration.m1378equalsimpl0(mo1364minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m1475getZEROUwyO8pc());
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
            return Duration.m1401hashCodeimpl(m1366effectiveDurationUwyO8pc$kotlin_stdlib());
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo1363minusLRDsOJo(long j4) {
            return ComparableTimeMark.DefaultImpls.m1368minusLRDsOJo(this, j4);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo1364minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    if (Duration.m1378equalsimpl0(this.offset, longTimeMark.offset) && Duration.m1405isInfiniteimpl(this.offset)) {
                        return Duration.Companion.m1475getZEROUwyO8pc();
                    }
                    long m1408minusLRDsOJo = Duration.m1408minusLRDsOJo(this.offset, longTimeMark.offset);
                    long duration = DurationKt.toDuration(this.startedAt - longTimeMark.startedAt, this.timeSource.getUnit());
                    return Duration.m1378equalsimpl0(duration, Duration.m1425unaryMinusUwyO8pc(m1408minusLRDsOJo)) ? Duration.Companion.m1475getZEROUwyO8pc() : Duration.m1409plusLRDsOJo(duration, m1408minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @NotNull
        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m1422toStringimpl(this.offset)) + " (=" + ((Object) Duration.m1422toStringimpl(m1366effectiveDurationUwyO8pc$kotlin_stdlib())) + "), " + this.timeSource + ')';
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo1365plusLRDsOJo(long j4) {
            return new LongTimeMark(this.startedAt, this.timeSource, Duration.m1409plusLRDsOJo(this.offset, j4), null);
        }
    }

    public AbstractLongTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final DurationUnit getUnit() {
        return this.unit;
    }

    protected abstract long read();

    @Override // kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new LongTimeMark(read(), this, Duration.Companion.m1475getZEROUwyO8pc(), null);
    }
}
