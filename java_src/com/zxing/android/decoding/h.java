package com.zxing.android.decoding;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: InactivityTimer.java */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    private static final int f68762d = 300;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f68764b;

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f68763a = Executors.newSingleThreadScheduledExecutor(new b());

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f68765c = null;

    /* compiled from: InactivityTimer.java */
    /* loaded from: classes6.dex */
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

    public h(Activity activity) {
        this.f68764b = activity;
        b();
    }

    private void a() {
        ScheduledFuture<?> scheduledFuture = this.f68765c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f68765c = null;
        }
    }

    public void b() {
        a();
        this.f68765c = this.f68763a.schedule(new g(this.f68764b), 300L, TimeUnit.SECONDS);
    }

    public void c() {
        a();
        this.f68763a.shutdown();
    }
}
