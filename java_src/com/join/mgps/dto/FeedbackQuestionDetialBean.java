package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class FeedbackQuestionDetialBean {
    private String info;
    private int showtype;
    private String url;

    public FeedbackQuestionDetialBean() {
    }

    public String getInfo() {
        return this.info;
    }

    public int getShowtype() {
        return this.showtype;
    }

    public String getUrl() {
        return this.url;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setShowtype(int i4) {
        this.showtype = i4;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public FeedbackQuestionDetialBean(String str, int i4, String str2) {
        this.info = str;
        this.showtype = i4;
        this.url = str2;
    }
}
