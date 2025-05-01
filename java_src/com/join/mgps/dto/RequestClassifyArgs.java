package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestClassifyArgs extends BaseDto {
    private int pc;
    private int pn;
    private int ranking_type;
    private String rom_type;
    private int[] showtag;
    private String sort_type;
    private String type;

    public RequestClassifyArgs() {
    }

    public int getPc() {
        return this.pc;
    }

    public int getPn() {
        return this.pn;
    }

    public int getRanking_type() {
        return this.ranking_type;
    }

    public String getRom_type() {
        return this.rom_type;
    }

    public int[] getShowtag() {
        return this.showtag;
    }

    public String getSort_type() {
        return this.sort_type;
    }

    public String getType() {
        return this.type;
    }

    public void setPc(int i4) {
        this.pc = i4;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public void setRanking_type(int i4) {
        this.ranking_type = i4;
    }

    public void setRom_type(String str) {
        this.rom_type = str;
    }

    public void setShowtag(int[] iArr) {
        this.showtag = iArr;
    }

    public void setSort_type(String str) {
        this.sort_type = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public RequestClassifyArgs(int i4, int i5, int[] iArr, String str, String str2, int i6, String str3) {
        this.showtag = iArr;
        this.pn = i4;
        this.pc = i5;
        this.type = str;
        this.ranking_type = i6;
        this.rom_type = str2;
        this.sort_type = str3;
    }
}
