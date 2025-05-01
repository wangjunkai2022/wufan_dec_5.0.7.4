package com.ss.android.downloadlib.addownload.i;

import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.r;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class o implements n {
    @Override // com.ss.android.downloadlib.addownload.i.n
    public boolean vv(com.ss.android.downloadad.api.vv.m mVar, int i4, qv qvVar, com.ss.android.downloadlib.addownload.vv.p pVar) {
        DownloadInfo m4;
        if (mVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(mVar.fn())) {
            m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).vv(mVar.fn(), null, true);
        } else {
            m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).m(mVar.vv());
        }
        return r.vv(mVar, m4, i4, qvVar, true, pVar);
    }
}
