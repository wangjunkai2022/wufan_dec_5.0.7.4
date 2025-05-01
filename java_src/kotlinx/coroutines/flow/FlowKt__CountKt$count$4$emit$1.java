package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Count.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {31}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FlowKt__CountKt$count$4$emit$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70246b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70247c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FlowKt__CountKt$count$4<T> f70248d;

    /* renamed from: e  reason: collision with root package name */
    int f70249e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CountKt$count$4$emit$1(FlowKt__CountKt$count$4<? super T> flowKt__CountKt$count$4, Continuation<? super FlowKt__CountKt$count$4$emit$1> continuation) {
        super(continuation);
        this.f70248d = flowKt__CountKt$count$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70247c = obj;
        this.f70249e |= Integer.MIN_VALUE;
        return this.f70248d.emit(null, this);
    }
}
