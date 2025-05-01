package com.aggmoread.sdk.z.a.m;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    static final String f2335a = "m";

    /* renamed from: b  reason: collision with root package name */
    private static final int f2336b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f2337c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f2338d;

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f2339e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f2340f;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f2341g;

    /* renamed from: h  reason: collision with root package name */
    static final Executor f2342h;

    /* renamed from: i  reason: collision with root package name */
    private static Handler f2343i;

    /* loaded from: classes2.dex */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f2344a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AdSdk-api-Thread #" + this.f2344a.getAndIncrement());
        }
    }

    /* loaded from: classes2.dex */
    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f2345a = new AtomicInteger(1);

        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AdSdk-api-Thread2 #" + this.f2345a.getAndIncrement());
        }
    }

    /* loaded from: classes2.dex */
    static class c implements RejectedExecutionHandler {
        c() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            String str = m.f2335a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d extends Handler {
        public d() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                Pair pair = (Pair) message.obj;
                try {
                    ((Runnable) pair.first).run();
                } finally {
                    Object obj = pair.second;
                    if (obj != null) {
                        ((CountDownLatch) obj).countDown();
                    }
                }
            }
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f2336b = availableProcessors;
        int i4 = availableProcessors + 1;
        f2337c = i4;
        int i5 = (availableProcessors * 2) + 1;
        f2338d = i5;
        a aVar = new a();
        f2339e = aVar;
        b bVar = new b();
        f2340f = bVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f2341g = linkedBlockingQueue;
        new ThreadPoolExecutor(i4, i5, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar, new c());
        f2342h = Executors.newCachedThreadPool(bVar);
    }

    public static Handler a() {
        Handler handler;
        synchronized (m.class) {
            if (f2343i == null) {
                f2343i = new d();
            }
            handler = f2343i;
        }
        return handler;
    }

    public static void a(Runnable runnable) {
        f2342h.execute(runnable);
    }

    public static void a(Runnable runnable, boolean z4) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = z4 ? new CountDownLatch(1) : null;
        a().obtainMessage(1, new Pair(runnable, countDownLatch)).sendToTarget();
        if (z4) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void b(Runnable runnable) {
        a(runnable, false);
    }
}
