package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Atomic.kt */
/* loaded from: classes6.dex */
public abstract class g0 {
    @Nullable
    public abstract d<?> a();

    public final boolean b(@NotNull g0 g0Var) {
        d<?> a5;
        d<?> a6 = a();
        return (a6 == null || (a5 = g0Var.a()) == null || a6.g() >= a5.g()) ? false : true;
    }

    @Nullable
    public abstract Object c(@Nullable Object obj);

    @NotNull
    public String toString() {
        return kotlinx.coroutines.t0.a(this) + '@' + kotlinx.coroutines.t0.b(this);
    }
}
