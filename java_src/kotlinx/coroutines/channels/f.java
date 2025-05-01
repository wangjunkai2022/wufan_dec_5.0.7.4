package kotlinx.coroutines.channels;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ArrayBroadcastChannel.kt */
/* loaded from: classes.dex */
public final class f<E> extends b<E> implements h<E> {
    @NotNull
    private volatile /* synthetic */ long _head;
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    private volatile /* synthetic */ long _tail;

    /* renamed from: e  reason: collision with root package name */
    private final int f69962e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f69963f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Object[] f69964g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final List<a<E>> f69965h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ArrayBroadcastChannel.kt */
    /* loaded from: classes6.dex */
    public static final class a<E> extends AbstractChannel<E> implements ReceiveChannel<E> {
        @NotNull
        private volatile /* synthetic */ long _subHead;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final f<E> f69966e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final ReentrantLock f69967f;

        public a(@NotNull f<E> fVar) {
            super(null);
            this.f69966e = fVar;
            this.f69967f = new ReentrantLock();
            this._subHead = 0L;
        }

        private final boolean t0() {
            if (m() != null) {
                return false;
            }
            return (f0() && this.f69966e.m() == null) ? false : true;
        }

        private final Object u0() {
            long s02 = s0();
            p<?> m4 = this.f69966e.m();
            if (s02 >= this.f69966e.e0()) {
                if (m4 == null) {
                    m4 = m();
                }
                return m4 == null ? kotlinx.coroutines.channels.a.f69944f : m4;
            }
            Object Z = this.f69966e.Z(s02);
            p<?> m5 = m();
            return m5 != null ? m5 : Z;
        }

