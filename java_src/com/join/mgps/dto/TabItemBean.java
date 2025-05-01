package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class TabItemBean implements Serializable {
    private Integer display_index;
    private String h5_url;
    private Integer index;
    private Boolean selected;
    private String title;

    public Integer getDisplay_index() {
        return this.display_index;
    }

    public String getH5_url() {
        return this.h5_url;
    }

    public Integer getIndex() {
        return this.index;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDisplay_index(Integer num) {
        this.display_index = num;
    }

    public void setH5_url(String str) {
        this.h5_url = str;
    }

    public void setIndex(Integer num) {
        this.index = num;
    }

    public void setSelected(Boolean bool) {
        this.selected = bool;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
