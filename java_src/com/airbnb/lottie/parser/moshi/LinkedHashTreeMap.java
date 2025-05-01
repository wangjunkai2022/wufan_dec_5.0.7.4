package com.airbnb.lottie.parser.moshi;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    private static final Comparator<Comparable> f4183j = new a();

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ boolean f4184k = false;

    /* renamed from: b  reason: collision with root package name */
    Comparator<? super K> f4185b;

    /* renamed from: c  reason: collision with root package name */
    g<K, V>[] f4186c;

    /* renamed from: d  reason: collision with root package name */
    final g<K, V> f4187d;

    /* renamed from: e  reason: collision with root package name */
    int f4188e;

    /* renamed from: f  reason: collision with root package name */
    int f4189f;

    /* renamed from: g  reason: collision with root package name */
    int f4190g;

    /* renamed from: h  reason: collision with root package name */
    private LinkedHashTreeMap<K, V>.d f4191h;

    /* renamed from: i  reason: collision with root package name */
    private LinkedHashTreeMap<K, V>.e f4192i;

    /* loaded from: classes2.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private g<K, V> f4193a;

        /* renamed from: b  reason: collision with root package name */
        private int f4194b;

        /* renamed from: c  reason: collision with root package name */
        private int f4195c;

        /* renamed from: d  reason: collision with root package name */
        private int f4196d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f4208d = null;
            gVar.f4206b = null;
            gVar.f4207c = null;
            gVar.f4214j = 1;
            int i4 = this.f4194b;
            if (i4 > 0) {
                int i5 = this.f4196d;
                if ((i5 & 1) == 0) {
                    this.f4196d = i5 + 1;
                    this.f4194b = i4 - 1;
                    this.f4195c++;
                }
            }
            gVar.f4206b = this.f4193a;
            this.f4193a = gVar;
            int i6 = this.f4196d + 1;
            this.f4196d = i6;
            int i7 = this.f4194b;
            if (i7 > 0 && (i6 & 1) == 0) {
                this.f4196d = i6 + 1;
                this.f4194b = i7 - 1;
                this.f4195c++;
            }
            int i8 = 4;
            while (true) {
                int i9 = i8 - 1;
                if ((this.f4196d & i9) != i9) {
                    return;
                }
                int i10 = this.f4195c;
                if (i10 == 0) {
                    g<K, V> gVar2 = this.f4193a;
                    g<K, V> gVar3 = gVar2.f4206b;
                    g<K, V> gVar4 = gVar3.f4206b;
                    gVar3.f4206b = gVar4.f4206b;
                    this.f4193a = gVar3;
                    gVar3.f4207c = gVar4;
                    gVar3.f4208d = gVar2;
                    gVar3.f4214j = gVar2.f4214j + 1;
                    gVar4.f4206b = gVar3;
                    gVar2.f4206b = gVar3;
                } else if (i10 == 1) {
                    g<K, V> gVar5 = this.f4193a;
                    g<K, V> gVar6 = gVar5.f4206b;
                    this.f4193a = gVar6;
                    gVar6.f4208d = gVar5;
                    gVar6.f4214j = gVar5.f4214j + 1;
                    gVar5.f4206b = gVar6;
                    this.f4195c = 0;
                } else if (i10 == 2) {
                    this.f4195c = 0;
                }
                i8 *= 2;
            }
        }

        void b(int i4) {
            this.f4194b = ((Integer.highestOneBit(i4) * 2) - 1) - i4;
            this.f4196d = 0;
            this.f4195c = 0;
            this.f4193a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f4193a;
            if (gVar.f4206b == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private g<K, V> f4197a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f4197a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f4206b;
            gVar.f4206b = null;
            g<K, V> gVar3 = gVar.f4208d;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.f4206b = gVar4;
                    gVar3 = gVar2.f4207c;
                } else {
                    this.f4197a = gVar4;
                    return gVar;
                }
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f4206b = gVar2;
                gVar2 = gVar;
                gVar = gVar.f4207c;
            }
            this.f4197a = gVar2;
        }
    }

    /* loaded from: classes2.dex */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        class a extends LinkedHashTreeMap<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> e5;
            if ((obj instanceof Map.Entry) && (e5 = LinkedHashTreeMap.this.e((Map.Entry) obj)) != null) {
                LinkedHashTreeMap.this.h(e5, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f4188e;
        }
    }

    /* loaded from: classes2.dex */
    final class e extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        class a extends LinkedHashTreeMap<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f4211g;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f4188e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class f<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        g<K, V> f4202b;

        /* renamed from: c  reason: collision with root package name */
        g<K, V> f4203c = null;

        /* renamed from: d  reason: collision with root package name */
        int f4204d;

        f() {
            this.f4202b = LinkedHashTreeMap.this.f4187d.f4209e;
            this.f4204d = LinkedHashTreeMap.this.f4189f;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f4202b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar != linkedHashTreeMap.f4187d) {
                if (linkedHashTreeMap.f4189f == this.f4204d) {
                    this.f4202b = gVar.f4209e;
                    this.f4203c = gVar;
                    return gVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4202b != LinkedHashTreeMap.this.f4187d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f4203c;
            if (gVar != null) {
                LinkedHashTreeMap.this.h(gVar, true);
                this.f4203c = null;
                this.f4204d = LinkedHashTreeMap.this.f4189f;
                return;
            }
            throw new IllegalStateException();
        }
    }

    LinkedHashTreeMap() {
        this(null);
    }

    private void a() {
        g<K, V>[] b5 = b(this.f4186c);
        this.f4186c = b5;
        this.f4190g = (b5.length / 2) + (b5.length / 4);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i4 = 0; i4 < length; i4++) {
            g<K, V> gVar = gVarArr[i4];
            if (gVar != null) {
                cVar.b(gVar);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    g<K, V> a5 = cVar.a();
                    if (a5 == null) {
                        break;
                    } else if ((a5.f4212h & length) == 0) {
                        i5++;
                    } else {
                        i6++;
                    }
                }
                bVar.b(i5);
                bVar2.b(i6);
                cVar.b(gVar);
                while (true) {
                    g<K, V> a6 = cVar.a();
                    if (a6 == null) {
                        break;
                    } else if ((a6.f4212h & length) == 0) {
                        bVar.a(a6);
                    } else {
                        bVar2.a(a6);
                    }
                }
                gVarArr2[i4] = i5 > 0 ? bVar.c() : null;
                gVarArr2[i4 + length] = i6 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void g(g<K, V> gVar, boolean z4) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f4207c;
            g<K, V> gVar3 = gVar.f4208d;
            int i4 = gVar2 != null ? gVar2.f4214j : 0;
            int i5 = gVar3 != null ? gVar3.f4214j : 0;
            int i6 = i4 - i5;
            if (i6 == -2) {
                g<K, V> gVar4 = gVar3.f4207c;
                g<K, V> gVar5 = gVar3.f4208d;
                int i7 = (gVar4 != null ? gVar4.f4214j : 0) - (gVar5 != null ? gVar5.f4214j : 0);
                if (i7 != -1 && (i7 != 0 || z4)) {
                    l(gVar3);
                    k(gVar);
                } else {
                    k(gVar);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 2) {
                g<K, V> gVar6 = gVar2.f4207c;
                g<K, V> gVar7 = gVar2.f4208d;
                int i8 = (gVar6 != null ? gVar6.f4214j : 0) - (gVar7 != null ? gVar7.f4214j : 0);
                if (i8 != 1 && (i8 != 0 || z4)) {
                    k(gVar2);
                    l(gVar);
                } else {
                    l(gVar);
                }
                if (z4) {
                    return;
                }
            } else if (i6 == 0) {
                gVar.f4214j = i4 + 1;
                if (z4) {
                    return;
                }
            } else {
                gVar.f4214j = Math.max(i4, i5) + 1;
                if (!z4) {
                    return;
                }
            }
            gVar = gVar.f4206b;
        }
    }

    private void j(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f4206b;
        gVar.f4206b = null;
        if (gVar2 != null) {
            gVar2.f4206b = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.f4207c == gVar) {
                gVar3.f4207c = gVar2;
                return;
            } else {
                gVar3.f4208d = gVar2;
                return;
            }
        }
        int i4 = gVar.f4212h;
        g<K, V>[] gVarArr = this.f4186c;
        gVarArr[i4 & (gVarArr.length - 1)] = gVar2;
    }

    private void k(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f4207c;
        g<K, V> gVar3 = gVar.f4208d;
        g<K, V> gVar4 = gVar3.f4207c;
        g<K, V> gVar5 = gVar3.f4208d;
        gVar.f4208d = gVar4;
        if (gVar4 != null) {
            gVar4.f4206b = gVar;
        }
        j(gVar, gVar3);
        gVar3.f4207c = gVar;
        gVar.f4206b = gVar3;
        int max = Math.max(gVar2 != null ? gVar2.f4214j : 0, gVar4 != null ? gVar4.f4214j : 0) + 1;
        gVar.f4214j = max;
        gVar3.f4214j = Math.max(max, gVar5 != null ? gVar5.f4214j : 0) + 1;
    }

    private void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f4207c;
        g<K, V> gVar3 = gVar.f4208d;
        g<K, V> gVar4 = gVar2.f4207c;
        g<K, V> gVar5 = gVar2.f4208d;
        gVar.f4207c = gVar5;
        if (gVar5 != null) {
            gVar5.f4206b = gVar;
        }
        j(gVar, gVar2);
        gVar2.f4208d = gVar;
        gVar.f4206b = gVar2;
        int max = Math.max(gVar3 != null ? gVar3.f4214j : 0, gVar5 != null ? gVar5.f4214j : 0) + 1;
        gVar.f4214j = max;
        gVar2.f4214j = Math.max(max, gVar4 != null ? gVar4.f4214j : 0) + 1;
    }

    private static int m(int i4) {
        int i5 = i4 ^ ((i4 >>> 20) ^ (i4 >>> 12));
        return (i5 >>> 4) ^ ((i5 >>> 7) ^ i5);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f4186c, (Object) null);
        this.f4188e = 0;
        this.f4189f++;
        g<K, V> gVar = this.f4187d;
        g<K, V> gVar2 = gVar.f4209e;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f4209e;
            gVar2.f4210f = null;
            gVar2.f4209e = null;
            gVar2 = gVar3;
        }
        gVar.f4210f = gVar;
        gVar.f4209e = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    g<K, V> d(K k4, boolean z4) {
        g<K, V> gVar;
        int i4;
        g<K, V> gVar2;
        int compare;
        Comparator<? super K> comparator = this.f4185b;
        g<K, V>[] gVarArr = this.f4186c;
        int m4 = m(k4.hashCode());
        int length = (gVarArr.length - 1) & m4;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == f4183j ? (Comparable) k4 : null;
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(gVar3.f4211g);
                } else {
                    compare = comparator.compare(k4, (K) gVar3.f4211g);
                }
                if (compare == 0) {
                    return gVar3;
                }
                g<K, V> gVar4 = compare < 0 ? gVar3.f4207c : gVar3.f4208d;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i4 = compare;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i4 = 0;
        }
        if (z4) {
            g<K, V> gVar5 = this.f4187d;
            if (gVar == null) {
                if (comparator == f4183j && !(k4 instanceof Comparable)) {
                    throw new ClassCastException(k4.getClass().getName() + " is not Comparable");
                }
                gVar2 = new g<>(gVar, k4, m4, gVar5, gVar5.f4210f);
                gVarArr[length] = gVar2;
            } else {
                gVar2 = new g<>(gVar, k4, m4, gVar5, gVar5.f4210f);
                if (i4 < 0) {
                    gVar.f4207c = gVar2;
                } else {
                    gVar.f4208d = gVar2;
                }
                g(gVar, true);
            }
            int i5 = this.f4188e;
            this.f4188e = i5 + 1;
            if (i5 > this.f4190g) {
                a();
            }
            this.f4189f++;
            return gVar2;
        }
        return null;
    }

    g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> f5 = f(entry.getKey());
        if (f5 != null && c(f5.f4213i, entry.getValue())) {
            return f5;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.f4191h;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.f4191h = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> f(Object obj) {
        if (obj != 0) {
            try {
                return d(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> f5 = f(obj);
        if (f5 != null) {
            return f5.f4213i;
        }
        return null;
    }

    void h(g<K, V> gVar, boolean z4) {
        int i4;
        if (z4) {
            g<K, V> gVar2 = gVar.f4210f;
            gVar2.f4209e = gVar.f4209e;
            gVar.f4209e.f4210f = gVar2;
            gVar.f4210f = null;
            gVar.f4209e = null;
        }
        g<K, V> gVar3 = gVar.f4207c;
        g<K, V> gVar4 = gVar.f4208d;
        g<K, V> gVar5 = gVar.f4206b;
        int i5 = 0;
        if (gVar3 != null && gVar4 != null) {
            g<K, V> b5 = gVar3.f4214j > gVar4.f4214j ? gVar3.b() : gVar4.a();
            h(b5, false);
            g<K, V> gVar6 = gVar.f4207c;
            if (gVar6 != null) {
                i4 = gVar6.f4214j;
                b5.f4207c = gVar6;
                gVar6.f4206b = b5;
                gVar.f4207c = null;
            } else {
                i4 = 0;
            }
            g<K, V> gVar7 = gVar.f4208d;
            if (gVar7 != null) {
                i5 = gVar7.f4214j;
                b5.f4208d = gVar7;
                gVar7.f4206b = b5;
                gVar.f4208d = null;
            }
            b5.f4214j = Math.max(i4, i5) + 1;
            j(gVar, b5);
            return;
        }
        if (gVar3 != null) {
            j(gVar, gVar3);
            gVar.f4207c = null;
        } else if (gVar4 != null) {
            j(gVar, gVar4);
            gVar.f4208d = null;
        } else {
            j(gVar, null);
        }
        g(gVar5, false);
        this.f4188e--;
        this.f4189f++;
    }

    g<K, V> i(Object obj) {
        g<K, V> f5 = f(obj);
        if (f5 != null) {
            h(f5, true);
        }
        return f5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.f4192i;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new e();
        this.f4192i = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k4, V v2) {
        Objects.requireNonNull(k4, "key == null");
        g<K, V> d5 = d(k4, true);
        V v4 = d5.f4213i;
        d5.f4213i = v2;
        return v4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> i4 = i(obj);
        if (i4 != null) {
            return i4.f4213i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4188e;
    }

    LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.f4188e = 0;
        this.f4189f = 0;
        this.f4185b = comparator == null ? f4183j : comparator;
        this.f4187d = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f4186c = gVarArr;
        this.f4190g = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        g<K, V> f4206b;

        /* renamed from: c  reason: collision with root package name */
        g<K, V> f4207c;

        /* renamed from: d  reason: collision with root package name */
        g<K, V> f4208d;

        /* renamed from: e  reason: collision with root package name */
        g<K, V> f4209e;

        /* renamed from: f  reason: collision with root package name */
        g<K, V> f4210f;

        /* renamed from: g  reason: collision with root package name */
        final K f4211g;

        /* renamed from: h  reason: collision with root package name */
        final int f4212h;

        /* renamed from: i  reason: collision with root package name */
        V f4213i;

        /* renamed from: j  reason: collision with root package name */
        int f4214j;

        g() {
            this.f4211g = null;
            this.f4212h = -1;
            this.f4210f = this;
            this.f4209e = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f4207c; gVar2 != null; gVar2 = gVar2.f4207c) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f4208d; gVar2 != null; gVar2 = gVar2.f4208d) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k4 = this.f4211g;
                if (k4 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k4.equals(entry.getKey())) {
                    return false;
                }
                V v2 = this.f4213i;
                if (v2 == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v2.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4211g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4213i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k4 = this.f4211g;
            int hashCode = k4 == null ? 0 : k4.hashCode();
            V v2 = this.f4213i;
            return hashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v4 = this.f4213i;
            this.f4213i = v2;
            return v4;
        }

        public String toString() {
            return this.f4211g + SimpleComparison.EQUAL_TO_OPERATION + this.f4213i;
        }

        g(g<K, V> gVar, K k4, int i4, g<K, V> gVar2, g<K, V> gVar3) {
            this.f4206b = gVar;
            this.f4211g = k4;
            this.f4212h = i4;
            this.f4214j = 1;
            this.f4209e = gVar2;
            this.f4210f = gVar3;
            gVar3.f4209e = this;
            gVar2.f4210f = this;
        }
    }
}
