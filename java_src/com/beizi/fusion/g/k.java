package com.beizi.fusion.g;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: BeiZiThreadFactory.java */
/* loaded from: classes2.dex */
public class k implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f6985a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final ThreadGroup f6986b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f6987c = new AtomicInteger(1);

    /* renamed from: d  reason: collision with root package name */
    private final String f6988d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6989e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(int i4, String str) {
        ThreadGroup threadGroup;
        this.f6989e = i4;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.f6986b = threadGroup;
        if (TextUtils.isEmpty(str)) {
            this.f6988d = "afBg-" + f6985a.getAndIncrement() + "Td-";
            return;
        }
        this.f6988d = str + f6985a.getAndIncrement() + "Td-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f6986b;
        Thread thread = new Thread(threadGroup, runnable, this.f6988d + this.f6987c.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (this.f6989e == 1) {
            thread.setPriority(1);
        } else if (thread.getPriority() != 5) {
            thread.setPriority(3);
        } else {
            thread.setPriority(5);
        }
        return thread;
    }
}
