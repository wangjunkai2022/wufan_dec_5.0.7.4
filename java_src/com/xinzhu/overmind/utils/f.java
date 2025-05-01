package com.xinzhu.overmind.utils;
/* compiled from: ContainerHelpers.java */
/* loaded from: classes6.dex */
class f {
    f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int[] iArr, int i4, int i5) {
        int i6 = i4 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else if (i9 <= i5) {
                return i8;
            } else {
                i6 = i8 - 1;
            }
        }
        return i7 ^ (-1);
    }

    static int b(long[] jArr, int i4, long j4) {
        int i5 = i4 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            long j5 = jArr[i7];
            if (j5 < j4) {
                i6 = i7 + 1;
            } else if (j5 <= j4) {
                return i7;
            } else {
                i5 = i7 - 1;
            }
        }
        return i6 ^ (-1);
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj == obj2 || obj.equals(obj2);
    }
}
