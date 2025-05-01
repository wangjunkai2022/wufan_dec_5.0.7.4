package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f62729a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static w f62730b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledExecutorService f62731c;

    protected w() {
        this.f62731c = null;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory(this) { // from class: com.tencent.bugly.proguard.w.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + w.f62729a.getAndIncrement());
                return thread;
            }
        });
        this.f62731c = newScheduledThreadPool;
        if (newScheduledThreadPool == null || newScheduledThreadPool.isShutdown()) {
            x.d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (f62730b == null) {
                f62730b = new w();
            }
            wVar = f62730b;
        }
        return wVar;
    }

    public final synchronized void b() {
        ScheduledExecutorService scheduledExecutorService = this.f62731c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            x.c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f62731c.shutdownNow();
        }
    }

    public final synchronized boolean c() {
        boolean z4;
        ScheduledExecutorService scheduledExecutorService = this.f62731c;
        if (scheduledExecutorService != null) {
            z4 = scheduledExecutorService.isShutdown() ? false : true;
        }
        return z4;
    }

    public final synchronized boolean a(Runnable runnable, long j4) {
        if (!c()) {
            x.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        } else if (runnable == null) {
            x.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        } else {
            if (j4 <= 0) {
                j4 = 0;
            }
            x.c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j4), runnable.getClass().getName());
            this.f62731c.schedule(runnable, j4, TimeUnit.MILLISECONDS);
            return true;
        }
    }

    public final synchronized boolean a(Runnable runnable) {
        if (!c()) {
            x.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        } else if (runnable == null) {
            x.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        } else {
            x.c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
            this.f62731c.execute(runnable);
            return true;
        }
    }
}
