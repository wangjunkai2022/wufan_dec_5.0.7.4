package com.tencent.stat.common;
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f62954a = "03a976511e2cbe3a7f26808fb7af3c05".getBytes();

    public static byte[] a(byte[] bArr) {
        return a(bArr, f62954a);
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int length = bArr2.length;
        if (length < 1 || length > 256) {
            throw new IllegalArgumentException("key must be between 1 and 256 bytes");
        }
        for (int i4 = 0; i4 < 256; i4++) {
            iArr[i4] = i4;
            iArr2[i4] = bArr2[i4 % length];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            i5 = (i5 + iArr[i6] + iArr2[i6]) & 255;
            int i7 = iArr[i6];
            iArr[i6] = iArr[i5];
            iArr[i5] = i7;
        }
        byte[] bArr3 = new byte[bArr.length];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            i8 = (i8 + 1) & 255;
            i9 = (i9 + iArr[i8]) & 255;
            int i11 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i11;
            bArr3[i10] = (byte) (iArr[(iArr[i8] + iArr[i9]) & 255] ^ bArr[i10]);
        }
        return bArr3;
    }

    public static byte[] b(byte[] bArr) {
        return b(bArr, f62954a);
    }

    static byte[] b(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2);
    }
}
