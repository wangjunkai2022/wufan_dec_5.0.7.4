package com.kuaishou.weapon.p0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static volatile n f55615a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f55616b = 3;

    /* renamed from: c  reason: collision with root package name */
    private static int f55617c = 6;

    /* renamed from: d  reason: collision with root package name */
    private static ThreadPoolExecutor f55618d;

    private n() {
    }

    public static n a() {
        if (f55615a == null) {
            synchronized (n.class) {
                if (f55615a == null) {
                    f55615a = new n();
                }
                if (f55618d == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f55616b, f55617c, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(50), new RejectedExecutionHandler() { // from class: com.kuaishou.weapon.p0.n.1
                        @Override // java.util.concurrent.RejectedExecutionHandler
                        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        }
                    });
                    f55618d = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f55615a;
    }

    public static n a(int i4, int i5) {
        if (f55615a == null) {
            synchronized (n.class) {
                if (f55615a == null) {
                    f55616b = i4;
                    f55617c = i5;
                    f55615a = new n();
                    if (f55618d == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f55616b, f55617c, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(50), new RejectedExecutionHandler() { // from class: com.kuaishou.weapon.p0.n.2
                            @Override // java.util.concurrent.RejectedExecutionHandler
                            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                            }
                        });
                        f55618d = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                }
            }
        }
        return f55615a;
    }

    public void a(Runnable runnable) {
        if (runnable != null) {
            try {
                f55618d.execute(runnable);
            } catch (Exception unused) {
            }
        }
    }
}
