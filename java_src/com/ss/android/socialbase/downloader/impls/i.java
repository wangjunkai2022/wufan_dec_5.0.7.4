package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.downloader.x;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.qv.qv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public class i implements com.ss.android.socialbase.downloader.downloader.k {

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f61087i;

    /* renamed from: m  reason: collision with root package name */
    private x f61088m;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f61090p;

    /* renamed from: u  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.qv.qv f61091u;

    /* renamed from: o  reason: collision with root package name */
    private qv.vv f61089o = new qv.vv() { // from class: com.ss.android.socialbase.downloader.impls.i.1
        @Override // com.ss.android.socialbase.downloader.qv.qv.vv
        public void vv(Message message) {
            if (message.what == 1) {
                com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.i.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            i.this.wv();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                });
            }
        }
    };
    private final b vv = new b();

    public i() {
        this.f61091u = null;
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_sigbus_downloader_db")) {
            if (!com.ss.android.socialbase.downloader.wv.u.vv() && com.ss.android.socialbase.downloader.downloader.p.e()) {
                this.f61088m = com.ss.android.socialbase.downloader.downloader.p.ju().vv(new p.vv.InterfaceC0641vv() { // from class: com.ss.android.socialbase.downloader.impls.i.2
                    @Override // com.ss.android.socialbase.downloader.downloader.p.vv.InterfaceC0641vv
                    public void vv() {
                        i.this.f61088m = new com.ss.android.socialbase.downloader.m.o();
                    }
                });
            } else {
                this.f61088m = new com.ss.android.socialbase.downloader.m.o();
            }
        } else {
            this.f61088m = new com.ss.android.socialbase.downloader.m.o();
        }
        this.f61090p = false;
        this.f61091u = new com.ss.android.socialbase.downloader.qv.qv(Looper.getMainLooper(), this.f61089o);
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this) {
            this.f61090p = true;
            notifyAll();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean i() {
        return this.f61090p;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public Map<Long, com.ss.android.socialbase.downloader.u.wv> jh(int i4) {
        Map<Long, com.ss.android.socialbase.downloader.u.wv> jh = this.vv.jh(i4);
        if (jh == null || jh.isEmpty()) {
            Map<Long, com.ss.android.socialbase.downloader.u.wv> jh2 = this.f61088m.jh(i4);
            this.vv.vv(i4, jh2);
            return jh2;
        }
        return jh;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo n(int i4) {
        DownloadInfo n4 = this.vv.n(i4);
        p(n4);
        return n4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean o() {
        if (this.f61090p) {
            return true;
        }
        synchronized (this) {
            if (!this.f61090p) {
                com.ss.android.socialbase.downloader.p.vv.i("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting start!!!!");
                try {
                    wait(5000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
                com.ss.android.socialbase.downloader.p.vv.i("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting end!!!!");
            }
        }
        return this.f61090p;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> p(String str) {
        return this.vv.p(str);
    }

    public void qv() {
        long j4;
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("task_resume_delay")) {
            j4 = 4000;
        } else {
            j4 = Build.VERSION.SDK_INT >= 23 ? 1000L : 5000L;
        }
        this.f61091u.sendMessageDelayed(this.f61091u.obtainMessage(1), j4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void r(int i4) {
        this.vv.r(i4);
        this.f61088m.r(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<com.ss.android.socialbase.downloader.u.wv> t(int i4) {
        List<com.ss.android.socialbase.downloader.u.wv> t4 = this.vv.t(i4);
        return (t4 == null || t4.size() == 0) ? this.f61088m.t(i4) : t4;
    }

    public x u() {
        return this.f61088m;
    }

    public void wv() {
        List<String> list;
        ArrayList arrayList;
        DownloadInfo downloadInfo;
        DownloadInfo downloadInfo2;
        if (this.f61090p) {
            if (this.f61087i) {
                com.ss.android.socialbase.downloader.p.vv.m("DefaultDownloadCache", "resumeUnCompleteTask: has resumed, return!!!");
                return;
            }
            this.f61087i = true;
            if (com.ss.android.socialbase.downloader.wv.u.vv()) {
                com.ss.android.socialbase.downloader.downloader.jh l4 = com.ss.android.socialbase.downloader.downloader.p.l();
                if (l4 != null) {
                    list = l4.vv();
                    arrayList = (list == null || list.isEmpty()) ? null : new ArrayList();
                } else {
                    list = null;
                    arrayList = null;
                }
                SparseArray sparseArray = new SparseArray();
                synchronized (this) {
                    SparseArray<DownloadInfo> vv = this.vv.vv();
                    for (int i4 = 0; i4 < vv.size(); i4++) {
                        int keyAt = vv.keyAt(i4);
                        if (keyAt != 0 && (downloadInfo2 = vv.get(keyAt)) != null) {
                            sparseArray.put(keyAt, downloadInfo2);
                        }
                    }
                }
                if (sparseArray.size() == 0) {
                    return;
                }
                for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                    int keyAt2 = sparseArray.keyAt(i5);
                    if (keyAt2 != 0 && (downloadInfo = (DownloadInfo) sparseArray.get(keyAt2)) != null) {
                        int realStatus = downloadInfo.getRealStatus();
                        int statusAtDbInit = downloadInfo.getStatusAtDbInit();
                        if (statusAtDbInit > 0 && statusAtDbInit <= 11) {
                            com.ss.android.socialbase.downloader.i.vv.vv(com.ss.android.socialbase.downloader.downloader.p.n(), downloadInfo, (BaseException) null, -5);
                        }
                        if (list != null && arrayList != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).m("enable_notification_ui") >= 2 || realStatus != -2 || downloadInfo.isPauseReserveOnWifi())) {
                            downloadInfo.setDownloadFromReserveWifi(false);
                            arrayList.add(downloadInfo);
                        }
                    }
                }
                if (l4 == null || arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                l4.vv(arrayList, 1);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> i(String str) {
        return this.vv.i(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo m(int i4) {
        return this.vv.m(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<com.ss.android.socialbase.downloader.model.m> p(int i4) {
        return this.vv.p(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean u(int i4) {
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.j(i4);
            } else {
                this.f61088m.u(i4);
            }
        } else {
            this.f61088m.u(i4);
        }
        return this.vv.u(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void i(int i4) {
        this.vv.i(i4);
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.q(i4);
                return;
            } else {
                this.f61088m.i(i4);
                return;
            }
        }
        this.f61088m.i(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> m(String str) {
        return this.vv.m(str);
    }

    public void n() {
        List<com.ss.android.socialbase.downloader.model.m> list;
        DownloadInfo downloadInfo;
        com.ss.android.socialbase.downloader.downloader.p.vv(com.ss.android.socialbase.downloader.constants.i.SYNC_START);
        final SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        final SparseArray<List<com.ss.android.socialbase.downloader.model.m>> sparseArray2 = new SparseArray<>();
        synchronized (this.vv) {
            SparseArray<DownloadInfo> vv = this.vv.vv();
            for (int i4 = 0; i4 < vv.size(); i4++) {
                int keyAt = vv.keyAt(i4);
                if (keyAt != 0 && (downloadInfo = vv.get(keyAt)) != null) {
                    sparseArray.put(keyAt, downloadInfo);
                }
            }
            SparseArray<List<com.ss.android.socialbase.downloader.model.m>> u4 = this.vv.u();
            for (int i5 = 0; i5 < u4.size(); i5++) {
                int keyAt2 = u4.keyAt(i5);
                if (keyAt2 != 0 && (list = u4.get(keyAt2)) != null) {
                    sparseArray2.put(keyAt2, new CopyOnWriteArrayList(list));
                }
            }
        }
        this.f61088m.vv(sparseArray, sparseArray2, new com.ss.android.socialbase.downloader.m.i() { // from class: com.ss.android.socialbase.downloader.impls.i.3
            @Override // com.ss.android.socialbase.downloader.m.i
            public void vv() {
                synchronized (i.this.vv) {
                    SparseArray<DownloadInfo> vv2 = i.this.vv.vv();
                    if (sparseArray != null) {
                        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                            int keyAt3 = sparseArray.keyAt(i6);
                            if (keyAt3 != 0) {
                                vv2.put(keyAt3, (DownloadInfo) sparseArray.get(keyAt3));
                            }
                        }
                    }
                    SparseArray<List<com.ss.android.socialbase.downloader.model.m>> u5 = i.this.vv.u();
                    if (sparseArray2 != null) {
                        for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                            int keyAt4 = sparseArray2.keyAt(i7);
                            if (keyAt4 != 0) {
                                u5.put(keyAt4, (List) sparseArray2.get(keyAt4));
                            }
                        }
                    }
                }
                i.this.k();
                i.this.qv();
                com.ss.android.socialbase.downloader.downloader.p.vv(com.ss.android.socialbase.downloader.constants.i.SYNC_SUCCESS);
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void p() {
        try {
            this.vv.p();
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.u();
                return;
            } else {
                this.f61088m.p();
                return;
            }
        }
        this.f61088m.p();
    }

    public b vv() {
        return this.vv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> m() {
        return this.vv.m();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> vv(String str) {
        return this.vv.vv(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo k(int i4) {
        DownloadInfo k4 = this.vv.k(i4);
        p(k4);
        return k4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(com.ss.android.socialbase.downloader.model.m mVar) {
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.vv(mVar);
                return;
            } else {
                this.f61088m.vv(mVar);
                return;
            }
        }
        this.f61088m.vv(mVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo qv(int i4) {
        DownloadInfo qv = this.vv.qv(i4);
        p(qv);
        return qv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(com.ss.android.socialbase.downloader.model.m mVar) {
        synchronized (this.vv) {
            this.vv.vv(mVar);
        }
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.vv(mVar);
                return;
            } else {
                this.f61088m.vv(mVar);
                return;
            }
        }
        this.f61088m.vv(mVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo i(int i4, long j4) {
        DownloadInfo i5 = this.vv.i(i4, j4);
        m(i4, (List<com.ss.android.socialbase.downloader.model.m>) null);
        return i5;
    }

    private void p(DownloadInfo downloadInfo) {
        vv(downloadInfo, true);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo m(int i4, long j4) {
        DownloadInfo m4 = this.vv.m(i4, j4);
        m(i4, (List<com.ss.android.socialbase.downloader.model.m>) null);
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean o(int i4) {
        try {
            if (com.ss.android.socialbase.downloader.wv.u.m()) {
                com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
                if (vv != null) {
                    vv.t(i4);
                } else {
                    this.f61088m.o(i4);
                }
            } else {
                this.f61088m.o(i4);
            }
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
        return this.vv.o(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo p(int i4, long j4) {
        DownloadInfo p4 = this.vv.p(i4, j4);
        m(i4, (List<com.ss.android.socialbase.downloader.model.m>) null);
        return p4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        this.vv.vv(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        try {
            vv(this.vv.m(i4));
            if (list == null) {
                list = this.vv.p(i4);
            }
            if (com.ss.android.socialbase.downloader.wv.u.m()) {
                com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
                if (vv != null) {
                    vv.m(i4, list);
                    return;
                } else {
                    this.f61088m.m(i4, list);
                    return;
                }
            }
            this.f61088m.m(i4, list);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, int i5, long j4) {
        this.vv.vv(i4, i5, j4);
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.vv(i4, i5, j4);
                return;
            } else {
                this.f61088m.vv(i4, i5, j4);
                return;
            }
        }
        this.f61088m.vv(i4, i5, j4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, int i5, int i6, long j4) {
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.vv(i4, i5, i6, j4);
                return;
            } else {
                this.f61088m.vv(i4, i5, i6, j4);
                return;
            }
        }
        this.f61088m.vv(i4, i5, i6, j4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, int i5, int i6, int i7) {
        if (com.ss.android.socialbase.downloader.wv.u.m()) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.vv(i4, i5, i6, i7);
                return;
            } else {
                this.f61088m.vv(i4, i5, i6, i7);
                return;
            }
        }
        this.f61088m.vv(i4, i5, i6, i7);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, int i5) {
        DownloadInfo vv = this.vv.vv(i4, i5);
        p(vv);
        return vv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean vv = this.vv.vv(downloadInfo);
        p(downloadInfo);
        return vv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4, String str, String str2) {
        DownloadInfo vv = this.vv.vv(i4, j4, str, str2);
        p(vv);
        return vv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo wv(int i4) {
        DownloadInfo wv = this.vv.wv(i4);
        p(wv);
        return wv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4) {
        DownloadInfo vv = this.vv.vv(i4, j4);
        vv(vv, false);
        return vv;
    }

    private void vv(DownloadInfo downloadInfo, boolean z4) {
        if (downloadInfo == null) {
            return;
        }
        if (!com.ss.android.socialbase.downloader.wv.u.m()) {
            this.f61088m.vv(downloadInfo);
        } else if (z4) {
            com.ss.android.socialbase.downloader.downloader.r vv = jh.vv(true);
            if (vv != null) {
                vv.p(downloadInfo);
            } else {
                this.f61088m.vv(downloadInfo);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.vv.vv(i4, list);
        if (com.ss.android.socialbase.downloader.wv.u.p()) {
            this.f61088m.m(i4, list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean vv(int i4, Map<Long, com.ss.android.socialbase.downloader.u.wv> map) {
        this.vv.vv(i4, map);
        this.f61088m.vv(i4, map);
        return false;
    }
}
