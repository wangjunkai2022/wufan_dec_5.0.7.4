package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class c2 {
    public static final void A(@NotNull z1 z1Var) {
        e2.y(z1Var);
    }

    @NotNull
    public static final z1 B(@NotNull CoroutineContext coroutineContext) {
        return e2.z(coroutineContext);
    }

    public static final boolean C(@NotNull CoroutineContext coroutineContext) {
        return e2.A(coroutineContext);
    }

    @NotNull
    public static final b0 a(@Nullable z1 z1Var) {
        return e2.a(z1Var);
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        e2.f(coroutineContext, cancellationException);
    }

    public static final void g(@NotNull z1 z1Var, @NotNull String str, @Nullable Throwable th) {
        e2.g(z1Var, str, th);
    }

    @Nullable
    public static final Object l(@NotNull z1 z1Var, @NotNull Continuation<? super Unit> continuation) {
        return e2.l(z1Var, continuation);
    }

    public static final void o(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        e2.o(coroutineContext, cancellationException);
    }

    public static final void r(@NotNull z1 z1Var, @Nullable CancellationException cancellationException) {
        e2.r(z1Var, cancellationException);
    }

    public static final void w(@NotNull p<?> pVar, @NotNull Future<?> future) {
        d2.a(pVar, future);
    }

    @InternalCoroutinesApi
    @NotNull
    public static final g1 x(@NotNull z1 z1Var, @NotNull Future<?> future) {
        return d2.b(z1Var, future);
    }

    @NotNull
    public static final g1 y(@NotNull z1 z1Var, @NotNull g1 g1Var) {
        return e2.w(z1Var, g1Var);
    }

    public static final void z(@NotNull CoroutineContext coroutineContext) {
        e2.x(coroutineContext);
    }
}
