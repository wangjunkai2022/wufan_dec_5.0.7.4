package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class ShareInfoBean implements Serializable {
    private String description;
    private String head_url;
    private Integer uid;
    private String user_name;

    public String getDescription() {
        return this.description;
    }

    public String getHead_url() {
        return this.head_url;
    }

    public Integer getUid() {
        return this.uid;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setHead_url(String str) {
        this.head_url = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUser_name(String str) {
        this.user_name = str;
    }
}
