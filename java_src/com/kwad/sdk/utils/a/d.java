package com.kwad.sdk.utils.a;

import com.kwad.sdk.utils.a.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class d {
    static c.d aTg;
    static volatile Executor aTh;
    static ExecutorService aTi = Executors.newSingleThreadExecutor();

    private d() {
    }

    public static void a(c.d dVar) {
        aTg = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor getExecutor() {
        if (aTh == null) {
            synchronized (d.class) {
                if (aTh == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    aTh = threadPoolExecutor;
                }
            }
        }
        return aTh;
    }

    public static void setExecutor(Executor executor) {
        if (executor != null) {
            aTh = executor;
        }
    }
}
