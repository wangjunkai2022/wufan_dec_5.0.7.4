package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class UninstallOnlineGameBean {
    private String cover_image;
    private List<String> text;

    public String getCover_image() {
        return this.cover_image;
    }

    public List<String> getText() {
        return this.text;
    }

    public void setCover_image(String str) {
        this.cover_image = str;
    }

    public void setText(List<String> list) {
        this.text = list;
    }

    public String toString() {
        return "UninstallOnlineGameBean{text=" + this.text + ", cover_image='" + this.cover_image + "'}";
    }
}
