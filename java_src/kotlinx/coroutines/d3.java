package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes6.dex */
public final class d3 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final d3 f70019a = new d3();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<k1> f70020b = new ThreadLocal<>();

    private d3() {
    }

    @Nullable
    public final k1 a() {
        return f70020b.get();
    }

    @NotNull
    public final k1 b() {
        ThreadLocal<k1> threadLocal = f70020b;
        k1 k1Var = threadLocal.get();
        if (k1Var == null) {
            k1 a5 = n1.a();
            threadLocal.set(a5);
            return a5;
        }
        return k1Var;
    }

    public final void c() {
        f70020b.set(null);
    }

    public final void d(@NotNull k1 k1Var) {
        f70020b.set(k1Var);
    }
}
