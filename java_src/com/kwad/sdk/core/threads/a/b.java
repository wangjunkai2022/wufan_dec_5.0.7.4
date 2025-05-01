package com.kwad.sdk.core.threads.a;

import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class b extends ThreadPoolExecutor implements c {
    public static volatile boolean aCh;
    private final ConcurrentHashMap<Runnable, Long> aCi;
    private long aCj;
    private int aCk;

    public b(int i4, int i5, long j4, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i4, i5, j4, timeUnit, blockingQueue, threadFactory);
        this.aCi = new ConcurrentHashMap<>();
        this.aCj = 0L;
        this.aCk = 0;
    }

    @Override // com.kwad.sdk.core.threads.a.c
    public final long GG() {
        return this.aCj;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (aCh && this.aCi.containsKey(runnable) && this.aCi.get(runnable) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.aCi.get(runnable).longValue();
            if (elapsedRealtime >= 0 && elapsedRealtime < 1800000) {
                long j4 = this.aCj;
                int i4 = this.aCk;
                this.aCj = ((j4 * i4) + elapsedRealtime) / (i4 + 1);
                this.aCk = i4 + 1;
            }
            this.aCi.remove(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (aCh) {
            this.aCi.put(runnable, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        super.execute(runnable);
    }

    public b(int i4, int i5, long j4, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i4, i5, j4, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.aCi = new ConcurrentHashMap<>();
        this.aCj = 0L;
        this.aCk = 0;
    }
}
