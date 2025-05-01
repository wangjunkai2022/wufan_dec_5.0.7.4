package com.join.kotlin.quark.viewmodel;

import com.MApplication;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.kotlin.quark.model.request.SourceWantRequest;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CreateSourceHopeViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.quark.viewmodel.CreateSourceHopeViewModel$wishPoolWant$2", f = "CreateSourceHopeViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class CreateSourceHopeViewModel$wishPoolWant$2 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<Boolean>>, Object> {
    final /* synthetic */ String $uid;
    final /* synthetic */ Integer $wishPoolId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSourceHopeViewModel$wishPoolWant$2(String str, Integer num, Continuation<? super CreateSourceHopeViewModel$wishPoolWant$2> continuation) {
        super(1, continuation);
        this.$uid = str;
        this.$wishPoolId = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new CreateSourceHopeViewModel$wishPoolWant$2(this.$uid, this.$wishPoolId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super ResponseModel<Boolean>> continuation) {
        return ((CreateSourceHopeViewModel$wishPoolWant$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            SourceWantRequest sourceWantRequest = new SourceWantRequest(this.$uid, this.$wishPoolId);
            RequestModel requestModel = new RequestModel(MApplication.f1497x);
            requestModel.setArgs(sourceWantRequest);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<SourceWantRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "requestModel.makeSign()");
            this.label = 1;
            obj = gameApiService.wishPoolWant(makeSign, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return (ResponseModel) obj;
    }
}
