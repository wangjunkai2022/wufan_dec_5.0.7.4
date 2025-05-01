package com.aggmoread.sdk.z.a.j;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class p extends Thread implements com.aggmoread.sdk.z.a.p.c {

    /* renamed from: b  reason: collision with root package name */
    private n f2257b;

    /* renamed from: h  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.p.d f2263h;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f2258c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private int f2259d = 3;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f2260e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f2261f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f2262g = new AtomicBoolean(true);

    /* renamed from: i  reason: collision with root package name */
    private long f2264i = 0;

    private p() {
        setName("AdSdk-api-downtask");
    }

    public static p b() {
        p pVar = new p();
        pVar.f2262g.set(true);
        return pVar;
    }

    public static p b(boolean z4) {
        p pVar = new p();
        pVar.f2262g.set(z4);
        return pVar;
    }

    public void a(n nVar) {
        com.aggmoread.sdk.z.a.d.c("DownloadTask", "startDownload enter , isStarted = " + this.f2258c.get());
        if (this.f2258c.compareAndSet(false, true)) {
            this.f2257b = nVar;
            start();
        }
    }

    @Override // com.aggmoread.sdk.z.a.p.c
    public void a(boolean z4) {
        if (this.f2263h == null || !z4) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f2264i;
        com.aggmoread.sdk.z.a.d.c("DownloadTask", "ConnectivityMonitor onConnectivityChanged, restart , intervalTime = " + currentTimeMillis + " , startMonitorTime = " + this.f2264i);
        if (this.f2264i != 0 && currentTimeMillis >= TTAdConstant.AD_MAX_EVENT_TIME) {
            this.f2257b.d().a(-1017, "无网络超过10分钟不在重试下载!");
            return;
        }
        this.f2263h.c();
        b(false).a(this.f2257b);
    }

    public boolean a() {
        return this.f2258c.get();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z4;
        i d5;
        String message;
        int i4;
        h hVar = null;
        h th = null;
        while (true) {
            if (this.f2260e.get() >= this.f2259d) {
                hVar = th;
                break;
            }
            com.aggmoread.sdk.z.a.d.c("DownloadTask", "currentRetryTimes = " + this.f2260e.get());
            try {
                com.aggmoread.sdk.z.a.d.c("DownloadTask", "download file = " + new j().a(this.f2257b));
                break;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                this.f2260e.incrementAndGet();
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
        try {
            z4 = com.aggmoread.sdk.z.a.p.e.f(this.f2257b.b());
        } catch (Exception unused) {
            z4 = true;
        }
        com.aggmoread.sdk.z.a.d.c("DownloadTask", "download task end , isNetworkAvailable = " + z4 + " , rerun = " + this.f2261f.get() + " , isSupportNetworkStateMonitor = " + this.f2262g.get() + " , downloadThrowable = " + hVar);
        if (hVar != null) {
            if (this.f2262g.get() && !z4 && this.f2261f.compareAndSet(false, true)) {
                com.aggmoread.sdk.z.a.d.c("DownloadTask", "start ConnectivityMonitor");
                this.f2264i = System.currentTimeMillis();
                this.f2263h = com.aggmoread.sdk.z.a.p.d.a(this.f2257b.b(), this);
                return;
            }
            if (hVar instanceof h) {
                h hVar2 = hVar;
                d5 = this.f2257b.d();
                i4 = hVar2.a();
                message = hVar2.getMessage();
            } else {
                d5 = this.f2257b.d();
                message = hVar.getMessage();
                i4 = -999;
            }
            d5.a(i4, message);
        }
    }
}
