package com.ss.android.downloadlib.addownload.i;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.r;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes5.dex */
public class jh implements wv {
    @Override // com.ss.android.downloadlib.addownload.i.wv
    public boolean vv(com.ss.android.downloadad.api.vv.m mVar, int i4, qv qvVar) {
        DownloadInfo m4;
        if (mVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(mVar.fn())) {
            m4 = com.ss.android.downloadlib.qv.vv((Context) null).vv(mVar.fn(), null, true);
        } else {
            m4 = com.ss.android.downloadlib.qv.vv((Context) null).m(mVar.vv());
        }
        return r.vv(mVar, m4, i4, qvVar, false, null);
    }
}
