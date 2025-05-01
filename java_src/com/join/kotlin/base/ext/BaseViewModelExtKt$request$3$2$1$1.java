package com.join.kotlin.base.ext;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: BaseViewModelExt.kt */
@DebugMetadata(c = "com.join.kotlin.base.ext.BaseViewModelExtKt$request$3$2$1$1", f = "BaseViewModelExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BaseViewModelExtKt$request$3$2$1$1<T> extends SuspendLambda implements Function3<q0, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, Unit> $success;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$request$3$2$1$1(Function1<? super T, Unit> function1, Continuation<? super BaseViewModelExtKt$request$3$2$1$1> continuation) {
        super(3, continuation);
        this.$success = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Object obj, Continuation<? super Unit> continuation) {
        return invoke2(q0Var, (q0) obj, continuation);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull q0 q0Var, @Nullable T t4, @Nullable Continuation<? super Unit> continuation) {
        BaseViewModelExtKt$request$3$2$1$1 baseViewModelExtKt$request$3$2$1$1 = new BaseViewModelExtKt$request$3$2$1$1(this.$success, continuation);
        baseViewModelExtKt$request$3$2$1$1.L$0 = t4;
        return baseViewModelExtKt$request$3$2$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$success.invoke(this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
