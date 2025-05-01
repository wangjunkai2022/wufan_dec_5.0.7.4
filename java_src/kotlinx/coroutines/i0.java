package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletionState.kt */
/* loaded from: classes6.dex */
public final class i0 {
    @NotNull
    public static final <T> Object a(@Nullable Object obj, @NotNull Continuation<? super T> continuation) {
        if (obj instanceof d0) {
            Result.Companion companion = Result.Companion;
            Throwable th = ((d0) obj).f70014a;
            if (s0.e() && (continuation instanceof CoroutineStackFrame)) {
                th = kotlinx.coroutines.internal.n0.o(th, (CoroutineStackFrame) continuation);
            }
            return Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        Result.Companion companion2 = Result.Companion;
        return Result.m35constructorimpl(obj);
    }

    @Nullable
    public static final <T> Object b(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        Throwable m38exceptionOrNullimpl = Result.m38exceptionOrNullimpl(obj);
        if (m38exceptionOrNullimpl == null) {
            return function1 != null ? new e0(obj, function1) : obj;
        }
        return new d0(m38exceptionOrNullimpl, false, 2, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull Object obj, @NotNull p<?> pVar) {
        Throwable m38exceptionOrNullimpl = Result.m38exceptionOrNullimpl(obj);
        if (m38exceptionOrNullimpl != null) {
            if (s0.e() && (pVar instanceof CoroutineStackFrame)) {
                m38exceptionOrNullimpl = kotlinx.coroutines.internal.n0.o(m38exceptionOrNullimpl, (CoroutineStackFrame) pVar);
            }
            obj = new d0(m38exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            function1 = null;
        }
        return b(obj, function1);
    }
}
