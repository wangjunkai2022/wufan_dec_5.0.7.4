package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes6.dex */
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements e<R> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f70326b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Function3 f70327c;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(e eVar, Function3 function3) {
        this.f70326b = eVar;
        this.f70327c = function3;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super R> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = this.f70326b.a(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f70327c, fVar), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @Nullable
    public Object g(@NotNull f fVar, @NotNull Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.1

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f70328b;

            /* renamed from: c  reason: collision with root package name */
            int f70329c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70328b = obj;
                this.f70329c |= Integer.MIN_VALUE;
                return FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.this.a(null, this);
            }
        };
        InlineMarker.mark(5);
        e eVar = this.f70326b;
        FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1 = new FlowKt__EmittersKt$unsafeTransform$1$1(this.f70327c, fVar);
        InlineMarker.mark(0);
        eVar.a(flowKt__EmittersKt$unsafeTransform$1$1, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
