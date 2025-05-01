package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
/* compiled from: ThreadPoolDispatcher.kt */
/* loaded from: classes6.dex */
public final class f3 {
    @DelicateCoroutinesApi
    @NotNull
    public static final ExecutorCoroutineDispatcher b(final int i4, @NotNull final String str) {
        if (i4 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return r1.d(Executors.newScheduledThreadPool(i4, new ThreadFactory() { // from class: kotlinx.coroutines.e3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread c5;
                    c5 = f3.c(i4, str, atomicInteger, runnable);
                    return c5;
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i4 + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(int i4, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i4 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @DelicateCoroutinesApi
    @NotNull
    public static final ExecutorCoroutineDispatcher d(@NotNull String str) {
        return b(1, str);
    }
}
