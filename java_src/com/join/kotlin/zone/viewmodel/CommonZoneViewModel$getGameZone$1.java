package com.join.kotlin.zone.viewmodel;

import com.MApplication;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.kotlin.zone.model.bean.GameZoneDataBean;
import com.join.kotlin.zone.model.request.GameZoneRequest;
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
/* compiled from: CommonZoneViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.zone.viewmodel.CommonZoneViewModel$getGameZone$1", f = "CommonZoneViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class CommonZoneViewModel$getGameZone$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<GameZoneDataBean>>, Object> {
    final /* synthetic */ String $zoneId;
    int label;
    final /* synthetic */ CommonZoneViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonZoneViewModel$getGameZone$1(CommonZoneViewModel commonZoneViewModel, String str, Continuation<? super CommonZoneViewModel$getGameZone$1> continuation) {
        super(1, continuation);
        this.this$0 = commonZoneViewModel;
        this.$zoneId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new CommonZoneViewModel$getGameZone$1(this.this$0, this.$zoneId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super ResponseModel<GameZoneDataBean>> continuation) {
        return ((CommonZoneViewModel$getGameZone$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getLoadBindData().setValue(new LoadBindindData(2));
            GameZoneRequest gameZoneRequest = new GameZoneRequest(this.$zoneId);
            RequestModel requestModel = new RequestModel(MApplication.f1497x);
            requestModel.setArgs(gameZoneRequest);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<GameZoneRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "requestModel.makeSign()");
            this.label = 1;
            obj = gameApiService.getGameZone(makeSign, this);
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
