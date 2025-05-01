package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import com.join.kotlin.ui.cloudarchive.data.ArchiveArgs;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ArchiveDownEvent;
import com.join.mgps.Util.d0;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.wufan.user.service.protobuf.n0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModUploadArchiveViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1", f = "ModUploadArchiveViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class ModUploadArchiveViewModle$updateArchiveMessage$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<n0> $accountBean;
    final /* synthetic */ Ref.ObjectRef<ArchiveArgs> $archiveArgs;
    final /* synthetic */ Ref.ObjectRef<ArchiveData> $archiveData;
    final /* synthetic */ Ref.ObjectRef<String> $chnalNmber;
    final /* synthetic */ Context $context;
    final /* synthetic */ RequestModel<ArchiveArgs> $requestModel;
    int label;
    final /* synthetic */ ModUploadArchiveViewModle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModUploadArchiveViewModle.kt */
    @DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1$1", f = "ModUploadArchiveViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<ArchiveData> $archiveData;
        final /* synthetic */ RequestModel<ArchiveArgs> $requestModel;
        int label;
        final /* synthetic */ ModUploadArchiveViewModle this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RequestModel<ArchiveArgs> requestModel, ModUploadArchiveViewModle modUploadArchiveViewModle, Ref.ObjectRef<ArchiveData> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$requestModel = requestModel;
            this.this$0 = modUploadArchiveViewModle;
            this.$archiveData = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$requestModel, this.this$0, this.$archiveData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Call<ResponseModel> l12 = com.join.mgps.rpc.impl.i.D0().B0().l1(this.$requestModel.makeSign());
                final ModUploadArchiveViewModle modUploadArchiveViewModle = this.this$0;
                final Ref.ObjectRef<ArchiveData> objectRef = this.$archiveData;
                l12.enqueue(new Callback<ResponseModel<?>>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle.updateArchiveMessage.1.1.1
                    @Override // retrofit2.Callback
                    public void onFailure(@NotNull Call<ResponseModel<?>> call, @NotNull Throwable t4) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(t4, "t");
                        ResponseModel<?> responseModel = new ResponseModel<>();
                        responseModel.setCode(500);
                        responseModel.setMessage("异常");
                        ModUploadArchiveViewModle.this.getResponseReult().postValue(responseModel);
                    }

                    @Override // retrofit2.Callback
                    public void onResponse(@NotNull Call<ResponseModel<?>> call, @NotNull Response<ResponseModel<?>> response) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(response, "response");
                        ResponseModel<?> body = response.body();
                        if (body != null) {
                            ModUploadArchiveViewModle.this.getResponseReult().postValue(body);
                            if (body.getCode() == 200) {
                                d0.a().c(new ArchiveDownEvent(10, objectRef.element));
                                return;
                            }
                            return;
                        }
                        ResponseModel<?> responseModel = new ResponseModel<>();
                        responseModel.setCode(500);
                        responseModel.setMessage("异常");
                        ModUploadArchiveViewModle.this.getResponseReult().postValue(responseModel);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModUploadArchiveViewModle$updateArchiveMessage$1(ModUploadArchiveViewModle modUploadArchiveViewModle, Context context, Ref.ObjectRef<n0> objectRef, RequestModel<ArchiveArgs> requestModel, Ref.ObjectRef<String> objectRef2, Ref.ObjectRef<ArchiveArgs> objectRef3, Ref.ObjectRef<ArchiveData> objectRef4, Continuation<? super ModUploadArchiveViewModle$updateArchiveMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = modUploadArchiveViewModle;
        this.$context = context;
        this.$accountBean = objectRef;
        this.$requestModel = requestModel;
        this.$chnalNmber = objectRef2;
        this.$archiveArgs = objectRef3;
        this.$archiveData = objectRef4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ModUploadArchiveViewModle$updateArchiveMessage$1(this.this$0, this.$context, this.$accountBean, this.$requestModel, this.$chnalNmber, this.$archiveArgs, this.$archiveData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((ModUploadArchiveViewModle$updateArchiveMessage$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r12.label
            if (r0 != 0) goto Lcb
            kotlin.ResultKt.throwOnFailure(r13)
            com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle r13 = r12.this$0
            androidx.lifecycle.MutableLiveData r13 = r13.getImagepath()
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L26
            r3 = 2
            java.lang.String r4 = "http"
            boolean r13 = kotlin.text.StringsKt.startsWith$default(r13, r4, r2, r3, r0)
            if (r13 != r1) goto L26
            r13 = 1
            goto L27
        L26:
            r13 = 0
        L27:
            if (r13 != 0) goto Lb1
            com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle r13 = r12.this$0
            android.content.Context r3 = r12.$context
            java.lang.String r5 = com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle.access$compressImage(r13, r3)
            com.join.android.app.common.http.h r4 = com.join.android.app.common.http.h.b()
            kotlin.jvm.internal.Ref$ObjectRef<com.wufan.user.service.protobuf.n0> r13 = r12.$accountBean
            T r13 = r13.element
            com.wufan.user.service.protobuf.n0 r13 = (com.wufan.user.service.protobuf.n0) r13
            int r13 = r13.getUid()
            java.lang.String r6 = java.lang.String.valueOf(r13)
            kotlin.jvm.internal.Ref$ObjectRef<com.wufan.user.service.protobuf.n0> r13 = r12.$accountBean
            T r13 = r13.element
            com.wufan.user.service.protobuf.n0 r13 = (com.wufan.user.service.protobuf.n0) r13
            java.lang.String r7 = r13.getToken()
            com.join.mgps.dto.RequestModel<com.join.kotlin.ui.cloudarchive.data.ArchiveArgs> r8 = r12.$requestModel
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r13 = r12.$chnalNmber
            T r13 = r13.element
            r9 = r13
            java.lang.String r9 = (java.lang.String) r9
            java.io.File r13 = new java.io.File
            r13.<init>(r5)
            java.lang.String r10 = r13.getName()
            com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1$json$1 r11 = new com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1$json$1
            r11.<init>()
            java.lang.String r13 = r4.f(r5, r6, r7, r8, r9, r10, r11)
            com.google.gson.JsonElement r13 = com.google.gson.JsonParser.parseString(r13)
            com.google.gson.JsonObject r13 = r13.getAsJsonObject()
            if (r13 == 0) goto L83
            java.lang.String r3 = "code"
            com.google.gson.JsonElement r3 = r13.get(r3)
            if (r3 == 0) goto L83
            int r3 = r3.getAsInt()
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L83
            goto L84
        L83:
            r1 = 0
        L84:
            if (r1 == 0) goto Lb1
            java.lang.String r1 = "data"
            com.google.gson.JsonElement r13 = r13.get(r1)
            com.google.gson.JsonArray r13 = r13.getAsJsonArray()
            int r1 = r13.size()
            if (r1 <= 0) goto Lb1
            com.google.gson.JsonElement r13 = r13.get(r2)
            com.google.gson.JsonObject r13 = r13.getAsJsonObject()
            java.lang.String r1 = "remoteUrl"
            com.google.gson.JsonElement r13 = r13.get(r1)
            java.lang.String r13 = r13.getAsString()
            kotlin.jvm.internal.Ref$ObjectRef<com.join.kotlin.ui.cloudarchive.data.ArchiveArgs> r1 = r12.$archiveArgs
            T r1 = r1.element
            com.join.kotlin.ui.cloudarchive.data.ArchiveArgs r1 = (com.join.kotlin.ui.cloudarchive.data.ArchiveArgs) r1
            r1.setCoverLocation(r13)
        Lb1:
            kotlinx.coroutines.s1 r2 = kotlinx.coroutines.s1.f71252b
            kotlinx.coroutines.j2 r3 = kotlinx.coroutines.d1.e()
            r4 = 0
            com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1$1 r5 = new com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1$1
            com.join.mgps.dto.RequestModel<com.join.kotlin.ui.cloudarchive.data.ArchiveArgs> r13 = r12.$requestModel
            com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle r1 = r12.this$0
            kotlin.jvm.internal.Ref$ObjectRef<com.join.kotlin.ui.cloudarchive.data.ArchiveData> r6 = r12.$archiveData
            r5.<init>(r13, r1, r6, r0)
            r6 = 2
            r7 = 0
            kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        Lcb:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$updateArchiveMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
