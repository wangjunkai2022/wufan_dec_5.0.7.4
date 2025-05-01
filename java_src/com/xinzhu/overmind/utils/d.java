package com.xinzhu.overmind.utils;

import com.xinzhu.overmind.utils.wrappers.ObjectsWrapper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ArrayUtils.java */
/* loaded from: classes.dex */
public class d {
    public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t4) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(t4);
        return arrayList;
    }

    public static <T> T[] b(Class<T> cls, T[] tArr, T t4) {
        return (T[]) c(cls, tArr, t4, false);
    }

    public static <T> T[] c(Class<T> cls, T[] tArr, T t4, boolean z4) {
        T[] tArr2;
        int i4 = 0;
        if (tArr != null) {
            if (!z4 && f(tArr, t4)) {
                return tArr;
            }
            int length = tArr.length;
            tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length + 1));
            System.arraycopy(tArr, 0, tArr2, 0, length);
            i4 = length;
        } else {
            tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 1));
        }
        tArr2[i4] = t4;
        return tArr2;
    }

    public static void d(int i4, int i5) {
        if (i5 < 0 || i4 <= i5) {
            throw new ArrayIndexOutOfBoundsException("length=" + i4 + "; index=" + i5);
        }
    }

    public static boolean e(int[] iArr, int i4) {
        if (iArr == null) {
            return false;
        }
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean f(T[] tArr, T t4) {
        return h(tArr, t4) != -1;
    }

    public static <T> T g(T[] tArr) {
        if (tArr.length > 0) {
            return tArr[0];
        }
        return null;
    }

    public static int h(Object[] objArr, Object obj) {
        return i(objArr, obj, 0);
    }

    public static int i(Object[] objArr, Object obj, int i4) {
        if (!o(objArr) && i4 < objArr.length) {
            while (i4 < objArr.length) {
                if (ObjectsWrapper.equals(objArr[i4], obj)) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        return -1;
    }

    public static int j(Object[] objArr, Class<?> cls) {
        return k(objArr, cls, 0);
    }

    public static int k(Object[] objArr, Class<?> cls, int i4) {
        if (!o(objArr) && i4 < objArr.length) {
            while (i4 < objArr.length) {
                if (cls.isInstance(objArr[i4])) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        return -1;
    }

    public static int l(Object[] objArr, Class<?> cls) {
        return m(objArr, cls, 0);
    }

    public static int m(Object[] objArr, Class<?> cls, int i4) {
        if (!o(objArr) && i4 < objArr.length) {
            while (i4 < objArr.length) {
                if (objArr[i4] != null && objArr[i4].getClass() == cls) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        return -1;
    }

    public static int n(Object[] objArr, Class<?> cls) {
        if (o(objArr)) {
            return -1;
        }
        for (int length = objArr.length - 1; length >= 0; length--) {
            if (objArr[length] != null && objArr[length].getClass() == cls) {
                return length;
            }
        }
        return -1;
    }

    public static <T> boolean o(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> T[] p(T[] tArr, int i4) {
        if (tArr == null || i4 == 0) {
            return null;
        }
        return tArr.length == i4 ? tArr : (T[]) Arrays.copyOf(tArr, i4);
    }
}
