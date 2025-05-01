package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
/* compiled from: Executors.kt */
/* loaded from: classes6.dex */
final class c1 implements Executor {
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f69670b;

    public c1(@NotNull CoroutineDispatcher coroutineDispatcher) {
        this.f69670b = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        this.f69670b.dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @NotNull
    public String toString() {
        return this.f69670b.toString();
    }
}
