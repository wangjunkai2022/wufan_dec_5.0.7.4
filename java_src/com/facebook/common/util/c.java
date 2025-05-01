package com.facebook.common.util;
/* compiled from: Hex.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f10917a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f10918b = new char[256];

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f10919c = new char[256];

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f10920d;

    static {
        for (int i4 = 0; i4 < 256; i4++) {
            char[] cArr = f10918b;
            char[] cArr2 = f10917a;
            cArr[i4] = cArr2[(i4 >> 4) & 15];
            f10919c[i4] = cArr2[i4 & 15];
        }
        f10920d = new byte[103];
        for (int i5 = 0; i5 <= 70; i5++) {
            f10920d[i5] = -1;
        }
        for (byte b5 = 0; b5 < 10; b5 = (byte) (b5 + 1)) {
            f10920d[b5 + 48] = b5;
        }
        for (byte b6 = 0; b6 < 6; b6 = (byte) (b6 + 1)) {
            byte[] bArr = f10920d;
            byte b7 = (byte) (b6 + 10);
            bArr[b6 + 65] = b7;
            bArr[b6 + 97] = b7;
        }
    }

    public static String a(int i4) {
        if (i4 <= 255 && i4 >= 0) {
            return String.valueOf(f10918b[i4]) + String.valueOf(f10919c[i4]);
        }
        throw new IllegalArgumentException("The int converting to hex should be in range 0~255");
    }

    public static byte[] b(String str) {
        byte[] bArr;
        byte b5;
        byte b6;
        int length = str.length();
        if ((length & 1) == 0) {
            byte[] bArr2 = new byte[length >> 1];
            boolean z4 = false;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i4 + 1;
                char charAt = str.charAt(i4);
                if (charAt <= 'f' && (b5 = (bArr = f10920d)[charAt]) != -1) {
                    int i7 = i6 + 1;
                    char charAt2 = str.charAt(i6);
                    if (charAt2 <= 'f' && (b6 = bArr[charAt2]) != -1) {
                        bArr2[i5] = (byte) ((b5 << 4) | b6);
                        i5++;
                        i4 = i7;
                    }
                }
                z4 = true;
            }
            if (z4) {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + str);
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }

    public static String c(byte[] bArr, boolean z4) {
        int i4;
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        for (int i6 = 0; i6 < bArr.length && ((i4 = bArr[i6] & 255) != 0 || !z4); i6++) {
            int i7 = i5 + 1;
            cArr[i5] = f10918b[i4];
            i5 = i7 + 1;
            cArr[i7] = f10919c[i4];
        }
        return new String(cArr, 0, i5);
    }

    public static byte[] d(String str) {
        return b(str.replaceAll(" ", ""));
    }
}
