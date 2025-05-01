package com.join.kotlin.discount.viewmodel;

import com.MApplication;
import com.join.kotlin.discount.model.bean.GiftItemTypeBean;
import com.join.kotlin.discount.model.request.CommonRequest;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.List;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GameDetailGiftViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.discount.viewmodel.GameDetailGiftViewModel$getGiftList$1", f = "GameDetailGiftViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GameDetailGiftViewModel$getGiftList$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<List<? extends GiftItemTypeBean>>>, Object> {
    int label;
    final /* synthetic */ GameDetailGiftViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailGiftViewModel$getGiftList$1(GameDetailGiftViewModel gameDetailGiftViewModel, Continuation<? super GameDetailGiftViewModel$getGiftList$1> continuation) {
        super(1, continuation);
        this.this$0 = gameDetailGiftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new GameDetailGiftViewModel$getGiftList$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseModel<List<? extends GiftItemTypeBean>>> continuation) {
        return invoke2((Continuation<? super ResponseModel<List<GiftItemTypeBean>>>) continuation);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@Nullable Continuation<? super ResponseModel<List<GiftItemTypeBean>>> continuation) {
        return ((GameDetailGiftViewModel$getGiftList$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            CommonRequest commonRequest = new CommonRequest(this.this$0.getGameId(), 1);
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(commonRequest);
            requestModel.setDefault(MApplication.f1497x);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<CommonRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "request.makeSign()");
            this.label = 1;
            obj = gameApiService.getGameDetailGiftList(makeSign, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
