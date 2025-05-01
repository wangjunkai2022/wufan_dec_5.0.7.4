package com.ss.android.socialbase.downloader.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.u;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.depend.ya;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.downloader.la;
import com.ss.android.socialbase.downloader.downloader.n;
import com.ss.android.socialbase.downloader.downloader.qv;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class DownloadTask {
    private boolean autoSetHashCodeForSameTask;
    private n chunkAdjustCalculator;
    private qv chunkStrategy;
    private t depend;
    private g diskSpaceHandler;
    private final List<r> downloadCompleteHandlers;
    private DownloadInfo downloadInfo;
    private DownloadInfo.vv downloadInfoBuilder;
    private IDownloadFileUriProvider fileUriProvider;
    private ya forbiddenHandler;
    private int hashCodeForSameTask;
    private IDownloadInterceptor interceptor;
    private final SparseArray<IDownloadListener> mainThreadListeners;
    private l monitorDepend;
    private boolean needDelayForCacheSync;
    private a notificationClickCallback;
    private vu notificationEventListener;
    private final SparseArray<IDownloadListener> notificationListeners;
    private la retryDelayTimeCalculator;
    private final SparseArray<u> singleListenerHashCodeMap;
    private final Map<u, IDownloadListener> singleListenerMap;
    private final SparseArray<IDownloadListener> subThreadListeners;

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadCompleteHandlers = new ArrayList();
        this.autoSetHashCodeForSameTask = true;
        this.downloadInfoBuilder = new DownloadInfo.vv();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null || sparseArray2 == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = sparseArray.keyAt(i4);
            sparseArray2.put(keyAt, sparseArray.get(keyAt));
        }
    }

    private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
        sparseArray.clear();
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            int keyAt = sparseArray2.keyAt(i4);
            IDownloadListener iDownloadListener = sparseArray2.get(keyAt);
            if (iDownloadListener != null) {
                sparseArray.put(keyAt, iDownloadListener);
            }
        }
    }

    private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null || sparseArray2 == null) {
            return;
        }
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseArray.remove(sparseArray2.keyAt(i4));
        }
    }

    private void setChunkCalculator() {
        if (this.downloadInfo.getThrottleNetSpeed() > 0) {
            chunkStategy(new qv() { // from class: com.ss.android.socialbase.downloader.model.DownloadTask.2
                @Override // com.ss.android.socialbase.downloader.downloader.qv
                public int vv(long j4) {
                    return 1;
                }
            });
        }
    }

    public DownloadTask addDownloadCompleteHandler(r rVar) {
        synchronized (this.downloadCompleteHandlers) {
            if (rVar != null) {
                if (!this.downloadCompleteHandlers.contains(rVar)) {
                    this.downloadCompleteHandlers.add(rVar);
                    return this;
                }
            }
            return this;
        }
    }

    public void addDownloadListener(int i4, IDownloadListener iDownloadListener, u uVar, boolean z4) {
        Map<u, IDownloadListener> map;
        if (iDownloadListener == null) {
            return;
        }
        if (z4 && (map = this.singleListenerMap) != null) {
            map.put(uVar, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i4, uVar);
            }
        }
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(uVar);
        if (downloadListeners == null) {
            return;
        }
        synchronized (downloadListeners) {
            downloadListeners.put(i4, iDownloadListener);
        }
    }

    public void addListenerToDownloadingSameTask() {
        com.ss.android.socialbase.downloader.p.vv.m("DownloadTask", "same task just tryDownloading, so add listener in last task instead of tryDownload");
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo != null && !downloadInfo.isAddListenerToSameTask()) {
            this.downloadInfo.setAddListenerToSameTask(true);
        }
        addListenerToDownloadingSameTask(u.MAIN);
        addListenerToDownloadingSameTask(u.SUB);
        com.ss.android.socialbase.downloader.i.vv.vv(this.monitorDepend, this.downloadInfo, new BaseException(1003, "has another same task, add Listener to old task"), 0);
    }

    public DownloadTask addListenerToSameTask(boolean z4) {
        this.downloadInfoBuilder.j(z4);
        return this;
    }

    public void asyncDownload(final j jVar) {
        com.ss.android.socialbase.downloader.qv.i.vv(new Runnable() { // from class: com.ss.android.socialbase.downloader.model.DownloadTask.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadTask.this.download();
            }
        });
    }

    public synchronized int autoCalAndGetHashCodeForSameTask() {
        IDownloadListener singleDownloadListener = getSingleDownloadListener(u.MAIN);
        if (singleDownloadListener == null) {
            singleDownloadListener = getSingleDownloadListener(u.SUB);
        }
        if (singleDownloadListener != null) {
            this.hashCodeForSameTask = singleDownloadListener.hashCode();
        }
        return this.hashCodeForSameTask;
    }

    public DownloadTask autoResumed(boolean z4) {
        this.downloadInfoBuilder.u(z4);
        return this;
    }

    public DownloadTask autoSetHashCodeForSameTask(boolean z4) {
        this.autoSetHashCodeForSameTask = z4;
        return this;
    }

    public DownloadTask backUpUrlRetryCount(int i4) {
        this.downloadInfoBuilder.p(i4);
        return this;
    }

    public DownloadTask backUpUrls(List<String> list) {
        this.downloadInfoBuilder.m(list);
        return this;
    }

    public boolean canShowNotification() {
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo != null) {
            return downloadInfo.canShowNotification();
        }
        return false;
    }

    public DownloadTask chunkAdjustCalculator(n nVar) {
        this.chunkAdjustCalculator = nVar;
        return this;
    }

    public DownloadTask chunkStategy(qv qvVar) {
        this.chunkStrategy = qvVar;
        return this;
    }

    public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
        this.chunkAdjustCalculator = downloadTask.chunkAdjustCalculator;
        this.chunkStrategy = downloadTask.chunkStrategy;
        this.singleListenerMap.clear();
        this.singleListenerMap.putAll(downloadTask.singleListenerMap);
        synchronized (this.mainThreadListeners) {
            this.mainThreadListeners.clear();
            addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
        }
        synchronized (this.subThreadListeners) {
            this.subThreadListeners.clear();
            addAll(downloadTask.subThreadListeners, this.subThreadListeners);
        }
        synchronized (this.notificationListeners) {
            this.notificationListeners.clear();
            addAll(downloadTask.notificationListeners, this.notificationListeners);
        }
        this.notificationEventListener = downloadTask.notificationEventListener;
        this.interceptor = downloadTask.interceptor;
        this.depend = downloadTask.depend;
        this.monitorDepend = downloadTask.monitorDepend;
        this.forbiddenHandler = downloadTask.forbiddenHandler;
        this.diskSpaceHandler = downloadTask.diskSpaceHandler;
        this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
        this.notificationClickCallback = downloadTask.notificationClickCallback;
        this.fileUriProvider = downloadTask.fileUriProvider;
        synchronized (this.downloadCompleteHandlers) {
            this.downloadCompleteHandlers.clear();
            this.downloadCompleteHandlers.addAll(downloadTask.downloadCompleteHandlers);
        }
    }

    public void copyListenerFromPendingTask(DownloadTask downloadTask) {
        for (Map.Entry<u, IDownloadListener> entry : downloadTask.singleListenerMap.entrySet()) {
            if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                this.singleListenerMap.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            if (downloadTask.mainThreadListeners.size() != 0) {
                synchronized (this.mainThreadListeners) {
                    removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                    addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                }
            }
            if (downloadTask.subThreadListeners.size() != 0) {
                synchronized (this.subThreadListeners) {
                    removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                    addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                }
            }
            if (downloadTask.notificationListeners.size() != 0) {
                synchronized (this.notificationListeners) {
                    removeAll(this.notificationListeners, downloadTask.notificationListeners);
                    addAll(downloadTask.notificationListeners, this.notificationListeners);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public DownloadTask deleteCacheIfCheckFailed(boolean z4) {
        this.downloadInfoBuilder.x(z4);
        return this;
    }

    public DownloadTask depend(t tVar) {
        this.depend = tVar;
        return this;
    }

    public DownloadTask diskSpaceHandler(g gVar) {
        this.diskSpaceHandler = gVar;
        return this;
    }

    public DownloadTask distinctDirectory(boolean z4) {
        this.downloadInfoBuilder.y(z4);
        return this;
    }

    public int download() {
        this.downloadInfo = this.downloadInfoBuilder.vv();
        DownloadInfo m4 = com.ss.android.socialbase.downloader.downloader.p.ns().m(this.downloadInfo.getId());
        if (m4 == null) {
            this.downloadInfo.generateTaskId();
            com.ss.android.socialbase.downloader.i.vv.vv(this, (BaseException) null, 0);
        } else {
            this.downloadInfo.copyTaskIdFromCacheData(m4);
        }
        setChunkCalculator();
        com.ss.android.socialbase.downloader.downloader.i.vv().vv(this);
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo == null) {
            return 0;
        }
        return downloadInfo.getId();
    }

    public DownloadTask downloadSetting(JSONObject jSONObject) {
        this.downloadInfoBuilder.vv(jSONObject);
        return this;
    }

    public DownloadTask enqueueType(EnqueueType enqueueType) {
        this.downloadInfoBuilder.vv(enqueueType);
        return this;
    }

    public DownloadTask executorGroup(int i4) {
        this.downloadInfoBuilder.u(i4);
        return this;
    }

    public DownloadTask expectFileLength(long j4) {
        this.downloadInfoBuilder.vv(j4);
        return this;
    }

    public DownloadTask expiredRedownload(boolean z4) {
        this.downloadInfoBuilder.la(z4);
        return this;
    }

    public DownloadTask extra(String str) {
        this.downloadInfoBuilder.n(str);
        return this;
    }

    public DownloadTask extraHeaders(List<p> list) {
        this.downloadInfoBuilder.vv(list);
        return this;
    }

    public DownloadTask extraMonitorStatus(int[] iArr) {
        this.downloadInfoBuilder.m(iArr);
        return this;
    }

    public DownloadTask fileUriProvider(IDownloadFileUriProvider iDownloadFileUriProvider) {
        this.fileUriProvider = iDownloadFileUriProvider;
        return this;
    }

    public DownloadTask forbiddenHandler(ya yaVar) {
        this.forbiddenHandler = yaVar;
        return this;
    }

    public DownloadTask force(boolean z4) {
        this.downloadInfoBuilder.m(z4);
        return this;
    }

    public n getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public qv getChunkStrategy() {
        return this.chunkStrategy;
    }

    public t getDepend() {
        return this.depend;
    }

    public g getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public r getDownloadCompleteHandlerByIndex(int i4) {
        synchronized (this.downloadCompleteHandlers) {
            if (i4 < this.downloadCompleteHandlers.size()) {
                return this.downloadCompleteHandlers.get(i4);
            }
            return null;
        }
    }

    @NonNull
    public List<r> getDownloadCompleteHandlers() {
        return this.downloadCompleteHandlers;
    }

    public int getDownloadId() {
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo == null) {
            return 0;
        }
        return downloadInfo.getId();
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public IDownloadListener getDownloadListenerByIndex(u uVar, int i4) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(uVar);
        if (downloadListeners == null || i4 < 0) {
            return null;
        }
        synchronized (downloadListeners) {
            if (i4 < downloadListeners.size()) {
                return downloadListeners.get(downloadListeners.keyAt(i4));
            }
            return null;
        }
    }

    public int getDownloadListenerSize(u uVar) {
        int size;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(uVar);
        if (downloadListeners == null) {
            return 0;
        }
        synchronized (downloadListeners) {
            size = downloadListeners.size();
        }
        return size;
    }

    public SparseArray<IDownloadListener> getDownloadListeners(u uVar) {
        if (uVar == u.MAIN) {
            return this.mainThreadListeners;
        }
        if (uVar == u.SUB) {
            return this.subThreadListeners;
        }
        if (uVar == u.NOTIFICATION) {
            return this.notificationListeners;
        }
        return null;
    }

    public IDownloadFileUriProvider getFileUriProvider() {
        return this.fileUriProvider;
    }

    public ya getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public int getHashCodeForSameTask() {
        return this.hashCodeForSameTask;
    }

    public IDownloadInterceptor getInterceptor() {
        return this.interceptor;
    }

    public l getMonitorDepend() {
        return this.monitorDepend;
    }

    public a getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public vu getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public la getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public IDownloadListener getSingleDownloadListener(u uVar) {
        return this.singleListenerMap.get(uVar);
    }

    public DownloadTask hashCodeForSameTask(int i4) {
        this.hashCodeForSameTask = i4;
        return this;
    }

    public DownloadTask headConnectionAvailable(boolean z4) {
        this.downloadInfoBuilder.r(z4);
        return this;
    }

    public DownloadTask iconUrl(String str) {
        this.downloadInfoBuilder.r(str);
        return this;
    }

    public DownloadTask ignoreDataVerify(boolean z4) {
        this.downloadInfoBuilder.t(z4);
        return this;
    }

    public DownloadTask interceptor(IDownloadInterceptor iDownloadInterceptor) {
        this.interceptor = iDownloadInterceptor;
        return this;
    }

    public boolean isAutoSetHashCodeForSameTask() {
        return this.autoSetHashCodeForSameTask;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public DownloadTask isOpenLimitSpeed(boolean z4) {
        this.downloadInfoBuilder.g(z4);
        return this;
    }

    public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
        return iDownloadListener == null ? this : mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask mainThreadListenerWithHashCode(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.mainThreadListeners) {
                this.mainThreadListeners.put(i4, iDownloadListener);
            }
            Map<u, IDownloadListener> map = this.singleListenerMap;
            u uVar = u.MAIN;
            map.put(uVar, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i4, uVar);
            }
        }
        return this;
    }

    public DownloadTask maxBytes(int i4) {
        this.downloadInfoBuilder.vv(i4);
        return this;
    }

    public DownloadTask maxProgressCount(int i4) {
        this.downloadInfoBuilder.i(i4);
        return this;
    }

    public DownloadTask md5(String str) {
        this.downloadInfoBuilder.k(str);
        return this;
    }

    public DownloadTask mimeType(String str) {
        this.downloadInfoBuilder.qv(str);
        return this;
    }

    public DownloadTask minProgressTimeMsInterval(int i4) {
        this.downloadInfoBuilder.o(i4);
        return this;
    }

    public DownloadTask monitorDepend(l lVar) {
        this.monitorDepend = lVar;
        return this;
    }

    public DownloadTask monitorScene(String str) {
        this.downloadInfoBuilder.jh(str);
        return this;
    }

    public DownloadTask name(String str) {
        this.downloadInfoBuilder.vv(str);
        return this;
    }

    public DownloadTask needChunkDowngradeRetry(boolean z4) {
        this.downloadInfoBuilder.q(z4);
        return this;
    }

    public DownloadTask needDefaultHttpServiceBackUp(boolean z4) {
        this.downloadInfoBuilder.qv(z4);
        return this;
    }

    public DownloadTask needHttpsToHttpRetry(boolean z4) {
        this.downloadInfoBuilder.i(z4);
        return this;
    }

    public DownloadTask needIndependentProcess(boolean z4) {
        this.downloadInfoBuilder.jh(z4);
        return this;
    }

    public DownloadTask needPostProgress(boolean z4) {
        this.downloadInfoBuilder.p(z4);
        return this;
    }

    public DownloadTask needRetryDelay(boolean z4) {
        this.downloadInfoBuilder.k(z4);
        return this;
    }

    public DownloadTask needReuseChunkRunnable(boolean z4) {
        this.downloadInfoBuilder.wv(z4);
        return this;
    }

    public DownloadTask needReuseFirstConnection(boolean z4) {
        this.downloadInfoBuilder.b(z4);
        return this;
    }

    public DownloadTask needSDKMonitor(boolean z4) {
        this.downloadInfoBuilder.d(z4);
        return this;
    }

    @Deprecated
    public DownloadTask newSaveTempFileEnable(boolean z4) {
        return this;
    }

    public DownloadTask notificationClickCallback(a aVar) {
        this.notificationClickCallback = aVar;
        return this;
    }

    public DownloadTask notificationEventListener(vu vuVar) {
        this.notificationEventListener = vuVar;
        return this;
    }

    public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
        return iDownloadListener == null ? this : notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask notificationListenerWithHashCode(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.notificationListeners) {
                this.notificationListeners.put(i4, iDownloadListener);
            }
            Map<u, IDownloadListener> map = this.singleListenerMap;
            u uVar = u.NOTIFICATION;
            map.put(uVar, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i4, uVar);
            }
        }
        return this;
    }

    public DownloadTask onlyWifi(boolean z4) {
        this.downloadInfoBuilder.vv(z4);
        return this;
    }

    public DownloadTask outIp(String[] strArr) {
        this.downloadInfoBuilder.vv(strArr);
        return this;
    }

    public DownloadTask outSize(int[] iArr) {
        this.downloadInfoBuilder.vv(iArr);
        return this;
    }

    public DownloadTask packageName(String str) {
        this.downloadInfoBuilder.wv(str);
        return this;
    }

    public void removeDownloadListener(int i4, IDownloadListener iDownloadListener, u uVar, boolean z4) {
        int indexOfValue;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(uVar);
        if (downloadListeners == null) {
            if (z4 && this.singleListenerMap.containsKey(uVar)) {
                this.singleListenerMap.remove(uVar);
                return;
            }
            return;
        }
        synchronized (downloadListeners) {
            if (z4) {
                if (this.singleListenerMap.containsKey(uVar)) {
                    iDownloadListener = this.singleListenerMap.get(uVar);
                    this.singleListenerMap.remove(uVar);
                }
                if (iDownloadListener != null && (indexOfValue = downloadListeners.indexOfValue(iDownloadListener)) >= 0 && indexOfValue < downloadListeners.size()) {
                    downloadListeners.removeAt(indexOfValue);
                }
            } else {
                downloadListeners.remove(i4);
                synchronized (this.singleListenerHashCodeMap) {
                    u uVar2 = this.singleListenerHashCodeMap.get(i4);
                    if (uVar2 != null && this.singleListenerMap.containsKey(uVar2)) {
                        this.singleListenerMap.remove(uVar2);
                        this.singleListenerHashCodeMap.remove(i4);
                    }
                }
            }
        }
    }

    public DownloadTask retryCount(int i4) {
        this.downloadInfoBuilder.m(i4);
        return this;
    }

    public DownloadTask retryDelayTimeArray(String str) {
        this.downloadInfoBuilder.b(str);
        return this;
    }

    public DownloadTask retryDelayTimeCalculator(la laVar) {
        this.retryDelayTimeCalculator = laVar;
        return this;
    }

    public DownloadTask savePath(String str) {
        this.downloadInfoBuilder.o(str);
        return this;
    }

    public DownloadTask setAutoInstall(boolean z4) {
        this.downloadInfoBuilder.v(z4);
        return this;
    }

    public DownloadTask setDownloadCompleteHandlers(List<r> list) {
        if (list != null && !list.isEmpty()) {
            for (r rVar : list) {
                addDownloadCompleteHandler(rVar);
            }
        }
        return this;
    }

    public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, u uVar) {
        if (sparseArray == null) {
            return;
        }
        try {
            if (uVar == u.MAIN) {
                synchronized (this.mainThreadListeners) {
                    copyListeners(this.mainThreadListeners, sparseArray);
                }
            } else if (uVar == u.SUB) {
                synchronized (this.subThreadListeners) {
                    copyListeners(this.subThreadListeners, sparseArray);
                }
            } else if (uVar == u.NOTIFICATION) {
                synchronized (this.notificationListeners) {
                    copyListeners(this.notificationListeners, sparseArray);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setNeedDelayForCacheSync(boolean z4) {
        this.needDelayForCacheSync = z4;
    }

    public void setNotificationEventListener(vu vuVar) {
        this.notificationEventListener = vuVar;
    }

    public DownloadTask showNotification(boolean z4) {
        this.downloadInfoBuilder.o(z4);
        return this;
    }

    public DownloadTask showNotificationForAutoResumed(boolean z4) {
        this.downloadInfoBuilder.n(z4);
        return this;
    }

    public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
        return iDownloadListener == null ? this : subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask subThreadListenerWithHashCode(int i4, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.subThreadListeners) {
                this.subThreadListeners.put(i4, iDownloadListener);
            }
            Map<u, IDownloadListener> map = this.singleListenerMap;
            u uVar = u.SUB;
            map.put(uVar, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i4, uVar);
            }
        }
        return this;
    }

    public DownloadTask taskKey(String str) {
        this.downloadInfoBuilder.i(str);
        return this;
    }

    public DownloadTask tempPath(String str) {
        this.downloadInfoBuilder.u(str);
        return this;
    }

    public DownloadTask throttleNetSpeed(long j4) {
        this.downloadInfoBuilder.m(j4);
        return this;
    }

    public DownloadTask title(String str) {
        this.downloadInfoBuilder.m(str);
        return this;
    }

    public DownloadTask ttnetProtectTimeout(long j4) {
        this.downloadInfoBuilder.p(j4);
        return this;
    }

    public DownloadTask url(String str) {
        this.downloadInfoBuilder.p(str);
        return this;
    }

    private void addListenerToDownloadingSameTask(u uVar) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(uVar);
        synchronized (downloadListeners) {
            for (int i4 = 0; i4 < downloadListeners.size(); i4++) {
                IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i4));
                if (iDownloadListener != null) {
                    com.ss.android.socialbase.downloader.downloader.i.vv().m(getDownloadId(), iDownloadListener, uVar, false);
                }
            }
        }
    }

    public DownloadTask(DownloadInfo downloadInfo) {
        this();
        this.downloadInfo = downloadInfo;
    }
}
