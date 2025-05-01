package external.org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
/* compiled from: CompareToBuilder.java */
/* loaded from: classes6.dex */
public class b implements a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private int f68878a = 0;

    public static int A(Object obj, Object obj2, boolean z4, Class<?> cls, String... strArr) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null || obj2 == null) {
            throw null;
        }
        Class<?> cls2 = obj.getClass();
        if (cls2.isInstance(obj2)) {
            b bVar = new b();
            w(obj, obj2, cls2, bVar, z4, strArr);
            while (cls2.getSuperclass() != null && cls2 != cls) {
                cls2 = cls2.getSuperclass();
                w(obj, obj2, cls2, bVar, z4, strArr);
            }
            return bVar.C();
        }
        throw new ClassCastException();
    }

    public static int B(Object obj, Object obj2, String... strArr) {
        return A(obj, obj2, false, null, strArr);
    }

    private static void w(Object obj, Object obj2, Class<?> cls, b bVar, boolean z4, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i4 = 0; i4 < declaredFields.length && bVar.f68878a == 0; i4++) {
            Field field = declaredFields[i4];
            if (!external.org.apache.commons.lang3.a.S(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z4 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    bVar.g(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    public static int x(Object obj, Object obj2) {
        return A(obj, obj2, false, null, new String[0]);
    }

    public static int y(Object obj, Object obj2, Collection<String> collection) {
        return B(obj, obj2, f.t0(collection));
    }

    public static int z(Object obj, Object obj2, boolean z4) {
        return A(obj, obj2, z4, null, new String[0]);
    }

    public int C() {
        return this.f68878a;
    }

    public b a(byte b5, byte b6) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = b5 < b6 ? -1 : b5 > b6 ? 1 : 0;
        return this;
    }

    public b b(char c5, char c6) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = c5 < c6 ? -1 : c5 > c6 ? 1 : 0;
        return this;
    }

    public b c(double d5, double d6) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = Double.compare(d5, d6);
        return this;
    }

    public b d(float f5, float f6) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = Float.compare(f5, f6);
        return this;
    }

    public b e(int i4, int i5) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = i4 < i5 ? -1 : i4 > i5 ? 1 : 0;
        return this;
    }

    public b f(long j4, long j5) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = j4 < j5 ? -1 : j4 > j5 ? 1 : 0;
        return this;
    }

    public b g(Object obj, Object obj2) {
        return h(obj, obj2, null);
    }

    public b h(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f68878a == 0 && obj != obj2) {
            if (obj == null) {
                this.f68878a = -1;
                return this;
            } else if (obj2 == null) {
                this.f68878a = 1;
                return this;
            } else {
                if (obj.getClass().isArray()) {
                    if (obj instanceof long[]) {
                        p((long[]) obj, (long[]) obj2);
                    } else if (obj instanceof int[]) {
                        o((int[]) obj, (int[]) obj2);
                    } else if (obj instanceof short[]) {
                        s((short[]) obj, (short[]) obj2);
                    } else if (obj instanceof char[]) {
                        l((char[]) obj, (char[]) obj2);
                    } else if (obj instanceof byte[]) {
                        k((byte[]) obj, (byte[]) obj2);
                    } else if (obj instanceof double[]) {
                        m((double[]) obj, (double[]) obj2);
                    } else if (obj instanceof float[]) {
                        n((float[]) obj, (float[]) obj2);
                    } else if (obj instanceof boolean[]) {
                        t((boolean[]) obj, (boolean[]) obj2);
                    } else {
                        r((Object[]) obj, (Object[]) obj2, comparator);
                    }
                } else if (comparator == null) {
                    this.f68878a = ((Comparable) obj).compareTo(obj2);
                } else {
                    this.f68878a = comparator.compare(obj, obj2);
                }
                return this;
            }
        }
        return this;
    }

    public b i(short s4, short s5) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = s4 < s5 ? -1 : s4 > s5 ? 1 : 0;
        return this;
    }

    public b j(boolean z4, boolean z5) {
        if (this.f68878a == 0 && z4 != z5) {
            if (!z4) {
                this.f68878a = -1;
            } else {
                this.f68878a = 1;
            }
            return this;
        }
        return this;
    }

    public b k(byte[] bArr, byte[] bArr2) {
        if (this.f68878a == 0 && bArr != bArr2) {
            if (bArr == null) {
                this.f68878a = -1;
                return this;
            } else if (bArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (bArr.length != bArr2.length) {
                this.f68878a = bArr.length >= bArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < bArr.length && this.f68878a == 0; i4++) {
                    a(bArr[i4], bArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b l(char[] cArr, char[] cArr2) {
        if (this.f68878a == 0 && cArr != cArr2) {
            if (cArr == null) {
                this.f68878a = -1;
                return this;
            } else if (cArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (cArr.length != cArr2.length) {
                this.f68878a = cArr.length >= cArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < cArr.length && this.f68878a == 0; i4++) {
                    b(cArr[i4], cArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b m(double[] dArr, double[] dArr2) {
        if (this.f68878a == 0 && dArr != dArr2) {
            if (dArr == null) {
                this.f68878a = -1;
                return this;
            } else if (dArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (dArr.length != dArr2.length) {
                this.f68878a = dArr.length >= dArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < dArr.length && this.f68878a == 0; i4++) {
                    c(dArr[i4], dArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b n(float[] fArr, float[] fArr2) {
        if (this.f68878a == 0 && fArr != fArr2) {
            if (fArr == null) {
                this.f68878a = -1;
                return this;
            } else if (fArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (fArr.length != fArr2.length) {
                this.f68878a = fArr.length >= fArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < fArr.length && this.f68878a == 0; i4++) {
                    d(fArr[i4], fArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b o(int[] iArr, int[] iArr2) {
        if (this.f68878a == 0 && iArr != iArr2) {
            if (iArr == null) {
                this.f68878a = -1;
                return this;
            } else if (iArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (iArr.length != iArr2.length) {
                this.f68878a = iArr.length >= iArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < iArr.length && this.f68878a == 0; i4++) {
                    e(iArr[i4], iArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b p(long[] jArr, long[] jArr2) {
        if (this.f68878a == 0 && jArr != jArr2) {
            if (jArr == null) {
                this.f68878a = -1;
                return this;
            } else if (jArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (jArr.length != jArr2.length) {
                this.f68878a = jArr.length >= jArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < jArr.length && this.f68878a == 0; i4++) {
                    f(jArr[i4], jArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b q(Object[] objArr, Object[] objArr2) {
        return r(objArr, objArr2, null);
    }

    public b r(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f68878a == 0 && objArr != objArr2) {
            if (objArr == null) {
                this.f68878a = -1;
                return this;
            } else if (objArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (objArr.length != objArr2.length) {
                this.f68878a = objArr.length >= objArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < objArr.length && this.f68878a == 0; i4++) {
                    h(objArr[i4], objArr2[i4], comparator);
                }
                return this;
            }
        }
        return this;
    }

    public b s(short[] sArr, short[] sArr2) {
        if (this.f68878a == 0 && sArr != sArr2) {
            if (sArr == null) {
                this.f68878a = -1;
                return this;
            } else if (sArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (sArr.length != sArr2.length) {
                this.f68878a = sArr.length >= sArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < sArr.length && this.f68878a == 0; i4++) {
                    i(sArr[i4], sArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b t(boolean[] zArr, boolean[] zArr2) {
        if (this.f68878a == 0 && zArr != zArr2) {
            if (zArr == null) {
                this.f68878a = -1;
                return this;
            } else if (zArr2 == null) {
                this.f68878a = 1;
                return this;
            } else if (zArr.length != zArr2.length) {
                this.f68878a = zArr.length >= zArr2.length ? 1 : -1;
                return this;
            } else {
                for (int i4 = 0; i4 < zArr.length && this.f68878a == 0; i4++) {
                    j(zArr[i4], zArr2[i4]);
                }
                return this;
            }
        }
        return this;
    }

    public b u(int i4) {
        if (this.f68878a != 0) {
            return this;
        }
        this.f68878a = i4;
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: v */
    public Integer build() {
        return Integer.valueOf(C());
    }
}
