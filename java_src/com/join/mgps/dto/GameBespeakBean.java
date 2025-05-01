package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GameBespeakBean {
    private boolean bespeak;
    private String hint;
    private DomainInfoBean pdInfo;

    public String getHint() {
        return this.hint;
    }

    public DomainInfoBean getPdInfo() {
        return this.pdInfo;
    }

    public boolean isBespeak() {
        return this.bespeak;
    }

    public void setBespeak(boolean z4) {
        this.bespeak = z4;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setPdInfo(DomainInfoBean domainInfoBean) {
        this.pdInfo = domainInfoBean;
    }
}
