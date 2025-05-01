package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
/* loaded from: classes5.dex */
public class SqlDownloadCacheService extends Service {
    private static final String vv = SqlDownloadCacheService.class.getSimpleName();

    public static void vv(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    context.bindService(intent, serviceConnection, 1);
                }
                context.startService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        x xVar;
        k ns = p.ns();
        if (ns instanceof com.ss.android.socialbase.downloader.impls.i) {
            xVar = ((com.ss.android.socialbase.downloader.impls.i) ns).u();
        } else {
            xVar = ns instanceof x ? (x) ns : null;
        }
        if (xVar instanceof IBinder) {
            return (IBinder) xVar;
        }
        return new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        p.vv(getApplicationContext());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        int onStartCommand = super.onStartCommand(intent, i4, i5);
        if (p.k()) {
            return 2;
        }
        return onStartCommand;
    }
}
