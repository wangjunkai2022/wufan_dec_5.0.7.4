package com.aggmoread.sdk.z.c.a.a.e;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f3507a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f3508b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f3509c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f3510d;

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f3511e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f3512f;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f3513g;

    /* renamed from: h  reason: collision with root package name */
    static final Executor f3514h;

    /* loaded from: classes2.dex */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f3515a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AMSdkThread # " + this.f3515a.getAndIncrement());
        }
    }

    /* loaded from: classes2.dex */
    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f3516a = new AtomicInteger(1);

        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AMSdkThread # cache-" + this.f3516a.getAndIncrement());
        }
    }

    /* loaded from: classes2.dex */
    static class c implements RejectedExecutionHandler {
        c() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            e.a("******Task rejected, too many task!");
        }
    }

    /* loaded from: classes2.dex */
    static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f3517b;

        d(Runnable runnable) {
            this.f3517b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb;
            String message;
            try {
                n.f3514h.execute(this.f3517b);
            } catch (InternalError e5) {
                sb = new StringBuilder();
                sb.append("internal  err ");
                message = e5.getMessage();
                sb.append(message);
                e.a(sb.toString());
            } catch (OutOfMemoryError e6) {
                sb = new StringBuilder();
                sb.append("ooe err ");
                message = e6.getMessage();
                sb.append(message);
                e.a(sb.toString());
            }
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f3508b = availableProcessors;
        int i4 = availableProcessors >= 4 ? 4 : 1;
        f3509c = i4;
        int i5 = availableProcessors >= 4 ? 4 : 1;
        f3510d = i5;
        a aVar = new a();
        f3511e = aVar;
        b bVar = new b();
        f3512f = bVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f3513g = linkedBlockingQueue;
        new ThreadPoolExecutor(i4, i5, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar, new c());
        f3514h = Executors.newCachedThreadPool(bVar);
    }

    public static Handler a() {
        if (f3507a == null) {
            synchronized (n.class) {
                if (f3507a == null) {
                    f3507a = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f3507a;
    }

    public static void a(Runnable runnable, long j4) {
        a().postDelayed(runnable, j4);
    }

    public static boolean a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
            return false;
        }
        a().post(runnable);
        return true;
    }

    public static void b() {
    }

    public static boolean b(Runnable runnable) {
        StringBuilder sb;
        String message;
        try {
            a(new d(runnable));
            return true;
        } catch (InternalError e5) {
            sb = new StringBuilder();
            sb.append("internal  err ");
            message = e5.getMessage();
            sb.append(message);
            e.a(sb.toString());
            return false;
        } catch (OutOfMemoryError e6) {
            sb = new StringBuilder();
            sb.append("ooe err ");
            message = e6.getMessage();
            sb.append(message);
            e.a(sb.toString());
            return false;
        }
    }
}
