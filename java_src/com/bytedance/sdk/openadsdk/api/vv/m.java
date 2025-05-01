package com.bytedance.sdk.openadsdk.api.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.download.DownloadEventConfig;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class m implements Bridge {
    private DownloadEventConfig vv;

    public m(DownloadEventConfig downloadEventConfig) {
        this.vv = downloadEventConfig;
    }

    public int b() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getDownloadScene();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 223515) {
            if (valueSet != null) {
                vv(((Integer) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_SET_DOWNLOAD_SCENE_PARAMETER, Integer.class)).intValue());
                return null;
            }
            return null;
        } else if (i4 == 223517 && valueSet != null) {
            vv((String) valueSet.objectValue(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_SET_REFER_PARAMETER, String.class));
            return null;
        } else {
            return null;
        }
    }

    public String i() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickLabel();
        }
        return null;
    }

    public boolean jh() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.isEnableClickEvent();
        }
        return false;
    }

    public Object k() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getExtraEventObject();
        }
        return null;
    }

    public String m() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickButtonTag();
        }
        return null;
    }

    public String n() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickContinueLabel();
        }
        return null;
    }

    public String o() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickStartLabel();
        }
        return null;
    }

    public String p() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickItemTag();
        }
        return null;
    }

    public JSONObject q() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getParamsJson();
        }
        return null;
    }

    public String qv() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickInstallLabel();
        }
        return null;
    }

    public boolean r() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.isEnableV3Event();
        }
        return false;
    }

    public JSONObject t() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getExtraJson();
        }
        return null;
    }

    public String u() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickPauseLabel();
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.b().i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_REFER, vv()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_BUTTON_TAG, m()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_ITEM_TAG, p()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_LABEL, i()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_START_LABEL, o()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_PAUSE_LABEL, u()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_CONTINUE_LABEL, n()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_CLICK_INSTALL_LABEL, qv()).i(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_STORAGE_DENY_LABEL, wv()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_EXTRA_EVENT_OBJECT, k()).f(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_DOWNLOAD_SCENE, b()).j(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_IS_ENABLE_CLICK_EVENT, jh()).j(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_IS_ENABLE_V3_EVENT, r()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_EXTRA_JSON, t()).h(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG_GET_PARAMS_JSON, q()).a();
    }

    public String vv() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getRefer();
        }
        return null;
    }

    public String wv() {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getStorageDenyLabel();
        }
        return null;
    }

    public void vv(int i4) {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            downloadEventConfig.setDownloadScene(i4);
        }
    }

    public void vv(String str) {
        DownloadEventConfig downloadEventConfig = this.vv;
        if (downloadEventConfig != null) {
            downloadEventConfig.setRefer(str);
        }
    }
}
