package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
/* loaded from: classes5.dex */
public class DownloadService extends Service {

    /* renamed from: m  reason: collision with root package name */
    private static final String f60990m = DownloadService.class.getSimpleName();
    protected q vv;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String str = f60990m;
        StringBuilder sb = new StringBuilder("onBind downloadServiceHandler != null:");
        sb.append(this.vv != null);
        com.ss.android.socialbase.downloader.p.vv.m(str, sb.toString());
        q qVar = this.vv;
        if (qVar != null) {
            return qVar.vv(intent);
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        p.vv(this);
        q vu = p.vu();
        this.vv = vu;
        vu.vv(new WeakReference(this));
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (com.ss.android.socialbase.downloader.p.vv.vv()) {
            com.ss.android.socialbase.downloader.p.vv.m(f60990m, "Service onDestroy");
        }
        q qVar = this.vv;
        if (qVar != null) {
            qVar.i();
            this.vv = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, final int i4, final int i5) {
        if (com.ss.android.socialbase.downloader.p.vv.vv()) {
            com.ss.android.socialbase.downloader.p.vv.m(f60990m, "DownloadService onStartCommand");
        }
        this.vv.p();
        ExecutorService jh = p.jh();
        if (jh != null) {
            jh.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadService.1
                @Override // java.lang.Runnable
                public void run() {
                    q qVar = DownloadService.this.vv;
                    if (qVar != null) {
                        qVar.vv(intent, i4, i5);
                    }
                }
            });
        }
        return p.k() ? 2 : 3;
    }
}
