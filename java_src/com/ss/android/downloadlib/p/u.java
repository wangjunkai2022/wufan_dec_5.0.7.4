package com.ss.android.downloadlib.p;

import android.content.Context;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class u implements com.ss.android.socialbase.appdownloader.p.i {
    private Context vv;

    public u(Context context) {
        this.vv = context.getApplicationContext();
    }

    @Override // com.ss.android.socialbase.appdownloader.p.i
    public void vv(Context context, String str) {
        com.ss.android.downloadlib.vv.vv().vv(str);
    }

    @Override // com.ss.android.socialbase.appdownloader.p.i
    public void vv(int i4, int i5, String str, int i6, long j4) {
        DownloadInfo downloadInfo;
        com.ss.android.downloadad.api.vv.m vv;
        Context context = this.vv;
        if (context == null || (downloadInfo = Downloader.getInstance(context).getDownloadInfo(i4)) == null || downloadInfo.getStatus() == 0 || (vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo)) == null) {
            return;
        }
        if (i5 == 1) {
            com.ss.android.downloadlib.vv.vv(downloadInfo, vv);
            if ("application/vnd.android.package-archive".equals(downloadInfo.getMimeType())) {
                com.ss.android.downloadlib.addownload.vv.vv().vv(downloadInfo, vv.m(), vv.jh(), vv.o(), downloadInfo.getTitle(), vv.i(), downloadInfo.getTargetFilePath());
            }
        } else if (i5 == 3) {
            com.ss.android.downloadlib.i.vv.vv().vv("download_notification", "download_notification_install", com.ss.android.downloadlib.vv.m(new JSONObject(), downloadInfo), vv);
        } else if (i5 == 5) {
            com.ss.android.downloadlib.i.vv.vv().vv("download_notification", "download_notification_pause", vv);
        } else if (i5 == 6) {
            com.ss.android.downloadlib.i.vv.vv().vv("download_notification", "download_notification_continue", vv);
        } else if (i5 != 7) {
        } else {
            com.ss.android.downloadlib.i.vv.vv().vv("download_notification", "download_notification_click", vv);
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.p.i
    public boolean vv(int i4, boolean z4) {
        if (b.q() != null) {
            return b.q().vv(z4);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.appdownloader.p.i
    public void vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        com.ss.android.downloadlib.n.vv().vv(downloadInfo);
        if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("report_download_cancel", 1) == 1) {
            com.ss.android.downloadlib.i.vv.vv().vv(downloadInfo, new BaseException(1012, ""));
        } else {
            com.ss.android.downloadlib.i.vv.vv().m(downloadInfo, new BaseException(1012, ""));
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.p.i
    public void vv(int i4, int i5, String str, String str2, String str3) {
        DownloadInfo downloadInfo;
        Context context = this.vv;
        if (context == null || (downloadInfo = Downloader.getInstance(context).getDownloadInfo(i4)) == null || downloadInfo.getStatus() != -3) {
            return;
        }
        downloadInfo.setPackageName(str2);
        com.ss.android.downloadlib.addownload.m.vv().vv(this.vv, downloadInfo);
    }

    @Override // com.ss.android.socialbase.appdownloader.p.i
    public boolean vv() {
        return com.ss.android.downloadlib.addownload.m.vv().m();
    }
}
