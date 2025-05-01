package com.ss.android.downloadlib.addownload;

import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class p {

    /* renamed from: m  reason: collision with root package name */
    private static volatile p f60560m = null;
    private static String vv = "p";

    /* renamed from: p  reason: collision with root package name */
    private ConcurrentHashMap<Long, Runnable> f60561p;

    public p() {
        this.f60561p = null;
        this.f60561p = new ConcurrentHashMap<>();
    }

    public static p vv() {
        if (f60560m == null) {
            synchronized (p.class) {
                if (f60560m == null) {
                    f60560m = new p();
                }
            }
        }
        return f60560m;
    }

    public long m() {
        return b.wv().optLong("quick_app_check_internal", 1200L);
    }

    public void vv(o oVar, boolean z4, int i4, DownloadModel downloadModel) {
        if (downloadModel instanceof AdDownloadModel) {
            ((AdDownloadModel) downloadModel).setFunnelType(3);
        }
        long id = downloadModel.getId();
        if (i4 == 4) {
            if (!z4) {
                vv(id, false, 2);
                oVar.m(false);
                return;
            }
            vv(id, true, 2);
        } else if (i4 == 5) {
            if (!z4) {
                vv(id, false, 1);
                oVar.p(false);
                return;
            }
            vv(id, true, 1);
        } else if (i4 != 7) {
        } else {
            Runnable remove = this.f60561p.remove(Long.valueOf(id));
            if (z4) {
                com.ss.android.downloadlib.i.vv.vv().vv(id, 1);
                vv(id, true, 1);
                return;
            }
            if (remove != null) {
                com.ss.android.downloadlib.n.vv().m().post(remove);
            }
            vv(id, false, 1);
        }
    }

    private void vv(long j4, boolean z4, int i4) {
        com.ss.android.downloadlib.i.vv.vv().vv(j4, z4, i4);
        if (z4) {
            b.y();
        }
    }

    public void vv(final o oVar, final int i4, final DownloadModel downloadModel) {
        com.ss.android.downloadlib.m.o.vv().vv(new com.ss.android.downloadlib.m.i() { // from class: com.ss.android.downloadlib.addownload.p.1
            @Override // com.ss.android.downloadlib.m.i
            public void vv(boolean z4) {
                p.this.vv(oVar, z4, i4, downloadModel);
            }
        }, m());
    }

    public static boolean vv(DownloadInfo downloadInfo) {
        return downloadInfo == null || downloadInfo.getStatus() == 0 || downloadInfo.getStatus() == -4;
    }
}
