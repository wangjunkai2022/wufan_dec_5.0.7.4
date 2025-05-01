package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: UInt.kt */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes.dex */
public final class UInt implements Comparable<UInt> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    /* compiled from: UInt.kt */
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
    private /* synthetic */ UInt(int i4) {
        this.data = i4;
    }

    @InlineOnly
    /* renamed from: and-WZ4Q5Ns  reason: not valid java name */
    private static final int m123andWZ4Q5Ns(int i4, int i5) {
        return m130constructorimpl(i4 & i5);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UInt m124boximpl(int i4) {
        return new UInt(i4);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m125compareTo7apg3OU(int i4, byte b5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, m130constructorimpl(b5 & 255) ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m126compareToVKZWuLQ(int i4, long j4) {
        int compare;
        compare = Long.compare(ULong.m209constructorimpl(i4 & 4294967295L) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private int m127compareToWZ4Q5Ns(int i4) {
        return UnsignedKt.uintCompare(m182unboximpl(), i4);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static final int m129compareToxj2QHRw(int i4, short s4) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, m130constructorimpl(s4 & UShort.MAX_VALUE) ^ Integer.MIN_VALUE);
        return compare;
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m130constructorimpl(int i4) {
        return i4;
    }

    @InlineOnly
    /* renamed from: dec-pVg5ArA  reason: not valid java name */
    private static final int m131decpVg5ArA(int i4) {
        return m130constructorimpl(i4 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m132div7apg3OU(int i4, byte b5) {
        return b.a(i4, m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m133divVKZWuLQ(int i4, long j4) {
        return f.a(ULong.m209constructorimpl(i4 & 4294967295L), j4);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m134divWZ4Q5Ns(int i4, int i5) {
        return UnsignedKt.m386uintDivideJ1ME1BU(i4, i5);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m135divxj2QHRw(int i4, short s4) {
        return b.a(i4, m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m136equalsimpl(int i4, Object obj) {
        return (obj instanceof UInt) && i4 == ((UInt) obj).m182unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m137equalsimpl0(int i4, int i5) {
        return i4 == i5;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m138floorDiv7apg3OU(int i4, byte b5) {
        return b.a(i4, m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m139floorDivVKZWuLQ(int i4, long j4) {
        return f.a(ULong.m209constructorimpl(i4 & 4294967295L), j4);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m140floorDivWZ4Q5Ns(int i4, int i5) {
        return b.a(i4, i5);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m141floorDivxj2QHRw(int i4, short s4) {
        return b.a(i4, m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m142hashCodeimpl(int i4) {
        return i4;
    }

    @InlineOnly
    /* renamed from: inc-pVg5ArA  reason: not valid java name */
    private static final int m143incpVg5ArA(int i4) {
        return m130constructorimpl(i4 + 1);
    }

    @InlineOnly
    /* renamed from: inv-pVg5ArA  reason: not valid java name */
    private static final int m144invpVg5ArA(int i4) {
        return m130constructorimpl(i4 ^ (-1));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m145minus7apg3OU(int i4, byte b5) {
        return m130constructorimpl(i4 - m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m146minusVKZWuLQ(int i4, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(i4 & 4294967295L) - j4);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m147minusWZ4Q5Ns(int i4, int i5) {
        return m130constructorimpl(i4 - i5);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m148minusxj2QHRw(int i4, short s4) {
        return m130constructorimpl(i4 - m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m149mod7apg3OU(int i4, byte b5) {
        return UByte.m53constructorimpl((byte) c.a(i4, m130constructorimpl(b5 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m150modVKZWuLQ(int i4, long j4) {
        return e.a(ULong.m209constructorimpl(i4 & 4294967295L), j4);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m151modWZ4Q5Ns(int i4, int i5) {
        return c.a(i4, i5);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m152modxj2QHRw(int i4, short s4) {
        return UShort.m316constructorimpl((short) c.a(i4, m130constructorimpl(s4 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-WZ4Q5Ns  reason: not valid java name */
    private static final int m153orWZ4Q5Ns(int i4, int i5) {
        return m130constructorimpl(i4 | i5);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m154plus7apg3OU(int i4, byte b5) {
        return m130constructorimpl(i4 + m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m155plusVKZWuLQ(int i4, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(i4 & 4294967295L) + j4);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m156plusWZ4Q5Ns(int i4, int i5) {
        return m130constructorimpl(i4 + i5);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m157plusxj2QHRw(int i4, short s4) {
        return m130constructorimpl(i4 + m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-WZ4Q5Ns  reason: not valid java name */
    private static final UIntRange m158rangeToWZ4Q5Ns(int i4, int i5) {
        return new UIntRange(i4, i5, null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-WZ4Q5Ns  reason: not valid java name */
    private static final UIntRange m159rangeUntilWZ4Q5Ns(int i4, int i5) {
        return URangesKt.m1298untilJ1ME1BU(i4, i5);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m160rem7apg3OU(int i4, byte b5) {
        return c.a(i4, m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m161remVKZWuLQ(int i4, long j4) {
        return e.a(ULong.m209constructorimpl(i4 & 4294967295L), j4);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m162remWZ4Q5Ns(int i4, int i5) {
        return UnsignedKt.m387uintRemainderJ1ME1BU(i4, i5);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m163remxj2QHRw(int i4, short s4) {
        return c.a(i4, m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: shl-pVg5ArA  reason: not valid java name */
    private static final int m164shlpVg5ArA(int i4, int i5) {
        return m130constructorimpl(i4 << i5);
    }

    @InlineOnly
    /* renamed from: shr-pVg5ArA  reason: not valid java name */
    private static final int m165shrpVg5ArA(int i4, int i5) {
        return m130constructorimpl(i4 >>> i5);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m166times7apg3OU(int i4, byte b5) {
        return m130constructorimpl(i4 * m130constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m167timesVKZWuLQ(int i4, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(i4 & 4294967295L) * j4);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m168timesWZ4Q5Ns(int i4, int i5) {
        return m130constructorimpl(i4 * i5);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m169timesxj2QHRw(int i4, short s4) {
        return m130constructorimpl(i4 * m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m170toByteimpl(int i4) {
        return (byte) i4;
    }

    @InlineOnly
    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m171toDoubleimpl(int i4) {
        return UnsignedKt.uintToDouble(i4);
    }

    @InlineOnly
    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m172toFloatimpl(int i4) {
        return (float) UnsignedKt.uintToDouble(i4);
    }

    @InlineOnly
    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m173toIntimpl(int i4) {
        return i4;
    }

    @InlineOnly
    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m174toLongimpl(int i4) {
        return i4 & 4294967295L;
    }

    @InlineOnly
    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m175toShortimpl(int i4) {
        return (short) i4;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m176toStringimpl(int i4) {
        return String.valueOf(i4 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m177toUBytew2LRezQ(int i4) {
        return UByte.m53constructorimpl((byte) i4);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m178toUIntpVg5ArA(int i4) {
        return i4;
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m179toULongsVKNKU(int i4) {
        return ULong.m209constructorimpl(i4 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m180toUShortMh2AYeg(int i4) {
        return UShort.m316constructorimpl((short) i4);
    }

    @InlineOnly
    /* renamed from: xor-WZ4Q5Ns  reason: not valid java name */
    private static final int m181xorWZ4Q5Ns(int i4, int i5) {
        return m130constructorimpl(i4 ^ i5);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(m182unboximpl(), uInt.m182unboximpl());
    }

    public boolean equals(Object obj) {
        return m136equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m142hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m176toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m182unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static int m128compareToWZ4Q5Ns(int i4, int i5) {
        return UnsignedKt.uintCompare(i4, i5);
    }
}
