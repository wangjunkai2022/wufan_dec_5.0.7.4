package com.ss.android.downloadlib.n;

import androidx.annotation.NonNull;
import com.ss.android.socialbase.appdownloader.n;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class u {
    public static void m(DownloadInfo downloadInfo, JSONObject jSONObject) {
        com.ss.android.downloadad.api.vv.m vv;
        double d5;
        if (jSONObject == null || (vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo)) == null) {
            return;
        }
        try {
            p(downloadInfo, jSONObject);
            jSONObject.putOpt("time_after_click", Long.valueOf(System.currentTimeMillis() - vv.e()));
            jSONObject.putOpt("click_download_size", Long.valueOf(vv.ju()));
            jSONObject.putOpt("download_length", Long.valueOf(downloadInfo.getCurBytes()));
            jSONObject.putOpt("download_apk_size", Long.valueOf(downloadInfo.getTotalBytes()));
            vv.ff();
            com.ss.android.downloadlib.addownload.m.wv.vv().vv(vv);
            jSONObject.put("click_pause_times", vv.vu());
            long totalBytes = downloadInfo.getTotalBytes();
            long curBytes = downloadInfo.getCurBytes();
            if (curBytes < 0 || totalBytes <= 0) {
                d5 = 0.0d;
            } else {
                double d6 = curBytes;
                double d7 = totalBytes;
                Double.isNaN(d6);
                Double.isNaN(d7);
                d5 = d6 / d7;
            }
            jSONObject.put("download_percent", d5);
            jSONObject.put("download_status", downloadInfo.getRealStatus());
            long currentTimeMillis = System.currentTimeMillis();
            long pj = vv.pj();
            if (pj > 0) {
                jSONObject.put("time_from_start_download", currentTimeMillis - pj);
            }
            long td = vv.td();
            if (td > 0) {
                jSONObject.put("time_from_download_resume", currentTimeMillis - td);
            }
            jSONObject.putOpt("fail_status", Integer.valueOf(vv.a()));
            jSONObject.putOpt("fail_msg", vv.c());
            jSONObject.put("download_failed_times", vv.l());
            jSONObject.put("can_show_notification", com.ss.android.socialbase.appdownloader.o.i.vv() ? 1 : 2);
            jSONObject.put("first_speed_time", downloadInfo.getFirstSpeedTime());
            jSONObject.put("all_connect_time", downloadInfo.getAllConnectTime());
            jSONObject.put("download_prepare_time", downloadInfo.getDownloadPrepareTime());
            jSONObject.put("download_time", downloadInfo.getRealDownloadTime() + downloadInfo.getAllConnectTime() + downloadInfo.getDownloadPrepareTime());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void p(DownloadInfo downloadInfo, JSONObject jSONObject) {
        if (downloadInfo != null) {
            try {
                jSONObject.putOpt("total_bytes", Long.valueOf(downloadInfo.getTotalBytes()));
                jSONObject.putOpt("cur_bytes", Long.valueOf(downloadInfo.getCurBytes()));
                jSONObject.putOpt("chunk_count", Integer.valueOf(downloadInfo.getChunkCount()));
                jSONObject.putOpt("app_name", downloadInfo.getTitle());
                jSONObject.putOpt("network_quality", downloadInfo.getNetworkQuality());
                jSONObject.putOpt("save_path", downloadInfo.getSavePath());
                jSONObject.putOpt("file_name", downloadInfo.getName());
                jSONObject.putOpt("download_status", Integer.valueOf(downloadInfo.getRealStatus()));
                com.ss.android.downloadad.api.vv.m vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo.getId());
                if (vv != null) {
                    jSONObject.putOpt("click_download_time", Long.valueOf(vv.e()));
                    jSONObject.putOpt("click_download_size", Long.valueOf(vv.ju()));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        int i4 = 1;
        jSONObject.putOpt("permission_notification", Integer.valueOf(com.ss.android.socialbase.appdownloader.o.i.vv() ? 1 : 2));
        jSONObject.putOpt("network_available", Integer.valueOf(com.ss.android.socialbase.downloader.wv.u.p(com.ss.android.downloadlib.addownload.b.getContext()) ? 1 : 2));
        if (!com.ss.android.socialbase.downloader.wv.u.m(com.ss.android.downloadlib.addownload.b.getContext())) {
            i4 = 2;
        }
        jSONObject.putOpt("network_is_wifi", Integer.valueOf(i4));
    }

    public static void vv(DownloadInfo downloadInfo, JSONObject jSONObject) {
        try {
            p(downloadInfo, jSONObject);
            com.ss.android.downloadad.api.vv.m vv = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
            if (vv == null) {
                return;
            }
            jSONObject.put("is_update_download", vv.nn() ? 1 : 2);
            vv(vv, jSONObject);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void vv(com.ss.android.downloadad.api.vv.m mVar, JSONObject jSONObject) {
        if (jSONObject == null || mVar == null) {
            return;
        }
        try {
            jSONObject.put("is_patch_apply_handled", mVar.to() ? 1 : 0);
            jSONObject.put("origin_mime_type", mVar.qb());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void vv(JSONObject jSONObject, int i4) {
        if (jSONObject == null) {
            return;
        }
        JSONArray o4 = com.ss.android.socialbase.downloader.n.vv.vv(i4).o("ah_report_config");
        if (o4 != null) {
            for (int i5 = 0; i5 < o4.length(); i5++) {
                try {
                    String string = o4.getString(i5);
                    n.vv vv = com.ss.android.socialbase.appdownloader.u.vv.vv(string);
                    if (vv != null) {
                        String replaceAll = string.replaceAll("\\.", "_");
                        jSONObject.put(replaceAll, vv.u() + "_" + vv.n());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        try {
            jSONObject.put("is_unknown_source_enabled", com.ss.android.socialbase.appdownloader.m.vv(com.ss.android.socialbase.downloader.downloader.p.ky()) ? 1 : 2);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject vv(@NonNull JSONObject jSONObject, com.ss.android.downloadad.api.vv.vv vvVar) {
        jh.vv(jSONObject, "open_url", jh.vv(vvVar.u(), "open_url_not_exist"));
        return jSONObject;
    }

    public static void vv(@NonNull JSONObject jSONObject) {
        try {
            jSONObject.putOpt("harmony_api_version", com.ss.android.socialbase.appdownloader.u.i.vv());
            jSONObject.putOpt("harmony_release_type", com.ss.android.socialbase.appdownloader.u.i.p());
            jSONObject.putOpt("harmony_build_version", com.ss.android.socialbase.appdownloader.u.i.i());
            int i4 = 1;
            jSONObject.putOpt("pure_mode", Integer.valueOf(com.ss.android.socialbase.appdownloader.u.i.vv(com.ss.android.downloadlib.addownload.b.getContext()) ? 1 : 2));
            jSONObject.putOpt("pure_mode_enable", Integer.valueOf(com.ss.android.socialbase.appdownloader.u.i.o() ? 1 : 2));
            jSONObject.putOpt("harmony_version", com.ss.android.socialbase.appdownloader.u.i.m());
            jSONObject.putOpt("pure_enhanced_mode", Integer.valueOf(com.ss.android.socialbase.appdownloader.u.i.m(com.ss.android.downloadlib.addownload.b.getContext()) ? 1 : 2));
            if (!com.ss.android.socialbase.appdownloader.u.i.u()) {
                i4 = 2;
            }
            jSONObject.putOpt("pure_enhanced_mode_enable", Integer.valueOf(i4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static JSONObject m(@NonNull JSONObject jSONObject, com.ss.android.downloadad.api.vv.vv vvVar) {
        jh.vv(jSONObject, com.ss.android.socialbase.appdownloader.u.o.k().replaceAll("\\.", "_") + " versionCode", Integer.valueOf(jh.m(com.ss.android.downloadlib.addownload.b.getContext(), com.ss.android.socialbase.appdownloader.u.o.k())));
        jh.vv(jSONObject, com.ss.android.socialbase.appdownloader.u.o.k().replaceAll("\\.", "_") + " versionName", jh.p(com.ss.android.downloadlib.addownload.b.getContext(), com.ss.android.socialbase.appdownloader.u.o.k()));
        return jSONObject;
    }
}
