package kotlinx.coroutines.internal;

import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ThreadContext.kt */
@PublishedApi
/* loaded from: classes6.dex */
public final class u0 implements CoroutineContext.Key<t0<?>> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final ThreadLocal<?> f71149b;

    public u0(@NotNull ThreadLocal<?> threadLocal) {
        this.f71149b = threadLocal;
    }

    private final ThreadLocal<?> a() {
        return this.f71149b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u0 c(u0 u0Var, ThreadLocal threadLocal, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            threadLocal = u0Var.f71149b;
        }
        return u0Var.b(threadLocal);
    }

    @NotNull
    public final u0 b(@NotNull ThreadLocal<?> threadLocal) {
        return new u0(threadLocal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.areEqual(this.f71149b, ((u0) obj).f71149b);
    }

    public int hashCode() {
        return this.f71149b.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f71149b + ')';
    }
}
