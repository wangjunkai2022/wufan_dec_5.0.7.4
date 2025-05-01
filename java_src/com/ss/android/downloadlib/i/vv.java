package com.ss.android.downloadlib.i;

import android.os.Build;
import androidx.annotation.NonNull;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.p;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.m.o;
import com.ss.android.downloadlib.addownload.m.u;
import com.ss.android.downloadlib.addownload.m.wv;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.appdownloader.o.i;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.tencent.cos.common.COSHttpResponseKey;
import com.umeng.analytics.pro.bm;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.downloadlib.i.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0612vv {
        private static vv vv = new vv();
    }

    public static vv vv() {
        return C0612vv.vv;
    }

    public void m(long j4, int i4) {
        vv(j4, i4, (DownloadInfo) null);
    }

    private vv() {
    }

    public void m(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo == null) {
            return;
        }
        com.ss.android.downloadad.api.vv.m vv = u.vv().vv(downloadInfo);
        if (vv == null) {
            com.ss.android.downloadlib.o.p.vv().vv("sendDownloadFailedEvent nativeModel null");
        } else if (vv.f60364p.get()) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
                com.ss.android.downloadlib.vv.vv(jSONObject, downloadInfo);
                if (baseException != null) {
                    jSONObject.putOpt("fail_status", Integer.valueOf(baseException.getErrorCode()));
                    jSONObject.putOpt("fail_msg", baseException.getErrorMessage());
                    vv.i(baseException.getErrorCode());
                    vv.vv(baseException.getErrorMessage());
                }
                vv.ns();
                jSONObject.put("download_failed_times", vv.l());
                if (downloadInfo.getTotalBytes() > 0) {
                    double curBytes = downloadInfo.getCurBytes();
                    double totalBytes = downloadInfo.getTotalBytes();
                    Double.isNaN(curBytes);
                    Double.isNaN(totalBytes);
                    jSONObject.put("download_percent", curBytes / totalBytes);
                }
                int i4 = 1;
                jSONObject.put("has_send_download_failed_finally", vv.f60357i.get() ? 1 : 2);
                com.ss.android.downloadlib.n.u.vv(vv, jSONObject);
                if (!vv.nn()) {
                    i4 = 2;
                }
                jSONObject.put("is_update_download", i4);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            vv(vv.k(), "download_failed", jSONObject, vv);
            wv.vv().vv(vv);
        }
    }

    public void vv(long j4, int i4) {
        o o4 = u.vv().o(j4);
        if (o4.l()) {
            com.ss.android.downloadlib.o.p.vv().vv("sendClickEvent ModelBox notValid");
        } else if (o4.f60512p.isEnableClickEvent()) {
            int i5 = 1;
            DownloadEventConfig downloadEventConfig = o4.f60512p;
            String clickItemTag = i4 == 1 ? downloadEventConfig.getClickItemTag() : downloadEventConfig.getClickButtonTag();
            String vv = jh.vv(o4.f60512p.getClickLabel(), "click");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("download_click_type", Integer.valueOf(i4));
                jSONObject.putOpt("permission_notification", Integer.valueOf(i.vv() ? 1 : 2));
                if (!com.ss.android.socialbase.downloader.wv.u.p(b.getContext())) {
                    i5 = 2;
                }
                jSONObject.putOpt("network_available", Integer.valueOf(i5));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            vv(clickItemTag, vv, jSONObject, o4);
            if (!"click".equals(vv) || o4.f60510m == null) {
                return;
            }
            p.vv().vv(j4, o4.f60510m.getLogExtra());
        }
    }

    public void vv(long j4, int i4, DownloadInfo downloadInfo) {
        o o4 = u.vv().o(j4);
        if (o4.l()) {
            com.ss.android.downloadlib.o.p.vv().vv("sendEvent ModelBox notValid");
            return;
        }
        String str = null;
        JSONObject jSONObject = new JSONObject();
        jh.vv(jSONObject, "download_scene", Integer.valueOf(o4.x()));
        if (i4 == 1) {
            str = jh.vv(o4.f60512p.getStorageDenyLabel(), "storage_deny");
        } else if (i4 == 2) {
            str = jh.vv(o4.f60512p.getClickStartLabel(), "click_start");
            com.ss.android.downloadlib.n.u.vv(downloadInfo, jSONObject);
        } else if (i4 == 3) {
            str = jh.vv(o4.f60512p.getClickPauseLabel(), "click_pause");
            com.ss.android.downloadlib.n.u.m(downloadInfo, jSONObject);
        } else if (i4 == 4) {
            str = jh.vv(o4.f60512p.getClickContinueLabel(), "click_continue");
            com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
        } else if (i4 == 5) {
            if (downloadInfo != null) {
                try {
                    com.ss.android.downloadlib.n.u.vv(jSONObject, downloadInfo.getId());
                    com.ss.android.downloadlib.vv.m(jSONObject, downloadInfo);
                } catch (Throwable unused) {
                }
            }
            str = jh.vv(o4.f60512p.getClickInstallLabel(), "click_install");
        }
        vv(null, str, jSONObject, 0L, 1, o4);
    }

    public void m(String str, com.ss.android.downloadad.api.vv.vv vvVar) {
        vv((String) null, str, vvVar);
    }

    public void m(String str, JSONObject jSONObject, com.ss.android.downloadad.api.vv.vv vvVar) {
        vv((String) null, str, jSONObject, vvVar);
    }

    public void vv(String str, int i4, o oVar) {
        vv(null, str, null, i4, 0, oVar);
    }

    public void vv(long j4, boolean z4, int i4) {
        o o4 = u.vv().o(j4);
        if (o4.l()) {
            com.ss.android.downloadlib.o.p.vv().vv("sendQuickAppEvent ModelBox notValid");
        } else if (o4.f60510m.getQuickAppModel() == null) {
        } else {
            DownloadModel downloadModel = o4.f60510m;
            if (downloadModel instanceof AdDownloadModel) {
                ((AdDownloadModel) downloadModel).setFunnelType(3);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("download_click_type", Integer.valueOf(i4));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            m(z4 ? "deeplink_quickapp_success" : "deeplink_quickapp_failed", jSONObject, o4);
        }
    }

    public void vv(long j4, BaseException baseException) {
        o o4 = u.vv().o(j4);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("download_time", 0);
            if (baseException != null) {
                jSONObject.putOpt("fail_status", Integer.valueOf(baseException.getErrorCode()));
                jSONObject.putOpt("fail_msg", baseException.getErrorMessage());
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        m("download_failed", jSONObject, o4);
    }

    public void vv(DownloadInfo downloadInfo) {
        com.ss.android.downloadad.api.vv.m vv = u.vv().vv(downloadInfo);
        if (vv == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
            vv.vv(System.currentTimeMillis());
            vv(vv.k(), "download_resume", jSONObject, vv);
            wv.vv().vv(vv);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void vv(JSONObject jSONObject, @NonNull com.ss.android.downloadad.api.vv.m mVar) {
        vv(mVar.k(), "install_finish", jSONObject, mVar);
    }

    public void vv(DownloadInfo downloadInfo, BaseException baseException) {
        com.ss.android.downloadad.api.vv.m vv;
        if (downloadInfo == null || (vv = u.vv().vv(downloadInfo)) == null || vv.f60364p.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            com.ss.android.downloadlib.vv.vv(jSONObject, downloadInfo);
            jSONObject.putOpt("fail_status", Integer.valueOf(vv.a()));
            jSONObject.putOpt("fail_msg", vv.c());
            jSONObject.put("download_failed_times", vv.l());
            if (downloadInfo.getTotalBytes() > 0) {
                double curBytes = downloadInfo.getCurBytes();
                double totalBytes = downloadInfo.getTotalBytes();
                Double.isNaN(curBytes);
                Double.isNaN(totalBytes);
                jSONObject.put("download_percent", curBytes / totalBytes);
            }
            jSONObject.put("download_status", downloadInfo.getRealStatus());
            long currentTimeMillis = System.currentTimeMillis();
            if (vv.pj() > 0) {
                jSONObject.put("time_from_start_download", currentTimeMillis - vv.pj());
            }
            if (vv.td() > 0) {
                jSONObject.put("time_from_download_resume", currentTimeMillis - vv.td());
            }
            int i4 = 1;
            jSONObject.put("is_update_download", vv.nn() ? 1 : 2);
            jSONObject.put("can_show_notification", i.vv() ? 1 : 2);
            if (!vv.f60357i.get()) {
                i4 = 2;
            }
            jSONObject.put("has_send_download_failed_finally", i4);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        vv(vv.k(), "download_cancel", jSONObject, vv);
    }

    public void vv(String str, com.ss.android.downloadad.api.vv.vv vvVar) {
        vv(str, (JSONObject) null, vvVar);
    }

    public void vv(String str, JSONObject jSONObject, long j4) {
        com.ss.android.downloadad.api.vv.vv i4 = u.vv().i(j4);
        if (i4 != null) {
            vv(str, jSONObject, i4);
            return;
        }
        o o4 = u.vv().o(j4);
        if (o4.l()) {
            com.ss.android.downloadlib.o.p.vv().vv("sendUnityEvent ModelBox notValid");
        } else {
            vv(str, jSONObject, o4);
        }
    }

    public void vv(String str, JSONObject jSONObject, com.ss.android.downloadad.api.vv.vv vvVar) {
        JSONObject jSONObject2 = new JSONObject();
        jh.vv(jSONObject2, "unity_label", str);
        vv("embeded_ad", "ttdownloader_unity", jh.vv(jSONObject, jSONObject2), vvVar);
    }

    public void vv(String str, @NonNull DownloadModel downloadModel, @NonNull DownloadEventConfig downloadEventConfig, @NonNull DownloadController downloadController) {
        m(str, new o(downloadModel.getId(), downloadModel, downloadEventConfig, downloadController));
    }

    public void vv(String str, long j4) {
        com.ss.android.downloadad.api.vv.m i4 = u.vv().i(j4);
        if (i4 != null) {
            m(str, i4);
        } else {
            m(str, u.vv().o(j4));
        }
    }

    public void vv(String str, String str2, com.ss.android.downloadad.api.vv.vv vvVar) {
        vv(str, str2, (JSONObject) null, vvVar);
    }

    public void vv(String str, String str2, JSONObject jSONObject, com.ss.android.downloadad.api.vv.vv vvVar) {
        vv(str, str2, jSONObject, 0L, 0, vvVar);
    }

    private void vv(String str, String str2, JSONObject jSONObject, long j4, int i4, com.ss.android.downloadad.api.vv.vv vvVar) {
        if (vvVar == null) {
            com.ss.android.downloadlib.o.p.vv().vv("onEvent data null");
        } else if ((vvVar instanceof o) && ((o) vvVar).l()) {
            com.ss.android.downloadlib.o.p.vv().vv("onEvent ModelBox notValid");
        } else {
            try {
                p.vv p4 = new p.vv().vv(jh.vv(str, vvVar.k(), "embeded_ad")).m(str2).m(vvVar.p()).vv(vvVar.m()).p(vvVar.i());
                if (j4 <= 0) {
                    j4 = vvVar.jh();
                }
                p.vv vv = p4.m(j4).i(vvVar.wv()).vv(vvVar.t()).vv(jh.vv(vv(vvVar), jSONObject)).m(vvVar.b()).vv(vvVar.q());
                if (i4 <= 0) {
                    i4 = 2;
                }
                vv(vv.vv(i4).vv(vvVar.r()).vv());
            } catch (Exception e5) {
                com.ss.android.downloadlib.o.p.vv().vv(e5, "onEvent");
            }
        }
    }

    private JSONObject vv(com.ss.android.downloadad.api.vv.vv vvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jh.vv(vvVar.n(), jSONObject);
            jh.vv(vvVar.j(), jSONObject);
            jSONObject.putOpt(COSHttpResponseKey.DOWNLOAD_URL, vvVar.vv());
            jSONObject.putOpt(bm.f63454o, vvVar.o());
            jSONObject.putOpt("android_int", Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject.putOpt("rom_name", com.ss.android.socialbase.appdownloader.u.o.qv());
            jSONObject.putOpt("rom_version", com.ss.android.socialbase.appdownloader.u.o.wv());
            jSONObject.putOpt("ttdownloader", 1);
            jSONObject.putOpt("funnel_type", Integer.valueOf(vvVar.qv()));
            if (vvVar.qv() == 2) {
                com.ss.android.downloadlib.n.u.m(jSONObject, vvVar);
            }
            if (com.ss.android.socialbase.appdownloader.u.o.j()) {
                com.ss.android.downloadlib.n.u.vv(jSONObject);
            }
        } catch (Exception e5) {
            b.x().vv(e5, "getBaseJson");
        }
        return jSONObject;
    }

    private void vv(com.ss.android.download.api.model.p pVar) {
        if (b.vv() == null) {
            return;
        }
        if (pVar.r()) {
            b.vv().vv(pVar);
        } else {
            b.vv().m(pVar);
        }
    }
}
