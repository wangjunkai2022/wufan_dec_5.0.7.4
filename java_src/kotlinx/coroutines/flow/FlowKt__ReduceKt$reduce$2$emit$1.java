package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__ReduceKt$reduce$2$emit$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70550b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70551c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FlowKt__ReduceKt$reduce$2<T> f70552d;

    /* renamed from: e  reason: collision with root package name */
    int f70553e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$reduce$2$emit$1(FlowKt__ReduceKt$reduce$2<? super T> flowKt__ReduceKt$reduce$2, Continuation<? super FlowKt__ReduceKt$reduce$2$emit$1> continuation) {
        super(continuation);
        this.f70552d = flowKt__ReduceKt$reduce$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70551c = obj;
        this.f70553e |= Integer.MIN_VALUE;
        return this.f70552d.emit(null, this);
    }
}
