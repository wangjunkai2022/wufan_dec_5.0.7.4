package kotlinx.coroutines.flow;

import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
/* compiled from: Delay.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__DelayKt {
    /* JADX WARN: Multi-variable type inference failed */
    @FlowPreview
    @NotNull
    public static final <T> e<T> a(@NotNull e<? extends T> eVar, final long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? eVar : e(eVar, new Function1<T, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* renamed from: a */
                public final Long invoke(T t4) {
                    return Long.valueOf(j4);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @FlowPreview
    @OverloadResolutionByLambdaReturnType
    @NotNull
    public static final <T> e<T> b(@NotNull e<? extends T> eVar, @NotNull Function1<? super T, Long> function1) {
        return e(eVar, function1);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> c(@NotNull e<? extends T> eVar, long j4) {
        return g.a0(eVar, DelayKt.e(j4));
    }

    @FlowPreview
    @JvmName(name = "debounceDuration")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T> e<T> d(@NotNull e<? extends T> eVar, @NotNull final Function1<? super T, Duration> function1) {
        return e(eVar, new Function1<T, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a */
            public final Long invoke(T t4) {
                return Long.valueOf(DelayKt.e(function1.invoke(t4).m1427unboximpl()));
            }
        });
    }

    private static final <T> e<T> e(e<? extends T> eVar, Function1<? super T, Long> function1) {
        return FlowCoroutineKt.b(new FlowKt__DelayKt$debounceInternal$1(function1, eVar, null));
    }

    @NotNull
    public static final ReceiveChannel<Unit> f(@NotNull q0 q0Var, long j4, long j5) {
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j4 + " ms").toString());
        }
        if (j5 >= 0) {
            return ProduceKt.f(q0Var, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j5, j4, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j5 + " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel g(q0 q0Var, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = j4;
        }
        return g.x0(q0Var, j4, j5);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> h(@NotNull e<? extends T> eVar, long j4) {
        if (j4 > 0) {
            return FlowCoroutineKt.b(new FlowKt__DelayKt$sample$2(j4, eVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> i(@NotNull e<? extends T> eVar, long j4) {
        return g.A1(eVar, DelayKt.e(j4));
    }
}
