package com.ss.android.socialbase.appdownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.join.mgps.receiver.BootReceiver_;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class DownloadReceiver extends BroadcastReceiver {
    private static final String vv = DownloadReceiver.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private Handler f60774m = new Handler(Looper.getMainLooper());

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        com.ss.android.socialbase.appdownloader.p.p vv2 = i.k().vv();
        if (action.equals("android.intent.action.BOOT_COMPLETED") && (vv2 == null || vv2.vv())) {
            if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                com.ss.android.socialbase.downloader.p.vv.vv(vv, "Received broadcast intent for android.intent.action.BOOT_COMPLETED");
            }
            vv(context, action);
        } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
            if (com.ss.android.socialbase.downloader.p.vv.vv()) {
                com.ss.android.socialbase.downloader.p.vv.vv(vv, "Received broadcast intent for android.intent.action.MEDIA_MOUNTED");
            }
            vv(context, action);
        } else if (action.equals(BootReceiver_.f53984a) || action.equals(BootReceiver_.f53987d)) {
            com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    Uri data = intent.getData();
                    if (data == null) {
                        return;
                    }
                    String schemeSpecificPart = data.getSchemeSpecificPart();
                    com.ss.android.socialbase.appdownloader.p.i m4 = i.k().m();
                    if (m4 != null) {
                        m4.vv(context, schemeSpecificPart);
                    }
                    List<DownloadInfo> successedDownloadInfosWithMimeType = Downloader.getInstance(context).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive");
                    if (successedDownloadInfosWithMimeType != null) {
                        for (final DownloadInfo downloadInfo : successedDownloadInfosWithMimeType) {
                            if (downloadInfo != null && p.vv(downloadInfo, schemeSpecificPart)) {
                                vu downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
                                if (downloadNotificationEventListener != null && com.ss.android.socialbase.downloader.wv.u.u(downloadNotificationEventListener.vv())) {
                                    downloadNotificationEventListener.vv(9, downloadInfo, schemeSpecificPart, "");
                                }
                                com.ss.android.socialbase.downloader.notification.vv o4 = com.ss.android.socialbase.downloader.notification.m.vv().o(downloadInfo.getId());
                                if (o4 != null) {
                                    o4.vv((BaseException) null, false);
                                }
                                if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("install_queue_enable", 0) == 1) {
                                    qv.vv().vv(downloadInfo, schemeSpecificPart);
                                }
                                DownloadReceiver.this.f60774m.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadReceiver.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadReceiver.1.1.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                try {
                                                    if (downloadInfo.isSavePathRedirected()) {
                                                        com.ss.android.socialbase.downloader.wv.u.m(downloadInfo);
                                                    }
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }
                                        });
                                    }
                                }, 1000L);
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    private void vv(final Context context, final String str) {
        if (com.ss.android.socialbase.downloader.downloader.p.pj()) {
            com.ss.android.socialbase.downloader.downloader.p.vv(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Intent intent = new Intent(context, DownloadHandlerService.class);
                        intent.setAction(str);
                        context.startService(intent);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, 2000L, TimeUnit.MILLISECONDS);
        }
    }
}
