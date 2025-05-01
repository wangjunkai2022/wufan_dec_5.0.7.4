package com.join.kotlin.base.ext;

import com.android.dx.io.Opcodes;
import com.join.kotlin.base.net.AppException;
import com.join.mgps.dto.ResponseModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelExt.kt */
@DebugMetadata(c = "com.join.kotlin.base.ext.BaseViewModelExtKt$request$3", f = "BaseViewModelExt.kt", i = {0}, l = {217, Opcodes.XOR_INT_LIT8}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class BaseViewModelExtKt$request$3 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super ResponseModel<T>>, Object> $block;
    final /* synthetic */ Function1<AppException, Unit> $error;
    final /* synthetic */ Function1<T, Unit> $success;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$request$3(Function1<? super Continuation<? super ResponseModel<T>>, ? extends Object> function1, Function1<? super T, Unit> function12, Function1<? super AppException, Unit> function13, Continuation<? super BaseViewModelExtKt$request$3> continuation) {
        super(2, continuation);
        this.$block = function1;
        this.$success = function12;
        this.$error = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BaseViewModelExtKt$request$3 baseViewModelExtKt$request$3 = new BaseViewModelExtKt$request$3(this.$block, this.$success, this.$error, continuation);
        baseViewModelExtKt$request$3.L$0 = obj;
        return baseViewModelExtKt$request$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$request$3) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r8.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r1 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L19
            goto L76
        L19:
            r9 = move-exception
            goto L7f
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.q0 r1 = (kotlinx.coroutines.q0) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L48
            goto L41
        L2b:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.q0 r9 = (kotlinx.coroutines.q0) r9
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.join.mgps.dto.ResponseModel<T>>, java.lang.Object> r1 = r8.$block
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L48
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L48
            r8.label = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r9 = r1.invoke(r8)     // Catch: java.lang.Throwable -> L48
            if (r9 != r0) goto L41
            return r0
        L41:
            com.join.mgps.dto.ResponseModel r9 = (com.join.mgps.dto.ResponseModel) r9     // Catch: java.lang.Throwable -> L48
            java.lang.Object r9 = kotlin.Result.m35constructorimpl(r9)     // Catch: java.lang.Throwable -> L48
            goto L53
        L48:
            r9 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m35constructorimpl(r9)
        L53:
            r1 = r9
            kotlin.jvm.functions.Function1<T, kotlin.Unit> r9 = r8.$success
            kotlin.jvm.functions.Function1<com.join.kotlin.base.net.AppException, kotlin.Unit> r5 = r8.$error
            boolean r6 = kotlin.Result.m42isSuccessimpl(r1)
            if (r6 == 0) goto La4
            r6 = r1
            com.join.mgps.dto.ResponseModel r6 = (com.join.mgps.dto.ResponseModel) r6
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L7d
            com.join.kotlin.base.ext.BaseViewModelExtKt$request$3$2$1$1 r7 = new com.join.kotlin.base.ext.BaseViewModelExtKt$request$3$2$1$1     // Catch: java.lang.Throwable -> L7d
            r7.<init>(r9, r4)     // Catch: java.lang.Throwable -> L7d
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L7d
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L7d
            r8.label = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r9 = com.join.kotlin.base.ext.BaseViewModelExtKt.executeResponse(r6, r7, r8)     // Catch: java.lang.Throwable -> L7d
            if (r9 != r0) goto L75
            return r0
        L75:
            r0 = r5
        L76:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = kotlin.Result.m35constructorimpl(r9)     // Catch: java.lang.Throwable -> L19
            goto L89
        L7d:
            r9 = move-exception
            r0 = r5
        L7f:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m35constructorimpl(r9)
        L89:
            java.lang.Throwable r9 = kotlin.Result.m38exceptionOrNullimpl(r9)
            if (r9 == 0) goto La4
            java.lang.String r2 = r9.getMessage()
            if (r2 == 0) goto L98
            com.join.kotlin.base.ext.utils.LogExtKt.loge$default(r2, r4, r3, r4)
        L98:
            r9.printStackTrace()
            com.join.kotlin.base.net.ExceptionHandle r2 = com.join.kotlin.base.net.ExceptionHandle.INSTANCE
            com.join.kotlin.base.net.AppException r9 = r2.handleException(r9)
            r0.invoke(r9)
        La4:
            kotlin.jvm.functions.Function1<com.join.kotlin.base.net.AppException, kotlin.Unit> r9 = r8.$error
            java.lang.Throwable r0 = kotlin.Result.m38exceptionOrNullimpl(r1)
            if (r0 == 0) goto Lc1
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto Lb5
            com.join.kotlin.base.ext.utils.LogExtKt.loge$default(r1, r4, r3, r4)
        Lb5:
            r0.printStackTrace()
            com.join.kotlin.base.net.ExceptionHandle r1 = com.join.kotlin.base.net.ExceptionHandle.INSTANCE
            com.join.kotlin.base.net.AppException r0 = r1.handleException(r0)
            r9.invoke(r0)
        Lc1:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.base.ext.BaseViewModelExtKt$request$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
