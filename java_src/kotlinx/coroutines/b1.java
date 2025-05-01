package kotlinx.coroutines;

import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: DispatchedTask.kt */
/* loaded from: classes6.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f69658a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f69659b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f69660c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f69661d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f69662e = -1;

    public static final <T> void a(@NotNull a1<? super T> a1Var, int i4) {
        if (s0.b()) {
            if (!(i4 != -1)) {
                throw new AssertionError();
            }
        }
        Continuation<? super T> e5 = a1Var.e();
        boolean z4 = i4 == 4;
        if (!z4 && (e5 instanceof kotlinx.coroutines.internal.l) && c(i4) == c(a1Var.f69643d)) {
            CoroutineDispatcher coroutineDispatcher = ((kotlinx.coroutines.internal.l) e5).f71122e;
            CoroutineContext context = e5.getContext();
            if (coroutineDispatcher.isDispatchNeeded(context)) {
                coroutineDispatcher.dispatch(context, a1Var);
                return;
            } else {
                f(a1Var);
                return;
            }
        }
        e(a1Var, e5, z4);
    }

    @PublishedApi
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final boolean d(int i4) {
        return i4 == 2;
    }

    public static final <T> void e(@NotNull a1<? super T> a1Var, @NotNull Continuation<? super T> continuation, boolean z4) {
        Object g4;
        boolean y12;
        Object i4 = a1Var.i();
        Throwable f5 = a1Var.f(i4);
        if (f5 != null) {
            Result.Companion companion = Result.Companion;
            g4 = ResultKt.createFailure(f5);
        } else {
            Result.Companion companion2 = Result.Companion;
            g4 = a1Var.g(i4);
        }
        Object m35constructorimpl = Result.m35constructorimpl(g4);
        if (z4) {
            kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) continuation;
            Continuation<T> continuation2 = lVar.f71123f;
            Object obj = lVar.f71125h;
            CoroutineContext context = continuation2.getContext();
            Object c5 = ThreadContextKt.c(context, obj);
            j3<?> g5 = c5 != ThreadContextKt.f71089a ? CoroutineContextKt.g(continuation2, context, c5) : null;
            try {
                lVar.f71123f.resumeWith(m35constructorimpl);
                Unit unit = Unit.INSTANCE;
                if (g5 != null) {
                    if (!y12) {
                        return;
                    }
                }
                return;
            } finally {
                if (g5 == null || g5.y1()) {
                    ThreadContextKt.a(context, c5);
                }
            }
        }
        continuation.resumeWith(m35constructorimpl);
    }

    private static final void f(a1<?> a1Var) {
        k1 b5 = d3.f70019a.b();
        if (b5.h0()) {
            b5.b0(a1Var);
            return;
        }
        b5.d0(true);
        try {
            e(a1Var, a1Var.e(), true);
            do {
            } while (b5.k0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@NotNull Continuation<?> continuation, @NotNull Throwable th) {
        Result.Companion companion = Result.Companion;
        if (s0.e() && (continuation instanceof CoroutineStackFrame)) {
            th = kotlinx.coroutines.internal.n0.o(th, (CoroutineStackFrame) continuation);
        }
        continuation.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
    }

    public static final void h(@NotNull a1<?> a1Var, @NotNull k1 k1Var, @NotNull Function0<Unit> function0) {
        k1Var.d0(true);
        try {
            function0.invoke();
            do {
            } while (k1Var.k0());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            try {
                a1Var.h(th, null);
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                k1Var.Y(true);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        k1Var.Y(true);
        InlineMarker.finallyEnd(1);
    }
}
