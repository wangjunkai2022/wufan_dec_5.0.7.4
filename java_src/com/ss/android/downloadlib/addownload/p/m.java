package com.ss.android.downloadlib.addownload.p;

import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.m.u;
import com.ss.android.downloadlib.addownload.m.wv;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class m implements Runnable {
    private DownloadInfo vv;

    public m(DownloadInfo downloadInfo) {
        this.vv = downloadInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.ss.android.downloadad.api.vv.m vv;
        if (this.vv == null || (vv = u.vv().vv(this.vv)) == null) {
            return;
        }
        com.ss.android.downloadlib.i.vv.vv().vv("cleanspace_task", vv);
        double totalBytes = this.vv.getTotalBytes();
        Double.isNaN(totalBytes);
        long longValue = Double.valueOf((com.ss.android.downloadlib.n.o.vv(this.vv.getId()) + 1.0d) * totalBytes).longValue() - this.vv.getCurBytes();
        long m4 = jh.m(0L);
        if (b.r() != null) {
            b.r();
        }
        p.vv();
        p.m();
        if (com.ss.android.downloadlib.n.o.n(vv.la())) {
            p.vv(b.getContext());
        }
        long m5 = jh.m(0L);
        if (m5 >= longValue) {
            vv.jh("1");
            wv.vv().vv(vv);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("quite_clean_size", Long.valueOf(m5 - m4));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            com.ss.android.downloadlib.i.vv.vv().vv("cleanspace_download_after_quite_clean", jSONObject, vv);
            Downloader.getInstance(b.getContext()).restart(this.vv.getId());
        } else if (b.r() != null) {
            vv.i(false);
            i.vv().vv(vv.vv(), new o() { // from class: com.ss.android.downloadlib.addownload.p.m.1
            });
            if (b.r().vv(this.vv.getId(), this.vv.getUrl(), true, longValue)) {
                vv.o(true);
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putOpt("show_dialog_result", 3);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            com.ss.android.downloadlib.i.vv.vv().vv("cleanspace_window_show", jSONObject2, vv);
        }
    }
}
