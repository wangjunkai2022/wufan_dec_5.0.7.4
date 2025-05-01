package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes6.dex */
public final class i {
    @NotNull
    public static final <T> w0<T> a(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2) {
        return k.a(q0Var, coroutineContext, coroutineStart, function2);
    }

    @Nullable
    public static final <T> Object c(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return k.c(coroutineDispatcher, function2, continuation);
    }

    @NotNull
    public static final z1 d(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super q0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return k.e(q0Var, coroutineContext, coroutineStart, function2);
    }

    public static /* synthetic */ z1 e(q0 q0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i4, Object obj) {
        return k.f(q0Var, coroutineContext, coroutineStart, function2, i4, obj);
    }

    public static final <T> T f(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) j.a(coroutineContext, function2);
    }

    @Nullable
    public static final <T> Object h(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return k.g(coroutineContext, function2, continuation);
    }
}
