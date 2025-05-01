package com.ss.android.socialbase.downloader.o;

import android.os.Process;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.u.j;
import com.ss.android.socialbase.downloader.wv.u;
import java.io.InputStream;
import java.util.concurrent.Future;
/* loaded from: classes5.dex */
public class vv implements m {

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.u.vv f61313b;

    /* renamed from: j  reason: collision with root package name */
    private int f61316j;
    private volatile boolean jh;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.u.vv f61317k;

    /* renamed from: m  reason: collision with root package name */
    private final int f61318m;

    /* renamed from: n  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.u.vv f61319n;

    /* renamed from: p  reason: collision with root package name */
    private final int f61321p;

    /* renamed from: q  reason: collision with root package name */
    private volatile Future f61322q;
    private com.ss.android.socialbase.downloader.u.vv qv;

    /* renamed from: r  reason: collision with root package name */
    private volatile boolean f61323r;

    /* renamed from: t  reason: collision with root package name */
    private volatile Throwable f61324t;

    /* renamed from: u  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.u.vv f61325u;
    private final InputStream vv;
    private com.ss.android.socialbase.downloader.u.vv wv;

    /* renamed from: i  reason: collision with root package name */
    private final Object f61315i = new Object();

    /* renamed from: o  reason: collision with root package name */
    private final Object f61320o = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f61314d = new Runnable() { // from class: com.ss.android.socialbase.downloader.o.vv.1
        @Override // java.lang.Runnable
        public void run() {
            com.ss.android.socialbase.downloader.u.vv i4;
            Process.setThreadPriority(10);
            do {
                try {
                    i4 = vv.this.i();
                    i4.f61444p = vv.this.vv.read(i4.vv);
                    vv.this.p(i4);
                } catch (Throwable th) {
                    try {
                        vv.this.f61324t = th;
                        th.printStackTrace();
                        synchronized (vv.this.f61320o) {
                            vv.this.f61323r = true;
                            vv.this.f61320o.notify();
                            u.vv(vv.this.vv);
                            return;
                        }
                    } catch (Throwable th2) {
                        synchronized (vv.this.f61320o) {
                            vv.this.f61323r = true;
                            vv.this.f61320o.notify();
                            u.vv(vv.this.vv);
                            throw th2;
                        }
                    }
                }
            } while (i4.f61444p != -1);
            synchronized (vv.this.f61320o) {
                vv.this.f61323r = true;
                vv.this.f61320o.notify();
            }
            u.vv(vv.this.vv);
        }
    };

    public vv(InputStream inputStream, int i4, int i5) throws Throwable {
        this.vv = inputStream;
        this.f61318m = i4;
        if (i5 <= 0) {
            i5 = 1;
        } else if (i5 > 64) {
            i5 = 64;
        }
        this.f61321p = i5;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ss.android.socialbase.downloader.u.vv i() throws j, InterruptedException {
        int i4;
        com.ss.android.socialbase.downloader.u.vv vvVar = this.qv;
        if (vvVar != null) {
            if (!this.jh) {
                this.qv = vvVar.f61442i;
                vvVar.f61442i = null;
                return vvVar;
            }
            throw new j("");
        }
        synchronized (this.f61315i) {
            if (!this.jh) {
                com.ss.android.socialbase.downloader.u.vv vvVar2 = this.f61325u;
                if (vvVar2 == null && (i4 = this.f61316j) < this.f61321p) {
                    this.f61316j = i4 + 1;
                    return new com.ss.android.socialbase.downloader.u.vv(this.f61318m);
                }
                while (vvVar2 == null) {
                    this.f61315i.wait();
                    if (!this.jh) {
                        vvVar2 = this.f61325u;
                    } else {
                        throw new j("");
                    }
                }
                this.qv = vvVar2.f61442i;
                this.f61319n = null;
                this.f61325u = null;
                vvVar2.f61442i = null;
                return vvVar2;
            }
            throw new j("");
        }
    }

    private com.ss.android.socialbase.downloader.u.vv o() throws BaseException, InterruptedException {
        com.ss.android.socialbase.downloader.u.vv vvVar;
        com.ss.android.socialbase.downloader.u.vv vvVar2 = this.f61313b;
        if (vvVar2 != null) {
            this.f61313b = vvVar2.f61442i;
            vvVar2.f61442i = null;
            return vvVar2;
        }
        synchronized (this.f61320o) {
            vvVar = this.wv;
            if (vvVar == null) {
                do {
                    if (this.f61323r) {
                        u();
                    }
                    this.f61320o.wait();
                    vvVar = this.wv;
                } while (vvVar == null);
                this.f61313b = vvVar.f61442i;
                this.f61317k = null;
                this.wv = null;
                vvVar.f61442i = null;
            } else {
                this.f61313b = vvVar.f61442i;
                this.f61317k = null;
                this.wv = null;
                vvVar.f61442i = null;
            }
        }
        return vvVar;
    }

    private void u() throws BaseException {
        Throwable th = this.f61324t;
        if (th != null) {
            if (th instanceof j) {
                throw new BaseException(1068, "async reader closed!");
            }
            u.vv(th, "async_read");
        }
        throw new BaseException(1069, "async reader terminated!");
    }

    private void p() throws Throwable {
        this.f61322q = com.ss.android.socialbase.downloader.downloader.p.d().submit(this.f61314d);
    }

    @Override // com.ss.android.socialbase.downloader.o.m
    public void m() {
        synchronized (this.f61315i) {
            this.jh = true;
            this.f61315i.notify();
        }
        Future future = this.f61322q;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
            this.f61322q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(com.ss.android.socialbase.downloader.u.vv vvVar) {
        synchronized (this.f61320o) {
            com.ss.android.socialbase.downloader.u.vv vvVar2 = this.f61317k;
            if (vvVar2 == null) {
                this.f61317k = vvVar;
                this.wv = vvVar;
                this.f61320o.notify();
            } else {
                vvVar2.f61442i = vvVar;
                this.f61317k = vvVar;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.o.m
    public com.ss.android.socialbase.downloader.u.vv vv() throws BaseException, InterruptedException {
        return o();
    }

    @Override // com.ss.android.socialbase.downloader.o.m
    public void vv(com.ss.android.socialbase.downloader.u.vv vvVar) {
        m(vvVar);
    }

    private void m(com.ss.android.socialbase.downloader.u.vv vvVar) {
        synchronized (this.f61315i) {
            com.ss.android.socialbase.downloader.u.vv vvVar2 = this.f61319n;
            if (vvVar2 == null) {
                this.f61319n = vvVar;
                this.f61325u = vvVar;
                this.f61315i.notify();
            } else {
                vvVar2.f61442i = vvVar;
                this.f61319n = vvVar;
            }
        }
    }
}
