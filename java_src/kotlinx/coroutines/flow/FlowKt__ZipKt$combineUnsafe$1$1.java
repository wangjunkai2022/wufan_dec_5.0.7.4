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
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__ZipKt$combineUnsafe$1$1<R, T> extends SuspendLambda implements Function3<f<? super R>, T[], Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70799b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70800c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70801d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f70802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineUnsafe$1$1(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super FlowKt__ZipKt$combineUnsafe$1$1> continuation) {
        super(3, continuation);
        this.f70802e = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull f<? super R> fVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.f70802e, continuation);
        flowKt__ZipKt$combineUnsafe$1$1.f70800c = fVar;
        flowKt__ZipKt$combineUnsafe$1$1.f70801d = tArr;
        return flowKt__ZipKt$combineUnsafe$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        f fVar;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70799b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar2 = (f) this.f70800c;
            Function2<T[], Continuation<? super R>, Object> function2 = this.f70802e;
            this.f70800c = fVar2;
            this.f70799b = 1;
            obj = function2.invoke((Object[]) this.f70801d, this);
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
            fVar = (f) this.f70800c;
        }
        this.f70800c = null;
        this.f70799b = 2;
        if (fVar.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        Object invoke = this.f70802e.invoke((Object[]) this.f70801d, this);
        InlineMarker.mark(0);
        ((f) this.f70800c).emit(invoke, this);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
