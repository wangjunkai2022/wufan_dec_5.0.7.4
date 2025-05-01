package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.qv.qv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
/* loaded from: classes5.dex */
public abstract class vv implements qv.vv {

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<DownloadTask> f61118m = new SparseArray<>();

    /* renamed from: p  reason: collision with root package name */
    private final SparseArray<DownloadTask> f61121p = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    private final SparseArray<DownloadTask> f61116i = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    private final SparseArray<DownloadTask> f61120o = new SparseArray<>();

    /* renamed from: u  reason: collision with root package name */
    private final SparseArray<DownloadTask> f61122u = new SparseArray<>();

    /* renamed from: n  reason: collision with root package name */
    private final SparseArray<SparseArray<DownloadTask>> f61119n = new SparseArray<>();
    private final com.ss.android.socialbase.downloader.wv.qv<Integer, DownloadTask> qv = new com.ss.android.socialbase.downloader.wv.qv<>();
    private final SparseArray<Long> wv = new SparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    private final LinkedBlockingDeque<DownloadTask> f61117k = new LinkedBlockingDeque<>();
    protected final com.ss.android.socialbase.downloader.qv.qv vv = new com.ss.android.socialbase.downloader.qv.qv(Looper.getMainLooper(), this);

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.k f61115b = com.ss.android.socialbase.downloader.downloader.p.ns();

    private void j(int i4) {
        DownloadTask first;
        if (this.f61117k.isEmpty()) {
            return;
        }
        DownloadTask first2 = this.f61117k.getFirst();
        if (first2 != null && first2.getDownloadId() == i4) {
            this.f61117k.poll();
        }
        if (this.f61117k.isEmpty() || (first = this.f61117k.getFirst()) == null) {
            return;
        }
        vv(first, true);
    }

