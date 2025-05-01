package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
/* loaded from: classes3.dex */
public final class Decoder {
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;

    private static int correctErrors(int[] iArr, int[] iArr2, int i4) throws FormatException {
        if (iArr2.length <= (i4 / 2) + 3 && i4 >= 0 && i4 <= 512) {
            if (iArr2.length <= 3) {
                return 0;
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    private static void verifyCodewordCount(int[] iArr, int i4) throws FormatException {
        if (iArr.length >= 4) {
            int i5 = iArr[0];
            if (i5 > iArr.length) {
                throw FormatException.getFormatInstance();
            }
            if (i5 == 0) {
                if (i4 < iArr.length) {
                    iArr[0] = iArr.length - i4;
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            return;
        }
        throw FormatException.getFormatInstance();
    }

    public DecoderResult decode(boolean[][] zArr) throws FormatException {
        int length = zArr.length;
        BitMatrix bitMatrix = new BitMatrix(length);
        for (int i4 = 0; i4 < length; i4++) {
            for (int i5 = 0; i5 < length; i5++) {
                if (zArr[i5][i4]) {
                    bitMatrix.set(i5, i4);
                }
            }
        }
        return decode(bitMatrix);
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws FormatException {
        BitMatrixParser bitMatrixParser = new BitMatrixParser(bitMatrix);
        int[] readCodewords = bitMatrixParser.readCodewords();
        if (readCodewords.length != 0) {
            int eCLevel = 1 << (bitMatrixParser.getECLevel() + 1);
            correctErrors(readCodewords, bitMatrixParser.getErasures(), eCLevel);
            verifyCodewordCount(readCodewords, eCLevel);
            return DecodedBitStreamParser.decode(readCodewords);
        }
        throw FormatException.getFormatInstance();
    }
}
