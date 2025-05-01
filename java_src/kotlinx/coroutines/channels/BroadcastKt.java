package kotlinx.coroutines.channels;

import kotlin.BuilderInference;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Broadcast.kt */
/* loaded from: classes6.dex */
public final class BroadcastKt {

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractCoroutineContextElement implements l0 {
        public a(l0.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.l0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        }
    }

    @ObsoleteCoroutinesApi
    @NotNull
    public static final <E> h<E> a(@NotNull q0 q0Var, @NotNull CoroutineContext coroutineContext, int i4, @NotNull CoroutineStart coroutineStart, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super w<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        j jVar;
        CoroutineContext e5 = CoroutineContextKt.e(q0Var, coroutineContext);
        h a5 = i.a(i4);
        if (coroutineStart.isLazy()) {
            jVar = new t(e5, a5, function2);
        } else {
            jVar = new j(e5, a5, true);
        }
        if (function1 != null) {
            ((JobSupport) jVar).z(function1);
        }
        ((kotlinx.coroutines.a) jVar).w1(coroutineStart, jVar, function2);
        return jVar;
    }

    @ObsoleteCoroutinesApi
    @NotNull
    public static final <E> h<E> b(@NotNull final ReceiveChannel<? extends E> receiveChannel, int i4, @NotNull CoroutineStart coroutineStart) {
        return c(r0.m(r0.m(s1.f71252b, d1.g()), new a(l0.f71199f1)), null, i4, coroutineStart, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.BroadcastKt$broadcast$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                o.b(receiveChannel, th);
            }
        }, new BroadcastKt$broadcast$2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ h c(q0 q0Var, CoroutineContext coroutineContext, int i4, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        int i6 = (i5 & 2) != 0 ? 1 : i4;
        if ((i5 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i5 & 8) != 0) {
            function1 = null;
        }
        return a(q0Var, coroutineContext2, i6, coroutineStart2, function1, function2);
    }

    public static /* synthetic */ h d(ReceiveChannel receiveChannel, int i4, CoroutineStart coroutineStart, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 1;
        }
        if ((i5 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return b(receiveChannel, i4, coroutineStart);
    }
}
