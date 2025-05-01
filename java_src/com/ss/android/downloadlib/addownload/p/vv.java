package com.ss.android.downloadlib.addownload.p;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.downloadlib.n.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.depend.d;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class vv implements g {
    private int vv;

    private long m(com.ss.android.socialbase.downloader.n.vv vvVar) {
        long vv = vvVar.vv("clear_space_sleep_time", 0L);
        if (vv <= 0) {
            return 0L;
        }
        if (vv > 5000) {
            vv = 5000;
        }
        b.m("AppDownloadDiskSpaceHandler", "waiting for space clear, sleepTime = ".concat(String.valueOf(vv)), null);
        try {
            Thread.sleep(vv);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
        b.m("AppDownloadDiskSpaceHandler", "waiting end!", null);
        return vv;
    }

    public void vv(int i4) {
        this.vv = i4;
    }

    @Override // com.ss.android.socialbase.downloader.depend.g
    public boolean vv(long j4, long j5, d dVar) {
        long j6;
        com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(this.vv);
        if (vv(vv)) {
            long currentTimeMillis = System.currentTimeMillis();
            i.vv().p();
            long m4 = jh.m(0L);
            vv();
            long m5 = jh.m(0L);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (m5 < j5) {
                long m6 = m(vv);
                if (m6 > 0) {
                    m5 = jh.m(0L);
                }
                j6 = m6;
            } else {
                j6 = 0;
            }
            b.m("AppDownloadDiskSpaceHandler", "cleanUpDisk, byteRequired = " + j5 + ", byteAvailableAfter = " + m5 + ", cleaned = " + (m5 - m4), null);
            vv(m4, m5, j5, currentTimeMillis2, j6);
            if (m5 < j5) {
                return false;
            }
            if (dVar != null) {
                dVar.vv();
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean vv(com.ss.android.socialbase.downloader.n.vv vvVar) {
        if (vvVar.vv("clear_space_use_disk_handler", 0) != 1) {
            return false;
        }
        return System.currentTimeMillis() - i.vv().m() >= vvVar.vv("clear_space_min_time_interval", TTAdConstant.AD_MAX_EVENT_TIME);
    }

    private void vv() {
        com.ss.android.downloadlib.addownload.b.j();
        p.vv();
        p.m();
    }

    private void vv(long j4, long j5, long j6, long j7, long j8) {
        DownloadInfo downloadInfo = Downloader.getInstance(com.ss.android.downloadlib.addownload.b.getContext()).getDownloadInfo(this.vv);
        if (downloadInfo == null) {
            return;
        }
        try {
            com.ss.android.downloadlib.vv.vv().vv(downloadInfo, j4, j5, j6, j7, j8, j5 > j6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
