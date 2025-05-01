package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
/* loaded from: classes3.dex */
public class GlobalHistogramBinarizer extends Binarizer {
    private static final int LUMINANCE_BITS = 5;
    private static final int LUMINANCE_BUCKETS = 32;
    private static final int LUMINANCE_SHIFT = 3;
    private final int[] buckets;
    private byte[] luminances;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
        this.luminances = new byte[0];
        this.buckets = new int[32];
    }

    private static int estimateBlackPoint(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (iArr[i7] > i4) {
                i4 = iArr[i7];
                i6 = i7;
            }
            if (iArr[i7] > i5) {
                i5 = iArr[i7];
            }
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 - i6;
            int i12 = iArr[i10] * i11 * i11;
            if (i12 > i9) {
                i8 = i10;
                i9 = i12;
            }
        }
        if (i6 <= i8) {
            int i13 = i6;
            i6 = i8;
            i8 = i13;
        }
        if (i6 - i8 > (length >> 4)) {
            int i14 = i6 - 1;
            int i15 = i14;
            int i16 = -1;
            while (i14 > i8) {
                int i17 = i14 - i8;
                int i18 = i17 * i17 * (i6 - i14) * (i5 - iArr[i14]);
                if (i18 > i16) {
                    i15 = i14;
                    i16 = i18;
                }
                i14--;
            }
            return i15 << 3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void initArrays(int i4) {
        if (this.luminances.length < i4) {
            this.luminances = new byte[i4];
        }
        for (int i5 = 0; i5 < 32; i5++) {
            this.buckets[i5] = 0;
        }
    }

    @Override // com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new GlobalHistogramBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        initArrays(width);
        int[] iArr = this.buckets;
        for (int i4 = 1; i4 < 5; i4++) {
            byte[] row = luminanceSource.getRow((height * i4) / 5, this.luminances);
            int i5 = (width << 2) / 5;
            for (int i6 = width / 5; i6 < i5; i6++) {
                int i7 = (row[i6] & 255) >> 3;
                iArr[i7] = iArr[i7] + 1;
            }
        }
        int estimateBlackPoint = estimateBlackPoint(iArr);
        byte[] matrix = luminanceSource.getMatrix();
        for (int i8 = 0; i8 < height; i8++) {
            int i9 = i8 * width;
            for (int i10 = 0; i10 < width; i10++) {
                if ((matrix[i9 + i10] & 255) < estimateBlackPoint) {
                    bitMatrix.set(i10, i8);
                }
            }
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Binarizer
    public BitArray getBlackRow(int i4, BitArray bitArray) throws NotFoundException {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        if (bitArray != null && bitArray.getSize() >= width) {
            bitArray.clear();
        } else {
            bitArray = new BitArray(width);
        }
        initArrays(width);
        byte[] row = luminanceSource.getRow(i4, this.luminances);
        int[] iArr = this.buckets;
        for (int i5 = 0; i5 < width; i5++) {
            int i6 = (row[i5] & 255) >> 3;
            iArr[i6] = iArr[i6] + 1;
        }
        int estimateBlackPoint = estimateBlackPoint(iArr);
        int i7 = row[1] & 255;
        int i8 = 1;
        int i9 = row[0] & 255;
        int i10 = i7;
        while (i8 < width - 1) {
            int i11 = i8 + 1;
            int i12 = row[i11] & 255;
            if (((((i10 << 2) - i9) - i12) >> 1) < estimateBlackPoint) {
                bitArray.set(i8);
            }
            i9 = i10;
            i8 = i11;
            i10 = i12;
        }
        return bitArray;
    }
}
