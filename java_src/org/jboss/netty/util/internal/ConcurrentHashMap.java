package org.jboss.netty.util.internal;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes7.dex */
public final class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: h  reason: collision with root package name */
    static final int f72743h = 16;

    /* renamed from: i  reason: collision with root package name */
    static final float f72744i = 0.75f;

    /* renamed from: j  reason: collision with root package name */
    static final int f72745j = 16;

    /* renamed from: k  reason: collision with root package name */
    static final int f72746k = 1073741824;

    /* renamed from: l  reason: collision with root package name */
    static final int f72747l = 65536;

    /* renamed from: m  reason: collision with root package name */
    static final int f72748m = 2;

    /* renamed from: b  reason: collision with root package name */
    final int f72749b;

    /* renamed from: c  reason: collision with root package name */
    final int f72750c;

    /* renamed from: d  reason: collision with root package name */
    final Segment<K, V>[] f72751d;

    /* renamed from: e  reason: collision with root package name */
    Set<K> f72752e;

    /* renamed from: f  reason: collision with root package name */
    Set<Map.Entry<K, V>> f72753f;

    /* renamed from: g  reason: collision with root package name */
    Collection<V> f72754g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class Segment<K, V> extends ReentrantLock {
        private static final long serialVersionUID = -2001752926705396395L;

        /* renamed from: b  reason: collision with root package name */
        volatile transient int f72755b;

        /* renamed from: c  reason: collision with root package name */
        int f72756c;

        /* renamed from: d  reason: collision with root package name */
        int f72757d;

        /* renamed from: e  reason: collision with root package name */
        volatile transient c<K, V>[] f72758e;

        /* renamed from: f  reason: collision with root package name */
        final float f72759f;

        Segment(int i4, float f5) {
            this.f72759f = f5;
            n(c.b(i4));
        }

        private static boolean e(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        static <K, V> Segment<K, V>[] f(int i4) {
            return new Segment[i4];
        }

        boolean a(Object obj, int i4) {
            if (this.f72755b != 0) {
                for (c<K, V> d5 = d(i4); d5 != null; d5 = d5.f72765d) {
                    if (d5.f72763b == i4 && e(obj, d5.a())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        boolean b(Object obj) {
            c<K, V>[] cVarArr;
            if (this.f72755b != 0) {
                for (c<K, V> cVar : this.f72758e) {
                    for (; cVar != null; cVar = cVar.f72765d) {
                        V d5 = cVar.d();
                        if (d5 == null) {
                            d5 = i(cVar);
                        }
                        if (obj.equals(d5)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        V c(Object obj, int i4) {
            if (this.f72755b != 0) {
                for (c<K, V> d5 = d(i4); d5 != null; d5 = d5.f72765d) {
                    if (d5.f72763b == i4 && e(obj, d5.a())) {
                        V d6 = d5.d();
                        return d6 != null ? d6 : i(d5);
                    }
                }
                return null;
            }
            return null;
        }

        void clear() {
            if (this.f72755b != 0) {
                lock();
                try {
                    c<K, V>[] cVarArr = this.f72758e;
                    for (int i4 = 0; i4 < cVarArr.length; i4++) {
                        cVarArr[i4] = null;
                    }
                    this.f72756c++;
                    this.f72755b = 0;
                } finally {
                    unlock();
                }
            }
        }

        c<K, V> d(int i4) {
            c<K, V>[] cVarArr = this.f72758e;
            return cVarArr[i4 & (cVarArr.length - 1)];
        }

        c<K, V> g(K k4, int i4, c<K, V> cVar, V v2) {
            return new c<>(k4, i4, cVar, v2);
        }

        V h(K k4, int i4, V v2, boolean z4) {
            V v4;
            int j4;
            lock();
            try {
                int i5 = this.f72755b;
                int i6 = i5 + 1;
                if (i5 > this.f72757d && (j4 = j()) > 0) {
                    i6 -= j4;
                    this.f72755b = i6 - 1;
                }
                c<K, V>[] cVarArr = this.f72758e;
                int length = (cVarArr.length - 1) & i4;
                c<K, V> cVar = cVarArr[length];
                c<K, V> cVar2 = cVar;
                while (cVar2 != null && (cVar2.f72763b != i4 || !e(k4, cVar2.a()))) {
                    cVar2 = cVar2.f72765d;
                }
                if (cVar2 != null) {
                    v4 = cVar2.d();
                    if (!z4) {
                        cVar2.c(v2);
                    }
                } else {
                    this.f72756c++;
                    cVarArr[length] = g(k4, i4, cVar, v2);
                    this.f72755b = i6;
                    v4 = null;
                }
                return v4;
            } finally {
                unlock();
            }
        }

        V i(c<K, V> cVar) {
            lock();
            try {
                return cVar.d();
            } finally {
                unlock();
            }
        }

        int j() {
            c<K, V>[] cVarArr = this.f72758e;
            int length = cVarArr.length;
            if (length >= 1073741824) {
                return 0;
            }
            c<K, V>[] b5 = c.b(length << 1);
            this.f72757d = (int) (b5.length * this.f72759f);
            int length2 = b5.length - 1;
            int i4 = 0;
            for (c<K, V> cVar : cVarArr) {
                if (cVar != null) {
                    c<K, V> cVar2 = cVar.f72765d;
                    int i5 = cVar.f72763b & length2;
                    if (cVar2 == null) {
                        b5[i5] = cVar;
                    } else {
                        c<K, V> cVar3 = cVar;
                        while (cVar2 != null) {
                            int i6 = cVar2.f72763b & length2;
                            if (i6 != i5) {
                                cVar3 = cVar2;
                                i5 = i6;
                            }
                            cVar2 = cVar2.f72765d;
                        }
                        b5[i5] = cVar3;
                        while (cVar != cVar3) {
                            K a5 = cVar.a();
                            if (a5 == null) {
                                i4++;
                            } else {
                                int i7 = cVar.f72763b;
                                int i8 = i7 & length2;
                                b5[i8] = g(a5, i7, b5[i8], cVar.d());
                            }
                            cVar = cVar.f72765d;
                        }
                    }
                }
            }
            this.f72758e = b5;
            return i4;
        }

        V k(Object obj, int i4, Object obj2, boolean z4) {
            lock();
            try {
                int i5 = this.f72755b - 1;
                c<K, V>[] cVarArr = this.f72758e;
                int length = (cVarArr.length - 1) & i4;
                c<K, V> cVar = cVarArr[length];
                c<K, V> cVar2 = cVar;
                while (cVar2 != null && obj != cVar2.f72762a && (z4 || i4 != cVar2.f72763b || !e(obj, cVar2.a()))) {
                    cVar2 = cVar2.f72765d;
                }
                V v2 = null;
                if (cVar2 != null) {
                    V d5 = cVar2.d();
                    if (obj2 == null || obj2.equals(d5)) {
                        this.f72756c++;
                        c<K, V> cVar3 = cVar2.f72765d;
                        while (cVar != cVar2) {
                            K a5 = cVar.a();
                            if (a5 == null) {
                                i5--;
                            } else {
                                cVar3 = g(a5, cVar.f72763b, cVar3, cVar.d());
                            }
                            cVar = cVar.f72765d;
                        }
                        cVarArr[length] = cVar3;
                        this.f72755b = i5;
                        v2 = d5;
                    }
                }
                return v2;
            } finally {
                unlock();
            }
        }

        V l(K k4, int i4, V v2) {
            lock();
            try {
                c<K, V> d5 = d(i4);
                while (d5 != null && (d5.f72763b != i4 || !e(k4, d5.a()))) {
                    d5 = d5.f72765d;
                }
                V v4 = null;
                if (d5 != null) {
                    v4 = d5.d();
                    d5.c(v2);
                }
                return v4;
            } finally {
                unlock();
            }
        }

        boolean m(K k4, int i4, V v2, V v4) {
            lock();
            try {
                c<K, V> d5 = d(i4);
                while (d5 != null && (d5.f72763b != i4 || !e(k4, d5.a()))) {
                    d5 = d5.f72765d;
                }
                boolean z4 = false;
                if (d5 != null && v2.equals(d5.d())) {
                    z4 = true;
                    d5.c(v4);
                }
                return z4;
            } finally {
                unlock();
            }
        }

        void n(c<K, V>[] cVarArr) {
            this.f72757d = (int) (cVarArr.length * this.f72759f);
            this.f72758e = cVarArr;
        }
    }

    /* loaded from: classes7.dex */
    final class a extends ConcurrentHashMap<K, V>.d implements org.jboss.netty.util.internal.f<Map.Entry<K, V>> {
        a() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> b5 = b();
            return new j(b5.a(), b5.d());
        }
    }

    /* loaded from: classes7.dex */
    final class b extends AbstractSet<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ConcurrentHashMap.this.get(entry.getKey());
                return obj2 != null && obj2.equals(entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ConcurrentHashMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return ConcurrentHashMap.this.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentHashMap.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final Object f72762a;

        /* renamed from: b  reason: collision with root package name */
        final int f72763b;

        /* renamed from: c  reason: collision with root package name */
        volatile Object f72764c;

        /* renamed from: d  reason: collision with root package name */
        final c<K, V> f72765d;

        c(K k4, int i4, c<K, V> cVar, V v2) {
            this.f72763b = i4;
            this.f72765d = cVar;
            this.f72762a = k4;
            this.f72764c = v2;
        }

        static <K, V> c<K, V>[] b(int i4) {
            return new c[i4];
        }

        K a() {
            return (K) this.f72762a;
        }

        void c(V v2) {
            this.f72764c = v2;
        }

        V d() {
            return (V) this.f72764c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public abstract class d {

        /* renamed from: b  reason: collision with root package name */
        int f72766b;

        /* renamed from: c  reason: collision with root package name */
        int f72767c = -1;

        /* renamed from: d  reason: collision with root package name */
        c<K, V>[] f72768d;

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f72769e;

        /* renamed from: f  reason: collision with root package name */
        c<K, V> f72770f;

        /* renamed from: g  reason: collision with root package name */
        K f72771g;

        d() {
            this.f72766b = ConcurrentHashMap.this.f72751d.length - 1;
            a();
        }

        final void a() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f72769e;
            if (cVar2 != null) {
                c<K, V> cVar3 = cVar2.f72765d;
                this.f72769e = cVar3;
                if (cVar3 != null) {
                    return;
                }
            }
            do {
                int i4 = this.f72767c;
                if (i4 >= 0) {
                    c<K, V>[] cVarArr = this.f72768d;
                    this.f72767c = i4 - 1;
                    cVar = cVarArr[i4];
                    this.f72769e = cVar;
                } else {
                    while (true) {
                        int i5 = this.f72766b;
                        if (i5 < 0) {
                            return;
                        }
                        Segment<K, V>[] segmentArr = ConcurrentHashMap.this.f72751d;
                        this.f72766b = i5 - 1;
                        Segment<K, V> segment = segmentArr[i5];
                        if (segment.f72755b != 0) {
                            c<K, V>[] cVarArr2 = segment.f72758e;
                            this.f72768d = cVarArr2;
                            for (int length = cVarArr2.length - 1; length >= 0; length--) {
                                c<K, V> cVar4 = this.f72768d[length];
                                this.f72769e = cVar4;
                                if (cVar4 != null) {
                                    this.f72767c = length - 1;
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                }
            } while (cVar == null);
        }

        c<K, V> b() {
            do {
                c<K, V> cVar = this.f72769e;
                if (cVar != null) {
                    this.f72770f = cVar;
                    this.f72771g = cVar.a();
                    a();
                } else {
                    throw new NoSuchElementException();
                }
            } while (this.f72771g == null);
            return this.f72770f;
        }

        public boolean hasMoreElements() {
            return hasNext();
        }

        public boolean hasNext() {
            while (true) {
                c<K, V> cVar = this.f72769e;
                if (cVar == null) {
                    return false;
                }
                if (cVar.a() != null) {
                    return true;
                }
                a();
            }
        }

        public void remove() {
            if (this.f72770f != null) {
                ConcurrentHashMap.this.remove(this.f72771g);
                this.f72770f = null;
                return;
            }
            throw new IllegalStateException();
        }

        public void rewind() {
            this.f72766b = ConcurrentHashMap.this.f72751d.length - 1;
            this.f72767c = -1;
            this.f72768d = null;
            this.f72769e = null;
            this.f72770f = null;
            this.f72771g = null;
            a();
        }
    }

    /* loaded from: classes7.dex */
    final class e extends ConcurrentHashMap<K, V>.d implements org.jboss.netty.util.internal.f<K>, Enumeration<K> {
        e() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return b().a();
        }

        @Override // java.util.Enumeration
        public K nextElement() {
            return b().a();
        }
    }

    /* loaded from: classes7.dex */
    final class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ConcurrentHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ConcurrentHashMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return ConcurrentHashMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentHashMap.this.size();
        }
    }

    /* loaded from: classes7.dex */
    final class h extends ConcurrentHashMap<K, V>.d implements org.jboss.netty.util.internal.f<V>, Enumeration<V> {
        h() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return b().d();
        }

        @Override // java.util.Enumeration
        public V nextElement() {
            return b().d();
        }
    }

    /* loaded from: classes7.dex */
    final class i extends AbstractCollection<V> {
        i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ConcurrentHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ConcurrentHashMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return ConcurrentHashMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return ConcurrentHashMap.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class j extends g<K, V> {
        j(K k4, V v2) {
            super(k4, v2);
        }

        @Override // org.jboss.netty.util.internal.ConcurrentHashMap.g, java.util.Map.Entry
        public V setValue(V v2) {
            Objects.requireNonNull(v2);
            V v4 = (V) super.setValue(v2);
            ConcurrentHashMap.this.put(getKey(), v2);
            return v4;
        }
    }

    public ConcurrentHashMap(int i4, float f5, int i5) {
        if (f5 > 0.0f && i4 >= 0 && i5 > 0) {
            int i6 = 0;
            int i7 = 1;
            int i8 = 1;
            int i9 = 0;
            while (i8 < (i5 > 65536 ? 65536 : i5)) {
                i9++;
                i8 <<= 1;
            }
            this.f72750c = 32 - i9;
            this.f72749b = i8 - 1;
            this.f72751d = Segment.f(i8);
            i4 = i4 > 1073741824 ? 1073741824 : i4;
            int i10 = i4 / i8;
            while (i7 < (i8 * i10 < i4 ? i10 + 1 : i10)) {
                i7 <<= 1;
            }
            while (true) {
                Segment<K, V>[] segmentArr = this.f72751d;
                if (i6 >= segmentArr.length) {
                    return;
                }
                segmentArr[i6] = new Segment<>(i7, f5);
                i6++;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static int c(int i4) {
        int i5 = i4 + ((i4 << 15) ^ (-12931));
        int i6 = i5 ^ (i5 >>> 10);
        int i7 = i6 + (i6 << 3);
        int i8 = i7 ^ (i7 >>> 6);
        int i9 = i8 + (i8 << 2) + (i8 << 14);
        return i9 ^ (i9 >>> 16);
    }

    private static int d(Object obj) {
        return c(obj.hashCode());
    }

    public boolean a(Object obj) {
        return containsValue(obj);
    }

    public Enumeration<V> b() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V> segment : this.f72751d) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int d5 = d(obj);
        return f(d5).a(obj, d5);
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        Segment<K, V>[] segmentArr = this.f72751d;
        int[] iArr = new int[segmentArr.length];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i5 < 2) {
                int i6 = 0;
                for (int i7 = 0; i7 < segmentArr.length; i7++) {
                    int i8 = segmentArr[i7].f72756c;
                    iArr[i7] = i8;
                    i6 += i8;
                    if (segmentArr[i7].b(obj)) {
                        return true;
                    }
                }
                if (i6 != 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= segmentArr.length) {
                            break;
                        } else if (iArr[i9] != segmentArr[i9].f72756c) {
                            z4 = false;
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                if (z4) {
                    return false;
                }
                i5++;
            } else {
                for (Segment<K, V> segment : segmentArr) {
                    segment.lock();
                }
                try {
                    int length = segmentArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z4 = false;
                            break;
                        } else if (segmentArr[i10].b(obj)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    int length2 = segmentArr.length;
                    while (i4 < length2) {
                        segmentArr[i4].unlock();
                        i4++;
                    }
                    return z4;
                } catch (Throwable th) {
                    int length3 = segmentArr.length;
                    while (i4 < length3) {
                        segmentArr[i4].unlock();
                        i4++;
                    }
                    throw th;
                }
            }
        }
    }

    public Enumeration<K> e() {
        return new e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f72753f;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.f72753f = bVar;
        return bVar;
    }

    Segment<K, V> f(int i4) {
        return this.f72751d[(i4 >>> this.f72750c) & this.f72749b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int d5 = d(obj);
        return f(d5).c(obj, d5);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f72751d;
        int[] iArr = new int[segmentArr.length];
        int i4 = 0;
        for (int i5 = 0; i5 < segmentArr.length; i5++) {
            if (segmentArr[i5].f72755b != 0) {
                return false;
            }
            int i6 = segmentArr[i5].f72756c;
            iArr[i5] = i6;
            i4 += i6;
        }
        if (i4 != 0) {
            for (int i7 = 0; i7 < segmentArr.length; i7++) {
                if (segmentArr[i7].f72755b != 0 || iArr[i7] != segmentArr[i7].f72756c) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f72752e;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f72752e = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k4, V v2) {
        Objects.requireNonNull(v2);
        int d5 = d(k4);
        return f(d5).h(k4, d5, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k4, V v2) {
        Objects.requireNonNull(v2);
        int d5 = d(k4);
        return f(d5).h(k4, d5, v2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int d5 = d(obj);
        return f(d5).k(obj, d5, null, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k4, V v2, V v4) {
        if (v2 != null && v4 != null) {
            int d5 = d(k4);
            return f(d5).m(k4, d5, v2, v4);
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Segment<K, V>[] segmentArr = this.f72751d;
        int[] iArr = new int[segmentArr.length];
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            j5 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < segmentArr.length; i6++) {
                j5 += segmentArr[i6].f72755b;
                int i7 = segmentArr[i6].f72756c;
                iArr[i6] = i7;
                i5 += i7;
            }
            if (i5 != 0) {
                long j7 = 0;
                int i8 = 0;
                while (true) {
                    if (i8 >= segmentArr.length) {
                        j6 = j7;
                        break;
                    }
                    j7 += segmentArr[i8].f72755b;
                    if (iArr[i8] != segmentArr[i8].f72756c) {
                        j6 = -1;
                        break;
                    }
                    i8++;
                }
            } else {
                j6 = 0;
            }
            if (j6 == j5) {
                break;
            }
        }
        if (j6 != j5) {
            for (Segment<K, V> segment : segmentArr) {
                segment.lock();
            }
            for (Segment<K, V> segment2 : segmentArr) {
                j4 += segment2.f72755b;
            }
            for (Segment<K, V> segment3 : segmentArr) {
                segment3.unlock();
            }
            j5 = j4;
        }
        if (j5 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f72754g;
        if (collection != null) {
            return collection;
        }
        i iVar = new i();
        this.f72754g = iVar;
        return iVar;
    }

    /* loaded from: classes7.dex */
    static class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private final K f72775b;

        /* renamed from: c  reason: collision with root package name */
        private V f72776c;

        public g(K k4, V v2) {
            this.f72775b = k4;
            this.f72776c = v2;
        }

        private static boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return a(this.f72775b, entry.getKey()) && a(this.f72776c, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f72775b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f72776c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k4 = this.f72775b;
            int hashCode = k4 == null ? 0 : k4.hashCode();
            V v2 = this.f72776c;
            return hashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v4 = this.f72776c;
            this.f72776c = v2;
            return v4;
        }

        public String toString() {
            return this.f72775b + SimpleComparison.EQUAL_TO_OPERATION + this.f72776c;
        }

        public g(Map.Entry<? extends K, ? extends V> entry) {
            this.f72775b = entry.getKey();
            this.f72776c = entry.getValue();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        int d5 = d(obj);
        return (obj2 == null || f(d5).k(obj, d5, obj2, false) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k4, V v2) {
        Objects.requireNonNull(v2);
        int d5 = d(k4);
        return f(d5).l(k4, d5, v2);
    }

    public ConcurrentHashMap(int i4, float f5) {
        this(i4, f5, 16);
    }

    public ConcurrentHashMap(int i4) {
        this(i4, 0.75f, 16);
    }

    public ConcurrentHashMap() {
        this(16, 0.75f, 16);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this(Math.max(((int) (map.size() / 0.75f)) + 1, 16), 0.75f, 16);
        putAll(map);
    }
}
