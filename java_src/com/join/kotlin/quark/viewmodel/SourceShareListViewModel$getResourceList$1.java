package com.join.kotlin.quark.viewmodel;

import com.MApplication;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.model.request.SourceListRequest;
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
/* compiled from: SourceShareListViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.quark.viewmodel.SourceShareListViewModel$getResourceList$1", f = "SourceShareListViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SourceShareListViewModel$getResourceList$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<ArrayList<SourceListItemBean>>>, Object> {
    final /* synthetic */ boolean $refresh;
    final /* synthetic */ int $tabId;
    final /* synthetic */ String $token;
    final /* synthetic */ String $uid;
    int label;
    final /* synthetic */ SourceShareListViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceShareListViewModel$getResourceList$1(boolean z4, SourceShareListViewModel sourceShareListViewModel, int i4, String str, String str2, Continuation<? super SourceShareListViewModel$getResourceList$1> continuation) {
        super(1, continuation);
        this.$refresh = z4;
        this.this$0 = sourceShareListViewModel;
        this.$tabId = i4;
        this.$token = str;
        this.$uid = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new SourceShareListViewModel$getResourceList$1(this.$refresh, this.this$0, this.$tabId, this.$token, this.$uid, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super ResponseModel<ArrayList<SourceListItemBean>>> continuation) {
        return ((SourceShareListViewModel$getResourceList$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            SourceListRequest sourceListRequest = new SourceListRequest(this.this$0.getPage(), Boxing.boxInt(this.$tabId), this.$token, this.$uid);
            RequestModel requestModel = new RequestModel(MApplication.f1497x);
            requestModel.setArgs(sourceListRequest);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<SourceListRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "requestModel.makeSign()");
            this.label = 1;
            obj = gameApiService.resourceList(makeSign, this);
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
