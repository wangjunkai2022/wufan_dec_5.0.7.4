package com.join.mgps.business;

import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.dto.CollectionBeanSub;
/* loaded from: classes4.dex */
public class CollectionBeanSubBusiness extends CollectionBeanSub {

    /* renamed from: b  reason: collision with root package name */
    private DownloadTask f46281b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46282c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46283d;

    public CollectionBeanSubBusiness() {
    }

    public boolean a() {
        return this.f46283d;
    }

    public void b(boolean z4) {
        this.f46283d = z4;
    }

    public DownloadTask getDownloadTask() {
        return this.f46281b;
    }

    public boolean isHasExposure() {
        return this.f46282c;
    }

    public void setDownloadTask(DownloadTask downloadTask) {
        this.f46281b = downloadTask;
    }

    public void setHasExposure(boolean z4) {
        this.f46282c = z4;
    }

    public CollectionBeanSubBusiness(CollectionBeanSub collectionBeanSub) {
        super(collectionBeanSub);
        setPosition_path(collectionBeanSub.getPosition_path());
    }

    public CollectionBeanSubBusiness(DownloadTask downloadTask) {
        this.f46281b = downloadTask;
    }
}
