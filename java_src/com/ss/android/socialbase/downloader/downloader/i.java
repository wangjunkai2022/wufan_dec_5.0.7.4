package com.ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.td;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public class i {
    private static volatile i vv;

    /* renamed from: m  reason: collision with root package name */
    private volatile SparseArray<Boolean> f60995m = new SparseArray<>();

    /* renamed from: p  reason: collision with root package name */
    private Handler f60996p = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    private volatile List<td> f60994i = new ArrayList();

    public static i vv() {
        if (vv == null) {
            synchronized (i.class) {
                vv = new i();
            }
        }
        return vv;
    }

    public DownloadInfo b(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return null;
        }
        return p4.qv(i4);
    }

    public void d(int i4) {
        if (i4 == 0) {
            return;
        }
        m(i4, true);
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        if (vv2 == null) {
            return;
        }
        vv2.startService();
    }

    public IDownloadFileUriProvider g(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return null;
        }
        return p4.la(i4);
    }

    public void i(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.vv(i4);
    }

    public void j(int i4) {
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        if (vv2 != null) {
            vv2.b(i4);
        }
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        if (vv3 != null) {
            vv3.b(i4);
        }
    }

    public vu jh(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return null;
        }
        return p4.d(i4);
    }

    public boolean k(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return false;
        }
        return p4.n(i4);
    }

    public void m(td tdVar) {
        if (tdVar == null) {
            return;
        }
        synchronized (this.f60994i) {
            if (this.f60994i.contains(tdVar)) {
                this.f60994i.remove(tdVar);
            }
        }
    }

    public void n(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.i(i4);
    }

    public boolean o(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return false;
        }
        return p4.m(i4);
    }

    public r p(int i4) {
        boolean z4 = true;
        return com.ss.android.socialbase.downloader.impls.jh.vv((vv(i4) != 1 || com.ss.android.socialbase.downloader.wv.u.p()) ? false : false);
    }

    public boolean q(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return false;
        }
        return p4.jh(i4);
    }

    public long qv(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return 0L;
        }
        return p4.o(i4);
    }

    public a r(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return null;
        }
        return p4.g(i4);
    }

    public void t(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.k(i4);
    }

    public void u(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.p(i4);
    }

    public int wv(int i4) {
        r p4 = p(i4);
        if (p4 == null) {
            return 0;
        }
        return p4.u(i4);
    }

    public void p(int i4, boolean z4) {
        if (com.ss.android.socialbase.downloader.wv.u.vv()) {
            if (com.ss.android.socialbase.downloader.wv.vv.vv(8388608)) {
                r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
                if (vv2 != null) {
                    vv2.vv(i4, z4);
                }
                r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
                if (vv3 != null) {
                    vv3.vv(i4, z4);
                    return;
                }
                return;
            }
            r vv4 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
            if (vv4 != null) {
                vv4.vv(i4, z4);
            }
            r vv5 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
            if (vv5 != null) {
                vv5.vv(i4, z4);
                return;
            }
            return;
        }
        r p4 = p(i4);
        if (p4 != null) {
            p4.vv(i4, z4);
        }
        com.ss.android.socialbase.downloader.impls.jh.vv(true).vv(2, i4);
    }

    public void i(int i4, boolean z4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.m(i4, z4);
    }

    public List<DownloadInfo> o(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        List<DownloadInfo> o4 = vv2 != null ? vv2.o(str) : null;
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        return vv(o4, vv3 != null ? vv3.o(str) : null, sparseArray);
    }

    public boolean u() {
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        if (vv2 != null) {
            return vv2.o();
        }
        return false;
    }

    public boolean i() {
        return p.s();
    }

    public void m() {
        synchronized (this.f60994i) {
            Iterator<td> it2 = this.f60994i.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public List<DownloadInfo> i(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        List<DownloadInfo> i4 = vv2 != null ? vv2.i(str) : null;
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        return vv(i4, vv3 != null ? vv3.i(str) : null, sparseArray);
    }

    public void vv(td tdVar) {
        if (tdVar == null || com.ss.android.socialbase.downloader.wv.u.p()) {
            return;
        }
        com.ss.android.socialbase.downloader.impls.jh.vv(true);
        synchronized (this.f60994i) {
            if (!this.f60994i.contains(tdVar)) {
                this.f60994i.add(tdVar);
            }
        }
    }

    public List<DownloadInfo> o() {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        List<DownloadInfo> i4 = vv2 != null ? vv2.i() : null;
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        return vv(i4, vv3 != null ? vv3.i() : null, sparseArray);
    }

    public synchronized void m(int i4, boolean z4) {
        this.f60995m.put(i4, z4 ? Boolean.TRUE : Boolean.FALSE);
    }

    public synchronized int m(int i4) {
        if (this.f60995m.get(i4) == null) {
            return -1;
        }
        return this.f60995m.get(i4).booleanValue() ? 1 : 0;
    }

    public void vv(int i4, boolean z4) {
        m(i4, z4);
        if (p.e() && !com.ss.android.socialbase.downloader.wv.u.p() && com.ss.android.socialbase.downloader.impls.jh.vv(true).n()) {
            com.ss.android.socialbase.downloader.impls.jh.vv(true).p(i4, z4);
        }
        if (p.p() || com.ss.android.socialbase.downloader.wv.u.p() || com.ss.android.socialbase.downloader.wv.u.vv()) {
            return;
        }
        try {
            Intent intent = new Intent(p.ky(), DownloadHandleService.class);
            intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
            intent.putExtra("extra_download_id", i4);
            p.ky().startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private r m(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        List<com.ss.android.socialbase.downloader.model.m> wv;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return null;
        }
        downloadInfo.isNeedIndependentProcess();
        boolean z4 = (com.ss.android.socialbase.downloader.wv.u.p() || !com.ss.android.socialbase.downloader.wv.u.vv()) ? true : true;
        int vv2 = vv(downloadInfo.getId());
        if (vv2 >= 0 && vv2 != z4) {
            try {
                if (vv2 == 1) {
                    if (com.ss.android.socialbase.downloader.wv.u.vv()) {
                        com.ss.android.socialbase.downloader.impls.jh.vv(true).vv(downloadInfo.getId());
                        DownloadInfo qv = com.ss.android.socialbase.downloader.impls.jh.vv(true).qv(downloadInfo.getId());
                        if (qv != null) {
                            com.ss.android.socialbase.downloader.impls.jh.vv(false).m(qv);
                        }
                        if (qv.getChunkCount() > 1 && (wv = com.ss.android.socialbase.downloader.impls.jh.vv(true).wv(downloadInfo.getId())) != null) {
                            com.ss.android.socialbase.downloader.impls.jh.vv(false).vv(downloadInfo.getId(), com.ss.android.socialbase.downloader.wv.u.vv(wv));
                        }
                    }
                } else if (com.ss.android.socialbase.downloader.wv.u.vv()) {
                    com.ss.android.socialbase.downloader.impls.jh.vv(false).vv(downloadInfo.getId());
                    List<com.ss.android.socialbase.downloader.model.m> wv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false).wv(downloadInfo.getId());
                    if (wv2 != null) {
                        com.ss.android.socialbase.downloader.impls.jh.vv(true).vv(downloadInfo.getId(), com.ss.android.socialbase.downloader.wv.u.vv(wv2));
                    }
                } else {
                    downloadTask.setNeedDelayForCacheSync(true);
                    com.ss.android.socialbase.downloader.impls.jh.vv(true).vv(1, downloadInfo.getId());
                }
            } catch (Throwable unused) {
            }
        }
        vv(downloadInfo.getId(), z4);
        return com.ss.android.socialbase.downloader.impls.jh.vv(z4);
    }

    public void p() {
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        if (vv2 != null) {
            vv2.vv();
        }
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        if (vv3 != null) {
            vv3.vv();
        }
    }

    public List<DownloadInfo> p(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        List<DownloadInfo> p4 = vv2 != null ? vv2.p(str) : null;
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        return vv(p4, vv3 != null ? vv3.p(str) : null, sparseArray);
    }

    public int vv(int i4) {
        if (p.e()) {
            if (!com.ss.android.socialbase.downloader.wv.u.p() && com.ss.android.socialbase.downloader.impls.jh.vv(true).n()) {
                return com.ss.android.socialbase.downloader.impls.jh.vv(true).r(i4);
            }
            return m(i4);
        }
        return -1;
    }

    public int vv(String str, String str2) {
        return p.vv(str, str2);
    }

    public List<DownloadInfo> vv(String str) {
        List<DownloadInfo> vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false).vv(str);
        List<DownloadInfo> vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true).vv(str);
        if (vv2 == null && vv3 == null) {
            return null;
        }
        if (vv2 == null || vv3 == null) {
            return vv2 != null ? vv2 : vv3;
        }
        ArrayList arrayList = new ArrayList(vv2);
        arrayList.addAll(vv3);
        return arrayList;
    }

    public void vv(int i4, vu vuVar) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.vv(i4, vuVar);
    }

    private List<DownloadInfo> vv(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i4)));
        }
        return arrayList;
    }

    public DownloadInfo m(String str, String str2) {
        int vv2 = vv(str, str2);
        r p4 = p(vv2);
        if (p4 == null) {
            return null;
        }
        return p4.qv(vv2);
    }

    public List<DownloadInfo> m(String str) {
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        List<DownloadInfo> m4 = vv2 != null ? vv2.m(str) : null;
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        return vv(m4, vv3 != null ? vv3.m(str) : null, sparseArray);
    }

    public void vv(List<String> list) {
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        if (vv2 != null) {
            vv2.vv(list);
        }
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        if (vv3 != null) {
            vv3.vv(list);
        }
    }

    public void m(List<String> list) {
        r vv2 = com.ss.android.socialbase.downloader.impls.jh.vv(false);
        if (vv2 != null) {
            vv2.m(list);
        }
        r vv3 = com.ss.android.socialbase.downloader.impls.jh.vv(true);
        if (vv3 != null) {
            vv3.m(list);
        }
    }

    public void vv(int i4, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.m(i4, iDownloadListener == null ? 0 : iDownloadListener.hashCode(), iDownloadListener, uVar, z4);
    }

    public void m(int i4, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.vv(i4, iDownloadListener.hashCode(), iDownloadListener, uVar, z4);
    }

    public void vv(int i4, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4, boolean z5) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.vv(i4, iDownloadListener.hashCode(), iDownloadListener, uVar, z4, z5);
    }

    public void m(com.ss.android.socialbase.downloader.depend.b bVar) {
        p.m(bVar);
    }

    public boolean vv(DownloadInfo downloadInfo) {
        r p4;
        if (downloadInfo == null || (p4 = p(downloadInfo.getId())) == null) {
            return false;
        }
        return p4.vv(downloadInfo);
    }

    public void vv(final DownloadTask downloadTask) {
        final r m4 = m(downloadTask);
        if (m4 == null) {
            if (downloadTask != null) {
                com.ss.android.socialbase.downloader.i.vv.vv(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "tryDownload but getDownloadHandler failed"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
            }
        } else if (downloadTask.isNeedDelayForCacheSync()) {
            this.f60996p.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.i.1
                @Override // java.lang.Runnable
                public void run() {
                    m4.vv(downloadTask);
                }
            }, 500L);
        } else {
            m4.vv(downloadTask);
        }
    }

    public void vv(com.ss.android.socialbase.downloader.depend.b bVar) {
        p.vv(bVar);
    }

    public void vv(int i4, long j4) {
        r p4 = p(i4);
        if (p4 == null) {
            return;
        }
        p4.vv(i4, j4);
    }
}
