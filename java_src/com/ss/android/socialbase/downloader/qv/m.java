package com.ss.android.socialbase.downloader.qv;

import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.wv;
/* loaded from: classes5.dex */
public class m implements Runnable {
    private static final String vv = m.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f61329b;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.o f61330i;
    private boolean jh;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f61331k;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.m f61332m;

    /* renamed from: n  reason: collision with root package name */
    private final u f61333n;

    /* renamed from: o  reason: collision with root package name */
    private final DownloadTask f61334o;

    /* renamed from: p  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.m f61335p;
    private wv qv;

    /* renamed from: u  reason: collision with root package name */
    private DownloadInfo f61336u;
    private k wv;

    public m(com.ss.android.socialbase.downloader.model.m mVar, DownloadTask downloadTask, u uVar) {
        this.jh = false;
        this.f61335p = mVar;
        this.f61334o = downloadTask;
        if (downloadTask != null) {
            this.f61336u = downloadTask.getDownloadInfo();
        }
        this.f61333n = uVar;
        this.wv = com.ss.android.socialbase.downloader.downloader.p.ns();
        this.f61335p.vv(this);
    }

    private void i() {
        wv wvVar = this.qv;
        if (wvVar != null) {
            wvVar.i();
            this.qv = null;
        }
    }

    private boolean o() {
        return this.f61331k || this.f61329b;
    }

    private String p() {
        return this.f61336u.getConnectionUrl();
    }

