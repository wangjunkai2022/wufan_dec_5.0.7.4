package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;
/* loaded from: classes.dex */
public abstract class BasePool<V> implements com.facebook.common.memory.e<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f11937a = getClass();

    /* renamed from: b  reason: collision with root package name */
    final com.facebook.common.memory.c f11938b;

    /* renamed from: c  reason: collision with root package name */
    final e0 f11939c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    final SparseArray<f<V>> f11940d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    final Set<V> f11941e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11942f;
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    final a f11943g;
    @VisibleForTesting
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    final a f11944h;

    /* renamed from: i  reason: collision with root package name */
    private final f0 f11945i;

    /* loaded from: classes2.dex */
    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* loaded from: classes2.dex */
    public static class InvalidValueException extends RuntimeException {
        public InvalidValueException(Object obj) {
            super("Invalid value: " + obj.toString());
        }
    }

    /* loaded from: classes2.dex */
    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i4, int i5, int i6, int i7) {
            super("Pool hard cap violation? Hard cap = " + i4 + " Used size = " + i5 + " Free size = " + i6 + " Request size = " + i7);
        }
    }

    /* loaded from: classes2.dex */
    public static class SizeTooLargeException extends InvalidSizeException {
        public SizeTooLargeException(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    @NotThreadSafe
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        private static final String f11946c = "com.facebook.imagepipeline.memory.BasePool.Counter";

        /* renamed from: a  reason: collision with root package name */
        int f11947a;

        /* renamed from: b  reason: collision with root package name */
        int f11948b;

        a() {
        }

        public void a(int i4) {
            int i5;
            int i6 = this.f11948b;
            if (i6 >= i4 && (i5 = this.f11947a) > 0) {
                this.f11947a = i5 - 1;
                this.f11948b = i6 - i4;
                return;
            }
            com.facebook.common.logging.a.y0(f11946c, "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i4), Integer.valueOf(this.f11948b), Integer.valueOf(this.f11947a));
        }

        public void b(int i4) {
            this.f11947a++;
            this.f11948b += i4;
        }

        public void c() {
            this.f11947a = 0;
            this.f11948b = 0;
        }
    }

    public BasePool(com.facebook.common.memory.c cVar, e0 e0Var, f0 f0Var) {
        this.f11938b = (com.facebook.common.memory.c) com.facebook.common.internal.h.i(cVar);
        e0 e0Var2 = (e0) com.facebook.common.internal.h.i(e0Var);
        this.f11939c = e0Var2;
        this.f11945i = (f0) com.facebook.common.internal.h.i(f0Var);
        this.f11940d = new SparseArray<>();
        if (e0Var2.f12014g) {
            n();
        } else {
            r(new SparseIntArray(0));
        }
        this.f11941e = com.facebook.common.internal.j.g();
        this.f11944h = new a();
        this.f11943g = new a();
    }

    private synchronized void c() {
        boolean z4;
        if (p() && this.f11944h.f11948b != 0) {
            z4 = false;
            com.facebook.common.internal.h.o(z4);
        }
        z4 = true;
        com.facebook.common.internal.h.o(z4);
    }

    private void e(SparseIntArray sparseIntArray) {
        this.f11940d.clear();
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int keyAt = sparseIntArray.keyAt(i4);
            this.f11940d.put(keyAt, new f<>(k(keyAt), sparseIntArray.valueAt(i4), 0, this.f11939c.f12014g));
        }
    }

    private synchronized f<V> h(int i4) {
        return this.f11940d.get(i4);
    }

    private synchronized void n() {
        SparseIntArray sparseIntArray = this.f11939c.f12010c;
        if (sparseIntArray != null) {
            e(sparseIntArray);
            this.f11942f = false;
        } else {
            this.f11942f = true;
        }
    }

    private synchronized void r(SparseIntArray sparseIntArray) {
        com.facebook.common.internal.h.i(sparseIntArray);
        this.f11940d.clear();
        SparseIntArray sparseIntArray2 = this.f11939c.f12010c;
        if (sparseIntArray2 != null) {
            for (int i4 = 0; i4 < sparseIntArray2.size(); i4++) {
                int keyAt = sparseIntArray2.keyAt(i4);
                this.f11940d.put(keyAt, new f<>(k(keyAt), sparseIntArray2.valueAt(i4), sparseIntArray.get(keyAt, 0), this.f11939c.f12014g));
            }
            this.f11942f = false;
        } else {
            this.f11942f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void s() {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.Y(this.f11937a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f11943g.f11947a), Integer.valueOf(this.f11943g.f11948b), Integer.valueOf(this.f11944h.f11947a), Integer.valueOf(this.f11944h.f11948b));
        }
    }

    private List<f<V>> v() {
        ArrayList arrayList = new ArrayList(this.f11940d.size());
        int size = this.f11940d.size();
        for (int i4 = 0; i4 < size; i4++) {
            f<V> valueAt = this.f11940d.valueAt(i4);
            int i5 = valueAt.f12017a;
            int i6 = valueAt.f12018b;
            int e5 = valueAt.e();
            if (valueAt.d() > 0) {
                arrayList.add(valueAt);
            }
            this.f11940d.setValueAt(i4, new f<>(k(i5), i6, e5, this.f11939c.f12014g));
        }
        return arrayList;
    }

    protected abstract V a(int i4);

    @VisibleForTesting
    synchronized boolean b(int i4) {
        e0 e0Var = this.f11939c;
        int i5 = e0Var.f12008a;
        int i6 = this.f11943g.f11948b;
        if (i4 > i5 - i6) {
            this.f11945i.g();
            return false;
        }
        int i7 = e0Var.f12009b;
        if (i4 > i7 - (i6 + this.f11944h.f11948b)) {
            x(i7 - i4);
        }
        if (i4 > i5 - (this.f11943g.f11948b + this.f11944h.f11948b)) {
            this.f11945i.g();
            return false;
        }
        return true;
    }

    @Override // com.facebook.common.memory.b
    public void d(MemoryTrimType memoryTrimType) {
        w();
    }

    @VisibleForTesting
    protected abstract void f(V v2);

    @VisibleForTesting
    synchronized f<V> g(int i4) {
        f<V> fVar = this.f11940d.get(i4);
        if (fVar == null && this.f11942f) {
            if (com.facebook.common.logging.a.R(2)) {
                com.facebook.common.logging.a.V(this.f11937a, "creating new bucket %s", Integer.valueOf(i4));
            }
            f<V> t4 = t(i4);
            this.f11940d.put(i4, t4);
            return t4;
        }
        return fVar;
    }

    @Override // com.facebook.common.memory.e
    public V get(int i4) {
        V m4;
        c();
        int i5 = i(i4);
        synchronized (this) {
            f<V> g4 = g(i5);
            if (g4 != null && (m4 = m(g4)) != null) {
                com.facebook.common.internal.h.o(this.f11941e.add(m4));
                int j4 = j(m4);
                int k4 = k(j4);
                this.f11943g.b(k4);
                this.f11944h.a(k4);
                this.f11945i.e(k4);
                s();
                if (com.facebook.common.logging.a.R(2)) {
                    com.facebook.common.logging.a.W(this.f11937a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(m4)), Integer.valueOf(j4));
                }
                return m4;
            }
            int k5 = k(i5);
            if (b(k5)) {
                this.f11943g.b(k5);
                if (g4 != null) {
                    g4.f();
                }
                V v2 = null;
                try {
                    v2 = a(i5);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f11943g.a(k5);
                        f<V> g5 = g(i5);
                        if (g5 != null) {
                            g5.b();
                        }
                        com.facebook.common.internal.m.f(th);
                    }
                }
                synchronized (this) {
                    com.facebook.common.internal.h.o(this.f11941e.add(v2));
                    y();
                    this.f11945i.d(k5);
                    s();
                    if (com.facebook.common.logging.a.R(2)) {
                        com.facebook.common.logging.a.W(this.f11937a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(i5));
                    }
                }
                return v2;
            }
            throw new PoolSizeViolationException(this.f11939c.f12008a, this.f11943g.f11948b, this.f11944h.f11948b, k5);
        }
    }

    protected abstract int i(int i4);

    protected abstract int j(V v2);

    protected abstract int k(int i4);

    public synchronized Map<String, Integer> l() {
        HashMap hashMap;
        hashMap = new HashMap();
        for (int i4 = 0; i4 < this.f11940d.size(); i4++) {
            int keyAt = this.f11940d.keyAt(i4);
            hashMap.put(f0.f12022a + k(keyAt), Integer.valueOf(this.f11940d.valueAt(i4).e()));
        }
        hashMap.put(f0.f12027f, Integer.valueOf(this.f11939c.f12009b));
        hashMap.put(f0.f12028g, Integer.valueOf(this.f11939c.f12008a));
        hashMap.put(f0.f12023b, Integer.valueOf(this.f11943g.f11947a));
        hashMap.put(f0.f12024c, Integer.valueOf(this.f11943g.f11948b));
        hashMap.put(f0.f12025d, Integer.valueOf(this.f11944h.f11947a));
        hashMap.put(f0.f12026e, Integer.valueOf(this.f11944h.f11948b));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public synchronized V m(f<V> fVar) {
        return fVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
        this.f11938b.a(this);
        this.f11945i.f(this);
    }

    @VisibleForTesting
    synchronized boolean p() {
        boolean z4;
        z4 = this.f11943g.f11948b + this.f11944h.f11948b > this.f11939c.f12009b;
        if (z4) {
            this.f11945i.a();
        }
        return z4;
    }

    protected boolean q(V v2) {
        com.facebook.common.internal.h.i(v2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.b();
     */
    @Override // com.facebook.common.memory.e, com.facebook.common.references.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release(V r8) {
        /*
            r7 = this;
            com.facebook.common.internal.h.i(r8)
            int r0 = r7.j(r8)
            int r1 = r7.k(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.f r2 = r7.h(r0)     // Catch: java.lang.Throwable -> Lae
            java.util.Set<V> r3 = r7.f11941e     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.f11937a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lae
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.logging.a.s(r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            r7.f(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.f0 r8 = r7.f11945i     // Catch: java.lang.Throwable -> Lae
            r8.b(r1)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.g()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.p()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.q(r8)     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.i(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$a r2 = r7.f11944h     // Catch: java.lang.Throwable -> Lae
            r2.b(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$a r2 = r7.f11943g     // Catch: java.lang.Throwable -> Lae
            r2.a(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.f0 r2 = r7.f11945i     // Catch: java.lang.Throwable -> Lae
            r2.c(r1)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = com.facebook.common.logging.a.R(r4)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La9
            java.lang.Class<?> r1 = r7.f11937a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.logging.a.W(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L7e:
            if (r2 == 0) goto L83
            r2.b()     // Catch: java.lang.Throwable -> Lae
        L83:
            boolean r2 = com.facebook.common.logging.a.R(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.f11937a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.logging.a.W(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lae
        L9c:
            r7.f(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$a r8 = r7.f11943g     // Catch: java.lang.Throwable -> Lae
            r8.a(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.f0 r8 = r7.f11945i     // Catch: java.lang.Throwable -> Lae
            r8.b(r1)     // Catch: java.lang.Throwable -> Lae
        La9:
            r7.s()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.release(java.lang.Object):void");
    }

    f<V> t(int i4) {
        return new f<>(k(i4), Integer.MAX_VALUE, 0, this.f11939c.f12014g);
    }

    protected void u() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    void w() {
        int i4;
        List arrayList;
        synchronized (this) {
            if (this.f11939c.f12014g) {
                arrayList = v();
            } else {
                arrayList = new ArrayList(this.f11940d.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i5 = 0; i5 < this.f11940d.size(); i5++) {
                    f<V> valueAt = this.f11940d.valueAt(i5);
                    if (valueAt.d() > 0) {
                        arrayList.add(valueAt);
                    }
                    sparseIntArray.put(this.f11940d.keyAt(i5), valueAt.e());
                }
                r(sparseIntArray);
            }
            this.f11944h.c();
            s();
        }
        u();
        for (i4 = 0; i4 < arrayList.size(); i4++) {
            f fVar = (f) arrayList.get(i4);
            while (true) {
                Object h4 = fVar.h();
                if (h4 == null) {
                    break;
                }
                f(h4);
            }
        }
    }

    @VisibleForTesting
    synchronized void x(int i4) {
        int i5 = this.f11943g.f11948b;
        int i6 = this.f11944h.f11948b;
        int min = Math.min((i5 + i6) - i4, i6);
        if (min <= 0) {
            return;
        }
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.X(this.f11937a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i4), Integer.valueOf(this.f11943g.f11948b + this.f11944h.f11948b), Integer.valueOf(min));
        }
        s();
        for (int i7 = 0; i7 < this.f11940d.size() && min > 0; i7++) {
            f<V> valueAt = this.f11940d.valueAt(i7);
            while (min > 0) {
                V h4 = valueAt.h();
                if (h4 == null) {
                    break;
                }
                f(h4);
                int i8 = valueAt.f12017a;
                min -= i8;
                this.f11944h.a(i8);
            }
        }
        s();
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.W(this.f11937a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i4), Integer.valueOf(this.f11943g.f11948b + this.f11944h.f11948b));
        }
    }

    @VisibleForTesting
    synchronized void y() {
        if (p()) {
            x(this.f11939c.f12009b);
        }
    }
}
