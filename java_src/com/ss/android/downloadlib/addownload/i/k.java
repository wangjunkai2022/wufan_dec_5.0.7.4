package com.ss.android.downloadlib.addownload.i;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class k implements wv {
    private boolean m(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("pause_optimise_mistake_click_interval_switch", 0) == 1;
    }

    @Override // com.ss.android.downloadlib.addownload.i.wv
    public boolean vv(com.ss.android.downloadad.api.vv.m mVar, int i4, qv qvVar) {
        if (mVar != null && m(mVar.la())) {
            if (System.currentTimeMillis() - mVar.e() <= vv(mVar.la())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("pause_optimise_type", "mistake_click");
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                com.ss.android.downloadlib.i.vv.vv().vv("pause_optimise", jSONObject, mVar);
                return true;
            }
            return false;
        }
        return false;
    }

    private long vv(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("pause_optimise_mistake_click_interval", 300);
    }
}
