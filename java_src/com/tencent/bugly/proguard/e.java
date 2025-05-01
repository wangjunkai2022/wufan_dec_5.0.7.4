package com.tencent.bugly.proguard;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f62621a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b5 = bArr[i4];
            int i5 = i4 * 2;
            char[] cArr2 = f62621a;
            cArr[i5 + 1] = cArr2[b5 & 15];
            cArr[i5] = cArr2[((byte) (b5 >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
