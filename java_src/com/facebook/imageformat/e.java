package com.facebook.imageformat;

import com.facebook.common.internal.h;
import java.io.UnsupportedEncodingException;
/* compiled from: ImageFormatCheckerUtils.java */
/* loaded from: classes2.dex */
public class e {
    private e() {
    }

    public static byte[] a(String str) {
        h.i(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("ASCII not found!", e5);
        }
    }

    public static int b(byte[] bArr, int i4, byte[] bArr2, int i5) {
        h.i(bArr);
        h.i(bArr2);
        if (i5 > i4) {
            return -1;
        }
        int i6 = 0;
        byte b5 = bArr2[0];
        int i7 = i4 - i5;
        while (i6 <= i7) {
            if (bArr[i6] != b5) {
                do {
                    i6++;
                    if (i6 > i7) {
                        break;
                    }
                } while (bArr[i6] != b5);
            }
            if (i6 <= i7) {
                int i8 = i6 + 1;
                int i9 = (i8 + i5) - 1;
                for (int i10 = 1; i8 < i9 && bArr[i8] == bArr2[i10]; i10++) {
                    i8++;
                }
                if (i8 == i9) {
                    return i6;
                }
            }
            i6++;
        }
        return -1;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        h.i(bArr);
        h.i(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < bArr2.length; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }
}
