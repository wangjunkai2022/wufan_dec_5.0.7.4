package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.sync.SemaphoreKt;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Merge.kt */
/* loaded from: classes6.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final kotlinx.coroutines.flow.e<kotlinx.coroutines.flow.e<T>> f70878e;

    /* renamed from: f  reason: collision with root package name */
    private final int f70879f;

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.e eVar, int i4, CoroutineContext coroutineContext, int i5, BufferOverflow bufferOverflow, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, i4, (i6 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i6 & 8) != 0 ? -2 : i5, (i6 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected String g() {
        return Intrinsics.stringPlus("concurrency=", Integer.valueOf(this.f70879f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object i(@NotNull w<? super T> wVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = this.f70878e.a(new ChannelFlowMerge$collectTo$2((z1) continuation.getContext().get(z1.f71466g1), SemaphoreKt.b(this.f70879f, 0, 2, null), wVar, new m(wVar)), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected ChannelFlow<T> j(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.f70878e, this.f70879f, coroutineContext, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ReceiveChannel<T> n(@NotNull q0 q0Var) {
        return ProduceKt.c(q0Var, this.f70868b, this.f70869c, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(@NotNull kotlinx.coroutines.flow.e<? extends kotlinx.coroutines.flow.e<? extends T>> eVar, int i4, @NotNull CoroutineContext coroutineContext, int i5, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i5, bufferOverflow);
        this.f70878e = eVar;
        this.f70879f = i4;
    }
}
