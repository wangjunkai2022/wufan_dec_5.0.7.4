package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NumbersJVM.kt */
/* loaded from: classes6.dex */
class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countLeadingZeroBits(int i4) {
        return Integer.numberOfLeadingZeros(i4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countOneBits(int i4) {
        return Integer.bitCount(i4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countTrailingZeroBits(int i4) {
        return Integer.numberOfTrailingZeros(i4);
    }

    @SinceKotlin(version = j1.b.f69563b)
    @InlineOnly
    private static final double fromBits(DoubleCompanionObject doubleCompanionObject, long j4) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Double.longBitsToDouble(j4);
    }

    @InlineOnly
    private static final boolean isFinite(double d5) {
        return (Double.isInfinite(d5) || Double.isNaN(d5)) ? false : true;
    }

    @InlineOnly
    private static final boolean isInfinite(double d5) {
        return Double.isInfinite(d5);
    }

    @InlineOnly
    private static final boolean isNaN(double d5) {
        return Double.isNaN(d5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int rotateLeft(int i4, int i5) {
        return Integer.rotateLeft(i4, i5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int rotateRight(int i4, int i5) {
        return Integer.rotateRight(i4, i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int takeHighestOneBit(int i4) {
        return Integer.highestOneBit(i4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int takeLowestOneBit(int i4) {
        return Integer.lowestOneBit(i4);
    }

    @SinceKotlin(version = j1.b.f69563b)
    @InlineOnly
    private static final long toBits(double d5) {
        return Double.doubleToLongBits(d5);
    }

    @SinceKotlin(version = j1.b.f69563b)
    @InlineOnly
    private static final long toRawBits(double d5) {
        return Double.doubleToRawLongBits(d5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countLeadingZeroBits(long j4) {
        return Long.numberOfLeadingZeros(j4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countOneBits(long j4) {
        return Long.bitCount(j4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countTrailingZeroBits(long j4) {
        return Long.numberOfTrailingZeros(j4);
    }

    @SinceKotlin(version = j1.b.f69563b)
    @InlineOnly
    private static final float fromBits(FloatCompanionObject floatCompanionObject, int i4) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return Float.intBitsToFloat(i4);
    }

    @InlineOnly
    private static final boolean isFinite(float f5) {
        return (Float.isInfinite(f5) || Float.isNaN(f5)) ? false : true;
    }

    @InlineOnly
    private static final boolean isInfinite(float f5) {
        return Float.isInfinite(f5);
    }

    @InlineOnly
    private static final boolean isNaN(float f5) {
        return Float.isNaN(f5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long rotateLeft(long j4, int i4) {
        return Long.rotateLeft(j4, i4);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long rotateRight(long j4, int i4) {
        return Long.rotateRight(j4, i4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long takeHighestOneBit(long j4) {
        return Long.highestOneBit(j4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long takeLowestOneBit(long j4) {
        return Long.lowestOneBit(j4);
    }

    @SinceKotlin(version = j1.b.f69563b)
    @InlineOnly
    private static final int toBits(float f5) {
        return Float.floatToIntBits(f5);
    }

    @SinceKotlin(version = j1.b.f69563b)
    @InlineOnly
    private static final int toRawBits(float f5) {
        return Float.floatToRawIntBits(f5);
    }
}
