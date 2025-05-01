package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CancellableContinuationImpl.kt */
@PublishedApi
/* loaded from: classes6.dex */
public class q<T> extends a1<T> implements p<T>, CoroutineStackFrame {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71231h = AtomicIntegerFieldUpdater.newUpdater(q.class, "_decision");

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71232i = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ int _decision;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Continuation<T> f71233e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineContext f71234f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private g1 f71235g;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull Continuation<? super T> continuation, int i4) {
        super(i4);
        this.f71233e = continuation;
        if (s0.b()) {
            if (!(i4 != -1)) {
                throw new AssertionError();
            }
        }
        this.f71234f = continuation.getContext();
        this._decision = 0;
        this._state = d.f70012b;
    }

    private final String A() {
        Object z4 = z();
        return z4 instanceof n2 ? "Active" : z4 instanceof t ? "Cancelled" : "Completed";
    }

    private final g1 B() {
        z1 z1Var = (z1) getContext().get(z1.f71466g1);
        if (z1Var == null) {
            return null;
        }
        g1 f5 = z1.a.f(z1Var, true, false, new u(this), 2, null);
        this.f71235g = f5;
        return f5;
    }

    private final boolean C() {
        return b1.d(this.f69643d) && ((kotlinx.coroutines.internal.l) this.f71233e).r();
    }

    private final n D(Function1<? super Throwable, Unit> function1) {
        return function1 instanceof n ? (n) function1 : new w1(function1);
    }

    private final void E(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    private final void H() {
        Continuation<T> continuation = this.f71233e;
        kotlinx.coroutines.internal.l lVar = continuation instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) continuation : null;
        Throwable z4 = lVar != null ? lVar.z(this) : null;
        if (z4 == null) {
            return;
        }
        t();
        a(z4);
    }

    private final void J(Object obj, int i4, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof n2) {
            } else {
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.c()) {
                        if (function1 == null) {
                            return;
                        }
                        q(function1, tVar.f70014a);
                        return;
                    }
                }
                j(obj);
                throw new KotlinNothingValueException();
            }
        } while (!f71232i.compareAndSet(this, obj2, L((n2) obj2, obj, i4, function1, null)));
        v();
        w(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void K(q qVar, Object obj, int i4, Function1 function1, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i5 & 4) != 0) {
            function1 = null;
        }
        qVar.J(obj, i4, function1);
    }

    private final Object L(n2 n2Var, Object obj, int i4, Function1<? super Throwable, Unit> function1, Object obj2) {
        if (obj instanceof d0) {
            if (s0.b()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (s0.b()) {
                if (function1 == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (b1.c(i4) || obj2 != null) {
            if (function1 != null || (((n2Var instanceof n) && !(n2Var instanceof f)) || obj2 != null)) {
                return new c0(obj, n2Var instanceof n ? (n) n2Var : null, function1, obj2, null, 16, null);
            }
            return obj;
        } else {
            return obj;
        }
    }

    private final boolean M() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f71231h.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.o0 Q(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof n2) {
            } else if (!(obj3 instanceof c0) || obj2 == null) {
                return null;
            } else {
                c0 c0Var = (c0) obj3;
                if (c0Var.f69668d == obj2) {
                    if (!s0.b() || Intrinsics.areEqual(c0Var.f69665a, obj)) {
                        return r.f71241d;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!f71232i.compareAndSet(this, obj3, L((n2) obj3, obj, this.f69643d, function1, obj2)));
        v();
        return r.f71241d;
    }

    private final boolean R() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f71231h.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(Intrinsics.stringPlus("Already resumed, but proposed with update ", obj).toString());
    }

    private final void l(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            n0.b(getContext(), new CompletionHandlerException(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final void p(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            n0.b(getContext(), new CompletionHandlerException(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    private final boolean r(Throwable th) {
        if (C()) {
            return ((kotlinx.coroutines.internal.l) this.f71233e).t(th);
        }
        return false;
    }

    private final void v() {
        if (C()) {
            return;
        }
        t();
    }

    private final void w(int i4) {
        if (M()) {
            return;
        }
        b1.a(this, i4);
    }

    @NotNull
    protected String F() {
        return "CancellableContinuation";
    }

    public final void G(@NotNull Throwable th) {
        if (r(th)) {
            return;
        }
        a(th);
        v();
    }

    @JvmName(name = "resetStateReusable")
    public final boolean I() {
        if (s0.b()) {
            if (!(this.f69643d == 2)) {
                throw new AssertionError();
            }
        }
        if (s0.b()) {
            if (!(this.f71235g != m2.f71216b)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (!s0.b() || (!(obj instanceof n2))) {
            if ((obj instanceof c0) && ((c0) obj).f69668d != null) {
                t();
                return false;
            }
            this._decision = 0;
            this._state = d.f70012b;
            return true;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.p
    @Nullable
    public Object N(T t4, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        return Q(t4, obj, function1);
    }

    @Override // kotlinx.coroutines.p
    public void O(@NotNull CoroutineDispatcher coroutineDispatcher, T t4) {
        Continuation<T> continuation = this.f71233e;
        kotlinx.coroutines.internal.l lVar = continuation instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) continuation : null;
        K(this, t4, (lVar != null ? lVar.f71122e : null) == coroutineDispatcher ? 4 : this.f69643d, null, 4, null);
    }

    @Override // kotlinx.coroutines.p
    public void P() {
        g1 B = B();
        if (B != null && isCompleted()) {
            B.dispose();
            this.f71235g = m2.f71216b;
        }
    }

    @Override // kotlinx.coroutines.p
    public void Y(@NotNull Object obj) {
        if (s0.b()) {
            if (!(obj == r.f71241d)) {
                throw new AssertionError();
            }
        }
        w(this.f69643d);
    }

    @Override // kotlinx.coroutines.p
    public boolean a(@Nullable Throwable th) {
        Object obj;
        boolean z4;
        do {
            obj = this._state;
            if (!(obj instanceof n2)) {
                return false;
            }
            z4 = obj instanceof n;
        } while (!f71232i.compareAndSet(this, obj, new t(this, th, z4)));
        n nVar = z4 ? (n) obj : null;
        if (nVar != null) {
            o(nVar, th);
        }
        v();
        w(this.f69643d);
        return true;
    }

    @Override // kotlinx.coroutines.p
    @Nullable
    public Object c(T t4, @Nullable Object obj) {
        return Q(t4, obj, null);
    }

    @Override // kotlinx.coroutines.a1
    public void d(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof n2)) {
                if (obj2 instanceof d0) {
                    return;
                }
                if (obj2 instanceof c0) {
                    c0 c0Var = (c0) obj2;
                    if (!c0Var.h()) {
                        if (f71232i.compareAndSet(this, obj2, c0.g(c0Var, null, null, null, null, th, 15, null))) {
                            c0Var.i(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f71232i.compareAndSet(this, obj2, new c0(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.a1
    @NotNull
    public final Continuation<T> e() {
        return this.f71233e;
    }

    @Override // kotlinx.coroutines.a1
    @Nullable
    public Throwable f(@Nullable Object obj) {
        Throwable f5 = super.f(obj);
        if (f5 == null) {
            return null;
        }
        Continuation<T> e5 = e();
        return (s0.e() && (e5 instanceof CoroutineStackFrame)) ? kotlinx.coroutines.internal.n0.o(f5, (CoroutineStackFrame) e5) : f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.a1
    public <T> T g(@Nullable Object obj) {
        return obj instanceof c0 ? (T) ((c0) obj).f69665a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f71233e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f71234f;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.a1
    @Nullable
    public Object i() {
        return z();
    }

    @Override // kotlinx.coroutines.p
    public boolean isActive() {
        return z() instanceof n2;
    }

    @Override // kotlinx.coroutines.p
    public boolean isCancelled() {
        return z() instanceof t;
    }

    @Override // kotlinx.coroutines.p
    public boolean isCompleted() {
        return !(z() instanceof n2);
    }

    @Override // kotlinx.coroutines.p
    public void k(@NotNull Function1<? super Throwable, Unit> function1) {
        n D = D(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (f71232i.compareAndSet(this, obj, D)) {
                    return;
                }
            } else if (obj instanceof n) {
                E(function1, obj);
            } else {
                boolean z4 = obj instanceof d0;
                if (z4) {
                    d0 d0Var = (d0) obj;
                    if (!d0Var.b()) {
                        E(function1, obj);
                    }
                    if (obj instanceof t) {
                        if (!z4) {
                            d0Var = null;
                        }
                        l(function1, d0Var != null ? d0Var.f70014a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof c0) {
                    c0 c0Var = (c0) obj;
                    if (c0Var.f69666b != null) {
                        E(function1, obj);
                    }
                    if (D instanceof f) {
                        return;
                    }
                    if (c0Var.h()) {
                        l(function1, c0Var.f69669e);
                        return;
                    } else {
                        if (f71232i.compareAndSet(this, obj, c0.g(c0Var, null, D, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (D instanceof f) {
                    return;
                } else {
                    if (f71232i.compareAndSet(this, obj, new c0(obj, D, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.p
    @Nullable
    public Object m(@NotNull Throwable th) {
        return Q(new d0(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.p
    public void n(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th) {
        Continuation<T> continuation = this.f71233e;
        kotlinx.coroutines.internal.l lVar = continuation instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) continuation : null;
        K(this, new d0(th, false, 2, null), (lVar != null ? lVar.f71122e : null) == coroutineDispatcher ? 4 : this.f69643d, null, 4, null);
    }

    public final void o(@NotNull n nVar, @Nullable Throwable th) {
        try {
            nVar.a(th);
        } catch (Throwable th2) {
            n0.b(getContext(), new CompletionHandlerException(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void q(@NotNull Function1<? super Throwable, Unit> function1, @NotNull Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            n0.b(getContext(), new CompletionHandlerException(Intrinsics.stringPlus("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        K(this, i0.c(obj, this), this.f69643d, null, 4, null);
    }

    @Override // kotlinx.coroutines.p
    public void s(T t4, @Nullable Function1<? super Throwable, Unit> function1) {
        J(t4, this.f69643d, function1);
    }

    public final void t() {
        g1 g1Var = this.f71235g;
        if (g1Var == null) {
            return;
        }
        g1Var.dispose();
        this.f71235g = m2.f71216b;
    }

    @NotNull
    public String toString() {
        return F() + '(' + t0.c(this.f71233e) + "){" + A() + "}@" + t0.b(this);
    }

    @NotNull
    public Throwable x(@NotNull z1 z1Var) {
        return z1Var.r();
    }

    @PublishedApi
    @Nullable
    public final Object y() {
        z1 z1Var;
        Object coroutine_suspended;
        boolean C = C();
        if (R()) {
            if (this.f71235g == null) {
                B();
            }
            if (C) {
                H();
            }
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        if (C) {
            H();
        }
        Object z4 = z();
        if (z4 instanceof d0) {
            Throwable th = ((d0) z4).f70014a;
            if (s0.e()) {
                throw kotlinx.coroutines.internal.n0.o(th, this);
            }
            throw th;
        } else if (b1.c(this.f69643d) && (z1Var = (z1) getContext().get(z1.f71466g1)) != null && !z1Var.isActive()) {
            CancellationException r4 = z1Var.r();
            d(z4, r4);
            if (s0.e()) {
                throw kotlinx.coroutines.internal.n0.o(r4, this);
            }
            throw r4;
        } else {
            return g(z4);
        }
    }

    @Nullable
    public final Object z() {
        return this._state;
    }
}
