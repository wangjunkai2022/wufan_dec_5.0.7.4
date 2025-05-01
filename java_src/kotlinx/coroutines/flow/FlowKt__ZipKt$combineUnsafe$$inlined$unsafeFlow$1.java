package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes6.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1<R> implements e<R> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e[] f70751b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Function2 f70752c;

    public FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(e[] eVarArr, Function2 function2) {
        this.f70751b = eVarArr;
        this.f70752c = function2;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super R> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        e[] eVarArr = this.f70751b;
        Function0 a5 = FlowKt__ZipKt.a();
        Intrinsics.needClassReification();
        Object a6 = CombineKt.a(fVar, eVarArr, a5, new FlowKt__ZipKt$combineUnsafe$1$1(this.f70752c, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a6 == coroutine_suspended ? a6 : Unit.INSTANCE;
    }

    @Nullable
    public Object g(@NotNull f fVar, @NotNull Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.1

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f70753b;

            /* renamed from: c  reason: collision with root package name */
            int f70754c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70753b = obj;
                this.f70754c |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.this.a(null, this);
            }
        };
        InlineMarker.mark(5);
        e[] eVarArr = this.f70751b;
        Function0 a5 = FlowKt__ZipKt.a();
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.f70752c, null);
        InlineMarker.mark(0);
        CombineKt.a(fVar, eVarArr, a5, flowKt__ZipKt$combineUnsafe$1$1, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
