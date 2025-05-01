package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, 403}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes6.dex */
public final class StateFlowImpl$collect$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70841b;

    /* renamed from: c  reason: collision with root package name */
    Object f70842c;

    /* renamed from: d  reason: collision with root package name */
    Object f70843d;

    /* renamed from: e  reason: collision with root package name */
    Object f70844e;

    /* renamed from: f  reason: collision with root package name */
    Object f70845f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f70846g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ StateFlowImpl<T> f70847h;

    /* renamed from: i  reason: collision with root package name */
    int f70848i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl<T> stateFlowImpl, Continuation<? super StateFlowImpl$collect$1> continuation) {
        super(continuation);
        this.f70847h = stateFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70846g = obj;
        this.f70848i |= Integer.MIN_VALUE;
        return this.f70847h.a(null, this);
    }
}
