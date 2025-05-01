package com.xinzhu.overmind.utils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ArraySet.java */
/* loaded from: classes6.dex */
public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f68302f = false;

    /* renamed from: g  reason: collision with root package name */
    private static final String f68303g = "ArraySet";

    /* renamed from: h  reason: collision with root package name */
    private static final int f68304h = 4;

    /* renamed from: i  reason: collision with root package name */
    private static final int f68305i = 10;

    /* renamed from: j  reason: collision with root package name */
    static Object[] f68306j;

    /* renamed from: k  reason: collision with root package name */
    static int f68307k;

    /* renamed from: l  reason: collision with root package name */
    static Object[] f68308l;

    /* renamed from: m  reason: collision with root package name */
    static int f68309m;

    /* renamed from: b  reason: collision with root package name */
    int[] f68310b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f68311c;

    /* renamed from: d  reason: collision with root package name */
    int f68312d;

    /* renamed from: e  reason: collision with root package name */
    o<E, E> f68313e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArraySet.java */
    /* loaded from: classes6.dex */
    public class a extends o<E, E> {
        a() {
        }

        @Override // com.xinzhu.overmind.utils.o
        protected void a() {
            c.this.clear();
        }

        @Override // com.xinzhu.overmind.utils.o
        protected Object b(int i4, int i5) {
            return c.this.f68311c[i4];
        }

        @Override // com.xinzhu.overmind.utils.o
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.xinzhu.overmind.utils.o
        protected int d() {
            return c.this.f68312d;
        }

        @Override // com.xinzhu.overmind.utils.o
        protected int e(Object obj) {
            return c.this.indexOf(obj);
        }

        @Override // com.xinzhu.overmind.utils.o
        protected int f(Object obj) {
            return c.this.indexOf(obj);
        }

        @Override // com.xinzhu.overmind.utils.o
        protected void g(E e5, E e6) {
            c.this.add(e5);
        }

        @Override // com.xinzhu.overmind.utils.o
        protected void h(int i4) {
            c.this.n(i4);
        }

        @Override // com.xinzhu.overmind.utils.o
        protected E i(int i4, E e5) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public c() {
        this.f68310b = new int[0];
        this.f68311c = new Object[0];
        this.f68312d = 0;
    }

    private void b(int i4) {
        if (i4 == 8) {
            synchronized (c.class) {
                Object[] objArr = f68308l;
                if (objArr != null) {
                    this.f68311c = objArr;
                    f68308l = (Object[]) objArr[0];
                    this.f68310b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f68309m--;
                    return;
                }
            }
        } else if (i4 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f68306j;
                if (objArr2 != null) {
                    this.f68311c = objArr2;
                    f68306j = (Object[]) objArr2[0];
                    this.f68310b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f68307k--;
                    return;
                }
            }
        }
        this.f68310b = new int[i4];
        this.f68311c = new Object[i4];
    }

    private static void e(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f68309m < 10) {
                    objArr[0] = f68308l;
                    objArr[1] = iArr;
                    for (int i5 = i4 - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    f68308l = objArr;
                    f68309m++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f68307k < 10) {
                    objArr[0] = f68306j;
                    objArr[1] = iArr;
                    for (int i6 = i4 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f68306j = objArr;
                    f68307k++;
                }
            }
        }
    }

    private o<E, E> f() {
        if (this.f68313e == null) {
            this.f68313e = new a();
        }
        return this.f68313e;
    }

    private int i(Object obj, int i4) {
        int i5 = this.f68312d;
        if (i5 == 0) {
            return -1;
        }
        int a5 = f.a(this.f68310b, i5, i4);
        if (a5 >= 0 && !obj.equals(this.f68311c[a5])) {
            int i6 = a5 + 1;
            while (i6 < i5 && this.f68310b[i6] == i4) {
                if (obj.equals(this.f68311c[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = a5 - 1; i7 >= 0 && this.f68310b[i7] == i4; i7--) {
                if (obj.equals(this.f68311c[i7])) {
                    return i7;
                }
            }
            return i6 ^ (-1);
        }
        return a5;
    }

    private int m() {
        int i4 = this.f68312d;
        if (i4 == 0) {
            return -1;
        }
        int a5 = f.a(this.f68310b, i4, 0);
        if (a5 >= 0 && this.f68311c[a5] != null) {
            int i5 = a5 + 1;
            while (i5 < i4 && this.f68310b[i5] == 0) {
                if (this.f68311c[i5] == null) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a5 - 1; i6 >= 0 && this.f68310b[i6] == 0; i6--) {
                if (this.f68311c[i6] == null) {
                    return i6;
                }
            }
            return i5 ^ (-1);
        }
        return a5;
    }

    public void a(c<? extends E> cVar) {
        int i4 = cVar.f68312d;
        c(this.f68312d + i4);
        if (this.f68312d != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                add(cVar.o(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(cVar.f68310b, 0, this.f68310b, 0, i4);
            System.arraycopy(cVar.f68311c, 0, this.f68311c, 0, i4);
            this.f68312d = i4;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e5) {
        int i4;
        int i5;
        if (e5 == null) {
            i5 = m();
            i4 = 0;
        } else {
            int hashCode = e5.hashCode();
            i4 = hashCode;
            i5 = i(e5, hashCode);
        }
        if (i5 >= 0) {
            return false;
        }
        int i6 = i5 ^ (-1);
        int i7 = this.f68312d;
        int[] iArr = this.f68310b;
        if (i7 >= iArr.length) {
            int i8 = 4;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 >= 4) {
                i8 = 8;
            }
            Object[] objArr = this.f68311c;
            b(i8);
            int[] iArr2 = this.f68310b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f68311c, 0, objArr.length);
            }
            e(iArr, objArr, this.f68312d);
        }
        int i9 = this.f68312d;
        if (i6 < i9) {
            int[] iArr3 = this.f68310b;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.f68311c;
            System.arraycopy(objArr2, i6, objArr2, i10, this.f68312d - i6);
        }
        this.f68310b[i6] = i4;
        this.f68311c[i6] = e5;
        this.f68312d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        c(this.f68312d + collection.size());
        boolean z4 = false;
        for (E e5 : collection) {
            z4 |= add(e5);
        }
        return z4;
    }

    public void c(int i4) {
        int[] iArr = this.f68310b;
        if (iArr.length < i4) {
            Object[] objArr = this.f68311c;
            b(i4);
            int i5 = this.f68312d;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f68310b, 0, i5);
                System.arraycopy(objArr, 0, this.f68311c, 0, this.f68312d);
            }
            e(iArr, objArr, this.f68312d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i4 = this.f68312d;
        if (i4 != 0) {
            e(this.f68310b, this.f68311c, i4);
            this.f68310b = new int[0];
            this.f68311c = new Object[0];
            this.f68312d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f68312d; i4++) {
                try {
                    if (!set.contains(o(i4))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f68310b;
        int i4 = this.f68312d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public int indexOf(Object obj) {
        return obj == null ? m() : i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f68312d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return f().m().iterator();
    }

    public E n(int i4) {
        Object[] objArr = this.f68311c;
        E e5 = (E) objArr[i4];
        int i5 = this.f68312d;
        if (i5 <= 1) {
            e(this.f68310b, objArr, i5);
            this.f68310b = new int[0];
            this.f68311c = new Object[0];
            this.f68312d = 0;
        } else {
            int[] iArr = this.f68310b;
            if (iArr.length > 8 && i5 < iArr.length / 3) {
                b(i5 > 8 ? i5 + (i5 >> 1) : 8);
                this.f68312d--;
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f68310b, 0, i4);
                    System.arraycopy(objArr, 0, this.f68311c, 0, i4);
                }
                int i6 = this.f68312d;
                if (i4 < i6) {
                    int i7 = i4 + 1;
                    System.arraycopy(iArr, i7, this.f68310b, i4, i6 - i4);
                    System.arraycopy(objArr, i7, this.f68311c, i4, this.f68312d - i4);
                }
            } else {
                int i8 = i5 - 1;
                this.f68312d = i8;
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    System.arraycopy(iArr, i9, iArr, i4, i8 - i4);
                    Object[] objArr2 = this.f68311c;
                    System.arraycopy(objArr2, i9, objArr2, i4, this.f68312d - i4);
                }
                this.f68311c[this.f68312d] = null;
            }
        }
        return e5;
    }

    public E o(int i4) {
        return (E) this.f68311c[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            n(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            z4 |= remove(it2.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z4 = false;
        for (int i4 = this.f68312d - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f68311c[i4])) {
                n(i4);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f68312d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i4 = this.f68312d;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f68311c, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f68312d * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f68312d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            E o4 = o(i4);
            if (o4 != this) {
                sb.append(o4);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f68312d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f68312d));
        }
        System.arraycopy(this.f68311c, 0, tArr, 0, this.f68312d);
        int length = tArr.length;
        int i4 = this.f68312d;
        if (length > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public c(int i4) {
        if (i4 == 0) {
            this.f68310b = new int[0];
            this.f68311c = new Object[0];
        } else {
            b(i4);
        }
        this.f68312d = 0;
    }

    public c(c cVar) {
        this();
        if (cVar != null) {
            a(cVar);
        }
    }
}
