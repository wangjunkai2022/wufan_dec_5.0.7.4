package com.join.kotlin.ui.account.viewmodle;

import android.content.Context;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.MMSRequesBean;
import com.join.mgps.rpc.impl.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UnbindViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendsmsCode$job$1", f = "UnbindViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnbindViewModle$sendsmsCode$job$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MMSRequesBean $requestbean;
    int label;
    final /* synthetic */ UnbindViewModle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnbindViewModle.kt */
    @DebugMetadata(c = "com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendsmsCode$job$1$1", f = "UnbindViewModle.kt", i = {0, 0}, l = {125}, m = "invokeSuspend", n = {"$this$launch", "index"}, s = {"L$0", "I$0"})
    /* renamed from: com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendsmsCode$job$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AccountResultMainBean<AccountTokenSuccess> $result;
        int I$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UnbindViewModle this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: UnbindViewModle.kt */
        @DebugMetadata(c = "com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendsmsCode$job$1$1$1", f = "UnbindViewModle.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendsmsCode$job$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C03221 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int label;

            C03221(Continuation<? super C03221> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C03221(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C03221) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.b(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountResultMainBean<AccountTokenSuccess> accountResultMainBean, Context context, UnbindViewModle unbindViewModle, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = accountResultMainBean;
            this.$context = context;
            this.this$0 = unbindViewModle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, this.$context, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a2 -> B:24:0x00a5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.account.viewmodle.UnbindViewModle$sendsmsCode$job$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnbindViewModle$sendsmsCode$job$1(MMSRequesBean mMSRequesBean, UnbindViewModle unbindViewModle, Context context, Continuation<? super UnbindViewModle$sendsmsCode$job$1> continuation) {
        super(2, continuation);
        this.$requestbean = mMSRequesBean;
        this.this$0 = unbindViewModle;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UnbindViewModle$sendsmsCode$job$1(this.$requestbean, this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((UnbindViewModle$sendsmsCode$job$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AccountResultMainBean<AccountTokenSuccess> accountResultMainBean;
        z1 f5;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                accountResultMainBean = a.c0().i(this.$requestbean.getParams());
            } catch (Exception unused) {
                accountResultMainBean = new AccountResultMainBean<>(1, null);
            }
            z1 coluting = this.this$0.getColuting();
            if (coluting != null) {
                z1.a.b(coluting, null, 1, null);
            }
            UnbindViewModle unbindViewModle = this.this$0;
            f5 = k.f(s1.f71252b, d1.e(), null, new AnonymousClass1(accountResultMainBean, this.$context, this.this$0, null), 2, null);
            unbindViewModle.setColuting(f5);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
