package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: Merge.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {Opcodes.OR_INT_LIT16, Opcodes.OR_INT_LIT16}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__MergeKt$mapLatest$1<R, T> extends SuspendLambda implements Function3<f<? super R>, T, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70475b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70476c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70477d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Function2<T, Continuation<? super R>, Object> f70478e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super FlowKt__MergeKt$mapLatest$1> continuation) {
        super(3, continuation);
        this.f70478e = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull f<? super R> fVar, T t4, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.f70478e, continuation);
        flowKt__MergeKt$mapLatest$1.f70476c = fVar;
        flowKt__MergeKt$mapLatest$1.f70477d = t4;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        f fVar;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70475b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar2 = (f) this.f70476c;
            Object obj2 = this.f70477d;
            this.f70476c = fVar2;
            this.f70475b = 1;
            obj = this.f70478e.invoke(obj2, this);
            fVar = fVar2;
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
            ResultKt.throwOnFailure(obj);
            fVar = (f) this.f70476c;
        }
        this.f70476c = null;
        this.f70475b = 2;
        if (fVar.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
