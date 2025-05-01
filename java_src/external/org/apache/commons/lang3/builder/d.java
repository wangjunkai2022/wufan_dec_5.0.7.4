package external.org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* compiled from: HashCodeBuilder.java */
/* loaded from: classes6.dex */
public class d implements a<Integer> {

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<Set<e>> f68881c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f68882a;

    /* renamed from: b  reason: collision with root package name */
    private int f68883b;

    public d() {
        this.f68883b = 0;
        this.f68882a = 37;
        this.f68883b = 17;
    }

    public static int A(Object obj, Collection<String> collection) {
        return C(obj, f.t0(collection));
    }

    public static int B(Object obj, boolean z4) {
        return z(17, 37, obj, z4, null, new String[0]);
    }

    public static int C(Object obj, String... strArr) {
        return z(17, 37, obj, false, null, strArr);
    }

    static void D(Object obj) {
        synchronized (d.class) {
            if (u() == null) {
                f68881c.set(new HashSet());
            }
        }
        u().add(new e(obj));
    }

    static void F(Object obj) {
        Set<e> u4 = u();
        if (u4 != null) {
            u4.remove(new e(obj));
            synchronized (d.class) {
                Set<e> u5 = u();
                if (u5 != null && u5.isEmpty()) {
                    f68881c.remove();
                }
            }
        }
    }

    static Set<e> u() {
        return f68881c.get();
    }

    static boolean v(Object obj) {
        Set<e> u4 = u();
        return u4 != null && u4.contains(new e(obj));
    }

    private static void w(Object obj, Class<?> cls, d dVar, boolean z4, String[] strArr) {
        if (v(obj)) {
            return;
        }
        try {
            D(obj);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!external.org.apache.commons.lang3.a.S(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z4 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                    try {
                        dVar.g(field.get(obj));
                    } catch (IllegalAccessException unused) {
                        throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }
        } finally {
            F(obj);
        }
    }

    public static int x(int i4, int i5, Object obj) {
        return z(i4, i5, obj, false, null, new String[0]);
    }

    public static int y(int i4, int i5, Object obj, boolean z4) {
        return z(i4, i5, obj, z4, null, new String[0]);
    }

    public static <T> int z(int i4, int i5, T t4, boolean z4, Class<? super T> cls, String... strArr) {
        if (t4 != null) {
            d dVar = new d(i4, i5);
            Class<?> cls2 = t4.getClass();
            w(t4, cls2, dVar, z4, strArr);
            while (cls2.getSuperclass() != null && cls2 != cls) {
                cls2 = cls2.getSuperclass();
                w(t4, cls2, dVar, z4, strArr);
            }
            return dVar.E();
        }
        throw new IllegalArgumentException("The object to build a hash code for must not be null");
    }

    public int E() {
        return this.f68883b;
    }

    public d a(byte b5) {
        this.f68883b = (this.f68883b * this.f68882a) + b5;
        return this;
    }

    public d b(char c5) {
        this.f68883b = (this.f68883b * this.f68882a) + c5;
        return this;
    }

    public d c(double d5) {
        return f(Double.doubleToLongBits(d5));
    }

    public d d(float f5) {
        this.f68883b = (this.f68883b * this.f68882a) + Float.floatToIntBits(f5);
        return this;
    }

    public d e(int i4) {
        this.f68883b = (this.f68883b * this.f68882a) + i4;
        return this;
    }

    public d f(long j4) {
        this.f68883b = (this.f68883b * this.f68882a) + ((int) (j4 ^ (j4 >> 32)));
        return this;
    }

    public d g(Object obj) {
        if (obj == null) {
            this.f68883b *= this.f68882a;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                o((long[]) obj);
            } else if (obj instanceof int[]) {
                n((int[]) obj);
            } else if (obj instanceof short[]) {
                q((short[]) obj);
            } else if (obj instanceof char[]) {
                k((char[]) obj);
            } else if (obj instanceof byte[]) {
                j((byte[]) obj);
            } else if (obj instanceof double[]) {
                l((double[]) obj);
            } else if (obj instanceof float[]) {
                m((float[]) obj);
            } else if (obj instanceof boolean[]) {
                r((boolean[]) obj);
            } else {
                p((Object[]) obj);
            }
        } else {
            this.f68883b = (this.f68883b * this.f68882a) + obj.hashCode();
        }
        return this;
    }

    public d h(short s4) {
        this.f68883b = (this.f68883b * this.f68882a) + s4;
        return this;
    }

    public int hashCode() {
        return E();
    }

    public d i(boolean z4) {
        this.f68883b = (this.f68883b * this.f68882a) + (!z4 ? 1 : 0);
        return this;
    }

    public d j(byte[] bArr) {
        if (bArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (byte b5 : bArr) {
                a(b5);
            }
        }
        return this;
    }

    public d k(char[] cArr) {
        if (cArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (char c5 : cArr) {
                b(c5);
            }
        }
        return this;
    }

    public d l(double[] dArr) {
        if (dArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (double d5 : dArr) {
                c(d5);
            }
        }
        return this;
    }

    public d m(float[] fArr) {
        if (fArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (float f5 : fArr) {
                d(f5);
            }
        }
        return this;
    }

    public d n(int[] iArr) {
        if (iArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (int i4 : iArr) {
                e(i4);
            }
        }
        return this;
    }

    public d o(long[] jArr) {
        if (jArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (long j4 : jArr) {
                f(j4);
            }
        }
        return this;
    }

    public d p(Object[] objArr) {
        if (objArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (Object obj : objArr) {
                g(obj);
            }
        }
        return this;
    }

    public d q(short[] sArr) {
        if (sArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (short s4 : sArr) {
                h(s4);
            }
        }
        return this;
    }

    public d r(boolean[] zArr) {
        if (zArr == null) {
            this.f68883b *= this.f68882a;
        } else {
            for (boolean z4 : zArr) {
                i(z4);
            }
        }
        return this;
    }

    public d s(int i4) {
        this.f68883b = (this.f68883b * this.f68882a) + i4;
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: t */
    public Integer build() {
        return Integer.valueOf(E());
    }

    public d(int i4, int i5) {
        this.f68883b = 0;
        if (i4 != 0) {
            if (i4 % 2 == 0) {
                throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
            }
            if (i5 != 0) {
                if (i5 % 2 != 0) {
                    this.f68882a = i5;
                    this.f68883b = i4;
                    return;
                }
                throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
            }
            throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
        }
        throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
    }
}
