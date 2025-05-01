package com.join.kotlin.ui.cloudarchive;

import com.join.mgps.Util.g0;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModGameCloudViewModle.kt */
@DebugMetadata(c = "com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle$copyArchive$1$result$1", f = "ModGameCloudViewModle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ModGameCloudViewModle$copyArchive$1$result$1 extends SuspendLambda implements Function2<q0, Continuation<? super String>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $newArchivePath;
    final /* synthetic */ String $oldArchivePath;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModGameCloudViewModle$copyArchive$1$result$1(String str, Ref.ObjectRef<String> objectRef, Continuation<? super ModGameCloudViewModle$copyArchive$1$result$1> continuation) {
        super(2, continuation);
        this.$oldArchivePath = str;
        this.$newArchivePath = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ModGameCloudViewModle$copyArchive$1$result$1(this.$oldArchivePath, this.$newArchivePath, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super String> continuation) {
        return ((ModGameCloudViewModle$copyArchive$1$result$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                g0.a(this.$oldArchivePath, this.$newArchivePath.element);
                return "";
            } catch (IOException e5) {
                e5.printStackTrace();
                return "";
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
