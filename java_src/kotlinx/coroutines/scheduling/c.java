package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.NotNull;
/* compiled from: Dispatcher.kt */
/* loaded from: classes7.dex */
public final class c extends h {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final c f71290h = new c();

    private c() {
        super(n.f71314c, n.f71315d, n.f71316e, n.f71312a);
    }

    @Override // kotlinx.coroutines.scheduling.h, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final void e0() {
        super.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}
