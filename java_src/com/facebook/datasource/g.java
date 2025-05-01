package com.facebook.datasource;

import com.facebook.common.internal.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: IncreasingQualityDataSourceSupplier.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class g<T> implements k<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<k<c<T>>> f10968a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10969b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IncreasingQualityDataSourceSupplier.java */
    @ThreadSafe
    /* loaded from: classes.dex */
    public class a extends AbstractDataSource<T> {
        @GuardedBy("IncreasingQualityDataSource.this")
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        private ArrayList<c<T>> f10970g;
        @GuardedBy("IncreasingQualityDataSource.this")

        /* renamed from: h  reason: collision with root package name */
        private int f10971h;

        /* renamed from: i  reason: collision with root package name */
        private int f10972i;

        /* renamed from: j  reason: collision with root package name */
        private AtomicInteger f10973j;
        @Nullable

        /* renamed from: k  reason: collision with root package name */
        private Throwable f10974k;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IncreasingQualityDataSourceSupplier.java */
        /* renamed from: com.facebook.datasource.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0257a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            private int f10976a;

            public C0257a(int i4) {
                this.f10976a = i4;
            }

            @Override // com.facebook.datasource.e
            public void a(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void b(c<T> cVar) {
                a.this.B(this.f10976a, cVar);
            }

            @Override // com.facebook.datasource.e
            public void c(c<T> cVar) {
                if (cVar.b()) {
                    a.this.C(this.f10976a, cVar);
                } else if (cVar.c()) {
                    a.this.B(this.f10976a, cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void d(c<T> cVar) {
                if (this.f10976a == 0) {
                    a.this.o(cVar.getProgress());
                }
            }
        }

        public a() {
            if (g.this.f10969b) {
                return;
            }
            v();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[LOOP:0: B:17:0x0020->B:18:0x0022, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void A(int r3, com.facebook.datasource.c<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f10971h     // Catch: java.lang.Throwable -> L2f
                com.facebook.datasource.c r1 = r2.x(r3)     // Catch: java.lang.Throwable -> L2f
                if (r4 != r1) goto L2d
                int r4 = r2.f10971h     // Catch: java.lang.Throwable -> L2f
                if (r3 != r4) goto Le
                goto L2d
            Le:
                com.facebook.datasource.c r4 = r2.y()     // Catch: java.lang.Throwable -> L2f
                if (r4 == 0) goto L1d
                if (r5 == 0) goto L1b
                int r4 = r2.f10971h     // Catch: java.lang.Throwable -> L2f
                if (r3 >= r4) goto L1b
                goto L1d
            L1b:
                r3 = r0
                goto L1f
            L1d:
                r2.f10971h = r3     // Catch: java.lang.Throwable -> L2f
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            L20:
                if (r0 <= r3) goto L2c
                com.facebook.datasource.c r4 = r2.w(r0)
                r2.u(r4)
                int r0 = r0 + (-1)
                goto L20
            L2c:
                return
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                return
            L2f:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                goto L33
            L32:
                throw r3
            L33:
                goto L32
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.g.a.A(int, com.facebook.datasource.c, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B(int i4, c<T> cVar) {
            u(D(i4, cVar));
            if (i4 == 0) {
                this.f10974k = cVar.d();
            }
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(int i4, c<T> cVar) {
            A(i4, cVar, cVar.c());
            if (cVar == y()) {
                setResult(null, i4 == 0 && cVar.c());
            }
            z();
        }

        @Nullable
        private synchronized c<T> D(int i4, c<T> cVar) {
            if (cVar == y()) {
                return null;
            }
            if (cVar == x(i4)) {
                return w(i4);
            }
            return cVar;
        }

        private void u(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private void v() {
            if (this.f10973j != null) {
                return;
            }
            synchronized (this) {
                if (this.f10973j == null) {
                    this.f10973j = new AtomicInteger(0);
                    int size = g.this.f10968a.size();
                    this.f10972i = size;
                    this.f10971h = size;
                    this.f10970g = new ArrayList<>(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        c<T> cVar = (c) ((k) g.this.f10968a.get(i4)).get();
                        this.f10970g.add(cVar);
                        cVar.e(new C0257a(i4), com.facebook.common.executors.a.a());
                        if (cVar.b()) {
                            break;
                        }
                    }
                }
            }
        }

        @Nullable
        private synchronized c<T> w(int i4) {
            c<T> cVar;
            ArrayList<c<T>> arrayList = this.f10970g;
            cVar = null;
            if (arrayList != null && i4 < arrayList.size()) {
                cVar = this.f10970g.set(i4, null);
            }
            return cVar;
        }

        @Nullable
        private synchronized c<T> x(int i4) {
            ArrayList<c<T>> arrayList;
            arrayList = this.f10970g;
            return (arrayList == null || i4 >= arrayList.size()) ? null : this.f10970g.get(i4);
        }

        @Nullable
        private synchronized c<T> y() {
            return x(this.f10971h);
        }

        private void z() {
            Throwable th;
            if (this.f10973j.incrementAndGet() != this.f10972i || (th = this.f10974k) == null) {
                return;
            }
            m(th);
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
        public synchronized boolean b() {
            boolean z4;
            if (g.this.f10969b) {
                v();
            }
            c<T> y2 = y();
            if (y2 != null) {
                z4 = y2.b();
            }
            return z4;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
        public boolean close() {
            if (g.this.f10969b) {
                v();
            }
            synchronized (this) {
                if (super.close()) {
                    ArrayList<c<T>> arrayList = this.f10970g;
                    this.f10970g = null;
                    if (arrayList != null) {
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            u(arrayList.get(i4));
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.c
        @Nullable
        public synchronized T g() {
            c<T> y2;
            if (g.this.f10969b) {
                v();
            }
            y2 = y();
            return y2 != null ? y2.g() : null;
        }
    }

    private g(List<k<c<T>>> list, boolean z4) {
        com.facebook.common.internal.h.e(!list.isEmpty(), "List of suppliers is empty!");
        this.f10968a = list;
        this.f10969b = z4;
    }

    public static <T> g<T> c(List<k<c<T>>> list) {
        return d(list, false);
    }

    public static <T> g<T> d(List<k<c<T>>> list, boolean z4) {
        return new g<>(list, z4);
    }

    @Override // com.facebook.common.internal.k
    /* renamed from: e */
    public c<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return com.facebook.common.internal.g.a(this.f10968a, ((g) obj).f10968a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10968a.hashCode();
    }

    public String toString() {
        return com.facebook.common.internal.g.f(this).f("list", this.f10968a).toString();
    }
}
