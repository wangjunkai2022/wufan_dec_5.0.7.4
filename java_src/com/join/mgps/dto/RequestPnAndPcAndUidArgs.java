package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestPnAndPcAndUidArgs extends BaseDto {
    private boolean is_vip;
    private int pc;
    private int pn;
    private int uid;

    public RequestPnAndPcAndUidArgs() {
    }

    public int getPc() {
        return this.pc;
    }

    public int getPn() {
        return this.pn;
    }

    public int getUid() {
        return this.uid;
    }

    public boolean isIs_vip() {
        return this.is_vip;
    }

    public void setIs_vip(boolean z4) {
        this.is_vip = z4;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public RequestPnAndPcAndUidArgs(int i4, int i5, int i6) {
        this.pn = i4;
        this.pc = i5;
        this.uid = i6;
    }

    public RequestPnAndPcAndUidArgs(boolean z4, int i4) {
        this.is_vip = z4;
        this.uid = i4;
    }
}
