package s3;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Undispatched.kt */
/* loaded from: classes.dex */
public final class b {
    public static final <T> void a(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object c5 = ThreadContextKt.c(context, null);
            Object invoke = ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(probeCoroutineCreated);
            ThreadContextKt.a(context, c5);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                Result.Companion companion = Result.Companion;
                probeCoroutineCreated.resumeWith(Result.m35constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final <R, T> void b(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r4, @NotNull Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object c5 = ThreadContextKt.c(context, null);
            Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r4, probeCoroutineCreated);
            ThreadContextKt.a(context, c5);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                Result.Companion companion = Result.Companion;
                probeCoroutineCreated.resumeWith(Result.m35constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final <T> void c(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            Object invoke = ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(probeCoroutineCreated);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                Result.Companion companion = Result.Companion;
                probeCoroutineCreated.resumeWith(Result.m35constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final <R, T> void d(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r4, @NotNull Continuation<? super T> continuation) {
        Object coroutine_suspended;
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r4, probeCoroutineCreated);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                Result.Companion companion = Result.Companion;
                probeCoroutineCreated.resumeWith(Result.m35constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
        }
    }

    private static final <T> void e(Continuation<? super T> continuation, Function1<? super Continuation<? super T>, ? extends Object> function1) {
        Object coroutine_suspended;
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            Object invoke = function1.invoke(probeCoroutineCreated);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                Result.Companion companion = Result.Companion;
                probeCoroutineCreated.resumeWith(Result.m35constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
        }
    }

    @Nullable
    public static final <T, R> Object f(@NotNull k0<? super T> k0Var, R r4, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object d0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        try {
            d0Var = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r4, k0Var);
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (d0Var == coroutine_suspended) {
            coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object S0 = k0Var.S0(d0Var);
        if (S0 == g2.f71042b) {
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        } else if (S0 instanceof d0) {
            Throwable th2 = ((d0) S0).f70014a;
            Continuation<? super T> continuation = k0Var.f71120d;
            if (s0.e() && (continuation instanceof CoroutineStackFrame)) {
                throw n0.o(th2, (CoroutineStackFrame) continuation);
            }
            throw th2;
        } else {
            return g2.o(S0);
        }
    }

    @Nullable
    public static final <T, R> Object g(@NotNull k0<? super T> k0Var, R r4, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object d0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        boolean z4 = false;
        try {
            d0Var = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r4, k0Var);
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (d0Var == coroutine_suspended) {
            coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object S0 = k0Var.S0(d0Var);
        if (S0 == g2.f71042b) {
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        }
        if (S0 instanceof d0) {
            Throwable th2 = ((d0) S0).f70014a;
            if (((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).f69636b == k0Var) ? true : true) {
                Continuation<? super T> continuation = k0Var.f71120d;
                if (s0.e() && (continuation instanceof CoroutineStackFrame)) {
                    throw n0.o(th2, (CoroutineStackFrame) continuation);
                }
                throw th2;
            } else if (d0Var instanceof d0) {
                Throwable th3 = ((d0) d0Var).f70014a;
                Continuation<? super T> continuation2 = k0Var.f71120d;
                if (s0.e() && (continuation2 instanceof CoroutineStackFrame)) {
                    throw n0.o(th3, (CoroutineStackFrame) continuation2);
                }
                throw th3;
            }
        } else {
            d0Var = g2.o(S0);
        }
        return d0Var;
    }

    private static final <T> Object h(k0<? super T> k0Var, Function1<? super Throwable, Boolean> function1, Function0<? extends Object> function0) {
        Object d0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        try {
            d0Var = function0.invoke();
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (d0Var == coroutine_suspended) {
            coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object S0 = k0Var.S0(d0Var);
        if (S0 == g2.f71042b) {
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        } else if (S0 instanceof d0) {
            d0 d0Var2 = (d0) S0;
            if (function1.invoke(d0Var2.f70014a).booleanValue()) {
                Throwable th2 = d0Var2.f70014a;
                Continuation<? super T> continuation = k0Var.f71120d;
                if (s0.e() && (continuation instanceof CoroutineStackFrame)) {
                    throw n0.o(th2, (CoroutineStackFrame) continuation);
                }
                throw th2;
            } else if (d0Var instanceof d0) {
                Throwable th3 = ((d0) d0Var).f70014a;
                Continuation<? super T> continuation2 = k0Var.f71120d;
                if (s0.e() && (continuation2 instanceof CoroutineStackFrame)) {
                    throw n0.o(th3, (CoroutineStackFrame) continuation2);
                }
                throw th3;
            } else {
                return d0Var;
            }
        } else {
            return g2.o(S0);
        }
    }
}
