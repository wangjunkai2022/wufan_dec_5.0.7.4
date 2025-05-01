package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class t1 implements u1 {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final k2 f71423b;

    public t1(@NotNull k2 k2Var) {
        this.f71423b = k2Var;
    }

    @Override // kotlinx.coroutines.u1
    @NotNull
    public k2 f() {
        return this.f71423b;
    }

    @Override // kotlinx.coroutines.u1
    public boolean isActive() {
        return false;
    }

    @NotNull
    public String toString() {
        return s0.d() ? f().i0("New") : super.toString();
    }
}
