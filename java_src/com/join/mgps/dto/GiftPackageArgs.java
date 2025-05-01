package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GiftPackageArgs extends BaseDto {
    private String game_id;
    private int pc;
    private int pn;
    private int uid;

    public GiftPackageArgs() {
    }

    public String getGame_id() {
        return this.game_id;
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

    public void setGame_id(String str) {
        this.game_id = str;
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

    public GiftPackageArgs(int i4, int i5, int i6, String str) {
        this.uid = i4;
        this.pn = i5;
        this.pc = i6;
        this.game_id = str;
    }
}
