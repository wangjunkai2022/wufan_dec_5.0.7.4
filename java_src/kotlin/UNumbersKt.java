package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
/* compiled from: UNumbers.kt */
@JvmName(name = "UNumbersKt")
/* loaded from: classes6.dex */
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-7apg3OU  reason: not valid java name */
    private static final int m281countLeadingZeroBits7apg3OU(byte b5) {
        return Integer.numberOfLeadingZeros(b5 & 255) - 24;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-VKZWuLQ  reason: not valid java name */
    private static final int m282countLeadingZeroBitsVKZWuLQ(long j4) {
        return Long.numberOfLeadingZeros(j4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-WZ4Q5Ns  reason: not valid java name */
    private static final int m283countLeadingZeroBitsWZ4Q5Ns(int i4) {
        return Integer.numberOfLeadingZeros(i4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-xj2QHRw  reason: not valid java name */
    private static final int m284countLeadingZeroBitsxj2QHRw(short s4) {
        return Integer.numberOfLeadingZeros(s4 & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-7apg3OU  reason: not valid java name */
    private static final int m285countOneBits7apg3OU(byte b5) {
        return Integer.bitCount(UInt.m130constructorimpl(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-VKZWuLQ  reason: not valid java name */
    private static final int m286countOneBitsVKZWuLQ(long j4) {
        return Long.bitCount(j4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-WZ4Q5Ns  reason: not valid java name */
    private static final int m287countOneBitsWZ4Q5Ns(int i4) {
        return Integer.bitCount(i4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-xj2QHRw  reason: not valid java name */
    private static final int m288countOneBitsxj2QHRw(short s4) {
        return Integer.bitCount(UInt.m130constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-7apg3OU  reason: not valid java name */
    private static final int m289countTrailingZeroBits7apg3OU(byte b5) {
        return Integer.numberOfTrailingZeros(b5 | 256);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-VKZWuLQ  reason: not valid java name */
    private static final int m290countTrailingZeroBitsVKZWuLQ(long j4) {
        return Long.numberOfTrailingZeros(j4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-WZ4Q5Ns  reason: not valid java name */
    private static final int m291countTrailingZeroBitsWZ4Q5Ns(int i4) {
        return Integer.numberOfTrailingZeros(i4);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-xj2QHRw  reason: not valid java name */
    private static final int m292countTrailingZeroBitsxj2QHRw(short s4) {
        return Integer.numberOfTrailingZeros(s4 | 65536);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-JSWoG40  reason: not valid java name */
    private static final long m293rotateLeftJSWoG40(long j4, int i4) {
        return ULong.m209constructorimpl(Long.rotateLeft(j4, i4));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-LxnNnR4  reason: not valid java name */
    private static final byte m294rotateLeftLxnNnR4(byte b5, int i4) {
        return UByte.m53constructorimpl(NumbersKt__NumbersKt.rotateLeft(b5, i4));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-V7xB4Y4  reason: not valid java name */
    private static final int m295rotateLeftV7xB4Y4(int i4, int i5) {
        return UInt.m130constructorimpl(Integer.rotateLeft(i4, i5));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-olVBNx4  reason: not valid java name */
    private static final short m296rotateLeftolVBNx4(short s4, int i4) {
        return UShort.m316constructorimpl(NumbersKt__NumbersKt.rotateLeft(s4, i4));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-JSWoG40  reason: not valid java name */
    private static final long m297rotateRightJSWoG40(long j4, int i4) {
        return ULong.m209constructorimpl(Long.rotateRight(j4, i4));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-LxnNnR4  reason: not valid java name */
    private static final byte m298rotateRightLxnNnR4(byte b5, int i4) {
        return UByte.m53constructorimpl(NumbersKt__NumbersKt.rotateRight(b5, i4));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-V7xB4Y4  reason: not valid java name */
    private static final int m299rotateRightV7xB4Y4(int i4, int i5) {
        return UInt.m130constructorimpl(Integer.rotateRight(i4, i5));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-olVBNx4  reason: not valid java name */
    private static final short m300rotateRightolVBNx4(short s4, int i4) {
        return UShort.m316constructorimpl(NumbersKt__NumbersKt.rotateRight(s4, i4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-7apg3OU  reason: not valid java name */
    private static final byte m301takeHighestOneBit7apg3OU(byte b5) {
        return UByte.m53constructorimpl((byte) Integer.highestOneBit(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-VKZWuLQ  reason: not valid java name */
    private static final long m302takeHighestOneBitVKZWuLQ(long j4) {
        return ULong.m209constructorimpl(Long.highestOneBit(j4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-WZ4Q5Ns  reason: not valid java name */
    private static final int m303takeHighestOneBitWZ4Q5Ns(int i4) {
        return UInt.m130constructorimpl(Integer.highestOneBit(i4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-xj2QHRw  reason: not valid java name */
    private static final short m304takeHighestOneBitxj2QHRw(short s4) {
        return UShort.m316constructorimpl((short) Integer.highestOneBit(s4 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-7apg3OU  reason: not valid java name */
    private static final byte m305takeLowestOneBit7apg3OU(byte b5) {
        return UByte.m53constructorimpl((byte) Integer.lowestOneBit(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-VKZWuLQ  reason: not valid java name */
    private static final long m306takeLowestOneBitVKZWuLQ(long j4) {
        return ULong.m209constructorimpl(Long.lowestOneBit(j4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-WZ4Q5Ns  reason: not valid java name */
    private static final int m307takeLowestOneBitWZ4Q5Ns(int i4) {
        return UInt.m130constructorimpl(Integer.lowestOneBit(i4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-xj2QHRw  reason: not valid java name */
    private static final short m308takeLowestOneBitxj2QHRw(short s4) {
        return UShort.m316constructorimpl((short) Integer.lowestOneBit(s4 & UShort.MAX_VALUE));
    }
}
