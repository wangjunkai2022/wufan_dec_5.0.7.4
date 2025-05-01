package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ArrayChannel.kt */
/* loaded from: classes6.dex */
public class g<E> extends AbstractChannel<E> {

    /* renamed from: e  reason: collision with root package name */
    private final int f69968e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final BufferOverflow f69969f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final ReentrantLock f69970g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private Object[] f69971h;

    /* renamed from: i  reason: collision with root package name */
    private int f69972i;
    @NotNull
    private volatile /* synthetic */ int size;

    /* compiled from: ArrayChannel.kt */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g(int i4, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f69968e = i4;
        this.f69969f = bufferOverflow;
        if (i4 >= 1) {
            this.f69970g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i4, 8)];
            ArraysKt___ArraysJvmKt.fill$default(objArr, kotlinx.coroutines.channels.a.f69941c, 0, 0, 6, (Object) null);
            this.f69971h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i4 + " was specified").toString());
    }

    private final void r0(int i4, E e5) {
        if (i4 < this.f69968e) {
            s0(i4);
            Object[] objArr = this.f69971h;
            objArr[(this.f69972i + i4) % objArr.length] = e5;
            return;
        }
        if (s0.b()) {
            if (!(this.f69969f == BufferOverflow.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f69971h;
        int i5 = this.f69972i;
        objArr2[i5 % objArr2.length] = null;
        objArr2[(i4 + i5) % objArr2.length] = e5;
        this.f69972i = (i5 + 1) % objArr2.length;
    }

    private final void s0(int i4) {
        Object[] objArr = this.f69971h;
        if (i4 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f69968e);
            Object[] objArr2 = new Object[min];
            for (int i5 = 0; i5 < i4; i5++) {
                Object[] objArr3 = this.f69971h;
                objArr2[i5] = objArr3[(this.f69972i + i5) % objArr3.length];
            }
            ArraysKt___ArraysJvmKt.fill((o0[]) objArr2, kotlinx.coroutines.channels.a.f69941c, i4, min);
            this.f69971h = objArr2;
            this.f69972i = 0;
        }
    }

    private final o0 t0(int i4) {
        if (i4 < this.f69968e) {
            this.size = i4 + 1;
            return null;
        }
        int i5 = a.$EnumSwitchMapping$0[this.f69969f.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return kotlinx.coroutines.channels.a.f69942d;
        }
        return kotlinx.coroutines.channels.a.f69943e;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean A() {
        return this.size == this.f69968e && this.f69969f == BufferOverflow.SUSPEND;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @NotNull
    public Object C(E e5) {
        y<E> O;
        o0 v2;
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            p<?> n4 = n();
            if (n4 == null) {
                o0 t02 = t0(i4);
                if (t02 == null) {
                    if (i4 == 0) {
                        do {
                            O = O();
                            if (O != null) {
                                if (O instanceof p) {
                                    this.size = i4;
                                    return O;
                                }
                                v2 = O.v(e5, null);
                            }
                        } while (v2 == null);
                        if (s0.b()) {
                            if (!(v2 == kotlinx.coroutines.r.f71241d)) {
                                throw new AssertionError();
                            }
                        }
                        this.size = i4;
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                        O.j(e5);
                        return O.d();
                    }
                    r0(i4, e5);
                    return kotlinx.coroutines.channels.a.f69942d;
                }
                return t02;
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
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            p<?> n4 = n();
            if (n4 == null) {
                o0 t02 = t0(i4);
                if (t02 == null) {
                    if (i4 == 0) {
                        while (true) {
                            b.d<E> j4 = j(e5);
                            Object u4 = fVar.u(j4);
                            if (u4 == null) {
                                this.size = i4;
                                y<? super E> o4 = j4.o();
                                Unit unit = Unit.INSTANCE;
                                reentrantLock.unlock();
                                Intrinsics.checkNotNull(o4);
                                y<? super E> yVar = o4;
                                yVar.j(e5);
                                return yVar.d();
                            } else if (u4 == kotlinx.coroutines.channels.a.f69943e) {
                                break;
                            } else if (u4 != kotlinx.coroutines.internal.c.f71101b) {
                                if (u4 != kotlinx.coroutines.selects.g.d() && !(u4 instanceof p)) {
                                    throw new IllegalStateException(Intrinsics.stringPlus("performAtomicTrySelect(describeTryOffer) returned ", u4).toString());
                                }
                                this.size = i4;
                                return u4;
                            }
                        }
                    }
                    if (!fVar.q()) {
                        this.size = i4;
                        return kotlinx.coroutines.selects.g.d();
                    }
                    r0(i4, e5);
                    return kotlinx.coroutines.channels.a.f69942d;
                }
                return t02;
            }
            return n4;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    public boolean b0(@NotNull x<? super E> xVar) {
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            return super.b0(xVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean e0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean f() {
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            return super.f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean f0() {
        return this.size == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    public void h0(boolean z4) {
        Function1<E, Unit> function1 = this.f69948b;
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            int i5 = 0;
            while (i5 < i4) {
                i5++;
                Object obj = this.f69971h[this.f69972i];
                if (function1 != null && obj != kotlinx.coroutines.channels.a.f69941c) {
                    undeliveredElementException = OnUndeliveredElementKt.c(function1, obj, undeliveredElementException);
                }
                Object[] objArr = this.f69971h;
                int i6 = this.f69972i;
                objArr[i6] = kotlinx.coroutines.channels.a.f69941c;
                this.f69972i = (i6 + 1) % objArr.length;
            }
            this.size = 0;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.h0(z4);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            return g0();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @Nullable
    public Object k(@NotNull a0 a0Var) {
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            return super.k(a0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.b
    @NotNull
    protected String l() {
        return "(buffer:capacity=" + this.f69968e + ",size=" + this.size + ')';
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @Nullable
    protected Object l0() {
        ReentrantLock reentrantLock = this.f69970g;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            if (i4 == 0) {
                Object n4 = n();
                if (n4 == null) {
                    n4 = kotlinx.coroutines.channels.a.f69944f;
                }
                return n4;
            }
            Object[] objArr = this.f69971h;
            int i5 = this.f69972i;
            Object obj = objArr[i5];
            a0 a0Var = null;
            objArr[i5] = null;
            this.size = i4 - 1;
            Object obj2 = kotlinx.coroutines.channels.a.f69944f;
            if (i4 == this.f69968e) {
                a0 a0Var2 = null;
                while (true) {
                    a0 P = P();
                    if (P == null) {
                        a0Var = a0Var2;
                        break;
                    }
                    o0 h02 = P.h0(null);
                    if (h02 != null) {
                        if (s0.b()) {
                            if (!(h02 == kotlinx.coroutines.r.f71241d)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = P.f0();
                        a0Var = P;
                        r6 = true;
                    } else {
                        P.i0();
                        a0Var2 = P;
                    }
                }
            }
            if (obj2 != kotlinx.coroutines.channels.a.f69944f && !(obj2 instanceof p)) {
                this.size = i4;
                Object[] objArr2 = this.f69971h;
                objArr2[(this.f69972i + i4) % objArr2.length] = obj2;
            }
            this.f69972i = (this.f69972i + 1) % this.f69971h.length;
            Unit unit = Unit.INSTANCE;
            if (r6) {
                Intrinsics.checkNotNull(a0Var);
                a0Var.e0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #0 {all -> 0x00ba, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:33:0x0077, B:35:0x007b, B:37:0x007f, B:43:0x00a1, B:38:0x008b, B:40:0x0091, B:16:0x0043, B:19:0x0048, B:22:0x004d, B:24:0x0053, B:27:0x005f, B:30:0x0066, B:31:0x0075), top: B:52:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object m0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f69970g
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lba
            if (r1 != 0) goto L15
            kotlinx.coroutines.channels.p r9 = r8.n()     // Catch: java.lang.Throwable -> Lba
            if (r9 != 0) goto L11
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.a.f69944f     // Catch: java.lang.Throwable -> Lba
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f69971h     // Catch: java.lang.Throwable -> Lba
            int r3 = r8.f69972i     // Catch: java.lang.Throwable -> Lba
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lba
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lba
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lba
            kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.channels.a.f69944f     // Catch: java.lang.Throwable -> Lba
            int r3 = r8.f69968e     // Catch: java.lang.Throwable -> Lba
            r6 = 1
            if (r1 != r3) goto L76
        L29:
            kotlinx.coroutines.channels.AbstractChannel$g r3 = r8.Z()     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r7 = r9.u(r3)     // Catch: java.lang.Throwable -> Lba
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> Lba
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lba
            r2 = r5
            kotlinx.coroutines.channels.a0 r2 = (kotlinx.coroutines.channels.a0) r2     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r2 = r2.f0()     // Catch: java.lang.Throwable -> Lba
        L41:
            r3 = 1
            goto L77
        L43:
            kotlinx.coroutines.internal.o0 r3 = kotlinx.coroutines.channels.a.f69944f     // Catch: java.lang.Throwable -> Lba
            if (r7 != r3) goto L48
            goto L76
        L48:
            java.lang.Object r3 = kotlinx.coroutines.internal.c.f71101b     // Catch: java.lang.Throwable -> Lba
            if (r7 != r3) goto L4d
            goto L29
        L4d:
            java.lang.Object r2 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> Lba
            if (r7 != r2) goto L5f
            r8.size = r1     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r9 = r8.f69971h     // Catch: java.lang.Throwable -> Lba
            int r1 = r8.f69972i     // Catch: java.lang.Throwable -> Lba
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lba
            r0.unlock()
            return r7
        L5f:
            boolean r2 = r7 instanceof kotlinx.coroutines.channels.p     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto L66
            r2 = r7
            r5 = r2
            goto L41
        L66:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lba
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lba
            throw r9     // Catch: java.lang.Throwable -> Lba
        L76:
            r3 = 0
        L77:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.a.f69944f     // Catch: java.lang.Throwable -> Lba
            if (r2 == r7) goto L8b
            boolean r7 = r2 instanceof kotlinx.coroutines.channels.p     // Catch: java.lang.Throwable -> Lba
            if (r7 != 0) goto L8b
            r8.size = r1     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r9 = r8.f69971h     // Catch: java.lang.Throwable -> Lba
            int r7 = r8.f69972i     // Catch: java.lang.Throwable -> Lba
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lba
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lba
            goto La1
        L8b:
            boolean r9 = r9.q()     // Catch: java.lang.Throwable -> Lba
            if (r9 != 0) goto La1
            r8.size = r1     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r9 = r8.f69971h     // Catch: java.lang.Throwable -> Lba
            int r1 = r8.f69972i     // Catch: java.lang.Throwable -> Lba
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r9 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> Lba
            r0.unlock()
            return r9
        La1:
            int r9 = r8.f69972i     // Catch: java.lang.Throwable -> Lba
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f69971h     // Catch: java.lang.Throwable -> Lba
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lba
            int r9 = r9 % r1
            r8.f69972i = r9     // Catch: java.lang.Throwable -> Lba
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lba
            r0.unlock()
            if (r3 == 0) goto Lb9
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlinx.coroutines.channels.a0 r5 = (kotlinx.coroutines.channels.a0) r5
            r5.e0()
        Lb9:
            return r4
        Lba:
            r9 = move-exception
            r0.unlock()
            goto Lc0
        Lbf:
            throw r9
        Lc0:
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.g.m0(kotlinx.coroutines.selects.f):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean z() {
        return false;
    }
}
