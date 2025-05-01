package com.beizi.ad.internal.b;

import com.beizi.ad.internal.utilities.HaoboLog;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProxyCache.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final o f5821a;

    /* renamed from: b  reason: collision with root package name */
    private final com.beizi.ad.internal.b.a f5822b;

    /* renamed from: f  reason: collision with root package name */
    private volatile Thread f5826f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f5827g;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5823c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f5824d = new Object();

    /* renamed from: h  reason: collision with root package name */
    private volatile int f5828h = -1;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f5825e = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProxyCache.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.e();
        }
    }

    public l(o oVar, com.beizi.ad.internal.b.a aVar) {
        this.f5821a = (o) k.a(oVar);
        this.f5822b = (com.beizi.ad.internal.b.a) k.a(aVar);
    }

    private void b() throws m {
        int i4 = this.f5825e.get();
        if (i4 < 1) {
            return;
        }
        this.f5825e.set(0);
        throw new m("Error reading source " + i4 + " times");
    }

    private synchronized void c() throws m {
        boolean z4 = (this.f5826f == null || this.f5826f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.f5827g && !this.f5822b.d() && !z4) {
            a aVar = new a();
            this.f5826f = new Thread(aVar, "Source reader for " + this.f5821a);
            this.f5826f.start();
        }
    }

    private void d() throws m {
        synchronized (this.f5823c) {
            try {
                try {
                    this.f5823c.wait(1000L);
                } catch (InterruptedException e5) {
                    throw new m("Waiting source data is interrupted!", e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Throwable th;
        int i4;
        int i5 = 0;
        try {
            i5 = this.f5822b.a();
            this.f5821a.a(i5);
            i4 = this.f5821a.a();
        } catch (Throwable th2) {
            th = th2;
            i4 = -1;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int a5 = this.f5821a.a(bArr);
                if (a5 != -1) {
                    synchronized (this.f5824d) {
                        if (h()) {
                            return;
                        }
                        this.f5822b.a(bArr, a5);
                    }
                    i5 += a5;
                    b(i5, i4);
                } else {
                    g();
                    f();
                    break;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                this.f5825e.incrementAndGet();
                a(th);
            } finally {
                i();
                b(i5, i4);
            }
        }
    }

    private void f() {
        this.f5828h = 100;
        a(this.f5828h);
    }

    private void g() throws m {
        synchronized (this.f5824d) {
            if (!h() && this.f5822b.a() == this.f5821a.a()) {
                this.f5822b.c();
            }
        }
    }

    private boolean h() {
        return Thread.currentThread().isInterrupted() || this.f5827g;
    }

    private void i() {
        try {
            this.f5821a.b();
        } catch (m e5) {
            a(new m("Error closing source " + this.f5821a, e5));
        }
    }

    protected void a(int i4) {
    }

    public int a(byte[] bArr, long j4, int i4) throws m {
        n.a(bArr, j4, i4);
        while (!this.f5822b.d() && this.f5822b.a() < i4 + j4 && !this.f5827g) {
            c();
            d();
            b();
        }
        int a5 = this.f5822b.a(bArr, j4, i4);
        if (this.f5822b.d() && this.f5828h != 100) {
            this.f5828h = 100;
            a(100);
        }
        return a5;
    }

    private void b(long j4, long j5) {
        a(j4, j5);
        synchronized (this.f5823c) {
            this.f5823c.notifyAll();
        }
    }

    public void a() {
        synchronized (this.f5824d) {
            String str = HaoboLog.proxyCacheLogTag;
            HaoboLog.d(str, "Shutdown proxy for " + this.f5821a);
            try {
                this.f5827g = true;
                if (this.f5826f != null) {
                    this.f5826f.interrupt();
                }
                this.f5822b.b();
            } catch (m e5) {
                a(e5);
            }
        }
    }

    protected void a(long j4, long j5) {
        int i4 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j4 * 100) / j5);
        boolean z4 = i4 != this.f5828h;
        if ((j5 >= 0) && z4) {
            a(i4);
        }
        this.f5828h = i4;
    }

    protected final void a(Throwable th) {
        if (th instanceof i) {
            HaoboLog.d(HaoboLog.proxyCacheLogTag, "ProxyCache is interrupted");
        } else {
            HaoboLog.e(HaoboLog.proxyCacheLogTag, "ProxyCache error", th);
        }
    }
}
