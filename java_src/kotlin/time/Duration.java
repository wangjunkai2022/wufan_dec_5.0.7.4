package kotlin.time;

import com.airbnb.lottie.utils.h;
import com.join.kotlin.ui.modleregin.modle.a;
import external.org.apache.commons.lang3.d;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Duration.kt */
@SinceKotlin(version = "1.6")
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1484:1\n38#1:1485\n38#1:1486\n38#1:1487\n38#1:1488\n38#1:1489\n672#1,2:1490\n689#1,2:1499\n163#2,6:1492\n1#3:1498\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1485\n40#1:1486\n458#1:1487\n478#1:1488\n651#1:1489\n968#1:1490,2\n1059#1:1499,2\n1010#1:1492,6\n*E\n"})
/* loaded from: classes.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m1373constructorimpl(0);
    private static final long INFINITE = DurationKt.access$durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

    /* compiled from: Duration.kt */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc  reason: not valid java name */
        private final long m1429getDaysUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1431getDaysUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1432getDaysUwyO8pc$annotations(int i4) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1433getDaysUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getHours-UwyO8pc  reason: not valid java name */
        private final long m1435getHoursUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1437getHoursUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1438getHoursUwyO8pc$annotations(int i4) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1439getHoursUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getMicroseconds-UwyO8pc  reason: not valid java name */
        private final long m1441getMicrosecondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1443getMicrosecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1444getMicrosecondsUwyO8pc$annotations(int i4) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1445getMicrosecondsUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getMilliseconds-UwyO8pc  reason: not valid java name */
        private final long m1447getMillisecondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1449getMillisecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1450getMillisecondsUwyO8pc$annotations(int i4) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1451getMillisecondsUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getMinutes-UwyO8pc  reason: not valid java name */
        private final long m1453getMinutesUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1455getMinutesUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1456getMinutesUwyO8pc$annotations(int i4) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1457getMinutesUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getNanoseconds-UwyO8pc  reason: not valid java name */
        private final long m1459getNanosecondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1461getNanosecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1462getNanosecondsUwyO8pc$annotations(int i4) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1463getNanosecondsUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getSeconds-UwyO8pc  reason: not valid java name */
        private final long m1465getSecondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1467getSecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1468getSecondsUwyO8pc$annotations(int i4) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations  reason: not valid java name */
        public static /* synthetic */ void m1469getSecondsUwyO8pc$annotations(long j4) {
        }

        @ExperimentalTime
        public final double convert(double d5, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d5, sourceUnit, targetUnit);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m1471daysUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc  reason: not valid java name */
        public final long m1473getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib  reason: not valid java name */
        public final long m1474getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc  reason: not valid java name */
        public final long m1475getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m1477hoursUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m1480microsecondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m1483millisecondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m1486minutesUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m1489nanosecondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc  reason: not valid java name */
        public final long m1491parseUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, false);
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e5);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc  reason: not valid java name */
        public final long m1492parseIsoStringUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e5);
            }
        }

        @Nullable
        /* renamed from: parseIsoStringOrNull-FghU774  reason: not valid java name */
        public final Duration m1493parseIsoStringOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m1371boximpl(DurationKt.access$parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        /* renamed from: parseOrNull-FghU774  reason: not valid java name */
        public final Duration m1494parseOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m1371boximpl(DurationKt.access$parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m1496secondsUwyO8pc(int i4) {
            return DurationKt.toDuration(i4, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc  reason: not valid java name */
        private final long m1430getDaysUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc  reason: not valid java name */
        private final long m1436getHoursUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc  reason: not valid java name */
        private final long m1442getMicrosecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc  reason: not valid java name */
        private final long m1448getMillisecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc  reason: not valid java name */
        private final long m1454getMinutesUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc  reason: not valid java name */
        private final long m1460getNanosecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc  reason: not valid java name */
        private final long m1466getSecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m1472daysUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m1478hoursUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m1481microsecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m1484millisecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m1487minutesUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m1490nanosecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m1497secondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc  reason: not valid java name */
        private final long m1428getDaysUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc  reason: not valid java name */
        private final long m1434getHoursUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc  reason: not valid java name */
        private final long m1440getMicrosecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc  reason: not valid java name */
        private final long m1446getMillisecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc  reason: not valid java name */
        private final long m1452getMinutesUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc  reason: not valid java name */
        private final long m1458getNanosecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc  reason: not valid java name */
        private final long m1464getSecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m1470daysUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m1476hoursUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m1479microsecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m1482millisecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m1485minutesUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m1488nanosecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m1495secondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ Duration(long j4) {
        this.rawValue = j4;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc  reason: not valid java name */
    private static final long m1369addValuesMixedRangesUwyO8pc(long j4, long j5, long j6) {
        long coerceIn;
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j6);
        long j7 = j5 + access$nanosToMillis;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(j7)) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j7) + (j6 - DurationKt.access$millisToNanos(access$nanosToMillis)));
        }
        coerceIn = RangesKt___RangesKt.coerceIn(j7, -4611686018427387903L, (long) DurationKt.MAX_MILLIS);
        return DurationKt.access$durationOfMillis(coerceIn);
    }

    /* renamed from: appendFractional-impl  reason: not valid java name */
    private static final void m1370appendFractionalimpl(long j4, StringBuilder sb, int i4, int i5, int i6, String str, boolean z4) {
        String padStart;
        sb.append(i4);
        if (i5 != 0) {
            sb.append(d.f68897a);
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i5), i6, '0');
            int i7 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i7 = length;
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        length = i8;
                    }
                }
            }
            int i9 = i7 + 1;
            if (!z4 && i9 < 3) {
                sb.append((CharSequence) padStart, 0, i9);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) padStart, 0, ((i9 + 2) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Duration m1371boximpl(long j4) {
        return new Duration(j4);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1373constructorimpl(long j4) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m1404isInNanosimpl(j4)) {
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(m1400getValueimpl(j4))) {
                    throw new AssertionError(m1400getValueimpl(j4) + " ns is out of nanoseconds range");
                }
            } else if (new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS).contains(m1400getValueimpl(j4))) {
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m1400getValueimpl(j4))) {
                    throw new AssertionError(m1400getValueimpl(j4) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(m1400getValueimpl(j4) + " ms is out of milliseconds range");
            }
        }
        return j4;
    }

    /* renamed from: div-LRDsOJo  reason: not valid java name */
    public static final double m1374divLRDsOJo(long j4, long j5) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m1398getStorageUnitimpl(j4), m1398getStorageUnitimpl(j5));
        return m1416toDoubleimpl(j4, durationUnit) / m1416toDoubleimpl(j5, durationUnit);
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m1376divUwyO8pc(long j4, int i4) {
        int sign;
        if (i4 == 0) {
            if (m1407isPositiveimpl(j4)) {
                return INFINITE;
            }
            if (m1406isNegativeimpl(j4)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (m1404isInNanosimpl(j4)) {
            return DurationKt.access$durationOfNanos(m1400getValueimpl(j4) / i4);
        } else {
            if (m1405isInfiniteimpl(j4)) {
                sign = MathKt__MathJVMKt.getSign(i4);
                return m1411timesUwyO8pc(j4, sign);
            }
            long j5 = i4;
            long m1400getValueimpl = m1400getValueimpl(j4) / j5;
            if (new LongRange(-4611686018426L, 4611686018426L).contains(m1400getValueimpl)) {
                return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(m1400getValueimpl) + (DurationKt.access$millisToNanos(m1400getValueimpl(j4) - (m1400getValueimpl * j5)) / j5));
            }
            return DurationKt.access$durationOfMillis(m1400getValueimpl);
        }
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1377equalsimpl(long j4, Object obj) {
        return (obj instanceof Duration) && j4 == ((Duration) obj).m1427unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1378equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc  reason: not valid java name */
    public static final long m1379getAbsoluteValueUwyO8pc(long j4) {
        return m1406isNegativeimpl(j4) ? m1425unaryMinusUwyO8pc(j4) : j4;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl  reason: not valid java name */
    public static final int m1380getHoursComponentimpl(long j4) {
        if (m1405isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1389getInWholeHoursimpl(j4) % 24);
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    /* renamed from: getInDays-impl  reason: not valid java name */
    public static final double m1381getInDaysimpl(long j4) {
        return m1416toDoubleimpl(j4, DurationUnit.DAYS);
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    /* renamed from: getInHours-impl  reason: not valid java name */
    public static final double m1382getInHoursimpl(long j4) {
        return m1416toDoubleimpl(j4, DurationUnit.HOURS);
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    /* renamed from: getInMicroseconds-impl  reason: not valid java name */
    public static final double m1383getInMicrosecondsimpl(long j4) {
        return m1416toDoubleimpl(j4, DurationUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    /* renamed from: getInMilliseconds-impl  reason: not valid java name */
    public static final double m1384getInMillisecondsimpl(long j4) {
        return m1416toDoubleimpl(j4, DurationUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    /* renamed from: getInMinutes-impl  reason: not valid java name */
    public static final double m1385getInMinutesimpl(long j4) {
        return m1416toDoubleimpl(j4, DurationUnit.MINUTES);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    /* renamed from: getInNanoseconds-impl  reason: not valid java name */
    public static final double m1386getInNanosecondsimpl(long j4) {
        return m1416toDoubleimpl(j4, DurationUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInSeconds-impl  reason: not valid java name */
    public static final double m1387getInSecondsimpl(long j4) {
        return m1416toDoubleimpl(j4, DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeDays-impl  reason: not valid java name */
    public static final long m1388getInWholeDaysimpl(long j4) {
        return m1419toLongimpl(j4, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl  reason: not valid java name */
    public static final long m1389getInWholeHoursimpl(long j4) {
        return m1419toLongimpl(j4, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl  reason: not valid java name */
    public static final long m1390getInWholeMicrosecondsimpl(long j4) {
        return m1419toLongimpl(j4, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl  reason: not valid java name */
    public static final long m1391getInWholeMillisecondsimpl(long j4) {
        return (m1403isInMillisimpl(j4) && m1402isFiniteimpl(j4)) ? m1400getValueimpl(j4) : m1419toLongimpl(j4, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl  reason: not valid java name */
    public static final long m1392getInWholeMinutesimpl(long j4) {
        return m1419toLongimpl(j4, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl  reason: not valid java name */
    public static final long m1393getInWholeNanosecondsimpl(long j4) {
        long m1400getValueimpl = m1400getValueimpl(j4);
        if (m1404isInNanosimpl(j4)) {
            return m1400getValueimpl;
        }
        if (m1400getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m1400getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.access$millisToNanos(m1400getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl  reason: not valid java name */
    public static final long m1394getInWholeSecondsimpl(long j4) {
        return m1419toLongimpl(j4, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl  reason: not valid java name */
    public static final int m1395getMinutesComponentimpl(long j4) {
        if (m1405isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1392getInWholeMinutesimpl(j4) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl  reason: not valid java name */
    public static final int m1396getNanosecondsComponentimpl(long j4) {
        if (m1405isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1403isInMillisimpl(j4) ? DurationKt.access$millisToNanos(m1400getValueimpl(j4) % 1000) : m1400getValueimpl(j4) % ((long) h.f4318a));
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl  reason: not valid java name */
    public static final int m1397getSecondsComponentimpl(long j4) {
        if (m1405isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1394getInWholeSecondsimpl(j4) % 60);
    }

    /* renamed from: getStorageUnit-impl  reason: not valid java name */
    private static final DurationUnit m1398getStorageUnitimpl(long j4) {
        return m1404isInNanosimpl(j4) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl  reason: not valid java name */
    private static final int m1399getUnitDiscriminatorimpl(long j4) {
        return ((int) j4) & 1;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    private static final long m1400getValueimpl(long j4) {
        return j4 >> 1;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1401hashCodeimpl(long j4) {
        return a.a(j4);
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m1402isFiniteimpl(long j4) {
        return !m1405isInfiniteimpl(j4);
    }

    /* renamed from: isInMillis-impl  reason: not valid java name */
    private static final boolean m1403isInMillisimpl(long j4) {
        return (((int) j4) & 1) == 1;
    }

    /* renamed from: isInNanos-impl  reason: not valid java name */
    private static final boolean m1404isInNanosimpl(long j4) {
        return (((int) j4) & 1) == 0;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m1405isInfiniteimpl(long j4) {
        return j4 == INFINITE || j4 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl  reason: not valid java name */
    public static final boolean m1406isNegativeimpl(long j4) {
        return j4 < 0;
    }

    /* renamed from: isPositive-impl  reason: not valid java name */
    public static final boolean m1407isPositiveimpl(long j4) {
        return j4 > 0;
    }

    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    public static final long m1408minusLRDsOJo(long j4, long j5) {
        return m1409plusLRDsOJo(j4, m1425unaryMinusUwyO8pc(j5));
    }

    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    public static final long m1409plusLRDsOJo(long j4, long j5) {
        if (m1405isInfiniteimpl(j4)) {
            if (m1402isFiniteimpl(j5) || (j5 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (m1405isInfiniteimpl(j5)) {
            return j5;
        } else {
            if ((((int) j4) & 1) == (((int) j5) & 1)) {
                long m1400getValueimpl = m1400getValueimpl(j4) + m1400getValueimpl(j5);
                if (m1404isInNanosimpl(j4)) {
                    return DurationKt.access$durationOfNanosNormalized(m1400getValueimpl);
                }
                return DurationKt.access$durationOfMillisNormalized(m1400getValueimpl);
            } else if (m1403isInMillisimpl(j4)) {
                return m1369addValuesMixedRangesUwyO8pc(j4, m1400getValueimpl(j4), m1400getValueimpl(j5));
            } else {
                return m1369addValuesMixedRangesUwyO8pc(j4, m1400getValueimpl(j5), m1400getValueimpl(j4));
            }
        }
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final long m1411timesUwyO8pc(long j4, int i4) {
        int sign;
        int sign2;
        long coerceIn;
        int sign3;
        int sign4;
        long coerceIn2;
        if (m1405isInfiniteimpl(j4)) {
            if (i4 != 0) {
                return i4 > 0 ? j4 : m1425unaryMinusUwyO8pc(j4);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        } else if (i4 == 0) {
            return ZERO;
        } else {
            long m1400getValueimpl = m1400getValueimpl(j4);
            long j5 = i4;
            long j6 = m1400getValueimpl * j5;
            if (m1404isInNanosimpl(j4)) {
                if (new LongRange(-2147483647L, 2147483647L).contains(m1400getValueimpl)) {
                    return DurationKt.access$durationOfNanos(j6);
                }
                if (j6 / j5 == m1400getValueimpl) {
                    return DurationKt.access$durationOfNanosNormalized(j6);
                }
                long access$nanosToMillis = DurationKt.access$nanosToMillis(m1400getValueimpl);
                long j7 = access$nanosToMillis * j5;
                long access$nanosToMillis2 = DurationKt.access$nanosToMillis((m1400getValueimpl - DurationKt.access$millisToNanos(access$nanosToMillis)) * j5) + j7;
                if (j7 / j5 == access$nanosToMillis && (access$nanosToMillis2 ^ j7) >= 0) {
                    coerceIn2 = RangesKt___RangesKt.coerceIn(access$nanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS));
                    return DurationKt.access$durationOfMillis(coerceIn2);
                }
                sign3 = MathKt__MathJVMKt.getSign(m1400getValueimpl);
                sign4 = MathKt__MathJVMKt.getSign(i4);
                return sign3 * sign4 > 0 ? INFINITE : NEG_INFINITE;
            } else if (j6 / j5 == m1400getValueimpl) {
                coerceIn = RangesKt___RangesKt.coerceIn(j6, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS));
                return DurationKt.access$durationOfMillis(coerceIn);
            } else {
                sign = MathKt__MathJVMKt.getSign(m1400getValueimpl);
                sign2 = MathKt__MathJVMKt.getSign(i4);
                return sign * sign2 > 0 ? INFINITE : NEG_INFINITE;
            }
        }
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1415toComponentsimpl(long j4, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1388getInWholeDaysimpl(j4)), Integer.valueOf(m1380getHoursComponentimpl(j4)), Integer.valueOf(m1395getMinutesComponentimpl(j4)), Integer.valueOf(m1397getSecondsComponentimpl(j4)), Integer.valueOf(m1396getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m1416toDoubleimpl(long j4, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j4 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j4 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1400getValueimpl(j4), m1398getStorageUnitimpl(j4), unit);
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m1417toIntimpl(long j4, @NotNull DurationUnit unit) {
        long coerceIn;
        Intrinsics.checkNotNullParameter(unit, "unit");
        coerceIn = RangesKt___RangesKt.coerceIn(m1419toLongimpl(j4, unit), -2147483648L, 2147483647L);
        return (int) coerceIn;
    }

    @NotNull
    /* renamed from: toIsoString-impl  reason: not valid java name */
    public static final String m1418toIsoStringimpl(long j4) {
        StringBuilder sb = new StringBuilder();
        if (m1406isNegativeimpl(j4)) {
            sb.append('-');
        }
        sb.append("PT");
        long m1379getAbsoluteValueUwyO8pc = m1379getAbsoluteValueUwyO8pc(j4);
        long m1389getInWholeHoursimpl = m1389getInWholeHoursimpl(m1379getAbsoluteValueUwyO8pc);
        int m1395getMinutesComponentimpl = m1395getMinutesComponentimpl(m1379getAbsoluteValueUwyO8pc);
        int m1397getSecondsComponentimpl = m1397getSecondsComponentimpl(m1379getAbsoluteValueUwyO8pc);
        int m1396getNanosecondsComponentimpl = m1396getNanosecondsComponentimpl(m1379getAbsoluteValueUwyO8pc);
        if (m1405isInfiniteimpl(j4)) {
            m1389getInWholeHoursimpl = 9999999999999L;
        }
        boolean z4 = true;
        boolean z5 = m1389getInWholeHoursimpl != 0;
        boolean z6 = (m1397getSecondsComponentimpl == 0 && m1396getNanosecondsComponentimpl == 0) ? false : true;
        if (m1395getMinutesComponentimpl == 0 && (!z6 || !z5)) {
            z4 = false;
        }
        if (z5) {
            sb.append(m1389getInWholeHoursimpl);
            sb.append('H');
        }
        if (z4) {
            sb.append(m1395getMinutesComponentimpl);
            sb.append('M');
        }
        if (z6 || (!z5 && !z4)) {
            m1370appendFractionalimpl(j4, sb, m1397getSecondsComponentimpl, m1396getNanosecondsComponentimpl, 9, "S", true);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m1419toLongimpl(long j4, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j4 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j4 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1400getValueimpl(j4), m1398getStorageUnitimpl(j4), unit);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    /* renamed from: toLongMilliseconds-impl  reason: not valid java name */
    public static final long m1420toLongMillisecondsimpl(long j4) {
        return m1391getInWholeMillisecondsimpl(j4);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    /* renamed from: toLongNanoseconds-impl  reason: not valid java name */
    public static final long m1421toLongNanosecondsimpl(long j4) {
        return m1393getInWholeNanosecondsimpl(j4);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1422toStringimpl(long j4) {
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == INFINITE) {
            return "Infinity";
        }
        if (j4 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m1406isNegativeimpl = m1406isNegativeimpl(j4);
        StringBuilder sb = new StringBuilder();
        if (m1406isNegativeimpl) {
            sb.append('-');
        }
        long m1379getAbsoluteValueUwyO8pc = m1379getAbsoluteValueUwyO8pc(j4);
        long m1388getInWholeDaysimpl = m1388getInWholeDaysimpl(m1379getAbsoluteValueUwyO8pc);
        int m1380getHoursComponentimpl = m1380getHoursComponentimpl(m1379getAbsoluteValueUwyO8pc);
        int m1395getMinutesComponentimpl = m1395getMinutesComponentimpl(m1379getAbsoluteValueUwyO8pc);
        int m1397getSecondsComponentimpl = m1397getSecondsComponentimpl(m1379getAbsoluteValueUwyO8pc);
        int m1396getNanosecondsComponentimpl = m1396getNanosecondsComponentimpl(m1379getAbsoluteValueUwyO8pc);
        int i4 = 0;
        boolean z4 = m1388getInWholeDaysimpl != 0;
        boolean z5 = m1380getHoursComponentimpl != 0;
        boolean z6 = m1395getMinutesComponentimpl != 0;
        boolean z7 = (m1397getSecondsComponentimpl == 0 && m1396getNanosecondsComponentimpl == 0) ? false : true;
        if (z4) {
            sb.append(m1388getInWholeDaysimpl);
            sb.append('d');
            i4 = 1;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(m1380getHoursComponentimpl);
            sb.append('h');
            i4 = i5;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(m1395getMinutesComponentimpl);
            sb.append('m');
            i4 = i6;
        }
        if (z7) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (m1397getSecondsComponentimpl != 0 || z4 || z5 || z6) {
                m1370appendFractionalimpl(j4, sb, m1397getSecondsComponentimpl, m1396getNanosecondsComponentimpl, 9, "s", false);
            } else if (m1396getNanosecondsComponentimpl >= 1000000) {
                m1370appendFractionalimpl(j4, sb, m1396getNanosecondsComponentimpl / 1000000, m1396getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m1396getNanosecondsComponentimpl >= 1000) {
                m1370appendFractionalimpl(j4, sb, m1396getNanosecondsComponentimpl / 1000, m1396getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m1396getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i4 = i7;
        }
        if (m1406isNegativeimpl && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: toString-impl$default  reason: not valid java name */
    public static /* synthetic */ String m1424toStringimpl$default(long j4, DurationUnit durationUnit, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return m1423toStringimpl(j4, durationUnit, i4);
    }

    /* renamed from: unaryMinus-UwyO8pc  reason: not valid java name */
    public static final long m1425unaryMinusUwyO8pc(long j4) {
        return DurationKt.access$durationOf(-m1400getValueimpl(j4), ((int) j4) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m1426compareToLRDsOJo(duration.m1427unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public int m1426compareToLRDsOJo(long j4) {
        return m1372compareToLRDsOJo(this.rawValue, j4);
    }

    public boolean equals(Object obj) {
        return m1377equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m1401hashCodeimpl(this.rawValue);
    }

    @NotNull
    public String toString() {
        return m1422toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1427unboximpl() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public static int m1372compareToLRDsOJo(long j4, long j5) {
        long j6 = j4 ^ j5;
        if (j6 < 0 || (((int) j6) & 1) == 0) {
            return Intrinsics.compare(j4, j5);
        }
        int i4 = (((int) j4) & 1) - (((int) j5) & 1);
        return m1406isNegativeimpl(j4) ? -i4 : i4;
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1414toComponentsimpl(long j4, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1389getInWholeHoursimpl(j4)), Integer.valueOf(m1395getMinutesComponentimpl(j4)), Integer.valueOf(m1397getSecondsComponentimpl(j4)), Integer.valueOf(m1396getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1413toComponentsimpl(long j4, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1392getInWholeMinutesimpl(j4)), Integer.valueOf(m1397getSecondsComponentimpl(j4)), Integer.valueOf(m1396getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1412toComponentsimpl(long j4, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1394getInWholeSecondsimpl(j4)), Integer.valueOf(m1396getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m1375divUwyO8pc(long j4, double d5) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(d5);
        if ((((double) roundToInt) == d5) && roundToInt != 0) {
            return m1376divUwyO8pc(j4, roundToInt);
        }
        DurationUnit m1398getStorageUnitimpl = m1398getStorageUnitimpl(j4);
        return DurationKt.toDuration(m1416toDoubleimpl(j4, m1398getStorageUnitimpl) / d5, m1398getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final long m1410timesUwyO8pc(long j4, double d5) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(d5);
        if (((double) roundToInt) == d5) {
            return m1411timesUwyO8pc(j4, roundToInt);
        }
        DurationUnit m1398getStorageUnitimpl = m1398getStorageUnitimpl(j4);
        return DurationKt.toDuration(m1416toDoubleimpl(j4, m1398getStorageUnitimpl) * d5, m1398getStorageUnitimpl);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static final String m1423toStringimpl(long j4, @NotNull DurationUnit unit, int i4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i4 >= 0) {
            double m1416toDoubleimpl = m1416toDoubleimpl(j4, unit);
            if (Double.isInfinite(m1416toDoubleimpl)) {
                return String.valueOf(m1416toDoubleimpl);
            }
            StringBuilder sb = new StringBuilder();
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, 12);
            sb.append(DurationJvmKt.formatToExactDecimals(m1416toDoubleimpl, coerceAtMost));
            sb.append(DurationUnitKt__DurationUnitKt.shortName(unit));
            return sb.toString();
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i4).toString());
    }
}
