package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public abstract class vv {

    /* renamed from: i  reason: collision with root package name */
    private long f61306i;

    /* renamed from: m  reason: collision with root package name */
    private int f61307m;

    /* renamed from: n  reason: collision with root package name */
    private long f61308n;

    /* renamed from: o  reason: collision with root package name */
    private String f61309o;

    /* renamed from: p  reason: collision with root package name */
    private long f61310p;
    private int qv;

    /* renamed from: u  reason: collision with root package name */
    private int f61311u = 0;
    protected Notification vv;
    private boolean wv;

    public vv(int i4, String str) {
        this.f61307m = i4;
        this.f61309o = str;
    }

    public String i() {
        return this.f61309o;
    }

    public long m() {
        return this.f61310p;
    }

    public synchronized void n() {
        this.qv++;
    }

    public int o() {
        return this.f61311u;
    }

    public long p() {
        return this.f61306i;
    }

    public boolean qv() {
        return this.wv;
    }

    public long u() {
        if (this.f61308n == 0) {
            this.f61308n = System.currentTimeMillis();
        }
        return this.f61308n;
    }

    public abstract void vv(BaseException baseException, boolean z4);

    public void vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        this.f61307m = downloadInfo.getId();
        this.f61309o = downloadInfo.getTitle();
    }

    public void m(long j4) {
        this.f61306i = j4;
    }

    public int vv() {
        return this.f61307m;
    }

    public void vv(long j4) {
        this.f61310p = j4;
    }

    public void vv(int i4, BaseException baseException, boolean z4) {
        vv(i4, baseException, z4, false);
    }

    public void vv(int i4, BaseException baseException, boolean z4, boolean z5) {
        if (z5 || this.f61311u != i4) {
            this.f61311u = i4;
            vv(baseException, z4);
        }
    }

    public void vv(long j4, long j5) {
        this.f61310p = j4;
        this.f61306i = j5;
        this.f61311u = 4;
        vv((BaseException) null, false);
    }

    public void vv(Notification notification) {
        if (this.f61307m == 0 || notification == null) {
            return;
        }
        m.vv().vv(this.f61307m, this.f61311u, notification);
    }
}
