package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GameInformationCommentRequest {
    private int[] comment_type;
    private String information_id;
    private int pc;
    private int pn;
    private int uid;

    public GameInformationCommentRequest() {
    }

    public int[] getComment_type() {
        return this.comment_type;
    }

    public String getInformation_id() {
        return this.information_id;
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

    public void setComment_type(int[] iArr) {
        this.comment_type = iArr;
    }

    public void setInformation_id(String str) {
        this.information_id = str;
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

    public GameInformationCommentRequest(int[] iArr, String str, int i4, int i5) {
        this.comment_type = iArr;
        this.information_id = str;
        this.pn = i4;
        this.pc = i5;
    }
}
