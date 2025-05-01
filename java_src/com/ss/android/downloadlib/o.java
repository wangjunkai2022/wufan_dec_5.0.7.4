package com.ss.android.downloadlib;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.d;
import com.ss.android.download.api.config.jh;
import com.ss.android.download.api.config.k;
import com.ss.android.download.api.config.wv;
import com.ss.android.download.api.config.y;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.vv.vv;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class o implements com.ss.android.download.api.vv {
    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(@NonNull wv wvVar) {
        b.vv(wvVar);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(@NonNull com.ss.android.download.api.config.n nVar) {
        b.vv(nVar);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(@NonNull jh jhVar) {
        b.vv(jhVar);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(@NonNull com.ss.android.download.api.config.qv qvVar) {
        b.vv(qvVar);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(@NonNull k kVar) {
        b.vv(kVar);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(@NonNull com.ss.android.download.api.model.vv vvVar) {
        b.vv(vvVar);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(String str) {
        b.vv(str);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(@NonNull final com.ss.android.download.api.config.m mVar) {
        b.vv(mVar);
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(new vv.p() { // from class: com.ss.android.downloadlib.o.1
        });
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(DownloaderBuilder downloaderBuilder) {
        if (downloaderBuilder.getNotificationClickCallback() == null) {
            downloaderBuilder.notificationClickCallback(new a() { // from class: com.ss.android.downloadlib.o.2
                private boolean i(DownloadInfo downloadInfo) {
                    String vv;
                    y la = b.la();
                    if (la != null) {
                        com.ss.android.downloadad.api.vv.m vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
                        if (vv2 != null && vv2.p()) {
                            vv = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("ad_notification_jump_url", (String) null);
                        } else {
                            vv = com.ss.android.downloadlib.addownload.wv.vv(downloadInfo);
                        }
                        if (TextUtils.isEmpty(vv)) {
                            return false;
                        }
                        return la.vv(b.getContext(), vv);
                    }
                    return false;
                }

                @Override // com.ss.android.socialbase.downloader.depend.a
                public boolean m(DownloadInfo downloadInfo) {
                    return false;
                }

                @Override // com.ss.android.socialbase.downloader.depend.a
                public boolean p(DownloadInfo downloadInfo) {
                    if (downloadInfo == null) {
                        return false;
                    }
                    com.ss.android.downloadad.api.vv.m vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
                    if (vv != null) {
                        com.ss.android.downloadlib.m.vv.vv(vv);
                    } else {
                        com.ss.android.downloadlib.n.wv.m(b.getContext(), downloadInfo.getPackageName());
                    }
                    com.ss.android.socialbase.downloader.notification.m.vv().u(downloadInfo.getId());
                    return true;
                }

                @Override // com.ss.android.socialbase.downloader.depend.a
                public boolean vv(DownloadInfo downloadInfo) {
                    com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
                    if (vv.m("notification_opt_2") == 1) {
                        if (downloadInfo.getStatus() == -2) {
                            DownloadHandlerService.vv(b.getContext(), downloadInfo, com.ss.android.socialbase.appdownloader.i.k().m(), Downloader.getInstance(b.getContext()).getDownloadNotificationEventListener(downloadInfo.getId()));
                        }
                        return true;
                    }
                    boolean i4 = i(downloadInfo);
                    if (vv.vv("disable_delete_dialog", 0) == 1) {
                        return true;
                    }
                    return i4;
                }
            });
        }
        downloaderBuilder.addDownloadCompleteHandler(new com.ss.android.downloadlib.p.p());
        Downloader.initOrCover(downloaderBuilder, true);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public com.ss.android.download.api.vv vv(d dVar) {
        b.vv(dVar);
        return this;
    }

    @Override // com.ss.android.download.api.vv
    public void vv() {
        if (!b.ya()) {
            com.ss.android.downloadlib.o.p.vv().vv("ttdownloader init error");
        }
        b.vv(com.ss.android.downloadlib.o.p.vv());
        try {
            com.ss.android.socialbase.appdownloader.i.k().m(b.v());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.appdownloader.i.k().vv(vv.vv());
        i.vv().m(new Runnable() { // from class: com.ss.android.downloadlib.o.3
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.appdownloader.u.o.vv("");
                if (com.ss.android.socialbase.appdownloader.u.o.q()) {
                    com.ss.android.socialbase.downloader.downloader.p.vv(true);
                }
                if (com.ss.android.socialbase.downloader.n.vv.p().vv("disable_security_init", 1) == 1) {
                    com.ss.android.socialbase.appdownloader.u.u.vv(b.getContext());
                }
            }
        });
    }
}
