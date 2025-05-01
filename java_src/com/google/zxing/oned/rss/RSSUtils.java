package com.google.zxing.oned.rss;
/* loaded from: classes3.dex */
public final class RSSUtils {
    private RSSUtils() {
    }

    private static int combins(int i4, int i5) {
        int i6 = i4 - i5;
        if (i6 > i5) {
            i6 = i5;
            i5 = i6;
        }
        int i7 = 1;
        int i8 = 1;
        while (i4 > i5) {
            i7 *= i4;
            if (i8 <= i6) {
                i7 /= i8;
                i8++;
            }
            i4--;
        }
        while (i8 <= i6) {
            i7 /= i8;
            i8++;
        }
        return i7;
    }

    static int[] elements(int[] iArr, int i4, int i5) {
        int[] iArr2 = new int[iArr.length + 2];
        int i6 = i5 << 1;
        iArr2[0] = 1;
        int i7 = 10;
        int i8 = 1;
        for (int i9 = 1; i9 < i6 - 2; i9 += 2) {
            int i10 = i9 - 1;
            iArr2[i9] = iArr[i10] - iArr2[i10];
            int i11 = i9 + 1;
            iArr2[i11] = iArr[i9] - iArr2[i9];
            i8 += iArr2[i9] + iArr2[i11];
            if (iArr2[i9] < i7) {
                i7 = iArr2[i9];
            }
        }
        int i12 = i6 - 1;
        iArr2[i12] = i4 - i8;
        if (iArr2[i12] < i7) {
            i7 = iArr2[i12];
        }
        if (i7 > 1) {
            for (int i13 = 0; i13 < i6; i13 += 2) {
                int i14 = i7 - 1;
                iArr2[i13] = iArr2[i13] + i14;
                int i15 = i13 + 1;
                iArr2[i15] = iArr2[i15] - i14;
            }
        }
        return iArr2;
    }

    public static int getRSSvalue(int[] iArr, int i4, boolean z4) {
        int[] iArr2 = iArr;
        int length = iArr2.length;
        int i5 = 0;
        for (int i6 : iArr2) {
            i5 += i6;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = length - 1;
            if (i7 >= i10) {
                return i8;
            }
            int i11 = 1 << i7;
            i9 |= i11;
            int i12 = 1;
            while (i12 < iArr2[i7]) {
                int i13 = i5 - i12;
                int i14 = length - i7;
                int i15 = i14 - 2;
                int combins = combins(i13 - 1, i15);
                if (z4 && i9 == 0) {
                    int i16 = i14 - 1;
                    if (i13 - i16 >= i16) {
                        combins -= combins(i13 - i14, i15);
                    }
                }
                if (i14 - 1 > 1) {
                    int i17 = 0;
                    for (int i18 = i13 - i15; i18 > i4; i18--) {
                        i17 += combins((i13 - i18) - 1, i14 - 3);
                    }
                    combins -= i17 * (i10 - i7);
                } else if (i13 > i4) {
                    combins--;
                }
                i8 += combins;
                i12++;
                i9 &= i11 ^ (-1);
                iArr2 = iArr;
            }
            i5 -= i12;
            i7++;
            iArr2 = iArr;
        }
    }

    static int[] getRSSwidths(int i4, int i5, int i6, int i7, boolean z4) {
        int i8;
        int combins;
        int i9 = i6;
        int[] iArr = new int[i9];
        int i10 = i4;
        int i11 = i5;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i9 - 1;
            if (i12 < i14) {
                int i15 = 1 << i12;
                i13 |= i15;
                int i16 = 1;
                while (true) {
                    i8 = i11 - i16;
                    int i17 = i9 - i12;
                    int i18 = i17 - 2;
                    combins = combins(i8 - 1, i18);
                    if (z4 && i13 == 0) {
                        int i19 = i17 - 1;
                        if (i8 - i19 >= i19) {
                            combins -= combins(i8 - i17, i18);
                        }
                    }
                    if (i17 - 1 > 1) {
                        int i20 = 0;
                        for (int i21 = i8 - i18; i21 > i7; i21--) {
                            i20 += combins((i8 - i21) - 1, i17 - 3);
                        }
                        combins -= i20 * (i14 - i12);
                    } else if (i8 > i7) {
                        combins--;
                    }
                    i10 -= combins;
                    if (i10 < 0) {
                        break;
                    }
                    i16++;
                    i13 &= i15 ^ (-1);
                    i9 = i6;
                }
                i10 += combins;
                iArr[i12] = i16;
                i12++;
                i9 = i6;
                i11 = i8;
            } else {
                iArr[i12] = i11;
                return iArr;
            }
        }
    }
}
