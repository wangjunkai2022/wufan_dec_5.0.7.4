package com.ss.android.downloadlib;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: m  reason: collision with root package name */
    private ExecutorService f60613m;

    /* renamed from: p  reason: collision with root package name */
    private ScheduledExecutorService f60614p;
    private ExecutorService vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {
        private static i vv = new i();
    }

    public static i vv() {
        return vv.vv;
    }

    public ScheduledExecutorService i() {
        if (this.f60614p == null) {
            synchronized (i.class) {
                if (this.f60614p == null) {
                    this.f60614p = new ScheduledThreadPoolExecutor(0, new com.ss.android.socialbase.downloader.qv.vv(qv.class.getName() + "-ScheduledThreadPool"));
                }
            }
        }
        return this.f60614p;
    }

    public void m(Runnable runnable) {
        m(runnable, false);
    }

    public void o() {
        vv(new Runnable() { // from class: com.ss.android.downloadlib.i.1
            @Override // java.lang.Runnable
            public void run() {
                k ns;
                synchronized (i.class) {
                    try {
                        String[] strArr = {"sp_ad_download_event", "sp_download_finish_cache", "sp_delay_operation_info", "sp_ttdownloader_md5", "sp_name_installed_app", "misc_config", "sp_ad_install_back_dialog", "sp_ttdownloader_clean", "sp_order_download", "sp_a_b_c", "sp_ah_config", "sp_download_info", "sp_appdownloader"};
                        for (int i4 = 0; i4 < 13; i4++) {
                            SharedPreferences sharedPreferences = b.getContext().getSharedPreferences(strArr[i4], 0);
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().clear().apply();
                            }
                        }
                        ns = com.ss.android.socialbase.downloader.downloader.p.ns();
                    } catch (Throwable unused) {
                    }
                    if (ns instanceof com.ss.android.socialbase.downloader.impls.i) {
                        SparseArray<DownloadInfo> vv2 = ((com.ss.android.socialbase.downloader.impls.i) ns).vv().vv();
                        for (int size = vv2.size() - 1; size >= 0; size--) {
                            DownloadInfo downloadInfo = vv2.get(vv2.keyAt(size));
                            if (downloadInfo != null) {
                                Downloader.getInstance(b.getContext()).clearDownloadData(downloadInfo.getId());
                            }
                        }
                    }
                }
            }
        });
    }

    public ExecutorService p() {
        if (this.f60613m == null) {
            synchronized (i.class) {
                if (this.f60613m == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                    this.f60613m = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, synchronousQueue, new com.ss.android.socialbase.downloader.qv.vv(qv.class.getName() + "-IOThreadPool"));
                }
            }
        }
        return this.f60613m;
    }

    private i() {
    }

    public void m(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !jh.m()) {
            runnable.run();
        } else {
            p().execute(runnable);
        }
    }

    public void vv(Runnable runnable) {
        vv(runnable, false);
    }

    public void vv(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !jh.m()) {
            runnable.run();
        } else {
            m().execute(runnable);
        }
    }

    public ExecutorService m() {
        if (this.vv == null) {
            synchronized (i.class) {
                if (this.vv == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                    this.vv = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, synchronousQueue, new com.ss.android.socialbase.downloader.qv.vv(qv.class.getName() + "-CPUThreadPool"));
                }
            }
        }
        return this.vv;
    }

    public void vv(Runnable runnable, long j4) {
        try {
            i().schedule(runnable, j4, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
