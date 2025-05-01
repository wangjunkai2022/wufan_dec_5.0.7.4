package com.ss.android.downloadlib.m;

import com.ss.android.downloadlib.addownload.b;
import com.ss.android.socialbase.downloader.vv.vv;
/* loaded from: classes5.dex */
public class o implements vv.InterfaceC0653vv {
    private long vv;

    /* loaded from: classes5.dex */
    private static class vv {
        private static o vv = new o();
    }

    @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
    public void m() {
        this.vv = System.currentTimeMillis();
    }

    @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
    public void p() {
    }

    private o() {
        this.vv = 0L;
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(this);
    }

    public static o vv() {
        return vv.vv;
    }

    public void m(i iVar) {
        if (iVar == null) {
            return;
        }
        int optInt = b.wv().optInt("check_an_result_delay", 1200);
        vv(iVar, optInt > 0 ? optInt : 1200);
    }

    public void vv(final i iVar, final long j4) {
        if (iVar == null) {
            return;
        }
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.m.o.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.ss.android.socialbase.downloader.vv.vv.vv().p() && System.currentTimeMillis() - o.this.vv > j4) {
                    iVar.vv(false);
                } else {
                    iVar.vv(true);
                }
            }
        }, j4);
    }

    public void vv(i iVar) {
        vv(iVar, 5000L);
    }
}
