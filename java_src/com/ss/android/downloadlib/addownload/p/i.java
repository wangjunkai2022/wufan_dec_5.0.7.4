package com.ss.android.downloadlib.addownload.p;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public class i {
    private static volatile i vv;

    /* renamed from: m  reason: collision with root package name */
    private long f60566m = 0;

    /* renamed from: p  reason: collision with root package name */
    private ConcurrentHashMap<String, o> f60568p = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private HashMap<String, Integer> f60565i = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private List<String> f60567o = new CopyOnWriteArrayList();

    public static i vv() {
        if (vv == null) {
            synchronized (i.class) {
                if (vv == null) {
                    vv = new i();
                }
            }
        }
        return vv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m() {
        return this.f60566m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        this.f60566m = System.currentTimeMillis();
    }

    public int m(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (this.f60565i == null) {
            this.f60565i = new HashMap<>();
        }
        if (this.f60565i.containsKey(str)) {
            return this.f60565i.get(str).intValue();
        }
        return 0;
    }

    public void vv(String str, o oVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f60568p.put(str, oVar);
    }

    public void vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f60568p.remove(str);
    }

    @WorkerThread
    public static void vv(com.ss.android.downloadad.api.vv.m mVar) {
        DownloadInfo downloadInfo;
        if (mVar == null || mVar.m() <= 0 || (downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(mVar.la())) == null) {
            return;
        }
        vv(downloadInfo);
    }

    @WorkerThread
    public static void vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null || com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("delete_file_after_install", 0) == 0) {
            return;
        }
        try {
            String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                file.delete();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
