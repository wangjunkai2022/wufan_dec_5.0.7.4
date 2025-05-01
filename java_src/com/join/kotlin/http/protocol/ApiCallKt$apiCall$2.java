package com.join.kotlin.http.protocol;

import com.join.mgps.dto.ResponseModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ApiCall.kt */
@DebugMetadata(c = "com.join.kotlin.http.protocol.ApiCallKt$apiCall$2", f = "ApiCall.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCall.kt\ncom/join/kotlin/http/protocol/ApiCallKt$apiCall$2\n*L\n1#1,23:1\n*E\n"})
/* loaded from: classes3.dex */
public final class ApiCallKt$apiCall$2<T> extends SuspendLambda implements Function2<q0, Continuation<? super ResponseModel<T>>, Object> {
    final /* synthetic */ Function2<q0, Continuation<? super ResponseModel<T>>, Object> $call;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiCallKt$apiCall$2(Function2<? super q0, ? super Continuation<? super ResponseModel<T>>, ? extends Object> function2, Continuation<? super ApiCallKt$apiCall$2> continuation) {
        super(2, continuation);
        this.$call = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ApiCallKt$apiCall$2 apiCallKt$apiCall$2 = new ApiCallKt$apiCall$2(this.$call, continuation);
        apiCallKt$apiCall$2.L$0 = obj;
        return apiCallKt$apiCall$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Object obj) {
        return invoke(q0Var, (Continuation) ((Continuation) obj));
    }

    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super ResponseModel<T>> continuation) {
        return ((ApiCallKt$apiCall$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Function2<q0, Continuation<? super ResponseModel<T>>, Object> function2 = this.$call;
                this.label = 1;
                obj = function2.invoke(q0Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return (ResponseModel) obj;
        } catch (Throwable th) {
            return ApiException.Companion.build(th).toResponse();
        }
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        try {
            return (ResponseModel) this.$call.invoke((q0) this.L$0, this);
        } catch (Throwable th) {
            return ApiException.Companion.build(th).toResponse();
        }
    }
}
