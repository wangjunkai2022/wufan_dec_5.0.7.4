package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FlowCoroutine.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70980b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70981c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Function3<q0, kotlinx.coroutines.flow.f<? super R>, Continuation<? super Unit>, Object> f70982d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<R> f70983e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(Function3<? super q0, ? super kotlinx.coroutines.flow.f<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3, kotlinx.coroutines.flow.f<? super R> fVar, Continuation<? super FlowCoroutineKt$scopedFlow$1$1> continuation) {
        super(2, continuation);
        this.f70982d = function3;
        this.f70983e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f70982d, this.f70983e, continuation);
        flowCoroutineKt$scopedFlow$1$1.f70981c = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70980b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Function3<q0, kotlinx.coroutines.flow.f<? super R>, Continuation<? super Unit>, Object> function3 = this.f70982d;
            Object obj2 = this.f70983e;
            this.f70980b = 1;
            if (function3.invoke((q0) this.f70981c, obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
