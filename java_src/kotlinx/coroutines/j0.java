package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ThreadContextElement.kt */
@DelicateCoroutinesApi
@ExperimentalCoroutinesApi
/* loaded from: classes6.dex */
public interface j0<S> extends b3<S> {

    /* compiled from: ThreadContextElement.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static <S, R> R a(@NotNull j0<S> j0Var, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) b3.a.a(j0Var, r4, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull j0<S> j0Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) b3.a.b(j0Var, key);
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull j0<S> j0Var, @NotNull CoroutineContext.Key<?> key) {
            return b3.a.c(j0Var, key);
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull j0<S> j0Var, @NotNull CoroutineContext coroutineContext) {
            return b3.a.d(j0Var, coroutineContext);
        }
    }

    @NotNull
    j0<S> B();

    @NotNull
    CoroutineContext h(@NotNull CoroutineContext.Element element);
}
