package com.kwad.framework.filedownloader.services;

import android.util.SparseArray;
import com.kwad.framework.filedownloader.download.DownloadLaunchRunnable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h {
    private ThreadPoolExecutor aiS;
    private int aiU;
    private SparseArray<DownloadLaunchRunnable> aiR = new SparseArray<>();
    private final String aiT = "Network";
    private int aiV = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(int i4) {
        this.aiS = com.kwad.framework.filedownloader.f.b.q(i4, "Network");
        this.aiU = i4;
    }

    private synchronized void xj() {
        SparseArray<DownloadLaunchRunnable> sparseArray = new SparseArray<>();
        int size = this.aiR.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = this.aiR.keyAt(i4);
            DownloadLaunchRunnable downloadLaunchRunnable = this.aiR.get(keyAt);
            if (downloadLaunchRunnable.isAlive()) {
                sparseArray.put(keyAt, downloadLaunchRunnable);
            }
        }
        this.aiR = sparseArray;
    }

    public final void a(DownloadLaunchRunnable downloadLaunchRunnable) {
        downloadLaunchRunnable.wc();
        synchronized (this) {
            this.aiR.put(downloadLaunchRunnable.getId(), downloadLaunchRunnable);
        }
        this.aiS.execute(downloadLaunchRunnable);
        int i4 = this.aiV;
        if (i4 >= 600) {
            xj();
            this.aiV = 0;
            return;
        }
        this.aiV = i4 + 1;
    }

    public final boolean bK(int i4) {
        DownloadLaunchRunnable downloadLaunchRunnable = this.aiR.get(i4);
        return downloadLaunchRunnable != null && downloadLaunchRunnable.isAlive();
    }

    public final synchronized boolean bx(int i4) {
        if (xk() > 0) {
            com.kwad.framework.filedownloader.f.d.d(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int bL = com.kwad.framework.filedownloader.f.e.bL(i4);
        if (com.kwad.framework.filedownloader.f.d.ajb) {
            com.kwad.framework.filedownloader.f.d.c(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.aiU), Integer.valueOf(bL));
        }
        List<Runnable> shutdownNow = this.aiS.shutdownNow();
        this.aiS = com.kwad.framework.filedownloader.f.b.q(bL, "Network");
        if (shutdownNow.size() > 0) {
            com.kwad.framework.filedownloader.f.d.d(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(shutdownNow.size()));
        }
        this.aiU = bL;
        return true;
    }

    public final void cancel(int i4) {
        xj();
        synchronized (this) {
            DownloadLaunchRunnable downloadLaunchRunnable = this.aiR.get(i4);
            if (downloadLaunchRunnable != null) {
                downloadLaunchRunnable.pause();
                boolean remove = this.aiS.remove(downloadLaunchRunnable);
                if (com.kwad.framework.filedownloader.f.d.ajb) {
                    com.kwad.framework.filedownloader.f.d.c(this, "successful cancel %d %B", Integer.valueOf(i4), Boolean.valueOf(remove));
                }
            }
            this.aiR.remove(i4);
        }
    }

    public final int o(String str, int i4) {
        if (str == null) {
            return 0;
        }
        int size = this.aiR.size();
        for (int i5 = 0; i5 < size; i5++) {
            DownloadLaunchRunnable valueAt = this.aiR.valueAt(i5);
            if (valueAt != null && valueAt.isAlive() && valueAt.getId() != i4 && str.equals(valueAt.wh())) {
                return valueAt.getId();
            }
        }
        return 0;
    }

    public final synchronized int xk() {
        xj();
        return this.aiR.size();
    }

    public final synchronized List<Integer> xl() {
        ArrayList arrayList;
        xj();
        arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.aiR.size(); i4++) {
            SparseArray<DownloadLaunchRunnable> sparseArray = this.aiR;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i4)).getId()));
        }
        return arrayList;
    }
}
