package com.bytedance.sdk.openadsdk.o;

import com.bytedance.sdk.openadsdk.api.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class vv {
    private static volatile vv vv;

    /* renamed from: i  reason: collision with root package name */
    private volatile ThreadPoolExecutor f8964i;

    /* renamed from: m  reason: collision with root package name */
    private volatile ExecutorService f8965m;

    /* renamed from: p  reason: collision with root package name */
    private volatile ThreadPoolExecutor f8966p;

    private vv() {
    }

    private ExecutorService p() {
        if (this.f8964i == null) {
            this.f8964i = new ThreadPoolExecutor(2, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0227vv());
        }
        return this.f8964i;
    }

    private ExecutorService m() {
        if (this.f8966p == null) {
            this.f8966p = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0227vv("init"));
        }
        return this.f8966p;
    }

    public static vv vv() {
        if (vv == null) {
            synchronized (vv.class) {
                vv = new vv();
            }
        }
        return vv;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.o.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC0227vv implements ThreadFactory {

        /* renamed from: m  reason: collision with root package name */
        private final AtomicInteger f8967m;

        /* renamed from: p  reason: collision with root package name */
        private final String f8968p;
        private final ThreadGroup vv;

        ThreadFactoryC0227vv() {
            this.f8967m = new AtomicInteger(1);
            this.vv = new ThreadGroup("csj_api");
            this.f8968p = "csj_api";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.vv;
            Thread thread = new Thread(threadGroup, runnable, this.f8968p + "_" + this.f8967m.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 10) {
                thread.setPriority(10);
            }
            return thread;
        }

        ThreadFactoryC0227vv(String str) {
            this.f8967m = new AtomicInteger(1);
            this.vv = new ThreadGroup("csj_api");
            this.f8968p = "csj_api_".concat(String.valueOf(str));
        }
    }

    public void m(Runnable runnable) {
        if (runnable != null) {
            try {
                vv(false).execute(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void m(ExecutorService executorService) {
        executorService.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.o.vv.1
            @Override // java.lang.Runnable
            public void run() {
                if (vv.this.f8966p != null) {
                    try {
                        vv vvVar = vv.this;
                        vvVar.vv(vvVar.f8966p);
                        p.m("ApiThread", "release init pool!");
                    } catch (Throwable th) {
                        p.vv("ApiThread", "release mInitExecutor failed", th);
                    }
                    vv.this.f8966p = null;
                }
                if (vv.this.f8964i != null) {
                    try {
                        vv vvVar2 = vv.this;
                        vvVar2.vv(vvVar2.f8964i);
                        p.m("ApiThread", "release api pool!");
                    } catch (Throwable th2) {
                        p.vv("ApiThread", "release mApiExecutor failed", th2);
                    }
                    vv.this.f8964i = null;
                }
            }
        });
    }

    public void vv(Runnable runnable) {
        if (runnable != null) {
            try {
                vv(true).execute(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private ExecutorService vv(boolean z4) {
        if (this.f8965m == null) {
            return z4 ? m() : p();
        }
        return this.f8965m;
    }

    public void vv(ExecutorService executorService) {
        if (executorService != null) {
            this.f8965m = executorService;
            if (this.f8964i == null && this.f8966p == null) {
                return;
            }
            m(executorService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setKeepAliveTime(1L, TimeUnit.MILLISECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            if (threadPoolExecutor.getQueue().size() <= 0 && threadPoolExecutor.getActiveCount() == 0) {
                threadPoolExecutor.shutdown();
                return;
            }
        }
    }
}
