package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Yield.kt */
/* loaded from: classes6.dex */
public final class m3 {
    @Nullable
    public static final Object a(@NotNull Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        CoroutineContext context = continuation.getContext();
        c2.z(context);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        kotlinx.coroutines.internal.l lVar = intercepted instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) intercepted : null;
        if (lVar == null) {
            coroutine_suspended = Unit.INSTANCE;
        } else {
            if (lVar.f71122e.isDispatchNeeded(context)) {
                lVar.o(context, Unit.INSTANCE);
            } else {
                l3 l3Var = new l3();
                CoroutineContext plus = context.plus(l3Var);
                Unit unit = Unit.INSTANCE;
                lVar.o(plus, unit);
                if (l3Var.f71213b) {
                    coroutine_suspended = kotlinx.coroutines.internal.m.h(lVar) ? IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() : unit;
                }
            }
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == coroutine_suspended2) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return coroutine_suspended == coroutine_suspended3 ? coroutine_suspended : Unit.INSTANCE;
    }
}
