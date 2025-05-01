package com.google.zxing.pdf417.encoder;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.lang.reflect.Array;
import java.util.Map;
/* loaded from: classes3.dex */
public final class PDF417Writer implements Writer {
    private static BitMatrix bitMatrixFromEncoder(PDF417 pdf417, String str, int i4, int i5) throws WriterException {
        boolean z4;
        pdf417.generateBarcodeLogic(str, 2);
        byte[][] scaledMatrix = pdf417.getBarcodeMatrix().getScaledMatrix(2, 8);
        if ((i5 > i4) ^ (scaledMatrix[0].length < scaledMatrix.length)) {
            scaledMatrix = rotateArray(scaledMatrix);
            z4 = true;
        } else {
            z4 = false;
        }
        int length = i4 / scaledMatrix[0].length;
        int length2 = i5 / scaledMatrix.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] scaledMatrix2 = pdf417.getBarcodeMatrix().getScaledMatrix(length * 2, length * 4 * 2);
            if (z4) {
                scaledMatrix2 = rotateArray(scaledMatrix2);
            }
            return bitMatrixFrombitArray(scaledMatrix2);
        }
        return bitMatrixFrombitArray(scaledMatrix);
    }

    private static BitMatrix bitMatrixFrombitArray(byte[][] bArr) {
        BitMatrix bitMatrix = new BitMatrix(bArr.length + 60, bArr[0].length + 60);
        bitMatrix.clear();
        for (int i4 = 0; i4 < bArr.length; i4++) {
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr[i4][i5] == 1) {
                    bitMatrix.set(i4 + 30, i5 + 30);
                }
            }
        }
        return bitMatrix;
    }

    private static PDF417 initializeEncoder(BarcodeFormat barcodeFormat, boolean z4) {
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            PDF417 pdf417 = new PDF417();
            pdf417.setCompact(z4);
            return pdf417;
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got " + barcodeFormat);
    }

    private static byte[][] rotateArray(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, bArr[0].length, bArr.length);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int length = (bArr.length - i4) - 1;
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                bArr2[i5][length] = bArr[i4][i5];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5, Map<EncodeHintType, ?> map) throws WriterException {
        return encode(str, barcodeFormat, i4, i5);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5) throws WriterException {
        return bitMatrixFromEncoder(initializeEncoder(barcodeFormat, false), str, i4, i5);
    }

    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, boolean z4, int i4, int i5, int i6, int i7, int i8, int i9, Compaction compaction) throws WriterException {
        PDF417 initializeEncoder = initializeEncoder(barcodeFormat, z4);
        initializeEncoder.setDimensions(i7, i6, i9, i8);
        initializeEncoder.setCompaction(compaction);
        return bitMatrixFromEncoder(initializeEncoder, str, i4, i5);
    }
}
