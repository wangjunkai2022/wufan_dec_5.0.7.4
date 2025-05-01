package com.switfpass.pay.utils;

import com.android.dx.io.Opcodes;
import okio.Utf8;
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f61834a = new byte[128];

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f61835b = new char[64];

    static {
        int i4;
        int i5;
        int i6 = 0;
        for (int i7 = 0; i7 < 128; i7++) {
            f61834a[i7] = -1;
        }
        for (int i8 = 90; i8 >= 65; i8--) {
            f61834a[i8] = (byte) (i8 - 65);
        }
        int i9 = 122;
        while (true) {
            i4 = 26;
            if (i9 < 97) {
                break;
            }
            f61834a[i9] = (byte) ((i9 - 97) + 26);
            i9--;
        }
        int i10 = 57;
        while (true) {
            i5 = 52;
            if (i10 < 48) {
                break;
            }
            f61834a[i10] = (byte) ((i10 - 48) + 52);
            i10--;
        }
        byte[] bArr = f61834a;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
        for (int i11 = 0; i11 <= 25; i11++) {
            f61835b[i11] = (char) (i11 + 65);
        }
        int i12 = 0;
        while (i4 <= 51) {
            f61835b[i4] = (char) (i12 + 97);
            i4++;
            i12++;
        }
        while (i5 <= 61) {
            f61835b[i5] = (char) (i6 + 48);
            i5++;
            i6++;
        }
        char[] cArr = f61835b;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    private static boolean a(char c5) {
        return c5 == '=';
    }

    private static boolean b(char c5) {
        return c5 < 128 && f61834a[c5] != -1;
    }

    public static byte[] c(String str) {
        int i4;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i4 = 0;
        } else {
            int length = charArray.length;
            i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                char c5 = charArray[i5];
                if (!(c5 == ' ' || c5 == '\r' || c5 == '\n' || c5 == '\t')) {
                    charArray[i4] = charArray[i5];
                    i4++;
                }
            }
        }
        if (i4 % 4 != 0) {
            return null;
        }
        int i6 = i4 / 4;
        if (i6 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i6 * 3];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i6 - 1) {
            int i10 = i8 + 1;
            char c6 = charArray[i8];
            if (b(c6)) {
                int i11 = i10 + 1;
                char c7 = charArray[i10];
                if (b(c7)) {
                    int i12 = i11 + 1;
                    char c8 = charArray[i11];
                    if (b(c8)) {
                        int i13 = i12 + 1;
                        char c9 = charArray[i12];
                        if (b(c9)) {
                            byte[] bArr2 = f61834a;
                            byte b5 = bArr2[c6];
                            byte b6 = bArr2[c7];
                            byte b7 = bArr2[c8];
                            byte b8 = bArr2[c9];
                            int i14 = i9 + 1;
                            bArr[i9] = (byte) ((b5 << 2) | (b6 >> 4));
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((b6 & 15) << 4) | ((b7 >> 2) & 15));
                            i9 = i15 + 1;
                            bArr[i15] = (byte) ((b7 << 6) | b8);
                            i7++;
                            i8 = i13;
                        }
                    }
                }
            }
            return null;
        }
        int i16 = i8 + 1;
        char c10 = charArray[i8];
        if (b(c10)) {
            int i17 = i16 + 1;
            char c11 = charArray[i16];
            if (b(c11)) {
                byte[] bArr3 = f61834a;
                byte b9 = bArr3[c10];
                byte b10 = bArr3[c11];
                int i18 = i17 + 1;
                char c12 = charArray[i17];
                char c13 = charArray[i18];
                if (b(c12) && b(c13)) {
                    byte b11 = bArr3[c12];
                    byte b12 = bArr3[c13];
                    int i19 = i9 + 1;
                    bArr[i9] = (byte) ((b9 << 2) | (b10 >> 4));
                    bArr[i19] = (byte) (((b10 & 15) << 4) | ((b11 >> 2) & 15));
                    bArr[i19 + 1] = (byte) (b12 | (b11 << 6));
                    return bArr;
                } else if (a(c12) && a(c13)) {
                    if ((b10 & 15) != 0) {
                        return null;
                    }
                    int i20 = i7 * 3;
                    byte[] bArr4 = new byte[i20 + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, i20);
                    bArr4[i9] = (byte) ((b9 << 2) | (b10 >> 4));
                    return bArr4;
                } else if (a(c12) || !a(c13)) {
                    return null;
                } else {
                    byte b13 = bArr3[c12];
                    if ((b13 & 3) != 0) {
                        return null;
                    }
                    int i21 = i7 * 3;
                    byte[] bArr5 = new byte[i21 + 2];
                    System.arraycopy(bArr, 0, bArr5, 0, i21);
                    bArr5[i9] = (byte) ((b9 << 2) | (b10 >> 4));
                    bArr5[i9 + 1] = (byte) (((b13 >> 2) & 15) | ((b10 & 15) << 4));
                    return bArr5;
                }
            }
            return null;
        }
        return null;
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length << 3;
        if (length == 0) {
            return "";
        }
        int i4 = length % 24;
        int i5 = length / 24;
        char[] cArr = new char[(i4 != 0 ? i5 + 1 : i5) << 2];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5) {
            int i9 = i7 + 1;
            byte b5 = bArr[i7];
            int i10 = i9 + 1;
            byte b6 = bArr[i9];
            int i11 = i10 + 1;
            byte b7 = bArr[i10];
            byte b8 = (byte) (b6 & 15);
            byte b9 = (byte) (b5 & 3);
            int i12 = b5 & Byte.MIN_VALUE;
            int i13 = b5 >> 2;
            if (i12 != 0) {
                i13 ^= 192;
            }
            byte b10 = (byte) i13;
            int i14 = b6 & Byte.MIN_VALUE;
            int i15 = b6 >> 4;
            if (i14 != 0) {
                i15 ^= 240;
            }
            byte b11 = (byte) i15;
            int i16 = (b7 & Byte.MIN_VALUE) == 0 ? b7 >> 6 : (b7 >> 6) ^ Opcodes.INVOKE_CUSTOM;
            int i17 = i8 + 1;
            char[] cArr2 = f61835b;
            cArr[i8] = cArr2[b10];
            int i18 = i17 + 1;
            cArr[i17] = cArr2[(b9 << 4) | b11];
            int i19 = i18 + 1;
            cArr[i18] = cArr2[(b8 << 2) | ((byte) i16)];
            cArr[i19] = cArr2[b7 & Utf8.REPLACEMENT_BYTE];
            i6++;
            i8 = i19 + 1;
            i7 = i11;
        }
        if (i4 == 8) {
            byte b12 = bArr[i7];
            byte b13 = (byte) (b12 & 3);
            int i20 = b12 & Byte.MIN_VALUE;
            int i21 = b12 >> 2;
            if (i20 != 0) {
                i21 ^= 192;
            }
            int i22 = i8 + 1;
            char[] cArr3 = f61835b;
            cArr[i8] = cArr3[(byte) i21];
            int i23 = i22 + 1;
            cArr[i22] = cArr3[b13 << 4];
            cArr[i23] = '=';
            cArr[i23 + 1] = '=';
        } else if (i4 == 16) {
            byte b14 = bArr[i7];
            byte b15 = bArr[i7 + 1];
            byte b16 = (byte) (b15 & 15);
            byte b17 = (byte) (b14 & 3);
            int i24 = b14 & Byte.MIN_VALUE;
            int i25 = b14 >> 2;
            if (i24 != 0) {
                i25 ^= 192;
            }
            byte b18 = (byte) i25;
            int i26 = b15 & Byte.MIN_VALUE;
            int i27 = b15 >> 4;
            if (i26 != 0) {
                i27 ^= 240;
            }
            int i28 = i8 + 1;
            char[] cArr4 = f61835b;
            cArr[i8] = cArr4[b18];
            int i29 = i28 + 1;
            cArr[i28] = cArr4[((byte) i27) | (b17 << 4)];
            cArr[i29] = cArr4[b16 << 2];
            cArr[i29 + 1] = '=';
        }
        return new String(cArr);
    }
}
