package com.google.zxing.common;
/* loaded from: classes3.dex */
public final class BitMatrix {
    private final int[] bits;
    private final int height;
    private final int rowSize;
    private final int width;

    public BitMatrix(int i4) {
        this(i4, i4);
    }

    public void clear() {
        int length = this.bits.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.bits[i4] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        if (this.width != bitMatrix.width || this.height != bitMatrix.height || this.rowSize != bitMatrix.rowSize || this.bits.length != bitMatrix.bits.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.bits;
            if (i4 >= iArr.length) {
                return true;
            }
            if (iArr[i4] != bitMatrix.bits[i4]) {
                return false;
            }
            i4++;
        }
    }

    public void flip(int i4, int i5) {
        int i6 = (i5 * this.rowSize) + (i4 >> 5);
        int[] iArr = this.bits;
        iArr[i6] = (1 << (i4 & 31)) ^ iArr[i6];
    }

    public boolean get(int i4, int i5) {
        return ((this.bits[(i5 * this.rowSize) + (i4 >> 5)] >>> (i4 & 31)) & 1) != 0;
    }

    public int[] getBottomRightOnBit() {
        int length = this.bits.length - 1;
        while (length >= 0 && this.bits[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i4 = this.rowSize;
        int i5 = length / i4;
        int i6 = (length % i4) << 5;
        int i7 = 31;
        while ((this.bits[length] >>> i7) == 0) {
            i7--;
        }
        return new int[]{i6 + i7, i5};
    }

    public int[] getEnclosingRectangle() {
        int i4 = this.width;
        int i5 = this.height;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < this.height; i8++) {
            int i9 = 0;
            while (true) {
                int i10 = this.rowSize;
                if (i9 < i10) {
                    int i11 = this.bits[(i10 * i8) + i9];
                    if (i11 != 0) {
                        if (i8 < i5) {
                            i5 = i8;
                        }
                        if (i8 > i7) {
                            i7 = i8;
                        }
                        int i12 = i9 * 32;
                        if (i12 < i4) {
                            int i13 = 0;
                            while ((i11 << (31 - i13)) == 0) {
                                i13++;
                            }
                            int i14 = i13 + i12;
                            if (i14 < i4) {
                                i4 = i14;
                            }
                        }
                        if (i12 + 31 > i6) {
                            int i15 = 31;
                            while ((i11 >>> i15) == 0) {
                                i15--;
                            }
                            int i16 = i12 + i15;
                            if (i16 > i6) {
                                i6 = i16;
                            }
                        }
                    }
                    i9++;
                }
            }
        }
        int i17 = i6 - i4;
        int i18 = i7 - i5;
        if (i17 < 0 || i18 < 0) {
            return null;
        }
        return new int[]{i4, i5, i17, i18};
    }

    public int getHeight() {
        return this.height;
    }

    public BitArray getRow(int i4, BitArray bitArray) {
        if (bitArray == null || bitArray.getSize() < this.width) {
            bitArray = new BitArray(this.width);
        }
        int i5 = i4 * this.rowSize;
        for (int i6 = 0; i6 < this.rowSize; i6++) {
            bitArray.setBulk(i6 << 5, this.bits[i5 + i6]);
        }
        return bitArray;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i4 = 0;
        while (true) {
            iArr = this.bits;
            if (i4 >= iArr.length || iArr[i4] != 0) {
                break;
            }
            i4++;
        }
        if (i4 == iArr.length) {
            return null;
        }
        int i5 = this.rowSize;
        int i6 = i4 / i5;
        int i7 = (i4 % i5) << 5;
        int i8 = iArr[i4];
        int i9 = 0;
        while ((i8 << (31 - i9)) == 0) {
            i9++;
        }
        return new int[]{i7 + i9, i6};
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i4 = this.width;
        int i5 = (((((i4 * 31) + i4) * 31) + this.height) * 31) + this.rowSize;
        for (int i6 : this.bits) {
            i5 = (i5 * 31) + i6;
        }
        return i5;
    }

    public void set(int i4, int i5) {
        int i6 = (i5 * this.rowSize) + (i4 >> 5);
        int[] iArr = this.bits;
        iArr[i6] = (1 << (i4 & 31)) | iArr[i6];
    }

    public void setRegion(int i4, int i5, int i6, int i7) {
        if (i5 < 0 || i4 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i7 >= 1 && i6 >= 1) {
            int i8 = i6 + i4;
            int i9 = i7 + i5;
            if (i9 > this.height || i8 > this.width) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i5 < i9) {
                int i10 = this.rowSize * i5;
                for (int i11 = i4; i11 < i8; i11++) {
                    int[] iArr = this.bits;
                    int i12 = (i11 >> 5) + i10;
                    iArr[i12] = iArr[i12] | (1 << (i11 & 31));
                }
                i5++;
            }
            return;
        }
        throw new IllegalArgumentException("Height and width must be at least 1");
    }

    public void setRow(int i4, BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int[] iArr = this.bits;
        int i5 = this.rowSize;
        System.arraycopy(bitArray2, 0, iArr, i4 * i5, i5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.height * (this.width + 1));
        for (int i4 = 0; i4 < this.height; i4++) {
            for (int i5 = 0; i5 < this.width; i5++) {
                sb.append(get(i5, i4) ? "X " : "  ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public BitMatrix(int i4, int i5) {
        if (i4 >= 1 && i5 >= 1) {
            this.width = i4;
            this.height = i5;
            int i6 = (i4 + 31) >> 5;
            this.rowSize = i6;
            this.bits = new int[i6 * i5];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }
}
