package com.join.mgps.dto;

import com.github.snowdream.android.app.downloader.DownloadTask;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class DownloadScanEvent implements Serializable {
    private String pkg;
    private int status;
    private DownloadTask task;

    public String getPkg() {
        return this.pkg;
    }

    public int getStatus() {
        return this.status;
    }

    public DownloadTask getTask() {
        return this.task;
    }

    public void setPkg(String str) {
        this.pkg = str;
    }

    public void setStatus(int i4) {
        this.status = i4;
    }

    public void setTask(DownloadTask downloadTask) {
        this.task = downloadTask;
    }
}
