package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes5.dex */
public class o extends vv {

    /* renamed from: m  reason: collision with root package name */
    private static com.ss.android.socialbase.downloader.qv.i f61104m;

    public o() {
        f61104m = new com.ss.android.socialbase.downloader.qv.i();
    }

    public static List<Future> i(List<Runnable> list) {
        ExecutorService d5 = com.ss.android.socialbase.downloader.downloader.p.d();
        ArrayList arrayList = new ArrayList(list.size());
        for (Runnable runnable : list) {
            arrayList.add(d5.submit(runnable));
        }
        return arrayList;
    }

    public static Runnable o(List<Future> list) {
        BlockingQueue<Runnable> queue;
        Runnable runnable;
        if (list != null && !list.isEmpty()) {
            try {
                ExecutorService d5 = com.ss.android.socialbase.downloader.downloader.p.d();
                if ((d5 instanceof ThreadPoolExecutor) && (queue = ((ThreadPoolExecutor) d5).getQueue()) != null && !queue.isEmpty()) {
                    Iterator<Future> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            runnable = null;
                            break;
                        }
                        Future next = it2.next();
                        if ((next instanceof Runnable) && queue.remove(next)) {
                            runnable = (Runnable) next;
                            break;
                        }
                    }
                    if (runnable != null) {
                        list.remove(runnable);
                        return runnable;
                    }
                }
            } catch (Throwable th) {
                com.ss.android.socialbase.downloader.p.vv.i("DefaultDownloadEngine", "getUnstartedTask() error: " + th.toString());
            }
        }
        return null;
    }

    public static void p(List<Callable<Object>> list) throws InterruptedException {
        ExecutorService d5 = com.ss.android.socialbase.downloader.downloader.p.d();
        if (d5 != null) {
            d5.invokeAll(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.impls.vv
    public void m(int i4) {
        com.ss.android.socialbase.downloader.qv.i iVar = f61104m;
        if (iVar == null) {
            return;
        }
        iVar.p(i4);
    }

    @Override // com.ss.android.socialbase.downloader.impls.vv
    public boolean vv(int i4) {
        DownloadInfo i5;
        com.ss.android.socialbase.downloader.qv.i iVar = f61104m;
        if (iVar == null || !iVar.vv(i4) || (i5 = i(i4)) == null) {
            return false;
        }
        if (DownloadStatus.isDownloading(i5.getStatus())) {
            return true;
        }
        m(i4);
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.impls.vv
    protected com.ss.android.socialbase.downloader.qv.p p(int i4) {
        com.ss.android.socialbase.downloader.qv.i iVar = f61104m;
        if (iVar == null) {
            return null;
        }
        return iVar.m(i4);
    }

    @Override // com.ss.android.socialbase.downloader.impls.vv
    public void vv(com.ss.android.socialbase.downloader.qv.p pVar) {
        com.ss.android.socialbase.downloader.qv.i iVar = f61104m;
        if (iVar == null) {
            return;
        }
        iVar.m(pVar);
    }

    @Override // com.ss.android.socialbase.downloader.impls.vv
    public void vv(int i4, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.ss.android.socialbase.downloader.p.vv.m("DownloadTask", "start doDownload for task : ".concat(String.valueOf(i4)));
        f61104m.vv(new com.ss.android.socialbase.downloader.qv.p(downloadTask, this.vv));
    }

    @Override // com.ss.android.socialbase.downloader.impls.vv
    public List<Integer> vv() {
        return f61104m.vv();
    }

    @Override // com.ss.android.socialbase.downloader.impls.vv
    public void vv(int i4, long j4) {
        com.ss.android.socialbase.downloader.qv.i iVar = f61104m;
        if (iVar == null) {
            return;
        }
        iVar.vv(i4, j4);
    }
}
