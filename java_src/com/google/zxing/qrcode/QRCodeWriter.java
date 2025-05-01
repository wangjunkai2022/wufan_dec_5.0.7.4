package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.QRCode;
import java.util.Map;
/* loaded from: classes3.dex */
public final class QRCodeWriter implements Writer {
    private static final int QUIET_ZONE_SIZE = 4;

    private static BitMatrix renderResult(QRCode qRCode, int i4, int i5) {
        ByteMatrix matrix = qRCode.getMatrix();
        if (matrix != null) {
            int width = matrix.getWidth();
            int height = matrix.getHeight();
            int i6 = width + 8;
            int i7 = height + 8;
            int max = Math.max(i4, i6);
            int max2 = Math.max(i5, i7);
            int min = Math.min(max / i6, max2 / i7);
            int i8 = (max - (width * min)) / 2;
            int i9 = (max2 - (height * min)) / 2;
            BitMatrix bitMatrix = new BitMatrix(max, max2);
            int i10 = 0;
            while (i10 < height) {
                int i11 = i8;
                int i12 = 0;
                while (i12 < width) {
                    if (matrix.get(i12, i10) == 1) {
                        bitMatrix.setRegion(i11, i9, min, min);
                    }
                    i12++;
                    i11 += min;
                }
                i10++;
                i9 += min;
            }
            return bitMatrix;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5) throws WriterException {
        return encode(str, barcodeFormat, i4, i5, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5, Map<EncodeHintType, ?> map) throws WriterException {
        ErrorCorrectionLevel errorCorrectionLevel;
        if (str.length() != 0) {
            if (barcodeFormat != BarcodeFormat.QR_CODE) {
                throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat);
            } else if (i4 >= 0 && i5 >= 0) {
                ErrorCorrectionLevel errorCorrectionLevel2 = ErrorCorrectionLevel.L;
                if (map != null && (errorCorrectionLevel = (ErrorCorrectionLevel) map.get(EncodeHintType.ERROR_CORRECTION)) != null) {
                    errorCorrectionLevel2 = errorCorrectionLevel;
                }
                QRCode qRCode = new QRCode();
                Encoder.encode(str, errorCorrectionLevel2, map, qRCode);
                return renderResult(qRCode, i4, i5);
            } else {
                throw new IllegalArgumentException("Requested dimensions are too small: " + i4 + 'x' + i5);
            }
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
