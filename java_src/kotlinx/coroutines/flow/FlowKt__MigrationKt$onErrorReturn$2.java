package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Migration.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__MigrationKt$onErrorReturn$2<T> extends SuspendLambda implements Function3<f<? super T>, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70488b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70489c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70490d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Function1<Throwable, Boolean> f70491e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ T f70492f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MigrationKt$onErrorReturn$2(Function1<? super Throwable, Boolean> function1, T t4, Continuation<? super FlowKt__MigrationKt$onErrorReturn$2> continuation) {
        super(3, continuation);
        this.f70491e = function1;
        this.f70492f = t4;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull f<? super T> fVar, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.f70491e, this.f70492f, continuation);
        flowKt__MigrationKt$onErrorReturn$2.f70489c = fVar;
        flowKt__MigrationKt$onErrorReturn$2.f70490d = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70488b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar = (f) this.f70489c;
            Throwable th = (Throwable) this.f70490d;
            if (this.f70491e.invoke(th).booleanValue()) {
                T t4 = this.f70492f;
                this.f70489c = null;
                this.f70488b = 1;
                if (fVar.emit(t4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw th;
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
