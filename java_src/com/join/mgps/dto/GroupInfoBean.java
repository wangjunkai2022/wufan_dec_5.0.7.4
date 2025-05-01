package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class GroupInfoBean implements Serializable {
    private int fid;
    private String name;
    private boolean selected;

    public int getFid() {
        return this.fid;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setFid(int i4) {
        this.fid = i4;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z4) {
        this.selected = z4;
    }
}
