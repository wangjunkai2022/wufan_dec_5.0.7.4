package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
/* loaded from: classes6.dex */
public final class b<T> extends ChannelFlow<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f70861g = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed");
    @NotNull
    private volatile /* synthetic */ int consumed;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final ReceiveChannel<T> f70862e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f70863f;

    public /* synthetic */ b(ReceiveChannel receiveChannel, boolean z4, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(receiveChannel, z4, (i5 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i5 & 8) != 0 ? -3 : i4, (i5 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final void o() {
        if (this.f70863f) {
            if (!(f70861g.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super T> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object e5;
        Object coroutine_suspended2;
        if (this.f70869c == -3) {
            o();
            e5 = FlowKt__ChannelsKt.e(fVar, this.f70862e, this.f70863f, continuation);
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return e5 == coroutine_suspended2 ? e5 : Unit.INSTANCE;
        }
        Object a5 = super.a(fVar, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected String g() {
        return Intrinsics.stringPlus("channel=", this.f70862e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object i(@NotNull kotlinx.coroutines.channels.w<? super T> wVar, @NotNull Continuation<? super Unit> continuation) {
        Object e5;
        Object coroutine_suspended;
        e5 = FlowKt__ChannelsKt.e(new kotlinx.coroutines.flow.internal.m(wVar), this.f70862e, this.f70863f, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return e5 == coroutine_suspended ? e5 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    protected ChannelFlow<T> j(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return new b(this.f70862e, this.f70863f, coroutineContext, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public e<T> k() {
        return new b(this.f70862e, this.f70863f, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ReceiveChannel<T> n(@NotNull q0 q0Var) {
        o();
        if (this.f70869c == -3) {
            return this.f70862e;
        }
        return super.n(q0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull ReceiveChannel<? extends T> receiveChannel, boolean z4, @NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i4, bufferOverflow);
        this.f70862e = receiveChannel;
        this.f70863f = z4;
        this.consumed = 0;
    }
}
