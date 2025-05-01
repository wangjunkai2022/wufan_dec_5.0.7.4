package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.td;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class m {
    private String globalDefaultSavePath;
    private String globalDefaultSaveTempPath;

    public static DownloadTask with(Context context) {
        Downloader.getInstance(context);
        return new DownloadTask();
    }

    public void addMainThreadListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().m(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.MAIN, false);
    }

    public void addNotificationListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().m(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.NOTIFICATION, false);
    }

    public void addSubThreadListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().m(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.SUB, false);
    }

    public boolean canResume(int i4) {
        return i.vv().o(i4);
    }

    public void cancel(int i4) {
        cancel(i4, true);
    }

    public void clearDownloadData(int i4) {
        i.vv().i(i4, true);
    }

    public void destoryDownloader() {
        p.vv();
    }

    public void forceDownloadIngoreRecommendSize(int i4) {
        i.vv().t(i4);
    }

    public List<DownloadInfo> getAllDownloadInfo() {
        return i.vv().o();
    }

    public long getCurBytes(int i4) {
        return i.vv().qv(i4);
    }

    public IDownloadFileUriProvider getDownloadFileUriProvider(int i4) {
        return i.vv().g(i4);
    }

    public int getDownloadId(String str, String str2) {
        return i.vv().vv(str, str2);
    }

    public DownloadInfo getDownloadInfo(int i4) {
        return i.vv().b(i4);
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        return i.vv().vv(str);
    }

    public vu getDownloadNotificationEventListener(int i4) {
        return i.vv().jh(i4);
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        return i.vv().o(str);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        return i.vv().m(str);
    }

    public File getGlobalSaveDir() {
        return getGlobalSaveDir(this.globalDefaultSavePath, true);
    }

    public File getGlobalSaveTempDir() {
        return getGlobalSaveDir(this.globalDefaultSaveTempPath, false);
    }

    public g getReserveWifiStatusListener() {
        return p.fo();
    }

    public int getStatus(int i4) {
        return i.vv().wv(i4);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return i.vv().p(str);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return i.vv().i(str);
    }

    public boolean isDownloadCacheSyncSuccess() {
        return i.vv().u();
    }

    public boolean isDownloadServiceForeground(int i4) {
        return i.vv().p(i4).m();
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return i.vv().vv(downloadInfo);
    }

    public boolean isDownloading(int i4) {
        boolean k4;
        if (com.ss.android.socialbase.downloader.wv.vv.vv(4194304)) {
            synchronized (this) {
                k4 = i.vv().k(i4);
            }
            return k4;
        }
        return i.vv().k(i4);
    }

    public boolean isHttpServiceInit() {
        return i.vv().i();
    }

    public void pause(int i4) {
        i.vv().i(i4);
    }

    public void pauseAll() {
        i.vv().p();
    }

    public void registerDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.b bVar) {
        i.vv().vv(bVar);
    }

    public void registerDownloaderProcessConnectedListener(td tdVar) {
        i.vv().vv(tdVar);
    }

    public void removeMainThreadListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().vv(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.MAIN, false);
    }

    public void removeNotificationListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().vv(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.NOTIFICATION, false);
    }

    public void removeSubThreadListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().vv(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.SUB, false);
    }

    @Deprecated
    public void removeTaskMainListener(int i4) {
        i.vv().vv(i4, null, com.ss.android.socialbase.downloader.constants.u.MAIN, true);
    }

    @Deprecated
    public void removeTaskNotificationListener(int i4) {
        i.vv().vv(i4, null, com.ss.android.socialbase.downloader.constants.u.NOTIFICATION, true);
    }

    @Deprecated
    public void removeTaskSubListener(int i4) {
        i.vv().vv(i4, null, com.ss.android.socialbase.downloader.constants.u.SUB, true);
    }

    public void restart(int i4) {
        i.vv().n(i4);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        i.vv().vv(list);
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        i.vv().m(list);
    }

    public void resume(int i4) {
        i.vv().u(i4);
    }

    public void setDefaultSavePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.globalDefaultSavePath = str;
    }

    public void setDefaultSaveTempPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.globalDefaultSaveTempPath = str;
    }

    public void setDownloadInMultiProcess() {
        if (com.ss.android.socialbase.downloader.wv.vv.vv(4194304)) {
            synchronized (this) {
                p.m();
            }
            return;
        }
        p.m();
    }

    public void setDownloadNotificationEventListener(int i4, vu vuVar) {
        i.vv().vv(i4, vuVar);
    }

    public void setLogLevel(int i4) {
        i.vv().j(i4);
    }

    @Deprecated
    public void setMainThreadListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().m(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.MAIN, true);
    }

    @Deprecated
    public void setNotificationListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().m(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.NOTIFICATION, true);
    }

    public void setReserveWifiStatusListener(g gVar) {
        p.vv(gVar);
    }

    @Deprecated
    public void setSubThreadListener(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().m(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.SUB, true);
    }

    public void setThrottleNetSpeed(int i4, long j4) {
        i.vv().vv(i4, j4);
    }

    public void unRegisterDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.b bVar) {
        i.vv().m(bVar);
    }

    public void unRegisterDownloaderProcessConnectedListener(td tdVar) {
        i.vv().m(tdVar);
    }

    private File getGlobalSaveDir(String str, boolean z4) {
        File file = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file2 = new File(str);
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                } else if (!file2.isDirectory()) {
                    if (!z4) {
                        return null;
                    }
                    file2.delete();
                    file2.mkdirs();
                }
                return file2;
            } catch (Throwable unused) {
                file = file2;
                return file;
            }
        } catch (Throwable unused2) {
        }
    }

    public void cancel(int i4, boolean z4) {
        i.vv().p(i4, z4);
    }

    public void clearDownloadData(int i4, boolean z4) {
        i.vv().i(i4, z4);
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        return i.vv().m(str, str2);
    }

    @Deprecated
    public void setMainThreadListener(int i4, IDownloadListener iDownloadListener, boolean z4) {
        if (iDownloadListener == null) {
            return;
        }
        i.vv().vv(i4, iDownloadListener, com.ss.android.socialbase.downloader.constants.u.MAIN, true, z4);
    }
}
