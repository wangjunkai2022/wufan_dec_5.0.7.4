package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public abstract class vv implements q {

    /* renamed from: o  reason: collision with root package name */
    private static final String f61057o = "vv";

    /* renamed from: p  reason: collision with root package name */
    protected volatile boolean f61061p;

    /* renamed from: u  reason: collision with root package name */
    private WeakReference<Service> f61062u;
    protected final SparseArray<List<DownloadTask>> vv = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    protected volatile boolean f61059m = false;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f61058i = false;

    /* renamed from: n  reason: collision with root package name */
    private Handler f61060n = new Handler(Looper.getMainLooper());
    private Runnable qv = new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.vv.1
        @Override // java.lang.Runnable
        public void run() {
            if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                com.ss.android.socialbase.downloader.p.vv.m(vv.f61057o, "tryDownload: 2 try");
            }
            if (vv.this.f61059m) {
                return;
            }
            if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                com.ss.android.socialbase.downloader.p.vv.m(vv.f61057o, "tryDownload: 2 error");
            }
            vv.this.startService(p.ky(), null);
        }
    };

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void i() {
        this.f61059m = false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public boolean m() {
        String str = f61057o;
        com.ss.android.socialbase.downloader.p.vv.p(str, "isServiceForeground = " + this.f61061p);
        return this.f61061p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
        SparseArray<List<DownloadTask>> clone;
        synchronized (this.vv) {
            String str = f61057o;
            com.ss.android.socialbase.downloader.p.vv.m(str, "resumePendingTask pendingTasks.size:" + this.vv.size());
            clone = this.vv.clone();
            this.vv.clear();
        }
        com.ss.android.socialbase.downloader.impls.vv w4 = p.w();
        if (w4 != null) {
            for (int i4 = 0; i4 < clone.size(); i4++) {
                List<DownloadTask> list = clone.get(clone.keyAt(i4));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        String str2 = f61057o;
                        com.ss.android.socialbase.downloader.p.vv.m(str2, "resumePendingTask key:" + downloadTask.getDownloadId());
                        w4.vv(downloadTask);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void p() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void p(DownloadTask downloadTask) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void startService() {
        if (this.f61059m) {
            return;
        }
        if (com.ss.android.socialbase.downloader.p.vv.vv()) {
            com.ss.android.socialbase.downloader.p.vv.m(f61057o, "startService");
        }
        startService(p.ky(), null);
    }

    protected void startService(Context context, ServiceConnection serviceConnection) {
    }

    protected void stopService(Context context, ServiceConnection serviceConnection) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void vv(Intent intent, int i4, int i5) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void vv(t tVar) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void vv(WeakReference weakReference) {
        this.f61062u = weakReference;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public boolean vv() {
        return this.f61059m;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void m(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        if (!this.f61059m) {
            if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                com.ss.android.socialbase.downloader.p.vv.m(f61057o, "tryDownload but service is not alive");
            }
            if (com.ss.android.socialbase.downloader.wv.vv.vv(262144)) {
                vv(downloadTask);
                if (!this.f61058i) {
                    if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                        com.ss.android.socialbase.downloader.p.vv.m(f61057o, "tryDownload: 1");
                    }
                    startService(p.ky(), null);
                    this.f61058i = true;
                    return;
                }
                this.f61060n.removeCallbacks(this.qv);
                this.f61060n.postDelayed(this.qv, 10L);
                return;
            }
            vv(downloadTask);
            startService(p.ky(), null);
            return;
        }
        String str = f61057o;
        com.ss.android.socialbase.downloader.p.vv.m(str, "tryDownload when isServiceAlive");
        o();
        com.ss.android.socialbase.downloader.impls.vv w4 = p.w();
        if (w4 != null) {
            com.ss.android.socialbase.downloader.p.vv.m(str, "tryDownload current task: " + downloadTask.getDownloadId());
            w4.vv(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public IBinder vv(Intent intent) {
        com.ss.android.socialbase.downloader.p.vv.m(f61057o, "onBind Abs");
        return new Binder();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void vv(int i4, Notification notification) {
        WeakReference<Service> weakReference = this.f61062u;
        if (weakReference != null && weakReference.get() != null) {
            String str = f61057o;
            com.ss.android.socialbase.downloader.p.vv.p(str, "startForeground  id = " + i4 + ", service = " + this.f61062u.get() + ",  isServiceAlive = " + this.f61059m);
            try {
                this.f61062u.get().startForeground(i4, notification);
                this.f61061p = true;
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        com.ss.android.socialbase.downloader.p.vv.i(f61057o, "startForeground: downloadService is null, do nothing!");
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void vv(boolean z4) {
        WeakReference<Service> weakReference = this.f61062u;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        String str = f61057o;
        com.ss.android.socialbase.downloader.p.vv.p(str, "stopForeground  service = " + this.f61062u.get() + ",  isServiceAlive = " + this.f61059m);
        try {
            this.f61061p = false;
            this.f61062u.get().stopForeground(z4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void vv(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        int downloadId = downloadTask.getDownloadId();
        synchronized (this.vv) {
            String str = f61057o;
            com.ss.android.socialbase.downloader.p.vv.m(str, "pendDownloadTask pendingTasks.size:" + this.vv.size() + " downloadId:" + downloadId);
            List<DownloadTask> list = this.vv.get(downloadId);
            if (list == null) {
                list = new ArrayList<>();
                this.vv.put(downloadId, list);
            }
            com.ss.android.socialbase.downloader.p.vv.m(str, "before pendDownloadTask taskArray.size:" + list.size());
            list.add(downloadTask);
            com.ss.android.socialbase.downloader.p.vv.m(str, "after pendDownloadTask pendingTasks.size:" + this.vv.size());
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void vv(int i4) {
        com.ss.android.socialbase.downloader.p.vv.vv(i4);
    }
}
