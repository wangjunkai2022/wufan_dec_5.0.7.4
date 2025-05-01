package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class GameInformationCommentRequestV2 {
    private String comment_id;
    private String information_id;
    private int page;
    private String token;
    private String uid;

    public String getComment_id() {
        return this.comment_id;
    }

    public String getInformation_id() {
        return this.information_id;
    }

    public int getPage() {
        return this.page;
    }

    public String getToken() {
        return this.token;
    }

    public String getUid() {
        return this.uid;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setInformation_id(String str) {
        this.information_id = str;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
