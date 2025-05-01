package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class ShareToBaseBean {
    private String device_id;
    private int group_id;
    private int group_uid;
    private int page;
    private String token;
    private int uid;
    private String version;

    public String getDevice_id() {
        return this.device_id;
    }

    public int getGroup_id() {
        return this.group_id;
    }

    public int getGroup_uid() {
        return this.group_uid;
    }

    public int getPage() {
        return this.page;
    }

    public String getToken() {
        return this.token;
    }

    public int getUid() {
        return this.uid;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setGroup_id(int i4) {
        this.group_id = i4;
    }

    public void setGroup_uid(int i4) {
        this.group_uid = i4;
    }

    public void setPage(int i4) {
        this.page = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "{uid=" + this.uid + ", token='" + this.token + "', group_id=" + this.group_id + ", group_uid=" + this.group_uid + ", page=" + this.page + ", version='" + this.version + "', device_id='" + this.device_id + "'}";
    }
}
