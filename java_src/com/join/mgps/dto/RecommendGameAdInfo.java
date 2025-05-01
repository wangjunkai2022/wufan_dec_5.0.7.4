package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class RecommendGameAdInfo {
    private String batch_id;
    private String corner_mark_pic;
    private List<CommonGameInfoBean> list;

    public String getBatch_id() {
        return this.batch_id;
    }

    public String getCorner_mark_pic() {
        return this.corner_mark_pic;
    }

    public List<CommonGameInfoBean> getList() {
        return this.list;
    }

    public void setBatch_id(String str) {
        this.batch_id = str;
    }

    public void setCorner_mark_pic(String str) {
        this.corner_mark_pic = str;
    }

    public void setList(List<CommonGameInfoBean> list) {
        this.list = list;
    }
}
