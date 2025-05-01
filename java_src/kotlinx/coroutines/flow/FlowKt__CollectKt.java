package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Collect.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class FlowKt__CollectKt {
    @Nullable
    public static final Object a(@NotNull e<?> eVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = eVar.a(kotlinx.coroutines.flow.internal.k.f71012b, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object b(e<? extends T> eVar, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = eVar.a(new FlowKt__CollectKt$collect$3(function2), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> Object c(e<? extends T> eVar, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        FlowKt__CollectKt$collect$3 flowKt__CollectKt$collect$3 = new FlowKt__CollectKt$collect$3(function2);
        InlineMarker.mark(0);
        eVar.a(flowKt__CollectKt$collect$3, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    @Nullable
    public static final <T> Object d(@NotNull e<? extends T> eVar, @NotNull Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = eVar.a(new FlowKt__CollectKt$collectIndexed$2(function3), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    private static final <T> Object e(e<? extends T> eVar, Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        FlowKt__CollectKt$collectIndexed$2 flowKt__CollectKt$collectIndexed$2 = new FlowKt__CollectKt$collectIndexed$2(function3);
        InlineMarker.mark(0);
        eVar.a(flowKt__CollectKt$collectIndexed$2, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    @Nullable
    public static final <T> Object f(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        e d5;
        Object coroutine_suspended;
        d5 = h.d(g.W0(eVar, function2), 0, null, 2, null);
        Object x4 = g.x(d5, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x4 == coroutine_suspended ? x4 : Unit.INSTANCE;
    }

    @Nullable
    public static final <T> Object g(@NotNull f<? super T> fVar, @NotNull e<? extends T> eVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        g.o0(fVar);
        Object a5 = eVar.a(fVar, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @NotNull
    public static final <T> z1 h(@NotNull e<? extends T> eVar, @NotNull q0 q0Var) {
        z1 f5;
        f5 = kotlinx.coroutines.k.f(q0Var, null, null, new FlowKt__CollectKt$launchIn$1(eVar, null), 3, null);
        return f5;
    }
}
