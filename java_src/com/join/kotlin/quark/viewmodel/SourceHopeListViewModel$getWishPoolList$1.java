package com.join.kotlin.quark.viewmodel;

import com.MApplication;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.model.request.WishPoolRequest;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceHopeListViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.quark.viewmodel.SourceHopeListViewModel$getWishPoolList$1", f = "SourceHopeListViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SourceHopeListViewModel$getWishPoolList$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<ArrayList<SourceListItemBean>>>, Object> {
    final /* synthetic */ boolean $refresh;
    final /* synthetic */ String $uid;
    int label;
    final /* synthetic */ SourceHopeListViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceHopeListViewModel$getWishPoolList$1(boolean z4, SourceHopeListViewModel sourceHopeListViewModel, String str, Continuation<? super SourceHopeListViewModel$getWishPoolList$1> continuation) {
        super(1, continuation);
        this.$refresh = z4;
        this.this$0 = sourceHopeListViewModel;
        this.$uid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new SourceHopeListViewModel$getWishPoolList$1(this.$refresh, this.this$0, this.$uid, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super ResponseModel<ArrayList<SourceListItemBean>>> continuation) {
        return ((SourceHopeListViewModel$getWishPoolList$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            WishPoolRequest wishPoolRequest = new WishPoolRequest(null, Boxing.boxInt(1), Boxing.boxInt(this.this$0.getPage().getPage()), this.this$0.getSortType(), this.this$0.getStatus(), null, this.$uid);
            RequestModel requestModel = new RequestModel(MApplication.f1497x);
            requestModel.setArgs(wishPoolRequest);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<WishPoolRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "requestModel.makeSign()");
            this.label = 1;
            obj = gameApiService.wishPoolList(makeSign, this);
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