    private void p(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        try {
            if (this.f61117k.isEmpty()) {
                vv(downloadTask, true);
                this.f61117k.put(downloadTask);
            } else if (downloadInfo.getEnqueueType() == EnqueueType.ENQUEUE_TAIL) {
                if (this.f61117k.getFirst().getDownloadId() == downloadTask.getDownloadId() && vv(downloadTask.getDownloadId())) {
                    return;
                }
                Iterator<DownloadTask> it2 = this.f61117k.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DownloadTask next = it2.next();
                    if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                        it2.remove();
                        break;
                    }
                }
                this.f61117k.put(downloadTask);
                new com.ss.android.socialbase.downloader.downloader.u(downloadTask, this.vv).vv();
            } else {
                DownloadTask first = this.f61117k.getFirst();
                if (first.getDownloadId() == downloadTask.getDownloadId() && vv(downloadTask.getDownloadId())) {
                    return;
                }
                o(first.getDownloadId());
                vv(downloadTask, true);
                if (first.getDownloadId() != downloadTask.getDownloadId()) {
                    this.f61117k.putFirst(downloadTask);
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadTask q(int i4) {
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask == null) {
            DownloadTask downloadTask2 = this.f61116i.get(i4);
            if (downloadTask2 == null) {
                DownloadTask downloadTask3 = this.f61121p.get(i4);
                if (downloadTask3 == null) {
                    DownloadTask downloadTask4 = this.f61120o.get(i4);
                    return downloadTask4 == null ? this.f61122u.get(i4) : downloadTask4;
                }
                return downloadTask3;
            }
            return downloadTask2;
        }
        return downloadTask;
    }

    public synchronized boolean b(int i4) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f61120o.get(i4);
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            if (downloadInfo.canStartRetryDelayTask()) {
                vv(downloadTask, false);
            }
            return true;
        }
        DownloadInfo m4 = this.f61115b.m(i4);
        if (m4 != null && m4.canStartRetryDelayTask()) {
            vv(new DownloadTask(m4), false);
        }
        return false;
    }

    public synchronized DownloadInfo i(int i4) {
        DownloadInfo m4;
        DownloadTask downloadTask;
        m4 = this.f61115b.m(i4);
        if (m4 == null && (downloadTask = this.f61118m.get(i4)) != null) {
            m4 = downloadTask.getDownloadInfo();
        }
        return m4;
    }

    public synchronized boolean jh(int i4) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f61122u.get(i4);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return false;
        }
        if (downloadInfo.canReStartAsyncTask()) {
            vv(downloadTask);
        }
        return true;
    }

    public synchronized IDownloadFileUriProvider k(int i4) {
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = this.f61121p.get(i4);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = this.f61116i.get(i4);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = this.f61120o.get(i4);
        if (downloadTask4 != null) {
            return downloadTask4.getFileUriProvider();
        }
        DownloadTask downloadTask5 = this.f61122u.get(i4);
        if (downloadTask5 != null) {
            return downloadTask5.getFileUriProvider();
        }
        return null;
    }

    protected abstract void m(int i4);

    public synchronized boolean n(int i4) {
        DownloadTask downloadTask = this.f61116i.get(i4);
        if (downloadTask == null) {
            downloadTask = this.f61120o.get(i4);
        }
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            vv(downloadTask);
            return true;
        }
        return false;
    }

    public synchronized boolean o(int i4) {
        com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "pause id=".concat(String.valueOf(i4)));
        DownloadInfo m4 = this.f61115b.m(i4);
        if (m4 == null || m4.getStatus() != 11) {
            synchronized (this.f61118m) {
                m(i4);
            }
            if (m4 == null) {
                DownloadTask downloadTask = this.f61118m.get(i4);
                if (downloadTask != null) {
                    new com.ss.android.socialbase.downloader.downloader.u(downloadTask, this.vv).i();
                    return true;
                }
            } else {
                vv(m4);
                if (m4.getStatus() == 1) {
                    DownloadTask downloadTask2 = this.f61118m.get(i4);
                    if (downloadTask2 != null) {
                        new com.ss.android.socialbase.downloader.downloader.u(downloadTask2, this.vv).i();
                        return true;
                    }
                } else if (DownloadStatus.isDownloading(m4.getStatus())) {
                    m4.setStatus(-2);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    protected abstract com.ss.android.socialbase.downloader.qv.p p(int i4);

    public synchronized a qv(int i4) {
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = this.f61121p.get(i4);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = this.f61116i.get(i4);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = this.f61120o.get(i4);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationClickCallback();
        }
        DownloadTask downloadTask5 = this.f61122u.get(i4);
        if (downloadTask5 != null) {
            return downloadTask5.getNotificationClickCallback();
        }
        return null;
    }

    public synchronized void r(int i4) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            downloadInfo.setForceIgnoreRecommendSize(true);
            vv(downloadTask);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r1.f61116i.get(r2) != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean t(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L19
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f61118m     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L13
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f61116i     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L19
        L13:
            r2 = 1
        L14:
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L19:
            r2 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.vv.t(int):boolean");
    }

    public synchronized boolean u(int i4) {
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            vv(downloadTask);
        } else {
            n(i4);
        }
        return true;
    }

    protected abstract List<Integer> vv();

    public abstract void vv(int i4, long j4);

    protected abstract void vv(int i4, DownloadTask downloadTask);

    public abstract void vv(com.ss.android.socialbase.downloader.qv.p pVar);

    public abstract boolean vv(int i4);

    public synchronized vu wv(int i4) {
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = this.f61121p.get(i4);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = this.f61116i.get(i4);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = this.f61120o.get(i4);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationEventListener();
        }
        DownloadTask downloadTask5 = this.f61122u.get(i4);
        if (downloadTask5 != null) {
            return downloadTask5.getNotificationEventListener();
        }
        return null;
    }

    private void m(DownloadTask downloadTask) {
        int hashCodeForSameTask = downloadTask.getHashCodeForSameTask();
        if (hashCodeForSameTask == 0 && downloadTask.isAutoSetHashCodeForSameTask()) {
            hashCodeForSameTask = downloadTask.autoCalAndGetHashCodeForSameTask();
        }
        if (hashCodeForSameTask == 0) {
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.f61119n.get(downloadTask.getDownloadId());
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.f61119n.put(downloadTask.getDownloadId(), sparseArray);
        }
        com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "tryCacheSameTaskWithListenerHashCode id:" + downloadTask.getDownloadId() + " listener hasCode:" + hashCodeForSameTask);
        sparseArray.put(hashCodeForSameTask, downloadTask);
    }

    private void vv(DownloadTask downloadTask, boolean z4) {
        DownloadInfo downloadInfo;
        int i4;
        DownloadInfo downloadInfo2;
        DownloadTask remove;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        if (downloadInfo.isEntityInvalid()) {
            l monitorDepend = downloadTask.getMonitorDepend();
            com.ss.android.socialbase.downloader.i.vv.vv(monitorDepend, downloadInfo, new BaseException(1003, "downloadInfo is Invalid, url is " + downloadInfo.getUrl() + " name is " + downloadInfo.getName() + " savePath is " + downloadInfo.getSavePath()), downloadInfo.getStatus());
            return;
        }
        boolean z5 = false;
        if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("no_net_opt", 0) == 1 && !com.ss.android.socialbase.downloader.wv.u.p(com.ss.android.socialbase.downloader.downloader.p.ky()) && !downloadInfo.isFirstDownload()) {
            new com.ss.android.socialbase.downloader.downloader.u(downloadTask, this.vv).vv(new BaseException(1049, "network_not_available"));
            return;
        }
        int id = downloadInfo.getId();
        if (z4) {
            vv(downloadInfo);
        }
        if (this.f61116i.get(id) != null) {
            this.f61116i.remove(id);
        }
        if (this.f61121p.get(id) != null) {
            this.f61121p.remove(id);
        }
        if (this.f61120o.get(id) != null) {
            this.f61120o.remove(id);
        }
        if (this.f61122u.get(id) != null) {
            this.f61122u.remove(id);
        }
        if (vv(id) && !downloadInfo.canReStartAsyncTask()) {
            com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "another task with same id is downloading when tryDownload");
            downloadTask.addListenerToDownloadingSameTask();
            com.ss.android.socialbase.downloader.i.vv.vv(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is isDownloading and addListenerToSameTask is false"), downloadInfo.getStatus());
            return;
        }
        com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "no downloading task :".concat(String.valueOf(id)));
        if (downloadInfo.canReStartAsyncTask()) {
            downloadInfo.setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.vv.ASYNC_HANDLE_RESTART);
        }
        if (com.ss.android.socialbase.downloader.wv.vv.vv(32768) && (remove = this.qv.remove(Integer.valueOf(id))) != null) {
            downloadTask.copyListenerFromPendingTask(remove);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        DownloadTask downloadTask2 = this.f61118m.get(id);
        if (downloadTask2 == null || (downloadInfo2 = downloadTask2.getDownloadInfo()) == null) {
            i4 = 0;
        } else {
            i4 = downloadInfo2.getStatus();
            if (DownloadStatus.isDownloading(i4)) {
                z5 = true;
            }
        }
        com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "can add listener " + z5 + " , oldTaskStatus is :" + i4);
        if (z5) {
            downloadTask.addListenerToDownloadingSameTask();
            return;
        }
        m(downloadTask);
        this.f61118m.put(id, downloadTask);
        this.wv.put(id, Long.valueOf(uptimeMillis));
        vv(id, downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i(int i4, boolean z4) {
        com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "clearDownloadDataInSubThread::id=" + i4 + " deleteTargetFile=" + z4);
        DownloadInfo m4 = this.f61115b.m(i4);
        if (m4 != null) {
            if (z4) {
                com.ss.android.socialbase.downloader.wv.u.vv(m4);
            } else {
                com.ss.android.socialbase.downloader.wv.u.p(m4.getTempPath(), m4.getTempName());
            }
            m4.erase();
        }
        try {
            this.f61115b.u(i4);
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        vv(i4, 0, -4);
        if (this.f61116i.get(i4) != null) {
            this.f61116i.remove(i4);
        }
        if (this.f61121p.get(i4) != null) {
            this.f61121p.remove(i4);
        }
        this.qv.remove(Integer.valueOf(i4));
        com.ss.android.socialbase.downloader.n.vv.m(i4);
    }

    public synchronized void m(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            if (com.ss.android.socialbase.downloader.wv.u.m(com.ss.android.socialbase.downloader.downloader.p.ky())) {
                for (int i4 = 0; i4 < this.f61118m.size(); i4++) {
                    DownloadTask downloadTask = this.f61118m.get(this.f61118m.keyAt(i4));
                    if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && m(downloadInfo)) {
                        downloadInfo.setAutoResumed(true);
                        downloadInfo.setShowNotificationForNetworkResumed(true);
                        vv(downloadTask);
                        downloadInfo.setDownloadFromReserveWifi(true);
                        com.ss.android.socialbase.downloader.downloader.g reserveWifiStatusListener = Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).getReserveWifiStatusListener();
                        if (reserveWifiStatusListener != null) {
                            reserveWifiStatusListener.vv(downloadInfo, 5, 2);
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void p(final int i4, final boolean z4) {
        DownloadInfo m4 = this.f61115b.m(i4);
        if (m4 != null) {
            vv(m4);
        }
        this.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.vv.4
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.downloader.notification.m.vv().u(i4);
            }
        });
        com.ss.android.socialbase.downloader.downloader.p.vv(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.vv.5
            @Override // java.lang.Runnable
            public void run() {
                vv.this.p(i4);
                vv.this.o(i4, z4);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i4, boolean z4) {
        try {
            DownloadInfo m4 = this.f61115b.m(i4);
            if (m4 != null) {
                com.ss.android.socialbase.downloader.wv.u.vv(m4, z4);
                m4.erase();
            }
            try {
                this.f61115b.i(i4);
                this.f61115b.vv(m4);
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
            if (this.f61116i.get(i4) != null) {
                this.f61116i.remove(i4);
            }
            if (this.f61121p.get(i4) != null) {
                this.f61121p.remove(i4);
            }
            this.qv.remove(Integer.valueOf(i4));
            com.ss.android.socialbase.downloader.n.vv.m(i4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean m(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.statusInPause()) {
            return downloadInfo.isPauseReserveOnWifi();
        }
        return false;
    }

    public void m() {
        List<Integer> vv = vv();
        if (vv == null) {
            return;
        }
        for (Integer num : vv) {
            o(num.intValue());
        }
    }

    public void m(final int i4, final boolean z4) {
        DownloadInfo m4 = this.f61115b.m(i4);
        if (m4 != null) {
            vv(m4);
        }
        this.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.vv.2
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.downloader.notification.m.vv().u(i4);
            }
        });
        com.ss.android.socialbase.downloader.downloader.p.vv(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.vv.3
            @Override // java.lang.Runnable
            public void run() {
                DownloadTask q4;
                if (vv.this.p(i4) == null && (q4 = vv.this.q(i4)) != null) {
                    DownloadInfo downloadInfo = q4.getDownloadInfo();
                    SparseArray<IDownloadListener> downloadListeners = q4.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.SUB);
                    if (downloadListeners != null) {
                        synchronized (downloadListeners) {
                            for (int i5 = 0; i5 < downloadListeners.size(); i5++) {
                                IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i5));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                }
                vv.this.i(i4, z4);
            }
        }, false);
    }

    public synchronized void m(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        vv(i4, i5, iDownloadListener, uVar, z4, true);
    }

    public List<DownloadInfo> m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : vv()) {
            DownloadInfo i4 = i(num.intValue());
            if (i4 != null && str.equals(i4.getMimeType())) {
                arrayList.add(i4);
            }
        }
        return arrayList;
    }

    public synchronized void vv(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return;
        }
        downloadInfo.setDownloadFromReserveWifi(false);
        if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_NONE) {
            p(downloadTask);
        } else {
            vv(downloadTask, true);
        }
    }

    public void m(int i4, long j4) {
        DownloadInfo m4 = this.f61115b.m(i4);
        if (m4 != null) {
            m4.setThrottleNetSpeed(j4);
        }
        vv(i4, j4);
    }

    public synchronized List<DownloadInfo> vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> vv = this.f61115b.vv(str);
        if (vv == null || vv.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = this.f61118m.size();
            for (int i4 = 0; i4 < size; i4++) {
                DownloadTask valueAt = this.f61118m.valueAt(i4);
                if (valueAt != null && valueAt.getDownloadInfo() != null && str.equals(valueAt.getDownloadInfo().getUrl())) {
                    arrayList.add(valueAt.getDownloadInfo());
                }
            }
            return arrayList;
        }
        return vv;
    }

    public synchronized boolean vv(int i4, boolean z4) {
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask == null && com.ss.android.socialbase.downloader.wv.vv.vv(65536)) {
            downloadTask = q(i4);
        }
        if (downloadTask != null) {
            if (!com.ss.android.socialbase.downloader.n.vv.vv(i4).m("fix_on_cancel_call_twice", true)) {
                new com.ss.android.socialbase.downloader.downloader.u(downloadTask, this.vv).p();
            }
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            final SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.MAIN);
            final SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.NOTIFICATION);
            this.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.vv.1
                @Override // java.lang.Runnable
                public void run() {
                    SparseArray sparseArray;
                    SparseArray sparseArray2 = downloadListeners;
                    if (sparseArray2 != null) {
                        synchronized (sparseArray2) {
                            for (int i5 = 0; i5 < downloadListeners.size(); i5++) {
                                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i5));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                    DownloadInfo downloadInfo2 = downloadInfo;
                    if (downloadInfo2 == null || !downloadInfo2.canShowNotification() || (sparseArray = downloadListeners2) == null) {
                        return;
                    }
                    synchronized (sparseArray) {
                        for (int i6 = 0; i6 < downloadListeners2.size(); i6++) {
                            IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i6));
                            if (iDownloadListener2 != null) {
                                iDownloadListener2.onCanceled(downloadInfo);
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo m4 = this.f61115b.m(i4);
        if (com.ss.android.socialbase.downloader.wv.vv.vv(65536)) {
            if (m4 != null) {
                m4.setStatus(-4);
            }
        } else if (m4 != null && DownloadStatus.isDownloading(m4.getStatus())) {
            m4.setStatus(-4);
        }
        m(i4, z4);
        return true;
    }

    private void vv(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != com.ss.android.socialbase.downloader.constants.n.DELAY_RETRY_NONE) {
                    downloadInfo.setStatus(5);
                    downloadInfo.setRetryDelayStatus(com.ss.android.socialbase.downloader.constants.n.DELAY_RETRY_NONE);
                    com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "cancelAlarm");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public synchronized void vv(int i4, vu vuVar) {
        DownloadTask downloadTask = this.f61118m.get(i4);
        if (downloadTask != null) {
            downloadTask.setNotificationEventListener(vuVar);
        }
    }

    public synchronized void vv(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            boolean m4 = com.ss.android.socialbase.downloader.wv.vv.vv(1048576) ? com.ss.android.socialbase.downloader.wv.u.m(com.ss.android.socialbase.downloader.downloader.p.ky()) : true;
            for (int i4 = 0; i4 < this.f61116i.size(); i4++) {
                DownloadTask downloadTask = this.f61116i.get(this.f61116i.keyAt(i4));
                if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && (!downloadInfo.isOnlyWifi() || m4)) {
                    downloadInfo.setAutoResumed(true);
                    downloadInfo.setShowNotificationForNetworkResumed(true);
                    vv(downloadTask);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public synchronized void vv(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        DownloadTask q4 = q(i4);
        if (q4 == null) {
            q4 = this.qv.get(Integer.valueOf(i4));
        }
        if (q4 != null) {
            q4.removeDownloadListener(i5, iDownloadListener, uVar, z4);
        }
    }

    public synchronized void vv(int i4, int i5, final IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4, boolean z5) {
        DownloadInfo m4;
        DownloadTask q4 = q(i4);
        if (q4 != null) {
            q4.addDownloadListener(i5, iDownloadListener, uVar, z4);
            final DownloadInfo downloadInfo = q4.getDownloadInfo();
            if (z5 && downloadInfo != null && !vv(i4) && (uVar == com.ss.android.socialbase.downloader.constants.u.MAIN || uVar == com.ss.android.socialbase.downloader.constants.u.NOTIFICATION)) {
                boolean z6 = true;
                if (uVar == com.ss.android.socialbase.downloader.constants.u.NOTIFICATION && !downloadInfo.canShowNotification()) {
                    z6 = false;
                }
                if (z6) {
                    this.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.vv.6
                        @Override // java.lang.Runnable
                        public void run() {
                            if (iDownloadListener != null) {
                                if (downloadInfo.getStatus() == -3) {
                                    iDownloadListener.onSuccessed(downloadInfo);
                                } else if (downloadInfo.getStatus() == -1) {
                                    iDownloadListener.onFailed(downloadInfo, new BaseException(1000, "try add listener for failed task"));
                                }
                            }
                        }
                    });
                }
            }
            return;
        }
        if (com.ss.android.socialbase.downloader.wv.vv.vv(32768) && (m4 = this.f61115b.m(i4)) != null && m4.getStatus() != -3) {
            DownloadTask downloadTask = this.qv.get(Integer.valueOf(i4));
            if (downloadTask == null) {
                downloadTask = new DownloadTask(m4);
                this.qv.put(Integer.valueOf(i4), downloadTask);
            }
            downloadTask.addDownloadListener(i5, iDownloadListener, uVar, z4);
        }
    }

    private void vv(int i4, BaseException baseException, DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.MAIN);
            SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.constants.u.NOTIFICATION);
            boolean z4 = downloadTask.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification();
            com.ss.android.socialbase.downloader.wv.p.vv(i4, downloadListeners, true, downloadInfo, baseException);
            com.ss.android.socialbase.downloader.wv.p.vv(i4, downloadListeners2, z4, downloadInfo, baseException);
        }
    }

    private void vv(int i4, int i5) {
        com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "removeTask id: " + i4 + " listener hasCode: " + i5);
        if (i5 == 0) {
            this.f61118m.remove(i4);
            this.f61119n.remove(i4);
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.f61119n.get(i4);
        if (sparseArray != null) {
            sparseArray.remove(i5);
            com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "after downloadTaskWithListenerMap removeTask taskArray.size: " + sparseArray.size());
            if (sparseArray.size() == 0) {
                this.f61118m.remove(i4);
                this.f61119n.remove(i4);
                return;
            }
            return;
        }
        this.f61118m.remove(i4);
    }

    public synchronized void vv(int i4, int i5, int i6) {
        if (i6 != -7) {
            if (i6 != -6) {
                if (i6 == -4) {
                    vv(i4, i5);
                } else if (i6 == -3) {
                    this.f61121p.put(i4, this.f61118m.get(i4));
                    vv(i4, i5);
                } else if (i6 != -1) {
                    if (i6 != 7) {
                        if (i6 == 8) {
                            DownloadTask downloadTask = this.f61118m.get(i4);
                            if (downloadTask != null && this.f61122u.get(i4) == null) {
                                this.f61122u.put(i4, downloadTask);
                            }
                        }
                        return;
                    }
                    DownloadTask downloadTask2 = this.f61118m.get(i4);
                    if (downloadTask2 != null) {
                        if (this.f61120o.get(i4) == null) {
                            this.f61120o.put(i4, downloadTask2);
                        }
                        vv(i4, i5);
                    }
                    j(i4);
                    return;
                }
                j(i4);
                return;
            }
            this.f61121p.put(i4, this.f61118m.get(i4));
            vv(i4, i5);
            return;
        }
        DownloadTask downloadTask3 = this.f61118m.get(i4);
        if (downloadTask3 != null) {
            if (this.f61116i.get(i4) == null) {
                this.f61116i.put(i4, downloadTask3);
            }
            vv(i4, i5);
        }
        j(i4);
    }

    @Override // com.ss.android.socialbase.downloader.qv.qv.vv
    public void vv(Message message) {
        int i4 = message.arg1;
        int i5 = message.arg2;
        com.ss.android.socialbase.downloader.p.vv.m("AbsDownloadEngine", "handleMsg id: " + i4 + " listener hasCode: " + i5);
        Object obj = message.obj;
        DownloadTask downloadTask = null;
        BaseException baseException = obj instanceof Exception ? (BaseException) obj : null;
        synchronized (this) {
            if (i5 == 0) {
                downloadTask = this.f61118m.get(i4);
            } else {
                SparseArray<DownloadTask> sparseArray = this.f61119n.get(i4);
                if (sparseArray != null) {
                    downloadTask = sparseArray.get(i5);
                }
            }
            if (downloadTask == null) {
                return;
            }
            vv(message.what, baseException, downloadTask);
            vv(i4, i5, message.what);
        }
    }
}
