package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: UMExecutor.java */
/* loaded from: classes6.dex */
public class au {

    /* renamed from: a  reason: collision with root package name */
    private static final String f63366a = "UMExecutor";

    /* renamed from: b  reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f63367b;

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadFactory f63368c = new ThreadFactory() { // from class: com.umeng.analytics.pro.au.1

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f63369a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ccg-" + this.f63369a.incrementAndGet());
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f63367b == null) {
            synchronized (au.class) {
                if (f63367b == null) {
                    f63367b = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), f63368c);
                    f63367b.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f63367b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f63367b;
    }

    public static void a(Runnable runnable, long j4, TimeUnit timeUnit) {
        try {
            a().schedule(runnable, j4, timeUnit);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "schedule error:" + th.getMessage());
        }
    }
}
