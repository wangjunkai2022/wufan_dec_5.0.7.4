package com.ss.android.downloadlib.addownload.i;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class i {
    private static i vv;

    /* renamed from: m  reason: collision with root package name */
    private List<n> f60467m;

    private i() {
        ArrayList arrayList = new ArrayList();
        this.f60467m = arrayList;
        arrayList.add(new o());
        this.f60467m.add(new m());
        this.f60467m.add(new p());
    }

    public static i vv() {
        if (vv == null) {
            synchronized (b.class) {
                if (vv == null) {
                    vv = new i();
                }
            }
        }
        return vv;
    }

    public void vv(com.ss.android.downloadad.api.vv.m mVar, int i4, qv qvVar, com.ss.android.downloadlib.addownload.vv.p pVar) {
        DownloadInfo m4;
        List<n> list = this.f60467m;
        if (list == null || list.size() == 0 || mVar == null) {
            qvVar.vv(mVar);
        }
        if (!TextUtils.isEmpty(mVar.fn())) {
            m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).vv(mVar.fn(), null, true);
        } else {
            m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).m(mVar.vv());
        }
        if (m4 == null) {
            m4 = Downloader.getInstance(com.ss.android.downloadlib.addownload.b.getContext()).getDownloadInfo(mVar.la());
        }
        if (m4 != null && "application/vnd.android.package-archive".equals(m4.getMimeType())) {
            if (new k().vv(mVar, i4, qvVar)) {
                return;
            }
            for (n nVar : this.f60467m) {
                if (nVar.vv(mVar, i4, qvVar, pVar)) {
                    return;
                }
            }
            qvVar.vv(mVar);
            return;
        }
        qvVar.vv(mVar);
    }
}
