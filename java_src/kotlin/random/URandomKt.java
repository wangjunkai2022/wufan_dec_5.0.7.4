package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;
/* compiled from: URandom.kt */
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes6.dex */
public final class URandomKt {
    /* renamed from: checkUIntRangeBounds-J1ME1BU  reason: not valid java name */
    public static final void m1271checkUIntRangeBoundsJ1ME1BU(int i4, int i5) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        if (!(compare > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m124boximpl(i4), UInt.m124boximpl(i5)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI  reason: not valid java name */
    public static final void m1272checkULongRangeBoundseb3DHEI(long j4, long j5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        if (!(compare > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m203boximpl(j4), ULong.m203boximpl(j5)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] nextUBytes(@NotNull Random random, int i4) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m106constructorimpl(random.nextBytes(i4));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: nextUBytes-EVgfTAA  reason: not valid java name */
    public static final byte[] m1273nextUBytesEVgfTAA(@NotNull Random nextUBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* renamed from: nextUBytes-Wvrt4B4  reason: not valid java name */
    public static final byte[] m1274nextUBytesWvrt4B4(@NotNull Random nextUBytes, @NotNull byte[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i4, i5);
        return array;
    }

    /* renamed from: nextUBytes-Wvrt4B4$default  reason: not valid java name */
    public static /* synthetic */ byte[] m1275nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = UByteArray.m112getSizeimpl(bArr);
        }
        return m1274nextUBytesWvrt4B4(random, bArr, i4, i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m130constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextUInt-a8DCA5k  reason: not valid java name */
    public static final int m1276nextUInta8DCA5k(@NotNull Random nextUInt, int i4, int i5) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m1271checkUIntRangeBoundsJ1ME1BU(i4, i5);
        return UInt.m130constructorimpl(nextUInt.nextInt(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextUInt-qCasIEU  reason: not valid java name */
    public static final int m1277nextUIntqCasIEU(@NotNull Random nextUInt, int i4) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m1276nextUInta8DCA5k(nextUInt, 0, i4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m209constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextULong-V1Xi4fY  reason: not valid java name */
    public static final long m1278nextULongV1Xi4fY(@NotNull Random nextULong, long j4) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m1279nextULongjmpaWc(nextULong, 0L, j4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextULong-jmpaW-c  reason: not valid java name */
    public static final long m1279nextULongjmpaWc(@NotNull Random nextULong, long j4, long j5) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m1272checkULongRangeBoundseb3DHEI(j4, j5);
        return ULong.m209constructorimpl(nextULong.nextLong(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random, @NotNull UIntRange range) {
        int compare;
        int compare2;
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        compare = Integer.compare(range.m1281getLastpVg5ArA() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return m1276nextUInta8DCA5k(random, range.m1280getFirstpVg5ArA(), UInt.m130constructorimpl(range.m1281getLastpVg5ArA() + 1));
        }
        compare2 = Integer.compare(range.m1280getFirstpVg5ArA() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare2 > 0 ? UInt.m130constructorimpl(m1276nextUInta8DCA5k(random, UInt.m130constructorimpl(range.m1280getFirstpVg5ArA() - 1), range.m1281getLastpVg5ArA()) + 1) : nextUInt(random);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random, @NotNull ULongRange range) {
        int compare;
        int compare2;
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        compare = Long.compare(range.m1290getLastsVKNKU() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
        if (compare < 0) {
            return m1279nextULongjmpaWc(random, range.m1289getFirstsVKNKU(), ULong.m209constructorimpl(range.m1290getLastsVKNKU() + ULong.m209constructorimpl(4294967295L & 1)));
        }
        compare2 = Long.compare(range.m1289getFirstsVKNKU() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare2 > 0) {
            long j4 = 4294967295L & 1;
            return ULong.m209constructorimpl(m1279nextULongjmpaWc(random, ULong.m209constructorimpl(range.m1289getFirstsVKNKU() - ULong.m209constructorimpl(j4)), range.m1290getLastsVKNKU()) + ULong.m209constructorimpl(j4));
        }
        return nextULong(random);
    }
}
