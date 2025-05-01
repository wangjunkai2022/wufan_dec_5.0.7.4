package com.efs.sdk.launch;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10481a = "com.efs.sdk.launch.a";

    /* renamed from: b  reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f10482b;

    /* renamed from: c  reason: collision with root package name */
    private static ThreadFactory f10483c = new ThreadFactory() { // from class: com.efs.sdk.launch.a.1

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f10484a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("LaunchThreadPoolExecutor" + this.f10484a.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f10482b == null) {
            synchronized (a.class) {
                if (f10482b == null) {
                    f10482b = new ScheduledThreadPoolExecutor(4, f10483c);
                }
            }
        }
        return f10482b;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
