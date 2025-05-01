package com.ss.android.downloadlib.p;

import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
/* loaded from: classes5.dex */
public class p implements r {
    @Override // com.ss.android.socialbase.downloader.depend.r
    public boolean m(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            return com.ss.android.download.api.p.m.vv(com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()), downloadInfo.getMimeType());
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.depend.r
    public void vv(DownloadInfo downloadInfo) throws BaseException {
        com.ss.android.download.api.config.r b5 = b.b();
        if (downloadInfo == null || b5 == null) {
            return;
        }
        File vv = vv(downloadInfo.getPackageName(), downloadInfo.getTargetFilePath());
        com.ss.android.downloadad.api.vv.m vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
        if (vv2 != null) {
            jh.vv(vv2.n());
        }
        downloadInfo.setMimeType("application/vnd.android.package-archive");
        downloadInfo.setName(vv.getName());
        downloadInfo.setMd5(null);
    }

    private File vv(String str, String str2) {
        File file = new File(str2);
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            str = name.substring(0, lastIndexOf);
        }
        return new File(file.getParent(), str + ".apk");
    }
}
