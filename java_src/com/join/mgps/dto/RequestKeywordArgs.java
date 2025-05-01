package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestKeywordArgs extends BaseDto {
    private String game_id;
    private String keyword;
    int lang_id;
    private int pc;
    int plugin_num;
    private int pn;

    public RequestKeywordArgs() {
    }

    public String getGame_id() {
        return this.game_id;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public int getLang_id() {
        return this.lang_id;
    }

    public int getPc() {
        return this.pc;
    }

    public int getPlugin_num() {
        return this.plugin_num;
    }

    public int getPn() {
        return this.pn;
    }

    public void setGame_id(String str) {
        this.game_id = str;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLang_id(int i4) {
        this.lang_id = i4;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPlugin_num(int i4) {
        this.plugin_num = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public RequestKeywordArgs(String str, int i4, int i5) {
        this.keyword = str;
        this.pn = i4;
        this.pc = i5;
    }

    public RequestKeywordArgs(String str, int i4, int i5, int i6, int i7) {
        this.keyword = str;
        this.pn = i4;
        this.pc = i5;
        this.plugin_num = i6;
        this.lang_id = i7;
    }
}
