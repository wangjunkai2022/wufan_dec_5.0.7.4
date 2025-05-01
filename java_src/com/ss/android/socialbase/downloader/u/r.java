package com.ss.android.socialbase.downloader.u;

import android.text.TextUtils;
import com.facebook.common.util.f;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.umeng.analytics.pro.aw;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.cocos2dx.lib.GameControllerDelegate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private int f61419a;

    /* renamed from: b  reason: collision with root package name */
    private final u f61420b;

    /* renamed from: c  reason: collision with root package name */
    private long f61421c;
    private boolean cq;

    /* renamed from: f  reason: collision with root package name */
    private BaseException f61423f;
    private Thread ff;

    /* renamed from: g  reason: collision with root package name */
    private long f61424g;

    /* renamed from: i  reason: collision with root package name */
    volatile long f61425i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.i f61426j;
    private final p jh;

    /* renamed from: k  reason: collision with root package name */
    String f61427k;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f61428l;
    private volatile long la;

    /* renamed from: m  reason: collision with root package name */
    d f61429m;

    /* renamed from: n  reason: collision with root package name */
    volatile long f61430n;
    private volatile boolean ns;

    /* renamed from: o  reason: collision with root package name */
    volatile long f61431o;
    private boolean ot;

    /* renamed from: p  reason: collision with root package name */
    final int f61432p;
    private int pd;
    private boolean pj;

    /* renamed from: q  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.network.wv f61433q;
    String qv;

    /* renamed from: r  reason: collision with root package name */
    private final DownloadInfo f61434r;

    /* renamed from: t  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.n.vv f61435t;
    private volatile boolean td;
    private com.ss.android.socialbase.downloader.wv.o tf;

    /* renamed from: u  reason: collision with root package name */
    volatile long f61436u;

    /* renamed from: v  reason: collision with root package name */
    private volatile long f61437v;
    private volatile boolean vu;
    volatile wv vv;

    /* renamed from: w  reason: collision with root package name */
    private int f61438w;
    String wv;

    /* renamed from: x  reason: collision with root package name */
    private volatile long f61439x;
    private Future ya;
    private int zn;

    /* renamed from: d  reason: collision with root package name */
    private final List<wv> f61422d = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private volatile long f61440y = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(DownloadInfo downloadInfo, b bVar, p pVar, d dVar, int i4) {
        this.f61434r = downloadInfo;
        this.f61420b = bVar;
        this.jh = pVar;
        this.f61435t = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
        this.f61429m = dVar;
        this.f61432p = i4;
    }

    private void b() {
        this.pj = false;
        jh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
        r7 = r11 + 1;
        r21 = r13 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
        if (r21 <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
        r26 = r11;
        com.ss.android.socialbase.downloader.p.vv.o("SegmentReader", "loopAndRead: redundant = ".concat(java.lang.String.valueOf(r21)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0144, code lost:
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
        r31.f61440y = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0149, code lost:
        r13 = r7;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015e, code lost:
        throw new com.ss.android.socialbase.downloader.u.j("loopAndRead");
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0356  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0154 -> B:79:0x0155). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(com.ss.android.socialbase.downloader.u.wv r32) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.u.r.i(com.ss.android.socialbase.downloader.u.wv):void");
    }

    private void jh() {
        this.f61438w = this.f61429m.f61387i ? this.f61434r.getRetryCount() : this.f61434r.getBackUpUrlRetryCount();
        this.f61419a = 0;
    }

    private void k() {
        com.ss.android.socialbase.downloader.network.wv wvVar = this.f61433q;
        if (wvVar != null) {
            try {
                com.ss.android.socialbase.downloader.p.vv.p("SegmentReader", "closeConnection: thread = " + this.f61432p);
                wvVar.i();
                wvVar.p();
            } catch (Throwable unused) {
            }
        }
    }

    private void m(wv wvVar) throws BaseException, com.ss.android.socialbase.downloader.exception.wv {
        p(wvVar);
        this.f61420b.vv(this, wvVar, this.f61429m, this.f61426j);
        this.f61429m.p();
    }

    private void p(wv wvVar) throws BaseException {
        String str;
        String str2;
        com.ss.android.socialbase.downloader.network.wv vv;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f61431o = 0L;
                this.f61425i = currentTimeMillis;
                this.f61424g = wvVar.o();
                this.f61439x = wvVar.u();
                if (this.f61439x > 0 && this.f61424g > this.f61439x) {
                    throw new k(6, "createConn, ".concat(String.valueOf(wvVar)));
                }
                this.tf = new com.ss.android.socialbase.downloader.wv.o();
                List<com.ss.android.socialbase.downloader.model.p> vv2 = com.ss.android.socialbase.downloader.wv.u.vv(this.f61434r.getExtraHeaders(), this.f61434r.geteTag(), this.f61424g, this.f61439x);
                vv2.add(new com.ss.android.socialbase.downloader.model.p("Segment-Index", String.valueOf(wvVar.n())));
                vv2.add(new com.ss.android.socialbase.downloader.model.p("Thread-Index", String.valueOf(this.f61432p)));
                com.ss.android.socialbase.downloader.wv.u.vv(vv2, this.f61434r);
                com.ss.android.socialbase.downloader.wv.u.m(vv2, this.f61434r);
                str = this.f61429m.vv;
                if (this.pj && !TextUtils.isEmpty(str) && str.startsWith("https")) {
                    str = str.replaceFirst("https", f.f10923a);
                }
                str2 = this.f61429m.f61389m;
                com.ss.android.socialbase.downloader.p.vv.p("SegmentReader", "createConnectionBegin: url = " + str + ", ip = " + str2 + ", segment = " + wvVar + ", threadIndex = " + this.f61432p);
                this.qv = str;
                this.wv = str2;
                vv = com.ss.android.socialbase.downloader.downloader.p.vv(this.f61434r.isNeedDefaultHttpServiceBackUp(), this.f61434r.getMaxBytes(), str, str2, vv2, 0, currentTimeMillis - this.f61421c > 3000 && this.f61435t.m("monitor_download_connect") > 0, this.f61434r);
            } finally {
                this.f61431o = System.currentTimeMillis();
            }
        } catch (BaseException e5) {
            throw e5;
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.wv.u.vv(th, "createConn");
        }
        if (vv != null) {
            this.f61433q = vv;
            this.f61426j = new com.ss.android.socialbase.downloader.model.i(str, vv);
            if (!this.f61428l) {
                if (vv instanceof com.ss.android.socialbase.downloader.network.vv) {
                    this.f61427k = ((com.ss.android.socialbase.downloader.network.vv) vv).o();
                }
                StringBuilder sb = new StringBuilder("createConnectionSuccess: url = ");
                sb.append(str);
                sb.append(", ip = ");
                sb.append(str2);
                sb.append(", hostRealIp = ");
                sb.append(this.f61427k);
                sb.append(", threadIndex = ");
                sb.append(this.f61432p);
                return;
            }
            throw new j("createConn");
        }
        throw new BaseException((int) GameControllerDelegate.BUTTON_SELECT, new IOException("download can't continue, chunk connection is null"));
    }

    private long r() {
        long j4 = this.la;
        this.la = 0L;
        if (j4 <= 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    private boolean vv(wv wvVar) throws BaseException {
        b();
        while (true) {
            try {
                m(wvVar);
                i(wvVar);
                wv();
                return true;
            } catch (k e5) {
                this.f61423f = e5;
                throw e5;
            } catch (Throwable th) {
                try {
                    com.ss.android.socialbase.downloader.p.vv.o("SegmentReader", "download: e = " + th + ", threadIndex = " + this.f61432p + ", reconnect = " + this.ns + ", closed = " + this.f61428l);
                    if (this.f61428l) {
                        return false;
                    }
                    if (this.ns) {
                        this.ns = false;
                        Thread.interrupted();
                        if (this.vu) {
                            this.vu = false;
                            throw new k(5, "download");
                        }
                    } else {
                        th.printStackTrace();
                        BaseException e6 = null;
                        if (th instanceof BaseException) {
                            e6 = th;
                        } else {
                            try {
                                com.ss.android.socialbase.downloader.wv.u.vv((Throwable) th, "download");
                            } catch (BaseException e7) {
                                e6 = e7;
                            }
                        }
                        if (e6 == null || !vv(wvVar, e6)) {
                            return false;
                        }
                    }
                } finally {
                    wv();
                }
            }
        }
        return false;
    }

    private void wv() {
        this.f61421c = this.f61425i;
        this.f61425i = -1L;
        this.f61431o = -1L;
        this.f61436u = -1L;
        this.f61430n = -1L;
        k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.ot;
    }

    public void o() {
        com.ss.android.socialbase.downloader.p.vv.p("SegmentReader", "close: threadIndex = " + this.f61432p);
        synchronized (this) {
            this.f61428l = true;
            this.td = true;
        }
        k();
        Future future = this.ya;
        if (future != null) {
            this.ya = null;
            try {
                future.cancel(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long qv() {
        return this.f61424g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        r5.vv = null;
        r2 = r5.f61420b;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.u.r.run():void");
    }

    public void u() {
        vv(false);
    }

    public long m() {
        long p4;
        synchronized (this.f61420b) {
            p4 = this.f61437v + p();
        }
        return p4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z4) {
        this.ot = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(long j4) {
        long j5 = this.f61440y;
        com.ss.android.socialbase.downloader.wv.o oVar = this.tf;
        if (j5 < 0 || oVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("markProgress: curSegmentReadOffset = ");
        sb.append(j5);
        sb.append(", threadIndex = ");
        sb.append(this.f61432p);
        oVar.vv(j5, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean vv(d dVar) {
        int i4 = this.zn;
        if (i4 >= 30) {
            return false;
        }
        this.zn = i4 + 1;
        d dVar2 = this.f61429m;
        if (dVar2 != null) {
            dVar2.m(this);
        }
        dVar.vv(this);
        this.f61429m = dVar;
        jh();
        return true;
    }

    private boolean vv(wv wvVar, BaseException baseException) {
        com.ss.android.socialbase.downloader.p.vv.o("SegmentReader", "handleDownloadFailed:  e = " + baseException + ", curRetryCount = " + this.f61419a + ", retryCount = " + this.f61438w);
        this.f61423f = baseException;
        this.f61429m.m();
        this.f61420b.vv(this, this.f61429m, wvVar, baseException, this.f61419a, this.f61438w);
        int i4 = this.f61419a;
        if (i4 < this.f61438w) {
            this.f61419a = i4 + 1;
            return true;
        } else if (vv(baseException)) {
            return true;
        } else {
            this.f61420b.vv(this, this.f61429m, wvVar, baseException);
            return false;
        }
    }

    public long p() {
        synchronized (this.f61420b) {
            long j4 = this.f61440y;
            long j5 = this.f61424g;
            if (j5 < 0 || j4 <= j5) {
                return 0L;
            }
            return j4 - j5;
        }
    }

    private boolean vv(BaseException baseException) {
        if (com.ss.android.socialbase.downloader.wv.u.p(baseException)) {
            String str = this.f61429m.vv;
            if (TextUtils.isEmpty(str) || !str.startsWith("https") || !this.f61434r.isNeedHttpsToHttpRetry() || this.pj) {
                return false;
            }
            this.pj = true;
            jh();
            return true;
        }
        return false;
    }

    public void p(boolean z4) {
        this.cq = z4;
    }

    private vv vv(p pVar, InputStream inputStream) throws InterruptedException, BaseException, IOException {
        int i4;
        vv m4 = pVar.m();
        try {
            i4 = inputStream.read(m4.vv);
        } catch (Throwable th) {
            th = th;
            i4 = -1;
        }
        try {
            if (i4 != -1) {
                m4.f61444p = i4;
                if (i4 == -1) {
                    pVar.vv(m4);
                }
                return m4;
            }
            throw new BaseException(1073, aw.f63388s);
        } catch (Throwable th2) {
            th = th2;
            if (i4 == -1) {
                pVar.vv(m4);
            }
            throw th;
        }
    }

    public boolean vv(long j4) {
        long j5 = this.f61439x;
        if (j4 > 0 || j5 <= 0) {
            if (j4 <= j5 || j5 <= 0) {
                this.la = j4;
                this.td = true;
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv() {
        d dVar = this.f61429m;
        try {
            synchronized (this.f61420b) {
                long p4 = p();
                if (p4 > 0) {
                    this.f61437v += p4;
                    dVar.vv(p4);
                }
                this.f61440y = -1L;
            }
        } catch (Throwable unused) {
        }
    }

    public void vv(boolean z4) {
        com.ss.android.socialbase.downloader.p.vv.p("SegmentReader", "reconnect: threadIndex = " + this.f61432p);
        synchronized (this) {
            this.vu = z4;
            this.ns = true;
            this.td = true;
        }
        k();
        Thread thread = this.ff;
        if (thread != null) {
            try {
                new StringBuilder("reconnect: t.interrupt threadIndex = ").append(this.f61432p);
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(Future future) {
        this.ya = future;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long vv(long j4, long j5) {
        com.ss.android.socialbase.downloader.wv.o oVar = this.tf;
        if (oVar == null) {
            return -1L;
        }
        return oVar.m(j4, j5);
    }

    public long i() {
        return this.f61440y;
    }
}
