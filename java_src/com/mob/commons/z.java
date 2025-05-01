package com.mob.commons;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final String f56517a = "M-" + com.mob.commons.a.l.a("002=glil");

    /* renamed from: b  reason: collision with root package name */
    public static final String f56518b = "M-" + com.mob.commons.a.l.a("003Jhmgfil");

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadPoolExecutor f56519c;

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadPoolExecutor f56520d;

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f56521e;

    /* renamed from: f  reason: collision with root package name */
    public static final ExecutorService f56522f;

    /* renamed from: g  reason: collision with root package name */
    public static final ExecutorService f56523g;

    /* loaded from: classes5.dex */
    private static class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                com.mob.commons.a.l.a().d(500L, runnable);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f56524a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        private final ThreadGroup f56525b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f56526c = new AtomicInteger(1);

        /* renamed from: d  reason: collision with root package name */
        private final String f56527d;

        b(int i4) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f56525b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            if (TextUtils.isEmpty("M-")) {
                this.f56527d = com.mob.commons.a.l.a("005kEelelJh>il") + f56524a.getAndIncrement() + com.mob.commons.a.l.a("008Mil'ji-ek8ge4edil");
                return;
            }
            this.f56527d = z.f56518b + i4 + "-" + f56524a.getAndIncrement() + "-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f56525b;
            Thread thread = new Thread(threadGroup, runnable, this.f56527d + this.f56526c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        int max = Math.max(2, 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f56519c = new ThreadPoolExecutor(2, max, 60L, timeUnit, new SynchronousQueue(), new b(0), new a());
        f56520d = new ThreadPoolExecutor(1, 1, 120L, timeUnit, new LinkedBlockingQueue(), new b(1));
        f56521e = Executors.newCachedThreadPool(new b(2));
        f56522f = Executors.newCachedThreadPool(new b(3));
        f56523g = Executors.newCachedThreadPool(new b(4));
    }
}
