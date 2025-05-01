package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public abstract class vv extends AbsDownloadListener implements la {
    private static final String vv = "vv";

    public void vv(DownloadInfo downloadInfo) {
        if (!com.ss.android.socialbase.downloader.p.vv.vv() || downloadInfo == null) {
            return;
        }
        String str = vv;
        com.ss.android.socialbase.downloader.p.vv.m(str, " onWaitingDownloadCompleteHandler -- " + downloadInfo.getName());
    }
}
