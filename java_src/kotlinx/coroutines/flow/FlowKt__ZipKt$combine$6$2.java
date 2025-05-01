package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: Zip.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__ZipKt$combine$6$2<R, T> extends SuspendLambda implements Function3<f<? super R>, T[], Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70769b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70770c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70771d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f70772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$6$2(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super FlowKt__ZipKt$combine$6$2> continuation) {
        super(3, continuation);
        this.f70772e = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull f<? super R> fVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.f70772e, continuation);
        flowKt__ZipKt$combine$6$2.f70770c = fVar;
        flowKt__ZipKt$combine$6$2.f70771d = tArr;
        return flowKt__ZipKt$combine$6$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        f fVar;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70769b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar2 = (f) this.f70770c;
            Function2<T[], Continuation<? super R>, Object> function2 = this.f70772e;
            this.f70770c = fVar2;
            this.f70769b = 1;
            obj = function2.invoke((Object[]) this.f70771d, this);
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
            fVar = (f) this.f70770c;
        }
        this.f70770c = null;
        this.f70769b = 2;
        if (fVar.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        Object invoke = this.f70772e.invoke((Object[]) this.f70771d, this);
        InlineMarker.mark(0);
        ((f) this.f70770c).emit(invoke, this);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
