package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;
/* loaded from: classes3.dex */
public final class EAN13Writer extends UPCEANWriter {
    private static final int CODE_WIDTH = 95;

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.encode(str, barcodeFormat, i4, i5, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got " + barcodeFormat);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public byte[] encode(String str) {
        if (str.length() == 13) {
            int i4 = EAN13Reader.FIRST_DIGIT_ENCODINGS[Integer.parseInt(str.substring(0, 1))];
            byte[] bArr = new byte[95];
            int appendPattern = OneDimensionalCodeWriter.appendPattern(bArr, 0, UPCEANReader.START_END_PATTERN, 1) + 0;
            int i5 = 1;
            while (i5 <= 6) {
                int i6 = i5 + 1;
                int parseInt = Integer.parseInt(str.substring(i5, i6));
                if (((i4 >> (6 - i5)) & 1) == 1) {
                    parseInt += 10;
                }
                appendPattern += OneDimensionalCodeWriter.appendPattern(bArr, appendPattern, UPCEANReader.L_AND_G_PATTERNS[parseInt], 0);
                i5 = i6;
            }
            int appendPattern2 = appendPattern + OneDimensionalCodeWriter.appendPattern(bArr, appendPattern, UPCEANReader.MIDDLE_PATTERN, 0);
            int i7 = 7;
            while (i7 <= 12) {
                int i8 = i7 + 1;
                appendPattern2 += OneDimensionalCodeWriter.appendPattern(bArr, appendPattern2, UPCEANReader.L_PATTERNS[Integer.parseInt(str.substring(i7, i8))], 1);
                i7 = i8;
            }
            OneDimensionalCodeWriter.appendPattern(bArr, appendPattern2, UPCEANReader.START_END_PATTERN, 1);
            return bArr;
        }
        throw new IllegalArgumentException("Requested contents should be 13 digits long, but got " + str.length());
    }
}
