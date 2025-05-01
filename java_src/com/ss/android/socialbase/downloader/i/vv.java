package com.ss.android.socialbase.downloader.i;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.n;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.o;
import com.ss.android.socialbase.downloader.network.wv;
import com.ss.android.socialbase.downloader.wv.u;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {
    public static void vv(DownloadTask downloadTask, BaseException baseException, int i4) {
        if (downloadTask == null) {
            return;
        }
        try {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo == null) {
                return;
            }
            l monitorDepend = downloadTask.getMonitorDepend();
            boolean isMonitorStatus = DownloadStatus.isMonitorStatus(i4);
            if (!isMonitorStatus && !(isMonitorStatus = vv(downloadInfo.getExtraMonitorStatus(), i4)) && monitorDepend != null && (monitorDepend instanceof com.ss.android.socialbase.downloader.depend.p)) {
                isMonitorStatus = vv(((com.ss.android.socialbase.downloader.depend.p) monitorDepend).vv(), i4);
            }
            if (isMonitorStatus) {
                t depend = downloadTask.getDepend();
                if (depend != null) {
                    depend.vv(downloadInfo, baseException, i4);
                }
                vv(monitorDepend, downloadInfo, baseException, i4);
                vv(com.ss.android.socialbase.downloader.downloader.p.n(), downloadInfo, baseException, i4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean vv(int[] iArr, int i4) {
        if (iArr != null && iArr.length > 0) {
            for (int i5 : iArr) {
                if (i4 == i5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void vv(l lVar, DownloadInfo downloadInfo, BaseException baseException, int i4) {
        if (lVar == null) {
            return;
        }
        try {
            String m4 = lVar.m();
            if (TextUtils.isEmpty(m4)) {
                m4 = "default";
            }
            JSONObject vv = vv(m4, downloadInfo, baseException, i4);
            if (vv == null) {
                vv = new JSONObject();
            }
            lVar.vv(vv);
        } catch (Throwable unused) {
        }
    }

    public static void vv(m mVar, DownloadInfo downloadInfo, BaseException baseException, int i4) {
        if (mVar == null || !downloadInfo.isNeedSDKMonitor() || TextUtils.isEmpty(downloadInfo.getMonitorScene())) {
            return;
        }
        try {
            JSONObject vv = vv(downloadInfo.getMonitorScene(), downloadInfo, baseException, i4);
            if (vv == null) {
                vv = new JSONObject();
            }
            if (i4 == -1) {
                vv.put("status", baseException.getErrorCode());
            } else {
                vv(i4, vv, downloadInfo);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void vv(int i4, JSONObject jSONObject, DownloadInfo downloadInfo) throws JSONException {
        String str;
        if (i4 == -5) {
            str = "download_uncomplete";
        } else if (i4 == -4) {
            str = "download_cancel";
        } else if (i4 != -3) {
            str = i4 != -2 ? i4 != 0 ? i4 != 2 ? i4 != 6 ? "" : "download_first_start" : "download_start" : "download_create" : "download_pause";
        } else {
            double downloadSpeed = downloadInfo.getDownloadSpeed();
            if (downloadSpeed >= 0.0d) {
                jSONObject.put("download_speed", downloadSpeed);
            }
            str = "download_success";
        }
        jSONObject.put("status", str);
    }

    public static String vv(String str) {
        try {
            return TextUtils.isDigitsOnly(str) ? String.valueOf(Long.valueOf(str).longValue() % 100) : "";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private static JSONObject vv(String str, DownloadInfo downloadInfo, BaseException baseException, int i4) {
        String str2;
        String str3;
        String str4;
        int i5;
        String str5;
        String str6;
        String str7;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                d b5 = com.ss.android.socialbase.downloader.downloader.p.b();
                if (b5 != null) {
                    str2 = b5.m();
                    str3 = vv(str2);
                    str4 = b5.vv();
                    i5 = b5.p();
                } else {
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    i5 = 0;
                }
                String vv = (baseException == null || !(baseException instanceof n)) ? "" : ((n) baseException).vv();
                jSONObject2.put("event_page", str);
                jSONObject2.put(PluginConstants.KEY_APP_ID, str4);
                jSONObject2.put("device_id", str2);
                jSONObject2.put("device_id_postfix", str3);
                jSONObject2.put("update_version", i5);
                jSONObject2.put("download_status", i4);
                if (downloadInfo != null) {
                    jSONObject2.put("setting_tag", com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).p("setting_tag"));
                    jSONObject2.put("download_id", downloadInfo.getId());
                    jSONObject2.put("name", downloadInfo.getName());
                    jSONObject2.put("url", downloadInfo.getUrl());
                    jSONObject2.put("save_path", downloadInfo.getSavePath());
                    jSONObject2.put("download_time", downloadInfo.getDownloadTime());
                    jSONObject2.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject2.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject2.put("network_quality", downloadInfo.getNetworkQuality());
                    int i6 = 1;
                    jSONObject2.put("only_wifi", downloadInfo.isOnlyWifi() ? 1 : 0);
                    jSONObject2.put("need_https_degrade", downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0);
                    jSONObject2.put("https_degrade_retry_used", downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
                    jSONObject2.put("md5", downloadInfo.getMd5() == null ? "" : downloadInfo.getMd5());
                    jSONObject2.put("chunk_count", downloadInfo.getChunkCount());
                    jSONObject2.put("is_force", downloadInfo.isForce() ? 1 : 0);
                    jSONObject2.put("retry_count", downloadInfo.getRetryCount());
                    jSONObject2.put("cur_retry_time", downloadInfo.getCurRetryTime());
                    jSONObject2.put("need_retry_delay", downloadInfo.isNeedRetryDelay() ? 1 : 0);
                    jSONObject2.put("need_reuse_first_connection", downloadInfo.isNeedReuseFirstConnection() ? 1 : 0);
                    jSONObject2.put("default_http_service_backup", downloadInfo.isNeedDefaultHttpServiceBackUp() ? 1 : 0);
                    jSONObject2.put("retry_delay_status", downloadInfo.getRetryDelayStatus().ordinal());
                    jSONObject2.put("backup_url_used", downloadInfo.isBackUpUrlUsed() ? 1 : 0);
                    jSONObject2.put("download_byte_error_retry_status", downloadInfo.getByteInvalidRetryStatus().ordinal());
                    jSONObject2.put("forbidden_handler_status", downloadInfo.getAsyncHandleStatus().ordinal());
                    jSONObject2.put("need_independent_process", downloadInfo.isNeedIndependentProcess() ? 1 : 0);
                    jSONObject2.put("head_connection_error_msg", downloadInfo.getHeadConnectionException() != null ? downloadInfo.getHeadConnectionException() : "");
                    jSONObject2.put("extra", downloadInfo.getExtra() != null ? downloadInfo.getExtra() : "");
                    if (!downloadInfo.isAddListenerToSameTask()) {
                        i6 = 0;
                    }
                    jSONObject2.put("add_listener_to_same_task", i6);
                    jSONObject2.put("backup_url_count", downloadInfo.getBackUpUrls() != null ? downloadInfo.getBackUpUrls().size() : 0);
                    jSONObject2.put("cur_backup_url_index", downloadInfo.getBackUpUrls() != null ? downloadInfo.getCurBackUpUrlIndex() : -1);
                    jSONObject2.put("forbidden_urls", downloadInfo.getForbiddenBackupUrls() != null ? downloadInfo.getForbiddenBackupUrls().toString() : "");
                    jSONObject2.put("task_id", TextUtils.isEmpty(downloadInfo.getTaskId()) ? "" : downloadInfo.getTaskId());
                    String url = downloadInfo.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        str5 = "";
                        str6 = str5;
                        str7 = str6;
                    } else {
                        Uri parse = Uri.parse(url);
                        str6 = parse.getHost();
                        str7 = parse.getPath();
                        str5 = parse.getLastPathSegment();
                        if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str5)) {
                            try {
                                str7 = str7.substring(0, str7.length() - str5.length());
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                    jSONObject2.put("url_host", str6);
                    jSONObject2.put("url_path", str7);
                    jSONObject2.put("url_last_path_segment", str5);
                }
                jSONObject2.put("error_code", baseException != null ? baseException.getErrorCode() : 0);
                jSONObject2.put("error_msg", baseException != null ? baseException.getErrorMessage() : "");
                jSONObject2.put("request_log", vv);
                return jSONObject2;
            } catch (JSONException e5) {
                e = e5;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e6) {
            e = e6;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:11|(4:65|66|67|(15:69|70|14|(2:46|(1:(2:54|(1:56)(2:57|58)))(1:51))|17|(2:21|22)|25|26|27|(1:29)|30|31|(1:41)|34|(2:38|39)(1:37)))|13|14|(0)|46|(1:48)|(0)|17|(3:19|21|22)|25|26|27|(0)|30|31|(0)|41|34|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #5 {all -> 0x0132, blocks: (B:18:0x002f, B:20:0x0033, B:43:0x007e, B:45:0x0094, B:48:0x00a7, B:49:0x00ac, B:51:0x00e7, B:52:0x00f8, B:63:0x0124, B:59:0x011c, B:55:0x0113, B:26:0x0047, B:28:0x004d, B:33:0x0058, B:36:0x0065, B:40:0x006b, B:42:0x0077, B:13:0x0025), top: B:75:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7 A[Catch: JSONException -> 0x0112, all -> 0x0132, TryCatch #0 {JSONException -> 0x0112, blocks: (B:49:0x00ac, B:51:0x00e7, B:52:0x00f8), top: B:69:0x00ac, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vv(@androidx.annotation.Nullable com.ss.android.socialbase.downloader.network.n r13, java.lang.String r14, java.lang.String r15, long r16, java.lang.String r18, int r19, java.io.IOException r20, com.ss.android.socialbase.downloader.model.DownloadInfo r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.i.vv.vv(com.ss.android.socialbase.downloader.network.n, java.lang.String, java.lang.String, long, java.lang.String, int, java.io.IOException, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static void vv(com.ss.android.socialbase.downloader.n.vv vvVar, DownloadInfo downloadInfo, String str, wv wvVar, boolean z4, boolean z5, BaseException baseException, long j4, long j5, boolean z6, long j6, long j7, long j8, JSONObject jSONObject) {
        vv("download_io", vvVar.m("monitor_download_io"), vvVar, downloadInfo, str, null, null, wvVar, z4, z5, baseException, j4, j5, z6, j6, j7, j8, null);
    }

    public static void vv(com.ss.android.socialbase.downloader.n.vv vvVar, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z4, wv wvVar, BaseException baseException, long j4, long j5) {
        vv("segment_io", vvVar.m("monitor_segment_io"), vvVar, downloadInfo, str, str2, str3, wvVar, z4, false, baseException, j4, j5, false, -1L, -1L, -1L, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4 */
    private static void vv(String str, int i4, com.ss.android.socialbase.downloader.n.vv vvVar, DownloadInfo downloadInfo, String str2, String str3, String str4, wv wvVar, boolean z4, boolean z5, BaseException baseException, long j4, long j5, boolean z6, long j6, long j7, long j8, JSONObject jSONObject) {
        String str5;
        int i5;
        String str6;
        long j9;
        int i6;
        int i7;
        if (i4 <= 0 || j5 <= 0) {
            return;
        }
        try {
            Uri parse = Uri.parse(str2);
            String host = parse.getHost();
            String path = parse.getPath();
            String lastPathSegment = parse.getLastPathSegment();
            if (!TextUtils.isEmpty(path) && !TextUtils.isEmpty(lastPathSegment)) {
                try {
                    path = path.substring(0, path.length() - lastPathSegment.length());
                } catch (Throwable unused) {
                }
            }
            if (z4) {
                str5 = null;
                i5 = 1;
            } else if (z5) {
                str5 = null;
                i5 = 2;
            } else if (baseException != null) {
                i5 = !u.p(com.ss.android.socialbase.downloader.downloader.p.ky()) ? 1049 : baseException.getErrorCode();
                str5 = baseException.getErrorMessage();
            } else {
                str5 = null;
                i5 = 0;
            }
            JSONObject jSONObject2 = new JSONObject();
            str6 = "";
            if (wvVar != null) {
                i7 = wvVar instanceof o ? 0 : 1;
                String vv = wvVar.vv("X-Cache");
                int contains = TextUtils.isEmpty(vv) ? -1 : vv.toLowerCase().contains("hit");
                vvVar.vv("monitor_sla", 1);
                str6 = wvVar instanceof com.ss.android.socialbase.downloader.network.vv ? ((com.ss.android.socialbase.downloader.network.vv) wvVar).u() : "";
                j9 = j4;
                i6 = contains;
            } else {
                j9 = j4;
                i6 = -1;
                i7 = -1;
            }
            double d5 = j9;
            Double.isNaN(d5);
            double d6 = d5 / 1048576.0d;
            double d7 = j5;
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            Double.isNaN(d7);
            Double.isNaN(nanos);
            double d8 = d7 / nanos;
            jSONObject2.put("setting_tag", vvVar.p("setting_tag"));
            jSONObject2.put("url_host", host);
            jSONObject2.putOpt("host_ip", str3);
            jSONObject2.putOpt("host_real_ip", str4);
            jSONObject2.put("url_path", path);
            jSONObject2.put("url_last_path_segment", lastPathSegment);
            jSONObject2.put("net_lib", i7);
            jSONObject2.put("hit_cdn_cache", i6);
            jSONObject2.put("status_code", i5);
            jSONObject2.put("request_log", str6);
            if (str5 != null) {
                jSONObject2.put("error_msg", u.vv(str5, vvVar.vv("exception_msg_length", 500)));
            }
            jSONObject2.put("download_sec", d8);
            jSONObject2.put("download_mb", d6);
            if (d8 > 0.0d) {
                jSONObject2.put("download_speed", d6 / d8);
            }
            if (z6) {
                double d9 = j6;
                Double.isNaN(d9);
                Double.isNaN(d7);
                jSONObject2.put("rw_read_time", d9 / d7);
                double d10 = j7;
                Double.isNaN(d10);
                Double.isNaN(d7);
                jSONObject2.put("rw_write_time", d10 / d7);
                double d11 = j8;
                Double.isNaN(d11);
                Double.isNaN(d7);
                jSONObject2.put("rw_sync_time", d11 / d7);
            }
            jSONObject2.put("pkg_name", downloadInfo.getPackageName());
            jSONObject2.put("name", downloadInfo.getTitle());
            if (i4 != 1) {
                if (i4 == 3) {
                }
                if (i4 != 2 || i4 == 3) {
                    com.ss.android.socialbase.downloader.downloader.p.ds().vv(downloadInfo.getId(), str, jSONObject2);
                }
                return;
            }
            com.ss.android.socialbase.downloader.downloader.p.n();
            if (i4 != 2) {
            }
            com.ss.android.socialbase.downloader.downloader.p.ds().vv(downloadInfo.getId(), str, jSONObject2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void vv(DownloadInfo downloadInfo, List<com.ss.android.socialbase.downloader.u.wv> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("segments", com.ss.android.socialbase.downloader.u.wv.vv(list));
            jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
            jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
            p ds = com.ss.android.socialbase.downloader.downloader.p.ds();
            if (ds != null) {
                ds.vv(downloadInfo.getId(), "segments_error", jSONObject);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
