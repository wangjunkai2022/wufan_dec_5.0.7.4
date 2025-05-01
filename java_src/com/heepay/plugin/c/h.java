package com.heepay.plugin.c;

import android.os.Looper;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
public class h {

    /* renamed from: e  reason: collision with root package name */
    private static BlockingQueue<Runnable> f14388e = new ArrayBlockingQueue(10);

    /* renamed from: f  reason: collision with root package name */
    private static ThreadFactory f14389f = new ThreadFactory() { // from class: com.heepay.plugin.c.h.1

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f14390a = new AtomicInteger();

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "threadPool thread:" + this.f14390a.getAndIncrement());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private static int f14384a = 5;

    /* renamed from: b  reason: collision with root package name */
    private static int f14385b = 100;

    /* renamed from: c  reason: collision with root package name */
    private static int f14386c = 10000;

    /* renamed from: d  reason: collision with root package name */
    private static ThreadPoolExecutor f14387d = new ThreadPoolExecutor(f14384a, f14385b, f14386c, TimeUnit.SECONDS, f14388e, f14389f);

    public static void a(Runnable runnable) {
        f14387d.execute(runnable);
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
