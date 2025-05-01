package com.ss.android.downloadlib.u;

import com.ss.android.socialbase.appdownloader.p.k;
import com.ss.android.socialbase.appdownloader.p.wv;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class p implements k {
    private static volatile p vv;

    /* renamed from: m  reason: collision with root package name */
    private List<k> f60733m;

    private p() {
        ArrayList arrayList = new ArrayList();
        this.f60733m = arrayList;
        arrayList.add(new m());
        this.f60733m.add(new vv());
    }

    public static p vv() {
        if (vv == null) {
            synchronized (p.class) {
                if (vv == null) {
                    vv = new p();
                }
            }
        }
        return vv;
    }

    @Override // com.ss.android.socialbase.appdownloader.p.k
    public void vv(DownloadInfo downloadInfo, wv wvVar) {
        if (downloadInfo != null && this.f60733m.size() != 0) {
            vv(downloadInfo, 0, wvVar);
        } else if (wvVar != null) {
            wvVar.vv();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(final DownloadInfo downloadInfo, final int i4, final wv wvVar) {
        if (i4 != this.f60733m.size() && i4 >= 0) {
            this.f60733m.get(i4).vv(downloadInfo, new wv() { // from class: com.ss.android.downloadlib.u.p.1
                @Override // com.ss.android.socialbase.appdownloader.p.wv
                public void vv() {
                    p.this.vv(downloadInfo, i4 + 1, wvVar);
                }
            });
        } else {
            wvVar.vv();
        }
    }
}
