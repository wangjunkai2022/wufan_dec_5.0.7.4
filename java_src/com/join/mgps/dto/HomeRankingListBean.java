package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class HomeRankingListBean {
    private List<List<CommonGameInfoBean>> list;
    private String txt;

    public List<List<CommonGameInfoBean>> getList() {
        return this.list;
    }

    public String getTxt() {
        return this.txt;
    }

    public void setList(List<List<CommonGameInfoBean>> list) {
        this.list = list;
    }

    public void setTxt(String str) {
        this.txt = str;
    }
}
