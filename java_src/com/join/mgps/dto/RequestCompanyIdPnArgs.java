package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestCompanyIdPnArgs {
    private int company_id;
    private int pn;

    public RequestCompanyIdPnArgs(int i4, int i5) {
        this.pn = i5;
        this.company_id = i4;
    }

    public int getCompany_id() {
        return this.company_id;
    }

    public int getPn() {
        return this.pn;
    }

    public void setCompany_id(int i4) {
        this.company_id = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }
}
