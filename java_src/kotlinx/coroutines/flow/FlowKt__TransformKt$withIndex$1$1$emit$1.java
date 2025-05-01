package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transform.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {65}, m = "emit", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f70680b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FlowKt__TransformKt$withIndex$1$1<T> f70681c;

    /* renamed from: d  reason: collision with root package name */
    int f70682d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(FlowKt__TransformKt$withIndex$1$1<? super T> flowKt__TransformKt$withIndex$1$1, Continuation<? super FlowKt__TransformKt$withIndex$1$1$emit$1> continuation) {
        super(continuation);
        this.f70681c = flowKt__TransformKt$withIndex$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70680b = obj;
        this.f70682d |= Integer.MIN_VALUE;
        return this.f70681c.emit(null, this);
    }
}
