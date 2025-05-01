package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class TipsInfoBean implements Serializable {
    private Boolean display_switch;
    private String title;

    public Boolean getDisplay_switch() {
        return this.display_switch;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDisplay_switch(Boolean bool) {
        this.display_switch = bool;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
