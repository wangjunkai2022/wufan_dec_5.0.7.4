package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
/* compiled from: Executors.kt */
/* loaded from: classes6.dex */
public final class r1 {
    @ExperimentalCoroutinesApi
    public static /* synthetic */ void a() {
    }

    @NotNull
    public static final Executor b(@NotNull CoroutineDispatcher coroutineDispatcher) {
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        Executor Y = executorCoroutineDispatcher != null ? executorCoroutineDispatcher.Y() : null;
        return Y == null ? new c1(coroutineDispatcher) : Y;
    }

    @JvmName(name = "from")
    @NotNull
    public static final CoroutineDispatcher c(@NotNull Executor executor) {
        c1 c1Var = executor instanceof c1 ? (c1) executor : null;
        CoroutineDispatcher coroutineDispatcher = c1Var != null ? c1Var.f69670b : null;
        return coroutineDispatcher == null ? new q1(executor) : coroutineDispatcher;
    }

    @JvmName(name = "from")
    @NotNull
    public static final ExecutorCoroutineDispatcher d(@NotNull ExecutorService executorService) {
        return new q1(executorService);
    }
}
