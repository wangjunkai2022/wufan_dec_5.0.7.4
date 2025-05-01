package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: classes6.dex */
public class c<T> extends ChannelFlow<T> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Function2<kotlinx.coroutines.channels.w<? super T>, Continuation<? super Unit>, Object> f70864e;

    public /* synthetic */ c(Function2 function2, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i5 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    static /* synthetic */ Object o(c cVar, kotlinx.coroutines.channels.w wVar, Continuation continuation) {
        Object coroutine_suspended;
        Object invoke = cVar.f70864e.invoke(wVar, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object i(@NotNull kotlinx.coroutines.channels.w<? super T> wVar, @NotNull Continuation<? super Unit> continuation) {
        return o(this, wVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected ChannelFlow<T> j(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return new c(this.f70864e, coroutineContext, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return "block[" + this.f70864e + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Function2<? super kotlinx.coroutines.channels.w<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i4, bufferOverflow);
        this.f70864e = function2;
    }
}
