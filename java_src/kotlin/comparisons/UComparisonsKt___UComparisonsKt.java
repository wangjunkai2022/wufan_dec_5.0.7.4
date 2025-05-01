package kotlin.comparisons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UComparisons.kt */
/* loaded from: classes6.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-5PvTz6A  reason: not valid java name */
    public static final short m1238maxOf5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s5) >= 0 ? s4 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-J1ME1BU  reason: not valid java name */
    public static int m1239maxOfJ1ME1BU(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare >= 0 ? i4 : i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-Kr8caGY  reason: not valid java name */
    public static final byte m1240maxOfKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) >= 0 ? b5 : b6;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M  reason: not valid java name */
    public static final int m1241maxOfMd2H83M(int i4, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(other);
        for (int i5 = 0; i5 < m191getSizeimpl; i5++) {
            i4 = m1239maxOfJ1ME1BU(i4, UIntArray.m190getpVg5ArA(other, i5));
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM  reason: not valid java name */
    public static final long m1242maxOfR03FKyM(long j4, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(other);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            j4 = m1247maxOfeb3DHEI(j4, ULongArray.m269getsVKNKU(other, i4));
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ  reason: not valid java name */
    private static final short m1243maxOfVKSA0NQ(short s4, short s5, short s6) {
        return m1238maxOf5PvTz6A(s4, m1238maxOf5PvTz6A(s5, s6));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA  reason: not valid java name */
    private static final int m1244maxOfWZ9TVnA(int i4, int i5, int i6) {
        int m1239maxOfJ1ME1BU;
        int m1239maxOfJ1ME1BU2;
        m1239maxOfJ1ME1BU = m1239maxOfJ1ME1BU(i5, i6);
        m1239maxOfJ1ME1BU2 = m1239maxOfJ1ME1BU(i4, m1239maxOfJ1ME1BU);
        return m1239maxOfJ1ME1BU2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8  reason: not valid java name */
    public static final byte m1245maxOfWr6uiD8(byte b5, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(other);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            b5 = m1240maxOfKr8caGY(b5, UByteArray.m111getw2LRezQ(other, i4));
        }
        return b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-b33U2AM  reason: not valid java name */
    private static final byte m1246maxOfb33U2AM(byte b5, byte b6, byte b7) {
        return m1240maxOfKr8caGY(b5, m1240maxOfKr8caGY(b6, b7));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-eb3DHEI  reason: not valid java name */
    public static long m1247maxOfeb3DHEI(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare >= 0 ? j4 : j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-sambcqE  reason: not valid java name */
    private static final long m1248maxOfsambcqE(long j4, long j5, long j6) {
        long m1247maxOfeb3DHEI;
        long m1247maxOfeb3DHEI2;
        m1247maxOfeb3DHEI = m1247maxOfeb3DHEI(j5, j6);
        m1247maxOfeb3DHEI2 = m1247maxOfeb3DHEI(j4, m1247maxOfeb3DHEI);
        return m1247maxOfeb3DHEI2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4  reason: not valid java name */
    public static final short m1249maxOft1qELG4(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(other);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            s4 = m1238maxOf5PvTz6A(s4, UShortArray.m374getMh2AYeg(other, i4));
        }
        return s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-5PvTz6A  reason: not valid java name */
    public static final short m1250minOf5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & UShort.MAX_VALUE, 65535 & s5) <= 0 ? s4 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-J1ME1BU  reason: not valid java name */
    public static int m1251minOfJ1ME1BU(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i4 : i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-Kr8caGY  reason: not valid java name */
    public static final byte m1252minOfKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) <= 0 ? b5 : b6;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M  reason: not valid java name */
    public static final int m1253minOfMd2H83M(int i4, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m191getSizeimpl = UIntArray.m191getSizeimpl(other);
        for (int i5 = 0; i5 < m191getSizeimpl; i5++) {
            i4 = m1251minOfJ1ME1BU(i4, UIntArray.m190getpVg5ArA(other, i5));
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM  reason: not valid java name */
    public static final long m1254minOfR03FKyM(long j4, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m270getSizeimpl = ULongArray.m270getSizeimpl(other);
        for (int i4 = 0; i4 < m270getSizeimpl; i4++) {
            j4 = m1259minOfeb3DHEI(j4, ULongArray.m269getsVKNKU(other, i4));
        }
        return j4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ  reason: not valid java name */
    private static final short m1255minOfVKSA0NQ(short s4, short s5, short s6) {
        return m1250minOf5PvTz6A(s4, m1250minOf5PvTz6A(s5, s6));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA  reason: not valid java name */
    private static final int m1256minOfWZ9TVnA(int i4, int i5, int i6) {
        int m1251minOfJ1ME1BU;
        int m1251minOfJ1ME1BU2;
        m1251minOfJ1ME1BU = m1251minOfJ1ME1BU(i5, i6);
        m1251minOfJ1ME1BU2 = m1251minOfJ1ME1BU(i4, m1251minOfJ1ME1BU);
        return m1251minOfJ1ME1BU2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8  reason: not valid java name */
    public static final byte m1257minOfWr6uiD8(byte b5, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m112getSizeimpl = UByteArray.m112getSizeimpl(other);
        for (int i4 = 0; i4 < m112getSizeimpl; i4++) {
            b5 = m1252minOfKr8caGY(b5, UByteArray.m111getw2LRezQ(other, i4));
        }
        return b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-b33U2AM  reason: not valid java name */
    private static final byte m1258minOfb33U2AM(byte b5, byte b6, byte b7) {
        return m1252minOfKr8caGY(b5, m1252minOfKr8caGY(b6, b7));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-eb3DHEI  reason: not valid java name */
    public static long m1259minOfeb3DHEI(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare <= 0 ? j4 : j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-sambcqE  reason: not valid java name */
    private static final long m1260minOfsambcqE(long j4, long j5, long j6) {
        long m1259minOfeb3DHEI;
        long m1259minOfeb3DHEI2;
        m1259minOfeb3DHEI = m1259minOfeb3DHEI(j5, j6);
        m1259minOfeb3DHEI2 = m1259minOfeb3DHEI(j4, m1259minOfeb3DHEI);
        return m1259minOfeb3DHEI2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4  reason: not valid java name */
    public static final short m1261minOft1qELG4(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m375getSizeimpl = UShortArray.m375getSizeimpl(other);
        for (int i4 = 0; i4 < m375getSizeimpl; i4++) {
            s4 = m1250minOf5PvTz6A(s4, UShortArray.m374getMh2AYeg(other, i4));
        }
        return s4;
    }
}
