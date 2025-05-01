package com.xinzhu.overmind.utils.helpers;

import com.xinzhu.overmind.Overmind;
/* compiled from: ArgReplaceHelper.java */
/* loaded from: classes.dex */
public class c {
    public static int a(Object[] objArr, Class<?> cls) {
        return b(objArr, cls, 0);
    }

    public static int b(Object[] objArr, Class<?> cls, int i4) {
        while (i4 < objArr.length) {
            Object obj = objArr[i4];
            if (obj != null && (obj.getClass() == cls || cls.isInstance(obj))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static void c(Object[] objArr) {
        if (objArr != null) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                if (objArr[i4] instanceof String) {
                    if (Overmind.getMindPackageManager().t((String) objArr[i4], com.xinzhu.overmind.client.e.getUserId())) {
                        objArr[i4] = Overmind.getContext().getPackageName();
                    }
                }
            }
        }
    }

    public static String d(Object[] objArr) {
        if (objArr != null) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                if (objArr[i4] instanceof String) {
                    String str = (String) objArr[i4];
                    if (Overmind.getMindPackageManager().t(str, com.xinzhu.overmind.client.e.getUserId())) {
                        objArr[i4] = Overmind.getContext().getPackageName();
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static String e(Object[] objArr) {
        if (objArr != null) {
            for (int length = objArr.length - 1; length >= 0; length--) {
                if (objArr[length] instanceof String) {
                    String str = (String) objArr[length];
                    if (Overmind.getMindPackageManager().t(str, com.xinzhu.overmind.client.e.getUserId())) {
                        objArr[length] = Overmind.getContext().getPackageName();
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static void f(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length - 1;
            if (objArr[length].getClass() == Integer.class && ((Integer) objArr[length]).intValue() == com.xinzhu.overmind.client.e.getUserId()) {
                objArr[length] = Integer.valueOf(Overmind.getHostUserId());
            }
        }
    }
}
