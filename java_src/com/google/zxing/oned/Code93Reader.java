package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.imageutils.e;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;
/* loaded from: classes3.dex */
public final class Code93Reader extends OneDReader {
    private static final int ASTERISK_ENCODING;
    private static final int[] CHARACTER_ENCODINGS;
    private static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, e.f12543d, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, TTAdConstant.DEEPLINK_FALL_BACK_CODE, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, TTAdConstant.IMAGE_LIST_SIZE_CODE, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }

    private static void checkChecksums(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        checkOneChecksum(charSequence, length - 2, 20);
        checkOneChecksum(charSequence, length - 1, 15);
    }

    private static void checkOneChecksum(CharSequence charSequence, int i4, int i5) throws ChecksumException {
        int i6 = 0;
        int i7 = 1;
        for (int i8 = i4 - 1; i8 >= 0; i8--) {
            i6 += ALPHABET_STRING.indexOf(charSequence.charAt(i8)) * i7;
            i7++;
            if (i7 > i5) {
                i7 = 1;
            }
        }
        if (charSequence.charAt(i4) != ALPHABET[i6 % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    private static String decodeExtended(CharSequence charSequence) throws FormatException {
        int i4;
        char c5;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i5 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt >= 'a' && charAt <= 'd') {
                i5++;
                char charAt2 = charSequence.charAt(i5);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i4 = charAt2 - '@';
                            c5 = (char) i4;
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i4 = charAt2 - '&';
                        } else if (charAt2 < 'F' || charAt2 > 'W') {
                            throw FormatException.getFormatInstance();
                        } else {
                            i4 = charAt2 - 11;
                        }
                        c5 = (char) i4;
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i4 = charAt2 - ' ';
                            c5 = (char) i4;
                            break;
                        } else if (charAt2 == 'Z') {
                            c5 = ':';
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i4 = charAt2 + ' ';
                            c5 = (char) i4;
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    default:
                        c5 = 0;
                        break;
                }
                sb.append(c5);
            } else {
                sb.append(charAt);
            }
            i5++;
        }
        return sb.toString();
    }

    private static int[] findAsteriskPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        int i4 = nextSet;
        boolean z4 = false;
        int i5 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) ^ z4) {
                iArr[i5] = iArr[i5] + 1;
            } else {
                if (i5 != 5) {
                    i5++;
                } else if (toPattern(iArr) == ASTERISK_ENCODING) {
                    return new int[]{i4, nextSet};
                } else {
                    i4 += iArr[0] + iArr[1];
                    System.arraycopy(iArr, 2, iArr, 0, 4);
                    iArr[4] = 0;
                    iArr[5] = 0;
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

    private static int toPattern(int[] iArr) {
        int length = iArr.length;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = ((iArr[i7] << 8) * 9) / i4;
            int i9 = i8 >> 8;
            if ((i8 & 255) > 127) {
                i9++;
            }
            if (i9 < 1 || i9 > 4) {
                return -1;
            }
            if ((i7 & 1) == 0) {
                for (int i10 = 0; i10 < i9; i10++) {
                    i6 = (i6 << 1) | 1;
                }
            } else {
                i6 <<= i9;
            }
        }
        return i6;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i4, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] findAsteriskPattern;
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray)[1]);
        int size = bitArray.getSize();
        StringBuilder sb = new StringBuilder(20);
        int[] iArr = new int[6];
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int pattern = toPattern(iArr);
            if (pattern >= 0) {
                char patternToChar = patternToChar(pattern);
                sb.append(patternToChar);
                int i5 = nextSet;
                for (int i6 = 0; i6 < 6; i6++) {
                    i5 += iArr[i6];
                }
                int nextSet2 = bitArray.getNextSet(i5);
                if (patternToChar == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    if (nextSet2 != size && bitArray.get(nextSet2)) {
                        if (sb.length() >= 2) {
                            checkChecksums(sb);
                            sb.setLength(sb.length() - 2);
                            float f5 = i4;
                            return new Result(decodeExtended(sb), null, new ResultPoint[]{new ResultPoint((findAsteriskPattern[1] + findAsteriskPattern[0]) / 2.0f, f5), new ResultPoint((nextSet2 + nextSet) / 2.0f, f5)}, BarcodeFormat.CODE_93);
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
