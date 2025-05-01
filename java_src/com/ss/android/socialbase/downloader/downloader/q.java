package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public interface q<T extends DownloadService> {
    void i();

    void m(DownloadTask downloadTask);

    boolean m();

    void p();

    void p(DownloadTask downloadTask);

    void startService();

    IBinder vv(Intent intent);

    void vv(int i4);

    void vv(int i4, Notification notification);

    void vv(Intent intent, int i4, int i5);

    void vv(t tVar);

    void vv(WeakReference<T> weakReference);

    void vv(boolean z4);

    boolean vv();
}