    public void m() {
        this.f61329b = true;
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f61330i;
        if (oVar != null) {
            oVar.p();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        r3.f61332m.vv(false);
     */
    @Override // java.lang.Runnable
    @android.annotation.SuppressLint({"DefaultLocale"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r3 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.ss.android.socialbase.downloader.model.m r0 = r3.f61335p
            r3.f61332m = r0
        L9:
            r0 = 0
            com.ss.android.socialbase.downloader.model.m r1 = r3.f61332m     // Catch: java.lang.Throwable -> L5b
            r1.vv(r3)     // Catch: java.lang.Throwable -> L5b
            com.ss.android.socialbase.downloader.model.m r1 = r3.f61332m     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r3.vv(r1)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L1d
            com.ss.android.socialbase.downloader.model.m r1 = r3.f61332m     // Catch: java.lang.Throwable -> L5b
            r1.vv(r0)     // Catch: java.lang.Throwable -> L5b
            goto L4b
        L1d:
            com.ss.android.socialbase.downloader.model.m r1 = r3.f61332m     // Catch: java.lang.Throwable -> L5b
            r1.vv(r0)     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r3.o()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L4b
            com.ss.android.socialbase.downloader.qv.u r1 = r3.f61333n     // Catch: java.lang.Throwable -> L5b
            com.ss.android.socialbase.downloader.model.m r2 = r3.f61332m     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.la()     // Catch: java.lang.Throwable -> L5b
            com.ss.android.socialbase.downloader.model.m r1 = r1.vv(r2)     // Catch: java.lang.Throwable -> L5b
            r3.f61332m = r1     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r3.o()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L4b
            com.ss.android.socialbase.downloader.model.m r1 = r3.f61332m     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L4b
            r1 = 50
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L46
            goto L9
        L46:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L5b
            goto L9
        L4b:
            com.ss.android.socialbase.downloader.model.m r1 = r3.f61332m
            if (r1 == 0) goto L52
            r1.vv(r0)
        L52:
            r3.i()
            com.ss.android.socialbase.downloader.qv.u r0 = r3.f61333n
            r0.vv(r3)
            return
        L5b:
            r1 = move-exception
            com.ss.android.socialbase.downloader.model.m r2 = r3.f61332m
            if (r2 == 0) goto L63
            r2.vv(r0)
        L63:
            r3.i()
            com.ss.android.socialbase.downloader.qv.u r0 = r3.f61333n
            r0.vv(r3)
            goto L6d
        L6c:
            throw r1
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.m.run():void");
    }

    public void vv(long j4, long j5) {
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f61330i;
        if (oVar == null) {
            return;
        }
        oVar.vv(j4, j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x01dc A[Catch: all -> 0x02a1, TRY_ENTER, TryCatch #2 {all -> 0x02a1, blocks: (B:135:0x01d2, B:139:0x01dc, B:141:0x01e2, B:144:0x01eb, B:146:0x01f3, B:148:0x01f9, B:152:0x0204, B:154:0x0208, B:156:0x0210, B:158:0x0221, B:168:0x0249, B:170:0x024f, B:172:0x025c, B:176:0x0264, B:171:0x0256, B:162:0x0230, B:163:0x023c, B:178:0x026f, B:180:0x0277, B:182:0x027f, B:184:0x0287, B:186:0x028f, B:189:0x0298, B:122:0x01b4, B:126:0x01be, B:129:0x01c5), top: B:198:0x01d2, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024f A[Catch: all -> 0x02a1, TryCatch #2 {all -> 0x02a1, blocks: (B:135:0x01d2, B:139:0x01dc, B:141:0x01e2, B:144:0x01eb, B:146:0x01f3, B:148:0x01f9, B:152:0x0204, B:154:0x0208, B:156:0x0210, B:158:0x0221, B:168:0x0249, B:170:0x024f, B:172:0x025c, B:176:0x0264, B:171:0x0256, B:162:0x0230, B:163:0x023c, B:178:0x026f, B:180:0x0277, B:182:0x027f, B:184:0x0287, B:186:0x028f, B:189:0x0298, B:122:0x01b4, B:126:0x01be, B:129:0x01c5), top: B:198:0x01d2, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0256 A[Catch: all -> 0x02a1, TryCatch #2 {all -> 0x02a1, blocks: (B:135:0x01d2, B:139:0x01dc, B:141:0x01e2, B:144:0x01eb, B:146:0x01f3, B:148:0x01f9, B:152:0x0204, B:154:0x0208, B:156:0x0210, B:158:0x0221, B:168:0x0249, B:170:0x024f, B:172:0x025c, B:176:0x0264, B:171:0x0256, B:162:0x0230, B:163:0x023c, B:178:0x026f, B:180:0x0277, B:182:0x027f, B:184:0x0287, B:186:0x028f, B:189:0x0298, B:122:0x01b4, B:126:0x01be, B:129:0x01c5), top: B:198:0x01d2, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0264 A[Catch: all -> 0x02a1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02a1, blocks: (B:135:0x01d2, B:139:0x01dc, B:141:0x01e2, B:144:0x01eb, B:146:0x01f3, B:148:0x01f9, B:152:0x0204, B:154:0x0208, B:156:0x0210, B:158:0x0221, B:168:0x0249, B:170:0x024f, B:172:0x025c, B:176:0x0264, B:171:0x0256, B:162:0x0230, B:163:0x023c, B:178:0x026f, B:180:0x0277, B:182:0x027f, B:184:0x0287, B:186:0x028f, B:189:0x0298, B:122:0x01b4, B:126:0x01be, B:129:0x01c5), top: B:198:0x01d2, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[Catch: all -> 0x01b2, BaseException -> 0x01ce, TRY_ENTER, TryCatch #4 {BaseException -> 0x01ce, blocks: (B:22:0x004f, B:26:0x0059, B:30:0x0064, B:62:0x00f5, B:66:0x00ff, B:68:0x0103, B:79:0x0131, B:51:0x00db), top: B:201:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean vv(com.ss.android.socialbase.downloader.model.m r31) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.m.vv(com.ss.android.socialbase.downloader.model.m):boolean");
    }

    public m(com.ss.android.socialbase.downloader.model.m mVar, DownloadTask downloadTask, wv wvVar, u uVar) {
        this(mVar, downloadTask, uVar);
        this.qv = wvVar;
    }

    private void vv(com.ss.android.socialbase.downloader.model.m mVar, long j4) {
        com.ss.android.socialbase.downloader.model.m o4 = mVar.i() ? mVar.o() : mVar;
        if (o4 != null) {
            if (o4.qv()) {
                this.wv.vv(o4.b(), o4.m(), j4);
            }
            o4.m(j4);
            this.wv.vv(o4.b(), o4.la(), o4.m(), j4);
        } else if (mVar.i()) {
            this.wv.vv(mVar.b(), mVar.la(), j4);
        }
    }

    public void vv() {
        this.f61331k = true;
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f61330i;
        if (oVar != null) {
            oVar.m();
        }
    }
}
