package kotlinx.coroutines;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Interruptible.kt */
@DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InterruptibleKt$runInterruptible$2<T> extends SuspendLambda implements Function2<q0, Continuation<? super T>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f69617b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f69618c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Function0<T> f69619d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterruptibleKt$runInterruptible$2(Function0<? extends T> function0, Continuation<? super InterruptibleKt$runInterruptible$2> continuation) {
        super(2, continuation);
        this.f69619d = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.f69619d, continuation);
        interruptibleKt$runInterruptible$2.f69618c = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Object obj) {
        return invoke(q0Var, (Continuation) ((Continuation) obj));
    }

    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super T> continuation) {
        return ((InterruptibleKt$runInterruptible$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object d5;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f69617b == 0) {
            ResultKt.throwOnFailure(obj);
            d5 = InterruptibleKt.d(((q0) this.f69618c).getCoroutineContext(), this.f69619d);
            return d5;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
