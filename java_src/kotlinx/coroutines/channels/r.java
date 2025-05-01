package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ConflatedChannel.kt */
/* loaded from: classes6.dex */
public class r<E> extends AbstractChannel<E> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantLock f70008e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Object f70009f;

    public r(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f70008e = new ReentrantLock();
        this.f70009f = a.f69941c;
    }

    private final UndeliveredElementException r0(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.f70009f;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != a.f69941c && (function1 = this.f69948b) != null) {
            undeliveredElementException = OnUndeliveredElementKt.d(function1, obj2, null, 2, null);
        }
        this.f70009f = obj;
        return undeliveredElementException;
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.b
    @NotNull
    public Object C(E e5) {
        y<E> O;
        o0 v2;
        ReentrantLock reentrantLock = this.f70008e;
        reentrantLock.lock();
        try {
            p<?> n4 = n();
            if (n4 == null) {
                if (this.f70009f == a.f69941c) {
                    do {
                        O = O();
                        if (O != null) {
                            if (O instanceof p) {
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
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    O.j(e5);
                    return O.d();
                }
                UndeliveredElementException r02 = r0(e5);
                if (r02 == null) {
                    return a.f69942d;
                }
                throw r02;
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
        ReentrantLock reentrantLock = this.f70008e;
        reentrantLock.lock();
        try {
            p<?> n4 = n();
            if (n4 == null) {
                if (this.f70009f == a.f69941c) {
                    while (true) {
                        b.d<E> j4 = j(e5);
                        Object u4 = fVar.u(j4);
                        if (u4 == null) {
                            y<? super E> o4 = j4.o();
                            Unit unit = Unit.INSTANCE;
                            reentrantLock.unlock();
                            Intrinsics.checkNotNull(o4);
                            y<? super E> yVar = o4;
                            yVar.j(e5);
                            return yVar.d();
                        } else if (u4 == a.f69943e) {
                            break;
                        } else if (u4 != kotlinx.coroutines.internal.c.f71101b) {
                            if (u4 != kotlinx.coroutines.selects.g.d() && !(u4 instanceof p)) {
                                throw new IllegalStateException(Intrinsics.stringPlus("performAtomicTrySelect(describeTryOffer) returned ", u4).toString());
                            }
                            return u4;
                        }
                    }
                }
                if (!fVar.q()) {
                    return kotlinx.coroutines.selects.g.d();
                }
                UndeliveredElementException r02 = r0(e5);
                if (r02 == null) {
                    return a.f69942d;
                }
                throw r02;
            }
            return n4;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    public boolean b0(@NotNull x<? super E> xVar) {
        ReentrantLock reentrantLock = this.f70008e;
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

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean f0() {
        return this.f70009f == a.f69941c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    public void h0(boolean z4) {
        ReentrantLock reentrantLock = this.f70008e;
        reentrantLock.lock();
        try {
            UndeliveredElementException r02 = r0(a.f69941c);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.h0(z4);
            if (r02 != null) {
                throw r02;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f70008e;
        reentrantLock.lock();
        try {
            return g0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.b
    @NotNull
    protected String l() {
        return "(value=" + this.f70009f + ')';
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @Nullable
    protected Object l0() {
        ReentrantLock reentrantLock = this.f70008e;
        reentrantLock.lock();
        try {
            Object obj = this.f70009f;
            o0 o0Var = a.f69941c;
            if (obj != o0Var) {
                this.f70009f = o0Var;
                Unit unit = Unit.INSTANCE;
                return obj;
            }
            Object n4 = n();
            if (n4 == null) {
                n4 = a.f69944f;
            }
            return n4;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @Nullable
    protected Object m0(@NotNull kotlinx.coroutines.selects.f<?> fVar) {
        ReentrantLock reentrantLock = this.f70008e;
        reentrantLock.lock();
        try {
            Object obj = this.f70009f;
            o0 o0Var = a.f69941c;
            if (obj == o0Var) {
                Object n4 = n();
                if (n4 == null) {
                    n4 = a.f69944f;
                }
                return n4;
            } else if (!fVar.q()) {
                return kotlinx.coroutines.selects.g.d();
            } else {
                Object obj2 = this.f70009f;
                this.f70009f = o0Var;
                Unit unit = Unit.INSTANCE;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.b
    protected final boolean z() {
        return false;
    }
}
