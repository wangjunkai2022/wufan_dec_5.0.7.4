package com.beizi.fusion.g;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: BeiZiThreadPool.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final int f6990a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f6991b;

    /* renamed from: c  reason: collision with root package name */
    private static final LinkedBlockingQueue<Runnable> f6992c;

    /* renamed from: d  reason: collision with root package name */
    private static final LinkedBlockingQueue<Runnable> f6993d;

    /* renamed from: e  reason: collision with root package name */
    private static final LinkedBlockingQueue<Runnable> f6994e;

    /* renamed from: f  reason: collision with root package name */
    private static final ArrayBlockingQueue<Runnable> f6995f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f6990a = availableProcessors;
        f6991b = Math.max((availableProcessors / 2) + 1, 4);
        f6992c = new LinkedBlockingQueue<>();
        f6993d = new LinkedBlockingQueue<>();
        f6994e = new LinkedBlockingQueue<>();
        f6995f = new ArrayBlockingQueue<>(200);
    }

    public static ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(2, f6991b, 5L, TimeUnit.SECONDS, f6992c, new k(5, "afAd-"), e());
    }

    public static ThreadPoolExecutor b() {
        return new ThreadPoolExecutor(2, f6991b, 5L, TimeUnit.SECONDS, f6993d, new k(5, "afHb-"), e());
    }

    public static ThreadPoolExecutor c() {
        return new ThreadPoolExecutor(2, 20, 20L, TimeUnit.SECONDS, f6995f, new k(5, "afFu-"), e());
    }

    public static ThreadPoolExecutor d() {
        return new ThreadPoolExecutor(2, f6991b, 20L, TimeUnit.SECONDS, f6994e, new k(5, "afIt-"), e());
    }

    public static RejectedExecutionHandler e() {
        return new RejectedExecutionHandler() { // from class: com.beizi.fusion.g.l.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }
}
