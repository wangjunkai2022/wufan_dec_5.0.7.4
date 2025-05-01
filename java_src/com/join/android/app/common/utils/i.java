package com.join.android.app.common.utils;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: MThreadPoolExecutor.java */
/* loaded from: classes3.dex */
public class i extends ThreadPoolExecutor {

    /* renamed from: b  reason: collision with root package name */
    String f14878b;

    public i(int i4, int i5, long j4, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i4, i5, j4, timeUnit, blockingQueue);
        this.f14878b = getClass().getSimpleName();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("execute....getPoolSize()=");
        sb.append(getPoolSize());
        sb.append(";getActiveCount()=");
        sb.append(getActiveCount());
        sb.append(";getTaskCount()=");
        sb.append(getTaskCount());
        sb.append("getCorePoolSize()=");
        sb.append(getCorePoolSize());
        sb.append(";queue=");
        sb.append(getQueue().size());
        super.execute(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t4) {
        return super.submit(runnable, t4);
    }
}
