package com.facebook.imagepipeline.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PriorityThreadFactory.java */
/* loaded from: classes2.dex */
public class j implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final int f11821b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11822c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11823d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f11824e;

    /* compiled from: PriorityThreadFactory.java */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f11825b;

        a(Runnable runnable) {
            this.f11825b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(j.this.f11821b);
            } catch (Throwable unused) {
            }
            this.f11825b.run();
        }
    }

    public j(int i4) {
        this(i4, "PriorityThreadFactory", true);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.f11823d) {
            str = this.f11822c + "-" + this.f11824e.getAndIncrement();
        } else {
            str = this.f11822c;
        }
        return new Thread(aVar, str);
    }

    public j(int i4, String str, boolean z4) {
        this.f11824e = new AtomicInteger(1);
        this.f11821b = i4;
        this.f11822c = str;
        this.f11823d = z4;
    }
}
