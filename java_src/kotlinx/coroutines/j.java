package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
/* compiled from: Builders.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class j {
    public static final <T> T a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        k1 a5;
        CoroutineContext e5;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        if (continuationInterceptor == null) {
            a5 = d3.f70019a.b();
            e5 = CoroutineContextKt.e(s1.f71252b, coroutineContext.plus(a5));
        } else {
            k1 k1Var = null;
            k1 k1Var2 = continuationInterceptor instanceof k1 ? (k1) continuationInterceptor : null;
            if (k1Var2 != null && k1Var2.l0()) {
                k1Var = k1Var2;
            }
            a5 = k1Var == null ? d3.f70019a.a() : k1Var;
            e5 = CoroutineContextKt.e(s1.f71252b, coroutineContext);
        }
        g gVar = new g(e5, currentThread, a5);
        gVar.w1(CoroutineStart.DEFAULT, gVar, function2);
        return (T) gVar.x1();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i4, Object obj) throws InterruptedException {
        if ((i4 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return i.f(coroutineContext, function2);
    }
}
