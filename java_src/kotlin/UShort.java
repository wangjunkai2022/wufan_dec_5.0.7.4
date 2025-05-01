package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: UShort.kt */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes6.dex */
public final class UShort implements Comparable<UShort> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* compiled from: UShort.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s4) {
        this.data = s4;
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw  reason: not valid java name */
    private static final short m309andxj2QHRw(short s4, short s5) {
        return m316constructorimpl((short) (s4 & s5));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UShort m310boximpl(short s4) {
        return new UShort(s4);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m311compareTo7apg3OU(short s4, byte b5) {
        return Intrinsics.compare(s4 & MAX_VALUE, b5 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m312compareToVKZWuLQ(short s4, long j4) {
        int compare;
        compare = Long.compare(ULong.m209constructorimpl(s4 & 65535) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m313compareToWZ4Q5Ns(short s4, int i4) {
        int compare;
        compare = Integer.compare(UInt.m130constructorimpl(s4 & MAX_VALUE) ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private int m314compareToxj2QHRw(short s4) {
        return Intrinsics.compare(m366unboximpl() & MAX_VALUE, s4 & MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m316constructorimpl(short s4) {
        return s4;
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg  reason: not valid java name */
    private static final short m317decMh2AYeg(short s4) {
        return m316constructorimpl((short) (s4 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m318div7apg3OU(short s4, byte b5) {
        return b.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m319divVKZWuLQ(short s4, long j4) {
        return f.a(ULong.m209constructorimpl(s4 & 65535), j4);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m320divWZ4Q5Ns(short s4, int i4) {
        return b.a(UInt.m130constructorimpl(s4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m321divxj2QHRw(short s4, short s5) {
        return b.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(s5 & MAX_VALUE));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m322equalsimpl(short s4, Object obj) {
        return (obj instanceof UShort) && s4 == ((UShort) obj).m366unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m323equalsimpl0(short s4, short s5) {
        return s4 == s5;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m324floorDiv7apg3OU(short s4, byte b5) {
        return b.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m325floorDivVKZWuLQ(short s4, long j4) {
        return f.a(ULong.m209constructorimpl(s4 & 65535), j4);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m326floorDivWZ4Q5Ns(short s4, int i4) {
        return b.a(UInt.m130constructorimpl(s4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m327floorDivxj2QHRw(short s4, short s5) {
        return b.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(s5 & MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m328hashCodeimpl(short s4) {
        return s4;
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg  reason: not valid java name */
    private static final short m329incMh2AYeg(short s4) {
        return m316constructorimpl((short) (s4 + 1));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg  reason: not valid java name */
    private static final short m330invMh2AYeg(short s4) {
        return m316constructorimpl((short) (s4 ^ (-1)));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m331minus7apg3OU(short s4, byte b5) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) - UInt.m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m332minusVKZWuLQ(short s4, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(s4 & 65535) - j4);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m333minusWZ4Q5Ns(short s4, int i4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) - i4);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m334minusxj2QHRw(short s4, short s5) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) - UInt.m130constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m335mod7apg3OU(short s4, byte b5) {
        return UByte.m53constructorimpl((byte) c.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(b5 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m336modVKZWuLQ(short s4, long j4) {
        return e.a(ULong.m209constructorimpl(s4 & 65535), j4);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m337modWZ4Q5Ns(short s4, int i4) {
        return c.a(UInt.m130constructorimpl(s4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m338modxj2QHRw(short s4, short s5) {
        return m316constructorimpl((short) c.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(s5 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw  reason: not valid java name */
    private static final short m339orxj2QHRw(short s4, short s5) {
        return m316constructorimpl((short) (s4 | s5));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m340plus7apg3OU(short s4, byte b5) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) + UInt.m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m341plusVKZWuLQ(short s4, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(s4 & 65535) + j4);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m342plusWZ4Q5Ns(short s4, int i4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) + i4);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m343plusxj2QHRw(short s4, short s5) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) + UInt.m130constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw  reason: not valid java name */
    private static final UIntRange m344rangeToxj2QHRw(short s4, short s5) {
        return new UIntRange(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(s5 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-xj2QHRw  reason: not valid java name */
    private static final UIntRange m345rangeUntilxj2QHRw(short s4, short s5) {
        return URangesKt.m1298untilJ1ME1BU(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m346rem7apg3OU(short s4, byte b5) {
        return c.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m347remVKZWuLQ(short s4, long j4) {
        return e.a(ULong.m209constructorimpl(s4 & 65535), j4);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m348remWZ4Q5Ns(short s4, int i4) {
        return c.a(UInt.m130constructorimpl(s4 & MAX_VALUE), i4);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m349remxj2QHRw(short s4, short s5) {
        return c.a(UInt.m130constructorimpl(s4 & MAX_VALUE), UInt.m130constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m350times7apg3OU(short s4, byte b5) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) * UInt.m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m351timesVKZWuLQ(short s4, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(s4 & 65535) * j4);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m352timesWZ4Q5Ns(short s4, int i4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) * i4);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m353timesxj2QHRw(short s4, short s5) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(s4 & MAX_VALUE) * UInt.m130constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m354toByteimpl(short s4) {
        return (byte) s4;
    }

    @InlineOnly
    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m355toDoubleimpl(short s4) {
        return s4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m356toFloatimpl(short s4) {
        return s4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m357toIntimpl(short s4) {
        return s4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m358toLongimpl(short s4) {
        return s4 & 65535;
    }

    @InlineOnly
    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m359toShortimpl(short s4) {
        return s4;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m360toStringimpl(short s4) {
        return String.valueOf(s4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m361toUBytew2LRezQ(short s4) {
        return UByte.m53constructorimpl((byte) s4);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m362toUIntpVg5ArA(short s4) {
        return UInt.m130constructorimpl(s4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m363toULongsVKNKU(short s4) {
        return ULong.m209constructorimpl(s4 & 65535);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m364toUShortMh2AYeg(short s4) {
        return s4;
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw  reason: not valid java name */
    private static final short m365xorxj2QHRw(short s4, short s5) {
        return m316constructorimpl((short) (s4 ^ s5));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m366unboximpl() & MAX_VALUE, uShort.m366unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m322equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m328hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m360toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m366unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static int m315compareToxj2QHRw(short s4, short s5) {
        return Intrinsics.compare(s4 & MAX_VALUE, s5 & MAX_VALUE);
    }
}
