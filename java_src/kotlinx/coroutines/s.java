package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CancellableContinuation.kt */
/* loaded from: classes6.dex */
public final class s {
    @InternalCoroutinesApi
    public static final void a(@NotNull p<?> pVar, @NotNull g1 g1Var) {
        pVar.k(new h1(g1Var));
    }

    @NotNull
    public static final <T> q<T> b(@NotNull Continuation<? super T> continuation) {
        if (!(continuation instanceof kotlinx.coroutines.internal.l)) {
            return new q<>(continuation, 1);
        }
        q<T> l4 = ((kotlinx.coroutines.internal.l) continuation).l();
        if (l4 == null || !l4.I()) {
            l4 = null;
        }
        return l4 == null ? new q<>(continuation, 2) : l4;
    }

    public static final void c(@NotNull p<?> pVar, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        pVar.k(new p2(lockFreeLinkedListNode));
    }

    @Nullable
    public static final <T> Object d(@NotNull Function1<? super p<? super T>, Unit> function1, @NotNull Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        q qVar = new q(intercepted, 1);
        qVar.P();
        function1.invoke(qVar);
        Object y2 = qVar.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y2;
    }

    private static final <T> Object e(Function1<? super p<? super T>, Unit> function1, Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        InlineMarker.mark(0);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        q qVar = new q(intercepted, 1);
        qVar.P();
        function1.invoke(qVar);
        Object y2 = qVar.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return y2;
    }

    @Nullable
    public static final <T> Object f(@NotNull Function1<? super p<? super T>, Unit> function1, @NotNull Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        q b5 = b(intercepted);
        function1.invoke(b5);
        Object y2 = b5.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y2;
    }

    private static final <T> Object g(Function1<? super p<? super T>, Unit> function1, Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        InlineMarker.mark(0);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        q b5 = b(intercepted);
        function1.invoke(b5);
        Object y2 = b5.y();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return y2;
    }
}
