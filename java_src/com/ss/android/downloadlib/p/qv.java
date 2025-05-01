package com.ss.android.downloadlib.p;

import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class qv {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {
        private static qv vv = new qv();
    }

    public void i(@NonNull com.ss.android.downloadad.api.vv.m mVar) {
        p(mVar, com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("noti_install_delay_secs", 5));
    }

    public void m(com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar == null) {
            return;
        }
        m(mVar, com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("noti_continue_delay_secs", 5));
    }

    public void o(@NonNull com.ss.android.downloadad.api.vv.m mVar) {
        vv(mVar, 5L);
    }

    public void p(@NonNull com.ss.android.downloadad.api.vv.m mVar) {
        p(mVar, 5L);
    }

    public void u(@NonNull com.ss.android.downloadad.api.vv.m mVar) {
        vv(mVar, com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("noti_open_delay_secs", 5));
    }

    private qv() {
    }

    private void m(@NonNull final com.ss.android.downloadad.api.vv.m mVar, long j4) {
        final int la = mVar.la();
        if (com.ss.android.socialbase.downloader.n.vv.vv(la).m("notification_opt_2") != 1) {
            return;
        }
        vv(la);
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.p.qv.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(la);
                JSONObject jSONObject = new JSONObject();
                jh.vv(jSONObject, "ttdownloader_type", (Object) 1);
                com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
                if (downloadInfo != null && -2 == downloadInfo.getRealStatus() && !downloadInfo.isPauseReserveOnWifi()) {
                    qv.this.vv(la, mVar, jSONObject);
                } else {
                    jh.vv(jSONObject, "error_code", (Object) 1001);
                }
                com.ss.android.downloadlib.i.vv.vv().m("download_notification_try_show", jSONObject, mVar);
            }
        }, j4 * 1000);
    }

    private void p(@NonNull final com.ss.android.downloadad.api.vv.m mVar, long j4) {
        final int la = mVar.la();
        if (com.ss.android.socialbase.downloader.n.vv.vv(la).m("notification_opt_2") != 1) {
            return;
        }
        vv(la);
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.p.qv.2
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(la);
                JSONObject jSONObject = new JSONObject();
                jh.vv(jSONObject, "ttdownloader_type", (Object) 2);
                com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
                if (!jh.m(mVar)) {
                    qv.this.vv(la, mVar, jSONObject);
                } else {
                    jh.vv(jSONObject, "error_code", (Object) 1002);
                }
                com.ss.android.downloadlib.i.vv.vv().m("download_notification_try_show", jSONObject, mVar);
            }
        }, j4 * 1000);
    }

    public static qv vv() {
        return vv.vv;
    }

    public void vv(com.ss.android.downloadad.api.vv.m mVar) {
        m(mVar, 5L);
    }

    public void vv(@NonNull final com.ss.android.downloadad.api.vv.m mVar, long j4) {
        final int la = mVar.la();
        if (com.ss.android.socialbase.downloader.n.vv.vv(la).m("notification_opt_2") != 1) {
            return;
        }
        vv(la);
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.p.qv.3
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(la);
                JSONObject jSONObject = new JSONObject();
                jh.vv(jSONObject, "ttdownloader_type", (Object) 3);
                com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
                if (!jh.p(mVar.o())) {
                    qv.this.vv(la, mVar, jSONObject);
                } else {
                    jh.vv(jSONObject, "error_code", (Object) 1003);
                }
                com.ss.android.downloadlib.i.vv.vv().m("download_notification_try_show", jSONObject, mVar);
            }
        }, j4 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, com.ss.android.downloadad.api.vv.m mVar, JSONObject jSONObject) {
        if (!com.ss.android.socialbase.appdownloader.o.i.vv()) {
            jh.vv(jSONObject, "error_code", (Object) 1004);
            return;
        }
        DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(i4);
        if (downloadInfo == null) {
            jh.vv(jSONObject, "error_code", (Object) 1005);
            return;
        }
        if (com.ss.android.socialbase.downloader.notification.m.vv().o(i4) != null) {
            com.ss.android.socialbase.downloader.notification.m.vv().u(i4);
        }
        com.ss.android.socialbase.appdownloader.o.vv vvVar = new com.ss.android.socialbase.appdownloader.o.vv(b.getContext(), i4, downloadInfo.getTitle(), downloadInfo.getSavePath(), downloadInfo.getName(), downloadInfo.getExtra());
        vvVar.vv(downloadInfo.getCurBytes());
        vvVar.m(downloadInfo.getTotalBytes());
        vvVar.vv(downloadInfo.getStatus(), null, false, false);
        com.ss.android.socialbase.downloader.notification.m.vv().vv(vvVar);
        vvVar.vv((BaseException) null, false);
        com.ss.android.downloadlib.i.vv.vv().m("download_notification_show", jSONObject, mVar);
    }

    public void vv(int i4) {
        DownloadInfo downloadInfo;
        if (com.ss.android.socialbase.appdownloader.o.p.vv().vv(i4) != null || (downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(i4)) == null) {
            return;
        }
        com.ss.android.socialbase.appdownloader.o.p.vv().vv(i4, downloadInfo.getIconUrl());
    }
}
