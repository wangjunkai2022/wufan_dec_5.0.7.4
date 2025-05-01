package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestBattlehallArgs extends BaseDto {
    private int collection_type;
    private int pc;
    private int pn;

    public RequestBattlehallArgs() {
    }

    public int getCollection_type() {
        return this.collection_type;
    }

    public int getPc() {
        return this.pc;
    }

    public int getPn() {
        return this.pn;
    }

    public void setCollection_type(int i4) {
        this.collection_type = i4;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public RequestBattlehallArgs(int i4, int i5, int i6) {
        this.collection_type = i4;
        this.pn = i5;
        this.pc = i6;
    }
}
