package com.kwad.sdk.utils;

import com.kwad.sdk.core.threads.GlobalThreadPools;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class g {
    private static volatile Executor aPy;
    private static volatile ScheduledExecutorService aPz;

    public static void execute(Runnable runnable) {
        if (aPy == null) {
            synchronized (g.class) {
                if (aPy == null) {
                    aPy = GlobalThreadPools.Gu();
                }
            }
        }
        aPy.execute(runnable);
    }

    public static void schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        if (aPz == null) {
            synchronized (g.class) {
                if (aPz == null) {
                    aPz = GlobalThreadPools.Gv();
                }
            }
        }
        aPz.schedule(runnable, j4, timeUnit);
    }
}
