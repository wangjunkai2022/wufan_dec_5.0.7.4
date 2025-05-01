package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class SingleGameModInfoBean implements Serializable {
    private String downUrl;
    private String extUrl;
    private String extVer;
    private boolean isIncompatible;
    private int status = 14;
    private Integer version;

    public String getDownUrl() {
        return this.downUrl;
    }

    public String getExtUrl() {
        return this.extUrl;
    }

    public String getExtVer() {
        return this.extVer;
    }

    public int getStatus() {
        return this.status;
    }

    public Integer getVersion() {
        return this.version;
    }

    public boolean isIncompatible() {
        return this.isIncompatible;
    }

    public void setDownUrl(String str) {
        this.downUrl = str;
    }

    public void setExtUrl(String str) {
        this.extUrl = str;
    }

    public void setExtVer(String str) {
        this.extVer = str;
    }

    public void setIncompatible(boolean z4) {
        this.isIncompatible = z4;
    }

    public void setStatus(int i4) {
        this.status = i4;
    }

    public void setVersion(Integer num) {
        this.version = num;
    }
}
