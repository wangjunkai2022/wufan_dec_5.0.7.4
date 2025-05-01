package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.ff;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* loaded from: classes5.dex */
public class DownloaderBuilder {
    private n chunkAdjustCalculator;
    private qv chunkCntCalculator;
    private ExecutorService chunkDownloadExecutor;
    private final Context context;
    private ExecutorService cpuThreadExecutor;
    private ExecutorService dbThreadExecutor;
    private k downloadCache;
    private com.ss.android.socialbase.downloader.network.u downloadDns;
    private boolean downloadInMultiProcess;
    private jh downloadLaunchHandler;
    private com.ss.android.socialbase.downloader.i.m downloadMonitorListener;
    private ff downloadSetting;
    private com.ss.android.socialbase.downloader.network.qv headHttpService;
    private IDownloadHttpService httpService;
    private b idGenerator;
    private ExecutorService ioThreadExecutor;
    private int maxDownloadPoolSize;
    private ExecutorService mixApkDownloadExecutor;
    private ExecutorService mixDefaultDownloadExecutor;
    private ExecutorService mixFrequentDownloadExecutor;
    private d monitorConfig;
    private a notificationClickCallback;
    private ExecutorService okHttpDispatcherExecutor;
    private y ttNetHandler;
    private int writeBufferSize;
    private List<com.ss.android.socialbase.downloader.depend.r> downloadCompleteHandlers = new ArrayList();
    private boolean needAutoRefreshUnSuccessTask = true;
    private int downloadExpSwitch = 1056964607;

    public DownloaderBuilder(Context context) {
        this.context = context;
    }

