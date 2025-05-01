package com.android.dx.util;

import io.netty.util.internal.StringUtil;
/* loaded from: classes.dex */
public final class Bits {
    private Bits() {
    }

    public static boolean anyInRange(int[] iArr, int i4, int i5) {
        int findFirst = findFirst(iArr, i4);
        return findFirst >= 0 && findFirst < i5;
    }

    public static int bitCount(int[] iArr) {
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += Integer.bitCount(i5);
        }
        return i4;
    }

    public static void clear(int[] iArr, int i4) {
        int i5 = i4 >> 5;
        iArr[i5] = ((1 << (i4 & 31)) ^ (-1)) & iArr[i5];
    }

    public static int findFirst(int[] iArr, int i4) {
        int findFirst;
        int length = iArr.length;
        int i5 = i4 & 31;
        for (int i6 = i4 >> 5; i6 < length; i6++) {
            int i7 = iArr[i6];
            if (i7 != 0 && (findFirst = findFirst(i7, i5)) >= 0) {
                return (i6 << 5) + findFirst;
            }
            i5 = 0;
        }
        return -1;
    }

    public static boolean get(int[] iArr, int i4) {
        return (iArr[i4 >> 5] & (1 << (i4 & 31))) != 0;
    }

    public static int getMax(int[] iArr) {
        return iArr.length * 32;
    }

    public static boolean isEmpty(int[] iArr) {
        for (int i4 : iArr) {
            if (i4 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] makeBitSet(int i4) {
        return new int[(i4 + 31) >> 5];
    }

    public static void or(int[] iArr, int[] iArr2) {
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            iArr[i4] = iArr[i4] | iArr2[i4];
        }
    }

    public static void set(int[] iArr, int i4, boolean z4) {
        int i5 = i4 >> 5;
        int i6 = 1 << (i4 & 31);
        if (z4) {
            iArr[i5] = i6 | iArr[i5];
            return;
        }
        iArr[i5] = (i6 ^ (-1)) & iArr[i5];
    }

    public static String toHuman(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int length = iArr.length * 32;
        boolean z4 = false;
        for (int i4 = 0; i4 < length; i4++) {
            if (get(iArr, i4)) {
                if (z4) {
                    sb.append(StringUtil.COMMA);
                }
                sb.append(i4);
                z4 = true;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void set(int[] iArr, int i4) {
        int i5 = i4 >> 5;
        iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
    }

    public static int findFirst(int i4, int i5) {
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4 & (((1 << i5) - 1) ^ (-1)));
        if (numberOfTrailingZeros == 32) {
            return -1;
        }
        return numberOfTrailingZeros;
    }
}
