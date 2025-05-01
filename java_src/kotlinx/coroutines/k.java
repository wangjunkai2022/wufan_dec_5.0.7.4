package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Builders.common.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class k {

    /* renamed from: a */
    private static final int f71191a = 0;

    /* renamed from: b */
    private static final int f71192b = 1;

    /* renamed from: c */
    private static final int f71193c = 2;

    @NotNull
    public static final <T> w0<T> a(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2) {
        x0 x0Var;
        CoroutineContext e5 = CoroutineContextKt.e(q0Var, coroutineContext);
        if (coroutineStart.isLazy()) {
            x0Var = new h2(e5, function2);
        } else {
            x0Var = new x0(e5, true);
        }
        ((a) x0Var).w1(coroutineStart, x0Var, function2);
        return x0Var;
    }

    public static /* synthetic */ w0 b(q0 q0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i4 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return i.a(q0Var, coroutineContext, coroutineStart, function2);
    }

    @Nullable
    public static final <T> Object c(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return i.h(coroutineDispatcher, function2, continuation);
    }

    private static final <T> Object d(CoroutineDispatcher coroutineDispatcher, Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object h4 = i.h(coroutineDispatcher, function2, continuation);
        InlineMarker.mark(1);
        return h4;
    }

    @NotNull
    public static final z1 e(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super q0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        a x2Var;
        CoroutineContext e5 = CoroutineContextKt.e(q0Var, coroutineContext);
        if (coroutineStart.isLazy()) {
            x2Var = new i2(e5, function2);
        } else {
            x2Var = new x2(e5, true);
        }
        x2Var.w1(coroutineStart, x2Var, function2);
        return x2Var;
    }

    public static /* synthetic */ z1 f(q0 q0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i4 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return i.d(q0Var, coroutineContext, coroutineStart, function2);
    }

    @Nullable
    public static final <T> Object g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object y12;
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        CoroutineContext d5 = CoroutineContextKt.d(context, coroutineContext);
        c2.z(d5);
        if (d5 == context) {
            kotlinx.coroutines.internal.k0 k0Var = new kotlinx.coroutines.internal.k0(d5, continuation);
            y12 = s3.b.f(k0Var, k0Var, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(d5.get(key), context.get(key))) {
                j3 j3Var = new j3(d5, continuation);
                Object c5 = ThreadContextKt.c(d5, null);
                try {
                    Object f5 = s3.b.f(j3Var, j3Var, function2);
                    ThreadContextKt.a(d5, c5);
                    y12 = f5;
                } catch (Throwable th) {
                    ThreadContextKt.a(d5, c5);
                    throw th;
                }
            } else {
                z0 z0Var = new z0(d5, continuation);
                s3.a.f(function2, z0Var, z0Var, null, 4, null);
                y12 = z0Var.y1();
            }
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y12 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y12;
    }
}
