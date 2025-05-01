package com.ss.android.downloadlib.p;

import android.content.pm.PackageInfo;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class m implements r {
    @Override // com.ss.android.socialbase.downloader.depend.r
    public boolean m(DownloadInfo downloadInfo) {
        return downloadInfo != null && com.ss.android.downloadlib.n.o.m() && downloadInfo.getPackageInfo() == null;
    }

    @Override // com.ss.android.socialbase.downloader.depend.r
    public void vv(DownloadInfo downloadInfo) throws BaseException {
        PackageInfo vv = com.ss.android.socialbase.appdownloader.p.vv(b.getContext(), downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
        if (vv != null) {
            downloadInfo.setAppVersionCode(vv.versionCode);
        }
    }
}
