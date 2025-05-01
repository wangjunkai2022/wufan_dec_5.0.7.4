package com.ss.android.downloadlib;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.jh;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class qv {
    private static volatile qv vv;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.downloadad.api.vv f60702i;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.download.api.vv f60703m;

    /* renamed from: o  reason: collision with root package name */
    private com.ss.android.downloadad.api.m f60704o;

    /* renamed from: p  reason: collision with root package name */
    private final n f60705p;

    /* renamed from: u  reason: collision with root package name */
    private long f60706u;

    /* JADX INFO: Access modifiers changed from: private */
    public n qv() {
        return this.f60705p;
    }

    public com.ss.android.downloadad.api.vv i() {
        return this.f60702i;
    }

    public void n() {
        i.vv().o();
    }

    public com.ss.android.downloadad.api.m o() {
        if (this.f60704o == null) {
            this.f60704o = m.vv();
        }
        return this.f60704o;
    }

    public void p() {
        this.f60706u = System.currentTimeMillis();
    }

    public String u() {
        return b.t();
    }

    private qv(Context context) {
        this.f60705p = n.vv();
        this.f60703m = new o();
        this.f60706u = System.currentTimeMillis();
        m(context);
        this.f60702i = vv.vv();
    }

    private void m(Context context) {
        b.vv(context);
        Downloader.getInstance(b.getContext());
        com.ss.android.downloadlib.addownload.m.u.vv().m();
        com.ss.android.socialbase.appdownloader.i.k().vv(b.getContext(), "misc_config", new com.ss.android.downloadlib.p.n(), new com.ss.android.downloadlib.p.u(context), new p());
        com.ss.android.downloadlib.p.i iVar = new com.ss.android.downloadlib.p.i();
        com.ss.android.socialbase.appdownloader.i.k().vv(iVar);
        Downloader.getInstance(context).registerDownloadCacheSyncListener(iVar);
        com.ss.android.socialbase.appdownloader.i.k().vv(new jh());
        com.ss.android.socialbase.downloader.downloader.p.vv(new com.ss.android.downloadlib.p.o());
        com.ss.android.socialbase.appdownloader.i.k().vv(com.ss.android.downloadlib.u.p.vv());
    }

    public static qv vv(final Context context) {
        if (vv == null) {
            synchronized (qv.class) {
                if (vv == null) {
                    com.ss.android.downloadlib.o.m.vv(new Runnable() { // from class: com.ss.android.downloadlib.qv.1
                        @Override // java.lang.Runnable
                        public void run() {
                            qv unused = qv.vv = new qv(context);
                        }
                    });
                }
            }
        }
        return vv;
    }

    public com.ss.android.download.api.vv vv() {
        return this.f60703m;
    }

    public com.ss.android.download.api.vv vv(String str) {
        com.ss.android.download.api.config.u m4 = u.vv().m();
        if (m4 != null && m4.vv(str)) {
            return m4.m(str);
        }
        return this.f60703m;
    }

    public long m() {
        return this.f60706u;
    }

    public DownloadInfo m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.ss.android.socialbase.appdownloader.i.k().vv(b.getContext(), str);
    }

    @MainThread
    public void vv(final Context context, final int i4, final DownloadStatusChangeListener downloadStatusChangeListener, final DownloadModel downloadModel) {
        com.ss.android.downloadlib.o.m.vv(new Runnable() { // from class: com.ss.android.downloadlib.qv.4
            @Override // java.lang.Runnable
            public void run() {
                qv.this.qv().vv(context, i4, downloadStatusChangeListener, downloadModel);
            }
        });
    }

    @MainThread
    public void vv(final String str, final long j4, final int i4, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final OnItemClickListener onItemClickListener, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.o.m.vv(new Runnable() { // from class: com.ss.android.downloadlib.qv.5
            @Override // java.lang.Runnable
            public void run() {
                qv.this.qv().vv(str, j4, i4, downloadEventConfig, downloadController, onItemClickListener, iDownloadButtonClickListener);
            }
        });
    }

    @MainThread
    public void vv(final String str, final long j4, final int i4, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController) {
        com.ss.android.downloadlib.o.m.vv(new Runnable() { // from class: com.ss.android.downloadlib.qv.6
            @Override // java.lang.Runnable
            public void run() {
                qv.this.qv().vv(str, j4, i4, downloadEventConfig, downloadController);
            }
        });
    }

    @MainThread
    public void vv(final String str, final long j4, final int i4, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.o.m.vv(new Runnable() { // from class: com.ss.android.downloadlib.qv.7
            @Override // java.lang.Runnable
            public void run() {
                qv.this.qv().vv(str, j4, i4, downloadEventConfig, downloadController, iDownloadButtonClickListener);
            }
        });
    }

    @MainThread
    public void vv(final String str, final int i4) {
        com.ss.android.downloadlib.o.m.vv(new Runnable() { // from class: com.ss.android.downloadlib.qv.2
            @Override // java.lang.Runnable
            public void run() {
                qv.this.qv().vv(str, i4);
            }
        });
    }

    @MainThread
    public void vv(final String str, final boolean z4) {
        com.ss.android.downloadlib.o.m.vv(new Runnable() { // from class: com.ss.android.downloadlib.qv.3
            @Override // java.lang.Runnable
            public void run() {
                qv.this.qv().vv(str, z4);
            }
        });
    }

    public void vv(com.ss.android.download.api.download.vv.vv vvVar) {
        qv().vv(vvVar);
    }

    public DownloadInfo vv(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str2) && z4) {
            return m(str);
        }
        return Downloader.getInstance(b.getContext()).getDownloadInfo(str, str2);
    }
}
