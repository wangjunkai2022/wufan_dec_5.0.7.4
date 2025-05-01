package kotlinx.coroutines.flow.internal;

import kotlin.BuilderInference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FlowCoroutine.kt */
/* loaded from: classes6.dex */
public final class FlowCoroutineKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes6.dex */
    public static final class a<R> implements kotlinx.coroutines.flow.e<R> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function3 f70979b;

        public a(Function3 function3) {
            this.f70979b = function3;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object a(@NotNull kotlinx.coroutines.flow.f<? super R> fVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object a5 = FlowCoroutineKt.a(new FlowCoroutineKt$scopedFlow$1$1(this.f70979b, fVar, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
        }
    }

    @Nullable
    public static final <R> Object a(@BuilderInference @NotNull Function2<? super q0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        Object coroutine_suspended;
        g gVar = new g(continuation.getContext(), continuation);
        Object f5 = s3.b.f(gVar, gVar, function2);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (f5 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return f5;
    }

    @NotNull
    public static final <R> kotlinx.coroutines.flow.e<R> b(@BuilderInference @NotNull Function3<? super q0, ? super kotlinx.coroutines.flow.f<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new a(function3);
    }
}
