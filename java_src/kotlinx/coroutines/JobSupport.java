package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes.dex */
public class JobSupport implements z1, x, o2, kotlinx.coroutines.selects.c {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f69621b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ Object _parentHandle;
    @NotNull
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes6.dex */
    public static final class a<T> extends q<T> {
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        private final JobSupport f69622j;

        public a(@NotNull Continuation<? super T> continuation, @NotNull JobSupport jobSupport) {
            super(continuation, 1);
            this.f69622j = jobSupport;
        }

        @Override // kotlinx.coroutines.q
        @NotNull
        protected String F() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.q
        @NotNull
        public Throwable x(@NotNull z1 z1Var) {
            Throwable d5;
            Object G0 = this.f69622j.G0();
            return (!(G0 instanceof c) || (d5 = ((c) G0).d()) == null) ? G0 instanceof d0 ? ((d0) G0).f70014a : z1Var.r() : d5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes6.dex */
    public static final class b extends f2 {
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final JobSupport f69623f;
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        private final c f69624g;
        @NotNull

        /* renamed from: h  reason: collision with root package name */
        private final w f69625h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        private final Object f69626i;

        public b(@NotNull JobSupport jobSupport, @NotNull c cVar, @NotNull w wVar, @Nullable Object obj) {
            this.f69623f = jobSupport;
            this.f69624g = cVar;
            this.f69625h = wVar;
            this.f69626i = obj;
        }

        @Override // kotlinx.coroutines.f0
        public void e0(@Nullable Throwable th) {
            this.f69623f.r0(this.f69624g, this.f69625h, this.f69626i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            e0(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes6.dex */
    public static final class c implements u1 {
        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @NotNull
        private volatile /* synthetic */ int _isCompleting;
        @NotNull
        private volatile /* synthetic */ Object _rootCause;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private final k2 f69627b;

        public c(@NotNull k2 k2Var, boolean z4, @Nullable Throwable th) {
            this.f69627b = k2Var;
            this._isCompleting = z4 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        private final Object c() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NotNull Throwable th) {
            Throwable d5 = d();
            if (d5 == null) {
                l(th);
            } else if (th == d5) {
            } else {
                Object c5 = c();
                if (c5 == null) {
                    k(th);
                } else if (!(c5 instanceof Throwable)) {
                    if (!(c5 instanceof ArrayList)) {
                        throw new IllegalStateException(Intrinsics.stringPlus("State is ", c5).toString());
                    }
                    ((ArrayList) c5).add(th);
                } else if (th == c5) {
                } else {
                    ArrayList<Throwable> b5 = b();
                    b5.add(c5);
                    b5.add(th);
                    k(b5);
                }
            }
        }

        @Nullable
        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return d() != null;
        }

        @Override // kotlinx.coroutines.u1
        @NotNull
        public k2 f() {
            return this.f69627b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            kotlinx.coroutines.internal.o0 o0Var;
            Object c5 = c();
            o0Var = g2.f71048h;
            return c5 == o0Var;
        }

        @NotNull
        public final List<Throwable> i(@Nullable Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.o0 o0Var;
            Object c5 = c();
            if (c5 == null) {
                arrayList = b();
            } else if (c5 instanceof Throwable) {
                ArrayList<Throwable> b5 = b();
                b5.add(c5);
                arrayList = b5;
            } else if (!(c5 instanceof ArrayList)) {
                throw new IllegalStateException(Intrinsics.stringPlus("State is ", c5).toString());
            } else {
                arrayList = (ArrayList) c5;
            }
            Throwable d5 = d();
            if (d5 != null) {
                arrayList.add(0, d5);
            }
            if (th != null && !Intrinsics.areEqual(th, d5)) {
                arrayList.add(th);
            }
            o0Var = g2.f71048h;
            k(o0Var);
            return arrayList;
        }

        @Override // kotlinx.coroutines.u1
        public boolean isActive() {
            return d() == null;
        }

        public final void j(boolean z4) {
            this._isCompleting = z4 ? 1 : 0;
        }

        public final void l(@Nullable Throwable th) {
            this._rootCause = th;
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + g() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + f() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static final class d extends LockFreeLinkedListNode.c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LockFreeLinkedListNode f69633d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JobSupport f69634e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f69635f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f69633d = lockFreeLinkedListNode;
            this.f69634e = jobSupport;
            this.f69635f = obj;
        }

        @Override // kotlinx.coroutines.internal.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f69634e.G0() == this.f69635f) {
                return null;
            }
            return kotlinx.coroutines.internal.w.a();
        }
    }

    public JobSupport(boolean z4) {
        this._state = z4 ? g2.f71050j : g2.f71049i;
        this._parentHandle = null;
    }

    private final Throwable A0(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f70014a;
    }

    private final Throwable B0(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z4;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.e()) {
                return new JobCancellationException(o0(), null, this);
            }
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                    z4 = false;
                    continue;
                } else {
                    z4 = true;
                    continue;
                }
                if (z4) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final k2 E0(u1 u1Var) {
        k2 f5 = u1Var.f();
        if (f5 == null) {
            if (u1Var instanceof j1) {
                return new k2();
            }
            if (u1Var instanceof f2) {
                d1((f2) u1Var);
                return null;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("State should have list: ", u1Var).toString());
        }
        return f5;
    }

    private final boolean K0(u1 u1Var) {
        return (u1Var instanceof c) && ((c) u1Var).e();
    }

    private final boolean N0() {
        Object G0;
        do {
            G0 = G0();
            if (!(G0 instanceof u1)) {
                return false;
            }
        } while (i1(G0) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O0(Continuation<? super Unit> continuation) {
        q qVar = new q(IntrinsicsKt.intercepted(continuation), 1);
        qVar.P();
        s.a(qVar, z(new r2(qVar)));
        Object y2 = qVar.y();
        if (y2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? y2 : Unit.INSTANCE;
    }

    private final Void P0(Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(G0());
        }
    }

    private final Object Q0(Object obj) {
        kotlinx.coroutines.internal.o0 o0Var;
        kotlinx.coroutines.internal.o0 o0Var2;
        kotlinx.coroutines.internal.o0 o0Var3;
        kotlinx.coroutines.internal.o0 o0Var4;
        kotlinx.coroutines.internal.o0 o0Var5;
        kotlinx.coroutines.internal.o0 o0Var6;
        Throwable th = null;
        while (true) {
            Object G0 = G0();
            if (G0 instanceof c) {
                synchronized (G0) {
                    if (((c) G0).h()) {
                        o0Var2 = g2.f71044d;
                        return o0Var2;
                    }
                    boolean e5 = ((c) G0).e();
                    if (obj != null || !e5) {
                        if (th == null) {
                            th = s0(obj);
                        }
                        ((c) G0).a(th);
                    }
                    Throwable d5 = e5 ^ true ? ((c) G0).d() : null;
                    if (d5 != null) {
                        W0(((c) G0).f(), d5);
                    }
                    o0Var = g2.f71041a;
                    return o0Var;
                }
            } else if (!(G0 instanceof u1)) {
                o0Var3 = g2.f71044d;
                return o0Var3;
            } else {
                if (th == null) {
                    th = s0(obj);
                }
                u1 u1Var = (u1) G0;
                if (u1Var.isActive()) {
                    if (o1(u1Var, th)) {
                        o0Var4 = g2.f71041a;
                        return o0Var4;
                    }
                } else {
                    Object p12 = p1(G0, new d0(th, false, 2, null));
                    o0Var5 = g2.f71041a;
                    if (p12 != o0Var5) {
                        o0Var6 = g2.f71043c;
                        if (p12 != o0Var6) {
                            return p12;
                        }
                    } else {
                        throw new IllegalStateException(Intrinsics.stringPlus("Cannot happen in ", G0).toString());
                    }
                }
            }
        }
    }

    private final f2 T0(Function1<? super Throwable, Unit> function1, boolean z4) {
        if (z4) {
            r0 = function1 instanceof a2 ? (a2) function1 : null;
            if (r0 == null) {
                r0 = new x1(function1);
            }
        } else {
            f2 f2Var = function1 instanceof f2 ? (f2) function1 : null;
            if (f2Var != null) {
                if (s0.b() && !(!(f2Var instanceof a2))) {
                    throw new AssertionError();
                }
                r0 = f2Var;
            }
            if (r0 == null) {
                r0 = new y1(function1);
            }
        }
        r0.g0(this);
        return r0;
    }

    private final w V0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.T()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.Q();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.M();
            if (!lockFreeLinkedListNode.T()) {
                if (lockFreeLinkedListNode instanceof w) {
                    return (w) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof k2) {
                    return null;
                }
            }
        }
    }

    private final void W0(k2 k2Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        Z0(th);
        CompletionHandlerException completionHandlerException2 = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) k2Var.L(); !Intrinsics.areEqual(lockFreeLinkedListNode, k2Var); lockFreeLinkedListNode = lockFreeLinkedListNode.M()) {
            if (lockFreeLinkedListNode instanceof a2) {
                f2 f2Var = (f2) lockFreeLinkedListNode;
                try {
                    f2Var.e0(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + f2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            I0(completionHandlerException2);
        }
        n0(th);
    }

    private final void X0(k2 k2Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) k2Var.L(); !Intrinsics.areEqual(lockFreeLinkedListNode, k2Var); lockFreeLinkedListNode = lockFreeLinkedListNode.M()) {
            if (lockFreeLinkedListNode instanceof f2) {
                f2 f2Var = (f2) lockFreeLinkedListNode;
                try {
                    f2Var.e0(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + f2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        I0(completionHandlerException2);
    }

    private final /* synthetic */ <T extends f2> void Y0(k2 k2Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) k2Var.L(); !Intrinsics.areEqual(lockFreeLinkedListNode, k2Var); lockFreeLinkedListNode = lockFreeLinkedListNode.M()) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                f2 f2Var = (f2) lockFreeLinkedListNode;
                try {
                    f2Var.e0(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + f2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        I0(completionHandlerException2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.t1] */
    private final void c1(j1 j1Var) {
        k2 k2Var = new k2();
        if (!j1Var.isActive()) {
            k2Var = new t1(k2Var);
        }
        f69621b.compareAndSet(this, j1Var, k2Var);
    }

    private final boolean d0(Object obj, k2 k2Var, f2 f2Var) {
        int c02;
        d dVar = new d(f2Var, this, obj);
        do {
            c02 = k2Var.Q().c0(f2Var, k2Var, dVar);
            if (c02 == 1) {
                return true;
            }
        } while (c02 != 2);
        return false;
    }

    private final void d1(f2 f2Var) {
        f2Var.F(new k2());
        f69621b.compareAndSet(this, f2Var, f2Var.M());
    }

    private final void e0(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable u4 = !s0.e() ? th : kotlinx.coroutines.internal.n0.u(th);
        for (Throwable th2 : list) {
            if (s0.e()) {
                th2 = kotlinx.coroutines.internal.n0.u(th2);
            }
            if (th2 != th && th2 != u4 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i0(Continuation<Object> continuation) {
        a aVar = new a(IntrinsicsKt.intercepted(continuation), this);
        aVar.P();
        s.a(aVar, z(new q2(aVar)));
        Object y2 = aVar.y();
        if (y2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y2;
    }

    private final int i1(Object obj) {
        j1 j1Var;
        if (obj instanceof j1) {
            if (((j1) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69621b;
            j1Var = g2.f71050j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, j1Var)) {
                b1();
                return 1;
            }
            return -1;
        } else if (obj instanceof t1) {
            if (f69621b.compareAndSet(this, obj, ((t1) obj).f())) {
                b1();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    private final String j1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof u1 ? ((u1) obj).isActive() ? "Active" : "New" : obj instanceof d0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.e() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException l1(JobSupport jobSupport, Throwable th, String str, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = null;
            }
            return jobSupport.k1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final Object m0(Object obj) {
        kotlinx.coroutines.internal.o0 o0Var;
        Object p12;
        kotlinx.coroutines.internal.o0 o0Var2;
        do {
            Object G0 = G0();
            if (!(G0 instanceof u1) || ((G0 instanceof c) && ((c) G0).g())) {
                o0Var = g2.f71041a;
                return o0Var;
            }
            p12 = p1(G0, new d0(s0(obj), false, 2, null));
            o0Var2 = g2.f71043c;
        } while (p12 == o0Var2);
        return p12;
    }

    private final boolean n0(Throwable th) {
        if (M0()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        v F0 = F0();
        return (F0 == null || F0 == m2.f71216b) ? z4 : F0.e(th) || z4;
    }

    private final boolean n1(u1 u1Var, Object obj) {
        if (s0.b()) {
            if (!((u1Var instanceof j1) || (u1Var instanceof f2))) {
                throw new AssertionError();
            }
        }
        if (!s0.b() || (!(obj instanceof d0))) {
            if (f69621b.compareAndSet(this, u1Var, g2.g(obj))) {
                Z0(null);
                a1(obj);
                q0(u1Var, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    private final boolean o1(u1 u1Var, Throwable th) {
        if (!s0.b() || (!(u1Var instanceof c))) {
            if (!s0.b() || u1Var.isActive()) {
                k2 E0 = E0(u1Var);
                if (E0 == null) {
                    return false;
                }
                if (f69621b.compareAndSet(this, u1Var, new c(E0, false, th))) {
                    W0(E0, th);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final Object p1(Object obj, Object obj2) {
        kotlinx.coroutines.internal.o0 o0Var;
        kotlinx.coroutines.internal.o0 o0Var2;
        if (!(obj instanceof u1)) {
            o0Var2 = g2.f71041a;
            return o0Var2;
        } else if (((obj instanceof j1) || (obj instanceof f2)) && !(obj instanceof w) && !(obj2 instanceof d0)) {
            if (n1((u1) obj, obj2)) {
                return obj2;
            }
            o0Var = g2.f71043c;
            return o0Var;
        } else {
            return q1((u1) obj, obj2);
        }
    }

    private final void q0(u1 u1Var, Object obj) {
        v F0 = F0();
        if (F0 != null) {
            F0.dispose();
            h1(m2.f71216b);
        }
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        Throwable th = d0Var != null ? d0Var.f70014a : null;
        if (u1Var instanceof f2) {
            try {
                ((f2) u1Var).e0(th);
                return;
            } catch (Throwable th2) {
                I0(new CompletionHandlerException("Exception in completion handler " + u1Var + " for " + this, th2));
                return;
            }
        }
        k2 f5 = u1Var.f();
        if (f5 == null) {
            return;
        }
        X0(f5, th);
    }

    private final Object q1(u1 u1Var, Object obj) {
        kotlinx.coroutines.internal.o0 o0Var;
        kotlinx.coroutines.internal.o0 o0Var2;
        kotlinx.coroutines.internal.o0 o0Var3;
        k2 E0 = E0(u1Var);
        if (E0 == null) {
            o0Var3 = g2.f71043c;
            return o0Var3;
        }
        c cVar = u1Var instanceof c ? (c) u1Var : null;
        if (cVar == null) {
            cVar = new c(E0, false, null);
        }
        synchronized (cVar) {
            if (cVar.g()) {
                o0Var2 = g2.f71041a;
                return o0Var2;
            }
            cVar.j(true);
            if (cVar != u1Var && !f69621b.compareAndSet(this, u1Var, cVar)) {
                o0Var = g2.f71043c;
                return o0Var;
            }
            if (s0.b() && !(!cVar.h())) {
                throw new AssertionError();
            }
            boolean e5 = cVar.e();
            d0 d0Var = obj instanceof d0 ? (d0) obj : null;
            if (d0Var != null) {
                cVar.a(d0Var.f70014a);
            }
            Throwable d5 = true ^ e5 ? cVar.d() : null;
            Unit unit = Unit.INSTANCE;
            if (d5 != null) {
                W0(E0, d5);
            }
            w w02 = w0(u1Var);
            if (w02 != null && r1(cVar, w02, obj)) {
                return g2.f71042b;
            }
            return v0(cVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(c cVar, w wVar, Object obj) {
        if (s0.b()) {
            if (!(G0() == cVar)) {
                throw new AssertionError();
            }
        }
        w V0 = V0(wVar);
        if (V0 == null || !r1(cVar, V0, obj)) {
            f0(v0(cVar, obj));
        }
    }

    private final boolean r1(c cVar, w wVar, Object obj) {
        while (z1.a.f(wVar.f71458f, false, false, new b(this, cVar, wVar, obj), 1, null) == m2.f71216b) {
            wVar = V0(wVar);
            if (wVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable s0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(o0(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((o2) obj).E();
    }

    public static /* synthetic */ JobCancellationException u0(JobSupport jobSupport, String str, Throwable th, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = null;
            }
            if ((i4 & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = jobSupport.o0();
            }
            return new JobCancellationException(str, th, jobSupport);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    private final Object v0(c cVar, Object obj) {
        boolean e5;
        Throwable B0;
        boolean z4 = true;
        if (s0.b()) {
            if (!(G0() == cVar)) {
                throw new AssertionError();
            }
        }
        if (!s0.b() || (!cVar.h())) {
            if (!s0.b() || cVar.g()) {
                d0 d0Var = obj instanceof d0 ? (d0) obj : null;
                Throwable th = d0Var == null ? null : d0Var.f70014a;
                synchronized (cVar) {
                    e5 = cVar.e();
                    List<Throwable> i4 = cVar.i(th);
                    B0 = B0(cVar, i4);
                    if (B0 != null) {
                        e0(B0, i4);
                    }
                }
                if (B0 != null && B0 != th) {
                    obj = new d0(B0, false, 2, null);
                }
                if (B0 != null) {
                    if (!n0(B0) && !H0(B0)) {
                        z4 = false;
                    }
                    if (z4) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        ((d0) obj).b();
                    }
                }
                if (!e5) {
                    Z0(B0);
                }
                a1(obj);
                boolean compareAndSet = f69621b.compareAndSet(this, cVar, g2.g(obj));
                if (!s0.b() || compareAndSet) {
                    q0(cVar, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final w w0(u1 u1Var) {
        w wVar = u1Var instanceof w ? (w) u1Var : null;
        if (wVar == null) {
            k2 f5 = u1Var.f();
            if (f5 == null) {
                return null;
            }
            return V0(f5);
        }
        return wVar;
    }

    public boolean C0() {
        return true;
    }

    public boolean D0() {
        return false;
    }

    @Override // kotlinx.coroutines.o2
    @NotNull
    public CancellationException E() {
        Throwable th;
        Object G0 = G0();
        if (G0 instanceof c) {
            th = ((c) G0).d();
        } else if (G0 instanceof d0) {
            th = ((d0) G0).f70014a;
        } else if (G0 instanceof u1) {
            throw new IllegalStateException(Intrinsics.stringPlus("Cannot be cancelling child in this state: ", G0).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new JobCancellationException(Intrinsics.stringPlus("Parent job is ", j1(G0)), th, this) : cancellationException;
    }

    @Nullable
    public final v F0() {
        return (v) this._parentHandle;
    }

    @Nullable
    public final Object G0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.g0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.g0) obj).c(this);
        }
    }

    protected boolean H0(@NotNull Throwable th) {
        return false;
    }

    public void I0(@NotNull Throwable th) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J0(@Nullable z1 z1Var) {
        if (s0.b()) {
            if (!(F0() == null)) {
                throw new AssertionError();
            }
        }
        if (z1Var == null) {
            h1(m2.f71216b);
            return;
        }
        z1Var.start();
        v X = z1Var.X(this);
        h1(X);
        if (isCompleted()) {
            X.dispose();
            h1(m2.f71216b);
        }
    }

    @Override // kotlinx.coroutines.z1
    @Nullable
    public final Object K(@NotNull Continuation<? super Unit> continuation) {
        if (!N0()) {
            c2.z(continuation.getContext());
            return Unit.INSTANCE;
        }
        Object O0 = O0(continuation);
        return O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? O0 : Unit.INSTANCE;
    }

    public final boolean L0() {
        return G0() instanceof d0;
    }

    protected boolean M0() {
        return false;
    }

    public final boolean R0(@Nullable Object obj) {
        Object p12;
        kotlinx.coroutines.internal.o0 o0Var;
        kotlinx.coroutines.internal.o0 o0Var2;
        do {
            p12 = p1(G0(), obj);
            o0Var = g2.f71041a;
            if (p12 == o0Var) {
                return false;
            }
            if (p12 == g2.f71042b) {
                return true;
            }
            o0Var2 = g2.f71043c;
        } while (p12 == o0Var2);
        f0(p12);
        return true;
    }

    @Nullable
    public final Object S0(@Nullable Object obj) {
        Object p12;
        kotlinx.coroutines.internal.o0 o0Var;
        kotlinx.coroutines.internal.o0 o0Var2;
        do {
            p12 = p1(G0(), obj);
            o0Var = g2.f71041a;
            if (p12 != o0Var) {
                o0Var2 = g2.f71043c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, A0(obj));
            }
        } while (p12 == o0Var2);
        return p12;
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public final kotlinx.coroutines.selects.c T() {
        return this;
    }

    @NotNull
    public String U0() {
        return t0.a(this);
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public final v X(@NotNull x xVar) {
        return (v) z1.a.f(this, true, false, new w(xVar), 2, null);
    }

    protected void Z0(@Nullable Throwable th) {
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        CancellationException l12 = th == null ? null : l1(this, th, null, 1, null);
        if (l12 == null) {
            l12 = new JobCancellationException(o0(), null, this);
        }
        l0(l12);
        return true;
    }

    protected void a1(@Nullable Object obj) {
    }

    @Override // kotlinx.coroutines.z1
    public void b(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(o0(), null, this);
        }
        l0(cancellationException);
    }

    protected void b1() {
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        z1.a.a(this);
    }

    public final <T, R> void e1(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object G0;
        do {
            G0 = G0();
            if (fVar.h()) {
                return;
            }
            if (!(G0 instanceof u1)) {
                if (fVar.q()) {
                    if (G0 instanceof d0) {
                        fVar.t(((d0) G0).f70014a);
                        return;
                    } else {
                        s3.b.d(function2, g2.o(G0), fVar.r());
                        return;
                    }
                }
                return;
            }
        } while (i1(G0) != 0);
        fVar.l(z(new v2(fVar, function2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f0(@Nullable Object obj) {
    }

    public final void f1(@NotNull f2 f2Var) {
        Object G0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var;
        do {
            G0 = G0();
            if (!(G0 instanceof f2)) {
                if (!(G0 instanceof u1) || ((u1) G0).f() == null) {
                    return;
                }
                f2Var.W();
                return;
            } else if (G0 != f2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f69621b;
                j1Var = g2.f71050j;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, G0, j1Var));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) z1.a.d(this, r4, function2);
    }

    public final <T, R> void g1(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object G0 = G0();
        if (G0 instanceof d0) {
            fVar.t(((d0) G0).f70014a);
        } else {
            s3.a.f(function2, g2.o(G0), fVar.r(), null, 4, null);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) z1.a.e(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return z1.f71466g1;
    }

    @Nullable
    public final Object h0(@NotNull Continuation<Object> continuation) {
        Object G0;
        do {
            G0 = G0();
            if (!(G0 instanceof u1)) {
                if (G0 instanceof d0) {
                    Throwable th = ((d0) G0).f70014a;
                    if (s0.e()) {
                        if (continuation instanceof CoroutineStackFrame) {
                            throw kotlinx.coroutines.internal.n0.o(th, (CoroutineStackFrame) continuation);
                        }
                        throw th;
                    }
                    throw th;
                }
                return g2.o(G0);
            }
        } while (i1(G0) < 0);
        return i0(continuation);
    }

    public final void h1(@Nullable v vVar) {
        this._parentHandle = vVar;
    }

    @Override // kotlinx.coroutines.selects.c
    public final <R> void i(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        Object G0;
        do {
            G0 = G0();
            if (fVar.h()) {
                return;
            }
            if (!(G0 instanceof u1)) {
                if (fVar.q()) {
                    s3.b.c(function1, fVar.r());
                    return;
                }
                return;
            }
        } while (i1(G0) != 0);
        fVar.l(z(new w2(fVar, function1)));
    }

    @Override // kotlinx.coroutines.z1
    public boolean isActive() {
        Object G0 = G0();
        return (G0 instanceof u1) && ((u1) G0).isActive();
    }

    @Override // kotlinx.coroutines.z1
    public final boolean isCancelled() {
        Object G0 = G0();
        return (G0 instanceof d0) || ((G0 instanceof c) && ((c) G0).e());
    }

    @Override // kotlinx.coroutines.z1
    public final boolean isCompleted() {
        return !(G0() instanceof u1);
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public final Sequence<z1> j() {
        Sequence<z1> sequence;
        sequence = SequencesKt__SequenceBuilderKt.sequence(new JobSupport$children$1(this, null));
        return sequence;
    }

    public final boolean j0(@Nullable Throwable th) {
        return k0(th);
    }

    public final boolean k0(@Nullable Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.o0 o0Var;
        kotlinx.coroutines.internal.o0 o0Var2;
        kotlinx.coroutines.internal.o0 o0Var3;
        obj2 = g2.f71041a;
        if (D0() && (obj2 = m0(obj)) == g2.f71042b) {
            return true;
        }
        o0Var = g2.f71041a;
        if (obj2 == o0Var) {
            obj2 = Q0(obj);
        }
        o0Var2 = g2.f71041a;
        if (obj2 == o0Var2 || obj2 == g2.f71042b) {
            return true;
        }
        o0Var3 = g2.f71044d;
        if (obj2 == o0Var3) {
            return false;
        }
        f0(obj2);
        return true;
    }

    @NotNull
    protected final CancellationException k1(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = o0();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    @Nullable
    public final Throwable l() {
        Object G0 = G0();
        if (!(G0 instanceof u1)) {
            return A0(G0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public void l0(@NotNull Throwable th) {
        k0(th);
    }

    @InternalCoroutinesApi
    @NotNull
    public final String m1() {
        return U0() + '{' + j1(G0()) + '}';
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return z1.a.g(this, key);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public String o0() {
        return "Job was cancelled";
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public final g1 p(boolean z4, boolean z5, @NotNull Function1<? super Throwable, Unit> function1) {
        f2 T0 = T0(function1, z4);
        while (true) {
            Object G0 = G0();
            if (G0 instanceof j1) {
                j1 j1Var = (j1) G0;
                if (j1Var.isActive()) {
                    if (f69621b.compareAndSet(this, G0, T0)) {
                        return T0;
                    }
                } else {
                    c1(j1Var);
                }
            } else {
                if (G0 instanceof u1) {
                    k2 f5 = ((u1) G0).f();
                    if (f5 == null) {
                        Objects.requireNonNull(G0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        d1((f2) G0);
                    } else {
                        g1 g1Var = m2.f71216b;
                        if (z4 && (G0 instanceof c)) {
                            synchronized (G0) {
                                r3 = ((c) G0).d();
                                if (r3 == null || ((function1 instanceof w) && !((c) G0).g())) {
                                    if (d0(G0, f5, T0)) {
                                        if (r3 == null) {
                                            return T0;
                                        }
                                        g1Var = T0;
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        if (r3 != null) {
                            if (z5) {
                                function1.invoke(r3);
                            }
                            return g1Var;
                        } else if (d0(G0, f5, T0)) {
                            return T0;
                        }
                    }
                } else {
                    if (z5) {
                        d0 d0Var = G0 instanceof d0 ? (d0) G0 : null;
                        function1.invoke(d0Var != null ? d0Var.f70014a : null);
                    }
                    return m2.f71216b;
                }
            }
        }
    }

    public boolean p0(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return k0(th) && C0();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return z1.a.h(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public final CancellationException r() {
        Object G0 = G0();
        if (!(G0 instanceof c)) {
            if (G0 instanceof u1) {
                throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
            }
            return G0 instanceof d0 ? l1(this, ((d0) G0).f70014a, null, 1, null) : new JobCancellationException(Intrinsics.stringPlus(t0.a(this), " has completed normally"), null, this);
        }
        Throwable d5 = ((c) G0).d();
        CancellationException k12 = d5 != null ? k1(d5, Intrinsics.stringPlus(t0.a(this), " is cancelling")) : null;
        if (k12 != null) {
            return k12;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
    }

    @Override // kotlinx.coroutines.z1
    public final boolean start() {
        int i12;
        do {
            i12 = i1(G0());
            if (i12 == 0) {
                return false;
            }
        } while (i12 != 1);
        return true;
    }

    @NotNull
    public final JobCancellationException t0(@Nullable String str, @Nullable Throwable th) {
        if (str == null) {
            str = o0();
        }
        return new JobCancellationException(str, th, this);
    }

    @NotNull
    public String toString() {
        return m1() + '@' + t0.b(this);
    }

    @Override // kotlinx.coroutines.x
    public final void v(@NotNull o2 o2Var) {
        k0(o2Var);
    }

    @Nullable
    public final Object x0() {
        Object G0 = G0();
        if (!(G0 instanceof u1)) {
            if (!(G0 instanceof d0)) {
                return g2.o(G0);
            }
            throw ((d0) G0).f70014a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public z1 y(@NotNull z1 z1Var) {
        return z1.a.i(this, z1Var);
    }

    @Nullable
    protected final Throwable y0() {
        Object G0 = G0();
        if (G0 instanceof c) {
            Throwable d5 = ((c) G0).d();
            if (d5 != null) {
                return d5;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
        } else if (!(G0 instanceof u1)) {
            if (G0 instanceof d0) {
                return ((d0) G0).f70014a;
            }
            return null;
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
        }
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public final g1 z(@NotNull Function1<? super Throwable, Unit> function1) {
        return p(false, true, function1);
    }

    protected final boolean z0() {
        Object G0 = G0();
        return (G0 instanceof d0) && ((d0) G0).a();
    }
}
