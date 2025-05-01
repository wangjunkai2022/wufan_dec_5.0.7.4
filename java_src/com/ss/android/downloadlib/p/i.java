package com.ss.android.downloadlib.p;

import androidx.annotation.WorkerThread;
import com.ss.android.downloadlib.addownload.m.wv;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.depend.b;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class i implements com.ss.android.socialbase.appdownloader.p.n, b {
    @Override // com.ss.android.socialbase.appdownloader.p.n
    public void vv(DownloadInfo downloadInfo, boolean z4) {
        if (downloadInfo == null) {
            return;
        }
        vv(downloadInfo, downloadInfo.getRealStatus(), z4);
    }

    @WorkerThread
    public void vv(DownloadInfo downloadInfo, int i4, boolean z4) {
        com.ss.android.downloadlib.addownload.m.u.vv().m();
        com.ss.android.downloadad.api.vv.m vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
        if (vv == null) {
            return;
        }
        try {
            if (z4) {
                vv.p(downloadInfo.getFailedResumeCount());
            } else if (vv.w() == -1) {
                return;
            } else {
                vv.p(-1);
            }
            wv.vv().vv(vv);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("download_id", downloadInfo.getId());
            jSONObject.put("name", downloadInfo.getName());
            jSONObject.put("url", downloadInfo.getUrl());
            jSONObject.put("download_time", downloadInfo.getDownloadTime());
            jSONObject.put("download_status", i4);
            jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
            jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
            int i5 = 1;
            jSONObject.put("only_wifi", downloadInfo.isOnlyWifi() ? 1 : 0);
            jSONObject.put("chunk_count", downloadInfo.getChunkCount());
            if (!z4) {
                i5 = 2;
            }
            jSONObject.put("launch_resumed", i5);
            jSONObject.put("failed_resume_count", downloadInfo.getFailedResumeCount());
            com.ss.android.downloadlib.i.vv.vv().vv("embeded_ad", "download_uncompleted", jSONObject, vv);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.b
    public void vv() {
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.p.i.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo;
                int spIntVal;
                com.ss.android.downloadlib.addownload.m.u.vv().m();
                for (com.ss.android.downloadad.api.vv.m mVar : com.ss.android.downloadlib.addownload.m.u.vv().p().values()) {
                    int la = mVar.la();
                    if (la != 0) {
                        com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(la);
                        if (vv.m("notification_opt_2") == 1 && (downloadInfo = Downloader.getInstance(com.ss.android.downloadlib.addownload.b.getContext()).getDownloadInfo(la)) != null) {
                            if (jh.m(mVar) && !jh.p(mVar.o())) {
                                int spIntVal2 = downloadInfo.getSpIntVal("restart_notify_open_app_count");
                                if (spIntVal2 < vv.vv("noti_open_restart_times", 1)) {
                                    qv.vv().o(mVar);
                                    downloadInfo.setSpValue("restart_notify_open_app_count", String.valueOf(spIntVal2 + 1));
                                }
                            } else if (downloadInfo.getRealStatus() == -2) {
                                int spIntVal3 = downloadInfo.getSpIntVal("restart_notify_continue_count");
                                if (spIntVal3 < vv.vv("noti_continue_restart_times", 1)) {
                                    qv.vv().vv(mVar);
                                    downloadInfo.setSpValue("restart_notify_continue_count", String.valueOf(spIntVal3 + 1));
                                }
                            } else if (downloadInfo.getRealStatus() == -3 && com.ss.android.socialbase.downloader.wv.u.p(downloadInfo) && !jh.m(mVar) && (spIntVal = downloadInfo.getSpIntVal("restart_notify_install_count")) < vv.vv("noti_install_restart_times", 1)) {
                                qv.vv().p(mVar);
                                downloadInfo.setSpValue("restart_notify_install_count", String.valueOf(spIntVal + 1));
                            }
                        }
                    }
                }
            }
        }, 5000L);
    }
}
