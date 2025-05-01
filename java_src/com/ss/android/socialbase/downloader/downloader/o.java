package com.ss.android.socialbase.downloader.downloader;

import android.os.SystemClock;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
/* loaded from: classes5.dex */
public class o {

    /* renamed from: m  reason: collision with root package name */
    private static String f60999m = "ResponseHandler";

    /* renamed from: b  reason: collision with root package name */
    private BaseException f61001b;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f61003d;
    private long ff;

    /* renamed from: g  reason: collision with root package name */
    private volatile long f61004g;

    /* renamed from: i  reason: collision with root package name */
    private final String f61005i;

    /* renamed from: j  reason: collision with root package name */
    private long f61006j;
    private volatile boolean jh;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.o f61007k;

    /* renamed from: l  reason: collision with root package name */
    private final long f61008l;
    private final boolean la;

    /* renamed from: n  reason: collision with root package name */
    private k f61009n;
    private final boolean ns;

    /* renamed from: o  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.model.m f61010o;

    /* renamed from: p  reason: collision with root package name */
    private final DownloadInfo f61011p;
    private long pd;

    /* renamed from: q  reason: collision with root package name */
    private long f61012q;
    private com.ss.android.socialbase.downloader.impls.b qv;

    /* renamed from: r  reason: collision with root package name */
    private volatile boolean f61013r;

    /* renamed from: t  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.qv.u f61014t;
    private long td;

    /* renamed from: u  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.network.wv f61015u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f61016v;
    private boolean vu;

    /* renamed from: w  reason: collision with root package name */
    private long f61017w;
    private x wv;

    /* renamed from: x  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.n.vv f61018x;

    /* renamed from: y  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.vv.vv f61019y;
    private final long ya;
    boolean vv = false;

    /* renamed from: a  reason: collision with root package name */
    private volatile long f61000a = 0;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f61002c = 0;

    public o(DownloadInfo downloadInfo, String str, com.ss.android.socialbase.downloader.network.wv wvVar, com.ss.android.socialbase.downloader.model.m mVar, com.ss.android.socialbase.downloader.qv.u uVar) {
        this.f61011p = downloadInfo;
        this.f61005i = str;
        k ns = p.ns();
        this.f61009n = ns;
        if (ns instanceof com.ss.android.socialbase.downloader.impls.i) {
            com.ss.android.socialbase.downloader.impls.i iVar = (com.ss.android.socialbase.downloader.impls.i) ns;
            this.qv = iVar.vv();
            this.wv = iVar.u();
        }
        this.f61015u = wvVar;
        this.f61010o = mVar;
        this.f61014t = uVar;
        long t4 = mVar.t();
        this.f61012q = t4;
        this.f61006j = t4;
        if (mVar.i()) {
            this.f61004g = mVar.d();
        } else {
            this.f61004g = mVar.p(false);
        }
        this.f61003d = mVar.j();
        this.f61019y = com.ss.android.socialbase.downloader.vv.vv.vv();
        com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
        this.f61018x = vv;
        boolean z4 = vv.vv("sync_strategy", 0) == 1;
        this.f61016v = z4;
        if (z4) {
            this.ya = Math.max(vv.vv("sync_interval_ms_fg", 5000), 500L);
            this.f61008l = Math.max(vv.vv("sync_interval_ms_bg", 1000), 500L);
        } else {
            this.ya = 0L;
            this.f61008l = 0L;
        }
        this.ns = vv.m("monitor_rw") == 1;
        this.la = com.ss.android.socialbase.downloader.wv.vv.vv(65536);
    }

    private boolean m(long j4, long j5) {
        return j4 > 65536 && j5 > 500;
    }

