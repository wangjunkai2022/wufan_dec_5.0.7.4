package com.google.zxing.qrcode.encoder;
/* loaded from: classes3.dex */
final class MaskUtil {
    private MaskUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int applyMaskPenaltyRule1(ByteMatrix byteMatrix) {
        return applyMaskPenaltyRule1Internal(byteMatrix, true) + applyMaskPenaltyRule1Internal(byteMatrix, false);
    }

    private static int applyMaskPenaltyRule1Internal(ByteMatrix byteMatrix, boolean z4) {
        int height = z4 ? byteMatrix.getHeight() : byteMatrix.getWidth();
        int width = z4 ? byteMatrix.getWidth() : byteMatrix.getHeight();
        byte[][] array = byteMatrix.getArray();
        byte b5 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < width; i7++) {
                byte b6 = z4 ? array[i5][i7] : array[i7][i5];
                if (b6 == b5) {
                    i6++;
                    if (i6 == 5) {
                        i4 += 3;
                    } else if (i6 > 5) {
                        i4++;
                    }
                } else {
                    b5 = b6;
                    i6 = 1;
                }
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int applyMaskPenaltyRule2(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i4 = 0;
        for (int i5 = 0; i5 < height - 1; i5++) {
            int i6 = 0;
            while (i6 < width - 1) {
                byte b5 = array[i5][i6];
                int i7 = i6 + 1;
                if (b5 == array[i5][i7]) {
                    int i8 = i5 + 1;
                    if (b5 == array[i8][i6] && b5 == array[i8][i7]) {
                        i4 += 3;
                    }
                }
                i6 = i7;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int applyMaskPenaltyRule3(ByteMatrix byteMatrix) {
        int i4;
        int i5;
        int i6;
        int i7;
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            for (int i10 = 0; i10 < width; i10++) {
                int i11 = i10 + 6;
                if (i11 < width && array[i9][i10] == 1 && array[i9][i10 + 1] == 0 && array[i9][i10 + 2] == 1 && array[i9][i10 + 3] == 1 && array[i9][i10 + 4] == 1 && array[i9][i10 + 5] == 0 && array[i9][i11] == 1 && (((i6 = i10 + 10) < width && array[i9][i10 + 7] == 0 && array[i9][i10 + 8] == 0 && array[i9][i10 + 9] == 0 && array[i9][i6] == 0) || (i10 - 4 >= 0 && array[i9][i10 - 1] == 0 && array[i9][i10 - 2] == 0 && array[i9][i10 - 3] == 0 && array[i9][i7] == 0))) {
                    i8 += 40;
                }
                int i12 = i9 + 6;
                if (i12 < height && array[i9][i10] == 1 && array[i9 + 1][i10] == 0 && array[i9 + 2][i10] == 1 && array[i9 + 3][i10] == 1 && array[i9 + 4][i10] == 1 && array[i9 + 5][i10] == 0 && array[i12][i10] == 1 && (((i4 = i9 + 10) < height && array[i9 + 7][i10] == 0 && array[i9 + 8][i10] == 0 && array[i9 + 9][i10] == 0 && array[i4][i10] == 0) || (i9 - 4 >= 0 && array[i9 - 1][i10] == 0 && array[i9 - 2][i10] == 0 && array[i9 - 3][i10] == 0 && array[i5][i10] == 0))) {
                    i8 += 40;
                }
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int applyMaskPenaltyRule4(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i4 = 0;
        for (int i5 = 0; i5 < height; i5++) {
            for (int i6 = 0; i6 < width; i6++) {
                if (array[i5][i6] == 1) {
                    i4++;
                }
            }
        }
        double d5 = i4;
        double height2 = byteMatrix.getHeight() * byteMatrix.getWidth();
        Double.isNaN(d5);
        Double.isNaN(height2);
        return (Math.abs((int) (((d5 / height2) * 100.0d) - 50.0d)) / 5) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getDataMaskBit(int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (QRCode.isValidMaskPattern(i4)) {
            switch (i4) {
                case 0:
                    i6 += i5;
                case 1:
                    i7 = i6 & 1;
                    break;
                case 2:
                    i7 = i5 % 3;
                    break;
                case 3:
                    i7 = (i6 + i5) % 3;
                    break;
                case 4:
                    i8 = i6 >>> 1;
                    i9 = i5 / 3;
                    i10 = i8 + i9;
                    i7 = i10 & 1;
                    break;
                case 5:
                    int i11 = i6 * i5;
                    i7 = (i11 & 1) + (i11 % 3);
                    break;
                case 6:
                    int i12 = i6 * i5;
                    i10 = (i12 & 1) + (i12 % 3);
                    i7 = i10 & 1;
                    break;
                case 7:
                    i8 = (i6 * i5) % 3;
                    i9 = (i6 + i5) & 1;
                    i10 = i8 + i9;
                    i7 = i10 & 1;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid mask pattern: " + i4);
            }
            return i7 == 0;
        }
        throw new IllegalArgumentException("Invalid mask pattern");
    }
}
