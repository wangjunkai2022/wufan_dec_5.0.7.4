package com.ss.android.downloadlib.addownload;

import com.ss.android.download.api.model.DownloadShortInfo;
/* loaded from: classes5.dex */
public class k {
    public static int vv(int i4, int i5) {
        return (i5 <= 0 || i5 >= 100 || !vv(i4)) ? i5 : (int) (Math.sqrt(i5) * 10.0d);
    }

    public static long vv(int i4, long j4, long j5) {
        if (vv(i4)) {
            if (j4 <= 0) {
                return 0L;
            }
            return j5 <= 0 ? j4 : (j5 * vv(i4, (int) ((j4 * 100) / j5))) / 100;
        }
        return j4;
    }

    public static DownloadShortInfo vv(DownloadShortInfo downloadShortInfo) {
        if (downloadShortInfo != null && vv((int) downloadShortInfo.id)) {
            downloadShortInfo.currentBytes = vv((int) downloadShortInfo.id, downloadShortInfo.currentBytes, downloadShortInfo.totalBytes);
        }
        return downloadShortInfo;
    }

    private static boolean vv(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("pause_optimise_pretend_download_percent_switch", 0) == 1 && com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("pause_optimise_switch", 0) == 1;
    }
}
