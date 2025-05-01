package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
/* loaded from: classes5.dex */
public class qv extends com.ss.android.socialbase.downloader.downloader.vv {

    /* renamed from: o  reason: collision with root package name */
    private static final String f61108o = "qv";

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public void p() {
        if (com.ss.android.socialbase.downloader.wv.vv.vv(262144)) {
            this.f61059m = true;
            this.f61058i = false;
            if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                com.ss.android.socialbase.downloader.p.vv.m(f61108o, "onStartCommandOnMainThread");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv
    public void startService(Context context, ServiceConnection serviceConnection) {
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv
    public void stopService(Context context, ServiceConnection serviceConnection) {
        context.stopService(new Intent(context, DownloadService.class));
        this.f61059m = false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public void vv(Intent intent, int i4, int i5) {
        if (com.ss.android.socialbase.downloader.p.vv.vv()) {
            com.ss.android.socialbase.downloader.p.vv.m(f61108o, "onStartCommand");
        }
        if (!com.ss.android.socialbase.downloader.wv.vv.vv(262144)) {
            this.f61059m = true;
        }
        o();
    }
}
