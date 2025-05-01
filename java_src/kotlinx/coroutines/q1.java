package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Executors.kt */
/* loaded from: classes.dex */
public final class q1 extends ExecutorCoroutineDispatcher implements y0 {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Executor f71236c;

    public q1(@NotNull Executor executor) {
        this.f71236c = executor;
        kotlinx.coroutines.internal.f.c(Y());
    }

    private final void Z(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        c2.f(coroutineContext, p1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> a0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j4) {
        try {
            return scheduledExecutorService.schedule(runnable, j4, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e5) {
            Z(coroutineContext, e5);
            return null;
        }
    }

    @Override // kotlinx.coroutines.y0
    @NotNull
    public g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        Executor Y = Y();
        ScheduledExecutorService scheduledExecutorService = Y instanceof ScheduledExecutorService ? (ScheduledExecutorService) Y : null;
        ScheduledFuture<?> a02 = scheduledExecutorService != null ? a0(scheduledExecutorService, runnable, coroutineContext, j4) : null;
        if (a02 != null) {
            return new f1(a02);
        }
        return u0.f71444g.A(j4, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.y0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object S(long j4, @NotNull Continuation<? super Unit> continuation) {
        return y0.a.a(this, j4, continuation);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Y() {
        return this.f71236c;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor Y = Y();
        ExecutorService executorService = Y instanceof ExecutorService ? (ExecutorService) Y : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r1 == null) goto L5;
     */
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
        /*
            r2 = this;
            java.util.concurrent.Executor r0 = r2.Y()     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            kotlinx.coroutines.b r1 = kotlinx.coroutines.c.b()     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            if (r1 != 0) goto Lb
            goto L11
        Lb:
            java.lang.Runnable r1 = r1.i(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            if (r1 != 0) goto L12
        L11:
            r1 = r4
        L12:
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            goto L2b
        L16:
            r0 = move-exception
            kotlinx.coroutines.b r1 = kotlinx.coroutines.c.b()
            if (r1 != 0) goto L1e
            goto L21
        L1e:
            r1.f()
        L21:
            r2.Z(r3, r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.d1.c()
            r0.dispatch(r3, r4)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.q1.dispatch(kotlin.coroutines.CoroutineContext, java.lang.Runnable):void");
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof q1) && ((q1) obj).Y() == Y();
    }

    public int hashCode() {
        return System.identityHashCode(Y());
    }

    @Override // kotlinx.coroutines.y0
    public void k(long j4, @NotNull p<? super Unit> pVar) {
        Executor Y = Y();
        ScheduledExecutorService scheduledExecutorService = Y instanceof ScheduledExecutorService ? (ScheduledExecutorService) Y : null;
        ScheduledFuture<?> a02 = scheduledExecutorService != null ? a0(scheduledExecutorService, new s2(this, pVar), pVar.getContext(), j4) : null;
        if (a02 != null) {
            c2.w(pVar, a02);
        } else {
            u0.f71444g.k(j4, pVar);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return Y().toString();
    }
}
