package com.join.kotlin.discount.viewmodel;

import com.MApplication;
import com.join.kotlin.discount.model.bean.GameServerInfoBean;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.mgps.dto.RequestGameIdArgs;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GameDetailServerBookDialogViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.discount.viewmodel.GameDetailServerBookDialogViewModel$getServerList$1", f = "GameDetailServerBookDialogViewModel.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GameDetailServerBookDialogViewModel$getServerList$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<List<? extends GameServerInfoBean>>>, Object> {
    int label;
    final /* synthetic */ GameDetailServerBookDialogViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailServerBookDialogViewModel$getServerList$1(GameDetailServerBookDialogViewModel gameDetailServerBookDialogViewModel, Continuation<? super GameDetailServerBookDialogViewModel$getServerList$1> continuation) {
        super(1, continuation);
        this.this$0 = gameDetailServerBookDialogViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new GameDetailServerBookDialogViewModel$getServerList$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseModel<List<? extends GameServerInfoBean>>> continuation) {
        return invoke2((Continuation<? super ResponseModel<List<GameServerInfoBean>>>) continuation);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@Nullable Continuation<? super ResponseModel<List<GameServerInfoBean>>> continuation) {
        return ((GameDetailServerBookDialogViewModel$getServerList$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            RequestModel<RequestGameIdArgs> requestModel = new RequestModel<>();
            RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
            requestGameIdArgs.setGameId(this.this$0.getGameId());
            requestModel.setArgs(requestGameIdArgs);
            requestModel.setDefault(MApplication.f1497x);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            this.label = 1;
            obj = gameApiService.getGameServerList(requestModel, this);
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
