package com.join.kotlin.quark.viewmodel;

import com.MApplication;
import com.join.kotlin.network.api.ApiServiceFactorKt;
import com.join.kotlin.network.api.GameApiService;
import com.join.kotlin.quark.model.request.AngelCreateRequest;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateSourceHopeViewModel.kt */
@DebugMetadata(c = "com.join.kotlin.quark.viewmodel.CreateSourceHopeViewModel$sourceShareCreate$1", f = "CreateSourceHopeViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CreateSourceHopeViewModel$sourceShareCreate$1 extends SuspendLambda implements Function1<Continuation<? super ResponseModel<Boolean>>, Object> {
    final /* synthetic */ int $type;
    final /* synthetic */ String $uid;
    int label;
    final /* synthetic */ CreateSourceHopeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSourceHopeViewModel$sourceShareCreate$1(CreateSourceHopeViewModel createSourceHopeViewModel, int i4, String str, Continuation<? super CreateSourceHopeViewModel$sourceShareCreate$1> continuation) {
        super(1, continuation);
        this.this$0 = createSourceHopeViewModel;
        this.$type = i4;
        this.$uid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new CreateSourceHopeViewModel$sourceShareCreate$1(this.this$0, this.$type, this.$uid, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super ResponseModel<Boolean>> continuation) {
        return ((CreateSourceHopeViewModel$sourceShareCreate$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            AngelCreateRequest angelCreateRequest = new AngelCreateRequest(null, this.this$0.getDescData().getValue(), Boxing.boxInt(this.$type), this.$uid);
            RequestModel requestModel = new RequestModel(MApplication.f1497x);
            requestModel.setArgs(angelCreateRequest);
            GameApiService gameApiService = ApiServiceFactorKt.getGameApiService();
            RequestModel<AngelCreateRequest> makeSign = requestModel.makeSign();
            Intrinsics.checkNotNullExpressionValue(makeSign, "requestModel.makeSign()");
            this.label = 1;
            obj = gameApiService.sourceShareCreate(makeSign, this);
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
