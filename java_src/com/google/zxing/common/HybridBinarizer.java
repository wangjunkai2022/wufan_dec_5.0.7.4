package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
/* loaded from: classes3.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {
    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    private static int[][] calculateBlackPoints(byte[] bArr, int i4, int i5, int i6, int i7) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, i5, i4);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = i8 << 3;
            if (i9 + 8 >= i7) {
                i9 = i7 - 8;
            }
            for (int i10 = 0; i10 < i4; i10++) {
                int i11 = i10 << 3;
                if (i11 + 8 >= i6) {
                    i11 = i6 - 8;
                }
                int i12 = (i9 * i6) + i11;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 255;
                while (true) {
                    if (i13 >= 8) {
                        break;
                    }
                    int i17 = 0;
                    for (int i18 = 8; i17 < i18; i18 = 8) {
                        int i19 = bArr[i12 + i17] & 255;
                        i14 += i19;
                        if (i19 < i16) {
                            i16 = i19;
                        }
                        if (i19 > i15) {
                            i15 = i19;
                        }
                        i17++;
                    }
                    i13++;
                    i12 += i6;
                }
                int i20 = i14 >> 6;
                if (i15 - i16 <= 24) {
                    i20 = i16 >> 1;
                    if (i8 > 0 && i10 > 0) {
                        int i21 = i8 - 1;
                        int i22 = i10 - 1;
                        int i23 = ((iArr[i21][i10] + (iArr[i8][i22] * 2)) + iArr[i21][i22]) >> 2;
                        if (i16 < i23) {
                            i20 = i23;
                        }
                        iArr[i8][i10] = i20;
                    }
                }
                iArr[i8][i10] = i20;
            }
        }
        return iArr;
    }

    private static void calculateThresholdForBlock(byte[] bArr, int i4, int i5, int i6, int i7, int[][] iArr, BitMatrix bitMatrix) {
        int i8 = 0;
        while (i8 < i5) {
            int i9 = i8 << 3;
            if (i9 + 8 >= i7) {
                i9 = i7 - 8;
            }
            int i10 = i9;
            int i11 = 0;
            while (i11 < i4) {
                int i12 = i11 << 3;
                if (i12 + 8 >= i6) {
                    i12 = i6 - 8;
                }
                int i13 = i12;
                int i14 = i11 > 1 ? i11 : 2;
                if (i14 >= i4 - 2) {
                    i14 = i4 - 3;
                }
                int i15 = i8 > 1 ? i8 : 2;
                if (i15 >= i5 - 2) {
                    i15 = i5 - 3;
                }
                int i16 = 0;
                for (int i17 = -2; i17 <= 2; i17++) {
                    int[] iArr2 = iArr[i15 + i17];
                    i16 += iArr2[i14 - 2] + iArr2[i14 - 1] + iArr2[i14] + iArr2[i14 + 1] + iArr2[i14 + 2];
                }
                threshold8x8Block(bArr, i13, i10, i16 / 25, i6, bitMatrix);
                i11++;
            }
            i8++;
        }
    }

    private static void threshold8x8Block(byte[] bArr, int i4, int i5, int i6, int i7, BitMatrix bitMatrix) {
        int i8 = (i5 * i7) + i4;
        int i9 = 0;
        while (i9 < 8) {
            for (int i10 = 0; i10 < 8; i10++) {
                if ((bArr[i8 + i10] & 255) <= i6) {
                    bitMatrix.set(i4 + i10, i5 + i9);
                }
            }
            i9++;
            i8 += i7;
        }
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        BitMatrix bitMatrix = this.matrix;
        if (bitMatrix != null) {
            return bitMatrix;
        }
        LuminanceSource luminanceSource = getLuminanceSource();
        if (luminanceSource.getWidth() >= 40 && luminanceSource.getHeight() >= 40) {
            byte[] matrix = luminanceSource.getMatrix();
            int width = luminanceSource.getWidth();
            int height = luminanceSource.getHeight();
            int i4 = width >> 3;
            if ((width & 7) != 0) {
                i4++;
            }
            int i5 = i4;
            int i6 = height >> 3;
            if ((height & 7) != 0) {
                i6++;
            }
            int i7 = i6;
            int[][] calculateBlackPoints = calculateBlackPoints(matrix, i5, i7, width, height);
            BitMatrix bitMatrix2 = new BitMatrix(width, height);
            calculateThresholdForBlock(matrix, i5, i7, width, height, calculateBlackPoints, bitMatrix2);
            this.matrix = bitMatrix2;
        } else {
            this.matrix = super.getBlackMatrix();
        }
        return this.matrix;
    }
}
