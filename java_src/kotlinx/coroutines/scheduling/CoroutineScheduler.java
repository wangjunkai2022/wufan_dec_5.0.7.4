package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes7.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: n  reason: collision with root package name */
    private static final int f71260n = -1;

    /* renamed from: o  reason: collision with root package name */
    private static final int f71261o = 0;

    /* renamed from: p  reason: collision with root package name */
    private static final int f71262p = 1;

    /* renamed from: q  reason: collision with root package name */
    private static final int f71263q = 21;

    /* renamed from: r  reason: collision with root package name */
    private static final long f71264r = 2097151;

    /* renamed from: s  reason: collision with root package name */
    private static final long f71265s = 4398044413952L;

    /* renamed from: t  reason: collision with root package name */
    private static final int f71266t = 42;

    /* renamed from: u  reason: collision with root package name */
    private static final long f71267u = 9223367638808264704L;

    /* renamed from: v  reason: collision with root package name */
    public static final int f71268v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f71269w = 2097150;

    /* renamed from: x  reason: collision with root package name */
    private static final long f71270x = 2097151;

    /* renamed from: y  reason: collision with root package name */
    private static final long f71271y = -2097152;

    /* renamed from: z  reason: collision with root package name */
    private static final long f71272z = 2097152;
    @NotNull
    private volatile /* synthetic */ int _isTerminated;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final int f71273b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final int f71274c;
    @NotNull
    volatile /* synthetic */ long controlState;
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public final long f71275d;
    @JvmField
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f71276e;
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final e f71277f;
    @JvmField
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public final e f71278g;
    @JvmField
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public final j0<c> f71279h;
    @NotNull
    private volatile /* synthetic */ long parkedWorkersStack;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f71255i = new a(null);
    @JvmField
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final o0 f71259m = new o0("NOT_IN_STACK");

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f71256j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f71257k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71258l = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes7.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes7.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoroutineScheduler(int i4, int i5, long j4, @NotNull String str) {
        this.f71273b = i4;
        this.f71274c = i5;
        this.f71275d = j4;
        this.f71276e = str;
        if (!(i4 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        }
        if (!(i5 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 > 0) {
            this.f71277f = new e();
            this.f71278g = new e();
            this.parkedWorkersStack = 0L;
            this.f71279h = new j0<>(i4 + 1);
            this.controlState = i4 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
    }

    private final int A(c cVar) {
        Object h4 = cVar.h();
        while (h4 != f71259m) {
            if (h4 == null) {
                return 0;
            }
            c cVar2 = (c) h4;
            int g4 = cVar2.g();
            if (g4 != 0) {
                return g4;
            }
            h4 = cVar2.h();
        }
        return -1;
    }

    private final c B() {
        while (true) {
            long j4 = this.parkedWorkersStack;
            c b5 = this.f71279h.b((int) (2097151 & j4));
            if (b5 == null) {
                return null;
            }
            long j5 = (2097152 + j4) & f71271y;
            int A = A(b5);
            if (A >= 0 && f71256j.compareAndSet(this, j4, A | j5)) {
                b5.q(f71259m);
                return b5;
            }
        }
    }

    private final long E() {
        return f71257k.addAndGet(this, 4398046511104L);
    }

    private final void N(boolean z4) {
        long addAndGet = f71257k.addAndGet(this, 2097152L);
        if (z4 || X() || V(addAndGet)) {
            return;
        }
        X();
    }

    private final j S(c cVar, j jVar, boolean z4) {
        if (cVar == null || cVar.f71282c == WorkerState.TERMINATED) {
            return jVar;
        }
        if (jVar.f71309c.P() == 0 && cVar.f71282c == WorkerState.BLOCKING) {
            return jVar;
        }
        cVar.f71286g = true;
        return cVar.f71281b.a(jVar, z4);
    }

    private final boolean T() {
        long j4;
        do {
            j4 = this.controlState;
            if (((int) ((f71267u & j4) >> 42)) == 0) {
                return false;
            }
        } while (!f71257k.compareAndSet(this, j4, j4 - 4398046511104L));
        return true;
    }

    private final boolean V(long j4) {
        int coerceAtLeast;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(((int) (2097151 & j4)) - ((int) ((j4 & f71265s) >> 21)), 0);
        if (coerceAtLeast < this.f71273b) {
            int g4 = g();
            if (g4 == 1 && this.f71273b > 1) {
                g();
            }
            if (g4 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean W(CoroutineScheduler coroutineScheduler, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = coroutineScheduler.controlState;
        }
        return coroutineScheduler.V(j4);
    }

    private final boolean X() {
        c B;
        do {
            B = B();
            if (B == null) {
                return false;
            }
        } while (!c.f71280i.compareAndSet(B, -1, 0));
        LockSupport.unpark(B);
        return true;
    }

    private final boolean a(j jVar) {
        if (jVar.f71309c.P() == 1) {
            return this.f71278g.a(jVar);
        }
        return this.f71277f.a(jVar);
    }

    private final int d(long j4) {
        return (int) ((j4 & f71265s) >> 21);
    }

    private final int g() {
        int coerceAtLeast;
        synchronized (this.f71279h) {
            if (isTerminated()) {
                return -1;
            }
            long j4 = this.controlState;
            int i4 = (int) (j4 & 2097151);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i4 - ((int) ((j4 & f71265s) >> 21)), 0);
            if (coerceAtLeast >= this.f71273b) {
                return 0;
            }
            if (i4 >= this.f71274c) {
                return 0;
            }
            int i5 = ((int) (this.controlState & 2097151)) + 1;
            if (i5 > 0 && this.f71279h.b(i5) == null) {
                c cVar = new c(i5);
                this.f71279h.c(i5, cVar);
                if (i5 == ((int) (2097151 & f71257k.incrementAndGet(this)))) {
                    cVar.start();
                    return coerceAtLeast + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final int j(long j4) {
        return (int) (j4 & 2097151);
    }

    private final c k() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            return cVar;
        }
        return null;
    }

    private final void l() {
        f71257k.addAndGet(this, f71271y);
    }

    private final int p() {
        return (int) (f71257k.getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void t(CoroutineScheduler coroutineScheduler, Runnable runnable, k kVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = n.f71320i;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        coroutineScheduler.r(runnable, kVar, z4);
    }

    private final int u() {
        return (int) ((this.controlState & f71267u) >> 42);
    }

    private final int v() {
        return (int) (this.controlState & 2097151);
    }

    private final long y() {
        return f71257k.addAndGet(this, 2097152L);
    }

    private final int z() {
        return (int) (f71257k.incrementAndGet(this) & 2097151);
    }

    public final boolean C(@NotNull c cVar) {
        long j4;
        long j5;
        int g4;
        if (cVar.h() != f71259m) {
            return false;
        }
        do {
            j4 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j4);
            j5 = (2097152 + j4) & f71271y;
            g4 = cVar.g();
            if (s0.b()) {
                if (!(g4 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.q(this.f71279h.b(i4));
        } while (!f71256j.compareAndSet(this, j4, g4 | j5));
        return true;
    }

    public final void D(@NotNull c cVar, int i4, int i5) {
        while (true) {
            long j4 = this.parkedWorkersStack;
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & f71271y;
            if (i6 == i4) {
                i6 = i5 == 0 ? A(cVar) : i5;
            }
            if (i6 >= 0 && f71256j.compareAndSet(this, j4, j5 | i6)) {
                return;
            }
        }
    }

    public final void J(@NotNull j jVar) {
        try {
            jVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
                if (b5 == null) {
                }
            } finally {
                kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
                if (b6 != null) {
                    b6.f();
                }
            }
        }
    }

    public final void K(long j4) {
        int i4;
        if (f71258l.compareAndSet(this, 0, 1)) {
            c k4 = k();
            synchronized (this.f71279h) {
                i4 = (int) (this.controlState & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    int i6 = i5 + 1;
                    c b5 = this.f71279h.b(i5);
                    Intrinsics.checkNotNull(b5);
                    c cVar = b5;
                    if (cVar != k4) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j4);
                        }
                        WorkerState workerState = cVar.f71282c;
                        if (s0.b()) {
                            if (!(workerState == WorkerState.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f71281b.g(this.f71278g);
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5 = i6;
                }
            }
            this.f71278g.b();
            this.f71277f.b();
            while (true) {
                j f5 = k4 == null ? null : k4.f(true);
                if (f5 == null && (f5 = this.f71277f.g()) == null && (f5 = this.f71278g.g()) == null) {
                    break;
                }
                J(f5);
            }
            if (k4 != null) {
                k4.t(WorkerState.TERMINATED);
            }
            if (s0.b()) {
                if (!(((int) ((this.controlState & f71267u) >> 42)) == this.f71273b)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void P() {
        if (X() || W(this, 0L, 1, null)) {
            return;
        }
        X();
    }

    public final int b(long j4) {
        return (int) ((j4 & f71267u) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        K(com.join.mgps.data.c.f49010a);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        t(this, runnable, null, false, 6, null);
    }

    @NotNull
    public final j h(@NotNull Runnable runnable, @NotNull k kVar) {
        long a5 = n.f71317f.a();
        if (runnable instanceof j) {
            j jVar = (j) runnable;
            jVar.f71308b = a5;
            jVar.f71309c = kVar;
            return jVar;
        }
        return new m(runnable, a5, kVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void r(@NotNull Runnable runnable, @NotNull k kVar, boolean z4) {
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        if (b5 != null) {
            b5.e();
        }
        j h4 = h(runnable, kVar);
        c k4 = k();
        j S = S(k4, h4, z4);
        if (S != null && !a(S)) {
            throw new RejectedExecutionException(Intrinsics.stringPlus(this.f71276e, " was terminated"));
        }
        boolean z5 = z4 && k4 != null;
        if (h4.f71309c.P() != 0) {
            N(z5);
        } else if (z5) {
        } else {
            P();
        }
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a5 = this.f71279h.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (i9 < a5) {
            int i10 = i9 + 1;
            c b5 = this.f71279h.b(i9);
            if (b5 != null) {
                int f5 = b5.f71281b.f();
                int i11 = b.$EnumSwitchMapping$0[b5.f71282c.ordinal()];
                if (i11 == 1) {
                    i6++;
                } else if (i11 == 2) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f5);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i11 == 3) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f5);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i11 == 4) {
                    i7++;
                    if (f5 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f5);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i11 == 5) {
                    i8++;
                }
            }
            i9 = i10;
        }
        long j4 = this.controlState;
        return this.f71276e + '@' + t0.b(this) + "[Pool Size {core = " + this.f71273b + ", max = " + this.f71274c + "}, Worker States {CPU = " + i4 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f71277f.c() + ", global blocking queue size = " + this.f71278g.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((f71265s & j4) >> 21)) + ", CPUs acquired = " + (this.f71273b - ((int) ((f71267u & j4) >> 42))) + "}]";
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes7.dex */
    public final class c extends Thread {

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f71280i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final p f71281b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public WorkerState f71282c;

        /* renamed from: d  reason: collision with root package name */
        private long f71283d;

        /* renamed from: e  reason: collision with root package name */
        private long f71284e;

        /* renamed from: f  reason: collision with root package name */
        private int f71285f;
        @JvmField

        /* renamed from: g  reason: collision with root package name */
        public boolean f71286g;
        private volatile int indexInArray;
        @Nullable
        private volatile Object nextParkedWorker;
        @NotNull
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f71281b = new p();
            this.f71282c = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f71259m;
            this.f71285f = Random.Default.nextInt();
        }

        private final void b(int i4) {
            if (i4 == 0) {
                return;
            }
            CoroutineScheduler.f71257k.addAndGet(CoroutineScheduler.this, CoroutineScheduler.f71271y);
            WorkerState workerState = this.f71282c;
            if (workerState != WorkerState.TERMINATED) {
                if (s0.b()) {
                    if (!(workerState == WorkerState.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f71282c = WorkerState.DORMANT;
            }
        }

        private final void c(int i4) {
            if (i4 != 0 && t(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.P();
            }
        }

        private final void d(j jVar) {
            int P = jVar.f71309c.P();
            j(P);
            c(P);
            CoroutineScheduler.this.J(jVar);
            b(P);
        }

        private final j e(boolean z4) {
            j n4;
            j n5;
            if (z4) {
                boolean z5 = l(CoroutineScheduler.this.f71273b * 2) == 0;
                if (z5 && (n5 = n()) != null) {
                    return n5;
                }
                j h4 = this.f71281b.h();
                if (h4 != null) {
                    return h4;
                }
                if (!z5 && (n4 = n()) != null) {
                    return n4;
                }
            } else {
                j n6 = n();
                if (n6 != null) {
                    return n6;
                }
            }
            return v(false);
        }

        private final void j(int i4) {
            this.f71283d = 0L;
            if (this.f71282c == WorkerState.PARKING) {
                if (s0.b()) {
                    if (!(i4 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f71282c = WorkerState.BLOCKING;
            }
        }

        private final boolean k() {
            return this.nextParkedWorker != CoroutineScheduler.f71259m;
        }

        private final void m() {
            if (this.f71283d == 0) {
                this.f71283d = System.nanoTime() + CoroutineScheduler.this.f71275d;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f71275d);
            if (System.nanoTime() - this.f71283d >= 0) {
                this.f71283d = 0L;
                w();
            }
        }

        private final j n() {
            if (l(2) == 0) {
                j g4 = CoroutineScheduler.this.f71277f.g();
                return g4 == null ? CoroutineScheduler.this.f71278g.g() : g4;
            }
            j g5 = CoroutineScheduler.this.f71278g.g();
            return g5 == null ? CoroutineScheduler.this.f71277f.g() : g5;
        }

        private final void o() {
            loop0: while (true) {
                boolean z4 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f71282c != WorkerState.TERMINATED) {
                    j f5 = f(this.f71286g);
                    if (f5 != null) {
                        this.f71284e = 0L;
                        d(f5);
                    } else {
                        this.f71286g = false;
                        if (this.f71284e == 0) {
                            s();
                        } else if (z4) {
                            t(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f71284e);
                            this.f71284e = 0L;
                        } else {
                            z4 = true;
                        }
                    }
                }
            }
            t(WorkerState.TERMINATED);
        }

        private final boolean r() {
            boolean z4;
            if (this.f71282c != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j4 = coroutineScheduler.controlState;
                    if (((int) ((CoroutineScheduler.f71267u & j4) >> 42)) != 0) {
                        if (CoroutineScheduler.f71257k.compareAndSet(coroutineScheduler, j4, j4 - 4398046511104L)) {
                            z4 = true;
                            break;
                        }
                    } else {
                        z4 = false;
                        break;
                    }
                }
                if (!z4) {
                    return false;
                }
                this.f71282c = WorkerState.CPU_ACQUIRED;
            }
            return true;
        }

        private final void s() {
            if (!k()) {
                CoroutineScheduler.this.C(this);
                return;
            }
            if (s0.b()) {
                if (!(this.f71281b.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.f71282c != WorkerState.TERMINATED) {
                t(WorkerState.PARKING);
                Thread.interrupted();
                m();
            }
        }

        private final j v(boolean z4) {
            long l4;
            if (s0.b()) {
                if (!(this.f71281b.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i4 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i4 < 2) {
                return null;
            }
            int l5 = l(i4);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j4 = Long.MAX_VALUE;
            int i5 = 0;
            while (i5 < i4) {
                i5++;
                l5++;
                if (l5 > i4) {
                    l5 = 1;
                }
                c b5 = coroutineScheduler.f71279h.b(l5);
                if (b5 != null && b5 != this) {
                    if (s0.b()) {
                        if (!(this.f71281b.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z4) {
                        l4 = this.f71281b.k(b5.f71281b);
                    } else {
                        l4 = this.f71281b.l(b5.f71281b);
                    }
                    if (l4 == -1) {
                        return this.f71281b.h();
                    }
                    if (l4 > 0) {
                        j4 = Math.min(j4, l4);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f71284e = j4;
            return null;
        }

        private final void w() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f71279h) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (coroutineScheduler.controlState & 2097151)) <= coroutineScheduler.f71273b) {
                    return;
                }
                if (f71280i.compareAndSet(this, -1, 1)) {
                    int g4 = g();
                    p(0);
                    coroutineScheduler.D(this, g4, 0);
                    int andDecrement = (int) (2097151 & CoroutineScheduler.f71257k.getAndDecrement(coroutineScheduler));
                    if (andDecrement != g4) {
                        c b5 = coroutineScheduler.f71279h.b(andDecrement);
                        Intrinsics.checkNotNull(b5);
                        c cVar = b5;
                        coroutineScheduler.f71279h.c(g4, cVar);
                        cVar.p(g4);
                        coroutineScheduler.D(cVar, andDecrement, g4);
                    }
                    coroutineScheduler.f71279h.c(andDecrement, null);
                    Unit unit = Unit.INSTANCE;
                    this.f71282c = WorkerState.TERMINATED;
                }
            }
        }

        @Nullable
        public final j f(boolean z4) {
            j g4;
            if (r()) {
                return e(z4);
            }
            if (z4) {
                g4 = this.f71281b.h();
                if (g4 == null) {
                    g4 = CoroutineScheduler.this.f71278g.g();
                }
            } else {
                g4 = CoroutineScheduler.this.f71278g.g();
            }
            return g4 == null ? v(true) : g4;
        }

        public final int g() {
            return this.indexInArray;
        }

        @Nullable
        public final Object h() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final CoroutineScheduler i() {
            return CoroutineScheduler.this;
        }

        public final int l(int i4) {
            int i5 = this.f71285f;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f71285f = i8;
            int i9 = i4 - 1;
            return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
        }

        public final void p(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f71276e);
            sb.append("-worker-");
            sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
            setName(sb.toString());
            this.indexInArray = i4;
        }

        public final void q(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o();
        }

        public final boolean t(@NotNull WorkerState workerState) {
            WorkerState workerState2 = this.f71282c;
            boolean z4 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z4) {
                CoroutineScheduler.f71257k.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f71282c = workerState;
            }
            return z4;
        }

        public c(int i4) {
            this();
            p(i4);
        }
    }

    public /* synthetic */ CoroutineScheduler(int i4, int i5, long j4, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, (i6 & 4) != 0 ? n.f71316e : j4, (i6 & 8) != 0 ? n.f71312a : str);
    }
}
