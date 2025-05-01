package com.join.kotlin.discount.viewmodel;

import com.MApplication;
import com.join.kotlin.discount.model.bean.GameDetailDataBean;
import com.join.kotlin.discount.model.request.GameDetailRequest;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.mgps.Util.AccountUtil_;
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
import p1.f;
/* compiled from: GameDetailFragmentViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel$getGameDetail$1", f = "GameDetailFragmentViewModel.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GameDetailFragmentViewModel$getGameDetail$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<GameDetailDataBean>>, Object> {
    int label;
    final /* synthetic */ GameDetailFragmentViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailFragmentViewModel$getGameDetail$1(GameDetailFragmentViewModel gameDetailFragmentViewModel, Continuation<? super GameDetailFragmentViewModel$getGameDetail$1> continuation) {
        super(1, continuation);
        this.this$0 = gameDetailFragmentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new GameDetailFragmentViewModel$getGameDetail$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super ResponseModel<GameDetailDataBean>> continuation) {
        return ((GameDetailFragmentViewModel$getGameDetail$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            GameDetailRequest gameDetailRequest = new GameDetailRequest(this.this$0.getGameId(), AccountUtil_.getInstance_(MApplication.f1497x).getUid(), f.K().A());
            RequestModel requestModel = new RequestModel();
            requestModel.setDefault(MApplication.f1497x);
            requestModel.setArgs(gameDetailRequest);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<GameDetailRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "args.makeSign()");
            this.label = 1;
            obj = gameApiService.getGameDetail(makeSign, this);
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
