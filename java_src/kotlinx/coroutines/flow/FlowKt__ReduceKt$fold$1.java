package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70530b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70531c;

    /* renamed from: d  reason: collision with root package name */
    int f70532d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ReduceKt$fold$1(Continuation<? super FlowKt__ReduceKt$fold$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70531c = obj;
        this.f70532d |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.e(null, null, null, this);
    }
}
