package com.alipay.security.mobile.module.commonutils.crypto;
/* loaded from: classes2.dex */
public final class b {
    private b() {
    }

    public static boolean a(byte[] bArr) {
        if (bArr != null && bArr.length >= 20) {
            for (int i4 = 0; i4 < 20; i4++) {
                bArr[i4 + 0] = 0;
            }
            return true;
        }
        return false;
    }

    private static boolean b(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        if (bArr == null || bArr2 == null || i6 <= 0 || bArr.length < i4 + i6 || bArr2.length < i5 + i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i4 + i7] != bArr2[i5 + i7]) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(byte[] bArr, byte[] bArr2, int i4) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (i4 >= bArr.length) {
            return true;
        }
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            int i6 = i5 + i4;
            if (i6 + 1 > bArr.length) {
                break;
            }
            bArr[i6] = bArr2[i5];
        }
        return true;
    }
}
