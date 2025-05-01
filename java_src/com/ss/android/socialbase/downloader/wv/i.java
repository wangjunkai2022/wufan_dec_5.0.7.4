package com.ss.android.socialbase.downloader.wv;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class i {
    public static boolean m(DownloadInfo downloadInfo) {
        return downloadInfo != null && com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).m("optimize_save_path") == 1;
    }

    public static boolean vv(DownloadInfo downloadInfo) {
        return downloadInfo != null && com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).m("optimize_head_request") == 1;
    }
}
