package com.join.kotlin.ui.account.viewmodle;

import com.join.kotlin.http.RpcKotlinServiceFactory;
import com.join.kotlin.http.protocol.ApiException;
import com.join.kotlin.ui.account.modle.UnThirdPartRequest;
import com.join.mgps.dto.ResponseModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ApiCall.kt */
@DebugMetadata(c = "com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1", f = "UnbindViewModle.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCall.kt\ncom/join/kotlin/http/protocol/ApiCallKt$apiCall$2\n+ 2 UnbindViewModle.kt\ncom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendUnbindThridPart$job$1\n*L\n1#1,23:1\n66#2,2:24\n*E\n"})
/* loaded from: classes3.dex */
public final class UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1 extends SuspendLambda implements Function2<q0, Continuation<? super ResponseModel<Boolean>>, Object> {
    final /* synthetic */ Ref.ObjectRef $request$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1(Continuation continuation, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.$request$inlined = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1 unbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1 = new UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1(continuation, this.$request$inlined);
        unbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1.L$0 = obj;
        return unbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super ResponseModel<Boolean>> continuation) {
        return ((UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                obj = RpcKotlinServiceFactory.Companion.getInstances().getJavaAccountAPI().unbindThirdfParty((UnThirdPartRequest) this.$request$inlined.element, this);
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
