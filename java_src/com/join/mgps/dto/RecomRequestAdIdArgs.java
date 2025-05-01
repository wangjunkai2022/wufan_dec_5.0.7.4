package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RecomRequestAdIdArgs extends BaseDto {
    private String from_aid;
    private int is_anonymous;

    /* renamed from: m  reason: collision with root package name */
    private String f49865m;
    private int pn;
    private int uid;

    public RecomRequestAdIdArgs(int i4, int i5, int i6, String str, String str2) {
        this.pn = i4;
        this.is_anonymous = i5;
        this.uid = i6;
        this.from_aid = str;
        this.f49865m = str2;
    }

    public String getFrom_aid() {
        return this.from_aid;
    }

    public int getIs_anonymous() {
        return this.is_anonymous;
    }

    public String getM() {
        return this.f49865m;
    }

    public int getPn() {
        return this.pn;
    }

    public int getUid() {
        return this.uid;
    }

    public void setFrom_aid(String str) {
        this.from_aid = str;
    }

    public void setIs_anonymous(int i4) {
        this.is_anonymous = i4;
    }

    public void setM(String str) {
        this.f49865m = str;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }
}
