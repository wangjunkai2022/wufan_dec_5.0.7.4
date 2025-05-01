package kotlinx.coroutines.scheduling;

import kotlin.jvm.JvmName;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;
/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes7.dex */
public final class a {
    @JvmName(name = "isSchedulerWorker")
    public static final boolean a(@NotNull Thread thread) {
        return thread instanceof CoroutineScheduler.c;
    }

    @JvmName(name = "mayNotBlock")
    public static final boolean b(@NotNull Thread thread) {
        return (thread instanceof CoroutineScheduler.c) && ((CoroutineScheduler.c) thread).f71282c == CoroutineScheduler.WorkerState.CPU_ACQUIRED;
    }
}
