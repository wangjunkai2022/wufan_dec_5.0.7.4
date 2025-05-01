package com.join.kotlin.base.ext;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.join.kotlin.base.ext.utils.LogExtKt;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.state.ResultStateKt;
import com.join.mgps.dto.ResponseModel;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelExt.kt */
@DebugMetadata(c = "com.join.kotlin.base.ext.BaseViewModelExtKt$request$1", f = "BaseViewModelExt.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class BaseViewModelExtKt$request$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super ResponseModel<T>>, Object> $block;
    final /* synthetic */ boolean $isShowDialog;
    final /* synthetic */ String $loadingMessage;
    final /* synthetic */ MutableLiveData<ResultState<T>> $resultState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$request$1(boolean z4, MutableLiveData<ResultState<T>> mutableLiveData, String str, Function1<? super Continuation<? super ResponseModel<T>>, ? extends Object> function1, Continuation<? super BaseViewModelExtKt$request$1> continuation) {
        super(2, continuation);
        this.$isShowDialog = z4;
        this.$resultState = mutableLiveData;
        this.$loadingMessage = str;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BaseViewModelExtKt$request$1 baseViewModelExtKt$request$1 = new BaseViewModelExtKt$request$1(this.$isShowDialog, this.$resultState, this.$loadingMessage, this.$block, continuation);
        baseViewModelExtKt$request$1.L$0 = obj;
        return baseViewModelExtKt$request$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$request$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Object m35constructorimpl;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                q0 q0Var = (q0) this.L$0;
                boolean z4 = this.$isShowDialog;
                LiveData liveData = this.$resultState;
                String str = this.$loadingMessage;
                Function1<Continuation<? super ResponseModel<T>>, Object> function1 = this.$block;
                Result.Companion companion = Result.Companion;
                if (z4) {
                    liveData.setValue(ResultState.Companion.onRequestLoading(str));
                }
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            m35constructorimpl = Result.m35constructorimpl((ResponseModel) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th));
        }
        MutableLiveData<ResultState<T>> mutableLiveData = this.$resultState;
        if (Result.m42isSuccessimpl(m35constructorimpl)) {
            ResultStateKt.paresResult((MutableLiveData) mutableLiveData, (ResponseModel) m35constructorimpl);
        }
        MutableLiveData<ResultState<T>> mutableLiveData2 = this.$resultState;
        Throwable m38exceptionOrNullimpl = Result.m38exceptionOrNullimpl(m35constructorimpl);
        if (m38exceptionOrNullimpl != null) {
            String message = m38exceptionOrNullimpl.getMessage();
            if (message != null) {
                LogExtKt.loge$default(message, null, 1, null);
            }
            m38exceptionOrNullimpl.printStackTrace();
            ResultStateKt.paresException(mutableLiveData2, m38exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
