package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class IgnoreNoticeRequestArgs {
    private int message_id;
    private String message_type;
    private int uid;

    public IgnoreNoticeRequestArgs() {
    }

    public int getMessage_id() {
        return this.message_id;
    }

    public String getMessage_type() {
        return this.message_type;
    }

    public int getUid() {
        return this.uid;
    }

    public void setMessage_id(int i4) {
        this.message_id = i4;
    }

    public void setMessage_type(String str) {
        this.message_type = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public IgnoreNoticeRequestArgs(int i4, int i5, String str) {
        this.uid = i4;
        this.message_id = i5;
        this.message_type = str;
    }
}
