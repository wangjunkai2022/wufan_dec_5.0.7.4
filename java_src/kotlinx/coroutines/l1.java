package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes.dex */
public abstract class l1 extends m1 implements y0 {

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71201e = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_queue");

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71202f = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_delayed");
    @NotNull
    private volatile /* synthetic */ Object _queue = null;
    @NotNull
    private volatile /* synthetic */ Object _delayed = null;
    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes6.dex */
    public final class a extends c {
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final p<Unit> f71203e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j4, @NotNull p<? super Unit> pVar) {
            super(j4);
            this.f71203e = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f71203e.O(l1.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.l1.c
        @NotNull
        public String toString() {
            return Intrinsics.stringPlus(super.toString(), this.f71203e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes6.dex */
    public static final class b extends c {
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Runnable f71205e;

        public b(long j4, @NotNull Runnable runnable) {
            super(j4);
            this.f71205e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f71205e.run();
        }

        @Override // kotlinx.coroutines.l1.c
        @NotNull
        public String toString() {
            return Intrinsics.stringPlus(super.toString(), this.f71205e);
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes6.dex */
    public static abstract class c implements Runnable, Comparable<c>, g1, kotlinx.coroutines.internal.x0 {
        @JvmField

        /* renamed from: b  reason: collision with root package name */
        public long f71206b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private Object f71207c;

        /* renamed from: d  reason: collision with root package name */
        private int f71208d = -1;

        public c(long j4) {
            this.f71206b = j4;
        }

        @Override // java.lang.Comparable
        /* renamed from: E */
        public int compareTo(@NotNull c cVar) {
            long j4 = this.f71206b - cVar.f71206b;
            if (j4 > 0) {
                return 1;
            }
            return j4 < 0 ? -1 : 0;
        }

        public final synchronized int P(long j4, @NotNull d dVar, @NotNull l1 l1Var) {
            kotlinx.coroutines.internal.o0 o0Var;
            Object obj = this.f71207c;
            o0Var = o1.f71220a;
            if (obj == o0Var) {
                return 2;
            }
            synchronized (dVar) {
                c e5 = dVar.e();
                if (l1Var.isCompleted()) {
                    return 1;
                }
                if (e5 == null) {
                    dVar.f71209b = j4;
                } else {
                    long j5 = e5.f71206b;
                    if (j5 - j4 < 0) {
                        j4 = j5;
                    }
                    if (j4 - dVar.f71209b > 0) {
                        dVar.f71209b = j4;
                    }
                }
                long j6 = this.f71206b;
                long j7 = dVar.f71209b;
                if (j6 - j7 < 0) {
                    this.f71206b = j7;
                }
                dVar.a(this);
                return 0;
            }
        }

        public final boolean a0(long j4) {
            return j4 - this.f71206b >= 0;
        }

        @Override // kotlinx.coroutines.internal.x0
        public void d(@Nullable kotlinx.coroutines.internal.w0<?> w0Var) {
            kotlinx.coroutines.internal.o0 o0Var;
            Object obj = this.f71207c;
            o0Var = o1.f71220a;
            if (obj != o0Var) {
                this.f71207c = w0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.g1
        public final synchronized void dispose() {
            kotlinx.coroutines.internal.o0 o0Var;
            kotlinx.coroutines.internal.o0 o0Var2;
            Object obj = this.f71207c;
            o0Var = o1.f71220a;
            if (obj == o0Var) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.j(this);
            }
            o0Var2 = o1.f71220a;
            this.f71207c = o0Var2;
        }

        @Override // kotlinx.coroutines.internal.x0
        @Nullable
        public kotlinx.coroutines.internal.w0<?> f() {
            Object obj = this.f71207c;
            if (obj instanceof kotlinx.coroutines.internal.w0) {
                return (kotlinx.coroutines.internal.w0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.x0
        public int getIndex() {
            return this.f71208d;
        }

        @Override // kotlinx.coroutines.internal.x0
        public void m(int i4) {
            this.f71208d = i4;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f71206b + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes6.dex */
    public static final class d extends kotlinx.coroutines.internal.w0<c> {
        @JvmField

        /* renamed from: b  reason: collision with root package name */
        public long f71209b;

        public d(long j4) {
            this.f71209b = j4;
        }
    }

    private final void A0(boolean z4) {
        this._isCompleted = z4 ? 1 : 0;
    }

    private final boolean B0(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar == null ? null : dVar.h()) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isCompleted() {
        return this._isCompleted;
    }

    private final void q0() {
        kotlinx.coroutines.internal.o0 o0Var;
        kotlinx.coroutines.internal.o0 o0Var2;
        if (s0.b() && !isCompleted()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71201e;
                o0Var = o1.f71227h;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, o0Var)) {
                    return;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                o0Var2 = o1.f71227h;
                if (obj == o0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.z zVar = new kotlinx.coroutines.internal.z(8, true);
                zVar.a((Runnable) obj);
                if (f71201e.compareAndSet(this, obj, zVar)) {
                    return;
                }
            } else {
                ((kotlinx.coroutines.internal.z) obj).d();
                return;
            }
        }
    }

    private final Runnable r0() {
        kotlinx.coroutines.internal.o0 o0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                o0Var = o1.f71227h;
                if (obj == o0Var) {
                    return null;
                }
                if (f71201e.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) obj;
                Object l4 = zVar.l();
                if (l4 != kotlinx.coroutines.internal.z.f71177t) {
                    return (Runnable) l4;
                }
                f71201e.compareAndSet(this, obj, zVar.k());
            }
        }
    }

    private final boolean t0(Runnable runnable) {
        kotlinx.coroutines.internal.o0 o0Var;
        while (true) {
            Object obj = this._queue;
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (f71201e.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                o0Var = o1.f71227h;
                if (obj == o0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.z zVar = new kotlinx.coroutines.internal.z(8, true);
                zVar.a((Runnable) obj);
                zVar.a(runnable);
                if (f71201e.compareAndSet(this, obj, zVar)) {
                    return true;
                }
            } else {
                kotlinx.coroutines.internal.z zVar2 = (kotlinx.coroutines.internal.z) obj;
                int a5 = zVar2.a(runnable);
                if (a5 == 0) {
                    return true;
                }
                if (a5 == 1) {
                    f71201e.compareAndSet(this, obj, zVar2.k());
                } else if (a5 == 2) {
                    return false;
                }
            }
        }
    }

    private final void u0() {
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        Long valueOf = b5 == null ? null : Long.valueOf(b5.b());
        long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
        while (true) {
            d dVar = (d) this._delayed;
            c m4 = dVar == null ? null : dVar.m();
            if (m4 == null) {
                return;
            }
            n0(nanoTime, m4);
        }
    }

    private final int y0(long j4, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            f71202f.compareAndSet(this, null, new d(j4));
            Object obj = this._delayed;
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.P(j4, dVar, this);
    }

    @Override // kotlinx.coroutines.y0
    @NotNull
    public g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return y0.a.b(this, j4, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.y0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object S(long j4, @NotNull Continuation<? super Unit> continuation) {
        return y0.a.a(this, j4, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.k1
    public long c0() {
        long coerceAtLeast;
        kotlinx.coroutines.internal.o0 o0Var;
        if (super.c0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                o0Var = o1.f71227h;
                return obj == o0Var ? Long.MAX_VALUE : 0L;
            } else if (!((kotlinx.coroutines.internal.z) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        c h4 = dVar == null ? null : dVar.h();
        if (h4 == null) {
            return Long.MAX_VALUE;
        }
        long j4 = h4.f71206b;
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        Long valueOf = b5 != null ? Long.valueOf(b5.b()) : null;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j4 - (valueOf == null ? System.nanoTime() : valueOf.longValue()), 0L);
        return coerceAtLeast;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        s0(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.k1
    public boolean f0() {
        kotlinx.coroutines.internal.o0 o0Var;
        if (i0()) {
            d dVar = (d) this._delayed;
            if (dVar == null || dVar.g()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof kotlinx.coroutines.internal.z) {
                        return ((kotlinx.coroutines.internal.z) obj).h();
                    }
                    o0Var = o1.f71227h;
                    if (obj != o0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    @Override // kotlinx.coroutines.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long j0() {
        /*
            r9 = this;
            boolean r0 = r9.k0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.l1$d r0 = (kotlinx.coroutines.l1.d) r0
            if (r0 == 0) goto L5b
            boolean r3 = r0.g()
            if (r3 != 0) goto L5b
            kotlinx.coroutines.b r3 = kotlinx.coroutines.c.b()
            r4 = 0
            if (r3 != 0) goto L1e
            r3 = r4
            goto L26
        L1e:
            long r5 = r3.b()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
        L26:
            if (r3 != 0) goto L2d
            long r5 = java.lang.System.nanoTime()
            goto L31
        L2d:
            long r5 = r3.longValue()
        L31:
            monitor-enter(r0)
            kotlinx.coroutines.internal.x0 r3 = r0.e()     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L3b
            monitor-exit(r0)
            r3 = r4
            goto L53
        L3b:
            kotlinx.coroutines.l1$c r3 = (kotlinx.coroutines.l1.c) r3     // Catch: java.lang.Throwable -> L58
            boolean r7 = r3.a0(r5)     // Catch: java.lang.Throwable -> L58
            r8 = 0
            if (r7 == 0) goto L49
            boolean r3 = r9.t0(r3)     // Catch: java.lang.Throwable -> L58
            goto L4a
        L49:
            r3 = 0
        L4a:
            if (r3 == 0) goto L51
            kotlinx.coroutines.internal.x0 r3 = r0.k(r8)     // Catch: java.lang.Throwable -> L58
            goto L52
        L51:
            r3 = r4
        L52:
            monitor-exit(r0)
        L53:
            kotlinx.coroutines.l1$c r3 = (kotlinx.coroutines.l1.c) r3
            if (r3 != 0) goto L31
            goto L5b
        L58:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L5b:
            java.lang.Runnable r0 = r9.r0()
            if (r0 == 0) goto L65
            r0.run()
            return r1
        L65:
            long r0 = r9.c0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.l1.j0():long");
    }

    @Override // kotlinx.coroutines.y0
    public void k(long j4, @NotNull p<? super Unit> pVar) {
        long d5 = o1.d(j4);
        if (d5 < DurationKt.MAX_MILLIS) {
            kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
            Long valueOf = b5 == null ? null : Long.valueOf(b5.b());
            long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
            a aVar = new a(d5 + nanoTime, pVar);
            s.a(pVar, aVar);
            w0(nanoTime, aVar);
        }
    }

    public void s0(@NotNull Runnable runnable) {
        if (t0(runnable)) {
            o0();
        } else {
            u0.f71444g.s0(runnable);
        }
    }

    @Override // kotlinx.coroutines.k1
    public void shutdown() {
        d3.f70019a.c();
        A0(true);
        q0();
        do {
        } while (j0() <= 0);
        u0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void w0(long j4, @NotNull c cVar) {
        int y02 = y0(j4, cVar);
        if (y02 == 0) {
            if (B0(cVar)) {
                o0();
            }
        } else if (y02 == 1) {
            n0(j4, cVar);
        } else if (y02 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final g1 z0(long j4, @NotNull Runnable runnable) {
        long d5 = o1.d(j4);
        if (d5 < DurationKt.MAX_MILLIS) {
            kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
            Long valueOf = b5 == null ? null : Long.valueOf(b5.b());
            long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
            b bVar = new b(d5 + nanoTime, runnable);
            w0(nanoTime, bVar);
            return bVar;
        }
        return m2.f71216b;
    }
}
