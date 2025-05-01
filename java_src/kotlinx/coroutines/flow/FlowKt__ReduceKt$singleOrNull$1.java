package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70557b;

    /* renamed from: c  reason: collision with root package name */
    Object f70558c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70559d;

    /* renamed from: e  reason: collision with root package name */
    int f70560e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ReduceKt$singleOrNull$1(Continuation<? super FlowKt__ReduceKt$singleOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70559d = obj;
        this.f70560e |= Integer.MIN_VALUE;
        return g.I1(null, this);
    }
}
