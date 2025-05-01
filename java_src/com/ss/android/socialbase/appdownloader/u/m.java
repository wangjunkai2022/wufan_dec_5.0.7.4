package com.ss.android.socialbase.appdownloader.u;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
/* loaded from: classes5.dex */
public class m {
    private static void m(final DownloadInfo downloadInfo) {
        final Context ky = com.ss.android.socialbase.downloader.downloader.p.ky();
        boolean z4 = true;
        if (((downloadInfo.isAutoResumed() && !downloadInfo.isShowNotificationForNetworkResumed()) || com.ss.android.socialbase.appdownloader.p.m(downloadInfo.getExtra()) || TextUtils.isEmpty(downloadInfo.getMimeType()) || !downloadInfo.getMimeType().equals("application/vnd.android.package-archive")) && com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("auto_install_when_resume", 0) != 1) {
            z4 = false;
        }
        final int vv = z4 ? com.ss.android.socialbase.appdownloader.p.vv(ky, downloadInfo.getId(), false) : 2;
        com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.u.m.1
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.appdownloader.p.i m4 = com.ss.android.socialbase.appdownloader.i.k().m();
                vu downloadNotificationEventListener = Downloader.getInstance(ky).getDownloadNotificationEventListener(downloadInfo.getId());
                if (m4 == null && downloadNotificationEventListener == null) {
                    return;
                }
                File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                if (file.exists()) {
                    try {
                        PackageInfo vv2 = com.ss.android.socialbase.appdownloader.p.vv(downloadInfo, file);
                        if (vv2 != null) {
                            String packageName = (vv == 1 || TextUtils.isEmpty(downloadInfo.getPackageName())) ? vv2.packageName : downloadInfo.getPackageName();
                            if (m4 != null) {
                                m4.vv(downloadInfo.getId(), 1, packageName, -3, downloadInfo.getDownloadTime());
                            }
                            if (downloadNotificationEventListener != null) {
                                downloadNotificationEventListener.vv(1, downloadInfo, packageName, "");
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        });
    }

    public static void vv(DownloadInfo downloadInfo) {
        m(downloadInfo);
    }
}
