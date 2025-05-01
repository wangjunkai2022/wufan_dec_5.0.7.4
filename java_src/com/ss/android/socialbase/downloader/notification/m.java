package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public class m {

    /* renamed from: o  reason: collision with root package name */
    private static final Object f61301o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static volatile m f61302p;
    private final long vv = 1000;

    /* renamed from: m  reason: collision with root package name */
    private final Map<Integer, Long> f61304m = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Set<String> f61303i = new HashSet();

    /* renamed from: u  reason: collision with root package name */
    private final SparseArray<vv> f61305u = new SparseArray<>();

    private m() {
    }

    static boolean m(int i4) {
        return i4 == 1 || i4 == 3;
    }

    static boolean p(DownloadInfo downloadInfo) {
        return downloadInfo.isDownloadOverStatus() && m(downloadInfo.getNotificationVisibility());
    }

    public static m vv() {
        if (f61302p == null) {
            synchronized (m.class) {
                if (f61302p == null) {
                    f61302p = new m();
                }
            }
        }
        return f61302p;
    }

    public vv i(int i4) {
        vv vvVar;
        if (i4 == 0) {
            return null;
        }
        synchronized (this.f61305u) {
            vvVar = this.f61305u.get(i4);
            if (vvVar != null) {
                this.f61305u.remove(i4);
                com.ss.android.socialbase.downloader.p.vv.vv("removeNotificationId ".concat(String.valueOf(i4)));
            }
        }
        return vvVar;
    }

    void m(DownloadInfo downloadInfo) {
        if (p(downloadInfo)) {
            u(downloadInfo.getId());
        }
    }

    public vv o(int i4) {
        vv vvVar;
        if (i4 == 0) {
            return null;
        }
        synchronized (this.f61305u) {
            vvVar = this.f61305u.get(i4);
        }
        return vvVar;
    }

    public void u(int i4) {
        i(i4);
        if (i4 != 0) {
            vv().p(i4);
        }
    }

    public void p(int i4) {
        Context ky = p.ky();
        if (ky == null || i4 == 0) {
            return;
        }
        try {
            Intent intent = new Intent(ky, DownloadNotificationService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i4);
            ky.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<vv> m() {
        SparseArray<vv> sparseArray;
        synchronized (this.f61305u) {
            sparseArray = this.f61305u;
        }
        return sparseArray;
    }

    public void vv(int i4) {
        DownloadInfo downloadInfo = Downloader.getInstance(p.ky()).getDownloadInfo(i4);
        if (downloadInfo == null) {
            return;
        }
        vv(downloadInfo);
        m(downloadInfo);
    }

    void vv(DownloadInfo downloadInfo) {
        k ns = p.ns();
        if (ns != null && downloadInfo.isDownloadOverStatus()) {
            downloadInfo.setNotificationVisibility(3);
            try {
                ns.vv(downloadInfo);
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
        }
    }

    public void vv(int i4, int i5, Notification notification) {
        Context ky = p.ky();
        if (ky == null || i4 == 0 || notification == null) {
            return;
        }
        if (i5 == 4) {
            synchronized (this.f61304m) {
                Long l4 = this.f61304m.get(Integer.valueOf(i4));
                long currentTimeMillis = System.currentTimeMillis();
                if (l4 != null && Math.abs(currentTimeMillis - l4.longValue()) < 1000) {
                    return;
                }
                this.f61304m.put(Integer.valueOf(i4), Long.valueOf(currentTimeMillis));
            }
        }
        try {
            Intent intent = new Intent(ky, DownloadNotificationService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY");
            intent.putExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", i5);
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i4);
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA", notification);
            ky.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void vv(vv vvVar) {
        if (vvVar == null) {
            return;
        }
        synchronized (this.f61305u) {
            this.f61305u.put(vvVar.vv(), vvVar);
        }
    }
}
