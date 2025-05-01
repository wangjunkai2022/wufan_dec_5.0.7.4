package com.danikula.videocache;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProxyCache.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: i  reason: collision with root package name */
    private static final int f10127i = 1;

    /* renamed from: a  reason: collision with root package name */
    private final q f10128a;

    /* renamed from: b  reason: collision with root package name */
    private final c f10129b;

    /* renamed from: f  reason: collision with root package name */
    private volatile Thread f10133f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f10134g;

    /* renamed from: c  reason: collision with root package name */
    private final Object f10130c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f10131d = new Object();

    /* renamed from: h  reason: collision with root package name */
    private volatile int f10135h = -1;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f10132e = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProxyCache.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.k();
        }
    }

    public o(q qVar, c cVar) {
        this.f10128a = (q) n.d(qVar);
        this.f10129b = (c) n.d(cVar);
    }

    private void b() throws ProxyCacheException {
        int i4 = this.f10132e.get();
        if (i4 < 1) {
            return;
        }
        this.f10132e.set(0);
        throw new ProxyCacheException("Error reading source " + i4 + " times");
    }

    private void c() {
        try {
            this.f10128a.close();
        } catch (ProxyCacheException e5) {
            h(new ProxyCacheException("Error closing source " + this.f10128a, e5));
        }
    }

    private boolean d() {
        return Thread.currentThread().isInterrupted() || this.f10134g;
    }

    private void e(long j4, long j5) {
        f(j4, j5);
        synchronized (this.f10130c) {
            this.f10130c.notifyAll();
        }
    }

    private void i() {
        this.f10135h = 100;
        g(this.f10135h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long j4 = -1;
        long j5 = 0;
        try {
            j5 = this.f10129b.available();
            this.f10128a.a(j5);
            j4 = this.f10128a.length();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = this.f10128a.read(bArr);
                if (read != -1) {
                    synchronized (this.f10131d) {
                        if (d()) {
                            return;
                        }
                        this.f10129b.a(bArr, read);
                    }
                    j5 += read;
                    e(j5, j4);
                } else {
                    n();
                    i();
                    break;
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    private synchronized void l() throws ProxyCacheException {
        boolean z4 = (this.f10133f == null || this.f10133f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.f10134g && !this.f10129b.isCompleted() && !z4) {
            b bVar = new b();
            this.f10133f = new Thread(bVar, "Source reader for " + this.f10128a);
            this.f10133f.start();
        }
    }

    private void n() throws ProxyCacheException {
        synchronized (this.f10131d) {
            if (!d() && this.f10129b.available() == this.f10128a.length()) {
                this.f10129b.complete();
            }
        }
    }

    private void o() throws ProxyCacheException {
        synchronized (this.f10130c) {
            try {
                try {
                    this.f10130c.wait(1000L);
                } catch (InterruptedException e5) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void f(long j4, long j5) {
        int i4 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((((float) j4) / ((float) j5)) * 100.0f);
        boolean z4 = i4 != this.f10135h;
        if ((j5 >= 0) && z4) {
            g(i4);
        }
        this.f10135h = i4;
    }

    protected void g(int i4) {
    }

    protected final void h(Throwable th) {
        if (th instanceof InterruptedProxyCacheException) {
            h.h("ProxyCache is interrupted");
        } else {
            h.g("ProxyCache error", th.getMessage());
        }
    }

    public int j(byte[] bArr, long j4, int i4) throws ProxyCacheException {
        p.a(bArr, j4, i4);
        while (!this.f10129b.isCompleted() && this.f10129b.available() < i4 + j4 && !this.f10134g) {
            l();
            o();
            b();
        }
        int b5 = this.f10129b.b(bArr, j4, i4);
        if (this.f10129b.isCompleted() && this.f10135h != 100) {
            this.f10135h = 100;
            g(100);
        }
        return b5;
    }

    public void m() {
        synchronized (this.f10131d) {
            try {
                this.f10134g = true;
                if (this.f10133f != null) {
                    this.f10133f.interrupt();
                }
                this.f10129b.close();
            } catch (ProxyCacheException e5) {
                h(e5);
            }
        }
    }
}
