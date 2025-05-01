package com.beizi.ad.lance.a;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: BeiZiThreadPool.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int f6450a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f6451b;

    /* renamed from: c  reason: collision with root package name */
    private static final LinkedBlockingQueue<Runnable> f6452c;

    /* renamed from: d  reason: collision with root package name */
    private static final LinkedBlockingQueue<Runnable> f6453d;

    /* renamed from: e  reason: collision with root package name */
    private static final ArrayBlockingQueue<Runnable> f6454e;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f6450a = availableProcessors;
        f6451b = Math.max((availableProcessors / 2) + 1, 4);
        f6452c = new LinkedBlockingQueue<>();
        f6453d = new LinkedBlockingQueue<>();
        f6454e = new ArrayBlockingQueue<>(50);
    }

    public static ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(2, f6451b, 5L, TimeUnit.SECONDS, f6452c, new d(5, "BeiZi-adsdk-adrequest-thread-"), d());
    }

    public static ThreadPoolExecutor b() {
        return new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, f6453d, new d(5, "BeiZi-adsdk-heartbeat-thread-"), d());
    }

    public static ThreadPoolExecutor c() {
        return new ThreadPoolExecutor(2, 6, 20L, TimeUnit.SECONDS, f6454e, new d(5, "BeiZi-adsdk-file-log-upload-thread-"), d());
    }

    public static RejectedExecutionHandler d() {
        return new RejectedExecutionHandler() { // from class: com.beizi.ad.lance.a.e.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }
}
