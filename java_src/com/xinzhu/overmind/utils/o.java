package com.xinzhu.overmind.utils;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapCollections.java */
/* loaded from: classes6.dex */
public abstract class o<K, V> {

    /* renamed from: a  reason: collision with root package name */
    o<K, V>.b f68389a;

    /* renamed from: b  reason: collision with root package name */
    o<K, V>.c f68390b;

    /* renamed from: c  reason: collision with root package name */
    o<K, V>.e f68391c;

    /* compiled from: MapCollections.java */
    /* loaded from: classes6.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        final int f68392b;

        /* renamed from: c  reason: collision with root package name */
        int f68393c;

        /* renamed from: d  reason: collision with root package name */
        int f68394d;

        /* renamed from: e  reason: collision with root package name */
        boolean f68395e = false;

        a(int i4) {
            this.f68392b = i4;
            this.f68393c = o.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f68394d < this.f68393c;
        }

        @Override // java.util.Iterator
        public T next() {
            T t4 = (T) o.this.b(this.f68394d, this.f68392b);
            this.f68394d++;
            this.f68395e = true;
            return t4;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f68395e) {
                int i4 = this.f68394d - 1;
                this.f68394d = i4;
                this.f68393c--;
                this.f68395e = false;
                o.this.h(i4);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes6.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d5 = o.this.d();
            for (Map.Entry<K, V> entry : collection) {
                o.this.g(entry.getKey(), entry.getValue());
            }
            return d5 != o.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            o.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e5 = o.this.e(entry.getKey());
                if (e5 < 0) {
                    return false;
                }
                return f.c(o.this.b(e5, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return o.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i4 = 0;
            for (int d5 = o.this.d() - 1; d5 >= 0; d5--) {
                Object b5 = o.this.b(d5, 0);
                Object b6 = o.this.b(d5, 1);
                i4 += (b5 == null ? 0 : b5.hashCode()) ^ (b6 == null ? 0 : b6.hashCode());
            }
            return i4;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return o.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return o.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes6.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            o.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return o.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return o.j(o.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return o.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i4 = 0;
            for (int d5 = o.this.d() - 1; d5 >= 0; d5--) {
                Object b5 = o.this.b(d5, 0);
                i4 += b5 == null ? 0 : b5.hashCode();
            }
            return i4;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return o.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e5 = o.this.e(obj);
            if (e5 >= 0) {
                o.this.h(e5);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return o.o(o.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return o.p(o.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return o.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return o.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o.this.r(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes6.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        int f68399b;

        /* renamed from: d  reason: collision with root package name */
        boolean f68401d = false;

        /* renamed from: c  reason: collision with root package name */
        int f68400c = -1;

        d() {
            this.f68399b = o.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            this.f68400c++;
            this.f68401d = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this.f68401d) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return f.c(entry.getKey(), o.this.b(this.f68400c, 0)) && f.c(entry.getValue(), o.this.b(this.f68400c, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f68401d) {
                return (K) o.this.b(this.f68400c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f68401d) {
                return (V) o.this.b(this.f68400c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f68400c < this.f68399b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (this.f68401d) {
                Object b5 = o.this.b(this.f68400c, 0);
                Object b6 = o.this.b(this.f68400c, 1);
                return (b5 == null ? 0 : b5.hashCode()) ^ (b6 != null ? b6.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f68401d) {
                o.this.h(this.f68400c);
                this.f68400c--;
                this.f68399b--;
                this.f68401d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.f68401d) {
                return (V) o.this.i(this.f68400c, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + SimpleComparison.EQUAL_TO_OPERATION + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes6.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            o.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return o.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return o.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f5 = o.this.f(obj);
            if (f5 >= 0) {
                o.this.h(f5);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d5 = o.this.d();
            int i4 = 0;
            boolean z4 = false;
            while (i4 < d5) {
                if (collection.contains(o.this.b(i4, 1))) {
                    o.this.h(i4);
                    i4--;
                    d5--;
                    z4 = true;
                }
                i4++;
            }
            return z4;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d5 = o.this.d();
            int i4 = 0;
            boolean z4 = false;
            while (i4 < d5) {
                if (!collection.contains(o.this.b(i4, 1))) {
                    o.this.h(i4);
                    i4--;
                    d5--;
                    z4 = true;
                }
                i4++;
            }
            return z4;
        }

        @Override // java.util.Collection
        public int size() {
            return o.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return o.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!map.containsKey(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            map.remove(it2.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (!collection.contains(it2.next())) {
                it2.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i4, int i5);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k4, V v2);

    protected abstract void h(int i4);

    protected abstract V i(int i4, V v2);

    public Set<Map.Entry<K, V>> l() {
        if (this.f68389a == null) {
            this.f68389a = new b();
        }
        return this.f68389a;
    }

    public Set<K> m() {
        if (this.f68390b == null) {
            this.f68390b = new c();
        }
        return this.f68390b;
    }

    public Collection<V> n() {
        if (this.f68391c == null) {
            this.f68391c = new e();
        }
        return this.f68391c;
    }

    public Object[] q(int i4) {
        int d5 = d();
        Object[] objArr = new Object[d5];
        for (int i5 = 0; i5 < d5; i5++) {
            objArr[i5] = b(i5, i4);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] r(T[] tArr, int i4) {
        int d5 = d();
        if (tArr.length < d5) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d5));
        }
        for (int i5 = 0; i5 < d5; i5++) {
            tArr[i5] = b(i5, i4);
        }
        if (tArr.length > d5) {
            tArr[d5] = null;
        }
        return tArr;
    }
}
