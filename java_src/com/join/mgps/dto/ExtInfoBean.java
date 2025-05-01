package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class ExtInfoBean implements Serializable {
    private String faq_url;
    private GameCfgBean game_cfg;
    private String help_des;
    private String help_url;
    private ShareInfoBean share_info;

    public String getFaq_url() {
        return this.faq_url;
    }

    public GameCfgBean getGame_cfg() {
        return this.game_cfg;
    }

    public String getHelp_des() {
        return this.help_des;
    }

    public String getHelp_url() {
        return this.help_url;
    }

    public ShareInfoBean getShare_info() {
        return this.share_info;
    }

    public void setFaq_url(String str) {
        this.faq_url = str;
    }

    public void setGame_cfg(GameCfgBean gameCfgBean) {
        this.game_cfg = gameCfgBean;
    }

    public void setHelp_des(String str) {
        this.help_des = str;
    }

    public void setHelp_url(String str) {
        this.help_url = str;
    }

    public void setShare_info(ShareInfoBean shareInfoBean) {
        this.share_info = shareInfoBean;
    }
}
