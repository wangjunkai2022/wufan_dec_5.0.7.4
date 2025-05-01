package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
/* compiled from: Dispatcher.kt */
/* loaded from: classes7.dex */
public class h extends ExecutorCoroutineDispatcher {

    /* renamed from: c  reason: collision with root package name */
    private final int f71303c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71304d;

    /* renamed from: e  reason: collision with root package name */
    private final long f71305e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final String f71306f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private CoroutineScheduler f71307g;

    public h() {
        this(0, 0, 0L, null, 15, null);
    }

    public /* synthetic */ h(int i4, int i5, long j4, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? n.f71314c : i4, (i6 & 2) != 0 ? n.f71315d : i5, (i6 & 4) != 0 ? n.f71316e : j4, (i6 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    private final CoroutineScheduler Z() {
        return new CoroutineScheduler(this.f71303c, this.f71304d, this.f71305e, this.f71306f);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Y() {
        return this.f71307g;
    }

    public final void a0(@NotNull Runnable runnable, @NotNull k kVar, boolean z4) {
        this.f71307g.r(runnable, kVar, z4);
    }

    public final void b0() {
        d0();
    }

    public final synchronized void c0(long j4) {
        this.f71307g.K(j4);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f71307g.close();
    }

    public final synchronized void d0() {
        this.f71307g.K(1000L);
        this.f71307g = Z();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        CoroutineScheduler.t(this.f71307g, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        CoroutineScheduler.t(this.f71307g, runnable, null, true, 2, null);
    }

    public h(int i4, int i5, long j4, @NotNull String str) {
        this.f71303c = i4;
        this.f71304d = i5;
        this.f71305e = j4;
        this.f71306f = str;
        this.f71307g = Z();
    }
}
