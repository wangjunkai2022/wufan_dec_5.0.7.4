package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestScreenshortListArgs {
    private String gameId;
    private int pc = 20;
    private int pn;
    private int typeId;

    public RequestScreenshortListArgs(int i4, String str, int i5) {
        this.typeId = i4;
        this.gameId = str;
        this.pn = i5;
    }

    public String getGameId() {
        return this.gameId;
    }

    public int getPc() {
        return this.pc;
    }

    public int getPn() {
        return this.pn;
    }

    public int getTypeId() {
        return this.typeId;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public void setTypeId(int i4) {
        this.typeId = i4;
    }
}
