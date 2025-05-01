package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class CommentRequestPageBean {
    private String game_id;
    private int pc;
    private int pn;

    public CommentRequestPageBean() {
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

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public CommentRequestPageBean(String str, int i4, int i5) {
        this.game_id = str;
        this.pn = i4;
        this.pc = i5;
    }
}
