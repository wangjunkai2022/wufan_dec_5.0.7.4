package com.beizi.ad.lance.a;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: BeiZiThreadFactory.java */
/* loaded from: classes2.dex */
public class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f6445a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final ThreadGroup f6446b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f6447c = new AtomicInteger(1);

    /* renamed from: d  reason: collision with root package name */
    private final String f6448d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6449e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i4, String str) {
        ThreadGroup threadGroup;
        this.f6449e = i4;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.f6446b = threadGroup;
        if (TextUtils.isEmpty(str)) {
            this.f6448d = "BeiZi-adsdk-background-" + f6445a.getAndIncrement() + "-thread-";
            return;
        }
        this.f6448d = str + f6445a.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f6446b;
        Thread thread = new Thread(threadGroup, runnable, this.f6448d + this.f6447c.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (this.f6449e == 1) {
            thread.setPriority(1);
        } else if (thread.getPriority() != 5) {
            thread.setPriority(3);
        } else {
            thread.setPriority(5);
        }
        return thread;
    }
}
