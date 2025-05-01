package com.join.mgps.Util;

import com.android.dx.io.Opcodes;
import okio.Utf8;
/* compiled from: Base64.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final int f27892a = 128;

    /* renamed from: b  reason: collision with root package name */
    private static final int f27893b = 64;

    /* renamed from: c  reason: collision with root package name */
    private static final int f27894c = 24;

    /* renamed from: d  reason: collision with root package name */
    private static final int f27895d = 8;

    /* renamed from: e  reason: collision with root package name */
    private static final int f27896e = 16;

    /* renamed from: f  reason: collision with root package name */
    private static final int f27897f = 4;

    /* renamed from: g  reason: collision with root package name */
    private static final int f27898g = -128;

    /* renamed from: h  reason: collision with root package name */
    private static char f27899h = '=';

    /* renamed from: i  reason: collision with root package name */
    private static byte[] f27900i = new byte[128];

    /* renamed from: j  reason: collision with root package name */
    private static char[] f27901j = new char[64];

    static {
        int i4;
        int i5;
        int i6 = 0;
        for (int i7 = 0; i7 < 128; i7++) {
            f27900i[i7] = -1;
        }
        for (int i8 = 90; i8 >= 65; i8--) {
            f27900i[i8] = (byte) (i8 - 65);
        }
        int i9 = 122;
        while (true) {
            i4 = 26;
            if (i9 < 97) {
                break;
            }
            f27900i[i9] = (byte) ((i9 - 97) + 26);
            i9--;
        }
        int i10 = 57;
        while (true) {
            i5 = 52;
            if (i10 < 48) {
                break;
            }
            f27900i[i10] = (byte) ((i10 - 48) + 52);
            i10--;
        }
        byte[] bArr = f27900i;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
        for (int i11 = 0; i11 <= 25; i11++) {
            f27901j[i11] = (char) (i11 + 65);
        }
        int i12 = 0;
        while (i4 <= 51) {
            f27901j[i4] = (char) (i12 + 97);
            i4++;
            i12++;
        }
        while (i5 <= 61) {
            f27901j[i5] = (char) (i6 + 48);
            i5++;
            i6++;
        }
        char[] cArr = f27901j;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int f5 = f(charArray);
        if (f5 % 4 != 0) {
            return null;
        }
        int i4 = f5 / 4;
        if (i4 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i4 * 3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i4 - 1) {
            int i8 = i6 + 1;
            char c5 = charArray[i6];
            if (c(c5)) {
                int i9 = i8 + 1;
                char c6 = charArray[i8];
                if (c(c6)) {
                    int i10 = i9 + 1;
                    char c7 = charArray[i9];
                    if (c(c7)) {
                        int i11 = i10 + 1;
                        char c8 = charArray[i10];
                        if (c(c8)) {
                            byte[] bArr2 = f27900i;
                            byte b5 = bArr2[c5];
                            byte b6 = bArr2[c6];
                            byte b7 = bArr2[c7];
                            byte b8 = bArr2[c8];
                            int i12 = i7 + 1;
                            bArr[i7] = (byte) ((b5 << 2) | (b6 >> 4));
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((b6 & 15) << 4) | ((b7 >> 2) & 15));
                            i7 = i13 + 1;
                            bArr[i13] = (byte) ((b7 << 6) | b8);
                            i5++;
                            i6 = i11;
                        }
                    }
                }
            }
            return null;
        }
        int i14 = i6 + 1;
        char c9 = charArray[i6];
        if (c(c9)) {
            int i15 = i14 + 1;
            char c10 = charArray[i14];
            if (c(c10)) {
                byte[] bArr3 = f27900i;
                byte b9 = bArr3[c9];
                byte b10 = bArr3[c10];
                int i16 = i15 + 1;
                char c11 = charArray[i15];
                char c12 = charArray[i16];
                if (c(c11) && c(c12)) {
                    byte[] bArr4 = f27900i;
                    byte b11 = bArr4[c11];
                    byte b12 = bArr4[c12];
                    int i17 = i7 + 1;
                    bArr[i7] = (byte) ((b9 << 2) | (b10 >> 4));
                    bArr[i17] = (byte) (((b10 & 15) << 4) | ((b11 >> 2) & 15));
                    bArr[i17 + 1] = (byte) (b12 | (b11 << 6));
                    return bArr;
                } else if (d(c11) && d(c12)) {
                    if ((b10 & 15) != 0) {
                        return null;
                    }
                    int i18 = i5 * 3;
                    byte[] bArr5 = new byte[i18 + 1];
                    System.arraycopy(bArr, 0, bArr5, 0, i18);
                    bArr5[i7] = (byte) ((b9 << 2) | (b10 >> 4));
                    return bArr5;
                } else if (d(c11) || !d(c12)) {
                    return null;
                } else {
                    byte b13 = f27900i[c11];
                    if ((b13 & 3) != 0) {
                        return null;
                    }
                    int i19 = i5 * 3;
                    byte[] bArr6 = new byte[i19 + 2];
                    System.arraycopy(bArr, 0, bArr6, 0, i19);
                    bArr6[i7] = (byte) ((b9 << 2) | (b10 >> 4));
                    bArr6[i7 + 1] = (byte) (((b13 >> 2) & 15) | ((b10 & 15) << 4));
                    return bArr6;
                }
            }
            return null;
        }
        return null;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i4 = length % 24;
        int i5 = length / 24;
        char[] cArr = new char[(i4 != 0 ? i5 + 1 : i5) * 4];
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
            byte b10 = (byte) ((b5 & Byte.MIN_VALUE) == 0 ? b5 >> 2 : (b5 >> 2) ^ 192);
            byte b11 = (byte) ((b6 & Byte.MIN_VALUE) == 0 ? b6 >> 4 : (b6 >> 4) ^ 240);
            int i12 = (b7 & Byte.MIN_VALUE) == 0 ? b7 >> 6 : (b7 >> 6) ^ Opcodes.INVOKE_CUSTOM;
            int i13 = i8 + 1;
            char[] cArr2 = f27901j;
            cArr[i8] = cArr2[b10];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(b9 << 4) | b11];
            int i15 = i14 + 1;
            cArr[i14] = cArr2[(b8 << 2) | ((byte) i12)];
            cArr[i15] = cArr2[b7 & Utf8.REPLACEMENT_BYTE];
            i6++;
            i8 = i15 + 1;
            i7 = i11;
        }
        if (i4 == 8) {
            byte b12 = bArr[i7];
            byte b13 = (byte) (b12 & 3);
            int i16 = (b12 & Byte.MIN_VALUE) == 0 ? b12 >> 2 : (b12 >> 2) ^ 192;
            int i17 = i8 + 1;
            char[] cArr3 = f27901j;
            cArr[i8] = cArr3[(byte) i16];
            int i18 = i17 + 1;
            cArr[i17] = cArr3[b13 << 4];
            char c5 = f27899h;
            cArr[i18] = c5;
            cArr[i18 + 1] = c5;
        } else if (i4 == 16) {
            byte b14 = bArr[i7];
            byte b15 = bArr[i7 + 1];
            byte b16 = (byte) (b15 & 15);
            byte b17 = (byte) (b14 & 3);
            byte b18 = (byte) ((b14 & Byte.MIN_VALUE) == 0 ? b14 >> 2 : (b14 >> 2) ^ 192);
            int i19 = (b15 & Byte.MIN_VALUE) == 0 ? b15 >> 4 : (b15 >> 4) ^ 240;
            int i20 = i8 + 1;
            char[] cArr4 = f27901j;
            cArr[i8] = cArr4[b18];
            int i21 = i20 + 1;
            cArr[i20] = cArr4[((byte) i19) | (b17 << 4)];
            cArr[i21] = cArr4[b16 << 2];
            cArr[i21 + 1] = f27899h;
        }
        return new String(cArr);
    }

    private static boolean c(char c5) {
        return c5 < 128 && f27900i[c5] != -1;
    }

    private static boolean d(char c5) {
        return c5 == f27899h;
    }

    private static boolean e(char c5) {
        return c5 == ' ' || c5 == '\r' || c5 == '\n' || c5 == '\t';
    }

    private static int f(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (!e(cArr[i5])) {
                cArr[i4] = cArr[i5];
                i4++;
            }
        }
        return i4;
    }
}
