package com.bytedance.pangle.util;

import androidx.annotation.Nullable;
/* loaded from: classes2.dex */
public final class d {
    public static <T> boolean a(@Nullable T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> boolean a(@Nullable T[] tArr, T[] tArr2) {
        if (tArr2 == null) {
            return true;
        }
        for (T t4 : tArr2) {
            if (!a(tArr, t4)) {
                return false;
            }
        }
        return true;
    }

    private static <T> boolean a(@Nullable T[] tArr, T t4) {
        int i4;
        if (tArr != null) {
            i4 = 0;
            while (i4 < tArr.length) {
                if (tArr[i4] == t4 || (tArr[i4] != null && tArr[i4].equals(t4))) {
                    break;
                }
                i4++;
            }
        }
        i4 = -1;
        return i4 != -1;
    }
}
