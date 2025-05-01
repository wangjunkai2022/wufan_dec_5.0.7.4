package kotlinx.coroutines.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LockFreeLinkedList.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public class LockFreeLinkedListNode {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f71070b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f71071c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71072d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    @NotNull
    volatile /* synthetic */ Object _next = this;
    @NotNull
    volatile /* synthetic */ Object _prev = this;
    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static abstract class a extends kotlinx.coroutines.internal.b {
        @Override // kotlinx.coroutines.internal.b
        public final void a(@NotNull kotlinx.coroutines.internal.d<?> dVar, @Nullable Object obj) {
            boolean z4 = obj == null;
            LockFreeLinkedListNode h4 = h();
            if (h4 == null) {
                if (kotlinx.coroutines.s0.b() && !(!z4)) {
                    throw new AssertionError();
                }
                return;
            }
            LockFreeLinkedListNode i4 = i();
            if (i4 == null) {
                if (kotlinx.coroutines.s0.b() && !(!z4)) {
                    throw new AssertionError();
                }
                return;
            }
            if (LockFreeLinkedListNode.f71070b.compareAndSet(h4, dVar, z4 ? n(h4, i4) : i4) && z4) {
                f(h4, i4);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
            if (kotlinx.coroutines.s0.b() == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
            if (r4 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
            if (r7 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
            return null;
         */
        @Override // kotlinx.coroutines.internal.b
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.d<?> r7) {
            /*
                r6 = this;
            L0:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r6.m(r7)
                if (r0 != 0) goto L9
                java.lang.Object r7 = kotlinx.coroutines.internal.c.f71101b
                return r7
            L9:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r7) goto Lf
                return r2
            Lf:
                boolean r3 = r7.h()
                if (r3 == 0) goto L16
                return r2
            L16:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.g0
                if (r3 == 0) goto L29
                kotlinx.coroutines.internal.g0 r1 = (kotlinx.coroutines.internal.g0) r1
                boolean r2 = r7.b(r1)
                if (r2 == 0) goto L25
                java.lang.Object r7 = kotlinx.coroutines.internal.c.f71101b
                return r7
            L25:
                r1.c(r0)
                goto L0
            L29:
                java.lang.Object r3 = r6.e(r0)
                if (r3 == 0) goto L30
                return r3
            L30:
                boolean r3 = r6.l(r0, r1)
                if (r3 == 0) goto L37
                goto L0
            L37:
                kotlinx.coroutines.internal.LockFreeLinkedListNode$d r3 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$d
                r4 = r1
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
                r3.<init>(r0, r4, r6)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f71070b
                boolean r4 = r4.compareAndSet(r0, r1, r3)
                if (r4 == 0) goto L0
                java.lang.Object r4 = r3.c(r0)     // Catch: java.lang.Throwable -> L65
                java.lang.Object r5 = kotlinx.coroutines.internal.x.f71156a     // Catch: java.lang.Throwable -> L65
                if (r4 != r5) goto L50
                goto L0
            L50:
                boolean r7 = kotlinx.coroutines.s0.b()     // Catch: java.lang.Throwable -> L65
                if (r7 == 0) goto L64
                if (r4 != 0) goto L5a
                r7 = 1
                goto L5b
            L5a:
                r7 = 0
            L5b:
                if (r7 == 0) goto L5e
                goto L64
            L5e:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
                r7.<init>()     // Catch: java.lang.Throwable -> L65
                throw r7     // Catch: java.lang.Throwable -> L65
            L64:
                return r2
            L65:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f71070b
                r2.compareAndSet(r0, r3, r1)
                goto L6d
            L6c:
                throw r7
            L6d:
                goto L6c
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.a.c(kotlinx.coroutines.internal.d):java.lang.Object");
        }

        @Nullable
        protected Object e(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            return null;
        }

        protected abstract void f(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2);

        public abstract void g(@NotNull d dVar);

        @Nullable
        protected abstract LockFreeLinkedListNode h();

        @Nullable
        protected abstract LockFreeLinkedListNode i();

        @Nullable
        public Object j(@NotNull d dVar) {
            g(dVar);
            return null;
        }

        public void k(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        }

        protected boolean l(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Object obj) {
            return false;
        }

        @Nullable
        protected LockFreeLinkedListNode m(@NotNull g0 g0Var) {
            LockFreeLinkedListNode h4 = h();
            Intrinsics.checkNotNull(h4);
            return h4;
        }

        @NotNull
        public abstract Object n(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2);
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static class b<T extends LockFreeLinkedListNode> extends a {

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f71073d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode;
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f71074b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final T f71075c;

        public b(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull T t4) {
            this.f71074b = lockFreeLinkedListNode;
            this.f71075c = t4;
            if (kotlinx.coroutines.s0.b()) {
                if (!(t4._next == t4 && t4._prev == t4)) {
                    throw new AssertionError();
                }
            }
            this._affectedNode = null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected void f(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            this.f71075c.K(this.f71074b);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public void g(@NotNull d dVar) {
            f71073d.compareAndSet(this, null, dVar.f71078a);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected final LockFreeLinkedListNode h() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @NotNull
        protected final LockFreeLinkedListNode i() {
            return this.f71074b;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected boolean l(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Object obj) {
            return obj != this.f71074b;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected final LockFreeLinkedListNode m(@NotNull g0 g0Var) {
            return this.f71074b.G(g0Var);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @NotNull
        public Object n(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            T t4 = this.f71075c;
            LockFreeLinkedListNode.f71071c.compareAndSet(t4, t4, lockFreeLinkedListNode);
            T t5 = this.f71075c;
            LockFreeLinkedListNode.f71070b.compareAndSet(t5, t5, this.f71074b);
            return this.f71075c;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @PublishedApi
    /* loaded from: classes6.dex */
    public static abstract class c extends kotlinx.coroutines.internal.d<LockFreeLinkedListNode> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f71076b;
        @JvmField
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public LockFreeLinkedListNode f71077c;

        public c(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f71076b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j */
        public void d(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @Nullable Object obj) {
            boolean z4 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z4 ? this.f71076b : this.f71077c;
            if (lockFreeLinkedListNode2 != null && LockFreeLinkedListNode.f71070b.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z4) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f71076b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f71077c;
                Intrinsics.checkNotNull(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.K(lockFreeLinkedListNode4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static final class d extends g0 {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final LockFreeLinkedListNode f71078a;
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f71079b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final a f71080c;

        public d(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2, @NotNull a aVar) {
            this.f71078a = lockFreeLinkedListNode;
            this.f71079b = lockFreeLinkedListNode2;
            this.f71080c = aVar;
        }

        @Override // kotlinx.coroutines.internal.g0
        @NotNull
        public kotlinx.coroutines.internal.d<?> a() {
            return this.f71080c.b();
        }

        @Override // kotlinx.coroutines.internal.g0
        @Nullable
        public Object c(@Nullable Object obj) {
            Object f5;
            Object obj2;
            if (kotlinx.coroutines.s0.b()) {
                if (!(obj == this.f71078a)) {
                    throw new AssertionError();
                }
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            Object j4 = this.f71080c.j(this);
            Object obj3 = x.f71156a;
            if (j4 == obj3) {
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.f71079b;
                if (LockFreeLinkedListNode.f71070b.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2.b0())) {
                    this.f71080c.k(lockFreeLinkedListNode);
                    lockFreeLinkedListNode2.G(null);
                }
                return obj3;
            }
            if (j4 != null) {
                f5 = a().e(j4);
            } else {
                f5 = a().f();
            }
            if (f5 == kotlinx.coroutines.internal.c.f71100a) {
                obj2 = a();
            } else if (f5 == null) {
                obj2 = this.f71080c.n(lockFreeLinkedListNode, this.f71079b);
            } else {
                obj2 = this.f71079b;
            }
            LockFreeLinkedListNode.f71070b.compareAndSet(lockFreeLinkedListNode, this, obj2);
            return null;
        }

        public final void d() {
            this.f71080c.g(this);
        }

        @Override // kotlinx.coroutines.internal.g0
        @NotNull
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static class e<T> extends a {

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f71081c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f71082d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @NotNull
        private volatile /* synthetic */ Object _originalNext = null;
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f71083b;

        public e(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f71083b = lockFreeLinkedListNode;
        }

        public static /* synthetic */ void p() {
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected Object e(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode == this.f71083b) {
                return w.d();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected final void f(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            lockFreeLinkedListNode2.G(null);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public void g(@NotNull d dVar) {
            f71081c.compareAndSet(this, null, dVar.f71078a);
            f71082d.compareAndSet(this, null, dVar.f71079b);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected final LockFreeLinkedListNode h() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected final LockFreeLinkedListNode i() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        protected final boolean l(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Object obj) {
            if (obj instanceof i0) {
                ((i0) obj).f71118a.S();
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @Nullable
        protected final LockFreeLinkedListNode m(@NotNull g0 g0Var) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f71083b;
            while (true) {
                Object obj = lockFreeLinkedListNode._next;
                if (obj instanceof g0) {
                    g0 g0Var2 = (g0) obj;
                    if (g0Var.b(g0Var2)) {
                        return null;
                    }
                    g0Var2.c(this.f71083b);
                } else {
                    return (LockFreeLinkedListNode) obj;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        @NotNull
        public final Object n(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
            return lockFreeLinkedListNode2.b0();
        }

        public final T o() {
            T t4 = (T) h();
            Intrinsics.checkNotNull(t4);
            return t4;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes6.dex */
    public static final class f extends c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f71085e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Boolean> function0) {
            super(LockFreeLinkedListNode.this);
            this.f71085e = function0;
        }

        @Override // kotlinx.coroutines.internal.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f71085e.invoke().booleanValue()) {
                return null;
            }
            return w.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (kotlinx.coroutines.internal.LockFreeLinkedListNode.f71070b.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.i0) r4).f71118a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode G(kotlinx.coroutines.internal.g0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f71071c
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.T()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.g0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.g0 r0 = (kotlinx.coroutines.internal.g0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.g0 r4 = (kotlinx.coroutines.internal.g0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.i0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f71070b
            kotlinx.coroutines.internal.i0 r4 = (kotlinx.coroutines.internal.i0) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f71118a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.G(kotlinx.coroutines.internal.g0):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    private final LockFreeLinkedListNode J(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.T()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
        }
        return lockFreeLinkedListNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (L() != lockFreeLinkedListNode) {
                return;
            }
        } while (!f71071c.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (T()) {
            lockFreeLinkedListNode.G(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 b0() {
        i0 i0Var = (i0) this._removedRef;
        if (i0Var == null) {
            i0 i0Var2 = new i0(this);
            f71072d.lazySet(this, i0Var2);
            return i0Var2;
        }
        return i0Var;
    }

    public final void A(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        do {
        } while (!Q().E(lockFreeLinkedListNode, this));
    }

    public final boolean B(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Function0<Boolean> function0) {
        int c02;
        f fVar = new f(function0);
        do {
            c02 = Q().c0(lockFreeLinkedListNode, this, fVar);
            if (c02 == 1) {
                return true;
            }
        } while (c02 != 2);
        return false;
    }

    public final boolean C(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Function1<? super LockFreeLinkedListNode, Boolean> function1) {
        LockFreeLinkedListNode Q;
        do {
            Q = Q();
            if (!function1.invoke(Q).booleanValue()) {
                return false;
            }
        } while (!Q.E(lockFreeLinkedListNode, this));
        return true;
    }

    public final boolean D(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Function1<? super LockFreeLinkedListNode, Boolean> function1, @NotNull Function0<Boolean> function0) {
        int c02;
        f fVar = new f(function0);
        do {
            LockFreeLinkedListNode Q = Q();
            if (!function1.invoke(Q).booleanValue()) {
                return false;
            }
            c02 = Q.c0(lockFreeLinkedListNode, this, fVar);
            if (c02 == 1) {
                return true;
            }
        } while (c02 != 2);
        return false;
    }

    @PublishedApi
    public final boolean E(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f71071c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71070b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            lockFreeLinkedListNode.K(lockFreeLinkedListNode2);
            return true;
        }
        return false;
    }

    public final boolean F(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        f71071c.lazySet(lockFreeLinkedListNode, this);
        f71070b.lazySet(lockFreeLinkedListNode, this);
        while (L() == this) {
            if (f71070b.compareAndSet(this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.K(this);
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final <T extends LockFreeLinkedListNode> b<T> H(@NotNull T t4) {
        return new b<>(this, t4);
    }

    @NotNull
    public final e<LockFreeLinkedListNode> I() {
        return new e<>(this);
    }

    @NotNull
    public final Object L() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof g0)) {
                return obj;
            }
            ((g0) obj).c(this);
        }
    }

    @NotNull
    public final LockFreeLinkedListNode M() {
        return w.h(L());
    }

    @NotNull
    public final LockFreeLinkedListNode Q() {
        LockFreeLinkedListNode G = G(null);
        return G == null ? J((LockFreeLinkedListNode) this._prev) : G;
    }

    public final void R() {
        ((i0) L()).f71118a.S();
    }

    @PublishedApi
    public final void S() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object L = lockFreeLinkedListNode.L();
            if (!(L instanceof i0)) {
                lockFreeLinkedListNode.G(null);
                return;
            }
            lockFreeLinkedListNode = ((i0) L).f71118a;
        }
    }

    public boolean T() {
        return L() instanceof i0;
    }

    @PublishedApi
    @NotNull
    public final c U(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull Function0<Boolean> function0) {
        return new f(function0);
    }

    @Nullable
    protected LockFreeLinkedListNode V() {
        Object L = L();
        i0 i0Var = L instanceof i0 ? (i0) L : null;
        if (i0Var == null) {
            return null;
        }
        return i0Var.f71118a;
    }

    public boolean W() {
        return a0() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    public final /* synthetic */ <T> T X(Function1<? super T, Boolean> function1) {
        LockFreeLinkedListNode a02;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) L();
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, "T");
            if (!(lockFreeLinkedListNode instanceof Object)) {
                return null;
            }
            if ((function1.invoke(lockFreeLinkedListNode).booleanValue() && !lockFreeLinkedListNode.T()) || (a02 = lockFreeLinkedListNode.a0()) == null) {
                return lockFreeLinkedListNode;
            }
            a02.S();
        }
    }

    @Nullable
    public final LockFreeLinkedListNode Z() {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) L();
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.W()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.R();
        }
    }

    @PublishedApi
    @Nullable
    public final LockFreeLinkedListNode a0() {
        Object L;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            L = L();
            if (L instanceof i0) {
                return ((i0) L).f71118a;
            }
            if (L == this) {
                return (LockFreeLinkedListNode) L;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) L;
        } while (!f71070b.compareAndSet(this, L, lockFreeLinkedListNode.b0()));
        lockFreeLinkedListNode.G(null);
        return null;
    }

    @PublishedApi
    public final int c0(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2, @NotNull c cVar) {
        f71071c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71070b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        cVar.f71077c = lockFreeLinkedListNode2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, cVar)) {
            return cVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void d0(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
        if (kotlinx.coroutines.s0.b()) {
            if (!(lockFreeLinkedListNode == this._prev)) {
                throw new AssertionError();
            }
        }
        if (kotlinx.coroutines.s0.b()) {
            if (!(lockFreeLinkedListNode2 == this._next)) {
                throw new AssertionError();
            }
        }
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return kotlinx.coroutines.t0.a(this.receiver);
            }
        } + '@' + kotlinx.coroutines.t0.b(this);
    }
}
