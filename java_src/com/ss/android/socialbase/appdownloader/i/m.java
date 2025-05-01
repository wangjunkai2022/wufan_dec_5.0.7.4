package com.ss.android.socialbase.appdownloader.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.socialbase.appdownloader.i;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.jh;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.wv.u;
import java.util.List;
/* loaded from: classes5.dex */
public class m implements jh {

    /* renamed from: m  reason: collision with root package name */
    private BroadcastReceiver f60800m;
    private List<Integer> vv;

    /* JADX INFO: Access modifiers changed from: private */
    public void m(List<DownloadInfo> list, int i4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i.k();
        Context ky = p.ky();
        if (ky == null) {
            return;
        }
        boolean m4 = u.m(ky);
        for (DownloadInfo downloadInfo : list) {
            vv(ky, downloadInfo, m4, i4);
        }
        List<Integer> list2 = this.vv;
        if (list2 == null || list2.isEmpty() || this.f60800m != null) {
            return;
        }
        this.f60800m = new BroadcastReceiver() { // from class: com.ss.android.socialbase.appdownloader.i.m.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                final Context applicationContext = context.getApplicationContext();
                if (u.m(applicationContext)) {
                    com.ss.android.socialbase.downloader.p.vv.m("LaunchResume", "onReceive : wifi connected !!!");
                    p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.i.m.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                if (m.this.vv != null && !m.this.vv.isEmpty()) {
                                    int size = m.this.vv.size();
                                    Integer[] numArr = new Integer[size];
                                    m.this.vv.toArray(numArr);
                                    m.this.vv.clear();
                                    for (int i5 = 0; i5 < size; i5++) {
                                        DownloadInfo downloadInfo2 = Downloader.getInstance(applicationContext).getDownloadInfo(numArr[i5].intValue());
                                        if (downloadInfo2 != null && (downloadInfo2.getRealStatus() == -5 || (downloadInfo2.getRealStatus() == -2 && downloadInfo2.isPauseReserveOnWifi()))) {
                                            m.this.vv(applicationContext, downloadInfo2, true, 2);
                                        }
                                    }
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    });
                    try {
                        applicationContext.unregisterReceiver(m.this.f60800m);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    m.this.f60800m = null;
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            ky.registerReceiver(this.f60800m, intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
            this.f60800m = null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.jh
    public List<String> vv() {
        return com.ss.android.socialbase.appdownloader.p.p();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.jh
    public void vv(final List<DownloadInfo> list, final int i4) {
        if (u.i()) {
            p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.i.m.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        m.this.m(list, i4);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        } else {
            m(list, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vv(android.content.Context r18, com.ss.android.socialbase.downloader.model.DownloadInfo r19, boolean r20, int r21) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.i.m.vv(android.content.Context, com.ss.android.socialbase.downloader.model.DownloadInfo, boolean, int):void");
    }

    private void vv(DownloadInfo downloadInfo, Context context) {
        com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
        int vv2 = vv.vv("paused_resume_max_count", 0);
        double vv3 = vv.vv("paused_resume_max_hours", 72.0d);
        int pausedResumeCount = downloadInfo.getPausedResumeCount();
        if (pausedResumeCount < vv2 && ((double) (System.currentTimeMillis() - downloadInfo.getLastDownloadTime())) < vv3 * 3600000.0d) {
            com.ss.android.socialbase.downloader.notification.vv o4 = com.ss.android.socialbase.downloader.notification.m.vv().o(downloadInfo.getId());
            if (o4 == null) {
                o4 = new com.ss.android.socialbase.appdownloader.o.vv(context, downloadInfo.getId(), downloadInfo.getTitle(), downloadInfo.getSavePath(), downloadInfo.getName(), downloadInfo.getExtra());
                com.ss.android.socialbase.downloader.notification.m.vv().vv(o4);
            } else {
                o4.vv(downloadInfo);
            }
            o4.m(downloadInfo.getTotalBytes());
            o4.vv(downloadInfo.getCurBytes());
            o4.vv(downloadInfo.getStatus(), null, false, false);
            downloadInfo.setPausedResumeCount(pausedResumeCount + 1);
            downloadInfo.updateSpData();
        }
    }

    private boolean vv(DownloadInfo downloadInfo) {
        if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).m("uninstall_can_not_resume_for_force_task", false)) {
            return u.vv(downloadInfo, false, downloadInfo.getMd5());
        }
        return downloadInfo.isDownloaded();
    }
}
