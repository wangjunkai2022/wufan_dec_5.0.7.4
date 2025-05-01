package kotlinx.coroutines;

import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DispatchedTask.kt */
/* loaded from: classes6.dex */
public abstract class a1<T> extends kotlinx.coroutines.scheduling.j {
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public int f69643d;

    public a1(int i4) {
        this.f69643d = i4;
    }

    public void d(@Nullable Object obj, @NotNull Throwable th) {
    }

    @NotNull
    public abstract Continuation<T> e();

    @Nullable
    public Throwable f(@Nullable Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f70014a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(@Nullable Object obj) {
        return obj;
    }

    public final void h(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        n0.b(e().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object m35constructorimpl;
        Object m35constructorimpl2;
        if (s0.b()) {
            if (!(this.f69643d != -1)) {
                throw new AssertionError();
            }
        }
        kotlinx.coroutines.scheduling.k kVar = this.f71309c;
        try {
            kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) e();
            Continuation<T> continuation = lVar.f71123f;
            Object obj = lVar.f71125h;
            CoroutineContext context = continuation.getContext();
            Object c5 = ThreadContextKt.c(context, obj);
            j3<?> g4 = c5 != ThreadContextKt.f71089a ? CoroutineContextKt.g(continuation, context, c5) : null;
            CoroutineContext context2 = continuation.getContext();
            Object i4 = i();
            Throwable f5 = f(i4);
            z1 z1Var = (f5 == null && b1.c(this.f69643d)) ? (z1) context2.get(z1.f71466g1) : null;
            if (z1Var != null && !z1Var.isActive()) {
                Throwable r4 = z1Var.r();
                d(i4, r4);
                Result.Companion companion = Result.Companion;
                if (s0.e() && (continuation instanceof CoroutineStackFrame)) {
                    r4 = kotlinx.coroutines.internal.n0.o(r4, (CoroutineStackFrame) continuation);
                }
                continuation.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(r4)));
            } else if (f5 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(f5)));
            } else {
                T g5 = g(i4);
                Result.Companion companion3 = Result.Companion;
                continuation.resumeWith(Result.m35constructorimpl(g5));
            }
            Unit unit = Unit.INSTANCE;
            if (g4 == null || g4.y1()) {
                ThreadContextKt.a(context, c5);
            }
            try {
                Result.Companion companion4 = Result.Companion;
                kVar.N();
                m35constructorimpl2 = Result.m35constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion5 = Result.Companion;
                m35constructorimpl2 = Result.m35constructorimpl(ResultKt.createFailure(th));
            }
            h(null, Result.m38exceptionOrNullimpl(m35constructorimpl2));
        } catch (Throwable th2) {
            try {
                Result.Companion companion6 = Result.Companion;
                kVar.N();
                m35constructorimpl = Result.m35constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion7 = Result.Companion;
                m35constructorimpl = Result.m35constructorimpl(ResultKt.createFailure(th3));
            }
            h(th2, Result.m38exceptionOrNullimpl(m35constructorimpl));
        }
    }
}
