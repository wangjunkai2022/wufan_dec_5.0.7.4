package com.ss.android.downloadlib.addownload.i;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class b {
    private static b vv;

    /* renamed from: m  reason: collision with root package name */
    private List<wv> f60466m;

    private b() {
        ArrayList arrayList = new ArrayList();
        this.f60466m = arrayList;
        arrayList.add(new k());
        this.f60466m.add(new jh());
        this.f60466m.add(new u());
        this.f60466m.add(new vv());
    }

    public static b vv() {
        if (vv == null) {
            synchronized (b.class) {
                if (vv == null) {
                    vv = new b();
                }
            }
        }
        return vv;
    }

    public void vv(com.ss.android.downloadad.api.vv.m mVar, int i4, qv qvVar) {
        DownloadInfo m4;
        List<wv> list = this.f60466m;
        if (list != null && list.size() != 0 && mVar != null) {
            if (!TextUtils.isEmpty(mVar.fn())) {
                m4 = com.ss.android.downloadlib.qv.vv((Context) null).vv(mVar.fn(), null, true);
            } else {
                m4 = com.ss.android.downloadlib.qv.vv((Context) null).m(mVar.vv());
            }
            if (m4 != null && "application/vnd.android.package-archive".equals(m4.getMimeType())) {
                boolean z4 = com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("pause_optimise_switch", 0) == 1;
                for (wv wvVar : this.f60466m) {
                    if (z4 || (wvVar instanceof jh)) {
                        if (wvVar.vv(mVar, i4, qvVar)) {
                            return;
                        }
                    }
                }
                qvVar.vv(mVar);
                return;
            }
            qvVar.vv(mVar);
            return;
        }
        qvVar.vv(mVar);
    }
}
