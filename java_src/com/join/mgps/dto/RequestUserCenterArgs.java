package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestUserCenterArgs {
    private int is_vip;
    private String token;
    private int uid;
    private String userToken;
    private int vip;

    public RequestUserCenterArgs(int i4, String str, int i5) {
        this.uid = i4;
        this.token = str;
        this.userToken = str;
        this.is_vip = i5;
        this.vip = i5;
    }

    public int getIs_vip() {
        return this.is_vip;
    }

    public String getToken() {
        return this.token;
    }

    public int getUid() {
        return this.uid;
    }

    public String getUserToken() {
        return this.userToken;
    }

    public int getVip() {
        return this.vip;
    }

    public void setIs_vip(int i4) {
        this.is_vip = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public void setUserToken(String str) {
        this.userToken = str;
    }

    public void setVip(int i4) {
        this.vip = i4;
    }
}
