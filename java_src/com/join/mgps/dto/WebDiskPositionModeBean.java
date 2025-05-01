package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class WebDiskPositionModeBean {
    private WebDiskCfgDownLoadStateBean download_mode;
    private WebDiskCfgSetupModelEnumBean setup_mode;

    public WebDiskCfgDownLoadStateBean getDownload_mode() {
        return this.download_mode;
    }

    public WebDiskCfgSetupModelEnumBean getSetup_mode() {
        return this.setup_mode;
    }

    public void setDownload_mode(WebDiskCfgDownLoadStateBean webDiskCfgDownLoadStateBean) {
        this.download_mode = webDiskCfgDownLoadStateBean;
    }

    public void setSetup_mode(WebDiskCfgSetupModelEnumBean webDiskCfgSetupModelEnumBean) {
        this.setup_mode = webDiskCfgSetupModelEnumBean;
    }
}
