package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class HomeGameCarefullyRequestArgs {
    private int first;
    private String game_id;
    private int pn;

    public HomeGameCarefullyRequestArgs() {
    }

    public int getFirst() {
        return this.first;
    }

    public String getGame_id() {
        return this.game_id;
    }

    public int getPn() {
        return this.pn;
    }

    public void setFirst(int i4) {
        this.first = i4;
    }

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public HomeGameCarefullyRequestArgs(int i4, int i5, String str) {
        this.pn = i4;
        this.first = i5;
        this.game_id = str;
    }
}
