package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Supervisor.kt */
/* loaded from: classes.dex */
public final class a3 {
    @NotNull
    public static final b0 a(@Nullable z1 z1Var) {
        return new z2(z1Var);
    }

    public static /* synthetic */ b0 c(z1 z1Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z1Var = null;
        }
        return a(z1Var);
    }

    public static /* synthetic */ z1 d(z1 z1Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z1Var = null;
        }
        return a(z1Var);
    }

    @Nullable
    public static final <R> Object e(@NotNull Function2<? super q0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        Object coroutine_suspended;
        y2 y2Var = new y2(continuation.getContext(), continuation);
        Object f5 = s3.b.f(y2Var, y2Var, function2);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (f5 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return f5;
    }
}
