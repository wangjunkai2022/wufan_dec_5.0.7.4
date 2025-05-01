package kotlinx.coroutines.internal;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes.dex */
public final class r extends CoroutineDispatcher implements Runnable, kotlinx.coroutines.y0 {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f71140b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71141c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.y0 f71142d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final y<Runnable> f71143e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Object f71144f;
    private volatile int runningWorkers;

    public r(@NotNull CoroutineDispatcher coroutineDispatcher, int i4) {
        this.f71140b = coroutineDispatcher;
        this.f71141c = i4;
        kotlinx.coroutines.y0 y0Var = coroutineDispatcher instanceof kotlinx.coroutines.y0 ? (kotlinx.coroutines.y0) coroutineDispatcher : null;
        this.f71142d = y0Var == null ? kotlinx.coroutines.v0.a() : y0Var;
        this.f71143e = new y<>(false);
        this.f71144f = new Object();
    }

    private final boolean Y(Runnable runnable) {
        this.f71143e.a(runnable);
        return this.runningWorkers >= this.f71141c;
    }

    private final void Z(Runnable runnable, Function0<Unit> function0) {
        if (!Y(runnable) && a0()) {
            function0.invoke();
        }
    }

    private final boolean a0() {
        synchronized (this.f71144f) {
            if (this.runningWorkers >= this.f71141c) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.y0
    @NotNull
    public g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f71142d.A(j4, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.y0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object S(long j4, @NotNull Continuation<? super Unit> continuation) {
        return this.f71142d.S(j4, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (!Y(runnable) && a0()) {
            this.f71140b.dispatch(this, this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (!Y(runnable) && a0()) {
            this.f71140b.dispatchYield(this, this);
        }
    }

    @Override // kotlinx.coroutines.y0
    public void k(long j4, @NotNull kotlinx.coroutines.p<? super Unit> pVar) {
        this.f71142d.k(j4, pVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @ExperimentalCoroutinesApi
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i4) {
        s.a(i4);
        return i4 >= this.f71141c ? this : super.limitedParallelism(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f71144f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f71143e.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = kotlin.Unit.INSTANCE;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            kotlinx.coroutines.internal.y<java.lang.Runnable> r2 = r4.f71143e
            java.lang.Object r2 = r2.g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.n0.b(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f71140b
            boolean r2 = r2.isDispatchNeeded(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f71140b
            r0.dispatch(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f71144f
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.y<java.lang.Runnable> r2 = r4.f71143e     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            goto L4b
        L4a:
            throw r0
        L4b:
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.r.run():void");
    }
}
