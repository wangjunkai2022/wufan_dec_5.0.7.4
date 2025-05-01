package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public abstract class i extends AbsDownloadListener implements la {
    private void m(DownloadInfo downloadInfo) {
        if (downloadInfo == null || !downloadInfo.canShowNotification()) {
            return;
        }
        com.ss.android.socialbase.downloader.notification.vv o4 = com.ss.android.socialbase.downloader.notification.m.vv().o(downloadInfo.getId());
        if (o4 == null) {
            com.ss.android.socialbase.downloader.notification.m.vv().vv(vv());
            return;
        }
        o4.vv(downloadInfo);
    }

    private void p(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.canShowNotification() && downloadInfo.getStatus() == 4) {
            com.ss.android.socialbase.downloader.notification.vv o4 = com.ss.android.socialbase.downloader.notification.m.vv().o(downloadInfo.getId());
            if (o4 == null) {
                o4 = vv();
            }
            o4.vv(downloadInfo.getCurBytes(), downloadInfo.getTotalBytes());
        }
    }

    private void vv(int i4, DownloadInfo downloadInfo, BaseException baseException, boolean z4) {
        if (downloadInfo == null || !downloadInfo.canShowNotification() || i4 == 4) {
            return;
        }
        com.ss.android.socialbase.downloader.notification.vv o4 = com.ss.android.socialbase.downloader.notification.m.vv().o(downloadInfo.getId());
        if (o4 == null) {
            o4 = vv();
        }
        o4.m(downloadInfo.getTotalBytes());
        if (i4 == -3) {
            o4.vv(downloadInfo.getTotalBytes());
        } else {
            o4.vv(downloadInfo.getCurBytes());
        }
        o4.vv(i4, baseException, z4);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        vv(-1, downloadInfo, baseException, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        vv(-2, downloadInfo, null, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        super.onPrepare(downloadInfo);
        m(downloadInfo);
        vv(1, downloadInfo, null, true);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        p(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        vv(2, downloadInfo, null, false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        vv(-3, downloadInfo, null, false);
    }

    protected abstract com.ss.android.socialbase.downloader.notification.vv vv();

    @Override // com.ss.android.socialbase.downloader.depend.la
    public void vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        vv(11, downloadInfo, null, true);
    }
}
