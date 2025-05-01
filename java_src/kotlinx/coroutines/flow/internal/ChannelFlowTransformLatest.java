package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Merge.kt */
/* loaded from: classes6.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Function3<kotlinx.coroutines.flow.f<? super R>, T, Continuation<? super Unit>, Object> f70897f;

    public /* synthetic */ ChannelFlowTransformLatest(Function3 function3, kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, eVar, (i5 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i5 & 8) != 0 ? -2 : i4, (i5 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected ChannelFlow<R> j(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f70897f, this.f70893e, coroutineContext, i4, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @Nullable
    public Object s(@NotNull kotlinx.coroutines.flow.f<? super R> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (!s0.b() || (fVar instanceof m)) {
            Object g4 = r0.g(new ChannelFlowTransformLatest$flowCollect$3(this, fVar, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g4 == coroutine_suspended ? g4 : Unit.INSTANCE;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(@NotNull Function3<? super kotlinx.coroutines.flow.f<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull kotlinx.coroutines.flow.e<? extends T> eVar, @NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i4, bufferOverflow);
        this.f70897f = function3;
    }
}
