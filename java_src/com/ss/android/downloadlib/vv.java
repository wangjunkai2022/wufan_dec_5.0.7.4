package com.ss.android.downloadlib;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.kwad.library.solder.lib.ext.PluginError;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.m.i;
import com.ss.android.downloadlib.addownload.m.wv;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.socialbase.appdownloader.m;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.c;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.vv.vv;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.a;
/* loaded from: classes5.dex */
public class vv implements com.ss.android.downloadad.api.vv, m.p, c, vv.InterfaceC0653vv {

    /* renamed from: i  reason: collision with root package name */
    private static volatile vv f60741i = null;
    private static String vv = "vv";

    /* renamed from: m  reason: collision with root package name */
    private long f60742m;

    /* renamed from: p  reason: collision with root package name */
    private m f60743p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class m implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        private int f60751i;

        /* renamed from: m  reason: collision with root package name */
        private int f60752m;

        /* renamed from: o  reason: collision with root package name */
        private long f60753o;

        /* renamed from: p  reason: collision with root package name */
        private long f60754p;
        private long vv;

        /* JADX INFO: Access modifiers changed from: private */
        public void m() {
            this.f60753o = System.currentTimeMillis();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (vv()) {
                    vv.vv().vv(this.vv, this.f60752m);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private m(long j4, int i4, long j5, int i5) {
            this.vv = j4;
            this.f60752m = i4;
            this.f60754p = j5;
            this.f60751i = i5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
            if (r9 < r1) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean vv() {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.vv.m.vv():boolean");
        }

        private int vv(boolean z4, com.ss.android.downloadad.api.vv.m mVar, DownloadInfo downloadInfo, boolean z5, JSONObject jSONObject) {
            com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
            int i4 = 1;
            if (vv.vv("install_failed_check_ttmd5", 1) == 1) {
                int checkMd5Status = downloadInfo.checkMd5Status();
                try {
                    jSONObject.put("ttmd5_status", checkMd5Status);
                } catch (Throwable unused) {
                }
                if (!com.ss.android.socialbase.downloader.wv.u.vv(checkMd5Status)) {
                    return PluginError.ERROR_UPD_CAPACITY;
                }
            }
            int i5 = this.f60751i;
            if (i5 != 2000) {
                return i5;
            }
            if (vv.vv("install_failed_check_signature", 1) == 1 && jh.o(b.getContext(), mVar.o())) {
                if (!jh.vv(jh.wv(b.getContext(), downloadInfo.getTargetFilePath()), jh.qv(b.getContext(), mVar.o()))) {
                    return PluginError.ERROR_UPD_REQUEST;
                }
            }
            if (z4) {
                long j4 = this.f60753o;
                long j5 = this.f60754p;
                if (j4 > j5) {
                    try {
                        jSONObject.put("install_time", j4 - j5);
                        if (mVar.pd() <= this.f60754p) {
                            i4 = 0;
                        }
                        jSONObject.put("install_again", i4);
                    } catch (Throwable unused2) {
                    }
                    if (z5) {
                        return PluginError.ERROR_UPD_EXTRACT;
                    }
                    return 2003;
                }
                return 2000;
            }
            return 2002;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class p implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final com.ss.android.downloadad.api.vv.m f60755m;

        public p(com.ss.android.downloadad.api.vv.m mVar) {
            this.f60755m = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    this.f60755m.k(true);
                    vv.this.p(this.f60755m);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } finally {
                this.f60755m.k(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: com.ss.android.downloadlib.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class RunnableC0618vv implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final int f60756m;

        public RunnableC0618vv(int i4) {
            this.f60756m = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.ss.android.downloadlib.addownload.m.u.vv().m();
                ConcurrentHashMap<Long, com.ss.android.downloadad.api.vv.m> p4 = com.ss.android.downloadlib.addownload.m.u.vv().p();
                if (p4 == null || p4.isEmpty()) {
                    return;
                }
                vv.this.vv(p4, this.f60756m);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private vv() {
        com.ss.android.socialbase.appdownloader.m.vv(this);
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(this);
    }

    public static JSONObject m(JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (jSONObject == null || downloadInfo == null || com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("download_event_opt", 1) == 0) {
            return jSONObject;
        }
        try {
            long m4 = jh.m(0L);
            double d5 = m4;
            Double.isNaN(d5);
            jSONObject.put("available_space", d5 / 1048576.0d);
            long totalBytes = downloadInfo.getTotalBytes();
            double d6 = totalBytes;
            Double.isNaN(d6);
            jSONObject.put("apk_size", d6 / 1048576.0d);
            if (m4 > 0 && totalBytes > 0) {
                Double.isNaN(d5);
                Double.isNaN(d6);
                jSONObject.put("available_space_ratio", d5 / d6);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void p(com.ss.android.downloadad.api.vv.m mVar) {
        SystemClock.sleep(20000L);
        int i4 = 15;
        while (i4 > 0) {
            if (jh.m(mVar)) {
                vv(mVar.o());
                return;
            }
            i4--;
            if (i4 == 0) {
                return;
            }
            SystemClock.sleep(20000L);
        }
    }

    synchronized void i() {
        m mVar = this.f60743p;
        if (mVar != null) {
            mVar.m();
            this.f60743p = null;
        }
    }

    public static vv vv() {
        if (f60741i == null) {
            synchronized (vv.class) {
                if (f60741i == null) {
                    f60741i = new vv();
                }
            }
        }
        return f60741i;
    }

    private int i(com.ss.android.downloadad.api.vv.m mVar) {
        int realStatus;
        double vv2 = com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("download_failed_finally_hours", 48.0d);
        if (vv2 <= 0.0d) {
            return -1;
        }
        if (System.currentTimeMillis() - mVar.pj() < vv2 * 60.0d * 60.0d * 1000.0d) {
            return 1;
        }
        if (mVar.f60357i.get()) {
            return 0;
        }
        DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(mVar.la());
        if (downloadInfo == null || (realStatus = downloadInfo.getRealStatus()) == -3 || realStatus == -4) {
            return -1;
        }
        if (!DownloadStatus.isDownloading(realStatus) && mVar.f60357i.compareAndSet(false, true)) {
            try {
                JSONObject jSONObject = new JSONObject();
                vv(jSONObject, downloadInfo);
                jSONObject.putOpt("download_status", Integer.valueOf(realStatus));
                jSONObject.putOpt("fail_status", Integer.valueOf(mVar.a()));
                jSONObject.putOpt("fail_msg", mVar.c());
                jSONObject.put("download_failed_times", mVar.l());
                if (downloadInfo.getTotalBytes() > 0) {
                    double curBytes = downloadInfo.getCurBytes();
                    double totalBytes = downloadInfo.getTotalBytes();
                    Double.isNaN(curBytes);
                    Double.isNaN(totalBytes);
                    jSONObject.put("download_percent", curBytes / totalBytes);
                }
                jSONObject.put("is_update_download", mVar.nn() ? 1 : 2);
                com.ss.android.downloadlib.i.vv.vv().vv(mVar.k(), "download_failed_finally", jSONObject, mVar);
                wv.vv().vv(mVar);
                return 0;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 1;
    }

    public static String p(@NonNull DownloadInfo downloadInfo, @NonNull com.ss.android.downloadad.api.vv.m mVar) {
        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        String str = null;
        if (file.exists()) {
            try {
                PackageInfo packageArchiveInfo = b.getContext().getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), com.ss.android.socialbase.appdownloader.p.vv());
                if (packageArchiveInfo != null) {
                    str = packageArchiveInfo.packageName;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(str) && !str.equals(downloadInfo.getPackageName())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("real_package_name", str);
                jSONObject.put("input_package_name", downloadInfo.getPackageName());
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            com.ss.android.downloadlib.i.vv.vv().vv("embeded_ad", "package_name_error", jSONObject, mVar);
            return str;
        }
        return downloadInfo.getPackageName();
    }

    @WorkerThread
    public static synchronized void vv(DownloadInfo downloadInfo, com.ss.android.downloadad.api.vv.m mVar) {
        synchronized (vv.class) {
            if (downloadInfo == null) {
                com.ss.android.downloadlib.o.p.vv().vv("onDownloadFinish info null");
            } else if (mVar == null) {
                com.ss.android.downloadlib.o.p.vv().vv("onDownloadFinish nativeModel null");
            } else if (mVar.zn() != 1) {
            } else {
                com.ss.android.downloadlib.p.qv.vv().i(mVar);
                String p4 = p(downloadInfo, mVar);
                com.ss.android.downloadlib.addownload.m.u.vv().m(downloadInfo.getUrl(), p4);
                Map<Long, com.ss.android.downloadad.api.vv.m> vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo.getUrl(), p4);
                mVar.u(System.currentTimeMillis());
                mVar.o(2);
                mVar.m(p4);
                vv2.put(Long.valueOf(mVar.m()), mVar);
                wv.vv().vv(vv2.values());
                m(mVar);
                n.vv().vv(downloadInfo, p4);
                if ("application/vnd.android.package-archive".equals(downloadInfo.getMimeType())) {
                    vv().vv(mVar);
                    vv().m(downloadInfo, mVar);
                    if (mVar.tf()) {
                        com.ss.android.downloadlib.addownload.vv.vv.vv().vv(downloadInfo.getId(), mVar.m(), mVar.jh(), p4, downloadInfo.getTitle(), mVar.i(), downloadInfo.getTargetFilePath());
                    }
                    mVar.m();
                    mVar.i();
                }
            }
        }
    }

    public void m(DownloadInfo downloadInfo, final com.ss.android.downloadad.api.vv.m mVar) {
        if (downloadInfo == null || mVar == null || com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("install_finish_check_ttmd5", 1) == 0) {
            return;
        }
        final String targetFilePath = downloadInfo.getTargetFilePath();
        if (TextUtils.isEmpty(targetFilePath)) {
            return;
        }
        i.vv().m(new Runnable() { // from class: com.ss.android.downloadlib.vv.3
            @Override // java.lang.Runnable
            public void run() {
                String vv2 = com.ss.android.downloadlib.n.vv.vv(targetFilePath);
                if (TextUtils.isEmpty(vv2)) {
                    return;
                }
                b.getContext().getSharedPreferences("sp_ttdownloader_md5", 0).edit().putString(String.valueOf(mVar.m()), vv2).apply();
            }
        });
    }

    private static void m(com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar == null) {
            return;
        }
        String s4 = TextUtils.isEmpty(mVar.s()) ? "" : mVar.s();
        DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(mVar.la());
        mVar.jh("");
        wv.vv().vv(mVar);
        JSONObject vv2 = vv(new JSONObject(), downloadInfo);
        int i4 = 1;
        try {
            vv2.putOpt("finish_reason", s4);
            vv2.putOpt("finish_from_reserve_wifi", Integer.valueOf(downloadInfo.isDownloadFromReserveWifi() ? 1 : 0));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadad.api.vv.m vv3 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
        com.ss.android.downloadlib.n.u.vv(vv2, downloadInfo.getId());
        try {
            vv2.put("download_failed_times", vv3.l());
            vv2.put("can_show_notification", com.ss.android.socialbase.appdownloader.o.i.vv() ? 1 : 2);
            if (downloadInfo.getExpectFileLength() > 0 && downloadInfo.getTotalBytes() > 0) {
                vv2.put("file_length_gap", downloadInfo.getExpectFileLength() - downloadInfo.getTotalBytes());
            }
            vv2.put("ttmd5_status", downloadInfo.getTTMd5CheckStatus());
            vv2.put("has_send_download_failed_finally", vv3.f60357i.get() ? 1 : 2);
            if (!vv3.nn()) {
                i4 = 2;
            }
            vv2.put("is_update_download", i4);
            com.ss.android.downloadlib.n.u.vv(vv3, vv2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().m("download_finish", vv2, mVar);
    }

    @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
    public void p() {
        com.ss.android.socialbase.downloader.p.vv.m(vv, "onAppBackground()");
        vv(6);
    }

    @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
    public void m() {
        com.ss.android.socialbase.downloader.p.vv.m(vv, "onAppForeground()");
        i();
        vv(5);
    }

    @WorkerThread
    public synchronized void vv(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!jh.m()) {
            final com.ss.android.downloadad.api.vv.m vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(str);
            if (vv2 == null) {
                com.ss.android.downloadlib.addownload.m.i.vv().vv(str);
                return;
            }
            com.ss.android.downloadlib.addownload.o vv3 = n.vv().vv(vv2.vv());
            if (vv3 != null) {
                vv3.u();
            }
            if (vv2.f60364p.get()) {
                return;
            }
            if (com.ss.android.socialbase.downloader.n.vv.vv(vv2.la()).m("notification_opt_2") == 1) {
                com.ss.android.socialbase.downloader.notification.m.vv().u(vv2.la());
            }
            new com.ss.android.downloadlib.m.m().vv(vv2, new com.ss.android.downloadlib.m.n() { // from class: com.ss.android.downloadlib.vv.1
                @Override // com.ss.android.downloadlib.m.n
                public void vv(boolean z4) {
                    com.ss.android.socialbase.downloader.p.vv.m(vv.vv, "appBackForeground->".concat(String.valueOf(z4)));
                    if (z4) {
                        if (!(com.ss.android.downloadlib.m.u.p(vv2) ? com.ss.android.downloadlib.m.vv.vv(str, vv2) : false) && com.ss.android.downloadlib.m.u.i(vv2) && vv2.cq() == 4) {
                            com.ss.android.downloadlib.addownload.vv.vv.vv().vv(vv2);
                        }
                    } else if (com.ss.android.downloadlib.m.vv.vv(str, vv2) || vv2.cq() != 4) {
                    } else {
                        com.ss.android.downloadlib.addownload.vv.vv.vv().vv(vv2);
                    }
                }
            }, com.ss.android.downloadlib.n.o.vv(vv2).vv("try_applink_delay_after_installed", 0));
            com.ss.android.downloadlib.p.qv.vv().u(vv2);
            vv(str, vv2);
            com.ss.android.downloadlib.addownload.vv.vv.vv().m(str);
            DownloadInfo vv4 = vv(Downloader.getInstance(b.getContext()).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive"), str);
            if (vv4 != null) {
                if (com.ss.android.socialbase.downloader.n.vv.vv(vv4.getId()).m("no_hide_notification") != 1) {
                    com.ss.android.socialbase.downloader.notification.m.vv().vv(vv4.getId());
                }
                n.vv().m(vv4, str);
                com.ss.android.downloadlib.addownload.p.i.vv(vv4);
                return;
            }
            n.vv().m(null, str);
            return;
        }
        throw new RuntimeException("handleAppInstalled in main thread.");
    }

    private JSONObject m(@NonNull DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.vv vvVar) {
        com.ss.android.downloadad.api.vv.m vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
        if (vv2 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        vvVar.vv(jSONObject);
        try {
            jSONObject.put("download_id", downloadInfo.getId());
            jSONObject.put("name", downloadInfo.getName());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.ss.android.downloadlib.n.u.vv(jSONObject, downloadInfo.getId());
        com.ss.android.downloadlib.i.vv.vv().vv("embeded_ad", "ah_result", jSONObject, vv2);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(DownloadInfo downloadInfo, com.ss.android.downloadad.api.vv.m mVar, int i4) {
        long max;
        if (downloadInfo == null || mVar == null) {
            return;
        }
        i();
        long currentTimeMillis = System.currentTimeMillis();
        mVar.m(currentTimeMillis);
        mVar.n(jh.vv(Environment.getDataDirectory(), -1L));
        if (i4 != 2000) {
            max = 2000;
        } else {
            long vv2 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("check_install_failed_delay_time", 120000L);
            if (vv2 < 0) {
                return;
            }
            max = Math.max(vv2, 30000L);
        }
        long j4 = max;
        m mVar2 = new m(mVar.m(), downloadInfo.getId(), currentTimeMillis, i4);
        i.vv().vv(mVar2, j4);
        this.f60743p = mVar2;
        wv.vv().vv(mVar);
    }

    public void vv(final long j4, int i4) {
        long vv2 = com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("check_install_finish_hijack_delay_time", 900000L);
        if (vv2 < 0) {
            return;
        }
        i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.vv.2
            @Override // java.lang.Runnable
            public void run() {
                vv.vv().vv(j4);
            }
        }, Math.max(vv2, (long) a.f73127b));
    }

    public void vv(long j4) {
        i.vv vv2;
        int i4;
        try {
            com.ss.android.downloadad.api.vv.m i5 = com.ss.android.downloadlib.addownload.m.u.vv().i(j4);
            if (i5 != null && !jh.m(i5) && !i5.f60364p.get()) {
                Pair<i.vv, Integer> m4 = com.ss.android.downloadlib.addownload.m.i.vv().m(i5);
                if (m4 != null) {
                    vv2 = (i.vv) m4.first;
                    i4 = ((Integer) m4.second).intValue();
                } else {
                    vv2 = com.ss.android.downloadlib.addownload.m.i.vv().vv(i5);
                    i4 = -1;
                }
                if (vv2 == null) {
                    return;
                }
                com.ss.android.downloadlib.addownload.m.i.vv().m(vv2.vv);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("installed_app_name", vv2.f60497i);
                jSONObject.put("installed_pkg_name", vv2.vv);
                if (i4 != -1) {
                    jSONObject.put("error_code", i4);
                    com.ss.android.downloadlib.n.u.vv(jSONObject, i5.la());
                    com.ss.android.downloadlib.i.vv.vv().m("install_finish_hijack", jSONObject, i5);
                    return;
                }
                com.ss.android.downloadlib.i.vv.vv().m("install_finish_may_hijack", jSONObject, i5);
            }
        } catch (Throwable th) {
            com.ss.android.downloadlib.o.p.vv().vv(th, "trySendInstallFinishHijack");
        }
    }

    public void vv(String str, com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar != null && jh.m(mVar) && mVar.f60364p.compareAndSet(false, true)) {
            com.ss.android.downloadlib.i.vv.vv().vv(mVar.k(), "install_finish", vv(mVar, str, mVar.cq() != 4 ? 3 : 4), mVar);
            wv.vv().vv(mVar);
        }
    }

    private static DownloadInfo vv(List<DownloadInfo> list, String str) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null) {
                    if (str.equals(downloadInfo.getPackageName())) {
                        return downloadInfo;
                    }
                    if (jh.vv(b.getContext(), downloadInfo.getTargetFilePath(), str)) {
                        return downloadInfo;
                    }
                }
            }
        }
        return null;
    }

    public static JSONObject vv(JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (jSONObject != null && downloadInfo != null) {
            int i4 = 1;
            if (com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("download_event_opt", 1) == 0) {
                return jSONObject;
            }
            try {
                jSONObject.put("download_id", downloadInfo.getId());
                jSONObject.put("name", downloadInfo.getName());
                jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                jSONObject.put("current_network_quality", com.ss.android.socialbase.downloader.network.b.vv().m().name());
                jSONObject.put("only_wifi", downloadInfo.isOnlyWifi() ? 1 : 0);
                jSONObject.put("need_https_degrade", downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0);
                jSONObject.put("https_degrade_retry_used", downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
                jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                jSONObject.put("retry_count", downloadInfo.getRetryCount());
                jSONObject.put("cur_retry_time", downloadInfo.getCurRetryTime());
                jSONObject.put("need_retry_delay", downloadInfo.isNeedRetryDelay() ? 1 : 0);
                jSONObject.put("backup_url_used", downloadInfo.isBackUpUrlUsed() ? 1 : 0);
                jSONObject.put("head_connection_error_msg", downloadInfo.getHeadConnectionException() != null ? downloadInfo.getHeadConnectionException() : "");
                jSONObject.put("need_independent_process", downloadInfo.isNeedIndependentProcess() ? 1 : 0);
                jSONObject.put("total_retry_count", downloadInfo.getTotalRetryCount());
                jSONObject.put("cur_retry_time_in_total", downloadInfo.getCurRetryTimeInTotal());
                jSONObject.put("real_download_time", downloadInfo.getRealDownloadTime());
                jSONObject.put("first_speed_time", downloadInfo.getFirstSpeedTime());
                jSONObject.put("all_connect_time", downloadInfo.getAllConnectTime());
                jSONObject.put("download_prepare_time", downloadInfo.getDownloadPrepareTime());
                jSONObject.put("download_time", downloadInfo.getRealDownloadTime() + downloadInfo.getAllConnectTime() + downloadInfo.getDownloadPrepareTime());
                jSONObject.put("chunk_downgrade_retry_used", downloadInfo.isChunkDowngradeRetryUsed() ? 1 : 0);
                jSONObject.put("need_chunk_downgrade_retry", downloadInfo.isNeedChunkDowngradeRetry() ? 1 : 0);
                jSONObject.put("failed_resume_count", downloadInfo.getFailedResumeCount());
                jSONObject.put("preconnect_level", downloadInfo.getPreconnectLevel());
                jSONObject.put("md5", downloadInfo.getMd5());
                jSONObject.put("expect_file_length", downloadInfo.getExpectFileLength());
                jSONObject.put("retry_schedule_count", downloadInfo.getRetryScheduleCount());
                jSONObject.put("rw_concurrent", downloadInfo.isRwConcurrent() ? 1 : 0);
                double curBytes = downloadInfo.getCurBytes();
                Double.isNaN(curBytes);
                double d5 = curBytes / 1048576.0d;
                double realDownloadTime = downloadInfo.getRealDownloadTime();
                Double.isNaN(realDownloadTime);
                double d6 = realDownloadTime / 1000.0d;
                if (d5 > 0.0d && d6 > 0.0d) {
                    double d7 = d5 / d6;
                    try {
                        jSONObject.put("download_speed", d7);
                    } catch (Exception unused) {
                    }
                    com.ss.android.socialbase.downloader.p.vv.m(vv, "download speed : " + d7 + "MB/s");
                }
                try {
                    jSONObject.put("is_download_service_foreground", Downloader.getInstance(b.getContext()).isDownloadServiceForeground(downloadInfo.getId()) ? 1 : 0);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (downloadInfo.getBackUpUrls() != null) {
                    jSONObject.put("backup_url_count", downloadInfo.getBackUpUrls().size());
                    jSONObject.put("cur_backup_url_index", downloadInfo.getCurBackUpUrlIndex());
                }
                jSONObject.put("clear_space_restart_times", com.ss.android.downloadlib.addownload.p.i.vv().m(downloadInfo.getUrl()));
                jSONObject.put("mime_type", downloadInfo.getMimeType());
                if (!com.ss.android.socialbase.downloader.wv.u.p(b.getContext())) {
                    i4 = 2;
                }
                jSONObject.put("network_available", i4);
                jSONObject.put("status_code", downloadInfo.getHttpStatusCode());
                m(jSONObject, downloadInfo);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONObject;
    }

    private int vv(com.ss.android.downloadad.api.vv.m mVar, DownloadInfo downloadInfo, String str, JSONObject jSONObject) {
        int m4 = com.ss.android.socialbase.appdownloader.p.m(b.getContext(), downloadInfo);
        int m5 = jh.m(b.getContext(), str);
        if (m4 > 0 && m5 > 0 && m4 != m5) {
            return m5 > m4 ? 3011 : 3010;
        } else if (com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("install_finish_check_ttmd5", 1) == 1) {
            String string = b.getContext().getSharedPreferences("sp_ttdownloader_md5", 0).getString(String.valueOf(mVar.m()), null);
            if (TextUtils.isEmpty(string) && downloadInfo != null) {
                string = com.ss.android.downloadlib.n.vv.vv(downloadInfo.getTargetFilePath());
            }
            int vv2 = com.ss.android.downloadlib.n.vv.vv(string, com.ss.android.downloadlib.n.vv.m(str));
            try {
                jSONObject.put("ttmd5_status", vv2);
            } catch (Throwable unused) {
            }
            if (vv2 == 0) {
                return 3000;
            }
            return vv2 == 1 ? 3002 : 3001;
        } else {
            return 3001;
        }
    }

    @Override // com.ss.android.downloadad.api.vv
    public void vv(int i4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f60742m < 120000) {
            return;
        }
        i.vv().vv(new RunnableC0618vv(i4), this.f60742m > 0 ? 2000L : 8000L);
        this.f60742m = currentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void vv(@NonNull ConcurrentHashMap<Long, com.ss.android.downloadad.api.vv.m> concurrentHashMap, int i4) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (com.ss.android.downloadad.api.vv.m mVar : concurrentHashMap.values()) {
            if (mVar.f60364p.get()) {
                if (currentTimeMillis - mVar.pj() >= com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("start_event_expire_hours", 168) * 60 * 60 * 1000) {
                    arrayList.add(Long.valueOf(mVar.m()));
                }
            } else if (mVar.zn() == 1) {
                if (i(mVar) <= 0 && currentTimeMillis - mVar.pj() >= com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("start_event_expire_hours", 168) * 60 * 60 * 1000) {
                    arrayList.add(Long.valueOf(mVar.m()));
                }
            } else if (mVar.zn() == 2) {
                if (!mVar.yj()) {
                    if (jh.m(mVar)) {
                        if (mVar.cq() == 4) {
                            i4 = mVar.cq();
                        }
                        com.ss.android.downloadlib.i.vv.vv().vv(vv(mVar, mVar.o(), i4), mVar);
                        arrayList.add(Long.valueOf(mVar.m()));
                        com.ss.android.downloadlib.addownload.p.i.vv(mVar);
                    } else if (currentTimeMillis - mVar.pj() >= com.ss.android.socialbase.downloader.n.vv.vv(mVar.la()).vv("finish_event_expire_hours", 168) * 60 * 60 * 1000) {
                        arrayList.add(Long.valueOf(mVar.m()));
                    } else if (TextUtils.isEmpty(mVar.o())) {
                        arrayList.add(Long.valueOf(mVar.m()));
                    }
                }
            } else {
                arrayList.add(Long.valueOf(mVar.m()));
            }
        }
        com.ss.android.downloadlib.addownload.m.u.vv().vv(arrayList);
    }

    @Override // com.ss.android.socialbase.appdownloader.m.p
    public void vv(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.vv vvVar) {
        JSONObject m4;
        if (downloadInfo == null || vvVar == null) {
            return;
        }
        JSONArray o4 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).o("ah_report_config");
        if (vvVar.f60926m != 0) {
            downloadInfo.getTempCacheData().remove("intent");
        }
        if (o4 == null || (m4 = m(downloadInfo, vvVar)) == null) {
            return;
        }
        downloadInfo.getTempCacheData().put("ah_ext_json", m4);
    }

    @Override // com.ss.android.socialbase.downloader.depend.c
    public void vv(@Nullable final DownloadInfo downloadInfo, @Nullable String str) {
        if (downloadInfo == null) {
            com.ss.android.downloadlib.o.p.vv().vv("info is null");
        } else if ((com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo).m("check_applink_mode") & 2) != 0) {
            final JSONObject jSONObject = (JSONObject) downloadInfo.getTempCacheData().get("ah_ext_json");
            com.ss.android.downloadlib.m.o.vv().m(new com.ss.android.downloadlib.m.i() { // from class: com.ss.android.downloadlib.vv.4
                @Override // com.ss.android.downloadlib.m.i
                public void vv(boolean z4) {
                    if (!z4) {
                        Intent intent = (Intent) downloadInfo.getTempCacheData().get("intent");
                        if (intent != null) {
                            downloadInfo.getTempCacheData().remove("intent");
                            com.ss.android.socialbase.appdownloader.p.vv(b.getContext(), intent);
                            jh.vv(jSONObject, "backup", (Object) 1);
                        } else {
                            jh.vv(jSONObject, "backup", (Object) 2);
                        }
                    }
                    com.ss.android.downloadad.api.vv.m vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
                    if (vv2 != null) {
                        com.ss.android.downloadlib.i.vv.vv().vv(z4 ? "installer_delay_success" : "installer_delay_failed", jSONObject, vv2);
                    } else {
                        com.ss.android.downloadlib.o.p.vv().m("ah nativeModel=null");
                    }
                    if (z4) {
                        b.y();
                        b.getContext();
                    }
                }
            });
        }
    }

    public void vv(com.ss.android.downloadad.api.vv.m mVar) {
        i.vv().vv(new p(mVar));
    }

    private JSONObject vv(com.ss.android.downloadad.api.vv.m mVar, String str, int i4) {
        com.ss.android.socialbase.appdownloader.vv vv2;
        JSONObject jSONObject = new JSONObject();
        try {
            DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(mVar.la());
            jSONObject.putOpt("scene", Integer.valueOf(i4));
            com.ss.android.downloadlib.n.u.vv(jSONObject, mVar.la());
            com.ss.android.downloadlib.n.u.vv(mVar, jSONObject);
            jSONObject.put("is_update_download", mVar.nn() ? 1 : 2);
            jSONObject.put("install_after_back_app", mVar.sr() ? 1 : 2);
            jSONObject.putOpt("clean_space_install_params", mVar.fo() ? "1" : "2");
            if (downloadInfo != null) {
                vv(jSONObject, downloadInfo);
                try {
                    jSONObject.put("uninstall_resume_count", downloadInfo.getUninstallResumeCount());
                    if (mVar.pd() > 0) {
                        long currentTimeMillis = System.currentTimeMillis() - mVar.pd();
                        jSONObject.put("install_time", currentTimeMillis);
                        if (currentTimeMillis > com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).vv("check_install_finish_expired_duration", 86400000L)) {
                            jSONObject.put("install_expired", 1);
                        } else {
                            jSONObject.put("install_expired", 0);
                        }
                    }
                } catch (Throwable unused) {
                }
                String vv3 = com.ss.android.socialbase.downloader.wv.u.vv(downloadInfo.getTempCacheData().get("ah_attempt"), (String) null);
                if (!TextUtils.isEmpty(vv3) && (vv2 = com.ss.android.socialbase.appdownloader.vv.vv(vv3)) != null) {
                    vv2.vv(jSONObject);
                }
            }
            int vv4 = vv(mVar, downloadInfo, str, jSONObject);
            jSONObject.put("fail_status", vv4);
            if (vv4 == 3000) {
                jSONObject.put("hijack", 2);
            } else if (vv4 == 3001) {
                jSONObject.put("hijack", 0);
            } else {
                jSONObject.put("hijack", 1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public void vv(DownloadInfo downloadInfo, long j4, long j5, long j6, long j7, long j8, boolean z4) {
        com.ss.android.downloadad.api.vv.m vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo);
        if (vv2 == null) {
            com.ss.android.downloadlib.o.p.vv().vv("trySendClearSpaceEvent nativeModel null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            double d5 = j4;
            Double.isNaN(d5);
            jSONObject.putOpt("space_before", Double.valueOf(d5 / 1048576.0d));
            double d6 = j5 - j4;
            Double.isNaN(d6);
            jSONObject.putOpt("space_cleaned", Double.valueOf(d6 / 1048576.0d));
            jSONObject.putOpt("clean_up_time_cost", Long.valueOf(j7));
            jSONObject.putOpt("is_download_restarted", Integer.valueOf(z4 ? 1 : 0));
            jSONObject.putOpt("byte_required", Long.valueOf(j6));
            double d7 = j6 - j5;
            Double.isNaN(d7);
            jSONObject.putOpt("byte_required_after", Double.valueOf(d7 / 1048576.0d));
            jSONObject.putOpt("clear_sleep_time", Long.valueOf(j8));
            com.ss.android.downloadlib.n.u.p(downloadInfo, jSONObject);
            com.ss.android.downloadlib.i.vv.vv().vv("cleanup", jSONObject, vv2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
