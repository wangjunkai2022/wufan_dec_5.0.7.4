package com.bytedance.sdk.openadsdk.api.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class p implements Bridge {
    private DownloadModel vv;

    public p(DownloadModel downloadModel) {
        this.vv = downloadModel;
    }

    public JSONObject a() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getExtra();
        }
        return null;
    }

    public boolean b() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.isShowToast();
        }
        return false;
    }

    public int c() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getModelType();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        switch (i4) {
            case ValueSetConstants.VALUE_DOWNLOAD_MODE_FORCE_WIFI /* 223417 */:
                g();
                return null;
            case ValueSetConstants.VALUE_DOWNLOAD_MODE_FORCE_HIDE_TOAST /* 223419 */:
                x();
                return null;
            case ValueSetConstants.VALUE_DOWNLOAD_MODE_FORCE_HIDE_NOTIFICATION /* 223420 */:
                y();
                return null;
            case 223430:
                if (valueSet != null) {
                    return (T) vv((String) valueSet.objectValue(223431, String.class));
                }
                return null;
            default:
                return null;
        }
    }

    public int cq() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getExecutorGroup();
        }
        return 0;
    }

    public String d() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getFileName();
        }
        return null;
    }

    public boolean ds() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.enablePause();
        }
        return false;
    }

    public IDownloadFileUriProvider f() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getDownloadFileUriProvider();
        }
        return null;
    }

    public String ff() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getPackageName();
        }
        return null;
    }

    public void g() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            downloadModel.forceWifi();
        }
    }

    public long i() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getId();
        }
        return 0L;
    }

    public String j() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getFilePath();
        }
        return null;
    }

    public String jb() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getStartToast();
        }
        return null;
    }

    public boolean jh() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.isShowNotification();
        }
        return false;
    }

    public Map<String, String> k() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getHeaders();
        }
        return null;
    }

    public boolean ky() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.isAutoInstall();
        }
        return false;
    }

    public String l() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getVersionName();
        }
        return null;
    }

    public JSONObject la() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getDownloadSettings();
        }
        return null;
    }

    public String lb() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getSdkMonitorScene();
        }
        return null;
    }

    public List<String> m() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getBackupUrls();
        }
        return null;
    }

    public long n() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getExtraValue();
        }
        return 0L;
    }

    public boolean ns() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.isAd();
        }
        return false;
    }

    public String o() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getMd5();
        }
        return null;
    }

    public boolean ot() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.shouldDownloadWithPatchApply();
        }
        return false;
    }

    public String p() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getNotificationJumpUrl();
        }
        return null;
    }

    public DeepLink pd() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getDeepLink();
        }
        return null;
    }

    public boolean pj() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.autoInstallWithoutNotification();
        }
        return false;
    }

    public boolean q() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.isVisibleInDownloadsUi();
        }
        return false;
    }

    public String qv() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getName();
        }
        return null;
    }

    public boolean r() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.isNeedWifi();
        }
        return false;
    }

    public boolean s() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.distinctDir();
        }
        return false;
    }

    public boolean t() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.isInExternalPublicDir();
        }
        return false;
    }

    public String td() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getAppIcon();
        }
        return null;
    }

    public int tf() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getFunnelType();
        }
        return 0;
    }

    public long u() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getExpectFileLength();
        }
        return 0L;
    }

    public boolean v() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.needIndependentProcess();
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.b().i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_DOWNLOAD_URL, vv()).h(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_BACKUP_URLS, m()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_NOTIFICATION_JUMP_URL, p()).g(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_ID, i()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_MD5, o()).g(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_EXPECT_FILE_LENGTH, u()).g(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_EXTRA_VALUE, n()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_NAME, qv()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_MIME_TYPE, wv()).h(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_HEADERS, k()).j(ValueSetConstants.VALUE_DOWNLOAD_MODE_IS_SHOW_TOAST, b()).j(ValueSetConstants.VALUE_DOWNLOAD_MODE_IS_SHOW_NOTIFICATION, jh()).j(ValueSetConstants.VALUE_DOWNLOAD_MODE_IS_NEED_WIFI, r()).j(ValueSetConstants.VALUE_DOWNLOAD_MODE_IS_IN_EXTERNAL_PUBLIC_DIR, t()).j(ValueSetConstants.VALUE_DOWNLOAD_MODE_IS_VISIBLE_IN_DOWNLOADS_UI, q()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_FILE_PATH, j()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_FILE_NAME, d()).h(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_DOWNLOAD_SETTINGS, la()).j(ValueSetConstants.VALUE_DOWNLOAD_MODE_NEED_INDEPENDENT_PROCESS, v()).f(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_VERSION_CODE, ya()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_VERSION_NAME, l()).j(ValueSetConstants.VALUE_DOWNLOAD_MODE_IS_AD, ns()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_LOG_EXTRA, vu()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_PACKAGE_NAME, ff()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_APP_ICON, td()).h(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_DEEP_LINK, pd()).h(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_CLICK_TRACK_URL, w()).h(223430, a()).f(223431, c()).h(223432, zn()).j(223433, pj()).h(223434, f()).j(223435, ot()).f(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_EXECUTOR_GROUP, cq()).f(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_FUNNEL_TYPE, tf()).i(ValueSetConstants.VALUE_DOWNLOAD_MODE_GET_START_TOAST, jb()).i(223432, lb()).j(223433, ky()).j(223434, s()).j(223435, ds()).a();
    }

    public String vu() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getLogExtra();
        }
        return null;
    }

    public String vv() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getDownloadUrl();
        }
        return null;
    }

    public List<String> w() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getClickTrackUrl();
        }
        return null;
    }

    public String wv() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getMimeType();
        }
        return null;
    }

    public void x() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            downloadModel.forceHideToast();
        }
    }

    public void y() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            downloadModel.forceHideNotification();
        }
    }

    public int ya() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getVersionCode();
        }
        return 0;
    }

    public com.ss.android.download.api.model.i zn() {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.getQuickAppModel();
        }
        return null;
    }

    public DownloadModel vv(String str) {
        DownloadModel downloadModel = this.vv;
        if (downloadModel != null) {
            return downloadModel.setFilePath(str);
        }
        return null;
    }
}
