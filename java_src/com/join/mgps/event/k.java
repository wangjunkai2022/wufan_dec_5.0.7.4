package com.join.mgps.event;

import com.github.snowdream.android.app.downloader.DownloadTask;
/* compiled from: DownloadEvent.java */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private DownloadTask f49915a;

    /* renamed from: b  reason: collision with root package name */
    private int f49916b;

    public k(DownloadTask downloadTask, int i4) {
        this.f49915a = downloadTask;
        this.f49916b = i4;
    }

    public DownloadTask a() {
        return this.f49915a;
    }

    public void b(DownloadTask downloadTask) {
        this.f49915a = downloadTask;
    }

    public void c(int i4) {
        this.f49916b = i4;
    }

    public int getType() {
        return this.f49916b;
    }
}
