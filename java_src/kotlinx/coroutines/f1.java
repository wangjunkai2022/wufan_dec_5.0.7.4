package kotlinx.coroutines;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
/* compiled from: Executors.kt */
/* loaded from: classes6.dex */
final class f1 implements g1 {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Future<?> f70122b;

    public f1(@NotNull Future<?> future) {
        this.f70122b = future;
    }

    @Override // kotlinx.coroutines.g1
    public void dispose() {
        this.f70122b.cancel(false);
    }

    @NotNull
    public String toString() {
        return "DisposableFutureHandle[" + this.f70122b + ']';
    }
}
