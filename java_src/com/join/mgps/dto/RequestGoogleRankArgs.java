package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class RequestGoogleRankArgs extends RequestPnAndPcArgs {
    private int area;
    private int ranking_type;

    public RequestGoogleRankArgs() {
    }

    public int getArea() {
        return this.area;
    }

    public int getRanking_type() {
        return this.ranking_type;
    }

    public void setArea(int i4) {
        this.area = i4;
    }

    public void setRanking_type(int i4) {
        this.ranking_type = i4;
    }

    public RequestGoogleRankArgs(int i4, int i5, int i6, int i7) {
        this.area = i4;
        this.ranking_type = i5;
        setPc(i7);
        setPn(i6);
    }
}
