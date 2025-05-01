package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RecomDataBannerAndTableAllBean {
    private int code;
    private int flag;
    private RecomDataMessageBannerAndTableBean messages;
    private String requesttype;
    private String version;

    public RecomDataBannerAndTableAllBean() {
    }

    public int getCode() {
        return this.code;
    }

    public int getFlag() {
        return this.flag;
    }

    public RecomDataMessageBannerAndTableBean getMessages() {
        return this.messages;
    }

    public String getRequesttype() {
        return this.requesttype;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setFlag(int i4) {
        this.flag = i4;
    }

    public void setMessages(RecomDataMessageBannerAndTableBean recomDataMessageBannerAndTableBean) {
        this.messages = recomDataMessageBannerAndTableBean;
    }

    public void setRequesttype(String str) {
        this.requesttype = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public RecomDataBannerAndTableAllBean(int i4, int i5, String str, String str2, RecomDataMessageBannerAndTableBean recomDataMessageBannerAndTableBean) {
        this.flag = i4;
        this.code = i5;
        this.version = str;
        this.requesttype = str2;
        this.messages = recomDataMessageBannerAndTableBean;
    }
}
