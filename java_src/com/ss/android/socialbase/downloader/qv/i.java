package com.ss.android.socialbase.downloader.qv;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class i {
    private static ExecutorService vv = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vv("Download_OP_Thread"));

    /* renamed from: p  reason: collision with root package name */
    private int f61328p = 0;

    /* renamed from: m  reason: collision with root package name */
    private volatile SparseArray<p> f61327m = new SparseArray<>();

    private void m() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < this.f61327m.size(); i4++) {
                int keyAt = this.f61327m.keyAt(i4);
                if (!this.f61327m.get(keyAt).i()) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Integer num = (Integer) arrayList.get(i5);
                if (num != null) {
                    this.f61327m.remove(num.intValue());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void vv(Runnable runnable) {
        vv.execute(runnable);
    }

    public void p(int i4) {
        synchronized (i.class) {
            m();
            p pVar = this.f61327m.get(i4);
            if (pVar != null) {
                pVar.vv();
                p(pVar);
                this.f61327m.remove(i4);
            }
        }
    }

    public void vv(p pVar) {
        pVar.u();
        synchronized (i.class) {
            int i4 = this.f61328p;
            if (i4 >= 500) {
                m();
                this.f61328p = 0;
            } else {
                this.f61328p = i4 + 1;
            }
            this.f61327m.put(pVar.o(), pVar);
        }
        DownloadTask p4 = pVar.p();
        try {
            ExecutorService j4 = com.ss.android.socialbase.downloader.downloader.p.j();
            if (p4 != null && p4.getDownloadInfo() != null) {
                if ("mime_type_plg".equals(p4.getDownloadInfo().getMimeType()) && com.ss.android.socialbase.downloader.n.vv.p().vv("divide_plugin", 1) == 1) {
                    p4.getDownloadInfo().safePutToDBJsonData("executor_group", 3);
                }
                int executorGroup = p4.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    j4 = com.ss.android.socialbase.downloader.downloader.p.t();
                } else if (executorGroup == 4) {
                    j4 = com.ss.android.socialbase.downloader.downloader.p.q();
                }
            }
            if (j4 != null) {
                if (com.ss.android.socialbase.downloader.n.vv.vv(pVar.o()).m("pause_with_interrupt", false)) {
                    pVar.vv(j4.submit(pVar));
                    return;
                } else {
                    j4.execute(pVar);
                    return;
                }
            }
            com.ss.android.socialbase.downloader.i.vv.vv(p4.getMonitorDepend(), p4.getDownloadInfo(), new BaseException(1003, "execute failed cpu thread executor service is null"), p4.getDownloadInfo() != null ? p4.getDownloadInfo().getStatus() : 0);
        } catch (Exception e5) {
            if (p4 != null) {
                com.ss.android.socialbase.downloader.i.vv.vv(p4.getMonitorDepend(), p4.getDownloadInfo(), new BaseException(1003, com.ss.android.socialbase.downloader.wv.u.m(e5, "DownloadThreadPoolExecute")), p4.getDownloadInfo() != null ? p4.getDownloadInfo().getStatus() : 0);
            }
            e5.printStackTrace();
        } catch (OutOfMemoryError e6) {
            if (p4 != null) {
                com.ss.android.socialbase.downloader.i.vv.vv(p4.getMonitorDepend(), p4.getDownloadInfo(), new BaseException(1003, "execute OOM"), p4.getDownloadInfo() != null ? p4.getDownloadInfo().getStatus() : 0);
            }
            e6.printStackTrace();
        }
    }

    private void p(p pVar) {
        Future n4;
        if (pVar == null) {
            return;
        }
        try {
            ExecutorService j4 = com.ss.android.socialbase.downloader.downloader.p.j();
            DownloadTask p4 = pVar.p();
            if (p4 != null && p4.getDownloadInfo() != null) {
                int executorGroup = p4.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    j4 = com.ss.android.socialbase.downloader.downloader.p.t();
                } else if (executorGroup == 4) {
                    j4 = com.ss.android.socialbase.downloader.downloader.p.q();
                }
            }
            if (j4 == null || !(j4 instanceof ThreadPoolExecutor)) {
                return;
            }
            ((ThreadPoolExecutor) j4).remove(pVar);
            if (!com.ss.android.socialbase.downloader.n.vv.vv(pVar.o()).m("pause_with_interrupt", false) || (n4 = pVar.n()) == null) {
                return;
            }
            n4.cancel(true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void m(p pVar) {
        if (pVar == null) {
            return;
        }
        synchronized (i.class) {
            try {
                if (com.ss.android.socialbase.downloader.wv.vv.vv(524288)) {
                    int indexOfValue = this.f61327m.indexOfValue(pVar);
                    if (indexOfValue >= 0) {
                        this.f61327m.removeAt(indexOfValue);
                    }
                } else {
                    this.f61327m.remove(pVar.o());
                }
            }
        }
    }

    public p m(int i4) {
        synchronized (i.class) {
            m();
            p pVar = this.f61327m.get(i4);
            if (pVar != null) {
                pVar.m();
                p(pVar);
                this.f61327m.remove(i4);
                return pVar;
            }
            return null;
        }
    }

    public boolean vv(int i4) {
        synchronized (i.class) {
            boolean z4 = false;
            if (this.f61327m != null && this.f61327m.size() > 0) {
                p pVar = this.f61327m.get(i4);
                if (pVar != null && pVar.i()) {
                    z4 = true;
                }
                return z4;
            }
            return false;
        }
    }

    public List<Integer> vv() {
        ArrayList arrayList;
        synchronized (i.class) {
            m();
            arrayList = new ArrayList();
            for (int i4 = 0; i4 < this.f61327m.size(); i4++) {
                p pVar = this.f61327m.get(this.f61327m.keyAt(i4));
                if (pVar != null) {
                    arrayList.add(Integer.valueOf(pVar.o()));
                }
            }
        }
        return arrayList;
    }

    public void vv(int i4, long j4) {
        this.f61327m.get(i4);
    }
}
