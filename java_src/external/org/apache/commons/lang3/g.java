package external.org.apache.commons.lang3;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: Validate.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68968a = "The value %s is not in the specified exclusive range of %s to %s";

    /* renamed from: b  reason: collision with root package name */
    private static final String f68969b = "The value %s is not in the specified inclusive range of %s to %s";

    /* renamed from: c  reason: collision with root package name */
    private static final String f68970c = "The string %s does not match the pattern %s";

    /* renamed from: d  reason: collision with root package name */
    private static final String f68971d = "The validated object is null";

    /* renamed from: e  reason: collision with root package name */
    private static final String f68972e = "The validated expression is false";

    /* renamed from: f  reason: collision with root package name */
    private static final String f68973f = "The validated array contains null element at index: %d";

    /* renamed from: g  reason: collision with root package name */
    private static final String f68974g = "The validated collection contains null element at index: %d";

    /* renamed from: h  reason: collision with root package name */
    private static final String f68975h = "The validated character sequence is blank";

    /* renamed from: i  reason: collision with root package name */
    private static final String f68976i = "The validated array is empty";

    /* renamed from: j  reason: collision with root package name */
    private static final String f68977j = "The validated character sequence is empty";

    /* renamed from: k  reason: collision with root package name */
    private static final String f68978k = "The validated collection is empty";

    /* renamed from: l  reason: collision with root package name */
    private static final String f68979l = "The validated map is empty";

    /* renamed from: m  reason: collision with root package name */
    private static final String f68980m = "The validated array index is invalid: %d";

    /* renamed from: n  reason: collision with root package name */
    private static final String f68981n = "The validated character sequence index is invalid: %d";

    /* renamed from: o  reason: collision with root package name */
    private static final String f68982o = "The validated collection index is invalid: %d";

    /* renamed from: p  reason: collision with root package name */
    private static final String f68983p = "The validated state is false";

    /* renamed from: q  reason: collision with root package name */
    private static final String f68984q = "Cannot assign a %s to a %s";

    /* renamed from: r  reason: collision with root package name */
    private static final String f68985r = "Expected type: %s, actual: %s";

    public static <T> T[] A(T[] tArr) {
        return (T[]) B(tArr, f68976i, new Object[0]);
    }

    public static <T> T[] B(T[] tArr, String str, Object... objArr) {
        if (tArr != null) {
            if (tArr.length != 0) {
                return tArr;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T> T C(T t4) {
        return (T) D(t4, f68971d, new Object[0]);
    }

    public static <T> T D(T t4, String str, Object... objArr) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T E(T t4, int i4) {
        return (T) F(t4, i4, f68981n, Integer.valueOf(i4));
    }

    public static <T extends CharSequence> T F(T t4, int i4, String str, Object... objArr) {
        C(t4);
        if (i4 < 0 || i4 >= t4.length()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t4;
    }

    public static <T extends Collection<?>> T G(T t4, int i4) {
        return (T) H(t4, i4, f68982o, Integer.valueOf(i4));
    }

    public static <T extends Collection<?>> T H(T t4, int i4, String str, Object... objArr) {
        C(t4);
        if (i4 < 0 || i4 >= t4.size()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t4;
    }

    public static <T> T[] I(T[] tArr, int i4) {
        return (T[]) J(tArr, i4, f68980m, Integer.valueOf(i4));
    }

    public static <T> T[] J(T[] tArr, int i4, String str, Object... objArr) {
        C(tArr);
        if (i4 < 0 || i4 >= tArr.length) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return tArr;
    }

    public static void K(boolean z4) {
        if (!z4) {
            throw new IllegalStateException(f68983p);
        }
    }

    public static void L(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> void a(T t4, T t5, Comparable<T> comparable) {
        if (comparable.compareTo(t4) <= 0 || comparable.compareTo(t5) >= 0) {
            throw new IllegalArgumentException(String.format(f68968a, comparable, t4, t5));
        }
    }

    public static <T> void b(T t4, T t5, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t4) <= 0 || comparable.compareTo(t5) >= 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> void c(T t4, T t5, Comparable<T> comparable) {
        if (comparable.compareTo(t4) < 0 || comparable.compareTo(t5) > 0) {
            throw new IllegalArgumentException(String.format(f68969b, comparable, t4, t5));
        }
    }

    public static <T> void d(T t4, T t5, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t4) < 0 || comparable.compareTo(t5) > 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void e(Class<?> cls, Class<?> cls2) {
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = cls2 == null ? "null" : cls2.getName();
        objArr[1] = cls.getName();
        throw new IllegalArgumentException(String.format(f68984q, objArr));
    }

    public static void f(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void g(Class<?> cls, Object obj) {
        if (cls.isInstance(obj)) {
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = cls.getName();
        objArr[1] = obj == null ? "null" : obj.getClass().getName();
        throw new IllegalArgumentException(String.format(f68985r, objArr));
    }

    public static void h(Class<?> cls, Object obj, String str, Object... objArr) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void i(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(f68972e);
        }
    }

    public static void j(boolean z4, String str, double d5) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, Double.valueOf(d5)));
        }
    }

    public static void k(boolean z4, String str, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, Long.valueOf(j4)));
        }
    }

    public static void l(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m(CharSequence charSequence, String str) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format(f68970c, charSequence, str));
        }
    }

    public static void n(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format(str2, objArr));
        }
    }

    public static <T extends Iterable<?>> T o(T t4) {
        return (T) p(t4, f68974g, new Object[0]);
    }

    public static <T extends Iterable<?>> T p(T t4, String str, Object... objArr) {
        C(t4);
        int i4 = 0;
        for (Object obj : t4) {
            if (obj == null) {
                throw new IllegalArgumentException(String.format(str, a.z(objArr, Integer.valueOf(i4))));
            }
            i4++;
        }
        return t4;
    }

    public static <T> T[] q(T[] tArr) {
        return (T[]) r(tArr, f68973f, new Object[0]);
    }

    public static <T> T[] r(T[] tArr, String str, Object... objArr) {
        C(tArr);
        for (int i4 = 0; i4 < tArr.length; i4++) {
            if (tArr[i4] == null) {
                throw new IllegalArgumentException(String.format(str, a.o(objArr, Integer.valueOf(i4))));
            }
        }
        return tArr;
    }

    public static <T extends CharSequence> T s(T t4) {
        return (T) t(t4, f68975h, new Object[0]);
    }

    public static <T extends CharSequence> T t(T t4, String str, Object... objArr) {
        if (t4 != null) {
            if (e.e0(t4)) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t4;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T u(T t4) {
        return (T) v(t4, f68977j, new Object[0]);
    }

    public static <T extends CharSequence> T v(T t4, String str, Object... objArr) {
        if (t4 != null) {
            if (t4.length() != 0) {
                return t4;
            }
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T w(T t4) {
        return (T) x(t4, f68978k, new Object[0]);
    }

    public static <T extends Collection<?>> T x(T t4, String str, Object... objArr) {
        if (t4 != null) {
            if (t4.isEmpty()) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t4;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends Map<?, ?>> T y(T t4) {
        return (T) z(t4, f68979l, new Object[0]);
    }

    public static <T extends Map<?, ?>> T z(T t4, String str, Object... objArr) {
        if (t4 != null) {
            if (t4.isEmpty()) {
                throw new IllegalArgumentException(String.format(str, objArr));
            }
            return t4;
        }
        throw new NullPointerException(String.format(str, objArr));
    }
}
