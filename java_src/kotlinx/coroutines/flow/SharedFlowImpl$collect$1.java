package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedFlow.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class SharedFlowImpl$collect$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70817b;

    /* renamed from: c  reason: collision with root package name */
    Object f70818c;

    /* renamed from: d  reason: collision with root package name */
    Object f70819d;

    /* renamed from: e  reason: collision with root package name */
    Object f70820e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f70821f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SharedFlowImpl<T> f70822g;

    /* renamed from: h  reason: collision with root package name */
    int f70823h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super SharedFlowImpl$collect$1> continuation) {
        super(continuation);
        this.f70822g = sharedFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70821f = obj;
        this.f70823h |= Integer.MIN_VALUE;
        return SharedFlowImpl.F(this.f70822g, null, this);
    }
}
