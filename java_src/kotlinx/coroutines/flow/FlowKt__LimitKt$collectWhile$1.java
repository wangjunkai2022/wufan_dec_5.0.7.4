package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {137}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70414b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70415c;

    /* renamed from: d  reason: collision with root package name */
    int f70416d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$collectWhile$1(Continuation<? super FlowKt__LimitKt$collectWhile$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70415c = obj;
        this.f70416d |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.b(null, null, this);
    }
}
