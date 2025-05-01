package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class InformationRequestBean {
    private Integer[] comment_type;
    private String information_id;
    private int pn;

    public InformationRequestBean() {
        this.comment_type = new Integer[]{1, 2};
    }

    public Integer[] getComment_type() {
        return this.comment_type;
    }

    public String getInformation_id() {
        return this.information_id;
    }

    public int getPn() {
        return this.pn;
    }

    public void setComment_type(Integer[] numArr) {
        this.comment_type = numArr;
    }

    public void setInformation_id(String str) {
        this.information_id = str;
    }

    public void setPn(int i4) {
        this.pn = i4;
    }

    public InformationRequestBean(String str, int i4, Integer[] numArr) {
        this.comment_type = new Integer[]{1, 2};
        this.information_id = str;
        this.comment_type = numArr;
        this.pn = i4;
    }
}
