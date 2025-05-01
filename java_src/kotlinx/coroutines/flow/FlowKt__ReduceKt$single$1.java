package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FlowKt__ReduceKt$single$1<T> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70554b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70555c;

    /* renamed from: d  reason: collision with root package name */
    int f70556d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ReduceKt$single$1(Continuation<? super FlowKt__ReduceKt$single$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70555c = obj;
        this.f70556d |= Integer.MIN_VALUE;
        return g.H1(null, this);
    }
}
