package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public abstract class AbstractDataSource<T> implements c<T> {
    @GuardedBy("this")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private T f10947c = null;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private Throwable f10948d = null;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private float f10949e = 0.0f;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private boolean f10946b = false;
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private DataSourceStatus f10945a = DataSourceStatus.IN_PROGRESS;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f10950f = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f10952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f10953d;

        a(boolean z4, e eVar, boolean z5) {
            this.f10951b = z4;
            this.f10952c = eVar;
            this.f10953d = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10951b) {
                this.f10952c.b(AbstractDataSource.this);
            } else if (this.f10953d) {
                this.f10952c.a(AbstractDataSource.this);
            } else {
                this.f10952c.c(AbstractDataSource.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f10955b;

        b(e eVar) {
            this.f10955b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10955b.d(AbstractDataSource.this);
        }
    }

    private void j(e<T> eVar, Executor executor, boolean z4, boolean z5) {
        executor.execute(new a(z4, eVar, z5));
    }

    private void k() {
        boolean h4 = h();
        boolean r4 = r();
        Iterator<Pair<e<T>, Executor>> it2 = this.f10950f.iterator();
        while (it2.hasNext()) {
            Pair<e<T>, Executor> next = it2.next();
            j((e) next.first, (Executor) next.second, h4, r4);
        }
    }

    private synchronized boolean n(Throwable th) {
        if (!this.f10946b && this.f10945a == DataSourceStatus.IN_PROGRESS) {
            this.f10945a = DataSourceStatus.FAILURE;
            this.f10948d = th;
            return true;
        }
        return false;
    }

    private synchronized boolean p(float f5) {
        if (!this.f10946b && this.f10945a == DataSourceStatus.IN_PROGRESS) {
            if (f5 < this.f10949e) {
                return false;
            }
            this.f10949e = f5;
            return true;
        }
        return false;
    }

    private boolean q(@Nullable T t4, boolean z4) {
        T t5;
        T t6 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f10946b && this.f10945a == DataSourceStatus.IN_PROGRESS) {
                            if (z4) {
                                this.f10945a = DataSourceStatus.SUCCESS;
                                this.f10949e = 1.0f;
                            }
                            T t7 = this.f10947c;
                            if (t7 != t4) {
                                try {
                                    this.f10947c = t4;
                                    t5 = t7;
                                } catch (Throwable th) {
                                    th = th;
                                    t6 = t7;
                                    throw th;
                                }
                            } else {
                                t5 = null;
                            }
                            return true;
                        }
                        if (t4 != null) {
                            i(t4);
                        }
                        return false;
                    } catch (Throwable th2) {
                        t6 = t4;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (t6 != null) {
                i(t6);
            }
        }
    }

    private synchronized boolean r() {
        boolean z4;
        if (isClosed()) {
            z4 = c() ? false : true;
        }
        return z4;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean b() {
        return this.f10947c != null;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean c() {
        return this.f10945a != DataSourceStatus.IN_PROGRESS;
    }

    @Override // com.facebook.datasource.c
    public boolean close() {
        synchronized (this) {
            if (this.f10946b) {
                return false;
            }
            this.f10946b = true;
            T t4 = this.f10947c;
            this.f10947c = null;
            if (t4 != null) {
                i(t4);
            }
            if (!c()) {
                k();
            }
            synchronized (this) {
                this.f10950f.clear();
            }
            return true;
        }
    }

    @Override // com.facebook.datasource.c
    @Nullable
    public synchronized Throwable d() {
        return this.f10948d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(com.facebook.datasource.e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.internal.h.i(r3)
            com.facebook.common.internal.h.i(r4)
            monitor-enter(r2)
            boolean r0 = r2.f10946b     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r2.f10945a     // Catch: java.lang.Throwable -> L41
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.e<T>, java.util.concurrent.Executor>> r0 = r2.f10950f     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.b()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.r()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.h()
            boolean r1 = r2.r()
            r2.j(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.e(com.facebook.datasource.e, java.util.concurrent.Executor):void");
    }

    @Override // com.facebook.datasource.c
    public boolean f() {
        return false;
    }

    @Override // com.facebook.datasource.c
    @Nullable
    public synchronized T g() {
        return this.f10947c;
    }

    @Override // com.facebook.datasource.c
    public synchronized float getProgress() {
        return this.f10949e;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean h() {
        return this.f10945a == DataSourceStatus.FAILURE;
    }

    protected void i(@Nullable T t4) {
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean isClosed() {
        return this.f10946b;
    }

    protected void l() {
        Iterator<Pair<e<T>, Executor>> it2 = this.f10950f.iterator();
        while (it2.hasNext()) {
            Pair<e<T>, Executor> next = it2.next();
            ((Executor) next.second).execute(new b((e) next.first));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean m(Throwable th) {
        boolean n4 = n(th);
        if (n4) {
            k();
        }
        return n4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(float f5) {
        boolean p4 = p(f5);
        if (p4) {
            l();
        }
        return p4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setResult(@Nullable T t4, boolean z4) {
        boolean q4 = q(t4, z4);
        if (q4) {
            k();
        }
        return q4;
    }
}
