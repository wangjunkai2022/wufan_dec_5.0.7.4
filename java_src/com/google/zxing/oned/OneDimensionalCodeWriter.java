package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    private final int sidesMargin;

    /* JADX INFO: Access modifiers changed from: protected */
    public OneDimensionalCodeWriter(int i4) {
        this.sidesMargin = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int appendPattern(byte[] bArr, int i4, int[] iArr, int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("startColor must be either 0 or 1, but got: " + i5);
        }
        byte b5 = (byte) i5;
        int i6 = 0;
        for (int i7 : iArr) {
            for (int i8 = 0; i8 < i7; i8++) {
                bArr[i4] = b5;
                i4++;
                i6++;
            }
            b5 = (byte) (b5 ^ 1);
        }
        return i6;
    }

    private BitMatrix renderResult(byte[] bArr, int i4, int i5) {
        int length = bArr.length;
        int i6 = this.sidesMargin + length;
        int max = Math.max(i4, i6);
        int max2 = Math.max(1, i5);
        int i7 = max / i6;
        int i8 = (max - (length * i7)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i9 = 0;
        while (i9 < length) {
            if (bArr[i9] == 1) {
                bitMatrix.setRegion(i8, 0, i7, max2);
            }
            i9++;
            i8 += i7;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5) throws WriterException {
        return encode(str, barcodeFormat, i4, i5, null);
    }

    public abstract byte[] encode(String str);

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.length() != 0) {
            if (i4 >= 0 && i5 >= 0) {
                return renderResult(encode(str), i4, i5);
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i4 + 'x' + i5);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
