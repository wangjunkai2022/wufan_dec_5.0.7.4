package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Deprecated.kt */
/* loaded from: classes7.dex */
final class f extends ExecutorCoroutineDispatcher implements k, Executor {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71296h = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final d f71297c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71298d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final String f71299e;

    /* renamed from: f  reason: collision with root package name */
    private final int f71300f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f71301g = new ConcurrentLinkedQueue<>();
    @NotNull
    private volatile /* synthetic */ int inFlightTasks = 0;

    public f(@NotNull d dVar, int i4, @Nullable String str, int i5) {
        this.f71297c = dVar;
        this.f71298d = i4;
        this.f71299e = str;
        this.f71300f = i5;
    }

    private final void Z(Runnable runnable, boolean z4) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f71296h;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f71298d) {
                this.f71297c.c0(runnable, this, z4);
                return;
            }
            this.f71301g.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f71298d) {
                return;
            }
            runnable = this.f71301g.poll();
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.scheduling.k
    public void N() {
        Runnable poll = this.f71301g.poll();
        if (poll != null) {
            this.f71297c.c0(poll, this, true);
            return;
        }
        f71296h.decrementAndGet(this);
        Runnable poll2 = this.f71301g.poll();
        if (poll2 == null) {
            return;
        }
        Z(poll2, true);
    }

    @Override // kotlinx.coroutines.scheduling.k
    public int P() {
        return this.f71300f;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Y() {
        return this;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Z(runnable, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Z(runnable, true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        Z(runnable, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String str = this.f71299e;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f71297c + ']';
        }
        return str;
    }
}
