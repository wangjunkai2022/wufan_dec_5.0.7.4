package com.switfpass.pay.activity.zxing.decoding;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f61661b;

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f61660a = Executors.newSingleThreadScheduledExecutor(new l((byte) 0));

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture f61662c = null;

    public c(Activity activity) {
        this.f61661b = activity;
        b();
    }

    private void a() {
        ScheduledFuture scheduledFuture = this.f61662c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f61662c = null;
        }
    }

    public final void b() {
        a();
        this.f61662c = this.f61660a.schedule(new b(this.f61661b), 300L, TimeUnit.SECONDS);
    }

    public final void c() {
        a();
        this.f61660a.shutdown();
    }
}
