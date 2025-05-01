package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DefaultExecutor.kt */
/* loaded from: classes6.dex */
public final class u0 extends l1 implements Runnable {
    @Nullable
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final u0 f71444g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final String f71445h = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: i  reason: collision with root package name */
    private static final long f71446i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private static final long f71447j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f71448k = 0;

    /* renamed from: l  reason: collision with root package name */
    private static final int f71449l = 1;

    /* renamed from: m  reason: collision with root package name */
    private static final int f71450m = 2;

    /* renamed from: n  reason: collision with root package name */
    private static final int f71451n = 3;

    /* renamed from: o  reason: collision with root package name */
    private static final int f71452o = 4;

    static {
        Long l4;
        u0 u0Var = new u0();
        f71444g = u0Var;
        k1.e0(u0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f71447j = timeUnit.toNanos(l4.longValue());
    }

    private u0() {
    }

    private final synchronized void C0() {
        if (H0()) {
            debugStatus = 3;
            v0();
            notifyAll();
        }
    }

    private final synchronized Thread D0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f71445h);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void F0() {
    }

    private final boolean G0() {
        return debugStatus == 4;
    }

    private final boolean H0() {
        int i4 = debugStatus;
        return i4 == 2 || i4 == 3;
    }

    private final synchronized boolean J0() {
        if (H0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void L0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.l1, kotlinx.coroutines.y0
    @NotNull
    public g1 A(long j4, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return z0(j4, runnable);
    }

    public final synchronized void E0() {
        boolean z4 = true;
        if (s0.b()) {
            if (!(_thread == null)) {
                throw new AssertionError();
            }
        }
        if (s0.b()) {
            if (debugStatus != 0 && debugStatus != 3) {
                z4 = false;
            }
            throw new AssertionError();
        }
        debugStatus = 0;
        D0();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean I0() {
        return _thread != null;
    }

    public final synchronized void M0(long j4) {
        Unit unit;
        long currentTimeMillis = System.currentTimeMillis() + j4;
        if (!H0()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
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
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            wait(j4);
        }
        debugStatus = 0;
    }

    @Override // kotlinx.coroutines.m1
    @NotNull
    protected Thread m0() {
        Thread thread = _thread;
        return thread == null ? D0() : thread;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.m1
    public void n0(long j4, @NotNull l1.c cVar) {
        L0();
    }

    @Override // java.lang.Runnable
    public void run() {
        Unit unit;
        boolean f02;
        d3.f70019a.d(this);
        b b5 = c.b();
        if (b5 != null) {
            b5.d();
        }
        try {
            if (!J0()) {
                if (f02) {
                    return;
                }
                return;
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long j02 = j0();
                if (j02 == Long.MAX_VALUE) {
                    b b6 = c.b();
                    Long valueOf = b6 == null ? null : Long.valueOf(b6.b());
                    long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
                    if (j4 == Long.MAX_VALUE) {
                        j4 = f71447j + nanoTime;
                    }
                    long j5 = j4 - nanoTime;
                    if (j5 <= 0) {
                        _thread = null;
                        C0();
                        b b7 = c.b();
                        if (b7 != null) {
                            b7.h();
                        }
                        if (f0()) {
                            return;
                        }
                        m0();
                        return;
                    }
                    j02 = RangesKt___RangesKt.coerceAtMost(j02, j5);
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (j02 > 0) {
                    if (H0()) {
                        _thread = null;
                        C0();
                        b b8 = c.b();
                        if (b8 != null) {
                            b8.h();
                        }
                        if (f0()) {
                            return;
                        }
                        m0();
                        return;
                    }
                    b b9 = c.b();
                    if (b9 == null) {
                        unit = null;
                    } else {
                        b9.c(this, j02);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, j02);
                    }
                }
            }
        } finally {
            _thread = null;
            C0();
            b b10 = c.b();
            if (b10 != null) {
                b10.h();
            }
            if (!f0()) {
                m0();
            }
        }
    }

    @Override // kotlinx.coroutines.l1
    public void s0(@NotNull Runnable runnable) {
        if (G0()) {
            L0();
        }
        super.s0(runnable);
    }

    @Override // kotlinx.coroutines.l1, kotlinx.coroutines.k1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
