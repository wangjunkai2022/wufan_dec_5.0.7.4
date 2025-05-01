package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class DownloadUrlBean implements Serializable {
    private String down_source_name;
    private String down_source_url;
    private int down_url_type;
    private int is_confirm;

    public String getDown_source_name() {
        return this.down_source_name;
    }

    public String getDown_source_url() {
        return this.down_source_url;
    }

    public int getDown_url_type() {
        return this.down_url_type;
    }

    public int getIs_confirm() {
        return this.is_confirm;
    }

    public void setDown_source_name(String str) {
        this.down_source_name = str;
    }

    public void setDown_source_url(String str) {
        this.down_source_url = str;
    }

    public void setDown_url_type(int i4) {
        this.down_url_type = i4;
    }

    public void setIs_confirm(int i4) {
        this.is_confirm = i4;
    }
}
