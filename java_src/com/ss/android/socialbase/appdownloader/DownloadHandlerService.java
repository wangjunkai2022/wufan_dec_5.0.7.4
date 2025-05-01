package com.ss.android.socialbase.appdownloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class DownloadHandlerService extends Service {
    private static final String vv = DownloadHandlerService.class.getSimpleName();

    private void m(@NonNull DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.p.i iVar, vu vuVar) {
        int id = downloadInfo.getId();
        Intent intent = new Intent(this, DownloadTaskDeleteActivity.class);
        intent.putExtra("extra_click_download_ids", id);
        intent.addFlags(268435456);
        startActivity(intent);
        com.ss.android.socialbase.downloader.notification.m.vv().vv(id);
        downloadInfo.updateDownloadTime();
        if (iVar != null) {
            iVar.vv(id, 7, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
        }
        if (vuVar != null) {
            vuVar.vv(7, downloadInfo, "", "");
        }
    }

    private boolean vv(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return false;
        }
        int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
        intent.getIntExtra("extra_click_download_type", 0);
        com.ss.android.socialbase.appdownloader.p.i m4 = i.k().m();
        vu downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(intExtra);
        boolean z4 = true;
        if (intent.getBooleanExtra("extra_from_notification", false) && com.ss.android.socialbase.downloader.n.vv.vv(intExtra).m("notification_opt_2") == 1) {
            com.ss.android.socialbase.downloader.notification.m.vv().u(intExtra);
        }
        DownloadInfo downloadInfo = Downloader.getInstance(this).getDownloadInfo(intExtra);
        if (downloadInfo == null) {
            return false;
        }
        if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK_CONTENT")) {
            vv(downloadInfo, m4, downloadNotificationEventListener);
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_OPEN")) {
            vv(this, downloadInfo, m4, downloadNotificationEventListener);
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK_BTN")) {
            if (downloadInfo.getStatus() == 0) {
                return false;
            }
            vv(this, downloadInfo, m4, downloadNotificationEventListener);
            if (downloadInfo.isDownloadOverStatus() && com.ss.android.socialbase.downloader.n.vv.vv(intExtra).vv("no_hide_notification", 0) == 0) {
                if (!((com.ss.android.socialbase.downloader.n.vv.vv(intExtra).m("enable_notification_ui") < 2 || downloadInfo.getStatus() != -1) ? false : false)) {
                    com.ss.android.socialbase.downloader.notification.m.vv().vv(intExtra);
                    com.ss.android.socialbase.downloader.notification.m.vv().u(intExtra);
                }
            }
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_DELETE")) {
            m(downloadInfo, m4, downloadNotificationEventListener);
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_HIDE")) {
            com.ss.android.socialbase.downloader.notification.m.vv().vv(intExtra);
        } else if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.MEDIA_MOUNTED")) {
            com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadHandlerService.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("application/vnd.android.package-archive");
                        arrayList.add("mime_type_plg");
                        Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).restartAllFailedDownloadTasks(arrayList);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
            return true;
        }
        return false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.ss.android.socialbase.downloader.downloader.p.vv(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (com.ss.android.socialbase.downloader.p.vv.vv()) {
            com.ss.android.socialbase.downloader.p.vv.m(vv, "onStartCommand");
        }
        vv(intent);
        stopSelf();
        return 2;
    }

    private static void vv(Context context, DownloadInfo downloadInfo) {
        if (com.ss.android.socialbase.downloader.wv.u.m(context.getApplicationContext()) && downloadInfo.isPauseReserveOnWifi()) {
            downloadInfo.stopPauseReserveOnWifi();
        }
    }

    private static void vv(Context context, final com.ss.android.socialbase.appdownloader.p.i iVar, final DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        final vu downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
        if (iVar == null && downloadNotificationEventListener == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadHandlerService.2
            @Override // java.lang.Runnable
            public void run() {
                PackageInfo vv2;
                try {
                    File file = new File(DownloadInfo.this.getSavePath(), DownloadInfo.this.getName());
                    if (file.exists()) {
                        try {
                            String str = (com.ss.android.socialbase.downloader.downloader.p.ky() == null || (vv2 = p.vv(DownloadInfo.this, file)) == null) ? "" : vv2.packageName;
                            com.ss.android.socialbase.appdownloader.p.i iVar2 = iVar;
                            if (iVar2 != null) {
                                iVar2.vv(DownloadInfo.this.getId(), 3, str, -3, DownloadInfo.this.getDownloadTime());
                            }
                            vu vuVar = downloadNotificationEventListener;
                            if (vuVar != null) {
                                vuVar.vv(3, DownloadInfo.this, str, "");
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void vv(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.model.DownloadInfo r8, com.ss.android.socialbase.appdownloader.p.i r9, com.ss.android.socialbase.downloader.depend.vu r10) {
        /*
            r7 = this;
            int r1 = r8.getId()
            com.ss.android.socialbase.downloader.downloader.i r0 = com.ss.android.socialbase.downloader.downloader.i.vv()
            com.ss.android.socialbase.downloader.depend.a r0 = r0.r(r1)
            if (r0 == 0) goto L17
            boolean r0 = r0.vv(r8)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            r0.printStackTrace()
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L51
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity> r2 = com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.class
            r0.<init>(r7, r2)
            java.lang.String r2 = "extra_click_download_ids"
            r0.putExtra(r2, r1)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            r7.startActivity(r0)
            com.ss.android.socialbase.downloader.notification.m r0 = com.ss.android.socialbase.downloader.notification.m.vv()
            r0.vv(r1)
            r8.updateDownloadTime()
            if (r9 == 0) goto L49
            r2 = 7
            int r4 = r8.getStatus()
            long r5 = r8.getDownloadTime()
            java.lang.String r3 = ""
            r0 = r9
            r0.vv(r1, r2, r3, r4, r5)
        L49:
            if (r10 == 0) goto L51
            r9 = 7
            java.lang.String r0 = ""
            r10.vv(r9, r8, r0, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.DownloadHandlerService.vv(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.appdownloader.p.i, com.ss.android.socialbase.downloader.depend.vu):void");
    }

    private static void vv(Context context, int i4, boolean z4) {
        boolean z5;
        a r4;
        DownloadInfo downloadInfo;
        if (z4 && (r4 = com.ss.android.socialbase.downloader.downloader.i.vv().r(i4)) != null) {
            try {
                downloadInfo = Downloader.getInstance(context).getDownloadInfo(i4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (downloadInfo != null) {
                z5 = r4.m(downloadInfo);
                if (z5 && p.vv(context, i4, true) == 0) {
                    Toast.makeText(context, "Open Fail!", 0).show();
                }
                return;
            }
        }
        z5 = false;
        if (z5) {
            return;
        }
        Toast.makeText(context, "Open Fail!", 0).show();
    }

    public static void vv(Context context, DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.p.i iVar, vu vuVar) {
        com.ss.android.socialbase.downloader.notification.vv o4;
        int id = downloadInfo.getId();
        a r4 = com.ss.android.socialbase.downloader.downloader.i.vv().r(id);
        if ("application/vnd.android.package-archive".equals(downloadInfo.getMimeType()) && r4 != null && p.vv(context, downloadInfo) && r4.p(downloadInfo)) {
            return;
        }
        boolean z4 = false;
        switch (downloadInfo.getStatus()) {
            case -4:
            case -1:
                if (com.ss.android.socialbase.downloader.n.vv.vv(id).m("enable_notification_ui") >= 2 && downloadInfo.isOnlyWifi()) {
                    downloadInfo.setOnlyWifi(false);
                }
                Downloader.getInstance(context).restart(id);
                return;
            case -3:
                vv(com.ss.android.socialbase.downloader.downloader.p.ky(), id, true);
                vv(context, iVar, downloadInfo);
                if (com.ss.android.socialbase.downloader.n.vv.vv(id).vv("notification_click_install_auto_cancel", 1) != 0 || (o4 = com.ss.android.socialbase.downloader.notification.m.vv().o(id)) == null) {
                    z4 = true;
                } else {
                    o4.n();
                    o4.vv(-3, null, false, true);
                }
                if (z4) {
                    com.ss.android.socialbase.downloader.notification.m.vv().vv(id);
                    return;
                }
                return;
            case -2:
                if (com.ss.android.socialbase.downloader.downloader.i.vv().o(id)) {
                    Downloader.getInstance(context).resume(id);
                } else {
                    p.vv(downloadInfo, true, false);
                }
                if (iVar != null) {
                    iVar.vv(id, 6, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                }
                if (vuVar != null) {
                    vuVar.vv(6, downloadInfo, "", "");
                    return;
                }
                return;
            case 0:
            default:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Downloader.getInstance(context).pause(id);
                vv(context, downloadInfo);
                if (iVar != null) {
                    iVar.vv(id, 5, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                }
                if (vuVar != null) {
                    vuVar.vv(5, downloadInfo, "", "");
                    return;
                }
                return;
        }
    }
}
