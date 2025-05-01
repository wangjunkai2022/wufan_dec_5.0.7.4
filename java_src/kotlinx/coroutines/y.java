package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletableDeferred.kt */
/* loaded from: classes6.dex */
public interface y<T> extends w0<T> {

    /* compiled from: CompletableDeferred.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static <T, R> R b(@NotNull y<T> yVar, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) w0.a.b(yVar, r4, function2);
        }

        @Nullable
        public static <T, E extends CoroutineContext.Element> E c(@NotNull y<T> yVar, @NotNull CoroutineContext.Key<E> key) {
            return (E) w0.a.c(yVar, key);
        }

        @NotNull
        public static <T> CoroutineContext d(@NotNull y<T> yVar, @NotNull CoroutineContext.Key<?> key) {
            return w0.a.d(yVar, key);
        }

        @NotNull
        public static <T> CoroutineContext e(@NotNull y<T> yVar, @NotNull CoroutineContext coroutineContext) {
            return w0.a.e(yVar, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> z1 f(@NotNull y<T> yVar, @NotNull z1 z1Var) {
            return w0.a.f(yVar, z1Var);
        }
    }

    boolean D(T t4);

    boolean d(@NotNull Throwable th);
}
