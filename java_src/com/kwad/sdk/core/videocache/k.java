package com.kwad.sdk.core.videocache;

import com.kwad.sdk.utils.aq;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class k {
    private final m aDC;
    private final com.kwad.sdk.core.videocache.a aDD;
    private volatile Thread aDH;
    private volatile boolean kI;
    private final Object aDE = new Object();
    private final Object aDF = new Object();
    private volatile int aDI = -1;
    private final AtomicInteger aDG = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k.this.Hn();
        }

        /* synthetic */ a(k kVar, byte b5) {
            this();
        }
    }

    public k(m mVar, com.kwad.sdk.core.videocache.a aVar) {
        this.aDC = (m) aq.checkNotNull(mVar);
        this.aDD = (com.kwad.sdk.core.videocache.a) aq.checkNotNull(aVar);
    }

    private void Hk() {
        int i4 = this.aDG.get();
        if (i4 <= 0) {
            return;
        }
        this.aDG.set(0);
        throw new ProxyCacheException("Error reading source " + i4 + " times");
    }

    private synchronized void Hl() {
        boolean z4 = (this.aDH == null || this.aDH.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.kI && !this.aDD.isCompleted() && !z4) {
            a aVar = new a(this, (byte) 0);
            this.aDH = new Thread(aVar, "Source reader for " + this.aDC);
            this.aDH.start();
        }
    }

    private void Hm() {
        synchronized (this.aDE) {
            try {
                try {
                    this.aDE.wait(1000L);
                } catch (InterruptedException e5) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        r2 = r2 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Hn() {
        /*
            r8 = this;
            r0 = -1
            r2 = 0
            com.kwad.sdk.core.videocache.a r4 = r8.aDD     // Catch: java.lang.Throwable -> L49
            long r2 = r4.GY()     // Catch: java.lang.Throwable -> L49
            com.kwad.sdk.core.videocache.m r4 = r8.aDC     // Catch: java.lang.Throwable -> L49
            r4.aA(r2)     // Catch: java.lang.Throwable -> L49
            com.kwad.sdk.core.videocache.m r4 = r8.aDC     // Catch: java.lang.Throwable -> L49
            long r0 = r4.length()     // Catch: java.lang.Throwable -> L49
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L49
        L19:
            com.kwad.sdk.core.videocache.m r5 = r8.aDC     // Catch: java.lang.Throwable -> L49
            int r5 = r5.read(r4)     // Catch: java.lang.Throwable -> L49
            r6 = -1
            if (r5 == r6) goto L42
            java.lang.Object r6 = r8.aDF     // Catch: java.lang.Throwable -> L49
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L49
            boolean r7 = r8.isStopped()     // Catch: java.lang.Throwable -> L3f
            if (r7 == 0) goto L33
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
        L2c:
            r8.Hp()
            r8.j(r2, r0)
            return
        L33:
            com.kwad.sdk.core.videocache.a r7 = r8.aDD     // Catch: java.lang.Throwable -> L3f
            r7.d(r4, r5)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
            long r5 = (long) r5
            long r2 = r2 + r5
            r8.j(r2, r0)     // Catch: java.lang.Throwable -> L49
            goto L19
        L3f:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
            throw r4     // Catch: java.lang.Throwable -> L49
        L42:
            r8.tryComplete()     // Catch: java.lang.Throwable -> L49
            r8.Ho()     // Catch: java.lang.Throwable -> L49
            goto L2c
        L49:
            r4 = move-exception
            java.util.concurrent.atomic.AtomicInteger r5 = r8.aDG     // Catch: java.lang.Throwable -> L53
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L53
            onError(r4)     // Catch: java.lang.Throwable -> L53
            goto L2c
        L53:
            r4 = move-exception
            r8.Hp()
            r8.j(r2, r0)
            goto L5c
        L5b:
            throw r4
        L5c:
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.videocache.k.Hn():void");
    }

    private void Ho() {
        this.aDI = 100;
        dr(this.aDI);
    }

    private void Hp() {
        try {
            this.aDC.close();
        } catch (ProxyCacheException e5) {
            onError(new ProxyCacheException("Error closing source " + this.aDC, e5));
        }
    }

    private boolean isStopped() {
        return Thread.currentThread().isInterrupted() || this.kI;
    }

    private void j(long j4, long j5) {
        k(j4, j5);
        synchronized (this.aDE) {
            this.aDE.notifyAll();
        }
    }

    private void k(long j4, long j5) {
        int i4 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((((float) j4) / ((float) j5)) * 100.0f);
        boolean z4 = i4 != this.aDI;
        if ((j5 >= 0) && z4) {
            dr(i4);
        }
        this.aDI = i4;
    }

    private static void onError(Throwable th) {
        if (th instanceof InterruptedProxyCacheException) {
            com.kwad.sdk.core.e.c.d("ProxyCache", "ProxyCache is interrupted");
        } else {
            com.kwad.sdk.core.e.c.e("ProxyCache", "ProxyCache error");
        }
    }

    private void tryComplete() {
        synchronized (this.aDF) {
            if (!isStopped() && this.aDD.GY() == this.aDC.length()) {
                this.aDD.complete();
            }
        }
    }

    protected void dr(int i4) {
    }

    public final void shutdown() {
        synchronized (this.aDF) {
            com.kwad.sdk.core.e.c.d("ProxyCache", "Shutdown proxy for " + this.aDC);
            try {
                this.kI = true;
                if (this.aDH != null) {
                    this.aDH.interrupt();
                }
                this.aDD.close();
            } catch (ProxyCacheException e5) {
                onError(e5);
            }
        }
    }

    public final int a(byte[] bArr, long j4, int i4) {
        l.b(bArr, j4, 1024);
        while (!this.aDD.isCompleted() && this.aDD.GY() < 1024 + j4 && !this.kI) {
            Hl();
            Hm();
            Hk();
        }
        int a5 = this.aDD.a(bArr, j4, 1024);
        if (this.aDD.isCompleted() && this.aDI != 100) {
            this.aDI = 100;
            dr(100);
        }
        return a5;
    }
}
