package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.j3;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes6.dex */
public final class m {
    @NotNull

    /* renamed from: a */
    private static final o0 f71128a = new o0("UNDEFINED");
    @JvmField
    @NotNull

    /* renamed from: b */
    public static final o0 f71129b = new o0("REUSABLE_CLAIMED");

    public static final /* synthetic */ o0 a() {
        return f71128a;
    }

    private static final boolean b(l<?> lVar, Object obj, int i4, boolean z4, Function0<Unit> function0) {
        if (kotlinx.coroutines.s0.b()) {
            if (!(i4 != -1)) {
                throw new AssertionError();
            }
        }
        k1 b5 = d3.f70019a.b();
        if (z4 && b5.i0()) {
            return false;
        }
        if (b5.h0()) {
            lVar.f71124g = obj;
            lVar.f69643d = i4;
            b5.b0(lVar);
            return true;
        }
        b5.d0(true);
        try {
            function0.invoke();
            do {
            } while (b5.k0());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            try {
                lVar.h(th, null);
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                b5.Y(true);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        b5.Y(true);
        InlineMarker.finallyEnd(1);
        return false;
    }

    static /* synthetic */ boolean c(l lVar, Object obj, int i4, boolean z4, Function0 function0, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        if (kotlinx.coroutines.s0.b()) {
            if (!(i4 != -1)) {
                throw new AssertionError();
            }
        }
        k1 b5 = d3.f70019a.b();
        if (z4 && b5.i0()) {
            return false;
        }
        if (b5.h0()) {
            lVar.f71124g = obj;
            lVar.f69643d = i4;
            b5.b0(lVar);
            return true;
        }
        b5.d0(true);
        try {
            function0.invoke();
            do {
            } while (b5.k0());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            try {
                lVar.h(th, null);
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                b5.Y(true);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        b5.Y(true);
        InlineMarker.finallyEnd(1);
        return false;
    }

    public static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    @InternalCoroutinesApi
    public static final <T> void f(@NotNull Continuation<? super T> continuation, @NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        boolean z4;
        if (continuation instanceof l) {
            l lVar = (l) continuation;
            Object b5 = kotlinx.coroutines.i0.b(obj, function1);
            if (lVar.f71122e.isDispatchNeeded(lVar.getContext())) {
                lVar.f71124g = b5;
                lVar.f69643d = 1;
                lVar.f71122e.dispatch(lVar.getContext(), lVar);
                return;
            }
            kotlinx.coroutines.s0.b();
            k1 b6 = d3.f70019a.b();
            if (b6.h0()) {
                lVar.f71124g = b5;
                lVar.f69643d = 1;
                b6.b0(lVar);
                return;
            }
            b6.d0(true);
            try {
                z1 z1Var = (z1) lVar.getContext().get(z1.f71466g1);
                if (z1Var == null || z1Var.isActive()) {
                    z4 = false;
                } else {
                    CancellationException r4 = z1Var.r();
                    lVar.d(b5, r4);
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(r4)));
                    z4 = true;
                }
                if (!z4) {
                    Continuation<T> continuation2 = lVar.f71123f;
                    Object obj2 = lVar.f71125h;
                    CoroutineContext context = continuation2.getContext();
                    Object c5 = ThreadContextKt.c(context, obj2);
                    j3<?> g4 = c5 != ThreadContextKt.f71089a ? CoroutineContextKt.g(continuation2, context, c5) : null;
                    lVar.f71123f.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (g4 == null || g4.y1()) {
                        ThreadContextKt.a(context, c5);
                    }
                }
                do {
                } while (b6.k0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    public static /* synthetic */ void g(Continuation continuation, Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            function1 = null;
        }
        f(continuation, obj, function1);
    }

    public static final boolean h(@NotNull l<? super Unit> lVar) {
        Unit unit = Unit.INSTANCE;
        kotlinx.coroutines.s0.b();
        k1 b5 = d3.f70019a.b();
        if (b5.i0()) {
            return false;
        }
        if (b5.h0()) {
            lVar.f71124g = unit;
            lVar.f69643d = 1;
            b5.b0(lVar);
            return true;
        }
        b5.d0(true);
        try {
            lVar.run();
            do {
            } while (b5.k0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
