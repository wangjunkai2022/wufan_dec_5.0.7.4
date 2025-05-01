package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class CollectionCommentRequest {
    private String collection_id;
    private int[] comment_type;
    private int pc;
    private int pn;
    private int uid;

    public CollectionCommentRequest() {
    }

    public String getCollection_id() {
        return this.collection_id;
    }

    public int[] getComment_type() {
        return this.comment_type;
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

    public void setCollection_id(String str) {
        this.collection_id = str;
    }

    public void setComment_type(int[] iArr) {
        this.comment_type = iArr;
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

    public CollectionCommentRequest(int[] iArr, String str, int i4, int i5, int i6) {
        this.comment_type = iArr;
        this.collection_id = str;
        this.pn = i4;
        this.pc = i5;
        this.uid = i6;
    }
}
