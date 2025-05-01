package org.jboss.netty.util.internal;

import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: DeadLockProofWorker.java */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Executor> f72822a = new ThreadLocal<>();

    /* compiled from: DeadLockProofWorker.java */
    /* loaded from: classes7.dex */
    static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Executor f72823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f72824c;

        a(Executor executor, Runnable runnable) {
            this.f72823b = executor;
            this.f72824c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ThreadLocal<Executor> threadLocal = c.f72822a;
            threadLocal.set(this.f72823b);
            try {
                this.f72824c.run();
                threadLocal.remove();
            } catch (Throwable th) {
                c.f72822a.remove();
                throw th;
            }
        }
    }

    private c() {
    }

    public static void a(Executor executor, Runnable runnable) {
        Objects.requireNonNull(executor, "parent");
        Objects.requireNonNull(runnable, "runnable");
        executor.execute(new a(executor, runnable));
    }
}
