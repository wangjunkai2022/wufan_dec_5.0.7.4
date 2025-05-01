package com.join.kotlin.discount.viewmodel;

import com.MApplication;
import com.join.kotlin.discount.model.bean.CouponItemBean;
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
/* compiled from: GameDetailCouponViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.discount.viewmodel.GameDetailCouponViewModel$getCouponList$1", f = "GameDetailCouponViewModel.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GameDetailCouponViewModel$getCouponList$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<List<? extends CouponItemBean>>>, Object> {
    final /* synthetic */ boolean $refresh;
    int label;
    final /* synthetic */ GameDetailCouponViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailCouponViewModel$getCouponList$1(boolean z4, GameDetailCouponViewModel gameDetailCouponViewModel, Continuation<? super GameDetailCouponViewModel$getCouponList$1> continuation) {
        super(1, continuation);
        this.$refresh = z4;
        this.this$0 = gameDetailCouponViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new GameDetailCouponViewModel$getCouponList$1(this.$refresh, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseModel<List<? extends CouponItemBean>>> continuation) {
        return invoke2((Continuation<? super ResponseModel<List<CouponItemBean>>>) continuation);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@Nullable Continuation<? super ResponseModel<List<CouponItemBean>>> continuation) {
        return ((GameDetailCouponViewModel$getCouponList$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$refresh) {
                this.this$0.getPage().setPage(1);
            }
            CommonRequest commonRequest = new CommonRequest(this.this$0.getGameId(), this.this$0.getPage().getPage());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(commonRequest);
            requestModel.setDefault(MApplication.f1497x);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<CommonRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "request.makeSign()");
            this.label = 1;
            obj = gameApiService.getGameDetailCouponList(makeSign, this);
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
