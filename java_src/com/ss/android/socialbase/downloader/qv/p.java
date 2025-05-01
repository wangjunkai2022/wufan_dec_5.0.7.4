package com.ss.android.socialbase.downloader.qv;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.ss.android.socialbase.downloader.depend.d;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.ya;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.downloader.la;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.m;
import com.ss.android.socialbase.downloader.network.wv;
import com.ss.android.socialbase.downloader.u.b;
import com.ss.android.socialbase.downloader.u.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;
import org.cocos2dx.lib.GameControllerDelegate;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p implements u, Runnable {
    private static final String vv = p.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private String f61342a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f61343b;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.qv f61345d;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.n.vv f61346f;
    private g ff;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.qv f61347g;

    /* renamed from: j  reason: collision with root package name */
    private DownloadInfo f61349j;
    private boolean jh;

    /* renamed from: k  reason: collision with root package name */
    private boolean f61350k;

    /* renamed from: l  reason: collision with root package name */
    private wv f61351l;
    private com.ss.android.socialbase.downloader.downloader.n la;

    /* renamed from: m  reason: collision with root package name */
    private Future f61352m;

    /* renamed from: n  reason: collision with root package name */
    private volatile com.ss.android.socialbase.downloader.downloader.o f61353n;
    private com.ss.android.socialbase.downloader.network.n ns;

    /* renamed from: o  reason: collision with root package name */
    private AtomicInteger f61354o;

    /* renamed from: p  reason: collision with root package name */
    private final DownloadTask f61355p;
    private long pj;

    /* renamed from: q  reason: collision with root package name */
    private final k f61356q;
    private boolean qv;

    /* renamed from: r  reason: collision with root package name */
    private final AtomicBoolean f61357r;

    /* renamed from: v  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.u f61360v;
    private ya vu;
    private boolean wv;

    /* renamed from: x  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.n f61362x;

    /* renamed from: y  reason: collision with root package name */
    private la f61363y;
    private volatile BaseException ya;
    private long zn;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f61348i = false;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList<m> f61359u = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    private volatile com.ss.android.socialbase.downloader.constants.qv f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_NONE;
    private volatile int td = 5;
    private boolean pd = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f61361w = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f61344c = false;
    private int ot = 0;
    private volatile b cq = null;

    public p(DownloadTask downloadTask, Handler handler) {
        this.f61355p = downloadTask;
        if (downloadTask != null) {
            this.f61349j = downloadTask.getDownloadInfo();
            this.f61345d = downloadTask.getChunkStrategy();
            this.la = downloadTask.getChunkAdjustCalculator();
            this.vu = downloadTask.getForbiddenHandler();
            this.ff = downloadTask.getDiskSpaceHandler();
            this.f61363y = vv(downloadTask);
            this.f61346f = com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId());
        } else {
            this.f61346f = com.ss.android.socialbase.downloader.n.vv.p();
        }
        qv();
        this.f61356q = com.ss.android.socialbase.downloader.downloader.p.ns();
        this.f61347g = com.ss.android.socialbase.downloader.downloader.p.ot();
        this.f61362x = com.ss.android.socialbase.downloader.downloader.p.tf();
        this.f61360v = new com.ss.android.socialbase.downloader.downloader.u(downloadTask, handler);
        this.f61357r = new AtomicBoolean(true);
    }

    private void a() throws com.ss.android.socialbase.downloader.exception.u {
        if (this.f61349j.isOnlyWifi() && !com.ss.android.socialbase.downloader.wv.u.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), com.kuaishou.weapon.p0.g.f55582b)) {
            throw new com.ss.android.socialbase.downloader.exception.u(1019, String.format("download task need permission:%s", com.kuaishou.weapon.p0.g.f55582b));
        }
        if (this.f61349j.isDownloadWithWifiValid()) {
            if (!this.f61349j.isPauseReserveWithWifiValid()) {
                throw new com.ss.android.socialbase.downloader.exception.o();
            }
            return;
        }
        throw new com.ss.android.socialbase.downloader.exception.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[LOOP:0: B:24:0x0058->B:58:0x0058, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.p.b():void");
    }

    private void c() throws BaseException {
        if (!TextUtils.isEmpty(this.f61349j.getSavePath())) {
            if (!TextUtils.isEmpty(this.f61349j.getName())) {
                File file = new File(this.f61349j.getSavePath());
                if (!file.exists()) {
                    boolean mkdirs = file.mkdirs();
                    if (mkdirs || file.exists()) {
                        return;
                    }
                    int i4 = 0;
                    if (com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId()).vv("opt_mkdir_failed", 0) == 1) {
                        while (!mkdirs) {
                            int i5 = i4 + 1;
                            if (i4 >= 3) {
                                break;
                            }
                            try {
                                Thread.sleep(10L);
                                mkdirs = file.mkdirs();
                                i4 = i5;
                            } catch (InterruptedException unused) {
                            }
                        }
                        if (mkdirs || file.exists()) {
                            return;
                        }
                        if (com.ss.android.socialbase.downloader.wv.u.i(this.f61349j.getSavePath()) < 16384) {
                            throw new BaseException(1006, "download savePath directory can not created:" + this.f61349j.getSavePath());
                        }
                        throw new BaseException(1030, "download savePath directory can not created:" + this.f61349j.getSavePath());
                    }
                    throw new BaseException(1030, "download savePath directory can not created:" + this.f61349j.getSavePath());
                } else if (file.isDirectory()) {
                    return;
                } else {
                    if (com.ss.android.socialbase.downloader.wv.i.m(this.f61349j)) {
                        file.delete();
                        if (file.mkdirs() || file.exists()) {
                            return;
                        }
                        throw new BaseException(1031, "download savePath is not directory:path=" + this.f61349j.getSavePath());
                    }
                    throw new BaseException(1031, "download savePath is not a directory:" + this.f61349j.getSavePath());
                }
            }
            throw new BaseException(1029, "download name can not be empty");
        }
        throw new BaseException(1028, "download savePath can not be empty");
    }

    private boolean cq() {
        return false;
    }

    private void d() {
        com.ss.android.socialbase.downloader.network.n nVar = this.ns;
        if (nVar != null) {
            nVar.p();
            this.ns = null;
        }
    }

    private void f() {
        try {
            Iterator it2 = ((ArrayList) this.f61359u.clone()).iterator();
            while (it2.hasNext()) {
                m mVar = (m) it2.next();
                if (mVar != null) {
                    mVar.m();
                }
            }
        } catch (Throwable th) {
            String str = vv;
            com.ss.android.socialbase.downloader.p.vv.p(str, "cancelAllChunkRunnable: " + th.toString());
        }
    }

    private long ff() {
        return this.f61363y.vv(this.f61349j.getCurRetryTimeInTotal(), this.f61349j.getTotalRetryCount());
    }

    private void g() {
        wv wvVar = this.f61351l;
        if (wvVar != null) {
            wvVar.i();
            this.f61351l = null;
        }
    }

    private void j() {
        boolean z4;
        boolean z5;
        String str = vv;
        com.ss.android.socialbase.downloader.p.vv.m(str, "endDownloadRunnable::runStatus=" + this.f61358t);
        boolean z6 = (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE || this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED) ? false : true;
        try {
            z4 = ya();
            z5 = false;
        } catch (Exception e5) {
            if (e5 instanceof BaseException) {
                this.f61360v.vv((BaseException) e5);
            } else {
                this.f61360v.vv(new BaseException(1046, e5));
            }
            z4 = true;
            z5 = true;
        }
        if (!z4 && !z5) {
            this.pd = true;
            com.ss.android.socialbase.downloader.p.vv.m(vv, "jump to restart");
            return;
        }
        this.f61357r.set(false);
        if (z6) {
            try {
                com.ss.android.socialbase.downloader.impls.vv w4 = com.ss.android.socialbase.downloader.downloader.p.w();
                if (w4 != null) {
                    w4.vv(this);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                l monitorDepend = this.f61355p.getMonitorDepend();
                DownloadInfo downloadInfo = this.f61349j;
                BaseException baseException = new BaseException(1014, com.ss.android.socialbase.downloader.wv.u.m(th, "removeDownloadRunnable"));
                DownloadInfo downloadInfo2 = this.f61349j;
                com.ss.android.socialbase.downloader.i.vv.vv(monitorDepend, downloadInfo, baseException, downloadInfo2 != null ? downloadInfo2.getStatus() : 0);
            }
        }
    }

    private void jh() {
        boolean z4;
        List<com.ss.android.socialbase.downloader.model.m> p4;
        try {
            this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_NONE;
            this.f61349j.updateStartDownloadTime();
            this.f61349j.resetRealStartDownloadTime();
            long currentTimeMillis = System.currentTimeMillis();
            this.f61349j.setFirstSpeedTime(-1L);
            try {
                k();
                z4 = false;
            } catch (com.ss.android.socialbase.downloader.exception.vv e5) {
                String str = vv;
                com.ss.android.socialbase.downloader.p.vv.m(str, "file exist " + e5.vv());
                this.f61342a = e5.vv();
                z4 = true;
            }
            if (!this.pd) {
                this.f61360v.m();
            }
            this.pd = false;
            if (v()) {
                return;
            }
            if (!TextUtils.isEmpty(this.f61342a) && z4) {
                if (this.f61349j.isExpiredRedownload()) {
                    this.f61344c = com.ss.android.socialbase.downloader.wv.u.i(this.f61349j);
                }
                if (!this.f61344c) {
                    r();
                    return;
                }
            }
            while (!v()) {
                try {
                    try {
                        try {
                            c();
                            td();
                            a();
                            p4 = this.f61356q.p(this.f61349j.getId());
                            zn();
                        } catch (BaseException e6) {
                            com.ss.android.socialbase.downloader.p.vv.i(vv, "downloadInner: baseException = ".concat(String.valueOf(e6)));
                            if (this.f61358t != com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE) {
                                if (e6.getErrorCode() != 1025 && e6.getErrorCode() != 1009) {
                                    if (vv(e6)) {
                                        if (com.ss.android.socialbase.downloader.wv.u.vv(e6)) {
                                            pj();
                                        }
                                        if (vv(e6, 0L) != com.ss.android.socialbase.downloader.exception.qv.RETURN) {
                                            la();
                                        } else {
                                            la();
                                            return;
                                        }
                                    } else {
                                        m(e6);
                                    }
                                }
                                this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_END_RIGHT_NOW;
                                la();
                                return;
                            }
                        }
                    } catch (com.ss.android.socialbase.downloader.exception.wv e7) {
                        String str2 = vv;
                        com.ss.android.socialbase.downloader.p.vv.i(str2, "downloadInner: retry throwable for " + e7.vv());
                        if (this.f61358t != com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE) {
                            AtomicInteger atomicInteger = this.f61354o;
                            if (atomicInteger != null && atomicInteger.get() > 0) {
                                this.f61349j.updateCurRetryTime(this.f61354o.decrementAndGet());
                                this.f61349j.setStatus(5);
                            } else if (this.f61354o != null) {
                                if (this.f61349j.trySwitchToNextBackupUrl()) {
                                    this.f61349j.setStatus(5);
                                    this.f61354o.set(this.f61349j.getRetryCount());
                                    this.f61349j.updateCurRetryTime(this.f61354o.get());
                                } else {
                                    m(new BaseException(1018, String.format("retry for Throwable, but retry Time %s all used, last error is %s", String.valueOf(this.f61349j.getRetryCount()), e7.vv())));
                                }
                            } else {
                                m(new BaseException(1043, "retry for Throwable, but retain retry time is NULL, last error is" + e7.vv()));
                            }
                            la();
                        }
                    }
                } catch (com.ss.android.socialbase.downloader.exception.vv unused) {
                    r();
                }
                if (t()) {
                    com.ss.android.socialbase.downloader.p.vv.p(vv, "downloadSegments return");
                    la();
                    return;
                }
                String connectionUrl = this.f61349j.getConnectionUrl();
                if (v()) {
                    la();
                    return;
                }
                long o4 = this.wv ? com.ss.android.socialbase.downloader.wv.u.o(this.f61349j) : 0L;
                com.ss.android.socialbase.downloader.model.m vv2 = vv(this.f61349j, o4);
                List<com.ss.android.socialbase.downloader.model.p> vv3 = vv(vv2);
                com.ss.android.socialbase.downloader.wv.u.vv(vv3, this.f61349j);
                com.ss.android.socialbase.downloader.wv.u.m(vv3, this.f61349j);
                this.f61349j.setPreconnectLevel(0);
                long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    vv(connectionUrl, vv3, o4);
                    this.f61349j.increaseAllConnectTime(System.currentTimeMillis() - currentTimeMillis2);
                    if (v()) {
                        la();
                        return;
                    }
                    long totalBytes = this.f61349j.getTotalBytes();
                    vv(totalBytes);
                    int vv4 = vv(totalBytes, p4);
                    if (v()) {
                        la();
                        return;
                    } else if (vv4 > 0) {
                        boolean z5 = vv4 == 1;
                        this.qv = z5;
                        if (z5) {
                            if (this.f61351l == null) {
                                try {
                                    currentTimeMillis2 = System.currentTimeMillis();
                                    vv(connectionUrl, vv3);
                                    this.f61349j.increaseAllConnectTime(System.currentTimeMillis() - currentTimeMillis2);
                                } finally {
                                }
                            }
                            if (v()) {
                                la();
                                return;
                            }
                            this.f61349j.setFirstSpeedTime(System.currentTimeMillis() - currentTimeMillis);
                            q();
                            vv(vv2, connectionUrl, this.f61351l);
                        } else {
                            if (!this.f61349j.isNeedReuseFirstConnection()) {
                                g();
                            }
                            if (v()) {
                                la();
                                return;
                            }
                            q();
                            this.f61349j.setFirstSpeedTime(System.currentTimeMillis() - currentTimeMillis);
                            if (this.wv) {
                                vv(vv4, p4);
                            } else {
                                vv(totalBytes, vv4);
                            }
                        }
                        la();
                        return;
                    } else {
                        throw new BaseException(1032, "chunkCount is 0");
                    }
                } finally {
                }
            }
        } finally {
            j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f8, code lost:
        if (r9.f61346f.vv("fix_file_exist_update_download_info") != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0 A[Catch: all -> 0x00ed, TryCatch #6 {all -> 0x00ed, blocks: (B:59:0x00ac, B:61:0x00b0, B:63:0x00b4, B:76:0x00ec), top: B:91:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() throws com.ss.android.socialbase.downloader.exception.vv {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.p.k():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean l() {
        /*
            r7 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f61349j
            int r0 = r0.getChunkCount()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L28
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f61349j
            long r3 = r0.getCurBytes()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L27
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f61349j
            long r3 = r0.getCurBytes()
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f61349j
            long r5 = r0.getTotalBytes()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L27
            return r2
        L27:
            return r1
        L28:
            com.ss.android.socialbase.downloader.downloader.k r0 = r7.f61356q
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r7.f61349j
            int r3 = r3.getId()
            java.util.List r0 = r0.p(r3)
            if (r0 == 0) goto L57
            int r3 = r0.size()
            if (r3 > r2) goto L3d
            goto L57
        L3d:
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r0.next()
            com.ss.android.socialbase.downloader.model.m r3 = (com.ss.android.socialbase.downloader.model.m) r3
            if (r3 == 0) goto L55
            boolean r3 = r3.wv()
            if (r3 != 0) goto L41
        L55:
            return r1
        L56:
            return r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.p.l():boolean");
    }

    private void la() {
        d();
        g();
    }

    private boolean ns() {
        if (this.f61349j.isChunked()) {
            DownloadInfo downloadInfo = this.f61349j;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        String str = vv;
        com.ss.android.socialbase.downloader.p.vv.p(str, "checkCompletedByteValid: downloadInfo.getCurBytes() = " + this.f61349j.getCurBytes() + ",  downloadInfo.getTotalBytes() = " + this.f61349j.getTotalBytes());
        if (this.f61349j.getCurBytes() > 0) {
            if (this.f61349j.isIgnoreDataVerify()) {
                return true;
            }
            if (this.f61349j.getTotalBytes() > 0 && this.f61349j.getCurBytes() == this.f61349j.getTotalBytes()) {
                return true;
            }
        }
        this.f61349j.setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.m.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f61349j.reset();
        this.f61356q.vv(this.f61349j);
        this.f61356q.i(this.f61349j.getId());
        this.f61356q.r(this.f61349j.getId());
        com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ot() {
        com.ss.android.socialbase.downloader.impls.vv w4;
        if (v() || (w4 = com.ss.android.socialbase.downloader.downloader.p.w()) == null) {
            return;
        }
        w4.jh(this.f61349j.getId());
    }

    private boolean pd() {
        DownloadInfo downloadInfo = this.f61349j;
        return (downloadInfo == null || downloadInfo.isExpiredRedownload() || (this.wv && this.f61349j.getChunkCount() <= 1) || this.f61349j.isChunkDowngradeRetryUsed() || !this.f61350k || this.jh) ? false : true;
    }

    private void pj() {
        String str = vv;
        com.ss.android.socialbase.downloader.p.vv.i(str, "clearCurrentDownloadData::" + Log.getStackTraceString(new Throwable()));
        try {
            this.f61356q.i(this.f61349j.getId());
            this.f61356q.r(this.f61349j.getId());
            com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j);
            this.wv = false;
            this.f61349j.resetDataForEtagEndure("");
            this.f61356q.vv(this.f61349j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void q() {
        if (com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId()).vv("reset_retain_retry_times", 0) != 1 || this.ot >= 3) {
            return;
        }
        this.f61354o.set(this.f61349j.isBackUpUrlUsed() ? this.f61349j.getBackUpUrlRetryCount() : this.f61349j.getRetryCount());
        this.ot++;
    }

    private void qv() {
        DownloadInfo downloadInfo = this.f61349j;
        if (downloadInfo == null) {
            return;
        }
        int retryCount = downloadInfo.getRetryCount() - this.f61349j.getCurRetryTime();
        if (retryCount < 0) {
            retryCount = 0;
        }
        AtomicInteger atomicInteger = this.f61354o;
        if (atomicInteger == null) {
            this.f61354o = new AtomicInteger(retryCount);
        } else {
            atomicInteger.set(retryCount);
        }
    }

    private void r() {
        com.ss.android.socialbase.downloader.p.vv.m(vv, "finishWithFileExist");
        if (com.ss.android.socialbase.downloader.n.vv.p().m("fix_end_for_file_exist_error", true)) {
            if (this.f61342a.equals(this.f61349j.getName())) {
                this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_END_RIGHT_NOW;
            } else {
                this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_END_FOR_FILE_EXIST;
            }
        } else if (this.f61342a.equals(this.f61349j.getTargetFilePath())) {
            this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_END_RIGHT_NOW;
        } else {
            this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_END_FOR_FILE_EXIST;
        }
    }

    private boolean t() throws BaseException, InterruptedException {
        if (!this.f61349j.isExpiredRedownload() && this.f61349j.getChunkCount() == 1 && this.f61349j.getThrottleNetSpeed() <= 0) {
            JSONObject i4 = com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId()).i("segment_config");
            List<com.ss.android.socialbase.downloader.u.wv> t4 = this.f61356q.t(this.f61349j.getId());
            if (this.f61349j.getCurBytes() > 0) {
                if (t4 == null || t4.isEmpty()) {
                    return false;
                }
                if (i4 == null) {
                    i4 = new JSONObject();
                }
            }
            if (i4 == null) {
                return false;
            }
            this.cq = new b(this.f61349j, t.vv(i4), this);
            if (v()) {
                com.ss.android.socialbase.downloader.p.vv.p(vv, "downloadSegments: is stopped by user");
                if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED) {
                    this.cq.vv();
                } else {
                    this.cq.m();
                }
                return true;
            }
            return this.cq.vv(t4);
        }
        return false;
    }

    private void td() throws com.ss.android.socialbase.downloader.exception.wv, BaseException {
        com.ss.android.socialbase.downloader.impls.vv w4;
        int id = this.f61349j.getId();
        int vv2 = com.ss.android.socialbase.downloader.downloader.p.vv(this.f61349j);
        if (this.f61349j.isDownloaded() && !this.f61349j.isExpiredRedownload() && !this.f61344c) {
            throw new BaseException(1009, "file has downloaded");
        }
        DownloadInfo m4 = this.f61356q.m(vv2);
        if (m4 == null || (w4 = com.ss.android.socialbase.downloader.downloader.p.w()) == null || m4.getId() == id || !m4.equalsTask(this.f61349j)) {
            return;
        }
        if (!w4.vv(m4.getId())) {
            List<com.ss.android.socialbase.downloader.model.m> p4 = this.f61356q.p(vv2);
            com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j);
            this.f61356q.u(vv2);
            if (m4.isBreakpointAvailable()) {
                this.f61349j.copyFromCacheData(m4, false);
                this.f61356q.vv(this.f61349j);
                if (p4 != null) {
                    for (com.ss.android.socialbase.downloader.model.m mVar : p4) {
                        mVar.m(id);
                        this.f61356q.vv(mVar);
                    }
                }
                throw new com.ss.android.socialbase.downloader.exception.wv("retry task because id generator changed");
            }
            return;
        }
        this.f61356q.u(id);
        throw new BaseException((int) InputDeviceCompat.SOURCE_GAMEPAD, "another same task is downloading");
    }

    private boolean v() {
        if (y() || this.f61349j.getStatus() == -2) {
            if (y()) {
                return true;
            }
            if (this.f61349j.getStatus() == -2) {
                this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE;
                return true;
            } else if (this.f61349j.getStatus() == -4) {
                this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED;
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    private void vu() {
        this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_NONE;
    }

    private void w() throws BaseException {
        long j4;
        int vv2;
        try {
            j4 = com.ss.android.socialbase.downloader.wv.u.i(this.f61349j.getTempPath());
        } catch (BaseException unused) {
            j4 = 0;
        }
        String str = vv;
        com.ss.android.socialbase.downloader.p.vv.p(str, "checkSpaceOverflowInProgress: available = " + com.ss.android.socialbase.downloader.wv.u.vv(j4) + "MB");
        if (j4 > 0) {
            long totalBytes = this.f61349j.getTotalBytes() - this.f61349j.getCurBytes();
            if (j4 < totalBytes && (vv2 = com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId()).vv("space_fill_min_keep_mb", 100)) > 0) {
                long j5 = j4 - (vv2 * 1048576);
                com.ss.android.socialbase.downloader.p.vv.p(str, "checkSpaceOverflowInProgress: minKeep  = " + vv2 + "MB, canDownload = " + com.ss.android.socialbase.downloader.wv.u.vv(j5) + "MB");
                if (j5 > 0) {
                    this.zn = this.f61349j.getCurBytes() + j5 + 1048576;
                    return;
                } else {
                    this.zn = 0L;
                    throw new com.ss.android.socialbase.downloader.exception.i(j4, totalBytes);
                }
            }
        }
        this.zn = 0L;
    }

    private boolean wv() {
        int status = this.f61349j.getStatus();
        if (status == 1 || this.f61349j.canSkipStatusHandler()) {
            return true;
        }
        if (status == -2 || status == -4) {
            return false;
        }
        m(new BaseException(1000, "The download Task can't start, because its status is not prepare:".concat(String.valueOf(status))));
        return false;
    }

    private void x() throws BaseException {
        if (this.f61353n != null) {
            if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED) {
                this.f61349j.setStatus(-4);
                this.f61353n.p();
            } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE) {
                this.f61349j.setStatus(-2);
                this.f61353n.m();
            } else {
                this.f61353n.i();
            }
        }
    }

    private boolean y() {
        return this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED || this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE;
    }

    private boolean ya() {
        if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_ERROR) {
            this.f61360v.vv(this.ya);
        } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED) {
            this.f61360v.p();
        } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE) {
            this.f61360v.i();
        } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_END_RIGHT_NOW) {
            try {
                this.f61360v.n();
            } catch (BaseException e5) {
                this.f61360v.vv(e5);
            }
        } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                this.f61360v.vv(this.f61342a);
            } catch (BaseException e6) {
                this.f61360v.vv(e6);
            }
        } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
            this.f61360v.vv(this.ya, false);
            return false;
        } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_WAITING_ASYNC_HANDLER) {
            return true;
        } else {
            com.ss.android.socialbase.downloader.constants.qv qvVar = this.f61358t;
            com.ss.android.socialbase.downloader.constants.qv qvVar2 = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_RETRY_DELAY;
            if (qvVar == qvVar2 && !l()) {
                com.ss.android.socialbase.downloader.p.vv.m(vv, "doTaskStatusHandle retryDelay");
                vu();
                return this.f61358t == qvVar2;
            }
            try {
                if (!ns()) {
                    return false;
                }
                this.f61360v.u();
                com.ss.android.socialbase.downloader.impls.g.vv().i();
            } catch (Throwable th) {
                m(new BaseException(1008, com.ss.android.socialbase.downloader.wv.u.m(th, "doTaskStatusHandle onComplete")));
            }
        }
        return true;
    }

    private void zn() {
        long u4 = com.ss.android.socialbase.downloader.wv.u.u(this.f61349j);
        long curBytes = this.f61349j.getCurBytes();
        if (u4 != curBytes) {
            String str = vv;
            com.ss.android.socialbase.downloader.p.vv.i(str, "checkTaskCanResume: offset = " + u4 + ", curBytes = " + curBytes);
        }
        this.f61349j.setCurBytes(u4);
        boolean z4 = u4 > 0;
        this.wv = z4;
        if (z4 || this.f61344c) {
            return;
        }
        com.ss.android.socialbase.downloader.p.vv.p(vv, "checkTaskCanResume: deleteAllDownloadFiles");
        this.f61356q.i(this.f61349j.getId());
        this.f61356q.r(this.f61349j.getId());
        com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j);
    }

    public boolean i() {
        return this.f61357r.get();
    }

    public void m() {
        com.ss.android.socialbase.downloader.constants.qv qvVar = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED;
        this.f61358t = qvVar;
        if (this.cq != null) {
            this.cq.vv();
        }
        if (this.f61353n != null) {
            this.f61353n.p();
        }
        if (this.cq == null && this.f61353n == null) {
            la();
            this.f61358t = qvVar;
            j();
        }
        f();
    }

    public Future n() {
        return this.f61352m;
    }

    public int o() {
        DownloadInfo downloadInfo = this.f61349j;
        if (downloadInfo != null) {
            return downloadInfo.getId();
        }
        return 0;
    }

    public DownloadTask p() {
        return this.f61355p;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.ss.android.socialbase.downloader.downloader.p.vv(this.f61355p, 3);
        try {
            com.ss.android.socialbase.downloader.network.m.vv().m();
            b();
            com.ss.android.socialbase.downloader.network.m.vv().p();
            com.ss.android.socialbase.downloader.downloader.p.m(this.f61355p, 3);
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.network.m.vv().p();
            throw th;
        }
    }

    public void u() {
        this.pj = System.currentTimeMillis();
        this.f61360v.vv();
    }

    private boolean i(BaseException baseException) {
        AtomicInteger atomicInteger = this.f61354o;
        boolean z4 = true;
        if (atomicInteger != null) {
            if (atomicInteger.get() <= 0 || (baseException != null && baseException.getErrorCode() == 1070)) {
                if (this.f61349j.trySwitchToNextBackupUrl()) {
                    this.f61354o.set(this.f61349j.getBackUpUrlRetryCount());
                    this.f61349j.updateCurRetryTime(this.f61354o.get());
                } else if (baseException != null && ((baseException.getErrorCode() == 1011 || (baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException))) && this.f61349j.canReplaceHttpForRetry())) {
                    this.f61354o.set(this.f61349j.getRetryCount());
                    this.f61349j.updateCurRetryTime(this.f61354o.get());
                    this.f61349j.setHttpsToHttpRetryUsed(true);
                } else {
                    m(new BaseException(baseException.getErrorCode(), String.format("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", String.valueOf(this.f61354o), String.valueOf(this.f61349j.getRetryCount()), baseException.getErrorMessage())));
                    return true;
                }
                z4 = false;
            }
            if (this.f61358t != com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_RETRY_DELAY && z4) {
                this.f61349j.updateCurRetryTime(this.f61354o.decrementAndGet());
            }
            return false;
        }
        m(new BaseException(1043, "retry for exception, but retain retry time is null, last error is :" + baseException.getErrorMessage()));
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public void p(BaseException baseException) {
        DownloadInfo downloadInfo = this.f61349j;
        if (downloadInfo != null) {
            downloadInfo.setChunkDowngradeRetryUsed(true);
        }
        vv(baseException, false);
    }

    public void vv() {
        com.ss.android.socialbase.downloader.constants.qv qvVar = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE;
        this.f61358t = qvVar;
        if (this.cq != null) {
            this.cq.m();
        }
        if (this.f61353n != null) {
            this.f61353n.m();
        }
        if (this.cq == null && this.f61353n == null) {
            la();
            this.f61358t = qvVar;
            j();
        }
        try {
            Iterator it2 = ((ArrayList) this.f61359u.clone()).iterator();
            while (it2.hasNext()) {
                m mVar = (m) it2.next();
                if (mVar != null) {
                    mVar.vv();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void m(String str, List<com.ss.android.socialbase.downloader.model.p> list, long j4) throws BaseException, com.ss.android.socialbase.downloader.exception.wv {
        com.ss.android.socialbase.downloader.network.vv.p vv2;
        boolean z4 = true;
        if (this.f61349j.getChunkCount() == 1 && (vv2 = com.ss.android.socialbase.downloader.network.vv.vv.vv().vv(str, list)) != null) {
            this.ns = vv2;
            this.f61349j.setPreconnectLevel(1);
        }
        if (this.ns == null && !this.f61361w && this.f61349j.isHeadConnectionAvailable()) {
            try {
                int m4 = this.f61346f.m("net_lib_strategy");
                if (this.f61346f.vv("monitor_download_connect", 0) <= 0) {
                    z4 = false;
                }
                this.ns = com.ss.android.socialbase.downloader.downloader.p.vv(str, list, m4, z4, this.f61349j);
            } catch (Throwable th) {
                this.f61349j.setHeadConnectionException(com.ss.android.socialbase.downloader.wv.u.k(th));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r9 <= 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int vv(long r7, java.util.List<com.ss.android.socialbase.downloader.model.m> r9) {
        /*
            r6 = this;
            boolean r0 = r6.pd()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5e
            boolean r0 = r6.wv
            if (r0 == 0) goto L1a
            if (r9 == 0) goto L13
            int r9 = r9.size()
            goto L5c
        L13:
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r6.f61349j
            int r9 = r9.getChunkCount()
            goto L5c
        L1a:
            com.ss.android.socialbase.downloader.downloader.qv r9 = r6.f61345d
            if (r9 == 0) goto L23
            int r9 = r9.vv(r7)
            goto L29
        L23:
            com.ss.android.socialbase.downloader.downloader.qv r9 = r6.f61347g
            int r9 = r9.vv(r7)
        L29:
            com.ss.android.socialbase.downloader.network.b r0 = com.ss.android.socialbase.downloader.network.b.vv()
            com.ss.android.socialbase.downloader.network.jh r0 = r0.m()
            java.lang.String r3 = com.ss.android.socialbase.downloader.qv.p.vv
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r0.name()
            r4[r1] = r5
            java.lang.String r5 = "NetworkQuality is : %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            com.ss.android.socialbase.downloader.p.vv.m(r3, r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r6.f61349j
            java.lang.String r4 = r0.name()
            r3.setNetworkQuality(r4)
            com.ss.android.socialbase.downloader.downloader.n r3 = r6.la
            if (r3 == 0) goto L56
            int r9 = r3.vv(r9, r0)
            goto L5c
        L56:
            com.ss.android.socialbase.downloader.downloader.n r3 = r6.f61362x
            int r9 = r3.vv(r9, r0)
        L5c:
            if (r9 > 0) goto L5f
        L5e:
            r9 = 1
        L5f:
            boolean r0 = com.ss.android.socialbase.downloader.p.vv.vv()
            if (r0 == 0) goto L88
            java.lang.String r0 = com.ss.android.socialbase.downloader.qv.p.vv
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r3[r1] = r4
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r6.f61349j
            java.lang.String r1 = r1.getName()
            r3[r2] = r1
            r1 = 2
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r3[r1] = r7
            java.lang.String r7 = "chunk count : %s for %s contentLen:%s"
            java.lang.String r7 = java.lang.String.format(r7, r3)
            com.ss.android.socialbase.downloader.p.vv.m(r0, r7)
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.p.vv(long, java.util.List):int");
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public boolean m(long j4) throws BaseException {
        if (this.zn > 0 && this.f61349j.getCurBytes() > this.zn) {
            w();
        }
        return this.f61360v.vv(j4);
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public void m(BaseException baseException) {
        String str = vv;
        com.ss.android.socialbase.downloader.p.vv.m(str, "onError:" + baseException.getMessage());
        this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_ERROR;
        this.ya = baseException;
        f();
    }

    private void vv(String str, List<com.ss.android.socialbase.downloader.model.p> list, long j4) throws BaseException, com.ss.android.socialbase.downloader.exception.wv {
        m(str, list, j4);
        com.ss.android.socialbase.downloader.network.n nVar = this.ns;
        if (nVar != null) {
            try {
                vv(str, nVar, j4);
            } catch (Throwable unused) {
                this.f61361w = true;
            }
        }
        if (this.ns == null || this.f61361w) {
            vv(str, list);
            vv(str, this.f61351l, j4);
        }
    }

    private void vv(String str, List<com.ss.android.socialbase.downloader.model.p> list) throws BaseException, com.ss.android.socialbase.downloader.exception.wv {
        wv wvVar;
        if (this.f61351l != null) {
            return;
        }
        com.ss.android.socialbase.downloader.network.vv.i m4 = this.f61349j.getChunkCount() == 1 ? com.ss.android.socialbase.downloader.network.vv.vv.vv().m(str, list) : null;
        try {
            if (m4 != null) {
                vv(this.f61351l);
                this.f61349j.setPreconnectLevel(2);
                this.f61351l = m4;
            } else {
                try {
                    wvVar = com.ss.android.socialbase.downloader.downloader.p.vv(this.f61349j.isNeedDefaultHttpServiceBackUp(), this.f61349j.getMaxBytes(), str, null, list, this.f61346f.m("net_lib_strategy"), this.f61346f.vv("monitor_download_connect", 0) > 0, this.f61349j);
                    this.f61351l = wvVar;
                } catch (BaseException e5) {
                    throw e5;
                } catch (Throwable th) {
                    if (this.f61349j.isExpiredRedownload() && com.ss.android.socialbase.downloader.wv.u.n(th) && com.ss.android.socialbase.downloader.wv.u.p(list)) {
                        com.ss.android.socialbase.downloader.p.vv.m(vv, "dcache=execepiton responseCode=304 lastModified not changed, use local file.. old cacheControl=" + this.f61349j.getCacheControl());
                        long wv = com.ss.android.socialbase.downloader.wv.u.wv(this.f61349j.getCacheControl());
                        if (wv <= 0) {
                            wv = com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId()).vv("default_304_max_age", 300);
                        }
                        this.f61349j.setCacheExpiredTime(System.currentTimeMillis() + (wv * 1000));
                        throw new com.ss.android.socialbase.downloader.exception.vv(this.f61342a);
                    }
                    if (com.ss.android.socialbase.downloader.wv.u.u(th)) {
                        vv("", "http code 416");
                    } else if (com.ss.android.socialbase.downloader.wv.u.o(th)) {
                        vv("", "http code 412");
                    } else {
                        com.ss.android.socialbase.downloader.wv.u.vv(th, "CreateFirstConnection");
                    }
                    wvVar = this.f61351l;
                }
                vv(wvVar);
            }
            if (this.f61351l == null) {
                throw new BaseException((int) GameControllerDelegate.BUTTON_SELECT, new IOException("download can't continue, firstConnection is null"));
            }
        } catch (Throwable th2) {
            vv(this.f61351l);
            throw th2;
        }
    }

    public static com.ss.android.socialbase.downloader.model.m vv(DownloadInfo downloadInfo, long j4) {
        return new m.vv(downloadInfo.getId()).vv(-1).vv(0L).o(j4).m(j4).p(0L).i(downloadInfo.getTotalBytes() - j4).vv();
    }

    private List<com.ss.android.socialbase.downloader.model.p> vv(com.ss.android.socialbase.downloader.model.m mVar) {
        List<com.ss.android.socialbase.downloader.model.p> vv2 = com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j.getExtraHeaders(), this.f61349j.geteTag(), mVar);
        if (this.f61349j.isExpiredRedownload() && this.f61344c && this.f61349j.getLastModified() != null) {
            vv2.add(new com.ss.android.socialbase.downloader.model.p("if-modified-since", this.f61349j.getLastModified()));
            vv2.add(new com.ss.android.socialbase.downloader.model.p("download-tc21-1-15", "download-tc21-1-15"));
            String str = vv;
            com.ss.android.socialbase.downloader.p.vv.m(str, "dcache::add head IF_MODIFIED_SINCE=" + this.f61349j.getLastModified());
        }
        return vv2;
    }

    private void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) throws BaseException {
        if (list.size() == i4) {
            vv(list, this.f61349j.getTotalBytes());
            return;
        }
        throw new BaseException(1033, new IllegalArgumentException());
    }

    private void vv(long j4, int i4) throws BaseException {
        long j5 = j4 / i4;
        int id = this.f61349j.getId();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        long j6 = 0;
        while (i5 < i4) {
            com.ss.android.socialbase.downloader.model.m vv2 = new m.vv(id).vv(i5).vv(j6).o(j6).m(j6).p(i5 == i4 + (-1) ? 0L : (j6 + j5) - 1).vv();
            arrayList.add(vv2);
            this.f61356q.vv(vv2);
            j6 += j5;
            i5++;
        }
        this.f61349j.setChunkCount(i4);
        this.f61356q.vv(id, i4);
        vv(arrayList, j4);
    }

    private void vv(List<com.ss.android.socialbase.downloader.model.m> list, long j4) throws BaseException {
        long j5;
        for (com.ss.android.socialbase.downloader.model.m mVar : list) {
            if (mVar != null) {
                if (mVar.j() == 0) {
                    j5 = j4 - mVar.t();
                } else {
                    j5 = (mVar.j() - mVar.t()) + 1;
                }
                if (j5 > 0) {
                    mVar.vv(j5);
                    if (this.f61349j.isNeedReuseFirstConnection() && this.f61351l != null && (!this.f61349j.isHeadConnectionAvailable() || this.f61361w)) {
                        if (mVar.la() == 0) {
                            this.f61359u.add(new m(mVar, this.f61355p, this.f61351l, this));
                        } else if (mVar.la() > 0) {
                            this.f61359u.add(new m(mVar, this.f61355p, this));
                        }
                    } else {
                        this.f61359u.add(new m(mVar, this.f61355p, this));
                    }
                }
            }
        }
        if (com.ss.android.socialbase.downloader.wv.vv.vv(64)) {
            ArrayList arrayList = new ArrayList(this.f61359u.size());
            Iterator<m> it2 = this.f61359u.iterator();
            while (it2.hasNext()) {
                m next = it2.next();
                if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED) {
                    next.m();
                } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE) {
                    next.vv();
                } else {
                    arrayList.add(next);
                }
            }
            try {
                List<Future> i4 = com.ss.android.socialbase.downloader.impls.o.i(arrayList);
                for (Runnable runnable = (Runnable) arrayList.remove(0); runnable != null; runnable = com.ss.android.socialbase.downloader.impls.o.o(i4)) {
                    if (v()) {
                        return;
                    }
                    runnable.run();
                }
                if (i4 == null || i4.isEmpty()) {
                    return;
                }
                for (Future future : i4) {
                    if (future != null && !future.isDone()) {
                        try {
                            future.get();
                        } catch (Throwable unused) {
                        }
                    }
                }
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f61359u.size());
        Iterator<m> it3 = this.f61359u.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_CANCELED) {
                next2.m();
            } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_PAUSE) {
                next2.vv();
            } else {
                arrayList2.add(Executors.callable(next2));
            }
        }
        if (v()) {
            return;
        }
        try {
            com.ss.android.socialbase.downloader.impls.o.p(arrayList2);
        } catch (InterruptedException e5) {
            throw new BaseException(1020, e5);
        }
    }

    private void vv(com.ss.android.socialbase.downloader.model.m mVar, String str, wv wvVar) throws BaseException {
        mVar.vv(this.f61349j.getTotalBytes() - mVar.t());
        this.f61349j.setChunkCount(1);
        this.f61356q.vv(this.f61349j.getId(), 1);
        this.f61353n = new com.ss.android.socialbase.downloader.downloader.o(this.f61349j, str, wvVar, mVar, this);
        x();
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public void vv(long j4) throws BaseException {
        long j5;
        String tempPath = this.f61349j.getTempPath();
        String tempName = this.f61349j.getTempName();
        if (com.ss.android.socialbase.downloader.wv.u.m(j4)) {
            return;
        }
        com.ss.android.socialbase.downloader.model.o vv2 = com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j, tempPath, tempName, -1);
        try {
            long length = new File(tempPath, tempName).length();
            long j6 = j4 - length;
            long i4 = com.ss.android.socialbase.downloader.wv.u.i(tempPath);
            com.ss.android.socialbase.downloader.n.vv vv3 = com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId());
            if (vv3.vv("space_fill_part_download", 0) == 1) {
                this.zn = 0L;
                if (j6 <= 0) {
                    j6 = this.f61349j.getTotalBytes() - this.f61349j.getCurBytes();
                }
                if (i4 < j6) {
                    String str = vv;
                    com.ss.android.socialbase.downloader.p.vv.i(str, "checkSpaceOverflow: contentLength = " + com.ss.android.socialbase.downloader.wv.u.vv(j4) + "MB, downloaded = " + com.ss.android.socialbase.downloader.wv.u.vv(length) + "MB, required = " + com.ss.android.socialbase.downloader.wv.u.vv(j6) + "MB, available = " + com.ss.android.socialbase.downloader.wv.u.vv(i4) + "MB");
                    if (i4 > 0) {
                        int vv4 = vv3.vv("space_fill_min_keep_mb", 100);
                        if (vv4 > 0) {
                            long j7 = i4 - (vv4 * 1048576);
                            com.ss.android.socialbase.downloader.p.vv.i(str, "checkSpaceOverflow: minKeep = " + vv4 + "MB, canDownload = " + com.ss.android.socialbase.downloader.wv.u.vv(j7) + "MB");
                            if (j7 > 0) {
                                this.zn = this.f61349j.getCurBytes() + j7;
                                j5 = j7;
                            } else {
                                throw new com.ss.android.socialbase.downloader.exception.i(i4, j6);
                            }
                        } else {
                            j5 = i4;
                        }
                        if (length < j4) {
                            if (j5 + length > j4) {
                            }
                            vv2.m(j4);
                            com.ss.android.socialbase.downloader.wv.u.vv(vv2);
                        }
                    } else if (vv3.vv("download_when_space_negative", 0) != 1) {
                        StringBuilder sb = new StringBuilder("availableSpace ");
                        sb.append(i4 == 0 ? SimpleComparison.EQUAL_TO_OPERATION : SimpleComparison.LESS_THAN_OPERATION);
                        sb.append(" 0");
                        throw new BaseException(1052, sb.toString());
                    } else {
                        vv2.m(j4);
                        com.ss.android.socialbase.downloader.wv.u.vv(vv2);
                    }
                }
            } else if (i4 <= 0) {
                StringBuilder sb2 = new StringBuilder("availableSpace ");
                sb2.append(i4 == 0 ? SimpleComparison.EQUAL_TO_OPERATION : SimpleComparison.LESS_THAN_OPERATION);
                sb2.append(" 0");
                throw new BaseException(1052, sb2.toString());
            } else if (i4 < j6) {
                throw new com.ss.android.socialbase.downloader.exception.i(i4, j6);
            }
            vv2.m(j4);
            com.ss.android.socialbase.downloader.wv.u.vv(vv2);
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.wv.u.vv(vv2);
            throw th;
        }
    }

    private boolean vv(int i4, String str, String str2) {
        if (i4 == 412) {
            return true;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2) || !(this.f61343b || this.f61350k)) {
            return (i4 == 201 || i4 == 416) && this.f61349j.getCurBytes() > 0;
        }
        return true;
    }

    private void vv(String str, String str2) throws com.ss.android.socialbase.downloader.exception.wv {
        this.f61356q.i(this.f61349j.getId());
        this.f61356q.r(this.f61349j.getId());
        com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j);
        this.wv = false;
        this.f61349j.resetDataForEtagEndure(str);
        this.f61356q.vv(this.f61349j);
        throw new com.ss.android.socialbase.downloader.exception.wv(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0247, code lost:
        r8 = com.ss.android.socialbase.downloader.wv.u.m(r10, "Content-Range");
        com.ss.android.socialbase.downloader.p.vv.p(r14, "firstConnection: contentRange = " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0262, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026d, code lost:
        if (r19.f61346f.m("fix_get_total_bytes", true) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026f, code lost:
        r3 = com.ss.android.socialbase.downloader.wv.u.m(r8);
        com.ss.android.socialbase.downloader.p.vv.p(r14, "firstConnection: 1 totalLength = " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0285, code lost:
        r11 = r22 + r3;
        com.ss.android.socialbase.downloader.p.vv.o(r14, "firstConnection: 2 totalLength = " + r11 + ", contentLength = " + r3);
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0134, code lost:
        com.ss.android.socialbase.downloader.wv.u.vv(r19.f61349j);
     */
    @Override // com.ss.android.socialbase.downloader.qv.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vv(java.lang.String r20, com.ss.android.socialbase.downloader.network.n r21, long r22) throws com.ss.android.socialbase.downloader.exception.BaseException, com.ss.android.socialbase.downloader.exception.wv {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.p.vv(java.lang.String, com.ss.android.socialbase.downloader.network.n, long):void");
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public void vv(m mVar) {
        if (this.qv) {
            return;
        }
        synchronized (this) {
            this.f61359u.remove(mVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public boolean vv(BaseException baseException) {
        if (this.cq == null || !com.ss.android.socialbase.downloader.wv.u.wv(baseException) || this.f61354o.get() >= this.f61349j.getRetryCount()) {
            if (com.ss.android.socialbase.downloader.wv.u.m(baseException)) {
                if (this.qv && !this.f61348i) {
                    com.ss.android.socialbase.downloader.wv.u.vv(this.f61349j);
                    this.f61348i = true;
                }
                return true;
            }
            AtomicInteger atomicInteger = this.f61354o;
            return ((atomicInteger != null && atomicInteger.get() > 0) || this.f61349j.hasNextBackupUrl() || (baseException != null && ((baseException.getErrorCode() == 1011 || (baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException))) && this.f61349j.canReplaceHttpForRetry()))) && !(baseException instanceof com.ss.android.socialbase.downloader.exception.u);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public void vv(BaseException baseException, boolean z4) {
        com.ss.android.socialbase.downloader.p.vv.m(vv, "onAllChunkRetryWithReset");
        this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.ya = baseException;
        f();
        if (z4 ? i(baseException) : false) {
            return;
        }
        pj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f61349j.setForbiddenBackupUrls(list, this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_WAITING_ASYNC_HANDLER);
        com.ss.android.socialbase.downloader.impls.vv w4 = com.ss.android.socialbase.downloader.downloader.p.w();
        if (w4 != null) {
            w4.jh(this.f61349j.getId());
        }
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public com.ss.android.socialbase.downloader.exception.qv vv(com.ss.android.socialbase.downloader.model.m mVar, BaseException baseException, long j4) {
        if (y()) {
            return com.ss.android.socialbase.downloader.exception.qv.RETURN;
        }
        if (baseException != null && (baseException.getErrorCode() == 1047 || com.ss.android.socialbase.downloader.wv.u.qv(baseException))) {
            return vv(baseException, j4);
        }
        this.ya = baseException;
        this.f61349j.increaseCurBytes(-j4);
        this.f61356q.vv(this.f61349j);
        if (i(baseException)) {
            return com.ss.android.socialbase.downloader.exception.qv.RETURN;
        }
        com.ss.android.socialbase.downloader.downloader.u uVar = this.f61360v;
        com.ss.android.socialbase.downloader.constants.qv qvVar = this.f61358t;
        com.ss.android.socialbase.downloader.constants.qv qvVar2 = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_RETRY_DELAY;
        uVar.vv(mVar, baseException, qvVar == qvVar2);
        if (this.f61358t != qvVar2 && this.f61349j.isNeedRetryDelay()) {
            long ff = ff();
            if (ff > 0) {
                com.ss.android.socialbase.downloader.p.vv.p(vv, "onSingleChunkRetry with delay time ".concat(String.valueOf(ff)));
                try {
                    Thread.sleep(ff);
                } catch (Throwable th) {
                    String str = vv;
                    com.ss.android.socialbase.downloader.p.vv.i(str, "onSingleChunkRetry:" + th.getMessage());
                }
            }
        }
        return com.ss.android.socialbase.downloader.exception.qv.CONTINUE;
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public com.ss.android.socialbase.downloader.exception.qv vv(BaseException baseException, long j4) {
        long totalBytes;
        long j5;
        boolean z4;
        this.ya = baseException;
        this.f61349j.increaseCurBytes(-j4);
        this.f61356q.vv(this.f61349j);
        if (y()) {
            return com.ss.android.socialbase.downloader.exception.qv.RETURN;
        }
        if (baseException != null && baseException.getErrorCode() == 1047) {
            if (this.vu != null && !this.f61349j.isForbiddenRetryed()) {
                com.ss.android.socialbase.downloader.depend.m mVar = new com.ss.android.socialbase.downloader.depend.m() { // from class: com.ss.android.socialbase.downloader.qv.p.1
                    @Override // com.ss.android.socialbase.downloader.depend.m, com.ss.android.socialbase.downloader.depend.v
                    public void vv(List<String> list) {
                        super.vv(list);
                        p.this.vv(list);
                    }
                };
                boolean vv2 = this.vu.vv(mVar);
                this.f61349j.setForbiddenRetryed();
                if (vv2) {
                    if (!mVar.vv()) {
                        f();
                        this.f61360v.qv();
                        this.f61358t = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_WAITING_ASYNC_HANDLER;
                        return com.ss.android.socialbase.downloader.exception.qv.RETURN;
                    }
                    z4 = true;
                }
            } else if (i(baseException)) {
                return com.ss.android.socialbase.downloader.exception.qv.RETURN;
            }
            z4 = false;
        } else if (com.ss.android.socialbase.downloader.wv.u.qv(baseException)) {
            if (this.ff == null) {
                m(baseException);
                return com.ss.android.socialbase.downloader.exception.qv.RETURN;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d dVar = new d() { // from class: com.ss.android.socialbase.downloader.qv.p.2
                @Override // com.ss.android.socialbase.downloader.depend.d
                public void vv() {
                    synchronized (p.this) {
                        atomicBoolean.set(true);
                        p.this.ot();
                    }
                }
            };
            if (baseException instanceof com.ss.android.socialbase.downloader.exception.i) {
                com.ss.android.socialbase.downloader.exception.i iVar = (com.ss.android.socialbase.downloader.exception.i) baseException;
                j5 = iVar.vv();
                totalBytes = iVar.m();
            } else {
                totalBytes = this.f61349j.getTotalBytes();
                j5 = -1;
            }
            synchronized (this) {
                if (this.ff.vv(j5, totalBytes, dVar)) {
                    if (!com.ss.android.socialbase.downloader.n.vv.vv(this.f61349j.getId()).m("not_delete_when_clean_space", false)) {
                        ns();
                    }
                    if (!atomicBoolean.get()) {
                        com.ss.android.socialbase.downloader.constants.qv qvVar = this.f61358t;
                        com.ss.android.socialbase.downloader.constants.qv qvVar2 = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_WAITING_ASYNC_HANDLER;
                        if (qvVar != qvVar2) {
                            this.f61358t = qvVar2;
                            f();
                            this.f61360v.qv();
                        }
                        return com.ss.android.socialbase.downloader.exception.qv.RETURN;
                    }
                    if (i(baseException)) {
                        return com.ss.android.socialbase.downloader.exception.qv.RETURN;
                    }
                    z4 = true;
                } else if (this.f61358t == com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_WAITING_ASYNC_HANDLER) {
                    return com.ss.android.socialbase.downloader.exception.qv.RETURN;
                } else {
                    m(baseException);
                    return com.ss.android.socialbase.downloader.exception.qv.RETURN;
                }
            }
        } else {
            if (i(baseException)) {
                return com.ss.android.socialbase.downloader.exception.qv.RETURN;
            }
            z4 = false;
        }
        if (!z4 && cq()) {
            f();
        }
        com.ss.android.socialbase.downloader.downloader.u uVar = this.f61360v;
        com.ss.android.socialbase.downloader.constants.qv qvVar3 = this.f61358t;
        com.ss.android.socialbase.downloader.constants.qv qvVar4 = com.ss.android.socialbase.downloader.constants.qv.RUN_STATUS_RETRY_DELAY;
        uVar.vv(baseException, qvVar3 == qvVar4);
        return this.f61358t == qvVar4 ? com.ss.android.socialbase.downloader.exception.qv.RETURN : com.ss.android.socialbase.downloader.exception.qv.CONTINUE;
    }

    @Override // com.ss.android.socialbase.downloader.qv.u
    public synchronized com.ss.android.socialbase.downloader.model.m vv(int i4) {
        com.ss.android.socialbase.downloader.model.m vv2;
        if (this.f61349j.getChunkCount() < 2) {
            return null;
        }
        List<com.ss.android.socialbase.downloader.model.m> p4 = this.f61356q.p(this.f61349j.getId());
        if (p4 != null && !p4.isEmpty()) {
            for (int i5 = 0; i5 < p4.size(); i5++) {
                com.ss.android.socialbase.downloader.model.m mVar = p4.get(i5);
                if (mVar != null && (vv2 = vv(mVar, i4)) != null) {
                    return vv2;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // com.ss.android.socialbase.downloader.qv.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vv(com.ss.android.socialbase.downloader.network.n r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L1a
            int r2 = r2.m()     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f61349j     // Catch: java.lang.Throwable -> L16
            r0.setHttpStatusCode(r2)     // Catch: java.lang.Throwable -> L16
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f61349j     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = com.ss.android.socialbase.downloader.wv.m.vv(r2)     // Catch: java.lang.Throwable -> L16
            r0.setHttpStatusMessage(r2)     // Catch: java.lang.Throwable -> L16
            r2 = 1
            goto L1b
        L16:
            r2 = move-exception
            r2.printStackTrace()
        L1a:
            r2 = 0
        L1b:
            if (r2 != 0) goto L2a
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f61349j
            r0 = -1
            r2.setHttpStatusCode(r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f61349j
            java.lang.String r0 = ""
            r2.setHttpStatusMessage(r0)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.p.vv(com.ss.android.socialbase.downloader.network.n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r9.u() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ss.android.socialbase.downloader.model.m vv(com.ss.android.socialbase.downloader.model.m r9, int r10) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.qv.p.vv(com.ss.android.socialbase.downloader.model.m, int):com.ss.android.socialbase.downloader.model.m");
    }

    private la vv(DownloadTask downloadTask) {
        la retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
        if (retryDelayTimeCalculator != null) {
            return retryDelayTimeCalculator;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            String retryDelayTimeArray = downloadInfo.getRetryDelayTimeArray();
            if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                return new com.ss.android.socialbase.downloader.impls.d(retryDelayTimeArray);
            }
        }
        return com.ss.android.socialbase.downloader.downloader.p.jb();
    }

    public void vv(Future future) {
        this.f61352m = future;
    }
}
