package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class DetialShowImageSingBean implements Serializable {
    private int attr;
    private String path;

    public DetialShowImageSingBean() {
    }

    public int getAttr() {
        return this.attr;
    }

    public String getPath() {
        return this.path;
    }

    public void setAttr(int i4) {
        this.attr = i4;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public DetialShowImageSingBean(String str, int i4) {
        this.path = str;
        this.attr = i4;
    }
}
