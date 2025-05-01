package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ThreadContext.kt */
/* loaded from: classes6.dex */
public final class ThreadContextKt {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final o0 f71089a = new o0("NO_THREAD_ELEMENTS");
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final Function2<Object, CoroutineContext.Element, Object> f71090b = new Function2<Object, CoroutineContext.Element, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final Object invoke(@Nullable Object obj, @NotNull CoroutineContext.Element element) {
            if (element instanceof b3) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? element : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    };
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final Function2<b3<?>, CoroutineContext.Element, b3<?>> f71091c = new Function2<b3<?>, CoroutineContext.Element, b3<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final b3<?> invoke(@Nullable b3<?> b3Var, @NotNull CoroutineContext.Element element) {
            if (b3Var != null) {
                return b3Var;
            }
            if (element instanceof b3) {
                return (b3) element;
            }
            return null;
        }
    };
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final Function2<y0, CoroutineContext.Element, y0> f71092d = new Function2<y0, CoroutineContext.Element, y0>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final y0 invoke(@NotNull y0 y0Var, @NotNull CoroutineContext.Element element) {
            if (element instanceof b3) {
                b3<?> b3Var = (b3) element;
                y0Var.a(b3Var, b3Var.V(y0Var.f71158a));
            }
            return y0Var;
        }
    };

    public static final void a(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f71089a) {
            return;
        }
        if (obj instanceof y0) {
            ((y0) obj).b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f71091c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((b3) fold).C(coroutineContext, obj);
    }

    @NotNull
    public static final Object b(@NotNull CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f71090b);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    @Nullable
    public static final Object c(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f71089a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new y0(coroutineContext, ((Number) obj).intValue()), f71092d);
        }
        return ((b3) obj).V(coroutineContext);
    }
}
