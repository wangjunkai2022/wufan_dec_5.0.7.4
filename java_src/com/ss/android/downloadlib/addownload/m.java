package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
/* loaded from: classes5.dex */
public class m {
    private static volatile m vv;

    /* renamed from: m  reason: collision with root package name */
    private Handler f60492m = null;

    public static m vv() {
        if (vv == null) {
            synchronized (m.class) {
                if (vv == null) {
                    vv = new m();
                }
            }
        }
        return vv;
    }

    public boolean m() {
        return b.wv().optInt("forbid_invalidte_download_file_install", 0) == 1;
    }

    public void vv(Context context, DownloadInfo downloadInfo) {
        if (m() && downloadInfo != null) {
            try {
                File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                if (file.isFile() && file.exists()) {
                    file.delete();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (this.f60492m == null) {
                this.f60492m = new Handler(Looper.getMainLooper());
            }
            final String url = downloadInfo.getUrl();
            Downloader.getInstance(context).clearDownloadData(downloadInfo.getId());
            this.f60492m.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.m.1
                @Override // java.lang.Runnable
                public void run() {
                    b.p().vv(3, b.getContext(), null, "下载失败，请重试！", null, 0);
                    o vv2 = com.ss.android.downloadlib.n.vv().vv(url);
                    if (vv2 != null) {
                        vv2.n();
                    }
                }
            });
        }
    }
}
