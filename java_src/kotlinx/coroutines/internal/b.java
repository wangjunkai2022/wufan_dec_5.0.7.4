package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Atomic.kt */
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public d<?> f71099a;

    public abstract void a(@NotNull d<?> dVar, @Nullable Object obj);

    @NotNull
    public final d<?> b() {
        d<?> dVar = this.f71099a;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("atomicOp");
        return null;
    }

    @Nullable
    public abstract Object c(@NotNull d<?> dVar);

    public final void d(@NotNull d<?> dVar) {
        this.f71099a = dVar;
    }
}
