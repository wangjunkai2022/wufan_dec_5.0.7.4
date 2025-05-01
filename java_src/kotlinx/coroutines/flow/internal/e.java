package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes6.dex */
public final class e<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ e(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i5 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i5 & 4) != 0 ? -3 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected ChannelFlow<T> j(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return new e(this.f70893e, coroutineContext, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public kotlinx.coroutines.flow.e<T> k() {
        return (kotlinx.coroutines.flow.e<T>) this.f70893e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @Nullable
    public Object s(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = this.f70893e.a(fVar, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    public e(@NotNull kotlinx.coroutines.flow.e<? extends T> eVar, @NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i4, bufferOverflow);
    }
}
