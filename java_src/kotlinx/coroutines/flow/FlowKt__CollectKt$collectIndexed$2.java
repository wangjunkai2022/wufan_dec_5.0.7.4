package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Collect.kt */
/* loaded from: classes6.dex */
public final class FlowKt__CollectKt$collectIndexed$2<T> implements f<T> {

    /* renamed from: b  reason: collision with root package name */
    private int f70226b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Function3<Integer, T, Continuation<? super Unit>, Object> f70227c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        this.f70227c = function3;
    }

    @Nullable
    public Object a(T t4, @NotNull final Continuation<? super Unit> continuation) {
        InlineMarker.mark(4);
        new ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f70228b;

            /* renamed from: d  reason: collision with root package name */
            int f70230d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70228b = obj;
                this.f70230d |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collectIndexed$2.this.emit(null, this);
            }
        };
        InlineMarker.mark(5);
        Function3<Integer, T, Continuation<? super Unit>, Object> function3 = this.f70227c;
        int i4 = this.f70226b;
        this.f70226b = i4 + 1;
        if (i4 >= 0) {
            function3.invoke(Integer.valueOf(i4), t4, continuation);
            return Unit.INSTANCE;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t4, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Function3<Integer, T, Continuation<? super Unit>, Object> function3 = this.f70227c;
        int i4 = this.f70226b;
        this.f70226b = i4 + 1;
        if (i4 >= 0) {
            Object invoke = function3.invoke(Boxing.boxInt(i4), t4, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return invoke == coroutine_suspended ? invoke : Unit.INSTANCE;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
}
