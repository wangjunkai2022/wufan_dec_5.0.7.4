package com.ss.android.downloadlib.addownload.i;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p implements n {

    /* renamed from: m  reason: collision with root package name */
    private static com.ss.android.downloadlib.addownload.vv.p f60477m;
    private static com.ss.android.downloadlib.addownload.vv.i vv;

    public static com.ss.android.downloadlib.addownload.vv.p m() {
        return f60477m;
    }

    public static com.ss.android.downloadlib.addownload.vv.i vv() {
        return vv;
    }

    public static void vv(com.ss.android.downloadlib.addownload.vv.p pVar) {
        f60477m = pVar;
    }

    @Override // com.ss.android.downloadlib.addownload.i.n
    public boolean vv(final com.ss.android.downloadad.api.vv.m mVar, int i4, final qv qvVar, final com.ss.android.downloadlib.addownload.vv.p pVar) {
        DownloadInfo m4;
        String format;
        if (mVar != null && vv(mVar)) {
            if (!TextUtils.isEmpty(mVar.fn())) {
                m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).vv(mVar.fn(), null, true);
            } else {
                m4 = com.ss.android.downloadlib.qv.vv(com.ss.android.downloadlib.addownload.b.getContext()).m(mVar.vv());
            }
            if (m4 == null) {
                return false;
            }
            long curBytes = m4.getCurBytes();
            long totalBytes = m4.getTotalBytes();
            if (curBytes < 0 || totalBytes <= 0) {
                return false;
            }
            final int vv2 = com.ss.android.downloadlib.addownload.k.vv(m4.getId(), (int) ((100 * curBytes) / totalBytes));
            final int i5 = (int) (curBytes / 1048576);
            boolean z4 = vv2 > vv(mVar.la());
            vv = new com.ss.android.downloadlib.addownload.vv.i() { // from class: com.ss.android.downloadlib.addownload.i.p.1
                @Override // com.ss.android.downloadlib.addownload.vv.i
                public void m() {
                    com.ss.android.downloadlib.addownload.vv.i unused = p.vv = null;
                    p.this.vv(vv2, i5, i5, mVar, "download_percent_cancel", "cancel");
                    qvVar.vv(mVar);
                }

                @Override // com.ss.android.downloadlib.addownload.vv.i
                public void vv() {
                    com.ss.android.downloadlib.addownload.vv.i unused = p.vv = null;
                    p.this.vv(vv2, i5, i5, mVar, "download_percent_cancel", "confirm");
                }
            };
            String vv3 = com.ss.android.downloadlib.n.jh.vv(com.ss.android.downloadlib.addownload.k.vv(mVar.la(), curBytes, totalBytes));
            if (z4) {
                format = String.format("该任务已下载%s，仅需%s即可下载完成，是否继续？", vv3, com.ss.android.downloadlib.n.jh.vv(totalBytes - curBytes));
            } else {
                format = String.format("该任务已下载%s，即将下载完成，是否继续下载？", vv3);
            }
            String str = format;
            if (pVar != null) {
                vv(new com.ss.android.downloadlib.addownload.vv.p() { // from class: com.ss.android.downloadlib.addownload.i.p.2
                    @Override // com.ss.android.downloadlib.addownload.vv.p
                    public void delete() {
                        com.ss.android.downloadlib.addownload.vv.i unused = p.vv = null;
                        p.this.vv(vv2, i5, i5, mVar, "download_percent_cancel", "delete");
                        pVar.delete();
                    }
                });
            }
            TTDelegateActivity.m(mVar, str, "继续", "暂停", "删除");
            return true;
        }
        return false;
    }

    private int vv(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("cancel_pause_optimise_download_percent_value", 50);
    }

    private boolean vv(com.ss.android.downloadad.api.vv.vv vvVar) {
        return com.ss.android.downloadlib.n.o.vv(vvVar).vv("cancel_pause_optimise_download_percent_retain_switch", 0) == 1 && vvVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, int i5, int i6, com.ss.android.downloadad.api.vv.m mVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("pause_optimise_type", str);
            jSONObject.putOpt("pause_optimise_action", str2);
            jSONObject.putOpt("download_percent", Integer.valueOf(i4));
            jSONObject.putOpt("download_current_bytes", Integer.valueOf(i5));
            jSONObject.putOpt("download_total_bytes", Integer.valueOf(i6));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("pause_cancel_optimise", jSONObject, mVar);
    }
}
