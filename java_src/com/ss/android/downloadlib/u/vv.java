package com.ss.android.downloadlib.u;

import androidx.annotation.NonNull;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.m.u;
import com.ss.android.socialbase.appdownloader.p.k;
import com.ss.android.socialbase.appdownloader.p.wv;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class vv implements k {
    /* JADX INFO: Access modifiers changed from: private */
    public void m(DownloadInfo downloadInfo, @NonNull final com.ss.android.downloadlib.guide.install.vv vvVar) {
        com.ss.android.downloadad.api.vv.m vv = u.vv().vv(downloadInfo);
        boolean vv2 = com.ss.android.downloadlib.m.u.vv(vv);
        boolean m4 = com.ss.android.downloadlib.m.u.m(vv);
        if (vv2 && m4) {
            com.ss.android.downloadlib.m.p.vv(vv, new com.ss.android.downloadlib.guide.install.vv() { // from class: com.ss.android.downloadlib.u.vv.3
                @Override // com.ss.android.downloadlib.guide.install.vv
                public void vv() {
                    vvVar.vv();
                }
            });
        } else {
            vvVar.vv();
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.p.k
    public void vv(DownloadInfo downloadInfo, final wv wvVar) {
        vv(downloadInfo, new com.ss.android.downloadlib.guide.install.vv() { // from class: com.ss.android.downloadlib.u.vv.1
            @Override // com.ss.android.downloadlib.guide.install.vv
            public void vv() {
                wvVar.vv();
            }
        });
    }

    public void vv(final DownloadInfo downloadInfo, @NonNull final com.ss.android.downloadlib.guide.install.vv vvVar) {
        com.ss.android.downloadad.api.vv.m vv = u.vv().vv(downloadInfo);
        if (vv != null && com.ss.android.downloadlib.m.wv.vv(vv)) {
            TTDelegateActivity.vv(vv, new com.ss.android.downloadlib.guide.install.vv() { // from class: com.ss.android.downloadlib.u.vv.2
                @Override // com.ss.android.downloadlib.guide.install.vv
                public void vv() {
                    vv.this.m(downloadInfo, vvVar);
                }
            });
        } else {
            m(downloadInfo, vvVar);
        }
    }
}
