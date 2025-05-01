package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Actor.kt */
/* loaded from: classes6.dex */
public final class d {
    @ObsoleteCoroutinesApi
    @NotNull
    public static final <E> b0<E> a(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext, int i4, @NotNull CoroutineStart coroutineStart, @Nullable Function1<? super Throwable, Unit> function1, @NotNull Function2<? super e<E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        c cVar;
        CoroutineContext e5 = CoroutineContextKt.e(q0Var, coroutineContext);
        k d5 = m.d(i4, null, null, 6, null);
        if (coroutineStart.isLazy()) {
            cVar = new s(e5, d5, function2);
        } else {
            cVar = new c(e5, d5, true);
        }
        if (function1 != null) {
            ((JobSupport) cVar).z(function1);
        }
        ((kotlinx.coroutines.a) cVar).w1(coroutineStart, cVar, function2);
        return cVar;
    }

    public static /* synthetic */ b0 b(q0 q0Var, CoroutineContext coroutineContext, int i4, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        int i6 = (i5 & 2) != 0 ? 0 : i4;
        if ((i5 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i5 & 8) != 0) {
            function1 = null;
        }
        return a(q0Var, coroutineContext2, i6, coroutineStart2, function1, function2);
    }
}
