package com.ss.android.downloadlib.addownload;

import com.ss.android.socialbase.downloader.downloader.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class jh implements g {
    @Override // com.ss.android.socialbase.downloader.downloader.g
    public void vv(DownloadInfo downloadInfo, int i4, int i5) {
        com.ss.android.downloadad.api.vv.m vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("reserve_wifi_source", Integer.valueOf(i5));
            jSONObject.putOpt("reserve_wifi_status", Integer.valueOf(i4));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("pause_reserve_wifi", jSONObject, vv);
    }
}
