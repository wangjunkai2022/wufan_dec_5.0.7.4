package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.pj;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes5.dex */
public class u {
    private static final String vv = "u";

    /* renamed from: d  reason: collision with root package name */
    private l f61045d;

    /* renamed from: i  reason: collision with root package name */
    private final k f61046i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.depend.t f61047j;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f61049m;

    /* renamed from: n  reason: collision with root package name */
    private SparseArray<IDownloadListener> f61050n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f61051o;

    /* renamed from: p  reason: collision with root package name */
    private DownloadInfo f61052p;

    /* renamed from: q  reason: collision with root package name */
    private long f61053q;
    private SparseArray<IDownloadListener> qv;

    /* renamed from: t  reason: collision with root package name */
    private int f61055t;

    /* renamed from: u  reason: collision with root package name */
    private DownloadTask f61056u;
    private SparseArray<IDownloadListener> wv;

    /* renamed from: k  reason: collision with root package name */
    private boolean f61048k = false;

    /* renamed from: b  reason: collision with root package name */
    private volatile long f61044b = 0;
    private final AtomicLong jh = new AtomicLong();

    /* renamed from: r  reason: collision with root package name */
    private boolean f61054r = false;

    public u(DownloadTask downloadTask, Handler handler) {
        this.f61056u = downloadTask;
        k();
        this.f61051o = handler;
        this.f61046i = p.ns();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.f61049m = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("fix_start_with_file_exist_update_error");
        } else {
            this.f61049m = false;
        }
    }

    private void b() {
        ExecutorService jh = p.jh();
        if (jh != null) {
            jh.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.u.1
                @Override // java.lang.Runnable
                public void run() {
                    u.this.f61046i.wv(u.this.f61052p.getId());
                    u.this.vv(1, (BaseException) null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jh() {
        try {
            com.ss.android.socialbase.downloader.p.vv.m(vv, "saveFileAsTargetName onSuccess");
            try {
                r();
                this.f61052p.setFirstSuccess(false);
                this.f61052p.setSuccessByCache(false);
                vv(-3, (BaseException) null);
                this.f61046i.p(this.f61052p.getId(), this.f61052p.getTotalBytes());
                this.f61046i.i(this.f61052p.getId());
                this.f61046i.r(this.f61052p.getId());
            } catch (BaseException e5) {
                vv(e5);
            }
        } catch (Throwable th) {
            vv(new BaseException(1008, com.ss.android.socialbase.downloader.wv.u.m(th, "onCompleted")));
        }
    }

    private void k() {
        DownloadTask downloadTask = this.f61056u;
        if (downloadTask != null) {
            this.f61052p = downloadTask.getDownloadInfo();
            this.f61050n = this.f61056u.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.MAIN);
            this.wv = this.f61056u.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.NOTIFICATION);
            this.qv = this.f61056u.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.SUB);
            this.f61047j = this.f61056u.getDepend();
            this.f61045d = this.f61056u.getMonitorDepend();
        }
    }

    private void r() throws BaseException {
        List<com.ss.android.socialbase.downloader.depend.r> downloadCompleteHandlers = this.f61056u.getDownloadCompleteHandlers();
        if (downloadCompleteHandlers.isEmpty()) {
            return;
        }
        DownloadInfo downloadInfo = this.f61052p;
        vv(11, (BaseException) null);
        this.f61046i.vv(downloadInfo);
        for (com.ss.android.socialbase.downloader.depend.r rVar : downloadCompleteHandlers) {
            try {
                if (rVar.m(downloadInfo)) {
                    rVar.vv(downloadInfo);
                    this.f61046i.vv(downloadInfo);
                }
            } catch (BaseException e5) {
                throw e5;
            } catch (Throwable th) {
                throw new BaseException(1071, th);
            }
        }
    }

    public void i() {
        this.f61052p.setStatus(-2);
        try {
            this.f61046i.i(this.f61052p.getId(), this.f61052p.getCurBytes());
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        vv(-2, (BaseException) null);
    }

    public void n() throws BaseException {
        if (this.f61049m) {
            r();
            com.ss.android.socialbase.downloader.p.vv.m(vv, "onCompleteForFileExist");
            this.f61052p.setSuccessByCache(true);
            vv(-3, (BaseException) null);
            this.f61046i.p(this.f61052p.getId(), this.f61052p.getTotalBytes());
            this.f61046i.i(this.f61052p.getId());
            this.f61046i.vv(this.f61052p);
            this.f61046i.r(this.f61052p.getId());
            return;
        }
        r();
        com.ss.android.socialbase.downloader.p.vv.m(vv, "onCompleteForFileExist");
        this.f61052p.setSuccessByCache(true);
        vv(-3, (BaseException) null);
        this.f61046i.p(this.f61052p.getId(), this.f61052p.getTotalBytes());
        this.f61046i.i(this.f61052p.getId());
        this.f61046i.r(this.f61052p.getId());
    }

    public void o() {
        this.f61052p.setStatus(-7);
        try {
            this.f61046i.k(this.f61052p.getId());
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        vv(-7, (BaseException) null);
    }

    public void qv() {
        this.f61052p.setStatus(8);
        this.f61052p.setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.vv.ASYNC_HANDLE_WAITING);
        com.ss.android.socialbase.downloader.impls.vv w4 = p.w();
        if (w4 != null) {
            w4.vv(this.f61052p.getId(), this.f61056u.getHashCodeForSameTask(), 8);
        }
    }

    public void u() {
        this.f61052p.setFirstDownload(false);
        if (!this.f61052p.isIgnoreDataVerify() && this.f61052p.getCurBytes() != this.f61052p.getTotalBytes()) {
            com.ss.android.socialbase.downloader.p.vv.m(vv, this.f61052p.getErrorBytesLog());
            vv(new com.ss.android.socialbase.downloader.exception.u(1027, "current bytes is not equals to total bytes, bytes changed with process : " + this.f61052p.getByteInvalidRetryStatus()));
        } else if (this.f61052p.getCurBytes() <= 0) {
            com.ss.android.socialbase.downloader.p.vv.m(vv, this.f61052p.getErrorBytesLog());
            vv(new com.ss.android.socialbase.downloader.exception.u(1026, "curBytes is 0, bytes changed with process : " + this.f61052p.getByteInvalidRetryStatus()));
        } else if (!this.f61052p.isIgnoreDataVerify() && this.f61052p.getTotalBytes() <= 0) {
            com.ss.android.socialbase.downloader.p.vv.m(vv, this.f61052p.getErrorBytesLog());
            vv(new com.ss.android.socialbase.downloader.exception.u(1044, "TotalBytes is 0, bytes changed with process : " + this.f61052p.getByteInvalidRetryStatus()));
        } else {
            String str = vv;
            com.ss.android.socialbase.downloader.p.vv.m(str, this.f61052p.getName() + " onCompleted start save file as target name");
            l lVar = this.f61045d;
            DownloadTask downloadTask = this.f61056u;
            if (downloadTask != null) {
                lVar = downloadTask.getMonitorDepend();
            }
            com.ss.android.socialbase.downloader.wv.u.vv(this.f61052p, lVar, new pj() { // from class: com.ss.android.socialbase.downloader.downloader.u.2
                @Override // com.ss.android.socialbase.downloader.depend.pj
                public void vv() {
                    u.this.jh();
                }

                @Override // com.ss.android.socialbase.downloader.depend.pj
                public void vv(BaseException baseException) {
                    String str2 = u.vv;
                    StringBuilder sb = new StringBuilder("saveFileAsTargetName onFailed : ");
                    sb.append(baseException != null ? baseException.getErrorMessage() : "");
                    com.ss.android.socialbase.downloader.p.vv.m(str2, sb.toString());
                    u.this.vv(baseException);
                }
            });
        }
    }

    public void m() {
        if (this.f61052p.canSkipStatusHandler()) {
            this.f61052p.changeSkipStatus();
            return;
        }
        this.f61046i.n(this.f61052p.getId());
        if (this.f61052p.isFirstDownload()) {
            vv(6, (BaseException) null);
        }
        vv(2, (BaseException) null);
    }

    public void p() {
        vv(-4, (BaseException) null);
    }

    private BaseException p(BaseException baseException) {
        Context ky;
        if (com.ss.android.socialbase.downloader.n.vv.vv(this.f61052p.getId()).vv("download_failed_check_net", 1) != 1 || !com.ss.android.socialbase.downloader.wv.u.wv(baseException) || (ky = p.ky()) == null || com.ss.android.socialbase.downloader.wv.u.p(ky)) {
            return baseException;
        }
        return new BaseException(this.f61052p.isOnlyWifi() ? 1013 : 1049, baseException.getErrorMessage());
    }

    public void vv() {
        if (this.f61052p.canSkipStatusHandler()) {
            return;
        }
        this.f61052p.setStatus(1);
        b();
    }

    public void vv(long j4, String str, String str2) {
        this.f61052p.setTotalBytes(j4);
        this.f61052p.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f61052p.getName())) {
            this.f61052p.setName(str2);
        }
        try {
            this.f61046i.vv(this.f61052p.getId(), j4, str, str2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        vv(3, (BaseException) null);
        this.f61053q = this.f61052p.getMinByteIntervalForPostToMainThread(j4);
        this.f61055t = this.f61052p.getMinProgressTimeMsInterval();
        this.f61048k = true;
        com.ss.android.socialbase.downloader.impls.g.vv().o();
    }

    private void m(BaseException baseException) {
        Log.getStackTraceString(new Throwable());
        if (baseException != null && baseException.getCause() != null && (baseException.getCause() instanceof SQLiteFullException)) {
            try {
                this.f61046i.u(this.f61052p.getId());
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
        } else {
            try {
                try {
                    this.f61046i.m(this.f61052p.getId(), this.f61052p.getCurBytes());
                } catch (SQLiteException e6) {
                    e6.printStackTrace();
                }
            } catch (SQLiteException unused) {
                this.f61046i.u(this.f61052p.getId());
            }
        }
        BaseException p4 = p(baseException);
        this.f61052p.setFailedException(p4);
        vv(p4 instanceof com.ss.android.socialbase.downloader.exception.o ? -2 : -1, p4);
        if (com.ss.android.socialbase.downloader.n.vv.vv(this.f61052p.getId()).vv("retry_schedule", 0) > 0) {
            com.ss.android.socialbase.downloader.impls.g.vv().vv(this.f61052p);
        }
    }

    public boolean vv(long j4) {
        this.jh.addAndGet(j4);
        this.f61052p.increaseCurBytes(j4);
        long uptimeMillis = SystemClock.uptimeMillis();
        return vv(uptimeMillis, m(uptimeMillis));
    }

    private boolean m(long j4) {
        boolean z4 = true;
        if (!this.f61054r) {
            this.f61054r = true;
            return true;
        }
        long j5 = j4 - this.f61044b;
        if (this.jh.get() < this.f61053q && j5 < this.f61055t) {
            z4 = false;
        }
        if (z4) {
            this.f61044b = j4;
            this.jh.set(0L);
        }
        return z4;
    }

    public void vv(BaseException baseException, boolean z4) {
        this.f61052p.setFirstDownload(false);
        this.jh.set(0L);
        m(baseException, z4);
    }

    public void vv(com.ss.android.socialbase.downloader.model.m mVar, BaseException baseException, boolean z4) {
        this.f61052p.setFirstDownload(false);
        this.jh.set(0L);
        this.f61046i.qv(this.f61052p.getId());
        vv(z4 ? 10 : 9, baseException, true);
    }

    private void m(BaseException baseException, boolean z4) {
        this.f61046i.qv(this.f61052p.getId());
        vv(z4 ? 7 : 5, baseException);
    }

    public void vv(BaseException baseException) {
        this.f61052p.setFirstDownload(false);
        m(baseException);
    }

    public void vv(String str) throws BaseException {
        String str2 = vv;
        com.ss.android.socialbase.downloader.p.vv.m(str2, "onCompleteForFileExist existTargetFileName is " + str + " but curName is " + this.f61052p.getName());
        if (this.f61049m) {
            com.ss.android.socialbase.downloader.wv.u.vv(this.f61052p, str);
            r();
            this.f61052p.setSuccessByCache(true);
            vv(-3, (BaseException) null);
            this.f61046i.vv(this.f61052p);
            return;
        }
        this.f61046i.vv(this.f61052p);
        com.ss.android.socialbase.downloader.wv.u.vv(this.f61052p, str);
        this.f61052p.setSuccessByCache(true);
        r();
        vv(-3, (BaseException) null);
    }

    private boolean vv(long j4, boolean z4) {
        boolean z5 = false;
        if (this.f61052p.getCurBytes() == this.f61052p.getTotalBytes()) {
            try {
                this.f61046i.vv(this.f61052p.getId(), this.f61052p.getCurBytes());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return false;
        }
        if (this.f61048k) {
            this.f61048k = false;
            this.f61052p.setStatus(4);
        }
        if (this.f61052p.isNeedPostProgress() && z4) {
            z5 = true;
        }
        vv(4, (BaseException) null, z5);
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, BaseException baseException) {
        vv(i4, baseException, true);
    }

    private void vv(int i4, BaseException baseException, boolean z4) {
        SparseArray<IDownloadListener> sparseArray;
        SparseArray<IDownloadListener> sparseArray2;
        int status = this.f61052p.getStatus();
        if (status == -3 && i4 == 4) {
            return;
        }
        k();
        if (i4 != 4 && DownloadStatus.isRealTimeUploadStatus(i4)) {
            this.f61052p.updateRealDownloadTime(false);
            if (DownloadStatus.isTimeUploadStatus(i4)) {
                this.f61052p.updateDownloadTime();
            }
        }
        if (!this.f61052p.isAddListenerToSameTask()) {
            com.ss.android.socialbase.downloader.i.vv.vv(this.f61056u, baseException, i4);
        }
        if (i4 == 6) {
            this.f61052p.setStatus(2);
        } else if (i4 == -6) {
            this.f61052p.setStatus(-3);
        } else {
            this.f61052p.setStatus(i4);
        }
        if (status == -3 || status == -1) {
            if (this.f61052p.getRetryDelayStatus() == com.ss.android.socialbase.downloader.constants.n.DELAY_RETRY_DOWNLOADING) {
                this.f61052p.setRetryDelayStatus(com.ss.android.socialbase.downloader.constants.n.DELAY_RETRY_DOWNLOADED);
            }
            if (this.f61052p.getAsyncHandleStatus() == com.ss.android.socialbase.downloader.constants.vv.ASYNC_HANDLE_DOWNLOADING) {
                this.f61052p.setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.vv.ASYNC_HANDLE_DOWNLOADED);
            }
            if (this.f61052p.getByteInvalidRetryStatus() == com.ss.android.socialbase.downloader.constants.m.BYTE_INVALID_RETRY_STATUS_DOWNLOADING) {
                this.f61052p.setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.m.BYTE_INVALID_RETRY_STATUS_DOWNLOADED);
            }
        }
        com.ss.android.socialbase.downloader.wv.p.vv(i4, this.qv, true, this.f61052p, baseException);
        if (i4 == -4) {
            return;
        }
        if (z4 && this.f61051o != null && (((sparseArray = this.f61050n) != null && sparseArray.size() > 0) || ((sparseArray2 = this.wv) != null && sparseArray2.size() > 0 && (this.f61052p.canShowNotification() || this.f61052p.isAutoInstallWithoutNotification())))) {
            this.f61051o.obtainMessage(i4, this.f61052p.getId(), this.f61056u.getHashCodeForSameTask(), baseException).sendToTarget();
            return;
        }
        com.ss.android.socialbase.downloader.impls.vv w4 = p.w();
        if (w4 != null) {
            w4.vv(this.f61052p.getId(), this.f61056u.getHashCodeForSameTask(), i4);
        }
    }
}
