package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
/* compiled from: EventLoop.kt */
/* loaded from: classes6.dex */
public final class h extends l1 {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Thread f71055g;

    public h(@NotNull Thread thread) {
        this.f71055g = thread;
    }

    @Override // kotlinx.coroutines.m1
    @NotNull
    protected Thread m0() {
        return this.f71055g;
    }
}
