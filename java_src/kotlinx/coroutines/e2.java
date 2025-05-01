package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Job.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 {
    public static final boolean A(@NotNull CoroutineContext coroutineContext) {
        z1 z1Var = (z1) coroutineContext.get(z1.f71466g1);
        return z1Var != null && z1Var.isActive();
    }

    private static final Throwable B(Throwable th, z1 z1Var) {
        return th == null ? new JobCancellationException("Job was cancelled", null, z1Var) : th;
    }

    @NotNull
    public static final b0 a(@Nullable z1 z1Var) {
        return new b2(z1Var);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @JvmName(name = "Job")
    public static final /* synthetic */ z1 b(z1 z1Var) {
        return c2.a(z1Var);
    }

    public static /* synthetic */ b0 c(z1 z1Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z1Var = null;
        }
        return c2.a(z1Var);
    }

    public static /* synthetic */ z1 d(z1 z1Var, int i4, Object obj) {
        z1 b5;
        if ((i4 & 1) != 0) {
            z1Var = null;
        }
        b5 = b(z1Var);
        return b5;
    }

    public static final void f(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        z1 z1Var = (z1) coroutineContext.get(z1.f71466g1);
        if (z1Var == null) {
            return;
        }
        z1Var.b(cancellationException);
    }

    public static final void g(@NotNull z1 z1Var, @NotNull String str, @Nullable Throwable th) {
        z1Var.b(p1.a(str, th));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(CoroutineContext coroutineContext, Throwable th) {
        CoroutineContext.Element element = coroutineContext.get(z1.f71466g1);
        JobSupport jobSupport = element instanceof JobSupport ? (JobSupport) element : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.l0(B(th, jobSupport));
        return true;
    }

    public static /* synthetic */ void i(CoroutineContext coroutineContext, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        c2.f(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void j(z1 z1Var, String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        c2.g(z1Var, str, th);
    }

    public static /* synthetic */ boolean k(CoroutineContext coroutineContext, Throwable th, int i4, Object obj) {
        boolean h4;
        if ((i4 & 1) != 0) {
            th = null;
        }
        h4 = h(coroutineContext, th);
        return h4;
    }

    @Nullable
    public static final Object l(@NotNull z1 z1Var, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        z1.a.b(z1Var, null, 1, null);
        Object K = z1Var.K(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return K == coroutine_suspended ? K : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(CoroutineContext coroutineContext, Throwable th) {
        z1 z1Var = (z1) coroutineContext.get(z1.f71466g1);
        if (z1Var == null) {
            return;
        }
        for (z1 z1Var2 : z1Var.j()) {
            JobSupport jobSupport = z1Var2 instanceof JobSupport ? (JobSupport) z1Var2 : null;
            if (jobSupport != null) {
                jobSupport.l0(B(th, z1Var));
            }
        }
    }

    public static final void o(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        Sequence<z1> j4;
        z1 z1Var = (z1) coroutineContext.get(z1.f71466g1);
        if (z1Var == null || (j4 = z1Var.j()) == null) {
            return;
        }
        for (z1 z1Var2 : j4) {
            z1Var2.b(cancellationException);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(z1 z1Var, Throwable th) {
        for (z1 z1Var2 : z1Var.j()) {
            JobSupport jobSupport = z1Var2 instanceof JobSupport ? (JobSupport) z1Var2 : null;
            if (jobSupport != null) {
                jobSupport.l0(B(th, z1Var));
            }
        }
    }

    public static final void r(@NotNull z1 z1Var, @Nullable CancellationException cancellationException) {
        for (z1 z1Var2 : z1Var.j()) {
            z1Var2.b(cancellationException);
        }
    }

    public static /* synthetic */ void s(CoroutineContext coroutineContext, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        n(coroutineContext, th);
    }

    public static /* synthetic */ void t(CoroutineContext coroutineContext, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        c2.o(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void u(z1 z1Var, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        q(z1Var, th);
    }

    public static /* synthetic */ void v(z1 z1Var, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        c2.r(z1Var, cancellationException);
    }

    @NotNull
    public static final g1 w(@NotNull z1 z1Var, @NotNull g1 g1Var) {
        return z1Var.z(new i1(g1Var));
    }

    public static final void x(@NotNull CoroutineContext coroutineContext) {
        z1 z1Var = (z1) coroutineContext.get(z1.f71466g1);
        if (z1Var == null) {
            return;
        }
        c2.A(z1Var);
    }

    public static final void y(@NotNull z1 z1Var) {
        if (!z1Var.isActive()) {
            throw z1Var.r();
        }
    }

    @NotNull
    public static final z1 z(@NotNull CoroutineContext coroutineContext) {
        z1 z1Var = (z1) coroutineContext.get(z1.f71466g1);
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Current context doesn't contain Job in it: ", coroutineContext).toString());
    }
}
