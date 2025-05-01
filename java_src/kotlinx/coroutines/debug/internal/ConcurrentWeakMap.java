package kotlinx.coroutines.debug.internal;

import com.googlecode.mp4parser.boxes.apple.x0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ConcurrentWeakMap.kt */
/* loaded from: classes6.dex */
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f70025c = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");
    @NotNull
    private volatile /* synthetic */ int _size;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<K> f70026b;
    @NotNull
    volatile /* synthetic */ Object core;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConcurrentWeakMap.kt */
    /* loaded from: classes6.dex */
    public final class a {

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f70027g = AtomicIntegerFieldUpdater.newUpdater(a.class, x0.f13710s);

        /* renamed from: a  reason: collision with root package name */
        private final int f70028a;

        /* renamed from: b  reason: collision with root package name */
        private final int f70029b;

        /* renamed from: c  reason: collision with root package name */
        private final int f70030c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ AtomicReferenceArray f70031d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ AtomicReferenceArray f70032e;
        @NotNull
        private volatile /* synthetic */ int load = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ConcurrentWeakMap.kt */
        /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public final class C0778a<E> implements Iterator<E>, KMutableIterator {
            @NotNull

            /* renamed from: b  reason: collision with root package name */
            private final Function2<K, V, E> f70034b;

            /* renamed from: c  reason: collision with root package name */
            private int f70035c = -1;

            /* renamed from: d  reason: collision with root package name */
            private K f70036d;

            /* renamed from: e  reason: collision with root package name */
            private V f70037e;

            /* JADX WARN: Multi-variable type inference failed */
            public C0778a(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
                this.f70034b = function2;
                a();
            }

            private final void a() {
                while (true) {
                    int i4 = this.f70035c + 1;
                    this.f70035c = i4;
                    if (i4 >= ((a) a.this).f70028a) {
                        return;
                    }
                    g gVar = (g) a.this.f70031d.get(this.f70035c);
                    K k4 = gVar == null ? null : (K) gVar.get();
                    if (k4 != null) {
                        this.f70036d = k4;
                        V v2 = (V) a.this.f70032e.get(this.f70035c);
                        if (v2 instanceof h) {
                            v2 = (V) ((h) v2).f70106a;
                        }
                        if (v2 != null) {
                            this.f70037e = v2;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @NotNull
            /* renamed from: b */
            public Void remove() {
                kotlinx.coroutines.debug.internal.b.e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f70035c < ((a) a.this).f70028a;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f70035c < ((a) a.this).f70028a) {
                    Function2<K, V, E> function2 = this.f70034b;
                    K k4 = this.f70036d;
                    if (k4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("key");
                        k4 = (K) Unit.INSTANCE;
                    }
                    V v2 = this.f70037e;
                    if (v2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("value");
                        v2 = (V) Unit.INSTANCE;
                    }
                    E invoke = function2.invoke(k4, v2);
                    a();
                    return invoke;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i4) {
            this.f70028a = i4;
            this.f70029b = Integer.numberOfLeadingZeros(i4) + 1;
            this.f70030c = (i4 * 2) / 3;
            this.f70031d = new AtomicReferenceArray(i4);
            this.f70032e = new AtomicReferenceArray(i4);
        }

        private final int d(int i4) {
            return (i4 * (-1640531527)) >>> this.f70029b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, g gVar, int i4, Object obj3) {
            if ((i4 & 4) != 0) {
                gVar = null;
            }
            return aVar.f(obj, obj2, gVar);
        }

        private final void i(int i4) {
            Object obj;
            do {
                obj = this.f70032e.get(i4);
                if (obj == null || (obj instanceof h)) {
                    return;
                }
            } while (!this.f70032e.compareAndSet(i4, obj, null));
            ConcurrentWeakMap.this.d();
        }

        public final void b(@NotNull g<?> gVar) {
            int d5 = d(gVar.f70105a);
            while (true) {
                g<?> gVar2 = (g) this.f70031d.get(d5);
                if (gVar2 == null) {
                    return;
                }
                if (gVar2 == gVar) {
                    i(d5);
                    return;
                }
                if (d5 == 0) {
                    d5 = this.f70028a;
                }
                d5--;
            }
        }

        @Nullable
        public final V c(@NotNull K k4) {
            int d5 = d(k4.hashCode());
            while (true) {
                g gVar = (g) this.f70031d.get(d5);
                if (gVar == null) {
                    return null;
                }
                T t4 = gVar.get();
                if (Intrinsics.areEqual(k4, t4)) {
                    V v2 = (V) this.f70032e.get(d5);
                    return v2 instanceof h ? (V) ((h) v2).f70106a : v2;
                }
                if (t4 == 0) {
                    i(d5);
                }
                if (d5 == 0) {
                    d5 = this.f70028a;
                }
                d5--;
            }
        }

        @NotNull
        public final <E> Iterator<E> e(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            return new C0778a(function2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
            r6 = r5.f70032e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
            if ((r6 instanceof kotlinx.coroutines.debug.internal.h) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
            r6 = kotlinx.coroutines.debug.internal.b.f70091c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
            if (r5.f70032e.compareAndSet(r0, r6, r7) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
            return r6;
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull K r6, @org.jetbrains.annotations.Nullable V r7, @org.jetbrains.annotations.Nullable kotlinx.coroutines.debug.internal.g<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.d(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f70031d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.g r2 = (kotlinx.coroutines.debug.internal.g) r2
                if (r2 != 0) goto L45
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L2f
            L19:
                int r1 = r5.load
                int r3 = r5.f70030c
                if (r1 < r3) goto L24
                kotlinx.coroutines.internal.o0 r6 = kotlinx.coroutines.debug.internal.b.a()
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.a.f70027g
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 == 0) goto L19
                r1 = 1
            L2f:
                if (r8 != 0) goto L3c
                kotlinx.coroutines.debug.internal.g r8 = new kotlinx.coroutines.debug.internal.g
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.b(r3)
                r8.<init>(r6, r3)
            L3c:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f70031d
                boolean r2 = r3.compareAndSet(r0, r2, r8)
                if (r2 == 0) goto L9
                goto L56
            L45:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
                if (r3 == 0) goto L6e
                if (r1 == 0) goto L56
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.a.f70027g
                r6.decrementAndGet(r5)
            L56:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f70032e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.h
                if (r8 == 0) goto L65
                kotlinx.coroutines.internal.o0 r6 = kotlinx.coroutines.debug.internal.b.a()
                return r6
            L65:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f70032e
                boolean r8 = r8.compareAndSet(r0, r6, r7)
                if (r8 == 0) goto L56
                return r6
            L6e:
                if (r2 != 0) goto L73
                r5.i(r0)
            L73:
                if (r0 != 0) goto L77
                int r0 = r5.f70028a
            L77:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.a.f(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.g):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ConcurrentWeakMap<K, V>.a h() {
            int coerceAtLeast;
            Object obj;
            o0 o0Var;
            h d5;
            while (true) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(ConcurrentWeakMap.this.size(), 4);
                ConcurrentWeakMap<K, V>.a aVar = (ConcurrentWeakMap<K, V>.a) new a(Integer.highestOneBit(coerceAtLeast) * 4);
                int i4 = 0;
                int i5 = this.f70028a;
                while (i4 < i5) {
                    int i6 = i4 + 1;
                    g gVar = (g) this.f70031d.get(i4);
                    Object obj2 = gVar == null ? null : gVar.get();
                    if (gVar != null && obj2 == null) {
                        i(i4);
                    }
                    while (true) {
                        obj = this.f70032e.get(i4);
                        if (obj instanceof h) {
                            obj = ((h) obj).f70106a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f70032e;
                        d5 = kotlinx.coroutines.debug.internal.b.d(obj);
                        if (atomicReferenceArray.compareAndSet(i4, obj, d5)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object f5 = aVar.f(obj2, obj, gVar);
                        o0Var = kotlinx.coroutines.debug.internal.b.f70091c;
                        if (f5 == o0Var) {
                            break;
                        }
                    }
                    i4 = i6;
                }
                return aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConcurrentWeakMap.kt */
    /* loaded from: classes6.dex */
    public static final class b<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: b  reason: collision with root package name */
        private final K f70039b;

        /* renamed from: c  reason: collision with root package name */
        private final V f70040c;

        public b(K k4, V v2) {
            this.f70039b = k4;
            this.f70040c = v2;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f70039b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f70040c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            kotlinx.coroutines.debug.internal.b.e();
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    /* loaded from: classes6.dex */
    private final class c<E> extends AbstractMutableSet<E> {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private final Function2<K, V, E> f70041b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            this.f70041b = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e5) {
            kotlinx.coroutines.debug.internal.b.e();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            return ((a) ConcurrentWeakMap.this.core).e(this.f70041b);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z4);
    }

    private final void c(g<?> gVar) {
        ((a) this.core).b(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        f70025c.decrementAndGet(this);
    }

    private final synchronized V e(K k4, V v2) {
        V v4;
        o0 o0Var;
        a aVar = (a) this.core;
        while (true) {
            v4 = (V) a.g(aVar, k4, v2, null, 4, null);
            o0Var = kotlinx.coroutines.debug.internal.b.f70091c;
            if (v4 == o0Var) {
                aVar = aVar.h();
                this.core = aVar;
            }
        }
        return v4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (K k4 : keySet()) {
            remove(k4);
        }
    }

    public final void f() {
        if (!(this.f70026b != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.f70026b.remove();
                if (remove == null) {
                    break;
                }
                c((g) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) this.core).c(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new c(new Function2<K, V, Map.Entry<K, V>>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* renamed from: a */
            public final Map.Entry<K, V> invoke(@NotNull K k4, @NotNull V v2) {
                return new ConcurrentWeakMap.b(k4, v2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new c(new Function2<K, V, K>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final K invoke(@NotNull K k4, @NotNull V v2) {
                return k4;
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this._size;
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k4, @NotNull V v2) {
        o0 o0Var;
        V v4 = (V) a.g((a) this.core, k4, v2, null, 4, null);
        o0Var = kotlinx.coroutines.debug.internal.b.f70091c;
        if (v4 == o0Var) {
            v4 = e(k4, v2);
        }
        if (v4 == null) {
            f70025c.incrementAndGet(this);
        }
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        o0 o0Var;
        if (obj == 0) {
            return null;
        }
        V v2 = (V) a.g((a) this.core, obj, null, null, 4, null);
        o0Var = kotlinx.coroutines.debug.internal.b.f70091c;
        if (v2 == o0Var) {
            v2 = e(obj, null);
        }
        if (v2 != null) {
            f70025c.decrementAndGet(this);
        }
        return v2;
    }

    public ConcurrentWeakMap(boolean z4) {
        this._size = 0;
        this.core = new a(16);
        this.f70026b = z4 ? new ReferenceQueue<>() : null;
    }
}
