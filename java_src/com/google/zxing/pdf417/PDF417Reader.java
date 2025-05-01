package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.pdf417.decoder.Decoder;
import com.google.zxing.pdf417.detector.Detector;
import java.util.Map;
/* loaded from: classes3.dex */
public final class PDF417Reader implements Reader {
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) throws NotFoundException {
        int[] topLeftOnBit = bitMatrix.getTopLeftOnBit();
        int[] bottomRightOnBit = bitMatrix.getBottomRightOnBit();
        if (topLeftOnBit != null && bottomRightOnBit != null) {
            int moduleSize = moduleSize(topLeftOnBit, bitMatrix);
            int i4 = topLeftOnBit[1];
            int i5 = bottomRightOnBit[1];
            int findPatternStart = findPatternStart(topLeftOnBit[0], i4, bitMatrix);
            int findPatternEnd = ((findPatternEnd(topLeftOnBit[0], i4, bitMatrix) - findPatternStart) + 1) / moduleSize;
            int i6 = ((i5 - i4) + 1) / moduleSize;
            if (findPatternEnd > 0 && i6 > 0) {
                int i7 = moduleSize >> 1;
                int i8 = i4 + i7;
                int i9 = findPatternStart + i7;
                BitMatrix bitMatrix2 = new BitMatrix(findPatternEnd, i6);
                for (int i10 = 0; i10 < i6; i10++) {
                    int i11 = (i10 * moduleSize) + i8;
                    for (int i12 = 0; i12 < findPatternEnd; i12++) {
                        if (bitMatrix.get((i12 * moduleSize) + i9, i11)) {
                            bitMatrix2.set(i12, i10);
                        }
                    }
                }
                return bitMatrix2;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int findPatternEnd(int i4, int i5, BitMatrix bitMatrix) throws NotFoundException {
        boolean z4 = true;
        int width = bitMatrix.getWidth() - 1;
        while (width > i4 && !bitMatrix.get(width, i5)) {
            width--;
        }
        int i6 = 0;
        while (width > i4 && i6 < 9) {
            width--;
            boolean z5 = bitMatrix.get(width, i5);
            if (z4 != z5) {
                i6++;
            }
            z4 = z5;
        }
        if (width != i4) {
            return width;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int findPatternStart(int i4, int i5, BitMatrix bitMatrix) throws NotFoundException {
        int i6;
        int width = bitMatrix.getWidth();
        int i7 = 0;
        boolean z4 = true;
        while (true) {
            i6 = width - 1;
            if (i4 >= i6 || i7 >= 8) {
                break;
            }
            i4++;
            boolean z5 = bitMatrix.get(i4, i5);
            if (z4 != z5) {
                i7++;
            }
            z4 = z5;
        }
        if (i4 != i6) {
            return i4;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int moduleSize(int[] iArr, BitMatrix bitMatrix) throws NotFoundException {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int width = bitMatrix.getWidth();
        while (i4 < width && bitMatrix.get(i4, i5)) {
            i4++;
        }
        if (i4 != width) {
            int i6 = (i4 - iArr[0]) >>> 3;
            if (i6 != 0) {
                return i6;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPoint[] points;
        DecoderResult decoderResult;
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE)) {
            decoderResult = this.decoder.decode(extractPureBits(binaryBitmap.getBlackMatrix()));
            points = NO_POINTS;
        } else {
            DetectorResult detect = new Detector(binaryBitmap).detect();
            DecoderResult decode = this.decoder.decode(detect.getBits());
            points = detect.getPoints();
            decoderResult = decode;
        }
        return new Result(decoderResult.getText(), decoderResult.getRawBytes(), points, BarcodeFormat.PDF_417);
    }
}
