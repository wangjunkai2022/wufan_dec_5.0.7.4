package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class l {
    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i4 = 0; i4 < 256; i4++) {
            bArr2[i4] = bArr[i4 >>> 4];
            bArr3[i4] = bArr[i4 & 15];
        }
    }

    public static boolean a(int i4, int i5) {
        return i4 == i5;
    }

    public static boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static boolean a(boolean z4, boolean z5) {
        return z4 == z5;
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }
}
