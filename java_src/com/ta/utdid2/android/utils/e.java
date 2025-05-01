package com.ta.utdid2.android.utils;
/* loaded from: classes5.dex */
public class e {
    public static byte[] a(int i4) {
        byte[] bArr = {(byte) ((r3 >> 8) % 256), (byte) (r3 % 256), (byte) (r3 % 256), (byte) (i4 % 256)};
        int i5 = i4 >> 8;
        int i6 = i5 >> 8;
        return bArr;
    }

    public static byte[] b(byte[] bArr, int i4) {
        if (bArr.length == 4) {
            bArr[3] = (byte) (i4 % 256);
            int i5 = i4 >> 8;
            bArr[2] = (byte) (i5 % 256);
            int i6 = i5 >> 8;
            bArr[1] = (byte) (i6 % 256);
            bArr[0] = (byte) ((i6 >> 8) % 256);
            return bArr;
        }
        return null;
    }
}