    public DownloaderBuilder addDownloadCompleteHandler(com.ss.android.socialbase.downloader.depend.r rVar) {
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

    public Downloader build() {
        return new Downloader(this);
    }

    public DownloaderBuilder chunkAdjustCalculator(n nVar) {
        this.chunkAdjustCalculator = nVar;
        return this;
    }

    public DownloaderBuilder chunkCntCalculator(qv qvVar) {
        this.chunkCntCalculator = qvVar;
        return this;
    }

    public DownloaderBuilder chunkThreadExecutor(ExecutorService executorService) {
        this.chunkDownloadExecutor = executorService;
        return this;
    }

    public DownloaderBuilder cpuThreadExecutor(ExecutorService executorService) {
        this.cpuThreadExecutor = executorService;
        return this;
    }

    public DownloaderBuilder dbThreadExecutor(ExecutorService executorService) {
        this.dbThreadExecutor = executorService;
        return this;
    }

    public DownloaderBuilder downloadCache(k kVar) {
        this.downloadCache = kVar;
        return this;
    }

    public DownloaderBuilder downloadDns(com.ss.android.socialbase.downloader.network.u uVar) {
        this.downloadDns = uVar;
        return this;
    }

    public DownloaderBuilder downloadExpSwitch(int i4) {
        this.downloadExpSwitch = i4;
        return this;
    }

    public DownloaderBuilder downloadInMultiProcess(boolean z4) {
        this.downloadInMultiProcess = z4;
        return this;
    }

    public DownloaderBuilder downloadLaunchHandler(jh jhVar) {
        this.downloadLaunchHandler = jhVar;
        return this;
    }

    public DownloaderBuilder downloadMonitorListener(com.ss.android.socialbase.downloader.i.m mVar) {
        this.downloadMonitorListener = mVar;
        return this;
    }

    public DownloaderBuilder downloadSetting(ff ffVar) {
        this.downloadSetting = ffVar;
        return this;
    }

    public ExecutorService getCPUThreadExecutor() {
        return this.cpuThreadExecutor;
    }

    public n getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public qv getChunkCntCalculator() {
        return this.chunkCntCalculator;
    }

    public ExecutorService getChunkThreadExecutor() {
        return this.chunkDownloadExecutor;
    }

    public Context getContext() {
        return this.context;
    }

    public ExecutorService getDBThreadExecutor() {
        return this.dbThreadExecutor;
    }

    public k getDownloadCache() {
        return this.downloadCache;
    }

    public List<com.ss.android.socialbase.downloader.depend.r> getDownloadCompleteHandlers() {
        return this.downloadCompleteHandlers;
    }

    public com.ss.android.socialbase.downloader.network.u getDownloadDns() {
        return this.downloadDns;
    }

    public int getDownloadExpSwitch() {
        return this.downloadExpSwitch;
    }

    public jh getDownloadLaunchHandler() {
        return this.downloadLaunchHandler;
    }

    public com.ss.android.socialbase.downloader.i.m getDownloadMonitorListener() {
        return this.downloadMonitorListener;
    }

    public ff getDownloadSetting() {
        return this.downloadSetting;
    }

    public com.ss.android.socialbase.downloader.network.qv getHeadHttpService() {
        return this.headHttpService;
    }

    public IDownloadHttpService getHttpService() {
        return this.httpService;
    }

    public ExecutorService getIOThreadExecutor() {
        return this.ioThreadExecutor;
    }

    public b getIdGenerator() {
        return this.idGenerator;
    }

    public int getMaxDownloadPoolSize() {
        return this.maxDownloadPoolSize;
    }

    public ExecutorService getMixApkDownloadExecutor() {
        return this.mixApkDownloadExecutor;
    }

    public ExecutorService getMixDefaultDownloadExecutor() {
        return this.mixDefaultDownloadExecutor;
    }

    public ExecutorService getMixFrequentDownloadExecutor() {
        return this.mixFrequentDownloadExecutor;
    }

    public d getMonitorConfig() {
        return this.monitorConfig;
    }

    public a getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public ExecutorService getOkHttpDispatcherExecutor() {
        return this.okHttpDispatcherExecutor;
    }

    public y getTTNetHandler() {
        return this.ttNetHandler;
    }

    public int getWriteBufferSize() {
        return this.writeBufferSize;
    }

    public DownloaderBuilder headHttpService(com.ss.android.socialbase.downloader.network.qv qvVar) {
        this.headHttpService = qvVar;
        return this;
    }

    public DownloaderBuilder httpService(IDownloadHttpService iDownloadHttpService) {
        this.httpService = iDownloadHttpService;
        return this;
    }

    public DownloaderBuilder idGenerator(b bVar) {
        this.idGenerator = bVar;
        return this;
    }

    public DownloaderBuilder ioThreadExecutor(ExecutorService executorService) {
        this.ioThreadExecutor = executorService;
        return this;
    }

    public boolean isDownloadInMultiProcess() {
        return this.downloadInMultiProcess;
    }

    public DownloaderBuilder maxDownloadPoolSize(int i4) {
        this.maxDownloadPoolSize = i4;
        return this;
    }

    public DownloaderBuilder mixApkDownloadExecutor(ExecutorService executorService) {
        this.mixApkDownloadExecutor = executorService;
        return this;
    }

    public DownloaderBuilder mixDefaultDownloadExecutor(ExecutorService executorService) {
        this.mixDefaultDownloadExecutor = executorService;
        return this;
    }

    public DownloaderBuilder mixFrequentDownloadExecutor(ExecutorService executorService) {
        this.mixFrequentDownloadExecutor = executorService;
        return this;
    }

    public DownloaderBuilder monitorConfig(d dVar) {
        this.monitorConfig = dVar;
        return this;
    }

    public DownloaderBuilder needAutoRefreshUnSuccessTask(boolean z4) {
        this.needAutoRefreshUnSuccessTask = z4;
        return this;
    }

    public DownloaderBuilder notificationClickCallback(a aVar) {
        this.notificationClickCallback = aVar;
        return this;
    }

    public DownloaderBuilder okHttpDispatcherExecutor(ExecutorService executorService) {
        this.okHttpDispatcherExecutor = executorService;
        return this;
    }

    public DownloaderBuilder ttNetHandler(y yVar) {
        this.ttNetHandler = yVar;
        return this;
    }

    public DownloaderBuilder writeBufferSize(int i4) {
        this.writeBufferSize = i4;
        return this;
    }

    public boolean needAutoRefreshUnSuccessTask() {
        return this.needAutoRefreshUnSuccessTask;
    }
}
