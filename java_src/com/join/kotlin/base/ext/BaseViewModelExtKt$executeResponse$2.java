package com.join.kotlin.base.ext;

import com.join.kotlin.base.net.AppException;
import com.join.mgps.dto.ResponseModel;
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
/* compiled from: BaseViewModelExt.kt */
@DebugMetadata(c = "com.join.kotlin.base.ext.BaseViewModelExtKt$executeResponse$2", f = "BaseViewModelExt.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BaseViewModelExtKt$executeResponse$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseModel<T> $response;
    final /* synthetic */ Function3<q0, T, Continuation<? super Unit>, Object> $success;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$executeResponse$2(ResponseModel<T> responseModel, Function3<? super q0, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super BaseViewModelExtKt$executeResponse$2> continuation) {
        super(2, continuation);
        this.$response = responseModel;
        this.$success = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BaseViewModelExtKt$executeResponse$2 baseViewModelExtKt$executeResponse$2 = new BaseViewModelExtKt$executeResponse$2(this.$response, this.$success, continuation);
        baseViewModelExtKt$executeResponse$2.L$0 = obj;
        return baseViewModelExtKt$executeResponse$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeResponse$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            q0 q0Var = (q0) this.L$0;
            if (this.$response.isSuccess()) {
                Function3<q0, T, Continuation<? super Unit>, Object> function3 = this.$success;
                Object responseData = this.$response.getResponseData();
                this.label = 1;
                if (function3.invoke(q0Var, responseData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new AppException(this.$response.getResponseCode(), this.$response.getResponseMsg(), this.$response.getResponseMsg(), null, 8, null);
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
