package com.join.mgps.business;

import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.dto.AppBean;
/* loaded from: classes4.dex */
public class AppBeanBusiness extends AppBean {

    /* renamed from: b  reason: collision with root package name */
    private DownloadTask f46280b;

    public AppBeanBusiness(DownloadTask downloadTask) {
        this.f46280b = downloadTask;
    }

    @Override // com.join.mgps.dto.AppBean
    public DownloadTask getDownloadTask() {
        return this.f46280b;
    }

    @Override // com.join.mgps.dto.AppBean
    public void setDownloadTask(DownloadTask downloadTask) {
        this.f46280b = downloadTask;
    }
}
