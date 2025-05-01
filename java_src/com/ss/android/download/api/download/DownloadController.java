package com.ss.android.download.api.download;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public interface DownloadController {
    boolean enableAH();

    boolean enableAM();

    boolean enableNewActivity();

    boolean enableShowComplianceDialog();

    @Deprecated
    int getDowloadChunkCount();

    int getDownloadMode();

    Object getExtraClickOperation();

    JSONObject getExtraJson();

    Object getExtraObject();

    int getInterceptFlag();

    int getLinkMode();

    boolean isAddToDownloadManage();

    boolean isAutoDownloadOnCardShow();

    boolean isEnableBackDialog();

    @Deprecated
    boolean isEnableMultipleDownload();

    void setDownloadMode(int i4);

    void setEnableNewActivity(boolean z4);

    void setEnableShowComplianceDialog(boolean z4);

    void setLinkMode(int i4);

    boolean shouldUseNewWebView();
}
