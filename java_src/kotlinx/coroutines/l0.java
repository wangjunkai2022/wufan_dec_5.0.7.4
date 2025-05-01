package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes6.dex */
public interface l0 extends CoroutineContext.Element {
    @NotNull

    /* renamed from: f1  reason: collision with root package name */
    public static final b f71199f1 = b.f71200b;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static <R> R a(@NotNull l0 l0Var, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(l0Var, r4, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E b(@NotNull l0 l0Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(l0Var, key);
        }

        @NotNull
        public static CoroutineContext c(@NotNull l0 l0Var, @NotNull CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(l0Var, key);
        }

        @NotNull
        public static CoroutineContext d(@NotNull l0 l0Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(l0Var, coroutineContext);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes6.dex */
    public static final class b implements CoroutineContext.Key<l0> {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ b f71200b = new b();

        private b() {
        }
    }

    void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th);
}
