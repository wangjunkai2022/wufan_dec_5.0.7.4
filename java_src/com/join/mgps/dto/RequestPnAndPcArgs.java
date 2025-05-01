package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestPnAndPcArgs extends BaseDto {
    private int pc;
    private int pn;

    public RequestPnAndPcArgs() {
    }

    public int getPc() {
        return this.pc;
    }

    public int getPn() {
        return this.pn;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public RequestPnAndPcArgs(int i4, int i5) {
        this.pn = i4;
        this.pc = i5;
    }
}
