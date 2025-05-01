package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletableJob.kt */
/* loaded from: classes6.dex */
public interface b0 extends z1 {

    /* compiled from: CompletableJob.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R b(@NotNull b0 b0Var, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) z1.a.d(b0Var, r4, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull b0 b0Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) z1.a.e(b0Var, key);
        }

        @NotNull
        public static CoroutineContext d(@NotNull b0 b0Var, @NotNull CoroutineContext.Key<?> key) {
            return z1.a.g(b0Var, key);
        }

        @NotNull
        public static CoroutineContext e(@NotNull b0 b0Var, @NotNull CoroutineContext coroutineContext) {
            return z1.a.h(b0Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static z1 f(@NotNull b0 b0Var, @NotNull z1 z1Var) {
            return z1.a.i(b0Var, z1Var);
        }
    }

    boolean complete();

    boolean d(@NotNull Throwable th);
}
