package com.heepay.plugin.a;

import okio.Utf8;
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f14332a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f14333b = new byte[128];

    static {
        for (int i4 = 0; i4 < 128; i4++) {
            f14333b[i4] = -1;
        }
        for (int i5 = 65; i5 <= 90; i5++) {
            f14333b[i5] = (byte) (i5 - 65);
        }
        for (int i6 = 97; i6 <= 122; i6++) {
            f14333b[i6] = (byte) ((i6 - 97) + 26);
        }
        for (int i7 = 48; i7 <= 57; i7++) {
            f14333b[i7] = (byte) ((i7 - 48) + 52);
        }
        byte[] bArr = f14333b;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
    }

    public static String a(byte[] bArr) {
        int length = bArr.length % 3;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length == 0 ? (length2 * 4) / 3 : ((length2 / 3) + 1) * 4];
        int length3 = bArr.length - length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length3) {
            int i6 = bArr[i4] & 255;
            int i7 = bArr[i4 + 1] & 255;
            int i8 = bArr[i4 + 2] & 255;
            byte[] bArr3 = f14332a;
            bArr2[i5] = bArr3[(i6 >>> 2) & 63];
            bArr2[i5 + 1] = bArr3[((i6 << 4) | (i7 >>> 4)) & 63];
            bArr2[i5 + 2] = bArr3[((i7 << 2) | (i8 >>> 6)) & 63];
            bArr2[i5 + 3] = bArr3[i8 & 63];
            i4 += 3;
            i5 += 4;
        }
        if (length == 1) {
            int i9 = bArr[bArr.length - 1] & 255;
            byte[] bArr4 = f14332a;
            bArr2[bArr2.length - 4] = bArr4[(i9 >>> 2) & 63];
            bArr2[bArr2.length - 3] = bArr4[(i9 << 4) & 63];
            bArr2[bArr2.length - 2] = 61;
            bArr2[bArr2.length - 1] = 61;
        } else if (length == 2) {
            int i10 = bArr[bArr.length - 2] & 255;
            int i11 = bArr[bArr.length - 1] & 255;
            byte[] bArr5 = f14332a;
            bArr2[bArr2.length - 4] = bArr5[(i10 >>> 2) & 63];
            bArr2[bArr2.length - 3] = bArr5[((i10 << 4) | (i11 >>> 4)) & 63];
            bArr2[bArr2.length - 2] = bArr5[(i11 << 2) & 63];
            bArr2[bArr2.length - 1] = 61;
        }
        return new String(bArr2);
    }

    private static boolean a(byte b5) {
        if (b5 == 61) {
            return true;
        }
        return b5 >= 0 && b5 < 128 && f14333b[b5] != -1;
    }

    public static byte[] a(String str) {
        String b5 = b(str);
        byte[] bArr = new byte[b5.charAt(b5.length() + (-2)) == '=' ? (((b5.length() / 4) - 1) * 3) + 1 : b5.charAt(b5.length() + (-1)) == '=' ? (((b5.length() / 4) - 1) * 3) + 2 : (b5.length() / 4) * 3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < b5.length() - 4) {
            byte[] bArr2 = f14333b;
            byte b6 = bArr2[b5.charAt(i4)];
            byte b7 = bArr2[b5.charAt(i4 + 1)];
            byte b8 = bArr2[b5.charAt(i4 + 2)];
            byte b9 = bArr2[b5.charAt(i4 + 3)];
            bArr[i5] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr[i5 + 1] = (byte) ((b7 << 4) | (b8 >> 2));
            bArr[i5 + 2] = (byte) (b9 | (b8 << 6));
            i4 += 4;
            i5 += 3;
        }
        if (b5.charAt(b5.length() - 2) == '=') {
            byte[] bArr3 = f14333b;
            bArr[bArr.length - 1] = (byte) ((bArr3[b5.charAt(b5.length() - 3)] >> 4) | (bArr3[b5.charAt(b5.length() - 4)] << 2));
        } else if (b5.charAt(b5.length() - 1) == '=') {
            byte[] bArr4 = f14333b;
            byte b10 = bArr4[b5.charAt(b5.length() - 4)];
            byte b11 = bArr4[b5.charAt(b5.length() - 3)];
            byte b12 = bArr4[b5.charAt(b5.length() - 2)];
            bArr[bArr.length - 2] = (byte) ((b10 << 2) | (b11 >> 4));
            bArr[bArr.length - 1] = (byte) ((b12 >> 2) | (b11 << 4));
        } else {
            byte[] bArr5 = f14333b;
            byte b13 = bArr5[b5.charAt(b5.length() - 4)];
            byte b14 = bArr5[b5.charAt(b5.length() - 3)];
            byte b15 = bArr5[b5.charAt(b5.length() - 2)];
            byte b16 = bArr5[b5.charAt(b5.length() - 1)];
            bArr[bArr.length - 3] = (byte) ((b13 << 2) | (b14 >> 4));
            bArr[bArr.length - 2] = (byte) ((b14 << 4) | (b15 >> 2));
            bArr[bArr.length - 1] = (byte) (b16 | (b15 << 6));
        }
        return bArr;
    }

    private static String b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (a((byte) str.charAt(i4))) {
                stringBuffer.append(str.charAt(i4));
            }
        }
        return stringBuffer.toString();
    }
}
