package com.facebook.common.executors;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ConstrainedExecutorService.java */
/* loaded from: classes2.dex */
public class b extends AbstractExecutorService {

    /* renamed from: i  reason: collision with root package name */
    private static final Class<?> f10828i = b.class;

    /* renamed from: b  reason: collision with root package name */
    private final String f10829b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f10830c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f10831d;

    /* renamed from: e  reason: collision with root package name */
    private final BlockingQueue<Runnable> f10832e;

    /* renamed from: f  reason: collision with root package name */
    private final RunnableC0252b f10833f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f10834g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f10835h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConstrainedExecutorService.java */
    /* renamed from: com.facebook.common.executors.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0252b implements Runnable {
        private RunnableC0252b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f10832e.poll();
                if (runnable == null) {
                    com.facebook.common.logging.a.V(b.f10828i, "%s: Worker has nothing to run", b.this.f10829b);
                } else {
                    runnable.run();
                }
                int decrementAndGet = b.this.f10834g.decrementAndGet();
                if (!b.this.f10832e.isEmpty()) {
                    b.this.h();
                } else {
                    com.facebook.common.logging.a.W(b.f10828i, "%s: worker finished; %d workers left", b.this.f10829b, Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th) {
                int decrementAndGet2 = b.this.f10834g.decrementAndGet();
                if (!b.this.f10832e.isEmpty()) {
                    b.this.h();
                } else {
                    com.facebook.common.logging.a.W(b.f10828i, "%s: worker finished; %d workers left", b.this.f10829b, Integer.valueOf(decrementAndGet2));
                }
                throw th;
            }
        }
    }

    public b(String str, int i4, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i4 > 0) {
            this.f10829b = str;
            this.f10830c = executor;
            this.f10831d = i4;
            this.f10832e = blockingQueue;
            this.f10833f = new RunnableC0252b();
            this.f10834g = new AtomicInteger(0);
            this.f10835h = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    public static b g(String str, int i4, int i5, Executor executor) {
        return new b(str, i4, executor, new LinkedBlockingQueue(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int i4 = this.f10834g.get();
        while (i4 < this.f10831d) {
            int i5 = i4 + 1;
            if (this.f10834g.compareAndSet(i4, i5)) {
                com.facebook.common.logging.a.X(f10828i, "%s: starting worker %d of %d", this.f10829b, Integer.valueOf(i5), Integer.valueOf(this.f10831d));
                this.f10830c.execute(this.f10833f);
                return;
            }
            com.facebook.common.logging.a.V(f10828i, "%s: race in startWorkerIfNeeded; retrying", this.f10829b);
            i4 = this.f10834g.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.f10832e.offer(runnable)) {
            int size = this.f10832e.size();
            int i4 = this.f10835h.get();
            if (size > i4 && this.f10835h.compareAndSet(i4, size)) {
                com.facebook.common.logging.a.W(f10828i, "%s: max pending work in queue = %d", this.f10829b, Integer.valueOf(size));
            }
            h();
            return;
        }
        throw new RejectedExecutionException(this.f10829b + " queue is full, size=" + this.f10832e.size());
    }

    public boolean f() {
        return this.f10832e.isEmpty() && this.f10834g.get() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
