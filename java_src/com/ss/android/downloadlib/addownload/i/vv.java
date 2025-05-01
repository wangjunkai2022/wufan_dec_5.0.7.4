package com.ss.android.downloadlib.addownload.i;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv implements wv {
    private static com.ss.android.downloadlib.addownload.vv.i vv;

    public static com.ss.android.downloadlib.addownload.vv.i vv() {
        return vv;
    }

    @Override // com.ss.android.downloadlib.addownload.i.wv
    public boolean vv(final com.ss.android.downloadad.api.vv.m mVar, int i4, final qv qvVar) {
        DownloadInfo m4;
        if (mVar == null || mVar.qd() || !vv(mVar)) {
            return false;
        }
        if (!TextUtils.isEmpty(mVar.fn())) {
            m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).vv(mVar.fn(), null, true);
        } else {
            m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).m(mVar.vv());
        }
        if (m4 == null) {
            return false;
        }
        long vv2 = com.ss.android.downloadlib.addownload.k.vv(m4.getId(), m4.getCurBytes(), m4.getTotalBytes());
        long totalBytes = m4.getTotalBytes();
        if (vv2 <= 0 || totalBytes <= 0 || totalBytes > vv(mVar.la())) {
            return false;
        }
        vv = new com.ss.android.downloadlib.addownload.vv.i() { // from class: com.ss.android.downloadlib.addownload.i.vv.1
            @Override // com.ss.android.downloadlib.addownload.vv.i
            public void m() {
                com.ss.android.downloadlib.addownload.vv.i unused = vv.vv = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("pause_optimise_type", "apk_size");
                    jSONObject.putOpt("pause_optimise_action", "cancel");
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                com.ss.android.downloadlib.i.vv.vv().vv("pause_optimise", jSONObject, mVar);
                qvVar.vv(mVar);
            }

            @Override // com.ss.android.downloadlib.addownload.vv.i
            public void vv() {
                com.ss.android.downloadlib.addownload.vv.i unused = vv.vv = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("pause_optimise_type", "apk_size");
                    jSONObject.putOpt("pause_optimise_action", "confirm");
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                com.ss.android.downloadlib.i.vv.vv().vv("pause_optimise", jSONObject, mVar);
            }
        };
        TTDelegateActivity.vv(mVar, String.format("该下载任务仅需%s，即将下载完成，是否继续下载？", com.ss.android.downloadlib.n.jh.vv(totalBytes - vv2)), "继续", "暂停");
        mVar.t(true);
        return true;
    }

    private int vv(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("pause_optimise_apk_size", 100) * 1024 * 1024;
    }

    private boolean vv(com.ss.android.downloadad.api.vv.vv vvVar) {
        return com.ss.android.downloadlib.n.o.vv(vvVar).vv("pause_optimise_apk_size_switch", 0) == 1 && vvVar.d();
    }
}
