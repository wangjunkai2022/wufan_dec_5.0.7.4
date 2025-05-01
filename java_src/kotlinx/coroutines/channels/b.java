package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public abstract class b<E> implements b0<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f69947d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");
    @JvmField
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    protected final Function1<E, Unit> f69948b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.coroutines.internal.v f69949c = new kotlinx.coroutines.internal.v();
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class a<E> extends a0 {
        @JvmField

        /* renamed from: e  reason: collision with root package name */
        public final E f69950e;

        public a(E e5) {
            this.f69950e = e5;
        }

        @Override // kotlinx.coroutines.channels.a0
        public void e0() {
        }

        @Override // kotlinx.coroutines.channels.a0
        @Nullable
        public Object f0() {
            return this.f69950e;
        }

        @Override // kotlinx.coroutines.channels.a0
        public void g0(@NotNull p<?> pVar) {
            if (s0.b()) {
                throw new AssertionError();
            }
        }

        @Override // kotlinx.coroutines.channels.a0
        @Nullable
        public o0 h0(@Nullable LockFreeLinkedListNode.d dVar) {
            o0 o0Var = kotlinx.coroutines.r.f71241d;
            if (dVar != null) {
                dVar.d();
            }
            return o0Var;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "SendBuffered@" + t0.b(this) + '(' + this.f69950e + ')';
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private static class C0777b<E> extends LockFreeLinkedListNode.b<a<? extends E>> {
        public C0777b(@NotNull kotlinx.coroutines.internal.v vVar, E e5) {
            super(vVar, new a(e5));
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected Object e(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof p) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof y) {
                return kotlinx.coroutines.channels.a.f69943e;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class c<E, R> extends a0 implements g1 {

        /* renamed from: e  reason: collision with root package name */
        private final E f69951e;
        @JvmField
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public final b<E> f69952f;
        @JvmField
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        public final kotlinx.coroutines.selects.f<R> f69953g;
        @JvmField
        @NotNull

        /* renamed from: h  reason: collision with root package name */
        public final Function2<b0<? super E>, Continuation<? super R>, Object> f69954h;

        /* JADX WARN: Multi-variable type inference failed */
        public c(E e5, @NotNull b<E> bVar, @NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<? super b0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f69951e = e5;
            this.f69952f = bVar;
            this.f69953g = fVar;
            this.f69954h = function2;
        }

        @Override // kotlinx.coroutines.g1
        public void dispose() {
            if (W()) {
                i0();
            }
        }

        @Override // kotlinx.coroutines.channels.a0
        public void e0() {
            s3.a.f(this.f69954h, this.f69952f, this.f69953g.r(), null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.a0
        public E f0() {
            return this.f69951e;
        }

        @Override // kotlinx.coroutines.channels.a0
        public void g0(@NotNull p<?> pVar) {
            if (this.f69953g.q()) {
                this.f69953g.t(pVar.m0());
            }
        }

        @Override // kotlinx.coroutines.channels.a0
        @Nullable
        public o0 h0(@Nullable LockFreeLinkedListNode.d dVar) {
            return (o0) this.f69953g.o(dVar);
        }

        @Override // kotlinx.coroutines.channels.a0
        public void i0() {
            Function1<E, Unit> function1 = this.f69952f.f69948b;
            if (function1 == null) {
                return;
            }
            OnUndeliveredElementKt.b(function1, f0(), this.f69953g.r().getContext());
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "SendSelect@" + t0.b(this) + '(' + f0() + ")[" + this.f69952f + ", " + this.f69953g + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class d<E> extends LockFreeLinkedListNode.e<y<? super E>> {
        @JvmField

        /* renamed from: e  reason: collision with root package name */
        public final E f69955e;

        public d(E e5, @NotNull kotlinx.coroutines.internal.v vVar) {
            super(vVar);
            this.f69955e = e5;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.e, kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected Object e(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof p) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof y) {
                return null;
            }
            return kotlinx.coroutines.channels.a.f69943e;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        public Object j(@NotNull LockFreeLinkedListNode.d dVar) {
            o0 v2 = ((y) dVar.f71078a).v(this.f69955e, dVar);
            if (v2 == null) {
                return kotlinx.coroutines.internal.x.f71156a;
            }
            Object obj = kotlinx.coroutines.internal.c.f71101b;
            if (v2 == obj) {
                return obj;
            }
            if (s0.b()) {
                if (v2 == kotlinx.coroutines.r.f71241d) {
                    return null;
                }
                throw new AssertionError();
            }
            return null;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static final class e extends LockFreeLinkedListNode.c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LockFreeLinkedListNode f69956d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f69957e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LockFreeLinkedListNode lockFreeLinkedListNode, b bVar) {
            super(lockFreeLinkedListNode);
            this.f69956d = lockFreeLinkedListNode;
            this.f69957e = bVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f69957e.A()) {
                return null;
            }
            return kotlinx.coroutines.internal.w.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    /* loaded from: classes6.dex */
    public static final class f implements kotlinx.coroutines.selects.e<E, b0<? super E>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b<E> f69958b;

        f(b<E> bVar) {
            this.f69958b = bVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void A(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, E e5, @NotNull Function2<? super b0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f69958b.J(fVar, e5, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Nullable Function1<? super E, Unit> function1) {
        this.f69948b = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B() {
        return !(this.f69949c.M() instanceof y) && A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void J(kotlinx.coroutines.selects.f<? super R> fVar, E e5, Function2<? super b0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!fVar.h()) {
            if (B()) {
                c cVar = new c(e5, this, fVar, function2);
                Object k4 = k(cVar);
                if (k4 == null) {
                    fVar.l(cVar);
                    return;
                } else if (!(k4 instanceof p)) {
                    if (k4 != kotlinx.coroutines.channels.a.f69945g && !(k4 instanceof x)) {
                        throw new IllegalStateException(("enqueueSend returned " + k4 + ' ').toString());
                    }
                } else {
                    throw n0.p(t(e5, (p) k4));
                }
            }
            Object D = D(e5, fVar);
            if (D == kotlinx.coroutines.selects.g.d()) {
                return;
            }
            if (D != kotlinx.coroutines.channels.a.f69943e && D != kotlinx.coroutines.internal.c.f71101b) {
                if (D == kotlinx.coroutines.channels.a.f69942d) {
                    s3.b.d(function2, this, fVar.r());
                    return;
                } else if (!(D instanceof p)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("offerSelectInternal returned ", D).toString());
                } else {
                    throw n0.p(t(e5, (p) D));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r4 = r0.y();
        r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r4 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r4 != r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(E r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r3 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            kotlinx.coroutines.q r0 = kotlinx.coroutines.s.b(r0)
        L8:
            boolean r1 = d(r3)
            if (r1 == 0) goto L4d
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r3.f69948b
            if (r1 != 0) goto L18
            kotlinx.coroutines.channels.c0 r1 = new kotlinx.coroutines.channels.c0
            r1.<init>(r4, r0)
            goto L1f
        L18:
            kotlinx.coroutines.channels.d0 r1 = new kotlinx.coroutines.channels.d0
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r3.f69948b
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.k(r1)
            if (r2 != 0) goto L29
            kotlinx.coroutines.s.c(r0, r1)
            goto L6f
        L29:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.p
            if (r1 == 0) goto L33
            kotlinx.coroutines.channels.p r2 = (kotlinx.coroutines.channels.p) r2
            c(r3, r0, r4, r2)
            goto L6f
        L33:
            kotlinx.coroutines.internal.o0 r1 = kotlinx.coroutines.channels.a.f69945g
            if (r2 != r1) goto L38
            goto L4d
        L38:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.x
            if (r1 == 0) goto L3d
            goto L4d
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "enqueueSend returned "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.Object r1 = r3.C(r4)
            kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.channels.a.f69942d
            if (r1 != r2) goto L61
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m35constructorimpl(r4)
            r0.resumeWith(r4)
            goto L6f
        L61:
            kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.channels.a.f69943e
            if (r1 != r2) goto L66
            goto L8
        L66:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.p
            if (r2 == 0) goto L86
            kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
            c(r3, r0, r4, r1)
        L6f:
            java.lang.Object r4 = r0.y()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r0) goto L7c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L7c:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L83
            return r4
        L83:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "offerInternal returned "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            goto L97
        L96:
            throw r4
        L97:
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b.N(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final int h() {
        kotlinx.coroutines.internal.v vVar = this.f69949c;
        int i4 = 0;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) vVar.L(); !Intrinsics.areEqual(lockFreeLinkedListNode, vVar); lockFreeLinkedListNode = lockFreeLinkedListNode.M()) {
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                i4++;
            }
        }
        return i4;
    }

    private final String r() {
        String stringPlus;
        LockFreeLinkedListNode M = this.f69949c.M();
        if (M == this.f69949c) {
            return "EmptyQueue";
        }
        if (M instanceof p) {
            stringPlus = M.toString();
        } else if (M instanceof x) {
            stringPlus = "ReceiveQueued";
        } else {
            stringPlus = M instanceof a0 ? "SendQueued" : Intrinsics.stringPlus("UNEXPECTED:", M);
        }
        LockFreeLinkedListNode Q = this.f69949c.Q();
        if (Q != M) {
            String str = stringPlus + ",queueSize=" + h();
            if (Q instanceof p) {
                return str + ",closedForSend=" + Q;
            }
            return str;
        }
        return stringPlus;
    }

    private final void s(p<?> pVar) {
        Object c5 = kotlinx.coroutines.internal.p.c(null, 1, null);
        while (true) {
            LockFreeLinkedListNode Q = pVar.Q();
            x xVar = Q instanceof x ? (x) Q : null;
            if (xVar == null) {
                break;
            } else if (!xVar.W()) {
                xVar.R();
            } else {
                c5 = kotlinx.coroutines.internal.p.h(c5, xVar);
            }
        }
        if (c5 != null) {
            if (!(c5 instanceof ArrayList)) {
                ((x) c5).g0(pVar);
            } else {
                ArrayList arrayList = (ArrayList) c5;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i4 = size - 1;
                        ((x) arrayList.get(size)).g0(pVar);
                        if (i4 < 0) {
                            break;
                        }
                        size = i4;
                    }
                }
            }
        }
        E(pVar);
    }

    private final Throwable t(E e5, p<?> pVar) {
        UndeliveredElementException d5;
        s(pVar);
        Function1<E, Unit> function1 = this.f69948b;
        if (function1 == null || (d5 = OnUndeliveredElementKt.d(function1, e5, null, 2, null)) == null) {
            return pVar.m0();
        }
        ExceptionsKt__ExceptionsKt.addSuppressed(d5, pVar.m0());
        throw d5;
    }

    private final Throwable u(p<?> pVar) {
        s(pVar);
        return pVar.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Continuation<?> continuation, E e5, p<?> pVar) {
        UndeliveredElementException d5;
        s(pVar);
        Throwable m02 = pVar.m0();
        Function1<E, Unit> function1 = this.f69948b;
        if (function1 == null || (d5 = OnUndeliveredElementKt.d(function1, e5, null, 2, null)) == null) {
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(m02)));
            return;
        }
        ExceptionsKt__ExceptionsKt.addSuppressed(d5, m02);
        Result.Companion companion2 = Result.Companion;
        continuation.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(d5)));
    }

    private final void y(Throwable th) {
        o0 o0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (o0Var = kotlinx.coroutines.channels.a.f69946h) || !f69947d.compareAndSet(this, obj, o0Var)) {
            return;
        }
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(th);
    }

    protected abstract boolean A();

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public Object C(E e5) {
        y<E> O;
        o0 v2;
        do {
            O = O();
            if (O == null) {
                return kotlinx.coroutines.channels.a.f69943e;
            }
            v2 = O.v(e5, null);
        } while (v2 == null);
        if (s0.b()) {
            if (!(v2 == kotlinx.coroutines.r.f71241d)) {
                throw new AssertionError();
            }
        }
        O.j(e5);
        return O.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public Object D(E e5, @NotNull kotlinx.coroutines.selects.f<?> fVar) {
        d<E> j4 = j(e5);
        Object u4 = fVar.u(j4);
        if (u4 != null) {
            return u4;
        }
        y<? super E> o4 = j4.o();
        o4.j(e5);
        return o4.d();
    }

    protected void E(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final y<?> K(E e5) {
        LockFreeLinkedListNode Q;
        LockFreeLinkedListNode lockFreeLinkedListNode = this.f69949c;
        a aVar = new a(e5);
        do {
            Q = lockFreeLinkedListNode.Q();
            if (Q instanceof y) {
                return (y) Q;
            }
        } while (!Q.E(aVar, lockFreeLinkedListNode));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public y<E> O() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode a02;
        kotlinx.coroutines.internal.v vVar = this.f69949c;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) vVar.L();
            if (lockFreeLinkedListNode != vVar && (lockFreeLinkedListNode instanceof y)) {
                if (((((y) lockFreeLinkedListNode) instanceof p) && !lockFreeLinkedListNode.T()) || (a02 = lockFreeLinkedListNode.a0()) == null) {
                    break;
                }
                a02.S();
            }
        }
        lockFreeLinkedListNode = null;
        return (y) lockFreeLinkedListNode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final a0 P() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode a02;
        kotlinx.coroutines.internal.v vVar = this.f69949c;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) vVar.L();
            if (lockFreeLinkedListNode != vVar && (lockFreeLinkedListNode instanceof a0)) {
                if (((((a0) lockFreeLinkedListNode) instanceof p) && !lockFreeLinkedListNode.T()) || (a02 = lockFreeLinkedListNode.a0()) == null) {
                    break;
                }
                a02.S();
            }
        }
        lockFreeLinkedListNode = null;
        return (a0) lockFreeLinkedListNode;
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean R(@Nullable Throwable th) {
        boolean z4;
        p<?> pVar = new p<>(th);
        LockFreeLinkedListNode lockFreeLinkedListNode = this.f69949c;
        while (true) {
            LockFreeLinkedListNode Q = lockFreeLinkedListNode.Q();
            z4 = true;
            if (!(!(Q instanceof p))) {
                z4 = false;
                break;
            } else if (Q.E(pVar, lockFreeLinkedListNode)) {
                break;
            }
        }
        if (!z4) {
            pVar = (p) this.f69949c.Q();
        }
        s(pVar);
        if (z4) {
            y(th);
        }
        return z4;
    }

    @Override // kotlinx.coroutines.channels.b0
    @Nullable
    public final Object S(E e5, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (C(e5) == kotlinx.coroutines.channels.a.f69942d) {
            return Unit.INSTANCE;
        }
        Object N = N(e5, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return N == coroutine_suspended ? N : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.b0
    public final boolean U() {
        return n() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final LockFreeLinkedListNode.b<?> i(E e5) {
        return new C0777b(this.f69949c, e5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final d<E> j(E e5) {
        return new d<>(e5, this.f69949c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public Object k(@NotNull a0 a0Var) {
        boolean z4;
        LockFreeLinkedListNode Q;
        if (z()) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f69949c;
            do {
                Q = lockFreeLinkedListNode.Q();
                if (Q instanceof y) {
                    return Q;
                }
            } while (!Q.E(a0Var, lockFreeLinkedListNode));
            return null;
        }
        LockFreeLinkedListNode lockFreeLinkedListNode2 = this.f69949c;
        e eVar = new e(a0Var, this);
        while (true) {
            LockFreeLinkedListNode Q2 = lockFreeLinkedListNode2.Q();
            if (!(Q2 instanceof y)) {
                int c02 = Q2.c0(a0Var, lockFreeLinkedListNode2, eVar);
                z4 = true;
                if (c02 != 1) {
                    if (c02 == 2) {
                        z4 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return Q2;
            }
        }
        if (z4) {
            return null;
        }
        return kotlinx.coroutines.channels.a.f69945g;
    }

    @NotNull
    protected String l() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final p<?> m() {
        LockFreeLinkedListNode M = this.f69949c.M();
        p<?> pVar = M instanceof p ? (p) M : null;
        if (pVar == null) {
            return null;
        }
        s(pVar);
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final p<?> n() {
        LockFreeLinkedListNode Q = this.f69949c.Q();
        p<?> pVar = Q instanceof p ? (p) Q : null;
        if (pVar == null) {
            return null;
        }
        s(pVar);
        return pVar;
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public final kotlinx.coroutines.selects.e<E, b0<E>> o() {
        return new f(this);
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean offer(E e5) {
        UndeliveredElementException d5;
        try {
            return b0.a.c(this, e5);
        } catch (Throwable th) {
            Function1<E, Unit> function1 = this.f69948b;
            if (function1 != null && (d5 = OnUndeliveredElementKt.d(function1, e5, null, 2, null)) != null) {
                ExceptionsKt__ExceptionsKt.addSuppressed(d5, th);
                throw d5;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final kotlinx.coroutines.internal.v p() {
        return this.f69949c;
    }

    @NotNull
    public String toString() {
        return t0.a(this) + '@' + t0.b(this) + '{' + r() + '}' + l();
    }

    @Override // kotlinx.coroutines.channels.b0
    public void w(@NotNull Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69947d;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == kotlinx.coroutines.channels.a.f69946h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Another handler was already registered: ", obj));
        }
        p<?> n4 = n();
        if (n4 == null || !atomicReferenceFieldUpdater.compareAndSet(this, function1, kotlinx.coroutines.channels.a.f69946h)) {
            return;
        }
        function1.invoke(n4.f69995e);
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public final Object x(E e5) {
        Object C = C(e5);
        if (C == kotlinx.coroutines.channels.a.f69942d) {
            return n.f69990b.c(Unit.INSTANCE);
        }
        if (C == kotlinx.coroutines.channels.a.f69943e) {
            p<?> n4 = n();
            return n4 == null ? n.f69990b.b() : n.f69990b.a(u(n4));
        } else if (C instanceof p) {
            return n.f69990b.a(u((p) C));
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("trySend returned ", C).toString());
        }
    }

    protected abstract boolean z();
}
