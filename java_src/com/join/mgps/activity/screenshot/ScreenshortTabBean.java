package com.join.mgps.activity.screenshot;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class ScreenshortTabBean implements Serializable {
    private int id;
    private int picCount;
    private String picPath;
    private String title;

    public int getId() {
        return this.id;
    }

    public int getPicCount() {
        return this.picCount;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(int i4) {
        this.id = i4;
    }

    public void setPicCount(int i4) {
        this.picCount = i4;
    }

    public void setPicPath(String str) {
        this.picPath = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
