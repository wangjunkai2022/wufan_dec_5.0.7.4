package com.facebook.common.internal;
/* compiled from: Ints.java */
/* loaded from: classes2.dex */
public class f {
    private f() {
    }

    public static int a(int... iArr) {
        h.d(iArr.length > 0);
        int i4 = iArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            if (iArr[i5] > i4) {
                i4 = iArr[i5];
            }
        }
        return i4;
    }
}
