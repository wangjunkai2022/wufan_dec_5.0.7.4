package com.facebook.common.executors;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
/* compiled from: ScheduledFutureImpl.java */
/* loaded from: classes.dex */
public class f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f10838b;

    /* renamed from: c  reason: collision with root package name */
    private final FutureTask<V> f10839c;

    public f(Handler handler, Callable<V> callable) {
        this.f10838b = handler;
        this.f10839c = new FutureTask<>(callable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return this.f10839c.cancel(z4);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.f10839c.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f10839c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f10839c.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f10839c.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f10839c.get(j4, timeUnit);
    }

    public f(Handler handler, Runnable runnable, @Nullable V v2) {
        this.f10838b = handler;
        this.f10839c = new FutureTask<>(runnable, v2);
    }
}
