package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ChannelFlow.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public abstract class ChannelFlow<T> implements i<T> {
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineContext f70868b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final int f70869c;
    @JvmField
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final BufferOverflow f70870d;

    public ChannelFlow(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        this.f70868b = coroutineContext;
        this.f70869c = i4;
        this.f70870d = bufferOverflow;
        if (s0.b()) {
            if (!(i4 != -1)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ Object h(ChannelFlow channelFlow, kotlinx.coroutines.flow.f fVar, Continuation continuation) {
        Object coroutine_suspended;
        Object g4 = r0.g(new ChannelFlow$collect$2(fVar, channelFlow, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g4 == coroutine_suspended ? g4 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull Continuation<? super Unit> continuation) {
        return h(this, fVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @NotNull
    public kotlinx.coroutines.flow.e<T> c(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        if (s0.b()) {
            if (!(i4 != -1)) {
                throw new AssertionError();
            }
        }
        CoroutineContext plus = coroutineContext.plus(this.f70868b);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i5 = this.f70869c;
            if (i5 != -3) {
                if (i4 != -3) {
                    if (i5 != -2) {
                        if (i4 != -2) {
                            if (s0.b()) {
                                if (!(this.f70869c >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (s0.b()) {
                                if (!(i4 >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            i5 = this.f70869c + i4;
                            if (i5 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i5;
            }
            bufferOverflow = this.f70870d;
        }
        return (Intrinsics.areEqual(plus, this.f70868b) && i4 == this.f70869c && bufferOverflow == this.f70870d) ? this : j(plus, i4, bufferOverflow);
    }

    @Nullable
    protected String g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public abstract Object i(@NotNull w<? super T> wVar, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    protected abstract ChannelFlow<T> j(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow);

    @Nullable
    public kotlinx.coroutines.flow.e<T> k() {
        return null;
    }

    @NotNull
    public final Function2<w<? super T>, Continuation<? super Unit>, Object> l() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int m() {
        int i4 = this.f70869c;
        if (i4 == -3) {
            return -2;
        }
        return i4;
    }

    @NotNull
    public ReceiveChannel<T> n(@NotNull q0 q0Var) {
        return ProduceKt.h(q0Var, this.f70868b, m(), this.f70870d, CoroutineStart.ATOMIC, null, l(), 16, null);
    }

    @NotNull
    public String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList(4);
        String g4 = g();
        if (g4 != null) {
            arrayList.add(g4);
        }
        CoroutineContext coroutineContext = this.f70868b;
        if (coroutineContext != EmptyCoroutineContext.INSTANCE) {
            arrayList.add(Intrinsics.stringPlus("context=", coroutineContext));
        }
        int i4 = this.f70869c;
        if (i4 != -3) {
            arrayList.add(Intrinsics.stringPlus("capacity=", Integer.valueOf(i4)));
        }
        BufferOverflow bufferOverflow = this.f70870d;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add(Intrinsics.stringPlus("onBufferOverflow=", bufferOverflow));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t0.a(this));
        sb.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(joinToString$default);
        sb.append(']');
        return sb.toString();
    }
}
