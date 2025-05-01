package com.ss.android.socialbase.downloader.downloader;

import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public class IndependentProcessDownloadService extends DownloadService {
    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService, android.app.Service
    public void onCreate() {
        super.onCreate();
        p.vv(this);
        if (p.ju() == null) {
            p.vv(new v());
        }
        q ff = p.ff();
        this.vv = ff;
        ff.vv(new WeakReference(this));
    }
}
