package com.ss.android.downloadlib.p;

import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class o implements com.ss.android.socialbase.downloader.i.p {
    @Override // com.ss.android.socialbase.downloader.i.p
    public void m(int i4, String str, JSONObject jSONObject) {
        com.ss.android.downloadad.api.vv.m vv;
        DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(i4);
        if (downloadInfo == null || (vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo)) == null) {
            return;
        }
        com.ss.android.downloadlib.i.vv.vv().vv(str, jSONObject, vv);
    }

    @Override // com.ss.android.socialbase.downloader.i.p
    public void vv(int i4, String str, JSONObject jSONObject) {
        com.ss.android.downloadad.api.vv.m vv;
        DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(i4);
        if (downloadInfo == null || (vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo)) == null) {
            return;
        }
        if ("install_view_result".equals(str)) {
            jSONObject = jh.vv(jSONObject);
            com.ss.android.downloadlib.vv.vv(jSONObject, downloadInfo);
            jh.vv(jSONObject, "model_id", Long.valueOf(vv.m()));
        }
        com.ss.android.downloadlib.i.vv.vv().m(str, jSONObject, vv);
    }
}
