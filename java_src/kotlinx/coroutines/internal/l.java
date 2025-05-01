package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.j3;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes6.dex */
public final class l<T> extends a1<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71121i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");
    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @JvmField
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineDispatcher f71122e;
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Continuation<T> f71123f;
    @JvmField
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public Object f71124g;
    @JvmField
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public final Object f71125h;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.f71122e = coroutineDispatcher;
        this.f71123f = continuation;
        this.f71124g = m.a();
        this.f71125h = ThreadContextKt.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final kotlinx.coroutines.q<?> p() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.q) {
            return (kotlinx.coroutines.q) obj;
        }
        return null;
    }

    public static /* synthetic */ void q() {
    }

    @Override // kotlinx.coroutines.a1
    public void d(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof kotlinx.coroutines.e0) {
            ((kotlinx.coroutines.e0) obj).f70117b.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.a1
    @NotNull
    public Continuation<T> e() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f71123f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f71123f.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.a1
    @Nullable
    public Object i() {
        Object obj = this.f71124g;
        if (kotlinx.coroutines.s0.b()) {
            if (!(obj != m.a())) {
                throw new AssertionError();
            }
        }
        this.f71124g = m.a();
        return obj;
    }

    public final void j() {
        do {
        } while (this._reusableCancellableContinuation == m.f71129b);
    }

    @Nullable
    public final kotlinx.coroutines.q<T> l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = m.f71129b;
                return null;
            } else if (obj instanceof kotlinx.coroutines.q) {
                if (f71121i.compareAndSet(this, obj, m.f71129b)) {
                    return (kotlinx.coroutines.q) obj;
                }
            } else if (obj != m.f71129b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Inconsistent state ", obj).toString());
            }
        }
    }

    public final void o(@NotNull CoroutineContext coroutineContext, T t4) {
        this.f71124g = t4;
        this.f69643d = 1;
        this.f71122e.dispatchYield(coroutineContext, this);
    }

    public final boolean r() {
        return this._reusableCancellableContinuation != null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        CoroutineContext context = this.f71123f.getContext();
        Object d5 = kotlinx.coroutines.i0.d(obj, null, 1, null);
        if (this.f71122e.isDispatchNeeded(context)) {
            this.f71124g = d5;
            this.f69643d = 0;
            this.f71122e.dispatch(context, this);
            return;
        }
        kotlinx.coroutines.s0.b();
        k1 b5 = d3.f70019a.b();
        if (b5.h0()) {
            this.f71124g = d5;
            this.f69643d = 0;
            b5.b0(this);
            return;
        }
        b5.d0(true);
        try {
            CoroutineContext context2 = getContext();
            Object c5 = ThreadContextKt.c(context2, this.f71125h);
            this.f71123f.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
            ThreadContextKt.a(context2, c5);
            do {
            } while (b5.k0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean t(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            o0 o0Var = m.f71129b;
            if (Intrinsics.areEqual(obj, o0Var)) {
                if (f71121i.compareAndSet(this, o0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f71121i.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.f71122e + ", " + kotlinx.coroutines.t0.c(this.f71123f) + ']';
    }

    public final void v() {
        j();
        kotlinx.coroutines.q<?> p4 = p();
        if (p4 == null) {
            return;
        }
        p4.t();
    }

    public final void w(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        boolean z4;
        Object b5 = kotlinx.coroutines.i0.b(obj, function1);
        if (this.f71122e.isDispatchNeeded(getContext())) {
            this.f71124g = b5;
            this.f69643d = 1;
            this.f71122e.dispatch(getContext(), this);
            return;
        }
        kotlinx.coroutines.s0.b();
        k1 b6 = d3.f70019a.b();
        if (b6.h0()) {
            this.f71124g = b5;
            this.f69643d = 1;
            b6.b0(this);
            return;
        }
        b6.d0(true);
        try {
            z1 z1Var = (z1) getContext().get(z1.f71466g1);
            if (z1Var == null || z1Var.isActive()) {
                z4 = false;
            } else {
                CancellationException r4 = z1Var.r();
                d(b5, r4);
                Result.Companion companion = Result.Companion;
                resumeWith(Result.m35constructorimpl(ResultKt.createFailure(r4)));
                z4 = true;
            }
            if (!z4) {
                Continuation<T> continuation = this.f71123f;
                Object obj2 = this.f71125h;
                CoroutineContext context = continuation.getContext();
                Object c5 = ThreadContextKt.c(context, obj2);
                j3<?> g4 = c5 != ThreadContextKt.f71089a ? CoroutineContextKt.g(continuation, context, c5) : null;
                this.f71123f.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
                if (g4 == null || g4.y1()) {
                    ThreadContextKt.a(context, c5);
                }
                InlineMarker.finallyEnd(1);
            }
            do {
            } while (b6.k0());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            try {
                h(th, null);
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                b6.Y(true);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        b6.Y(true);
        InlineMarker.finallyEnd(1);
    }

    public final boolean x(@Nullable Object obj) {
        z1 z1Var = (z1) getContext().get(z1.f71466g1);
        if (z1Var == null || z1Var.isActive()) {
            return false;
        }
        CancellationException r4 = z1Var.r();
        d(obj, r4);
        Result.Companion companion = Result.Companion;
        resumeWith(Result.m35constructorimpl(ResultKt.createFailure(r4)));
        return true;
    }

    public final void y(@NotNull Object obj) {
        Continuation<T> continuation = this.f71123f;
        Object obj2 = this.f71125h;
        CoroutineContext context = continuation.getContext();
        Object c5 = ThreadContextKt.c(context, obj2);
        j3<?> g4 = c5 != ThreadContextKt.f71089a ? CoroutineContextKt.g(continuation, context, c5) : null;
        try {
            this.f71123f.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
        } finally {
            InlineMarker.finallyStart(1);
            if (g4 == null || g4.y1()) {
                ThreadContextKt.a(context, c5);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @Nullable
    public final Throwable z(@NotNull kotlinx.coroutines.p<?> pVar) {
        o0 o0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            o0Var = m.f71129b;
            if (obj != o0Var) {
                if (obj instanceof Throwable) {
                    if (f71121i.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Inconsistent state ", obj).toString());
            }
        } while (!f71121i.compareAndSet(this, o0Var, pVar));
        return null;
    }
}
