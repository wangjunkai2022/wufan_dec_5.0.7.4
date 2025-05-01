package kotlin.collections;

import java.util.Collection;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: _UCollections.kt */
/* loaded from: classes6.dex */
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i4 = 0;
        for (UByte uByte : iterable) {
            i4 = UInt.m130constructorimpl(i4 + UInt.m130constructorimpl(uByte.m103unboximpl() & 255));
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i4 = 0;
        for (UInt uInt : iterable) {
            i4 = UInt.m130constructorimpl(i4 + uInt.m182unboximpl());
        }
        return i4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        long j4 = 0;
        for (ULong uLong : iterable) {
            j4 = ULong.m209constructorimpl(j4 + uLong.m261unboximpl());
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i4 = 0;
        for (UShort uShort : iterable) {
            i4 = UInt.m130constructorimpl(i4 + UInt.m130constructorimpl(uShort.m366unboximpl() & UShort.MAX_VALUE));
        }
        return i4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] m105constructorimpl = UByteArray.m105constructorimpl(collection.size());
        int i4 = 0;
        for (UByte uByte : collection) {
            UByteArray.m116setVurrAj0(m105constructorimpl, i4, uByte.m103unboximpl());
            i4++;
        }
        return m105constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] m184constructorimpl = UIntArray.m184constructorimpl(collection.size());
        int i4 = 0;
        for (UInt uInt : collection) {
            UIntArray.m195setVXSXFK8(m184constructorimpl, i4, uInt.m182unboximpl());
            i4++;
        }
        return m184constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] m263constructorimpl = ULongArray.m263constructorimpl(collection.size());
        int i4 = 0;
        for (ULong uLong : collection) {
            ULongArray.m274setk8EXiF4(m263constructorimpl, i4, uLong.m261unboximpl());
            i4++;
        }
        return m263constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] m368constructorimpl = UShortArray.m368constructorimpl(collection.size());
        int i4 = 0;
        for (UShort uShort : collection) {
            UShortArray.m379set01HTLdE(m368constructorimpl, i4, uShort.m366unboximpl());
            i4++;
        }
        return m368constructorimpl;
    }
}