        @Override // kotlinx.coroutines.channels.b
        protected boolean A() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.b0
        public boolean R(@Nullable Throwable th) {
            boolean R = super.R(th);
            if (R) {
                f.j0(this.f69966e, null, this, 1, null);
                ReentrantLock reentrantLock = this.f69967f;
                reentrantLock.lock();
                try {
                    v0(this.f69966e.e0());
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return R;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean e0() {
            return false;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean f0() {
            return s0() >= this.f69966e.e0();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
        @Override // kotlinx.coroutines.channels.AbstractChannel
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object l0() {
            /*
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.f69967f
                r0.lock()
                java.lang.Object r1 = r8.u0()     // Catch: java.lang.Throwable -> L46
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.p     // Catch: java.lang.Throwable -> L46
                r3 = 1
                if (r2 == 0) goto Lf
                goto L13
            Lf:
                kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.channels.a.f69944f     // Catch: java.lang.Throwable -> L46
                if (r1 != r2) goto L15
            L13:
                r2 = 0
                goto L20
            L15:
                long r4 = r8.s0()     // Catch: java.lang.Throwable -> L46
                r6 = 1
                long r4 = r4 + r6
                r8.v0(r4)     // Catch: java.lang.Throwable -> L46
                r2 = 1
            L20:
                r0.unlock()
                boolean r0 = r1 instanceof kotlinx.coroutines.channels.p
                r4 = 0
                if (r0 == 0) goto L2c
                r0 = r1
                kotlinx.coroutines.channels.p r0 = (kotlinx.coroutines.channels.p) r0
                goto L2d
            L2c:
                r0 = r4
            L2d:
                if (r0 != 0) goto L30
                goto L35
            L30:
                java.lang.Throwable r0 = r0.f69995e
                r8.R(r0)
            L35:
                boolean r0 = r8.r0()
                if (r0 == 0) goto L3c
                goto L3d
            L3c:
                r3 = r2
            L3d:
                if (r3 == 0) goto L45
                kotlinx.coroutines.channels.f<E> r0 = r8.f69966e
                r2 = 3
                kotlinx.coroutines.channels.f.j0(r0, r4, r4, r2, r4)
            L45:
                return r1
            L46:
                r1 = move-exception
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.f.a.l0():java.lang.Object");
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @Nullable
        protected Object m0(@NotNull kotlinx.coroutines.selects.f<?> fVar) {
            ReentrantLock reentrantLock = this.f69967f;
            reentrantLock.lock();
            try {
                Object u02 = u0();
                boolean z4 = false;
                if (!(u02 instanceof p) && u02 != kotlinx.coroutines.channels.a.f69944f) {
                    if (!fVar.q()) {
                        u02 = kotlinx.coroutines.selects.g.d();
                    } else {
                        v0(s0() + 1);
                        z4 = true;
                    }
                }
                reentrantLock.unlock();
                p pVar = u02 instanceof p ? (p) u02 : null;
                if (pVar != null) {
                    R(pVar.f69995e);
                }
                if (r0() ? true : z4) {
                    f.j0(this.f69966e, null, null, 3, null);
                }
                return u02;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final boolean r0() {
            p pVar;
            boolean z4 = false;
            while (true) {
                pVar = null;
                if (!t0() || !this.f69967f.tryLock()) {
                    break;
                }
                try {
                    E e5 = (E) u0();
                    if (e5 != kotlinx.coroutines.channels.a.f69944f) {
                        if (e5 instanceof p) {
                            pVar = (p) e5;
                            break;
                        }
                        y<E> O = O();
                        if (O != null && !(O instanceof p)) {
                            o0 v2 = O.v(e5, null);
                            if (v2 != null) {
                                if (s0.b()) {
                                    if (!(v2 == kotlinx.coroutines.r.f71241d)) {
                                        throw new AssertionError();
                                    }
                                }
                                v0(s0() + 1);
                                this.f69967f.unlock();
                                O.j(e5);
                                z4 = true;
                            }
                        }
                    }
                } finally {
                    this.f69967f.unlock();
                }
            }
            if (pVar != null) {
                R(pVar.f69995e);
            }
            return z4;
        }

        public final long s0() {
            return this._subHead;
        }

        public final void v0(long j4) {
            this._subHead = j4;
        }

        @Override // kotlinx.coroutines.channels.b
        protected boolean z() {
            throw new IllegalStateException("Should not be used".toString());
        }
    }

    public f(int i4) {
        super(null);
        this.f69962e = i4;
        if (i4 >= 1) {
            this.f69963f = new ReentrantLock();
            this.f69964g = new Object[i4];
            this._head = 0L;
            this._tail = 0L;
            this._size = 0;
            this.f69965h = kotlinx.coroutines.internal.f.d();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + a0() + " was specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.coroutines.channels.h
    /* renamed from: W */
    public final boolean a(Throwable th) {
        boolean R = R(th);
        for (a<E> aVar : this.f69965h) {
            aVar.a(th);
        }
        return R;
    }

    private final void X() {
        boolean z4 = false;
        boolean z5 = false;
        for (a<E> aVar : this.f69965h) {
            if (aVar.r0()) {
                z4 = true;
            }
            z5 = true;
        }
        if (z4 || !z5) {
            j0(this, null, null, 3, null);
        }
    }

    private final long Y() {
        long j4 = Long.MAX_VALUE;
        for (a<E> aVar : this.f69965h) {
            j4 = RangesKt___RangesKt.coerceAtMost(j4, aVar.s0());
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E Z(long j4) {
        return (E) this.f69964g[(int) (j4 % this.f69962e)];
    }

    private final long b0() {
        return this._head;
    }

    private final int c0() {
        return this._size;
    }

    private static /* synthetic */ void d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e0() {
        return this._tail;
    }

    private final void f0(long j4) {
        this._head = j4;
    }

    private final void g0(int i4) {
        this._size = i4;
    }

    private final void h0(long j4) {
        this._tail = j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i0(kotlinx.coroutines.channels.f.a<E> r14, kotlinx.coroutines.channels.f.a<E> r15) {
        /*
            r13 = this;
            r0 = 0
        L1:
            java.util.concurrent.locks.ReentrantLock r1 = r13.f69963f
            r1.lock()
            if (r14 == 0) goto L23
            long r2 = r13.e0()     // Catch: java.lang.Throwable -> L20
            r14.v0(r2)     // Catch: java.lang.Throwable -> L20
            java.util.List<kotlinx.coroutines.channels.f$a<E>> r2 = r13.f69965h     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L20
            java.util.List<kotlinx.coroutines.channels.f$a<E>> r3 = r13.f69965h     // Catch: java.lang.Throwable -> L20
            r3.add(r14)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L23
            r1.unlock()
            return
        L20:
            r14 = move-exception
            goto Ld0
        L23:
            if (r15 == 0) goto L3a
            java.util.List<kotlinx.coroutines.channels.f$a<E>> r14 = r13.f69965h     // Catch: java.lang.Throwable -> L20
            r14.remove(r15)     // Catch: java.lang.Throwable -> L20
            long r2 = r13.b0()     // Catch: java.lang.Throwable -> L20
            long r14 = r15.s0()     // Catch: java.lang.Throwable -> L20
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 == 0) goto L3a
            r1.unlock()
            return
        L3a:
            long r14 = r13.Y()     // Catch: java.lang.Throwable -> L20
            long r2 = r13.e0()     // Catch: java.lang.Throwable -> L20
            long r4 = r13.b0()     // Catch: java.lang.Throwable -> L20
            long r14 = kotlin.ranges.RangesKt.coerceAtMost(r14, r2)     // Catch: java.lang.Throwable -> L20
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 > 0) goto L52
            r1.unlock()
            return
        L52:
            int r6 = r13.c0()     // Catch: java.lang.Throwable -> L20
        L56:
            int r7 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r7 >= 0) goto Lcc
            java.lang.Object[] r7 = r13.f69964g     // Catch: java.lang.Throwable -> L20
            int r8 = r13.a0()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            long r8 = r4 % r8
            int r9 = (int) r8     // Catch: java.lang.Throwable -> L20
            r7[r9] = r0     // Catch: java.lang.Throwable -> L20
            int r7 = r13.a0()     // Catch: java.lang.Throwable -> L20
            r8 = 0
            r9 = 1
            if (r6 < r7) goto L70
            r7 = 1
            goto L71
        L70:
            r7 = 0
        L71:
            r10 = 1
            long r4 = r4 + r10
            r13.f0(r4)     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + (-1)
            r13.g0(r6)     // Catch: java.lang.Throwable -> L20
            if (r7 == 0) goto L56
        L7e:
            kotlinx.coroutines.channels.a0 r7 = r13.P()     // Catch: java.lang.Throwable -> L20
            if (r7 != 0) goto L85
            goto L56
        L85:
            boolean r12 = r7 instanceof kotlinx.coroutines.channels.p     // Catch: java.lang.Throwable -> L20
            if (r12 == 0) goto L8a
            goto L56
        L8a:
            kotlinx.coroutines.internal.o0 r12 = r7.h0(r0)     // Catch: java.lang.Throwable -> L20
            if (r12 == 0) goto L7e
            boolean r14 = kotlinx.coroutines.s0.b()     // Catch: java.lang.Throwable -> L20
            if (r14 == 0) goto La4
            kotlinx.coroutines.internal.o0 r14 = kotlinx.coroutines.r.f71241d     // Catch: java.lang.Throwable -> L20
            if (r12 != r14) goto L9b
            r8 = 1
        L9b:
            if (r8 == 0) goto L9e
            goto La4
        L9e:
            java.lang.AssertionError r14 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L20
            r14.<init>()     // Catch: java.lang.Throwable -> L20
            throw r14     // Catch: java.lang.Throwable -> L20
        La4:
            java.lang.Object[] r14 = r13.f69964g     // Catch: java.lang.Throwable -> L20
            int r15 = r13.a0()     // Catch: java.lang.Throwable -> L20
            long r4 = (long) r15     // Catch: java.lang.Throwable -> L20
            long r4 = r2 % r4
            int r15 = (int) r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r7.f0()     // Catch: java.lang.Throwable -> L20
            r14[r15] = r4     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + 1
            r13.g0(r6)     // Catch: java.lang.Throwable -> L20
            long r2 = r2 + r10
            r13.h0(r2)     // Catch: java.lang.Throwable -> L20
            kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            r1.unlock()
            r7.e0()
            r13.X()
            r14 = r0
            r15 = r14
            goto L1
        Lcc:
            r1.unlock()
            return
        Ld0:
            r1.unlock()
            goto Ld5
        Ld4:
            throw r14
        Ld5:
            goto Ld4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.f.i0(kotlinx.coroutines.channels.f$a, kotlinx.coroutines.channels.f$a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void j0(f fVar, a aVar, a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        if ((i4 & 2) != 0) {
            aVar2 = null;
        }
        fVar.i0(aVar, aVar2);
    }

    @Override // kotlinx.coroutines.channels.b
    protected boolean A() {
        return c0() >= this.f69962e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @NotNull
    public Object C(E e5) {
        ReentrantLock reentrantLock = this.f69963f;
        reentrantLock.lock();
        try {
            p<?> n4 = n();
            if (n4 == null) {
                int c02 = c0();
                if (c02 >= a0()) {
                    return kotlinx.coroutines.channels.a.f69943e;
                }
                long e02 = e0();
                this.f69964g[(int) (e02 % a0())] = e5;
                g0(c02 + 1);
                h0(e02 + 1);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                X();
                return kotlinx.coroutines.channels.a.f69942d;
            }
            return n4;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @NotNull
    public Object D(E e5, @NotNull kotlinx.coroutines.selects.f<?> fVar) {
        ReentrantLock reentrantLock = this.f69963f;
        reentrantLock.lock();
        try {
            p<?> n4 = n();
            if (n4 == null) {
                int c02 = c0();
                if (c02 >= a0()) {
                    return kotlinx.coroutines.channels.a.f69943e;
                }
                if (!fVar.q()) {
                    return kotlinx.coroutines.selects.g.d();
                }
                long e02 = e0();
                this.f69964g[(int) (e02 % a0())] = e5;
                g0(c02 + 1);
                h0(e02 + 1);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                X();
                return kotlinx.coroutines.channels.a.f69942d;
            }
            return n4;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.b0
    public boolean R(@Nullable Throwable th) {
        if (super.R(th)) {
            X();
            return true;
        }
        return false;
    }

    public final int a0() {
        return this.f69962e;
    }

    @Override // kotlinx.coroutines.channels.h
    public void b(@Nullable CancellationException cancellationException) {
        a(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.b
    @NotNull
    protected String l() {
        return "(buffer:capacity=" + this.f69964g.length + ",size=" + c0() + ')';
    }

    @Override // kotlinx.coroutines.channels.h
    @NotNull
    public ReceiveChannel<E> q() {
        a aVar = new a(this);
        j0(this, aVar, null, 2, null);
        return aVar;
    }

    @Override // kotlinx.coroutines.channels.b
    protected boolean z() {
        return false;
    }
}
