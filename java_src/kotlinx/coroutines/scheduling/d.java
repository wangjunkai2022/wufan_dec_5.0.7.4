package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
/* compiled from: Deprecated.kt */
@PublishedApi
/* loaded from: classes.dex */
public class d extends ExecutorCoroutineDispatcher {

    /* renamed from: c  reason: collision with root package name */
    private final int f71291c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71292d;

    /* renamed from: e  reason: collision with root package name */
    private final long f71293e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final String f71294f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private CoroutineScheduler f71295g;

    public /* synthetic */ d(int i4, int i5, long j4, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, j4, (i6 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public static /* synthetic */ CoroutineDispatcher a0(d dVar, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                i4 = 16;
            }
            return dVar.Z(i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    private final CoroutineScheduler b0() {
        return new CoroutineScheduler(this.f71291c, this.f71292d, this.f71293e, this.f71294f);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Y() {
        return this.f71295g;
    }

    @NotNull
    public final CoroutineDispatcher Z(int i4) {
        if (i4 > 0) {
            return new f(this, i4, null, 1);
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Expected positive parallelism level, but have ", Integer.valueOf(i4)).toString());
    }

    public final void c0(@NotNull Runnable runnable, @NotNull k kVar, boolean z4) {
        try {
            this.f71295g.r(runnable, kVar, z4);
        } catch (RejectedExecutionException unused) {
            u0.f71444g.s0(this.f71295g.h(runnable, kVar));
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f71295g.close();
    }

    @NotNull
    public final CoroutineDispatcher d0(int i4) {
        if (i4 > 0) {
            if (i4 <= this.f71291c) {
                return new f(this, i4, null, 0);
            }
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f71291c + "), but have " + i4).toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Expected positive parallelism level, but have ", Integer.valueOf(i4)).toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            CoroutineScheduler.t(this.f71295g, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            u0.f71444g.dispatch(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            CoroutineScheduler.t(this.f71295g, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            u0.f71444g.dispatchYield(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return super.toString() + "[scheduler = " + this.f71295g + ']';
    }

    public d(int i4, int i5, long j4, @NotNull String str) {
        this.f71291c = i4;
        this.f71292d = i5;
        this.f71293e = j4;
        this.f71294f = str;
        this.f71295g = b0();
    }

    public /* synthetic */ d(int i4, int i5, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? n.f71314c : i4, (i6 & 2) != 0 ? n.f71315d : i5, (i6 & 4) != 0 ? n.f71312a : str);
    }

    public d(int i4, int i5, @NotNull String str) {
        this(i4, i5, n.f71316e, str);
    }

    public /* synthetic */ d(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? n.f71314c : i4, (i6 & 2) != 0 ? n.f71315d : i5);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ d(int i4, int i5) {
        this(i4, i5, n.f71316e, null, 8, null);
    }
}
