package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class BaiduAdDataMain {
    private String ad_id;
    private int type_id;

    public BaiduAdDataMain() {
    }

    public String getAd_id() {
        return this.ad_id;
    }

    public int getType_id() {
        return this.type_id;
    }

    public void setAd_id(String str) {
        this.ad_id = str;
    }

    public void setType_id(int i4) {
        this.type_id = i4;
    }

    public BaiduAdDataMain(int i4, String str) {
        this.type_id = i4;
        this.ad_id = str;
    }
}
