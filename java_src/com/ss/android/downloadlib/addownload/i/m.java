package com.ss.android.downloadlib.addownload.i;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class m implements n {

    /* renamed from: m  reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.vv.p f60468m;
    private static com.ss.android.downloadlib.addownload.vv.i vv;

    public static com.ss.android.downloadlib.addownload.vv.p m() {
        return f60468m;
    }

    public static com.ss.android.downloadlib.addownload.vv.i vv() {
        return vv;
    }

    public static void vv(com.ss.android.downloadlib.addownload.vv.p pVar) {
        f60468m = pVar;
    }

    @Override // com.ss.android.downloadlib.addownload.i.n
    public boolean vv(final com.ss.android.downloadad.api.vv.m mVar, int i4, final qv qvVar, final com.ss.android.downloadlib.addownload.vv.p pVar) {
        DownloadInfo m4;
        if (mVar != null && vv(mVar)) {
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
            if (vv2 >= 0 && totalBytes > 0) {
                if (totalBytes <= vv(mVar.la())) {
                    final int i5 = (int) (vv2 / 1048576);
                    vv = new com.ss.android.downloadlib.addownload.vv.i() { // from class: com.ss.android.downloadlib.addownload.i.m.1
                        @Override // com.ss.android.downloadlib.addownload.vv.i
                        public void m() {
                            com.ss.android.downloadlib.addownload.vv.i unused = m.vv = null;
                            m.this.vv(i5, i5, mVar, "apk_size_cancel", "cancel");
                            qvVar.vv(mVar);
                        }

                        @Override // com.ss.android.downloadlib.addownload.vv.i
                        public void vv() {
                            com.ss.android.downloadlib.addownload.vv.i unused = m.vv = null;
                            m.this.vv(i5, i5, mVar, "apk_size_cancel", "confirm");
                        }
                    };
                    String format = String.format("该下载任务仅需%s，即将下载完成，是否继续下载？", com.ss.android.downloadlib.n.jh.vv(totalBytes - vv2));
                    if (pVar != null) {
                        vv(new com.ss.android.downloadlib.addownload.vv.p() { // from class: com.ss.android.downloadlib.addownload.i.m.2
                            @Override // com.ss.android.downloadlib.addownload.vv.p
                            public void delete() {
                                com.ss.android.downloadlib.addownload.vv.i unused = m.vv = null;
                                m.this.vv(i5, i5, mVar, "apk_size_cancel", "delete");
                                pVar.delete();
                            }
                        });
                    }
                    TTDelegateActivity.vv(mVar, format, "继续", "暂停", "删除");
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private int vv(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("cancel_pause_optimise_apk_size", 100) * 1024 * 1024;
    }

    private boolean vv(com.ss.android.downloadad.api.vv.vv vvVar) {
        return com.ss.android.downloadlib.n.o.vv(vvVar).vv("cancel_pause_optimise_apk_retain_switch", 0) == 1 && vvVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, int i5, com.ss.android.downloadad.api.vv.m mVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("pause_optimise_type", str);
            jSONObject.putOpt("pause_optimise_action", str2);
            jSONObject.putOpt("download_current_bytes", Integer.valueOf(i4));
            jSONObject.putOpt("download_total_bytes", Integer.valueOf(i5));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("pause_cancel_optimise", jSONObject, mVar);
    }
}
