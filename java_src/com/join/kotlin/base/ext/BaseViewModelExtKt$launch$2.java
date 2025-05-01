package com.join.kotlin.base.ext;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelExt.kt */
@DebugMetadata(c = "com.join.kotlin.base.ext.BaseViewModelExtKt$launch$2", f = "BaseViewModelExt.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class BaseViewModelExtKt$launch$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
    final /* synthetic */ Function1<Throwable, Unit> $error;
    final /* synthetic */ Function1<T, Unit> $success;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$launch$2(Function1<? super Continuation<? super T>, ? extends Object> function1, Function1<? super T, Unit> function12, Function1<? super Throwable, Unit> function13, Continuation<? super BaseViewModelExtKt$launch$2> continuation) {
        super(2, continuation);
        this.$block = function1;
        this.$success = function12;
        this.$error = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BaseViewModelExtKt$launch$2(this.$block, this.$success, this.$error, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$launch$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Object m35constructorimpl;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super T>, Object> function1 = this.$block;
                Result.Companion companion = Result.Companion;
                CoroutineDispatcher c5 = d1.c();
                BaseViewModelExtKt$launch$2$1$1 baseViewModelExtKt$launch$2$1$1 = new BaseViewModelExtKt$launch$2$1$1(function1, null);
                this.label = 1;
                obj = i.h(c5, baseViewModelExtKt$launch$2$1$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            m35constructorimpl = Result.m35constructorimpl(obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        Function1<T, Unit> function12 = this.$success;
        if (Result.m42isSuccessimpl(m35constructorimpl)) {
            function12.invoke(m35constructorimpl);
        }
        Function1<Throwable, Unit> function13 = this.$error;
        Throwable m38exceptionOrNullimpl = Result.m38exceptionOrNullimpl(m35constructorimpl);
        if (m38exceptionOrNullimpl != null) {
            function13.invoke(m38exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
