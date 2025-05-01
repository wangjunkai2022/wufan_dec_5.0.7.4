package kotlin.ranges;

import external.org.apache.commons.lang3.d;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _URanges.kt */
/* loaded from: classes6.dex */
public class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-5PvTz6A  reason: not valid java name */
    public static final short m1300coerceAtLeast5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s5) < 0 ? s5 : s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-J1ME1BU  reason: not valid java name */
    public static final int m1301coerceAtLeastJ1ME1BU(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare < 0 ? i5 : i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-Kr8caGY  reason: not valid java name */
    public static final byte m1302coerceAtLeastKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) < 0 ? b6 : b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-eb3DHEI  reason: not valid java name */
    public static final long m1303coerceAtLeasteb3DHEI(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare < 0 ? j5 : j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-5PvTz6A  reason: not valid java name */
    public static final short m1304coerceAtMost5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s5) > 0 ? s5 : s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-J1ME1BU  reason: not valid java name */
    public static final int m1305coerceAtMostJ1ME1BU(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare > 0 ? i5 : i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-Kr8caGY  reason: not valid java name */
    public static final byte m1306coerceAtMostKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) > 0 ? b6 : b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-eb3DHEI  reason: not valid java name */
    public static final long m1307coerceAtMosteb3DHEI(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare > 0 ? j5 : j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-JPwROB0  reason: not valid java name */
    public static final long m1308coerceInJPwROB0(long j4, @NotNull ClosedRange<ULong> range) {
        int compare;
        int compare2;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt___RangesKt.coerceIn(ULong.m203boximpl(j4), (ClosedFloatingPointRange<ULong>) range)).m261unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + d.f68897a);
        }
        compare = Long.compare(j4 ^ Long.MIN_VALUE, range.getStart().m261unboximpl() ^ Long.MIN_VALUE);
        if (compare < 0) {
            return range.getStart().m261unboximpl();
        }
        compare2 = Long.compare(j4 ^ Long.MIN_VALUE, range.getEndInclusive().m261unboximpl() ^ Long.MIN_VALUE);
        return compare2 > 0 ? range.getEndInclusive().m261unboximpl() : j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-VKSA0NQ  reason: not valid java name */
    public static final short m1309coerceInVKSA0NQ(short s4, short s5, short s6) {
        int i4 = s5 & UShort.MAX_VALUE;
        int i5 = s6 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i4, i5) <= 0) {
            int i6 = 65535 & s4;
            return Intrinsics.compare(i6, i4) < 0 ? s5 : Intrinsics.compare(i6, i5) > 0 ? s6 : s4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m360toStringimpl(s6)) + " is less than minimum " + ((Object) UShort.m360toStringimpl(s5)) + d.f68897a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-WZ9TVnA  reason: not valid java name */
    public static final int m1310coerceInWZ9TVnA(int i4, int i5, int i6) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return i5;
            }
            compare3 = Integer.compare(i4 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
            return compare3 > 0 ? i6 : i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m176toStringimpl(i6)) + " is less than minimum " + ((Object) UInt.m176toStringimpl(i5)) + d.f68897a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-b33U2AM  reason: not valid java name */
    public static final byte m1311coerceInb33U2AM(byte b5, byte b6, byte b7) {
        int i4 = b6 & 255;
        int i5 = b7 & 255;
        if (Intrinsics.compare(i4, i5) <= 0) {
            int i6 = b5 & 255;
            return Intrinsics.compare(i6, i4) < 0 ? b6 : Intrinsics.compare(i6, i5) > 0 ? b7 : b5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m97toStringimpl(b7)) + " is less than minimum " + ((Object) UByte.m97toStringimpl(b6)) + d.f68897a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-sambcqE  reason: not valid java name */
    public static final long m1312coerceInsambcqE(long j4, long j5, long j6) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j5;
            }
            compare3 = Long.compare(j4 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            return compare3 > 0 ? j6 : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m255toStringimpl(j6)) + " is less than minimum " + ((Object) ULong.m255toStringimpl(j5)) + d.f68897a);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-wuiCnnA  reason: not valid java name */
    public static final int m1313coerceInwuiCnnA(int i4, @NotNull ClosedRange<UInt> range) {
        int compare;
        int compare2;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt___RangesKt.coerceIn(UInt.m124boximpl(i4), (ClosedFloatingPointRange<UInt>) range)).m182unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + d.f68897a);
        }
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, range.getStart().m182unboximpl() ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return range.getStart().m182unboximpl();
        }
        compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, range.getEndInclusive().m182unboximpl() ^ Integer.MIN_VALUE);
        return compare2 > 0 ? range.getEndInclusive().m182unboximpl() : i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-68kG9v0  reason: not valid java name */
    public static final boolean m1314contains68kG9v0(@NotNull UIntRange contains, byte b5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1285containsWZ4Q5Ns(UInt.m130constructorimpl(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-GYNo2lE  reason: not valid java name */
    private static final boolean m1315containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m1294containsVKZWuLQ(uLong.m261unboximpl());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-Gab390E  reason: not valid java name */
    public static final boolean m1316containsGab390E(@NotNull ULongRange contains, int i4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1294containsVKZWuLQ(ULong.m209constructorimpl(i4 & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ULb-yJY  reason: not valid java name */
    public static final boolean m1317containsULbyJY(@NotNull ULongRange contains, byte b5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1294containsVKZWuLQ(ULong.m209constructorimpl(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ZsK3CEQ  reason: not valid java name */
    public static final boolean m1318containsZsK3CEQ(@NotNull UIntRange contains, short s4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1285containsWZ4Q5Ns(UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-biwQdVI  reason: not valid java name */
    private static final boolean m1319containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m1285containsWZ4Q5Ns(uInt.m182unboximpl());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-fz5IDCE  reason: not valid java name */
    public static final boolean m1320containsfz5IDCE(@NotNull UIntRange contains, long j4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m209constructorimpl(j4 >>> 32) == 0 && contains.m1285containsWZ4Q5Ns(UInt.m130constructorimpl((int) j4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-uhHAxoY  reason: not valid java name */
    public static final boolean m1321containsuhHAxoY(@NotNull ULongRange contains, short s4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1294containsVKZWuLQ(ULong.m209constructorimpl(s4 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-5PvTz6A  reason: not valid java name */
    public static final UIntProgression m1322downTo5PvTz6A(short s4, short s5) {
        return UIntProgression.Companion.m1282fromClosedRangeNkh28Cs(UInt.m130constructorimpl(s4 & UShort.MAX_VALUE), UInt.m130constructorimpl(s5 & UShort.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-J1ME1BU  reason: not valid java name */
    public static final UIntProgression m1323downToJ1ME1BU(int i4, int i5) {
        return UIntProgression.Companion.m1282fromClosedRangeNkh28Cs(i4, i5, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-Kr8caGY  reason: not valid java name */
    public static final UIntProgression m1324downToKr8caGY(byte b5, byte b6) {
        return UIntProgression.Companion.m1282fromClosedRangeNkh28Cs(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(b6 & 255), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: downTo-eb3DHEI  reason: not valid java name */
    public static final ULongProgression m1325downToeb3DHEI(long j4, long j5) {
        return ULongProgression.Companion.m1291fromClosedRange7ftBX0g(j4, j5, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.m1280getFirstpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt firstOrNull(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m124boximpl(uIntProgression.m1280getFirstpVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.m1281getLastpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt lastOrNull(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m124boximpl(uIntProgression.m1281getLastpVg5ArA());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return random(uIntRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return randomOrNull(uIntRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression reversed(@NotNull UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.Companion.m1282fromClosedRangeNkh28Cs(uIntProgression.m1281getLastpVg5ArA(), uIntProgression.m1280getFirstpVg5ArA(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final UIntProgression step(@NotNull UIntProgression uIntProgression, int i4) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i4 > 0, Integer.valueOf(i4));
        UIntProgression.Companion companion = UIntProgression.Companion;
        int m1280getFirstpVg5ArA = uIntProgression.m1280getFirstpVg5ArA();
        int m1281getLastpVg5ArA = uIntProgression.m1281getLastpVg5ArA();
        if (uIntProgression.getStep() <= 0) {
            i4 = -i4;
        }
        return companion.m1282fromClosedRangeNkh28Cs(m1280getFirstpVg5ArA, m1281getLastpVg5ArA, i4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-5PvTz6A  reason: not valid java name */
    public static final UIntRange m1326until5PvTz6A(short s4, short s5) {
        int i4 = s5 & UShort.MAX_VALUE;
        return Intrinsics.compare(i4, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m130constructorimpl(s4 & UShort.MAX_VALUE), UInt.m130constructorimpl(UInt.m130constructorimpl(i4) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-J1ME1BU  reason: not valid java name */
    public static UIntRange m1327untilJ1ME1BU(int i4, int i5) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(i4, UInt.m130constructorimpl(i5 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-Kr8caGY  reason: not valid java name */
    public static final UIntRange m1328untilKr8caGY(byte b5, byte b6) {
        int i4 = b6 & 255;
        return Intrinsics.compare(i4, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(UInt.m130constructorimpl(i4) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    /* renamed from: until-eb3DHEI  reason: not valid java name */
    public static ULongRange m1329untileb3DHEI(long j4, long j5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        return compare <= 0 ? ULongRange.Companion.getEMPTY() : new ULongRange(j4, ULong.m209constructorimpl(j5 - ULong.m209constructorimpl(1 & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong firstOrNull(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m203boximpl(uLongProgression.m1289getFirstsVKNKU());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong lastOrNull(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m203boximpl(uLongProgression.m1290getLastsVKNKU());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return random(uLongRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return randomOrNull(uLongRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression reversed(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.Companion.m1291fromClosedRange7ftBX0g(uLongProgression.m1290getLastsVKNKU(), uLongProgression.m1289getFirstsVKNKU(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int random(@NotNull UIntRange uIntRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt randomOrNull(@NotNull UIntRange uIntRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m124boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @NotNull
    public static final ULongProgression step(@NotNull ULongProgression uLongProgression, long j4) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j4 > 0, Long.valueOf(j4));
        ULongProgression.Companion companion = ULongProgression.Companion;
        long m1289getFirstsVKNKU = uLongProgression.m1289getFirstsVKNKU();
        long m1290getLastsVKNKU = uLongProgression.m1290getLastsVKNKU();
        if (uLongProgression.getStep() <= 0) {
            j4 = -j4;
        }
        return companion.m1291fromClosedRange7ftBX0g(m1289getFirstsVKNKU, m1290getLastsVKNKU, j4);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.m1289getFirstsVKNKU();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.m1290getLastsVKNKU();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long random(@NotNull ULongRange uLongRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @Nullable
    public static final ULong randomOrNull(@NotNull ULongRange uLongRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m203boximpl(URandomKt.nextULong(random, uLongRange));
    }
}
