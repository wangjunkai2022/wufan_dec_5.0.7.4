package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class LabelBean implements Serializable {
    private int posts;
    private String tag_icon;
    private int tag_id;
    private String tag_name;

    public LabelBean() {
    }

    public int getPosts() {
        return this.posts;
    }

    public String getTag_icon() {
        return this.tag_icon;
    }

    public int getTag_id() {
        return this.tag_id;
    }

    public String getTag_name() {
        return this.tag_name;
    }

    public void setPosts(int i4) {
        this.posts = i4;
    }

    public void setTag_icon(String str) {
        this.tag_icon = str;
    }

    public void setTag_id(int i4) {
        this.tag_id = i4;
    }

    public void setTag_name(String str) {
        this.tag_name = str;
    }

    public LabelBean(int i4) {
        this.tag_id = i4;
    }
}
