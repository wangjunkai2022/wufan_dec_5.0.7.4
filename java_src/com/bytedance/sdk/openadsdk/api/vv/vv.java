package com.bytedance.sdk.openadsdk.api.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.download.DownloadController;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class vv implements Bridge {
    private DownloadController vv;

    public vv(DownloadController downloadController) {
        this.vv = downloadController;
    }

    public Object b() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.getExtraObject();
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 223317) {
            if (valueSet != null) {
                m(((Boolean) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_ENABLE_NEW_ACTIVITY, Boolean.class)).booleanValue());
                return null;
            }
            return null;
        }
        switch (i4) {
            case ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SET_DOWNLOAD_MODE /* 223311 */:
                if (valueSet != null) {
                    vv(((Integer) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_MODE, Integer.class)).intValue());
                    return null;
                }
                return null;
            case ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SET_LINK_MODE /* 223312 */:
                if (valueSet != null) {
                    m(((Integer) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_LINK_MODE, Integer.class)).intValue());
                    return null;
                }
                return null;
            case ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SET_ENABLE_SHOW_COMPLIANCE_DIALOG /* 223313 */:
                if (valueSet != null) {
                    vv(((Boolean) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_PARAMETER_ENABLE_SHOW_COMPLIANCE_DIALOG, Boolean.class)).booleanValue());
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    public boolean i() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.isAddToDownloadManage();
        }
        return false;
    }

    public boolean j() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.enableAM();
        }
        return false;
    }

    public boolean jh() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.enableShowComplianceDialog();
        }
        return false;
    }

    public JSONObject k() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.getExtraJson();
        }
        return null;
    }

    public int m() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.getDownloadMode();
        }
        return 0;
    }

    public Object n() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.getExtraClickOperation();
        }
        return null;
    }

    public boolean o() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.isEnableMultipleDownload();
        }
        return false;
    }

    public boolean p() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.isEnableBackDialog();
        }
        return false;
    }

    public boolean q() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.enableAH();
        }
        return false;
    }

    public boolean qv() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.shouldUseNewWebView();
        }
        return false;
    }

    public boolean r() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.isAutoDownloadOnCardShow();
        }
        return false;
    }

    public boolean t() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.enableNewActivity();
        }
        return false;
    }

    public int u() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.getDowloadChunkCount();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.b().f(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_LINK_MODE, vv()).f(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_DOWNLOAD_MODE, m()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_ENABLE_BACK_DIALOG, p()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_ADD_TO_DOWNLOAD_MANAGE, i()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_ENABLE_MULTIPLE_DOWNLOAD, o()).f(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_DOWNLOAD_CHUNK_COUNT, u()).h(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_CLICK_OPERATION, n()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_SHOULD_USE_NEW_WEB_VIEW, qv()).f(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_INTERCEPT_FLAG, wv()).h(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_JSON, k()).h(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_OBJECT, b()).h(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_GET_EXTRA_JSON, k()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_SHOW_COMPLIANCE_DIALOG, jh()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_IS_AUTO_DOWNLOAD_ON_CARD_SHOW, r()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_NEW_ACTIVITY, t()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_AH, q()).j(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER_ENABLE_AM, j()).a();
    }

    public int vv() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.getLinkMode();
        }
        return 0;
    }

    public int wv() {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            return downloadController.getInterceptFlag();
        }
        return 0;
    }

    public void m(int i4) {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            downloadController.setLinkMode(i4);
        }
    }

    public void vv(int i4) {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            downloadController.setDownloadMode(i4);
        }
    }

    public void m(boolean z4) {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            downloadController.setEnableNewActivity(z4);
        }
    }

    public void vv(boolean z4) {
        DownloadController downloadController = this.vv;
        if (downloadController != null) {
            downloadController.setEnableShowComplianceDialog(z4);
        }
    }
}
