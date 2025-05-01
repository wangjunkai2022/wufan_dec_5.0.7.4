package com.google.zxing.oned;

import com.facebook.common.statfs.StatFsHelper;
import com.facebook.imageutils.e;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.papa.controller.component.bluetooth.spp.c;
import com.xinzhu.overmind.utils.k;
import java.util.Map;
/* loaded from: classes3.dex */
public final class Code39Reader extends OneDReader {
    private static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, e.f12543d, 82, 7, 262, 70, 22, c.f57965l, 193, k.f68367b, 145, StatFsHelper.f10899h, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[39];
    }

    public Code39Reader() {
        this.usingCheckDigit = false;
        this.extendedMode = false;
    }

    private static String decodeExtended(CharSequence charSequence) throws FormatException {
        int i4;
        char c5;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i5 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb.append(charAt);
            } else {
                i5++;
                char charAt2 = charSequence.charAt(i5);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                c5 = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i4 = charAt2 - ' ';
                            } else if (charAt2 != 'Z') {
                                throw FormatException.getFormatInstance();
                            } else {
                                c5 = ':';
                            }
                            sb.append(c5);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        } else {
                            i4 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i4 = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw FormatException.getFormatInstance();
                    } else {
                        i4 = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.getFormatInstance();
                } else {
                    i4 = charAt2 - '@';
                }
                c5 = (char) i4;
                sb.append(c5);
            }
            i5++;
        }
        return sb.toString();
    }

    private static int[] findAsteriskPattern(BitArray bitArray, int[] iArr) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int length = iArr.length;
        int i4 = nextSet;
        boolean z4 = false;
        int i5 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) ^ z4) {
                iArr[i5] = iArr[i5] + 1;
            } else {
                int i6 = length - 1;
                if (i5 != i6) {
                    i5++;
                } else if (toNarrowWidePattern(iArr) == ASTERISK_ENCODING && bitArray.isRange(Math.max(0, i4 - ((nextSet - i4) >> 1)), i4, false)) {
                    return new int[]{i4, nextSet};
                } else {
                    i4 += iArr[0] + iArr[1];
                    int i7 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i7);
                    iArr[i7] = 0;
                    iArr[i6] = 0;
                    i5--;
                }
                iArr[i5] = 1;
                z4 = !z4;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char patternToChar(int i4) throws NotFoundException {
        int i5 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i5 < iArr.length) {
                if (iArr[i5] == i4) {
                    return ALPHABET[i5];
                }
                i5++;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    private static int toNarrowWidePattern(int[] iArr) {
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 : iArr) {
                if (i6 < i5 && i6 > i4) {
                    i5 = i6;
                }
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                if (iArr[i10] > i5) {
                    i8 |= 1 << ((length - 1) - i10);
                    i7++;
                    i9 += i11;
                }
            }
            if (i7 == 3) {
                for (int i12 = 0; i12 < length && i7 > 0; i12++) {
                    int i13 = iArr[i12];
                    if (iArr[i12] > i5) {
                        i7--;
                        if ((i13 << 1) >= i9) {
                            return -1;
                        }
                    }
                }
                return i8;
            } else if (i7 <= 3) {
                return -1;
            } else {
                i4 = i5;
            }
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i4, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] findAsteriskPattern;
        String sb;
        int[] iArr = new int[9];
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray, iArr)[1]);
        int size = bitArray.getSize();
        StringBuilder sb2 = new StringBuilder(20);
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int narrowWidePattern = toNarrowWidePattern(iArr);
            if (narrowWidePattern >= 0) {
                char patternToChar = patternToChar(narrowWidePattern);
                sb2.append(patternToChar);
                int i5 = nextSet;
                for (int i6 = 0; i6 < 9; i6++) {
                    i5 += iArr[i6];
                }
                int nextSet2 = bitArray.getNextSet(i5);
                if (patternToChar == '*') {
                    sb2.setLength(sb2.length() - 1);
                    int i7 = 0;
                    for (int i8 = 0; i8 < 9; i8++) {
                        i7 += iArr[i8];
                    }
                    int i9 = (nextSet2 - nextSet) - i7;
                    if (nextSet2 != size && (i9 >> 1) < i7) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (this.usingCheckDigit) {
                        int length = sb2.length() - 1;
                        int i10 = 0;
                        for (int i11 = 0; i11 < length; i11++) {
                            i10 += ALPHABET_STRING.indexOf(sb2.charAt(i11));
                        }
                        if (sb2.charAt(length) == ALPHABET[i10 % 43]) {
                            sb2.setLength(length);
                        } else {
                            throw ChecksumException.getChecksumInstance();
                        }
                    }
                    if (sb2.length() != 0) {
                        if (this.extendedMode) {
                            sb = decodeExtended(sb2);
                        } else {
                            sb = sb2.toString();
                        }
                        float f5 = i4;
                        return new Result(sb, null, new ResultPoint[]{new ResultPoint((findAsteriskPattern[1] + findAsteriskPattern[0]) / 2.0f, f5), new ResultPoint((nextSet2 + nextSet) / 2.0f, f5)}, BarcodeFormat.CODE_39);
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                nextSet = nextSet2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public Code39Reader(boolean z4) {
        this.usingCheckDigit = z4;
        this.extendedMode = false;
    }

    public Code39Reader(boolean z4, boolean z5) {
        this.usingCheckDigit = z4;
        this.extendedMode = z5;
    }
}
