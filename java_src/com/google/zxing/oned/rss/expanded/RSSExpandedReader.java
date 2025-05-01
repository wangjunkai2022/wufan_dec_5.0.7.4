package com.google.zxing.oned.rss.expanded;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int[][] FINDER_PATTERN_SEQUENCES;
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int LONGEST_SEQUENCE_SIZE;
    private static final int MAX_PAIRS = 11;
    private static final int[] SYMBOL_WIDEST = {7, 5, 4, 3, 1};
    private static final int[] EVEN_TOTAL_SUBSET = {4, 20, 52, 104, 204};
    private static final int[] GSUM = {0, 348, 1388, 2948, 3988};
    private static final int[][] FINDER_PATTERNS = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] WEIGHTS = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private final List<ExpandedPair> pairs = new ArrayList(11);
    private final int[] startEnd = new int[2];
    private final int[] currentSequence = new int[LONGEST_SEQUENCE_SIZE];

    static {
        int[][] iArr = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
        FINDER_PATTERN_SEQUENCES = iArr;
        LONGEST_SEQUENCE_SIZE = iArr[iArr.length - 1].length;
    }

    private void adjustOddEvenCounts(int i4) throws NotFoundException {
        boolean z4;
        boolean z5;
        boolean z6;
        int count = AbstractRSSReader.count(getOddCounts());
        int count2 = AbstractRSSReader.count(getEvenCounts());
        int i5 = (count + count2) - i4;
        boolean z7 = true;
        boolean z8 = (count & 1) == 1;
        boolean z9 = (count2 & 1) == 0;
        if (count > 13) {
            z4 = false;
            z5 = true;
        } else {
            z4 = count < 4;
            z5 = false;
        }
        if (count2 > 13) {
            z6 = true;
        } else {
            r3 = count2 < 4;
            z6 = false;
        }
        if (i5 == 1) {
            if (z8) {
                if (z9) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z7 = z4;
                z5 = true;
            } else if (!z9) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                z7 = z4;
                z6 = true;
            }
        } else if (i5 == -1) {
            if (z8) {
                if (z9) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (!z9) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                z7 = z4;
                r3 = true;
            }
        } else if (i5 != 0) {
            throw NotFoundException.getNotFoundInstance();
        } else {
            if (z8) {
                if (!z9) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (count >= count2) {
                    z7 = z4;
                    r3 = true;
                    z5 = true;
                }
                z6 = true;
            } else if (z9) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                z7 = z4;
            }
        }
        if (z7) {
            if (!z5) {
                AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z5) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (r3) {
            if (!z6) {
                AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z6) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private boolean checkChecksum() {
        ExpandedPair expandedPair = this.pairs.get(0);
        DataCharacter leftChar = expandedPair.getLeftChar();
        int checksumPortion = expandedPair.getRightChar().getChecksumPortion();
        int i4 = 2;
        for (int i5 = 1; i5 < this.pairs.size(); i5++) {
            ExpandedPair expandedPair2 = this.pairs.get(i5);
            checksumPortion += expandedPair2.getLeftChar().getChecksumPortion();
            i4++;
            DataCharacter rightChar = expandedPair2.getRightChar();
            if (rightChar != null) {
                checksumPortion += rightChar.getChecksumPortion();
                i4++;
            }
        }
        return ((i4 + (-4)) * 211) + (checksumPortion % 211) == leftChar.getValue();
    }

    private boolean checkPairSequence(List<ExpandedPair> list, FinderPattern finderPattern) throws NotFoundException {
        int[][] iArr;
        boolean z4;
        int size = list.size() + 1;
        if (size <= this.currentSequence.length) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.currentSequence[i4] = list.get(i4).getFinderPattern().getValue();
            }
            this.currentSequence[size - 1] = finderPattern.getValue();
            for (int[] iArr2 : FINDER_PATTERN_SEQUENCES) {
                if (iArr2.length >= size) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            z4 = true;
                            break;
                        } else if (this.currentSequence[i5] != iArr2[i5]) {
                            z4 = false;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (z4) {
                        return size == iArr2.length;
                    }
                }
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static Result constructResult(List<ExpandedPair> list) throws NotFoundException {
        String parseInformation = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = list.get(list.size() - 1).getFinderPattern().getResultPoints();
        return new Result(parseInformation, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i4) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i4 < 0) {
            i4 = list.isEmpty() ? 0 : list.get(list.size() - 1).getFinderPattern().getStartEnd()[1];
        }
        boolean z4 = list.size() % 2 != 0;
        boolean z5 = false;
        while (i4 < size) {
            z5 = !bitArray.get(i4);
            if (!z5) {
                break;
            }
            i4++;
        }
        boolean z6 = z5;
        int i5 = 0;
        int i6 = i4;
        while (i4 < size) {
            if (bitArray.get(i4) ^ z6) {
                decodeFinderCounters[i5] = decodeFinderCounters[i5] + 1;
            } else {
                if (i5 == 3) {
                    if (z4) {
                        reverseCounters(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.startEnd;
                        iArr[0] = i6;
                        iArr[1] = i4;
                        return;
                    }
                    if (z4) {
                        reverseCounters(decodeFinderCounters);
                    }
                    i6 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i5--;
                } else {
                    i5++;
                }
                decodeFinderCounters[i5] = 1;
                z6 = !z6;
            }
            i4++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int i4) {
        if (bitArray.get(i4)) {
            return bitArray.getNextSet(bitArray.getNextUnset(i4));
        }
        return bitArray.getNextUnset(bitArray.getNextSet(i4));
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z4, boolean z5) {
        return (finderPattern.getValue() == 0 && z4 && z5) ? false : true;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i4, boolean z4) {
        int i5;
        int i6;
        int i7;
        if (z4) {
            int i8 = this.startEnd[0] - 1;
            while (i8 >= 0 && !bitArray.get(i8)) {
                i8--;
            }
            int i9 = i8 + 1;
            int[] iArr = this.startEnd;
            i7 = iArr[0] - i9;
            i5 = iArr[1];
            i6 = i9;
        } else {
            int[] iArr2 = this.startEnd;
            int i10 = iArr2[0];
            int nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i5 = nextUnset;
            i6 = i10;
            i7 = nextUnset - this.startEnd[1];
        }
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i7;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS), new int[]{i6, i5}, i6, i5, i4);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length / 2; i4++) {
            int i5 = iArr[i4];
            int i6 = (length - i4) - 1;
            iArr[i4] = iArr[i6];
            iArr[i6] = i5;
        }
    }

    DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z4, boolean z5) throws NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        dataCharacterCounters[0] = 0;
        dataCharacterCounters[1] = 0;
        dataCharacterCounters[2] = 0;
        dataCharacterCounters[3] = 0;
        dataCharacterCounters[4] = 0;
        dataCharacterCounters[5] = 0;
        dataCharacterCounters[6] = 0;
        dataCharacterCounters[7] = 0;
        if (z5) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i4 = 0;
            for (int length = dataCharacterCounters.length - 1; i4 < length; length--) {
                int i5 = dataCharacterCounters[i4];
                dataCharacterCounters[i4] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i5;
                i4++;
            }
        }
        float count = AbstractRSSReader.count(dataCharacterCounters) / 17;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i6 = 0; i6 < dataCharacterCounters.length; i6++) {
            float f5 = (dataCharacterCounters[i6] * 1.0f) / count;
            int i7 = (int) (0.5f + f5);
            if (i7 < 1) {
                i7 = 1;
            } else if (i7 > 8) {
                i7 = 8;
            }
            int i8 = i6 >> 1;
            if ((i6 & 1) == 0) {
                oddCounts[i8] = i7;
                oddRoundingErrors[i8] = f5 - i7;
            } else {
                evenCounts[i8] = i7;
                evenRoundingErrors[i8] = f5 - i7;
            }
        }
        adjustOddEvenCounts(17);
        int value = (((finderPattern.getValue() * 4) + (z4 ? 0 : 2)) + (!z5 ? 1 : 0)) - 1;
        int i9 = 0;
        int i10 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            if (isNotA1left(finderPattern, z4, z5)) {
                i9 += oddCounts[length2] * WEIGHTS[value][length2 * 2];
            }
            i10 += oddCounts[length2];
        }
        int i11 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (isNotA1left(finderPattern, z4, z5)) {
                i11 += evenCounts[length3] * WEIGHTS[value][(length3 * 2) + 1];
            }
            int i12 = evenCounts[length3];
        }
        int i13 = i9 + i11;
        if ((i10 & 1) == 0 && i10 <= 13 && i10 >= 4) {
            int i14 = (13 - i10) / 2;
            int i15 = SYMBOL_WIDEST[i14];
            return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i15, true) * EVEN_TOTAL_SUBSET[i14]) + RSSUtils.getRSSvalue(evenCounts, 9 - i15, false) + GSUM[i14], i13);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i4, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        reset();
        decodeRow2pairs(i4, bitArray);
        return constructResult(this.pairs);
    }

    List<ExpandedPair> decodeRow2pairs(int i4, BitArray bitArray) throws NotFoundException {
        while (true) {
            ExpandedPair retrieveNextPair = retrieveNextPair(bitArray, this.pairs, i4);
            this.pairs.add(retrieveNextPair);
            if (retrieveNextPair.mayBeLast()) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                if (retrieveNextPair.mustBeLast()) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.pairs.clear();
    }

    ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i4) throws NotFoundException {
        FinderPattern parseFoundFinderPattern;
        DataCharacter dataCharacter;
        boolean z4 = list.size() % 2 == 0;
        int i5 = -1;
        boolean z5 = true;
        do {
            findNextPair(bitArray, list, i5);
            parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i4, z4);
            if (parseFoundFinderPattern == null) {
                i5 = getNextSecondBar(bitArray, this.startEnd[0]);
                continue;
            } else {
                z5 = false;
                continue;
            }
        } while (z5);
        boolean checkPairSequence = checkPairSequence(list, parseFoundFinderPattern);
        DataCharacter decodeDataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, z4, true);
        try {
            dataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, z4, false);
        } catch (NotFoundException e5) {
            if (!checkPairSequence) {
                throw e5;
            }
            dataCharacter = null;
        }
        return new ExpandedPair(decodeDataCharacter, dataCharacter, parseFoundFinderPattern, checkPairSequence);
    }
}
