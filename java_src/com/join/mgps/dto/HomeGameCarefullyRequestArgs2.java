package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class HomeGameCarefullyRequestArgs2 {
    private int pn;
    private String token;
    private int uid;

    public HomeGameCarefullyRequestArgs2() {
    }

    public int getPn() {
        return this.pn;
    }

    public String getToken() {
        return this.token;
    }

    public int getUid() {
        return this.uid;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public HomeGameCarefullyRequestArgs2(int i4, int i5, String str) {
        this.pn = i4;
        this.uid = i5;
        this.token = str;
    }

    public HomeGameCarefullyRequestArgs2(int i4) {
        this.uid = i4;
    }
}
