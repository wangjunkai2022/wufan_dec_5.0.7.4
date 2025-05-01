package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Job.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@InternalCoroutinesApi
/* loaded from: classes.dex */
public interface x extends z1 {

    /* compiled from: Job.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R b(@NotNull x xVar, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) z1.a.d(xVar, r4, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull x xVar, @NotNull CoroutineContext.Key<E> key) {
            return (E) z1.a.e(xVar, key);
        }

        @NotNull
        public static CoroutineContext d(@NotNull x xVar, @NotNull CoroutineContext.Key<?> key) {
            return z1.a.g(xVar, key);
        }

        @NotNull
        public static CoroutineContext e(@NotNull x xVar, @NotNull CoroutineContext coroutineContext) {
            return z1.a.h(xVar, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static z1 f(@NotNull x xVar, @NotNull z1 z1Var) {
            return z1.a.i(xVar, z1Var);
        }
    }

    @InternalCoroutinesApi
    void v(@NotNull o2 o2Var);
}
