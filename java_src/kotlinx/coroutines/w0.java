package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Deferred.kt */
/* loaded from: classes6.dex */
public interface w0<T> extends z1 {

    /* compiled from: Deferred.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static <T, R> R b(@NotNull w0<? extends T> w0Var, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) z1.a.d(w0Var, r4, function2);
        }

        @Nullable
        public static <T, E extends CoroutineContext.Element> E c(@NotNull w0<? extends T> w0Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) z1.a.e(w0Var, key);
        }

        @NotNull
        public static <T> CoroutineContext d(@NotNull w0<? extends T> w0Var, @NotNull CoroutineContext.Key<?> key) {
            return z1.a.g(w0Var, key);
        }

        @NotNull
        public static <T> CoroutineContext e(@NotNull w0<? extends T> w0Var, @NotNull CoroutineContext coroutineContext) {
            return z1.a.h(w0Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> z1 f(@NotNull w0<? extends T> w0Var, @NotNull z1 z1Var) {
            return z1.a.i(w0Var, z1Var);
        }
    }

    @NotNull
    kotlinx.coroutines.selects.d<T> J();

    @ExperimentalCoroutinesApi
    T g();

    @ExperimentalCoroutinesApi
    @Nullable
    Throwable l();

    @Nullable
    Object t(@NotNull Continuation<? super T> continuation);
}
