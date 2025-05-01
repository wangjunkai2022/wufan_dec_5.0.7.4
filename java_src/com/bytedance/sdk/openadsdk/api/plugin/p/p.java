package com.bytedance.sdk.openadsdk.api.plugin.p;

import java.util.Objects;
/* loaded from: classes2.dex */
public class p {
    private static final char[] vv = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String vv(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return vv(bArr, 0, bArr.length);
    }

    public static String vv(byte[] bArr, int i4, int i5) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i4 >= 0 && i4 + i5 <= bArr.length) {
            int i6 = i5 * 2;
            char[] cArr = new char[i6];
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = bArr[i8 + i4] & 255;
                int i10 = i7 + 1;
                char[] cArr2 = vv;
                cArr[i7] = cArr2[i9 >> 4];
                i7 = i10 + 1;
                cArr[i10] = cArr2[i9 & 15];
            }
            return new String(cArr, 0, i6);
        }
        throw new IndexOutOfBoundsException();
    }
}
