package com.ss.android.socialbase.downloader.network;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public class m {

    /* renamed from: m  reason: collision with root package name */
    private static final String f61252m = "m";

    /* renamed from: n  reason: collision with root package name */
    private static long f61253n = -1;
    private static volatile m qv;
    public static volatile boolean vv;

    /* renamed from: u  reason: collision with root package name */
    private long f61257u;

    /* renamed from: p  reason: collision with root package name */
    private final b f61256p = b.vv();

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f61254i = new AtomicInteger();

    /* renamed from: o  reason: collision with root package name */
    private final vv f61255o = new vv(com.ss.android.socialbase.downloader.qv.o.vv());

    /* loaded from: classes5.dex */
    private class vv extends Handler {
        public vv(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            m.this.u();
            sendEmptyMessageDelayed(1, 1000L);
        }

        public void m() {
            removeMessages(1);
        }

        public void vv() {
            sendEmptyMessage(1);
        }
    }

    private m() {
    }

    public static long i() {
        return TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
    }

    public static void o() {
        vv = com.ss.android.socialbase.downloader.wv.u.m(com.ss.android.socialbase.downloader.downloader.p.ky());
    }

    public static m vv() {
        if (qv == null) {
            synchronized (m.class) {
                if (qv == null) {
                    qv = new m();
                }
            }
        }
        return qv;
    }

    public void m() {
        try {
            String str = f61252m;
            com.ss.android.socialbase.downloader.p.vv.p(str, "startSampling: mSamplingCounter = " + this.f61254i);
            if (this.f61254i.getAndIncrement() == 0) {
                this.f61255o.vv();
                this.f61257u = SystemClock.uptimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    protected void n() {
        u();
        f61253n = -1L;
    }

    public void p() {
        try {
            String str = f61252m;
            com.ss.android.socialbase.downloader.p.vv.p(str, "stopSampling: mSamplingCounter = " + this.f61254i);
            if (this.f61254i.decrementAndGet() == 0) {
                this.f61255o.m();
                n();
            }
        } catch (Throwable unused) {
        }
    }

    protected void u() {
        long mobileRxBytes;
        try {
            o();
            if (vv) {
                mobileRxBytes = i();
            } else {
                mobileRxBytes = TrafficStats.getMobileRxBytes();
            }
            long j4 = f61253n;
            long j5 = mobileRxBytes - j4;
            if (j4 >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f61256p.vv(j5, uptimeMillis - this.f61257u);
                    this.f61257u = uptimeMillis;
                }
            }
            f61253n = mobileRxBytes;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
