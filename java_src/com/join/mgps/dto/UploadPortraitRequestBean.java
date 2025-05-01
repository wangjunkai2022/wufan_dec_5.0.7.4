package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class UploadPortraitRequestBean {
    private String device_id;
    private String token;
    private int uid;

    public UploadPortraitRequestBean() {
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getToken() {
        return this.token;
    }

    public int getUid() {
        return this.uid;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public UploadPortraitRequestBean(int i4, String str, String str2) {
        this.uid = i4;
        this.token = str;
        this.device_id = str2;
    }
}
