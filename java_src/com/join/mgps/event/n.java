package com.join.mgps.event;

import com.github.snowdream.android.app.downloader.DownloadTask;
/* compiled from: DownloadTaskEvent.java */
/* loaded from: classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private DownloadTask f49920a;

    /* renamed from: b  reason: collision with root package name */
    private int f49921b;

    /* renamed from: c  reason: collision with root package name */
    private String f49922c;

    public n() {
        this.f49921b = 0;
    }

    public DownloadTask a() {
        return this.f49920a;
    }

    public String b() {
        return this.f49922c;
    }

    public int c() {
        return this.f49921b;
    }

    public void d(DownloadTask downloadTask) {
        this.f49920a = downloadTask;
    }

    public void e(String str) {
        this.f49922c = str;
    }

    public void f(int i4) {
        this.f49921b = i4;
    }

    public n(DownloadTask downloadTask, int i4) {
        this.f49921b = 0;
        this.f49920a = downloadTask;
        this.f49921b = i4;
    }

    public n(DownloadTask downloadTask, String str, int i4) {
        this.f49921b = 0;
        this.f49920a = downloadTask;
        this.f49921b = i4;
        this.f49922c = str;
    }
}
