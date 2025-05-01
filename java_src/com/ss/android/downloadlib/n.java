package com.ss.android.downloadlib;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import q.a;
/* loaded from: classes5.dex */
public class n {
    private static volatile n vv;

    /* renamed from: u  reason: collision with root package name */
    private long f60651u;

    /* renamed from: p  reason: collision with root package name */
    private final List<com.ss.android.downloadlib.addownload.n> f60650p = new CopyOnWriteArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, com.ss.android.downloadlib.addownload.n> f60647i = new ConcurrentHashMap();

    /* renamed from: o  reason: collision with root package name */
    private final CopyOnWriteArrayList<Object> f60649o = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private final Handler f60648m = new Handler(Looper.getMainLooper());

    private n() {
    }

    private void i() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.downloadlib.addownload.n nVar : this.f60650p) {
            if (!nVar.m() && currentTimeMillis - nVar.i() > a.f73127b) {
                nVar.qv();
                arrayList.add(nVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f60650p.removeAll(arrayList);
    }

    private synchronized void m(Context context, int i4, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        if (this.f60650p.size() <= 0) {
            p(context, i4, downloadStatusChangeListener, downloadModel);
            return;
        }
        com.ss.android.downloadlib.addownload.n remove = this.f60650p.remove(0);
        remove.m(context).m(i4, downloadStatusChangeListener).m(downloadModel).vv();
        this.f60647i.put(downloadModel.getDownloadUrl(), remove);
    }

    private void p(Context context, int i4, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        if (downloadModel == null) {
            return;
        }
        com.ss.android.downloadlib.addownload.o oVar = new com.ss.android.downloadlib.addownload.o();
        oVar.m(context).m(i4, downloadStatusChangeListener).m(downloadModel).vv();
        this.f60647i.put(downloadModel.getDownloadUrl(), oVar);
    }

    public static n vv() {
        if (vv == null) {
            synchronized (n.class) {
                if (vv == null) {
                    vv = new n();
                }
            }
        }
        return vv;
    }

    private void p() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f60651u < a.f73127b) {
            return;
        }
        this.f60651u = currentTimeMillis;
        if (this.f60650p.isEmpty()) {
            return;
        }
        i();
    }

    public void vv(Context context, int i4, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel) {
        com.ss.android.downloadlib.addownload.n nVar;
        if (downloadModel == null || TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
            return;
        }
        boolean z4 = b.wv().optInt("filter_download_url_key", 0) == 1;
        String vv2 = com.ss.android.downloadlib.addownload.u.vv().vv(downloadModel.getDownloadUrl());
        if (z4 && !TextUtils.isEmpty(vv2)) {
            nVar = this.f60647i.get(vv2);
            if (downloadModel instanceof AdDownloadModel) {
                AdDownloadModel adDownloadModel = (AdDownloadModel) downloadModel;
                if (TextUtils.isEmpty(adDownloadModel.getTaskKey())) {
                    adDownloadModel.setTaskKey(vv2);
                }
            }
        } else {
            nVar = this.f60647i.get(downloadModel.getDownloadUrl());
        }
        if (nVar != null) {
            nVar.m(context).m(i4, downloadStatusChangeListener).m(downloadModel).vv();
        } else if (this.f60650p.isEmpty()) {
            if (z4) {
                if (!TextUtils.isEmpty(vv2)) {
                    m(context, i4, downloadStatusChangeListener, downloadModel, vv2);
                    return;
                }
                String vv3 = com.ss.android.downloadlib.addownload.u.vv().vv(downloadModel);
                if (!TextUtils.isEmpty(vv3)) {
                    m(context, i4, downloadStatusChangeListener, downloadModel, vv3);
                    if (downloadModel instanceof AdDownloadModel) {
                        AdDownloadModel adDownloadModel2 = (AdDownloadModel) downloadModel;
                        if (TextUtils.isEmpty(adDownloadModel2.getTaskKey())) {
                            adDownloadModel2.setTaskKey(vv3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            p(context, i4, downloadStatusChangeListener, downloadModel);
        } else if (z4) {
            if (!TextUtils.isEmpty(vv2)) {
                vv(context, i4, downloadStatusChangeListener, downloadModel, vv2);
                return;
            }
            String vv4 = com.ss.android.downloadlib.addownload.u.vv().vv(downloadModel);
            if (TextUtils.isEmpty(vv4)) {
                m(context, i4, downloadStatusChangeListener, downloadModel);
                return;
            }
            vv(context, i4, downloadStatusChangeListener, downloadModel, vv4);
            if (downloadModel instanceof AdDownloadModel) {
                AdDownloadModel adDownloadModel3 = (AdDownloadModel) downloadModel;
                if (TextUtils.isEmpty(adDownloadModel3.getTaskKey())) {
                    adDownloadModel3.setTaskKey(vv4);
                }
            }
        } else {
            m(context, i4, downloadStatusChangeListener, downloadModel);
        }
    }

    private void m(Context context, int i4, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel, String str) {
        if (downloadModel == null) {
            return;
        }
        com.ss.android.downloadlib.addownload.o oVar = new com.ss.android.downloadlib.addownload.o();
        oVar.m(context).m(i4, downloadStatusChangeListener).m(downloadModel).vv(str).vv();
        this.f60647i.put(str, oVar);
        com.ss.android.downloadlib.addownload.u.vv().vv(str, downloadModel.getDownloadUrl());
    }

    public void m(final DownloadInfo downloadInfo, final String str) {
        this.f60648m.post(new Runnable() { // from class: com.ss.android.downloadlib.n.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = n.this.f60649o.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof com.ss.android.download.api.download.vv.vv) {
                        ((com.ss.android.download.api.download.vv.vv) next).m(downloadInfo, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.vv.vv) {
                            ((com.ss.android.download.api.download.vv.vv) softReference.get()).m(downloadInfo, str);
                        }
                    }
                }
            }
        });
    }

    public Handler m() {
        return this.f60648m;
    }

    public com.ss.android.downloadlib.addownload.o vv(String str) {
        com.ss.android.downloadlib.addownload.n nVar;
        Map<String, com.ss.android.downloadlib.addownload.n> map = this.f60647i;
        if (map != null && map.size() != 0 && !TextUtils.isEmpty(str)) {
            if (b.wv().optInt("filter_download_url_key", 0) == 1) {
                nVar = this.f60647i.get(com.ss.android.downloadlib.addownload.u.vv().vv(str));
            } else {
                nVar = this.f60647i.get(str);
            }
            if (nVar instanceof com.ss.android.downloadlib.addownload.o) {
                return (com.ss.android.downloadlib.addownload.o) nVar;
            }
        }
        return null;
    }

    private synchronized void vv(Context context, int i4, DownloadStatusChangeListener downloadStatusChangeListener, DownloadModel downloadModel, String str) {
        if (this.f60650p.size() <= 0) {
            m(context, i4, downloadStatusChangeListener, downloadModel, str);
            return;
        }
        com.ss.android.downloadlib.addownload.n remove = this.f60650p.remove(0);
        remove.m(context).m(i4, downloadStatusChangeListener).m(downloadModel).vv(str).vv();
        this.f60647i.put(str, remove);
        com.ss.android.downloadlib.addownload.u.vv().vv(str, downloadModel.getDownloadUrl());
    }

    public void vv(String str, int i4) {
        com.ss.android.downloadlib.addownload.n nVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z4 = b.wv().optInt("filter_download_url_key", 0) == 1;
        String vv2 = com.ss.android.downloadlib.addownload.u.vv().vv(str);
        if (z4 && !TextUtils.isEmpty(vv2)) {
            nVar = this.f60647i.get(vv2);
        } else {
            nVar = this.f60647i.get(str);
        }
        if (nVar != null) {
            if (nVar.vv(i4)) {
                this.f60650p.add(nVar);
                if (z4 && !TextUtils.isEmpty(vv2)) {
                    this.f60647i.remove(vv2);
                    com.ss.android.downloadlib.addownload.u.vv().m(vv2);
                } else {
                    this.f60647i.remove(str);
                }
            }
            p();
        }
    }

    public void vv(String str, boolean z4) {
        com.ss.android.downloadlib.addownload.n nVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z5 = b.wv().optInt("filter_download_url_key", 0) == 1;
        String vv2 = com.ss.android.downloadlib.addownload.u.vv().vv(str);
        if (z5 && !TextUtils.isEmpty(vv2)) {
            nVar = this.f60647i.get(vv2);
        } else {
            nVar = this.f60647i.get(str);
        }
        if (nVar != null) {
            nVar.vv(z4);
        }
    }

    public void vv(String str, long j4, int i4, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        vv(str, j4, i4, downloadEventConfig, downloadController, null, null);
    }

    public void vv(String str, long j4, int i4, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        vv(str, j4, i4, downloadEventConfig, downloadController, null, iDownloadButtonClickListener);
    }

    public void vv(String str, long j4, int i4, DownloadEventConfig downloadEventConfig, DownloadController downloadController, OnItemClickListener onItemClickListener, IDownloadButtonClickListener iDownloadButtonClickListener) {
        com.ss.android.downloadlib.addownload.n nVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z4 = b.wv().optInt("filter_download_url_key", 0) == 1;
        String vv2 = com.ss.android.downloadlib.addownload.u.vv().vv(str);
        if (z4 && !TextUtils.isEmpty(vv2)) {
            nVar = this.f60647i.get(vv2);
        } else {
            nVar = this.f60647i.get(str);
        }
        if (nVar != null) {
            nVar.vv(j4).m(downloadEventConfig).m(downloadController).vv(onItemClickListener).vv(iDownloadButtonClickListener).m(i4);
        }
    }

    public void vv(com.ss.android.download.api.download.vv.vv vvVar) {
        if (vvVar != null) {
            if (com.ss.android.socialbase.downloader.n.vv.p().m("fix_listener_oom", false)) {
                this.f60649o.add(new SoftReference(vvVar));
            } else {
                this.f60649o.add(vvVar);
            }
        }
    }

    public void vv(final DownloadModel downloadModel, @Nullable final DownloadController downloadController, @Nullable final DownloadEventConfig downloadEventConfig) {
        this.f60648m.post(new Runnable() { // from class: com.ss.android.downloadlib.n.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = n.this.f60649o.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof com.ss.android.download.api.download.vv.vv) {
                        ((com.ss.android.download.api.download.vv.vv) next).vv(downloadModel, downloadController, downloadEventConfig);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.vv.vv) {
                            ((com.ss.android.download.api.download.vv.vv) softReference.get()).vv(downloadModel, downloadController, downloadEventConfig);
                        }
                    }
                }
            }
        });
    }

    public void vv(final DownloadInfo downloadInfo, final BaseException baseException, final String str) {
        this.f60648m.post(new Runnable() { // from class: com.ss.android.downloadlib.n.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = n.this.f60649o.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof com.ss.android.download.api.download.vv.vv) {
                        ((com.ss.android.download.api.download.vv.vv) next).vv(downloadInfo, baseException, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.vv.vv) {
                            ((com.ss.android.download.api.download.vv.vv) softReference.get()).vv(downloadInfo, baseException, str);
                        }
                    }
                }
            }
        });
    }

    public void vv(final DownloadInfo downloadInfo, final String str) {
        this.f60648m.post(new Runnable() { // from class: com.ss.android.downloadlib.n.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = n.this.f60649o.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof com.ss.android.download.api.download.vv.vv) {
                        ((com.ss.android.download.api.download.vv.vv) next).vv(downloadInfo, str);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.vv.vv) {
                            ((com.ss.android.download.api.download.vv.vv) softReference.get()).vv(downloadInfo, str);
                        }
                    }
                }
            }
        });
    }

    public void vv(final DownloadInfo downloadInfo) {
        this.f60648m.post(new Runnable() { // from class: com.ss.android.downloadlib.n.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = n.this.f60649o.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof com.ss.android.download.api.download.vv.vv) {
                        ((com.ss.android.download.api.download.vv.vv) next).vv(downloadInfo);
                    } else if (next instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) next;
                        if (softReference.get() instanceof com.ss.android.download.api.download.vv.vv) {
                            ((com.ss.android.download.api.download.vv.vv) softReference.get()).vv(downloadInfo);
                        }
                    }
                }
            }
        });
    }
}
