package com.kwad.sdk.core.threads;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public final class GlobalThreadPools {
    private static String TAG;
    private static final int aBJ;
    private static final int aBK;
    private static final int aBL;
    private static Map<String, WeakReference<ExecutorService>> aBM;
    private static Map<String, Integer> aBN;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.core.threads.GlobalThreadPools$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] aBO;

        static {
            int[] iArr = new int[ParamType.values().length];
            aBO = iArr;
            try {
                iArr[ParamType.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aBO[ParamType.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                aBO[ParamType.KEEP_ALIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes5.dex */
    enum ParamType {
        CORE,
        MAX,
        KEEP_ALIVE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface a {
        @NonNull
        ExecutorService Gz();
    }

    /* loaded from: classes5.dex */
    static class b implements a {
        private b() {
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        @NonNull
        public final ExecutorService Gz() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("httpIO", ParamType.CORE, GlobalThreadPools.aBK), GlobalThreadPools.a("httpIO", ParamType.MAX, GlobalThreadPools.aBL), GlobalThreadPools.a("httpIO", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "diskAndHttp"));
        }

        /* synthetic */ b(byte b5) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static class c implements a {
        private c() {
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        @NonNull
        public final ExecutorService Gz() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("imageLoaderDistributor", ParamType.CORE, 0), GlobalThreadPools.a("imageLoaderDistributor", ParamType.MAX, 10), GlobalThreadPools.a("imageLoaderDistributor", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new SynchronousQueue(), new d(5, "uil-pool-d-"), new ThreadPoolExecutor.DiscardPolicy());
        }

        /* synthetic */ c(byte b5) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static class d implements ThreadFactory {
        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private final String namePrefix;
        private final int threadPriority;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final ThreadGroup group = Thread.currentThread().getThreadGroup();

        public d(int i4, String str) {
            this.threadPriority = i4;
            this.namePrefix = "ksad-" + str + poolNumber.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.group;
            Thread thread = new Thread(threadGroup, runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.threadPriority);
            return thread;
        }
    }

    /* loaded from: classes5.dex */
    static class e implements a {
        private e() {
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        @NonNull
        public final ExecutorService Gz() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("ksImageLoaderTask", ParamType.CORE, 3), GlobalThreadPools.a("ksImageLoaderTask", ParamType.MAX, 3), GlobalThreadPools.a("ksImageLoaderTask", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "uil-pool-"));
        }

        /* synthetic */ e(byte b5) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static class f implements a {
        private f() {
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        @NonNull
        public final ExecutorService Gz() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("lruDiskCache", ParamType.CORE, 0), GlobalThreadPools.a("lruDiskCache", ParamType.MAX, 1), GlobalThreadPools.a("lruDiskCache", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "lruDiskCache"));
        }

        /* synthetic */ f(byte b5) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static class g implements a {
        private g() {
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        @NonNull
        public final ExecutorService Gz() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("report", ParamType.CORE, 1), GlobalThreadPools.a("report", ParamType.MAX, 1), GlobalThreadPools.a("report", ParamType.KEEP_ALIVE, 0), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(3, "report-"));
        }

        /* synthetic */ g(byte b5) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static class h implements a {
        private h() {
        }

        @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
        @NonNull
        public final ExecutorService Gz() {
            return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("videoCache", ParamType.CORE, 3), GlobalThreadPools.a("videoCache", ParamType.MAX, 3), GlobalThreadPools.a("videoCache", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "videoCache"));
        }

        /* synthetic */ h(byte b5) {
            this();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        aBJ = availableProcessors;
        int i4 = availableProcessors > 0 ? availableProcessors + 4 : 9;
        aBK = i4;
        aBL = i4;
        TAG = "GlobalThreadPools";
        aBM = new ConcurrentHashMap();
        aBN = new ConcurrentHashMap();
    }

    public static void Gk() {
        for (String str : aBM.keySet()) {
            if (aBM.get(str).get() instanceof ThreadPoolExecutor) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) aBM.get(str).get();
                int corePoolSize = threadPoolExecutor.getCorePoolSize();
                int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int keepAliveTime = (int) threadPoolExecutor.getKeepAliveTime(timeUnit);
                int a5 = a(str, ParamType.CORE, corePoolSize);
                int a6 = a(str, ParamType.MAX, maximumPoolSize);
                try {
                    threadPoolExecutor.setKeepAliveTime(a(str, ParamType.KEEP_ALIVE, keepAliveTime), timeUnit);
                } catch (IllegalArgumentException e5) {
                    e5.printStackTrace();
                }
                if (corePoolSize != a5 || maximumPoolSize != a6) {
                    if (corePoolSize <= a6) {
                        threadPoolExecutor.setMaximumPoolSize(a6);
                        threadPoolExecutor.setCorePoolSize(a5);
                    } else if (a5 <= maximumPoolSize) {
                        threadPoolExecutor.setCorePoolSize(a5);
                        threadPoolExecutor.setMaximumPoolSize(a6);
                    }
                }
            }
        }
    }

    public static ExecutorService Gl() {
        return a("lruDiskCache", new f((byte) 0));
    }

    public static synchronized ExecutorService Gm() {
        ExecutorService a5;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forKsImageLoaderTask");
            a5 = a("ksImageLoaderTask", new e((byte) 0));
        }
        return a5;
    }

    public static synchronized ExecutorService Gn() {
        ExecutorService a5;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forKsImageLoaderCachedImages");
            a5 = a("ksImageLoaderTask", new e((byte) 0));
        }
        return a5;
    }

    public static ExecutorService Go() {
        com.kwad.sdk.core.e.c.d(TAG, "forKsImageLoaderTaskDistributor");
        return a("imageLoaderDistributor", new c((byte) 0));
    }

    public static synchronized ExecutorService Gp() {
        ExecutorService a5;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forBaseBatchReporter");
            a5 = a("report", new g((byte) 0));
        }
        return a5;
    }

    public static synchronized ExecutorService Gq() {
        ExecutorService a5;
        synchronized (GlobalThreadPools.class) {
            com.kwad.sdk.core.e.c.d(TAG, "forAdReportManager");
            a5 = a("report", new g((byte) 0));
        }
        return a5;
    }

    public static ExecutorService Gr() {
        com.kwad.sdk.core.e.c.d(TAG, "forBaseNetwork");
        return a("httpIO", new b((byte) 0));
    }

    public static ExecutorService Gs() {
        com.kwad.sdk.core.e.c.d(TAG, "forHttpCacheServer");
        return a("videoCache", new h((byte) 0));
    }

    public static ExecutorService Gt() {
        com.kwad.sdk.core.e.c.d(TAG, "forAppStatusHelper");
        return new com.kwad.sdk.core.threads.a.b(a("lruDiskCache", ParamType.CORE, 1), a("lruDiskCache", ParamType.MAX, 1), a("lruDiskCache", ParamType.KEEP_ALIVE, 0), TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.kwad.sdk.core.threads.GlobalThreadPools.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "ksad-ashelper");
                thread.setPriority(3);
                return thread;
            }
        });
    }

    public static ExecutorService Gu() {
        com.kwad.sdk.core.e.c.d(TAG, "forAsync");
        return a("async", new a() { // from class: com.kwad.sdk.core.threads.GlobalThreadPools.2
            @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
            @NonNull
            public final ExecutorService Gz() {
                return new com.kwad.sdk.core.threads.a.b(GlobalThreadPools.a("async", ParamType.CORE, 3), GlobalThreadPools.a("async", ParamType.MAX, 3), GlobalThreadPools.a("async", ParamType.KEEP_ALIVE, 60), TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(5, "async"));
            }
        });
    }

    public static ScheduledExecutorService Gv() {
        com.kwad.sdk.core.e.c.d(TAG, "forAsyncSchedule");
        ExecutorService a5 = a("async-schedule", new a() { // from class: com.kwad.sdk.core.threads.GlobalThreadPools.3
            @Override // com.kwad.sdk.core.threads.GlobalThreadPools.a
            @NonNull
            public final ExecutorService Gz() {
                return new com.kwad.sdk.core.threads.a.a(1, new d(5, "async-schedule"));
            }
        });
        if (a5 instanceof ScheduledExecutorService) {
            return (ScheduledExecutorService) a5;
        }
        return new com.kwad.sdk.core.threads.a.a(1, new d(5, "async-schedule"));
    }

    public static Set<String> Gw() {
        return aBM.keySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(String str, ParamType paramType, int i4) {
        String str2;
        int i5 = AnonymousClass4.aBO[paramType.ordinal()];
        if (i5 == 1) {
            str2 = str + "_core";
        } else if (i5 == 2) {
            str2 = str + "_max";
        } else if (i5 != 3) {
            return i4;
        } else {
            str2 = str + "_keep_alive";
        }
        return (!aBN.containsKey(str2) || aBN.get(str2) == null) ? i4 : aBN.get(str2).intValue();
    }

    public static ExecutorService eD(String str) {
        if (!aBM.containsKey(str) || aBM.get(str) == null) {
            return null;
        }
        return aBM.get(str).get();
    }

    public static void q(String str, int i4) {
        aBN.put(str, Integer.valueOf(i4));
    }

    @NonNull
    private static ExecutorService a(String str, @NonNull a aVar) {
        WeakReference<ExecutorService> weakReference = aBM.get(str);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        ExecutorService Gz = aVar.Gz();
        aBM.put(str, new WeakReference<>(Gz));
        return Gz;
    }
}
