package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChannelFlow.kt */
/* loaded from: classes6.dex */
public final class UndispatchedContextCollector<T> implements kotlinx.coroutines.flow.f<T> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f70997b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Object f70998c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Function2<T, Continuation<? super Unit>, Object> f70999d;

    public UndispatchedContextCollector(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull CoroutineContext coroutineContext) {
        this.f70997b = coroutineContext;
        this.f70998c = ThreadContextKt.b(coroutineContext);
        this.f70999d = new UndispatchedContextCollector$emitRef$1(fVar, null);
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t4, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object c5 = d.c(this.f70997b, t4, this.f70998c, this.f70999d, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return c5 == coroutine_suspended ? c5 : Unit.INSTANCE;
    }
}
