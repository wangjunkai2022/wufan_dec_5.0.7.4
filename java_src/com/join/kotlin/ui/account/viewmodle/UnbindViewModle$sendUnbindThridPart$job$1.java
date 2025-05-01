package com.join.kotlin.ui.account.viewmodle;

import android.content.Context;
import com.join.kotlin.ui.account.modle.UnThirdPartRequest;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.listener.a;
import com.psk.kotlin.ext.CommonExtKt;
import com.wufan.user.service.protobuf.n0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UnbindViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendUnbindThridPart$job$1", f = "UnbindViewModle.kt", i = {0}, l = {143}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nUnbindViewModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnbindViewModle.kt\ncom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendUnbindThridPart$job$1\n+ 2 ApiCall.kt\ncom/join/kotlin/http/protocol/ApiCallKt\n*L\n1#1,142:1\n12#2:143\n*S KotlinDebug\n*F\n+ 1 UnbindViewModle.kt\ncom/join/kotlin/ui/account/viewmodle/UnbindViewModle$sendUnbindThridPart$job$1\n*L\n65#1:143\n*E\n"})
/* loaded from: classes3.dex */
final class UnbindViewModle$sendUnbindThridPart$job$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<UnThirdPartRequest> $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ UnbindViewModle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnbindViewModle.kt */
    @DebugMetadata(c = "com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendUnbindThridPart$job$1$1", f = "UnbindViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendUnbindThridPart$job$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.ObjectRef<ResponseModel<Boolean>> $result;
        int label;
        final /* synthetic */ UnbindViewModle this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<ResponseModel<Boolean>> objectRef, Context context, UnbindViewModle unbindViewModle, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = objectRef;
            this.$context = context;
            this.this$0 = unbindViewModle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$result, this.$context, this.this$0, continuation);
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
                if (this.$result.element.getError() == 0) {
                    Boolean data = this.$result.element.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "result.data");
                    if (data.booleanValue()) {
                        n0 accountData = AccountUtil_.getInstance_(this.$context).getAccountData();
                        Intrinsics.checkNotNullExpressionValue(accountData, "getInstance_(context).accountData");
                        n0.b builder = accountData.toBuilder();
                        Intrinsics.checkNotNullExpressionValue(builder, "accountBean.toBuilder()");
                        n0.b bVar = builder;
                        String platform = this.this$0.getPlatform();
                        int hashCode = platform.hashCode();
                        if (hashCode != -1429950110) {
                            if (hashCode != -189985820) {
                                if (hashCode == 1477838041 && platform.equals("WB_OPENID")) {
                                    bVar.S3(0);
                                }
                            } else if (platform.equals("QQ_OPENID")) {
                                bVar.R3(0);
                            }
                        } else if (platform.equals("WEIXIN_OPENID")) {
                            bVar.T3(0);
                        }
                        bVar.build();
                        a.b().c();
                        CommonExtKt.toast(this.$context, "解绑成功");
                        this.this$0.getCallStatus().setValue(Boxing.boxInt(1));
                    } else {
                        Context context = this.$context;
                        String msg = this.$result.element.getMsg();
                        if (msg == null) {
                            msg = this.$result.element.getMessage();
                        }
                        CommonExtKt.toast(context, msg);
                    }
                } else {
                    Context context2 = this.$context;
                    String msg2 = this.$result.element.getMsg();
                    if (msg2 == null) {
                        msg2 = this.$result.element.getMessage();
                    }
                    CommonExtKt.toast(context2, msg2);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnbindViewModle$sendUnbindThridPart$job$1(Ref.ObjectRef<UnThirdPartRequest> objectRef, Context context, UnbindViewModle unbindViewModle, Continuation<? super UnbindViewModle$sendUnbindThridPart$job$1> continuation) {
        super(2, continuation);
        this.$request = objectRef;
        this.$context = context;
        this.this$0 = unbindViewModle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UnbindViewModle$sendUnbindThridPart$job$1(this.$request, this.$context, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((UnbindViewModle$sendUnbindThridPart$job$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Ref.ObjectRef objectRef;
        T t4;
        Ref.ObjectRef objectRef2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Ref.ObjectRef<UnThirdPartRequest> objectRef4 = this.$request;
            CoroutineDispatcher c5 = d1.c();
            UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1 unbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1 = new UnbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1(null, objectRef4);
            this.L$0 = objectRef3;
            this.L$1 = objectRef3;
            this.label = 1;
            Object h4 = i.h(c5, unbindViewModle$sendUnbindThridPart$job$1$invokeSuspend$$inlined$apiCall$1, this);
            if (h4 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef3;
            t4 = h4;
            objectRef2 = objectRef;
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            objectRef = (Ref.ObjectRef) this.L$1;
            objectRef2 = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            t4 = obj;
        }
        objectRef.element = t4;
        k.f(s1.f71252b, d1.e(), null, new AnonymousClass1(objectRef2, this.$context, this.this$0, null), 2, null);
        return Unit.INSTANCE;
    }
}
