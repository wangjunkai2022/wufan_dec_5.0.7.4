package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;
/* loaded from: classes3.dex */
public final class CodaBarReader extends OneDReader {
    private static final int minCharacterLength = 6;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCDTN";
    static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    static final int[] CHARACTER_ENCODINGS = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14, 26, 41};
    private static final char[] STARTEND_ENCODING = {'E', '*', 'A', 'B', 'C', 'D', 'T', 'N'};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean arrayContains(char[] cArr, char c5) {
        if (cArr != null) {
            for (char c6 : cArr) {
                if (c6 == c5) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] findAsteriskPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[7];
        int i4 = nextSet;
        boolean z4 = false;
        int i5 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) ^ z4) {
                iArr[i5] = iArr[i5] + 1;
            } else {
                if (i5 == 6) {
                    try {
                        if (arrayContains(STARTEND_ENCODING, toNarrowWidePattern(iArr)) && bitArray.isRange(Math.max(0, i4 - ((nextSet - i4) / 2)), i4, false)) {
                            return new int[]{i4, nextSet};
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    i4 += iArr[0] + iArr[1];
                    System.arraycopy(iArr, 2, iArr, 0, 5);
                    iArr[5] = 0;
                    iArr[6] = 0;
                    i5--;
                } else {
                    i5++;
                }
                iArr[i5] = 1;
                z4 = !z4;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char toNarrowWidePattern(int[] iArr) {
        int length = iArr.length;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (iArr[i6] < i4) {
                i4 = iArr[i6];
            }
            if (iArr[i6] > i5) {
                i5 = iArr[i6];
            }
        }
        do {
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (iArr[i9] > i5) {
                    i8 |= 1 << ((length - 1) - i9);
                    i7++;
                }
            }
            if (i7 == 2 || i7 == 3) {
                int i10 = 0;
                while (true) {
                    int[] iArr2 = CHARACTER_ENCODINGS;
                    if (i10 >= iArr2.length) {
                        break;
                    } else if (iArr2[i10] == i8) {
                        return ALPHABET[i10];
                    } else {
                        i10++;
                    }
                }
            }
            i5--;
        } while (i5 > i4);
        return '!';
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i4, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i5;
        int[] findAsteriskPattern = findAsteriskPattern(bitArray);
        findAsteriskPattern[1] = 0;
        int nextSet = bitArray.getNextSet(findAsteriskPattern[1]);
        int size = bitArray.getSize();
        StringBuilder sb = new StringBuilder();
        int[] iArr = new int[7];
        while (true) {
            for (int i6 = 0; i6 < 7; i6++) {
                iArr[i6] = 0;
            }
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            char narrowWidePattern = toNarrowWidePattern(iArr);
            if (narrowWidePattern != '!') {
                sb.append(narrowWidePattern);
                int i7 = nextSet;
                for (int i8 = 0; i8 < 7; i8++) {
                    i7 += iArr[i8];
                }
                int nextSet2 = bitArray.getNextSet(i7);
                if (nextSet2 >= size) {
                    int i9 = 0;
                    for (int i10 = 0; i10 < 7; i10++) {
                        i9 += iArr[i10];
                    }
                    int i11 = (nextSet2 - nextSet) - i9;
                    if (nextSet2 != size && i11 / 2 < i9) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (sb.length() >= 2) {
                        char charAt = sb.charAt(0);
                        if (arrayContains(STARTEND_ENCODING, charAt)) {
                            int i12 = 1;
                            while (true) {
                                if (i12 >= sb.length()) {
                                    break;
                                }
                                if (sb.charAt(i12) == charAt && (i5 = i12 + 1) != sb.length()) {
                                    sb.delete(i5, sb.length() - 1);
                                    break;
                                }
                                i12++;
                            }
                            if (sb.length() > 6) {
                                sb.deleteCharAt(sb.length() - 1);
                                sb.deleteCharAt(0);
                                float f5 = i4;
                                return new Result(sb.toString(), null, new ResultPoint[]{new ResultPoint((findAsteriskPattern[1] + findAsteriskPattern[0]) / 2.0f, f5), new ResultPoint((nextSet2 + nextSet) / 2.0f, f5)}, BarcodeFormat.CODABAR);
                            }
                            throw NotFoundException.getNotFoundInstance();
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                nextSet = nextSet2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
