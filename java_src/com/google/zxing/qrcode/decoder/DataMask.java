package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;
/* loaded from: classes3.dex */
abstract class DataMask {
    private static final DataMask[] DATA_MASKS = {new DataMask000(), new DataMask001(), new DataMask010(), new DataMask011(), new DataMask100(), new DataMask101(), new DataMask110(), new DataMask111()};

    /* loaded from: classes3.dex */
    private static class DataMask000 extends DataMask {
        private DataMask000() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            return ((i4 + i5) & 1) == 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class DataMask001 extends DataMask {
        private DataMask001() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            return (i4 & 1) == 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class DataMask010 extends DataMask {
        private DataMask010() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            return i5 % 3 == 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class DataMask011 extends DataMask {
        private DataMask011() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            return (i4 + i5) % 3 == 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class DataMask100 extends DataMask {
        private DataMask100() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            return (((i4 >>> 1) + (i5 / 3)) & 1) == 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class DataMask101 extends DataMask {
        private DataMask101() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            int i6 = i4 * i5;
            return (i6 & 1) + (i6 % 3) == 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class DataMask110 extends DataMask {
        private DataMask110() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            int i6 = i4 * i5;
            return (((i6 & 1) + (i6 % 3)) & 1) == 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class DataMask111 extends DataMask {
        private DataMask111() {
            super();
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i4, int i5) {
            return ((((i4 + i5) & 1) + ((i4 * i5) % 3)) & 1) == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DataMask forReference(int i4) {
        if (i4 >= 0 && i4 <= 7) {
            return DATA_MASKS[i4];
        }
        throw new IllegalArgumentException();
    }

    abstract boolean isMasked(int i4, int i5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void unmaskBitMatrix(BitMatrix bitMatrix, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                if (isMasked(i5, i6)) {
                    bitMatrix.flip(i6, i5);
                }
            }
        }
    }

    private DataMask() {
    }
}
