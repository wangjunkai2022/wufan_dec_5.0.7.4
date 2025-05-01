package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class HomeTopChannelBean {
    private CommonGameInfoBean ad_info;
    private String bg_color;
    private CommonGameInfoBean broadcast;
    private CommonGameInfoBean discover;
    private HomeDailyNewBean theNew;

    public CommonGameInfoBean getAd_info() {
        return this.ad_info;
    }

    public String getBg_color() {
        return this.bg_color;
    }

    public CommonGameInfoBean getBroadcast() {
        return this.broadcast;
    }

    public CommonGameInfoBean getDiscover() {
        return this.discover;
    }

    public HomeDailyNewBean getTheNew() {
        return this.theNew;
    }

    public void setAd_info(CommonGameInfoBean commonGameInfoBean) {
        this.ad_info = commonGameInfoBean;
    }

    public void setBg_color(String str) {
        this.bg_color = str;
    }

    public void setBroadcast(CommonGameInfoBean commonGameInfoBean) {
        this.broadcast = commonGameInfoBean;
    }

    public void setDiscover(CommonGameInfoBean commonGameInfoBean) {
        this.discover = commonGameInfoBean;
    }

    public void setTheNew(HomeDailyNewBean homeDailyNewBean) {
        this.theNew = homeDailyNewBean;
    }
}
