package com.google.zxing.common;

import external.org.apache.commons.lang3.d;
/* loaded from: classes3.dex */
public final class BitArray {
    private int[] bits;
    private int size;

    public BitArray() {
        this.size = 0;
        this.bits = new int[1];
    }

    private void ensureCapacity(int i4) {
        if (i4 > (this.bits.length << 5)) {
            int[] makeArray = makeArray(i4);
            int[] iArr = this.bits;
            System.arraycopy(iArr, 0, makeArray, 0, iArr.length);
            this.bits = makeArray;
        }
    }

    private static int[] makeArray(int i4) {
        return new int[(i4 + 31) >> 5];
    }

    public void appendBit(boolean z4) {
        ensureCapacity(this.size + 1);
        if (z4) {
            int[] iArr = this.bits;
            int i4 = this.size;
            int i5 = i4 >> 5;
            iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
        }
        this.size++;
    }

    public void appendBitArray(BitArray bitArray) {
        int i4 = bitArray.size;
        ensureCapacity(this.size + i4);
        for (int i5 = 0; i5 < i4; i5++) {
            appendBit(bitArray.get(i5));
        }
    }

    public void appendBits(int i4, int i5) {
        if (i5 >= 0 && i5 <= 32) {
            ensureCapacity(this.size + i5);
            while (i5 > 0) {
                boolean z4 = true;
                if (((i4 >> (i5 - 1)) & 1) != 1) {
                    z4 = false;
                }
                appendBit(z4);
                i5--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public void clear() {
        int length = this.bits.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.bits[i4] = 0;
        }
    }

    public void flip(int i4) {
        int[] iArr = this.bits;
        int i5 = i4 >> 5;
        iArr[i5] = (1 << (i4 & 31)) ^ iArr[i5];
    }

    public boolean get(int i4) {
        return ((1 << (i4 & 31)) & this.bits[i4 >> 5]) != 0;
    }

    public int[] getBitArray() {
        return this.bits;
    }

    public int getNextSet(int i4) {
        int i5 = this.size;
        if (i4 >= i5) {
            return i5;
        }
        int i6 = i4 >> 5;
        int i7 = (((1 << (i4 & 31)) - 1) ^ (-1)) & this.bits[i6];
        while (i7 == 0) {
            i6++;
            int[] iArr = this.bits;
            if (i6 == iArr.length) {
                return this.size;
            }
            i7 = iArr[i6];
        }
        int numberOfTrailingZeros = (i6 << 5) + Integer.numberOfTrailingZeros(i7);
        int i8 = this.size;
        return numberOfTrailingZeros > i8 ? i8 : numberOfTrailingZeros;
    }

    public int getNextUnset(int i4) {
        int i5 = this.size;
        if (i4 >= i5) {
            return i5;
        }
        int i6 = i4 >> 5;
        int i7 = (((1 << (i4 & 31)) - 1) ^ (-1)) & (this.bits[i6] ^ (-1));
        while (i7 == 0) {
            i6++;
            int[] iArr = this.bits;
            if (i6 == iArr.length) {
                return this.size;
            }
            i7 = iArr[i6] ^ (-1);
        }
        int numberOfTrailingZeros = (i6 << 5) + Integer.numberOfTrailingZeros(i7);
        int i8 = this.size;
        return numberOfTrailingZeros > i8 ? i8 : numberOfTrailingZeros;
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeInBytes() {
        return (this.size + 7) >> 3;
    }

    public boolean isRange(int i4, int i5, boolean z4) {
        int i6;
        if (i5 >= i4) {
            if (i5 == i4) {
                return true;
            }
            int i7 = i5 - 1;
            int i8 = i4 >> 5;
            int i9 = i7 >> 5;
            int i10 = i8;
            while (i10 <= i9) {
                int i11 = i10 > i8 ? 0 : i4 & 31;
                int i12 = i10 < i9 ? 31 : i7 & 31;
                if (i11 == 0 && i12 == 31) {
                    i6 = -1;
                } else {
                    i6 = 0;
                    while (i11 <= i12) {
                        i6 |= 1 << i11;
                        i11++;
                    }
                }
                int i13 = this.bits[i10] & i6;
                if (!z4) {
                    i6 = 0;
                }
                if (i13 != i6) {
                    return false;
                }
                i10++;
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public void reverse() {
        int[] iArr = new int[this.bits.length];
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (get((i4 - i5) - 1)) {
                int i6 = i5 >> 5;
                iArr[i6] = (1 << (i5 & 31)) | iArr[i6];
            }
        }
        this.bits = iArr;
    }

    public void set(int i4) {
        int[] iArr = this.bits;
        int i5 = i4 >> 5;
        iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
    }

    public void setBulk(int i4, int i5) {
        this.bits[i4 >> 5] = i5;
    }

    public void setRange(int i4, int i5) {
        if (i5 < i4) {
            throw new IllegalArgumentException();
        }
        if (i5 == i4) {
            return;
        }
        int i6 = i5 - 1;
        int i7 = i4 >> 5;
        int i8 = i6 >> 5;
        int i9 = i7;
        while (i9 <= i8) {
            int i10 = 0;
            int i11 = i9 > i7 ? 0 : i4 & 31;
            int i12 = i9 < i8 ? 31 : i6 & 31;
            if (i11 == 0 && i12 == 31) {
                i10 = -1;
            } else {
                while (i11 <= i12) {
                    i10 |= 1 << i11;
                    i11++;
                }
            }
            int[] iArr = this.bits;
            iArr[i9] = i10 | iArr[i9];
            i9++;
        }
    }

    public void toBytes(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < 8; i9++) {
                if (get(i4)) {
                    i8 |= 1 << (7 - i9);
                }
                i4++;
            }
            bArr[i5 + i7] = (byte) i8;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.size);
        for (int i4 = 0; i4 < this.size; i4++) {
            if ((i4 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(get(i4) ? 'X' : d.f68897a);
        }
        return sb.toString();
    }

    public void xor(BitArray bitArray) {
        if (this.bits.length != bitArray.bits.length) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.bits;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = iArr[i4] ^ bitArray.bits[i4];
            i4++;
        }
    }

    public BitArray(int i4) {
        this.size = i4;
        this.bits = makeArray(i4);
    }
}
