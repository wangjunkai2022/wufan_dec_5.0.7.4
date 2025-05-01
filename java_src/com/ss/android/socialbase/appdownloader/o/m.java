package com.ss.android.socialbase.appdownloader.o;

import android.content.Context;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class m extends com.ss.android.socialbase.downloader.depend.i {

    /* renamed from: i  reason: collision with root package name */
    private String f60827i;

    /* renamed from: m  reason: collision with root package name */
    private int f60828m;

    /* renamed from: n  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.notification.vv f60829n;

    /* renamed from: o  reason: collision with root package name */
    private String f60830o;

    /* renamed from: p  reason: collision with root package name */
    private String f60831p;

    /* renamed from: u  reason: collision with root package name */
    private String f60832u;
    private Context vv;

    public m(Context context, int i4, String str, String str2, String str3, String str4) {
        if (context != null) {
            this.vv = context.getApplicationContext();
        } else {
            this.vv = com.ss.android.socialbase.downloader.downloader.p.ky();
        }
        this.f60828m = i4;
        this.f60831p = str;
        this.f60827i = str2;
        this.f60830o = str3;
        this.f60832u = str4;
    }

    @Override // com.ss.android.socialbase.downloader.depend.i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo == null || this.vv == null || !downloadInfo.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onFailed(downloadInfo, baseException);
    }

    @Override // com.ss.android.socialbase.downloader.depend.i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onPause(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onPrepare(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onProgress(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onStart(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.i, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo == null || this.vv == null) {
            return;
        }
        if (downloadInfo.canShowNotification() && (!downloadInfo.isAutoInstallWithoutNotification() || !downloadInfo.isAutoInstall())) {
            super.onSuccessed(downloadInfo);
        }
        if (downloadInfo.isAutoInstall()) {
            com.ss.android.socialbase.appdownloader.u.m.vv(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.i
    public com.ss.android.socialbase.downloader.notification.vv vv() {
        Context context;
        com.ss.android.socialbase.downloader.notification.vv vvVar = this.f60829n;
        return (vvVar != null || (context = this.vv) == null) ? vvVar : new vv(context, this.f60828m, this.f60831p, this.f60827i, this.f60830o, this.f60832u);
    }

    public m(com.ss.android.socialbase.downloader.notification.vv vvVar) {
        this.vv = com.ss.android.socialbase.downloader.downloader.p.ky();
        this.f60829n = vvVar;
    }
}
