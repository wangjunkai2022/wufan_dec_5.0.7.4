package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes6.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements e<R> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e[] f70701b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Function2 f70702c;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(e[] eVarArr, Function2 function2) {
        this.f70701b = eVarArr;
        this.f70702c = function2;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super R> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        e[] eVarArr = this.f70701b;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.f70701b);
        Intrinsics.needClassReification();
        Object a5 = CombineKt.a(fVar, eVarArr, flowKt__ZipKt$combine$5$1, new FlowKt__ZipKt$combine$5$2(this.f70702c, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @Nullable
    public Object g(@NotNull f fVar, @NotNull Continuation continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f70703b;

            /* renamed from: c  reason: collision with root package name */
            int f70704c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70703b = obj;
                this.f70704c |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.a(null, this);
            }
        };
        InlineMarker.mark(5);
        e[] eVarArr = this.f70701b;
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.f70701b);
        Intrinsics.needClassReification();
        FlowKt__ZipKt$combine$5$2 flowKt__ZipKt$combine$5$2 = new FlowKt__ZipKt$combine$5$2(this.f70702c, null);
        InlineMarker.mark(0);
        CombineKt.a(fVar, eVarArr, flowKt__ZipKt$combine$5$1, flowKt__ZipKt$combine$5$2, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
