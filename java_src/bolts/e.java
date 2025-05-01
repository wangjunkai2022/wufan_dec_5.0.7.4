package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: CancellationTokenSource.java */
/* loaded from: classes2.dex */
public class e implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final Object f268b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f269c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f270d = b.d();

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture<?> f271e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f272f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f273g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancellationTokenSource.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.f268b) {
                e.this.f271e = null;
            }
            e.this.cancel();
        }
    }

    private void g(long j4, TimeUnit timeUnit) {
        if (j4 < -1) {
            throw new IllegalArgumentException("Delay must be >= -1");
        }
        if (j4 == 0) {
            cancel();
            return;
        }
        synchronized (this.f268b) {
            if (this.f272f) {
                return;
            }
            h();
            if (j4 != -1) {
                this.f271e = this.f270d.schedule(new a(), j4, timeUnit);
            }
        }
    }

    private void h() {
        ScheduledFuture<?> scheduledFuture = this.f271e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f271e = null;
        }
    }

    private void l(List<d> list) {
        for (d dVar : list) {
            dVar.a();
        }
    }

    private void t() {
        if (this.f273g) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public void cancel() {
        synchronized (this.f268b) {
            t();
            if (this.f272f) {
                return;
            }
            h();
            this.f272f = true;
            l(new ArrayList(this.f269c));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f268b) {
            if (this.f273g) {
                return;
            }
            h();
            for (d dVar : this.f269c) {
                dVar.close();
            }
            this.f269c.clear();
            this.f273g = true;
        }
    }

    public void d(long j4) {
        g(j4, TimeUnit.MILLISECONDS);
    }

    public c j() {
        c cVar;
        synchronized (this.f268b) {
            t();
            cVar = new c(this);
        }
        return cVar;
    }

    public boolean k() {
        boolean z4;
        synchronized (this.f268b) {
            t();
            z4 = this.f272f;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d p(Runnable runnable) {
        d dVar;
        synchronized (this.f268b) {
            t();
            dVar = new d(this, runnable);
            if (this.f272f) {
                dVar.a();
            } else {
                this.f269c.add(dVar);
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() throws CancellationException {
        synchronized (this.f268b) {
            t();
            if (this.f272f) {
                throw new CancellationException();
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(d dVar) {
        synchronized (this.f268b) {
            t();
            this.f269c.remove(dVar);
        }
    }
}
