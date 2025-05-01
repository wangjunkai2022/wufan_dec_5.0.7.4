package com.join.mgps.dto;

import com.github.snowdream.android.app.downloader.DownloadTask;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class DownloadArgs implements Serializable {
    private DownloadTask downloadTask;
    private int from = 0;
    private CollectionBeanSub gameInfo;
    private WebDiskInfo webDiskInfo;

    public DownloadArgs(DownloadTask downloadTask) {
        this.downloadTask = downloadTask;
    }

    public DownloadTask getDownloadTask() {
        return this.downloadTask;
    }

    public int getFrom() {
        return this.from;
    }

    public CollectionBeanSub getGameInfo() {
        return this.gameInfo;
    }

    public WebDiskInfo getWebDiskInfo() {
        return this.webDiskInfo;
    }

    public void setDownloadTask(DownloadTask downloadTask) {
        this.downloadTask = downloadTask;
    }

    public void setFrom(int i4) {
        this.from = i4;
    }

    public void setGameInfo(CollectionBeanSub collectionBeanSub) {
        this.gameInfo = collectionBeanSub;
    }

    public void setWebDiskInfo(WebDiskInfo webDiskInfo) {
        this.webDiskInfo = webDiskInfo;
    }

    public DownloadArgs() {
    }
}
