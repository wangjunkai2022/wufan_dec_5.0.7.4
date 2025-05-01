package com.ss.android.downloadlib.n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.join.mgps.data.c;
import com.ss.android.download.api.download.DownloadModel;
import com.umeng.analytics.pro.bm;
import org.json.JSONObject;
import q.a;
/* loaded from: classes5.dex */
public class o {
    public static boolean i(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("clean_fetch_apk_switch", 0L) == 1;
    }

    @NonNull
    public static com.ss.android.socialbase.downloader.n.vv m(DownloadModel downloadModel) {
        return com.ss.android.socialbase.downloader.n.vv.vv(vv(downloadModel));
    }

    public static boolean n(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("clean_app_cache_dir", 0) == 1;
    }

    public static boolean o(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("clean_space_before_download_switch", 0L) == 1;
    }

    public static int p(@NonNull DownloadModel downloadModel) {
        return vv(m(downloadModel));
    }

    public static boolean u(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("clean_space_switch", 0) == 1;
    }

    @Nullable
    public static JSONObject vv() {
        return com.ss.android.downloadlib.addownload.b.wv().optJSONObject(bm.aA);
    }

    public static long i() {
        long optLong = com.ss.android.downloadlib.addownload.b.wv().optLong("start_install_interval");
        return optLong == 0 ? a.f73127b : optLong;
    }

    public static boolean m(com.ss.android.downloadad.api.vv.vv vvVar) {
        return vv(vvVar).vv("pause_reserve_on_wifi", 0) == 1 && vvVar.d();
    }

    public static long o() {
        long optLong = com.ss.android.downloadlib.addownload.b.wv().optLong("next_install_min_interval");
        return optLong == 0 ? c.f49010a : optLong;
    }

    public static JSONObject vv(DownloadModel downloadModel) {
        if (downloadModel == null) {
            return null;
        }
        return downloadModel.isAd() ? jh.vv(com.ss.android.downloadlib.addownload.b.wv(), downloadModel.getDownloadSettings()) : downloadModel.getDownloadSettings();
    }

    public static boolean p(com.ss.android.downloadad.api.vv.vv vvVar) {
        return vv(vvVar).vv("cancel_pause_optimise_wifi_retain_switch", 0) == 1 && vvVar.d();
    }

    public static long m(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("storage_min_size", 0L);
    }

    public static boolean m(com.ss.android.socialbase.downloader.n.vv vvVar) {
        return vvVar != null && vvVar.vv("kllk_need_rename_apk", 0) == 1;
    }

    public static long p(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("clean_fetch_apk_head_time_out", 800L);
    }

    @NonNull
    public static com.ss.android.socialbase.downloader.n.vv vv(com.ss.android.downloadad.api.vv.vv vvVar) {
        if (vvVar == null) {
            return com.ss.android.socialbase.downloader.n.vv.p();
        }
        if (vvVar.la() != 0) {
            return com.ss.android.socialbase.downloader.n.vv.vv(vvVar.la());
        }
        if (vvVar.p()) {
            return com.ss.android.socialbase.downloader.n.vv.vv(vv());
        }
        if (vvVar.g() != null) {
            return com.ss.android.socialbase.downloader.n.vv.vv(vvVar.g());
        }
        return com.ss.android.socialbase.downloader.n.vv.p();
    }

    public static boolean m() {
        return com.ss.android.socialbase.downloader.n.vv.p().vv("fix_notification_anr");
    }

    public static boolean p() {
        return com.ss.android.downloadlib.addownload.b.wv().optInt("is_enable_start_install_again") == 1;
    }

    public static int vv(@NonNull com.ss.android.socialbase.downloader.n.vv vvVar) {
        return vvVar.vv("external_storage_permission_path_type", 0);
    }

    public static double vv(int i4) {
        return com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("clean_min_install_size", 0.0d);
    }
}
