package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: Merge.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1<R, T> extends SuspendLambda implements Function3<f<? super R>, T, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70479b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70480c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70481d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Function2 f70482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.f70482e = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull f<? super R> fVar, T t4, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.f70482e, continuation);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f70480c = fVar;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f70481d = t4;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        f fVar;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70479b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            fVar = (f) this.f70480c;
            Object obj2 = this.f70481d;
            Function2 function2 = this.f70482e;
            this.f70480c = fVar;
            this.f70479b = 1;
            obj = function2.invoke(obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 != 1) {
            if (i4 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            fVar = (f) this.f70480c;
            ResultKt.throwOnFailure(obj);
        }
        this.f70480c = null;
        this.f70479b = 2;
        if (g.m0(fVar, (e) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
