package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: classes6.dex */
public final class g<T> extends a<T> {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Thread f71039d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final k1 f71040e;

    public g(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable k1 k1Var) {
        super(coroutineContext, true, true);
        this.f71039d = thread;
        this.f71040e = k1Var;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean M0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public void f0(@Nullable Object obj) {
        Unit unit;
        if (Intrinsics.areEqual(Thread.currentThread(), this.f71039d)) {
            return;
        }
        Thread thread = this.f71039d;
        b b5 = c.b();
        if (b5 == null) {
            unit = null;
        } else {
            b5.g(thread);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            LockSupport.unpark(thread);
        }
    }

    public final T x1() {
        Unit unit;
        b b5 = c.b();
        if (b5 != null) {
            b5.d();
        }
        try {
            k1 k1Var = this.f71040e;
            if (k1Var != null) {
                k1.e0(k1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                k1 k1Var2 = this.f71040e;
                long j02 = k1Var2 == null ? Long.MAX_VALUE : k1Var2.j0();
                if (isCompleted()) {
                    k1 k1Var3 = this.f71040e;
                    if (k1Var3 != null) {
                        k1.Z(k1Var3, false, 1, null);
                    }
                    T t4 = (T) g2.o(G0());
                    d0 d0Var = t4 instanceof d0 ? (d0) t4 : null;
                    if (d0Var == null) {
                        return t4;
                    }
                    throw d0Var.f70014a;
                }
                b b6 = c.b();
                if (b6 == null) {
                    unit = null;
                } else {
                    b6.c(this, j02);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    LockSupport.parkNanos(this, j02);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            j0(interruptedException);
            throw interruptedException;
        } finally {
            b b7 = c.b();
            if (b7 != null) {
                b7.h();
            }
        }
    }
}
