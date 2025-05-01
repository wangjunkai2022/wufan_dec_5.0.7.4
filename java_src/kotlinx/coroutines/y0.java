package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Delay.kt */
@InternalCoroutinesApi
/* loaded from: classes.dex */
public interface y0 {

    /* compiled from: Delay.kt */
    /* loaded from: classes.dex */
    public static final class a {
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull y0 y0Var, long j4, @NotNull Continuation<? super Unit> continuation) {
            Continuation intercepted;
            Object coroutine_suspended;
            Object coroutine_suspended2;
            if (j4 <= 0) {
                return Unit.INSTANCE;
            }
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            q qVar = new q(intercepted, 1);
            qVar.P();
            y0Var.k(j4, qVar);
            Object y2 = qVar.y();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (y2 == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return y2 == coroutine_suspended2 ? y2 : Unit.INSTANCE;
        }

        @NotNull
        public static g1 b(@NotNull y0 y0Var, long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return v0.a().A(j4, runnable, coroutineContext);
        }
    }

    @NotNull
    g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    Object S(long j4, @NotNull Continuation<? super Unit> continuation);

    void k(long j4, @NotNull p<? super Unit> pVar);
}
