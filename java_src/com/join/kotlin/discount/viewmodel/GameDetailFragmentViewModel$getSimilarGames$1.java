package com.join.kotlin.discount.viewmodel;

import com.MApplication;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.CollectionBeanSub;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.f;
/* compiled from: GameDetailFragmentViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel$getSimilarGames$1", f = "GameDetailFragmentViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GameDetailFragmentViewModel$getSimilarGames$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<List<? extends CollectionBeanSub>>>, Object> {
    final /* synthetic */ boolean $refresh;
    int label;
    final /* synthetic */ GameDetailFragmentViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailFragmentViewModel$getSimilarGames$1(boolean z4, GameDetailFragmentViewModel gameDetailFragmentViewModel, Continuation<? super GameDetailFragmentViewModel$getSimilarGames$1> continuation) {
        super(1, continuation);
        this.$refresh = z4;
        this.this$0 = gameDetailFragmentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new GameDetailFragmentViewModel$getSimilarGames$1(this.$refresh, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseModel<List<? extends CollectionBeanSub>>> continuation) {
        return invoke2((Continuation<? super ResponseModel<List<CollectionBeanSub>>>) continuation);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@Nullable Continuation<? super ResponseModel<List<CollectionBeanSub>>> continuation) {
        return ((GameDetailFragmentViewModel$getSimilarGames$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                this.this$0.getSimilarListPage().setPage(1);
            }
            RequestModel requestModel = new RequestModel();
            RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(this.this$0.getGameId(), this.this$0.getSimilarListPage().getPage(), AccountUtil_.getInstance_(MApplication.f1497x).getAccountData().getUid());
            requestGameIdArgs.setDownloadedGameIdList(f.K().A());
            requestModel.setArgs(requestGameIdArgs);
            requestModel.setDefault(MApplication.f1497x);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<RequestGameIdArgs> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "request.makeSign()");
            this.label = 1;
            obj = gameApiService.similarRecList(makeSign, this);
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
