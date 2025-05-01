package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestWarArgs extends BaseDto {
    private int pn;
    private int type;

    public RequestWarArgs() {
    }

    public int getPn() {
        return this.pn;
    }

    public int getType() {
        return this.type;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public RequestWarArgs(int i4, int i5) {
        this.pn = i4;
        this.type = i5;
    }
}
