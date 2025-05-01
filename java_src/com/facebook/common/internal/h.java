package com.facebook.common.internal;

import java.util.Objects;
import javax.annotation.Nullable;
/* compiled from: Preconditions.java */
/* loaded from: classes.dex */
public final class h {
    private h() {
    }

    private static String a(int i4, int i5, @Nullable String str) {
        if (i4 < 0) {
            return r("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return r("%s (%s) must be less than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException("negative size: " + i5);
    }

    private static String b(int i4, int i5, @Nullable String str) {
        if (i4 < 0) {
            return r("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException("negative size: " + i5);
    }

    private static String c(int i4, int i5, int i6) {
        if (i4 < 0 || i4 > i6) {
            return b(i4, i6, "start index");
        }
        return (i5 < 0 || i5 > i6) ? b(i5, i6, "end index") : r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
    }

    public static void d(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z4, @Nullable Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z4, @Nullable String str, @Nullable Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(r(str, objArr));
        }
    }

    public static int g(int i4, int i5) {
        return h(i4, i5, "index");
    }

    public static int h(int i4, int i5, @Nullable String str) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(a(i4, i5, str));
        }
        return i4;
    }

    public static <T> T i(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    public static <T> T j(T t4, @Nullable Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T k(T t4, @Nullable String str, @Nullable Object... objArr) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(r(str, objArr));
    }

    public static int l(int i4, int i5) {
        return m(i4, i5, "index");
    }

    public static int m(int i4, int i5, @Nullable String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(b(i4, i5, str));
        }
        return i4;
    }

    public static void n(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException(c(i4, i5, i6));
        }
    }

    public static void o(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z4, @Nullable Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void q(boolean z4, @Nullable String str, @Nullable Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(r(str, objArr));
        }
    }

    static String r(@Nullable String str, @Nullable Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i4 = 0;
        int i5 = 0;
        while (i4 < objArr.length && (indexOf = valueOf.indexOf("%s", i5)) != -1) {
            sb.append(valueOf.substring(i5, indexOf));
            sb.append(objArr[i4]);
            i5 = indexOf + 2;
            i4++;
        }
        sb.append(valueOf.substring(i5));
        if (i4 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i6 = i4 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
