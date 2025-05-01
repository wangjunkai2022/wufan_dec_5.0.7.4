package com.ss.android.socialbase.downloader.qv;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class vv implements ThreadFactory {

    /* renamed from: m  reason: collision with root package name */
    private final AtomicInteger f61365m;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f61366p;
    private final String vv;

    public vv(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f61365m.incrementAndGet();
        Thread thread = new Thread(runnable, this.vv + "-" + incrementAndGet);
        if (!this.f61366p) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public vv(String str, boolean z4) {
        this.f61365m = new AtomicInteger();
        this.vv = str;
        this.f61366p = z4;
    }
}
