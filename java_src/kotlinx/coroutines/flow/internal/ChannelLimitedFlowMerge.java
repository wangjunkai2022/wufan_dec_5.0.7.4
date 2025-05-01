package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Merge.kt */
/* loaded from: classes6.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Iterable<kotlinx.coroutines.flow.e<T>> f70916e;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i5 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object i(@NotNull w<? super T> wVar, @NotNull Continuation<? super Unit> continuation) {
        m mVar = new m(wVar);
        for (kotlinx.coroutines.flow.e<T> eVar : this.f70916e) {
            kotlinx.coroutines.k.f(wVar, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(eVar, mVar, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected ChannelFlow<T> j(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f70916e, coroutineContext, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ReceiveChannel<T> n(@NotNull q0 q0Var) {
        return ProduceKt.c(q0Var, this.f70868b, this.f70869c, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge(@NotNull Iterable<? extends kotlinx.coroutines.flow.e<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i4, bufferOverflow);
        this.f70916e = iterable;
    }
}
