package kotlin;

import io.netty.handler.codec.http2.Http2CodecUtil;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: UByte.kt */
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes6.dex */
public final class UByte implements Comparable<UByte> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* compiled from: UByte.kt */
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
    private /* synthetic */ UByte(byte b5) {
        this.data = b5;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU  reason: not valid java name */
    private static final byte m46and7apg3OU(byte b5, byte b6) {
        return m53constructorimpl((byte) (b5 & b6));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UByte m47boximpl(byte b5) {
        return new UByte(b5);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private int m48compareTo7apg3OU(byte b5) {
        return Intrinsics.compare(m103unboximpl() & 255, b5 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m50compareToVKZWuLQ(byte b5, long j4) {
        int compare;
        compare = Long.compare(ULong.m209constructorimpl(b5 & 255) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m51compareToWZ4Q5Ns(byte b5, int i4) {
        int compare;
        compare = Integer.compare(UInt.m130constructorimpl(b5 & 255) ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static final int m52compareToxj2QHRw(byte b5, short s4) {
        return Intrinsics.compare(b5 & 255, s4 & UShort.MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl  reason: not valid java name */
    public static byte m53constructorimpl(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ  reason: not valid java name */
    private static final byte m54decw2LRezQ(byte b5) {
        return m53constructorimpl((byte) (b5 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m55div7apg3OU(byte b5, byte b6) {
        return b.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m56divVKZWuLQ(byte b5, long j4) {
        return f.a(ULong.m209constructorimpl(b5 & 255), j4);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m57divWZ4Q5Ns(byte b5, int i4) {
        return b.a(UInt.m130constructorimpl(b5 & 255), i4);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m58divxj2QHRw(byte b5, short s4) {
        return b.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m59equalsimpl(byte b5, Object obj) {
        return (obj instanceof UByte) && b5 == ((UByte) obj).m103unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m60equalsimpl0(byte b5, byte b6) {
        return b5 == b6;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m61floorDiv7apg3OU(byte b5, byte b6) {
        return b.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m62floorDivVKZWuLQ(byte b5, long j4) {
        return f.a(ULong.m209constructorimpl(b5 & 255), j4);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m63floorDivWZ4Q5Ns(byte b5, int i4) {
        return b.a(UInt.m130constructorimpl(b5 & 255), i4);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m64floorDivxj2QHRw(byte b5, short s4) {
        return b.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m65hashCodeimpl(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ  reason: not valid java name */
    private static final byte m66incw2LRezQ(byte b5) {
        return m53constructorimpl((byte) (b5 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ  reason: not valid java name */
    private static final byte m67invw2LRezQ(byte b5) {
        return m53constructorimpl((byte) (b5 ^ (-1)));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m68minus7apg3OU(byte b5, byte b6) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) - UInt.m130constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m69minusVKZWuLQ(byte b5, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(b5 & 255) - j4);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m70minusWZ4Q5Ns(byte b5, int i4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) - i4);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m71minusxj2QHRw(byte b5, short s4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) - UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m72mod7apg3OU(byte b5, byte b6) {
        return m53constructorimpl((byte) c.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(b6 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m73modVKZWuLQ(byte b5, long j4) {
        return e.a(ULong.m209constructorimpl(b5 & 255), j4);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m74modWZ4Q5Ns(byte b5, int i4) {
        return c.a(UInt.m130constructorimpl(b5 & 255), i4);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m75modxj2QHRw(byte b5, short s4) {
        return UShort.m316constructorimpl((short) c.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(s4 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU  reason: not valid java name */
    private static final byte m76or7apg3OU(byte b5, byte b6) {
        return m53constructorimpl((byte) (b5 | b6));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m77plus7apg3OU(byte b5, byte b6) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) + UInt.m130constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m78plusVKZWuLQ(byte b5, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(b5 & 255) + j4);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m79plusWZ4Q5Ns(byte b5, int i4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) + i4);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m80plusxj2QHRw(byte b5, short s4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) + UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU  reason: not valid java name */
    private static final UIntRange m81rangeTo7apg3OU(byte b5, byte b6) {
        return new UIntRange(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(b6 & 255), null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-7apg3OU  reason: not valid java name */
    private static final UIntRange m82rangeUntil7apg3OU(byte b5, byte b6) {
        return URangesKt.m1298untilJ1ME1BU(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m83rem7apg3OU(byte b5, byte b6) {
        return c.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m84remVKZWuLQ(byte b5, long j4) {
        return e.a(ULong.m209constructorimpl(b5 & 255), j4);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m85remWZ4Q5Ns(byte b5, int i4) {
        return c.a(UInt.m130constructorimpl(b5 & 255), i4);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m86remxj2QHRw(byte b5, short s4) {
        return c.a(UInt.m130constructorimpl(b5 & 255), UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m87times7apg3OU(byte b5, byte b6) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) * UInt.m130constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m88timesVKZWuLQ(byte b5, long j4) {
        return ULong.m209constructorimpl(ULong.m209constructorimpl(b5 & 255) * j4);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m89timesWZ4Q5Ns(byte b5, int i4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) * i4);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m90timesxj2QHRw(byte b5, short s4) {
        return UInt.m130constructorimpl(UInt.m130constructorimpl(b5 & 255) * UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m91toByteimpl(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m92toDoubleimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m93toFloatimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m94toIntimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m95toLongimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m96toShortimpl(byte b5) {
        return (short) (b5 & Http2CodecUtil.MAX_UNSIGNED_BYTE);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m97toStringimpl(byte b5) {
        return String.valueOf(b5 & 255);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m98toUBytew2LRezQ(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m99toUIntpVg5ArA(byte b5) {
        return UInt.m130constructorimpl(b5 & 255);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m100toULongsVKNKU(byte b5) {
        return ULong.m209constructorimpl(b5 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m101toUShortMh2AYeg(byte b5) {
        return UShort.m316constructorimpl((short) (b5 & Http2CodecUtil.MAX_UNSIGNED_BYTE));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU  reason: not valid java name */
    private static final byte m102xor7apg3OU(byte b5, byte b6) {
        return m53constructorimpl((byte) (b5 ^ b6));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(m103unboximpl() & 255, uByte.m103unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m59equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m65hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m97toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ byte m103unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static int m49compareTo7apg3OU(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255);
    }
}
