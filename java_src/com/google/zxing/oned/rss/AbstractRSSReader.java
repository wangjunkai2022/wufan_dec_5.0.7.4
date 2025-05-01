package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.oned.OneDReader;
/* loaded from: classes3.dex */
public abstract class AbstractRSSReader extends OneDReader {
    private static final int MAX_AVG_VARIANCE = 51;
    private static final float MAX_FINDER_PATTERN_RATIO = 0.89285713f;
    private static final int MAX_INDIVIDUAL_VARIANCE = 102;
    private static final float MIN_FINDER_PATTERN_RATIO = 0.7916667f;
    private final int[] dataCharacterCounters;
    private final int[] evenCounts;
    private final int[] oddCounts;
    private final int[] decodeFinderCounters = new int[4];
    private final float[] oddRoundingErrors = new float[4];
    private final float[] evenRoundingErrors = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractRSSReader() {
        int[] iArr = new int[8];
        this.dataCharacterCounters = iArr;
        this.oddCounts = new int[iArr.length / 2];
        this.evenCounts = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int count(int[] iArr) {
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void decrement(int[] iArr, float[] fArr) {
        int i4 = 0;
        float f5 = fArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            if (fArr[i5] < f5) {
                f5 = fArr[i5];
                i4 = i5;
            }
        }
        iArr[i4] = iArr[i4] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void increment(int[] iArr, float[] fArr) {
        int i4 = 0;
        float f5 = fArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            if (fArr[i5] > f5) {
                f5 = fArr[i5];
                i4 = i5;
            }
        }
        iArr[i4] = iArr[i4] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isFinderPattern(int[] iArr) {
        int i4;
        float f5 = (iArr[0] + iArr[1]) / ((iArr[2] + i4) + iArr[3]);
        if (f5 < MIN_FINDER_PATTERN_RATIO || f5 > MAX_FINDER_PATTERN_RATIO) {
            return false;
        }
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 : iArr) {
            if (i7 > i6) {
                i6 = i7;
            }
            if (i7 < i5) {
                i5 = i7;
            }
        }
        return i6 < i5 * 10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int parseFinderValue(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            if (OneDReader.patternMatchVariance(iArr, iArr2[i4], 102) < 51) {
                return i4;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] getDataCharacterCounters() {
        return this.dataCharacterCounters;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] getDecodeFinderCounters() {
        return this.decodeFinderCounters;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] getEvenCounts() {
        return this.evenCounts;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float[] getEvenRoundingErrors() {
        return this.evenRoundingErrors;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] getOddCounts() {
        return this.oddCounts;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float[] getOddRoundingErrors() {
        return this.oddRoundingErrors;
    }
}
