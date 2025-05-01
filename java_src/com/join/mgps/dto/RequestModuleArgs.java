package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestModuleArgs extends BaseDto {
    private int jump_type;
    private int pc;
    private int pn;

    public RequestModuleArgs() {
    }

    public int getJump_type() {
        return this.jump_type;
    }

    public int getPc() {
        return this.pc;
    }

    public int getPn() {
        return this.pn;
    }

    public void setJump_type(int i4) {
        this.jump_type = i4;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public RequestModuleArgs(int i4, int i5, int i6) {
        this.jump_type = i4;
        this.pn = i5;
        this.pc = i6;
    }
}
