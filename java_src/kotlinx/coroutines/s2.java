package kotlinx.coroutines;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
/* compiled from: Executors.kt */
/* loaded from: classes6.dex */
final class s2 implements Runnable {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f71253b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final p<Unit> f71254c;

    /* JADX WARN: Multi-variable type inference failed */
    public s2(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull p<? super Unit> pVar) {
        this.f71253b = coroutineDispatcher;
        this.f71254c = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71254c.O(this.f71253b, Unit.INSTANCE);
    }
}
