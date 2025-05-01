package com.join.kotlin.ui.modleregin.viewModle;

import com.join.kotlin.http.RpcKotlinServiceFactory;
import com.join.kotlin.http.api.RpcJavaApiForKotlin;
import com.join.kotlin.http.protocol.ApiException;
import com.join.kotlin.ui.modleregin.modle.BtReginResultMain;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ApiCall.kt */
@DebugMetadata(c = "com.join.kotlin.ui.modleregin.viewModle.BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1", f = "BtReginModle.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCall.kt\ncom/join/kotlin/http/protocol/ApiCallKt$apiCall$2\n+ 2 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle$loadDatas$job$1\n*L\n1#1,23:1\n69#2,2:24\n*E\n"})
/* loaded from: classes3.dex */
public final class BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1 extends SuspendLambda implements Function2<q0, Continuation<? super ResponseModel<BtReginResultMain>>, Object> {
    final /* synthetic */ Ref.ObjectRef $requestModel$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1(Continuation continuation, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.$requestModel$inlined = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1 btReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1 = new BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1(continuation, this.$requestModel$inlined);
        btReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1.L$0 = obj;
        return btReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super ResponseModel<BtReginResultMain>> continuation) {
        return ((BtReginModle$loadDatas$job$1$invokeSuspend$$inlined$apiCall$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                q0 q0Var = (q0) this.L$0;
                RpcJavaApiForKotlin javaRootAPI = RpcKotlinServiceFactory.Companion.getInstances().getJavaRootAPI();
                RequestModel<RequestGameIdArgs> makeSign = ((RequestModel) this.$requestModel$inlined.element).makeSign();
                Intrinsics.checkNotNullExpressionValue(makeSign, "requestModel.makeSign()");
                this.label = 1;
                obj = javaRootAPI.getBtReginDatas(makeSign, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (ResponseModel) obj;
        } catch (Throwable th) {
            return ApiException.Companion.build(th).toResponse();
        }
    }
}
