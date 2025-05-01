package com.join.mgps.zxing.decoding;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: InactivityTimer.java */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final int f55111d = 300;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55113b;

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f55112a = Executors.newSingleThreadScheduledExecutor(new b());

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f55114c = null;

    /* compiled from: InactivityTimer.java */
    /* loaded from: classes5.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    public g(Activity activity) {
        this.f55113b = activity;
        b();
    }

    private void a() {
        ScheduledFuture<?> scheduledFuture = this.f55114c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f55114c = null;
        }
    }

    public void b() {
        a();
        this.f55114c = this.f55112a.schedule(new f(this.f55113b), 300L, TimeUnit.SECONDS);
    }

    public void c() {
        a();
        this.f55112a.shutdown();
    }
}
