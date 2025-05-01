package com.join.kotlin.ui.cloudarchive;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModGameCloudViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle$copyArchive$1", f = "ModGameCloudViewModle.kt", i = {}, l = {717}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ModGameCloudViewModle$copyArchive$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $func;
    final /* synthetic */ Ref.ObjectRef<String> $newArchivePath;
    final /* synthetic */ String $oldArchivePath;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModGameCloudViewModle$copyArchive$1(Function1<? super Boolean, Unit> function1, String str, Ref.ObjectRef<String> objectRef, Continuation<? super ModGameCloudViewModle$copyArchive$1> continuation) {
        super(2, continuation);
        this.$func = function1;
        this.$oldArchivePath = str;
        this.$newArchivePath = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ModGameCloudViewModle$copyArchive$1(this.$func, this.$oldArchivePath, this.$newArchivePath, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((ModGameCloudViewModle$copyArchive$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        w0 b5;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            b5 = kotlinx.coroutines.k.b(s1.f71252b, d1.c(), null, new ModGameCloudViewModle$copyArchive$1$result$1(this.$oldArchivePath, this.$newArchivePath, null), 2, null);
            this.label = 1;
            obj = b5.t(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        this.$func.invoke(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
