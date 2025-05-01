package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;
/* loaded from: classes3.dex */
final class BarcodeMatrix {
    private int currentRow;
    private final int height;
    private final BarcodeRow[] matrix;
    private final int width;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BarcodeMatrix(int i4, int i5) {
        int i6 = i4 + 2;
        BarcodeRow[] barcodeRowArr = new BarcodeRow[i6];
        this.matrix = barcodeRowArr;
        int length = barcodeRowArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.matrix[i7] = new BarcodeRow(((i5 + 4) * 17) + 1);
        }
        this.width = i5 * 17;
        this.height = i6;
        this.currentRow = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BarcodeRow getCurrentRow() {
        return this.matrix[this.currentRow];
    }

    byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    byte[][] getScaledMatrix(int i4) {
        return getScaledMatrix(i4, i4);
    }

    void set(int i4, int i5, byte b5) {
        this.matrix[i5].set(i4, b5);
    }

    void setMatrix(int i4, int i5, boolean z4) {
        set(i4, i5, z4 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startRow() {
        this.currentRow++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[][] getScaledMatrix(int i4, int i5) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, this.height * i5, this.width * i4);
        int i6 = this.height * i5;
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[(i6 - i7) - 1] = this.matrix[i7 / i5].getScaledRow(i4);
        }
        return bArr;
    }
}
