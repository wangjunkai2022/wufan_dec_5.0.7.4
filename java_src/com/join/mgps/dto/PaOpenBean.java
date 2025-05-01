package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class PaOpenBean {
    private int paOpenuid;
    private String token;

    public PaOpenBean() {
    }

    public int getPaOpenuid() {
        return this.paOpenuid;
    }

    public String getToken() {
        return this.token;
    }

    public void setPaOpenuid(int i4) {
        this.paOpenuid = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public PaOpenBean(int i4, String str) {
        this.paOpenuid = i4;
        this.token = str;
    }
}
