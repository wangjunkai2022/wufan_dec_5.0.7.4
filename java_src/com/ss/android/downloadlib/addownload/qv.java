package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kuaishou.weapon.p0.g;
import com.ss.android.download.api.config.x;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.DownloadShortInfo;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.n.k;
import com.ss.android.downloadlib.n.r;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class qv implements r.vv {

    /* renamed from: i  reason: collision with root package name */
    private o f60570i;

    /* renamed from: m  reason: collision with root package name */
    private long f60571m;

    /* renamed from: o  reason: collision with root package name */
    private m f60572o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f60573p = false;
    public com.ss.android.downloadlib.addownload.m.o vv;

    /* loaded from: classes5.dex */
    public interface m {
        void vv(DownloadInfo downloadInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class vv extends com.ss.android.socialbase.downloader.depend.vv {
        private com.ss.android.downloadlib.n.r vv;

        /* JADX INFO: Access modifiers changed from: package-private */
        public vv(com.ss.android.downloadlib.n.r rVar) {
            this.vv = rVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onCanceled(DownloadInfo downloadInfo) {
            vv(downloadInfo, -4);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            vv(downloadInfo, -1);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onPause(DownloadInfo downloadInfo) {
            vv(downloadInfo, -2);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onPrepare(DownloadInfo downloadInfo) {
            vv(downloadInfo, 1);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onProgress(DownloadInfo downloadInfo) {
            vv(downloadInfo, 4);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onStart(DownloadInfo downloadInfo) {
            vv(downloadInfo, 2);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onSuccessed(DownloadInfo downloadInfo) {
            vv(downloadInfo, -3);
        }

        @Override // com.ss.android.socialbase.downloader.depend.vv, com.ss.android.socialbase.downloader.depend.la
        public void vv(DownloadInfo downloadInfo) {
            vv(downloadInfo, 11);
        }

        private void vv(DownloadInfo downloadInfo, int i4) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = downloadInfo;
            obtain.arg1 = i4;
            this.vv.sendMessage(obtain);
        }
    }

    public qv(o oVar) {
        this.f60570i = oVar;
    }

    private boolean i() {
        DownloadModel downloadModel = this.vv.f60510m;
        return (downloadModel == null || TextUtils.isEmpty(downloadModel.getPackageName()) || TextUtils.isEmpty(this.vv.f60510m.getDownloadUrl())) ? false : true;
    }

    private boolean o() {
        return this.vv.f60509i.isAddToDownloadManage();
    }

    private boolean p() {
        return i() && o();
    }

    private boolean u() {
        return com.ss.android.downloadlib.n.jh.vv(this.vv.f60510m) && wv.vv(this.vv.f60509i.getLinkMode());
    }

    public void m(@Nullable DownloadInfo downloadInfo) {
        m mVar = this.f60572o;
        if (mVar != null) {
            mVar.vv(downloadInfo);
            this.f60572o = null;
        }
    }

    @Override // com.ss.android.downloadlib.n.r.vv
    public void vv(Message message) {
    }

    private boolean o(DownloadInfo downloadInfo) {
        return !com.ss.android.downloadlib.n.jh.vv(this.vv.f60510m) && u(downloadInfo);
    }

    private boolean u(DownloadInfo downloadInfo) {
        return downloadInfo != null && downloadInfo.getStatus() == -3 && com.ss.android.socialbase.downloader.wv.u.i(downloadInfo.getSavePath(), downloadInfo.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(DownloadInfo downloadInfo) {
        if (!wv.vv(this.vv.f60510m) || this.f60573p) {
            return;
        }
        com.ss.android.downloadlib.i.vv.vv().vv("file_status", (downloadInfo == null || !com.ss.android.downloadlib.n.jh.m(downloadInfo.getTargetFilePath())) ? 2 : 1, this.vv);
        this.f60573p = true;
    }

    public void vv(long j4) {
        this.f60571m = j4;
        com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(j4);
        this.vv = o4;
        if (o4.l()) {
            com.ss.android.downloadlib.o.p.vv().vv("setAdId ModelBox notValid");
        }
    }

    private void m(final x xVar) {
        if (com.ss.android.downloadlib.n.k.m(g.f55590j)) {
            if (xVar != null) {
                xVar.vv();
                return;
            }
            return;
        }
        String str = "android.permission.READ_MEDIA_IMAGES";
        if (!com.ss.android.downloadlib.n.jh.vv()) {
            str = g.f55589i;
        } else if (com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_IMAGES") || com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_AUDIO") || com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_VIDEO")) {
            if (xVar != null) {
                xVar.vv();
                return;
            }
            return;
        }
        com.ss.android.downloadlib.n.k.vv(new String[]{str}, new k.vv() { // from class: com.ss.android.downloadlib.addownload.qv.2
            @Override // com.ss.android.downloadlib.n.k.vv
            public void vv() {
                x xVar2 = xVar;
                if (xVar2 != null) {
                    xVar2.vv();
                }
            }

            @Override // com.ss.android.downloadlib.n.k.vv
            public void vv(String str2) {
                x xVar2 = xVar;
                if (xVar2 != null) {
                    xVar2.vv(str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(DownloadInfo downloadInfo) {
        return u() || o(downloadInfo);
    }

    public void vv(DownloadInfo downloadInfo) {
        this.f60573p = false;
        m(downloadInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean vv(Context context, int i4, boolean z4) {
        if (com.ss.android.downloadlib.n.jh.vv(this.vv.f60510m)) {
            com.ss.android.downloadad.api.vv.m i5 = com.ss.android.downloadlib.addownload.m.u.vv().i(this.vv.vv);
            if (i5 != null) {
                com.ss.android.socialbase.downloader.notification.m.vv().u(i5.la());
            }
            return com.ss.android.downloadlib.m.vv.vv(this.vv);
        } else if (vv(i4) && !TextUtils.isEmpty(this.vv.f60510m.getPackageName()) && b.wv().optInt("disable_market") != 1) {
            if (com.ss.android.downloadlib.m.vv.vv(this.vv, i4)) {
                return true;
            }
            return this.f60570i.wv() && this.f60570i.i(true);
        } else if (z4 && this.vv.f60509i.getDownloadMode() == 4 && !this.f60570i.o()) {
            this.f60570i.p(true);
            return true;
        } else {
            return false;
        }
    }

    @Nullable
    public String m() {
        File externalFilesDir = b.getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir != null) {
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            if (externalFilesDir.exists()) {
                return externalFilesDir.getAbsolutePath();
            }
            return null;
        }
        return null;
    }

    @NonNull
    public static List<com.ss.android.download.api.download.vv> m(Map<Integer, Object> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Object obj : map.values()) {
                if (obj instanceof com.ss.android.download.api.download.vv) {
                    arrayList.add((com.ss.android.download.api.download.vv) obj);
                } else {
                    if (obj instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) obj;
                        if (softReference.get() instanceof com.ss.android.download.api.download.vv) {
                            arrayList.add((com.ss.android.download.api.download.vv) softReference.get());
                        }
                    }
                    if (obj instanceof WeakReference) {
                        WeakReference weakReference = (WeakReference) obj;
                        if (weakReference.get() instanceof com.ss.android.download.api.download.vv) {
                            arrayList.add((com.ss.android.download.api.download.vv) weakReference.get());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean vv(int i4) {
        if (this.vv.f60509i.getDownloadMode() == 2 && i4 == 2) {
            return true;
        }
        return this.vv.f60509i.getDownloadMode() == 2 && i4 == 1 && b.wv().optInt("disable_lp_if_market", 0) == 1;
    }

    public boolean vv(int i4, DownloadModel downloadModel) {
        return com.ss.android.socialbase.appdownloader.u.o.p() && vv(i4) && !com.ss.android.downloadlib.n.jh.vv(downloadModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean vv(boolean z4) {
        return !z4 && this.vv.f60509i.getDownloadMode() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(@NonNull final x xVar) {
        if (!TextUtils.isEmpty(this.vv.f60510m.getFilePath())) {
            String filePath = this.vv.f60510m.getFilePath();
            if (filePath.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
                xVar.vv();
                return;
            }
            try {
                if (filePath.startsWith(b.getContext().getExternalCacheDir().getParent())) {
                    xVar.vv();
                    return;
                }
            } catch (Exception unused) {
            }
        }
        m(new x() { // from class: com.ss.android.downloadlib.addownload.qv.1
            @Override // com.ss.android.download.api.config.x
            public void vv() {
                xVar.vv();
            }

            @Override // com.ss.android.download.api.config.x
            public void vv(String str) {
                b.p().vv(1, b.getContext(), qv.this.vv.f60510m, "您已禁止使用存储权限，请授权后再下载", null, 1);
                com.ss.android.downloadlib.i.vv.vv().m(qv.this.f60571m, 1);
                xVar.vv(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(Message message, DownloadShortInfo downloadShortInfo, Map<Integer, Object> map) {
        m mVar;
        if (message == null || message.what != 3) {
            return;
        }
        DownloadInfo downloadInfo = (DownloadInfo) message.obj;
        int i4 = message.arg1;
        if (i4 != 1 && i4 != 6 && i4 == 2) {
            if (downloadInfo.getIsFirstDownload()) {
                com.ss.android.downloadlib.n vv2 = com.ss.android.downloadlib.n.vv();
                com.ss.android.downloadlib.addownload.m.o oVar = this.vv;
                vv2.vv(oVar.f60510m, oVar.f60509i, oVar.f60512p);
                downloadInfo.setFirstDownload(false);
            }
            com.ss.android.downloadlib.i.vv.vv().vv(downloadInfo);
        }
        downloadShortInfo.updateFromNewDownloadInfo(downloadInfo);
        k.vv(downloadShortInfo);
        int vv3 = com.ss.android.socialbase.appdownloader.p.vv(downloadInfo.getStatus());
        long totalBytes = downloadInfo.getTotalBytes();
        int curBytes = totalBytes > 0 ? (int) ((downloadInfo.getCurBytes() * 100) / totalBytes) : 0;
        if ((totalBytes > 0 || com.ss.android.socialbase.downloader.n.vv.p().vv("fix_click_start")) && (mVar = this.f60572o) != null) {
            mVar.vv(downloadInfo);
            this.f60572o = null;
        }
        for (DownloadStatusChangeListener downloadStatusChangeListener : vv(map)) {
            if (vv3 != 1) {
                if (vv3 == 2) {
                    downloadStatusChangeListener.onDownloadPaused(downloadShortInfo, k.vv(downloadInfo.getId(), curBytes));
                } else if (vv3 == 3) {
                    if (downloadInfo.getStatus() == -4) {
                        downloadStatusChangeListener.onIdle();
                    } else if (downloadInfo.getStatus() == -1) {
                        downloadStatusChangeListener.onDownloadFailed(downloadShortInfo);
                    } else if (downloadInfo.getStatus() == -3) {
                        if (com.ss.android.downloadlib.n.jh.vv(this.vv.f60510m)) {
                            downloadStatusChangeListener.onInstalled(downloadShortInfo);
                        } else {
                            downloadStatusChangeListener.onDownloadFinished(downloadShortInfo);
                        }
                    }
                }
            } else if (downloadInfo.getStatus() != 11) {
                downloadStatusChangeListener.onDownloadActive(downloadShortInfo, k.vv(downloadInfo.getId(), curBytes));
            } else {
                Iterator<com.ss.android.download.api.download.vv> it2 = m(map).iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv() {
        if (this.f60572o == null) {
            this.f60572o = new m() { // from class: com.ss.android.downloadlib.addownload.qv.3
                @Override // com.ss.android.downloadlib.addownload.qv.m
                public void vv(DownloadInfo downloadInfo) {
                    com.ss.android.downloadlib.i.vv.vv().vv(qv.this.f60571m, 2, downloadInfo);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int vv(Context context, IDownloadListener iDownloadListener) {
        com.ss.android.socialbase.downloader.model.p vv2;
        if (context == null) {
            return 0;
        }
        Map<String, String> headers = this.vv.f60510m.getHeaders();
        ArrayList arrayList = new ArrayList();
        if (b.wv().optInt("enable_send_click_id_in_apk", 1) == 1 && !TextUtils.isEmpty(this.vv.f60510m.getLogExtra()) && (vv2 = vv(this.vv.f60510m.getLogExtra())) != null) {
            arrayList.add(vv2);
        }
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                if (entry != null) {
                    arrayList.add(new com.ss.android.socialbase.downloader.model.p(entry.getKey(), entry.getValue()));
                }
            }
        }
        String vv3 = com.ss.android.downloadlib.n.i.vv(String.valueOf(this.vv.f60510m.getId()), this.vv.f60510m.getNotificationJumpUrl(), this.vv.f60510m.isShowToast(), String.valueOf(this.vv.f60510m.getModelType()));
        com.ss.android.socialbase.downloader.n.vv m4 = com.ss.android.downloadlib.n.o.m(this.vv.f60510m);
        JSONObject vv4 = com.ss.android.downloadlib.n.o.vv(this.vv.f60510m);
        if (!this.vv.f60509i.enableAH()) {
            vv4 = com.ss.android.downloadlib.n.jh.vv(vv4);
            com.ss.android.downloadlib.n.jh.vv(vv4, "ah_plans", new JSONArray());
        }
        this.vv.f60510m.getExecutorGroup();
        int i4 = (this.vv.f60510m.isAd() || wv.m(this.vv.f60510m)) ? 4 : 4;
        String vv5 = vv(m4);
        DownloadInfo downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(com.ss.android.socialbase.downloader.downloader.p.vv(this.vv.f60510m.getDownloadUrl(), vv5));
        if (downloadInfo != null && 3 == this.vv.f60510m.getModelType()) {
            downloadInfo.setFirstDownload(true);
        }
        com.ss.android.socialbase.appdownloader.u q4 = new com.ss.android.socialbase.appdownloader.u(context, this.vv.f60510m.getDownloadUrl()).m(this.vv.f60510m.getBackupUrls()).vv(this.vv.f60510m.getName()).o(vv3).vv(arrayList).vv(this.vv.f60510m.isShowNotification()).p(this.vv.f60510m.isNeedWifi()).m(this.vv.f60510m.getFileName()).p(vv5).b(this.vv.f60510m.getAppIcon()).qv(this.vv.f60510m.getMd5()).k(this.vv.f60510m.getSdkMonitorScene()).vv(this.vv.f60510m.getExpectFileLength()).vv(iDownloadListener).jh(this.vv.f60510m.needIndependentProcess() || m4.vv("need_independent_process", 0) == 1).vv(this.vv.f60510m.getDownloadFileUriProvider()).m(this.vv.f60510m.autoInstallWithoutNotification()).n(this.vv.f60510m.getPackageName()).i(1000).o(100).vv(vv4).wv(true).k(true).m(m4.vv("retry_count", 5)).p(m4.vv("backup_url_retry_count", 0)).k(true).r(m4.vv("need_head_connection", 0) == 1).i(m4.vv("need_https_to_http_retry", 0) == 1).qv(m4.vv("need_chunk_downgrade_retry", 1) == 1).n(m4.vv("need_retry_delay", 0) == 1).wv(m4.p("retry_delay_time_array")).b(m4.vv("need_reuse_runnable", 0) == 1).u(i4).j(this.vv.f60510m.isAutoInstall()).q(this.vv.f60510m.distinctDir());
        if (!TextUtils.isEmpty(this.vv.f60510m.getMimeType())) {
            q4.u(this.vv.f60510m.getMimeType());
        } else {
            q4.u("application/vnd.android.package-archive");
        }
        if (m4.vv("notification_opt_2", 0) == 1) {
            q4.vv(false);
            q4.m(true);
        }
        com.ss.android.downloadlib.addownload.p.vv vvVar = null;
        if (m4.vv("clear_space_use_disk_handler", 0) == 1) {
            vvVar = new com.ss.android.downloadlib.addownload.p.vv();
            q4.vv(vvVar);
        }
        DownloadModel downloadModel = this.vv.f60510m;
        if ((downloadModel instanceof AdDownloadModel) && !TextUtils.isEmpty(((AdDownloadModel) downloadModel).getTaskKey())) {
            q4.i(((AdDownloadModel) this.vv.f60510m).getTaskKey());
        }
        int vv6 = wv.vv(this.vv, p(), q4);
        if (vvVar != null) {
            vvVar.vv(vv6);
        }
        return vv6;
    }

    private String vv(com.ss.android.socialbase.downloader.n.vv vvVar) {
        boolean z4;
        if (!TextUtils.isEmpty(this.vv.f60510m.getFilePath())) {
            return this.vv.f60510m.getFilePath();
        }
        DownloadInfo vv2 = com.ss.android.socialbase.appdownloader.i.k().vv(b.getContext(), this.vv.f60510m.getDownloadUrl());
        if (!com.ss.android.downloadlib.n.jh.vv()) {
            z4 = com.ss.android.downloadlib.n.k.m(g.f55590j);
        } else {
            z4 = com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_IMAGES") || com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_AUDIO") || com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_VIDEO");
        }
        String m4 = m();
        if (vv2 != null && !TextUtils.isEmpty(vv2.getSavePath())) {
            String savePath = vv2.getSavePath();
            if (z4 || savePath.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
                return savePath;
            }
            try {
                if (!TextUtils.isEmpty(m4)) {
                    if (savePath.startsWith(m4)) {
                        return savePath;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).cancel(vv2.getId());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("ttdownloader_code", Integer.valueOf(z4 ? 1 : 2));
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("label_external_permission", jSONObject, this.vv);
        String str = null;
        try {
            str = com.ss.android.socialbase.appdownloader.p.m();
        } catch (Exception unused) {
        }
        int vv3 = com.ss.android.downloadlib.n.o.vv(vvVar);
        if (vv3 != 0) {
            if (vv3 != 4 && (z4 || vv3 != 2)) {
                if ((vv3 == 3 || (!z4 && vv3 == 1)) && !TextUtils.isEmpty(m4)) {
                    return m4;
                }
            } else {
                File filesDir = b.getContext().getFilesDir();
                if (!filesDir.exists()) {
                    filesDir.mkdirs();
                }
                if (filesDir.exists()) {
                    return filesDir.getAbsolutePath();
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(DownloadInfo downloadInfo, boolean z4) {
        if (this.vv.f60510m == null || downloadInfo == null || downloadInfo.getId() == 0) {
            return;
        }
        int status = downloadInfo.getStatus();
        if (status != -1 && status != -4) {
            if (wv.vv(this.vv.f60510m) || (z4 && com.ss.android.downloadlib.i.p.vv().p() && (status == -2 || status == -3))) {
                com.ss.android.downloadlib.i.vv.vv().vv(this.f60571m, 2);
            }
        } else {
            com.ss.android.downloadlib.i.vv.vv().vv(this.f60571m, 2);
        }
        switch (status) {
            case -4:
            case -1:
                vv();
                com.ss.android.downloadlib.addownload.m.u vv2 = com.ss.android.downloadlib.addownload.m.u.vv();
                com.ss.android.downloadlib.addownload.m.o oVar = this.vv;
                vv2.vv(new com.ss.android.downloadad.api.vv.m(oVar.f60510m, oVar.f60512p, oVar.f60509i, downloadInfo.getId()));
                return;
            case -3:
                if (com.ss.android.downloadlib.n.jh.vv(this.vv.f60510m)) {
                    com.ss.android.downloadlib.o.p.vv().m("SUCCESSED isInstalledApp");
                    return;
                }
                com.ss.android.downloadlib.i.vv.vv().vv(this.f60571m, 5, downloadInfo);
                if (z4 && com.ss.android.downloadlib.i.p.vv().m() && !com.ss.android.downloadlib.i.p.vv().m(this.f60571m, this.vv.f60510m.getLogExtra())) {
                    com.ss.android.downloadlib.i.vv.vv().vv(this.f60571m, 2);
                    return;
                }
                return;
            case -2:
                com.ss.android.downloadlib.i.vv.vv().vv(this.f60571m, 4, downloadInfo);
                if (z4 && com.ss.android.downloadlib.i.p.vv().m() && !com.ss.android.downloadlib.i.p.vv().m(this.f60571m, this.vv.f60510m.getLogExtra())) {
                    com.ss.android.downloadlib.i.vv.vv().vv(this.f60571m, 2);
                    return;
                }
                return;
            case 0:
            case 6:
            default:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
                com.ss.android.downloadlib.i.vv.vv().vv(this.f60571m, 3, downloadInfo);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vv(com.ss.android.socialbase.downloader.model.DownloadInfo r7, com.ss.android.download.api.model.DownloadShortInfo r8, java.util.List<com.ss.android.download.api.download.DownloadStatusChangeListener> r9) {
        /*
            r6 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            if (r7 == 0) goto La2
            if (r8 != 0) goto Ld
            goto La2
        Ld:
            r0 = 0
            long r1 = r7.getTotalBytes()     // Catch: java.lang.Exception -> L27
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2b
            long r1 = r7.getCurBytes()     // Catch: java.lang.Exception -> L27
            r3 = 100
            long r1 = r1 * r3
            long r3 = r7.getTotalBytes()     // Catch: java.lang.Exception -> L27
            long r1 = r1 / r3
            int r2 = (int) r1
            goto L2c
        L27:
            r1 = move-exception
            r1.printStackTrace()
        L2b:
            r2 = 0
        L2c:
            if (r2 >= 0) goto L2f
            goto L30
        L2f:
            r0 = r2
        L30:
            r8.updateFromNewDownloadInfo(r7)
            com.ss.android.downloadlib.addownload.k.vv(r8)
            java.util.Iterator r9 = r9.iterator()
        L3a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r9.next()
            com.ss.android.download.api.download.DownloadStatusChangeListener r1 = (com.ss.android.download.api.download.DownloadStatusChangeListener) r1
            int r2 = r7.getStatus()
            switch(r2) {
                case -4: goto L8c;
                case -3: goto L7a;
                case -2: goto L6e;
                case -1: goto L6a;
                case 0: goto L8c;
                case 1: goto L5e;
                case 2: goto L5e;
                case 3: goto L5e;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L4d;
                case 7: goto L5e;
                case 8: goto L5e;
                case 9: goto L4d;
                case 10: goto L4d;
                case 11: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L3a
        L4e:
            boolean r2 = r1 instanceof com.ss.android.download.api.download.vv
            if (r2 != 0) goto L3a
            int r2 = r7.getId()
            int r2 = com.ss.android.downloadlib.addownload.k.vv(r2, r0)
            r1.onDownloadActive(r8, r2)
            goto L3a
        L5e:
            int r2 = r7.getId()
            int r2 = com.ss.android.downloadlib.addownload.k.vv(r2, r0)
            r1.onDownloadActive(r8, r2)
            goto L3a
        L6a:
            r1.onDownloadFailed(r8)
            goto L3a
        L6e:
            int r2 = r7.getId()
            int r2 = com.ss.android.downloadlib.addownload.k.vv(r2, r0)
            r1.onDownloadPaused(r8, r2)
            goto L3a
        L7a:
            com.ss.android.downloadlib.addownload.m.o r2 = r6.vv
            com.ss.android.download.api.download.DownloadModel r2 = r2.f60510m
            boolean r2 = com.ss.android.downloadlib.n.jh.vv(r2)
            if (r2 == 0) goto L88
            r1.onInstalled(r8)
            goto L3a
        L88:
            r1.onDownloadFinished(r8)
            goto L3a
        L8c:
            com.ss.android.downloadlib.addownload.m.o r2 = r6.vv
            com.ss.android.download.api.download.DownloadModel r2 = r2.f60510m
            boolean r2 = com.ss.android.downloadlib.n.jh.vv(r2)
            if (r2 == 0) goto L9d
            r2 = -3
            r8.status = r2
            r1.onInstalled(r8)
            goto L3a
        L9d:
            r1.onIdle()
            goto L3a
        La1:
            return
        La2:
            java.util.Iterator r7 = r9.iterator()
        La6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r7.next()
            com.ss.android.download.api.download.DownloadStatusChangeListener r8 = (com.ss.android.download.api.download.DownloadStatusChangeListener) r8
            r8.onIdle()
            goto La6
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.qv.vv(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.download.api.model.DownloadShortInfo, java.util.List):void");
    }

    @NonNull
    public static List<DownloadStatusChangeListener> vv(Map<Integer, Object> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Object obj : map.values()) {
                if (obj instanceof DownloadStatusChangeListener) {
                    arrayList.add((DownloadStatusChangeListener) obj);
                } else {
                    if (obj instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) obj;
                        if (softReference.get() instanceof DownloadStatusChangeListener) {
                            arrayList.add((DownloadStatusChangeListener) softReference.get());
                        }
                    }
                    if (obj instanceof WeakReference) {
                        WeakReference weakReference = (WeakReference) obj;
                        if (weakReference.get() instanceof DownloadStatusChangeListener) {
                            arrayList.add((DownloadStatusChangeListener) weakReference.get());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private com.ss.android.socialbase.downloader.model.p vv(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new com.ss.android.socialbase.downloader.model.p("clickid", new JSONObject(str).optString("clickid"));
        } catch (JSONException e5) {
            b.x().vv(e5, "parseLogExtra Error");
            return null;
        }
    }
}
