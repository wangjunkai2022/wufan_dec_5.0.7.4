package external.org.apache.commons.lang3.builder;

import external.org.apache.commons.lang3.tuple.Pair;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* compiled from: EqualsBuilder.java */
/* loaded from: classes6.dex */
public class c implements a<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Set<Pair<e, e>>> f68879b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private boolean f68880a = true;

    public static boolean A(Object obj, Object obj2, boolean z4) {
        return B(obj, obj2, z4, null, new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r2.isInstance(r11) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r1.isInstance(r12) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B(java.lang.Object r11, java.lang.Object r12, boolean r13, java.lang.Class<?> r14, java.lang.String... r15) {
        /*
            if (r11 != r12) goto L4
            r11 = 1
            return r11
        L4:
            r0 = 0
            if (r11 == 0) goto L56
            if (r12 != 0) goto La
            goto L56
        La:
            java.lang.Class r1 = r11.getClass()
            java.lang.Class r2 = r12.getClass()
            boolean r3 = r1.isInstance(r12)
            if (r3 == 0) goto L1f
            boolean r3 = r2.isInstance(r11)
            if (r3 != 0) goto L2d
            goto L2c
        L1f:
            boolean r3 = r2.isInstance(r11)
            if (r3 == 0) goto L56
            boolean r3 = r1.isInstance(r12)
            if (r3 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            external.org.apache.commons.lang3.builder.c r10 = new external.org.apache.commons.lang3.builder.c
            r10.<init>()
            r4 = r11
            r5 = r12
            r6 = r1
            r7 = r10
            r8 = r13
            r9 = r15
            y(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L56
        L3b:
            java.lang.Class r2 = r1.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L56
            if (r2 == 0) goto L51
            if (r1 == r14) goto L51
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L56
            r2 = r11
            r3 = r12
            r4 = r1
            r5 = r10
            r6 = r13
            r7 = r15
            y(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L56
            goto L3b
        L51:
            boolean r11 = r10.w()
            return r11
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: external.org.apache.commons.lang3.builder.c.B(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[]):boolean");
    }

    public static boolean C(Object obj, Object obj2, String... strArr) {
        return B(obj, obj2, false, null, strArr);
    }

    static void D(Object obj, Object obj2) {
        synchronized (c.class) {
            if (v() == null) {
                f68879b.set(new HashSet());
            }
        }
        v().add(u(obj, obj2));
    }

    static void G(Object obj, Object obj2) {
        Set<Pair<e, e>> v2 = v();
        if (v2 != null) {
            v2.remove(u(obj, obj2));
            synchronized (c.class) {
                Set<Pair<e, e>> v4 = v();
                if (v4 != null && v4.isEmpty()) {
                    f68879b.remove();
                }
            }
        }
    }

    static Pair<e, e> u(Object obj, Object obj2) {
        return Pair.m(new e(obj), new e(obj2));
    }

    static Set<Pair<e, e>> v() {
        return f68879b.get();
    }

    static boolean x(Object obj, Object obj2) {
        Set<Pair<e, e>> v2 = v();
        Pair<e, e> u4 = u(obj, obj2);
        return v2 != null && (v2.contains(u4) || v2.contains(Pair.m(u4.e(), u4.f())));
    }

    private static void y(Object obj, Object obj2, Class<?> cls, c cVar, boolean z4, String[] strArr) {
        if (x(obj, obj2)) {
            return;
        }
        try {
            D(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i4 = 0; i4 < declaredFields.length && cVar.f68880a; i4++) {
                Field field = declaredFields[i4];
                if (!external.org.apache.commons.lang3.a.S(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z4 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                    try {
                        cVar.g(field.get(obj), field.get(obj2));
                    } catch (IllegalAccessException unused) {
                        throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }
        } finally {
            G(obj, obj2);
        }
    }

    public static boolean z(Object obj, Object obj2, Collection<String> collection) {
        return C(obj, obj2, f.t0(collection));
    }

    public void E() {
        this.f68880a = true;
    }

    protected void F(boolean z4) {
        this.f68880a = z4;
    }

    public c a(byte b5, byte b6) {
        if (this.f68880a) {
            this.f68880a = b5 == b6;
            return this;
        }
        return this;
    }

    public c b(char c5, char c6) {
        if (this.f68880a) {
            this.f68880a = c5 == c6;
            return this;
        }
        return this;
    }

    public c c(double d5, double d6) {
        return !this.f68880a ? this : f(Double.doubleToLongBits(d5), Double.doubleToLongBits(d6));
    }

    public c d(float f5, float f6) {
        return !this.f68880a ? this : e(Float.floatToIntBits(f5), Float.floatToIntBits(f6));
    }

    public c e(int i4, int i5) {
        if (this.f68880a) {
            this.f68880a = i4 == i5;
            return this;
        }
        return this;
    }

    public c f(long j4, long j5) {
        if (this.f68880a) {
            this.f68880a = j4 == j5;
            return this;
        }
        return this;
    }

    public c g(Object obj, Object obj2) {
        if (this.f68880a && obj != obj2) {
            if (obj != null && obj2 != null) {
                if (!obj.getClass().isArray()) {
                    this.f68880a = obj.equals(obj2);
                } else if (obj.getClass() != obj2.getClass()) {
                    F(false);
                } else if (obj instanceof long[]) {
                    o((long[]) obj, (long[]) obj2);
                } else if (obj instanceof int[]) {
                    n((int[]) obj, (int[]) obj2);
                } else if (obj instanceof short[]) {
                    q((short[]) obj, (short[]) obj2);
                } else if (obj instanceof char[]) {
                    k((char[]) obj, (char[]) obj2);
                } else if (obj instanceof byte[]) {
                    j((byte[]) obj, (byte[]) obj2);
                } else if (obj instanceof double[]) {
                    l((double[]) obj, (double[]) obj2);
                } else if (obj instanceof float[]) {
                    m((float[]) obj, (float[]) obj2);
                } else if (obj instanceof boolean[]) {
                    r((boolean[]) obj, (boolean[]) obj2);
                } else {
                    p((Object[]) obj, (Object[]) obj2);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c h(short s4, short s5) {
        if (this.f68880a) {
            this.f68880a = s4 == s5;
            return this;
        }
        return this;
    }

    public c i(boolean z4, boolean z5) {
        if (this.f68880a) {
            this.f68880a = z4 == z5;
            return this;
        }
        return this;
    }

    public c j(byte[] bArr, byte[] bArr2) {
        if (this.f68880a && bArr != bArr2) {
            if (bArr != null && bArr2 != null) {
                if (bArr.length != bArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < bArr.length && this.f68880a; i4++) {
                    a(bArr[i4], bArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c k(char[] cArr, char[] cArr2) {
        if (this.f68880a && cArr != cArr2) {
            if (cArr != null && cArr2 != null) {
                if (cArr.length != cArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < cArr.length && this.f68880a; i4++) {
                    b(cArr[i4], cArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c l(double[] dArr, double[] dArr2) {
        if (this.f68880a && dArr != dArr2) {
            if (dArr != null && dArr2 != null) {
                if (dArr.length != dArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < dArr.length && this.f68880a; i4++) {
                    c(dArr[i4], dArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c m(float[] fArr, float[] fArr2) {
        if (this.f68880a && fArr != fArr2) {
            if (fArr != null && fArr2 != null) {
                if (fArr.length != fArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < fArr.length && this.f68880a; i4++) {
                    d(fArr[i4], fArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c n(int[] iArr, int[] iArr2) {
        if (this.f68880a && iArr != iArr2) {
            if (iArr != null && iArr2 != null) {
                if (iArr.length != iArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < iArr.length && this.f68880a; i4++) {
                    e(iArr[i4], iArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c o(long[] jArr, long[] jArr2) {
        if (this.f68880a && jArr != jArr2) {
            if (jArr != null && jArr2 != null) {
                if (jArr.length != jArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < jArr.length && this.f68880a; i4++) {
                    f(jArr[i4], jArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c p(Object[] objArr, Object[] objArr2) {
        if (this.f68880a && objArr != objArr2) {
            if (objArr != null && objArr2 != null) {
                if (objArr.length != objArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < objArr.length && this.f68880a; i4++) {
                    g(objArr[i4], objArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c q(short[] sArr, short[] sArr2) {
        if (this.f68880a && sArr != sArr2) {
            if (sArr != null && sArr2 != null) {
                if (sArr.length != sArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < sArr.length && this.f68880a; i4++) {
                    h(sArr[i4], sArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c r(boolean[] zArr, boolean[] zArr2) {
        if (this.f68880a && zArr != zArr2) {
            if (zArr != null && zArr2 != null) {
                if (zArr.length != zArr2.length) {
                    F(false);
                    return this;
                }
                for (int i4 = 0; i4 < zArr.length && this.f68880a; i4++) {
                    i(zArr[i4], zArr2[i4]);
                }
                return this;
            }
            F(false);
            return this;
        }
        return this;
    }

    public c s(boolean z4) {
        if (this.f68880a) {
            this.f68880a = z4;
            return this;
        }
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: t */
    public Boolean build() {
        return Boolean.valueOf(w());
    }

    public boolean w() {
        return this.f68880a;
    }
}
