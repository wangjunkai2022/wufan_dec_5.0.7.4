package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Job.kt */
/* loaded from: classes.dex */
public interface z1 extends CoroutineContext.Element {
    @NotNull

    /* renamed from: g1  reason: collision with root package name */
    public static final b f71466g1 = b.f71467b;

    /* compiled from: Job.kt */
    /* loaded from: classes.dex */
    public static final class a {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(z1 z1Var) {
            z1Var.b(null);
        }

        public static /* synthetic */ void b(z1 z1Var, CancellationException cancellationException, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i4 & 1) != 0) {
                cancellationException = null;
            }
            z1Var.b(cancellationException);
        }

        public static /* synthetic */ boolean c(z1 z1Var, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return z1Var.a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R d(@NotNull z1 z1Var, R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(z1Var, r4, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E e(@NotNull z1 z1Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(z1Var, key);
        }

        public static /* synthetic */ g1 f(z1 z1Var, boolean z4, boolean z5, Function1 function1, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    z4 = false;
                }
                if ((i4 & 2) != 0) {
                    z5 = true;
                }
                return z1Var.p(z4, z5, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @NotNull
        public static CoroutineContext g(@NotNull z1 z1Var, @NotNull CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(z1Var, key);
        }

        @NotNull
        public static CoroutineContext h(@NotNull z1 z1Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(z1Var, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static z1 i(@NotNull z1 z1Var, @NotNull z1 z1Var2) {
            return z1Var2;
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: classes6.dex */
    public static final class b implements CoroutineContext.Key<z1> {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ b f71467b = new b();

        private b() {
        }
    }

    @Nullable
    Object K(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    kotlinx.coroutines.selects.c T();

    @InternalCoroutinesApi
    @NotNull
    v X(@NotNull x xVar);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th);

    void b(@Nullable CancellationException cancellationException);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @NotNull
    Sequence<z1> j();

    @InternalCoroutinesApi
    @NotNull
    g1 p(boolean z4, boolean z5, @NotNull Function1<? super Throwable, Unit> function1);

    @InternalCoroutinesApi
    @NotNull
    CancellationException r();

    boolean start();

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    z1 y(@NotNull z1 z1Var);

    @NotNull
    g1 z(@NotNull Function1<? super Throwable, Unit> function1);
}
