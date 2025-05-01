package kotlinx.coroutines.selects;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.r;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.selects.a;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Select.kt */
@PublishedApi
/* loaded from: classes7.dex */
public final class b<R> extends v implements kotlinx.coroutines.selects.a<R>, f<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f71351f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71352g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Continuation<R> f71353e;
    @NotNull
    volatile /* synthetic */ Object _state = g.f();
    @NotNull
    private volatile /* synthetic */ Object _result = g.c();
    @NotNull
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    /* loaded from: classes7.dex */
    public static final class a extends kotlinx.coroutines.internal.d<Object> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f71354b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final kotlinx.coroutines.internal.b f71355c;

        /* renamed from: d  reason: collision with root package name */
        private final long f71356d = g.b().a();

        public a(@NotNull b<?> bVar, @NotNull kotlinx.coroutines.internal.b bVar2) {
            this.f71354b = bVar;
            this.f71355c = bVar2;
            bVar2.d(this);
        }

        private final void j(Object obj) {
            boolean z4 = obj == null;
            if (b.f71351f.compareAndSet(this.f71354b, this, z4 ? null : g.f()) && z4) {
                this.f71354b.j0();
            }
        }

        private final Object k() {
            b<?> bVar = this.f71354b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof g0) {
                    ((g0) obj).c(this.f71354b);
                } else if (obj == g.f()) {
                    if (b.f71351f.compareAndSet(this.f71354b, g.f(), this)) {
                        return null;
                    }
                } else {
                    return g.d();
                }
            }
        }

        private final void l() {
            b.f71351f.compareAndSet(this.f71354b, this, g.f());
        }

        @Override // kotlinx.coroutines.internal.d
        public void d(@Nullable Object obj, @Nullable Object obj2) {
            j(obj2);
            this.f71355c.a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.d
        public long g() {
            return this.f71356d;
        }

        @Override // kotlinx.coroutines.internal.d
        @Nullable
        public Object i(@Nullable Object obj) {
            Object k4;
            if (obj != null || (k4 = k()) == null) {
                try {
                    return this.f71355c.c(this);
                } catch (Throwable th) {
                    if (obj == null) {
                        l();
                    }
                    throw th;
                }
            }
            return k4;
        }

        @Override // kotlinx.coroutines.internal.g0
        @NotNull
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    /* renamed from: kotlinx.coroutines.selects.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0782b extends LockFreeLinkedListNode {
        @JvmField
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final g1 f71357e;

        public C0782b(@NotNull g1 g1Var) {
            this.f71357e = g1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    /* loaded from: classes7.dex */
    public static final class c extends g0 {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final LockFreeLinkedListNode.d f71358a;

        public c(@NotNull LockFreeLinkedListNode.d dVar) {
            this.f71358a = dVar;
        }

        @Override // kotlinx.coroutines.internal.g0
        @NotNull
        public kotlinx.coroutines.internal.d<?> a() {
            return this.f71358a.a();
        }

        @Override // kotlinx.coroutines.internal.g0
        @Nullable
        public Object c(@Nullable Object obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            b bVar = (b) obj;
            this.f71358a.d();
            Object e5 = this.f71358a.a().e(null);
            b.f71351f.compareAndSet(bVar, this, e5 == null ? this.f71358a.f71080c : g.f());
            return e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    /* loaded from: classes7.dex */
    public final class d extends a2 {
        public d() {
        }

        @Override // kotlinx.coroutines.f0
        public void e0(@Nullable Throwable th) {
            if (b.this.q()) {
                b.this.t(f0().r());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            e0(th);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Runnable.kt */
    /* loaded from: classes7.dex */
    public static final class e implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function1 f71361c;

        public e(Function1 function1) {
            this.f71361c = function1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.q()) {
                s3.a.d(this.f71361c, b.this.r());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Continuation<? super R> continuation) {
        this.f71353e = continuation;
    }

    private final void P() {
        z1 z1Var = (z1) getContext().get(z1.f71466g1);
        if (z1Var == null) {
            return;
        }
        g1 f5 = z1.a.f(z1Var, true, false, new d(), 2, null);
        o0(f5);
        if (h()) {
            f5.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        g1 l02 = l0();
        if (l02 != null) {
            l02.dispose();
        }
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) L(); !Intrinsics.areEqual(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.M()) {
            if (lockFreeLinkedListNode instanceof C0782b) {
                ((C0782b) lockFreeLinkedListNode).f71357e.dispose();
            }
        }
    }

    private final void k0(Function0<? extends Object> function0, Function0<Unit> function02) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (s0.b() && !h()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                if (f71352g.compareAndSet(this, g.c(), function0.invoke())) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71352g;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (atomicReferenceFieldUpdater.compareAndSet(this, coroutine_suspended2, g.a())) {
                    function02.invoke();
                    return;
                }
            }
        }
    }

    private final g1 l0() {
        return (g1) this._parentHandle;
    }

    private final void o0(g1 g1Var) {
        this._parentHandle = g1Var;
    }

    @Override // kotlinx.coroutines.selects.a
    public void b(@NotNull kotlinx.coroutines.selects.c cVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        cVar.i(this, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void g(@NotNull kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, P p4, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        eVar.A(this, p4, function2);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.f71353e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f71353e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean h() {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                return false;
            }
            if (!(obj instanceof g0)) {
                return true;
            }
            ((g0) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.selects.a
    public void i(long j4, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        if (j4 <= 0) {
            if (q()) {
                s3.b.c(function1, r());
                return;
            }
            return;
        }
        l(DelayKt.d(getContext()).A(j4, new e(function1), getContext()));
    }

    @Override // kotlinx.coroutines.selects.f
    public void l(@NotNull g1 g1Var) {
        C0782b c0782b = new C0782b(g1Var);
        if (!h()) {
            A(c0782b);
            if (!h()) {
                return;
            }
        }
        g1Var.dispose();
    }

    @PublishedApi
    @Nullable
    public final Object m0() {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (!h()) {
            P();
        }
        Object obj = this._result;
        if (obj == g.c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71352g;
            Object c5 = g.c();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (atomicReferenceFieldUpdater.compareAndSet(this, c5, coroutine_suspended)) {
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return coroutine_suspended2;
            }
            obj = this._result;
        }
        if (obj != g.a()) {
            if (obj instanceof d0) {
                throw ((d0) obj).f70014a;
            }
            return obj;
        }
        throw new IllegalStateException("Already resumed");
    }

    @PublishedApi
    public final void n0(@NotNull Throwable th) {
        if (q()) {
            Result.Companion companion = Result.Companion;
            resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
        } else if (th instanceof CancellationException) {
        } else {
            Object m02 = m0();
            if (m02 instanceof d0) {
                Throwable th2 = ((d0) m02).f70014a;
                if (s0.e()) {
                    th2 = n0.u(th2);
                }
                if (th2 == (!s0.e() ? th : n0.u(th))) {
                    return;
                }
            }
            kotlinx.coroutines.n0.b(getContext(), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        j0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        return kotlinx.coroutines.r.f71241d;
     */
    @Override // kotlinx.coroutines.selects.f
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.d r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            r2 = 0
            if (r0 != r1) goto L37
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.b.f71351f
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 != 0) goto L31
            goto L0
        L18:
            kotlinx.coroutines.selects.b$c r0 = new kotlinx.coroutines.selects.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.b.f71351f
            java.lang.Object r2 = kotlinx.coroutines.selects.g.f()
            boolean r1 = r1.compareAndSet(r3, r2, r0)
            if (r1 != 0) goto L2a
            goto L0
        L2a:
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L31
            return r4
        L31:
            r3.j0()
            kotlinx.coroutines.internal.o0 r4 = kotlinx.coroutines.r.f71241d
            return r4
        L37:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.g0
            if (r1 == 0) goto L6b
            if (r4 == 0) goto L65
            kotlinx.coroutines.internal.d r1 = r4.a()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.b.a
            if (r2 == 0) goto L59
            r2 = r1
            kotlinx.coroutines.selects.b$a r2 = (kotlinx.coroutines.selects.b.a) r2
            kotlinx.coroutines.selects.b<?> r2 = r2.f71354b
            if (r2 == r3) goto L4d
            goto L59
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L59:
            r2 = r0
            kotlinx.coroutines.internal.g0 r2 = (kotlinx.coroutines.internal.g0) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L65
            java.lang.Object r4 = kotlinx.coroutines.internal.c.f71101b
            return r4
        L65:
            kotlinx.coroutines.internal.g0 r0 = (kotlinx.coroutines.internal.g0) r0
            r0.c(r3)
            goto L0
        L6b:
            if (r4 != 0) goto L6e
            return r2
        L6e:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$a r4 = r4.f71080c
            if (r0 != r4) goto L75
            kotlinx.coroutines.internal.o0 r4 = kotlinx.coroutines.r.f71241d
            return r4
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.b.o(kotlinx.coroutines.internal.LockFreeLinkedListNode$d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void p(@NotNull kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        a.C0781a.a(this, eVar, function2);
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean q() {
        Object o4 = o(null);
        if (o4 == r.f71241d) {
            return true;
        }
        if (o4 == null) {
            return false;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected trySelectIdempotent result ", o4).toString());
    }

    @Override // kotlinx.coroutines.selects.f
    @NotNull
    public Continuation<R> r() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (s0.b() && !h()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj2 = this._result;
            if (obj2 == g.c()) {
                if (f71352g.compareAndSet(this, g.c(), i0.d(obj, null, 1, null))) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj2 != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71352g;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (atomicReferenceFieldUpdater.compareAndSet(this, coroutine_suspended2, g.a())) {
                    if (Result.m41isFailureimpl(obj)) {
                        Continuation<R> continuation = this.f71353e;
                        Throwable m38exceptionOrNullimpl = Result.m38exceptionOrNullimpl(obj);
                        Intrinsics.checkNotNull(m38exceptionOrNullimpl);
                        Result.Companion companion = Result.Companion;
                        if (s0.e() && (continuation instanceof CoroutineStackFrame)) {
                            m38exceptionOrNullimpl = n0.o(m38exceptionOrNullimpl, (CoroutineStackFrame) continuation);
                        }
                        continuation.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(m38exceptionOrNullimpl)));
                        return;
                    }
                    this.f71353e.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.f
    public void t(@NotNull Throwable th) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Continuation intercepted;
        if (s0.b() && !h()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                Continuation<R> continuation = this.f71353e;
                if (f71352g.compareAndSet(this, g.c(), new d0((s0.e() && (continuation instanceof CoroutineStackFrame)) ? n0.o(th, (CoroutineStackFrame) continuation) : th, false, 2, null))) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71352g;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (atomicReferenceFieldUpdater.compareAndSet(this, coroutine_suspended2, g.a())) {
                    intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f71353e);
                    Result.Companion companion = Result.Companion;
                    intercepted.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(th)));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    @Override // kotlinx.coroutines.selects.f
    @Nullable
    public Object u(@NotNull kotlinx.coroutines.internal.b bVar) {
        return new a(this, bVar).c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <Q> void w(@NotNull kotlinx.coroutines.selects.d<? extends Q> dVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        dVar.e(this, function2);
    }
}
