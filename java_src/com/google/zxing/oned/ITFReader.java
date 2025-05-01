package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;
/* loaded from: classes3.dex */
public final class ITFReader extends OneDReader {
    private static final int MAX_AVG_VARIANCE = 107;
    private static final int MAX_INDIVIDUAL_VARIANCE = 204;
    private static final int N = 1;
    private static final int W = 3;
    private int narrowLineWidth = -1;
    private static final int[] DEFAULT_ALLOWED_LENGTHS = {44, 24, 20, 18, 16, 14, 12, 10, 8, 6};
    private static final int[] START_PATTERN = {1, 1, 1, 1};
    private static final int[] END_PATTERN_REVERSED = {1, 1, 3};
    static final int[][] PATTERNS = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    private static int decodeDigit(int[] iArr) throws NotFoundException {
        int length = PATTERNS.length;
        int i4 = 107;
        int i5 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            int patternMatchVariance = OneDReader.patternMatchVariance(iArr, PATTERNS[i6], 204);
            if (patternMatchVariance < i4) {
                i5 = i6;
                i4 = patternMatchVariance;
            }
        }
        if (i5 >= 0) {
            return i5;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static void decodeMiddle(BitArray bitArray, int i4, int i5, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i4 < i5) {
            OneDReader.recordPattern(bitArray, i4, iArr);
            for (int i6 = 0; i6 < 5; i6++) {
                int i7 = i6 << 1;
                iArr2[i6] = iArr[i7];
                iArr3[i6] = iArr[i7 + 1];
            }
            sb.append((char) (decodeDigit(iArr2) + 48));
            sb.append((char) (decodeDigit(iArr3) + 48));
            for (int i8 = 0; i8 < 10; i8++) {
                i4 += iArr[i8];
            }
        }
    }

    private static int[] findGuardPattern(BitArray bitArray, int i4, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i5 = i4;
        boolean z4 = false;
        int i6 = 0;
        while (i4 < size) {
            if (bitArray.get(i4) ^ z4) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                int i7 = length - 1;
                if (i6 != i7) {
                    i6++;
                } else if (OneDReader.patternMatchVariance(iArr2, iArr, 204) < 107) {
                    return new int[]{i5, i4};
                } else {
                    i5 += iArr2[0] + iArr2[1];
                    int i8 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i7] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z4 = !z4;
            }
            i4++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int skipWhiteSpace(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void validateQuietZone(com.google.zxing.common.BitArray r3, int r4) throws com.google.zxing.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.narrowLineWidth
            int r0 = r0 * 10
            int r4 = r4 + (-1)
        L6:
            if (r0 <= 0) goto L16
            if (r4 < 0) goto L16
            boolean r1 = r3.get(r4)
            if (r1 == 0) goto L11
            goto L16
        L11:
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto L6
        L16:
            if (r0 != 0) goto L19
            return
        L19:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.getNotFoundInstance()
            goto L1f
        L1e:
            throw r3
        L1f:
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.ITFReader.validateQuietZone(com.google.zxing.common.BitArray, int):void");
    }

    int[] decodeEnd(BitArray bitArray) throws NotFoundException {
        bitArray.reverse();
        try {
            int[] findGuardPattern = findGuardPattern(bitArray, skipWhiteSpace(bitArray), END_PATTERN_REVERSED);
            validateQuietZone(bitArray, findGuardPattern[0]);
            int i4 = findGuardPattern[0];
            findGuardPattern[0] = bitArray.getSize() - findGuardPattern[1];
            findGuardPattern[1] = bitArray.getSize() - i4;
            return findGuardPattern;
        } finally {
            bitArray.reverse();
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i4, BitArray bitArray, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
        boolean z4;
        int[] decodeStart = decodeStart(bitArray);
        int[] decodeEnd = decodeEnd(bitArray);
        StringBuilder sb = new StringBuilder(20);
        decodeMiddle(bitArray, decodeStart[1], decodeEnd[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = DEFAULT_ALLOWED_LENGTHS;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                z4 = false;
                break;
            } else if (length == iArr[i5]) {
                z4 = true;
                break;
            } else {
                i5++;
            }
        }
        if (z4) {
            float f5 = i4;
            return new Result(sb2, null, new ResultPoint[]{new ResultPoint(decodeStart[1], f5), new ResultPoint(decodeEnd[0], f5)}, BarcodeFormat.ITF);
        }
        throw FormatException.getFormatInstance();
    }

    int[] decodeStart(BitArray bitArray) throws NotFoundException {
        int[] findGuardPattern = findGuardPattern(bitArray, skipWhiteSpace(bitArray), START_PATTERN);
        this.narrowLineWidth = (findGuardPattern[1] - findGuardPattern[0]) >> 2;
        validateQuietZone(bitArray, findGuardPattern[0]);
        return findGuardPattern;
    }
}
