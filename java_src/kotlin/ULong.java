package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: ULong.kt */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes.dex */
public final class ULong implements Comparable<ULong> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    /* compiled from: ULong.kt */
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
    private /* synthetic */ ULong(long j4) {
        this.data = j4;
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ  reason: not valid java name */
    private static final long m202andVKZWuLQ(long j4, long j5) {
        return m209constructorimpl(j4 & j5);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ULong m203boximpl(long j4) {
        return new ULong(j4);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m204compareTo7apg3OU(long j4, byte b5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, m209constructorimpl(b5 & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private int m205compareToVKZWuLQ(long j4) {
        return UnsignedKt.ulongCompare(m261unboximpl(), j4);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m207compareToWZ4Q5Ns(long j4, int i4) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, m209constructorimpl(i4 & 4294967295L) ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static final int m208compareToxj2QHRw(long j4, short s4) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, m209constructorimpl(s4 & 65535) ^ Long.MIN_VALUE);
        return compare;
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m209constructorimpl(long j4) {
        return j4;
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU  reason: not valid java name */
    private static final long m210decsVKNKU(long j4) {
        return m209constructorimpl(j4 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final long m211div7apg3OU(long j4, byte b5) {
        return f.a(j4, m209constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m212divVKZWuLQ(long j4, long j5) {
        return UnsignedKt.m388ulongDivideeb3DHEI(j4, j5);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final long m213divWZ4Q5Ns(long j4, int i4) {
        return f.a(j4, m209constructorimpl(i4 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final long m214divxj2QHRw(long j4, short s4) {
        return f.a(j4, m209constructorimpl(s4 & 65535));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m215equalsimpl(long j4, Object obj) {
        return (obj instanceof ULong) && j4 == ((ULong) obj).m261unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m216equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final long m217floorDiv7apg3OU(long j4, byte b5) {
        return f.a(j4, m209constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m218floorDivVKZWuLQ(long j4, long j5) {
        return f.a(j4, j5);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final long m219floorDivWZ4Q5Ns(long j4, int i4) {
        return f.a(j4, m209constructorimpl(i4 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final long m220floorDivxj2QHRw(long j4, short s4) {
        return f.a(j4, m209constructorimpl(s4 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m221hashCodeimpl(long j4) {
        return com.join.kotlin.ui.modleregin.modle.a.a(j4);
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU  reason: not valid java name */
    private static final long m222incsVKNKU(long j4) {
        return m209constructorimpl(j4 + 1);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU  reason: not valid java name */
    private static final long m223invsVKNKU(long j4) {
        return m209constructorimpl(j4 ^ (-1));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final long m224minus7apg3OU(long j4, byte b5) {
        return m209constructorimpl(j4 - m209constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m225minusVKZWuLQ(long j4, long j5) {
        return m209constructorimpl(j4 - j5);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final long m226minusWZ4Q5Ns(long j4, int i4) {
        return m209constructorimpl(j4 - m209constructorimpl(i4 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final long m227minusxj2QHRw(long j4, short s4) {
        return m209constructorimpl(j4 - m209constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m228mod7apg3OU(long j4, byte b5) {
        return UByte.m53constructorimpl((byte) e.a(j4, m209constructorimpl(b5 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m229modVKZWuLQ(long j4, long j5) {
        return e.a(j4, j5);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m230modWZ4Q5Ns(long j4, int i4) {
        return UInt.m130constructorimpl((int) e.a(j4, m209constructorimpl(i4 & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m231modxj2QHRw(long j4, short s4) {
        return UShort.m316constructorimpl((short) e.a(j4, m209constructorimpl(s4 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ  reason: not valid java name */
    private static final long m232orVKZWuLQ(long j4, long j5) {
        return m209constructorimpl(j4 | j5);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final long m233plus7apg3OU(long j4, byte b5) {
        return m209constructorimpl(j4 + m209constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m234plusVKZWuLQ(long j4, long j5) {
        return m209constructorimpl(j4 + j5);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final long m235plusWZ4Q5Ns(long j4, int i4) {
        return m209constructorimpl(j4 + m209constructorimpl(i4 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final long m236plusxj2QHRw(long j4, short s4) {
        return m209constructorimpl(j4 + m209constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ  reason: not valid java name */
    private static final ULongRange m237rangeToVKZWuLQ(long j4, long j5) {
        return new ULongRange(j4, j5, null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-VKZWuLQ  reason: not valid java name */
    private static final ULongRange m238rangeUntilVKZWuLQ(long j4, long j5) {
        return URangesKt.m1299untileb3DHEI(j4, j5);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final long m239rem7apg3OU(long j4, byte b5) {
        return e.a(j4, m209constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m240remVKZWuLQ(long j4, long j5) {
        return UnsignedKt.m389ulongRemaindereb3DHEI(j4, j5);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final long m241remWZ4Q5Ns(long j4, int i4) {
        return e.a(j4, m209constructorimpl(i4 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final long m242remxj2QHRw(long j4, short s4) {
        return e.a(j4, m209constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU  reason: not valid java name */
    private static final long m243shlsVKNKU(long j4, int i4) {
        return m209constructorimpl(j4 << i4);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU  reason: not valid java name */
    private static final long m244shrsVKNKU(long j4, int i4) {
        return m209constructorimpl(j4 >>> i4);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final long m245times7apg3OU(long j4, byte b5) {
        return m209constructorimpl(j4 * m209constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m246timesVKZWuLQ(long j4, long j5) {
        return m209constructorimpl(j4 * j5);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final long m247timesWZ4Q5Ns(long j4, int i4) {
        return m209constructorimpl(j4 * m209constructorimpl(i4 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final long m248timesxj2QHRw(long j4, short s4) {
        return m209constructorimpl(j4 * m209constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m249toByteimpl(long j4) {
        return (byte) j4;
    }

    @InlineOnly
    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m250toDoubleimpl(long j4) {
        return UnsignedKt.ulongToDouble(j4);
    }

    @InlineOnly
    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m251toFloatimpl(long j4) {
        return (float) UnsignedKt.ulongToDouble(j4);
    }

    @InlineOnly
    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m252toIntimpl(long j4) {
        return (int) j4;
    }

    @InlineOnly
    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m253toLongimpl(long j4) {
        return j4;
    }

    @InlineOnly
    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m254toShortimpl(long j4) {
        return (short) j4;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m255toStringimpl(long j4) {
        return UnsignedKt.ulongToString(j4);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m256toUBytew2LRezQ(long j4) {
        return UByte.m53constructorimpl((byte) j4);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m257toUIntpVg5ArA(long j4) {
        return UInt.m130constructorimpl((int) j4);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m258toULongsVKNKU(long j4) {
        return j4;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m259toUShortMh2AYeg(long j4) {
        return UShort.m316constructorimpl((short) j4);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ  reason: not valid java name */
    private static final long m260xorVKZWuLQ(long j4, long j5) {
        return m209constructorimpl(j4 ^ j5);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m261unboximpl(), uLong.m261unboximpl());
    }

    public boolean equals(Object obj) {
        return m215equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m221hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m255toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m261unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static int m206compareToVKZWuLQ(long j4, long j5) {
        return UnsignedKt.ulongCompare(j4, j5);
    }
}
