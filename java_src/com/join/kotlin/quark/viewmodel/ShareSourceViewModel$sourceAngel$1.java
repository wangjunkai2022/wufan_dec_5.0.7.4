package com.join.kotlin.quark.viewmodel;

import com.MApplication;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.model.request.AngelRequest;
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
/* compiled from: ShareSourceViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.quark.viewmodel.ShareSourceViewModel$sourceAngel$1", f = "ShareSourceViewModel.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ShareSourceViewModel$sourceAngel$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<Boolean>>, Object> {
    final /* synthetic */ String $uid;
    int label;
    final /* synthetic */ ShareSourceViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSourceViewModel$sourceAngel$1(ShareSourceViewModel shareSourceViewModel, String str, Continuation<? super ShareSourceViewModel$sourceAngel$1> continuation) {
        super(1, continuation);
        this.this$0 = shareSourceViewModel;
        this.$uid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new ShareSourceViewModel$sourceAngel$1(this.this$0, this.$uid, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super ResponseModel<Boolean>> continuation) {
        return ((ShareSourceViewModel$sourceAngel$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            String value = this.this$0.getDiskUrl().getValue();
            String str = this.$uid;
            SourceListItemBean wishPoolItem = this.this$0.getWishPoolItem();
            AngelRequest angelRequest = new AngelRequest(value, str, wishPoolItem != null ? wishPoolItem.getId() : null);
            RequestModel requestModel = new RequestModel(MApplication.f1497x);
            requestModel.setArgs(angelRequest);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<AngelRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "requestModel.makeSign()");
            this.label = 1;
            obj = gameApiService.sourceAngel(makeSign, this);
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
