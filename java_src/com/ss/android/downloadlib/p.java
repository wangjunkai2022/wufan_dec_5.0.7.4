package com.ss.android.downloadlib;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadlib.n.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.vv.vv;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p implements com.ss.android.socialbase.appdownloader.p.qv {
    private static String vv = "p";

    /* renamed from: m  reason: collision with root package name */
    private Handler f60682m = new Handler(Looper.getMainLooper());

    @Override // com.ss.android.socialbase.appdownloader.p.qv
    public void vv(DownloadInfo downloadInfo, BaseException baseException, int i4) {
        final DownloadModel vv2;
        if (downloadInfo == null) {
            return;
        }
        if (i4 == -1 && baseException != null) {
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
            vv.vv(jSONObject, downloadInfo);
            b.vv("download_failed", jSONObject.toString());
        }
        com.ss.android.downloadad.api.vv.m vv3 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
        if (vv3 == null) {
            return;
        }
        try {
            if (i4 != -1) {
                if (i4 == -3) {
                    vv.vv(downloadInfo, vv3);
                    return;
                } else if (i4 == 2001) {
                    vv.vv().vv(downloadInfo, vv3, 2001);
                    return;
                } else if (i4 == 11) {
                    vv.vv().vv(downloadInfo, vv3, 2000);
                    if (vv3.ev()) {
                        return;
                    }
                    vv(downloadInfo, vv3);
                    return;
                } else {
                    return;
                }
            }
            BaseException baseException2 = null;
            if (baseException != null) {
                if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("toast_without_network", 0) == 1 && baseException.getErrorCode() == 1049) {
                    this.f60682m.post(new Runnable() { // from class: com.ss.android.downloadlib.p.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.ss.android.downloadlib.addownload.b.p().vv(5, com.ss.android.downloadlib.addownload.b.getContext(), null, "无网络，请检查网络设置", null, 0);
                        }
                    });
                }
                if (com.ss.android.socialbase.downloader.wv.u.qv(baseException)) {
                    if (com.ss.android.downloadlib.addownload.b.r() != null) {
                        com.ss.android.downloadlib.addownload.b.r();
                        vv3.m();
                    }
                    com.ss.android.downloadlib.i.vv.vv().vv("download_failed_for_space", vv3);
                    if (!vv3.ds()) {
                        com.ss.android.downloadlib.i.vv.vv().vv("download_can_restart", vv3);
                        vv(downloadInfo);
                    }
                    if ((com.ss.android.downloadlib.addownload.b.r() == null || !com.ss.android.downloadlib.addownload.b.r().p()) && (vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(vv3.m())) != null && vv2.isShowToast()) {
                        final com.ss.android.socialbase.downloader.n.vv vv4 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
                        if (vv4.vv("show_no_enough_space_toast", 0) == 1) {
                            this.f60682m.post(new Runnable() { // from class: com.ss.android.downloadlib.p.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.ss.android.downloadlib.addownload.b.p().vv(2, com.ss.android.downloadlib.addownload.b.getContext(), vv2, vv4.vv("no_enough_space_toast_text", "您的存储空间不足，请清理后再试"), null, 0);
                                }
                            });
                        }
                    }
                }
                baseException2 = new BaseException(baseException.getErrorCode(), jh.vv(baseException.getMessage(), com.ss.android.downloadlib.addownload.b.wv().optInt("exception_msg_length", 500)));
            }
            com.ss.android.downloadlib.i.vv.vv().m(downloadInfo, baseException2);
            n.vv().vv(downloadInfo, baseException, "");
        } catch (Exception e5) {
            com.ss.android.downloadlib.addownload.b.x().vv(e5, "onAppDownloadMonitorSend");
        }
    }

    private void vv(final DownloadInfo downloadInfo, final com.ss.android.downloadad.api.vv.m mVar) {
        final long vv2 = jh.vv(Environment.getDataDirectory(), -1L);
        long min = Math.min(524288000L, jh.vv(Environment.getDataDirectory()) / 10);
        final long totalBytes = downloadInfo.getTotalBytes();
        double d5 = min;
        double d6 = totalBytes;
        Double.isNaN(d6);
        Double.isNaN(d5);
        final double d7 = (d6 * 2.5d) + d5;
        if (vv2 > -1 && totalBytes > -1) {
            double d8 = vv2;
            if (d8 < d7) {
                Double.isNaN(d8);
                if (d7 - d8 > com.ss.android.downloadlib.addownload.i.m()) {
                    com.ss.android.downloadlib.addownload.i.vv(downloadInfo.getId());
                }
            }
        }
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(new vv.InterfaceC0653vv() { // from class: com.ss.android.downloadlib.p.3
            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void m() {
                if (!jh.m(mVar)) {
                    long j4 = vv2;
                    if (j4 <= -1 || totalBytes <= -1 || j4 >= d7) {
                        return;
                    }
                    com.ss.android.downloadlib.i.vv.vv().vv("clean_space_install", com.ss.android.downloadlib.addownload.i.vv("install_no_enough_space"), mVar);
                    if (com.ss.android.downloadlib.addownload.i.vv(downloadInfo, ((long) d7) - vv2)) {
                        com.ss.android.socialbase.downloader.vv.vv.vv().m(this);
                        mVar.n(true);
                        return;
                    }
                    return;
                }
                com.ss.android.socialbase.downloader.vv.vv.vv().m(this);
            }

            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void p() {
            }
        });
    }

    private void vv(@NonNull DownloadInfo downloadInfo) {
        if (com.ss.android.downloadlib.n.o.u(downloadInfo.getId())) {
            i.vv().m(new com.ss.android.downloadlib.addownload.p.m(downloadInfo));
        }
    }
}
