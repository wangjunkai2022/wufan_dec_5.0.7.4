package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Job.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public final class m2 implements g1, v {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final m2 f71216b = new m2();

    private m2() {
    }

    @Override // kotlinx.coroutines.g1
    public void dispose() {
    }

    @Override // kotlinx.coroutines.v
    public boolean e(@NotNull Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.v
    @Nullable
    public z1 getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }
}
