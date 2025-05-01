package com.ss.android.downloadlib.u;

import com.ss.android.downloadlib.addownload.m.u;
import com.ss.android.socialbase.appdownloader.p.k;
import com.ss.android.socialbase.appdownloader.p.wv;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class m implements k {
    @Override // com.ss.android.socialbase.appdownloader.p.k
    public void vv(DownloadInfo downloadInfo, wv wvVar) {
        com.ss.android.downloadad.api.vv.m vv;
        if (downloadInfo != null && (vv = u.vv().vv(downloadInfo)) != null) {
            downloadInfo.setLinkMode(vv.ky());
        }
        if (wvVar != null) {
            wvVar.vv();
        }
    }
}
