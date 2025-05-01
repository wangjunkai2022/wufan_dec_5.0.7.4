package kotlin.time;

import com.join.kotlin.ui.modleregin.modle.a;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import org.jetbrains.annotations.NotNull;
/* compiled from: TimeSource.kt */
@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public interface TimeSource {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: TimeSource.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* compiled from: TimeSource.kt */
    /* loaded from: classes6.dex */
    public static final class Monotonic implements WithComparableMarks {
        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        /* compiled from: TimeSource.kt */
        @SinceKotlin(version = "1.7")
        @JvmInline
        @ExperimentalTime
        /* loaded from: classes6.dex */
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j4) {
                this.reading = j4;
            }

            /* renamed from: box-impl  reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m1512boximpl(long j4) {
                return new ValueTimeMark(j4);
            }

            /* renamed from: compareTo-6eNON_k  reason: not valid java name */
            public static final int m1513compareTo6eNON_k(long j4, long j5) {
                return Duration.m1372compareToLRDsOJo(m1522minus6eNON_k(j4, j5), Duration.Companion.m1475getZEROUwyO8pc());
            }

            /* renamed from: compareTo-impl  reason: not valid java name */
            public static int m1514compareToimpl(long j4, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1512boximpl(j4).compareTo(other);
            }

            /* renamed from: constructor-impl  reason: not valid java name */
            public static long m1515constructorimpl(long j4) {
                return j4;
            }

            /* renamed from: equals-impl  reason: not valid java name */
            public static boolean m1517equalsimpl(long j4, Object obj) {
                return (obj instanceof ValueTimeMark) && j4 == ((ValueTimeMark) obj).m1529unboximpl();
            }

            /* renamed from: equals-impl0  reason: not valid java name */
            public static final boolean m1518equalsimpl0(long j4, long j5) {
                return j4 == j5;
            }

            /* renamed from: hasNotPassedNow-impl  reason: not valid java name */
            public static boolean m1519hasNotPassedNowimpl(long j4) {
                return Duration.m1406isNegativeimpl(m1516elapsedNowUwyO8pc(j4));
            }

            /* renamed from: hasPassedNow-impl  reason: not valid java name */
            public static boolean m1520hasPassedNowimpl(long j4) {
                return !Duration.m1406isNegativeimpl(m1516elapsedNowUwyO8pc(j4));
            }

            /* renamed from: hashCode-impl  reason: not valid java name */
            public static int m1521hashCodeimpl(long j4) {
                return a.a(j4);
            }

            /* renamed from: minus-6eNON_k  reason: not valid java name */
            public static final long m1522minus6eNON_k(long j4, long j5) {
                return MonotonicTimeSource.INSTANCE.m1504differenceBetweenfRLX17w(j4, j5);
            }

            /* renamed from: toString-impl  reason: not valid java name */
            public static String m1526toStringimpl(long j4) {
                return "ValueTimeMark(reading=" + j4 + ')';
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public long mo1362elapsedNowUwyO8pc() {
                return m1516elapsedNowUwyO8pc(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return m1517equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m1519hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m1520hasPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m1521hashCodeimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1363minusLRDsOJo(long j4) {
                return m1512boximpl(m1527minusLRDsOJo(j4));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* renamed from: minus-UwyO8pc */
            public long mo1364minusUwyO8pc(@NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1524minusUwyO8pc(this.reading, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1365plusLRDsOJo(long j4) {
                return m1512boximpl(m1528plusLRDsOJo(j4));
            }

            public String toString() {
                return m1526toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl  reason: not valid java name */
            public final /* synthetic */ long m1529unboximpl() {
                return this.reading;
            }

            /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
            public static long m1516elapsedNowUwyO8pc(long j4) {
                return MonotonicTimeSource.INSTANCE.m1505elapsedFrom6eNON_k(j4);
            }

            /* renamed from: minus-UwyO8pc  reason: not valid java name */
            public static long m1524minusUwyO8pc(long j4, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m1522minus6eNON_k(j4, ((ValueTimeMark) other).m1529unboximpl());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m1526toStringimpl(j4)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1363minusLRDsOJo(long j4) {
                return m1512boximpl(m1527minusLRDsOJo(j4));
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1365plusLRDsOJo(long j4) {
                return m1512boximpl(m1528plusLRDsOJo(j4));
            }

            /* renamed from: minus-LRDsOJo  reason: not valid java name */
            public long m1527minusLRDsOJo(long j4) {
                return m1523minusLRDsOJo(this.reading, j4);
            }

            /* renamed from: plus-LRDsOJo  reason: not valid java name */
            public long m1528plusLRDsOJo(long j4) {
                return m1525plusLRDsOJo(this.reading, j4);
            }

            /* renamed from: minus-LRDsOJo  reason: not valid java name */
            public static long m1523minusLRDsOJo(long j4, long j5) {
                return MonotonicTimeSource.INSTANCE.m1503adjustReading6QKq23U(j4, Duration.m1425unaryMinusUwyO8pc(j5));
            }

            /* renamed from: plus-LRDsOJo  reason: not valid java name */
            public static long m1525plusLRDsOJo(long j4, long j5) {
                return MonotonicTimeSource.INSTANCE.m1503adjustReading6QKq23U(j4, j5);
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m1512boximpl(m1511markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto  reason: not valid java name */
        public long m1511markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m1506markNowz9LOYto();
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m1512boximpl(m1511markNowz9LOYto());
        }
    }

    /* compiled from: TimeSource.kt */
    @SinceKotlin(version = "1.8")
    @ExperimentalTime
    /* loaded from: classes6.dex */
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        @NotNull
        ComparableTimeMark markNow();
    }

    @NotNull
    TimeMark markNow();
}
