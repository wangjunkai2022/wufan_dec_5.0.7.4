package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CoroutineScope.kt */
/* loaded from: classes6.dex */
public final class r0 {
    @NotNull
    public static final q0 a(@NotNull CoroutineContext coroutineContext) {
        b0 c5;
        if (coroutineContext.get(z1.f71466g1) == null) {
            c5 = e2.c(null, 1, null);
            coroutineContext = coroutineContext.plus(c5);
        }
        return new kotlinx.coroutines.internal.j(coroutineContext);
    }

    @NotNull
    public static final q0 b() {
        return new kotlinx.coroutines.internal.j(a3.c(null, 1, null).plus(d1.e()));
    }

    public static final void c(@NotNull q0 q0Var, @NotNull String str, @Nullable Throwable th) {
        d(q0Var, p1.a(str, th));
    }

    public static final void d(@NotNull q0 q0Var, @Nullable CancellationException cancellationException) {
        z1 z1Var = (z1) q0Var.getCoroutineContext().get(z1.f71466g1);
        if (z1Var != null) {
            z1Var.b(cancellationException);
            return;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Scope cannot be cancelled because it does not have a job: ", q0Var).toString());
    }

    public static /* synthetic */ void e(q0 q0Var, String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        c(q0Var, str, th);
    }

    public static /* synthetic */ void f(q0 q0Var, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        d(q0Var, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull Function2<? super q0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        Object coroutine_suspended;
        kotlinx.coroutines.internal.k0 k0Var = new kotlinx.coroutines.internal.k0(continuation.getContext(), continuation);
        Object f5 = s3.b.f(k0Var, k0Var, function2);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (f5 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return f5;
    }

    @Nullable
    public static final Object h(@NotNull Continuation<? super CoroutineContext> continuation) {
        return continuation.getContext();
    }

    private static final Object i(Continuation<? super CoroutineContext> continuation) {
        InlineMarker.mark(3);
        throw null;
    }

    public static final void j(@NotNull q0 q0Var) {
        c2.z(q0Var.getCoroutineContext());
    }

    public static final boolean k(@NotNull q0 q0Var) {
        z1 z1Var = (z1) q0Var.getCoroutineContext().get(z1.f71466g1);
        if (z1Var == null) {
            return true;
        }
        return z1Var.isActive();
    }

    public static /* synthetic */ void l(q0 q0Var) {
    }

    @NotNull
    public static final q0 m(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext) {
        return new kotlinx.coroutines.internal.j(q0Var.getCoroutineContext().plus(coroutineContext));
    }
}
