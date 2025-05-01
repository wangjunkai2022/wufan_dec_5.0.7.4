package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes6.dex */
public final class SafeCollector_commonKt$unsafeFlow$1<T> implements kotlinx.coroutines.flow.e<T> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Function2<kotlinx.coroutines.flow.f<? super T>, Continuation<? super Unit>, Object> f70993b;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector_commonKt$unsafeFlow$1(Function2<? super kotlinx.coroutines.flow.f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f70993b = function2;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object invoke = this.f70993b.invoke(fVar, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : Unit.INSTANCE;
    }

    @Nullable
    public Object g(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull final Continuation<? super Unit> continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f70994b;

            /* renamed from: d  reason: collision with root package name */
            int f70996d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70994b = obj;
                this.f70996d |= Integer.MIN_VALUE;
                return SafeCollector_commonKt$unsafeFlow$1.this.a(null, this);
            }
        };
        InlineMarker.mark(5);
        this.f70993b.invoke(fVar, continuation);
        return Unit.INSTANCE;
    }
}
