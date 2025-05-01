package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.UByteArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: UArraySorting.kt */
/* loaded from: classes6.dex */
public final class UArraySortingKt {
    /* JADX WARN: Incorrect condition in loop: B:5:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int m490partitionnroSd4(long[] r6, int r7, int r8) {
        /*
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = kotlin.ULongArray.m269getsVKNKU(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = kotlin.ULongArray.m269getsVKNKU(r6, r7)
            int r2 = kotlin.d.a(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = kotlin.ULongArray.m269getsVKNKU(r6, r8)
            int r2 = kotlin.d.a(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = kotlin.ULongArray.m269getsVKNKU(r6, r7)
            long r4 = kotlin.ULongArray.m269getsVKNKU(r6, r8)
            kotlin.ULongArray.m274setk8EXiF4(r6, r7, r4)
            kotlin.ULongArray.m274setk8EXiF4(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.UArraySortingKt.m490partitionnroSd4(long[], int, int):int");
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c  reason: not valid java name */
    private static final int m491partition4UcCI2c(byte[] bArr, int i4, int i5) {
        int i6;
        byte m111getw2LRezQ = UByteArray.m111getw2LRezQ(bArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (true) {
                i6 = m111getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m111getw2LRezQ(bArr, i4) & 255, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (Intrinsics.compare(UByteArray.m111getw2LRezQ(bArr, i5) & 255, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                byte m111getw2LRezQ2 = UByteArray.m111getw2LRezQ(bArr, i4);
                UByteArray.m116setVurrAj0(bArr, i4, UByteArray.m111getw2LRezQ(bArr, i5));
                UByteArray.m116setVurrAj0(bArr, i5, m111getw2LRezQ2);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o  reason: not valid java name */
    private static final int m492partitionAa5vz7o(short[] sArr, int i4, int i5) {
        int i6;
        short m374getMh2AYeg = UShortArray.m374getMh2AYeg(sArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (true) {
                int m374getMh2AYeg2 = UShortArray.m374getMh2AYeg(sArr, i4) & UShort.MAX_VALUE;
                i6 = m374getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m374getMh2AYeg2, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (Intrinsics.compare(UShortArray.m374getMh2AYeg(sArr, i5) & UShort.MAX_VALUE, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                short m374getMh2AYeg3 = UShortArray.m374getMh2AYeg(sArr, i4);
                UShortArray.m379set01HTLdE(sArr, i4, UShortArray.m374getMh2AYeg(sArr, i5));
                UShortArray.m379set01HTLdE(sArr, i5, m374getMh2AYeg3);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int m493partitionoBK06Vg(int[] r3, int r4, int r5) {
        /*
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = kotlin.UIntArray.m190getpVg5ArA(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = kotlin.UIntArray.m190getpVg5ArA(r3, r4)
            int r1 = kotlin.a.a(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = kotlin.UIntArray.m190getpVg5ArA(r3, r5)
            int r1 = kotlin.a.a(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = kotlin.UIntArray.m190getpVg5ArA(r3, r4)
            int r2 = kotlin.UIntArray.m190getpVg5ArA(r3, r5)
            kotlin.UIntArray.m195setVXSXFK8(r3, r4, r2)
            kotlin.UIntArray.m195setVXSXFK8(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.UArraySortingKt.m493partitionoBK06Vg(int[], int, int):int");
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4  reason: not valid java name */
    private static final void m494quickSortnroSd4(long[] jArr, int i4, int i5) {
        int m490partitionnroSd4 = m490partitionnroSd4(jArr, i4, i5);
        int i6 = m490partitionnroSd4 - 1;
        if (i4 < i6) {
            m494quickSortnroSd4(jArr, i4, i6);
        }
        if (m490partitionnroSd4 < i5) {
            m494quickSortnroSd4(jArr, m490partitionnroSd4, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c  reason: not valid java name */
    private static final void m495quickSort4UcCI2c(byte[] bArr, int i4, int i5) {
        int m491partition4UcCI2c = m491partition4UcCI2c(bArr, i4, i5);
        int i6 = m491partition4UcCI2c - 1;
        if (i4 < i6) {
            m495quickSort4UcCI2c(bArr, i4, i6);
        }
        if (m491partition4UcCI2c < i5) {
            m495quickSort4UcCI2c(bArr, m491partition4UcCI2c, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o  reason: not valid java name */
    private static final void m496quickSortAa5vz7o(short[] sArr, int i4, int i5) {
        int m492partitionAa5vz7o = m492partitionAa5vz7o(sArr, i4, i5);
        int i6 = m492partitionAa5vz7o - 1;
        if (i4 < i6) {
            m496quickSortAa5vz7o(sArr, i4, i6);
        }
        if (m492partitionAa5vz7o < i5) {
            m496quickSortAa5vz7o(sArr, m492partitionAa5vz7o, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg  reason: not valid java name */
    private static final void m497quickSortoBK06Vg(int[] iArr, int i4, int i5) {
        int m493partitionoBK06Vg = m493partitionoBK06Vg(iArr, i4, i5);
        int i6 = m493partitionoBK06Vg - 1;
        if (i4 < i6) {
            m497quickSortoBK06Vg(iArr, i4, i6);
        }
        if (m493partitionoBK06Vg < i5) {
            m497quickSortoBK06Vg(iArr, m493partitionoBK06Vg, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4  reason: not valid java name */
    public static final void m498sortArraynroSd4(@NotNull long[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m494quickSortnroSd4(array, i4, i5 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c  reason: not valid java name */
    public static final void m499sortArray4UcCI2c(@NotNull byte[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m495quickSort4UcCI2c(array, i4, i5 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o  reason: not valid java name */
    public static final void m500sortArrayAa5vz7o(@NotNull short[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m496quickSortAa5vz7o(array, i4, i5 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg  reason: not valid java name */
    public static final void m501sortArrayoBK06Vg(@NotNull int[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m497quickSortoBK06Vg(array, i4, i5 - 1);
    }
}