    private void n() {
        ExecutorService jh;
        if (this.f61015u == null || (jh = p.jh()) == null) {
            return;
        }
        jh.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.o.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    o.this.f61015u.i();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void qv() {
        boolean z4;
        long nanoTime = this.ns ? System.nanoTime() : 0L;
        try {
            this.f61007k.vv();
            z4 = true;
        } catch (Exception unused) {
            z4 = false;
        }
        if (z4) {
            this.f61011p.updateRealDownloadTime(true);
            boolean z5 = this.f61011p.getChunkCount() > 1;
            r vv = com.ss.android.socialbase.downloader.impls.jh.vv(com.ss.android.socialbase.downloader.wv.u.m());
            if (z5) {
                vv(this.wv);
                if (vv != null) {
                    vv.p(this.f61011p);
                } else {
                    this.wv.vv(this.f61011p.getId(), this.f61011p.getCurBytes());
                }
            } else if (vv != null) {
                vv.p(this.f61011p);
            } else {
                this.wv.vv(this.f61010o.b(), this.f61012q);
            }
            this.f61000a = this.f61012q;
        }
        if (this.ns) {
            this.pd += System.nanoTime() - nanoTime;
        }
    }

    private boolean u() {
        return this.jh || this.f61013r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0361 A[Catch: all -> 0x04de, TRY_ENTER, TryCatch #35 {all -> 0x04de, blocks: (B:190:0x02ea, B:219:0x0361, B:221:0x0367, B:222:0x036a, B:263:0x045d, B:264:0x045f, B:268:0x0465, B:270:0x047e, B:298:0x04d2, B:300:0x04d8, B:301:0x04db, B:302:0x04dd), top: B:340:0x0028, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x047e A[Catch: all -> 0x04de, TRY_LEAVE, TryCatch #35 {all -> 0x04de, blocks: (B:190:0x02ea, B:219:0x0361, B:221:0x0367, B:222:0x036a, B:263:0x045d, B:264:0x045f, B:268:0x0465, B:270:0x047e, B:298:0x04d2, B:300:0x04d8, B:301:0x04db, B:302:0x04dd), top: B:340:0x0028, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04d8 A[Catch: all -> 0x04de, TryCatch #35 {all -> 0x04de, blocks: (B:190:0x02ea, B:219:0x0361, B:221:0x0367, B:222:0x036a, B:263:0x045d, B:264:0x045f, B:268:0x0465, B:270:0x047e, B:298:0x04d2, B:300:0x04d8, B:301:0x04db, B:302:0x04dd), top: B:340:0x0028, inners: #27 }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.o.i():void");
    }

    public void m() {
        if (this.jh) {
            return;
        }
        this.jh = true;
        n();
    }

    public long o() {
        return this.f61000a;
    }

    public void p() {
        if (this.f61013r) {
            return;
        }
        synchronized (this.f61014t) {
            this.f61013r = true;
        }
        n();
    }

    public long vv() {
        return this.f61012q;
    }

    public void vv(long j4, long j5, long j6) {
        this.f61012q = j4;
        this.f61006j = j4;
        this.f61003d = j5;
        this.f61004g = j6;
    }

    public void vv(long j4, long j5) {
        this.f61003d = j4;
        this.f61004g = j5;
    }

    private com.ss.android.socialbase.downloader.o.m vv(InputStream inputStream) {
        int f5 = p.f();
        if (this.f61018x.vv("rw_concurrent", 0) == 1 && this.f61011p.getChunkCount() == 1 && this.f61011p.getTotalBytes() > 20971520) {
            try {
                com.ss.android.socialbase.downloader.o.vv vvVar = new com.ss.android.socialbase.downloader.o.vv(inputStream, f5, this.f61018x.vv("rw_concurrent_max_buffer_count", 4));
                this.vu = true;
                return vvVar;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.ss.android.socialbase.downloader.o.p pVar = new com.ss.android.socialbase.downloader.o.p(inputStream, f5);
        this.vu = false;
        return pVar;
    }

    private void vv(boolean z4) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j4 = uptimeMillis - this.f61002c;
        if (this.f61016v) {
            if (j4 <= (this.f61019y.m() ? this.ya : this.f61008l)) {
                return;
            }
        } else {
            long j5 = this.f61012q - this.f61000a;
            if (!z4 && !m(j5, j4)) {
                return;
            }
        }
        qv();
        this.f61002c = uptimeMillis;
    }

    private void vv(k kVar) {
        com.ss.android.socialbase.downloader.model.m mVar;
        com.ss.android.socialbase.downloader.model.m mVar2;
        if (kVar == null) {
            return;
        }
        r rVar = null;
        boolean z4 = kVar instanceof com.ss.android.socialbase.downloader.m.o;
        if (z4 && (rVar = com.ss.android.socialbase.downloader.impls.jh.vv(com.ss.android.socialbase.downloader.wv.u.m())) == null) {
            return;
        }
        r rVar2 = rVar;
        if (this.f61010o.i()) {
            mVar = this.f61010o.o();
        } else {
            mVar = this.f61010o;
        }
        com.ss.android.socialbase.downloader.model.m mVar3 = mVar;
        if (mVar3 != null) {
            mVar3.m(this.f61012q);
            if (z4 && rVar2 != null) {
                rVar2.vv(mVar3.b(), mVar3.la(), mVar3.m(), this.f61012q);
                mVar2 = mVar3;
            } else {
                mVar2 = mVar3;
                kVar.vv(mVar3.b(), mVar3.la(), mVar3.m(), this.f61012q);
            }
            if (mVar2.qv()) {
                boolean z5 = false;
                if (mVar2.wv()) {
                    long k4 = mVar2.k();
                    if (k4 > this.f61012q) {
                        if (z4 && rVar2 != null) {
                            rVar2.vv(mVar2.b(), mVar2.m(), k4);
                        } else {
                            kVar.vv(mVar2.b(), mVar2.m(), k4);
                        }
                        z5 = true;
                    }
                }
                if (z5) {
                    return;
                }
                if (z4 && rVar2 != null) {
                    rVar2.vv(mVar2.b(), mVar2.m(), this.f61012q);
                } else {
                    kVar.vv(mVar2.b(), mVar2.m(), this.f61012q);
                }
            }
        } else if (this.f61010o.i()) {
            if (z4 && rVar2 != null) {
                rVar2.vv(this.f61010o.b(), this.f61010o.la(), this.f61012q);
            } else {
                kVar.vv(this.f61010o.b(), this.f61010o.la(), this.f61012q);
            }
        }
    }
}
