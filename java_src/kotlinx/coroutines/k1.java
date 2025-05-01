package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes6.dex */
public abstract class k1 extends CoroutineDispatcher {

    /* renamed from: b  reason: collision with root package name */
    private long f71194b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f71195c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private kotlinx.coroutines.internal.a<a1<?>> f71196d;

    public static /* synthetic */ void Z(k1 k1Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        k1Var.Y(z4);
    }

    private final long a0(boolean z4) {
        if (z4) {
            return IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
        return 1L;
    }

    public static /* synthetic */ void e0(k1 k1Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        k1Var.d0(z4);
    }

    public final void Y(boolean z4) {
        long a02 = this.f71194b - a0(z4);
        this.f71194b = a02;
        if (a02 > 0) {
            return;
        }
        if (s0.b()) {
            if (!(this.f71194b == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f71195c) {
            shutdown();
        }
    }

    public final void b0(@NotNull a1<?> a1Var) {
        kotlinx.coroutines.internal.a<a1<?>> aVar = this.f71196d;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f71196d = aVar;
        }
        aVar.a(a1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c0() {
        kotlinx.coroutines.internal.a<a1<?>> aVar = this.f71196d;
        return (aVar == null || aVar.d()) ? Long.MAX_VALUE : 0L;
    }

    public final void d0(boolean z4) {
        this.f71194b += a0(z4);
        if (z4) {
            return;
        }
        this.f71195c = true;
    }

    protected boolean f0() {
        return i0();
    }

    public final boolean h0() {
        return this.f71194b >= a0(true);
    }

    public final boolean i0() {
        kotlinx.coroutines.internal.a<a1<?>> aVar = this.f71196d;
        if (aVar == null) {
            return true;
        }
        return aVar.d();
    }

    public final boolean isActive() {
        return this.f71194b > 0;
    }

    public long j0() {
        return !k0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean k0() {
        a1<?> e5;
        kotlinx.coroutines.internal.a<a1<?>> aVar = this.f71196d;
        if (aVar == null || (e5 = aVar.e()) == null) {
            return false;
        }
        e5.run();
        return true;
    }

    public boolean l0() {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public final CoroutineDispatcher limitedParallelism(int i4) {
        kotlinx.coroutines.internal.s.a(i4);
        return this;
    }

    public void shutdown() {
    }
}
